package com.finalshell.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Logger;

public class W3_6 extends M_5 {
   public static Logger M;
   public EnumSet p = EnumSet.noneOf(com.finalshell.ui.model.Rd2.class);
   @C_9
   public C_L d;
   public D_6 I = new D_6(false);
   public final List C = new ArrayList();
   public static X_5[] E;
   public static boolean f;
   public static String[] i;
   public static String[] j;
   public static long k;

   public W3_6() {
   }

   @Deprecated
   public W3_6(J_5 var1, C_L var2) {
      this();
      this.B(var1);
      this.P(var2);
   }

   @Deprecated
   public W3_6(
      File[] param1,
      File[] param2,
      @C_9 File[] param3,
      @C_9 File[] param4,
      @C_9 File param5,
      @C_9 String param6,
      boolean param7,
      boolean param8,
      boolean param9,
      boolean param10,
      X_5[] param11,
      boolean param12
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
      // 001: invokespecial com/finalshell/core/M_5.<init> ()V
      // 004: aload 0
      // 005: ldc com/finalshell/ui/model/Rd2
      // 007: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 00a: putfield com/finalshell/core/W3_6.p Ljava/util/EnumSet;
      // 00d: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 010: aload 0
      // 011: new com/finalshell/core/D_6
      // 014: dup
      // 015: bipush 0
      // 016: invokespecial com/finalshell/core/D_6.<init> (Z)V
      // 019: putfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 01c: aload 0
      // 01d: new java/util/ArrayList
      // 020: dup
      // 021: invokespecial java/util/ArrayList.<init> ()V
      // 024: putfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 027: aload 0
      // 028: aload 1
      // 029: invokevirtual com/finalshell/core/W3_6.l ([Ljava/io/File;)V
      // 02c: aload 0
      // 02d: aload 2
      // 02e: invokevirtual com/finalshell/core/W3_6.R ([Ljava/io/File;)V
      // 031: aload 0
      // 032: aload 3
      // 033: ldc java/io/File
      // 035: invokestatic com/finalshell/core/W3_6.a ([Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
      // 038: checkcast [Ljava/io/File;
      // 03b: invokevirtual com/finalshell/core/W3_6.B ([Ljava/io/File;)V
      // 03e: astore 13
      // 040: aload 0
      // 041: aload 4
      // 043: ldc java/io/File
      // 045: invokestatic com/finalshell/core/W3_6.a ([Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
      // 048: checkcast [Ljava/io/File;
      // 04b: invokevirtual com/finalshell/core/W3_6.Q ([Ljava/io/File;)V
      // 04e: aload 0
      // 04f: aload 5
      // 051: aload 13
      // 053: ifnull 092
      // 056: iload 12
      // 058: invokevirtual com/finalshell/core/W3_6.Z (Ljava/io/File;Z)V
      // 05b: aload 0
      // 05c: aload 6
      // 05e: invokevirtual com/finalshell/core/W3_6.z (Ljava/lang/String;)V
      // 061: aload 0
      // 062: iload 7
      // 064: invokevirtual com/finalshell/core/W3_6.U (Z)V
      // 067: aload 0
      // 068: iload 8
      // 06a: invokevirtual com/finalshell/core/W3_6.Z (Z)V
      // 06d: aload 0
      // 06e: iload 9
      // 070: invokevirtual com/finalshell/core/W3_6.e (Z)V
      // 073: aload 0
      // 074: iload 10
      // 076: invokevirtual com/finalshell/core/W3_6.r (Z)V
      // 079: aload 0
      // 07a: iload 12
      // 07c: ifeq 090
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: getstatic com/finalshell/core/J_5.a Lcom/finalshell/core/U2_3;
      // 089: goto 0a8
      // 08c: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 5
      // 092: ifnonnull 09f
      // 095: getstatic com/finalshell/core/K_4.L Lcom/finalshell/core/J_5;
      // 098: goto 0a8
      // 09b: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: new com/finalshell/core/Q2_3
      // 0a2: dup
      // 0a3: aload 5
      // 0a5: invokespecial com/finalshell/core/Q2_3.<init> (Ljava/io/File;)V
      // 0a8: invokevirtual com/finalshell/core/W3_6.Q (Lcom/finalshell/core/J_5;)V
      // 0ab: aload 0
      // 0ac: iload 7
      // 0ae: invokevirtual com/finalshell/core/W3_6.U (Z)V
      // 0b1: aload 0
      // 0b2: iload 8
      // 0b4: invokevirtual com/finalshell/core/W3_6.Z (Z)V
      // 0b7: aload 0
      // 0b8: iload 9
      // 0ba: invokevirtual com/finalshell/core/W3_6.e (Z)V
      // 0bd: aload 0
      // 0be: iload 10
      // 0c0: invokevirtual com/finalshell/core/W3_6.r (Z)V
      // 0c3: aload 0
      // 0c4: aload 6
      // 0c6: invokevirtual com/finalshell/core/W3_6.z (Ljava/lang/String;)V
      // 0c9: aload 0
      // 0ca: new com/finalshell/core/R_2_3
      // 0cd: dup
      // 0ce: aload 11
      // 0d0: new com/finalshell/core/C_A
      // 0d3: dup
      // 0d4: aload 0
      // 0d5: invokespecial com/finalshell/core/C_A.<init> (Lcom/finalshell/core/W3_6;)V
      // 0d8: invokespecial com/finalshell/core/R_2_3.<init> ([Lcom/finalshell/core/X_5;Lcom/finalshell/core/Y_5;)V
      // 0db: invokevirtual com/finalshell/core/W3_6.z (Lcom/finalshell/core/Y_5;)V
      // 0de: aload 0
      // 0df: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 0e2: sipush -16541
      // 0e5: sipush -20710
      // 0e8: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 0eb: invokevirtual com/finalshell/core/D_6.p (Ljava/lang/String;)V
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 0f2: sipush -16536
      // 0f5: sipush -16141
      // 0f8: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 0fb: invokevirtual com/finalshell/core/D_6.p (Ljava/lang/String;)V
      // 0fe: aload 0
      // 0ff: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 102: sipush -16530
      // 105: sipush -11998
      // 108: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 10b: aload 1
      // 10c: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 10f: aload 0
      // 110: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 113: sipush -16540
      // 116: sipush -8583
      // 119: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 11c: aload 2
      // 11d: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 120: aload 0
      // 121: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 124: sipush -16539
      // 127: sipush -22403
      // 12a: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 12d: aload 3
      // 12e: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 131: aload 0
      // 132: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 135: sipush -16529
      // 138: sipush -24033
      // 13b: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 13e: aload 4
      // 140: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 143: aload 0
      // 144: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 147: sipush -16532
      // 14a: sipush -21914
      // 14d: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 150: aload 5
      // 152: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 155: aload 0
      // 156: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 159: sipush -16535
      // 15c: sipush 15232
      // 15f: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 162: aload 6
      // 164: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 167: aload 0
      // 168: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 16b: sipush -16517
      // 16e: sipush 23804
      // 171: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 174: iload 7
      // 176: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 179: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 180: sipush -16527
      // 183: sipush -30248
      // 186: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 189: iload 8
      // 18b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18e: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 191: aload 0
      // 192: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 195: sipush -16538
      // 198: sipush 21002
      // 19b: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 19e: iload 8
      // 1a0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a3: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 1a6: aload 0
      // 1a7: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 1aa: sipush -16519
      // 1ad: sipush -13124
      // 1b0: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1b3: iload 8
      // 1b5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1b8: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 1bb: aload 0
      // 1bc: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 1bf: sipush -16516
      // 1c2: sipush -1876
      // 1c5: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1c8: aload 11
      // 1ca: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 1cd: aload 0
      // 1ce: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 1d1: sipush -16531
      // 1d4: sipush -22278
      // 1d7: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1da: iload 12
      // 1dc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1df: invokevirtual com/finalshell/core/D_6.a (Ljava/lang/String;Ljava/lang/Object;)V
      // 1e2: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 1e5: ifnull 1f6
      // 1e8: bipush 5
      // 1e9: anewarray 164
      // 1ec: invokestatic com/finalshell/core/RG_2.m ([Ljava/lang/String;)V
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: return
   }

   public static Object[] a(@C_9 Object[] param0, java.lang.Class param1) {
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
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 20
      // 09: ifnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: goto 23
      // 17: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 1
      // 1c: bipush 0
      // 1d: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 20: checkcast [Ljava/lang/Object;
      // 23: areturn
   }

   public EnumSet W() {
      return this.p;
   }

   public W3_6 e(EnumSet var1) {
      this.p = var1;
      return this;
   }

   @Override
   public void Q(N_6[] param1) throws B2_5, IOException {
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
      // 004: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 007: invokevirtual com/finalshell/core/D_6.j ()V
      // 00a: astore 2
      // 00b: new com/finalshell/core/C_s_2
      // 00e: dup
      // 00f: aload 0
      // 010: aload 0
      // 011: getfield com/finalshell/core/W3_6.R Lcom/finalshell/core/J_5;
      // 014: aload 0
      // 015: getfield com/finalshell/core/W3_6.c Lcom/finalshell/core/J_5;
      // 018: aload 0
      // 019: invokespecial com/finalshell/core/W3_6.y ()Lcom/finalshell/core/C_L;
      // 01c: invokespecial com/finalshell/core/C_s_2.<init> (Lcom/finalshell/core/W3_6;Lcom/finalshell/core/J_5;Lcom/finalshell/core/J_5;Lcom/finalshell/core/C_L;)V
      // 01f: astore 3
      // 020: aload 0
      // 021: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 024: invokeinterface java/util/List.clear ()V 1
      // 029: aload 1
      // 02a: astore 4
      // 02c: aload 4
      // 02e: arraylength
      // 02f: istore 5
      // 031: bipush 0
      // 032: istore 6
      // 034: iload 6
      // 036: iload 5
      // 038: if_icmpge 0c0
      // 03b: aload 4
      // 03d: iload 6
      // 03f: aaload
      // 040: astore 7
      // 042: getstatic com/finalshell/core/W3_6.M Ljava/util/logging/Logger;
      // 045: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 048: sipush -16514
      // 04b: sipush -22106
      // 04e: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 051: aload 7
      // 053: invokevirtual java/util/logging/Logger.log (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
      // 056: new com/finalshell/core/H3_2
      // 059: dup
      // 05a: aload 0
      // 05b: aload 7
      // 05d: invokeinterface com/finalshell/core/N_6.o$String ()Ljava/lang/String; 1
      // 062: new java/io/BufferedInputStream
      // 065: dup
      // 066: aload 7
      // 068: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 06d: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 070: aload 0
      // 071: getfield com/finalshell/core/W3_6.m Ljava/nio/charset/Charset;
      // 074: invokespecial com/finalshell/core/W3_6.w (Ljava/lang/String;Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lcom/finalshell/core/RB;
      // 077: aload 3
      // 078: invokespecial com/finalshell/core/H3_2.<init> (Lcom/finalshell/core/RB;Lcom/finalshell/core/C_L;)V
      // 07b: astore 8
      // 07d: aload 8
      // 07f: aload 0
      // 080: getfield com/finalshell/core/W3_6.U I
      // 083: invokevirtual com/finalshell/core/H3_2.s (I)V
      // 086: aload 8
      // 088: aload 0
      // 089: getfield com/finalshell/core/W3_6.r Lcom/finalshell/core/U_5;
      // 08c: invokevirtual com/finalshell/core/H3_2.E (Lcom/finalshell/core/U_5;)V
      // 08f: aload 8
      // 091: aload 0
      // 092: getfield com/finalshell/core/W3_6.l Lcom/finalshell/core/Y_5;
      // 095: invokevirtual com/finalshell/core/H3_2.Y (Lcom/finalshell/core/Y_5;)V
      // 098: aload 8
      // 09a: aload 0
      // 09b: getfield com/finalshell/core/W3_6.p Ljava/util/EnumSet;
      // 09e: invokevirtual com/finalshell/core/H3_2.F (Ljava/util/EnumSet;)Lcom/finalshell/core/H3_2;
      // 0a1: pop
      // 0a2: aload 0
      // 0a3: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 0a6: aload 8
      // 0a8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ad: aload 2
      // 0ae: ifnull 0c1
      // 0b1: pop
      // 0b2: iinc 6 1
      // 0b5: aload 2
      // 0b6: ifnonnull 034
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: istore 4
      // 0c3: iload 4
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 0c9: invokeinterface java/util/List.size ()I 1
      // 0ce: if_icmpge 190
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 0d5: iload 4
      // 0d7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0dc: checkcast com/finalshell/core/H3_2
      // 0df: astore 5
      // 0e1: aload 5
      // 0e3: invokevirtual com/finalshell/core/H3_2.p ()Lcom/finalshell/core/RB;
      // 0e6: astore 7
      // 0e8: aload 2
      // 0e9: ifnull 1c5
      // 0ec: aload 7
      // 0ee: getfield com/finalshell/core/RB.c Ljava/lang/String;
      // 0f1: ifnonnull 107
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: new com/finalshell/core/P_5
      // 0fe: dup
      // 0ff: invokespecial com/finalshell/core/P_5.<init> ()V
      // 102: athrow
      // 103: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: new java/io/File
      // 10a: dup
      // 10b: aload 7
      // 10d: getfield com/finalshell/core/RB.c Ljava/lang/String;
      // 110: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 113: astore 6
      // 115: aload 5
      // 117: aload 0
      // 118: getfield com/finalshell/core/W3_6.U I
      // 11b: invokevirtual com/finalshell/core/H3_2.s (I)V
      // 11e: aload 5
      // 120: aload 0
      // 121: getfield com/finalshell/core/W3_6.r Lcom/finalshell/core/U_5;
      // 124: invokevirtual com/finalshell/core/H3_2.E (Lcom/finalshell/core/U_5;)V
      // 127: aload 5
      // 129: aload 0
      // 12a: getfield com/finalshell/core/W3_6.l Lcom/finalshell/core/Y_5;
      // 12d: invokevirtual com/finalshell/core/H3_2.Y (Lcom/finalshell/core/Y_5;)V
      // 130: aload 0
      // 131: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 134: new java/lang/StringBuilder
      // 137: dup
      // 138: invokespecial java/lang/StringBuilder.<init> ()V
      // 13b: sipush -16542
      // 13e: sipush 32400
      // 141: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: aload 6
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14c: ldc_w "\""
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokevirtual com/finalshell/core/D_6.u (Ljava/lang/String;)V
      // 158: aload 5
      // 15a: aload 0
      // 15b: getfield com/finalshell/core/W3_6.Q Z
      // 15e: aload 0
      // 15f: getfield com/finalshell/core/W3_6.v Z
      // 162: aload 0
      // 163: getfield com/finalshell/core/W3_6.o Z
      // 166: new com/finalshell/core/Fh2
      // 169: dup
      // 16a: aload 0
      // 16b: aload 6
      // 16d: invokespecial com/finalshell/core/Fh2.<init> (Lcom/finalshell/core/W3_6;Ljava/io/File;)V
      // 170: invokevirtual com/finalshell/core/H3_2.q (ZZZLcom/finalshell/core/HH_2;)V
      // 173: aload 0
      // 174: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 177: invokevirtual com/finalshell/core/D_6.r ()V
      // 17a: goto 189
      // 17d: astore 9
      // 17f: aload 0
      // 180: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 183: invokevirtual com/finalshell/core/D_6.r ()V
      // 186: aload 9
      // 188: athrow
      // 189: iinc 4 1
      // 18c: aload 2
      // 18d: ifnonnull 0c3
      // 190: aload 0
      // 191: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 194: new java/lang/StringBuilder
      // 197: dup
      // 198: invokespecial java/lang/StringBuilder.<init> ()V
      // 19b: sipush -16513
      // 19e: sipush -5726
      // 1a1: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 0
      // 1a8: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 1ab: invokeinterface java/util/List.size ()I 1
      // 1b0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1b3: sipush -16534
      // 1b6: sipush -24438
      // 1b9: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c2: invokevirtual com/finalshell/core/D_6.d (Ljava/lang/String;)V
      // 1c5: goto 202
      // 1c8: astore 10
      // 1ca: aload 0
      // 1cb: getfield com/finalshell/core/W3_6.I Lcom/finalshell/core/D_6;
      // 1ce: new java/lang/StringBuilder
      // 1d1: dup
      // 1d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d5: sipush -16518
      // 1d8: sipush -20702
      // 1db: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: aload 0
      // 1e2: getfield com/finalshell/core/W3_6.C Ljava/util/List;
      // 1e5: invokeinterface java/util/List.size ()I 1
      // 1ea: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ed: sipush -16537
      // 1f0: sipush -26084
      // 1f3: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fc: invokevirtual com/finalshell/core/D_6.d (Ljava/lang/String;)V
      // 1ff: aload 10
      // 201: athrow
      // 202: return
   }

   public RB w(String var1, InputStream var2, Charset var3) throws B2_5, IOException {
      RB var6;
      try {
         Hc2_2 var4 = new Hc2_2(var1, new InputStreamReader(var2, var3));
         HG var5 = new HG(var4);
         var5.Q(this.h);
         var5.S(this.l);
         this.I.u(b(-16543, 28249) + var1 + "\"");

         try {
            var6 = var5.X$RB();
         } finally {
            this.I.r();
         }
      } finally {
         var2.close();
      }

      return var6;
   }

   public static File k(String param0, File param1, @C_9 File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 26
      // 09: ifnull 27
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/io/File
      // 16: dup
      // 17: aload 2
      // 18: aload 0
      // 19: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 1c: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: areturn
      // 27: aload 0
      // 28: getstatic com/finalshell/core/W3_6.k J
      // 2b: l2i
      // 2c: invokevirtual java/lang/String.lastIndexOf (I)I
      // 2f: istore 4
      // 31: new java/io/File
      // 34: dup
      // 35: aload 1
      // 36: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 39: aload 0
      // 3a: iload 4
      // 3c: bipush 1
      // 3d: iadd
      // 3e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 41: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 44: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 47: areturn
   }

   public void Z(Cr2_2 param1, File param2) throws IOException {
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
      // 04: invokevirtual com/finalshell/core/Cr2_2.t ()Ljava/lang/String;
      // 07: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 0a: astore 4
      // 0c: astore 3
      // 0d: aload 0
      // 0e: getfield com/finalshell/core/W3_6.Z Lcom/finalshell/core/H_4;
      // 11: aload 3
      // 12: ifnull 2d
      // 15: getstatic com/finalshell/core/K_4.J Lcom/finalshell/core/H_4;
      // 18: if_acmpeq 58
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/W3_6.Z Lcom/finalshell/core/H_4;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: astore 5
      // 2f: getstatic com/finalshell/core/W3_6.f Z
      // 32: ifne 63
      // 35: aload 5
      // 37: aload 3
      // 38: ifnull 65
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: ifnonnull 63
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: new java/lang/AssertionError
      // 4f: dup
      // 50: invokespecial java/lang/AssertionError.<init> ()V
      // 53: athrow
      // 54: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: new com/finalshell/core/H7
      // 5b: dup
      // 5c: aload 0
      // 5d: aload 2
      // 5e: invokespecial com/finalshell/core/H7.<init> (Lcom/finalshell/core/W3_6;Ljava/io/File;)V
      // 61: astore 5
      // 63: aload 5
      // 65: aload 4
      // 67: invokeinterface com/finalshell/core/H_4.X (Ljava/lang/String;)Ljava/io/OutputStream; 2
      // 6c: astore 6
      // 6e: aload 1
      // 6f: aload 6
      // 71: invokevirtual com/finalshell/core/Cr2_2.Z (Ljava/io/OutputStream;)V
      // 74: aload 6
      // 76: aload 3
      // 77: ifnull 7f
      // 7a: ifnull fc
      // 7d: aload 6
      // 7f: invokevirtual java/io/OutputStream.close ()V
      // 82: goto fc
      // 85: astore 7
      // 87: goto fc
      // 8a: astore 7
      // 8c: aload 6
      // 8e: invokevirtual java/io/OutputStream.close ()V
      // 91: goto 96
      // 94: astore 8
      // 96: aconst_null
      // 97: astore 6
      // 99: aload 5
      // 9b: aload 4
      // 9d: invokeinterface com/finalshell/core/H_4.A (Ljava/lang/String;)Z 2
      // a2: ifne da
      // a5: new java/io/IOException
      // a8: dup
      // a9: new java/lang/StringBuilder
      // ac: dup
      // ad: invokespecial java/lang/StringBuilder.<init> ()V
      // b0: sipush -16544
      // b3: sipush -13394
      // b6: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bc: aload 4
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: ldc_w "\""
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ca: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // cd: astore 8
      // cf: aload 8
      // d1: aload 7
      // d3: invokevirtual java/io/IOException.initCause (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d6: pop
      // d7: aload 8
      // d9: athrow
      // da: aload 7
      // dc: athrow
      // dd: astore 9
      // df: aload 6
      // e1: aload 3
      // e2: ifnull f1
      // e5: ifnull f9
      // e8: goto ef
      // eb: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ee: athrow
      // ef: aload 6
      // f1: invokevirtual java/io/OutputStream.close ()V
      // f4: goto f9
      // f7: astore 10
      // f9: aload 9
      // fb: athrow
      // fc: return
   }

   public void P(C_L var1) {
      this.d = var1;
   }

   @Override
   public void U(boolean var1) {
      this.I = new D_6(var1);
   }

   public C_L y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnull 020
      // 009: getfield com/finalshell/core/W3_6.d Lcom/finalshell/core/C_L;
      // 00c: ifnull 01f
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: getfield com/finalshell/core/W3_6.d Lcom/finalshell/core/C_L;
      // 01a: areturn
      // 01b: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield com/finalshell/core/W3_6.V [Ljava/io/File;
      // 023: astore 3
      // 024: aload 3
      // 025: aload 1
      // 026: ifnull 052
      // 029: ifnonnull 051
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: sipush -16520
      // 036: sipush 29184
      // 039: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 03c: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 03f: astore 4
      // 041: aload 4
      // 043: ifnull 051
      // 046: aload 0
      // 047: aload 4
      // 049: invokestatic com/finalshell/core/N_5.H (Ljava/lang/String;)[Ljava/io/File;
      // 04c: dup
      // 04d: astore 3
      // 04e: putfield com/finalshell/core/W3_6.V [Ljava/io/File;
      // 051: aload 3
      // 052: ifnull 08f
      // 055: new com/finalshell/core/S2_3
      // 058: dup
      // 059: bipush 3
      // 05a: anewarray 445
      // 05d: dup
      // 05e: bipush 0
      // 05f: new com/finalshell/core/A_5
      // 062: dup
      // 063: aload 3
      // 064: invokespecial com/finalshell/core/A_5.<init> ([Ljava/io/File;)V
      // 067: aastore
      // 068: dup
      // 069: bipush 1
      // 06a: new com/finalshell/core/G_5
      // 06d: dup
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/W3_6.x [Ljava/io/File;
      // 072: invokespecial com/finalshell/core/G_5.<init> ([Ljava/io/File;)V
      // 075: aastore
      // 076: dup
      // 077: bipush 2
      // 078: new com/finalshell/core/A_5
      // 07b: dup
      // 07c: aload 0
      // 07d: getfield com/finalshell/core/W3_6.e [Ljava/io/File;
      // 080: invokespecial com/finalshell/core/A_5.<init> ([Ljava/io/File;)V
      // 083: aastore
      // 084: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 087: invokespecial com/finalshell/core/S2_3.<init> (Ljava/lang/Iterable;)V
      // 08a: astore 2
      // 08b: aload 1
      // 08c: ifnonnull 140
      // 08f: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 092: sipush -16533
      // 095: sipush 1670
      // 098: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 09b: invokevirtual java/lang/ClassLoader.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 09e: astore 4
      // 0a0: getstatic com/finalshell/core/W3_6.f Z
      // 0a3: aload 1
      // 0a4: ifnull 0cc
      // 0a7: ifne 0c9
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 4
      // 0b3: ifnonnull 0c9
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: new java/lang/AssertionError
      // 0c0: dup
      // 0c1: invokespecial java/lang/AssertionError.<init> ()V
      // 0c4: athrow
      // 0c5: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: getstatic com/finalshell/core/W3_6.f Z
      // 0cc: aload 1
      // 0cd: ifnull 0f2
      // 0d0: ifne 106
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: sipush -16515
      // 0dd: sipush 4113
      // 0e0: invokestatic com/finalshell/core/W3_6.b (II)Ljava/lang/String;
      // 0e3: aload 4
      // 0e5: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 0e8: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: ifne 106
      // 0f5: new java/lang/AssertionError
      // 0f8: dup
      // 0f9: aload 4
      // 0fb: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 0fe: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 101: athrow
      // 102: invokestatic com/finalshell/core/W3_6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: new com/finalshell/core/E_3_2
      // 109: dup
      // 10a: aload 0
      // 10b: invokespecial com/finalshell/core/E_3_2.<init> (Lcom/finalshell/core/W3_6;)V
      // 10e: astore 5
      // 110: new com/finalshell/core/S2_3
      // 113: dup
      // 114: bipush 3
      // 115: anewarray 113
      // 118: dup
      // 119: bipush 0
      // 11a: aload 5
      // 11c: aastore
      // 11d: dup
      // 11e: bipush 1
      // 11f: new com/finalshell/core/G_5
      // 122: dup
      // 123: aload 0
      // 124: getfield com/finalshell/core/W3_6.x [Ljava/io/File;
      // 127: invokespecial com/finalshell/core/G_5.<init> ([Ljava/io/File;)V
      // 12a: aastore
      // 12b: dup
      // 12c: bipush 2
      // 12d: new com/finalshell/core/A_5
      // 130: dup
      // 131: aload 0
      // 132: getfield com/finalshell/core/W3_6.e [Ljava/io/File;
      // 135: invokespecial com/finalshell/core/A_5.<init> ([Ljava/io/File;)V
      // 138: aastore
      // 139: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 13c: invokespecial com/finalshell/core/S2_3.<init> (Ljava/lang/Iterable;)V
      // 13f: astore 2
      // 140: aload 0
      // 141: new com/finalshell/core/C_V
      // 144: dup
      // 145: aload 2
      // 146: aconst_null
      // 147: invokespecial com/finalshell/core/C_V.<init> (Lcom/finalshell/core/J_5;Lcom/finalshell/core/C_L;)V
      // 14a: dup_x1
      // 14b: putfield com/finalshell/core/W3_6.d Lcom/finalshell/core/C_L;
      // 14e: areturn
   }

   public static Logger t() {
      return M;
   }

   public static List o(W3_6 var0) {
      return var0.C;
   }

   public static RB Y(W3_6 var0, String var1, InputStream var2, Charset var3) throws B2_5, IOException {
      return var0.w(var1, var2, var3);
   }

   public static EnumSet N(W3_6 var0) {
      return var0.p;
   }

   public static D_6 w(W3_6 var0) {
      return var0.I;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -16535) & 65535;
      if (j[var2] == null) {
         char[] var3 = i[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 217;
               break;
            case 1:
               var10000 = 92;
               break;
            case 2:
               var10000 = 54;
               break;
            case 3:
               var10000 = 134;
               break;
            case 4:
               var10000 = 107;
               break;
            case 5:
               var10000 = 223;
               break;
            case 6:
               var10000 = 64;
               break;
            case 7:
               var10000 = 112;
               break;
            case 8:
               var10000 = 29;
               break;
            case 9:
               var10000 = 166;
               break;
            case 10:
               var10000 = 247;
               break;
            case 11:
               var10000 = 94;
               break;
            case 12:
               var10000 = 23;
               break;
            case 13:
               var10000 = 66;
               break;
            case 14:
               var10000 = 148;
               break;
            case 15:
               var10000 = 139;
               break;
            case 16:
               var10000 = 30;
               break;
            case 17:
               var10000 = 104;
               break;
            case 18:
               var10000 = 111;
               break;
            case 19:
               var10000 = 48;
               break;
            case 20:
               var10000 = 87;
               break;
            case 21:
               var10000 = 3;
               break;
            case 22:
               var10000 = 96;
               break;
            case 23:
               var10000 = 123;
               break;
            case 24:
               var10000 = 213;
               break;
            case 25:
               var10000 = 26;
               break;
            case 26:
               var10000 = 51;
               break;
            case 27:
               var10000 = 20;
               break;
            case 28:
               var10000 = 19;
               break;
            case 29:
               var10000 = 84;
               break;
            case 30:
               var10000 = 147;
               break;
            case 31:
               var10000 = 205;
               break;
            case 32:
               var10000 = 150;
               break;
            case 33:
               var10000 = 202;
               break;
            case 34:
               var10000 = 86;
               break;
            case 35:
               var10000 = 189;
               break;
            case 36:
               var10000 = 80;
               break;
            case 37:
               var10000 = 153;
               break;
            case 38:
               var10000 = 178;
               break;
            case 39:
               var10000 = 210;
               break;
            case 40:
               var10000 = 225;
               break;
            case 41:
               var10000 = 50;
               break;
            case 42:
               var10000 = 49;
               break;
            case 43:
               var10000 = 103;
               break;
            case 44:
               var10000 = 163;
               break;
            case 45:
               var10000 = 15;
               break;
            case 46:
               var10000 = 35;
               break;
            case 47:
               var10000 = 58;
               break;
            case 48:
               var10000 = 12;
               break;
            case 49:
               var10000 = 75;
               break;
            case 50:
               var10000 = 82;
               break;
            case 51:
               var10000 = 5;
               break;
            case 52:
               var10000 = 184;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 227;
               break;
            case 55:
               var10000 = 41;
               break;
            case 56:
               var10000 = 215;
               break;
            case 57:
               var10000 = 17;
               break;
            case 58:
               var10000 = 7;
               break;
            case 59:
               var10000 = 63;
               break;
            case 60:
               var10000 = 57;
               break;
            case 61:
               var10000 = 33;
               break;
            case 62:
               var10000 = 188;
               break;
            case 63:
               var10000 = 195;
               break;
            case 64:
               var10000 = 241;
               break;
            case 65:
               var10000 = 146;
               break;
            case 66:
               var10000 = 11;
               break;
            case 67:
               var10000 = 160;
               break;
            case 68:
               var10000 = 70;
               break;
            case 69:
               var10000 = 37;
               break;
            case 70:
               var10000 = 255;
               break;
            case 71:
               var10000 = 168;
               break;
            case 72:
               var10000 = 46;
               break;
            case 73:
               var10000 = 158;
               break;
            case 74:
               var10000 = 171;
               break;
            case 75:
               var10000 = 32;
               break;
            case 76:
               var10000 = 132;
               break;
            case 77:
               var10000 = 1;
               break;
            case 78:
               var10000 = 226;
               break;
            case 79:
               var10000 = 34;
               break;
            case 80:
               var10000 = 122;
               break;
            case 81:
               var10000 = 159;
               break;
            case 82:
               var10000 = 170;
               break;
            case 83:
               var10000 = 83;
               break;
            case 84:
               var10000 = 169;
               break;
            case 85:
               var10000 = 78;
               break;
            case 86:
               var10000 = 2;
               break;
            case 87:
               var10000 = 124;
               break;
            case 88:
               var10000 = 221;
               break;
            case 89:
               var10000 = 145;
               break;
            case 90:
               var10000 = 157;
               break;
            case 91:
               var10000 = 71;
               break;
            case 92:
               var10000 = 143;
               break;
            case 93:
               var10000 = 238;
               break;
            case 94:
               var10000 = 231;
               break;
            case 95:
               var10000 = 102;
               break;
            case 96:
               var10000 = 99;
               break;
            case 97:
               var10000 = 88;
               break;
            case 98:
               var10000 = 239;
               break;
            case 99:
               var10000 = 108;
               break;
            case 100:
               var10000 = 204;
               break;
            case 101:
               var10000 = 116;
               break;
            case 102:
               var10000 = 85;
               break;
            case 103:
               var10000 = 133;
               break;
            case 104:
               var10000 = 216;
               break;
            case 105:
               var10000 = 229;
               break;
            case 106:
               var10000 = 201;
               break;
            case 107:
               var10000 = 129;
               break;
            case 108:
               var10000 = 243;
               break;
            case 109:
               var10000 = 234;
               break;
            case 110:
               var10000 = 22;
               break;
            case 111:
               var10000 = 165;
               break;
            case 112:
               var10000 = 8;
               break;
            case 113:
               var10000 = 203;
               break;
            case 114:
               var10000 = 167;
               break;
            case 115:
               var10000 = 16;
               break;
            case 116:
               var10000 = 174;
               break;
            case 117:
               var10000 = 211;
               break;
            case 118:
               var10000 = 161;
               break;
            case 119:
               var10000 = 242;
               break;
            case 120:
               var10000 = 140;
               break;
            case 121:
               var10000 = 65;
               break;
            case 122:
               var10000 = 172;
               break;
            case 123:
               var10000 = 120;
               break;
            case 124:
               var10000 = 101;
               break;
            case 125:
               var10000 = 179;
               break;
            case 126:
               var10000 = 43;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 183;
               break;
            case 129:
               var10000 = 164;
               break;
            case 130:
               var10000 = 36;
               break;
            case 131:
               var10000 = 10;
               break;
            case 132:
               var10000 = 199;
               break;
            case 133:
               var10000 = 253;
               break;
            case 134:
               var10000 = 152;
               break;
            case 135:
               var10000 = 249;
               break;
            case 136:
               var10000 = 115;
               break;
            case 137:
               var10000 = 252;
               break;
            case 138:
               var10000 = 209;
               break;
            case 139:
               var10000 = 187;
               break;
            case 140:
               var10000 = 141;
               break;
            case 141:
               var10000 = 27;
               break;
            case 142:
               var10000 = 72;
               break;
            case 143:
               var10000 = 194;
               break;
            case 144:
               var10000 = 214;
               break;
            case 145:
               var10000 = 220;
               break;
            case 146:
               var10000 = 42;
               break;
            case 147:
               var10000 = 95;
               break;
            case 148:
               var10000 = 125;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 38;
               break;
            case 151:
               var10000 = 192;
               break;
            case 152:
               var10000 = 0;
               break;
            case 153:
               var10000 = 59;
               break;
            case 154:
               var10000 = 212;
               break;
            case 155:
               var10000 = 39;
               break;
            case 156:
               var10000 = 228;
               break;
            case 157:
               var10000 = 186;
               break;
            case 158:
               var10000 = 52;
               break;
            case 159:
               var10000 = 130;
               break;
            case 160:
               var10000 = 233;
               break;
            case 161:
               var10000 = 135;
               break;
            case 162:
               var10000 = 222;
               break;
            case 163:
               var10000 = 250;
               break;
            case 164:
               var10000 = 77;
               break;
            case 165:
               var10000 = 118;
               break;
            case 166:
               var10000 = 81;
               break;
            case 167:
               var10000 = 91;
               break;
            case 168:
               var10000 = 114;
               break;
            case 169:
               var10000 = 89;
               break;
            case 170:
               var10000 = 246;
               break;
            case 171:
               var10000 = 4;
               break;
            case 172:
               var10000 = 177;
               break;
            case 173:
               var10000 = 200;
               break;
            case 174:
               var10000 = 191;
               break;
            case 175:
               var10000 = 180;
               break;
            case 176:
               var10000 = 182;
               break;
            case 177:
               var10000 = 197;
               break;
            case 178:
               var10000 = 151;
               break;
            case 179:
               var10000 = 206;
               break;
            case 180:
               var10000 = 196;
               break;
            case 181:
               var10000 = 208;
               break;
            case 182:
               var10000 = 47;
               break;
            case 183:
               var10000 = 119;
               break;
            case 184:
               var10000 = 90;
               break;
            case 185:
               var10000 = 74;
               break;
            case 186:
               var10000 = 40;
               break;
            case 187:
               var10000 = 109;
               break;
            case 188:
               var10000 = 105;
               break;
            case 189:
               var10000 = 232;
               break;
            case 190:
               var10000 = 138;
               break;
            case 191:
               var10000 = 31;
               break;
            case 192:
               var10000 = 155;
               break;
            case 193:
               var10000 = 62;
               break;
            case 194:
               var10000 = 136;
               break;
            case 195:
               var10000 = 21;
               break;
            case 196:
               var10000 = 100;
               break;
            case 197:
               var10000 = 254;
               break;
            case 198:
               var10000 = 69;
               break;
            case 199:
               var10000 = 251;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 56;
               break;
            case 202:
               var10000 = 25;
               break;
            case 203:
               var10000 = 237;
               break;
            case 204:
               var10000 = 13;
               break;
            case 205:
               var10000 = 207;
               break;
            case 206:
               var10000 = 198;
               break;
            case 207:
               var10000 = 193;
               break;
            case 208:
               var10000 = 149;
               break;
            case 209:
               var10000 = 67;
               break;
            case 210:
               var10000 = 14;
               break;
            case 211:
               var10000 = 127;
               break;
            case 212:
               var10000 = 55;
               break;
            case 213:
               var10000 = 144;
               break;
            case 214:
               var10000 = 240;
               break;
            case 215:
               var10000 = 131;
               break;
            case 216:
               var10000 = 121;
               break;
            case 217:
               var10000 = 230;
               break;
            case 218:
               var10000 = 236;
               break;
            case 219:
               var10000 = 24;
               break;
            case 220:
               var10000 = 218;
               break;
            case 221:
               var10000 = 248;
               break;
            case 222:
               var10000 = 117;
               break;
            case 223:
               var10000 = 6;
               break;
            case 224:
               var10000 = 176;
               break;
            case 225:
               var10000 = 244;
               break;
            case 226:
               var10000 = 137;
               break;
            case 227:
               var10000 = 175;
               break;
            case 228:
               var10000 = 113;
               break;
            case 229:
               var10000 = 97;
               break;
            case 230:
               var10000 = 9;
               break;
            case 231:
               var10000 = 44;
               break;
            case 232:
               var10000 = 79;
               break;
            case 233:
               var10000 = 106;
               break;
            case 234:
               var10000 = 126;
               break;
            case 235:
               var10000 = 162;
               break;
            case 236:
               var10000 = 110;
               break;
            case 237:
               var10000 = 61;
               break;
            case 238:
               var10000 = 53;
               break;
            case 239:
               var10000 = 245;
               break;
            case 240:
               var10000 = 128;
               break;
            case 241:
               var10000 = 73;
               break;
            case 242:
               var10000 = 154;
               break;
            case 243:
               var10000 = 181;
               break;
            case 244:
               var10000 = 60;
               break;
            case 245:
               var10000 = 224;
               break;
            case 246:
               var10000 = 68;
               break;
            case 247:
               var10000 = 45;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 28;
               break;
            case 250:
               var10000 = 18;
               break;
            case 251:
               var10000 = 76;
               break;
            case 252:
               var10000 = 185;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 142;
               break;
            default:
               var10000 = 98;
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

         j[var2] = new String(var3).intern();
      }

      return j[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var13;
      char[] var25;
      String[] var7 = new String[25];
      int var5 = 0;
      String var4 = ")\u0006C\u0013xr=Vn\u000fP\u0097ï5ä\f6f9öü·\u0014ã\u0086\u008b\u0000agZ7\u0018M;Ê\u0087E#ºÛ\u0001¯&\u0093-peQ\u0084bÆ \u0086\u0085b 2pÑ\b\u0015¾Èv<v£\"\u0086\u00adìOTÔ\u0018\r\u0016\rÙÜÓ0\u0014¦\u007f¿O÷}}ï\u0099\u0001>}|\u008e\u0016\u009d\u0014\u007f}\u0088\tßÇâ¯\u0088ý@©åè\u0084îkuØå\u0007OÕ¿Â\u008c º\u0015ac¿\u0015¿yÙ\u008a^è%\u0083,6m¦Þ\u00ad\u0087r\u0000\u000fÅJñ{ ¹W+9wÞ¿Ñöm\u000b\u0016$¢°Ð\u0000>ËÃ_\u0099\t\u0012\u0089FË¡E\u001cYk2.~·åu2#\u007fòa\u0004QK\u008d\u008e\\'ï\u0092\u0095\u0095¢\u0001Ôÿ3\u001cûAÿ%mhª6¸\u0013Òf.í\\ñ÷iw×\u00800\u0089GÎ<°\f\u000f«§'|çìKÖ\u008bâ]¶&A.i\u001aáã\u0011Ë&\u0010Dê¶¸y±~\u000fVoF\u009d\u0018ýò»\u0007\u009fL¥â1Ùv©ã!\u0087¼à\u009bqáB´Ý\u0092\u0018¼é2\u008a\u001c\u001c\u0014Qè\u001c\u0088Þ7&\u0084k¼\u001aºº\u008c\u0004\u0098Ñ\u000bà@Ì\u009fÿ\u0085\u0014\u009bQ\b8o²~ôÍ\u000fü\næ\rº÷U\u008cÌ¦ÒÝ\u0014KÉ\u000e\u009f\u000f\u0015øõË¶(ÀèÅ%K_Á^s\u000bwQlRøþóà°\u0011\u0002\n\u0018v\u0081¶Eb^{@}\u0013$ÏÛÈ\u0086Ò\u009aÞ¾n\u0094\u009fOÆ¨ô³Po\u0007¤(Vj¥_X\tV¶ à\u0081A\u001aßë\u0003Ø\u0090d\u0017nK.\u008e¬S½\u009b\u0015\u001amV-L\u0016q«àpÌ\u008dL¿\tðÚtm\u001bðIé\u0081";
      int var6 = ")\u0006C\u0013xr=Vn\u000fP\u0097ï5ä\f6f9öü·\u0014ã\u0086\u008b\u0000agZ7\u0018M;Ê\u0087E#ºÛ\u0001¯&\u0093-peQ\u0084bÆ \u0086\u0085b 2pÑ\b\u0015¾Èv<v£\"\u0086\u00adìOTÔ\u0018\r\u0016\rÙÜÓ0\u0014¦\u007f¿O÷}}ï\u0099\u0001>}|\u008e\u0016\u009d\u0014\u007f}\u0088\tßÇâ¯\u0088ý@©åè\u0084îkuØå\u0007OÕ¿Â\u008c º\u0015ac¿\u0015¿yÙ\u008a^è%\u0083,6m¦Þ\u00ad\u0087r\u0000\u000fÅJñ{ ¹W+9wÞ¿Ñöm\u000b\u0016$¢°Ð\u0000>ËÃ_\u0099\t\u0012\u0089FË¡E\u001cYk2.~·åu2#\u007fòa\u0004QK\u008d\u008e\\'ï\u0092\u0095\u0095¢\u0001Ôÿ3\u001cûAÿ%mhª6¸\u0013Òf.í\\ñ÷iw×\u00800\u0089GÎ<°\f\u000f«§'|çìKÖ\u008bâ]¶&A.i\u001aáã\u0011Ë&\u0010Dê¶¸y±~\u000fVoF\u009d\u0018ýò»\u0007\u009fL¥â1Ùv©ã!\u0087¼à\u009bqáB´Ý\u0092\u0018¼é2\u008a\u001c\u001c\u0014Qè\u001c\u0088Þ7&\u0084k¼\u001aºº\u008c\u0004\u0098Ñ\u000bà@Ì\u009fÿ\u0085\u0014\u009bQ\b8o²~ôÍ\u000fü\næ\rº÷U\u008cÌ¦ÒÝ\u0014KÉ\u000e\u009f\u000f\u0015øõË¶(ÀèÅ%K_Á^s\u000bwQlRøþóà°\u0011\u0002\n\u0018v\u0081¶Eb^{@}\u0013$ÏÛÈ\u0086Ò\u009aÞ¾n\u0094\u009fOÆ¨ô³Po\u0007¤(Vj¥_X\tV¶ à\u0081A\u001aßë\u0003Ø\u0090d\u0017nK.\u008e¬S½\u009b\u0015\u001amV-L\u0016q«àpÌ\u008dL¿\tðÚtm\u001bðIé\u0081"
         .length();
      char var3 = 18;
      int var11 = -1;

      label70:
      while (true) {
         byte var10000 = 11;
         String var10001 = var4.substring(++var11, var11 + var3);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var8 = 0;
               byte var33 = var10000;
               var25 = var30;
               int var18 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var30;
                  var38 = var10000;
                  var10006 = var8;
               } else {
                  var33 = var10000;
                  var18 = var10004;
                  if (var10004 <= var8) {
                     break label65;
                  }

                  var42 = var30;
                  var38 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var51 = var42[var10006];
                  byte var52;
                  switch (var8 % 7) {
                     case 0:
                        var52 = 49;
                        break;
                     case 1:
                        var52 = 110;
                        break;
                     case 2:
                        var52 = 96;
                        break;
                     case 3:
                        var52 = 99;
                        break;
                     case 4:
                        var52 = 90;
                        break;
                     case 5:
                        var52 = 73;
                        break;
                     default:
                        var52 = 42;
                  }

                  var42[var10006] = (char)(var51 ^ var38 ^ var52);
                  var8++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var42 = var25;
                     var38 = var33;
                  } else {
                     if (var18 <= var8) {
                        break;
                     }

                     var42 = var25;
                     var38 = var33;
                     var10006 = var8;
                  }
               }
            }

            String var35 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var35;
                  if ((var11 += var3) >= var6) {
                     i = var7;
                     j = new String[25];
                     long var0 = 7445757312278716810L;
                     long var29 = -5566181260136291932L ^ var0;
                     byte var20 = -1;
                     k = var29;

                     label43: {
                        try {
                           if (!W3_6.class.desiredAssertionStatus()) {
                              var13 = true;
                              break label43;
                           }
                        } catch (P_5 var9) {
                           throw a(var9);
                        }

                        var13 = false;
                     }

                     f = var13;
                     M = Logger.getLogger(W3_6.class.getName());
                     E = X_5.u;
                     return;
                  }

                  var3 = var4.charAt(var11);
                  break;
               default:
                  var7[var5++] = var35;
                  if ((var11 += var3) < var6) {
                     var3 = var4.charAt(var11);
                     continue label70;
                  }

                  var4 = "e\u0015\u0018JHÊñz\u0082>ãz»óÏ\f¿\u0012«äÞöö9)%\u0087\u001f";
                  var6 = "e\u0015\u0018JHÊñz\u0082>ãz»óÏ\f¿\u0012«äÞöö9)%\u0087\u001f".length();
                  var3 = 15;
                  var11 = -1;
            }

            var10000 = 95;
            var10001 = var4.substring(++var11, var11 + var3);
            var10002 = 0;
         }
      }
   }
}





