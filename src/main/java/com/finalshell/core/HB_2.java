package com.finalshell.core;

public class HB_2 extends Hq2 {
   public int t;
   public F9 g;
   public final FU G;
   final B3_2 K;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   HB_2(B3_2 var1, int var2, FU var3) {
      super(var1, null);
      this.K = var1;
      this.t = var2;
      this.g = var1.F$f9();
      this.G = var3;
   }

   @Override
   public void W() {
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
      // 005: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 008: getfield com/finalshell/core/FU.E I
      // 00b: bipush -1
      // 00c: aload 1
      // 00d: ifnull 03d
      // 010: if_icmpne 02f
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 019: athrow
      // 01a: new com/finalshell/core/P_5
      // 01d: dup
      // 01e: sipush -16866
      // 021: sipush 6187
      // 024: invokestatic com/finalshell/core/HB_2.a (II)Ljava/lang/String;
      // 027: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 02a: athrow
      // 02b: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 033: getfield com/finalshell/core/FU.E I
      // 036: aload 0
      // 037: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 03a: getfield com/finalshell/core/F9.E I
      // 03d: isub
      // 03e: istore 2
      // 03f: sipush 6630
      // 042: ldc2_w 296654234783451206
      // 045: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 048: istore 3
      // 049: aload 0
      // 04a: getfield com/finalshell/core/HB_2.t I
      // 04d: sipush 28472
      // 050: ldc2_w 2034782672216653462
      // 053: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 056: aload 1
      // 057: ifnull 12f
      // 05a: if_icmplt 11b
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 063: athrow
      // 064: aload 0
      // 065: getfield com/finalshell/core/HB_2.t I
      // 068: sipush 13016
      // 06b: ldc2_w 1488947316390798193
      // 06e: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 071: aload 1
      // 072: ifnull 12f
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 07b: athrow
      // 07c: if_icmpgt 11b
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 085: athrow
      // 086: iload 2
      // 087: aload 1
      // 088: ifnull 0f1
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 091: athrow
      // 092: sipush 20821
      // 095: ldc2_w 2613159598138343666
      // 098: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 09b: if_icmpgt 0c4
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0a4: athrow
      // 0a5: iload 2
      // 0a6: aload 1
      // 0a7: ifnull 0f1
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b0: athrow
      // 0b1: sipush 23032
      // 0b4: ldc2_w 1121730850898102350
      // 0b7: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 0ba: if_icmpge 420
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 0cc: invokevirtual com/finalshell/core/B3_2.j (Lcom/finalshell/core/F9;)V
      // 0cf: aload 0
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0d4: invokevirtual com/finalshell/core/B3_2.F$f9 ()Lcom/finalshell/core/F9;
      // 0d7: putfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0de: sipush 28649
      // 0e1: ldc2_w 3613939556018945626
      // 0e4: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 0e7: invokevirtual com/finalshell/core/B3_2.c (I)I
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0f0: athrow
      // 0f1: pop
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0f6: aload 0
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/HB_2.t I
      // 0fb: sipush 14566
      // 0fe: ldc2_w 461069991612033355
      // 101: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 104: iadd
      // 105: dup_x1
      // 106: putfield com/finalshell/core/HB_2.t I
      // 109: aload 0
      // 10a: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 10d: invokevirtual com/finalshell/core/B3_2.o (ILcom/finalshell/core/FU;)V
      // 110: aload 0
      // 111: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 114: invokevirtual com/finalshell/core/B3_2.Y ()V
      // 117: aload 1
      // 118: ifnonnull 420
      // 11b: aload 0
      // 11c: getfield com/finalshell/core/HB_2.t I
      // 11f: sipush 17280
      // 122: ldc2_w 3172285729818858043
      // 125: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 12e: athrow
      // 12f: aload 1
      // 130: ifnull 173
      // 133: if_icmplt 15f
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield com/finalshell/core/HB_2.t I
      // 141: sipush 28819
      // 144: ldc2_w 1955175950283006267
      // 147: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 14a: aload 1
      // 14b: ifnull 1bf
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 154: athrow
      // 155: if_icmple 1a3
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield com/finalshell/core/HB_2.t I
      // 163: sipush 11046
      // 166: ldc2_w 3692636336783342208
      // 169: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 172: athrow
      // 173: aload 1
      // 174: ifnull 3ec
      // 177: if_icmplt 3d8
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 180: athrow
      // 181: aload 0
      // 182: getfield com/finalshell/core/HB_2.t I
      // 185: sipush 2334
      // 188: ldc2_w 7509562555618498720
      // 18b: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 18e: aload 1
      // 18f: ifnull 3ec
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 198: athrow
      // 199: if_icmpgt 3d8
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1a2: athrow
      // 1a3: iload 2
      // 1a4: aload 1
      // 1a5: ifnull 20e
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1ae: athrow
      // 1af: sipush 21643
      // 1b2: ldc2_w 6909111861356348721
      // 1b5: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1be: athrow
      // 1bf: if_icmpgt 1e1
      // 1c2: iload 2
      // 1c3: aload 1
      // 1c4: ifnull 20e
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1cd: athrow
      // 1ce: sipush 14077
      // 1d1: ldc2_w 5658448261952677698
      // 1d4: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 1d7: if_icmpge 420
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 1e5: aload 0
      // 1e6: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 1e9: invokevirtual com/finalshell/core/B3_2.j (Lcom/finalshell/core/F9;)V
      // 1ec: aload 0
      // 1ed: aload 0
      // 1ee: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 1f1: invokevirtual com/finalshell/core/B3_2.F$f9 ()Lcom/finalshell/core/F9;
      // 1f4: putfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 1fb: sipush 9823
      // 1fe: ldc2_w 8731788264332933101
      // 201: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 204: invokevirtual com/finalshell/core/B3_2.c (I)I
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20d: athrow
      // 20e: pop
      // 20f: new com/finalshell/core/FS_2
      // 212: dup
      // 213: aload 0
      // 214: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 217: dup
      // 218: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 21b: pop
      // 21c: invokespecial com/finalshell/core/FS_2.<init> (Lcom/finalshell/core/B3_2;)V
      // 21f: astore 4
      // 221: aload 0
      // 222: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 225: aload 0
      // 226: aload 0
      // 227: getfield com/finalshell/core/HB_2.t I
      // 22a: invokestatic com/finalshell/core/B3_2.t (I)I
      // 22d: dup_x1
      // 22e: putfield com/finalshell/core/HB_2.t I
      // 231: aload 4
      // 233: invokevirtual com/finalshell/core/B3_2.o (ILcom/finalshell/core/FU;)V
      // 236: aload 0
      // 237: getfield com/finalshell/core/HB_2.t I
      // 23a: sipush 13525
      // 23d: ldc2_w 4927463914868647290
      // 240: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 243: aload 1
      // 244: ifnull 299
      // 247: if_icmplt 285
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 250: athrow
      // 251: aload 0
      // 252: getfield com/finalshell/core/HB_2.t I
      // 255: sipush 25560
      // 258: ldc2_w 5398273433280606824
      // 25b: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 25e: aload 1
      // 25f: ifnull 299
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 268: athrow
      // 269: if_icmpgt 285
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 272: athrow
      // 273: aload 0
      // 274: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 277: invokevirtual com/finalshell/core/B3_2.F$void ()V
      // 27a: aload 1
      // 27b: ifnonnull 3a5
      // 27e: goto 285
      // 281: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 284: athrow
      // 285: aload 0
      // 286: getfield com/finalshell/core/HB_2.t I
      // 289: sipush 28614
      // 28c: ldc2_w 3494648996051582564
      // 28f: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 298: athrow
      // 299: aload 1
      // 29a: ifnull 301
      // 29d: if_icmplt 2e2
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: getfield com/finalshell/core/HB_2.t I
      // 2ab: sipush 15995
      // 2ae: ldc2_w 5019892656416010178
      // 2b1: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 2b4: aload 1
      // 2b5: ifnull 301
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2be: athrow
      // 2bf: if_icmpgt 2e2
      // 2c2: goto 2c9
      // 2c5: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2c8: athrow
      // 2c9: aload 0
      // 2ca: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 2cd: invokevirtual com/finalshell/core/B3_2.F$void ()V
      // 2d0: aload 0
      // 2d1: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 2d4: invokevirtual com/finalshell/core/B3_2.F$void ()V
      // 2d7: aload 1
      // 2d8: ifnonnull 3a5
      // 2db: goto 2e2
      // 2de: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: aload 1
      // 2e4: ifnull 335
      // 2e7: goto 2ee
      // 2ea: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2ed: athrow
      // 2ee: getfield com/finalshell/core/HB_2.t I
      // 2f1: sipush 11716
      // 2f4: ldc2_w 461425546736548977
      // 2f7: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 2fa: goto 301
      // 2fd: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 300: athrow
      // 301: if_icmpeq 326
      // 304: aload 0
      // 305: getfield com/finalshell/core/HB_2.t I
      // 308: sipush 27129
      // 30b: ldc2_w 7479825575440808021
      // 30e: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 311: aload 1
      // 312: ifnull 35e
      // 315: goto 31c
      // 318: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 31b: athrow
      // 31c: if_icmpne 33f
      // 31f: goto 326
      // 322: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 325: athrow
      // 326: aload 0
      // 327: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 32a: invokevirtual com/finalshell/core/B3_2.X ()V
      // 32d: aload 0
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 334: athrow
      // 335: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 338: invokevirtual com/finalshell/core/B3_2.X ()V
      // 33b: aload 1
      // 33c: ifnonnull 3a5
      // 33f: aload 0
      // 340: aload 1
      // 341: ifnull 38b
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 34a: athrow
      // 34b: getfield com/finalshell/core/HB_2.t I
      // 34e: sipush 22852
      // 351: ldc2_w 268229188908140796
      // 354: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 35d: athrow
      // 35e: if_icmpeq 383
      // 361: aload 0
      // 362: aload 1
      // 363: ifnull 38b
      // 366: goto 36d
      // 369: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 36c: athrow
      // 36d: getfield com/finalshell/core/HB_2.t I
      // 370: sipush 19124
      // 373: ldc2_w 7721057503120513815
      // 376: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 379: if_icmpne 395
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 382: athrow
      // 383: aload 0
      // 384: goto 38b
      // 387: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 38a: athrow
      // 38b: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 38e: invokevirtual com/finalshell/core/B3_2.X ()V
      // 391: aload 1
      // 392: ifnonnull 3a5
      // 395: new java/lang/AssertionError
      // 398: dup
      // 399: aload 0
      // 39a: getfield com/finalshell/core/HB_2.t I
      // 39d: invokespecial java/lang/AssertionError.<init> (I)V
      // 3a0: athrow
      // 3a1: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 3a9: sipush 18621
      // 3ac: ldc2_w 4226445658340776214
      // 3af: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 3b2: aload 0
      // 3b3: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 3b6: invokevirtual com/finalshell/core/B3_2.o (ILcom/finalshell/core/FU;)V
      // 3b9: aload 4
      // 3bb: aload 0
      // 3bc: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 3bf: invokestatic com/finalshell/core/B3_2.s$f9 (Lcom/finalshell/core/B3_2;)Lcom/finalshell/core/F9;
      // 3c2: invokevirtual com/finalshell/core/F9.K ()Lcom/finalshell/core/FC;
      // 3c5: invokevirtual com/finalshell/core/FS_2.Z (Lcom/finalshell/core/FC;)V
      // 3c8: aload 4
      // 3ca: invokevirtual com/finalshell/core/FS_2.R ()V
      // 3cd: aload 0
      // 3ce: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 3d1: invokevirtual com/finalshell/core/B3_2.Y ()V
      // 3d4: aload 1
      // 3d5: ifnonnull 420
      // 3d8: aload 0
      // 3d9: getfield com/finalshell/core/HB_2.t I
      // 3dc: sipush 5027
      // 3df: ldc2_w 5893217767865385478
      // 3e2: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3eb: athrow
      // 3ec: aload 1
      // 3ed: ifnull 40e
      // 3f0: if_icmplt 414
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3f9: athrow
      // 3fa: aload 0
      // 3fb: getfield com/finalshell/core/HB_2.t I
      // 3fe: sipush 20039
      // 401: ldc2_w 998809716396351475
      // 404: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 407: goto 40e
      // 40a: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 40d: athrow
      // 40e: if_icmpgt 414
      // 411: goto 420
      // 414: new java/lang/AssertionError
      // 417: dup
      // 418: aload 0
      // 419: getfield com/finalshell/core/HB_2.t I
      // 41c: invokespecial java/lang/AssertionError.<init> (I)V
      // 41f: athrow
      // 420: return
   }

   @Override
   public void i() {
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
      // 005: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 008: getfield com/finalshell/core/FU.E I
      // 00b: aload 1
      // 00c: ifnull 038
      // 00f: bipush -1
      // 010: if_icmpne 02f
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 019: athrow
      // 01a: new com/finalshell/core/P_5
      // 01d: dup
      // 01e: sipush -16865
      // 021: sipush -19542
      // 024: invokestatic com/finalshell/core/HB_2.a (II)Ljava/lang/String;
      // 027: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 02a: athrow
      // 02b: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 02e: athrow
      // 02f: sipush 13016
      // 032: ldc2_w 1488947316390798193
      // 035: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 038: istore 2
      // 039: aload 0
      // 03a: getfield com/finalshell/core/HB_2.t I
      // 03d: sipush 13525
      // 040: ldc2_w 4927463914868647290
      // 043: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 046: aload 1
      // 047: ifnull 08a
      // 04a: if_icmplt 076
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 053: athrow
      // 054: aload 0
      // 055: getfield com/finalshell/core/HB_2.t I
      // 058: sipush 13016
      // 05b: ldc2_w 1488947316390798193
      // 05e: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 061: aload 1
      // 062: ifnull 0cf
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 06b: athrow
      // 06c: if_icmple 0ba
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 075: athrow
      // 076: aload 0
      // 077: getfield com/finalshell/core/HB_2.t I
      // 07a: sipush 22852
      // 07d: ldc2_w 268229188908140796
      // 080: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 089: athrow
      // 08a: aload 1
      // 08b: ifnull 119
      // 08e: if_icmplt 105
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 097: athrow
      // 098: aload 0
      // 099: getfield com/finalshell/core/HB_2.t I
      // 09c: sipush 19124
      // 09f: ldc2_w 7721057503120513815
      // 0a2: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 0a5: aload 1
      // 0a6: ifnull 119
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0af: athrow
      // 0b0: if_icmpgt 105
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 0be: getfield com/finalshell/core/FU.E I
      // 0c1: aload 0
      // 0c2: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 0c5: getfield com/finalshell/core/F9.E I
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ce: athrow
      // 0cf: isub
      // 0d0: istore 3
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0d5: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 0dc: getfield com/finalshell/core/F9.E I
      // 0df: bipush 1
      // 0e0: iadd
      // 0e1: iload 3
      // 0e2: sipush 30342
      // 0e5: ldc2_w 4867526983010903863
      // 0e8: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 0eb: ishr
      // 0ec: i2b
      // 0ed: bastore
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 0f2: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 0f5: aload 0
      // 0f6: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 0f9: getfield com/finalshell/core/F9.E I
      // 0fc: bipush 2
      // 0fd: iadd
      // 0fe: iload 3
      // 0ff: i2b
      // 100: bastore
      // 101: aload 1
      // 102: ifnonnull 1de
      // 105: aload 0
      // 106: getfield com/finalshell/core/HB_2.t I
      // 109: sipush 5027
      // 10c: ldc2_w 5893217767865385478
      // 10f: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 118: athrow
      // 119: aload 1
      // 11a: ifnull 13b
      // 11d: if_icmplt 1ce
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 126: athrow
      // 127: aload 0
      // 128: getfield com/finalshell/core/HB_2.t I
      // 12b: sipush 11797
      // 12e: ldc2_w 7041972543386042292
      // 131: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 13a: athrow
      // 13b: aload 1
      // 13c: ifnull 15e
      // 13f: if_icmpgt 1ce
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield com/finalshell/core/HB_2.G Lcom/finalshell/core/FU;
      // 14d: getfield com/finalshell/core/FU.E I
      // 150: aload 0
      // 151: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 154: getfield com/finalshell/core/F9.E I
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 15d: athrow
      // 15e: isub
      // 15f: istore 3
      // 160: aload 0
      // 161: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 164: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 167: aload 0
      // 168: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 16b: getfield com/finalshell/core/F9.E I
      // 16e: bipush 1
      // 16f: iadd
      // 170: iload 3
      // 171: sipush 1175
      // 174: ldc2_w 4251963079344985376
      // 177: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 17a: ishr
      // 17b: i2b
      // 17c: bastore
      // 17d: aload 0
      // 17e: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 181: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 184: aload 0
      // 185: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 188: getfield com/finalshell/core/F9.E I
      // 18b: bipush 2
      // 18c: iadd
      // 18d: iload 3
      // 18e: sipush 3161
      // 191: ldc2_w 4218363736397159933
      // 194: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 197: ishr
      // 198: i2b
      // 199: bastore
      // 19a: aload 0
      // 19b: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 19e: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 1a1: aload 0
      // 1a2: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 1a5: getfield com/finalshell/core/F9.E I
      // 1a8: bipush 3
      // 1a9: iadd
      // 1aa: iload 3
      // 1ab: sipush 11108
      // 1ae: ldc2_w 246704418349988558
      // 1b1: invokestatic com/finalshell/core/HB_2.a (IJ)I
      // 1b4: ishr
      // 1b5: i2b
      // 1b6: bastore
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/core/HB_2.K Lcom/finalshell/core/B3_2;
      // 1bb: invokestatic com/finalshell/core/B3_2.s$arrbyte (Lcom/finalshell/core/B3_2;)[B
      // 1be: aload 0
      // 1bf: getfield com/finalshell/core/HB_2.g Lcom/finalshell/core/F9;
      // 1c2: getfield com/finalshell/core/F9.E I
      // 1c5: bipush 4
      // 1c6: iadd
      // 1c7: iload 3
      // 1c8: i2b
      // 1c9: bastore
      // 1ca: aload 1
      // 1cb: ifnonnull 1de
      // 1ce: new java/lang/AssertionError
      // 1d1: dup
      // 1d2: aload 0
      // 1d3: getfield com/finalshell/core/HB_2.t I
      // 1d6: invokespecial java/lang/AssertionError.<init> (I)V
      // 1d9: athrow
      // 1da: invokestatic com/finalshell/core/HB_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 1dd: athrow
      // 1de: return
   }

   static F9 F(HB_2 var0) {
      return var0.g;
   }

   static FU y(HB_2 var0) {
      return var0.G;
   }

   public static P_5 a(P_5 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -16866) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 102;
               break;
            case 1:
               var10000 = 135;
               break;
            case 2:
               var10000 = 209;
               break;
            case 3:
               var10000 = 58;
               break;
            case 4:
               var10000 = 68;
               break;
            case 5:
               var10000 = 218;
               break;
            case 6:
               var10000 = 96;
               break;
            case 7:
               var10000 = 200;
               break;
            case 8:
               var10000 = 226;
               break;
            case 9:
               var10000 = 56;
               break;
            case 10:
               var10000 = 128;
               break;
            case 11:
               var10000 = 29;
               break;
            case 12:
               var10000 = 98;
               break;
            case 13:
               var10000 = 45;
               break;
            case 14:
               var10000 = 105;
               break;
            case 15:
               var10000 = 32;
               break;
            case 16:
               var10000 = 59;
               break;
            case 17:
               var10000 = 27;
               break;
            case 18:
               var10000 = 157;
               break;
            case 19:
               var10000 = 243;
               break;
            case 20:
               var10000 = 94;
               break;
            case 21:
               var10000 = 1;
               break;
            case 22:
               var10000 = 5;
               break;
            case 23:
               var10000 = 233;
               break;
            case 24:
               var10000 = 154;
               break;
            case 25:
               var10000 = 201;
               break;
            case 26:
               var10000 = 174;
               break;
            case 27:
               var10000 = 41;
               break;
            case 28:
               var10000 = 107;
               break;
            case 29:
               var10000 = 33;
               break;
            case 30:
               var10000 = 220;
               break;
            case 31:
               var10000 = 207;
               break;
            case 32:
               var10000 = 146;
               break;
            case 33:
               var10000 = 238;
               break;
            case 34:
               var10000 = 121;
               break;
            case 35:
               var10000 = 165;
               break;
            case 36:
               var10000 = 187;
               break;
            case 37:
               var10000 = 123;
               break;
            case 38:
               var10000 = 0;
               break;
            case 39:
               var10000 = 61;
               break;
            case 40:
               var10000 = 193;
               break;
            case 41:
               var10000 = 219;
               break;
            case 42:
               var10000 = 254;
               break;
            case 43:
               var10000 = 20;
               break;
            case 44:
               var10000 = 132;
               break;
            case 45:
               var10000 = 28;
               break;
            case 46:
               var10000 = 230;
               break;
            case 47:
               var10000 = 62;
               break;
            case 48:
               var10000 = 76;
               break;
            case 49:
               var10000 = 9;
               break;
            case 50:
               var10000 = 43;
               break;
            case 51:
               var10000 = 122;
               break;
            case 52:
               var10000 = 253;
               break;
            case 53:
               var10000 = 158;
               break;
            case 54:
               var10000 = 69;
               break;
            case 55:
               var10000 = 44;
               break;
            case 56:
               var10000 = 130;
               break;
            case 57:
               var10000 = 120;
               break;
            case 58:
               var10000 = 242;
               break;
            case 59:
               var10000 = 215;
               break;
            case 60:
               var10000 = 116;
               break;
            case 61:
               var10000 = 163;
               break;
            case 62:
               var10000 = 4;
               break;
            case 63:
               var10000 = 42;
               break;
            case 64:
               var10000 = 252;
               break;
            case 65:
               var10000 = 205;
               break;
            case 66:
               var10000 = 40;
               break;
            case 67:
               var10000 = 255;
               break;
            case 68:
               var10000 = 86;
               break;
            case 69:
               var10000 = 175;
               break;
            case 70:
               var10000 = 214;
               break;
            case 71:
               var10000 = 195;
               break;
            case 72:
               var10000 = 64;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 101;
               break;
            case 75:
               var10000 = 16;
               break;
            case 76:
               var10000 = 84;
               break;
            case 77:
               var10000 = 92;
               break;
            case 78:
               var10000 = 115;
               break;
            case 79:
               var10000 = 162;
               break;
            case 80:
               var10000 = 125;
               break;
            case 81:
               var10000 = 176;
               break;
            case 82:
               var10000 = 140;
               break;
            case 83:
               var10000 = 18;
               break;
            case 84:
               var10000 = 34;
               break;
            case 85:
               var10000 = 35;
               break;
            case 86:
               var10000 = 151;
               break;
            case 87:
               var10000 = 46;
               break;
            case 88:
               var10000 = 117;
               break;
            case 89:
               var10000 = 167;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 25;
               break;
            case 92:
               var10000 = 225;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 93;
               break;
            case 95:
               var10000 = 114;
               break;
            case 96:
               var10000 = 153;
               break;
            case 97:
               var10000 = 150;
               break;
            case 98:
               var10000 = 184;
               break;
            case 99:
               var10000 = 161;
               break;
            case 100:
               var10000 = 2;
               break;
            case 101:
               var10000 = 30;
               break;
            case 102:
               var10000 = 133;
               break;
            case 103:
               var10000 = 11;
               break;
            case 104:
               var10000 = 181;
               break;
            case 105:
               var10000 = 70;
               break;
            case 106:
               var10000 = 81;
               break;
            case 107:
               var10000 = 17;
               break;
            case 108:
               var10000 = 210;
               break;
            case 109:
               var10000 = 73;
               break;
            case 110:
               var10000 = 103;
               break;
            case 111:
               var10000 = 91;
               break;
            case 112:
               var10000 = 67;
               break;
            case 113:
               var10000 = 79;
               break;
            case 114:
               var10000 = 188;
               break;
            case 115:
               var10000 = 149;
               break;
            case 116:
               var10000 = 63;
               break;
            case 117:
               var10000 = 141;
               break;
            case 118:
               var10000 = 189;
               break;
            case 119:
               var10000 = 164;
               break;
            case 120:
               var10000 = 7;
               break;
            case 121:
               var10000 = 95;
               break;
            case 122:
               var10000 = 186;
               break;
            case 123:
               var10000 = 55;
               break;
            case 124:
               var10000 = 152;
               break;
            case 125:
               var10000 = 110;
               break;
            case 126:
               var10000 = 31;
               break;
            case 127:
               var10000 = 160;
               break;
            case 128:
               var10000 = 206;
               break;
            case 129:
               var10000 = 109;
               break;
            case 130:
               var10000 = 182;
               break;
            case 131:
               var10000 = 60;
               break;
            case 132:
               var10000 = 51;
               break;
            case 133:
               var10000 = 248;
               break;
            case 134:
               var10000 = 194;
               break;
            case 135:
               var10000 = 148;
               break;
            case 136:
               var10000 = 74;
               break;
            case 137:
               var10000 = 80;
               break;
            case 138:
               var10000 = 169;
               break;
            case 139:
               var10000 = 77;
               break;
            case 140:
               var10000 = 145;
               break;
            case 141:
               var10000 = 212;
               break;
            case 142:
               var10000 = 24;
               break;
            case 143:
               var10000 = 245;
               break;
            case 144:
               var10000 = 204;
               break;
            case 145:
               var10000 = 54;
               break;
            case 146:
               var10000 = 156;
               break;
            case 147:
               var10000 = 223;
               break;
            case 148:
               var10000 = 246;
               break;
            case 149:
               var10000 = 39;
               break;
            case 150:
               var10000 = 241;
               break;
            case 151:
               var10000 = 247;
               break;
            case 152:
               var10000 = 178;
               break;
            case 153:
               var10000 = 228;
               break;
            case 154:
               var10000 = 87;
               break;
            case 155:
               var10000 = 203;
               break;
            case 156:
               var10000 = 21;
               break;
            case 157:
               var10000 = 26;
               break;
            case 158:
               var10000 = 136;
               break;
            case 159:
               var10000 = 185;
               break;
            case 160:
               var10000 = 196;
               break;
            case 161:
               var10000 = 202;
               break;
            case 162:
               var10000 = 244;
               break;
            case 163:
               var10000 = 47;
               break;
            case 164:
               var10000 = 85;
               break;
            case 165:
               var10000 = 216;
               break;
            case 166:
               var10000 = 6;
               break;
            case 167:
               var10000 = 126;
               break;
            case 168:
               var10000 = 111;
               break;
            case 169:
               var10000 = 119;
               break;
            case 170:
               var10000 = 71;
               break;
            case 171:
               var10000 = 170;
               break;
            case 172:
               var10000 = 23;
               break;
            case 173:
               var10000 = 229;
               break;
            case 174:
               var10000 = 8;
               break;
            case 175:
               var10000 = 65;
               break;
            case 176:
               var10000 = 208;
               break;
            case 177:
               var10000 = 57;
               break;
            case 178:
               var10000 = 211;
               break;
            case 179:
               var10000 = 134;
               break;
            case 180:
               var10000 = 171;
               break;
            case 181:
               var10000 = 113;
               break;
            case 182:
               var10000 = 251;
               break;
            case 183:
               var10000 = 83;
               break;
            case 184:
               var10000 = 159;
               break;
            case 185:
               var10000 = 19;
               break;
            case 186:
               var10000 = 97;
               break;
            case 187:
               var10000 = 213;
               break;
            case 188:
               var10000 = 53;
               break;
            case 189:
               var10000 = 144;
               break;
            case 190:
               var10000 = 127;
               break;
            case 191:
               var10000 = 78;
               break;
            case 192:
               var10000 = 166;
               break;
            case 193:
               var10000 = 99;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 82;
               break;
            case 196:
               var10000 = 12;
               break;
            case 197:
               var10000 = 118;
               break;
            case 198:
               var10000 = 48;
               break;
            case 199:
               var10000 = 155;
               break;
            case 200:
               var10000 = 14;
               break;
            case 201:
               var10000 = 168;
               break;
            case 202:
               var10000 = 52;
               break;
            case 203:
               var10000 = 179;
               break;
            case 204:
               var10000 = 197;
               break;
            case 205:
               var10000 = 191;
               break;
            case 206:
               var10000 = 129;
               break;
            case 207:
               var10000 = 240;
               break;
            case 208:
               var10000 = 106;
               break;
            case 209:
               var10000 = 36;
               break;
            case 210:
               var10000 = 232;
               break;
            case 211:
               var10000 = 15;
               break;
            case 212:
               var10000 = 37;
               break;
            case 213:
               var10000 = 236;
               break;
            case 214:
               var10000 = 180;
               break;
            case 215:
               var10000 = 112;
               break;
            case 216:
               var10000 = 198;
               break;
            case 217:
               var10000 = 147;
               break;
            case 218:
               var10000 = 177;
               break;
            case 219:
               var10000 = 235;
               break;
            case 220:
               var10000 = 192;
               break;
            case 221:
               var10000 = 221;
               break;
            case 222:
               var10000 = 13;
               break;
            case 223:
               var10000 = 199;
               break;
            case 224:
               var10000 = 3;
               break;
            case 225:
               var10000 = 172;
               break;
            case 226:
               var10000 = 131;
               break;
            case 227:
               var10000 = 124;
               break;
            case 228:
               var10000 = 100;
               break;
            case 229:
               var10000 = 50;
               break;
            case 230:
               var10000 = 49;
               break;
            case 231:
               var10000 = 250;
               break;
            case 232:
               var10000 = 139;
               break;
            case 233:
               var10000 = 222;
               break;
            case 234:
               var10000 = 88;
               break;
            case 235:
               var10000 = 142;
               break;
            case 236:
               var10000 = 231;
               break;
            case 237:
               var10000 = 237;
               break;
            case 238:
               var10000 = 108;
               break;
            case 239:
               var10000 = 183;
               break;
            case 240:
               var10000 = 22;
               break;
            case 241:
               var10000 = 249;
               break;
            case 242:
               var10000 = 89;
               break;
            case 243:
               var10000 = 75;
               break;
            case 244:
               var10000 = 143;
               break;
            case 245:
               var10000 = 90;
               break;
            case 246:
               var10000 = 66;
               break;
            case 247:
               var10000 = 224;
               break;
            case 248:
               var10000 = 38;
               break;
            case 249:
               var10000 = 217;
               break;
            case 250:
               var10000 = 173;
               break;
            case 251:
               var10000 = 10;
               break;
            case 252:
               var10000 = 234;
               break;
            case 253:
               var10000 = 137;
               break;
            case 254:
               var10000 = 190;
               break;
            default:
               var10000 = 104;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4515;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "P\u000b¢\u0019ZJ\u008a¥V\t7a»4;\u001a!N©%x\u000bf\u009dÜ«Ò\\\u0096\u000bVÓ\u0096\u0085*iwT\u0090\u009f\u0088\u0005_DÊ\u0091\u007fUC§2)l\u008dõ¿×6\u0016Á\u007fÅ¯åíð!X)\u0086É\u009d\u0096Ú.KÝ \u0092ÈÒ\u009dèïâ\u0005\u0085\u0092É,,\u001fs\u00ad\u008a\u0094H´n:À";
      int var12 = "P\u000b¢\u0019ZJ\u008a¥V\t7a»4;\u001a!N©%x\u000bf\u009dÜ«Ò\\\u0096\u000bVÓ\u0096\u0085*iwT\u0090\u009f\u0088\u0005_DÊ\u0091\u007fUC§2)l\u008dõ¿×6\u0016Á\u007fÅ¯åíð!X)\u0086É\u009d\u0096Ú.KÝ \u0092ÈÒ\u009dèïâ\u0005\u0085\u0092É,,\u001fs\u00ad\u008a\u0094H´n:À"
         .length();
      char var9 = '2';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 110;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 110;
               var10006 = var14;
            } else {
               var27 = 110;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 110;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 33;
                     break;
                  case 1:
                     var47 = 77;
                     break;
                  case 2:
                     var47 = 106;
                     break;
                  case 3:
                     var47 = 81;
                     break;
                  case 4:
                     var47 = 44;
                     break;
                  case 5:
                     var47 = 55;
                     break;
                  default:
                     var47 = 69;
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
            b = new String[2];
            long var0 = 6793380227524903018L;
            long[] var6 = new long[30];
            int var3 = 0;
            String var4 = "¼ Û\u0092Ö\u0014\u001bº\u001bV&Yí\u009c¾\u0091w\u0082\u0097\u000f+\\ÿ\u0017'½j\u0003\u0098ªÈ\u0084\u0011£q¬Á¸ÿg÷R8õçcz,ä`ûXàkÂ¤\u008dÔÌª\u001c\u009f]\u0087Ì\u009bWt\n,\u0019´!©Ë\u001bq\u008dú¬\u0092~ü>ÿvc³t¹Gà\u0003É¡÷Ù\u0016j\u0019\u0014\u0085å\u0089¾B<n±_>[wõ\u0083>\u001fhi\u0000CZ6\u0015ÓÏ8\u0099û§\u009eÛþ\nÁÍpéãÙßJ\bz²¿Á \u00816§UÍ\fkQâÖ²\u009c\u00879}K{§ÕRv³\u001dë\u000fW\u0088$\u0086)6pþM|¾YÍj½ÝË\u009fP\u009c\u0013yß¦,\u0012È\u0083\u0095\u0002-4]ú¤J\u0085·5±\u008co\f¯À\u0099zF\u008a\bP";
            int var5 = "¼ Û\u0092Ö\u0014\u001bº\u001bV&Yí\u009c¾\u0091w\u0082\u0097\u000f+\\ÿ\u0017'½j\u0003\u0098ªÈ\u0084\u0011£q¬Á¸ÿg÷R8õçcz,ä`ûXàkÂ¤\u008dÔÌª\u001c\u009f]\u0087Ì\u009bWt\n,\u0019´!©Ë\u001bq\u008dú¬\u0092~ü>ÿvc³t¹Gà\u0003É¡÷Ù\u0016j\u0019\u0014\u0085å\u0089¾B<n±_>[wõ\u0083>\u001fhi\u0000CZ6\u0015ÓÏ8\u0099û§\u009eÛþ\nÁÍpéãÙßJ\bz²¿Á \u00816§UÍ\fkQâÖ²\u009c\u00879}K{§ÕRv³\u001dë\u000fW\u0088$\u0086)6pþM|¾YÍj½ÝË\u009fP\u009c\u0013yß¦,\u0012È\u0083\u0095\u0002-4]ú¤J\u0085·5±\u008co\f¯À\u0099zF\u008a\bP"
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
                           c = var6;
                           d = new Integer[30];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "+«(Åãªç(~¾»#\u0097ÿØ\r";
                        var5 = "+«(Åãªç(~¾»#\u0097ÿØ\r".length();
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





