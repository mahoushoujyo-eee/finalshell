package com.finalshell.core;

import java.math.BigInteger;

public class L22 extends Ls4 {
   public byte[] p;
   public byte[] q;
   public byte[] I;
   public byte[] X;
   public byte[] w;
   public int a;
   public static byte[] J;
   public static byte[] e;
   public static byte[] j;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   public L22(Xe2 var1) {
      this(var1, null, null, null, null, null);
   }

   public L22(Xe2 var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5, byte[] var6) {
      super(var1);
      boolean var10000 = Dm4.F$boolean();
      this.a = b(14346, 2318369969496745296L);
      this.p = var2;
      this.q = var3;
      boolean var7 = var10000;
      this.I = var4;
      this.X = var5;
      L22 var8 = this;
      if (var7) {
         this.w = var6;
         if (var2 == null) {
            return;
         }

         var8 = this;
      }

      var8.a = new BigInteger(var2).bitLength();
   }

   @Override
   public void K(int var1) throws Pc2 {
      this.a = var1;

      try {
         java.lang.Class var2 = java.lang.Class.forName(Xe2.r(b(24230, -26798))).asSubclass(NN.class);
         NN var3 = (NN)var2.getDeclaredConstructor().newInstance();
         var3.E(var1);
         this.p = var3.I();
         this.q = var3.P();
         this.I = var3.z();
         this.X = var3.Z();
         this.w = var3.r();
         Object var5 = null;
      } catch (Exception var4) {
         throw new Pc2(var4.toString(), var4);
      }
   }

   @Override
   public byte[] Y() {
      return J;
   }

   @Override
   public byte[] d() {
      return e;
   }

   @Override
   public byte[] r$arrbyte() {
      int var1 = 1
         + this.M(1)
         + 1
         + 1
         + this.M(this.p.length)
         + this.p.length
         + 1
         + this.M(this.q.length)
         + this.q.length
         + 1
         + this.M(this.I.length)
         + this.I.length
         + 1
         + this.M(this.X.length)
         + this.X.length
         + 1
         + this.M(this.w.length)
         + this.w.length;
      int var2 = 1 + this.M(var1) + var1;
      byte[] var3 = new byte[var2];
      int var4 = 0;
      var4 = this.L(var3, var4, var1);
      var4 = this.O(var3, var4, new byte[1]);
      var4 = this.O(var3, var4, this.p);
      var4 = this.O(var3, var4, this.q);
      var4 = this.O(var3, var4, this.I);
      var4 = this.O(var3, var4, this.X);
      var4 = this.O(var3, var4, this.w);
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
      // 004: aload 0
      // 005: getfield com/finalshell/core/L22.P I
      // 008: bipush 1
      // 009: iload 2
      // 00a: ifne 0a2
      // 00d: if_icmpne 09d
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 1
      // 018: bipush 0
      // 019: baload
      // 01a: iload 2
      // 01b: ifne 09c
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: sipush 208
      // 028: ldc2_w 7533457503121563016
      // 02b: invokestatic com/finalshell/core/L22.b (IJ)I
      // 02e: if_icmpeq 09b
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: new com/finalshell/core/UJ
      // 03b: dup
      // 03c: aload 1
      // 03d: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 040: astore 3
      // 041: aload 3
      // 042: invokevirtual com/finalshell/core/UJ.d ()I
      // 045: iload 2
      // 046: ifne 09a
      // 049: pop
      // 04a: aload 0
      // 04b: aload 3
      // 04c: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 04f: putfield com/finalshell/core/L22.p [B
      // 052: aload 0
      // 053: aload 3
      // 054: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 057: putfield com/finalshell/core/L22.I [B
      // 05a: aload 0
      // 05b: aload 3
      // 05c: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 05f: putfield com/finalshell/core/L22.q [B
      // 062: aload 0
      // 063: aload 3
      // 064: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 067: putfield com/finalshell/core/L22.X [B
      // 06a: aload 0
      // 06b: aload 3
      // 06c: invokevirtual com/finalshell/core/UJ.c$arrbyte ()[B
      // 06f: putfield com/finalshell/core/L22.w [B
      // 072: aload 0
      // 073: getfield com/finalshell/core/L22.p [B
      // 076: ifnull 099
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 0
      // 081: new java/math/BigInteger
      // 084: dup
      // 085: aload 0
      // 086: getfield com/finalshell/core/L22.p [B
      // 089: invokespecial java/math/BigInteger.<init> ([B)V
      // 08c: invokevirtual java/math/BigInteger.bitLength ()I
      // 08f: putfield com/finalshell/core/L22.a I
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: bipush 1
      // 09a: ireturn
      // 09b: bipush 0
      // 09c: ireturn
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/L22.P I
      // 0a1: bipush 2
      // 0a2: iload 2
      // 0a3: ifne 0bc
      // 0a6: if_icmpeq 0ca
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield com/finalshell/core/L22.P I
      // 0b4: bipush 5
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: iload 2
      // 0bd: ifne 13d
      // 0c0: if_icmpne 12d
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: new com/finalshell/core/UJ
      // 0cd: dup
      // 0ce: aload 1
      // 0cf: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 0d2: astore 3
      // 0d3: aload 3
      // 0d4: aload 1
      // 0d5: arraylength
      // 0d6: invokevirtual com/finalshell/core/UJ.S (I)V
      // 0d9: aload 3
      // 0da: bipush 1
      // 0db: ldc ""
      // 0dd: invokevirtual com/finalshell/core/UJ.U (ILjava/lang/String;)[[B
      // 0e0: astore 4
      // 0e2: aload 0
      // 0e3: aload 4
      // 0e5: bipush 0
      // 0e6: aaload
      // 0e7: putfield com/finalshell/core/L22.w [B
      // 0ea: goto 12b
      // 0ed: astore 4
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 0f3: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 0f6: bipush 3
      // 0f7: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0fc: iload 2
      // 0fd: ifne 12a
      // 100: ifeq 129
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 10e: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 111: bipush 3
      // 112: sipush 24234
      // 115: sipush 30208
      // 118: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // 11b: aload 4
      // 11d: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: bipush 0
      // 12a: ireturn
      // 12b: bipush 1
      // 12c: ireturn
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/L22.P I
      // 131: iload 2
      // 132: ifne 1b0
      // 135: bipush 4
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: if_icmpne 1af
      // 140: new com/finalshell/core/UJ
      // 143: dup
      // 144: aload 1
      // 145: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 148: astore 3
      // 149: aload 3
      // 14a: invokevirtual com/finalshell/core/UJ.d ()I
      // 14d: istore 4
      // 14f: aload 3
      // 150: invokevirtual com/finalshell/core/UJ.d ()I
      // 153: istore 5
      // 155: iload 4
      // 157: iload 5
      // 159: if_icmpeq 171
      // 15c: new com/finalshell/core/Pc2
      // 15f: dup
      // 160: sipush 24227
      // 163: sipush 10278
      // 166: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // 169: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 16c: athrow
      // 16d: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: aload 3
      // 172: invokevirtual com/finalshell/core/UJ.S ()[B
      // 175: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 178: astore 6
      // 17a: aload 0
      // 17b: aload 3
      // 17c: invokevirtual com/finalshell/core/UJ.e ()[B
      // 17f: putfield com/finalshell/core/L22.p [B
      // 182: aload 0
      // 183: aload 3
      // 184: invokevirtual com/finalshell/core/UJ.e ()[B
      // 187: putfield com/finalshell/core/L22.q [B
      // 18a: aload 0
      // 18b: aload 3
      // 18c: invokevirtual com/finalshell/core/UJ.e ()[B
      // 18f: putfield com/finalshell/core/L22.I [B
      // 192: aload 0
      // 193: aload 3
      // 194: invokevirtual com/finalshell/core/UJ.e ()[B
      // 197: putfield com/finalshell/core/L22.X [B
      // 19a: aload 0
      // 19b: aload 3
      // 19c: invokevirtual com/finalshell/core/UJ.e ()[B
      // 19f: putfield com/finalshell/core/L22.w [B
      // 1a2: aload 0
      // 1a3: aload 3
      // 1a4: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1a7: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1aa: putfield com/finalshell/core/L22.m Ljava/lang/String;
      // 1ad: bipush 1
      // 1ae: ireturn
      // 1af: bipush 0
      // 1b0: istore 3
      // 1b1: bipush 0
      // 1b2: istore 4
      // 1b4: aload 1
      // 1b5: iload 3
      // 1b6: baload
      // 1b7: sipush 9325
      // 1ba: ldc2_w 6380068179268696371
      // 1bd: invokestatic com/finalshell/core/L22.b (IJ)I
      // 1c0: iload 2
      // 1c1: ifne 1f0
      // 1c4: if_icmpeq 1d0
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: bipush 0
      // 1cf: ireturn
      // 1d0: iinc 3 1
      // 1d3: aload 1
      // 1d4: iload 3
      // 1d5: iinc 3 1
      // 1d8: baload
      // 1d9: sipush 10848
      // 1dc: ldc2_w 267303873224341299
      // 1df: invokestatic com/finalshell/core/L22.b (IJ)I
      // 1e2: iand
      // 1e3: istore 4
      // 1e5: iload 4
      // 1e7: sipush 13412
      // 1ea: ldc2_w 1485198271905524018
      // 1ed: invokestatic com/finalshell/core/L22.b (IJ)I
      // 1f0: iand
      // 1f1: iload 2
      // 1f2: ifne 249
      // 1f5: ifeq 246
      // 1f8: goto 1ff
      // 1fb: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: iload 4
      // 201: sipush 1508
      // 204: ldc2_w 6333928915847436470
      // 207: invokestatic com/finalshell/core/L22.b (IJ)I
      // 20a: iand
      // 20b: istore 5
      // 20d: bipush 0
      // 20e: istore 4
      // 210: iload 5
      // 212: iinc 5 -1
      // 215: ifle 246
      // 218: iload 4
      // 21a: sipush 14340
      // 21d: ldc2_w 7543131611767956820
      // 220: invokestatic com/finalshell/core/L22.b (IJ)I
      // 223: ishl
      // 224: aload 1
      // 225: iload 3
      // 226: iinc 3 1
      // 229: baload
      // 22a: sipush 29102
      // 22d: ldc2_w 1264243196411751667
      // 230: invokestatic com/finalshell/core/L22.b (IJ)I
      // 233: iand
      // 234: iadd
      // 235: istore 4
      // 237: iload 2
      // 238: ifne 26f
      // 23b: iload 2
      // 23c: ifeq 210
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: aload 1
      // 247: iload 3
      // 248: baload
      // 249: bipush 2
      // 24a: iload 2
      // 24b: ifne 27a
      // 24e: if_icmpeq 25a
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: bipush 0
      // 259: ireturn
      // 25a: iinc 3 1
      // 25d: aload 1
      // 25e: iload 3
      // 25f: iinc 3 1
      // 262: baload
      // 263: sipush 29102
      // 266: ldc2_w 1264243196411751667
      // 269: invokestatic com/finalshell/core/L22.b (IJ)I
      // 26c: iand
      // 26d: istore 4
      // 26f: iload 4
      // 271: sipush 17151
      // 274: ldc2_w 7681352850076999587
      // 277: invokestatic com/finalshell/core/L22.b (IJ)I
      // 27a: iand
      // 27b: iload 2
      // 27c: ifne 2f6
      // 27f: ifeq 2d0
      // 282: goto 289
      // 285: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: iload 4
      // 28b: sipush 12479
      // 28e: ldc2_w 8440180439907757550
      // 291: invokestatic com/finalshell/core/L22.b (IJ)I
      // 294: iand
      // 295: istore 5
      // 297: bipush 0
      // 298: istore 4
      // 29a: iload 5
      // 29c: iinc 5 -1
      // 29f: ifle 2d0
      // 2a2: iload 4
      // 2a4: sipush 8243
      // 2a7: ldc2_w 2914778344116157802
      // 2aa: invokestatic com/finalshell/core/L22.b (IJ)I
      // 2ad: ishl
      // 2ae: aload 1
      // 2af: iload 3
      // 2b0: iinc 3 1
      // 2b3: baload
      // 2b4: sipush 29102
      // 2b7: ldc2_w 1264243196411751667
      // 2ba: invokestatic com/finalshell/core/L22.b (IJ)I
      // 2bd: iand
      // 2be: iadd
      // 2bf: istore 4
      // 2c1: iload 2
      // 2c2: ifne 2ea
      // 2c5: iload 2
      // 2c6: ifeq 29a
      // 2c9: goto 2d0
      // 2cc: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: iload 3
      // 2d1: iload 4
      // 2d3: iadd
      // 2d4: istore 3
      // 2d5: iinc 3 1
      // 2d8: aload 1
      // 2d9: iload 3
      // 2da: iinc 3 1
      // 2dd: baload
      // 2de: sipush 29102
      // 2e1: ldc2_w 1264243196411751667
      // 2e4: invokestatic com/finalshell/core/L22.b (IJ)I
      // 2e7: iand
      // 2e8: istore 4
      // 2ea: iload 4
      // 2ec: sipush 17151
      // 2ef: ldc2_w 7681352850076999587
      // 2f2: invokestatic com/finalshell/core/L22.b (IJ)I
      // 2f5: iand
      // 2f6: iload 2
      // 2f7: ifne 385
      // 2fa: ifeq 34b
      // 2fd: goto 304
      // 300: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 303: athrow
      // 304: iload 4
      // 306: sipush 12479
      // 309: ldc2_w 8440180439907757550
      // 30c: invokestatic com/finalshell/core/L22.b (IJ)I
      // 30f: iand
      // 310: istore 5
      // 312: bipush 0
      // 313: istore 4
      // 315: iload 5
      // 317: iinc 5 -1
      // 31a: ifle 34b
      // 31d: iload 4
      // 31f: sipush 8243
      // 322: ldc2_w 2914778344116157802
      // 325: invokestatic com/finalshell/core/L22.b (IJ)I
      // 328: ishl
      // 329: aload 1
      // 32a: iload 3
      // 32b: iinc 3 1
      // 32e: baload
      // 32f: sipush 29102
      // 332: ldc2_w 1264243196411751667
      // 335: invokestatic com/finalshell/core/L22.b (IJ)I
      // 338: iand
      // 339: iadd
      // 33a: istore 4
      // 33c: iload 2
      // 33d: ifne 379
      // 340: iload 2
      // 341: ifeq 315
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: aload 0
      // 34c: iload 4
      // 34e: newarray 8
      // 350: putfield com/finalshell/core/L22.p [B
      // 353: aload 1
      // 354: iload 3
      // 355: aload 0
      // 356: getfield com/finalshell/core/L22.p [B
      // 359: bipush 0
      // 35a: iload 4
      // 35c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 35f: iload 3
      // 360: iload 4
      // 362: iadd
      // 363: istore 3
      // 364: iinc 3 1
      // 367: aload 1
      // 368: iload 3
      // 369: iinc 3 1
      // 36c: baload
      // 36d: sipush 29102
      // 370: ldc2_w 1264243196411751667
      // 373: invokestatic com/finalshell/core/L22.b (IJ)I
      // 376: iand
      // 377: istore 4
      // 379: iload 4
      // 37b: sipush 17151
      // 37e: ldc2_w 7681352850076999587
      // 381: invokestatic com/finalshell/core/L22.b (IJ)I
      // 384: iand
      // 385: iload 2
      // 386: ifne 414
      // 389: ifeq 3da
      // 38c: goto 393
      // 38f: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 392: athrow
      // 393: iload 4
      // 395: sipush 12479
      // 398: ldc2_w 8440180439907757550
      // 39b: invokestatic com/finalshell/core/L22.b (IJ)I
      // 39e: iand
      // 39f: istore 5
      // 3a1: bipush 0
      // 3a2: istore 4
      // 3a4: iload 5
      // 3a6: iinc 5 -1
      // 3a9: ifle 3da
      // 3ac: iload 4
      // 3ae: sipush 8243
      // 3b1: ldc2_w 2914778344116157802
      // 3b4: invokestatic com/finalshell/core/L22.b (IJ)I
      // 3b7: ishl
      // 3b8: aload 1
      // 3b9: iload 3
      // 3ba: iinc 3 1
      // 3bd: baload
      // 3be: sipush 29102
      // 3c1: ldc2_w 1264243196411751667
      // 3c4: invokestatic com/finalshell/core/L22.b (IJ)I
      // 3c7: iand
      // 3c8: iadd
      // 3c9: istore 4
      // 3cb: iload 2
      // 3cc: ifne 408
      // 3cf: iload 2
      // 3d0: ifeq 3a4
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: aload 0
      // 3db: iload 4
      // 3dd: newarray 8
      // 3df: putfield com/finalshell/core/L22.q [B
      // 3e2: aload 1
      // 3e3: iload 3
      // 3e4: aload 0
      // 3e5: getfield com/finalshell/core/L22.q [B
      // 3e8: bipush 0
      // 3e9: iload 4
      // 3eb: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3ee: iload 3
      // 3ef: iload 4
      // 3f1: iadd
      // 3f2: istore 3
      // 3f3: iinc 3 1
      // 3f6: aload 1
      // 3f7: iload 3
      // 3f8: iinc 3 1
      // 3fb: baload
      // 3fc: sipush 29102
      // 3ff: ldc2_w 1264243196411751667
      // 402: invokestatic com/finalshell/core/L22.b (IJ)I
      // 405: iand
      // 406: istore 4
      // 408: iload 4
      // 40a: sipush 17151
      // 40d: ldc2_w 7681352850076999587
      // 410: invokestatic com/finalshell/core/L22.b (IJ)I
      // 413: iand
      // 414: iload 2
      // 415: ifne 4a3
      // 418: ifeq 469
      // 41b: goto 422
      // 41e: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 421: athrow
      // 422: iload 4
      // 424: sipush 12479
      // 427: ldc2_w 8440180439907757550
      // 42a: invokestatic com/finalshell/core/L22.b (IJ)I
      // 42d: iand
      // 42e: istore 5
      // 430: bipush 0
      // 431: istore 4
      // 433: iload 5
      // 435: iinc 5 -1
      // 438: ifle 469
      // 43b: iload 4
      // 43d: sipush 8243
      // 440: ldc2_w 2914778344116157802
      // 443: invokestatic com/finalshell/core/L22.b (IJ)I
      // 446: ishl
      // 447: aload 1
      // 448: iload 3
      // 449: iinc 3 1
      // 44c: baload
      // 44d: sipush 29102
      // 450: ldc2_w 1264243196411751667
      // 453: invokestatic com/finalshell/core/L22.b (IJ)I
      // 456: iand
      // 457: iadd
      // 458: istore 4
      // 45a: iload 2
      // 45b: ifne 497
      // 45e: iload 2
      // 45f: ifeq 433
      // 462: goto 469
      // 465: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 468: athrow
      // 469: aload 0
      // 46a: iload 4
      // 46c: newarray 8
      // 46e: putfield com/finalshell/core/L22.I [B
      // 471: aload 1
      // 472: iload 3
      // 473: aload 0
      // 474: getfield com/finalshell/core/L22.I [B
      // 477: bipush 0
      // 478: iload 4
      // 47a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 47d: iload 3
      // 47e: iload 4
      // 480: iadd
      // 481: istore 3
      // 482: iinc 3 1
      // 485: aload 1
      // 486: iload 3
      // 487: iinc 3 1
      // 48a: baload
      // 48b: sipush 29102
      // 48e: ldc2_w 1264243196411751667
      // 491: invokestatic com/finalshell/core/L22.b (IJ)I
      // 494: iand
      // 495: istore 4
      // 497: iload 4
      // 499: sipush 17151
      // 49c: ldc2_w 7681352850076999587
      // 49f: invokestatic com/finalshell/core/L22.b (IJ)I
      // 4a2: iand
      // 4a3: iload 2
      // 4a4: ifne 532
      // 4a7: ifeq 4f8
      // 4aa: goto 4b1
      // 4ad: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b0: athrow
      // 4b1: iload 4
      // 4b3: sipush 12479
      // 4b6: ldc2_w 8440180439907757550
      // 4b9: invokestatic com/finalshell/core/L22.b (IJ)I
      // 4bc: iand
      // 4bd: istore 5
      // 4bf: bipush 0
      // 4c0: istore 4
      // 4c2: iload 5
      // 4c4: iinc 5 -1
      // 4c7: ifle 4f8
      // 4ca: iload 4
      // 4cc: sipush 8243
      // 4cf: ldc2_w 2914778344116157802
      // 4d2: invokestatic com/finalshell/core/L22.b (IJ)I
      // 4d5: ishl
      // 4d6: aload 1
      // 4d7: iload 3
      // 4d8: iinc 3 1
      // 4db: baload
      // 4dc: sipush 29102
      // 4df: ldc2_w 1264243196411751667
      // 4e2: invokestatic com/finalshell/core/L22.b (IJ)I
      // 4e5: iand
      // 4e6: iadd
      // 4e7: istore 4
      // 4e9: iload 2
      // 4ea: ifne 526
      // 4ed: iload 2
      // 4ee: ifeq 4c2
      // 4f1: goto 4f8
      // 4f4: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f7: athrow
      // 4f8: aload 0
      // 4f9: iload 4
      // 4fb: newarray 8
      // 4fd: putfield com/finalshell/core/L22.X [B
      // 500: aload 1
      // 501: iload 3
      // 502: aload 0
      // 503: getfield com/finalshell/core/L22.X [B
      // 506: bipush 0
      // 507: iload 4
      // 509: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 50c: iload 3
      // 50d: iload 4
      // 50f: iadd
      // 510: istore 3
      // 511: iinc 3 1
      // 514: aload 1
      // 515: iload 3
      // 516: iinc 3 1
      // 519: baload
      // 51a: sipush 29102
      // 51d: ldc2_w 1264243196411751667
      // 520: invokestatic com/finalshell/core/L22.b (IJ)I
      // 523: iand
      // 524: istore 4
      // 526: iload 4
      // 528: sipush 17151
      // 52b: ldc2_w 7681352850076999587
      // 52e: invokestatic com/finalshell/core/L22.b (IJ)I
      // 531: iand
      // 532: iload 2
      // 533: ifne 59f
      // 536: ifeq 587
      // 539: goto 540
      // 53c: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53f: athrow
      // 540: iload 4
      // 542: sipush 12479
      // 545: ldc2_w 8440180439907757550
      // 548: invokestatic com/finalshell/core/L22.b (IJ)I
      // 54b: iand
      // 54c: istore 5
      // 54e: bipush 0
      // 54f: istore 4
      // 551: iload 5
      // 553: iinc 5 -1
      // 556: ifle 587
      // 559: iload 4
      // 55b: sipush 8243
      // 55e: ldc2_w 2914778344116157802
      // 561: invokestatic com/finalshell/core/L22.b (IJ)I
      // 564: ishl
      // 565: aload 1
      // 566: iload 3
      // 567: iinc 3 1
      // 56a: baload
      // 56b: sipush 29102
      // 56e: ldc2_w 1264243196411751667
      // 571: invokestatic com/finalshell/core/L22.b (IJ)I
      // 574: iand
      // 575: iadd
      // 576: istore 4
      // 578: iload 2
      // 579: ifne 5a0
      // 57c: iload 2
      // 57d: ifeq 551
      // 580: goto 587
      // 583: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 586: athrow
      // 587: aload 0
      // 588: iload 4
      // 58a: newarray 8
      // 58c: putfield com/finalshell/core/L22.w [B
      // 58f: aload 1
      // 590: iload 3
      // 591: aload 0
      // 592: getfield com/finalshell/core/L22.w [B
      // 595: bipush 0
      // 596: iload 4
      // 598: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 59b: iload 3
      // 59c: iload 4
      // 59e: iadd
      // 59f: istore 3
      // 5a0: aload 0
      // 5a1: iload 2
      // 5a2: ifne 5ba
      // 5a5: getfield com/finalshell/core/L22.p [B
      // 5a8: ifnull 5cb
      // 5ab: goto 5b2
      // 5ae: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b1: athrow
      // 5b2: aload 0
      // 5b3: goto 5ba
      // 5b6: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b9: athrow
      // 5ba: new java/math/BigInteger
      // 5bd: dup
      // 5be: aload 0
      // 5bf: getfield com/finalshell/core/L22.p [B
      // 5c2: invokespecial java/math/BigInteger.<init> ([B)V
      // 5c5: invokevirtual java/math/BigInteger.bitLength ()I
      // 5c8: putfield com/finalshell/core/L22.a I
      // 5cb: goto 60a
      // 5ce: astore 3
      // 5cf: aload 0
      // 5d0: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 5d3: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 5d6: bipush 3
      // 5d7: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 5dc: iload 2
      // 5dd: ifne 609
      // 5e0: ifeq 608
      // 5e3: goto 5ea
      // 5e6: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e9: athrow
      // 5ea: aload 0
      // 5eb: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 5ee: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 5f1: bipush 3
      // 5f2: sipush 24224
      // 5f5: sipush -2743
      // 5f8: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // 5fb: aload 3
      // 5fc: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 601: goto 608
      // 604: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 607: athrow
      // 608: bipush 0
      // 609: ireturn
      // 60a: bipush 1
      // 60b: ireturn
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

         var4 = this.p;
      }

      if (var4 == null) {
         return null;
      } else {
         byte[][] var3 = new byte[][]{j, this.p, this.q, this.I, this.X};
         return UJ.h(var3).g;
      }
   }

   @Override
   public byte[] A() {
      return j;
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public int r$int() {
      return this.a;
   }

   @Override
   public byte[] l(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 2
      // 04: sipush 24233
      // 07: sipush 17438
      // 0a: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // 0d: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 10: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 13: ldc com/finalshell/core/C_H
      // 15: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 18: astore 3
      // 19: aload 3
      // 1a: bipush 0
      // 1b: anewarray 78
      // 1e: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 21: bipush 0
      // 22: anewarray 94
      // 25: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 28: checkcast com/finalshell/core/C_H
      // 2b: astore 4
      // 2d: aload 4
      // 2f: invokeinterface com/finalshell/core/C_H.k ()V 1
      // 34: aload 4
      // 36: aload 0
      // 37: getfield com/finalshell/core/L22.w [B
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/L22.p [B
      // 3e: aload 0
      // 3f: getfield com/finalshell/core/L22.q [B
      // 42: aload 0
      // 43: getfield com/finalshell/core/L22.I [B
      // 46: invokeinterface com/finalshell/core/C_H.A ([B[B[B[B)V 5
      // 4b: aload 4
      // 4d: aload 1
      // 4e: invokeinterface com/finalshell/core/C_H.d ([B)V 2
      // 53: aload 4
      // 55: invokeinterface com/finalshell/core/C_H.k ()[B 1
      // 5a: astore 5
      // 5c: bipush 2
      // 5d: anewarray 229
      // 60: astore 6
      // 62: aload 6
      // 64: bipush 0
      // 65: getstatic com/finalshell/core/L22.j [B
      // 68: aastore
      // 69: aload 6
      // 6b: bipush 1
      // 6c: aload 5
      // 6e: aastore
      // 6f: aload 6
      // 71: invokestatic com/finalshell/core/UJ.h ([[B)Lcom/finalshell/core/UJ;
      // 74: getfield com/finalshell/core/UJ.g [B
      // 77: areturn
      // 78: astore 3
      // 79: aload 0
      // 7a: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 7d: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 80: bipush 3
      // 81: iload 2
      // 82: ifne a3
      // 85: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 8a: ifeq b2
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: aload 0
      // 95: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // 98: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 9b: bipush 3
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: sipush 24226
      // a6: sipush 23634
      // a9: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // ac: aload 3
      // ad: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // b2: aconst_null
      // b3: areturn
   }

   @Override
   public byte[] e(byte[] var1, String var2) {
      return this.l(var1);
   }

   @Override
   public Al2 R() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: sipush 24228
      // 07: sipush 240
      // 0a: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // 0d: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 10: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 13: ldc com/finalshell/core/C_H
      // 15: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 18: astore 2
      // 19: aload 2
      // 1a: bipush 0
      // 1b: anewarray 78
      // 1e: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 21: bipush 0
      // 22: anewarray 94
      // 25: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 28: checkcast com/finalshell/core/C_H
      // 2b: astore 3
      // 2c: aload 3
      // 2d: invokeinterface com/finalshell/core/C_H.k ()V 1
      // 32: iload 1
      // 33: ifeq b8
      // 36: aload 0
      // 37: getfield com/finalshell/core/L22.X [B
      // 3a: ifnonnull a2
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/L22.p [B
      // 48: iload 1
      // 49: ifeq 68
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: ifnonnull a2
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual com/finalshell/core/L22.O ()[B
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: ifnull a2
      // 6b: new com/finalshell/core/UJ
      // 6e: dup
      // 6f: aload 0
      // 70: invokevirtual com/finalshell/core/L22.O ()[B
      // 73: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 76: astore 4
      // 78: aload 4
      // 7a: invokevirtual com/finalshell/core/UJ.S ()[B
      // 7d: pop
      // 7e: aload 0
      // 7f: aload 4
      // 81: invokevirtual com/finalshell/core/UJ.S ()[B
      // 84: putfield com/finalshell/core/L22.p [B
      // 87: aload 0
      // 88: aload 4
      // 8a: invokevirtual com/finalshell/core/UJ.S ()[B
      // 8d: putfield com/finalshell/core/L22.q [B
      // 90: aload 0
      // 91: aload 4
      // 93: invokevirtual com/finalshell/core/UJ.S ()[B
      // 96: putfield com/finalshell/core/L22.I [B
      // 99: aload 0
      // 9a: aload 4
      // 9c: invokevirtual com/finalshell/core/UJ.S ()[B
      // 9f: putfield com/finalshell/core/L22.X [B
      // a2: aload 3
      // a3: aload 0
      // a4: getfield com/finalshell/core/L22.X [B
      // a7: aload 0
      // a8: getfield com/finalshell/core/L22.p [B
      // ab: aload 0
      // ac: getfield com/finalshell/core/L22.q [B
      // af: aload 0
      // b0: getfield com/finalshell/core/L22.I [B
      // b3: invokeinterface com/finalshell/core/C_H.g ([B[B[B[B)V 5
      // b8: aload 3
      // b9: areturn
      // ba: astore 2
      // bb: aload 0
      // bc: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // bf: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // c2: bipush 3
      // c3: iload 1
      // c4: ifeq e5
      // c7: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // cc: ifeq f4
      // cf: goto d6
      // d2: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d5: athrow
      // d6: aload 0
      // d7: getfield com/finalshell/core/L22.Q Lcom/finalshell/core/Xe2;
      // da: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // dd: bipush 3
      // de: goto e5
      // e1: invokestatic com/finalshell/core/L22.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e4: athrow
      // e5: sipush 24231
      // e8: sipush -5472
      // eb: invokestatic com/finalshell/core/L22.b (II)Ljava/lang/String;
      // ee: aload 2
      // ef: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // f4: aconst_null
      // f5: areturn
   }

   @Override
   public Al2 a$al_2(String var1) {
      return this.R();
   }

   public static Ls4 c(Xe2 var0, UJ var1) throws Pc2 {
      byte[][] var2 = var1.U(b(17385, 731405911132184242L), b(24235, 32113));
      byte[] var3 = var2[1];
      byte[] var4 = var2[2];
      byte[] var5 = var2[3];
      byte[] var6 = var2[4];
      byte[] var7 = var2[5];
      L22 var8 = new L22(var0, var3, var4, var5, var6, var7);
      var8.m = E8.B(var2[b(15499, 4337941016196080084L)]);
      var8.P = 0;
      return var8;
   }

   @Override
   public byte[] T$arrbyte() throws Pc2 {
      try {
         if (this.t()) {
            throw new Pc2(b(24239, -7041));
         }
      } catch (Pc2 var3) {
         throw b(var3);
      }

      UJ var1 = new UJ();
      var1.q(j);
      var1.q(this.p);
      var1.q(this.q);
      var1.q(this.I);
      var1.q(this.X);
      var1.q(this.w);
      var1.q(E8.J(this.m));
      byte[] var2 = new byte[var1.P()];
      var1.G(var2, 0, var2.length);
      return var2;
   }

   @Override
   public void a$void() {
      super.a$void();
      E8.Q(this.w);
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 24227) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 154;
               break;
            case 1:
               var10000 = 11;
               break;
            case 2:
               var10000 = 223;
               break;
            case 3:
               var10000 = 17;
               break;
            case 4:
               var10000 = 70;
               break;
            case 5:
               var10000 = 140;
               break;
            case 6:
               var10000 = 191;
               break;
            case 7:
               var10000 = 164;
               break;
            case 8:
               var10000 = 106;
               break;
            case 9:
               var10000 = 39;
               break;
            case 10:
               var10000 = 25;
               break;
            case 11:
               var10000 = 226;
               break;
            case 12:
               var10000 = 173;
               break;
            case 13:
               var10000 = 213;
               break;
            case 14:
               var10000 = 108;
               break;
            case 15:
               var10000 = 217;
               break;
            case 16:
               var10000 = 246;
               break;
            case 17:
               var10000 = 5;
               break;
            case 18:
               var10000 = 188;
               break;
            case 19:
               var10000 = 45;
               break;
            case 20:
               var10000 = 211;
               break;
            case 21:
               var10000 = 105;
               break;
            case 22:
               var10000 = 235;
               break;
            case 23:
               var10000 = 207;
               break;
            case 24:
               var10000 = 1;
               break;
            case 25:
               var10000 = 237;
               break;
            case 26:
               var10000 = 215;
               break;
            case 27:
               var10000 = 117;
               break;
            case 28:
               var10000 = 204;
               break;
            case 29:
               var10000 = 214;
               break;
            case 30:
               var10000 = 185;
               break;
            case 31:
               var10000 = 52;
               break;
            case 32:
               var10000 = 145;
               break;
            case 33:
               var10000 = 155;
               break;
            case 34:
               var10000 = 146;
               break;
            case 35:
               var10000 = 153;
               break;
            case 36:
               var10000 = 130;
               break;
            case 37:
               var10000 = 99;
               break;
            case 38:
               var10000 = 222;
               break;
            case 39:
               var10000 = 8;
               break;
            case 40:
               var10000 = 150;
               break;
            case 41:
               var10000 = 32;
               break;
            case 42:
               var10000 = 162;
               break;
            case 43:
               var10000 = 240;
               break;
            case 44:
               var10000 = 27;
               break;
            case 45:
               var10000 = 79;
               break;
            case 46:
               var10000 = 2;
               break;
            case 47:
               var10000 = 147;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 232;
               break;
            case 50:
               var10000 = 110;
               break;
            case 51:
               var10000 = 197;
               break;
            case 52:
               var10000 = 158;
               break;
            case 53:
               var10000 = 166;
               break;
            case 54:
               var10000 = 241;
               break;
            case 55:
               var10000 = 87;
               break;
            case 56:
               var10000 = 44;
               break;
            case 57:
               var10000 = 200;
               break;
            case 58:
               var10000 = 53;
               break;
            case 59:
               var10000 = 62;
               break;
            case 60:
               var10000 = 172;
               break;
            case 61:
               var10000 = 135;
               break;
            case 62:
               var10000 = 21;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 123;
               break;
            case 65:
               var10000 = 182;
               break;
            case 66:
               var10000 = 86;
               break;
            case 67:
               var10000 = 91;
               break;
            case 68:
               var10000 = 101;
               break;
            case 69:
               var10000 = 12;
               break;
            case 70:
               var10000 = 131;
               break;
            case 71:
               var10000 = 84;
               break;
            case 72:
               var10000 = 9;
               break;
            case 73:
               var10000 = 210;
               break;
            case 74:
               var10000 = 42;
               break;
            case 75:
               var10000 = 230;
               break;
            case 76:
               var10000 = 103;
               break;
            case 77:
               var10000 = 49;
               break;
            case 78:
               var10000 = 224;
               break;
            case 79:
               var10000 = 254;
               break;
            case 80:
               var10000 = 189;
               break;
            case 81:
               var10000 = 51;
               break;
            case 82:
               var10000 = 245;
               break;
            case 83:
               var10000 = 239;
               break;
            case 84:
               var10000 = 178;
               break;
            case 85:
               var10000 = 72;
               break;
            case 86:
               var10000 = 249;
               break;
            case 87:
               var10000 = 35;
               break;
            case 88:
               var10000 = 71;
               break;
            case 89:
               var10000 = 124;
               break;
            case 90:
               var10000 = 31;
               break;
            case 91:
               var10000 = 30;
               break;
            case 92:
               var10000 = 159;
               break;
            case 93:
               var10000 = 220;
               break;
            case 94:
               var10000 = 168;
               break;
            case 95:
               var10000 = 196;
               break;
            case 96:
               var10000 = 34;
               break;
            case 97:
               var10000 = 100;
               break;
            case 98:
               var10000 = 114;
               break;
            case 99:
               var10000 = 167;
               break;
            case 100:
               var10000 = 148;
               break;
            case 101:
               var10000 = 74;
               break;
            case 102:
               var10000 = 205;
               break;
            case 103:
               var10000 = 41;
               break;
            case 104:
               var10000 = 92;
               break;
            case 105:
               var10000 = 20;
               break;
            case 106:
               var10000 = 242;
               break;
            case 107:
               var10000 = 152;
               break;
            case 108:
               var10000 = 248;
               break;
            case 109:
               var10000 = 83;
               break;
            case 110:
               var10000 = 93;
               break;
            case 111:
               var10000 = 65;
               break;
            case 112:
               var10000 = 77;
               break;
            case 113:
               var10000 = 208;
               break;
            case 114:
               var10000 = 58;
               break;
            case 115:
               var10000 = 221;
               break;
            case 116:
               var10000 = 136;
               break;
            case 117:
               var10000 = 24;
               break;
            case 118:
               var10000 = 4;
               break;
            case 119:
               var10000 = 122;
               break;
            case 120:
               var10000 = 64;
               break;
            case 121:
               var10000 = 194;
               break;
            case 122:
               var10000 = 94;
               break;
            case 123:
               var10000 = 33;
               break;
            case 124:
               var10000 = 78;
               break;
            case 125:
               var10000 = 187;
               break;
            case 126:
               var10000 = 113;
               break;
            case 127:
               var10000 = 57;
               break;
            case 128:
               var10000 = 48;
               break;
            case 129:
               var10000 = 192;
               break;
            case 130:
               var10000 = 251;
               break;
            case 131:
               var10000 = 26;
               break;
            case 132:
               var10000 = 90;
               break;
            case 133:
               var10000 = 177;
               break;
            case 134:
               var10000 = 80;
               break;
            case 135:
               var10000 = 54;
               break;
            case 136:
               var10000 = 10;
               break;
            case 137:
               var10000 = 255;
               break;
            case 138:
               var10000 = 66;
               break;
            case 139:
               var10000 = 15;
               break;
            case 140:
               var10000 = 128;
               break;
            case 141:
               var10000 = 252;
               break;
            case 142:
               var10000 = 37;
               break;
            case 143:
               var10000 = 209;
               break;
            case 144:
               var10000 = 69;
               break;
            case 145:
               var10000 = 250;
               break;
            case 146:
               var10000 = 169;
               break;
            case 147:
               var10000 = 18;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 218;
               break;
            case 150:
               var10000 = 234;
               break;
            case 151:
               var10000 = 102;
               break;
            case 152:
               var10000 = 96;
               break;
            case 153:
               var10000 = 60;
               break;
            case 154:
               var10000 = 50;
               break;
            case 155:
               var10000 = 129;
               break;
            case 156:
               var10000 = 233;
               break;
            case 157:
               var10000 = 14;
               break;
            case 158:
               var10000 = 190;
               break;
            case 159:
               var10000 = 104;
               break;
            case 160:
               var10000 = 203;
               break;
            case 161:
               var10000 = 142;
               break;
            case 162:
               var10000 = 253;
               break;
            case 163:
               var10000 = 163;
               break;
            case 164:
               var10000 = 127;
               break;
            case 165:
               var10000 = 28;
               break;
            case 166:
               var10000 = 67;
               break;
            case 167:
               var10000 = 231;
               break;
            case 168:
               var10000 = 73;
               break;
            case 169:
               var10000 = 107;
               break;
            case 170:
               var10000 = 160;
               break;
            case 171:
               var10000 = 184;
               break;
            case 172:
               var10000 = 121;
               break;
            case 173:
               var10000 = 161;
               break;
            case 174:
               var10000 = 151;
               break;
            case 175:
               var10000 = 143;
               break;
            case 176:
               var10000 = 219;
               break;
            case 177:
               var10000 = 149;
               break;
            case 178:
               var10000 = 201;
               break;
            case 179:
               var10000 = 125;
               break;
            case 180:
               var10000 = 118;
               break;
            case 181:
               var10000 = 109;
               break;
            case 182:
               var10000 = 46;
               break;
            case 183:
               var10000 = 95;
               break;
            case 184:
               var10000 = 144;
               break;
            case 185:
               var10000 = 225;
               break;
            case 186:
               var10000 = 6;
               break;
            case 187:
               var10000 = 120;
               break;
            case 188:
               var10000 = 132;
               break;
            case 189:
               var10000 = 134;
               break;
            case 190:
               var10000 = 75;
               break;
            case 191:
               var10000 = 228;
               break;
            case 192:
               var10000 = 89;
               break;
            case 193:
               var10000 = 183;
               break;
            case 194:
               var10000 = 115;
               break;
            case 195:
               var10000 = 243;
               break;
            case 196:
               var10000 = 175;
               break;
            case 197:
               var10000 = 126;
               break;
            case 198:
               var10000 = 238;
               break;
            case 199:
               var10000 = 85;
               break;
            case 200:
               var10000 = 56;
               break;
            case 201:
               var10000 = 61;
               break;
            case 202:
               var10000 = 244;
               break;
            case 203:
               var10000 = 119;
               break;
            case 204:
               var10000 = 38;
               break;
            case 205:
               var10000 = 40;
               break;
            case 206:
               var10000 = 97;
               break;
            case 207:
               var10000 = 116;
               break;
            case 208:
               var10000 = 157;
               break;
            case 209:
               var10000 = 59;
               break;
            case 210:
               var10000 = 202;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 98;
               break;
            case 213:
               var10000 = 181;
               break;
            case 214:
               var10000 = 112;
               break;
            case 215:
               var10000 = 174;
               break;
            case 216:
               var10000 = 229;
               break;
            case 217:
               var10000 = 138;
               break;
            case 218:
               var10000 = 206;
               break;
            case 219:
               var10000 = 0;
               break;
            case 220:
               var10000 = 212;
               break;
            case 221:
               var10000 = 171;
               break;
            case 222:
               var10000 = 29;
               break;
            case 223:
               var10000 = 16;
               break;
            case 224:
               var10000 = 139;
               break;
            case 225:
               var10000 = 156;
               break;
            case 226:
               var10000 = 199;
               break;
            case 227:
               var10000 = 63;
               break;
            case 228:
               var10000 = 247;
               break;
            case 229:
               var10000 = 81;
               break;
            case 230:
               var10000 = 3;
               break;
            case 231:
               var10000 = 216;
               break;
            case 232:
               var10000 = 55;
               break;
            case 233:
               var10000 = 111;
               break;
            case 234:
               var10000 = 7;
               break;
            case 235:
               var10000 = 195;
               break;
            case 236:
               var10000 = 22;
               break;
            case 237:
               var10000 = 133;
               break;
            case 238:
               var10000 = 193;
               break;
            case 239:
               var10000 = 170;
               break;
            case 240:
               var10000 = 88;
               break;
            case 241:
               var10000 = 76;
               break;
            case 242:
               var10000 = 23;
               break;
            case 243:
               var10000 = 198;
               break;
            case 244:
               var10000 = 179;
               break;
            case 245:
               var10000 = 180;
               break;
            case 246:
               var10000 = 176;
               break;
            case 247:
               var10000 = 36;
               break;
            case 248:
               var10000 = 19;
               break;
            case 249:
               var10000 = 141;
               break;
            case 250:
               var10000 = 82;
               break;
            case 251:
               var10000 = 137;
               break;
            case 252:
               var10000 = 43;
               break;
            case 253:
               var10000 = 236;
               break;
            case 254:
               var10000 = 47;
               break;
            default:
               var10000 = 227;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23898;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "c>\"\u0018Ð¬ü$0\u0081þ\u0083\u001c\u0082Û·\u0083áuSÆM&\u0095³×\\ßO\u0097\u0018\u001e9\b©GûæqÔ\u0016\u0007×+«\u008cBêU\u0013ß0\u001cþ\u0094Úý3\u0098\u00988`\u008b´ÜÇ\u001d`ê\u0019ûò\u0098¦\u0004ÑïRÚ´cö\u0086\u0005\u0099äÍúÎ\u0015ÿ\f¾j8\u000eÅäãü}\b\u0016Ö÷\u001bÀ\u0092\u0000]\u001f\u0080\u001e\u0091¿¡½\u007f\u000e'\u0004}uX¥æá\u008eö©\u007f{7ýd\u0007Á áEõ)\rn0\u0093õ®ékA¿\u001e\u0083mk\u0012äÃ\u008ac³Èu\u0089AT\u008eUag\u0000oy\u0080\u00131ØÁã/y\u008aGv\u0016å±0\u008e«\u0080ó\u00887\rD Ö÷\u0006©~I\u001d\u001f×Má";
      int var12 = "c>\"\u0018Ð¬ü$0\u0081þ\u0083\u001c\u0082Û·\u0083áuSÆM&\u0095³×\\ßO\u0097\u0018\u001e9\b©GûæqÔ\u0016\u0007×+«\u008cBêU\u0013ß0\u001cþ\u0094Úý3\u0098\u00988`\u008b´ÜÇ\u001d`ê\u0019ûò\u0098¦\u0004ÑïRÚ´cö\u0086\u0005\u0099äÍúÎ\u0015ÿ\f¾j8\u000eÅäãü}\b\u0016Ö÷\u001bÀ\u0092\u0000]\u001f\u0080\u001e\u0091¿¡½\u007f\u000e'\u0004}uX¥æá\u008eö©\u007f{7ýd\u0007Á áEõ)\rn0\u0093õ®ékA¿\u001e\u0083mk\u0012äÃ\u008ac³Èu\u0089AT\u008eUag\u0000oy\u0080\u00131ØÁã/y\u008aGv\u0016å±0\u008e«\u0080ó\u00887\rD Ö÷\u0006©~I\u001d\u001f×Má"
         .length();
      char var9 = '\f';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 65;
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
                        var65 = 112;
                        break;
                     case 1:
                        var65 = 36;
                        break;
                     case 2:
                        var65 = 67;
                        break;
                     case 3:
                        var65 = 52;
                        break;
                     case 4:
                        var65 = 55;
                        break;
                     case 5:
                        var65 = 111;
                        break;
                     default:
                        var65 = 9;
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
                     c = new String[13];
                     long var0 = 8032388735398080646L;
                     long[] var6 = new long[13];
                     int var3 = 0;
                     String var4 = "\u0080¼ójn\u0089\u0011Ö¤ñÔÿXçî3Ðz^ï3O\u00ad>©Rè{¯K\rä»å\n0ëU\t\u0085\u0006Õ¨\u001f¹¶\u0091TM\"æ\u0006`\u0006o¥\u000eÙ4áp\u0093Ü\u008aÐ>¢×\u0002é(Ox×N.\u008dß\u0007J\u0089¸{Ú\u00022\u0095Ú";
                     int var5 = "\u0080¼ójn\u0089\u0011Ö¤ñÔÿXçî3Ðz^ï3O\u00ad>©Rè{¯K\rä»å\n0ëU\t\u0085\u0006Õ¨\u001f¹¶\u0091TM\"æ\u0006`\u0006o¥\u000eÙ4áp\u0093Ü\u008aÐ>¢×\u0002é(Ox×N.\u008dß\u0007J\u0089¸{Ú\u00022\u0095Ú"
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
                                    d = var6;
                                    f = new Integer[13];
                                    J = E8.J(b(24229, -5327));
                                    e = E8.J(b(24232, -8248));
                                    j = E8.J(b(24225, 16536));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "u\rî07¦\u009d\u0017ÂçòýÎ³\u00994";
                                 var5 = "u\rî07¦\u009d\u0017ÂçòýÎ³\u00994".length();
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

                  var10 = "#np$\b\\ÔCÄQ£\u0004xª\u0018¿ü\u009aôjs\u008aö\u009bR\u008fúG\u009b\u0011-Ðk¿ñµI¯\u009aîÎ\b\u00800ja\u001b";
                  var12 = "#np$\b\\ÔCÄQ£\u0004xª\u0018¿ü\u009aôjs\u008aö\u009bR\u008fúG\u009b\u0011-Ðk¿ñµI¯\u009aîÎ\b\u00800ja\u001b".length();
                  var9 = 29;
                  var17 = -1;
            }

            var10000 = 31;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





