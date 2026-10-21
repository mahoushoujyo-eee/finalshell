package com.finalshell.core;

import java.math.BigInteger;

public class LW3 extends Ls4 {
   public byte[] V;
   public byte[] L;
   public byte[] b;
   public byte[] d;
   public byte[] y;
   public byte[] H;
   public byte[] M;
   public byte[] j;
   public int w;
   public static byte[] O;
   public static byte[] o;
   public static byte[] s;
   public static String[] a;
   public static String[] c;
   public static long[] e;
   public static Integer[] f;

   public LW3(Xe2 var1) {
      this(var1, null, null, null);
   }

   public LW3(Xe2 var1, byte[] var2, byte[] var3, byte[] var4) {
   super(var1);
      boolean var10000 = Dm4.F$boolean();
      this.w = b(4381, 9059953730157085362L);
      this.V = var2;
      boolean var5 = var10000;
      this.L = var3;
      LW3 var6 = this;
      if (var5) {
         this.b = var4;
         if (var2 == null) {
            return;
         }

         var6 = this;
      }

      var6.w = new BigInteger(var2).bitLength();
   }

   @Override
   public void K(int var1) throws Pc2 {
      this.w = var1;

      try {
         java.lang.Class var2 = java.lang.Class.forName(Xe2.r(b(-19778, 2726))).asSubclass(CO3.class);
         CO3 var3 = (CO3)var2.getDeclaredConstructor().newInstance();
         var3.D(var1);
         this.L = var3.l();
         this.b = var3.S();
         this.V = var3.w();
         this.d = var3.R();
         this.y = var3.M();
         this.H = var3.h();
         this.M = var3.C();
         this.j = var3.g();
         Object var5 = null;
      } catch (Exception var4) {
         throw new Pc2(var4.toString(), var4);
      }
   }

   @Override
   public byte[] Y() {
      return O;
   }

   @Override
   public byte[] d() {
      return o;
   }

   @Override
   public byte[] r$arrbyte() {
      int var1 = 1
         + this.M(1)
         + 1
         + 1
         + this.M(this.V.length)
         + this.V.length
         + 1
         + this.M(this.L.length)
         + this.L.length
         + 1
         + this.M(this.b.length)
         + this.b.length
         + 1
         + this.M(this.d.length)
         + this.d.length
         + 1
         + this.M(this.y.length)
         + this.y.length
         + 1
         + this.M(this.H.length)
         + this.H.length
         + 1
         + this.M(this.M.length)
         + this.M.length
         + 1
         + this.M(this.j.length)
         + this.j.length;
      int var2 = 1 + this.M(var1) + var1;
      byte[] var3 = new byte[var2];
      int var4 = 0;
      var4 = this.L(var3, var4, var1);
      var4 = this.O(var3, var4, new byte[1]);
      var4 = this.O(var3, var4, this.V);
      var4 = this.O(var3, var4, this.L);
      var4 = this.O(var3, var4, this.b);
      var4 = this.O(var3, var4, this.d);
      var4 = this.O(var3, var4, this.y);
      var4 = this.O(var3, var4, this.H);
      var4 = this.O(var3, var4, this.M);
      var4 = this.O(var3, var4, this.j);
      return var3;
   }

   @Override
   public boolean I(byte[] param1) {
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
      // 004: bipush 0
      // 005: istore 3
      // 006: bipush 0
      // 007: istore 4
      // 009: aload 0
      // 00a: getfield com/finalshell/core/LW3.P I
      // 00d: bipush 2
      // 00e: iload 2
      // 00f: ifne 028
      // 012: if_icmpeq 036
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/LW3.P I
      // 020: bipush 5
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: iload 2
      // 029: ifne 0c3
      // 02c: if_icmpne 0be
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: new com/finalshell/core/UJ
      // 039: dup
      // 03a: aload 1
      // 03b: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 03e: astore 5
      // 040: aload 5
      // 042: aload 1
      // 043: arraylength
      // 044: invokevirtual com/finalshell/core/UJ.S (I)V
      // 047: aload 5
      // 049: bipush 4
      // 04a: ldc ""
      // 04c: invokevirtual com/finalshell/core/UJ.U (ILjava/lang/String;)[[B
      // 04f: astore 6
      // 051: aload 0
      // 052: aload 6
      // 054: bipush 0
      // 055: aaload
      // 056: putfield com/finalshell/core/LW3.b [B
      // 059: aload 0
      // 05a: aload 6
      // 05c: bipush 1
      // 05d: aaload
      // 05e: putfield com/finalshell/core/LW3.d [B
      // 061: aload 0
      // 062: aload 6
      // 064: bipush 2
      // 065: aaload
      // 066: putfield com/finalshell/core/LW3.y [B
      // 069: aload 0
      // 06a: aload 6
      // 06c: bipush 3
      // 06d: aaload
      // 06e: putfield com/finalshell/core/LW3.j [B
      // 071: goto 0b2
      // 074: astore 6
      // 076: aload 0
      // 077: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 07a: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 07d: bipush 3
      // 07e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 083: iload 2
      // 084: ifne 0b1
      // 087: ifeq 0b0
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 0
      // 092: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 095: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 098: bipush 3
      // 099: sipush -19790
      // 09c: sipush -21635
      // 09f: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // 0a2: aload 6
      // 0a4: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: ireturn
      // 0b2: aload 0
      // 0b3: invokespecial com/finalshell/core/LW3.y$arrbyte ()[B
      // 0b6: pop
      // 0b7: aload 0
      // 0b8: invokespecial com/finalshell/core/LW3.c ()[B
      // 0bb: pop
      // 0bc: bipush 1
      // 0bd: ireturn
      // 0be: aload 0
      // 0bf: getfield com/finalshell/core/LW3.P I
      // 0c2: bipush 1
      // 0c3: iload 2
      // 0c4: ifne 1ab
      // 0c7: if_icmpne 1a6
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 1
      // 0d2: iload 3
      // 0d3: baload
      // 0d4: iload 2
      // 0d5: ifne 179
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: sipush 23255
      // 0e2: ldc2_w 490052710915000691
      // 0e5: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 0e8: if_icmpeq 16c
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: new com/finalshell/core/UJ
      // 0f5: dup
      // 0f6: aload 1
      // 0f7: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 0fa: astore 5
      // 0fc: aload 0
      // 0fd: aload 5
      // 0ff: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 102: putfield com/finalshell/core/LW3.L [B
      // 105: aload 0
      // 106: aload 5
      // 108: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 10b: putfield com/finalshell/core/LW3.b [B
      // 10e: aload 0
      // 10f: aload 5
      // 111: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 114: putfield com/finalshell/core/LW3.V [B
      // 117: aload 5
      // 119: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 11c: astore 6
      // 11e: aload 0
      // 11f: aload 5
      // 121: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 124: putfield com/finalshell/core/LW3.d [B
      // 127: aload 0
      // 128: aload 5
      // 12a: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 12d: putfield com/finalshell/core/LW3.y [B
      // 130: aload 0
      // 131: getfield com/finalshell/core/LW3.V [B
      // 134: iload 2
      // 135: ifne 169
      // 138: ifnull 15b
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 0
      // 143: new java/math/BigInteger
      // 146: dup
      // 147: aload 0
      // 148: getfield com/finalshell/core/LW3.V [B
      // 14b: invokespecial java/math/BigInteger.<init> ([B)V
      // 14e: invokevirtual java/math/BigInteger.bitLength ()I
      // 151: putfield com/finalshell/core/LW3.w I
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: aload 0
      // 15c: invokespecial com/finalshell/core/LW3.y$arrbyte ()[B
      // 15f: pop
      // 160: aload 0
      // 161: invokespecial com/finalshell/core/LW3.c ()[B
      // 164: pop
      // 165: aload 0
      // 166: invokespecial com/finalshell/core/LW3.z ()[B
      // 169: pop
      // 16a: bipush 1
      // 16b: ireturn
      // 16c: aload 0
      // 16d: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 170: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 173: bipush 3
      // 174: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 179: iload 2
      // 17a: ifne 1a5
      // 17d: ifeq 1a4
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 0
      // 188: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 18b: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 18e: bipush 3
      // 18f: sipush -19791
      // 192: sipush 11363
      // 195: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // 198: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: bipush 0
      // 1a5: ireturn
      // 1a6: aload 0
      // 1a7: getfield com/finalshell/core/LW3.P I
      // 1aa: bipush 4
      // 1ab: iload 2
      // 1ac: ifne 290
      // 1af: if_icmpne 270
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: new com/finalshell/core/UJ
      // 1bc: dup
      // 1bd: aload 1
      // 1be: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 1c1: astore 5
      // 1c3: aload 5
      // 1c5: invokevirtual com/finalshell/core/UJ.d ()I
      // 1c8: istore 6
      // 1ca: aload 5
      // 1cc: invokevirtual com/finalshell/core/UJ.d ()I
      // 1cf: istore 7
      // 1d1: iload 6
      // 1d3: iload 7
      // 1d5: if_icmpeq 1ed
      // 1d8: new com/finalshell/core/Pc2
      // 1db: dup
      // 1dc: sipush -19788
      // 1df: sipush -17116
      // 1e2: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // 1e5: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1e8: athrow
      // 1e9: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: aload 5
      // 1ef: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1f2: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1f5: astore 8
      // 1f7: aload 0
      // 1f8: aload 5
      // 1fa: invokevirtual com/finalshell/core/UJ.e ()[B
      // 1fd: putfield com/finalshell/core/LW3.V [B
      // 200: aload 0
      // 201: aload 5
      // 203: invokevirtual com/finalshell/core/UJ.e ()[B
      // 206: putfield com/finalshell/core/LW3.L [B
      // 209: aload 0
      // 20a: aload 5
      // 20c: invokevirtual com/finalshell/core/UJ.e ()[B
      // 20f: putfield com/finalshell/core/LW3.b [B
      // 212: aload 0
      // 213: aload 5
      // 215: invokevirtual com/finalshell/core/UJ.e ()[B
      // 218: putfield com/finalshell/core/LW3.j [B
      // 21b: aload 0
      // 21c: aload 5
      // 21e: invokevirtual com/finalshell/core/UJ.e ()[B
      // 221: putfield com/finalshell/core/LW3.d [B
      // 224: aload 0
      // 225: aload 5
      // 227: invokevirtual com/finalshell/core/UJ.e ()[B
      // 22a: putfield com/finalshell/core/LW3.y [B
      // 22d: aload 0
      // 22e: getfield com/finalshell/core/LW3.V [B
      // 231: iload 2
      // 232: ifne 26d
      // 235: ifnull 258
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: aload 0
      // 240: new java/math/BigInteger
      // 243: dup
      // 244: aload 0
      // 245: getfield com/finalshell/core/LW3.V [B
      // 248: invokespecial java/math/BigInteger.<init> ([B)V
      // 24b: invokevirtual java/math/BigInteger.bitLength ()I
      // 24e: putfield com/finalshell/core/LW3.w I
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: aload 0
      // 259: aload 5
      // 25b: invokevirtual com/finalshell/core/UJ.S ()[B
      // 25e: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 261: putfield com/finalshell/core/LW3.m Ljava/lang/String;
      // 264: aload 0
      // 265: invokespecial com/finalshell/core/LW3.y$arrbyte ()[B
      // 268: pop
      // 269: aload 0
      // 26a: invokespecial com/finalshell/core/LW3.c ()[B
      // 26d: pop
      // 26e: bipush 1
      // 26f: ireturn
      // 270: iinc 3 1
      // 273: aload 1
      // 274: iload 3
      // 275: iinc 3 1
      // 278: baload
      // 279: sipush 31060
      // 27c: ldc2_w 4591759866566437617
      // 27f: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 282: iand
      // 283: istore 4
      // 285: iload 4
      // 287: sipush 24098
      // 28a: ldc2_w 5068565405166325135
      // 28d: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 290: iand
      // 291: iload 2
      // 292: ifne 2e9
      // 295: ifeq 2e6
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29e: athrow
      // 29f: iload 4
      // 2a1: sipush 23448
      // 2a4: ldc2_w 4342323155024136246
      // 2a7: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 2aa: iand
      // 2ab: istore 5
      // 2ad: bipush 0
      // 2ae: istore 4
      // 2b0: iload 5
      // 2b2: iinc 5 -1
      // 2b5: ifle 2e6
      // 2b8: iload 4
      // 2ba: sipush 31459
      // 2bd: ldc2_w 4672271247400134978
      // 2c0: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 2c3: ishl
      // 2c4: aload 1
      // 2c5: iload 3
      // 2c6: iinc 3 1
      // 2c9: baload
      // 2ca: sipush 15852
      // 2cd: ldc2_w 5360830958521232970
      // 2d0: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 2d3: iand
      // 2d4: iadd
      // 2d5: istore 4
      // 2d7: iload 2
      // 2d8: ifne 30f
      // 2db: iload 2
      // 2dc: ifeq 2b0
      // 2df: goto 2e6
      // 2e2: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: iload 3
      // 2e8: baload
      // 2e9: bipush 2
      // 2ea: iload 2
      // 2eb: ifne 31a
      // 2ee: if_icmpeq 2fa
      // 2f1: goto 2f8
      // 2f4: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f7: athrow
      // 2f8: bipush 0
      // 2f9: ireturn
      // 2fa: iinc 3 1
      // 2fd: aload 1
      // 2fe: iload 3
      // 2ff: iinc 3 1
      // 302: baload
      // 303: sipush 15852
      // 306: ldc2_w 5360830958521232970
      // 309: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 30c: iand
      // 30d: istore 4
      // 30f: iload 4
      // 311: sipush 27121
      // 314: ldc2_w 6294279004533127763
      // 317: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 31a: iand
      // 31b: iload 2
      // 31c: ifne 396
      // 31f: ifeq 370
      // 322: goto 329
      // 325: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: iload 4
      // 32b: sipush 28986
      // 32e: ldc2_w 5331665851565957786
      // 331: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 334: iand
      // 335: istore 5
      // 337: bipush 0
      // 338: istore 4
      // 33a: iload 5
      // 33c: iinc 5 -1
      // 33f: ifle 370
      // 342: iload 4
      // 344: sipush 31459
      // 347: ldc2_w 4672271247400134978
      // 34a: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 34d: ishl
      // 34e: aload 1
      // 34f: iload 3
      // 350: iinc 3 1
      // 353: baload
      // 354: sipush 15852
      // 357: ldc2_w 5360830958521232970
      // 35a: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 35d: iand
      // 35e: iadd
      // 35f: istore 4
      // 361: iload 2
      // 362: ifne 38a
      // 365: iload 2
      // 366: ifeq 33a
      // 369: goto 370
      // 36c: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: iload 3
      // 371: iload 4
      // 373: iadd
      // 374: istore 3
      // 375: iinc 3 1
      // 378: aload 1
      // 379: iload 3
      // 37a: iinc 3 1
      // 37d: baload
      // 37e: sipush 15852
      // 381: ldc2_w 5360830958521232970
      // 384: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 387: iand
      // 388: istore 4
      // 38a: iload 4
      // 38c: sipush 27121
      // 38f: ldc2_w 6294279004533127763
      // 392: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 395: iand
      // 396: iload 2
      // 397: ifne 425
      // 39a: ifeq 3eb
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: iload 4
      // 3a6: sipush 28986
      // 3a9: ldc2_w 5331665851565957786
      // 3ac: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 3af: iand
      // 3b0: istore 5
      // 3b2: bipush 0
      // 3b3: istore 4
      // 3b5: iload 5
      // 3b7: iinc 5 -1
      // 3ba: ifle 3eb
      // 3bd: iload 4
      // 3bf: sipush 31459
      // 3c2: ldc2_w 4672271247400134978
      // 3c5: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 3c8: ishl
      // 3c9: aload 1
      // 3ca: iload 3
      // 3cb: iinc 3 1
      // 3ce: baload
      // 3cf: sipush 15852
      // 3d2: ldc2_w 5360830958521232970
      // 3d5: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 3d8: iand
      // 3d9: iadd
      // 3da: istore 4
      // 3dc: iload 2
      // 3dd: ifne 419
      // 3e0: iload 2
      // 3e1: ifeq 3b5
      // 3e4: goto 3eb
      // 3e7: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ea: athrow
      // 3eb: aload 0
      // 3ec: iload 4
      // 3ee: newarray 8
      // 3f0: putfield com/finalshell/core/LW3.V [B
      // 3f3: aload 1
      // 3f4: iload 3
      // 3f5: aload 0
      // 3f6: getfield com/finalshell/core/LW3.V [B
      // 3f9: bipush 0
      // 3fa: iload 4
      // 3fc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3ff: iload 3
      // 400: iload 4
      // 402: iadd
      // 403: istore 3
      // 404: iinc 3 1
      // 407: aload 1
      // 408: iload 3
      // 409: iinc 3 1
      // 40c: baload
      // 40d: sipush 15852
      // 410: ldc2_w 5360830958521232970
      // 413: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 416: iand
      // 417: istore 4
      // 419: iload 4
      // 41b: sipush 27121
      // 41e: ldc2_w 6294279004533127763
      // 421: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 424: iand
      // 425: iload 2
      // 426: ifne 4b4
      // 429: ifeq 47a
      // 42c: goto 433
      // 42f: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 432: athrow
      // 433: iload 4
      // 435: sipush 28986
      // 438: ldc2_w 5331665851565957786
      // 43b: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 43e: iand
      // 43f: istore 5
      // 441: bipush 0
      // 442: istore 4
      // 444: iload 5
      // 446: iinc 5 -1
      // 449: ifle 47a
      // 44c: iload 4
      // 44e: sipush 31459
      // 451: ldc2_w 4672271247400134978
      // 454: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 457: ishl
      // 458: aload 1
      // 459: iload 3
      // 45a: iinc 3 1
      // 45d: baload
      // 45e: sipush 15852
      // 461: ldc2_w 5360830958521232970
      // 464: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 467: iand
      // 468: iadd
      // 469: istore 4
      // 46b: iload 2
      // 46c: ifne 4a8
      // 46f: iload 2
      // 470: ifeq 444
      // 473: goto 47a
      // 476: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 479: athrow
      // 47a: aload 0
      // 47b: iload 4
      // 47d: newarray 8
      // 47f: putfield com/finalshell/core/LW3.L [B
      // 482: aload 1
      // 483: iload 3
      // 484: aload 0
      // 485: getfield com/finalshell/core/LW3.L [B
      // 488: bipush 0
      // 489: iload 4
      // 48b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 48e: iload 3
      // 48f: iload 4
      // 491: iadd
      // 492: istore 3
      // 493: iinc 3 1
      // 496: aload 1
      // 497: iload 3
      // 498: iinc 3 1
      // 49b: baload
      // 49c: sipush 15852
      // 49f: ldc2_w 5360830958521232970
      // 4a2: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 4a5: iand
      // 4a6: istore 4
      // 4a8: iload 4
      // 4aa: sipush 27121
      // 4ad: ldc2_w 6294279004533127763
      // 4b0: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 4b3: iand
      // 4b4: iload 2
      // 4b5: ifne 543
      // 4b8: ifeq 509
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c1: athrow
      // 4c2: iload 4
      // 4c4: sipush 28986
      // 4c7: ldc2_w 5331665851565957786
      // 4ca: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 4cd: iand
      // 4ce: istore 5
      // 4d0: bipush 0
      // 4d1: istore 4
      // 4d3: iload 5
      // 4d5: iinc 5 -1
      // 4d8: ifle 509
      // 4db: iload 4
      // 4dd: sipush 31459
      // 4e0: ldc2_w 4672271247400134978
      // 4e3: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 4e6: ishl
      // 4e7: aload 1
      // 4e8: iload 3
      // 4e9: iinc 3 1
      // 4ec: baload
      // 4ed: sipush 15852
      // 4f0: ldc2_w 5360830958521232970
      // 4f3: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 4f6: iand
      // 4f7: iadd
      // 4f8: istore 4
      // 4fa: iload 2
      // 4fb: ifne 537
      // 4fe: iload 2
      // 4ff: ifeq 4d3
      // 502: goto 509
      // 505: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 508: athrow
      // 509: aload 0
      // 50a: iload 4
      // 50c: newarray 8
      // 50e: putfield com/finalshell/core/LW3.b [B
      // 511: aload 1
      // 512: iload 3
      // 513: aload 0
      // 514: getfield com/finalshell/core/LW3.b [B
      // 517: bipush 0
      // 518: iload 4
      // 51a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 51d: iload 3
      // 51e: iload 4
      // 520: iadd
      // 521: istore 3
      // 522: iinc 3 1
      // 525: aload 1
      // 526: iload 3
      // 527: iinc 3 1
      // 52a: baload
      // 52b: sipush 15852
      // 52e: ldc2_w 5360830958521232970
      // 531: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 534: iand
      // 535: istore 4
      // 537: iload 4
      // 539: sipush 27121
      // 53c: ldc2_w 6294279004533127763
      // 53f: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 542: iand
      // 543: iload 2
      // 544: ifne 5d2
      // 547: ifeq 598
      // 54a: goto 551
      // 54d: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 550: athrow
      // 551: iload 4
      // 553: sipush 28986
      // 556: ldc2_w 5331665851565957786
      // 559: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 55c: iand
      // 55d: istore 5
      // 55f: bipush 0
      // 560: istore 4
      // 562: iload 5
      // 564: iinc 5 -1
      // 567: ifle 598
      // 56a: iload 4
      // 56c: sipush 31459
      // 56f: ldc2_w 4672271247400134978
      // 572: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 575: ishl
      // 576: aload 1
      // 577: iload 3
      // 578: iinc 3 1
      // 57b: baload
      // 57c: sipush 15852
      // 57f: ldc2_w 5360830958521232970
      // 582: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 585: iand
      // 586: iadd
      // 587: istore 4
      // 589: iload 2
      // 58a: ifne 5c6
      // 58d: iload 2
      // 58e: ifeq 562
      // 591: goto 598
      // 594: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 597: athrow
      // 598: aload 0
      // 599: iload 4
      // 59b: newarray 8
      // 59d: putfield com/finalshell/core/LW3.d [B
      // 5a0: aload 1
      // 5a1: iload 3
      // 5a2: aload 0
      // 5a3: getfield com/finalshell/core/LW3.d [B
      // 5a6: bipush 0
      // 5a7: iload 4
      // 5a9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5ac: iload 3
      // 5ad: iload 4
      // 5af: iadd
      // 5b0: istore 3
      // 5b1: iinc 3 1
      // 5b4: aload 1
      // 5b5: iload 3
      // 5b6: iinc 3 1
      // 5b9: baload
      // 5ba: sipush 15852
      // 5bd: ldc2_w 5360830958521232970
      // 5c0: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 5c3: iand
      // 5c4: istore 4
      // 5c6: iload 4
      // 5c8: sipush 27121
      // 5cb: ldc2_w 6294279004533127763
      // 5ce: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 5d1: iand
      // 5d2: iload 2
      // 5d3: ifne 661
      // 5d6: ifeq 627
      // 5d9: goto 5e0
      // 5dc: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5df: athrow
      // 5e0: iload 4
      // 5e2: sipush 28986
      // 5e5: ldc2_w 5331665851565957786
      // 5e8: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 5eb: iand
      // 5ec: istore 5
      // 5ee: bipush 0
      // 5ef: istore 4
      // 5f1: iload 5
      // 5f3: iinc 5 -1
      // 5f6: ifle 627
      // 5f9: iload 4
      // 5fb: sipush 31459
      // 5fe: ldc2_w 4672271247400134978
      // 601: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 604: ishl
      // 605: aload 1
      // 606: iload 3
      // 607: iinc 3 1
      // 60a: baload
      // 60b: sipush 15852
      // 60e: ldc2_w 5360830958521232970
      // 611: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 614: iand
      // 615: iadd
      // 616: istore 4
      // 618: iload 2
      // 619: ifne 655
      // 61c: iload 2
      // 61d: ifeq 5f1
      // 620: goto 627
      // 623: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 626: athrow
      // 627: aload 0
      // 628: iload 4
      // 62a: newarray 8
      // 62c: putfield com/finalshell/core/LW3.y [B
      // 62f: aload 1
      // 630: iload 3
      // 631: aload 0
      // 632: getfield com/finalshell/core/LW3.y [B
      // 635: bipush 0
      // 636: iload 4
      // 638: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 63b: iload 3
      // 63c: iload 4
      // 63e: iadd
      // 63f: istore 3
      // 640: iinc 3 1
      // 643: aload 1
      // 644: iload 3
      // 645: iinc 3 1
      // 648: baload
      // 649: sipush 15852
      // 64c: ldc2_w 5360830958521232970
      // 64f: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 652: iand
      // 653: istore 4
      // 655: iload 4
      // 657: sipush 27121
      // 65a: ldc2_w 6294279004533127763
      // 65d: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 660: iand
      // 661: iload 2
      // 662: ifne 6f0
      // 665: ifeq 6b6
      // 668: goto 66f
      // 66b: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66e: athrow
      // 66f: iload 4
      // 671: sipush 28986
      // 674: ldc2_w 5331665851565957786
      // 677: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 67a: iand
      // 67b: istore 5
      // 67d: bipush 0
      // 67e: istore 4
      // 680: iload 5
      // 682: iinc 5 -1
      // 685: ifle 6b6
      // 688: iload 4
      // 68a: sipush 31459
      // 68d: ldc2_w 4672271247400134978
      // 690: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 693: ishl
      // 694: aload 1
      // 695: iload 3
      // 696: iinc 3 1
      // 699: baload
      // 69a: sipush 15852
      // 69d: ldc2_w 5360830958521232970
      // 6a0: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 6a3: iand
      // 6a4: iadd
      // 6a5: istore 4
      // 6a7: iload 2
      // 6a8: ifne 6e4
      // 6ab: iload 2
      // 6ac: ifeq 680
      // 6af: goto 6b6
      // 6b2: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b5: athrow
      // 6b6: aload 0
      // 6b7: iload 4
      // 6b9: newarray 8
      // 6bb: putfield com/finalshell/core/LW3.H [B
      // 6be: aload 1
      // 6bf: iload 3
      // 6c0: aload 0
      // 6c1: getfield com/finalshell/core/LW3.H [B
      // 6c4: bipush 0
      // 6c5: iload 4
      // 6c7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6ca: iload 3
      // 6cb: iload 4
      // 6cd: iadd
      // 6ce: istore 3
      // 6cf: iinc 3 1
      // 6d2: aload 1
      // 6d3: iload 3
      // 6d4: iinc 3 1
      // 6d7: baload
      // 6d8: sipush 15852
      // 6db: ldc2_w 5360830958521232970
      // 6de: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 6e1: iand
      // 6e2: istore 4
      // 6e4: iload 4
      // 6e6: sipush 27121
      // 6e9: ldc2_w 6294279004533127763
      // 6ec: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 6ef: iand
      // 6f0: iload 2
      // 6f1: ifne 77f
      // 6f4: ifeq 745
      // 6f7: goto 6fe
      // 6fa: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6fd: athrow
      // 6fe: iload 4
      // 700: sipush 28986
      // 703: ldc2_w 5331665851565957786
      // 706: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 709: iand
      // 70a: istore 5
      // 70c: bipush 0
      // 70d: istore 4
      // 70f: iload 5
      // 711: iinc 5 -1
      // 714: ifle 745
      // 717: iload 4
      // 719: sipush 31459
      // 71c: ldc2_w 4672271247400134978
      // 71f: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 722: ishl
      // 723: aload 1
      // 724: iload 3
      // 725: iinc 3 1
      // 728: baload
      // 729: sipush 15852
      // 72c: ldc2_w 5360830958521232970
      // 72f: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 732: iand
      // 733: iadd
      // 734: istore 4
      // 736: iload 2
      // 737: ifne 773
      // 73a: iload 2
      // 73b: ifeq 70f
      // 73e: goto 745
      // 741: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 744: athrow
      // 745: aload 0
      // 746: iload 4
      // 748: newarray 8
      // 74a: putfield com/finalshell/core/LW3.M [B
      // 74d: aload 1
      // 74e: iload 3
      // 74f: aload 0
      // 750: getfield com/finalshell/core/LW3.M [B
      // 753: bipush 0
      // 754: iload 4
      // 756: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 759: iload 3
      // 75a: iload 4
      // 75c: iadd
      // 75d: istore 3
      // 75e: iinc 3 1
      // 761: aload 1
      // 762: iload 3
      // 763: iinc 3 1
      // 766: baload
      // 767: sipush 15852
      // 76a: ldc2_w 5360830958521232970
      // 76d: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 770: iand
      // 771: istore 4
      // 773: iload 4
      // 775: sipush 27121
      // 778: ldc2_w 6294279004533127763
      // 77b: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 77e: iand
      // 77f: iload 2
      // 780: ifne 7ec
      // 783: ifeq 7d4
      // 786: goto 78d
      // 789: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78c: athrow
      // 78d: iload 4
      // 78f: sipush 28986
      // 792: ldc2_w 5331665851565957786
      // 795: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 798: iand
      // 799: istore 5
      // 79b: bipush 0
      // 79c: istore 4
      // 79e: iload 5
      // 7a0: iinc 5 -1
      // 7a3: ifle 7d4
      // 7a6: iload 4
      // 7a8: sipush 31459
      // 7ab: ldc2_w 4672271247400134978
      // 7ae: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 7b1: ishl
      // 7b2: aload 1
      // 7b3: iload 3
      // 7b4: iinc 3 1
      // 7b7: baload
      // 7b8: sipush 15852
      // 7bb: ldc2_w 5360830958521232970
      // 7be: invokestatic com/finalshell/core/LW3.b (IJ)I
      // 7c1: iand
      // 7c2: iadd
      // 7c3: istore 4
      // 7c5: iload 2
      // 7c6: ifne 7ed
      // 7c9: iload 2
      // 7ca: ifeq 79e
      // 7cd: goto 7d4
      // 7d0: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d3: athrow
      // 7d4: aload 0
      // 7d5: iload 4
      // 7d7: newarray 8
      // 7d9: putfield com/finalshell/core/LW3.j [B
      // 7dc: aload 1
      // 7dd: iload 3
      // 7de: aload 0
      // 7df: getfield com/finalshell/core/LW3.j [B
      // 7e2: bipush 0
      // 7e3: iload 4
      // 7e5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 7e8: iload 3
      // 7e9: iload 4
      // 7eb: iadd
      // 7ec: istore 3
      // 7ed: aload 0
      // 7ee: iload 2
      // 7ef: ifne 807
      // 7f2: getfield com/finalshell/core/LW3.V [B
      // 7f5: ifnull 818
      // 7f8: goto 7ff
      // 7fb: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fe: athrow
      // 7ff: aload 0
      // 800: goto 807
      // 803: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 806: athrow
      // 807: new java/math/BigInteger
      // 80a: dup
      // 80b: aload 0
      // 80c: getfield com/finalshell/core/LW3.V [B
      // 80f: invokespecial java/math/BigInteger.<init> ([B)V
      // 812: invokevirtual java/math/BigInteger.bitLength ()I
      // 815: putfield com/finalshell/core/LW3.w I
      // 818: goto 857
      // 81b: astore 3
      // 81c: aload 0
      // 81d: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 820: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 823: bipush 3
      // 824: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 829: iload 2
      // 82a: ifne 856
      // 82d: ifeq 855
      // 830: goto 837
      // 833: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 836: athrow
      // 837: aload 0
      // 838: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 83b: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 83e: bipush 3
      // 83f: sipush -19791
      // 842: sipush 11363
      // 845: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // 848: aload 3
      // 849: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 84e: goto 855
      // 851: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 854: athrow
      // 855: bipush 0
      // 856: ireturn
      // 857: bipush 1
      // 858: ireturn
   }

   @Override
   public byte[] O() {
      boolean var10000 = Dm4.F$boolean();
      byte[] var2 = super.O();
      boolean var1 = var10000;
      byte[] var4 = var2;
      if (var1) {
         if (var2 != null) {
            return var2;
         }

         var4 = this.L;
      }

      if (var4 == null) {
         return null;
      } else {
         byte[][] var3 = new byte[][]{s, this.L, this.V};
         return UJ.h(var3).g;
      }
   }

   @Override
   public byte[] A() {
      return s;
   }

   public int y$int() {
      return 2;
   }

   @Override
   public int r$int() {
      return this.w;
   }

   @Override
   public byte[] l(byte[] var1) {
      return this.e(var1, b(-19792, -21127));
   }

   @Override
   public byte[] e(byte[] param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 2
      // 05: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 08: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b: ldc_w com/finalshell/core/Ip4
      // 0e: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 11: astore 4
      // 13: aload 4
      // 15: bipush 0
      // 16: anewarray 78
      // 19: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1c: bipush 0
      // 1d: anewarray 94
      // 20: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 23: checkcast com/finalshell/core/Ip4
      // 26: astore 5
      // 28: aload 5
      // 2a: invokeinterface com/finalshell/core/Ip4.k ()V 1
      // 2f: aload 5
      // 31: aload 0
      // 32: getfield com/finalshell/core/LW3.b [B
      // 35: aload 0
      // 36: getfield com/finalshell/core/LW3.V [B
      // 39: invokeinterface com/finalshell/core/Ip4.i ([B[B)V 3
      // 3e: aload 5
      // 40: aload 1
      // 41: invokeinterface com/finalshell/core/Ip4.d ([B)V 2
      // 46: aload 5
      // 48: invokeinterface com/finalshell/core/Ip4.k ()[B 1
      // 4d: astore 6
      // 4f: bipush 2
      // 50: anewarray 253
      // 53: astore 7
      // 55: aload 7
      // 57: bipush 0
      // 58: aload 2
      // 59: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 5c: aastore
      // 5d: aload 7
      // 5f: bipush 1
      // 60: aload 6
      // 62: aastore
      // 63: aload 7
      // 65: invokestatic com/finalshell/core/UJ.h ([[B)Lcom/finalshell/core/UJ;
      // 68: getfield com/finalshell/core/UJ.g [B
      // 6b: areturn
      // 6c: astore 4
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 72: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 75: bipush 3
      // 76: iload 3
      // 77: ifeq 98
      // 7a: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 7f: ifeq a8
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // 8d: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 90: bipush 3
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: sipush -19789
      // 9b: sipush 3233
      // 9e: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // a1: aload 4
      // a3: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // a8: aconst_null
      // a9: areturn
   }

   @Override
   public Al2 R() {
      return this.a$al_2(b(-19780, 23537));
   }

   @Override
   public Al2 a$al_2(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 08: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b: ldc_w com/finalshell/core/Ip4
      // 0e: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 11: astore 3
      // 12: aload 3
      // 13: bipush 0
      // 14: anewarray 78
      // 17: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1a: bipush 0
      // 1b: anewarray 94
      // 1e: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 21: checkcast com/finalshell/core/Ip4
      // 24: astore 4
      // 26: aload 4
      // 28: invokeinterface com/finalshell/core/Ip4.k ()V 1
      // 2d: iload 2
      // 2e: ifeq 9a
      // 31: aload 0
      // 32: getfield com/finalshell/core/LW3.L [B
      // 35: ifnonnull 8b
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/finalshell/core/LW3.V [B
      // 43: iload 2
      // 44: ifeq 63
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: ifnonnull 8b
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: invokevirtual com/finalshell/core/LW3.O ()[B
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: ifnull 8b
      // 66: new com/finalshell/core/UJ
      // 69: dup
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/core/LW3.O ()[B
      // 6e: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 71: astore 5
      // 73: aload 5
      // 75: invokevirtual com/finalshell/core/UJ.S ()[B
      // 78: pop
      // 79: aload 0
      // 7a: aload 5
      // 7c: invokevirtual com/finalshell/core/UJ.S ()[B
      // 7f: putfield com/finalshell/core/LW3.L [B
      // 82: aload 0
      // 83: aload 5
      // 85: invokevirtual com/finalshell/core/UJ.S ()[B
      // 88: putfield com/finalshell/core/LW3.V [B
      // 8b: aload 4
      // 8d: aload 0
      // 8e: getfield com/finalshell/core/LW3.L [B
      // 91: aload 0
      // 92: getfield com/finalshell/core/LW3.V [B
      // 95: invokeinterface com/finalshell/core/Ip4.Q ([B[B)V 3
      // 9a: aload 4
      // 9c: areturn
      // 9d: astore 3
      // 9e: aload 0
      // 9f: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // a2: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // a5: bipush 3
      // a6: iload 2
      // a7: ifeq c8
      // aa: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // af: ifeq d7
      // b2: goto b9
      // b5: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: aload 0
      // ba: getfield com/finalshell/core/LW3.Q Lcom/finalshell/core/Xe2;
      // bd: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // c0: bipush 3
      // c1: goto c8
      // c4: invokestatic com/finalshell/core/LW3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7: athrow
      // c8: sipush -19779
      // cb: sipush 25912
      // ce: invokestatic com/finalshell/core/LW3.b (II)Ljava/lang/String;
      // d1: aload 3
      // d2: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // d7: aconst_null
      // d8: areturn
   }

   public static Ls4 i(Xe2 var0, UJ var1) throws Pc2 {
      byte[][] var2 = var1.U(b(23558, 5094501075915100069L), b(-19786, 21277));
      byte[] var3 = var2[1];
      byte[] var4 = var2[2];
      byte[] var5 = var2[3];
      LW3 var6 = new LW3(var0, var3, var4, var5);
      var6.j = var2[4];
      var6.d = var2[5];
      var6.y = var2[b(5069, 5831075402987470945L)];
      var6.m = E8.B(var2[b(29995, 1275361076012017292L)]);
      var6.P = 0;
      return var6;
   }

   @Override
   public byte[] T$arrbyte() throws Pc2 {
      try {
         if (this.t()) {
            throw new Pc2(b(-19785, 19022));
         }
      } catch (Pc2 var3) {
         throw b(var3);
      }

      UJ var1 = new UJ();
      var1.q(s);
      var1.q(this.V);
      var1.q(this.L);
      var1.q(this.b);
      var1.q(this.z());
      var1.q(this.d);
      var1.q(this.y);
      var1.q(E8.J(this.m));
      byte[] var2 = new byte[var1.P()];
      var1.G(var2, 0, var2.length);
      return var2;
   }

   public byte[] y$arrbyte() {
      boolean var1 = Dm4.J$boolean();
      byte[] var10000 = this.H;
      if (!var1) {
         if (this.H == null) {
            this.H = new BigInteger(this.b).mod(new BigInteger(this.d).subtract(BigInteger.ONE)).toByteArray();
         }

         var10000 = this.H;
      }

      return var10000;
   }

   public byte[] c() {
      boolean var1 = Dm4.J$boolean();
      byte[] var10000 = this.M;
      if (!var1) {
         if (this.M == null) {
            this.M = new BigInteger(this.b).mod(new BigInteger(this.y).subtract(BigInteger.ONE)).toByteArray();
         }

         var10000 = this.M;
      }

      return var10000;
   }

   public byte[] z() {
      boolean var1 = Dm4.F$boolean();
      byte[] var10000 = this.j;
      if (var1) {
         if (this.j == null) {
            this.j = new BigInteger(this.y).modInverse(new BigInteger(this.d)).toByteArray();
         }

         var10000 = this.j;
      }

      return var10000;
   }

   @Override
   public void a$void() {
      super.a$void();
      E8.Q(this.b);
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -19785) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 182;
               break;
            case 1:
               var10000 = 214;
               break;
            case 2:
               var10000 = 241;
               break;
            case 3:
               var10000 = 81;
               break;
            case 4:
               var10000 = 170;
               break;
            case 5:
               var10000 = 6;
               break;
            case 6:
               var10000 = 226;
               break;
            case 7:
               var10000 = 203;
               break;
            case 8:
               var10000 = 213;
               break;
            case 9:
               var10000 = 144;
               break;
            case 10:
               var10000 = 229;
               break;
            case 11:
               var10000 = 42;
               break;
            case 12:
               var10000 = 141;
               break;
            case 13:
               var10000 = 29;
               break;
            case 14:
               var10000 = 89;
               break;
            case 15:
               var10000 = 218;
               break;
            case 16:
               var10000 = 142;
               break;
            case 17:
               var10000 = 211;
               break;
            case 18:
               var10000 = 197;
               break;
            case 19:
               var10000 = 101;
               break;
            case 20:
               var10000 = 60;
               break;
            case 21:
               var10000 = 61;
               break;
            case 22:
               var10000 = 186;
               break;
            case 23:
               var10000 = 111;
               break;
            case 24:
               var10000 = 129;
               break;
            case 25:
               var10000 = 103;
               break;
            case 26:
               var10000 = 34;
               break;
            case 27:
               var10000 = 140;
               break;
            case 28:
               var10000 = 148;
               break;
            case 29:
               var10000 = 86;
               break;
            case 30:
               var10000 = 44;
               break;
            case 31:
               var10000 = 90;
               break;
            case 32:
               var10000 = 43;
               break;
            case 33:
               var10000 = 166;
               break;
            case 34:
               var10000 = 51;
               break;
            case 35:
               var10000 = 14;
               break;
            case 36:
               var10000 = 87;
               break;
            case 37:
               var10000 = 92;
               break;
            case 38:
               var10000 = 254;
               break;
            case 39:
               var10000 = 115;
               break;
            case 40:
               var10000 = 50;
               break;
            case 41:
               var10000 = 46;
               break;
            case 42:
               var10000 = 193;
               break;
            case 43:
               var10000 = 38;
               break;
            case 44:
               var10000 = 219;
               break;
            case 45:
               var10000 = 217;
               break;
            case 46:
               var10000 = 185;
               break;
            case 47:
               var10000 = 135;
               break;
            case 48:
               var10000 = 64;
               break;
            case 49:
               var10000 = 12;
               break;
            case 50:
               var10000 = 139;
               break;
            case 51:
               var10000 = 163;
               break;
            case 52:
               var10000 = 93;
               break;
            case 53:
               var10000 = 45;
               break;
            case 54:
               var10000 = 22;
               break;
            case 55:
               var10000 = 77;
               break;
            case 56:
               var10000 = 192;
               break;
            case 57:
               var10000 = 239;
               break;
            case 58:
               var10000 = 2;
               break;
            case 59:
               var10000 = 84;
               break;
            case 60:
               var10000 = 157;
               break;
            case 61:
               var10000 = 122;
               break;
            case 62:
               var10000 = 79;
               break;
            case 63:
               var10000 = 249;
               break;
            case 64:
               var10000 = 69;
               break;
            case 65:
               var10000 = 75;
               break;
            case 66:
               var10000 = 11;
               break;
            case 67:
               var10000 = 98;
               break;
            case 68:
               var10000 = 55;
               break;
            case 69:
               var10000 = 247;
               break;
            case 70:
               var10000 = 181;
               break;
            case 71:
               var10000 = 132;
               break;
            case 72:
               var10000 = 49;
               break;
            case 73:
               var10000 = 183;
               break;
            case 74:
               var10000 = 221;
               break;
            case 75:
               var10000 = 17;
               break;
            case 76:
               var10000 = 169;
               break;
            case 77:
               var10000 = 179;
               break;
            case 78:
               var10000 = 13;
               break;
            case 79:
               var10000 = 208;
               break;
            case 80:
               var10000 = 31;
               break;
            case 81:
               var10000 = 237;
               break;
            case 82:
               var10000 = 190;
               break;
            case 83:
               var10000 = 105;
               break;
            case 84:
               var10000 = 238;
               break;
            case 85:
               var10000 = 204;
               break;
            case 86:
               var10000 = 137;
               break;
            case 87:
               var10000 = 71;
               break;
            case 88:
               var10000 = 233;
               break;
            case 89:
               var10000 = 62;
               break;
            case 90:
               var10000 = 16;
               break;
            case 91:
               var10000 = 228;
               break;
            case 92:
               var10000 = 9;
               break;
            case 93:
               var10000 = 74;
               break;
            case 94:
               var10000 = 82;
               break;
            case 95:
               var10000 = 104;
               break;
            case 96:
               var10000 = 230;
               break;
            case 97:
               var10000 = 30;
               break;
            case 98:
               var10000 = 112;
               break;
            case 99:
               var10000 = 150;
               break;
            case 100:
               var10000 = 210;
               break;
            case 101:
               var10000 = 188;
               break;
            case 102:
               var10000 = 78;
               break;
            case 103:
               var10000 = 121;
               break;
            case 104:
               var10000 = 1;
               break;
            case 105:
               var10000 = 118;
               break;
            case 106:
               var10000 = 128;
               break;
            case 107:
               var10000 = 126;
               break;
            case 108:
               var10000 = 102;
               break;
            case 109:
               var10000 = 149;
               break;
            case 110:
               var10000 = 242;
               break;
            case 111:
               var10000 = 194;
               break;
            case 112:
               var10000 = 127;
               break;
            case 113:
               var10000 = 235;
               break;
            case 114:
               var10000 = 58;
               break;
            case 115:
               var10000 = 116;
               break;
            case 116:
               var10000 = 243;
               break;
            case 117:
               var10000 = 200;
               break;
            case 118:
               var10000 = 8;
               break;
            case 119:
               var10000 = 255;
               break;
            case 120:
               var10000 = 26;
               break;
            case 121:
               var10000 = 227;
               break;
            case 122:
               var10000 = 18;
               break;
            case 123:
               var10000 = 232;
               break;
            case 124:
               var10000 = 178;
               break;
            case 125:
               var10000 = 146;
               break;
            case 126:
               var10000 = 209;
               break;
            case 127:
               var10000 = 206;
               break;
            case 128:
               var10000 = 164;
               break;
            case 129:
               var10000 = 83;
               break;
            case 130:
               var10000 = 130;
               break;
            case 131:
               var10000 = 177;
               break;
            case 132:
               var10000 = 114;
               break;
            case 133:
               var10000 = 120;
               break;
            case 134:
               var10000 = 54;
               break;
            case 135:
               var10000 = 145;
               break;
            case 136:
               var10000 = 152;
               break;
            case 137:
               var10000 = 162;
               break;
            case 138:
               var10000 = 36;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 156;
               break;
            case 141:
               var10000 = 0;
               break;
            case 142:
               var10000 = 246;
               break;
            case 143:
               var10000 = 245;
               break;
            case 144:
               var10000 = 94;
               break;
            case 145:
               var10000 = 63;
               break;
            case 146:
               var10000 = 119;
               break;
            case 147:
               var10000 = 153;
               break;
            case 148:
               var10000 = 175;
               break;
            case 149:
               var10000 = 23;
               break;
            case 150:
               var10000 = 72;
               break;
            case 151:
               var10000 = 171;
               break;
            case 152:
               var10000 = 215;
               break;
            case 153:
               var10000 = 33;
               break;
            case 154:
               var10000 = 222;
               break;
            case 155:
               var10000 = 133;
               break;
            case 156:
               var10000 = 244;
               break;
            case 157:
               var10000 = 65;
               break;
            case 158:
               var10000 = 202;
               break;
            case 159:
               var10000 = 199;
               break;
            case 160:
               var10000 = 134;
               break;
            case 161:
               var10000 = 66;
               break;
            case 162:
               var10000 = 24;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 5;
               break;
            case 165:
               var10000 = 161;
               break;
            case 166:
               var10000 = 91;
               break;
            case 167:
               var10000 = 27;
               break;
            case 168:
               var10000 = 223;
               break;
            case 169:
               var10000 = 97;
               break;
            case 170:
               var10000 = 138;
               break;
            case 171:
               var10000 = 52;
               break;
            case 172:
               var10000 = 147;
               break;
            case 173:
               var10000 = 4;
               break;
            case 174:
               var10000 = 158;
               break;
            case 175:
               var10000 = 96;
               break;
            case 176:
               var10000 = 125;
               break;
            case 177:
               var10000 = 191;
               break;
            case 178:
               var10000 = 68;
               break;
            case 179:
               var10000 = 80;
               break;
            case 180:
               var10000 = 168;
               break;
            case 181:
               var10000 = 196;
               break;
            case 182:
               var10000 = 131;
               break;
            case 183:
               var10000 = 15;
               break;
            case 184:
               var10000 = 123;
               break;
            case 185:
               var10000 = 195;
               break;
            case 186:
               var10000 = 187;
               break;
            case 187:
               var10000 = 108;
               break;
            case 188:
               var10000 = 85;
               break;
            case 189:
               var10000 = 151;
               break;
            case 190:
               var10000 = 173;
               break;
            case 191:
               var10000 = 240;
               break;
            case 192:
               var10000 = 53;
               break;
            case 193:
               var10000 = 176;
               break;
            case 194:
               var10000 = 117;
               break;
            case 195:
               var10000 = 32;
               break;
            case 196:
               var10000 = 231;
               break;
            case 197:
               var10000 = 59;
               break;
            case 198:
               var10000 = 184;
               break;
            case 199:
               var10000 = 155;
               break;
            case 200:
               var10000 = 252;
               break;
            case 201:
               var10000 = 250;
               break;
            case 202:
               var10000 = 165;
               break;
            case 203:
               var10000 = 212;
               break;
            case 204:
               var10000 = 180;
               break;
            case 205:
               var10000 = 19;
               break;
            case 206:
               var10000 = 10;
               break;
            case 207:
               var10000 = 73;
               break;
            case 208:
               var10000 = 172;
               break;
            case 209:
               var10000 = 3;
               break;
            case 210:
               var10000 = 21;
               break;
            case 211:
               var10000 = 107;
               break;
            case 212:
               var10000 = 253;
               break;
            case 213:
               var10000 = 154;
               break;
            case 214:
               var10000 = 251;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 47;
               break;
            case 218:
               var10000 = 48;
               break;
            case 219:
               var10000 = 201;
               break;
            case 220:
               var10000 = 57;
               break;
            case 221:
               var10000 = 143;
               break;
            case 222:
               var10000 = 7;
               break;
            case 223:
               var10000 = 236;
               break;
            case 224:
               var10000 = 225;
               break;
            case 225:
               var10000 = 159;
               break;
            case 226:
               var10000 = 106;
               break;
            case 227:
               var10000 = 189;
               break;
            case 228:
               var10000 = 224;
               break;
            case 229:
               var10000 = 110;
               break;
            case 230:
               var10000 = 95;
               break;
            case 231:
               var10000 = 41;
               break;
            case 232:
               var10000 = 88;
               break;
            case 233:
               var10000 = 20;
               break;
            case 234:
               var10000 = 37;
               break;
            case 235:
               var10000 = 220;
               break;
            case 236:
               var10000 = 205;
               break;
            case 237:
               var10000 = 76;
               break;
            case 238:
               var10000 = 174;
               break;
            case 239:
               var10000 = 28;
               break;
            case 240:
               var10000 = 39;
               break;
            case 241:
               var10000 = 234;
               break;
            case 242:
               var10000 = 35;
               break;
            case 243:
               var10000 = 109;
               break;
            case 244:
               var10000 = 67;
               break;
            case 245:
               var10000 = 248;
               break;
            case 246:
               var10000 = 167;
               break;
            case 247:
               var10000 = 40;
               break;
            case 248:
               var10000 = 56;
               break;
            case 249:
               var10000 = 207;
               break;
            case 250:
               var10000 = 70;
               break;
            case 251:
               var10000 = 216;
               break;
            case 252:
               var10000 = 99;
               break;
            case 253:
               var10000 = 25;
               break;
            case 254:
               var10000 = 124;
               break;
            default:
               var10000 = 136;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5028;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[12];
      int var11 = 0;
      String var10 = "\u0092\u009b?ágÌ\u000eJ?ñM÷BZøaê\u0012]\u000b\u008bØ\u001a\u0098@Ü?ÈãOë$\u000eß\u008e4\u001fiõ\u009a`IabÊ\\ª°?Æ8j\u008a)9Ô¡Ô³ÐÂ\u0000\u009cgJâXë\fr\u008d6ÌÛ\u0011\u009dÌÄªÂo\u001cuô\u007fÄqºA`×ÄdfÎæ£À.K tß_e\u0013\u0000å/\u0084\u0013\u0003-±ÿ¨Ýz\u008c°Y\u009fÑX\u0082ùÙ\u008f\u00011\u0013\u001bp²TÈ¨v\"1\u008c¯k^Õ93\u0097\\2\u0007¹VP\u0081¢l\u008f\u001dº\u0000àÞ\u0006±\u00804\u0003\nl§3K»Î+\u0083\u0012û:r\u0092'é\u0004?£é\u000eÀ±uô&.}MB^Ô¥¥o";
      int var12 = "\u0092\u009b?ágÌ\u000eJ?ñM÷BZøaê\u0012]\u000b\u008bØ\u001a\u0098@Ü?ÈãOë$\u000eß\u008e4\u001fiõ\u009a`IabÊ\\ª°?Æ8j\u008a)9Ô¡Ô³ÐÂ\u0000\u009cgJâXë\fr\u008d6ÌÛ\u0011\u009dÌÄªÂo\u001cuô\u007fÄqºA`×ÄdfÎæ£À.K tß_e\u0013\u0000å/\u0084\u0013\u0003-±ÿ¨Ýz\u008c°Y\u009fÑX\u0082ùÙ\u008f\u00011\u0013\u001bp²TÈ¨v\"1\u008c¯k^Õ93\u0097\\2\u0007¹VP\u0081¢l\u008f\u001dº\u0000àÞ\u0006±\u00804\u0003\nl§3K»Î+\u0083\u0012û:r\u0092'é\u0004?£é\u000eÀ±uô&.}MB^Ô¥¥o"
         .length();
      char var9 = 17;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 2;
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
                        var65 = 40;
                        break;
                     case 1:
                        var65 = 51;
                        break;
                     case 2:
                        var65 = 85;
                        break;
                     case 3:
                        var65 = 95;
                        break;
                     case 4:
                        var65 = 87;
                        break;
                     case 5:
                        var65 = 14;
                        break;
                     default:
                        var65 = 46;
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
                     a = var13;
                     c = new String[12];
                     long var0 = 9180169260350302216L;
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "Ä\u0017£]¦m¡Kª0\u001e\u0000\u0081µ\u0082\u0006R¯ÓO*°Æ½%µÜÙ\u0085-\u008e\u0083b\u008b¡SJ\u0088\u008aíz¢¯\u001df\u00ad\u0081B?\u001eó\tKF\u0092Ûö\u0082 )$à'¥S6¬ÍøµèoHË¶1\u0012æ%\u0007";
                     int var5 = "Ä\u0017£]¦m¡Kª0\u001e\u0000\u0081µ\u0082\u0006R¯ÓO*°Æ½%µÜÙ\u0085-\u008e\u0083b\u008b¡SJ\u0088\u008aíz¢¯\u001df\u00ad\u0081B?\u001eó\tKF\u0092Ûö\u0082 )$à'¥S6¬ÍøµèoHË¶1\u0012æ%\u0007"
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
                                    e = var6;
                                    f = new Integer[12];
                                    O = E8.J(b(-19787, 19408));
                                    o = E8.J(b(-19777, 31259));
                                    s = E8.J(b(-19780, 23537));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "áÇ(å\u009e\t A>\u0097¯ Ê^îº";
                                 var5 = "áÇ(å\u009e\t A>\u0097¯ Ê^îº".length();
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

                  var10 = "U\u001c\u009c>ê\u0002Õ\u0090¢=)©\u000f\t\u0010Z-h¼\u0087Væ´æ<\u0007èe\u009d\u0000ü»£";
                  var12 = "U\u001c\u009c>ê\u0002Õ\u0090¢=)©\u000f\t\u0010Z-h¼\u0087Væ´æ<\u0007èe\u009d\u0000ü»£".length();
                  var9 = 25;
                  var17 = -1;
            }

            var10000 = 5;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





