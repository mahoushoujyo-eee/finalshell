package com;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class iX_3 implements LayoutManager2, Serializable, uL {
   protected static final double[][] e;
   protected static boolean K;
   protected static Method h;
   protected double[][] I = new double[][]{null, null};
   protected int[][] H = new int[][]{null, null};
   protected int[][] R = new int[][]{null, null};
   protected LinkedList w;
   protected boolean B;
   protected int E;
   protected int n;
   protected int q;
   protected int N;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public iX_3() {
      this.h(e[0], e[1]);
   }

   public iX_3(int var1, int var2) {
      this.h(e[0], e[1]);
      this.t(var1, var2);
   }

   public iX_3(double[][] param1) {
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
      // 04: invokestatic com/T4.O ()I
      // 07: aload 0
      // 08: bipush 2
      // 09: anewarray 41
      // 0c: dup
      // 0d: bipush 0
      // 0e: aconst_null
      // 0f: aastore
      // 10: dup
      // 11: bipush 1
      // 12: aconst_null
      // 13: aastore
      // 14: putfield com/iX_3.I [[D
      // 17: aload 0
      // 18: bipush 2
      // 19: anewarray 45
      // 1c: dup
      // 1d: bipush 0
      // 1e: aconst_null
      // 1f: aastore
      // 20: dup
      // 21: bipush 1
      // 22: aconst_null
      // 23: aastore
      // 24: putfield com/iX_3.H [[I
      // 27: istore 2
      // 28: aload 0
      // 29: bipush 2
      // 2a: anewarray 45
      // 2d: dup
      // 2e: bipush 0
      // 2f: aconst_null
      // 30: aastore
      // 31: dup
      // 32: bipush 1
      // 33: aconst_null
      // 34: aastore
      // 35: putfield com/iX_3.R [[I
      // 38: aload 1
      // 39: iload 2
      // 3a: ifne 48
      // 3d: ifnull 62
      // 40: goto 47
      // 43: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 1
      // 48: arraylength
      // 49: bipush 2
      // 4a: if_icmpne 62
      // 4d: aload 0
      // 4e: aload 1
      // 4f: bipush 0
      // 50: aaload
      // 51: aload 1
      // 52: bipush 1
      // 53: aaload
      // 54: invokevirtual com/iX_3.h ([D[D)V
      // 57: iload 2
      // 58: ifeq 77
      // 5b: goto 62
      // 5e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: new java/lang/IllegalArgumentException
      // 65: dup
      // 66: sipush -15530
      // 69: sipush 16955
      // 6c: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 6f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 72: athrow
      // 73: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: return
   }

   public iX_3(double[][] var1, int var2, int var3) {
      this(var1);
      this.t(var2, var3);
   }

   public iX_3(double[] var1, double[] var2) {
      this.h(var1, var2);
   }

   public iX_3(double[] var1, double[] var2, int var3, int var4) {
      this(var1, var2);
      this.t(var3, var4);
   }

   protected void h(double[] param1, double[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifeq 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: new java/lang/IllegalArgumentException
      // 016: dup
      // 017: sipush -15543
      // 01a: sipush 28104
      // 01d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 2
      // 029: iload 3
      // 02a: ifeq 074
      // 02d: ifnonnull 04c
      // 030: goto 037
      // 033: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: new java/lang/IllegalArgumentException
      // 03a: dup
      // 03b: sipush -15544
      // 03e: sipush 15676
      // 041: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 044: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield com/iX_3.I [[D
      // 050: bipush 0
      // 051: aload 1
      // 052: arraylength
      // 053: newarray 7
      // 055: aastore
      // 056: aload 0
      // 057: getfield com/iX_3.I [[D
      // 05a: bipush 1
      // 05b: aload 2
      // 05c: arraylength
      // 05d: newarray 7
      // 05f: aastore
      // 060: aload 1
      // 061: bipush 0
      // 062: aload 0
      // 063: getfield com/iX_3.I [[D
      // 066: bipush 0
      // 067: aaload
      // 068: bipush 0
      // 069: aload 0
      // 06a: getfield com/iX_3.I [[D
      // 06d: bipush 0
      // 06e: aaload
      // 06f: arraylength
      // 070: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 073: aload 2
      // 074: bipush 0
      // 075: aload 0
      // 076: getfield com/iX_3.I [[D
      // 079: bipush 1
      // 07a: aaload
      // 07b: bipush 0
      // 07c: aload 0
      // 07d: getfield com/iX_3.I [[D
      // 080: bipush 1
      // 081: aaload
      // 082: arraylength
      // 083: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 086: bipush 0
      // 087: istore 4
      // 089: iload 4
      // 08b: aload 0
      // 08c: getfield com/iX_3.I [[D
      // 08f: bipush 0
      // 090: aaload
      // 091: arraylength
      // 092: if_icmpge 137
      // 095: aload 0
      // 096: getfield com/iX_3.I [[D
      // 099: bipush 0
      // 09a: aaload
      // 09b: iload 4
      // 09d: daload
      // 09e: dconst_0
      // 09f: dcmpg
      // 0a0: iload 3
      // 0a1: ifeq 138
      // 0a4: iload 3
      // 0a5: ifeq 0cd
      // 0a8: goto 0af
      // 0ab: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: ifge 130
      // 0b2: goto 0b9
      // 0b5: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/iX_3.I [[D
      // 0bd: bipush 0
      // 0be: aaload
      // 0bf: iload 4
      // 0c1: daload
      // 0c2: ldc2_w -1.0
      // 0c5: dcmpl
      // 0c6: goto 0cd
      // 0c9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: iload 3
      // 0ce: ifeq 0ef
      // 0d1: ifeq 130
      // 0d4: goto 0db
      // 0d7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield com/iX_3.I [[D
      // 0df: bipush 0
      // 0e0: aaload
      // 0e1: iload 4
      // 0e3: daload
      // 0e4: ldc2_w -2.0
      // 0e7: dcmpl
      // 0e8: goto 0ef
      // 0eb: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: iload 3
      // 0f0: ifeq 11c
      // 0f3: ifeq 130
      // 0f6: goto 0fd
      // 0f9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield com/iX_3.I [[D
      // 101: bipush 0
      // 102: aaload
      // 103: iload 4
      // 105: iload 3
      // 106: ifeq 12e
      // 109: goto 110
      // 10c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: daload
      // 111: ldc2_w -3.0
      // 114: dcmpl
      // 115: goto 11c
      // 118: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: ifeq 130
      // 11f: aload 0
      // 120: getfield com/iX_3.I [[D
      // 123: bipush 0
      // 124: aaload
      // 125: iload 4
      // 127: goto 12e
      // 12a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: dconst_0
      // 12f: dastore
      // 130: iinc 4 1
      // 133: iload 3
      // 134: ifne 089
      // 137: bipush 0
      // 138: istore 4
      // 13a: iload 4
      // 13c: aload 0
      // 13d: getfield com/iX_3.I [[D
      // 140: bipush 1
      // 141: aaload
      // 142: arraylength
      // 143: if_icmpge 1e8
      // 146: aload 0
      // 147: iload 3
      // 148: ifeq 1f4
      // 14b: getfield com/iX_3.I [[D
      // 14e: bipush 1
      // 14f: aaload
      // 150: iload 4
      // 152: daload
      // 153: dconst_0
      // 154: dcmpg
      // 155: iload 3
      // 156: ifeq 17e
      // 159: goto 160
      // 15c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: ifge 1e1
      // 163: goto 16a
      // 166: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield com/iX_3.I [[D
      // 16e: bipush 1
      // 16f: aaload
      // 170: iload 4
      // 172: daload
      // 173: ldc2_w -1.0
      // 176: dcmpl
      // 177: goto 17e
      // 17a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: iload 3
      // 17f: ifeq 1a0
      // 182: ifeq 1e1
      // 185: goto 18c
      // 188: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield com/iX_3.I [[D
      // 190: bipush 1
      // 191: aaload
      // 192: iload 4
      // 194: daload
      // 195: ldc2_w -2.0
      // 198: dcmpl
      // 199: goto 1a0
      // 19c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: iload 3
      // 1a1: ifeq 1cd
      // 1a4: ifeq 1e1
      // 1a7: goto 1ae
      // 1aa: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: getfield com/iX_3.I [[D
      // 1b2: bipush 1
      // 1b3: aaload
      // 1b4: iload 4
      // 1b6: iload 3
      // 1b7: ifeq 1df
      // 1ba: goto 1c1
      // 1bd: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: daload
      // 1c2: ldc2_w -3.0
      // 1c5: dcmpl
      // 1c6: goto 1cd
      // 1c9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: ifeq 1e1
      // 1d0: aload 0
      // 1d1: getfield com/iX_3.I [[D
      // 1d4: bipush 1
      // 1d5: aaload
      // 1d6: iload 4
      // 1d8: goto 1df
      // 1db: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: dconst_0
      // 1e0: dastore
      // 1e1: iinc 4 1
      // 1e4: iload 3
      // 1e5: ifne 13a
      // 1e8: aload 0
      // 1e9: new java/util/LinkedList
      // 1ec: dup
      // 1ed: invokespecial java/util/LinkedList.<init> ()V
      // 1f0: putfield com/iX_3.w Ljava/util/LinkedList;
      // 1f3: aload 0
      // 1f4: bipush 1
      // 1f5: putfield com/iX_3.B Z
      // 1f8: return
   }

   public w4_2 T(Component var1) {
      int var10000 = com.T4.b();
      ListIterator var3 = this.w.listIterator(0);
      int var2 = var10000;

      while (var3.hasNext()) {
         com.OU var4 = (com.OU)var3.next();

         try {
            if (var4.S == var1) {
               return new w4_2(var4.x[0], var4.x[1], var4.G[0], var4.G[1], var4.b[0], var4.b[1]);
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }

         if (var2 == 0) {
            break;
         }
      }

      return null;
   }

   public void a(Component var1, w4_2 var2) {
      int var3 = com.T4.b();

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a(-15532, 21920));
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }

      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a(-15529, 15231));
         }
      } catch (IllegalArgumentException var8) {
         throw a(var8);
      }

      ListIterator var4 = this.w.listIterator(0);

      while (var4.hasNext()) {
         com.OU var5 = (com.OU)var4.next();

         try {
            if (var5.S == var1) {
               var4.set(new com.OU(var1, var2));
            }
         } catch (IllegalArgumentException var6) {
            throw a(var6);
         }

         if (var3 == 0) {
            break;
         }
      }
   }

   public void u(double[] var1) {
      this.X(0, var1);
   }

   public void S(double[] var1) {
      this.X(1, var1);
   }

   protected void X(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/iX_3.I [[D
      // 04: iload 1
      // 05: aload 2
      // 06: arraylength
      // 07: newarray 7
      // 09: aastore
      // 0a: invokestatic com/T4.O ()I
      // 0d: aload 2
      // 0e: bipush 0
      // 0f: aload 0
      // 10: getfield com/iX_3.I [[D
      // 13: iload 1
      // 14: aaload
      // 15: bipush 0
      // 16: aload 0
      // 17: getfield com/iX_3.I [[D
      // 1a: iload 1
      // 1b: aaload
      // 1c: arraylength
      // 1d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 20: istore 3
      // 21: bipush 0
      // 22: istore 4
      // 24: iload 4
      // 26: aload 0
      // 27: getfield com/iX_3.I [[D
      // 2a: iload 1
      // 2b: aaload
      // 2c: arraylength
      // 2d: if_icmpge d2
      // 30: aload 0
      // 31: iload 3
      // 32: ifne d3
      // 35: getfield com/iX_3.I [[D
      // 38: iload 1
      // 39: aaload
      // 3a: iload 4
      // 3c: daload
      // 3d: dconst_0
      // 3e: dcmpg
      // 3f: iload 3
      // 40: ifne 68
      // 43: goto 4a
      // 46: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: ifge cb
      // 4d: goto 54
      // 50: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/iX_3.I [[D
      // 58: iload 1
      // 59: aaload
      // 5a: iload 4
      // 5c: daload
      // 5d: ldc2_w -1.0
      // 60: dcmpl
      // 61: goto 68
      // 64: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: iload 3
      // 69: ifne 8a
      // 6c: ifeq cb
      // 6f: goto 76
      // 72: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 0
      // 77: getfield com/iX_3.I [[D
      // 7a: iload 1
      // 7b: aaload
      // 7c: iload 4
      // 7e: daload
      // 7f: ldc2_w -2.0
      // 82: dcmpl
      // 83: goto 8a
      // 86: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: iload 3
      // 8b: ifne b7
      // 8e: ifeq cb
      // 91: goto 98
      // 94: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: aload 0
      // 99: getfield com/iX_3.I [[D
      // 9c: iload 1
      // 9d: aaload
      // 9e: iload 4
      // a0: iload 3
      // a1: ifne c9
      // a4: goto ab
      // a7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa: athrow
      // ab: daload
      // ac: ldc2_w -3.0
      // af: dcmpl
      // b0: goto b7
      // b3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: ifeq cb
      // ba: aload 0
      // bb: getfield com/iX_3.I [[D
      // be: iload 1
      // bf: aaload
      // c0: iload 4
      // c2: goto c9
      // c5: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c8: athrow
      // c9: dconst_0
      // ca: dastore
      // cb: iinc 4 1
      // ce: iload 3
      // cf: ifeq 24
      // d2: aload 0
      // d3: bipush 1
      // d4: putfield com/iX_3.B Z
      // d7: return
   }

   public void h(int var1, double var2) {
      this.e(0, var1, var2);
   }

   public void M(int var1, double var2) {
      this.e(1, var1, var2);
   }

   protected void e(int param1, int param2, double param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.O ()I
      // 03: istore 5
      // 05: iload 5
      // 07: ifne 78
      // 0a: dload 3
      // 0b: dconst_0
      // 0c: dcmpg
      // 0d: ifge 6a
      // 10: goto 17
      // 13: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: dload 3
      // 18: ldc2_w -1.0
      // 1b: dcmpl
      // 1c: iload 5
      // 1e: ifne 3e
      // 21: goto 28
      // 24: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: ifeq 6a
      // 2b: goto 32
      // 2e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: dload 3
      // 33: ldc2_w -2.0
      // 36: dcmpl
      // 37: goto 3e
      // 3a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: iload 5
      // 40: ifne 65
      // 43: ifeq 6a
      // 46: goto 4d
      // 49: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: dload 3
      // 4e: iload 5
      // 50: ifne 69
      // 53: goto 5a
      // 56: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: ldc2_w -3.0
      // 5d: dcmpl
      // 5e: goto 65
      // 61: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifeq 6a
      // 68: dconst_0
      // 69: dstore 3
      // 6a: aload 0
      // 6b: getfield com/iX_3.I [[D
      // 6e: iload 1
      // 6f: aaload
      // 70: iload 2
      // 71: dload 3
      // 72: dastore
      // 73: aload 0
      // 74: bipush 1
      // 75: putfield com/iX_3.B Z
      // 78: return
   }

   public double[] H() {
      double[] var1 = new double[this.I[0].length];
      System.arraycopy(this.I[0], 0, var1, 0, var1.length);
      return var1;
   }

   public double[] n() {
      double[] var1 = new double[this.I[1].length];
      System.arraycopy(this.I[1], 0, var1, 0, var1.length);
      return var1;
   }

   public double V(int var1) {
      return this.I[0][var1];
   }

   public double f(int var1) {
      return this.I[1][var1];
   }

   public int A() {
      return this.I[0].length;
   }

   public int J() {
      return this.I[1].length;
   }

   public int Y() {
      return this.q;
   }

   public int w() {
      return this.N;
   }

   public void q(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.O ()I
      // 03: istore 2
      // 04: iload 2
      // 05: ifne 1f
      // 08: iload 1
      // 09: iflt 23
      // 0c: goto 13
      // 0f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: putfield com/iX_3.q I
      // 18: goto 1f
      // 1b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 2
      // 20: ifeq 38
      // 23: new java/lang/IllegalArgumentException
      // 26: dup
      // 27: sipush -15541
      // 2a: sipush 151
      // 2d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 30: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 33: athrow
      // 34: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: return
   }

   public void p(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: istore 2
      // 04: iload 2
      // 05: ifeq 1f
      // 08: iload 1
      // 09: iflt 23
      // 0c: goto 13
      // 0f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: iload 1
      // 15: putfield com/iX_3.N I
      // 18: goto 1f
      // 1b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 2
      // 20: ifne 38
      // 23: new java/lang/IllegalArgumentException
      // 26: dup
      // 27: sipush -15523
      // 2a: sipush -23793
      // 2d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 30: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 33: athrow
      // 34: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: return
   }

   public void t(int var1, int var2) {
      this.q(var1);
      this.p(var2);
   }

   public void u(int var1, double var2) {
      this.z(0, var1, var2);
   }

   public void e(int var1, double var2) {
      this.z(1, var1, var2);
   }

   public void z(int param1, int param2, double param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.O ()I
      // 003: istore 5
      // 005: iload 2
      // 006: iload 5
      // 008: ifne 016
      // 00b: iflt 02c
      // 00e: goto 015
      // 011: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: iload 2
      // 016: iload 5
      // 018: ifne 077
      // 01b: aload 0
      // 01c: getfield com/iX_3.I [[D
      // 01f: iload 1
      // 020: aaload
      // 021: arraylength
      // 022: if_icmple 074
      // 025: goto 02c
      // 028: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: new java/lang/IllegalArgumentException
      // 02f: dup
      // 030: new java/lang/StringBuilder
      // 033: dup
      // 034: invokespecial java/lang/StringBuilder.<init> ()V
      // 037: sipush -15536
      // 03a: sipush -6213
      // 03d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: iload 2
      // 044: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 047: sipush -15524
      // 04a: sipush 6776
      // 04d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 050: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 053: aload 0
      // 054: getfield com/iX_3.I [[D
      // 057: iload 1
      // 058: aaload
      // 059: arraylength
      // 05a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 05d: sipush -15533
      // 060: sipush 21541
      // 063: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 06f: athrow
      // 070: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: dload 3
      // 075: dconst_0
      // 076: dcmpg
      // 077: iload 5
      // 079: ifne 0e2
      // 07c: ifge 0d9
      // 07f: goto 086
      // 082: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: dload 3
      // 087: ldc2_w -1.0
      // 08a: dcmpl
      // 08b: iload 5
      // 08d: ifne 0e2
      // 090: goto 097
      // 093: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: ifeq 0d9
      // 09a: goto 0a1
      // 09d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: dload 3
      // 0a2: ldc2_w -2.0
      // 0a5: dcmpl
      // 0a6: iload 5
      // 0a8: ifne 0e2
      // 0ab: goto 0b2
      // 0ae: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: ifeq 0d9
      // 0b5: goto 0bc
      // 0b8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: dload 3
      // 0bd: ldc2_w -3.0
      // 0c0: dcmpl
      // 0c1: iload 5
      // 0c3: ifne 0e2
      // 0c6: goto 0cd
      // 0c9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: ifeq 0d9
      // 0d0: goto 0d7
      // 0d3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: dconst_0
      // 0d8: dstore 3
      // 0d9: aload 0
      // 0da: getfield com/iX_3.I [[D
      // 0dd: iload 1
      // 0de: aaload
      // 0df: arraylength
      // 0e0: bipush 1
      // 0e1: iadd
      // 0e2: newarray 7
      // 0e4: astore 6
      // 0e6: aload 0
      // 0e7: getfield com/iX_3.I [[D
      // 0ea: iload 1
      // 0eb: aaload
      // 0ec: bipush 0
      // 0ed: aload 6
      // 0ef: bipush 0
      // 0f0: iload 2
      // 0f1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f4: aload 0
      // 0f5: getfield com/iX_3.I [[D
      // 0f8: iload 1
      // 0f9: aaload
      // 0fa: iload 2
      // 0fb: aload 6
      // 0fd: iload 2
      // 0fe: bipush 1
      // 0ff: iadd
      // 100: aload 0
      // 101: getfield com/iX_3.I [[D
      // 104: iload 1
      // 105: aaload
      // 106: arraylength
      // 107: iload 2
      // 108: isub
      // 109: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 10c: aload 6
      // 10e: iload 2
      // 10f: dload 3
      // 110: dastore
      // 111: aload 0
      // 112: getfield com/iX_3.I [[D
      // 115: iload 1
      // 116: aload 6
      // 118: aastore
      // 119: aload 0
      // 11a: getfield com/iX_3.w Ljava/util/LinkedList;
      // 11d: bipush 0
      // 11e: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 121: astore 7
      // 123: aload 7
      // 125: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 12a: ifeq 19c
      // 12d: aload 7
      // 12f: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 134: checkcast com/OU
      // 137: astore 8
      // 139: iload 5
      // 13b: ifne 1a1
      // 13e: aload 8
      // 140: getfield com/OU.x [I
      // 143: iload 1
      // 144: iaload
      // 145: iload 2
      // 146: iload 5
      // 148: ifne 182
      // 14b: goto 152
      // 14e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: if_icmplt 16e
      // 155: goto 15c
      // 158: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: aload 8
      // 15e: getfield com/OU.x [I
      // 161: iload 1
      // 162: dup2
      // 163: iaload
      // 164: bipush 1
      // 165: iadd
      // 166: iastore
      // 167: goto 16e
      // 16a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 8
      // 170: getfield com/OU.G [I
      // 173: iload 1
      // 174: iload 5
      // 176: ifne 192
      // 179: iaload
      // 17a: iload 2
      // 17b: goto 182
      // 17e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: if_icmplt 197
      // 185: aload 8
      // 187: getfield com/OU.G [I
      // 18a: iload 1
      // 18b: goto 192
      // 18e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: dup2
      // 193: iaload
      // 194: bipush 1
      // 195: iadd
      // 196: iastore
      // 197: iload 5
      // 199: ifeq 123
      // 19c: aload 0
      // 19d: bipush 1
      // 19e: putfield com/iX_3.B Z
      // 1a1: return
   }

   public void a(int var1) {
      this.H(0, var1);
   }

   public void Z(int var1) {
      this.H(1, var1);
   }

   protected void H(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.O ()I
      // 003: istore 3
      // 004: iload 2
      // 005: iload 3
      // 006: ifne 014
      // 009: iflt 029
      // 00c: goto 013
      // 00f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: iload 2
      // 014: aload 0
      // 015: getfield com/iX_3.I [[D
      // 018: iload 1
      // 019: aaload
      // 01a: arraylength
      // 01b: iload 3
      // 01c: ifne 07b
      // 01f: if_icmplt 073
      // 022: goto 029
      // 025: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: new java/lang/IllegalArgumentException
      // 02c: dup
      // 02d: new java/lang/StringBuilder
      // 030: dup
      // 031: invokespecial java/lang/StringBuilder.<init> ()V
      // 034: sipush -15522
      // 037: sipush -24059
      // 03a: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 03d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 040: iload 2
      // 041: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 044: sipush -15521
      // 047: sipush 22776
      // 04a: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 050: aload 0
      // 051: getfield com/iX_3.I [[D
      // 054: iload 1
      // 055: aaload
      // 056: arraylength
      // 057: bipush 1
      // 058: isub
      // 059: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 05c: sipush -15538
      // 05f: sipush -24320
      // 062: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 06e: athrow
      // 06f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 0
      // 074: getfield com/iX_3.I [[D
      // 077: iload 1
      // 078: aaload
      // 079: arraylength
      // 07a: bipush 1
      // 07b: isub
      // 07c: newarray 7
      // 07e: astore 4
      // 080: aload 0
      // 081: getfield com/iX_3.I [[D
      // 084: iload 1
      // 085: aaload
      // 086: bipush 0
      // 087: aload 4
      // 089: bipush 0
      // 08a: iload 2
      // 08b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 08e: aload 0
      // 08f: getfield com/iX_3.I [[D
      // 092: iload 1
      // 093: aaload
      // 094: iload 2
      // 095: bipush 1
      // 096: iadd
      // 097: aload 4
      // 099: iload 2
      // 09a: aload 0
      // 09b: getfield com/iX_3.I [[D
      // 09e: iload 1
      // 09f: aaload
      // 0a0: arraylength
      // 0a1: iload 2
      // 0a2: isub
      // 0a3: bipush 1
      // 0a4: isub
      // 0a5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a8: aload 0
      // 0a9: getfield com/iX_3.I [[D
      // 0ac: iload 1
      // 0ad: aload 4
      // 0af: aastore
      // 0b0: aload 0
      // 0b1: getfield com/iX_3.w Ljava/util/LinkedList;
      // 0b4: bipush 0
      // 0b5: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 0b8: astore 5
      // 0ba: aload 5
      // 0bc: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 0c1: ifeq 12f
      // 0c4: aload 5
      // 0c6: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 0cb: checkcast com/OU
      // 0ce: astore 6
      // 0d0: iload 3
      // 0d1: ifne 134
      // 0d4: aload 6
      // 0d6: getfield com/OU.x [I
      // 0d9: iload 1
      // 0da: iaload
      // 0db: iload 2
      // 0dc: iload 3
      // 0dd: ifne 116
      // 0e0: goto 0e7
      // 0e3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: if_icmple 103
      // 0ea: goto 0f1
      // 0ed: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 6
      // 0f3: getfield com/OU.x [I
      // 0f6: iload 1
      // 0f7: dup2
      // 0f8: iaload
      // 0f9: bipush 1
      // 0fa: isub
      // 0fb: iastore
      // 0fc: goto 103
      // 0ff: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: aload 6
      // 105: getfield com/OU.G [I
      // 108: iload 1
      // 109: iload 3
      // 10a: ifne 126
      // 10d: iaload
      // 10e: iload 2
      // 10f: goto 116
      // 112: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: if_icmple 12b
      // 119: aload 6
      // 11b: getfield com/OU.G [I
      // 11e: iload 1
      // 11f: goto 126
      // 122: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: dup2
      // 127: iaload
      // 128: bipush 1
      // 129: isub
      // 12a: iastore
      // 12b: iload 3
      // 12c: ifeq 0ba
      // 12f: aload 0
      // 130: bipush 1
      // 131: putfield com/iX_3.B Z
      // 134: return
   }

   @Override
   public String toString() {
      int var10000 = com.T4.b();
      String var3 = a(-15531, -24101);
      int var1 = var10000;

      label89: {
         label93: {
            label87: {
               try {
                  var10000 = this.I[0].length;
                  if (var1 == 0) {
                     break label87;
                  }

                  if (var10000 <= 0) {
                     break label93;
                  }
               } catch (IllegalArgumentException var7) {
                  throw a(var7);
               }

               var10000 = 0;
            }

            int var2 = var10000;

            label78: {
               while (var2 < this.I[0].length - 1) {
                  var3 = var3 + this.I[0][var2] + a(-15548, 20570);

                  try {
                     var2++;
                     if (var1 == 0) {
                        break label78;
                     }

                     if (var1 == 0) {
                        break;
                     }
                  } catch (IllegalArgumentException var6) {
                     throw a(var6);
                  }
               }

               var3 = var3 + this.I[0][this.I[0].length - 1] + a(-15537, -7513);
            }

            if (var1 != 0) {
               break label89;
            }
         }

         var3 = var3 + a(-15534, 1933);
      }

      label62: {
         try {
            var10000 = this.I[1].length;
            if (var1 == 0) {
               break label62;
            }

            if (var10000 <= 0) {
               return var3 + a(-15527, 21779);
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.I[1].length - 1) {
         var3 = var3 + this.I[1][var8] + a(-15547, 25082);

         try {
            var8++;
            if (var1 == 0) {
               return var1 != 0 ? var3 : var3 + a(-15527, 21779);
            }

            if (var1 == 0) {
               break;
            }
         } catch (IllegalArgumentException var4) {
            throw a(var4);
         }
      }

      var3 = var3 + this.I[1][this.I[1].length - 1] + a(-15525, -24355);
      return var1 != 0 ? var3 : var3 + a(-15527, 21779);
   }

   public List P() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: new java/util/LinkedList
      // 06: dup
      // 07: invokespecial java/util/LinkedList.<init> ()V
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 0
      // 0d: getfield com/iX_3.w Ljava/util/LinkedList;
      // 10: bipush 0
      // 11: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 14: astore 3
      // 15: aload 3
      // 16: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 1b: ifeq c0
      // 1e: aload 3
      // 1f: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 24: checkcast com/OU
      // 27: astore 4
      // 29: iload 1
      // 2a: ifeq d5
      // 2d: aload 4
      // 2f: getfield com/OU.x [I
      // 32: bipush 1
      // 33: iaload
      // 34: iload 1
      // 35: ifeq bb
      // 38: goto 3f
      // 3b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: iflt ab
      // 42: goto 49
      // 45: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 4
      // 4b: getfield com/OU.x [I
      // 4e: bipush 0
      // 4f: iaload
      // 50: iload 1
      // 51: ifeq bb
      // 54: goto 5b
      // 57: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: iflt ab
      // 5e: goto 65
      // 61: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 4
      // 67: getfield com/OU.G [I
      // 6a: bipush 1
      // 6b: iaload
      // 6c: iload 1
      // 6d: ifeq bb
      // 70: goto 77
      // 73: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 0
      // 78: getfield com/iX_3.I [[D
      // 7b: bipush 1
      // 7c: aaload
      // 7d: arraylength
      // 7e: if_icmpge ab
      // 81: goto 88
      // 84: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 4
      // 8a: getfield com/OU.G [I
      // 8d: bipush 0
      // 8e: iaload
      // 8f: iload 1
      // 90: ifeq bb
      // 93: goto 9a
      // 96: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield com/iX_3.I [[D
      // 9e: bipush 0
      // 9f: aaload
      // a0: arraylength
      // a1: if_icmplt bc
      // a4: goto ab
      // a7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa: athrow
      // ab: aload 2
      // ac: aload 4
      // ae: invokevirtual com/OU.x ()Ljava/lang/Object;
      // b1: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // b4: goto bb
      // b7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: pop
      // bc: iload 1
      // bd: ifne 15
      // c0: goto d5
      // c3: astore 3
      // c4: new java/lang/RuntimeException
      // c7: dup
      // c8: sipush -15540
      // cb: sipush 23269
      // ce: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // d1: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // d4: athrow
      // d5: aload 2
      // d6: areturn
   }

   public List g() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.O ()I
      // 003: new java/util/LinkedList
      // 006: dup
      // 007: invokespecial java/util/LinkedList.<init> ()V
      // 00a: astore 2
      // 00b: istore 1
      // 00c: aload 0
      // 00d: getfield com/iX_3.w Ljava/util/LinkedList;
      // 010: invokevirtual java/util/LinkedList.size ()I
      // 013: istore 3
      // 014: iload 3
      // 015: ifne 01a
      // 018: aload 2
      // 019: areturn
      // 01a: aload 0
      // 01b: getfield com/iX_3.w Ljava/util/LinkedList;
      // 01e: iload 3
      // 01f: anewarray 122
      // 022: invokevirtual java/util/LinkedList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 025: checkcast [Lcom/OU;
      // 028: astore 4
      // 02a: bipush 1
      // 02b: istore 5
      // 02d: iload 5
      // 02f: iload 3
      // 030: if_icmpge 1a9
      // 033: iload 1
      // 034: ifne 1be
      // 037: iload 5
      // 039: bipush 1
      // 03a: isub
      // 03b: istore 6
      // 03d: iload 6
      // 03f: iflt 1a2
      // 042: aload 4
      // 044: iload 6
      // 046: aaload
      // 047: getfield com/OU.x [I
      // 04a: bipush 0
      // 04b: iaload
      // 04c: aload 4
      // 04e: iload 5
      // 050: aaload
      // 051: getfield com/OU.x [I
      // 054: bipush 0
      // 055: iaload
      // 056: iload 1
      // 057: ifne 030
      // 05a: iload 1
      // 05b: ifne 0fe
      // 05e: if_icmplt 0e3
      // 061: goto 068
      // 064: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: aload 4
      // 06a: iload 6
      // 06c: aaload
      // 06d: getfield com/OU.x [I
      // 070: bipush 0
      // 071: iaload
      // 072: aload 4
      // 074: iload 5
      // 076: aaload
      // 077: getfield com/OU.G [I
      // 07a: bipush 0
      // 07b: iaload
      // 07c: iload 1
      // 07d: ifne 0fe
      // 080: goto 087
      // 083: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: if_icmpgt 0e3
      // 08a: goto 091
      // 08d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 4
      // 093: iload 6
      // 095: aaload
      // 096: getfield com/OU.x [I
      // 099: bipush 1
      // 09a: iaload
      // 09b: aload 4
      // 09d: iload 5
      // 09f: aaload
      // 0a0: getfield com/OU.x [I
      // 0a3: bipush 1
      // 0a4: iaload
      // 0a5: iload 1
      // 0a6: ifne 0fe
      // 0a9: goto 0b0
      // 0ac: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: if_icmplt 0e3
      // 0b3: goto 0ba
      // 0b6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: aload 4
      // 0bc: iload 6
      // 0be: aaload
      // 0bf: getfield com/OU.x [I
      // 0c2: bipush 1
      // 0c3: iaload
      // 0c4: iload 1
      // 0c5: ifne 19a
      // 0c8: goto 0cf
      // 0cb: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 4
      // 0d1: iload 5
      // 0d3: aaload
      // 0d4: getfield com/OU.G [I
      // 0d7: bipush 1
      // 0d8: iaload
      // 0d9: if_icmple 187
      // 0dc: goto 0e3
      // 0df: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 4
      // 0e5: iload 6
      // 0e7: aaload
      // 0e8: getfield com/OU.G [I
      // 0eb: bipush 0
      // 0ec: iaload
      // 0ed: aload 4
      // 0ef: iload 5
      // 0f1: aaload
      // 0f2: getfield com/OU.x [I
      // 0f5: bipush 0
      // 0f6: iaload
      // 0f7: goto 0fe
      // 0fa: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: iload 1
      // 0ff: ifne 127
      // 102: if_icmplt 19b
      // 105: goto 10c
      // 108: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: aload 4
      // 10e: iload 6
      // 110: aaload
      // 111: getfield com/OU.G [I
      // 114: bipush 0
      // 115: iaload
      // 116: aload 4
      // 118: iload 5
      // 11a: aaload
      // 11b: getfield com/OU.G [I
      // 11e: bipush 0
      // 11f: iaload
      // 120: goto 127
      // 123: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: iload 1
      // 128: ifne 150
      // 12b: if_icmpgt 19b
      // 12e: goto 135
      // 131: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 4
      // 137: iload 6
      // 139: aaload
      // 13a: getfield com/OU.G [I
      // 13d: bipush 1
      // 13e: iaload
      // 13f: aload 4
      // 141: iload 5
      // 143: aaload
      // 144: getfield com/OU.x [I
      // 147: bipush 1
      // 148: iaload
      // 149: goto 150
      // 14c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: iload 1
      // 151: ifne 184
      // 154: if_icmplt 19b
      // 157: goto 15e
      // 15a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: aload 4
      // 160: iload 6
      // 162: aaload
      // 163: getfield com/OU.G [I
      // 166: bipush 1
      // 167: iaload
      // 168: iload 1
      // 169: ifne 19a
      // 16c: goto 173
      // 16f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 4
      // 175: iload 5
      // 177: aaload
      // 178: getfield com/OU.G [I
      // 17b: bipush 1
      // 17c: iaload
      // 17d: goto 184
      // 180: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: if_icmpgt 19b
      // 187: aload 2
      // 188: aload 4
      // 18a: iload 6
      // 18c: aaload
      // 18d: invokevirtual com/OU.x ()Ljava/lang/Object;
      // 190: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 193: goto 19a
      // 196: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: pop
      // 19b: iinc 6 -1
      // 19e: iload 1
      // 19f: ifeq 03d
      // 1a2: iinc 5 1
      // 1a5: iload 1
      // 1a6: ifeq 02d
      // 1a9: goto 1be
      // 1ac: astore 3
      // 1ad: new java/lang/RuntimeException
      // 1b0: dup
      // 1b1: sipush -15542
      // 1b4: sipush 16341
      // 1b7: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 1ba: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1bd: athrow
      // 1be: aload 2
      // 1bf: areturn
   }

   protected void I(Container var1) {
      int var10000 = com.T4.O();
      Insets var3 = var1.getInsets();
      Dimension var4 = var1.getSize();
      int var5 = var4.width - var3.left - var3.right;
      int var2 = var10000;
      int var6 = var4.height - var3.top - var3.bottom;

      label47: {
         label46: {
            try {
               var10000 = this.I[0].length;
               if (var2 != 0) {
                  break label47;
               }

               if (var10000 <= 0) {
                  break label46;
               }
            } catch (IllegalArgumentException var9) {
               throw a(var9);
            }

            var5 -= this.q * (this.I[0].length - 1);
         }

         var10000 = this.I[1].length;
      }

      label38: {
         label37: {
            try {
               if (var2 != 0) {
                  break label38;
               }

               if (var10000 <= 0) {
                  break label37;
               }
            } catch (IllegalArgumentException var8) {
               throw a(var8);
            }

            var6 -= this.N * (this.I[1].length - 1);
         }

         this.H[0] = new int[this.I[0].length];
         this.H[1] = new int[this.I[1].length];
         var5 = this.G(0, var5);
         var6 = this.G(1, var6);
         var5 = this.x(0, var5, -3.0);
         var5 = this.x(0, var5, -2.0);
         var6 = this.x(1, var6, -3.0);
         var6 = this.x(1, var6, -2.0);
         var5 = this.T(0, var5);
         var10000 = this.T(1, var6);
      }

      var6 = var10000;

      try {
         this.p(0, var5);
         this.p(1, var6);
         this.k(0, var3);
         this.k(1, var3);
         this.B = false;
         this.E = var4.width;
         this.n = var4.height;
         if (var2 != 0) {
            com.ky_4.K(new String[5]);
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }
   }

   protected int G(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/iX_3.I [[D
      // 04: iload 1
      // 05: aaload
      // 06: arraylength
      // 07: istore 4
      // 09: invokestatic com/T4.b ()I
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: istore 3
      // 10: iload 5
      // 12: iload 4
      // 14: if_icmpge 8c
      // 17: aload 0
      // 18: getfield com/iX_3.I [[D
      // 1b: iload 1
      // 1c: aaload
      // 1d: iload 5
      // 1f: daload
      // 20: dconst_1
      // 21: dcmpl
      // 22: iload 3
      // 23: ifeq 8d
      // 26: iload 3
      // 27: ifeq 84
      // 2a: goto 31
      // 2d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: ifge 5b
      // 34: goto 3b
      // 37: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield com/iX_3.I [[D
      // 3f: iload 1
      // 40: aaload
      // 41: iload 5
      // 43: daload
      // 44: dconst_0
      // 45: dcmpl
      // 46: iload 3
      // 47: ifeq 84
      // 4a: goto 51
      // 4d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: ifne 85
      // 54: goto 5b
      // 57: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield com/iX_3.H [[I
      // 5f: iload 1
      // 60: aaload
      // 61: iload 5
      // 63: aload 0
      // 64: getfield com/iX_3.I [[D
      // 67: iload 1
      // 68: aaload
      // 69: iload 5
      // 6b: daload
      // 6c: ldc2_w 0.5
      // 6f: dadd
      // 70: d2i
      // 71: iastore
      // 72: iload 2
      // 73: aload 0
      // 74: getfield com/iX_3.H [[I
      // 77: iload 1
      // 78: aaload
      // 79: iload 5
      // 7b: iaload
      // 7c: isub
      // 7d: goto 84
      // 80: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: istore 2
      // 85: iinc 5 1
      // 88: iload 3
      // 89: ifne 10
      // 8c: iload 2
      // 8d: ireturn
   }

   protected int T(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 14
      // 09: ifge 17
      // 0c: goto 13
      // 0f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 18
      // 17: iload 2
      // 18: istore 4
      // 1a: aload 0
      // 1b: getfield com/iX_3.I [[D
      // 1e: iload 1
      // 1f: aaload
      // 20: arraylength
      // 21: istore 5
      // 23: bipush 0
      // 24: istore 6
      // 26: iload 6
      // 28: iload 5
      // 2a: if_icmpge a6
      // 2d: aload 0
      // 2e: getfield com/iX_3.I [[D
      // 31: iload 1
      // 32: aaload
      // 33: iload 6
      // 35: daload
      // 36: dconst_0
      // 37: dcmpl
      // 38: iload 3
      // 39: ifeq a7
      // 3c: iload 3
      // 3d: ifeq 63
      // 40: goto 47
      // 43: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: ifle 9f
      // 4a: goto 51
      // 4d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: getfield com/iX_3.I [[D
      // 55: iload 1
      // 56: aaload
      // 57: iload 6
      // 59: daload
      // 5a: dconst_1
      // 5b: dcmpg
      // 5c: goto 63
      // 5f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: iload 3
      // 64: ifeq 9e
      // 67: ifge 9f
      // 6a: goto 71
      // 6d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/iX_3.H [[I
      // 75: iload 1
      // 76: aaload
      // 77: iload 6
      // 79: aload 0
      // 7a: getfield com/iX_3.I [[D
      // 7d: iload 1
      // 7e: aaload
      // 7f: iload 6
      // 81: daload
      // 82: iload 4
      // 84: i2d
      // 85: dmul
      // 86: ldc2_w 0.5
      // 89: dadd
      // 8a: d2i
      // 8b: iastore
      // 8c: iload 2
      // 8d: aload 0
      // 8e: getfield com/iX_3.H [[I
      // 91: iload 1
      // 92: aaload
      // 93: iload 6
      // 95: iaload
      // 96: isub
      // 97: goto 9e
      // 9a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: istore 2
      // 9f: iinc 6 1
      // a2: iload 3
      // a3: ifne 26
      // a6: iload 2
      // a7: ireturn
   }

   protected void p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.O ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 15
      // 09: ifgt 14
      // 0c: goto 13
      // 0f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: return
      // 14: bipush 0
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/iX_3.I [[D
      // 1b: iload 1
      // 1c: aaload
      // 1d: arraylength
      // 1e: istore 5
      // 20: bipush 0
      // 21: istore 6
      // 23: iload 6
      // 25: iload 5
      // 27: if_icmpge 4f
      // 2a: aload 0
      // 2b: getfield com/iX_3.I [[D
      // 2e: iload 1
      // 2f: aaload
      // 30: iload 6
      // 32: daload
      // 33: ldc2_w -1.0
      // 36: dcmpl
      // 37: iload 3
      // 38: ifne 53
      // 3b: ifne 48
      // 3e: goto 45
      // 41: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: iinc 4 1
      // 48: iinc 6 1
      // 4b: iload 3
      // 4c: ifeq 23
      // 4f: iload 2
      // 50: istore 6
      // 52: bipush 0
      // 53: istore 7
      // 55: iload 7
      // 57: iload 5
      // 59: if_icmpge ab
      // 5c: aload 0
      // 5d: getfield com/iX_3.I [[D
      // 60: iload 1
      // 61: aaload
      // 62: iload 7
      // 64: daload
      // 65: ldc2_w -1.0
      // 68: dcmpl
      // 69: iload 3
      // 6a: ifne af
      // 6d: iload 3
      // 6e: ifne a2
      // 71: goto 78
      // 74: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: ifne a4
      // 7b: goto 82
      // 7e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 0
      // 83: getfield com/iX_3.H [[I
      // 86: iload 1
      // 87: aaload
      // 88: iload 7
      // 8a: iload 2
      // 8b: iload 4
      // 8d: idiv
      // 8e: iastore
      // 8f: iload 6
      // 91: aload 0
      // 92: getfield com/iX_3.H [[I
      // 95: iload 1
      // 96: aaload
      // 97: iload 7
      // 99: iaload
      // 9a: isub
      // 9b: goto a2
      // 9e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: istore 6
      // a4: iinc 7 1
      // a7: iload 3
      // a8: ifeq 55
      // ab: iload 5
      // ad: bipush 1
      // ae: isub
      // af: istore 7
      // b1: iload 7
      // b3: iflt ff
      // b6: iload 6
      // b8: iload 3
      // b9: ifne e5
      // bc: ifle ff
      // bf: goto c6
      // c2: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: aload 0
      // c7: iload 3
      // c8: ifne e9
      // cb: goto d2
      // ce: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d1: athrow
      // d2: getfield com/iX_3.I [[D
      // d5: iload 1
      // d6: aaload
      // d7: iload 7
      // d9: daload
      // da: ldc2_w -1.0
      // dd: dcmpl
      // de: goto e5
      // e1: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e4: athrow
      // e5: ifne f8
      // e8: aload 0
      // e9: getfield com/iX_3.H [[I
      // ec: iload 1
      // ed: aaload
      // ee: iload 7
      // f0: dup2
      // f1: iaload
      // f2: bipush 1
      // f3: iadd
      // f4: iastore
      // f5: iinc 6 -1
      // f8: iinc 7 -1
      // fb: iload 3
      // fc: ifeq b1
      // ff: return
   }

   protected void k(int param1, Insets param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/iX_3.I [[D
      // 04: iload 1
      // 05: aaload
      // 06: arraylength
      // 07: istore 4
      // 09: invokestatic com/T4.O ()I
      // 0c: aload 0
      // 0d: getfield com/iX_3.R [[I
      // 10: iload 1
      // 11: iload 4
      // 13: bipush 1
      // 14: iadd
      // 15: newarray 10
      // 17: aastore
      // 18: istore 3
      // 19: aload 0
      // 1a: getfield com/iX_3.R [[I
      // 1d: iload 1
      // 1e: aaload
      // 1f: bipush 0
      // 20: iload 1
      // 21: iload 3
      // 22: ifne 3a
      // 25: ifne 3d
      // 28: goto 2f
      // 2b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 2
      // 30: getfield java/awt/Insets.left I
      // 33: goto 3a
      // 36: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: goto 41
      // 3d: aload 2
      // 3e: getfield java/awt/Insets.top I
      // 41: iastore
      // 42: bipush 0
      // 43: istore 5
      // 45: iload 5
      // 47: iload 4
      // 49: if_icmpge 71
      // 4c: aload 0
      // 4d: getfield com/iX_3.R [[I
      // 50: iload 1
      // 51: aaload
      // 52: iload 5
      // 54: bipush 1
      // 55: iadd
      // 56: aload 0
      // 57: getfield com/iX_3.R [[I
      // 5a: iload 1
      // 5b: aaload
      // 5c: iload 5
      // 5e: iaload
      // 5f: aload 0
      // 60: getfield com/iX_3.H [[I
      // 63: iload 1
      // 64: aaload
      // 65: iload 5
      // 67: iaload
      // 68: iadd
      // 69: iastore
      // 6a: iinc 5 1
      // 6d: iload 3
      // 6e: ifeq 45
      // 71: return
   }

   protected int x(int param1, int param2, double param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/iX_3.I [[D
      // 004: iload 1
      // 005: aaload
      // 006: arraylength
      // 007: istore 6
      // 009: invokestatic com/T4.b ()I
      // 00c: bipush 0
      // 00d: istore 7
      // 00f: istore 5
      // 011: iload 7
      // 013: iload 6
      // 015: if_icmpge 347
      // 018: aload 0
      // 019: getfield com/iX_3.I [[D
      // 01c: iload 1
      // 01d: aaload
      // 01e: iload 7
      // 020: daload
      // 021: dload 3
      // 022: dcmpl
      // 023: iload 5
      // 025: ifeq 348
      // 028: iload 5
      // 02a: ifeq 03f
      // 02d: goto 034
      // 030: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: ifne 33f
      // 037: goto 03e
      // 03a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: istore 8
      // 041: aload 0
      // 042: getfield com/iX_3.w Ljava/util/LinkedList;
      // 045: bipush 0
      // 046: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 049: astore 9
      // 04b: aload 9
      // 04d: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 052: ifeq 32f
      // 055: aload 9
      // 057: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 05c: checkcast com/OU
      // 05f: astore 10
      // 061: aload 10
      // 063: getfield com/OU.x [I
      // 066: iload 1
      // 067: iaload
      // 068: iload 5
      // 06a: ifeq 33e
      // 06d: iload 5
      // 06f: ifeq 08a
      // 072: goto 079
      // 075: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: iflt 04b
      // 07c: goto 083
      // 07f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 10
      // 085: getfield com/OU.G [I
      // 088: iload 1
      // 089: iaload
      // 08a: iload 6
      // 08c: iload 5
      // 08e: ifeq 0b0
      // 091: if_icmplt 0a7
      // 094: goto 09b
      // 097: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: iload 5
      // 09d: ifne 04b
      // 0a0: goto 0a7
      // 0a3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 10
      // 0a9: getfield com/OU.x [I
      // 0ac: iload 1
      // 0ad: iaload
      // 0ae: iload 7
      // 0b0: iload 5
      // 0b2: ifeq 0db
      // 0b5: if_icmpgt 32a
      // 0b8: goto 0bf
      // 0bb: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 10
      // 0c1: getfield com/OU.G [I
      // 0c4: iload 1
      // 0c5: iaload
      // 0c6: iload 5
      // 0c8: ifeq 0ea
      // 0cb: goto 0d2
      // 0ce: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: iload 7
      // 0d4: goto 0db
      // 0d7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: if_icmplt 32a
      // 0de: dload 3
      // 0df: ldc2_w -2.0
      // 0e2: dcmpl
      // 0e3: goto 0ea
      // 0e6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: ifne 0fc
      // 0ed: aload 10
      // 0ef: getfield com/OU.S Ljava/awt/Component;
      // 0f2: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 0f5: goto 104
      // 0f8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: aload 10
      // 0fe: getfield com/OU.S Ljava/awt/Component;
      // 101: invokevirtual java/awt/Component.getMinimumSize ()Ljava/awt/Dimension;
      // 104: astore 11
      // 106: aload 11
      // 108: ifnonnull 113
      // 10b: bipush 0
      // 10c: goto 137
      // 10f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: iload 1
      // 114: iload 5
      // 116: ifeq 12f
      // 119: ifne 132
      // 11c: goto 123
      // 11f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: aload 11
      // 125: getfield java/awt/Dimension.width I
      // 128: goto 12f
      // 12b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: goto 137
      // 132: aload 11
      // 134: getfield java/awt/Dimension.height I
      // 137: istore 12
      // 139: bipush 0
      // 13a: istore 13
      // 13c: dload 3
      // 13d: ldc2_w -2.0
      // 140: dcmpl
      // 141: iload 5
      // 143: ifeq 238
      // 146: ifne 22a
      // 149: goto 150
      // 14c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 10
      // 152: getfield com/OU.x [I
      // 155: iload 1
      // 156: iaload
      // 157: istore 14
      // 159: iload 14
      // 15b: aload 10
      // 15d: getfield com/OU.G [I
      // 160: iload 1
      // 161: iaload
      // 162: if_icmpgt 225
      // 165: aload 0
      // 166: getfield com/iX_3.I [[D
      // 169: iload 1
      // 16a: aaload
      // 16b: iload 14
      // 16d: daload
      // 16e: dconst_0
      // 16f: dcmpl
      // 170: iload 5
      // 172: ifeq 30e
      // 175: iload 5
      // 177: ifeq 1c1
      // 17a: goto 181
      // 17d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: ifge 1ae
      // 184: goto 18b
      // 187: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: aload 0
      // 18c: getfield com/iX_3.I [[D
      // 18f: iload 1
      // 190: aaload
      // 191: iload 14
      // 193: daload
      // 194: ldc2_w -3.0
      // 197: dcmpl
      // 198: iload 5
      // 19a: ifeq 1dc
      // 19d: goto 1a4
      // 1a0: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: ifne 1c8
      // 1a7: goto 1ae
      // 1aa: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: iload 12
      // 1b0: aload 0
      // 1b1: getfield com/iX_3.H [[I
      // 1b4: iload 1
      // 1b5: aaload
      // 1b6: iload 14
      // 1b8: iaload
      // 1b9: isub
      // 1ba: goto 1c1
      // 1bd: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: istore 12
      // 1c3: iload 5
      // 1c5: ifne 21d
      // 1c8: aload 0
      // 1c9: getfield com/iX_3.I [[D
      // 1cc: iload 1
      // 1cd: aaload
      // 1ce: iload 14
      // 1d0: daload
      // 1d1: ldc2_w -2.0
      // 1d4: dcmpl
      // 1d5: goto 1dc
      // 1d8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1db: athrow
      // 1dc: iload 5
      // 1de: ifeq 20e
      // 1e1: ifne 1fa
      // 1e4: goto 1eb
      // 1e7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: iinc 13 1
      // 1ee: iload 5
      // 1f0: ifne 21d
      // 1f3: goto 1fa
      // 1f6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: getfield com/iX_3.I [[D
      // 1fe: iload 1
      // 1ff: aaload
      // 200: iload 14
      // 202: daload
      // 203: ldc2_w -1.0
      // 206: dcmpl
      // 207: goto 20e
      // 20a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: ifne 21d
      // 211: iload 5
      // 213: ifne 04b
      // 216: goto 21d
      // 219: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: iinc 14 1
      // 220: iload 5
      // 222: ifne 159
      // 225: iload 5
      // 227: ifne 2ff
      // 22a: aload 10
      // 22c: getfield com/OU.x [I
      // 22f: iload 1
      // 230: iaload
      // 231: goto 238
      // 234: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: istore 14
      // 23a: iload 14
      // 23c: aload 10
      // 23e: getfield com/OU.G [I
      // 241: iload 1
      // 242: iaload
      // 243: if_icmpgt 2ff
      // 246: aload 0
      // 247: getfield com/iX_3.I [[D
      // 24a: iload 1
      // 24b: aaload
      // 24c: iload 14
      // 24e: daload
      // 24f: dconst_0
      // 250: dcmpl
      // 251: iload 5
      // 253: ifeq 30e
      // 256: iload 5
      // 258: ifeq 293
      // 25b: goto 262
      // 25e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: iflt 27f
      // 265: goto 26c
      // 268: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: iload 12
      // 26e: aload 0
      // 26f: getfield com/iX_3.H [[I
      // 272: iload 1
      // 273: aaload
      // 274: iload 14
      // 276: iaload
      // 277: isub
      // 278: istore 12
      // 27a: iload 5
      // 27c: ifne 2f7
      // 27f: aload 0
      // 280: getfield com/iX_3.I [[D
      // 283: iload 1
      // 284: aaload
      // 285: iload 14
      // 287: daload
      // 288: ldc2_w -2.0
      // 28b: dcmpl
      // 28c: goto 293
      // 28f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: iload 5
      // 295: ifeq 2b6
      // 298: ifeq 2c5
      // 29b: goto 2a2
      // 29e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: aload 0
      // 2a3: getfield com/iX_3.I [[D
      // 2a6: iload 1
      // 2a7: aaload
      // 2a8: iload 14
      // 2aa: daload
      // 2ab: ldc2_w -3.0
      // 2ae: dcmpl
      // 2af: goto 2b6
      // 2b2: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b5: athrow
      // 2b6: iload 5
      // 2b8: ifeq 2e8
      // 2bb: ifne 2d4
      // 2be: goto 2c5
      // 2c1: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c4: athrow
      // 2c5: iinc 13 1
      // 2c8: iload 5
      // 2ca: ifne 2f7
      // 2cd: goto 2d4
      // 2d0: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d3: athrow
      // 2d4: aload 0
      // 2d5: getfield com/iX_3.I [[D
      // 2d8: iload 1
      // 2d9: aaload
      // 2da: iload 14
      // 2dc: daload
      // 2dd: ldc2_w -1.0
      // 2e0: dcmpl
      // 2e1: goto 2e8
      // 2e4: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: ifne 2f7
      // 2eb: iload 5
      // 2ed: ifne 04b
      // 2f0: goto 2f7
      // 2f3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f6: athrow
      // 2f7: iinc 14 1
      // 2fa: iload 5
      // 2fc: ifne 23a
      // 2ff: iload 12
      // 301: i2d
      // 302: iload 13
      // 304: i2d
      // 305: ddiv
      // 306: invokestatic java/lang/Math.ceil (D)D
      // 309: d2i
      // 30a: istore 12
      // 30c: iload 8
      // 30e: iload 5
      // 310: ifeq 328
      // 313: iload 12
      // 315: if_icmpge 32a
      // 318: goto 31f
      // 31b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: iload 12
      // 321: goto 328
      // 324: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 327: athrow
      // 328: istore 8
      // 32a: iload 5
      // 32c: ifne 04b
      // 32f: aload 0
      // 330: getfield com/iX_3.H [[I
      // 333: iload 1
      // 334: aaload
      // 335: iload 7
      // 337: iload 8
      // 339: iastore
      // 33a: iload 2
      // 33b: iload 8
      // 33d: isub
      // 33e: istore 2
      // 33f: iinc 7 1
      // 342: iload 5
      // 344: ifne 011
      // 347: iload 2
      // 348: ireturn
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
      // 000: invokestatic com/T4.O ()I
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getSize ()Ljava/awt/Dimension;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 04b
      // 00e: getfield com/iX_3.B Z
      // 011: ifne 04a
      // 014: goto 01b
      // 017: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 3
      // 01c: getfield java/awt/Dimension.width I
      // 01f: aload 0
      // 020: getfield com/iX_3.E I
      // 023: iload 2
      // 024: ifne 047
      // 027: goto 02e
      // 02a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: if_icmpne 04a
      // 031: goto 038
      // 034: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: aload 3
      // 039: getfield java/awt/Dimension.height I
      // 03c: aload 0
      // 03d: getfield com/iX_3.n I
      // 040: goto 047
      // 043: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: if_icmpeq 04f
      // 04a: aload 0
      // 04b: aload 1
      // 04c: invokevirtual com/iX_3.I (Ljava/awt/Container;)V
      // 04f: aload 0
      // 050: aload 1
      // 051: invokevirtual com/iX_3.k (Ljava/awt/Container;)Ljava/awt/ComponentOrientation;
      // 054: astore 4
      // 056: aload 4
      // 058: iload 2
      // 059: ifne 068
      // 05c: ifnull 07d
      // 05f: goto 066
      // 062: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 4
      // 068: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 06b: iload 2
      // 06c: ifne 07a
      // 06f: ifne 07d
      // 072: goto 079
      // 075: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 07e
      // 07d: bipush 0
      // 07e: istore 5
      // 080: aload 1
      // 081: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 084: astore 6
      // 086: aload 1
      // 087: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 08a: astore 7
      // 08c: bipush 0
      // 08d: istore 8
      // 08f: iload 8
      // 091: aload 7
      // 093: arraylength
      // 094: if_icmpge 1d1
      // 097: aload 0
      // 098: getfield com/iX_3.w Ljava/util/LinkedList;
      // 09b: bipush 0
      // 09c: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 09f: astore 9
      // 0a1: aconst_null
      // 0a2: astore 10
      // 0a4: aload 9
      // 0a6: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 0ab: ifeq 0e3
      // 0ae: aload 9
      // 0b0: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 0b5: checkcast com/OU
      // 0b8: astore 10
      // 0ba: aload 10
      // 0bc: getfield com/OU.S Ljava/awt/Component;
      // 0bf: iload 2
      // 0c0: ifne 0f4
      // 0c3: aload 7
      // 0c5: iload 8
      // 0c7: aaload
      // 0c8: if_acmpne 0dd
      // 0cb: goto 0d2
      // 0ce: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: iload 2
      // 0d3: ifeq 0e3
      // 0d6: goto 0dd
      // 0d9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aconst_null
      // 0de: astore 10
      // 0e0: goto 0a4
      // 0e3: aload 10
      // 0e5: ifnonnull 0ff
      // 0e8: aload 7
      // 0ea: iload 8
      // 0ec: aaload
      // 0ed: goto 0f4
      // 0f0: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: bipush 0
      // 0f5: bipush 0
      // 0f6: bipush 0
      // 0f7: bipush 0
      // 0f8: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0fb: iload 2
      // 0fc: ifeq 1ca
      // 0ff: bipush 0
      // 100: istore 11
      // 102: bipush 0
      // 103: istore 12
      // 105: aload 10
      // 107: getfield com/OU.b [I
      // 10a: bipush 0
      // 10b: iaload
      // 10c: bipush 2
      // 10d: iload 2
      // 10e: ifne 135
      // 111: if_icmpne 138
      // 114: goto 11b
      // 117: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 10
      // 11d: getfield com/OU.b [I
      // 120: iload 2
      // 121: ifne 159
      // 124: goto 12b
      // 127: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: bipush 1
      // 12c: iaload
      // 12d: bipush 2
      // 12e: goto 135
      // 131: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: if_icmpeq 150
      // 138: aload 7
      // 13a: iload 8
      // 13c: aaload
      // 13d: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 140: astore 13
      // 142: aload 13
      // 144: getfield java/awt/Dimension.width I
      // 147: istore 11
      // 149: aload 13
      // 14b: getfield java/awt/Dimension.height I
      // 14e: istore 12
      // 150: aload 0
      // 151: aload 10
      // 153: iload 11
      // 155: bipush 1
      // 156: invokevirtual com/iX_3.i (Lcom/OU;IZ)[I
      // 159: astore 13
      // 15b: aload 13
      // 15d: bipush 0
      // 15e: iaload
      // 15f: istore 14
      // 161: aload 13
      // 163: bipush 1
      // 164: iaload
      // 165: istore 15
      // 167: aload 0
      // 168: aload 10
      // 16a: iload 12
      // 16c: bipush 0
      // 16d: invokevirtual com/iX_3.i (Lcom/OU;IZ)[I
      // 170: astore 13
      // 172: aload 13
      // 174: bipush 0
      // 175: iaload
      // 176: istore 16
      // 178: aload 13
      // 17a: bipush 1
      // 17b: iaload
      // 17c: istore 17
      // 17e: iload 2
      // 17f: ifne 1b6
      // 182: iload 5
      // 184: ifeq 1a6
      // 187: goto 18e
      // 18a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 3
      // 18f: getfield java/awt/Dimension.width I
      // 192: iload 14
      // 194: isub
      // 195: iload 15
      // 197: isub
      // 198: aload 6
      // 19a: getfield java/awt/Insets.left I
      // 19d: iadd
      // 19e: aload 6
      // 1a0: getfield java/awt/Insets.right I
      // 1a3: isub
      // 1a4: istore 14
      // 1a6: aload 7
      // 1a8: iload 8
      // 1aa: aaload
      // 1ab: iload 14
      // 1ad: iload 16
      // 1af: iload 15
      // 1b1: iload 17
      // 1b3: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1b6: goto 1ca
      // 1b9: astore 9
      // 1bb: aload 7
      // 1bd: iload 8
      // 1bf: aaload
      // 1c0: bipush 0
      // 1c1: bipush 0
      // 1c2: bipush 0
      // 1c3: bipush 0
      // 1c4: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1c7: goto 1ca
      // 1ca: iinc 8 1
      // 1cd: iload 2
      // 1ce: ifeq 08f
      // 1d1: return
   }

   protected ComponentOrientation k(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: aconst_null
      // 04: astore 3
      // 05: istore 2
      // 06: getstatic com/iX_3.K Z
      // 09: iload 2
      // 0a: ifeq 3e
      // 0d: ifeq 41
      // 10: goto 17
      // 13: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: sipush -15528
      // 1a: sipush -9712
      // 1d: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 20: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 23: sipush -15535
      // 26: sipush 21006
      // 29: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 2c: bipush 0
      // 2d: anewarray 324
      // 30: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 33: putstatic com/iX_3.h Ljava/lang/reflect/Method;
      // 36: bipush 0
      // 37: goto 3e
      // 3a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: putstatic com/iX_3.K Z
      // 41: getstatic com/iX_3.h Ljava/lang/reflect/Method;
      // 44: iload 2
      // 45: ifeq 64
      // 48: ifnull 68
      // 4b: goto 52
      // 4e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: getstatic com/iX_3.h Ljava/lang/reflect/Method;
      // 55: aload 1
      // 56: bipush 0
      // 57: anewarray 4
      // 5a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5d: goto 64
      // 60: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: checkcast java/awt/ComponentOrientation
      // 67: astore 3
      // 68: goto 6d
      // 6b: astore 4
      // 6d: aload 3
      // 6e: areturn
   }

   protected int[] i(com.OU param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.b ()I
      // 003: istore 4
      // 005: iload 3
      // 006: ifeq 016
      // 009: aload 0
      // 00a: getfield com/iX_3.R [[I
      // 00d: bipush 0
      // 00e: aaload
      // 00f: goto 01c
      // 012: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: getfield com/iX_3.R [[I
      // 01a: bipush 1
      // 01b: aaload
      // 01c: astore 5
      // 01e: iload 3
      // 01f: iload 4
      // 021: ifeq 03b
      // 024: ifeq 03e
      // 027: goto 02e
      // 02a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 1
      // 02f: getfield com/OU.b [I
      // 032: bipush 0
      // 033: iaload
      // 034: goto 03b
      // 037: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 044
      // 03e: aload 1
      // 03f: getfield com/OU.b [I
      // 042: bipush 1
      // 043: iaload
      // 044: istore 6
      // 046: iload 3
      // 047: iload 4
      // 049: ifeq 07d
      // 04c: ifeq 072
      // 04f: goto 056
      // 052: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 5
      // 058: aload 1
      // 059: getfield com/OU.G [I
      // 05c: bipush 0
      // 05d: iaload
      // 05e: bipush 1
      // 05f: iadd
      // 060: iaload
      // 061: aload 5
      // 063: aload 1
      // 064: getfield com/OU.x [I
      // 067: bipush 0
      // 068: iaload
      // 069: iaload
      // 06a: isub
      // 06b: goto 087
      // 06e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 5
      // 074: aload 1
      // 075: getfield com/OU.G [I
      // 078: bipush 1
      // 079: iaload
      // 07a: bipush 1
      // 07b: iadd
      // 07c: iaload
      // 07d: aload 5
      // 07f: aload 1
      // 080: getfield com/OU.x [I
      // 083: bipush 1
      // 084: iaload
      // 085: iaload
      // 086: isub
      // 087: istore 7
      // 089: iload 6
      // 08b: iload 4
      // 08d: ifeq 0bd
      // 090: bipush 2
      // 091: if_icmpeq 0b4
      // 094: goto 09b
      // 097: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: iload 7
      // 09d: iload 4
      // 09f: ifeq 0cc
      // 0a2: goto 0a9
      // 0a5: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: iload 2
      // 0aa: if_icmpge 0c4
      // 0ad: goto 0b4
      // 0b0: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: iload 7
      // 0b6: goto 0bd
      // 0b9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: istore 8
      // 0bf: iload 4
      // 0c1: ifne 0ce
      // 0c4: iload 2
      // 0c5: goto 0cc
      // 0c8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: istore 8
      // 0ce: iload 3
      // 0cf: iload 4
      // 0d1: ifeq 0fb
      // 0d4: ifeq 0fa
      // 0d7: goto 0de
      // 0da: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: iload 6
      // 0e0: iload 4
      // 0e2: ifeq 0fb
      // 0e5: goto 0ec
      // 0e8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: bipush 4
      // 0ed: if_icmpne 0fa
      // 0f0: goto 0f7
      // 0f3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: bipush 0
      // 0f8: istore 6
      // 0fa: iload 3
      // 0fb: iload 4
      // 0fd: ifeq 128
      // 100: ifeq 126
      // 103: goto 10a
      // 106: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: iload 6
      // 10c: iload 4
      // 10e: ifeq 128
      // 111: goto 118
      // 114: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: bipush 5
      // 119: if_icmpne 126
      // 11c: goto 123
      // 11f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: bipush 3
      // 124: istore 6
      // 126: iload 6
      // 128: iload 4
      // 12a: ifeq 241
      // 12d: tableswitch 268 0 3 35 150 213 90
      // 14c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 5
      // 152: iload 3
      // 153: iload 4
      // 155: ifeq 176
      // 158: goto 15f
      // 15b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: ifeq 179
      // 162: goto 169
      // 165: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: aload 1
      // 16a: getfield com/OU.x [I
      // 16d: bipush 0
      // 16e: iaload
      // 16f: goto 176
      // 172: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: goto 17f
      // 179: aload 1
      // 17a: getfield com/OU.x [I
      // 17d: bipush 1
      // 17e: iaload
      // 17f: iaload
      // 180: istore 9
      // 182: iload 4
      // 184: ifne 243
      // 187: aload 5
      // 189: iload 3
      // 18a: iload 4
      // 18c: ifeq 1ad
      // 18f: goto 196
      // 192: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: ifeq 1b0
      // 199: goto 1a0
      // 19c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 1
      // 1a1: getfield com/OU.G [I
      // 1a4: bipush 0
      // 1a5: iaload
      // 1a6: goto 1ad
      // 1a9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: goto 1b6
      // 1b0: aload 1
      // 1b1: getfield com/OU.G [I
      // 1b4: bipush 1
      // 1b5: iaload
      // 1b6: bipush 1
      // 1b7: iadd
      // 1b8: iaload
      // 1b9: iload 8
      // 1bb: isub
      // 1bc: istore 9
      // 1be: iload 4
      // 1c0: ifne 243
      // 1c3: aload 5
      // 1c5: iload 3
      // 1c6: iload 4
      // 1c8: ifeq 1e9
      // 1cb: goto 1d2
      // 1ce: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: ifeq 1ec
      // 1d5: goto 1dc
      // 1d8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1db: athrow
      // 1dc: aload 1
      // 1dd: getfield com/OU.x [I
      // 1e0: bipush 0
      // 1e1: iaload
      // 1e2: goto 1e9
      // 1e5: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: goto 1f2
      // 1ec: aload 1
      // 1ed: getfield com/OU.x [I
      // 1f0: bipush 1
      // 1f1: iaload
      // 1f2: iaload
      // 1f3: iload 7
      // 1f5: iload 8
      // 1f7: isub
      // 1f8: bipush 1
      // 1f9: ishr
      // 1fa: iadd
      // 1fb: istore 9
      // 1fd: iload 4
      // 1ff: ifne 243
      // 202: aload 5
      // 204: iload 3
      // 205: iload 4
      // 207: ifeq 228
      // 20a: goto 211
      // 20d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: ifeq 22b
      // 214: goto 21b
      // 217: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: aload 1
      // 21c: getfield com/OU.x [I
      // 21f: bipush 0
      // 220: iaload
      // 221: goto 228
      // 224: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: goto 231
      // 22b: aload 1
      // 22c: getfield com/OU.x [I
      // 22f: bipush 1
      // 230: iaload
      // 231: iaload
      // 232: istore 9
      // 234: iload 4
      // 236: ifne 243
      // 239: bipush 0
      // 23a: goto 241
      // 23d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 240: athrow
      // 241: istore 9
      // 243: iload 3
      // 244: iload 4
      // 246: ifeq 2eb
      // 249: ifeq 2c9
      // 24c: goto 253
      // 24f: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: iload 9
      // 255: aload 0
      // 256: getfield com/iX_3.q I
      // 259: aload 1
      // 25a: getfield com/OU.x [I
      // 25d: bipush 0
      // 25e: iaload
      // 25f: imul
      // 260: iadd
      // 261: istore 9
      // 263: aload 0
      // 264: getfield com/iX_3.q I
      // 267: aload 1
      // 268: getfield com/OU.G [I
      // 26b: bipush 0
      // 26c: iaload
      // 26d: aload 1
      // 26e: getfield com/OU.x [I
      // 271: bipush 0
      // 272: iaload
      // 273: isub
      // 274: imul
      // 275: istore 10
      // 277: iload 6
      // 279: iload 4
      // 27b: ifeq 2a8
      // 27e: tableswitch 70 1 3 49 63 30
      // 298: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: iload 9
      // 29e: iload 10
      // 2a0: iadd
      // 2a1: goto 2a8
      // 2a4: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: istore 9
      // 2aa: iload 4
      // 2ac: ifne 2c4
      // 2af: iload 9
      // 2b1: iload 10
      // 2b3: bipush 1
      // 2b4: ishr
      // 2b5: iadd
      // 2b6: istore 9
      // 2b8: iload 4
      // 2ba: ifne 2c4
      // 2bd: iload 8
      // 2bf: iload 10
      // 2c1: iadd
      // 2c2: istore 8
      // 2c4: iload 4
      // 2c6: ifne 335
      // 2c9: iload 9
      // 2cb: aload 0
      // 2cc: getfield com/iX_3.N I
      // 2cf: aload 1
      // 2d0: getfield com/OU.x [I
      // 2d3: bipush 1
      // 2d4: iaload
      // 2d5: imul
      // 2d6: iadd
      // 2d7: istore 9
      // 2d9: aload 0
      // 2da: getfield com/iX_3.N I
      // 2dd: aload 1
      // 2de: getfield com/OU.G [I
      // 2e1: bipush 1
      // 2e2: iaload
      // 2e3: aload 1
      // 2e4: getfield com/OU.x [I
      // 2e7: bipush 1
      // 2e8: iaload
      // 2e9: isub
      // 2ea: imul
      // 2eb: istore 10
      // 2ed: iload 6
      // 2ef: iload 4
      // 2f1: ifeq 336
      // 2f4: tableswitch 65 1 3 44 58 32
      // 310: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: iload 9
      // 316: iload 10
      // 318: iadd
      // 319: istore 9
      // 31b: iload 4
      // 31d: ifne 335
      // 320: iload 9
      // 322: iload 10
      // 324: bipush 1
      // 325: ishr
      // 326: iadd
      // 327: istore 9
      // 329: iload 4
      // 32b: ifne 335
      // 32e: iload 8
      // 330: iload 10
      // 332: iadd
      // 333: istore 8
      // 335: bipush 2
      // 336: newarray 10
      // 338: dup
      // 339: bipush 0
      // 33a: iload 9
      // 33c: iastore
      // 33d: dup
      // 33e: bipush 1
      // 33f: iload 8
      // 341: iastore
      // 342: astore 10
      // 344: aload 10
      // 346: areturn
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.X(var1, -2.0);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.X(var1, -3.0);
   }

   protected Dimension X(Container param1, double param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: aload 0
      // 04: getfield com/iX_3.w Ljava/util/LinkedList;
      // 07: aload 0
      // 08: getfield com/iX_3.w Ljava/util/LinkedList;
      // 0b: invokevirtual java/util/LinkedList.size ()I
      // 0e: anewarray 122
      // 11: invokevirtual java/util/LinkedList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 14: checkcast [Lcom/OU;
      // 17: astore 5
      // 19: istore 4
      // 1b: aload 5
      // 1d: arraylength
      // 1e: istore 6
      // 20: iload 6
      // 22: anewarray 236
      // 25: astore 7
      // 27: bipush 0
      // 28: istore 8
      // 2a: iload 8
      // 2c: iload 6
      // 2e: if_icmpge 6f
      // 31: iload 4
      // 33: ifeq 7c
      // 36: aload 7
      // 38: iload 8
      // 3a: dload 2
      // 3b: ldc2_w -2.0
      // 3e: dcmpl
      // 3f: ifne 5b
      // 42: goto 49
      // 45: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 5
      // 4b: iload 8
      // 4d: aaload
      // 4e: getfield com/OU.S Ljava/awt/Component;
      // 51: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 54: goto 66
      // 57: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: aload 5
      // 5d: iload 8
      // 5f: aaload
      // 60: getfield com/OU.S Ljava/awt/Component;
      // 63: invokevirtual java/awt/Component.getMinimumSize ()Ljava/awt/Dimension;
      // 66: aastore
      // 67: iinc 8 1
      // 6a: iload 4
      // 6c: ifne 2a
      // 6f: aload 0
      // 70: aload 1
      // 71: bipush 0
      // 72: dload 2
      // 73: aload 5
      // 75: aload 7
      // 77: invokevirtual com/iX_3.b (Ljava/awt/Container;ID[Lcom/OU;[Ljava/awt/Dimension;)I
      // 7a: istore 8
      // 7c: aload 0
      // 7d: aload 1
      // 7e: bipush 1
      // 7f: dload 2
      // 80: aload 5
      // 82: aload 7
      // 84: invokevirtual com/iX_3.b (Ljava/awt/Container;ID[Lcom/OU;[Ljava/awt/Dimension;)I
      // 87: istore 9
      // 89: aload 1
      // 8a: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 8d: astore 10
      // 8f: iload 8
      // 91: aload 10
      // 93: getfield java/awt/Insets.left I
      // 96: aload 10
      // 98: getfield java/awt/Insets.right I
      // 9b: iadd
      // 9c: iadd
      // 9d: istore 8
      // 9f: iload 9
      // a1: aload 10
      // a3: getfield java/awt/Insets.top I
      // a6: aload 10
      // a8: getfield java/awt/Insets.bottom I
      // ab: iadd
      // ac: iadd
      // ad: istore 9
      // af: new java/awt/Dimension
      // b2: dup
      // b3: iload 8
      // b5: iload 9
      // b7: invokespecial java/awt/Dimension.<init> (II)V
      // ba: areturn
   }

   protected int b(Container param1, int param2, double param3, com.OU[] param5, Dimension[] param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/T4.O ()I
      // 003: bipush 0
      // 004: istore 9
      // 006: istore 7
      // 008: aload 0
      // 009: getfield com/iX_3.I [[D
      // 00c: iload 2
      // 00d: aaload
      // 00e: arraylength
      // 00f: istore 12
      // 011: dconst_1
      // 012: dstore 13
      // 014: bipush 0
      // 015: istore 15
      // 017: bipush 0
      // 018: istore 11
      // 01a: iload 11
      // 01c: iload 12
      // 01e: if_icmpge 09d
      // 021: aload 0
      // 022: getfield com/iX_3.I [[D
      // 025: iload 2
      // 026: aaload
      // 027: iload 11
      // 029: daload
      // 02a: dconst_0
      // 02b: dcmpl
      // 02c: iload 7
      // 02e: ifne 09f
      // 031: iload 7
      // 033: ifne 08f
      // 036: goto 03d
      // 039: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: ifle 07b
      // 040: goto 047
      // 043: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: getfield com/iX_3.I [[D
      // 04b: iload 2
      // 04c: aaload
      // 04d: iload 11
      // 04f: daload
      // 050: dconst_1
      // 051: dcmpg
      // 052: iload 7
      // 054: ifne 08f
      // 057: goto 05e
      // 05a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: ifge 07b
      // 061: goto 068
      // 064: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: dload 13
      // 06a: aload 0
      // 06b: getfield com/iX_3.I [[D
      // 06e: iload 2
      // 06f: aaload
      // 070: iload 11
      // 072: daload
      // 073: dsub
      // 074: dstore 13
      // 076: iload 7
      // 078: ifeq 095
      // 07b: aload 0
      // 07c: getfield com/iX_3.I [[D
      // 07f: iload 2
      // 080: aaload
      // 081: iload 11
      // 083: daload
      // 084: ldc2_w -1.0
      // 087: dcmpl
      // 088: goto 08f
      // 08b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: ifne 095
      // 092: iinc 15 1
      // 095: iinc 11 1
      // 098: iload 7
      // 09a: ifeq 01a
      // 09d: iload 15
      // 09f: iload 7
      // 0a1: ifne 0bb
      // 0a4: bipush 1
      // 0a5: if_icmple 0b7
      // 0a8: goto 0af
      // 0ab: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: dload 13
      // 0b1: iload 15
      // 0b3: i2d
      // 0b4: ddiv
      // 0b5: dstore 13
      // 0b7: dload 13
      // 0b9: dconst_0
      // 0ba: dcmpg
      // 0bb: iload 7
      // 0bd: ifne 0f4
      // 0c0: ifge 0cd
      // 0c3: goto 0ca
      // 0c6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: dconst_0
      // 0cb: dstore 13
      // 0cd: aload 0
      // 0ce: getfield com/iX_3.H [[I
      // 0d1: iload 2
      // 0d2: iload 12
      // 0d4: newarray 10
      // 0d6: aastore
      // 0d7: aload 0
      // 0d8: iload 2
      // 0d9: bipush 0
      // 0da: invokevirtual com/iX_3.G (II)I
      // 0dd: pop
      // 0de: aload 0
      // 0df: iload 2
      // 0e0: bipush 0
      // 0e1: ldc2_w -3.0
      // 0e4: invokevirtual com/iX_3.x (IID)I
      // 0e7: pop
      // 0e8: aload 0
      // 0e9: iload 2
      // 0ea: bipush 0
      // 0eb: ldc2_w -2.0
      // 0ee: invokevirtual com/iX_3.x (IID)I
      // 0f1: pop
      // 0f2: iload 12
      // 0f4: newarray 10
      // 0f6: astore 16
      // 0f8: bipush 0
      // 0f9: istore 11
      // 0fb: iload 11
      // 0fd: iload 12
      // 0ff: if_icmpge 15e
      // 102: aload 0
      // 103: getfield com/iX_3.I [[D
      // 106: iload 2
      // 107: aaload
      // 108: iload 11
      // 10a: daload
      // 10b: ldc2_w -2.0
      // 10e: dcmpl
      // 10f: iload 7
      // 111: ifne 165
      // 114: iload 7
      // 116: ifne 13e
      // 119: goto 120
      // 11c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: ifeq 141
      // 123: goto 12a
      // 126: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 0
      // 12b: getfield com/iX_3.I [[D
      // 12e: iload 2
      // 12f: aaload
      // 130: iload 11
      // 132: daload
      // 133: ldc2_w -3.0
      // 136: dcmpl
      // 137: goto 13e
      // 13a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: ifne 156
      // 141: aload 16
      // 143: iload 11
      // 145: aload 0
      // 146: getfield com/iX_3.H [[I
      // 149: iload 2
      // 14a: aaload
      // 14b: iload 11
      // 14d: iaload
      // 14e: iastore
      // 14f: goto 156
      // 152: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: iinc 11 1
      // 159: iload 7
      // 15b: ifeq 0fb
      // 15e: aload 0
      // 15f: getfield com/iX_3.I [[D
      // 162: bipush 0
      // 163: aaload
      // 164: arraylength
      // 165: istore 17
      // 167: aload 0
      // 168: getfield com/iX_3.I [[D
      // 16b: bipush 1
      // 16c: aaload
      // 16d: arraylength
      // 16e: istore 18
      // 170: aload 5
      // 172: arraylength
      // 173: istore 19
      // 175: bipush 0
      // 176: istore 20
      // 178: iload 20
      // 17a: iload 19
      // 17c: if_icmpge 430
      // 17f: aload 5
      // 181: iload 20
      // 183: aaload
      // 184: astore 21
      // 186: iload 7
      // 188: ifne 42b
      // 18b: aload 21
      // 18d: getfield com/OU.x [I
      // 190: bipush 0
      // 191: iaload
      // 192: iload 7
      // 194: ifne 435
      // 197: goto 19e
      // 19a: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: iflt 428
      // 1a1: goto 1a8
      // 1a4: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: aload 21
      // 1aa: getfield com/OU.x [I
      // 1ad: bipush 0
      // 1ae: iaload
      // 1af: iload 17
      // 1b1: iload 7
      // 1b3: ifne 1e3
      // 1b6: goto 1bd
      // 1b9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: if_icmpge 428
      // 1c0: goto 1c7
      // 1c3: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: aload 21
      // 1c9: getfield com/OU.G [I
      // 1cc: bipush 0
      // 1cd: iaload
      // 1ce: iload 7
      // 1d0: ifne 1f4
      // 1d3: goto 1da
      // 1d6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d9: athrow
      // 1da: iload 17
      // 1dc: goto 1e3
      // 1df: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: if_icmpge 428
      // 1e6: aload 21
      // 1e8: getfield com/OU.x [I
      // 1eb: bipush 1
      // 1ec: iaload
      // 1ed: goto 1f4
      // 1f0: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: iload 7
      // 1f6: ifne 211
      // 1f9: iflt 428
      // 1fc: goto 203
      // 1ff: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aload 21
      // 205: getfield com/OU.x [I
      // 208: bipush 1
      // 209: iaload
      // 20a: goto 211
      // 20d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: iload 18
      // 213: iload 7
      // 215: ifne 232
      // 218: if_icmpge 428
      // 21b: goto 222
      // 21e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: aload 21
      // 224: getfield com/OU.G [I
      // 227: bipush 1
      // 228: iaload
      // 229: iload 18
      // 22b: goto 232
      // 22e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 231: athrow
      // 232: if_icmplt 241
      // 235: iload 7
      // 237: ifeq 428
      // 23a: goto 241
      // 23d: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 240: athrow
      // 241: aload 6
      // 243: iload 20
      // 245: aaload
      // 246: astore 8
      // 248: iload 2
      // 249: iload 7
      // 24b: ifne 264
      // 24e: ifne 267
      // 251: goto 258
      // 254: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: aload 8
      // 25a: getfield java/awt/Dimension.width I
      // 25d: goto 264
      // 260: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 263: athrow
      // 264: goto 26c
      // 267: aload 8
      // 269: getfield java/awt/Dimension.height I
      // 26c: istore 22
      // 26e: aload 21
      // 270: getfield com/OU.x [I
      // 273: iload 2
      // 274: iaload
      // 275: istore 11
      // 277: iload 11
      // 279: aload 21
      // 27b: getfield com/OU.G [I
      // 27e: iload 2
      // 27f: iaload
      // 280: if_icmpgt 316
      // 283: aload 0
      // 284: getfield com/iX_3.I [[D
      // 287: iload 2
      // 288: aaload
      // 289: iload 11
      // 28b: daload
      // 28c: dconst_1
      // 28d: dcmpl
      // 28e: iload 7
      // 290: ifne 17a
      // 293: iload 7
      // 295: ifne 2cb
      // 298: iflt 2b7
      // 29b: goto 2a2
      // 29e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: iload 22
      // 2a4: i2d
      // 2a5: aload 0
      // 2a6: getfield com/iX_3.I [[D
      // 2a9: iload 2
      // 2aa: aaload
      // 2ab: iload 11
      // 2ad: daload
      // 2ae: dsub
      // 2af: d2i
      // 2b0: istore 22
      // 2b2: iload 7
      // 2b4: ifeq 30e
      // 2b7: aload 0
      // 2b8: getfield com/iX_3.I [[D
      // 2bb: iload 2
      // 2bc: aaload
      // 2bd: iload 11
      // 2bf: daload
      // 2c0: ldc2_w -2.0
      // 2c3: dcmpl
      // 2c4: goto 2cb
      // 2c7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: iload 7
      // 2cd: ifne 30c
      // 2d0: ifeq 2fd
      // 2d3: goto 2da
      // 2d6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: getfield com/iX_3.I [[D
      // 2de: iload 2
      // 2df: aaload
      // 2e0: iload 11
      // 2e2: daload
      // 2e3: ldc2_w -3.0
      // 2e6: dcmpl
      // 2e7: iload 7
      // 2e9: ifne 30c
      // 2ec: goto 2f3
      // 2ef: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: ifne 30e
      // 2f6: goto 2fd
      // 2f9: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: iload 22
      // 2ff: aload 16
      // 301: iload 11
      // 303: iaload
      // 304: isub
      // 305: goto 30c
      // 308: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30b: athrow
      // 30c: istore 22
      // 30e: iinc 11 1
      // 311: iload 7
      // 313: ifeq 277
      // 316: dconst_0
      // 317: dstore 23
      // 319: aload 21
      // 31b: getfield com/OU.x [I
      // 31e: iload 2
      // 31f: iaload
      // 320: istore 11
      // 322: iload 11
      // 324: aload 21
      // 326: getfield com/OU.G [I
      // 329: iload 2
      // 32a: iaload
      // 32b: if_icmpgt 3db
      // 32e: aload 0
      // 32f: getfield com/iX_3.I [[D
      // 332: iload 2
      // 333: aaload
      // 334: iload 11
      // 336: daload
      // 337: dconst_0
      // 338: dcmpl
      // 339: iload 7
      // 33b: ifne 3df
      // 33e: iload 7
      // 340: ifne 39c
      // 343: goto 34a
      // 346: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 349: athrow
      // 34a: ifle 388
      // 34d: goto 354
      // 350: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 353: athrow
      // 354: aload 0
      // 355: getfield com/iX_3.I [[D
      // 358: iload 2
      // 359: aaload
      // 35a: iload 11
      // 35c: daload
      // 35d: dconst_1
      // 35e: dcmpg
      // 35f: iload 7
      // 361: ifne 39c
      // 364: goto 36b
      // 367: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36a: athrow
      // 36b: ifge 388
      // 36e: goto 375
      // 371: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 374: athrow
      // 375: dload 23
      // 377: aload 0
      // 378: getfield com/iX_3.I [[D
      // 37b: iload 2
      // 37c: aaload
      // 37d: iload 11
      // 37f: daload
      // 380: dadd
      // 381: dstore 23
      // 383: iload 7
      // 385: ifeq 3d3
      // 388: aload 0
      // 389: getfield com/iX_3.I [[D
      // 38c: iload 2
      // 38d: aaload
      // 38e: iload 11
      // 390: daload
      // 391: ldc2_w -1.0
      // 394: dcmpl
      // 395: goto 39c
      // 398: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39b: athrow
      // 39c: iload 7
      // 39e: ifne 3c2
      // 3a1: ifne 3d3
      // 3a4: goto 3ab
      // 3a7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3aa: athrow
      // 3ab: dload 13
      // 3ad: dconst_0
      // 3ae: iload 7
      // 3b0: ifne 3d0
      // 3b3: goto 3ba
      // 3b6: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b9: athrow
      // 3ba: dcmpl
      // 3bb: goto 3c2
      // 3be: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c1: athrow
      // 3c2: ifeq 3d3
      // 3c5: dload 23
      // 3c7: dload 13
      // 3c9: goto 3d0
      // 3cc: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cf: athrow
      // 3d0: dadd
      // 3d1: dstore 23
      // 3d3: iinc 11 1
      // 3d6: iload 7
      // 3d8: ifeq 322
      // 3db: dload 23
      // 3dd: dconst_0
      // 3de: dcmpl
      // 3df: iload 7
      // 3e1: ifne 408
      // 3e4: ifne 3f6
      // 3e7: goto 3ee
      // 3ea: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ed: athrow
      // 3ee: bipush 0
      // 3ef: istore 10
      // 3f1: iload 7
      // 3f3: ifeq 40a
      // 3f6: iload 22
      // 3f8: i2d
      // 3f9: dload 23
      // 3fb: ddiv
      // 3fc: ldc2_w 0.5
      // 3ff: dadd
      // 400: d2i
      // 401: goto 408
      // 404: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 407: athrow
      // 408: istore 10
      // 40a: iload 9
      // 40c: iload 7
      // 40e: ifne 426
      // 411: iload 10
      // 413: if_icmpge 428
      // 416: goto 41d
      // 419: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41c: athrow
      // 41d: iload 10
      // 41f: goto 426
      // 422: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 425: athrow
      // 426: istore 9
      // 428: iinc 20 1
      // 42b: iload 7
      // 42d: ifeq 178
      // 430: iload 9
      // 432: istore 20
      // 434: bipush 0
      // 435: istore 11
      // 437: iload 11
      // 439: iload 12
      // 43b: if_icmpge 4db
      // 43e: aload 0
      // 43f: getfield com/iX_3.I [[D
      // 442: iload 2
      // 443: aaload
      // 444: iload 11
      // 446: daload
      // 447: dconst_1
      // 448: dcmpl
      // 449: iload 7
      // 44b: ifne 4dd
      // 44e: iload 7
      // 450: ifne 490
      // 453: goto 45a
      // 456: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 459: athrow
      // 45a: iflt 47c
      // 45d: goto 464
      // 460: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 463: athrow
      // 464: iload 20
      // 466: aload 0
      // 467: getfield com/iX_3.I [[D
      // 46a: iload 2
      // 46b: aaload
      // 46c: iload 11
      // 46e: daload
      // 46f: ldc2_w 0.5
      // 472: dadd
      // 473: d2i
      // 474: iadd
      // 475: istore 20
      // 477: iload 7
      // 479: ifeq 4d3
      // 47c: aload 0
      // 47d: getfield com/iX_3.I [[D
      // 480: iload 2
      // 481: aaload
      // 482: iload 11
      // 484: daload
      // 485: ldc2_w -2.0
      // 488: dcmpl
      // 489: goto 490
      // 48c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48f: athrow
      // 490: iload 7
      // 492: ifne 4d1
      // 495: ifeq 4c2
      // 498: goto 49f
      // 49b: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49e: athrow
      // 49f: aload 0
      // 4a0: getfield com/iX_3.I [[D
      // 4a3: iload 2
      // 4a4: aaload
      // 4a5: iload 11
      // 4a7: daload
      // 4a8: ldc2_w -3.0
      // 4ab: dcmpl
      // 4ac: iload 7
      // 4ae: ifne 4d1
      // 4b1: goto 4b8
      // 4b4: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b7: athrow
      // 4b8: ifne 4d3
      // 4bb: goto 4c2
      // 4be: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c1: athrow
      // 4c2: iload 20
      // 4c4: aload 16
      // 4c6: iload 11
      // 4c8: iaload
      // 4c9: iadd
      // 4ca: goto 4d1
      // 4cd: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d0: athrow
      // 4d1: istore 20
      // 4d3: iinc 11 1
      // 4d6: iload 7
      // 4d8: ifeq 437
      // 4db: iload 12
      // 4dd: iload 7
      // 4df: ifne 521
      // 4e2: ifle 51f
      // 4e5: goto 4ec
      // 4e8: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4eb: athrow
      // 4ec: iload 20
      // 4ee: iload 2
      // 4ef: iload 7
      // 4f1: ifne 510
      // 4f4: goto 4fb
      // 4f7: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fa: athrow
      // 4fb: ifne 513
      // 4fe: goto 505
      // 501: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 504: athrow
      // 505: aload 0
      // 506: getfield com/iX_3.q I
      // 509: goto 510
      // 50c: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50f: athrow
      // 510: goto 517
      // 513: aload 0
      // 514: getfield com/iX_3.N I
      // 517: iload 12
      // 519: bipush 1
      // 51a: isub
      // 51b: imul
      // 51c: iadd
      // 51d: istore 20
      // 51f: iload 20
      // 521: ireturn
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      this.addLayoutComponent(var2, var1);
   }

   @Override
   public void addLayoutComponent(Component param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: instanceof java/lang/String
      // 08: iload 3
      // 09: ifeq 55
      // 0c: ifeq 3f
      // 0f: goto 16
      // 12: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: new com/w4_2
      // 19: dup
      // 1a: aload 2
      // 1b: checkcast java/lang/String
      // 1e: invokespecial com/w4_2.<init> (Ljava/lang/String;)V
      // 21: astore 2
      // 22: aload 0
      // 23: getfield com/iX_3.w Ljava/util/LinkedList;
      // 26: new com/OU
      // 29: dup
      // 2a: aload 1
      // 2b: aload 2
      // 2c: checkcast com/w4_2
      // 2f: invokespecial com/OU.<init> (Ljava/awt/Component;Lcom/w4_2;)V
      // 32: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 35: pop
      // 36: aload 0
      // 37: bipush 1
      // 38: putfield com/iX_3.B Z
      // 3b: iload 3
      // 3c: ifne c1
      // 3f: aload 2
      // 40: iload 3
      // 41: ifeq 84
      // 44: goto 4b
      // 47: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: instanceof com/w4_2
      // 4e: goto 55
      // 51: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: ifeq 7c
      // 58: aload 0
      // 59: getfield com/iX_3.w Ljava/util/LinkedList;
      // 5c: new com/OU
      // 5f: dup
      // 60: aload 1
      // 61: aload 2
      // 62: checkcast com/w4_2
      // 65: invokespecial com/OU.<init> (Ljava/awt/Component;Lcom/w4_2;)V
      // 68: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 6b: pop
      // 6c: aload 0
      // 6d: bipush 1
      // 6e: putfield com/iX_3.B Z
      // 71: iload 3
      // 72: ifne c1
      // 75: goto 7c
      // 78: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 2
      // 7d: goto 84
      // 80: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: ifnonnull 9c
      // 87: new java/lang/IllegalArgumentException
      // 8a: dup
      // 8b: sipush -15539
      // 8e: sipush -29250
      // 91: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // 94: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 97: athrow
      // 98: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: new java/lang/IllegalArgumentException
      // 9f: dup
      // a0: new java/lang/StringBuilder
      // a3: dup
      // a4: invokespecial java/lang/StringBuilder.<init> ()V
      // a7: sipush -15526
      // aa: sipush -13249
      // ad: invokestatic com/iX_3.a (II)Ljava/lang/String;
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: aload 2
      // b4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ba: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bd: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // c0: athrow
      // c1: return
   }

   @Override
   public void removeLayoutComponent(Component param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/T4.b ()I
      // 03: aload 0
      // 04: getfield com/iX_3.w Ljava/util/LinkedList;
      // 07: bipush 0
      // 08: invokevirtual java/util/LinkedList.listIterator (I)Ljava/util/ListIterator;
      // 0b: astore 3
      // 0c: istore 2
      // 0d: aload 3
      // 0e: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 13: ifeq 46
      // 16: aload 3
      // 17: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 1c: checkcast com/OU
      // 1f: astore 4
      // 21: iload 2
      // 22: ifeq 4b
      // 25: aload 4
      // 27: getfield com/OU.S Ljava/awt/Component;
      // 2a: aload 1
      // 2b: if_acmpne 42
      // 2e: goto 35
      // 31: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 3
      // 36: invokeinterface java/util/ListIterator.remove ()V 1
      // 3b: goto 42
      // 3e: invokestatic com/iX_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: iload 2
      // 43: ifne 0d
      // 46: aload 0
      // 47: bipush 1
      // 48: putfield com/iX_3.B Z
      // 4b: return
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(a(29226, 762109731313028829L), a(20261, 4464891868633150419L));
   }

   @Override
   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   @Override
   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   @Override
   public void invalidateLayout(Container var1) {
      this.B = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[26];
      int var11 = 0;
      String var10 = "î@vóÚµ;Á\u0099R®lï\u0086Kµ»Ò\u009d\u0084ÿ\n\u0087el$Á\u009d\u000e\u0001ê\b<nr\u0080\u0016È/Q@*\u001bµ=¤¾\u0006À\t\nQ\u0097þAÜßS6\u0016ô\u0091Ö\u0097Úá«bgU~½\u0006¥°bÂÿ[\b£Ì\u001dà¿·\fâJ<>y\u00ad\u00adô{\u001dÐ¡ÓÑý\rOÿõ´¢\u009e³~©\u0002æ/\u00125ït\u0006]\u000fã\u0003½ZäK\u0089\u007fyº\u008dQ\u0002Ä\u0092$n4\u000brèzk\u000f\\L6³\u0098üSíÇ!Ü6\u0098rþ\u0098+f\u0005\u008d9em3\u0086\u0017:\u0004\u000eQ%\u0015R¬\u0004éçi\\\f5ã-#ð\u0097µ\t¢ê4*x/\u0087ëq[Z\r/»\u001d\u0017î|Ê/Bw\t¢»,S\u0003à4\u0007$ Þ¯ áÏ\\\u008eu»&yF\nÄX\u0080\u0089vâ\u0099\u001e\u0000!ô\u00adªÃ\u0016OO\u0099ý\u001fÜ÷|÷ÄUc¾§·\u0083\b\u001a\u0099K·\u009c8_ÈNLÄâ\u0082 \u0092Í¿\u0010N\u001béß·ûtÝ\u009d²Oìô¨\u0094\u0082\u0018ÄxÁD\u0093.iPe\u0018+¾ò>\u0098°\u0001\u0091\u0088£\n5ÀÜ¦\nb\u000e\u008d´=>\u0010ëøK(ø«6\u009e0Ù\u0094\u0002;½?H\u001b¢K\u0080\"\u009cVlW¥Ë6\u009díu\u0007ÒU,?¸/bQîò¨\u0004iA¼\u0017\u008aÇ-¥u\u0011\u0088Vw®ô-\u0091ù&\u0010mh*`µBê\u001d\t\u0007\u008a\u001bE¨Èbç&~\u0085\u00013\u009fd:iÀ\u001aè\u001d\u0001è<\u0015`\u000fÓ\u0002I\u0002\u0004¬pä\u000b\u001f\u0097lÖ»Ôõ¿²îN_¯8¢@iSXg¤§\n(\u0089°\u0086Z\u0014w9Ð%Ç\náMÀXÑm&°úøô\u008fÊ`7}P\u009dQ!÷¶%e\u001eæ\u0094:\u009f\u0082É\u000eú\u008f\u0003\u0004\u0016\t³$\u0002\u0017Î\u001c*íîFÉ\u0003Y\u0017Õ\u00882\u001fÆ\u0095\u0081\u0081ÒÄÓ¬\fÖ¶W¦þø¼\u001ciL\u0086rÄ\u0085øÇá\u0092¥\\\u001cý¢\u008c¶e_\u0098\u009dP\u0084\u0087àä0ÿ$}Ø\u0004à\u0094×ò\u008d Û\u0097]\u0015 \u0014qPJà\u0097Phr)Ò\u00ad\u0016¬ô'µÌ×ö\u000f\u0093%²(O\t\u0015Ðk|q\u0092\u0010¼©\u0007aqB_þÙ\u0084©M§rGô¢É²4\u0093¼,TËÖ";
      int var12 = "î@vóÚµ;Á\u0099R®lï\u0086Kµ»Ò\u009d\u0084ÿ\n\u0087el$Á\u009d\u000e\u0001ê\b<nr\u0080\u0016È/Q@*\u001bµ=¤¾\u0006À\t\nQ\u0097þAÜßS6\u0016ô\u0091Ö\u0097Úá«bgU~½\u0006¥°bÂÿ[\b£Ì\u001dà¿·\fâJ<>y\u00ad\u00adô{\u001dÐ¡ÓÑý\rOÿõ´¢\u009e³~©\u0002æ/\u00125ït\u0006]\u000fã\u0003½ZäK\u0089\u007fyº\u008dQ\u0002Ä\u0092$n4\u000brèzk\u000f\\L6³\u0098üSíÇ!Ü6\u0098rþ\u0098+f\u0005\u008d9em3\u0086\u0017:\u0004\u000eQ%\u0015R¬\u0004éçi\\\f5ã-#ð\u0097µ\t¢ê4*x/\u0087ëq[Z\r/»\u001d\u0017î|Ê/Bw\t¢»,S\u0003à4\u0007$ Þ¯ áÏ\\\u008eu»&yF\nÄX\u0080\u0089vâ\u0099\u001e\u0000!ô\u00adªÃ\u0016OO\u0099ý\u001fÜ÷|÷ÄUc¾§·\u0083\b\u001a\u0099K·\u009c8_ÈNLÄâ\u0082 \u0092Í¿\u0010N\u001béß·ûtÝ\u009d²Oìô¨\u0094\u0082\u0018ÄxÁD\u0093.iPe\u0018+¾ò>\u0098°\u0001\u0091\u0088£\n5ÀÜ¦\nb\u000e\u008d´=>\u0010ëøK(ø«6\u009e0Ù\u0094\u0002;½?H\u001b¢K\u0080\"\u009cVlW¥Ë6\u009díu\u0007ÒU,?¸/bQîò¨\u0004iA¼\u0017\u008aÇ-¥u\u0011\u0088Vw®ô-\u0091ù&\u0010mh*`µBê\u001d\t\u0007\u008a\u001bE¨Èbç&~\u0085\u00013\u009fd:iÀ\u001aè\u001d\u0001è<\u0015`\u000fÓ\u0002I\u0002\u0004¬pä\u000b\u001f\u0097lÖ»Ôõ¿²îN_¯8¢@iSXg¤§\n(\u0089°\u0086Z\u0014w9Ð%Ç\náMÀXÑm&°úøô\u008fÊ`7}P\u009dQ!÷¶%e\u001eæ\u0094:\u009f\u0082É\u000eú\u008f\u0003\u0004\u0016\t³$\u0002\u0017Î\u001c*íîFÉ\u0003Y\u0017Õ\u00882\u001fÆ\u0095\u0081\u0081ÒÄÓ¬\fÖ¶W¦þø¼\u001ciL\u0086rÄ\u0085øÇá\u0092¥\\\u001cý¢\u008c¶e_\u0098\u009dP\u0084\u0087àä0ÿ$}Ø\u0004à\u0094×ò\u008d Û\u0097]\u0015 \u0014qPJà\u0097Phr)Ò\u00ad\u0016¬ô'µÌ×ö\u000f\u0093%²(O\t\u0015Ðk|q\u0092\u0010¼©\u0007aqB_þÙ\u0084©M§rGô¢É²4\u0093¼,TËÖ"
         .length();
      char var9 = '$';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 45;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 123;
                        break;
                     case 1:
                        var58 = 112;
                        break;
                     case 2:
                        var58 = 100;
                        break;
                     case 3:
                        var58 = 81;
                        break;
                     case 4:
                        var58 = 65;
                        break;
                     case 5:
                        var58 = 65;
                        break;
                     default:
                        var58 = 116;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[26];
                     long var0 = 2194470055122740507L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "-\u008b®%\u0088Eé7Â}\u0096GPåT9";
                     int var5 = "-\u008b®%\u0088Eé7Â}\u0096GPåT9".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[2];
                     e = new double[][]{new double[0], new double[0]};
                     K = true;
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "\u008aö\u0002) ";
                  var12 = "\u008aö\u0002) ".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 83;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15523) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 231;
               break;
            case 1:
               var10000 = 45;
               break;
            case 2:
               var10000 = 150;
               break;
            case 3:
               var10000 = 137;
               break;
            case 4:
               var10000 = 251;
               break;
            case 5:
               var10000 = 186;
               break;
            case 6:
               var10000 = 3;
               break;
            case 7:
               var10000 = 136;
               break;
            case 8:
               var10000 = 223;
               break;
            case 9:
               var10000 = 54;
               break;
            case 10:
               var10000 = 109;
               break;
            case 11:
               var10000 = 40;
               break;
            case 12:
               var10000 = 55;
               break;
            case 13:
               var10000 = 199;
               break;
            case 14:
               var10000 = 12;
               break;
            case 15:
               var10000 = 198;
               break;
            case 16:
               var10000 = 225;
               break;
            case 17:
               var10000 = 124;
               break;
            case 18:
               var10000 = 182;
               break;
            case 19:
               var10000 = 71;
               break;
            case 20:
               var10000 = 116;
               break;
            case 21:
               var10000 = 127;
               break;
            case 22:
               var10000 = 191;
               break;
            case 23:
               var10000 = 250;
               break;
            case 24:
               var10000 = 176;
               break;
            case 25:
               var10000 = 247;
               break;
            case 26:
               var10000 = 179;
               break;
            case 27:
               var10000 = 87;
               break;
            case 28:
               var10000 = 249;
               break;
            case 29:
               var10000 = 67;
               break;
            case 30:
               var10000 = 168;
               break;
            case 31:
               var10000 = 227;
               break;
            case 32:
               var10000 = 141;
               break;
            case 33:
               var10000 = 48;
               break;
            case 34:
               var10000 = 221;
               break;
            case 35:
               var10000 = 162;
               break;
            case 36:
               var10000 = 129;
               break;
            case 37:
               var10000 = 41;
               break;
            case 38:
               var10000 = 161;
               break;
            case 39:
               var10000 = 197;
               break;
            case 40:
               var10000 = 128;
               break;
            case 41:
               var10000 = 166;
               break;
            case 42:
               var10000 = 99;
               break;
            case 43:
               var10000 = 28;
               break;
            case 44:
               var10000 = 158;
               break;
            case 45:
               var10000 = 203;
               break;
            case 46:
               var10000 = 181;
               break;
            case 47:
               var10000 = 224;
               break;
            case 48:
               var10000 = 78;
               break;
            case 49:
               var10000 = 135;
               break;
            case 50:
               var10000 = 115;
               break;
            case 51:
               var10000 = 159;
               break;
            case 52:
               var10000 = 30;
               break;
            case 53:
               var10000 = 154;
               break;
            case 54:
               var10000 = 234;
               break;
            case 55:
               var10000 = 132;
               break;
            case 56:
               var10000 = 196;
               break;
            case 57:
               var10000 = 100;
               break;
            case 58:
               var10000 = 148;
               break;
            case 59:
               var10000 = 86;
               break;
            case 60:
               var10000 = 88;
               break;
            case 61:
               var10000 = 184;
               break;
            case 62:
               var10000 = 236;
               break;
            case 63:
               var10000 = 205;
               break;
            case 64:
               var10000 = 106;
               break;
            case 65:
               var10000 = 228;
               break;
            case 66:
               var10000 = 244;
               break;
            case 67:
               var10000 = 157;
               break;
            case 68:
               var10000 = 126;
               break;
            case 69:
               var10000 = 44;
               break;
            case 70:
               var10000 = 9;
               break;
            case 71:
               var10000 = 32;
               break;
            case 72:
               var10000 = 232;
               break;
            case 73:
               var10000 = 79;
               break;
            case 74:
               var10000 = 121;
               break;
            case 75:
               var10000 = 226;
               break;
            case 76:
               var10000 = 34;
               break;
            case 77:
               var10000 = 29;
               break;
            case 78:
               var10000 = 188;
               break;
            case 79:
               var10000 = 56;
               break;
            case 80:
               var10000 = 175;
               break;
            case 81:
               var10000 = 131;
               break;
            case 82:
               var10000 = 59;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 167;
               break;
            case 85:
               var10000 = 26;
               break;
            case 86:
               var10000 = 206;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 195;
               break;
            case 89:
               var10000 = 187;
               break;
            case 90:
               var10000 = 133;
               break;
            case 91:
               var10000 = 94;
               break;
            case 92:
               var10000 = 51;
               break;
            case 93:
               var10000 = 208;
               break;
            case 94:
               var10000 = 114;
               break;
            case 95:
               var10000 = 172;
               break;
            case 96:
               var10000 = 93;
               break;
            case 97:
               var10000 = 43;
               break;
            case 98:
               var10000 = 68;
               break;
            case 99:
               var10000 = 7;
               break;
            case 100:
               var10000 = 194;
               break;
            case 101:
               var10000 = 204;
               break;
            case 102:
               var10000 = 122;
               break;
            case 103:
               var10000 = 163;
               break;
            case 104:
               var10000 = 185;
               break;
            case 105:
               var10000 = 142;
               break;
            case 106:
               var10000 = 207;
               break;
            case 107:
               var10000 = 245;
               break;
            case 108:
               var10000 = 239;
               break;
            case 109:
               var10000 = 38;
               break;
            case 110:
               var10000 = 178;
               break;
            case 111:
               var10000 = 80;
               break;
            case 112:
               var10000 = 65;
               break;
            case 113:
               var10000 = 0;
               break;
            case 114:
               var10000 = 117;
               break;
            case 115:
               var10000 = 50;
               break;
            case 116:
               var10000 = 169;
               break;
            case 117:
               var10000 = 75;
               break;
            case 118:
               var10000 = 89;
               break;
            case 119:
               var10000 = 1;
               break;
            case 120:
               var10000 = 164;
               break;
            case 121:
               var10000 = 216;
               break;
            case 122:
               var10000 = 211;
               break;
            case 123:
               var10000 = 107;
               break;
            case 124:
               var10000 = 156;
               break;
            case 125:
               var10000 = 215;
               break;
            case 126:
               var10000 = 85;
               break;
            case 127:
               var10000 = 2;
               break;
            case 128:
               var10000 = 242;
               break;
            case 129:
               var10000 = 110;
               break;
            case 130:
               var10000 = 81;
               break;
            case 131:
               var10000 = 49;
               break;
            case 132:
               var10000 = 220;
               break;
            case 133:
               var10000 = 102;
               break;
            case 134:
               var10000 = 77;
               break;
            case 135:
               var10000 = 97;
               break;
            case 136:
               var10000 = 52;
               break;
            case 137:
               var10000 = 138;
               break;
            case 138:
               var10000 = 222;
               break;
            case 139:
               var10000 = 149;
               break;
            case 140:
               var10000 = 46;
               break;
            case 141:
               var10000 = 84;
               break;
            case 142:
               var10000 = 76;
               break;
            case 143:
               var10000 = 118;
               break;
            case 144:
               var10000 = 151;
               break;
            case 145:
               var10000 = 33;
               break;
            case 146:
               var10000 = 238;
               break;
            case 147:
               var10000 = 58;
               break;
            case 148:
               var10000 = 61;
               break;
            case 149:
               var10000 = 229;
               break;
            case 150:
               var10000 = 112;
               break;
            case 151:
               var10000 = 62;
               break;
            case 152:
               var10000 = 246;
               break;
            case 153:
               var10000 = 212;
               break;
            case 154:
               var10000 = 35;
               break;
            case 155:
               var10000 = 91;
               break;
            case 156:
               var10000 = 92;
               break;
            case 157:
               var10000 = 177;
               break;
            case 158:
               var10000 = 200;
               break;
            case 159:
               var10000 = 72;
               break;
            case 160:
               var10000 = 144;
               break;
            case 161:
               var10000 = 74;
               break;
            case 162:
               var10000 = 108;
               break;
            case 163:
               var10000 = 252;
               break;
            case 164:
               var10000 = 104;
               break;
            case 165:
               var10000 = 240;
               break;
            case 166:
               var10000 = 170;
               break;
            case 167:
               var10000 = 20;
               break;
            case 168:
               var10000 = 209;
               break;
            case 169:
               var10000 = 15;
               break;
            case 170:
               var10000 = 119;
               break;
            case 171:
               var10000 = 155;
               break;
            case 172:
               var10000 = 66;
               break;
            case 173:
               var10000 = 217;
               break;
            case 174:
               var10000 = 202;
               break;
            case 175:
               var10000 = 14;
               break;
            case 176:
               var10000 = 70;
               break;
            case 177:
               var10000 = 69;
               break;
            case 178:
               var10000 = 53;
               break;
            case 179:
               var10000 = 98;
               break;
            case 180:
               var10000 = 254;
               break;
            case 181:
               var10000 = 193;
               break;
            case 182:
               var10000 = 31;
               break;
            case 183:
               var10000 = 192;
               break;
            case 184:
               var10000 = 39;
               break;
            case 185:
               var10000 = 42;
               break;
            case 186:
               var10000 = 173;
               break;
            case 187:
               var10000 = 113;
               break;
            case 188:
               var10000 = 17;
               break;
            case 189:
               var10000 = 23;
               break;
            case 190:
               var10000 = 18;
               break;
            case 191:
               var10000 = 213;
               break;
            case 192:
               var10000 = 90;
               break;
            case 193:
               var10000 = 47;
               break;
            case 194:
               var10000 = 183;
               break;
            case 195:
               var10000 = 25;
               break;
            case 196:
               var10000 = 241;
               break;
            case 197:
               var10000 = 235;
               break;
            case 198:
               var10000 = 13;
               break;
            case 199:
               var10000 = 11;
               break;
            case 200:
               var10000 = 210;
               break;
            case 201:
               var10000 = 120;
               break;
            case 202:
               var10000 = 103;
               break;
            case 203:
               var10000 = 174;
               break;
            case 204:
               var10000 = 96;
               break;
            case 205:
               var10000 = 160;
               break;
            case 206:
               var10000 = 82;
               break;
            case 207:
               var10000 = 10;
               break;
            case 208:
               var10000 = 95;
               break;
            case 209:
               var10000 = 134;
               break;
            case 210:
               var10000 = 230;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 147;
               break;
            case 213:
               var10000 = 139;
               break;
            case 214:
               var10000 = 63;
               break;
            case 215:
               var10000 = 146;
               break;
            case 216:
               var10000 = 130;
               break;
            case 217:
               var10000 = 123;
               break;
            case 218:
               var10000 = 64;
               break;
            case 219:
               var10000 = 73;
               break;
            case 220:
               var10000 = 83;
               break;
            case 221:
               var10000 = 153;
               break;
            case 222:
               var10000 = 101;
               break;
            case 223:
               var10000 = 140;
               break;
            case 224:
               var10000 = 4;
               break;
            case 225:
               var10000 = 189;
               break;
            case 226:
               var10000 = 19;
               break;
            case 227:
               var10000 = 233;
               break;
            case 228:
               var10000 = 36;
               break;
            case 229:
               var10000 = 214;
               break;
            case 230:
               var10000 = 219;
               break;
            case 231:
               var10000 = 105;
               break;
            case 232:
               var10000 = 8;
               break;
            case 233:
               var10000 = 57;
               break;
            case 234:
               var10000 = 152;
               break;
            case 235:
               var10000 = 5;
               break;
            case 236:
               var10000 = 24;
               break;
            case 237:
               var10000 = 125;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 145;
               break;
            case 240:
               var10000 = 111;
               break;
            case 241:
               var10000 = 237;
               break;
            case 242:
               var10000 = 21;
               break;
            case 243:
               var10000 = 180;
               break;
            case 244:
               var10000 = 27;
               break;
            case 245:
               var10000 = 201;
               break;
            case 246:
               var10000 = 60;
               break;
            case 247:
               var10000 = 143;
               break;
            case 248:
               var10000 = 255;
               break;
            case 249:
               var10000 = 171;
               break;
            case 250:
               var10000 = 6;
               break;
            case 251:
               var10000 = 243;
               break;
            case 252:
               var10000 = 248;
               break;
            case 253:
               var10000 = 22;
               break;
            case 254:
               var10000 = 37;
               break;
            default:
               var10000 = 190;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31990;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





