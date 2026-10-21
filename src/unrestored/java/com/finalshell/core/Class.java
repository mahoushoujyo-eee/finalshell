package com.finalshell.core;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.crypto.ConnectHost;

public class Class extends IM {
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   @Override
   public boolean D(ConnectHost param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial com/finalshell/core/IM.D (Lcom/finalshell/crypto/ConnectHost;)Z
      // 008: pop
      // 009: istore 2
      // 00a: aload 0
      // 00b: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 00e: iload 2
      // 00f: ifeq 027
      // 012: ifnull 03a
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: instanceof com/finalshell/core/Hs2
      // 02a: iload 2
      // 02b: ifeq 039
      // 02e: ifne 03a
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: bipush 0
      // 039: ireturn
      // 03a: new java/lang/StringBuilder
      // 03d: dup
      // 03e: invokespecial java/lang/StringBuilder.<init> ()V
      // 041: aload 0
      // 042: getfield com/finalshell/core/Class.a Ljava/lang/String;
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 048: ldc "@"
      // 04a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04d: aload 1
      // 04e: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 057: astore 3
      // 058: aload 1
      // 059: iload 2
      // 05a: ifeq 08f
      // 05d: getfield com/finalshell/crypto/ConnectHost.x I
      // 060: sipush 8912
      // 063: ldc2_w 636537927731232999
      // 066: invokestatic com/finalshell/core/Class.a (IJ)I
      // 069: if_icmpeq 08e
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: new java/lang/StringBuilder
      // 076: dup
      // 077: invokespecial java/lang/StringBuilder.<init> ()V
      // 07a: aload 3
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: ldc ":"
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: aload 1
      // 084: getfield com/finalshell/crypto/ConnectHost.x I
      // 087: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08d: astore 3
      // 08e: aload 1
      // 08f: getfield com/finalshell/crypto/ConnectHost.iS [B
      // 092: astore 4
      // 094: bipush 0
      // 095: istore 5
      // 097: aconst_null
      // 098: astore 6
      // 09a: aload 0
      // 09b: getfield com/finalshell/core/Class.a Ljava/lang/String;
      // 09e: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0a1: astore 6
      // 0a3: aload 1
      // 0a4: getfield com/finalshell/crypto/ConnectHost.X I
      // 0a7: aload 1
      // 0a8: getfield com/finalshell/crypto/ConnectHost.iI I
      // 0ab: if_icmplt 0bf
      // 0ae: bipush 0
      // 0af: iload 2
      // 0b0: ifeq 122
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: ireturn
      // 0bb: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/Class.g Lcom/finalshell/core/YU;
      // 0c3: invokevirtual com/finalshell/core/YU.M ()V
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 0ca: sipush 21095
      // 0cd: ldc2_w 5989436395702169687
      // 0d0: invokestatic com/finalshell/core/Class.a (IJ)I
      // 0d3: invokevirtual com/finalshell/core/UJ.V (B)V
      // 0d6: aload 0
      // 0d7: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 0da: aload 6
      // 0dc: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0df: aload 0
      // 0e0: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 0e3: sipush 24013
      // 0e6: sipush 25121
      // 0e9: invokestatic com/finalshell/core/Class.a (II)Ljava/lang/String;
      // 0ec: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0ef: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 0f6: sipush 24014
      // 0f9: sipush 25145
      // 0fc: invokestatic com/finalshell/core/Class.a (II)Ljava/lang/String;
      // 0ff: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 102: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 105: aload 0
      // 106: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 109: getstatic com/finalshell/core/E8.z [B
      // 10c: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 10f: aload 0
      // 110: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 113: getstatic com/finalshell/core/E8.z [B
      // 116: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 119: aload 1
      // 11a: aload 0
      // 11b: getfield com/finalshell/core/Class.g Lcom/finalshell/core/YU;
      // 11e: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 121: bipush 1
      // 122: istore 7
      // 124: aload 0
      // 125: aload 1
      // 126: aload 0
      // 127: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 12a: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 12d: putfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 130: aload 0
      // 131: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 134: invokevirtual com/finalshell/core/UJ.A ()B
      // 137: sipush 17793
      // 13a: ldc2_w 556494828804155315
      // 13d: invokestatic com/finalshell/core/Class.a (IJ)I
      // 140: iand
      // 141: istore 8
      // 143: iload 8
      // 145: sipush 23805
      // 148: ldc2_w 8670042651430567628
      // 14b: invokestatic com/finalshell/core/Class.a (IJ)I
      // 14e: if_icmpne 15b
      // 151: bipush 1
      // 152: iload 2
      // 153: ifeq 15d
      // 156: ireturn
      // 157: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: iload 8
      // 15d: sipush 15147
      // 160: ldc2_w 4801996193188469016
      // 163: invokestatic com/finalshell/core/Class.a (IJ)I
      // 166: iload 2
      // 167: ifeq 1d1
      // 16a: if_icmpne 1c6
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: aload 0
      // 175: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 178: invokevirtual com/finalshell/core/UJ.d ()I
      // 17b: pop
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 180: invokevirtual com/finalshell/core/UJ.r ()I
      // 183: pop
      // 184: aload 0
      // 185: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 188: invokevirtual com/finalshell/core/UJ.r ()I
      // 18b: pop
      // 18c: aload 0
      // 18d: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 190: invokevirtual com/finalshell/core/UJ.S ()[B
      // 193: astore 9
      // 195: aload 0
      // 196: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 199: invokevirtual com/finalshell/core/UJ.S ()[B
      // 19c: astore 10
      // 19e: aload 9
      // 1a0: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1a3: astore 11
      // 1a5: aload 0
      // 1a6: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 1a9: iload 2
      // 1aa: ifeq 1bb
      // 1ad: ifnull 124
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 1bb: aload 11
      // 1bd: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 1c2: iload 2
      // 1c3: ifne 124
      // 1c6: iload 8
      // 1c8: sipush 23489
      // 1cb: ldc2_w 7164171987950483957
      // 1ce: invokestatic com/finalshell/core/Class.a (IJ)I
      // 1d1: iload 2
      // 1d2: ifeq 267
      // 1d5: if_icmpne 24a
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 1e3: invokevirtual com/finalshell/core/UJ.d ()I
      // 1e6: pop
      // 1e7: aload 0
      // 1e8: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 1eb: invokevirtual com/finalshell/core/UJ.r ()I
      // 1ee: pop
      // 1ef: aload 0
      // 1f0: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 1f3: invokevirtual com/finalshell/core/UJ.r ()I
      // 1f6: pop
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 1fb: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1fe: astore 9
      // 200: aload 0
      // 201: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 204: invokevirtual com/finalshell/core/UJ.r ()I
      // 207: istore 10
      // 209: iload 10
      // 20b: iload 2
      // 20c: ifeq 22c
      // 20f: ifeq 22a
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: new com/finalshell/core/PD
      // 21c: dup
      // 21d: aload 9
      // 21f: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 222: invokespecial com/finalshell/core/PD.<init> (Ljava/lang/String;)V
      // 225: athrow
      // 226: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: iload 7
      // 22c: iload 2
      // 22d: ifeq 23b
      // 230: ifeq 23c
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: bipush 0
      // 23b: ireturn
      // 23c: aload 1
      // 23d: dup
      // 23e: getfield com/finalshell/crypto/ConnectHost.X I
      // 241: bipush 1
      // 242: iadd
      // 243: putfield com/finalshell/crypto/ConnectHost.X I
      // 246: iload 2
      // 247: ifne 57a
      // 24a: iload 8
      // 24c: iload 2
      // 24d: ifeq 579
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: sipush 5850
      // 25a: ldc2_w 1204914893531084015
      // 25d: invokestatic com/finalshell/core/Class.a (IJ)I
      // 260: goto 267
      // 263: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 266: athrow
      // 267: if_icmpne 578
      // 26a: bipush 0
      // 26b: istore 7
      // 26d: aload 0
      // 26e: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 271: invokevirtual com/finalshell/core/UJ.d ()I
      // 274: pop
      // 275: aload 0
      // 276: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 279: invokevirtual com/finalshell/core/UJ.r ()I
      // 27c: pop
      // 27d: aload 0
      // 27e: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 281: invokevirtual com/finalshell/core/UJ.r ()I
      // 284: pop
      // 285: aload 0
      // 286: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 289: invokevirtual com/finalshell/core/UJ.S ()[B
      // 28c: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 28f: astore 9
      // 291: aload 0
      // 292: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 295: invokevirtual com/finalshell/core/UJ.S ()[B
      // 298: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 29b: astore 10
      // 29d: aload 0
      // 29e: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 2a1: invokevirtual com/finalshell/core/UJ.S ()[B
      // 2a4: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 2a7: astore 11
      // 2a9: aload 0
      // 2aa: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 2ad: invokevirtual com/finalshell/core/UJ.d ()I
      // 2b0: istore 12
      // 2b2: iload 12
      // 2b4: anewarray 165
      // 2b7: astore 13
      // 2b9: iload 12
      // 2bb: newarray 4
      // 2bd: astore 14
      // 2bf: bipush 0
      // 2c0: istore 15
      // 2c2: iload 15
      // 2c4: iload 12
      // 2c6: if_icmpge 302
      // 2c9: aload 13
      // 2cb: iload 15
      // 2cd: aload 0
      // 2ce: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 2d1: invokevirtual com/finalshell/core/UJ.S ()[B
      // 2d4: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 2d7: aastore
      // 2d8: aload 14
      // 2da: iload 2
      // 2db: ifeq 2bd
      // 2de: iload 15
      // 2e0: aload 0
      // 2e1: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 2e4: invokevirtual com/finalshell/core/UJ.r ()I
      // 2e7: iload 2
      // 2e8: ifeq 2f6
      // 2eb: ifeq 2f9
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: bipush 1
      // 2f6: goto 2fa
      // 2f9: bipush 0
      // 2fa: bastore
      // 2fb: iinc 15 1
      // 2fe: iload 2
      // 2ff: ifne 2c2
      // 302: aconst_null
      // 303: astore 15
      // 305: aload 4
      // 307: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 30a: ldc2_w 343931848749596072
      // 30d: astore 21
      // 30f: ldc2_w 343931848749596072
      // 312: aload 21
      // 314: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 317: checkcast java/lang/Boolean
      // 31a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 31d: goto 324
      // 320: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 323: athrow
      // 324: iload 2
      // 325: ifeq 3a0
      // 328: ifne 39e
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: aload 13
      // 334: arraylength
      // 335: iload 2
      // 336: ifeq 3a0
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33f: athrow
      // 340: bipush 1
      // 341: if_icmpne 39e
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: aload 14
      // 34d: bipush 0
      // 34e: baload
      // 34f: iload 2
      // 350: ifeq 3a0
      // 353: goto 35a
      // 356: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 359: athrow
      // 35a: ifne 39e
      // 35d: goto 364
      // 360: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: aload 13
      // 366: bipush 0
      // 367: aaload
      // 368: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 36b: sipush 24015
      // 36e: sipush -9082
      // 371: invokestatic com/finalshell/core/Class.a (II)Ljava/lang/String;
      // 374: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 377: iload 2
      // 378: ifeq 3a0
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: iflt 39e
      // 385: goto 38c
      // 388: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38b: athrow
      // 38c: bipush 1
      // 38d: anewarray 196
      // 390: astore 15
      // 392: aload 15
      // 394: bipush 0
      // 395: aload 4
      // 397: aastore
      // 398: aconst_null
      // 399: astore 4
      // 39b: goto 482
      // 39e: iload 12
      // 3a0: iload 2
      // 3a1: ifeq 3ba
      // 3a4: ifgt 3d7
      // 3a7: goto 3ae
      // 3aa: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ad: athrow
      // 3ae: aload 9
      // 3b0: invokevirtual java/lang/String.length ()I
      // 3b3: goto 3ba
      // 3b6: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b9: athrow
      // 3ba: iload 2
      // 3bb: ifeq 3d4
      // 3be: ifgt 3d7
      // 3c1: goto 3c8
      // 3c4: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c7: athrow
      // 3c8: aload 10
      // 3ca: invokevirtual java/lang/String.length ()I
      // 3cd: goto 3d4
      // 3d0: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d3: athrow
      // 3d4: ifle 482
      // 3d7: aload 0
      // 3d8: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 3db: iload 2
      // 3dc: ifeq 3fb
      // 3df: goto 3e6
      // 3e2: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e5: athrow
      // 3e6: ifnull 482
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: getfield com/finalshell/core/Class.J Lcom/finalshell/core/Gq2;
      // 3f4: goto 3fb
      // 3f7: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fa: athrow
      // 3fb: checkcast com/finalshell/core/Hs2
      // 3fe: astore 16
      // 400: aload 13
      // 402: bipush 0
      // 403: aaload
      // 404: astore 17
      // 406: aload 1
      // 407: invokevirtual com/finalshell/crypto/ConnectHost.a ()Lcom/finalshell/ui/panel/ConnectionProperty;
      // 40a: astore 18
      // 40c: aload 18
      // 40e: iload 2
      // 40f: ifeq 427
      // 412: ifnonnull 429
      // 415: goto 41c
      // 418: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41b: athrow
      // 41c: aload 1
      // 41d: invokevirtual com/finalshell/crypto/ConnectHost.m$_y_2 ()Lcom/finalshell/ui/panel/ConnectionProperty;
      // 420: goto 427
      // 423: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 426: athrow
      // 427: astore 18
      // 429: aload 16
      // 42b: aload 18
      // 42d: invokevirtual com/finalshell/ui/panel/ConnectionProperty.x$U ()Lcom/finalshell/ui/frame/U;
      // 430: aload 3
      // 431: aload 9
      // 433: aload 10
      // 435: aload 13
      // 437: aload 14
      // 439: invokeinterface com/finalshell/core/Hs2.G (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Z)[Ljava/lang/String; 7
      // 43e: astore 19
      // 440: aload 19
      // 442: iload 2
      // 443: ifeq 452
      // 446: ifnull 482
      // 449: goto 450
      // 44c: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: aload 19
      // 452: arraylength
      // 453: anewarray 196
      // 456: astore 15
      // 458: bipush 0
      // 459: istore 20
      // 45b: iload 20
      // 45d: aload 19
      // 45f: arraylength
      // 460: if_icmpge 482
      // 463: aload 15
      // 465: iload 20
      // 467: aload 19
      // 469: iload 20
      // 46b: aaload
      // 46c: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 46f: aastore
      // 470: iinc 20 1
      // 473: iload 2
      // 474: ifeq 499
      // 477: iload 2
      // 478: ifne 45b
      // 47b: goto 482
      // 47e: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 481: athrow
      // 482: aload 0
      // 483: getfield com/finalshell/core/Class.g Lcom/finalshell/core/YU;
      // 486: invokevirtual com/finalshell/core/YU.M ()V
      // 489: aload 0
      // 48a: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 48d: sipush 29905
      // 490: ldc2_w 7031699247562462951
      // 493: invokestatic com/finalshell/core/Class.a (IJ)I
      // 496: invokevirtual com/finalshell/core/UJ.V (B)V
      // 499: iload 12
      // 49b: iload 2
      // 49c: ifeq 545
      // 49f: ifle 534
      // 4a2: goto 4a9
      // 4a5: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a8: athrow
      // 4a9: aload 15
      // 4ab: iload 2
      // 4ac: ifeq 4e3
      // 4af: goto 4b6
      // 4b2: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b5: athrow
      // 4b6: ifnull 4da
      // 4b9: goto 4c0
      // 4bc: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bf: athrow
      // 4c0: iload 12
      // 4c2: iload 2
      // 4c3: ifeq 545
      // 4c6: goto 4cd
      // 4c9: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cc: athrow
      // 4cd: aload 15
      // 4cf: arraylength
      // 4d0: if_icmpeq 534
      // 4d3: goto 4da
      // 4d6: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d9: athrow
      // 4da: aload 15
      // 4dc: goto 4e3
      // 4df: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e2: athrow
      // 4e3: ifnonnull 519
      // 4e6: aload 0
      // 4e7: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 4ea: iload 12
      // 4ec: invokevirtual com/finalshell/core/UJ.u (I)V
      // 4ef: bipush 0
      // 4f0: istore 16
      // 4f2: iload 16
      // 4f4: iload 12
      // 4f6: if_icmpge 515
      // 4f9: aload 0
      // 4fa: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 4fd: getstatic com/finalshell/core/E8.z [B
      // 500: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 503: iinc 16 1
      // 506: iload 2
      // 507: ifeq 528
      // 50a: iload 2
      // 50b: ifne 4f2
      // 50e: goto 515
      // 511: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 514: athrow
      // 515: iload 2
      // 516: ifne 528
      // 519: aload 0
      // 51a: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 51d: bipush 0
      // 51e: invokevirtual com/finalshell/core/UJ.u (I)V
      // 521: goto 528
      // 524: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 527: athrow
      // 528: aload 15
      // 52a: ifnonnull 56c
      // 52d: bipush 1
      // 52e: istore 5
      // 530: iload 2
      // 531: ifne 56c
      // 534: aload 0
      // 535: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 538: iload 12
      // 53a: invokevirtual com/finalshell/core/UJ.u (I)V
      // 53d: bipush 0
      // 53e: goto 545
      // 541: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 544: athrow
      // 545: istore 16
      // 547: iload 16
      // 549: iload 12
      // 54b: if_icmpge 56c
      // 54e: aload 0
      // 54f: getfield com/finalshell/core/Class.s Lcom/finalshell/core/UJ;
      // 552: aload 15
      // 554: iload 16
      // 556: aaload
      // 557: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 55a: iinc 16 1
      // 55d: iload 2
      // 55e: ifeq 574
      // 561: iload 2
      // 562: ifne 547
      // 565: goto 56c
      // 568: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56b: athrow
      // 56c: aload 1
      // 56d: aload 0
      // 56e: getfield com/finalshell/core/Class.g Lcom/finalshell/core/YU;
      // 571: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 574: iload 2
      // 575: ifne 124
      // 578: bipush 0
      // 579: ireturn
      // 57a: iload 5
      // 57c: ifeq 594
      // 57f: new com/finalshell/core/Pz2
      // 582: dup
      // 583: sipush 24012
      // 586: sipush -27667
      // 589: invokestatic com/finalshell/core/Class.a (II)Ljava/lang/String;
      // 58c: invokespecial com/finalshell/core/Pz2.<init> (Ljava/lang/String;)V
      // 58f: athrow
      // 590: invokestatic com/finalshell/core/Class.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 593: athrow
      // 594: goto 0a3
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 24013) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 73;
               break;
            case 1:
               var10000 = 59;
               break;
            case 2:
               var10000 = 161;
               break;
            case 3:
               var10000 = 193;
               break;
            case 4:
               var10000 = 224;
               break;
            case 5:
               var10000 = 21;
               break;
            case 6:
               var10000 = 86;
               break;
            case 7:
               var10000 = 36;
               break;
            case 8:
               var10000 = 14;
               break;
            case 9:
               var10000 = 44;
               break;
            case 10:
               var10000 = 58;
               break;
            case 11:
               var10000 = 151;
               break;
            case 12:
               var10000 = 220;
               break;
            case 13:
               var10000 = 46;
               break;
            case 14:
               var10000 = 237;
               break;
            case 15:
               var10000 = 22;
               break;
            case 16:
               var10000 = 137;
               break;
            case 17:
               var10000 = 250;
               break;
            case 18:
               var10000 = 213;
               break;
            case 19:
               var10000 = 145;
               break;
            case 20:
               var10000 = 211;
               break;
            case 21:
               var10000 = 75;
               break;
            case 22:
               var10000 = 233;
               break;
            case 23:
               var10000 = 65;
               break;
            case 24:
               var10000 = 166;
               break;
            case 25:
               var10000 = 241;
               break;
            case 26:
               var10000 = 231;
               break;
            case 27:
               var10000 = 88;
               break;
            case 28:
               var10000 = 246;
               break;
            case 29:
               var10000 = 23;
               break;
            case 30:
               var10000 = 159;
               break;
            case 31:
               var10000 = 11;
               break;
            case 32:
               var10000 = 248;
               break;
            case 33:
               var10000 = 178;
               break;
            case 34:
               var10000 = 181;
               break;
            case 35:
               var10000 = 235;
               break;
            case 36:
               var10000 = 185;
               break;
            case 37:
               var10000 = 3;
               break;
            case 38:
               var10000 = 204;
               break;
            case 39:
               var10000 = 187;
               break;
            case 40:
               var10000 = 172;
               break;
            case 41:
               var10000 = 251;
               break;
            case 42:
               var10000 = 229;
               break;
            case 43:
               var10000 = 210;
               break;
            case 44:
               var10000 = 192;
               break;
            case 45:
               var10000 = 117;
               break;
            case 46:
               var10000 = 20;
               break;
            case 47:
               var10000 = 66;
               break;
            case 48:
               var10000 = 150;
               break;
            case 49:
               var10000 = 79;
               break;
            case 50:
               var10000 = 104;
               break;
            case 51:
               var10000 = 154;
               break;
            case 52:
               var10000 = 96;
               break;
            case 53:
               var10000 = 191;
               break;
            case 54:
               var10000 = 158;
               break;
            case 55:
               var10000 = 16;
               break;
            case 56:
               var10000 = 33;
               break;
            case 57:
               var10000 = 74;
               break;
            case 58:
               var10000 = 57;
               break;
            case 59:
               var10000 = 168;
               break;
            case 60:
               var10000 = 218;
               break;
            case 61:
               var10000 = 67;
               break;
            case 62:
               var10000 = 91;
               break;
            case 63:
               var10000 = 255;
               break;
            case 64:
               var10000 = 227;
               break;
            case 65:
               var10000 = 92;
               break;
            case 66:
               var10000 = 223;
               break;
            case 67:
               var10000 = 35;
               break;
            case 68:
               var10000 = 34;
               break;
            case 69:
               var10000 = 243;
               break;
            case 70:
               var10000 = 245;
               break;
            case 71:
               var10000 = 219;
               break;
            case 72:
               var10000 = 38;
               break;
            case 73:
               var10000 = 77;
               break;
            case 74:
               var10000 = 164;
               break;
            case 75:
               var10000 = 51;
               break;
            case 76:
               var10000 = 70;
               break;
            case 77:
               var10000 = 221;
               break;
            case 78:
               var10000 = 114;
               break;
            case 79:
               var10000 = 98;
               break;
            case 80:
               var10000 = 84;
               break;
            case 81:
               var10000 = 39;
               break;
            case 82:
               var10000 = 195;
               break;
            case 83:
               var10000 = 144;
               break;
            case 84:
               var10000 = 120;
               break;
            case 85:
               var10000 = 230;
               break;
            case 86:
               var10000 = 133;
               break;
            case 87:
               var10000 = 165;
               break;
            case 88:
               var10000 = 157;
               break;
            case 89:
               var10000 = 152;
               break;
            case 90:
               var10000 = 122;
               break;
            case 91:
               var10000 = 153;
               break;
            case 92:
               var10000 = 105;
               break;
            case 93:
               var10000 = 119;
               break;
            case 94:
               var10000 = 10;
               break;
            case 95:
               var10000 = 149;
               break;
            case 96:
               var10000 = 238;
               break;
            case 97:
               var10000 = 170;
               break;
            case 98:
               var10000 = 41;
               break;
            case 99:
               var10000 = 12;
               break;
            case 100:
               var10000 = 202;
               break;
            case 101:
               var10000 = 62;
               break;
            case 102:
               var10000 = 130;
               break;
            case 103:
               var10000 = 5;
               break;
            case 104:
               var10000 = 113;
               break;
            case 105:
               var10000 = 135;
               break;
            case 106:
               var10000 = 116;
               break;
            case 107:
               var10000 = 101;
               break;
            case 108:
               var10000 = 146;
               break;
            case 109:
               var10000 = 68;
               break;
            case 110:
               var10000 = 72;
               break;
            case 111:
               var10000 = 148;
               break;
            case 112:
               var10000 = 60;
               break;
            case 113:
               var10000 = 131;
               break;
            case 114:
               var10000 = 32;
               break;
            case 115:
               var10000 = 4;
               break;
            case 116:
               var10000 = 49;
               break;
            case 117:
               var10000 = 247;
               break;
            case 118:
               var10000 = 236;
               break;
            case 119:
               var10000 = 115;
               break;
            case 120:
               var10000 = 127;
               break;
            case 121:
               var10000 = 61;
               break;
            case 122:
               var10000 = 19;
               break;
            case 123:
               var10000 = 212;
               break;
            case 124:
               var10000 = 100;
               break;
            case 125:
               var10000 = 78;
               break;
            case 126:
               var10000 = 28;
               break;
            case 127:
               var10000 = 107;
               break;
            case 128:
               var10000 = 239;
               break;
            case 129:
               var10000 = 222;
               break;
            case 130:
               var10000 = 186;
               break;
            case 131:
               var10000 = 155;
               break;
            case 132:
               var10000 = 198;
               break;
            case 133:
               var10000 = 253;
               break;
            case 134:
               var10000 = 160;
               break;
            case 135:
               var10000 = 17;
               break;
            case 136:
               var10000 = 184;
               break;
            case 137:
               var10000 = 30;
               break;
            case 138:
               var10000 = 26;
               break;
            case 139:
               var10000 = 89;
               break;
            case 140:
               var10000 = 15;
               break;
            case 141:
               var10000 = 129;
               break;
            case 142:
               var10000 = 140;
               break;
            case 143:
               var10000 = 156;
               break;
            case 144:
               var10000 = 208;
               break;
            case 145:
               var10000 = 126;
               break;
            case 146:
               var10000 = 25;
               break;
            case 147:
               var10000 = 225;
               break;
            case 148:
               var10000 = 81;
               break;
            case 149:
               var10000 = 82;
               break;
            case 150:
               var10000 = 176;
               break;
            case 151:
               var10000 = 194;
               break;
            case 152:
               var10000 = 132;
               break;
            case 153:
               var10000 = 55;
               break;
            case 154:
               var10000 = 102;
               break;
            case 155:
               var10000 = 201;
               break;
            case 156:
               var10000 = 93;
               break;
            case 157:
               var10000 = 97;
               break;
            case 158:
               var10000 = 42;
               break;
            case 159:
               var10000 = 128;
               break;
            case 160:
               var10000 = 199;
               break;
            case 161:
               var10000 = 125;
               break;
            case 162:
               var10000 = 13;
               break;
            case 163:
               var10000 = 64;
               break;
            case 164:
               var10000 = 80;
               break;
            case 165:
               var10000 = 90;
               break;
            case 166:
               var10000 = 124;
               break;
            case 167:
               var10000 = 136;
               break;
            case 168:
               var10000 = 85;
               break;
            case 169:
               var10000 = 142;
               break;
            case 170:
               var10000 = 29;
               break;
            case 171:
               var10000 = 54;
               break;
            case 172:
               var10000 = 87;
               break;
            case 173:
               var10000 = 214;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 203;
               break;
            case 176:
               var10000 = 56;
               break;
            case 177:
               var10000 = 134;
               break;
            case 178:
               var10000 = 196;
               break;
            case 179:
               var10000 = 173;
               break;
            case 180:
               var10000 = 226;
               break;
            case 181:
               var10000 = 167;
               break;
            case 182:
               var10000 = 52;
               break;
            case 183:
               var10000 = 108;
               break;
            case 184:
               var10000 = 112;
               break;
            case 185:
               var10000 = 118;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 206;
               break;
            case 188:
               var10000 = 110;
               break;
            case 189:
               var10000 = 139;
               break;
            case 190:
               var10000 = 143;
               break;
            case 191:
               var10000 = 27;
               break;
            case 192:
               var10000 = 175;
               break;
            case 193:
               var10000 = 171;
               break;
            case 194:
               var10000 = 252;
               break;
            case 195:
               var10000 = 121;
               break;
            case 196:
               var10000 = 138;
               break;
            case 197:
               var10000 = 109;
               break;
            case 198:
               var10000 = 71;
               break;
            case 199:
               var10000 = 183;
               break;
            case 200:
               var10000 = 6;
               break;
            case 201:
               var10000 = 163;
               break;
            case 202:
               var10000 = 190;
               break;
            case 203:
               var10000 = 232;
               break;
            case 204:
               var10000 = 215;
               break;
            case 205:
               var10000 = 244;
               break;
            case 206:
               var10000 = 162;
               break;
            case 207:
               var10000 = 37;
               break;
            case 208:
               var10000 = 103;
               break;
            case 209:
               var10000 = 200;
               break;
            case 210:
               var10000 = 188;
               break;
            case 211:
               var10000 = 174;
               break;
            case 212:
               var10000 = 45;
               break;
            case 213:
               var10000 = 234;
               break;
            case 214:
               var10000 = 9;
               break;
            case 215:
               var10000 = 0;
               break;
            case 216:
               var10000 = 242;
               break;
            case 217:
               var10000 = 99;
               break;
            case 218:
               var10000 = 111;
               break;
            case 219:
               var10000 = 83;
               break;
            case 220:
               var10000 = 18;
               break;
            case 221:
               var10000 = 182;
               break;
            case 222:
               var10000 = 43;
               break;
            case 223:
               var10000 = 240;
               break;
            case 224:
               var10000 = 177;
               break;
            case 225:
               var10000 = 40;
               break;
            case 226:
               var10000 = 69;
               break;
            case 227:
               var10000 = 76;
               break;
            case 228:
               var10000 = 94;
               break;
            case 229:
               var10000 = 50;
               break;
            case 230:
               var10000 = 1;
               break;
            case 231:
               var10000 = 228;
               break;
            case 232:
               var10000 = 179;
               break;
            case 233:
               var10000 = 53;
               break;
            case 234:
               var10000 = 24;
               break;
            case 235:
               var10000 = 2;
               break;
            case 236:
               var10000 = 47;
               break;
            case 237:
               var10000 = 209;
               break;
            case 238:
               var10000 = 216;
               break;
            case 239:
               var10000 = 141;
               break;
            case 240:
               var10000 = 48;
               break;
            case 241:
               var10000 = 197;
               break;
            case 242:
               var10000 = 147;
               break;
            case 243:
               var10000 = 180;
               break;
            case 244:
               var10000 = 123;
               break;
            case 245:
               var10000 = 31;
               break;
            case 246:
               var10000 = 106;
               break;
            case 247:
               var10000 = 95;
               break;
            case 248:
               var10000 = 63;
               break;
            case 249:
               var10000 = 8;
               break;
            case 250:
               var10000 = 7;
               break;
            case 251:
               var10000 = 205;
               break;
            case 252:
               var10000 = 217;
               break;
            case 253:
               var10000 = 169;
               break;
            case 254:
               var10000 = 249;
               break;
            default:
               var10000 = 254;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25138;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\r¤¥øJQ\u0018\tk\u0090\u008c\u008c\u00ad\u008b\u0014Ï\u0011÷Õ?\\'m[]ÑcUÔÍkñWJb";
      int var12 = "\r¤¥øJQ\u0018\tk\u0090\u008c\u008c\u00ad\u008b\u0014Ï\u0011÷Õ?\\'m[]ÑcUÔÍkñWJb".length();
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 10;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 33;
                        break;
                     case 1:
                        var65 = 75;
                        break;
                     case 2:
                        var65 = 30;
                        break;
                     case 3:
                        var65 = 126;
                        break;
                     case 4:
                        var65 = 112;
                        break;
                     case 5:
                        var65 = 45;
                        break;
                     default:
                        var65 = 117;
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
                     b = var13;
                     c = new String[4];
                     long var0 = 750900526882178159L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0096RW\u0086ÐAã#v\u0019GÆ\u0085±\u009dB\u001e}\u0018;Üèô\n¢M·áôvz\u0097ì)Ð|4 Òµüãjó\u0092\f\u0084\u009e";
                     int var5 = "\u0096RW\u0086ÐAã#v\u0019GÆ\u0085±\u009dB\u001e}\u0018;Üèô\n¢M·áôvz\u0097ì)Ð|4 Òµüãjó\u0092\f\u0084\u009e".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                                    d = var6;
                                    e = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "r»\bÕÍàý©æ\u008bJ¿Ë\b0¼";
                                 var5 = "r»\bÕÍàý©æ\u008bJ¿Ë\b0¼".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var10 = "\"ïp×Ôi\tLÁ\u0014àmZ\u0012ÂìÐ3íÞO[Î\u009böÊÞ+ç¥";
                  var12 = "\"ïp×Ôi\tLÁ\u0014àmZ\u0012ÂìÐ3íÞO[Î\u009böÊÞ+ç¥".length();
                  var9 = '\t';
                  var17 = -1;
            }

            var10000 = 74;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





