package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public abstract class Cq2_2 extends Cv2 {
   public int U;
   public Nn4 S;
   public byte[] O;
   public byte[] p;
   public byte[] K;
   public byte[] d;
   public byte[] f;
   public UJ T;
   public YU Z;
   public static String[] e;
   public static String[] i;
   public static long[] l;
   public static Integer[] m;

   public abstract byte[] l();

   public abstract byte[] u();

   public abstract String i();

   @Override
   public void x(ConnectHost param1, byte[] param2, byte[] param3, byte[] param4, byte[] param5) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 2
      // 002: putfield com/finalshell/core/Cq2_2.O [B
      // 005: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 008: aload 0
      // 009: aload 3
      // 00a: putfield com/finalshell/core/Cq2_2.p [B
      // 00d: istore 6
      // 00f: aload 0
      // 010: aload 4
      // 012: putfield com/finalshell/core/Cq2_2.K [B
      // 015: aload 0
      // 016: aload 5
      // 018: putfield com/finalshell/core/Cq2_2.d [B
      // 01b: aload 1
      // 01c: aload 0
      // 01d: invokevirtual com/finalshell/core/Cq2_2.i ()Ljava/lang/String;
      // 020: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 023: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 026: ldc com/finalshell/core/Y_2
      // 028: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 02b: astore 7
      // 02d: aload 0
      // 02e: aload 7
      // 030: bipush 0
      // 031: anewarray 60
      // 034: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 037: bipush 0
      // 038: anewarray 76
      // 03b: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 03e: checkcast com/finalshell/core/Y_2
      // 041: putfield com/finalshell/core/Cq2_2.L Lcom/finalshell/core/Y_2;
      // 044: aload 0
      // 045: getfield com/finalshell/core/Cq2_2.L Lcom/finalshell/core/Y_2;
      // 048: invokeinterface com/finalshell/core/Y_2.t ()V 1
      // 04d: goto 061
      // 050: astore 7
      // 052: new com/finalshell/core/Pc2
      // 055: dup
      // 056: aload 7
      // 058: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 05b: aload 7
      // 05d: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 060: athrow
      // 061: aload 0
      // 062: new com/finalshell/core/UJ
      // 065: dup
      // 066: invokespecial com/finalshell/core/UJ.<init> ()V
      // 069: putfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 06c: aload 0
      // 06d: new com/finalshell/core/YU
      // 070: dup
      // 071: aload 0
      // 072: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 075: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 078: putfield com/finalshell/core/Cq2_2.Z Lcom/finalshell/core/YU;
      // 07b: aload 1
      // 07c: sipush 21940
      // 07f: sipush 26568
      // 082: invokestatic com/finalshell/core/Cq2_2.b (II)Ljava/lang/String;
      // 085: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 088: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 08b: ldc com/finalshell/core/Nn4
      // 08d: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 090: astore 7
      // 092: aload 0
      // 093: aload 7
      // 095: bipush 0
      // 096: anewarray 60
      // 099: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 09c: bipush 0
      // 09d: anewarray 76
      // 0a0: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0a3: checkcast com/finalshell/core/Nn4
      // 0a6: putfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0ad: invokeinterface com/finalshell/core/Nn4.J ()V 1
      // 0b2: goto 0c6
      // 0b5: astore 7
      // 0b7: new com/finalshell/core/Pc2
      // 0ba: dup
      // 0bb: aload 7
      // 0bd: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0c0: aload 7
      // 0c2: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0ca: aload 0
      // 0cb: invokevirtual com/finalshell/core/Cq2_2.u ()[B
      // 0ce: invokeinterface com/finalshell/core/Nn4.H ([B)V 2
      // 0d3: aload 0
      // 0d4: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0d7: aload 0
      // 0d8: invokevirtual com/finalshell/core/Cq2_2.l ()[B
      // 0db: invokeinterface com/finalshell/core/Nn4.j ([B)V 2
      // 0e0: aload 0
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0e5: invokeinterface com/finalshell/core/Nn4.t ()[B 1
      // 0ea: putfield com/finalshell/core/Cq2_2.f [B
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/core/Cq2_2.Z Lcom/finalshell/core/YU;
      // 0f1: invokevirtual com/finalshell/core/YU.M ()V
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 0f8: sipush 25679
      // 0fb: ldc2_w 1057463921957125010
      // 0fe: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 101: invokevirtual com/finalshell/core/UJ.V (B)V
      // 104: aload 0
      // 105: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 108: aload 0
      // 109: getfield com/finalshell/core/Cq2_2.f [B
      // 10c: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 10f: iload 6
      // 111: ifeq 12c
      // 114: aload 2
      // 115: ifnonnull 124
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: return
      // 120: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: aload 1
      // 125: aload 0
      // 126: getfield com/finalshell/core/Cq2_2.Z Lcom/finalshell/core/YU;
      // 129: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 12c: iload 6
      // 12e: ifeq 17f
      // 131: aload 1
      // 132: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 135: bipush 1
      // 136: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 13b: ifeq 172
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 1
      // 146: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 149: bipush 1
      // 14a: sipush 21942
      // 14d: sipush 29161
      // 150: invokestatic com/finalshell/core/Cq2_2.b (II)Ljava/lang/String;
      // 153: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 158: aload 1
      // 159: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 15c: bipush 1
      // 15d: sipush 21941
      // 160: sipush -30821
      // 163: invokestatic com/finalshell/core/Cq2_2.b (II)Ljava/lang/String;
      // 166: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 0
      // 173: sipush 2693
      // 176: ldc2_w 7962768449140479316
      // 179: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 17c: putfield com/finalshell/core/Cq2_2.U I
      // 17f: return
   }

   @Override
   public boolean f(UJ param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/Cq2_2.U I
      // 008: iload 2
      // 009: ifeq 205
      // 00c: lookupswitch 504 1 31 24
      // 020: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 1
      // 025: invokevirtual com/finalshell/core/UJ.d ()I
      // 028: istore 4
      // 02a: aload 1
      // 02b: invokevirtual com/finalshell/core/UJ.r ()I
      // 02e: istore 4
      // 030: aload 1
      // 031: invokevirtual com/finalshell/core/UJ.r ()I
      // 034: istore 4
      // 036: iload 2
      // 037: ifeq 0aa
      // 03a: iload 4
      // 03c: sipush 14358
      // 03f: ldc2_w 2352210583899662272
      // 042: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 045: if_icmpeq 0a2
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield com/finalshell/core/Cq2_2.a Lcom/finalshell/crypto/ConnectHost;
      // 053: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 056: bipush 3
      // 057: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 05c: iload 2
      // 05d: ifeq 0a1
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: ifeq 0a0
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/finalshell/core/Cq2_2.a Lcom/finalshell/crypto/ConnectHost;
      // 075: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 078: bipush 3
      // 079: new java/lang/StringBuilder
      // 07c: dup
      // 07d: invokespecial java/lang/StringBuilder.<init> ()V
      // 080: sipush 21943
      // 083: sipush 17186
      // 086: invokestatic com/finalshell/core/Cq2_2.b (II)Ljava/lang/String;
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: iload 4
      // 08e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 091: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 094: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Cq2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 0
      // 0a1: ireturn
      // 0a2: aload 0
      // 0a3: aload 1
      // 0a4: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0a7: putfield com/finalshell/core/Cq2_2.k [B
      // 0aa: aload 1
      // 0ab: invokevirtual com/finalshell/core/UJ.e ()[B
      // 0ae: astore 5
      // 0b0: aload 1
      // 0b1: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0b4: astore 6
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0ba: aload 5
      // 0bc: invokeinterface com/finalshell/core/Nn4.D ([B)V 2
      // 0c1: aload 0
      // 0c2: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0c5: invokeinterface com/finalshell/core/Nn4.Z ()V 1
      // 0ca: aload 0
      // 0cb: aload 0
      // 0cc: aload 0
      // 0cd: getfield com/finalshell/core/Cq2_2.S Lcom/finalshell/core/Nn4;
      // 0d0: invokeinterface com/finalshell/core/Nn4.R ()[B 1
      // 0d5: invokevirtual com/finalshell/core/Cq2_2.D ([B)[B
      // 0d8: putfield com/finalshell/core/Cq2_2.E [B
      // 0db: aload 0
      // 0dc: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 0df: invokevirtual com/finalshell/core/UJ.m ()V
      // 0e2: aload 0
      // 0e3: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 0e6: aload 0
      // 0e7: getfield com/finalshell/core/Cq2_2.p [B
      // 0ea: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/Cq2_2.O [B
      // 0f5: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/core/Cq2_2.d [B
      // 100: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 103: aload 0
      // 104: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 107: aload 0
      // 108: getfield com/finalshell/core/Cq2_2.K [B
      // 10b: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 10e: aload 0
      // 10f: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 112: aload 0
      // 113: getfield com/finalshell/core/Cq2_2.k [B
      // 116: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 119: aload 0
      // 11a: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 11d: aload 0
      // 11e: getfield com/finalshell/core/Cq2_2.f [B
      // 121: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 124: aload 0
      // 125: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 128: aload 5
      // 12a: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 131: aload 0
      // 132: getfield com/finalshell/core/Cq2_2.E [B
      // 135: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 138: aload 0
      // 139: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 13c: invokevirtual com/finalshell/core/UJ.P ()I
      // 13f: newarray 8
      // 141: astore 7
      // 143: aload 0
      // 144: getfield com/finalshell/core/Cq2_2.T Lcom/finalshell/core/UJ;
      // 147: aload 7
      // 149: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 14c: aload 0
      // 14d: getfield com/finalshell/core/Cq2_2.L Lcom/finalshell/core/Y_2;
      // 150: aload 7
      // 152: bipush 0
      // 153: aload 7
      // 155: arraylength
      // 156: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 15b: aload 0
      // 15c: aload 0
      // 15d: getfield com/finalshell/core/Cq2_2.L Lcom/finalshell/core/Y_2;
      // 160: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 165: putfield com/finalshell/core/Cq2_2.b [B
      // 168: bipush 0
      // 169: istore 3
      // 16a: bipush 0
      // 16b: istore 4
      // 16d: aload 0
      // 16e: getfield com/finalshell/core/Cq2_2.k [B
      // 171: iload 3
      // 172: iinc 3 1
      // 175: baload
      // 176: sipush 19633
      // 179: ldc2_w 4182376420257993574
      // 17c: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 17f: ishl
      // 180: sipush 4153
      // 183: ldc2_w 13712708413804522
      // 186: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 189: iand
      // 18a: aload 0
      // 18b: getfield com/finalshell/core/Cq2_2.k [B
      // 18e: iload 3
      // 18f: iinc 3 1
      // 192: baload
      // 193: sipush 25250
      // 196: ldc2_w 6206724867940334967
      // 199: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 19c: ishl
      // 19d: sipush 28441
      // 1a0: ldc2_w 5694028307171291333
      // 1a3: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 1a6: iand
      // 1a7: ior
      // 1a8: aload 0
      // 1a9: getfield com/finalshell/core/Cq2_2.k [B
      // 1ac: iload 3
      // 1ad: iinc 3 1
      // 1b0: baload
      // 1b1: sipush 16857
      // 1b4: ldc2_w 3395768858528620041
      // 1b7: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 1ba: ishl
      // 1bb: sipush 3346
      // 1be: ldc2_w 5634222536362414784
      // 1c1: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 1c4: iand
      // 1c5: ior
      // 1c6: aload 0
      // 1c7: getfield com/finalshell/core/Cq2_2.k [B
      // 1ca: iload 3
      // 1cb: iinc 3 1
      // 1ce: baload
      // 1cf: sipush 17651
      // 1d2: ldc2_w 1844328886981729063
      // 1d5: invokestatic com/finalshell/core/Cq2_2.b (IJ)I
      // 1d8: iand
      // 1d9: ior
      // 1da: istore 4
      // 1dc: aload 0
      // 1dd: getfield com/finalshell/core/Cq2_2.k [B
      // 1e0: iload 3
      // 1e1: iload 4
      // 1e3: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1e6: astore 8
      // 1e8: iload 3
      // 1e9: iload 4
      // 1eb: iadd
      // 1ec: istore 3
      // 1ed: aload 0
      // 1ee: aload 8
      // 1f0: aload 0
      // 1f1: getfield com/finalshell/core/Cq2_2.k [B
      // 1f4: iload 3
      // 1f5: aload 6
      // 1f7: invokevirtual com/finalshell/core/Cq2_2.x (Ljava/lang/String;[BI[B)Z
      // 1fa: istore 9
      // 1fc: aload 0
      // 1fd: bipush 0
      // 1fe: putfield com/finalshell/core/Cq2_2.U I
      // 201: iload 9
      // 203: ireturn
      // 204: bipush 0
      // 205: ireturn
   }

   @Override
   public int j$int() {
      return this.U;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 21940) & 65535;
      if (i[var2] == null) {
         char[] var3 = e[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 85;
               break;
            case 1:
               var10000 = 67;
               break;
            case 2:
               var10000 = 2;
               break;
            case 3:
               var10000 = 35;
               break;
            case 4:
               var10000 = 69;
               break;
            case 5:
               var10000 = 238;
               break;
            case 6:
               var10000 = 130;
               break;
            case 7:
               var10000 = 167;
               break;
            case 8:
               var10000 = 185;
               break;
            case 9:
               var10000 = 206;
               break;
            case 10:
               var10000 = 90;
               break;
            case 11:
               var10000 = 137;
               break;
            case 12:
               var10000 = 17;
               break;
            case 13:
               var10000 = 202;
               break;
            case 14:
               var10000 = 13;
               break;
            case 15:
               var10000 = 175;
               break;
            case 16:
               var10000 = 184;
               break;
            case 17:
               var10000 = 103;
               break;
            case 18:
               var10000 = 98;
               break;
            case 19:
               var10000 = 39;
               break;
            case 20:
               var10000 = 105;
               break;
            case 21:
               var10000 = 249;
               break;
            case 22:
               var10000 = 171;
               break;
            case 23:
               var10000 = 168;
               break;
            case 24:
               var10000 = 222;
               break;
            case 25:
               var10000 = 129;
               break;
            case 26:
               var10000 = 186;
               break;
            case 27:
               var10000 = 201;
               break;
            case 28:
               var10000 = 169;
               break;
            case 29:
               var10000 = 127;
               break;
            case 30:
               var10000 = 27;
               break;
            case 31:
               var10000 = 161;
               break;
            case 32:
               var10000 = 228;
               break;
            case 33:
               var10000 = 133;
               break;
            case 34:
               var10000 = 0;
               break;
            case 35:
               var10000 = 97;
               break;
            case 36:
               var10000 = 203;
               break;
            case 37:
               var10000 = 212;
               break;
            case 38:
               var10000 = 43;
               break;
            case 39:
               var10000 = 29;
               break;
            case 40:
               var10000 = 233;
               break;
            case 41:
               var10000 = 200;
               break;
            case 42:
               var10000 = 63;
               break;
            case 43:
               var10000 = 116;
               break;
            case 44:
               var10000 = 78;
               break;
            case 45:
               var10000 = 44;
               break;
            case 46:
               var10000 = 250;
               break;
            case 47:
               var10000 = 34;
               break;
            case 48:
               var10000 = 117;
               break;
            case 49:
               var10000 = 5;
               break;
            case 50:
               var10000 = 194;
               break;
            case 51:
               var10000 = 113;
               break;
            case 52:
               var10000 = 135;
               break;
            case 53:
               var10000 = 160;
               break;
            case 54:
               var10000 = 237;
               break;
            case 55:
               var10000 = 30;
               break;
            case 56:
               var10000 = 38;
               break;
            case 57:
               var10000 = 28;
               break;
            case 58:
               var10000 = 227;
               break;
            case 59:
               var10000 = 221;
               break;
            case 60:
               var10000 = 126;
               break;
            case 61:
               var10000 = 229;
               break;
            case 62:
               var10000 = 173;
               break;
            case 63:
               var10000 = 136;
               break;
            case 64:
               var10000 = 253;
               break;
            case 65:
               var10000 = 180;
               break;
            case 66:
               var10000 = 235;
               break;
            case 67:
               var10000 = 102;
               break;
            case 68:
               var10000 = 74;
               break;
            case 69:
               var10000 = 114;
               break;
            case 70:
               var10000 = 217;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 109;
               break;
            case 73:
               var10000 = 205;
               break;
            case 74:
               var10000 = 89;
               break;
            case 75:
               var10000 = 24;
               break;
            case 76:
               var10000 = 81;
               break;
            case 77:
               var10000 = 210;
               break;
            case 78:
               var10000 = 224;
               break;
            case 79:
               var10000 = 96;
               break;
            case 80:
               var10000 = 22;
               break;
            case 81:
               var10000 = 140;
               break;
            case 82:
               var10000 = 6;
               break;
            case 83:
               var10000 = 199;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 174;
               break;
            case 86:
               var10000 = 213;
               break;
            case 87:
               var10000 = 150;
               break;
            case 88:
               var10000 = 148;
               break;
            case 89:
               var10000 = 84;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 62;
               break;
            case 92:
               var10000 = 183;
               break;
            case 93:
               var10000 = 216;
               break;
            case 94:
               var10000 = 56;
               break;
            case 95:
               var10000 = 231;
               break;
            case 96:
               var10000 = 141;
               break;
            case 97:
               var10000 = 193;
               break;
            case 98:
               var10000 = 182;
               break;
            case 99:
               var10000 = 143;
               break;
            case 100:
               var10000 = 145;
               break;
            case 101:
               var10000 = 170;
               break;
            case 102:
               var10000 = 104;
               break;
            case 103:
               var10000 = 26;
               break;
            case 104:
               var10000 = 176;
               break;
            case 105:
               var10000 = 41;
               break;
            case 106:
               var10000 = 42;
               break;
            case 107:
               var10000 = 16;
               break;
            case 108:
               var10000 = 99;
               break;
            case 109:
               var10000 = 47;
               break;
            case 110:
               var10000 = 152;
               break;
            case 111:
               var10000 = 252;
               break;
            case 112:
               var10000 = 52;
               break;
            case 113:
               var10000 = 8;
               break;
            case 114:
               var10000 = 87;
               break;
            case 115:
               var10000 = 132;
               break;
            case 116:
               var10000 = 181;
               break;
            case 117:
               var10000 = 195;
               break;
            case 118:
               var10000 = 147;
               break;
            case 119:
               var10000 = 187;
               break;
            case 120:
               var10000 = 245;
               break;
            case 121:
               var10000 = 21;
               break;
            case 122:
               var10000 = 197;
               break;
            case 123:
               var10000 = 48;
               break;
            case 124:
               var10000 = 79;
               break;
            case 125:
               var10000 = 223;
               break;
            case 126:
               var10000 = 255;
               break;
            case 127:
               var10000 = 25;
               break;
            case 128:
               var10000 = 146;
               break;
            case 129:
               var10000 = 32;
               break;
            case 130:
               var10000 = 3;
               break;
            case 131:
               var10000 = 58;
               break;
            case 132:
               var10000 = 151;
               break;
            case 133:
               var10000 = 120;
               break;
            case 134:
               var10000 = 45;
               break;
            case 135:
               var10000 = 158;
               break;
            case 136:
               var10000 = 153;
               break;
            case 137:
               var10000 = 209;
               break;
            case 138:
               var10000 = 247;
               break;
            case 139:
               var10000 = 144;
               break;
            case 140:
               var10000 = 179;
               break;
            case 141:
               var10000 = 125;
               break;
            case 142:
               var10000 = 37;
               break;
            case 143:
               var10000 = 108;
               break;
            case 144:
               var10000 = 50;
               break;
            case 145:
               var10000 = 57;
               break;
            case 146:
               var10000 = 225;
               break;
            case 147:
               var10000 = 1;
               break;
            case 148:
               var10000 = 220;
               break;
            case 149:
               var10000 = 4;
               break;
            case 150:
               var10000 = 51;
               break;
            case 151:
               var10000 = 157;
               break;
            case 152:
               var10000 = 232;
               break;
            case 153:
               var10000 = 31;
               break;
            case 154:
               var10000 = 219;
               break;
            case 155:
               var10000 = 162;
               break;
            case 156:
               var10000 = 49;
               break;
            case 157:
               var10000 = 119;
               break;
            case 158:
               var10000 = 124;
               break;
            case 159:
               var10000 = 177;
               break;
            case 160:
               var10000 = 94;
               break;
            case 161:
               var10000 = 91;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 36;
               break;
            case 164:
               var10000 = 123;
               break;
            case 165:
               var10000 = 215;
               break;
            case 166:
               var10000 = 121;
               break;
            case 167:
               var10000 = 107;
               break;
            case 168:
               var10000 = 196;
               break;
            case 169:
               var10000 = 66;
               break;
            case 170:
               var10000 = 154;
               break;
            case 171:
               var10000 = 11;
               break;
            case 172:
               var10000 = 73;
               break;
            case 173:
               var10000 = 23;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 64;
               break;
            case 176:
               var10000 = 100;
               break;
            case 177:
               var10000 = 106;
               break;
            case 178:
               var10000 = 14;
               break;
            case 179:
               var10000 = 164;
               break;
            case 180:
               var10000 = 72;
               break;
            case 181:
               var10000 = 218;
               break;
            case 182:
               var10000 = 12;
               break;
            case 183:
               var10000 = 18;
               break;
            case 184:
               var10000 = 20;
               break;
            case 185:
               var10000 = 234;
               break;
            case 186:
               var10000 = 188;
               break;
            case 187:
               var10000 = 243;
               break;
            case 188:
               var10000 = 80;
               break;
            case 189:
               var10000 = 77;
               break;
            case 190:
               var10000 = 134;
               break;
            case 191:
               var10000 = 155;
               break;
            case 192:
               var10000 = 236;
               break;
            case 193:
               var10000 = 246;
               break;
            case 194:
               var10000 = 208;
               break;
            case 195:
               var10000 = 111;
               break;
            case 196:
               var10000 = 204;
               break;
            case 197:
               var10000 = 86;
               break;
            case 198:
               var10000 = 242;
               break;
            case 199:
               var10000 = 159;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 55;
               break;
            case 202:
               var10000 = 207;
               break;
            case 203:
               var10000 = 149;
               break;
            case 204:
               var10000 = 10;
               break;
            case 205:
               var10000 = 92;
               break;
            case 206:
               var10000 = 172;
               break;
            case 207:
               var10000 = 190;
               break;
            case 208:
               var10000 = 54;
               break;
            case 209:
               var10000 = 60;
               break;
            case 210:
               var10000 = 40;
               break;
            case 211:
               var10000 = 9;
               break;
            case 212:
               var10000 = 178;
               break;
            case 213:
               var10000 = 15;
               break;
            case 214:
               var10000 = 82;
               break;
            case 215:
               var10000 = 76;
               break;
            case 216:
               var10000 = 226;
               break;
            case 217:
               var10000 = 122;
               break;
            case 218:
               var10000 = 101;
               break;
            case 219:
               var10000 = 230;
               break;
            case 220:
               var10000 = 240;
               break;
            case 221:
               var10000 = 65;
               break;
            case 222:
               var10000 = 198;
               break;
            case 223:
               var10000 = 139;
               break;
            case 224:
               var10000 = 95;
               break;
            case 225:
               var10000 = 93;
               break;
            case 226:
               var10000 = 112;
               break;
            case 227:
               var10000 = 244;
               break;
            case 228:
               var10000 = 19;
               break;
            case 229:
               var10000 = 118;
               break;
            case 230:
               var10000 = 239;
               break;
            case 231:
               var10000 = 142;
               break;
            case 232:
               var10000 = 75;
               break;
            case 233:
               var10000 = 163;
               break;
            case 234:
               var10000 = 7;
               break;
            case 235:
               var10000 = 53;
               break;
            case 236:
               var10000 = 83;
               break;
            case 237:
               var10000 = 248;
               break;
            case 238:
               var10000 = 110;
               break;
            case 239:
               var10000 = 165;
               break;
            case 240:
               var10000 = 71;
               break;
            case 241:
               var10000 = 251;
               break;
            case 242:
               var10000 = 115;
               break;
            case 243:
               var10000 = 192;
               break;
            case 244:
               var10000 = 88;
               break;
            case 245:
               var10000 = 131;
               break;
            case 246:
               var10000 = 241;
               break;
            case 247:
               var10000 = 128;
               break;
            case 248:
               var10000 = 46;
               break;
            case 249:
               var10000 = 68;
               break;
            case 250:
               var10000 = 166;
               break;
            case 251:
               var10000 = 61;
               break;
            case 252:
               var10000 = 33;
               break;
            case 253:
               var10000 = 191;
               break;
            case 254:
               var10000 = 254;
               break;
            default:
               var10000 = 211;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24532;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "b\u0089\u001d\u0082\u008fÄQÀ/\u001b\u008aÐÿpÍÇº\u000f oÐLS\u00968Y¹\u008a\u0083¡´Ì";
      int var12 = "b\u0089\u001d\u0082\u008fÄQÀ/\u001b\u008aÐÿpÍÇº\u000f oÐLS\u00968Y¹\u008a\u0083¡´Ì".length();
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 103;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 95;
                        break;
                     case 1:
                        var65 = 91;
                        break;
                     case 2:
                        var65 = 77;
                        break;
                     case 3:
                        var65 = 82;
                        break;
                     case 4:
                        var65 = 103;
                        break;
                     case 5:
                        var65 = 121;
                        break;
                     default:
                        var65 = 2;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     e = var13;
                     i = new String[4];
                     long var0 = 7545974697900847543L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "£Á\r\u001d5þªoIØ{·\u0014]\u008cÐ\u001d&TÒª7Öh\\,Þò\u0006\u0005¢ÉQç\rmï\u0099¯¶\u0089Ý\u001d«¯ÃäüÌ¯A}I\u0016\u001cw\u008bãÕ\u0088®\u009eþ]";
                     int var5 = "£Á\r\u001d5þªoIØ{·\u0014]\u008cÐ\u001d&TÒª7Öh\\,Þò\u0006\u0005¢ÉQç\rmï\u0099¯¶\u0089Ý\u001d«¯ÃäüÌ¯A}I\u0016\u001cw\u008bãÕ\u0088®\u009eþ]"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    l = var6;
                                    m = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ÖîÑ\u0087U~\u0081r3\u0099ï4\u007f|\u008a;";
                                 var5 = "ÖîÑ\u0087U~\u0081r3\u0099ï4\u007f|\u008a;".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "õi<'\u0010e\u001aïéÿ+Í\u0018\u0091.\u0086\u001fo8&ý\u0092L\"\u0015?Û¸¤\u0098?g\u001a°\u0012\u0015e\u0017\u0013Ûàq\u008b¯i¶\u0087Ôæ¨¡=\u0002\u0018ûÎçZ";
                  var12 = "õi<'\u0010e\u001aïéÿ+Í\u0018\u0091.\u0086\u001fo8&ý\u0092L\"\u0015?Û¸¤\u0098?g\u001a°\u0012\u0015e\u0017\u0013Ûàq\u008b¯i¶\u0087Ôæ¨¡=\u0002\u0018ûÎçZ"
                     .length();
                  var9 = 23;
                  var17 = -1;
            }

            var10000 = 51;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





