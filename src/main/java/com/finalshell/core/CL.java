package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public abstract class CL extends Cv2 {
   public int W;
   byte[] o;
   byte[] z;
   byte[] e;
   byte[] i;
   byte[] Q;
   public UJ Z;
   public YU K;
   public C_3_2 O;
   protected String Y;
   protected int N;
   public static String[] d;
   public static String[] f;
   public static long[] l;
   public static Integer[] m;

   CL() {
   }

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
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: aload 2
      // 005: putfield com/finalshell/core/CL.z [B
      // 008: istore 6
      // 00a: aload 0
      // 00b: aload 3
      // 00c: putfield com/finalshell/core/CL.e [B
      // 00f: aload 0
      // 010: aload 4
      // 012: putfield com/finalshell/core/CL.i [B
      // 015: aload 0
      // 016: aload 5
      // 018: putfield com/finalshell/core/CL.Q [B
      // 01b: aload 1
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/CL.Y Ljava/lang/String;
      // 020: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 023: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 026: ldc com/finalshell/core/Y_2
      // 028: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 02b: astore 7
      // 02d: aload 0
      // 02e: aload 7
      // 030: bipush 0
      // 031: anewarray 61
      // 034: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 037: bipush 0
      // 038: anewarray 77
      // 03b: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 03e: checkcast com/finalshell/core/Y_2
      // 041: putfield com/finalshell/core/CL.L Lcom/finalshell/core/Y_2;
      // 044: aload 0
      // 045: getfield com/finalshell/core/CL.L Lcom/finalshell/core/Y_2;
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
      // 069: putfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 06c: aload 0
      // 06d: new com/finalshell/core/YU
      // 070: dup
      // 071: aload 0
      // 072: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 075: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 078: putfield com/finalshell/core/CL.K Lcom/finalshell/core/YU;
      // 07b: aload 0
      // 07c: getfield com/finalshell/core/CL.K Lcom/finalshell/core/YU;
      // 07f: invokevirtual com/finalshell/core/YU.M ()V
      // 082: aload 0
      // 083: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 086: sipush 3281
      // 089: ldc2_w 4005568639836131092
      // 08c: invokestatic com/finalshell/core/CL.b (IJ)I
      // 08f: invokevirtual com/finalshell/core/UJ.V (B)V
      // 092: aload 1
      // 093: sipush 25030
      // 096: sipush 22311
      // 099: invokestatic com/finalshell/core/CL.b (II)Ljava/lang/String;
      // 09c: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 09f: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0a2: ldc com/finalshell/core/C_3_2
      // 0a4: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0a7: astore 7
      // 0a9: aload 0
      // 0aa: aload 7
      // 0ac: bipush 0
      // 0ad: anewarray 61
      // 0b0: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0b3: bipush 0
      // 0b4: anewarray 77
      // 0b7: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0ba: checkcast com/finalshell/core/C_3_2
      // 0bd: putfield com/finalshell/core/CL.O Lcom/finalshell/core/C_3_2;
      // 0c0: aload 0
      // 0c1: getfield com/finalshell/core/CL.O Lcom/finalshell/core/C_3_2;
      // 0c4: aload 0
      // 0c5: getfield com/finalshell/core/CL.N I
      // 0c8: invokeinterface com/finalshell/core/C_3_2.D (I)V 2
      // 0cd: aload 0
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/core/CL.O Lcom/finalshell/core/C_3_2;
      // 0d2: invokeinterface com/finalshell/core/C_3_2.O ()[B 1
      // 0d7: putfield com/finalshell/core/CL.o [B
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 0de: aload 0
      // 0df: getfield com/finalshell/core/CL.o [B
      // 0e2: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0e5: goto 0f9
      // 0e8: astore 7
      // 0ea: new com/finalshell/core/Pc2
      // 0ed: dup
      // 0ee: aload 7
      // 0f0: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0f3: aload 7
      // 0f5: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0f8: athrow
      // 0f9: aload 2
      // 0fa: ifnonnull 102
      // 0fd: return
      // 0fe: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: aload 1
      // 103: aload 0
      // 104: getfield com/finalshell/core/CL.K Lcom/finalshell/core/YU;
      // 107: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 10a: iload 6
      // 10c: ifne 15d
      // 10f: aload 1
      // 110: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 113: bipush 1
      // 114: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 119: ifeq 150
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: aload 1
      // 124: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 127: bipush 1
      // 128: sipush 25031
      // 12b: sipush 27737
      // 12e: invokestatic com/finalshell/core/CL.b (II)Ljava/lang/String;
      // 131: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 136: aload 1
      // 137: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 13a: bipush 1
      // 13b: sipush 25029
      // 13e: sipush 1107
      // 141: invokestatic com/finalshell/core/CL.b (II)Ljava/lang/String;
      // 144: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 0
      // 151: sipush 31328
      // 154: ldc2_w 7052521221534415272
      // 157: invokestatic com/finalshell/core/CL.b (IJ)I
      // 15a: putfield com/finalshell/core/CL.W I
      // 15d: return
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
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/CL.W I
      // 008: iload 2
      // 009: ifne 22d
      // 00c: lookupswitch 544 1 31 24
      // 020: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 037: ifne 0aa
      // 03a: iload 4
      // 03c: sipush 8605
      // 03f: ldc2_w 7595058502519792212
      // 042: invokestatic com/finalshell/core/CL.b (IJ)I
      // 045: if_icmpeq 0a2
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield com/finalshell/core/CL.a Lcom/finalshell/crypto/ConnectHost;
      // 053: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 056: bipush 3
      // 057: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 05c: iload 2
      // 05d: ifne 0a1
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: ifeq 0a0
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/finalshell/core/CL.a Lcom/finalshell/crypto/ConnectHost;
      // 075: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 078: bipush 3
      // 079: new java/lang/StringBuilder
      // 07c: dup
      // 07d: invokespecial java/lang/StringBuilder.<init> ()V
      // 080: sipush 25028
      // 083: sipush -8022
      // 086: invokestatic com/finalshell/core/CL.b (II)Ljava/lang/String;
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: iload 4
      // 08e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 091: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 094: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 0
      // 0a1: ireturn
      // 0a2: aload 0
      // 0a3: aload 1
      // 0a4: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0a7: putfield com/finalshell/core/CL.k [B
      // 0aa: aload 1
      // 0ab: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0ae: astore 5
      // 0b0: aload 5
      // 0b2: invokestatic com/finalshell/core/L32.Y ([B)[[B
      // 0b5: astore 6
      // 0b7: aload 0
      // 0b8: iload 2
      // 0b9: ifne 0f2
      // 0bc: getfield com/finalshell/core/CL.O Lcom/finalshell/core/C_3_2;
      // 0bf: aload 6
      // 0c1: bipush 0
      // 0c2: aaload
      // 0c3: aload 6
      // 0c5: bipush 1
      // 0c6: aaload
      // 0c7: invokeinterface com/finalshell/core/C_3_2.z$boolean ([B[B)Z 3
      // 0cc: ifne 0dc
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: ireturn
      // 0d8: invokestatic com/finalshell/core/CL.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 0
      // 0de: getfield com/finalshell/core/CL.O Lcom/finalshell/core/C_3_2;
      // 0e1: aload 6
      // 0e3: bipush 0
      // 0e4: aaload
      // 0e5: aload 6
      // 0e7: bipush 1
      // 0e8: aaload
      // 0e9: invokeinterface com/finalshell/core/C_3_2.z$arrbyte ([B[B)[B 3
      // 0ee: putfield com/finalshell/core/CL.E [B
      // 0f1: aload 0
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/core/CL.E [B
      // 0f7: invokevirtual com/finalshell/core/CL.D ([B)[B
      // 0fa: putfield com/finalshell/core/CL.E [B
      // 0fd: aload 1
      // 0fe: invokevirtual com/finalshell/core/UJ.S ()[B
      // 101: astore 7
      // 103: aload 0
      // 104: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 107: invokevirtual com/finalshell/core/UJ.m ()V
      // 10a: aload 0
      // 10b: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 10e: aload 0
      // 10f: getfield com/finalshell/core/CL.e [B
      // 112: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 115: aload 0
      // 116: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 119: aload 0
      // 11a: getfield com/finalshell/core/CL.z [B
      // 11d: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 120: aload 0
      // 121: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 124: aload 0
      // 125: getfield com/finalshell/core/CL.Q [B
      // 128: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 12b: aload 0
      // 12c: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 12f: aload 0
      // 130: getfield com/finalshell/core/CL.i [B
      // 133: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 136: aload 0
      // 137: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 13a: aload 0
      // 13b: getfield com/finalshell/core/CL.k [B
      // 13e: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 141: aload 0
      // 142: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 145: aload 0
      // 146: getfield com/finalshell/core/CL.o [B
      // 149: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 14c: aload 0
      // 14d: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 150: aload 5
      // 152: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 155: aload 0
      // 156: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 159: aload 0
      // 15a: getfield com/finalshell/core/CL.E [B
      // 15d: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 160: aload 0
      // 161: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 164: invokevirtual com/finalshell/core/UJ.P ()I
      // 167: newarray 8
      // 169: astore 8
      // 16b: aload 0
      // 16c: getfield com/finalshell/core/CL.Z Lcom/finalshell/core/UJ;
      // 16f: aload 8
      // 171: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 174: aload 0
      // 175: getfield com/finalshell/core/CL.L Lcom/finalshell/core/Y_2;
      // 178: aload 8
      // 17a: bipush 0
      // 17b: aload 8
      // 17d: arraylength
      // 17e: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 183: aload 0
      // 184: aload 0
      // 185: getfield com/finalshell/core/CL.L Lcom/finalshell/core/Y_2;
      // 188: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 18d: putfield com/finalshell/core/CL.b [B
      // 190: bipush 0
      // 191: istore 3
      // 192: bipush 0
      // 193: istore 4
      // 195: aload 0
      // 196: getfield com/finalshell/core/CL.k [B
      // 199: iload 3
      // 19a: iinc 3 1
      // 19d: baload
      // 19e: sipush 3271
      // 1a1: ldc2_w 5255388380610301701
      // 1a4: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1a7: ishl
      // 1a8: sipush 2094
      // 1ab: ldc2_w 2782845282588101613
      // 1ae: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1b1: iand
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/core/CL.k [B
      // 1b6: iload 3
      // 1b7: iinc 3 1
      // 1ba: baload
      // 1bb: sipush 6878
      // 1be: ldc2_w 7242741698142476575
      // 1c1: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1c4: ishl
      // 1c5: sipush 17873
      // 1c8: ldc2_w 6373387505949459985
      // 1cb: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1ce: iand
      // 1cf: ior
      // 1d0: aload 0
      // 1d1: getfield com/finalshell/core/CL.k [B
      // 1d4: iload 3
      // 1d5: iinc 3 1
      // 1d8: baload
      // 1d9: sipush 6246
      // 1dc: ldc2_w 5280072220362513313
      // 1df: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1e2: ishl
      // 1e3: sipush 23796
      // 1e6: ldc2_w 5579126430620671794
      // 1e9: invokestatic com/finalshell/core/CL.b (IJ)I
      // 1ec: iand
      // 1ed: ior
      // 1ee: aload 0
      // 1ef: getfield com/finalshell/core/CL.k [B
      // 1f2: iload 3
      // 1f3: iinc 3 1
      // 1f6: baload
      // 1f7: sipush 25630
      // 1fa: ldc2_w 25991330079991770
      // 1fd: invokestatic com/finalshell/core/CL.b (IJ)I
      // 200: iand
      // 201: ior
      // 202: istore 4
      // 204: aload 0
      // 205: getfield com/finalshell/core/CL.k [B
      // 208: iload 3
      // 209: iload 4
      // 20b: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 20e: astore 9
      // 210: iload 3
      // 211: iload 4
      // 213: iadd
      // 214: istore 3
      // 215: aload 0
      // 216: aload 9
      // 218: aload 0
      // 219: getfield com/finalshell/core/CL.k [B
      // 21c: iload 3
      // 21d: aload 7
      // 21f: invokevirtual com/finalshell/core/CL.x (Ljava/lang/String;[BI[B)Z
      // 222: istore 10
      // 224: aload 0
      // 225: bipush 0
      // 226: putfield com/finalshell/core/CL.W I
      // 229: iload 10
      // 22b: ireturn
      // 22c: bipush 0
      // 22d: ireturn
   }

   @Override
   public int j$int() {
      return this.W;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 25031) & 65535;
      if (f[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 7;
               break;
            case 1:
               var10000 = 254;
               break;
            case 2:
               var10000 = 191;
               break;
            case 3:
               var10000 = 0;
               break;
            case 4:
               var10000 = 182;
               break;
            case 5:
               var10000 = 237;
               break;
            case 6:
               var10000 = 4;
               break;
            case 7:
               var10000 = 88;
               break;
            case 8:
               var10000 = 135;
               break;
            case 9:
               var10000 = 136;
               break;
            case 10:
               var10000 = 184;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 47;
               break;
            case 13:
               var10000 = 58;
               break;
            case 14:
               var10000 = 141;
               break;
            case 15:
               var10000 = 83;
               break;
            case 16:
               var10000 = 29;
               break;
            case 17:
               var10000 = 68;
               break;
            case 18:
               var10000 = 81;
               break;
            case 19:
               var10000 = 251;
               break;
            case 20:
               var10000 = 112;
               break;
            case 21:
               var10000 = 106;
               break;
            case 22:
               var10000 = 218;
               break;
            case 23:
               var10000 = 22;
               break;
            case 24:
               var10000 = 174;
               break;
            case 25:
               var10000 = 126;
               break;
            case 26:
               var10000 = 194;
               break;
            case 27:
               var10000 = 70;
               break;
            case 28:
               var10000 = 9;
               break;
            case 29:
               var10000 = 120;
               break;
            case 30:
               var10000 = 6;
               break;
            case 31:
               var10000 = 203;
               break;
            case 32:
               var10000 = 245;
               break;
            case 33:
               var10000 = 162;
               break;
            case 34:
               var10000 = 113;
               break;
            case 35:
               var10000 = 15;
               break;
            case 36:
               var10000 = 50;
               break;
            case 37:
               var10000 = 183;
               break;
            case 38:
               var10000 = 59;
               break;
            case 39:
               var10000 = 17;
               break;
            case 40:
               var10000 = 165;
               break;
            case 41:
               var10000 = 21;
               break;
            case 42:
               var10000 = 134;
               break;
            case 43:
               var10000 = 160;
               break;
            case 44:
               var10000 = 91;
               break;
            case 45:
               var10000 = 158;
               break;
            case 46:
               var10000 = 96;
               break;
            case 47:
               var10000 = 100;
               break;
            case 48:
               var10000 = 131;
               break;
            case 49:
               var10000 = 69;
               break;
            case 50:
               var10000 = 170;
               break;
            case 51:
               var10000 = 87;
               break;
            case 52:
               var10000 = 44;
               break;
            case 53:
               var10000 = 205;
               break;
            case 54:
               var10000 = 111;
               break;
            case 55:
               var10000 = 193;
               break;
            case 56:
               var10000 = 28;
               break;
            case 57:
               var10000 = 228;
               break;
            case 58:
               var10000 = 188;
               break;
            case 59:
               var10000 = 99;
               break;
            case 60:
               var10000 = 197;
               break;
            case 61:
               var10000 = 204;
               break;
            case 62:
               var10000 = 23;
               break;
            case 63:
               var10000 = 90;
               break;
            case 64:
               var10000 = 34;
               break;
            case 65:
               var10000 = 221;
               break;
            case 66:
               var10000 = 89;
               break;
            case 67:
               var10000 = 222;
               break;
            case 68:
               var10000 = 57;
               break;
            case 69:
               var10000 = 71;
               break;
            case 70:
               var10000 = 138;
               break;
            case 71:
               var10000 = 238;
               break;
            case 72:
               var10000 = 226;
               break;
            case 73:
               var10000 = 247;
               break;
            case 74:
               var10000 = 64;
               break;
            case 75:
               var10000 = 171;
               break;
            case 76:
               var10000 = 118;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 40;
               break;
            case 79:
               var10000 = 217;
               break;
            case 80:
               var10000 = 150;
               break;
            case 81:
               var10000 = 132;
               break;
            case 82:
               var10000 = 94;
               break;
            case 83:
               var10000 = 248;
               break;
            case 84:
               var10000 = 129;
               break;
            case 85:
               var10000 = 227;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 84;
               break;
            case 88:
               var10000 = 216;
               break;
            case 89:
               var10000 = 137;
               break;
            case 90:
               var10000 = 161;
               break;
            case 91:
               var10000 = 93;
               break;
            case 92:
               var10000 = 26;
               break;
            case 93:
               var10000 = 48;
               break;
            case 94:
               var10000 = 181;
               break;
            case 95:
               var10000 = 168;
               break;
            case 96:
               var10000 = 85;
               break;
            case 97:
               var10000 = 250;
               break;
            case 98:
               var10000 = 103;
               break;
            case 99:
               var10000 = 239;
               break;
            case 100:
               var10000 = 164;
               break;
            case 101:
               var10000 = 163;
               break;
            case 102:
               var10000 = 139;
               break;
            case 103:
               var10000 = 122;
               break;
            case 104:
               var10000 = 18;
               break;
            case 105:
               var10000 = 115;
               break;
            case 106:
               var10000 = 151;
               break;
            case 107:
               var10000 = 74;
               break;
            case 108:
               var10000 = 109;
               break;
            case 109:
               var10000 = 249;
               break;
            case 110:
               var10000 = 244;
               break;
            case 111:
               var10000 = 178;
               break;
            case 112:
               var10000 = 208;
               break;
            case 113:
               var10000 = 175;
               break;
            case 114:
               var10000 = 39;
               break;
            case 115:
               var10000 = 52;
               break;
            case 116:
               var10000 = 214;
               break;
            case 117:
               var10000 = 127;
               break;
            case 118:
               var10000 = 242;
               break;
            case 119:
               var10000 = 176;
               break;
            case 120:
               var10000 = 243;
               break;
            case 121:
               var10000 = 240;
               break;
            case 122:
               var10000 = 49;
               break;
            case 123:
               var10000 = 43;
               break;
            case 124:
               var10000 = 56;
               break;
            case 125:
               var10000 = 35;
               break;
            case 126:
               var10000 = 246;
               break;
            case 127:
               var10000 = 224;
               break;
            case 128:
               var10000 = 201;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 25;
               break;
            case 131:
               var10000 = 114;
               break;
            case 132:
               var10000 = 230;
               break;
            case 133:
               var10000 = 167;
               break;
            case 134:
               var10000 = 105;
               break;
            case 135:
               var10000 = 133;
               break;
            case 136:
               var10000 = 209;
               break;
            case 137:
               var10000 = 146;
               break;
            case 138:
               var10000 = 76;
               break;
            case 139:
               var10000 = 55;
               break;
            case 140:
               var10000 = 41;
               break;
            case 141:
               var10000 = 156;
               break;
            case 142:
               var10000 = 187;
               break;
            case 143:
               var10000 = 140;
               break;
            case 144:
               var10000 = 142;
               break;
            case 145:
               var10000 = 185;
               break;
            case 146:
               var10000 = 219;
               break;
            case 147:
               var10000 = 172;
               break;
            case 148:
               var10000 = 206;
               break;
            case 149:
               var10000 = 213;
               break;
            case 150:
               var10000 = 159;
               break;
            case 151:
               var10000 = 196;
               break;
            case 152:
               var10000 = 37;
               break;
            case 153:
               var10000 = 125;
               break;
            case 154:
               var10000 = 210;
               break;
            case 155:
               var10000 = 169;
               break;
            case 156:
               var10000 = 95;
               break;
            case 157:
               var10000 = 1;
               break;
            case 158:
               var10000 = 63;
               break;
            case 159:
               var10000 = 11;
               break;
            case 160:
               var10000 = 98;
               break;
            case 161:
               var10000 = 180;
               break;
            case 162:
               var10000 = 54;
               break;
            case 163:
               var10000 = 75;
               break;
            case 164:
               var10000 = 220;
               break;
            case 165:
               var10000 = 8;
               break;
            case 166:
               var10000 = 33;
               break;
            case 167:
               var10000 = 128;
               break;
            case 168:
               var10000 = 236;
               break;
            case 169:
               var10000 = 79;
               break;
            case 170:
               var10000 = 229;
               break;
            case 171:
               var10000 = 235;
               break;
            case 172:
               var10000 = 195;
               break;
            case 173:
               var10000 = 72;
               break;
            case 174:
               var10000 = 154;
               break;
            case 175:
               var10000 = 121;
               break;
            case 176:
               var10000 = 53;
               break;
            case 177:
               var10000 = 108;
               break;
            case 178:
               var10000 = 152;
               break;
            case 179:
               var10000 = 119;
               break;
            case 180:
               var10000 = 5;
               break;
            case 181:
               var10000 = 212;
               break;
            case 182:
               var10000 = 24;
               break;
            case 183:
               var10000 = 65;
               break;
            case 184:
               var10000 = 101;
               break;
            case 185:
               var10000 = 192;
               break;
            case 186:
               var10000 = 32;
               break;
            case 187:
               var10000 = 78;
               break;
            case 188:
               var10000 = 123;
               break;
            case 189:
               var10000 = 130;
               break;
            case 190:
               var10000 = 173;
               break;
            case 191:
               var10000 = 223;
               break;
            case 192:
               var10000 = 60;
               break;
            case 193:
               var10000 = 66;
               break;
            case 194:
               var10000 = 16;
               break;
            case 195:
               var10000 = 207;
               break;
            case 196:
               var10000 = 153;
               break;
            case 197:
               var10000 = 42;
               break;
            case 198:
               var10000 = 61;
               break;
            case 199:
               var10000 = 199;
               break;
            case 200:
               var10000 = 117;
               break;
            case 201:
               var10000 = 190;
               break;
            case 202:
               var10000 = 202;
               break;
            case 203:
               var10000 = 104;
               break;
            case 204:
               var10000 = 107;
               break;
            case 205:
               var10000 = 211;
               break;
            case 206:
               var10000 = 186;
               break;
            case 207:
               var10000 = 166;
               break;
            case 208:
               var10000 = 149;
               break;
            case 209:
               var10000 = 215;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 157;
               break;
            case 212:
               var10000 = 82;
               break;
            case 213:
               var10000 = 62;
               break;
            case 214:
               var10000 = 145;
               break;
            case 215:
               var10000 = 36;
               break;
            case 216:
               var10000 = 233;
               break;
            case 217:
               var10000 = 252;
               break;
            case 218:
               var10000 = 241;
               break;
            case 219:
               var10000 = 19;
               break;
            case 220:
               var10000 = 20;
               break;
            case 221:
               var10000 = 38;
               break;
            case 222:
               var10000 = 73;
               break;
            case 223:
               var10000 = 200;
               break;
            case 224:
               var10000 = 116;
               break;
            case 225:
               var10000 = 77;
               break;
            case 226:
               var10000 = 189;
               break;
            case 227:
               var10000 = 46;
               break;
            case 228:
               var10000 = 110;
               break;
            case 229:
               var10000 = 124;
               break;
            case 230:
               var10000 = 97;
               break;
            case 231:
               var10000 = 147;
               break;
            case 232:
               var10000 = 80;
               break;
            case 233:
               var10000 = 13;
               break;
            case 234:
               var10000 = 45;
               break;
            case 235:
               var10000 = 225;
               break;
            case 236:
               var10000 = 148;
               break;
            case 237:
               var10000 = 232;
               break;
            case 238:
               var10000 = 31;
               break;
            case 239:
               var10000 = 86;
               break;
            case 240:
               var10000 = 14;
               break;
            case 241:
               var10000 = 3;
               break;
            case 242:
               var10000 = 253;
               break;
            case 243:
               var10000 = 12;
               break;
            case 244:
               var10000 = 143;
               break;
            case 245:
               var10000 = 144;
               break;
            case 246:
               var10000 = 155;
               break;
            case 247:
               var10000 = 51;
               break;
            case 248:
               var10000 = 67;
               break;
            case 249:
               var10000 = 30;
               break;
            case 250:
               var10000 = 10;
               break;
            case 251:
               var10000 = 255;
               break;
            case 252:
               var10000 = 92;
               break;
            case 253:
               var10000 = 198;
               break;
            case 254:
               var10000 = 2;
               break;
            default:
               var10000 = 102;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 960;
      if (m[var3] == null) {
         m[var3] = (int)(l[var3] ^ var1);
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "?{)ô3¿ôÉ¸w\u0090FÂ\u000e©`\u0019ùÃÐ\u009a\u0002<¾\tp\u000fÕ\u0092¨ÈÊÉ\u0088\u001d\u0084|wtø\u008f*";
      int var12 = "?{)ô3¿ôÉ¸w\u0090FÂ\u000e©`\u0019ùÃÐ\u009a\u0002<¾\tp\u000fÕ\u0092¨ÈÊÉ\u0088\u001d\u0084|wtø\u008f*".length();
      char var9 = 26;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 87;
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
                        var65 = 34;
                        break;
                     case 1:
                        var65 = 83;
                        break;
                     case 2:
                        var65 = 70;
                        break;
                     case 3:
                        var65 = 42;
                        break;
                     case 4:
                        var65 = 111;
                        break;
                     case 5:
                        var65 = 62;
                        break;
                     default:
                        var65 = 97;
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
                     d = var13;
                     f = new String[4];
                     long var0 = 7426722578191580791L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "÷Ï!\u0012Z\u0083¸f9\u0098'\u001d{Êgxgnj2P\u0085qjh\u0013wc´òu\u009a]i\t\u0082\u0002Ó\u0019Rm\r\u009e«\u0082\u009bñ}úá\\ñÀXÞE\u0010ã¸ö\u0085fåÞ";
                     int var5 = "÷Ï!\u0012Z\u0083¸f9\u0098'\u001d{Êgxgnj2P\u0085qjh\u0013wc´òu\u009a]i\t\u0082\u0002Ó\u0019Rm\r\u009e«\u0082\u009bñ}úá\\ñÀXÞE\u0010ã¸ö\u0085fåÞ"
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

                                 var4 = "Ô´\u008eÞz\r\u0007À\u0091\u008eæª¥{Ü<";
                                 var5 = "Ô´\u008eÞz\r\u0007À\u0091\u008eæª¥{Ü<".length();
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

                  var10 = "8\u00872,rÍ*F\u0097Çä¦\u0018°d\u0000£¨¹\u0011Oû\u000e\u0004¦Ê²HÌ°´Û%Ûm}PÂ\u0016Jø\u000b<\u00926æÊ-ßXS.xd\u0002\u0099=\u0087<\u0013r Ü\u000bF¹u\u0094Æ\u0086";
                  var12 = "8\u00872,rÍ*F\u0097Çä¦\u0018°d\u0000£¨¹\u0011Oû\u000e\u0004¦Ê²HÌ°´Û%Ûm}PÂ\u0016Jø\u000b<\u00926æÊ-ßXS.xd\u0002\u0099=\u0087<\u0013r Ü\u000bF¹u\u0094Æ\u0086"
                     .length();
                  var9 = ' ';
                  var17 = -1;
            }

            var10000 = 70;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





