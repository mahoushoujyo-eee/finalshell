package com.finalshell.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class B3_2 {
   public static boolean E;
   public final Cr2_2 P;
   public int Q;
   public short y;
   public byte[] u;
   public final FU T;
   public final F9 H;
   public F9 Z;
   public final List f;
   public final List s = new ArrayList();
   @C_9
   public Hz2 K;
   public short a;
   public final List W = new ArrayList();
   public static Map C;
   public static boolean g;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public B3_2(Cr2_2 var1) {
      this.P = var1;
      this.Q = 0;
      this.y = 0;
      this.u = new byte[a(25776, 442518204973880766L)];
      this.f = new ArrayList();
      this.T = new FU(this);
      this.T.E = 0;
      this.Z = new F9(this);
      this.Z.E = 0;
      this.Z.Z(new FC(new Y2_3[0], new Y2_3[0]));
      this.T.N = this.Z;
      this.Z.a = this.T;
      this.H = this.Z;
   }

   public Cr2_2 b() {
      return this.P;
   }

   public short L(short var1) {
      return this.Q(var1, null, null).w();
   }

   public W4_3 Q(short param1, @C_9 String param2, @C_9 Q4_3 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/B3_2.K Lcom/finalshell/core/Hz2;
      // 07: astore 5
      // 09: astore 4
      // 0b: getstatic com/finalshell/core/B3_2.g Z
      // 0e: ifne 3e
      // 11: aload 5
      // 13: aload 4
      // 15: ifnull 40
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1e: athrow
      // 1f: ifnonnull 3e
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 28: athrow
      // 29: new java/lang/AssertionError
      // 2c: dup
      // 2d: sipush -18736
      // 30: sipush -14675
      // 33: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 36: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 39: athrow
      // 3a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3d: athrow
      // 3e: aload 5
      // 40: getfield com/finalshell/core/Hz2.I Ljava/util/List;
      // 43: astore 6
      // 45: new com/finalshell/core/W4_3
      // 48: dup
      // 49: aload 2
      // 4a: aload 0
      // 4b: getfield com/finalshell/core/B3_2.a S
      // 4e: aload 3
      // 4f: invokespecial com/finalshell/core/W4_3.<init> (Ljava/lang/String;SLcom/finalshell/core/Q4_3;)V
      // 52: astore 7
      // 54: aload 4
      // 56: ifnull 95
      // 59: aload 2
      // 5a: ifnull 74
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 63: athrow
      // 64: aload 7
      // 66: aload 0
      // 67: invokevirtual com/finalshell/core/B3_2.K ()Lcom/finalshell/core/FU;
      // 6a: invokevirtual com/finalshell/core/W4_3.n (Lcom/finalshell/core/FU;)V
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 73: athrow
      // 74: aload 0
      // 75: dup
      // 76: getfield com/finalshell/core/B3_2.a S
      // 79: iload 1
      // 7a: iadd
      // 7b: i2s
      // 7c: putfield com/finalshell/core/B3_2.a S
      // 7f: aload 6
      // 81: aload 7
      // 83: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 88: pop
      // 89: aload 0
      // 8a: getfield com/finalshell/core/B3_2.s Ljava/util/List;
      // 8d: aload 7
      // 8f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 94: pop
      // 95: aload 0
      // 96: aload 4
      // 98: ifnull b4
      // 9b: getfield com/finalshell/core/B3_2.a S
      // 9e: aload 0
      // 9f: getfield com/finalshell/core/B3_2.y S
      // a2: if_icmple bb
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // ab: athrow
      // ac: aload 0
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // b3: athrow
      // b4: aload 0
      // b5: getfield com/finalshell/core/B3_2.a S
      // b8: putfield com/finalshell/core/B3_2.y S
      // bb: aload 7
      // bd: areturn
   }

   public List M$List() {
      return (this.K = new Hz2(this.K, this.a, this.Z.K())).I;
   }

   public void O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/B3_2.K Lcom/finalshell/core/Hz2;
      // 007: astore 2
      // 008: astore 1
      // 009: getstatic com/finalshell/core/B3_2.g Z
      // 00c: ifne 031
      // 00f: aload 2
      // 010: aload 1
      // 011: ifnull 032
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 01a: athrow
      // 01b: ifnonnull 031
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 024: athrow
      // 025: new java/lang/AssertionError
      // 028: dup
      // 029: invokespecial java/lang/AssertionError.<init> ()V
      // 02c: athrow
      // 02d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 030: athrow
      // 031: aload 2
      // 032: getfield com/finalshell/core/Hz2.I Ljava/util/List;
      // 035: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 03a: astore 3
      // 03b: aload 3
      // 03c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 041: ifeq 08d
      // 044: aload 3
      // 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04a: checkcast com/finalshell/core/W4_3
      // 04d: astore 4
      // 04f: aload 1
      // 050: ifnull 09d
      // 053: aload 1
      // 054: ifnull 089
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05d: athrow
      // 05e: aload 4
      // 060: invokevirtual com/finalshell/core/W4_3.R ()Ljava/lang/String;
      // 063: ifnull 07d
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 06c: athrow
      // 06d: aload 4
      // 06f: aload 0
      // 070: invokevirtual com/finalshell/core/B3_2.K ()Lcom/finalshell/core/FU;
      // 073: invokevirtual com/finalshell/core/W4_3.A (Lcom/finalshell/core/FU;)V
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield com/finalshell/core/B3_2.s Ljava/util/List;
      // 081: aload 4
      // 083: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 088: pop
      // 089: aload 1
      // 08a: ifnonnull 03b
      // 08d: aload 0
      // 08e: aload 2
      // 08f: getfield com/finalshell/core/Hz2.B Lcom/finalshell/core/Hz2;
      // 092: putfield com/finalshell/core/B3_2.K Lcom/finalshell/core/Hz2;
      // 095: aload 0
      // 096: aload 2
      // 097: getfield com/finalshell/core/Hz2.e S
      // 09a: putfield com/finalshell/core/B3_2.a S
      // 09d: aload 0
      // 09e: aload 1
      // 09f: ifnull 0b7
      // 0a2: getfield com/finalshell/core/B3_2.K Lcom/finalshell/core/Hz2;
      // 0a5: ifnull 168
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b6: athrow
      // 0b7: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 0ba: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 0bd: astore 3
      // 0be: aload 3
      // 0bf: aload 1
      // 0c0: ifnull 0ce
      // 0c3: ifnull 168
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0cc: athrow
      // 0cd: aload 3
      // 0ce: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 0d1: arraylength
      // 0d2: aload 1
      // 0d3: ifnull 0e1
      // 0d6: ifle 168
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: istore 4
      // 0e3: bipush 0
      // 0e4: istore 5
      // 0e6: aload 3
      // 0e7: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 0ea: astore 6
      // 0ec: aload 6
      // 0ee: arraylength
      // 0ef: istore 7
      // 0f1: bipush 0
      // 0f2: istore 8
      // 0f4: iload 8
      // 0f6: iload 7
      // 0f8: if_icmpge 13a
      // 0fb: aload 6
      // 0fd: iload 8
      // 0ff: aaload
      // 100: astore 9
      // 102: iload 5
      // 104: aload 0
      // 105: getfield com/finalshell/core/B3_2.a S
      // 108: aload 1
      // 109: ifnull 141
      // 10c: aload 1
      // 10d: ifnull 12d
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 116: athrow
      // 117: if_icmplt 124
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 120: athrow
      // 121: goto 13a
      // 124: iload 5
      // 126: aload 9
      // 128: invokeinterface com/finalshell/core/Y2_3.u ()I 1
      // 12d: iadd
      // 12e: istore 5
      // 130: iinc 4 1
      // 133: iinc 8 1
      // 136: aload 1
      // 137: ifnonnull 0f4
      // 13a: aload 3
      // 13b: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 13e: arraylength
      // 13f: iload 4
      // 141: isub
      // 142: istore 6
      // 144: iload 6
      // 146: iinc 6 -1
      // 149: ifle 160
      // 14c: aload 3
      // 14d: invokevirtual com/finalshell/core/FC.t ()Lcom/finalshell/core/FC;
      // 150: astore 3
      // 151: aload 1
      // 152: ifnull 168
      // 155: aload 1
      // 156: ifnonnull 144
      // 159: goto 160
      // 15c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 164: aload 3
      // 165: invokevirtual com/finalshell/core/F9.Z (Lcom/finalshell/core/FC;)V
      // 168: return
   }

   public Cp2_2 g(int param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/B3_2.f Ljava/util/List;
      // 007: invokeinterface java/util/List.size ()I 1
      // 00c: anewarray 206
      // 00f: astore 5
      // 011: astore 4
      // 013: bipush 0
      // 014: istore 6
      // 016: iload 6
      // 018: aload 5
      // 01a: arraylength
      // 01b: if_icmpge 062
      // 01e: aload 0
      // 01f: getfield com/finalshell/core/B3_2.f Ljava/util/List;
      // 022: iload 6
      // 024: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 029: checkcast com/finalshell/core/H1_2
      // 02c: astore 7
      // 02e: aload 5
      // 030: iload 6
      // 032: new com/finalshell/core/C3_4
      // 035: dup
      // 036: aload 7
      // 038: getfield com/finalshell/core/H1_2.z Lcom/finalshell/core/FU;
      // 03b: getfield com/finalshell/core/FU.E I
      // 03e: i2s
      // 03f: aload 7
      // 041: getfield com/finalshell/core/H1_2.P Lcom/finalshell/core/FU;
      // 044: getfield com/finalshell/core/FU.E I
      // 047: i2s
      // 048: aload 7
      // 04a: getfield com/finalshell/core/H1_2.C Lcom/finalshell/core/FU;
      // 04d: getfield com/finalshell/core/FU.E I
      // 050: i2s
      // 051: aload 7
      // 053: getfield com/finalshell/core/H1_2.v S
      // 056: invokespecial com/finalshell/core/C3_4.<init> (SSSS)V
      // 059: aastore
      // 05a: iinc 6 1
      // 05d: aload 4
      // 05f: ifnonnull 016
      // 062: new java/util/ArrayList
      // 065: dup
      // 066: invokespecial java/util/ArrayList.<init> ()V
      // 069: astore 6
      // 06b: iload 2
      // 06c: aload 4
      // 06e: ifnull 08f
      // 071: ifeq 08e
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 07a: athrow
      // 07b: aload 6
      // 07d: aload 0
      // 07e: invokespecial com/finalshell/core/B3_2.f$C5 ()Lcom/finalshell/core/C5_2;
      // 081: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 086: pop
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 08d: athrow
      // 08e: iload 3
      // 08f: aload 4
      // 091: ifnull 0bd
      // 094: ifeq 0ba
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09d: athrow
      // 09e: aload 0
      // 09f: invokevirtual com/finalshell/core/B3_2.i ()Lcom/finalshell/core/Cn2;
      // 0a2: astore 7
      // 0a4: aload 7
      // 0a6: ifnull 0ba
      // 0a9: aload 6
      // 0ab: aload 7
      // 0ad: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b2: pop
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b9: athrow
      // 0ba: getstatic com/finalshell/core/B3_2.E Z
      // 0bd: ifne 0dd
      // 0c0: aload 0
      // 0c1: iload 1
      // 0c2: invokespecial com/finalshell/core/B3_2.H (I)Lcom/finalshell/core/Cm2_3;
      // 0c5: astore 7
      // 0c7: aload 7
      // 0c9: ifnull 0dd
      // 0cc: aload 6
      // 0ce: aload 7
      // 0d0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0d5: pop
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0dc: athrow
      // 0dd: aload 6
      // 0df: aload 6
      // 0e1: invokeinterface java/util/List.size ()I 1
      // 0e6: anewarray 240
      // 0e9: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0ee: checkcast [Lcom/finalshell/core/Y_3;
      // 0f1: astore 7
      // 0f3: new com/finalshell/core/Cp2_2
      // 0f6: dup
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 0fb: sipush -18728
      // 0fe: sipush -24581
      // 101: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 104: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // 107: aload 0
      // 108: getfield com/finalshell/core/B3_2.Q I
      // 10b: i2s
      // 10c: aload 0
      // 10d: getfield com/finalshell/core/B3_2.y S
      // 110: aload 0
      // 111: getfield com/finalshell/core/B3_2.u [B
      // 114: aload 0
      // 115: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 118: getfield com/finalshell/core/F9.E I
      // 11b: invokestatic java/util/Arrays.copyOf ([BI)[B
      // 11e: aload 5
      // 120: aload 7
      // 122: invokespecial com/finalshell/core/Cp2_2.<init> (SSS[B[Lcom/finalshell/core/C3_4;[Lcom/finalshell/core/Y_3;)V
      // 125: areturn
   }

   public C5_2 f$C5() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/B3_2.T Lcom/finalshell/core/FU;
      // 0f: astore 3
      // 10: astore 1
      // 11: aload 3
      // 12: ifnull 80
      // 15: aload 3
      // 16: aload 1
      // 17: ifnull 7b
      // 1a: instanceof com/finalshell/core/F__2
      // 1d: ifeq 77
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 26: athrow
      // 27: aload 3
      // 28: getfield com/finalshell/core/FU.E I
      // 2b: istore 4
      // 2d: iload 4
      // 2f: aload 1
      // 30: ifnull 62
      // 33: sipush 3786
      // 36: ldc2_w 6729682840686002125
      // 39: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 3c: if_icmple 5b
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 45: athrow
      // 46: new com/finalshell/core/P_5
      // 49: dup
      // 4a: sipush -18735
      // 4d: sipush 26637
      // 50: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 53: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 56: athrow
      // 57: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 5a: athrow
      // 5b: aload 3
      // 5c: checkcast com/finalshell/core/F__2
      // 5f: invokestatic com/finalshell/core/F__2.k (Lcom/finalshell/core/F__2;)S
      // 62: istore 5
      // 64: aload 2
      // 65: new com/finalshell/core/F_5
      // 68: dup
      // 69: iload 4
      // 6b: i2s
      // 6c: iload 5
      // 6e: invokespecial com/finalshell/core/F_5.<init> (SS)V
      // 71: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 76: pop
      // 77: aload 3
      // 78: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 7b: astore 3
      // 7c: aload 1
      // 7d: ifnonnull 11
      // 80: aload 2
      // 81: aload 2
      // 82: invokeinterface java/util/List.size ()I 1
      // 87: anewarray 275
      // 8a: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 8f: checkcast [Lcom/finalshell/core/F_5;
      // 92: astore 3
      // 93: new com/finalshell/core/C5_2
      // 96: dup
      // 97: aload 0
      // 98: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 9b: sipush -18721
      // 9e: sipush 32442
      // a1: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // a4: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // a7: aload 3
      // a8: invokespecial com/finalshell/core/C5_2.<init> (S[Lcom/finalshell/core/F_5;)V
      // ab: areturn
   }

   @C_9
   public Cm2_3 H(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/B3_2.T Lcom/finalshell/core/FU;
      // 007: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 00a: astore 3
      // 00b: astore 2
      // 00c: aconst_null
      // 00d: astore 4
      // 00f: aload 3
      // 010: aload 0
      // 011: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 014: if_acmpeq 042
      // 017: aload 3
      // 018: aload 2
      // 019: ifnull 043
      // 01c: aload 2
      // 01d: ifnull 043
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 026: athrow
      // 027: invokestatic com/finalshell/core/FU.M (Lcom/finalshell/core/FU;)Lcom/finalshell/core/FC;
      // 02a: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 02d: arraylength
      // 02e: iload 1
      // 02f: if_icmpge 042
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 038: athrow
      // 039: aload 3
      // 03a: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 03d: astore 3
      // 03e: aload 2
      // 03f: ifnonnull 00f
      // 042: aload 3
      // 043: astore 4
      // 045: aload 3
      // 046: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 049: astore 3
      // 04a: new java/util/ArrayList
      // 04d: dup
      // 04e: invokespecial java/util/ArrayList.<init> ()V
      // 051: astore 5
      // 053: aload 3
      // 054: ifnull 3b6
      // 057: aload 3
      // 058: getfield com/finalshell/core/FU.E I
      // 05b: aload 2
      // 05c: ifnull 3bd
      // 05f: aload 2
      // 060: ifnull 3bd
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 069: athrow
      // 06a: aload 0
      // 06b: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 06e: getfield com/finalshell/core/F9.E I
      // 071: if_icmpeq 3b6
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 07a: athrow
      // 07b: aload 3
      // 07c: aload 2
      // 07d: ifnull 09f
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 086: athrow
      // 087: instanceof com/finalshell/core/FS_2
      // 08a: ifne 09b
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 093: athrow
      // 094: goto 3ad
      // 097: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09a: athrow
      // 09b: aload 3
      // 09c: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 09f: astore 6
      // 0a1: aload 6
      // 0a3: ifnull 0f0
      // 0a6: aload 6
      // 0a8: aload 2
      // 0a9: ifnull 0f1
      // 0ac: getfield com/finalshell/core/FU.E I
      // 0af: aload 3
      // 0b0: getfield com/finalshell/core/FU.E I
      // 0b3: aload 2
      // 0b4: ifnull 129
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0bd: athrow
      // 0be: if_icmpne 0f0
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c7: athrow
      // 0c8: aload 6
      // 0ca: aload 2
      // 0cb: ifnull 0ea
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d4: athrow
      // 0d5: instanceof com/finalshell/core/FS_2
      // 0d8: ifeq 0e5
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0e1: athrow
      // 0e2: aload 6
      // 0e4: astore 3
      // 0e5: aload 6
      // 0e7: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 0ea: astore 6
      // 0ec: aload 2
      // 0ed: ifnonnull 0a1
      // 0f0: aload 3
      // 0f1: invokevirtual com/finalshell/core/FU.K ()Lcom/finalshell/core/FC;
      // 0f4: ifnonnull 0fe
      // 0f7: goto 3ad
      // 0fa: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0fd: athrow
      // 0fe: aload 5
      // 100: invokeinterface java/util/List.isEmpty ()Z 1
      // 105: aload 2
      // 106: ifnull 128
      // 109: ifeq 11e
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 112: athrow
      // 113: aload 3
      // 114: getfield com/finalshell/core/FU.E I
      // 117: goto 12a
      // 11a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 11d: athrow
      // 11e: aload 3
      // 11f: getfield com/finalshell/core/FU.E I
      // 122: aload 4
      // 124: getfield com/finalshell/core/FU.E I
      // 127: isub
      // 128: bipush 1
      // 129: isub
      // 12a: istore 6
      // 12c: sipush 4741
      // 12f: aload 3
      // 130: invokevirtual com/finalshell/core/FU.K ()Lcom/finalshell/core/FC;
      // 133: invokevirtual com/finalshell/core/FC.N ()[Lcom/finalshell/core/Y2_3;
      // 136: astore 7
      // 138: ldc2_w 3765962884224017321
      // 13b: aload 7
      // 13d: arraylength
      // 13e: istore 8
      // 140: aload 3
      // 141: invokevirtual com/finalshell/core/FU.K ()Lcom/finalshell/core/FC;
      // 144: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 147: astore 9
      // 149: aload 9
      // 14b: arraylength
      // 14c: istore 10
      // 14e: aload 4
      // 150: invokevirtual com/finalshell/core/FU.K ()Lcom/finalshell/core/FC;
      // 153: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 156: astore 11
      // 158: aload 11
      // 15a: arraylength
      // 15b: istore 12
      // 15d: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 160: istore 13
      // 162: iload 8
      // 164: aload 2
      // 165: ifnull 1ef
      // 168: ifne 1e6
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 171: athrow
      // 172: aload 9
      // 174: aload 11
      // 176: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 179: aload 2
      // 17a: ifnull 1ef
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 183: athrow
      // 184: ifeq 1e6
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 18d: athrow
      // 18e: iload 6
      // 190: aload 2
      // 191: ifnull 1e1
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19a: athrow
      // 19b: sipush 19326
      // 19e: ldc2_w 6755752235085970033
      // 1a1: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 1a4: if_icmpgt 1ca
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1ad: athrow
      // 1ae: aload 5
      // 1b0: new com/finalshell/core/CO_2
      // 1b3: dup
      // 1b4: iload 6
      // 1b6: invokespecial com/finalshell/core/CO_2.<init> (I)V
      // 1b9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1be: pop
      // 1bf: aload 2
      // 1c0: ifnonnull 3aa
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1c9: athrow
      // 1ca: aload 5
      // 1cc: new com/finalshell/core/CR_3
      // 1cf: dup
      // 1d0: iload 6
      // 1d2: invokespecial com/finalshell/core/CR_3.<init> (I)V
      // 1d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1e0: athrow
      // 1e1: pop
      // 1e2: aload 2
      // 1e3: ifnonnull 3aa
      // 1e6: iload 8
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1ee: athrow
      // 1ef: aload 2
      // 1f0: ifnull 283
      // 1f3: bipush 1
      // 1f4: if_icmpne 27a
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1fd: athrow
      // 1fe: aload 9
      // 200: aload 11
      // 202: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 205: aload 2
      // 206: ifnull 283
      // 209: goto 210
      // 20c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20f: athrow
      // 210: ifeq 27a
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 219: athrow
      // 21a: iload 6
      // 21c: aload 2
      // 21d: ifnull 275
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 226: athrow
      // 227: sipush 19620
      // 22a: ldc2_w 3924176888564137356
      // 22d: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 230: if_icmpgt 25a
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 239: athrow
      // 23a: aload 5
      // 23c: new com/finalshell/core/Co2
      // 23f: dup
      // 240: iload 6
      // 242: aload 7
      // 244: bipush 0
      // 245: aaload
      // 246: invokespecial com/finalshell/core/Co2.<init> (ILcom/finalshell/core/Y2_3;)V
      // 249: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 24e: pop
      // 24f: aload 2
      // 250: ifnonnull 3aa
      // 253: goto 25a
      // 256: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 259: athrow
      // 25a: aload 5
      // 25c: new com/finalshell/core/Cz2_2
      // 25f: dup
      // 260: iload 6
      // 262: aload 7
      // 264: bipush 0
      // 265: aaload
      // 266: invokespecial com/finalshell/core/Cz2_2.<init> (ILcom/finalshell/core/Y2_3;)V
      // 269: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 26e: goto 275
      // 271: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 274: athrow
      // 275: pop
      // 276: aload 2
      // 277: ifnonnull 3aa
      // 27a: iload 8
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 282: athrow
      // 283: aload 2
      // 284: ifnull 308
      // 287: ifne 2ff
      // 28a: goto 291
      // 28d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 290: athrow
      // 291: iload 12
      // 293: iload 10
      // 295: isub
      // 296: dup
      // 297: istore 13
      // 299: aload 2
      // 29a: ifnull 308
      // 29d: bipush 1
      // 29e: if_icmplt 2ff
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2a7: athrow
      // 2a8: iload 13
      // 2aa: aload 2
      // 2ab: ifnull 308
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2b4: athrow
      // 2b5: bipush 3
      // 2b6: if_icmpgt 2ff
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2bf: athrow
      // 2c0: aload 9
      // 2c2: aload 11
      // 2c4: iload 10
      // 2c6: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 2c9: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 2cc: aload 2
      // 2cd: ifnull 308
      // 2d0: goto 2d7
      // 2d3: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2d6: athrow
      // 2d7: ifeq 2ff
      // 2da: goto 2e1
      // 2dd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2e0: athrow
      // 2e1: aload 5
      // 2e3: new com/finalshell/core/CJ_3
      // 2e6: dup
      // 2e7: iload 6
      // 2e9: iload 13
      // 2eb: invokespecial com/finalshell/core/CJ_3.<init> (II)V
      // 2ee: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2f3: pop
      // 2f4: aload 2
      // 2f5: ifnonnull 3aa
      // 2f8: goto 2ff
      // 2fb: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2fe: athrow
      // 2ff: iload 8
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 307: athrow
      // 308: aload 2
      // 309: ifnull 3a9
      // 30c: ifne 38e
      // 30f: goto 316
      // 312: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 315: athrow
      // 316: iload 10
      // 318: iload 12
      // 31a: isub
      // 31b: dup
      // 31c: istore 13
      // 31e: aload 2
      // 31f: ifnull 3a9
      // 322: bipush 1
      // 323: if_icmplt 38e
      // 326: goto 32d
      // 329: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 32c: athrow
      // 32d: iload 13
      // 32f: aload 2
      // 330: ifnull 3a9
      // 333: goto 33a
      // 336: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 339: athrow
      // 33a: bipush 3
      // 33b: if_icmpgt 38e
      // 33e: goto 345
      // 341: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 344: athrow
      // 345: aload 11
      // 347: aload 9
      // 349: iload 12
      // 34b: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 34e: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 351: aload 2
      // 352: ifnull 3a9
      // 355: goto 35c
      // 358: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 35b: athrow
      // 35c: ifeq 38e
      // 35f: goto 366
      // 362: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 365: athrow
      // 366: aload 5
      // 368: new com/finalshell/core/CQ_2
      // 36b: dup
      // 36c: iload 6
      // 36e: aload 9
      // 370: iload 12
      // 372: iload 10
      // 374: invokestatic java/util/Arrays.copyOfRange ([Ljava/lang/Object;II)[Ljava/lang/Object;
      // 377: checkcast [Lcom/finalshell/core/Y2_3;
      // 37a: invokespecial com/finalshell/core/CQ_2.<init> (I[Lcom/finalshell/core/Y2_3;)V
      // 37d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 382: pop
      // 383: aload 2
      // 384: ifnonnull 3aa
      // 387: goto 38e
      // 38a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 38d: athrow
      // 38e: aload 5
      // 390: new com/finalshell/core/CH_3
      // 393: dup
      // 394: iload 6
      // 396: aload 9
      // 398: aload 7
      // 39a: invokespecial com/finalshell/core/CH_3.<init> (I[Lcom/finalshell/core/Y2_3;[Lcom/finalshell/core/Y2_3;)V
      // 39d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3a2: goto 3a9
      // 3a5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3a8: athrow
      // 3a9: pop
      // 3aa: aload 3
      // 3ab: astore 4
      // 3ad: aload 3
      // 3ae: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 3b1: astore 3
      // 3b2: aload 2
      // 3b3: ifnonnull 053
      // 3b6: aload 5
      // 3b8: invokeinterface java/util/List.isEmpty ()Z 1
      // 3bd: ifeq 3c6
      // 3c0: aconst_null
      // 3c1: areturn
      // 3c2: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3c5: athrow
      // 3c6: new com/finalshell/core/Cm2_3
      // 3c9: dup
      // 3ca: aload 0
      // 3cb: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 3ce: sipush -18730
      // 3d1: sipush 6511
      // 3d4: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 3d7: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // 3da: aload 5
      // 3dc: aload 5
      // 3de: invokeinterface java/util/List.size ()I 1
      // 3e3: anewarray 351
      // 3e6: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 3eb: checkcast [Lcom/finalshell/core/CM_2;
      // 3ee: invokespecial com/finalshell/core/Cm2_3.<init> (S[Lcom/finalshell/core/CM_2;)V
      // 3f1: areturn
   }

   public static Hd2 c(Q4_3 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: instanceof com/finalshell/core/I_2_2
      // 08: ifeq 24
      // 0b: aload 0
      // 0c: checkcast com/finalshell/core/I_2_2
      // 0f: invokeinterface com/finalshell/core/I_2_2.V ()Lcom/finalshell/core/Q4_3; 1
      // 14: astore 0
      // 15: aload 1
      // 16: ifnull 5a
      // 19: aload 1
      // 1a: ifnonnull 04
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 23: athrow
      // 24: getstatic com/finalshell/core/B3_2.g Z
      // 27: aload 1
      // 28: ifnull 4b
      // 2b: ifne 5a
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: ifnull 5b
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 40: athrow
      // 41: instanceof com/finalshell/core/Hd2
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4a: athrow
      // 4b: ifne 5a
      // 4e: new java/lang/AssertionError
      // 51: dup
      // 52: invokespecial java/lang/AssertionError.<init> ()V
      // 55: athrow
      // 56: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 59: athrow
      // 5a: aload 0
      // 5b: checkcast com/finalshell/core/Hd2
      // 5e: areturn
   }

   @C_9
   public Cn2 i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: astore 1
      // 00c: aload 0
      // 00d: invokevirtual com/finalshell/core/B3_2.A ()Ljava/util/List;
      // 010: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 015: astore 3
      // 016: aload 3
      // 017: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01c: ifeq 103
      // 01f: aload 3
      // 020: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 025: checkcast com/finalshell/core/W4_3
      // 028: astore 4
      // 02a: aload 4
      // 02c: invokevirtual com/finalshell/core/W4_3.R ()Ljava/lang/String;
      // 02f: astore 5
      // 031: aload 1
      // 032: ifnull 112
      // 035: aload 5
      // 037: aload 1
      // 038: ifnull 05e
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 041: athrow
      // 042: ifnull 0ff
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 04b: athrow
      // 04c: aload 4
      // 04e: invokevirtual com/finalshell/core/W4_3.F ()Lcom/finalshell/core/Q4_3;
      // 051: invokestatic com/finalshell/core/B3_2.c (Lcom/finalshell/core/Q4_3;)Lcom/finalshell/core/Hd2;
      // 054: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05d: athrow
      // 05e: astore 6
      // 060: aload 0
      // 061: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 064: aload 6
      // 066: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // 069: istore 7
      // 06b: aload 0
      // 06c: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 06f: aload 5
      // 071: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // 074: istore 8
      // 076: aload 4
      // 078: invokevirtual com/finalshell/core/W4_3.X ()Lcom/finalshell/core/FU;
      // 07b: astore 9
      // 07d: aload 4
      // 07f: invokevirtual com/finalshell/core/W4_3.j ()Lcom/finalshell/core/FU;
      // 082: astore 10
      // 084: getstatic com/finalshell/core/B3_2.g Z
      // 087: aload 1
      // 088: ifnull 0b0
      // 08b: ifne 0ad
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 094: athrow
      // 095: aload 9
      // 097: ifnonnull 0ad
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a0: athrow
      // 0a1: new java/lang/AssertionError
      // 0a4: dup
      // 0a5: invokespecial java/lang/AssertionError.<init> ()V
      // 0a8: athrow
      // 0a9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ac: athrow
      // 0ad: getstatic com/finalshell/core/B3_2.g Z
      // 0b0: aload 1
      // 0b1: ifnull 0fe
      // 0b4: ifne 0d6
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0bd: athrow
      // 0be: aload 10
      // 0c0: ifnonnull 0d6
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c9: athrow
      // 0ca: new java/lang/AssertionError
      // 0cd: dup
      // 0ce: invokespecial java/lang/AssertionError.<init> ()V
      // 0d1: athrow
      // 0d2: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d5: athrow
      // 0d6: aload 2
      // 0d7: new com/finalshell/core/F2_3
      // 0da: dup
      // 0db: aload 9
      // 0dd: getfield com/finalshell/core/FU.E I
      // 0e0: i2s
      // 0e1: aload 10
      // 0e3: getfield com/finalshell/core/FU.E I
      // 0e6: aload 9
      // 0e8: getfield com/finalshell/core/FU.E I
      // 0eb: isub
      // 0ec: i2s
      // 0ed: iload 8
      // 0ef: iload 7
      // 0f1: aload 4
      // 0f3: invokevirtual com/finalshell/core/W4_3.w ()S
      // 0f6: invokespecial com/finalshell/core/F2_3.<init> (SSSSS)V
      // 0f9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fe: pop
      // 0ff: aload 1
      // 100: ifnonnull 016
      // 103: aload 2
      // 104: invokeinterface java/util/List.isEmpty ()Z 1
      // 109: ifeq 112
      // 10c: aconst_null
      // 10d: areturn
      // 10e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 111: athrow
      // 112: new com/finalshell/core/Cn2
      // 115: dup
      // 116: aload 0
      // 117: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 11a: sipush -18734
      // 11d: sipush -14002
      // 120: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 123: invokevirtual com/finalshell/core/Cr2_2.H (Ljava/lang/String;)S
      // 126: aload 2
      // 127: aload 2
      // 128: invokeinterface java/util/List.size ()I 1
      // 12d: anewarray 383
      // 130: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 135: checkcast [Lcom/finalshell/core/F2_3;
      // 138: invokespecial com/finalshell/core/Cn2.<init> (S[Lcom/finalshell/core/F2_3;)V
      // 13b: areturn
   }

   public void N() {
      this.f$void();
      this.s();
      this.H();
   }

   public void f$void() {
      String[] var10000 = RG_2.C();
      int var2 = 0;
      String[] var1 = var10000;

      while (var2 < this.W.size()) {
         ((Hq2)this.W.get(var2)).W();
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public void s() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/B3_2.T Lcom/finalshell/core/FU;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 0e: if_acmpeq 6f
      // 11: getstatic com/finalshell/core/B3_2.g Z
      // 14: aload 1
      // 15: ifnull 53
      // 18: ifne 44
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 21: athrow
      // 22: aload 2
      // 23: aload 1
      // 24: ifnull 45
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2d: athrow
      // 2e: ifnonnull 44
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 37: athrow
      // 38: new java/lang/AssertionError
      // 3b: dup
      // 3c: invokespecial java/lang/AssertionError.<init> ()V
      // 3f: athrow
      // 40: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 43: athrow
      // 44: aload 2
      // 45: aload 1
      // 46: ifnull 6a
      // 49: instanceof com/finalshell/core/FL_3
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 52: athrow
      // 53: ifeq 66
      // 56: aload 2
      // 57: checkcast com/finalshell/core/FL_3
      // 5a: invokeinterface com/finalshell/core/FL_3.K ()V 1
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 65: athrow
      // 66: aload 2
      // 67: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 6a: astore 2
      // 6b: aload 1
      // 6c: ifnonnull 09
      // 6f: return
   }

   public void H() {
      String[] var10000 = RG_2.C();
      Iterator var2 = this.W.iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         Hq2 var3 = (Hq2)var2.next();
         var3.i();
         if (var1 == null) {
            break;
         }
      }
   }

   public void V(byte[] var1) {
      String[] var2 = RG_2.C();

      int var10000;
      label22: {
         try {
            var10000 = var1.length;
            if (var2 == null) {
               break label22;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (P_5 var4) {
            throw a(var4);
         }

         var10000 = this.c(var1.length);
      }

      int var3 = var10000;
      System.arraycopy(var1, 0, this.u, var3, var1.length);
   }

   public void J(byte var1) {
      int var2 = this.c(1);
      this.u[var2] = var1;
   }

   public void u(byte var1, byte var2) {
      int var3 = this.c(2);
      this.u[var3++] = var1;
      this.u[var3] = var2;
   }

   public void G(byte var1, byte var2, byte var3) {
      int var4 = this.c(3);
      this.u[var4++] = var1;
      this.u[var4++] = var2;
      this.u[var4] = var3;
   }

   public void r(byte var1, byte var2, byte var3, byte var4) {
      int var5 = this.c(4);
      this.u[var5++] = var1;
      this.u[var5++] = var2;
      this.u[var5++] = var3;
      this.u[var5] = var4;
   }

   public void Z(byte var1, byte var2, byte var3, byte var4, byte var5) {
      int var6 = this.c(5);
      this.u[var6++] = var1;
      this.u[var6++] = var2;
      this.u[var6++] = var3;
      this.u[var6++] = var4;
      this.u[var6] = var5;
   }

   public void W(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 2
      // 004: iload 1
      // 005: bipush -1
      // 006: aload 2
      // 007: ifnull 02a
      // 00a: if_icmpne 015
      // 00d: goto 014
      // 010: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 013: athrow
      // 014: return
      // 015: iload 1
      // 016: aload 2
      // 017: ifnull 036
      // 01a: sipush 3786
      // 01d: ldc2_w 6729682840686002125
      // 020: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 029: athrow
      // 02a: if_icmple 037
      // 02d: sipush 3786
      // 030: ldc2_w 6729682840686002125
      // 033: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 036: istore 1
      // 037: aload 0
      // 038: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 03b: getfield com/finalshell/core/F9.a Lcom/finalshell/core/FU;
      // 03e: astore 3
      // 03f: aload 3
      // 040: aload 0
      // 041: getfield com/finalshell/core/B3_2.T Lcom/finalshell/core/FU;
      // 044: if_acmpeq 0c1
      // 047: getstatic com/finalshell/core/B3_2.g Z
      // 04a: aload 2
      // 04b: ifnull 089
      // 04e: ifne 07a
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 057: athrow
      // 058: aload 3
      // 059: aload 2
      // 05a: ifnull 07b
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 063: athrow
      // 064: ifnonnull 07a
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 06d: athrow
      // 06e: new java/lang/AssertionError
      // 071: dup
      // 072: invokespecial java/lang/AssertionError.<init> ()V
      // 075: athrow
      // 076: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 079: athrow
      // 07a: aload 3
      // 07b: aload 2
      // 07c: ifnull 0bc
      // 07f: instanceof com/finalshell/core/F__2
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 088: athrow
      // 089: ifeq 0b8
      // 08c: aload 3
      // 08d: checkcast com/finalshell/core/F__2
      // 090: aload 2
      // 091: ifnull 0d9
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09a: athrow
      // 09b: invokestatic com/finalshell/core/F__2.k (Lcom/finalshell/core/F__2;)S
      // 09e: sipush 3786
      // 0a1: ldc2_w 6729682840686002125
      // 0a4: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 0a7: iand
      // 0a8: iload 1
      // 0a9: if_icmpne 0c1
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b2: athrow
      // 0b3: return
      // 0b4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b7: athrow
      // 0b8: aload 3
      // 0b9: getfield com/finalshell/core/FU.a Lcom/finalshell/core/FU;
      // 0bc: astore 3
      // 0bd: aload 2
      // 0be: ifnonnull 03f
      // 0c1: new com/finalshell/core/F__2
      // 0c4: dup
      // 0c5: aload 0
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 0ca: getfield com/finalshell/core/F9.E I
      // 0cd: aload 0
      // 0ce: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 0d1: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 0d4: iload 1
      // 0d5: i2s
      // 0d6: invokespecial com/finalshell/core/F__2.<init> (Lcom/finalshell/core/B3_2;ILcom/finalshell/core/FC;S)V
      // 0d9: astore 3
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 0de: getfield com/finalshell/core/F9.a Lcom/finalshell/core/FU;
      // 0e1: astore 4
      // 0e3: aload 2
      // 0e4: ifnull 133
      // 0e7: getstatic com/finalshell/core/B3_2.g Z
      // 0ea: ifne 117
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f3: athrow
      // 0f4: aload 4
      // 0f6: aload 2
      // 0f7: ifnull 127
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 100: athrow
      // 101: ifnonnull 117
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 10a: athrow
      // 10b: new java/lang/AssertionError
      // 10e: dup
      // 10f: invokespecial java/lang/AssertionError.<init> ()V
      // 112: athrow
      // 113: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 116: athrow
      // 117: aload 3
      // 118: aload 4
      // 11a: putfield com/finalshell/core/F__2.a Lcom/finalshell/core/FU;
      // 11d: aload 3
      // 11e: aload 0
      // 11f: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 122: putfield com/finalshell/core/F__2.N Lcom/finalshell/core/FU;
      // 125: aload 4
      // 127: aload 3
      // 128: putfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 12b: aload 0
      // 12c: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 12f: aload 3
      // 130: putfield com/finalshell/core/F9.a Lcom/finalshell/core/FU;
      // 133: return
   }

   public int c(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 007: getfield com/finalshell/core/F9.E I
      // 00a: istore 3
      // 00b: astore 2
      // 00c: iload 1
      // 00d: aload 2
      // 00e: ifnull 01f
      // 011: ifne 01e
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 01a: athrow
      // 01b: goto 1e8
      // 01e: iload 1
      // 01f: aload 2
      // 020: ifnull 0c6
      // 023: ifge 0ab
      // 026: goto 02d
      // 029: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 02c: athrow
      // 02d: getstatic com/finalshell/core/B3_2.g Z
      // 030: aload 2
      // 031: ifnull 046
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 03a: athrow
      // 03b: ifne 05e
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 044: athrow
      // 045: iload 3
      // 046: aload 0
      // 047: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 04a: getfield com/finalshell/core/F9.E I
      // 04d: iload 1
      // 04e: iadd
      // 04f: if_icmple 05e
      // 052: new java/lang/AssertionError
      // 055: dup
      // 056: invokespecial java/lang/AssertionError.<init> ()V
      // 059: athrow
      // 05a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield com/finalshell/core/B3_2.u [B
      // 062: iload 3
      // 063: iload 1
      // 064: isub
      // 065: aload 0
      // 066: getfield com/finalshell/core/B3_2.u [B
      // 069: iload 3
      // 06a: aload 0
      // 06b: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 06e: getfield com/finalshell/core/F9.E I
      // 071: iload 3
      // 072: isub
      // 073: iload 1
      // 074: iadd
      // 075: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 078: aload 0
      // 079: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 07c: getfield com/finalshell/core/F9.N Lcom/finalshell/core/FU;
      // 07f: astore 4
      // 081: aload 4
      // 083: ifnull 0a7
      // 086: aload 4
      // 088: dup
      // 089: getfield com/finalshell/core/FU.E I
      // 08c: iload 1
      // 08d: iadd
      // 08e: putfield com/finalshell/core/FU.E I
      // 091: aload 4
      // 093: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 096: astore 4
      // 098: aload 2
      // 099: ifnull 1e8
      // 09c: aload 2
      // 09d: ifnonnull 081
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a6: athrow
      // 0a7: aload 2
      // 0a8: ifnonnull 1e8
      // 0ab: aload 0
      // 0ac: aload 2
      // 0ad: ifnull 143
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b6: athrow
      // 0b7: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 0ba: getfield com/finalshell/core/F9.E I
      // 0bd: iload 1
      // 0be: iadd
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/B3_2.u [B
      // 0ca: arraylength
      // 0cb: if_icmpgt 13b
      // 0ce: iload 3
      // 0cf: aload 0
      // 0d0: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 0d3: getfield com/finalshell/core/F9.E I
      // 0d6: if_icmpeq 10b
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/core/B3_2.u [B
      // 0e4: iload 3
      // 0e5: aload 0
      // 0e6: getfield com/finalshell/core/B3_2.u [B
      // 0e9: iload 3
      // 0ea: iload 1
      // 0eb: iadd
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 0f0: getfield com/finalshell/core/F9.E I
      // 0f3: iload 3
      // 0f4: isub
      // 0f5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/B3_2.u [B
      // 0fc: iload 3
      // 0fd: iload 3
      // 0fe: iload 1
      // 0ff: iadd
      // 100: bipush 0
      // 101: invokestatic java/util/Arrays.fill ([BIIB)V
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 10f: astore 4
      // 111: aload 4
      // 113: ifnull 137
      // 116: aload 4
      // 118: dup
      // 119: getfield com/finalshell/core/FU.E I
      // 11c: iload 1
      // 11d: iadd
      // 11e: putfield com/finalshell/core/FU.E I
      // 121: aload 4
      // 123: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 126: astore 4
      // 128: aload 2
      // 129: ifnull 1e8
      // 12c: aload 2
      // 12d: ifnonnull 111
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 136: athrow
      // 137: aload 2
      // 138: ifnonnull 1e8
      // 13b: aload 0
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 142: athrow
      // 143: getfield com/finalshell/core/B3_2.u [B
      // 146: astore 4
      // 148: aload 4
      // 14a: arraylength
      // 14b: bipush 2
      // 14c: imul
      // 14d: sipush 24870
      // 150: ldc2_w 4571693983649271851
      // 153: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 156: invokestatic java/lang/Math.min (II)I
      // 159: aload 4
      // 15b: arraylength
      // 15c: iload 1
      // 15d: iadd
      // 15e: invokestatic java/lang/Math.max (II)I
      // 161: istore 5
      // 163: aload 2
      // 164: ifnull 1c7
      // 167: iload 5
      // 169: sipush 3786
      // 16c: ldc2_w 6729682840686002125
      // 16f: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 172: if_icmple 191
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 17b: athrow
      // 17c: new com/finalshell/core/P_5
      // 17f: dup
      // 180: sipush -18723
      // 183: sipush 26487
      // 186: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 189: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 18c: athrow
      // 18d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 190: athrow
      // 191: aload 0
      // 192: iload 5
      // 194: newarray 8
      // 196: putfield com/finalshell/core/B3_2.u [B
      // 199: aload 4
      // 19b: bipush 0
      // 19c: aload 0
      // 19d: getfield com/finalshell/core/B3_2.u [B
      // 1a0: bipush 0
      // 1a1: iload 3
      // 1a2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1a5: aload 4
      // 1a7: iload 3
      // 1a8: aload 0
      // 1a9: getfield com/finalshell/core/B3_2.u [B
      // 1ac: iload 3
      // 1ad: iload 1
      // 1ae: iadd
      // 1af: aload 0
      // 1b0: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 1b3: getfield com/finalshell/core/F9.E I
      // 1b6: iload 3
      // 1b7: isub
      // 1b8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1bb: aload 0
      // 1bc: getfield com/finalshell/core/B3_2.u [B
      // 1bf: iload 3
      // 1c0: iload 3
      // 1c1: iload 1
      // 1c2: iadd
      // 1c3: bipush 0
      // 1c4: invokestatic java/util/Arrays.fill ([BIIB)V
      // 1c7: aload 0
      // 1c8: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 1cb: astore 6
      // 1cd: aload 6
      // 1cf: ifnull 1e8
      // 1d2: aload 6
      // 1d4: dup
      // 1d5: getfield com/finalshell/core/FU.E I
      // 1d8: iload 1
      // 1d9: iadd
      // 1da: putfield com/finalshell/core/FU.E I
      // 1dd: aload 6
      // 1df: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 1e2: astore 6
      // 1e4: aload 2
      // 1e5: ifnonnull 1cd
      // 1e8: iload 3
      // 1e9: ireturn
   }

   public void x(int var1) {
      this.u((byte)(var1 >> a(25819, 5464614299617007086L)), (byte)var1);
   }

   public void o(int param1, FU param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 3
      // 004: getstatic com/finalshell/core/B3_2.g Z
      // 007: aload 3
      // 008: ifnull 03e
      // 00b: ifne 03a
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 014: athrow
      // 015: aload 2
      // 016: instanceof com/finalshell/core/FS_2
      // 019: aload 3
      // 01a: ifnull 03e
      // 01d: goto 024
      // 020: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 023: athrow
      // 024: ifne 03a
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 02d: athrow
      // 02e: new java/lang/AssertionError
      // 031: dup
      // 032: invokespecial java/lang/AssertionError.<init> ()V
      // 035: athrow
      // 036: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 039: athrow
      // 03a: aload 2
      // 03b: getfield com/finalshell/core/FU.E I
      // 03e: aload 3
      // 03f: ifnull 082
      // 042: bipush -1
      // 043: if_icmpne 079
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 04c: athrow
      // 04d: aload 2
      // 04e: invokestatic com/finalshell/core/FU.M (Lcom/finalshell/core/FU;)Lcom/finalshell/core/FC;
      // 051: aload 3
      // 052: ifnull 078
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05b: athrow
      // 05c: ifnonnull 079
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 065: athrow
      // 066: aload 2
      // 067: aload 0
      // 068: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 06b: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 06e: invokestatic com/finalshell/core/FU.a (Lcom/finalshell/core/FU;Lcom/finalshell/core/FC;)Lcom/finalshell/core/FC;
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 077: athrow
      // 078: pop
      // 079: sipush 24964
      // 07c: ldc2_w 7456046783759782064
      // 07f: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 082: istore 4
      // 084: iload 1
      // 085: sipush 15708
      // 088: ldc2_w 12401971989761134
      // 08b: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 08e: aload 3
      // 08f: ifnull 0c5
      // 092: if_icmplt 0b4
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09b: athrow
      // 09c: iload 1
      // 09d: aload 3
      // 09e: ifnull 10c
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a7: athrow
      // 0a8: iload 4
      // 0aa: if_icmple 0f2
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b3: athrow
      // 0b4: iload 1
      // 0b5: sipush 29158
      // 0b8: ldc2_w 8799277412564074701
      // 0bb: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c4: athrow
      // 0c5: aload 3
      // 0c6: ifnull 12a
      // 0c9: if_icmplt 119
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d2: athrow
      // 0d3: iload 1
      // 0d4: sipush 24081
      // 0d7: ldc2_w 8012430321069895456
      // 0da: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 0dd: aload 3
      // 0de: ifnull 12a
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0e7: athrow
      // 0e8: if_icmpgt 119
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/core/B3_2.W Ljava/util/List;
      // 0f6: new com/finalshell/core/HB_2
      // 0f9: dup
      // 0fa: aload 0
      // 0fb: iload 1
      // 0fc: aload 2
      // 0fd: invokespecial com/finalshell/core/HB_2.<init> (Lcom/finalshell/core/B3_2;ILcom/finalshell/core/FU;)V
      // 100: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 10b: athrow
      // 10c: pop
      // 10d: aload 0
      // 10e: iload 1
      // 10f: i2b
      // 110: bipush -1
      // 111: bipush -1
      // 112: invokevirtual com/finalshell/core/B3_2.G (BBB)V
      // 115: aload 3
      // 116: ifnonnull 18d
      // 119: iload 1
      // 11a: sipush 24867
      // 11d: ldc2_w 1267148172816420889
      // 120: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 129: athrow
      // 12a: aload 3
      // 12b: ifnull 154
      // 12e: if_icmplt 180
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 137: athrow
      // 138: iload 1
      // 139: aload 3
      // 13a: ifnull 171
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 143: athrow
      // 144: sipush 19823
      // 147: ldc2_w 3890032974450113614
      // 14a: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 153: athrow
      // 154: if_icmpgt 180
      // 157: aload 0
      // 158: getfield com/finalshell/core/B3_2.W Ljava/util/List;
      // 15b: new com/finalshell/core/HB_2
      // 15e: dup
      // 15f: aload 0
      // 160: iload 1
      // 161: aload 2
      // 162: invokespecial com/finalshell/core/HB_2.<init> (Lcom/finalshell/core/B3_2;ILcom/finalshell/core/FU;)V
      // 165: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 170: athrow
      // 171: pop
      // 172: aload 0
      // 173: iload 1
      // 174: i2b
      // 175: bipush -1
      // 176: bipush -1
      // 177: bipush -1
      // 178: bipush -1
      // 179: invokevirtual com/finalshell/core/B3_2.Z (BBBBB)V
      // 17c: aload 3
      // 17d: ifnonnull 18d
      // 180: new java/lang/AssertionError
      // 183: dup
      // 184: iload 1
      // 185: invokespecial java/lang/AssertionError.<init> (I)V
      // 188: athrow
      // 189: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 18c: athrow
      // 18d: return
   }

   public static int p(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: getstatic com/finalshell/core/B3_2.C Ljava/util/Map;
      // 06: iload 0
      // 07: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f: checkcast java/lang/Integer
      // 12: astore 2
      // 13: astore 1
      // 14: getstatic com/finalshell/core/B3_2.g Z
      // 17: aload 1
      // 18: ifnull 4c
      // 1b: ifne 48
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 24: athrow
      // 25: aload 2
      // 26: aload 1
      // 27: ifnull 49
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 30: athrow
      // 31: ifnonnull 48
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3a: athrow
      // 3b: new java/lang/AssertionError
      // 3e: dup
      // 3f: iload 0
      // 40: invokespecial java/lang/AssertionError.<init> (I)V
      // 43: athrow
      // 44: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 47: athrow
      // 48: aload 2
      // 49: invokevirtual java/lang/Integer.intValue ()I
      // 4c: ireturn
   }

   public static Map r() {
      HashMap var0 = new HashMap();
      var0.put(a(28286, 1694517094046506870L), a(25529, 6786410929240117889L));
      var0.put(a(15783, 385398119192054939L), a(12593, 5486563397254660148L));
      var0.put(a(32669, 2947257911526690487L), a(10910, 4667802162400746414L));
      var0.put(a(14129, 3550633297700046348L), a(31237, 1269628652503337788L));
      var0.put(a(13485, 1564189152486442370L), a(6458, 494907735649904641L));
      var0.put(a(6280, 8579491862736955814L), a(28984, 8397456722199740447L));
      var0.put(a(17548, 2832681891326899624L), a(28687, 8130791515999437100L));
      var0.put(a(1706, 4714003923538409382L), a(31338, 5337688926018964313L));
      var0.put(a(10417, 5833031986315221404L), a(27375, 5136211086152997848L));
      var0.put(a(28099, 1176842695550606581L), a(15708, 12401971989761134L));
      var0.put(a(18225, 5699729545711466007L), a(24644, 5695844000529355105L));
      var0.put(a(2759, 3972955591320468430L), a(5925, 4048302974673839623L));
      var0.put(a(25847, 5308157402096244211L), a(25536, 795500570695176907L));
      var0.put(a(27772, 79149179994217846L), a(1286, 8775213777430934566L));
      var0.put(a(28046, 8333281358796037287L), a(6482, 2215729705439291501L));
      var0.put(a(24081, 8012430321069895456L), a(29158, 8799277412564074701L));
      return Collections.unmodifiableMap(var0);
   }

   public void B(FU var1, FU var2) {
      FT_2 var3 = new FT_2(this, null);
      var3.R();
      this.W.add(new HD(this, var3, var1, var2));
      this.c(4);
   }

   public FU K() {
      FU var1 = new FU(this);
      var1.R();
      return var1;
   }

   public FU d$fU() {
      FS_2 var1 = new FS_2(this);
      var1.R();
      return var1;
   }

   public F9 F$f9() {
      F9 var1 = new F9(this);
      var1.R();
      return var1;
   }

   public F9 G$f9() {
      return this.Z;
   }

   public void j(F9 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 07: pop
      // 08: astore 2
      // 09: aload 1
      // 0a: invokestatic com/finalshell/core/F9.t (Lcom/finalshell/core/F9;)Lcom/finalshell/core/F9;
      // 0d: aload 2
      // 0e: ifnull 38
      // 11: ifnull 30
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a: athrow
      // 1b: new com/finalshell/core/P_5
      // 1e: dup
      // 1f: sipush -18731
      // 22: sipush 10485
      // 25: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 28: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2f: athrow
      // 30: aload 1
      // 31: aload 0
      // 32: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 35: invokestatic com/finalshell/core/F9.c (Lcom/finalshell/core/F9;Lcom/finalshell/core/F9;)Lcom/finalshell/core/F9;
      // 38: pop
      // 39: aload 0
      // 3a: aload 1
      // 3b: putfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 3e: return
   }

   public void Y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 07: invokestatic com/finalshell/core/F9.t (Lcom/finalshell/core/F9;)Lcom/finalshell/core/F9;
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 2
      // 0d: aload 1
      // 0e: ifnull 3d
      // 11: ifnonnull 30
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a: athrow
      // 1b: new com/finalshell/core/P_5
      // 1e: dup
      // 1f: sipush -18722
      // 22: sipush 28619
      // 25: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 28: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2f: athrow
      // 30: aload 2
      // 31: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 34: pop
      // 35: aload 0
      // 36: getfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 39: aconst_null
      // 3a: invokestatic com/finalshell/core/F9.c (Lcom/finalshell/core/F9;Lcom/finalshell/core/F9;)Lcom/finalshell/core/F9;
      // 3d: pop
      // 3e: aload 0
      // 3f: aload 2
      // 40: putfield com/finalshell/core/B3_2.Z Lcom/finalshell/core/F9;
      // 43: return
   }

   @C_9
   public static final FC r(@C_9 FC param0, @C_9 FC param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 012: athrow
      // 013: aload 1
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 018: athrow
      // 019: aload 1
      // 01a: aload 2
      // 01b: ifnull 02f
      // 01e: ifnonnull 02e
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 027: athrow
      // 028: aload 0
      // 029: areturn
      // 02a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 02d: athrow
      // 02e: aload 0
      // 02f: aload 1
      // 030: aload 2
      // 031: ifnull 046
      // 034: if_acmpne 044
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 03d: athrow
      // 03e: aload 0
      // 03f: areturn
      // 040: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 043: athrow
      // 044: aload 0
      // 045: aload 1
      // 046: invokevirtual com/finalshell/core/FC.equals (Ljava/lang/Object;)Z
      // 049: aload 2
      // 04a: ifnull 073
      // 04d: ifeq 05d
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 056: athrow
      // 057: aload 0
      // 058: areturn
      // 059: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05c: athrow
      // 05d: aload 0
      // 05e: invokevirtual com/finalshell/core/FC.N ()[Lcom/finalshell/core/Y2_3;
      // 061: aload 2
      // 062: ifnull 0b0
      // 065: aload 1
      // 066: invokevirtual com/finalshell/core/FC.N ()[Lcom/finalshell/core/Y2_3;
      // 069: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 072: athrow
      // 073: ifne 0ac
      // 076: new com/finalshell/core/P_5
      // 079: dup
      // 07a: new java/lang/StringBuilder
      // 07d: dup
      // 07e: invokespecial java/lang/StringBuilder.<init> ()V
      // 081: sipush -18733
      // 084: sipush 18201
      // 087: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: aload 0
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 091: sipush -18729
      // 094: sipush 4943
      // 097: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: aload 1
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a4: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 0a7: athrow
      // 0a8: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 0b0: astore 3
      // 0b1: aload 1
      // 0b2: invokevirtual com/finalshell/core/FC.u ()[Lcom/finalshell/core/Y2_3;
      // 0b5: astore 4
      // 0b7: new java/util/ArrayList
      // 0ba: dup
      // 0bb: invokespecial java/util/ArrayList.<init> ()V
      // 0be: astore 5
      // 0c0: bipush 0
      // 0c1: istore 6
      // 0c3: bipush 0
      // 0c4: istore 7
      // 0c6: iload 6
      // 0c8: aload 3
      // 0c9: arraylength
      // 0ca: if_icmpge 280
      // 0cd: iload 7
      // 0cf: aload 4
      // 0d1: arraylength
      // 0d2: if_icmpge 280
      // 0d5: aload 3
      // 0d6: iload 6
      // 0d8: iinc 6 1
      // 0db: aaload
      // 0dc: astore 8
      // 0de: aload 4
      // 0e0: iload 7
      // 0e2: iinc 7 1
      // 0e5: aaload
      // 0e6: astore 9
      // 0e8: aload 8
      // 0ea: aload 9
      // 0ec: aload 2
      // 0ed: ifnull 11e
      // 0f0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0f3: ifeq 112
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0fc: athrow
      // 0fd: aload 5
      // 0ff: aload 8
      // 101: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 106: pop
      // 107: aload 2
      // 108: ifnonnull 27c
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 111: athrow
      // 112: aload 8
      // 114: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 11d: athrow
      // 11e: aload 2
      // 11f: ifnull 1dd
      // 122: if_acmpne 1c6
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 12b: athrow
      // 12c: aload 9
      // 12e: aload 2
      // 12f: ifnull 1cf
      // 132: goto 139
      // 135: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 138: athrow
      // 139: invokeinterface com/finalshell/core/Y2_3.u ()I 1
      // 13e: bipush 2
      // 13f: if_icmpne 1c6
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 148: athrow
      // 149: getstatic com/finalshell/core/B3_2.g Z
      // 14c: aload 2
      // 14d: ifnull 189
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 156: athrow
      // 157: ifne 186
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 160: athrow
      // 161: iload 6
      // 163: aload 2
      // 164: ifnull 189
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 16d: athrow
      // 16e: aload 3
      // 16f: arraylength
      // 170: if_icmplt 186
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 179: athrow
      // 17a: new java/lang/AssertionError
      // 17d: dup
      // 17e: invokespecial java/lang/AssertionError.<init> ()V
      // 181: athrow
      // 182: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 185: athrow
      // 186: getstatic com/finalshell/core/B3_2.g Z
      // 189: aload 2
      // 18a: ifnull 1c1
      // 18d: ifne 1b4
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 196: athrow
      // 197: aload 3
      // 198: iload 6
      // 19a: aaload
      // 19b: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 19e: if_acmpeq 1b4
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a7: athrow
      // 1a8: new java/lang/AssertionError
      // 1ab: dup
      // 1ac: invokespecial java/lang/AssertionError.<init> ()V
      // 1af: athrow
      // 1b0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1b3: athrow
      // 1b4: iinc 6 1
      // 1b7: aload 5
      // 1b9: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 1bc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1c1: pop
      // 1c2: aload 2
      // 1c3: ifnonnull 271
      // 1c6: aload 9
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1ce: athrow
      // 1cf: aload 2
      // 1d0: ifnull 1e2
      // 1d3: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 1d6: goto 1dd
      // 1d9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1dc: athrow
      // 1dd: if_acmpne 271
      // 1e0: aload 8
      // 1e2: invokeinterface com/finalshell/core/Y2_3.u ()I 1
      // 1e7: aload 2
      // 1e8: ifnull 27b
      // 1eb: bipush 2
      // 1ec: if_icmpne 271
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1f5: athrow
      // 1f6: getstatic com/finalshell/core/B3_2.g Z
      // 1f9: aload 2
      // 1fa: ifnull 237
      // 1fd: goto 204
      // 200: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 203: athrow
      // 204: ifne 234
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20d: athrow
      // 20e: iload 7
      // 210: aload 2
      // 211: ifnull 237
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 21a: athrow
      // 21b: aload 4
      // 21d: arraylength
      // 21e: if_icmplt 234
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 227: athrow
      // 228: new java/lang/AssertionError
      // 22b: dup
      // 22c: invokespecial java/lang/AssertionError.<init> ()V
      // 22f: athrow
      // 230: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 233: athrow
      // 234: getstatic com/finalshell/core/B3_2.g Z
      // 237: aload 2
      // 238: ifnull 270
      // 23b: ifne 263
      // 23e: goto 245
      // 241: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 244: athrow
      // 245: aload 4
      // 247: iload 7
      // 249: aaload
      // 24a: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 24d: if_acmpeq 263
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 256: athrow
      // 257: new java/lang/AssertionError
      // 25a: dup
      // 25b: invokespecial java/lang/AssertionError.<init> ()V
      // 25e: athrow
      // 25f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 262: athrow
      // 263: iinc 7 1
      // 266: aload 5
      // 268: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 26b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 270: pop
      // 271: aload 5
      // 273: getstatic com/finalshell/core/Cm2_3.i Lcom/finalshell/core/Y2_3;
      // 276: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27b: pop
      // 27c: aload 2
      // 27d: ifnonnull 0c6
      // 280: new com/finalshell/core/FC
      // 283: dup
      // 284: aload 5
      // 286: aload 5
      // 288: invokeinterface java/util/List.size ()I 1
      // 28d: anewarray 83
      // 290: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 295: checkcast [Lcom/finalshell/core/Y2_3;
      // 298: aload 0
      // 299: invokevirtual com/finalshell/core/FC.N ()[Lcom/finalshell/core/Y2_3;
      // 29c: invokespecial com/finalshell/core/FC.<init> ([Lcom/finalshell/core/Y2_3;[Lcom/finalshell/core/Y2_3;)V
      // 29f: areturn
   }

   public void j(FU var1, FU var2, FU var3, @C_9 String var4) {
      List var10000;
      H1_2 var10001;
      H1_2 var10002;
      FU var10003;
      FU var10004;
      FU var10005;
      short var10006;
      label16: {
         try {
            var10000 = this.f;
            var10001 = null;
            var10002 = var10001;
            var10003 = var1;
            var10004 = var2;
            var10005 = var3;
            if (var4 == null) {
               var10006 = 0;
               break label16;
            }
         } catch (P_5 var5) {
            throw a(var5);
         }

         var10006 = this.P.X$short(var4);
      }

      var10002 = new H1_2(var10003, var10004, var10005, var10006);
      var10000.add(var10001);
   }

   public List A() {
      return this.s;
   }

   public void n(FU param1, FU param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 01a
      // 009: aload 2
      // 00a: if_acmpne 019
      // 00d: goto 014
      // 010: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 013: athrow
      // 014: return
      // 015: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 018: athrow
      // 019: aload 2
      // 01a: getfield com/finalshell/core/FU.E I
      // 01d: aload 1
      // 01e: getfield com/finalshell/core/FU.E I
      // 021: isub
      // 022: istore 4
      // 024: getstatic com/finalshell/core/B3_2.g Z
      // 027: aload 3
      // 028: ifnull 05a
      // 02b: ifne 058
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 034: athrow
      // 035: iload 4
      // 037: aload 3
      // 038: ifnull 05a
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 041: athrow
      // 042: ifge 058
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 04b: athrow
      // 04c: new java/lang/AssertionError
      // 04f: dup
      // 050: invokespecial java/lang/AssertionError.<init> ()V
      // 053: athrow
      // 054: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 057: athrow
      // 058: iload 4
      // 05a: ifne 05e
      // 05d: return
      // 05e: aload 0
      // 05f: getfield com/finalshell/core/B3_2.u [B
      // 062: aload 2
      // 063: getfield com/finalshell/core/FU.E I
      // 066: aload 0
      // 067: getfield com/finalshell/core/B3_2.u [B
      // 06a: aload 1
      // 06b: getfield com/finalshell/core/FU.E I
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 072: getfield com/finalshell/core/F9.E I
      // 075: aload 2
      // 076: getfield com/finalshell/core/FU.E I
      // 079: isub
      // 07a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 07d: new java/util/HashSet
      // 080: dup
      // 081: invokespecial java/util/HashSet.<init> ()V
      // 084: astore 5
      // 086: aload 1
      // 087: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 08a: astore 6
      // 08c: getstatic com/finalshell/core/B3_2.g Z
      // 08f: ifne 0b5
      // 092: aload 6
      // 094: aload 3
      // 095: ifnull 0b7
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09e: athrow
      // 09f: ifnonnull 0b5
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a8: athrow
      // 0a9: new java/lang/AssertionError
      // 0ac: dup
      // 0ad: invokespecial java/lang/AssertionError.<init> ()V
      // 0b0: athrow
      // 0b1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b4: athrow
      // 0b5: aload 6
      // 0b7: aload 2
      // 0b8: if_acmpeq 156
      // 0bb: getstatic com/finalshell/core/B3_2.g Z
      // 0be: aload 3
      // 0bf: ifnull 17c
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c8: athrow
      // 0c9: aload 3
      // 0ca: ifnull 10a
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d3: athrow
      // 0d4: ifne 101
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0dd: athrow
      // 0de: aload 6
      // 0e0: aload 3
      // 0e1: ifnull 110
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ea: athrow
      // 0eb: ifnonnull 101
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f4: athrow
      // 0f5: new java/lang/AssertionError
      // 0f8: dup
      // 0f9: invokespecial java/lang/AssertionError.<init> ()V
      // 0fc: athrow
      // 0fd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 100: athrow
      // 101: aload 5
      // 103: aload 6
      // 105: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 10a: pop
      // 10b: aload 6
      // 10d: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 110: astore 7
      // 112: aload 6
      // 114: sipush 25013
      // 117: ldc2_w 7208462459066388619
      // 11a: invokestatic com/finalshell/core/B3_2.a (IJ)I
      // 11d: putfield com/finalshell/core/FU.E I
      // 120: aload 6
      // 122: aconst_null
      // 123: putfield com/finalshell/core/FU.a Lcom/finalshell/core/FU;
      // 126: aload 6
      // 128: aconst_null
      // 129: putfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 12c: aload 7
      // 12e: aload 3
      // 12f: ifnull 143
      // 132: astore 6
      // 134: getstatic com/finalshell/core/B3_2.g Z
      // 137: ifne 152
      // 13a: aload 6
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 142: athrow
      // 143: ifnonnull 152
      // 146: new java/lang/AssertionError
      // 149: dup
      // 14a: invokespecial java/lang/AssertionError.<init> ()V
      // 14d: athrow
      // 14e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 151: athrow
      // 152: aload 3
      // 153: ifnonnull 0b5
      // 156: aload 6
      // 158: dup
      // 159: getfield com/finalshell/core/FU.E I
      // 15c: iload 4
      // 15e: isub
      // 15f: putfield com/finalshell/core/FU.E I
      // 162: aload 6
      // 164: aload 0
      // 165: getfield com/finalshell/core/B3_2.H Lcom/finalshell/core/F9;
      // 168: if_acmpne 16e
      // 16b: goto 18c
      // 16e: aload 6
      // 170: getfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 173: aload 3
      // 174: ifnull 181
      // 177: astore 6
      // 179: getstatic com/finalshell/core/B3_2.g Z
      // 17c: ifne 156
      // 17f: aload 6
      // 181: ifnonnull 156
      // 184: new java/lang/AssertionError
      // 187: dup
      // 188: invokespecial java/lang/AssertionError.<init> ()V
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield com/finalshell/core/B3_2.W Ljava/util/List;
      // 190: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 195: astore 6
      // 197: aload 6
      // 199: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19e: ifeq 2c7
      // 1a1: aload 6
      // 1a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a8: checkcast com/finalshell/core/Hq2
      // 1ab: astore 7
      // 1ad: aload 7
      // 1af: instanceof com/finalshell/core/HB_2
      // 1b2: aload 3
      // 1b3: ifnull 2d9
      // 1b6: aload 3
      // 1b7: ifnull 253
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1c0: athrow
      // 1c1: ifeq 243
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1ca: athrow
      // 1cb: aload 7
      // 1cd: checkcast com/finalshell/core/HB_2
      // 1d0: astore 8
      // 1d2: aload 5
      // 1d4: aload 8
      // 1d6: invokestatic com/finalshell/core/HB_2.F (Lcom/finalshell/core/HB_2;)Lcom/finalshell/core/F9;
      // 1d9: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 1de: aload 3
      // 1df: ifnull 208
      // 1e2: ifeq 1fe
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1eb: athrow
      // 1ec: aload 6
      // 1ee: invokeinterface java/util/Iterator.remove ()V 1
      // 1f3: aload 3
      // 1f4: ifnonnull 243
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1fd: athrow
      // 1fe: getstatic com/finalshell/core/B3_2.g Z
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 207: athrow
      // 208: aload 3
      // 209: ifnull 253
      // 20c: ifne 243
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 215: athrow
      // 216: aload 5
      // 218: aload 8
      // 21a: invokestatic com/finalshell/core/HB_2.y (Lcom/finalshell/core/HB_2;)Lcom/finalshell/core/FU;
      // 21d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 222: aload 3
      // 223: ifnull 253
      // 226: goto 22d
      // 229: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 22c: athrow
      // 22d: ifeq 243
      // 230: goto 237
      // 233: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 236: athrow
      // 237: new java/lang/AssertionError
      // 23a: dup
      // 23b: invokespecial java/lang/AssertionError.<init> ()V
      // 23e: athrow
      // 23f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 242: athrow
      // 243: aload 7
      // 245: aload 3
      // 246: ifnull 258
      // 249: instanceof com/finalshell/core/HD
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 252: athrow
      // 253: ifeq 2c3
      // 256: aload 7
      // 258: checkcast com/finalshell/core/HD
      // 25b: astore 8
      // 25d: aload 5
      // 25f: aload 8
      // 261: invokestatic com/finalshell/core/HD.E (Lcom/finalshell/core/HD;)Lcom/finalshell/core/FU;
      // 264: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 269: aload 3
      // 26a: ifnull 293
      // 26d: ifeq 289
      // 270: goto 277
      // 273: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 276: athrow
      // 277: aload 6
      // 279: invokeinterface java/util/Iterator.remove ()V 1
      // 27e: aload 3
      // 27f: ifnonnull 2c3
      // 282: goto 289
      // 285: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 288: athrow
      // 289: getstatic com/finalshell/core/B3_2.g Z
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 292: athrow
      // 293: aload 3
      // 294: ifnull 2b4
      // 297: ifne 2c3
      // 29a: goto 2a1
      // 29d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2a0: athrow
      // 2a1: aload 5
      // 2a3: aload 8
      // 2a5: invokestatic com/finalshell/core/HD.T (Lcom/finalshell/core/HD;)Lcom/finalshell/core/FU;
      // 2a8: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 2ad: goto 2b4
      // 2b0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2b3: athrow
      // 2b4: ifeq 2c3
      // 2b7: new java/lang/AssertionError
      // 2ba: dup
      // 2bb: invokespecial java/lang/AssertionError.<init> ()V
      // 2be: athrow
      // 2bf: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2c2: athrow
      // 2c3: aload 3
      // 2c4: ifnonnull 197
      // 2c7: aload 0
      // 2c8: getfield com/finalshell/core/B3_2.f Ljava/util/List;
      // 2cb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d0: astore 6
      // 2d2: aload 6
      // 2d4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d9: ifeq 40c
      // 2dc: aload 6
      // 2de: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e3: checkcast com/finalshell/core/H1_2
      // 2e6: astore 7
      // 2e8: aload 5
      // 2ea: aload 7
      // 2ec: getfield com/finalshell/core/H1_2.z Lcom/finalshell/core/FU;
      // 2ef: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 2f4: aload 3
      // 2f5: ifnull 41e
      // 2f8: aload 3
      // 2f9: ifnull 39a
      // 2fc: goto 303
      // 2ff: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 302: athrow
      // 303: ifeq 390
      // 306: goto 30d
      // 309: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 30c: athrow
      // 30d: getstatic com/finalshell/core/B3_2.g Z
      // 310: aload 3
      // 311: ifnull 355
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 31a: athrow
      // 31b: ifne 352
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 324: athrow
      // 325: aload 5
      // 327: aload 7
      // 329: getfield com/finalshell/core/H1_2.P Lcom/finalshell/core/FU;
      // 32c: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 331: aload 3
      // 332: ifnull 355
      // 335: goto 33c
      // 338: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 33b: athrow
      // 33c: ifne 352
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 345: athrow
      // 346: new java/lang/AssertionError
      // 349: dup
      // 34a: invokespecial java/lang/AssertionError.<init> ()V
      // 34d: athrow
      // 34e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 351: athrow
      // 352: getstatic com/finalshell/core/B3_2.g Z
      // 355: aload 3
      // 356: ifnull 376
      // 359: ifne 385
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 362: athrow
      // 363: aload 5
      // 365: aload 7
      // 367: getfield com/finalshell/core/H1_2.C Lcom/finalshell/core/FU;
      // 36a: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 375: athrow
      // 376: ifne 385
      // 379: new java/lang/AssertionError
      // 37c: dup
      // 37d: invokespecial java/lang/AssertionError.<init> ()V
      // 380: athrow
      // 381: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 384: athrow
      // 385: aload 6
      // 387: invokeinterface java/util/Iterator.remove ()V 1
      // 38c: aload 3
      // 38d: ifnonnull 408
      // 390: getstatic com/finalshell/core/B3_2.g Z
      // 393: goto 39a
      // 396: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 399: athrow
      // 39a: aload 3
      // 39b: ifnull 3d8
      // 39e: ifne 3d5
      // 3a1: goto 3a8
      // 3a4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3a7: athrow
      // 3a8: aload 5
      // 3aa: aload 7
      // 3ac: getfield com/finalshell/core/H1_2.P Lcom/finalshell/core/FU;
      // 3af: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3b4: aload 3
      // 3b5: ifnull 3d8
      // 3b8: goto 3bf
      // 3bb: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3be: athrow
      // 3bf: ifeq 3d5
      // 3c2: goto 3c9
      // 3c5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3c8: athrow
      // 3c9: new java/lang/AssertionError
      // 3cc: dup
      // 3cd: invokespecial java/lang/AssertionError.<init> ()V
      // 3d0: athrow
      // 3d1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3d4: athrow
      // 3d5: getstatic com/finalshell/core/B3_2.g Z
      // 3d8: aload 3
      // 3d9: ifnull 3f9
      // 3dc: ifne 408
      // 3df: goto 3e6
      // 3e2: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3e5: athrow
      // 3e6: aload 5
      // 3e8: aload 7
      // 3ea: getfield com/finalshell/core/H1_2.C Lcom/finalshell/core/FU;
      // 3ed: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3f2: goto 3f9
      // 3f5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3f8: athrow
      // 3f9: ifeq 408
      // 3fc: new java/lang/AssertionError
      // 3ff: dup
      // 400: invokespecial java/lang/AssertionError.<init> ()V
      // 403: athrow
      // 404: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 407: athrow
      // 408: aload 3
      // 409: ifnonnull 2d2
      // 40c: aload 0
      // 40d: getfield com/finalshell/core/B3_2.s Ljava/util/List;
      // 410: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 415: astore 6
      // 417: aload 6
      // 419: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 41e: ifeq 4d5
      // 421: aload 6
      // 423: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 428: checkcast com/finalshell/core/W4_3
      // 42b: astore 7
      // 42d: aload 3
      // 42e: ifnull 4df
      // 431: aload 5
      // 433: aload 7
      // 435: invokevirtual com/finalshell/core/W4_3.X ()Lcom/finalshell/core/FU;
      // 438: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 43d: aload 3
      // 43e: ifnull 4a1
      // 441: goto 448
      // 444: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 447: athrow
      // 448: ifeq 497
      // 44b: goto 452
      // 44e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 451: athrow
      // 452: getstatic com/finalshell/core/B3_2.g Z
      // 455: aload 3
      // 456: ifnull 47d
      // 459: goto 460
      // 45c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 45f: athrow
      // 460: ifne 48c
      // 463: goto 46a
      // 466: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 469: athrow
      // 46a: aload 5
      // 46c: aload 7
      // 46e: invokevirtual com/finalshell/core/W4_3.j ()Lcom/finalshell/core/FU;
      // 471: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 476: goto 47d
      // 479: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 47c: athrow
      // 47d: ifne 48c
      // 480: new java/lang/AssertionError
      // 483: dup
      // 484: invokespecial java/lang/AssertionError.<init> ()V
      // 487: athrow
      // 488: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 48b: athrow
      // 48c: aload 6
      // 48e: invokeinterface java/util/Iterator.remove ()V 1
      // 493: aload 3
      // 494: ifnonnull 4d1
      // 497: getstatic com/finalshell/core/B3_2.g Z
      // 49a: goto 4a1
      // 49d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4a0: athrow
      // 4a1: aload 3
      // 4a2: ifnull 4c2
      // 4a5: ifne 4d1
      // 4a8: goto 4af
      // 4ab: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4ae: athrow
      // 4af: aload 5
      // 4b1: aload 7
      // 4b3: invokevirtual com/finalshell/core/W4_3.j ()Lcom/finalshell/core/FU;
      // 4b6: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4c1: athrow
      // 4c2: ifeq 4d1
      // 4c5: new java/lang/AssertionError
      // 4c8: dup
      // 4c9: invokespecial java/lang/AssertionError.<init> ()V
      // 4cc: athrow
      // 4cd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4d0: athrow
      // 4d1: aload 3
      // 4d2: ifnonnull 417
      // 4d5: aload 1
      // 4d6: aload 2
      // 4d7: putfield com/finalshell/core/FU.N Lcom/finalshell/core/FU;
      // 4da: aload 2
      // 4db: aload 1
      // 4dc: putfield com/finalshell/core/FU.a Lcom/finalshell/core/FU;
      // 4df: return
   }

   @Override
   public String toString() {
      return this.P.t() + a(-18732, 27611) + this.Z.E;
   }

   public void R(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: invokestatic com/finalshell/core/F0_2.e$boolean (Ljava/lang/String;)Z
      // 008: aload 2
      // 009: ifnull 034
      // 00c: ifeq 026
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 015: athrow
      // 016: aload 0
      // 017: aload 1
      // 018: invokevirtual com/finalshell/core/B3_2.S (Ljava/lang/String;)V
      // 01b: aload 2
      // 01c: ifnonnull 144
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 025: athrow
      // 026: aload 1
      // 027: ldc_w "B"
      // 02a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 033: athrow
      // 034: aload 2
      // 035: ifnull 050
      // 038: ifne 0b2
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 041: athrow
      // 042: aload 1
      // 043: ldc_w "C"
      // 046: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 04f: athrow
      // 050: aload 2
      // 051: ifnull 06c
      // 054: ifne 0b2
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05d: athrow
      // 05e: aload 1
      // 05f: ldc_w "I"
      // 062: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 06b: athrow
      // 06c: aload 2
      // 06d: ifnull 088
      // 070: ifne 0b2
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 079: athrow
      // 07a: aload 1
      // 07b: ldc_w "S"
      // 07e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 087: athrow
      // 088: aload 2
      // 089: ifnull 0a4
      // 08c: ifne 0b2
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 095: athrow
      // 096: aload 1
      // 097: ldc_w "Z"
      // 09a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a3: athrow
      // 0a4: aload 2
      // 0a5: ifnull 0cf
      // 0a8: ifeq 0c1
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: invokevirtual com/finalshell/core/B3_2.T$void ()V
      // 0b6: aload 2
      // 0b7: ifnonnull 144
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c0: athrow
      // 0c1: aload 1
      // 0c2: ldc_w "D"
      // 0c5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: ifnull 0fa
      // 0d3: ifeq 0ec
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: invokevirtual com/finalshell/core/B3_2.y ()V
      // 0e1: aload 2
      // 0e2: ifnonnull 144
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0eb: athrow
      // 0ec: aload 1
      // 0ed: ldc_w "F"
      // 0f0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f9: athrow
      // 0fa: aload 2
      // 0fb: ifnull 125
      // 0fe: ifeq 117
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 107: athrow
      // 108: aload 0
      // 109: invokevirtual com/finalshell/core/B3_2.d$void ()V
      // 10c: aload 2
      // 10d: ifnonnull 144
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 116: athrow
      // 117: aload 1
      // 118: ldc_w "J"
      // 11b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 124: athrow
      // 125: ifeq 137
      // 128: aload 0
      // 129: invokevirtual com/finalshell/core/B3_2.j ()V
      // 12c: aload 2
      // 12d: ifnonnull 144
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 136: athrow
      // 137: new java/lang/AssertionError
      // 13a: dup
      // 13b: aload 1
      // 13c: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 13f: athrow
      // 140: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 143: athrow
      // 144: return
   }

   public void B() {
      this.K(Cm2_3.i);
   }

   public void T$void() {
      this.K(Cm2_3.I);
   }

   public void j() {
      this.K(Cm2_3.V);
   }

   public void d$void() {
      this.K(Cm2_3.Q);
   }

   public void y() {
      this.K(Cm2_3.n);
   }

   public void M$void() {
      this.K(Cm2_3.Y);
   }

   public void t() {
      this.K(Cm2_3.e);
   }

   public void z() {
      FU var1 = this.K();
      Ca2_2 var2 = this.P.u((short)var1.E);
      this.W.add(new Hh2_2(this, var2, var1));
      this.K(var2);
   }

   public void S(String var1) {
      this.K(this.P.M(var1));
   }

   public void K(Y2_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.G$f9 ()Lcom/finalshell/core/F9;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 0d: astore 4
      // 0f: getstatic com/finalshell/core/B3_2.g Z
      // 12: aload 2
      // 13: ifnull 52
      // 16: ifne 43
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1f: athrow
      // 20: aload 4
      // 22: aload 2
      // 23: ifnull 49
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2c: athrow
      // 2d: ifnonnull 43
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 36: athrow
      // 37: new java/lang/AssertionError
      // 3a: dup
      // 3b: invokespecial java/lang/AssertionError.<init> ()V
      // 3e: athrow
      // 3f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 42: athrow
      // 43: aload 4
      // 45: aload 1
      // 46: invokevirtual com/finalshell/core/FC.x (Lcom/finalshell/core/Y2_3;)Lcom/finalshell/core/FC;
      // 49: astore 4
      // 4b: aload 3
      // 4c: aload 4
      // 4e: invokevirtual com/finalshell/core/F9.Z (Lcom/finalshell/core/FC;)V
      // 51: bipush 0
      // 52: istore 5
      // 54: aload 4
      // 56: invokevirtual com/finalshell/core/FC.N ()[Lcom/finalshell/core/Y2_3;
      // 59: astore 6
      // 5b: aload 6
      // 5d: arraylength
      // 5e: istore 7
      // 60: bipush 0
      // 61: istore 8
      // 63: iload 8
      // 65: iload 7
      // 67: if_icmpge 8f
      // 6a: aload 6
      // 6c: iload 8
      // 6e: aaload
      // 6f: astore 9
      // 71: iload 5
      // 73: aload 9
      // 75: invokeinterface com/finalshell/core/Y2_3.u ()I 1
      // 7a: iadd
      // 7b: istore 5
      // 7d: iinc 8 1
      // 80: aload 2
      // 81: ifnull a5
      // 84: aload 2
      // 85: ifnonnull 63
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 8e: athrow
      // 8f: iload 5
      // 91: aload 0
      // 92: getfield com/finalshell/core/B3_2.Q I
      // 95: if_icmple a5
      // 98: aload 0
      // 99: iload 5
      // 9b: putfield com/finalshell/core/B3_2.Q I
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // a4: athrow
      // a5: return
   }

   public boolean T$boolean() {
      try {
         if (this.S$y_2() == Cm2_3.Y) {
            return true;
         }
      } catch (P_5 var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean p() {
      return this.S$y_2() instanceof I2_3;
   }

   public Y2_3 S$y_2() {
      return this.G$f9().K().n();
   }

   public Y2_3 Z() {
      F9 var1 = this.G$f9();
      FC var2 = var1.K();

      while (true) {
         Y2_3 var3 = var2.n();
         var2 = var2.C();

         try {
            if (var3 != Cm2_3.i) {
               var1.Z(var2);
               return var3;
            }
         } catch (P_5 var4) {
            throw a(var4);
         }
      }
   }

   public void d(Y2_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 07: astore 3
      // 08: astore 2
      // 09: getstatic com/finalshell/core/B3_2.g Z
      // 0c: aload 2
      // 0d: ifnull 26
      // 10: ifne 36
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19: athrow
      // 1a: aload 3
      // 1b: aload 1
      // 1c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 25: athrow
      // 26: ifne 36
      // 29: new java/lang/AssertionError
      // 2c: dup
      // 2d: aload 3
      // 2e: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 31: athrow
      // 32: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 35: athrow
      // 36: return
   }

   public void p(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 007: astore 3
      // 008: astore 2
      // 009: aload 3
      // 00a: getstatic com/finalshell/core/Cm2_3.I Lcom/finalshell/core/Y2_3;
      // 00d: aload 2
      // 00e: ifnull 0c5
      // 011: if_acmpne 0c1
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 01a: athrow
      // 01b: getstatic com/finalshell/core/B3_2.g Z
      // 01e: aload 2
      // 01f: ifnull 041
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 028: athrow
      // 029: ifne 303
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 032: athrow
      // 033: aload 1
      // 034: ldc_w "Z"
      // 037: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 040: athrow
      // 041: aload 2
      // 042: ifnull 05d
      // 045: ifne 303
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 04e: athrow
      // 04f: aload 1
      // 050: ldc_w "B"
      // 053: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 05c: athrow
      // 05d: aload 2
      // 05e: ifnull 079
      // 061: ifne 303
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 06a: athrow
      // 06b: aload 1
      // 06c: ldc_w "C"
      // 06f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 078: athrow
      // 079: aload 2
      // 07a: ifnull 095
      // 07d: ifne 303
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 086: athrow
      // 087: aload 1
      // 088: ldc_w "S"
      // 08b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 094: athrow
      // 095: aload 2
      // 096: ifnull 0b1
      // 099: ifne 303
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a2: athrow
      // 0a3: aload 1
      // 0a4: ldc_w "I"
      // 0a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b0: athrow
      // 0b1: ifne 303
      // 0b4: new java/lang/AssertionError
      // 0b7: dup
      // 0b8: aload 1
      // 0b9: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 0bc: athrow
      // 0bd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c0: athrow
      // 0c1: aload 3
      // 0c2: getstatic com/finalshell/core/Cm2_3.V Lcom/finalshell/core/Y2_3;
      // 0c5: aload 2
      // 0c6: ifnull 10d
      // 0c9: if_acmpne 109
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d2: athrow
      // 0d3: getstatic com/finalshell/core/B3_2.g Z
      // 0d6: aload 2
      // 0d7: ifnull 0f9
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0e0: athrow
      // 0e1: ifne 303
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: ldc_w "J"
      // 0ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f8: athrow
      // 0f9: ifne 303
      // 0fc: new java/lang/AssertionError
      // 0ff: dup
      // 100: aload 1
      // 101: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 104: athrow
      // 105: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 108: athrow
      // 109: aload 3
      // 10a: getstatic com/finalshell/core/Cm2_3.Q Lcom/finalshell/core/Y2_3;
      // 10d: aload 2
      // 10e: ifnull 155
      // 111: if_acmpne 151
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 11a: athrow
      // 11b: getstatic com/finalshell/core/B3_2.g Z
      // 11e: aload 2
      // 11f: ifnull 141
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 128: athrow
      // 129: ifne 303
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 132: athrow
      // 133: aload 1
      // 134: ldc_w "F"
      // 137: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 140: athrow
      // 141: ifne 303
      // 144: new java/lang/AssertionError
      // 147: dup
      // 148: aload 1
      // 149: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 14c: athrow
      // 14d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 150: athrow
      // 151: aload 3
      // 152: getstatic com/finalshell/core/Cm2_3.n Lcom/finalshell/core/Y2_3;
      // 155: aload 2
      // 156: ifnull 1a8
      // 159: if_acmpne 199
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 162: athrow
      // 163: getstatic com/finalshell/core/B3_2.g Z
      // 166: aload 2
      // 167: ifnull 189
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 170: athrow
      // 171: ifne 303
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 17a: athrow
      // 17b: aload 1
      // 17c: ldc_w "D"
      // 17f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 188: athrow
      // 189: ifne 303
      // 18c: new java/lang/AssertionError
      // 18f: dup
      // 190: aload 1
      // 191: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 194: athrow
      // 195: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 198: athrow
      // 199: aload 3
      // 19a: aload 2
      // 19b: ifnull 1e2
      // 19e: getstatic com/finalshell/core/Cm2_3.Y Lcom/finalshell/core/Y2_3;
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a7: athrow
      // 1a8: if_acmpne 1e1
      // 1ab: getstatic com/finalshell/core/B3_2.g Z
      // 1ae: aload 2
      // 1af: ifnull 1d1
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1b8: athrow
      // 1b9: ifne 303
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1c2: athrow
      // 1c3: aload 1
      // 1c4: ldc_w "V"
      // 1c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1d0: athrow
      // 1d1: ifne 303
      // 1d4: new java/lang/AssertionError
      // 1d7: dup
      // 1d8: aload 1
      // 1d9: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 1dc: athrow
      // 1dd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1e0: athrow
      // 1e1: aload 3
      // 1e2: instanceof com/finalshell/core/I2_3
      // 1e5: aload 2
      // 1e6: ifnull 2c0
      // 1e9: ifeq 2b5
      // 1ec: goto 1f3
      // 1ef: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1f2: athrow
      // 1f3: getstatic com/finalshell/core/B3_2.g Z
      // 1f6: aload 2
      // 1f7: ifnull 216
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 200: athrow
      // 201: ifne 243
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20a: athrow
      // 20b: aload 1
      // 20c: invokestatic com/finalshell/core/F0_2.e$boolean (Ljava/lang/String;)Z
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 215: athrow
      // 216: ifne 243
      // 219: new java/lang/AssertionError
      // 21c: dup
      // 21d: new java/lang/StringBuilder
      // 220: dup
      // 221: invokespecial java/lang/StringBuilder.<init> ()V
      // 224: aload 1
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: sipush -18724
      // 22b: sipush 3077
      // 22e: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: aload 3
      // 235: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 238: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23b: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 23e: athrow
      // 23f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 242: athrow
      // 243: aload 3
      // 244: checkcast com/finalshell/core/I2_3
      // 247: astore 4
      // 249: aload 0
      // 24a: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 24d: aload 4
      // 24f: invokevirtual com/finalshell/core/I2_3.u$short ()S
      // 252: invokevirtual com/finalshell/core/Cr2_2.X (S)Lcom/finalshell/core/G_3;
      // 255: astore 5
      // 257: aload 5
      // 259: aload 0
      // 25a: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 25d: invokevirtual com/finalshell/core/G_3.E (Lcom/finalshell/core/Cr2_2;)Ljava/lang/String;
      // 260: invokestatic com/finalshell/core/F0_2.q (Ljava/lang/String;)Ljava/lang/String;
      // 263: astore 6
      // 265: getstatic com/finalshell/core/B3_2.g Z
      // 268: aload 2
      // 269: ifnull 283
      // 26c: ifne 2b1
      // 26f: goto 276
      // 272: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 275: athrow
      // 276: aload 1
      // 277: aload 6
      // 279: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 282: athrow
      // 283: ifne 2b1
      // 286: new java/lang/AssertionError
      // 289: dup
      // 28a: new java/lang/StringBuilder
      // 28d: dup
      // 28e: invokespecial java/lang/StringBuilder.<init> ()V
      // 291: aload 1
      // 292: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 295: sipush -18729
      // 298: sipush 4943
      // 29b: invokestatic com/finalshell/core/B3_2.a (II)Ljava/lang/String;
      // 29e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a1: aload 6
      // 2a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a9: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 2ac: athrow
      // 2ad: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2b0: athrow
      // 2b1: aload 2
      // 2b2: ifnonnull 303
      // 2b5: aload 3
      // 2b6: instanceof com/finalshell/core/Ca2_2
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2bf: athrow
      // 2c0: aload 2
      // 2c1: ifnull 2d1
      // 2c4: ifeq 2fa
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2cd: athrow
      // 2ce: getstatic com/finalshell/core/B3_2.g Z
      // 2d1: aload 2
      // 2d2: ifnull 2ea
      // 2d5: ifne 303
      // 2d8: goto 2df
      // 2db: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2de: athrow
      // 2df: aload 1
      // 2e0: invokestatic com/finalshell/core/F0_2.e$boolean (Ljava/lang/String;)Z
      // 2e3: goto 2ea
      // 2e6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2e9: athrow
      // 2ea: ifne 303
      // 2ed: new java/lang/AssertionError
      // 2f0: dup
      // 2f1: aload 1
      // 2f2: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 2f5: athrow
      // 2f6: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2f9: athrow
      // 2fa: new java/lang/AssertionError
      // 2fd: dup
      // 2fe: aload 3
      // 2ff: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 302: athrow
      // 303: return
   }

   public void Z(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 22
      // 08: aload 1
      // 09: invokestatic com/finalshell/core/F0_2.N (Ljava/lang/String;)Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual com/finalshell/core/B3_2.p (Ljava/lang/String;)V
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 21: athrow
      // 22: aload 2
      // 23: ifnonnull 32
      // 26: aload 0
      // 27: invokevirtual com/finalshell/core/B3_2.G$y_2 ()Lcom/finalshell/core/Y2_3;
      // 2a: pop
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 31: athrow
      // 32: return
   }

   public void F$void() {
      this.d(Cm2_3.I);
   }

   public void c() {
      this.d(Cm2_3.V);
   }

   public void S$void() {
      this.d(Cm2_3.e);
   }

   public void m$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/B3_2.g Z
      // 0c: aload 1
      // 0d: ifnull 25
      // 10: ifne 38
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19: athrow
      // 1a: aload 2
      // 1b: instanceof com/finalshell/core/Ca2_2
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 24: athrow
      // 25: ifne 38
      // 28: new java/lang/AssertionError
      // 2b: dup
      // 2c: aload 2
      // 2d: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 30: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 33: athrow
      // 34: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 37: athrow
      // 38: return
   }

   public void X() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 1
      // 05: ifnull 5c
      // 08: getstatic com/finalshell/core/B3_2.g Z
      // 0b: ifne 57
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: ifnull 58
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20: athrow
      // 21: invokevirtual com/finalshell/core/B3_2.p ()Z
      // 24: ifne 57
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: ifnull 58
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 39: athrow
      // 3a: invokevirtual com/finalshell/core/B3_2.T$boolean ()Z
      // 3d: ifne 57
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 46: athrow
      // 47: new java/lang/AssertionError
      // 4a: dup
      // 4b: aload 0
      // 4c: invokevirtual com/finalshell/core/B3_2.S$y_2 ()Lcom/finalshell/core/Y2_3;
      // 4f: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 52: athrow
      // 53: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 56: athrow
      // 57: aload 0
      // 58: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 5b: pop
      // 5c: return
   }

   public String E() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/B3_2.g Z
      // 0c: aload 1
      // 0d: ifnull 30
      // 10: ifne 40
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 1
      // 1c: ifnull 41
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 25: athrow
      // 26: instanceof com/finalshell/core/I2_3
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2f: athrow
      // 30: ifne 40
      // 33: new java/lang/AssertionError
      // 36: dup
      // 37: aload 2
      // 38: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 3b: athrow
      // 3c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3f: athrow
      // 40: aload 2
      // 41: checkcast com/finalshell/core/I2_3
      // 44: astore 3
      // 45: aload 3
      // 46: invokevirtual com/finalshell/core/I2_3.u$short ()S
      // 49: istore 4
      // 4b: aload 0
      // 4c: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 4f: iload 4
      // 51: invokevirtual com/finalshell/core/Cr2_2.X (S)Lcom/finalshell/core/G_3;
      // 54: astore 5
      // 56: aload 5
      // 58: aload 0
      // 59: getfield com/finalshell/core/B3_2.P Lcom/finalshell/core/Cr2_2;
      // 5c: invokevirtual com/finalshell/core/G_3.E (Lcom/finalshell/core/Cr2_2;)Ljava/lang/String;
      // 5f: invokestatic com/finalshell/core/F0_2.q (Ljava/lang/String;)Ljava/lang/String;
      // 62: areturn
   }

   public Y2_3 G$y_2() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/B3_2.g Z
      // 0c: aload 1
      // 0d: ifnull 30
      // 10: ifne 72
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 1
      // 1c: ifnull 73
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 25: athrow
      // 26: instanceof com/finalshell/core/Ca2_2
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2f: athrow
      // 30: ifne 72
      // 33: aload 2
      // 34: aload 1
      // 35: ifnull 73
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3e: athrow
      // 3f: instanceof com/finalshell/core/I2_3
      // 42: ifne 72
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4b: athrow
      // 4c: aload 2
      // 4d: aload 1
      // 4e: ifnull 73
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 57: athrow
      // 58: getstatic com/finalshell/core/Cm2_3.e Lcom/finalshell/core/Y2_3;
      // 5b: if_acmpeq 72
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 64: athrow
      // 65: new java/lang/AssertionError
      // 68: dup
      // 69: aload 2
      // 6a: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 6d: athrow
      // 6e: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 71: athrow
      // 72: aload 2
      // 73: areturn
   }

   public Y2_3 m$y_2() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/B3_2.Z ()Lcom/finalshell/core/Y2_3;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/B3_2.g Z
      // 0c: ifne 4e
      // 0f: aload 2
      // 10: aload 1
      // 11: ifnull 4f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a: athrow
      // 1b: getstatic com/finalshell/core/Cm2_3.I Lcom/finalshell/core/Y2_3;
      // 1e: if_acmpeq 4e
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 27: athrow
      // 28: aload 2
      // 29: aload 1
      // 2a: ifnull 4f
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 33: athrow
      // 34: getstatic com/finalshell/core/Cm2_3.V Lcom/finalshell/core/Y2_3;
      // 37: if_acmpeq 4e
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 40: athrow
      // 41: new java/lang/AssertionError
      // 44: dup
      // 45: aload 2
      // 46: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 49: athrow
      // 4a: invokestatic com/finalshell/core/B3_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 4d: athrow
      // 4e: aload 2
      // 4f: areturn
   }

   public static int t(int var0) {
      return p(var0);
   }

   public static F9 s$f9(B3_2 var0) {
      return var0.Z;
   }

   public static byte[] s$arrbyte(B3_2 var0) {
      return var0.u;
   }

   public static FC T(FC var0, FC var1) {
      return r(var0, var1);
   }

   public static Cr2_2 x(B3_2 var0) {
      return var0.P;
   }

   static {
      __vfClinit__();
   }

   public static P_5 a(P_5 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -18731) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 175;
               break;
            case 1:
               var10000 = 151;
               break;
            case 2:
               var10000 = 81;
               break;
            case 3:
               var10000 = 117;
               break;
            case 4:
               var10000 = 27;
               break;
            case 5:
               var10000 = 45;
               break;
            case 6:
               var10000 = 173;
               break;
            case 7:
               var10000 = 103;
               break;
            case 8:
               var10000 = 79;
               break;
            case 9:
               var10000 = 233;
               break;
            case 10:
               var10000 = 174;
               break;
            case 11:
               var10000 = 59;
               break;
            case 12:
               var10000 = 101;
               break;
            case 13:
               var10000 = 104;
               break;
            case 14:
               var10000 = 35;
               break;
            case 15:
               var10000 = 230;
               break;
            case 16:
               var10000 = 160;
               break;
            case 17:
               var10000 = 221;
               break;
            case 18:
               var10000 = 18;
               break;
            case 19:
               var10000 = 227;
               break;
            case 20:
               var10000 = 214;
               break;
            case 21:
               var10000 = 114;
               break;
            case 22:
               var10000 = 63;
               break;
            case 23:
               var10000 = 231;
               break;
            case 24:
               var10000 = 15;
               break;
            case 25:
               var10000 = 153;
               break;
            case 26:
               var10000 = 56;
               break;
            case 27:
               var10000 = 169;
               break;
            case 28:
               var10000 = 135;
               break;
            case 29:
               var10000 = 20;
               break;
            case 30:
               var10000 = 180;
               break;
            case 31:
               var10000 = 39;
               break;
            case 32:
               var10000 = 92;
               break;
            case 33:
               var10000 = 52;
               break;
            case 34:
               var10000 = 197;
               break;
            case 35:
               var10000 = 87;
               break;
            case 36:
               var10000 = 124;
               break;
            case 37:
               var10000 = 112;
               break;
            case 38:
               var10000 = 70;
               break;
            case 39:
               var10000 = 247;
               break;
            case 40:
               var10000 = 186;
               break;
            case 41:
               var10000 = 142;
               break;
            case 42:
               var10000 = 26;
               break;
            case 43:
               var10000 = 93;
               break;
            case 44:
               var10000 = 118;
               break;
            case 45:
               var10000 = 223;
               break;
            case 46:
               var10000 = 145;
               break;
            case 47:
               var10000 = 136;
               break;
            case 48:
               var10000 = 48;
               break;
            case 49:
               var10000 = 171;
               break;
            case 50:
               var10000 = 216;
               break;
            case 51:
               var10000 = 141;
               break;
            case 52:
               var10000 = 76;
               break;
            case 53:
               var10000 = 83;
               break;
            case 54:
               var10000 = 96;
               break;
            case 55:
               var10000 = 134;
               break;
            case 56:
               var10000 = 58;
               break;
            case 57:
               var10000 = 138;
               break;
            case 58:
               var10000 = 37;
               break;
            case 59:
               var10000 = 131;
               break;
            case 60:
               var10000 = 122;
               break;
            case 61:
               var10000 = 190;
               break;
            case 62:
               var10000 = 2;
               break;
            case 63:
               var10000 = 4;
               break;
            case 64:
               var10000 = 84;
               break;
            case 65:
               var10000 = 191;
               break;
            case 66:
               var10000 = 14;
               break;
            case 67:
               var10000 = 105;
               break;
            case 68:
               var10000 = 202;
               break;
            case 69:
               var10000 = 254;
               break;
            case 70:
               var10000 = 44;
               break;
            case 71:
               var10000 = 120;
               break;
            case 72:
               var10000 = 152;
               break;
            case 73:
               var10000 = 209;
               break;
            case 74:
               var10000 = 195;
               break;
            case 75:
               var10000 = 189;
               break;
            case 76:
               var10000 = 177;
               break;
            case 77:
               var10000 = 220;
               break;
            case 78:
               var10000 = 66;
               break;
            case 79:
               var10000 = 91;
               break;
            case 80:
               var10000 = 42;
               break;
            case 81:
               var10000 = 110;
               break;
            case 82:
               var10000 = 207;
               break;
            case 83:
               var10000 = 38;
               break;
            case 84:
               var10000 = 232;
               break;
            case 85:
               var10000 = 22;
               break;
            case 86:
               var10000 = 94;
               break;
            case 87:
               var10000 = 75;
               break;
            case 88:
               var10000 = 34;
               break;
            case 89:
               var10000 = 3;
               break;
            case 90:
               var10000 = 245;
               break;
            case 91:
               var10000 = 0;
               break;
            case 92:
               var10000 = 19;
               break;
            case 93:
               var10000 = 200;
               break;
            case 94:
               var10000 = 21;
               break;
            case 95:
               var10000 = 24;
               break;
            case 96:
               var10000 = 150;
               break;
            case 97:
               var10000 = 217;
               break;
            case 98:
               var10000 = 249;
               break;
            case 99:
               var10000 = 235;
               break;
            case 100:
               var10000 = 211;
               break;
            case 101:
               var10000 = 133;
               break;
            case 102:
               var10000 = 30;
               break;
            case 103:
               var10000 = 234;
               break;
            case 104:
               var10000 = 162;
               break;
            case 105:
               var10000 = 116;
               break;
            case 106:
               var10000 = 62;
               break;
            case 107:
               var10000 = 178;
               break;
            case 108:
               var10000 = 11;
               break;
            case 109:
               var10000 = 119;
               break;
            case 110:
               var10000 = 130;
               break;
            case 111:
               var10000 = 98;
               break;
            case 112:
               var10000 = 182;
               break;
            case 113:
               var10000 = 65;
               break;
            case 114:
               var10000 = 253;
               break;
            case 115:
               var10000 = 74;
               break;
            case 116:
               var10000 = 144;
               break;
            case 117:
               var10000 = 125;
               break;
            case 118:
               var10000 = 109;
               break;
            case 119:
               var10000 = 67;
               break;
            case 120:
               var10000 = 88;
               break;
            case 121:
               var10000 = 155;
               break;
            case 122:
               var10000 = 43;
               break;
            case 123:
               var10000 = 72;
               break;
            case 124:
               var10000 = 242;
               break;
            case 125:
               var10000 = 240;
               break;
            case 126:
               var10000 = 225;
               break;
            case 127:
               var10000 = 193;
               break;
            case 128:
               var10000 = 250;
               break;
            case 129:
               var10000 = 148;
               break;
            case 130:
               var10000 = 29;
               break;
            case 131:
               var10000 = 204;
               break;
            case 132:
               var10000 = 140;
               break;
            case 133:
               var10000 = 68;
               break;
            case 134:
               var10000 = 218;
               break;
            case 135:
               var10000 = 13;
               break;
            case 136:
               var10000 = 115;
               break;
            case 137:
               var10000 = 137;
               break;
            case 138:
               var10000 = 222;
               break;
            case 139:
               var10000 = 71;
               break;
            case 140:
               var10000 = 198;
               break;
            case 141:
               var10000 = 252;
               break;
            case 142:
               var10000 = 167;
               break;
            case 143:
               var10000 = 181;
               break;
            case 144:
               var10000 = 86;
               break;
            case 145:
               var10000 = 228;
               break;
            case 146:
               var10000 = 238;
               break;
            case 147:
               var10000 = 12;
               break;
            case 148:
               var10000 = 80;
               break;
            case 149:
               var10000 = 32;
               break;
            case 150:
               var10000 = 187;
               break;
            case 151:
               var10000 = 89;
               break;
            case 152:
               var10000 = 143;
               break;
            case 153:
               var10000 = 188;
               break;
            case 154:
               var10000 = 161;
               break;
            case 155:
               var10000 = 50;
               break;
            case 156:
               var10000 = 196;
               break;
            case 157:
               var10000 = 5;
               break;
            case 158:
               var10000 = 51;
               break;
            case 159:
               var10000 = 172;
               break;
            case 160:
               var10000 = 244;
               break;
            case 161:
               var10000 = 159;
               break;
            case 162:
               var10000 = 10;
               break;
            case 163:
               var10000 = 185;
               break;
            case 164:
               var10000 = 23;
               break;
            case 165:
               var10000 = 149;
               break;
            case 166:
               var10000 = 47;
               break;
            case 167:
               var10000 = 99;
               break;
            case 168:
               var10000 = 248;
               break;
            case 169:
               var10000 = 255;
               break;
            case 170:
               var10000 = 123;
               break;
            case 171:
               var10000 = 41;
               break;
            case 172:
               var10000 = 199;
               break;
            case 173:
               var10000 = 224;
               break;
            case 174:
               var10000 = 203;
               break;
            case 175:
               var10000 = 183;
               break;
            case 176:
               var10000 = 166;
               break;
            case 177:
               var10000 = 90;
               break;
            case 178:
               var10000 = 85;
               break;
            case 179:
               var10000 = 237;
               break;
            case 180:
               var10000 = 107;
               break;
            case 181:
               var10000 = 1;
               break;
            case 182:
               var10000 = 61;
               break;
            case 183:
               var10000 = 9;
               break;
            case 184:
               var10000 = 226;
               break;
            case 185:
               var10000 = 36;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 78;
               break;
            case 188:
               var10000 = 54;
               break;
            case 189:
               var10000 = 239;
               break;
            case 190:
               var10000 = 121;
               break;
            case 191:
               var10000 = 146;
               break;
            case 192:
               var10000 = 73;
               break;
            case 193:
               var10000 = 168;
               break;
            case 194:
               var10000 = 194;
               break;
            case 195:
               var10000 = 251;
               break;
            case 196:
               var10000 = 213;
               break;
            case 197:
               var10000 = 184;
               break;
            case 198:
               var10000 = 33;
               break;
            case 199:
               var10000 = 55;
               break;
            case 200:
               var10000 = 46;
               break;
            case 201:
               var10000 = 129;
               break;
            case 202:
               var10000 = 64;
               break;
            case 203:
               var10000 = 53;
               break;
            case 204:
               var10000 = 106;
               break;
            case 205:
               var10000 = 206;
               break;
            case 206:
               var10000 = 210;
               break;
            case 207:
               var10000 = 31;
               break;
            case 208:
               var10000 = 176;
               break;
            case 209:
               var10000 = 126;
               break;
            case 210:
               var10000 = 113;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 201;
               break;
            case 213:
               var10000 = 215;
               break;
            case 214:
               var10000 = 82;
               break;
            case 215:
               var10000 = 97;
               break;
            case 216:
               var10000 = 229;
               break;
            case 217:
               var10000 = 156;
               break;
            case 218:
               var10000 = 132;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 77;
               break;
            case 221:
               var10000 = 128;
               break;
            case 222:
               var10000 = 69;
               break;
            case 223:
               var10000 = 60;
               break;
            case 224:
               var10000 = 49;
               break;
            case 225:
               var10000 = 212;
               break;
            case 226:
               var10000 = 219;
               break;
            case 227:
               var10000 = 100;
               break;
            case 228:
               var10000 = 163;
               break;
            case 229:
               var10000 = 17;
               break;
            case 230:
               var10000 = 164;
               break;
            case 231:
               var10000 = 8;
               break;
            case 232:
               var10000 = 127;
               break;
            case 233:
               var10000 = 158;
               break;
            case 234:
               var10000 = 6;
               break;
            case 235:
               var10000 = 208;
               break;
            case 236:
               var10000 = 205;
               break;
            case 237:
               var10000 = 243;
               break;
            case 238:
               var10000 = 236;
               break;
            case 239:
               var10000 = 95;
               break;
            case 240:
               var10000 = 147;
               break;
            case 241:
               var10000 = 170;
               break;
            case 242:
               var10000 = 102;
               break;
            case 243:
               var10000 = 25;
               break;
            case 244:
               var10000 = 154;
               break;
            case 245:
               var10000 = 108;
               break;
            case 246:
               var10000 = 246;
               break;
            case 247:
               var10000 = 7;
               break;
            case 248:
               var10000 = 16;
               break;
            case 249:
               var10000 = 28;
               break;
            case 250:
               var10000 = 40;
               break;
            case 251:
               var10000 = 179;
               break;
            case 252:
               var10000 = 111;
               break;
            case 253:
               var10000 = 57;
               break;
            case 254:
               var10000 = 157;
               break;
            default:
               var10000 = 139;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28973;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[14];
      int var11 = 0;
      String var10 = "¨:²\u009c£r\u0019\u001fÀT¡Ü\u0099ul\u009d¯È¤1þ,Àe\u0090BíPûUx\u001cú\u00902\u0003°ÞJÿ¿m\u0084d_\u0005øJR\u0018\u008c\u0005o\u0013TÅ\b\rÓ@Ì \u0000¤Ì>Þ6VXs)\u0098>V×\u0098´R\u0011±\u0090\u009að\u001d\u0094Ö\r\u0098Ú\u0011x\n-&\t\u0011G\u001f*4\u008e9\u0016c¥\u0085(6®¥@\u0080'¥ö1Çm¬ H)ü\u0094ÎD/\u0090\u009a·ð \u009cî\u001e,\u0010,üy\u009eTîEh\u0092\u0016w±hït\u001c_$\u0006y\u001e,¢Õ:,â\u0087-ÎÏ`\u001b\u0095\u008eiù\u00881\u0083\u008eé\u0016°\u0012û97õ:Wl:÷ôé\u0000\u0084\u001e\u0006!\u000f^\u0017j8ìÑêf \u0016\u0001Ý¨{¦\u0093L\u0014\u00810QäQ[\u0012\u0005·\u0094O5k\u000føwZþ\u0019\u0091bµ·\u0004Zb\u0005ÆÕ\u001dåC\u001d¾Ô\u0085{¹÷¶r04D÷\u0086lx\u0014ÒZ.ªíþ\u00ad}Û\u0007";
      int var12 = "¨:²\u009c£r\u0019\u001fÀT¡Ü\u0099ul\u009d¯È¤1þ,Àe\u0090BíPûUx\u001cú\u00902\u0003°ÞJÿ¿m\u0084d_\u0005øJR\u0018\u008c\u0005o\u0013TÅ\b\rÓ@Ì \u0000¤Ì>Þ6VXs)\u0098>V×\u0098´R\u0011±\u0090\u009að\u001d\u0094Ö\r\u0098Ú\u0011x\n-&\t\u0011G\u001f*4\u008e9\u0016c¥\u0085(6®¥@\u0080'¥ö1Çm¬ H)ü\u0094ÎD/\u0090\u009a·ð \u009cî\u001e,\u0010,üy\u009eTîEh\u0092\u0016w±hït\u001c_$\u0006y\u001e,¢Õ:,â\u0087-ÎÏ`\u001b\u0095\u008eiù\u00881\u0083\u008eé\u0016°\u0012û97õ:Wl:÷ôé\u0000\u0084\u001e\u0006!\u000f^\u0017j8ìÑêf \u0016\u0001Ý¨{¦\u0093L\u0014\u00810QäQ[\u0012\u0005·\u0094O5k\u000føwZþ\u0019\u0091bµ·\u0004Zb\u0005ÆÕ\u001dåC\u001d¾Ô\u0085{¹÷¶r04D÷\u0086lx\u0014ÒZ.ªíþ\u00ad}Û\u0007"
         .length();
      char var9 = '-';
      int var18 = -1;

      label85:
      while (true) {
         byte var10000 = 87;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var35;
            label80: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label80;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var66 = var57[var10006];
                  byte var67;
                  switch (var14 % 7) {
                     case 0:
                        var67 = 74;
                        break;
                     case 1:
                        var67 = 36;
                        break;
                     case 2:
                        var67 = 26;
                        break;
                     case 3:
                        var67 = 8;
                        break;
                     case 4:
                        var67 = 65;
                        break;
                     case 5:
                        var67 = 78;
                        break;
                     default:
                        var67 = 62;
                  }

                  var57[var10006] = (char)(var66 ^ var51 ^ var67);
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var18 += var9) >= var12) {
                     b = var13;
                     c = new String[14];
                     long var0 = 82923854358773919L;
                     long[] var6 = new long[43];
                     int var3 = 0;
                     String var4 = "Ø[iO±¹Y\u009aF\u0087^8-\fcUÚô{íI\u000fE¿¥Bp\fý¼i\u0098·´Oxæ\u001a\u001cþ¢s^\u001d¤ß½,ÆéT%Êv\u0000\u0094\u0016üØ\u0001ìt\u000e·\u00adx]¹©á\u0091e6÷\u0088ÓdNµ\u0094Õ´K>Í\u0018\u0080\"«ïþè¥\u00986\u0014{. u$Ñ¼\u0018²\f6é\u009d\u0094t$ºÑ\u008c}w\u009e\u0001\u0017Q3\u001a¾.áf\u0004ëÑ%!wcÆ3\u00ad\u008dÛ1EýÌ¢÷\u0081Tp\u0018\u008bh5\"\u009b-À\u0084íï§¡üB6?h\u008b<y¶Wì£Y\u0092¸\u0011Ó\u00ad!Æwh?\u000f\u0087\u0014\"Ìô\u0010Nç\u0091°vÑG\u0015yg¬\u0013Þ¤Ä\u0010\u0087×'\u0015GCä\u009bÝ\u001bt@=*¸\u009cð\n\u000bW\u0016\u0080\u0086¯x1D/ô\u0089Ä[\u0091\u0010Ñ¹²&\u0093\u008be!BÏØ|\u0080Ìho\u0093Du¯BoK)n`hÖ;÷\u009dÂ¸\u0089\u0004 ¯ºÑ«¾;1\u001cj\u0095¡\u0004\u000eu:ëxûÊæ\u0007Å÷Ò\u000e\u001fL\u0092\"Ý\u0092\u0084\u009e\u0012Ê¸úô\u000fç§\u009dw4I«\rYp@\u000e";
                     int var5 = "Ø[iO±¹Y\u009aF\u0087^8-\fcUÚô{íI\u000fE¿¥Bp\fý¼i\u0098·´Oxæ\u001a\u001cþ¢s^\u001d¤ß½,ÆéT%Êv\u0000\u0094\u0016üØ\u0001ìt\u000e·\u00adx]¹©á\u0091e6÷\u0088ÓdNµ\u0094Õ´K>Í\u0018\u0080\"«ïþè¥\u00986\u0014{. u$Ñ¼\u0018²\f6é\u009d\u0094t$ºÑ\u008c}w\u009e\u0001\u0017Q3\u001a¾.áf\u0004ëÑ%!wcÆ3\u00ad\u008dÛ1EýÌ¢÷\u0081Tp\u0018\u008bh5\"\u009b-À\u0084íï§¡üB6?h\u008b<y¶Wì£Y\u0092¸\u0011Ó\u00ad!Æwh?\u000f\u0087\u0014\"Ìô\u0010Nç\u0091°vÑG\u0015yg¬\u0013Þ¤Ä\u0010\u0087×'\u0015GCä\u009bÝ\u001bt@=*¸\u009cð\n\u000bW\u0016\u0080\u0086¯x1D/ô\u0089Ä[\u0091\u0010Ñ¹²&\u0093\u008be!BÏØ|\u0080Ìho\u0093Du¯BoK)n`hÖ;÷\u009dÂ¸\u0089\u0004 ¯ºÑ«¾;1\u001cj\u0095¡\u0004\u000eu:ëxûÊæ\u0007Å÷Ò\u000e\u001fL\u0092\"Ý\u0092\u0084\u009e\u0012Ê¸úô\u000fç§\u009dw4I«\rYp@\u000e"
                        .length();
                     byte var2 = 0;

                     label59:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var20[var29] = var56;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[43];

                                    label48: {
                                       try {
                                          if (!B3_2.class.desiredAssertionStatus()) {
                                             var21 = true;
                                             break label48;
                                          }
                                       } catch (P_5 var15) {
                                          throw a(var15);
                                       }

                                       var21 = false;
                                    }

                                    g = var21;
                                    E = Boolean.getBoolean(B3_2.class.getName() + a(-18727, 21140));
                                    C = r();
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var29] = var56;
                                 if (var2 < var5) {
                                    continue label59;
                                 }

                                 var4 = "Û* \u0091é¸\u0095ñ±\u0012_\"\u0000W\u0080\u00ad";
                                 var5 = "Û* \u0091é¸\u0095ñ±\u0012_\"\u0000W\u0080\u00ad".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label85;
                  }

                  var10 = "\u0016kVÕ: \u0013\u0081btð\u008d\u0091ØªÆË\u0014=(É\u0094\u0004kM(\u009b";
                  var12 = "\u0016kVÕ: \u0013\u0081btð\u008d\u0091ØªÆË\u0014=(É\u0094\u0004kM(\u009b".length();
                  var9 = 22;
                  var18 = -1;
            }

            var10000 = 26;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}





