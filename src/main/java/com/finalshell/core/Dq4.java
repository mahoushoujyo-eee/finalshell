package com.finalshell.core;

import java.util.Hashtable;

public class Dq4 extends Dm4 {
   public static byte[] P;
   protected boolean h = false;
   protected boolean L = false;
   protected Hashtable F = null;
   protected boolean A = false;
   protected String l = b(-27814, 31169);
   protected int J = b(2166, 5128603885367188867L);
   protected int u = b(16308, 7364915286531238477L);
   protected int R = b(26919, 54329701606341853L);
   protected int M = b(29423, 7628090627876595472L);
   protected byte[] D = null;
   public static String[] cb;
   public static String[] db;
   public static long[] jb;
   public static Integer[] kb;

   Dq4() {
      this.Y = P;
      this.o = new Cs4();
   }

   public void y(boolean var1) {
      this.h = var1;
   }

   @Override
   public void R(boolean var1) {
      this.L = var1;
   }

   @Deprecated
   public void F(Hashtable var1) {
      synchronized (this) {
         this.F = var1;
      }
   }

   public void o(String var1, String var2) {
      this.C(E8.J(var1), E8.J(var2));
   }

   public void C(byte[] var1, byte[] var2) {
      synchronized (this) {
         this.A().put(var1, var2);
      }
   }

   public Hashtable A() {
      boolean var1 = Dm4.J$boolean();
      Hashtable var10000 = this.F;
      if (!var1) {
         if (this.F == null) {
            this.F = new Hashtable();
         }

         var10000 = this.F;
      }

      return var10000;
   }

   public void u(boolean var1) {
      this.A = var1;
   }

   public void P(byte[] var1) {
      this.D = var1;
   }

   public void F(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: aload 0
      // 05: getfield com/finalshell/core/Dq4.l Ljava/lang/String;
      // 08: iload 1
      // 09: iload 2
      // 0a: iload 3
      // 0b: iload 4
      // 0d: invokevirtual com/finalshell/core/Dq4.d (Ljava/lang/String;IIII)V
      // 10: istore 5
      // 12: aload 0
      // 13: getfield com/finalshell/core/Dq4.A Z
      // 16: iload 5
      // 18: ifeq 30
      // 1b: ifeq 33
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual com/finalshell/core/Dq4.L ()Z
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: ifne 34
      // 33: return
      // 34: new com/finalshell/core/Qk2
      // 37: dup
      // 38: invokespecial com/finalshell/core/Qk2.<init> ()V
      // 3b: astore 6
      // 3d: aload 6
      // 3f: iload 1
      // 40: iload 2
      // 41: iload 3
      // 42: iload 4
      // 44: invokevirtual com/finalshell/core/Qk2.u (IIII)V
      // 47: aload 6
      // 49: aload 0
      // 4a: invokevirtual com/finalshell/core/Dq4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 4d: aload 0
      // 4e: invokevirtual com/finalshell/core/Qk2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 51: goto 56
      // 54: astore 6
      // 56: return
   }

   public void b(String var1) {
      this.d(var1, b(24738, 2517825788331832671L), b(11171, 4193680352028589663L), b(21466, 1763833717891991084L), b(15206, 3162426995749383832L));
   }

   public void d(String var1, int var2, int var3, int var4, int var5) {
      this.l = var1;
      this.J = var2;
      this.u = var3;
      this.R = var4;
      this.M = var5;
   }

   protected void T() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: invokevirtual com/finalshell/core/Dq4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 007: astore 2
      // 008: istore 1
      // 009: aload 0
      // 00a: getfield com/finalshell/core/Dq4.h Z
      // 00d: iload 1
      // 00e: ifne 02d
      // 011: ifeq 029
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: new com/finalshell/core/Qf2
      // 01e: dup
      // 01f: invokespecial com/finalshell/core/Qf2.<init> ()V
      // 022: astore 3
      // 023: aload 3
      // 024: aload 2
      // 025: aload 0
      // 026: invokevirtual com/finalshell/core/Qi2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 029: aload 0
      // 02a: getfield com/finalshell/core/Dq4.L Z
      // 02d: iload 1
      // 02e: ifne 058
      // 031: ifeq 049
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: new com/finalshell/core/Qc2_2
      // 03e: dup
      // 03f: invokespecial com/finalshell/core/Qc2_2.<init> ()V
      // 042: astore 3
      // 043: aload 3
      // 044: aload 2
      // 045: aload 0
      // 046: invokevirtual com/finalshell/core/Qi2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 049: aload 0
      // 04a: iload 1
      // 04b: ifne 0b0
      // 04e: getfield com/finalshell/core/Dq4.A Z
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: ifeq 0af
      // 05b: new com/finalshell/core/QV
      // 05e: dup
      // 05f: invokespecial com/finalshell/core/QV.<init> ()V
      // 062: astore 3
      // 063: aload 3
      // 064: checkcast com/finalshell/core/QV
      // 067: aload 0
      // 068: getfield com/finalshell/core/Dq4.l Ljava/lang/String;
      // 06b: invokevirtual com/finalshell/core/QV.A (Ljava/lang/String;)V
      // 06e: aload 3
      // 06f: checkcast com/finalshell/core/QV
      // 072: iload 1
      // 073: ifne 0aa
      // 076: aload 0
      // 077: getfield com/finalshell/core/Dq4.J I
      // 07a: aload 0
      // 07b: getfield com/finalshell/core/Dq4.u I
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/Dq4.R I
      // 082: aload 0
      // 083: getfield com/finalshell/core/Dq4.M I
      // 086: invokevirtual com/finalshell/core/QV.K (IIII)V
      // 089: aload 0
      // 08a: getfield com/finalshell/core/Dq4.D [B
      // 08d: ifnull 0a9
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 3
      // 098: checkcast com/finalshell/core/QV
      // 09b: aload 0
      // 09c: getfield com/finalshell/core/Dq4.D [B
      // 09f: invokevirtual com/finalshell/core/QV.b ([B)V
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 3
      // 0aa: aload 2
      // 0ab: aload 0
      // 0ac: invokevirtual com/finalshell/core/Qi2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 0af: aload 0
      // 0b0: getfield com/finalshell/core/Dq4.F Ljava/util/Hashtable;
      // 0b3: iload 1
      // 0b4: ifne 0cc
      // 0b7: ifnull 11a
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield com/finalshell/core/Dq4.F Ljava/util/Hashtable;
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: invokevirtual java/util/Hashtable.keys ()Ljava/util/Enumeration;
      // 0cf: astore 4
      // 0d1: aload 4
      // 0d3: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0d8: ifeq 11a
      // 0db: aload 4
      // 0dd: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0e2: checkcast [B
      // 0e5: astore 5
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/core/Dq4.F Ljava/util/Hashtable;
      // 0eb: aload 5
      // 0ed: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f0: checkcast [B
      // 0f3: astore 6
      // 0f5: new com/finalshell/core/Q8_2
      // 0f8: dup
      // 0f9: invokespecial com/finalshell/core/Q8_2.<init> ()V
      // 0fc: astore 3
      // 0fd: aload 3
      // 0fe: checkcast com/finalshell/core/Q8_2
      // 101: aload 0
      // 102: aload 5
      // 104: invokespecial com/finalshell/core/Dq4.P (Ljava/lang/Object;)[B
      // 107: aload 0
      // 108: aload 6
      // 10a: invokespecial com/finalshell/core/Dq4.P (Ljava/lang/Object;)[B
      // 10d: invokevirtual com/finalshell/core/Q8_2.r ([B[B)V
      // 110: aload 3
      // 111: aload 2
      // 112: aload 0
      // 113: invokevirtual com/finalshell/core/Qi2.Q (Lcom/finalshell/crypto/ConnectHost;Lcom/finalshell/core/Dm4;)V
      // 116: iload 1
      // 117: ifeq 0d1
      // 11a: return
   }

   public byte[] P(Object var1) {
      boolean var2 = Dm4.F$boolean();
      Object var10000 = var1;
      if (var2) {
         if (var1 instanceof String) {
            return E8.J((String)var1);
         }

         var10000 = var1;
      }

      return (byte[])var10000;
   }

   @Override
   void S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: new com/finalshell/core/UJ
      // 006: dup
      // 007: aload 0
      // 008: getfield com/finalshell/core/Dq4.c I
      // 00b: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 00e: astore 2
      // 00f: new com/finalshell/core/YU
      // 012: dup
      // 013: aload 2
      // 014: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 017: astore 3
      // 018: bipush -1
      // 019: istore 4
      // 01b: istore 1
      // 01c: aload 0
      // 01d: invokevirtual com/finalshell/core/Dq4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 020: astore 5
      // 022: aload 0
      // 023: invokevirtual com/finalshell/core/Dq4.L ()Z
      // 026: ifeq 136
      // 029: aload 0
      // 02a: iload 1
      // 02b: ifne 047
      // 02e: getfield com/finalshell/core/Dq4.Z Ljava/lang/Thread;
      // 031: iload 1
      // 032: ifne 13f
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: ifnull 136
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/finalshell/core/Dq4.o Lcom/finalshell/core/Cs4;
      // 04a: iload 1
      // 04b: ifne 063
      // 04e: ifnull 136
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 0
      // 059: getfield com/finalshell/core/Dq4.o Lcom/finalshell/core/Cs4;
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 066: iload 1
      // 067: ifne 082
      // 06a: ifnull 136
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: getfield com/finalshell/core/Dq4.o Lcom/finalshell/core/Cs4;
      // 078: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: aload 2
      // 083: getfield com/finalshell/core/UJ.g [B
      // 086: sipush 19024
      // 089: ldc2_w 8528815768338931624
      // 08c: invokestatic com/finalshell/core/Dq4.b (IJ)I
      // 08f: aload 2
      // 090: getfield com/finalshell/core/UJ.g [B
      // 093: arraylength
      // 094: sipush 15867
      // 097: ldc2_w 5830483908657309696
      // 09a: invokestatic com/finalshell/core/Dq4.b (IJ)I
      // 09d: isub
      // 09e: aload 5
      // 0a0: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 0a3: isub
      // 0a4: invokevirtual java/io/InputStream.read ([BII)I
      // 0a7: istore 4
      // 0a9: iload 4
      // 0ab: iload 1
      // 0ac: ifne 0c6
      // 0af: ifne 0c4
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: iload 1
      // 0ba: ifeq 022
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: iload 4
      // 0c6: iload 1
      // 0c7: ifne 0ef
      // 0ca: bipush -1
      // 0cb: if_icmpne 0e4
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: invokevirtual com/finalshell/core/Dq4.F ()V
      // 0d9: iload 1
      // 0da: ifeq 136
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield com/finalshell/core/Dq4.S Z
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: ifeq 0fd
      // 0f2: iload 1
      // 0f3: ifeq 136
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 3
      // 0fe: invokevirtual com/finalshell/core/YU.M ()V
      // 101: aload 2
      // 102: sipush 5850
      // 105: ldc2_w 3399367321310544685
      // 108: invokestatic com/finalshell/core/Dq4.b (IJ)I
      // 10b: invokevirtual com/finalshell/core/UJ.V (B)V
      // 10e: aload 2
      // 10f: aload 0
      // 110: getfield com/finalshell/core/Dq4.V I
      // 113: invokevirtual com/finalshell/core/UJ.u (I)V
      // 116: aload 2
      // 117: iload 4
      // 119: invokevirtual com/finalshell/core/UJ.u (I)V
      // 11c: aload 2
      // 11d: iload 4
      // 11f: invokevirtual com/finalshell/core/UJ.S (I)V
      // 122: aload 5
      // 124: aload 3
      // 125: aload 0
      // 126: iload 4
      // 128: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // 12b: iload 1
      // 12c: ifeq 022
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: goto 13b
      // 139: astore 5
      // 13b: aload 0
      // 13c: getfield com/finalshell/core/Dq4.Z Ljava/lang/Thread;
      // 13f: astore 5
      // 141: iload 1
      // 142: ifne 16f
      // 145: aload 5
      // 147: ifnull 16a
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/Dq4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: aload 5
      // 153: dup
      // 154: astore 6
      // 156: monitorenter
      // 157: aload 5
      // 159: invokevirtual java/lang/Object.notifyAll ()V
      // 15c: aload 6
      // 15e: monitorexit
      // 15f: goto 16a
      // 162: astore 7
      // 164: aload 6
      // 166: monitorexit
      // 167: aload 7
      // 169: athrow
      // 16a: aload 0
      // 16b: aconst_null
      // 16c: putfield com/finalshell/core/Dq4.Z Ljava/lang/Thread;
      // 16f: return
   }

   static {
      __vfClinit__();
   }

   public static Exception c(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -27814) & 65535;
      if (db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 157;
               break;
            case 1:
               var10000 = 194;
               break;
            case 2:
               var10000 = 148;
               break;
            case 3:
               var10000 = 209;
               break;
            case 4:
               var10000 = 87;
               break;
            case 5:
               var10000 = 214;
               break;
            case 6:
               var10000 = 248;
               break;
            case 7:
               var10000 = 205;
               break;
            case 8:
               var10000 = 113;
               break;
            case 9:
               var10000 = 27;
               break;
            case 10:
               var10000 = 48;
               break;
            case 11:
               var10000 = 17;
               break;
            case 12:
               var10000 = 128;
               break;
            case 13:
               var10000 = 167;
               break;
            case 14:
               var10000 = 51;
               break;
            case 15:
               var10000 = 212;
               break;
            case 16:
               var10000 = 219;
               break;
            case 17:
               var10000 = 208;
               break;
            case 18:
               var10000 = 139;
               break;
            case 19:
               var10000 = 202;
               break;
            case 20:
               var10000 = 6;
               break;
            case 21:
               var10000 = 195;
               break;
            case 22:
               var10000 = 95;
               break;
            case 23:
               var10000 = 88;
               break;
            case 24:
               var10000 = 160;
               break;
            case 25:
               var10000 = 100;
               break;
            case 26:
               var10000 = 233;
               break;
            case 27:
               var10000 = 55;
               break;
            case 28:
               var10000 = 107;
               break;
            case 29:
               var10000 = 150;
               break;
            case 30:
               var10000 = 193;
               break;
            case 31:
               var10000 = 81;
               break;
            case 32:
               var10000 = 177;
               break;
            case 33:
               var10000 = 59;
               break;
            case 34:
               var10000 = 110;
               break;
            case 35:
               var10000 = 4;
               break;
            case 36:
               var10000 = 101;
               break;
            case 37:
               var10000 = 229;
               break;
            case 38:
               var10000 = 94;
               break;
            case 39:
               var10000 = 34;
               break;
            case 40:
               var10000 = 211;
               break;
            case 41:
               var10000 = 21;
               break;
            case 42:
               var10000 = 142;
               break;
            case 43:
               var10000 = 24;
               break;
            case 44:
               var10000 = 234;
               break;
            case 45:
               var10000 = 123;
               break;
            case 46:
               var10000 = 178;
               break;
            case 47:
               var10000 = 92;
               break;
            case 48:
               var10000 = 56;
               break;
            case 49:
               var10000 = 161;
               break;
            case 50:
               var10000 = 221;
               break;
            case 51:
               var10000 = 116;
               break;
            case 52:
               var10000 = 11;
               break;
            case 53:
               var10000 = 179;
               break;
            case 54:
               var10000 = 185;
               break;
            case 55:
               var10000 = 63;
               break;
            case 56:
               var10000 = 18;
               break;
            case 57:
               var10000 = 119;
               break;
            case 58:
               var10000 = 199;
               break;
            case 59:
               var10000 = 54;
               break;
            case 60:
               var10000 = 151;
               break;
            case 61:
               var10000 = 238;
               break;
            case 62:
               var10000 = 181;
               break;
            case 63:
               var10000 = 78;
               break;
            case 64:
               var10000 = 114;
               break;
            case 65:
               var10000 = 111;
               break;
            case 66:
               var10000 = 77;
               break;
            case 67:
               var10000 = 232;
               break;
            case 68:
               var10000 = 90;
               break;
            case 69:
               var10000 = 130;
               break;
            case 70:
               var10000 = 206;
               break;
            case 71:
               var10000 = 250;
               break;
            case 72:
               var10000 = 35;
               break;
            case 73:
               var10000 = 210;
               break;
            case 74:
               var10000 = 239;
               break;
            case 75:
               var10000 = 41;
               break;
            case 76:
               var10000 = 235;
               break;
            case 77:
               var10000 = 198;
               break;
            case 78:
               var10000 = 117;
               break;
            case 79:
               var10000 = 216;
               break;
            case 80:
               var10000 = 152;
               break;
            case 81:
               var10000 = 132;
               break;
            case 82:
               var10000 = 175;
               break;
            case 83:
               var10000 = 9;
               break;
            case 84:
               var10000 = 121;
               break;
            case 85:
               var10000 = 224;
               break;
            case 86:
               var10000 = 222;
               break;
            case 87:
               var10000 = 231;
               break;
            case 88:
               var10000 = 37;
               break;
            case 89:
               var10000 = 144;
               break;
            case 90:
               var10000 = 102;
               break;
            case 91:
               var10000 = 64;
               break;
            case 92:
               var10000 = 133;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 126;
               break;
            case 95:
               var10000 = 66;
               break;
            case 96:
               var10000 = 134;
               break;
            case 97:
               var10000 = 165;
               break;
            case 98:
               var10000 = 186;
               break;
            case 99:
               var10000 = 191;
               break;
            case 100:
               var10000 = 80;
               break;
            case 101:
               var10000 = 225;
               break;
            case 102:
               var10000 = 70;
               break;
            case 103:
               var10000 = 213;
               break;
            case 104:
               var10000 = 183;
               break;
            case 105:
               var10000 = 73;
               break;
            case 106:
               var10000 = 62;
               break;
            case 107:
               var10000 = 36;
               break;
            case 108:
               var10000 = 252;
               break;
            case 109:
               var10000 = 244;
               break;
            case 110:
               var10000 = 20;
               break;
            case 111:
               var10000 = 40;
               break;
            case 112:
               var10000 = 136;
               break;
            case 113:
               var10000 = 39;
               break;
            case 114:
               var10000 = 129;
               break;
            case 115:
               var10000 = 158;
               break;
            case 116:
               var10000 = 52;
               break;
            case 117:
               var10000 = 189;
               break;
            case 118:
               var10000 = 190;
               break;
            case 119:
               var10000 = 91;
               break;
            case 120:
               var10000 = 22;
               break;
            case 121:
               var10000 = 86;
               break;
            case 122:
               var10000 = 7;
               break;
            case 123:
               var10000 = 168;
               break;
            case 124:
               var10000 = 108;
               break;
            case 125:
               var10000 = 230;
               break;
            case 126:
               var10000 = 138;
               break;
            case 127:
               var10000 = 57;
               break;
            case 128:
               var10000 = 187;
               break;
            case 129:
               var10000 = 243;
               break;
            case 130:
               var10000 = 69;
               break;
            case 131:
               var10000 = 31;
               break;
            case 132:
               var10000 = 12;
               break;
            case 133:
               var10000 = 104;
               break;
            case 134:
               var10000 = 240;
               break;
            case 135:
               var10000 = 16;
               break;
            case 136:
               var10000 = 153;
               break;
            case 137:
               var10000 = 141;
               break;
            case 138:
               var10000 = 247;
               break;
            case 139:
               var10000 = 96;
               break;
            case 140:
               var10000 = 29;
               break;
            case 141:
               var10000 = 255;
               break;
            case 142:
               var10000 = 207;
               break;
            case 143:
               var10000 = 50;
               break;
            case 144:
               var10000 = 3;
               break;
            case 145:
               var10000 = 171;
               break;
            case 146:
               var10000 = 254;
               break;
            case 147:
               var10000 = 71;
               break;
            case 148:
               var10000 = 218;
               break;
            case 149:
               var10000 = 149;
               break;
            case 150:
               var10000 = 30;
               break;
            case 151:
               var10000 = 76;
               break;
            case 152:
               var10000 = 89;
               break;
            case 153:
               var10000 = 43;
               break;
            case 154:
               var10000 = 98;
               break;
            case 155:
               var10000 = 47;
               break;
            case 156:
               var10000 = 228;
               break;
            case 157:
               var10000 = 112;
               break;
            case 158:
               var10000 = 226;
               break;
            case 159:
               var10000 = 170;
               break;
            case 160:
               var10000 = 246;
               break;
            case 161:
               var10000 = 203;
               break;
            case 162:
               var10000 = 154;
               break;
            case 163:
               var10000 = 42;
               break;
            case 164:
               var10000 = 146;
               break;
            case 165:
               var10000 = 26;
               break;
            case 166:
               var10000 = 143;
               break;
            case 167:
               var10000 = 125;
               break;
            case 168:
               var10000 = 109;
               break;
            case 169:
               var10000 = 135;
               break;
            case 170:
               var10000 = 192;
               break;
            case 171:
               var10000 = 0;
               break;
            case 172:
               var10000 = 65;
               break;
            case 173:
               var10000 = 251;
               break;
            case 174:
               var10000 = 68;
               break;
            case 175:
               var10000 = 120;
               break;
            case 176:
               var10000 = 223;
               break;
            case 177:
               var10000 = 201;
               break;
            case 178:
               var10000 = 8;
               break;
            case 179:
               var10000 = 74;
               break;
            case 180:
               var10000 = 197;
               break;
            case 181:
               var10000 = 58;
               break;
            case 182:
               var10000 = 53;
               break;
            case 183:
               var10000 = 245;
               break;
            case 184:
               var10000 = 85;
               break;
            case 185:
               var10000 = 15;
               break;
            case 186:
               var10000 = 23;
               break;
            case 187:
               var10000 = 169;
               break;
            case 188:
               var10000 = 124;
               break;
            case 189:
               var10000 = 97;
               break;
            case 190:
               var10000 = 159;
               break;
            case 191:
               var10000 = 249;
               break;
            case 192:
               var10000 = 180;
               break;
            case 193:
               var10000 = 93;
               break;
            case 194:
               var10000 = 45;
               break;
            case 195:
               var10000 = 127;
               break;
            case 196:
               var10000 = 14;
               break;
            case 197:
               var10000 = 61;
               break;
            case 198:
               var10000 = 10;
               break;
            case 199:
               var10000 = 115;
               break;
            case 200:
               var10000 = 237;
               break;
            case 201:
               var10000 = 163;
               break;
            case 202:
               var10000 = 25;
               break;
            case 203:
               var10000 = 217;
               break;
            case 204:
               var10000 = 75;
               break;
            case 205:
               var10000 = 33;
               break;
            case 206:
               var10000 = 176;
               break;
            case 207:
               var10000 = 173;
               break;
            case 208:
               var10000 = 72;
               break;
            case 209:
               var10000 = 13;
               break;
            case 210:
               var10000 = 156;
               break;
            case 211:
               var10000 = 188;
               break;
            case 212:
               var10000 = 215;
               break;
            case 213:
               var10000 = 253;
               break;
            case 214:
               var10000 = 46;
               break;
            case 215:
               var10000 = 44;
               break;
            case 216:
               var10000 = 32;
               break;
            case 217:
               var10000 = 1;
               break;
            case 218:
               var10000 = 38;
               break;
            case 219:
               var10000 = 184;
               break;
            case 220:
               var10000 = 2;
               break;
            case 221:
               var10000 = 131;
               break;
            case 222:
               var10000 = 204;
               break;
            case 223:
               var10000 = 105;
               break;
            case 224:
               var10000 = 174;
               break;
            case 225:
               var10000 = 196;
               break;
            case 226:
               var10000 = 227;
               break;
            case 227:
               var10000 = 84;
               break;
            case 228:
               var10000 = 166;
               break;
            case 229:
               var10000 = 241;
               break;
            case 230:
               var10000 = 49;
               break;
            case 231:
               var10000 = 164;
               break;
            case 232:
               var10000 = 5;
               break;
            case 233:
               var10000 = 145;
               break;
            case 234:
               var10000 = 28;
               break;
            case 235:
               var10000 = 155;
               break;
            case 236:
               var10000 = 67;
               break;
            case 237:
               var10000 = 79;
               break;
            case 238:
               var10000 = 172;
               break;
            case 239:
               var10000 = 118;
               break;
            case 240:
               var10000 = 242;
               break;
            case 241:
               var10000 = 236;
               break;
            case 242:
               var10000 = 200;
               break;
            case 243:
               var10000 = 106;
               break;
            case 244:
               var10000 = 122;
               break;
            case 245:
               var10000 = 182;
               break;
            case 246:
               var10000 = 147;
               break;
            case 247:
               var10000 = 82;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 137;
               break;
            case 250:
               var10000 = 60;
               break;
            case 251:
               var10000 = 162;
               break;
            case 252:
               var10000 = 99;
               break;
            case 253:
               var10000 = 83;
               break;
            case 254:
               var10000 = 103;
               break;
            default:
               var10000 = 19;
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

         db[var2] = new String(var3).intern();
      }

      return db[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22015;
      if (kb[var3] == null) {
         kb[var3] = (int)(jb[var3] ^ var1);
      }

      return kb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "öL\u0002\u0005Û\u0007\u009c\u001a¨¿ÝÝ\u001b";
      int var12 = "öL\u0002\u0005Û\u0007\u009c\u001a¨¿ÝÝ\u001b".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 121;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 121;
               var10006 = var14;
            } else {
               var27 = 121;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 121;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 105;
                     break;
                  case 1:
                     var47 = 9;
                     break;
                  case 2:
                     var47 = 46;
                     break;
                  case 3:
                     var47 = 49;
                     break;
                  case 4:
                     var47 = 47;
                     break;
                  case 5:
                     var47 = 40;
                     break;
                  default:
                     var47 = 57;
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
            cb = var13;
            db = new String[2];
            long var0 = 4067822146182896824L;
            long[] var6 = new long[11];
            int var3 = 0;
            String var4 = "EYF¬- úH¹\u009c\u0084\u0015}\r³À\u0006©»¶wdé·Í«\u008c^4\u0080\"ÿ\u001d¡\"!Ô\u0094´¶ÔjwøôMbå÷B¾\u0083\u000e;6í×z\u009c²b%C\u001eü\b\u0096Bÿ{\u009fË";
            int var5 = "EYF¬- úH¹\u009c\u0084\u0015}\r³À\u0006©»¶wdé·Í«\u008c^4\u0080\"ÿ\u001d¡\"!Ô\u0094´¶ÔjwøôMbå÷B¾\u0083\u000e;6í×z\u009c²b%C\u001eü\b\u0096Bÿ{\u009fË"
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
                           jb = var6;
                           kb = new Integer[11];
                           P = E8.J(b(-27813, 11292));
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "ûm\u0088wE}Ø\u0014aC6¬<M\u0001k";
                        var5 = "ûm\u0088wE}Ø\u0014aC6¬<M\u0001k".length();
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





