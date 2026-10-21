package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public abstract class Cv2 {
   public static String[] t;
   public static String F;
   public static String A;
   public static String R;
   public static String g;
   public static String r;
   public static String P;
   public static String V;
   public static String n;
   public ConnectHost a = null;
   public Y_2 L = null;
   public byte[] E = null;
   public byte[] b = null;
   public byte[] k = null;
   public final int c = 0;
   public final int h = 1;
   public final int I = a(10222, 649090909354918842L);
   public final int v = a(7230, 3126479450272807015L);
   public int q = 0;
   public String G = "";
   public static String[] J;
   public static String[] ab;
   public static long[] bb;
   public static Integer[] cb;

   public abstract void x(ConnectHost var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5) throws Exception;

   public void m(ConnectHost var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5) throws Exception {
      this.a = var1;
      this.x(var1, var2, var3, var4, var5);
   }

   public abstract boolean f(UJ var1) throws Exception;

   public abstract int j$int();

   public String d() {
      boolean var1 = Dm4.F$boolean();
      int var10000 = this.q;
      if (var1) {
         if (this.q == 1) {
            return a(-1036, -3857);
         }

         var10000 = this.q;
      }

      if (var1) {
         if (var10000 == 0) {
            return a(-1069, -4169);
         }

         var10000 = this.q;
      }

      return var10000 == 3 ? a(-1086, 16254) : a(-1053, 30660);
   }

   public String G() {
      return this.G;
   }

   public static String[] V(ConnectHost param0, byte[] param1, byte[] param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: sipush 27637
      // 006: ldc2_w 1690977146099257255
      // 009: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 00c: anewarray 105
      // 00f: astore 4
      // 011: istore 3
      // 012: new com/finalshell/core/UJ
      // 015: dup
      // 016: aload 1
      // 017: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 01a: astore 5
      // 01c: aload 5
      // 01e: sipush 31816
      // 021: ldc2_w 3784408228107999243
      // 024: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 027: invokevirtual com/finalshell/core/UJ.Z (I)V
      // 02a: new com/finalshell/core/UJ
      // 02d: dup
      // 02e: aload 2
      // 02f: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 032: astore 6
      // 034: aload 6
      // 036: sipush 6373
      // 039: ldc2_w 265382198689316016
      // 03c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 03f: invokevirtual com/finalshell/core/UJ.Z (I)V
      // 042: aload 0
      // 043: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 046: bipush 1
      // 047: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 04c: iload 3
      // 04d: ifne 144
      // 050: ifeq 143
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 0
      // 05b: istore 7
      // 05d: iload 7
      // 05f: sipush 27637
      // 062: ldc2_w 1690977146099257255
      // 065: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 068: if_icmpge 0bd
      // 06b: aload 0
      // 06c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 06f: bipush 1
      // 070: new java/lang/StringBuilder
      // 073: dup
      // 074: invokespecial java/lang/StringBuilder.<init> ()V
      // 077: sipush -1040
      // 07a: sipush 24696
      // 07d: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: getstatic com/finalshell/core/Cv2.t [Ljava/lang/String;
      // 086: iload 7
      // 088: aaload
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: sipush -1039
      // 08f: sipush 3045
      // 092: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: aload 5
      // 09a: invokevirtual com/finalshell/core/UJ.S ()[B
      // 09d: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a6: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0ab: iinc 7 1
      // 0ae: iload 3
      // 0af: ifne 0c0
      // 0b2: iload 3
      // 0b3: ifeq 05d
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: bipush 0
      // 0be: istore 7
      // 0c0: iload 7
      // 0c2: sipush 27637
      // 0c5: ldc2_w 1690977146099257255
      // 0c8: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0cb: if_icmpge 127
      // 0ce: aload 0
      // 0cf: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0d2: bipush 1
      // 0d3: new java/lang/StringBuilder
      // 0d6: dup
      // 0d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0da: sipush -1035
      // 0dd: sipush 25402
      // 0e0: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: getstatic com/finalshell/core/Cv2.t [Ljava/lang/String;
      // 0e9: iload 7
      // 0eb: aaload
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: sipush -1032
      // 0f2: sipush 11365
      // 0f5: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: aload 6
      // 0fd: invokevirtual com/finalshell/core/UJ.S ()[B
      // 100: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 106: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 109: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 10e: iinc 7 1
      // 111: iload 3
      // 112: ifne 135
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: iload 3
      // 11d: ifeq 0c0
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 5
      // 129: sipush 6373
      // 12c: ldc2_w 265382198689316016
      // 12f: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 132: invokevirtual com/finalshell/core/UJ.Z (I)V
      // 135: aload 6
      // 137: sipush 6373
      // 13a: ldc2_w 265382198689316016
      // 13d: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 140: invokevirtual com/finalshell/core/UJ.Z (I)V
      // 143: bipush 0
      // 144: istore 7
      // 146: iload 7
      // 148: sipush 27637
      // 14b: ldc2_w 1690977146099257255
      // 14e: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 151: if_icmpge 2fc
      // 154: aload 5
      // 156: invokevirtual com/finalshell/core/UJ.S ()[B
      // 159: astore 8
      // 15b: aload 6
      // 15d: invokevirtual com/finalshell/core/UJ.S ()[B
      // 160: astore 9
      // 162: bipush 0
      // 163: istore 10
      // 165: bipush 0
      // 166: iload 3
      // 167: ifne 300
      // 16a: istore 11
      // 16c: iload 10
      // 16e: aload 9
      // 170: arraylength
      // 171: if_icmpge 2b7
      // 174: iload 10
      // 176: aload 9
      // 178: arraylength
      // 179: iload 3
      // 17a: ifne 151
      // 17d: if_icmpge 1bc
      // 180: aload 9
      // 182: iload 10
      // 184: baload
      // 185: sipush 27576
      // 188: ldc2_w 1217758651486064608
      // 18b: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 18e: iload 3
      // 18f: ifne 1c0
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: iload 3
      // 19a: ifne 1c0
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: if_icmpeq 1bc
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: iinc 10 1
      // 1b1: iload 3
      // 1b2: ifeq 174
      // 1b5: goto 1bc
      // 1b8: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: iload 11
      // 1be: iload 10
      // 1c0: if_icmpne 1db
      // 1c3: new com/finalshell/core/P0
      // 1c6: dup
      // 1c7: iload 7
      // 1c9: aload 9
      // 1cb: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1ce: aload 8
      // 1d0: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1d3: invokespecial com/finalshell/core/P0.<init> (ILjava/lang/String;Ljava/lang/String;)V
      // 1d6: athrow
      // 1d7: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: aload 9
      // 1dd: iload 11
      // 1df: iload 10
      // 1e1: iload 11
      // 1e3: isub
      // 1e4: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 1e7: astore 12
      // 1e9: bipush 0
      // 1ea: istore 13
      // 1ec: bipush 0
      // 1ed: istore 14
      // 1ef: iload 13
      // 1f1: aload 8
      // 1f3: arraylength
      // 1f4: if_icmpge 2ac
      // 1f7: iload 13
      // 1f9: aload 8
      // 1fb: arraylength
      // 1fc: iload 3
      // 1fd: ifne 171
      // 200: if_icmpge 23f
      // 203: aload 8
      // 205: iload 13
      // 207: baload
      // 208: sipush 23613
      // 20b: ldc2_w 3536048575925647470
      // 20e: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 211: iload 3
      // 212: ifne 24e
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: iload 3
      // 21d: ifne 24e
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 226: athrow
      // 227: if_icmpeq 23f
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: iinc 13 1
      // 234: iload 3
      // 235: ifeq 1f7
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: iload 14
      // 241: iload 3
      // 242: ifne 27a
      // 245: iload 13
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: if_icmpne 269
      // 251: new com/finalshell/core/P0
      // 254: dup
      // 255: iload 7
      // 257: aload 9
      // 259: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 25c: aload 8
      // 25e: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 261: invokespecial com/finalshell/core/P0.<init> (ILjava/lang/String;Ljava/lang/String;)V
      // 264: athrow
      // 265: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: aload 12
      // 26b: aload 8
      // 26d: iload 14
      // 26f: iload 13
      // 271: iload 14
      // 273: isub
      // 274: invokestatic com/finalshell/core/E8.O ([BII)Ljava/lang/String;
      // 277: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27a: iload 3
      // 27b: ifne 2a6
      // 27e: ifeq 29a
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: aload 4
      // 28a: iload 7
      // 28c: aload 12
      // 28e: aastore
      // 28f: iload 3
      // 290: ifeq 2b7
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: iinc 13 1
      // 29d: iload 13
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: istore 14
      // 2a8: iload 3
      // 2a9: ifeq 1ef
      // 2ac: iinc 10 1
      // 2af: iload 10
      // 2b1: istore 11
      // 2b3: iload 3
      // 2b4: ifeq 16c
      // 2b7: iload 10
      // 2b9: ifne 2ce
      // 2bc: aload 4
      // 2be: iload 7
      // 2c0: ldc ""
      // 2c2: aastore
      // 2c3: iload 3
      // 2c4: ifeq 2f5
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cd: athrow
      // 2ce: aload 4
      // 2d0: iload 7
      // 2d2: aaload
      // 2d3: ifnonnull 2f5
      // 2d6: goto 2dd
      // 2d9: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dc: athrow
      // 2dd: new com/finalshell/core/P0
      // 2e0: dup
      // 2e1: iload 7
      // 2e3: aload 9
      // 2e5: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 2e8: aload 8
      // 2ea: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 2ed: invokespecial com/finalshell/core/P0.<init> (ILjava/lang/String;Ljava/lang/String;)V
      // 2f0: athrow
      // 2f1: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: iinc 7 1
      // 2f8: iload 3
      // 2f9: ifeq 146
      // 2fc: bipush 0
      // 2fd: istore 7
      // 2ff: bipush 0
      // 300: istore 8
      // 302: aload 0
      // 303: aload 4
      // 305: bipush 3
      // 306: aaload
      // 307: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 30a: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 30d: ldc com/finalshell/core/EU
      // 30f: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 312: astore 9
      // 314: aload 9
      // 316: bipush 0
      // 317: anewarray 181
      // 31a: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 31d: bipush 0
      // 31e: anewarray 4
      // 321: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 324: checkcast com/finalshell/core/EU
      // 327: astore 10
      // 329: aload 10
      // 32b: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 330: istore 7
      // 332: iload 7
      // 334: ifeq 343
      // 337: aload 4
      // 339: bipush 5
      // 33a: aconst_null
      // 33b: aastore
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 342: athrow
      // 343: aload 0
      // 344: aload 4
      // 346: bipush 2
      // 347: aaload
      // 348: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 34b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 34e: ldc com/finalshell/core/EU
      // 350: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 353: astore 11
      // 355: aload 11
      // 357: bipush 0
      // 358: anewarray 181
      // 35b: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 35e: bipush 0
      // 35f: anewarray 4
      // 362: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 365: checkcast com/finalshell/core/EU
      // 368: astore 12
      // 36a: aload 12
      // 36c: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 371: istore 8
      // 373: iload 8
      // 375: ifeq 384
      // 378: aload 4
      // 37a: bipush 4
      // 37b: aconst_null
      // 37c: aastore
      // 37d: goto 384
      // 380: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 383: athrow
      // 384: goto 398
      // 387: astore 9
      // 389: new com/finalshell/core/Pc2
      // 38c: dup
      // 38d: aload 9
      // 38f: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 392: aload 9
      // 394: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 397: athrow
      // 398: aload 0
      // 399: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 39c: bipush 1
      // 39d: iload 3
      // 39e: ifne 40a
      // 3a1: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 3a6: ifeq 4ef
      // 3a9: goto 3b0
      // 3ac: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3af: athrow
      // 3b0: aload 0
      // 3b1: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3b4: bipush 1
      // 3b5: new java/lang/StringBuilder
      // 3b8: dup
      // 3b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3bc: sipush -1056
      // 3bf: sipush 4241
      // 3c2: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 3c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c8: aload 4
      // 3ca: bipush 0
      // 3cb: aaload
      // 3cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d2: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 3d7: aload 0
      // 3d8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3db: bipush 1
      // 3dc: new java/lang/StringBuilder
      // 3df: dup
      // 3e0: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e3: sipush -1042
      // 3e6: sipush 1306
      // 3e9: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 3ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ef: aload 4
      // 3f1: bipush 1
      // 3f2: aaload
      // 3f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f9: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 3fe: aload 0
      // 3ff: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 402: bipush 1
      // 403: goto 40a
      // 406: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 409: athrow
      // 40a: new java/lang/StringBuilder
      // 40d: dup
      // 40e: invokespecial java/lang/StringBuilder.<init> ()V
      // 411: sipush -1049
      // 414: sipush -1521
      // 417: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 41a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41d: aload 4
      // 41f: bipush 3
      // 420: iload 3
      // 421: ifne 453
      // 424: aaload
      // 425: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 428: sipush -1046
      // 42b: sipush -11767
      // 42e: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 431: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 434: iload 7
      // 436: ifeq 450
      // 439: goto 440
      // 43c: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43f: athrow
      // 440: sipush -1088
      // 443: sipush 14427
      // 446: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 449: goto 454
      // 44c: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: aload 4
      // 452: bipush 5
      // 453: aaload
      // 454: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 457: sipush -1077
      // 45a: sipush 31495
      // 45d: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 460: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 463: aload 4
      // 465: sipush 21745
      // 468: ldc2_w 4635344245563748538
      // 46b: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 46e: aaload
      // 46f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 472: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 475: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 47a: aload 0
      // 47b: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 47e: bipush 1
      // 47f: new java/lang/StringBuilder
      // 482: dup
      // 483: invokespecial java/lang/StringBuilder.<init> ()V
      // 486: sipush -1037
      // 489: sipush -29077
      // 48c: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 48f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 492: aload 4
      // 494: bipush 2
      // 495: iload 3
      // 496: ifne 4c8
      // 499: aaload
      // 49a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49d: sipush -1073
      // 4a0: sipush -1553
      // 4a3: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 4a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a9: iload 8
      // 4ab: ifeq 4c5
      // 4ae: goto 4b5
      // 4b1: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b4: athrow
      // 4b5: sipush -1052
      // 4b8: sipush -20065
      // 4bb: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 4be: goto 4c9
      // 4c1: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c4: athrow
      // 4c5: aload 4
      // 4c7: bipush 4
      // 4c8: aaload
      // 4c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4cc: sipush -1054
      // 4cf: sipush 13023
      // 4d2: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 4d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d8: aload 4
      // 4da: sipush 16912
      // 4dd: ldc2_w 4386975815767254606
      // 4e0: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 4e3: aaload
      // 4e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4ea: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 4ef: aload 4
      // 4f1: areturn
   }

   public String j$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: aload 0
      // 07: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 0a: sipush -1026
      // 0d: sipush -10109
      // 10: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 13: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 16: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 19: astore 3
      // 1a: aload 0
      // 1b: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 1e: aload 3
      // 1f: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 22: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 25: ldc com/finalshell/core/Y_2
      // 27: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: bipush 0
      // 2f: anewarray 181
      // 32: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 35: bipush 0
      // 36: anewarray 4
      // 39: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: checkcast com/finalshell/core/Y_2
      // 3f: astore 2
      // 40: goto 91
      // 43: astore 3
      // 44: aload 0
      // 45: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 48: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4b: bipush 3
      // 4c: iload 1
      // 4d: ifeq 6e
      // 50: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 55: ifeq 91
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 63: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 66: bipush 3
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: new java/lang/StringBuilder
      // 71: dup
      // 72: invokespecial java/lang/StringBuilder.<init> ()V
      // 75: sipush -1044
      // 78: sipush 7086
      // 7b: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: aload 3
      // 82: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8b: aload 3
      // 8c: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 91: aload 2
      // 92: aload 0
      // 93: invokevirtual com/finalshell/core/Cv2.m ()[B
      // 96: bipush 1
      // 97: bipush 0
      // 98: invokestatic com/finalshell/core/E8.s (Lcom/finalshell/core/Y_2;[BZZ)Ljava/lang/String;
      // 9b: areturn
   }

   public byte[] k() {
      return this.E;
   }

   public byte[] V() {
      return this.b;
   }

   public Y_2 i() {
      return this.L;
   }

   public byte[] m() {
      return this.k;
   }

   public byte[] D(byte[] var1) {
      boolean var2 = Dm4.F$boolean();
      byte[] var10000 = var1;
      if (var2) {
         if (var1.length > 1) {
            if (!var2) {
               return var1;
            }

            if (var1[0] == 0) {
               if (!var2) {
                  return var1;
               }

               if ((var1[1] & a(6505, 7093137715927989536L)) == 0) {
                  byte[] var3 = new byte[var1.length - 1];
                  System.arraycopy(var1, 1, var3, 0, var3.length);
                  return this.D(var3);
               }
            }
         }

         var10000 = var1;
      }

      return var10000;
   }

   public boolean x(String param1, byte[] param2, int param3, byte[] param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: iload 3
      // 004: istore 6
      // 006: istore 5
      // 008: bipush 0
      // 009: istore 8
      // 00b: aload 1
      // 00c: sipush -1050
      // 00f: sipush -8166
      // 012: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 015: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 018: iload 5
      // 01a: ifne 229
      // 01d: ifeq 215
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: bipush 0
      // 029: putfield com/finalshell/core/Cv2.q I
      // 02c: aload 0
      // 02d: aload 1
      // 02e: putfield com/finalshell/core/Cv2.G Ljava/lang/String;
      // 031: aload 2
      // 032: iload 6
      // 034: iinc 6 1
      // 037: baload
      // 038: sipush 6732
      // 03b: ldc2_w 3388886031995125256
      // 03e: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 041: ishl
      // 042: sipush 20415
      // 045: ldc2_w 520410424919649271
      // 048: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 04b: iand
      // 04c: aload 2
      // 04d: iload 6
      // 04f: iinc 6 1
      // 052: baload
      // 053: sipush 21115
      // 056: ldc2_w 884573170277086778
      // 059: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 05c: ishl
      // 05d: sipush 745
      // 060: ldc2_w 8815796294824208043
      // 063: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 066: iand
      // 067: ior
      // 068: aload 2
      // 069: iload 6
      // 06b: iinc 6 1
      // 06e: baload
      // 06f: sipush 6463
      // 072: ldc2_w 7373264339257539938
      // 075: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 078: ishl
      // 079: sipush 19022
      // 07c: ldc2_w 7223530431800929813
      // 07f: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 082: iand
      // 083: ior
      // 084: aload 2
      // 085: iload 6
      // 087: iinc 6 1
      // 08a: baload
      // 08b: sipush 26595
      // 08e: ldc2_w 3942268694561997740
      // 091: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 094: iand
      // 095: ior
      // 096: istore 7
      // 098: iload 7
      // 09a: newarray 8
      // 09c: astore 9
      // 09e: aload 2
      // 09f: iload 6
      // 0a1: aload 9
      // 0a3: bipush 0
      // 0a4: iload 7
      // 0a6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a9: iload 6
      // 0ab: iload 7
      // 0ad: iadd
      // 0ae: istore 6
      // 0b0: aload 9
      // 0b2: astore 10
      // 0b4: aload 2
      // 0b5: iload 6
      // 0b7: iinc 6 1
      // 0ba: baload
      // 0bb: sipush 504
      // 0be: ldc2_w 5654009769112053174
      // 0c1: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0c4: ishl
      // 0c5: sipush 22151
      // 0c8: ldc2_w 7313380122959966929
      // 0cb: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0ce: iand
      // 0cf: aload 2
      // 0d0: iload 6
      // 0d2: iinc 6 1
      // 0d5: baload
      // 0d6: sipush 26961
      // 0d9: ldc2_w 4492612352047467793
      // 0dc: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0df: ishl
      // 0e0: sipush 551
      // 0e3: ldc2_w 4684339154068350573
      // 0e6: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0e9: iand
      // 0ea: ior
      // 0eb: aload 2
      // 0ec: iload 6
      // 0ee: iinc 6 1
      // 0f1: baload
      // 0f2: sipush 6463
      // 0f5: ldc2_w 7373264339257539938
      // 0f8: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 0fb: ishl
      // 0fc: sipush 6549
      // 0ff: ldc2_w 2463809123935469001
      // 102: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 105: iand
      // 106: ior
      // 107: aload 2
      // 108: iload 6
      // 10a: iinc 6 1
      // 10d: baload
      // 10e: sipush 27363
      // 111: ldc2_w 7002881761336348324
      // 114: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 117: iand
      // 118: ior
      // 119: istore 7
      // 11b: iload 7
      // 11d: newarray 8
      // 11f: astore 9
      // 121: aload 2
      // 122: iload 6
      // 124: aload 9
      // 126: bipush 0
      // 127: iload 7
      // 129: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12c: iload 6
      // 12e: iload 7
      // 130: iadd
      // 131: istore 6
      // 133: aload 9
      // 135: astore 11
      // 137: aconst_null
      // 138: astore 12
      // 13a: new com/finalshell/core/UJ
      // 13d: dup
      // 13e: aload 4
      // 140: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 143: astore 13
      // 145: aload 13
      // 147: invokevirtual com/finalshell/core/UJ.S ()[B
      // 14a: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 14d: astore 14
      // 14f: aload 0
      // 150: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 153: aload 14
      // 155: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 158: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 15b: ldc_w com/finalshell/core/Ip4
      // 15e: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 161: astore 15
      // 163: aload 15
      // 165: bipush 0
      // 166: anewarray 181
      // 169: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 16c: bipush 0
      // 16d: anewarray 4
      // 170: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 173: checkcast com/finalshell/core/Ip4
      // 176: astore 12
      // 178: aload 12
      // 17a: invokeinterface com/finalshell/core/Ip4.k ()V 1
      // 17f: goto 193
      // 182: astore 15
      // 184: new com/finalshell/core/Pc2
      // 187: dup
      // 188: aload 15
      // 18a: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 18d: aload 15
      // 18f: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 192: athrow
      // 193: aload 12
      // 195: aload 10
      // 197: aload 11
      // 199: invokeinterface com/finalshell/core/Ip4.Q ([B[B)V 3
      // 19e: aload 12
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/Cv2.b [B
      // 1a4: invokeinterface com/finalshell/core/Ip4.d ([B)V 2
      // 1a9: aload 12
      // 1ab: aload 4
      // 1ad: invokeinterface com/finalshell/core/Ip4.g ([B)Z 2
      // 1b2: istore 8
      // 1b4: aload 0
      // 1b5: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 1b8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1bb: bipush 1
      // 1bc: iload 5
      // 1be: ifne 1df
      // 1c1: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1c6: ifeq 210
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 1d4: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1d7: bipush 1
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: new java/lang/StringBuilder
      // 1e2: dup
      // 1e3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e6: sipush -1074
      // 1e9: sipush 22513
      // 1ec: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 1ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f2: aload 14
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: sipush -1030
      // 1fa: sipush 23115
      // 1fd: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: iload 8
      // 205: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 208: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20b: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 210: iload 5
      // 212: ifeq 984
      // 215: aload 1
      // 216: sipush -1048
      // 219: sipush 26156
      // 21c: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 21f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 222: goto 229
      // 225: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 228: athrow
      // 229: iload 5
      // 22b: ifne 528
      // 22e: ifeq 514
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: aconst_null
      // 239: astore 9
      // 23b: aload 0
      // 23c: bipush 1
      // 23d: putfield com/finalshell/core/Cv2.q I
      // 240: aload 0
      // 241: aload 1
      // 242: putfield com/finalshell/core/Cv2.G Ljava/lang/String;
      // 245: aload 2
      // 246: iload 6
      // 248: iinc 6 1
      // 24b: baload
      // 24c: sipush 504
      // 24f: ldc2_w 5654009769112053174
      // 252: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 255: ishl
      // 256: sipush 22151
      // 259: ldc2_w 7313380122959966929
      // 25c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 25f: iand
      // 260: aload 2
      // 261: iload 6
      // 263: iinc 6 1
      // 266: baload
      // 267: sipush 26961
      // 26a: ldc2_w 4492612352047467793
      // 26d: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 270: ishl
      // 271: sipush 551
      // 274: ldc2_w 4684339154068350573
      // 277: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 27a: iand
      // 27b: ior
      // 27c: aload 2
      // 27d: iload 6
      // 27f: iinc 6 1
      // 282: baload
      // 283: sipush 6463
      // 286: ldc2_w 7373264339257539938
      // 289: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 28c: ishl
      // 28d: sipush 6549
      // 290: ldc2_w 2463809123935469001
      // 293: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 296: iand
      // 297: ior
      // 298: aload 2
      // 299: iload 6
      // 29b: iinc 6 1
      // 29e: baload
      // 29f: sipush 27363
      // 2a2: ldc2_w 7002881761336348324
      // 2a5: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 2a8: iand
      // 2a9: ior
      // 2aa: istore 7
      // 2ac: iload 7
      // 2ae: newarray 8
      // 2b0: astore 10
      // 2b2: aload 2
      // 2b3: iload 6
      // 2b5: aload 10
      // 2b7: bipush 0
      // 2b8: iload 7
      // 2ba: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2bd: iload 6
      // 2bf: iload 7
      // 2c1: iadd
      // 2c2: istore 6
      // 2c4: aload 10
      // 2c6: astore 11
      // 2c8: aload 2
      // 2c9: iload 6
      // 2cb: iinc 6 1
      // 2ce: baload
      // 2cf: sipush 504
      // 2d2: ldc2_w 5654009769112053174
      // 2d5: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 2d8: ishl
      // 2d9: sipush 22151
      // 2dc: ldc2_w 7313380122959966929
      // 2df: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 2e2: iand
      // 2e3: aload 2
      // 2e4: iload 6
      // 2e6: iinc 6 1
      // 2e9: baload
      // 2ea: sipush 26961
      // 2ed: ldc2_w 4492612352047467793
      // 2f0: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 2f3: ishl
      // 2f4: sipush 551
      // 2f7: ldc2_w 4684339154068350573
      // 2fa: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 2fd: iand
      // 2fe: ior
      // 2ff: aload 2
      // 300: iload 6
      // 302: iinc 6 1
      // 305: baload
      // 306: sipush 6463
      // 309: ldc2_w 7373264339257539938
      // 30c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 30f: ishl
      // 310: sipush 6549
      // 313: ldc2_w 2463809123935469001
      // 316: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 319: iand
      // 31a: ior
      // 31b: aload 2
      // 31c: iload 6
      // 31e: iinc 6 1
      // 321: baload
      // 322: sipush 27363
      // 325: ldc2_w 7002881761336348324
      // 328: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 32b: iand
      // 32c: ior
      // 32d: istore 7
      // 32f: iload 7
      // 331: newarray 8
      // 333: astore 10
      // 335: aload 2
      // 336: iload 6
      // 338: aload 10
      // 33a: bipush 0
      // 33b: iload 7
      // 33d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 340: iload 6
      // 342: iload 7
      // 344: iadd
      // 345: istore 6
      // 347: aload 10
      // 349: astore 9
      // 34b: aload 2
      // 34c: iload 6
      // 34e: iinc 6 1
      // 351: baload
      // 352: sipush 504
      // 355: ldc2_w 5654009769112053174
      // 358: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 35b: ishl
      // 35c: sipush 22151
      // 35f: ldc2_w 7313380122959966929
      // 362: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 365: iand
      // 366: aload 2
      // 367: iload 6
      // 369: iinc 6 1
      // 36c: baload
      // 36d: sipush 26961
      // 370: ldc2_w 4492612352047467793
      // 373: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 376: ishl
      // 377: sipush 551
      // 37a: ldc2_w 4684339154068350573
      // 37d: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 380: iand
      // 381: ior
      // 382: aload 2
      // 383: iload 6
      // 385: iinc 6 1
      // 388: baload
      // 389: sipush 6463
      // 38c: ldc2_w 7373264339257539938
      // 38f: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 392: ishl
      // 393: sipush 6549
      // 396: ldc2_w 2463809123935469001
      // 399: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 39c: iand
      // 39d: ior
      // 39e: aload 2
      // 39f: iload 6
      // 3a1: iinc 6 1
      // 3a4: baload
      // 3a5: sipush 27363
      // 3a8: ldc2_w 7002881761336348324
      // 3ab: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 3ae: iand
      // 3af: ior
      // 3b0: istore 7
      // 3b2: iload 7
      // 3b4: newarray 8
      // 3b6: astore 10
      // 3b8: aload 2
      // 3b9: iload 6
      // 3bb: aload 10
      // 3bd: bipush 0
      // 3be: iload 7
      // 3c0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3c3: iload 6
      // 3c5: iload 7
      // 3c7: iadd
      // 3c8: istore 6
      // 3ca: aload 10
      // 3cc: astore 12
      // 3ce: aload 2
      // 3cf: iload 6
      // 3d1: iinc 6 1
      // 3d4: baload
      // 3d5: sipush 504
      // 3d8: ldc2_w 5654009769112053174
      // 3db: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 3de: ishl
      // 3df: sipush 22151
      // 3e2: ldc2_w 7313380122959966929
      // 3e5: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 3e8: iand
      // 3e9: aload 2
      // 3ea: iload 6
      // 3ec: iinc 6 1
      // 3ef: baload
      // 3f0: sipush 26961
      // 3f3: ldc2_w 4492612352047467793
      // 3f6: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 3f9: ishl
      // 3fa: sipush 551
      // 3fd: ldc2_w 4684339154068350573
      // 400: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 403: iand
      // 404: ior
      // 405: aload 2
      // 406: iload 6
      // 408: iinc 6 1
      // 40b: baload
      // 40c: sipush 6463
      // 40f: ldc2_w 7373264339257539938
      // 412: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 415: ishl
      // 416: sipush 6549
      // 419: ldc2_w 2463809123935469001
      // 41c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 41f: iand
      // 420: ior
      // 421: aload 2
      // 422: iload 6
      // 424: iinc 6 1
      // 427: baload
      // 428: sipush 27363
      // 42b: ldc2_w 7002881761336348324
      // 42e: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 431: iand
      // 432: ior
      // 433: istore 7
      // 435: iload 7
      // 437: newarray 8
      // 439: astore 10
      // 43b: aload 2
      // 43c: iload 6
      // 43e: aload 10
      // 440: bipush 0
      // 441: iload 7
      // 443: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 446: iload 6
      // 448: iload 7
      // 44a: iadd
      // 44b: istore 6
      // 44d: aload 10
      // 44f: astore 13
      // 451: aconst_null
      // 452: astore 14
      // 454: aload 0
      // 455: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 458: sipush -1028
      // 45b: sipush -22066
      // 45e: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 461: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 464: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 467: ldc_w com/finalshell/core/C_H
      // 46a: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 46d: astore 15
      // 46f: aload 15
      // 471: bipush 0
      // 472: anewarray 181
      // 475: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 478: bipush 0
      // 479: anewarray 4
      // 47c: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 47f: checkcast com/finalshell/core/C_H
      // 482: astore 14
      // 484: aload 14
      // 486: invokeinterface com/finalshell/core/C_H.k ()V 1
      // 48b: goto 49f
      // 48e: astore 15
      // 490: new com/finalshell/core/Pc2
      // 493: dup
      // 494: aload 15
      // 496: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 499: aload 15
      // 49b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 49e: athrow
      // 49f: aload 14
      // 4a1: aload 13
      // 4a3: aload 11
      // 4a5: aload 9
      // 4a7: aload 12
      // 4a9: invokeinterface com/finalshell/core/C_H.g ([B[B[B[B)V 5
      // 4ae: aload 14
      // 4b0: aload 0
      // 4b1: getfield com/finalshell/core/Cv2.b [B
      // 4b4: invokeinterface com/finalshell/core/C_H.d ([B)V 2
      // 4b9: aload 14
      // 4bb: aload 4
      // 4bd: invokeinterface com/finalshell/core/C_H.g ([B)Z 2
      // 4c2: istore 8
      // 4c4: aload 0
      // 4c5: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 4c8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4cb: bipush 1
      // 4cc: iload 5
      // 4ce: ifne 4ef
      // 4d1: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 4d6: ifeq 50f
      // 4d9: goto 4e0
      // 4dc: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4df: athrow
      // 4e0: aload 0
      // 4e1: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 4e4: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4e7: bipush 1
      // 4e8: goto 4ef
      // 4eb: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ee: athrow
      // 4ef: new java/lang/StringBuilder
      // 4f2: dup
      // 4f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f6: sipush -1043
      // 4f9: sipush 28611
      // 4fc: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 4ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 502: iload 8
      // 504: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 507: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50a: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 50f: iload 5
      // 511: ifeq 984
      // 514: aload 1
      // 515: sipush -1083
      // 518: sipush -27401
      // 51b: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 51e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 521: goto 528
      // 524: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 527: athrow
      // 528: iload 5
      // 52a: ifne 5fb
      // 52d: ifne 57d
      // 530: goto 537
      // 533: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 536: athrow
      // 537: aload 1
      // 538: sipush -1071
      // 53b: sipush 7079
      // 53e: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 541: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 544: iload 5
      // 546: ifne 5fb
      // 549: goto 550
      // 54c: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54f: athrow
      // 550: ifne 57d
      // 553: goto 55a
      // 556: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 559: athrow
      // 55a: aload 1
      // 55b: sipush -1079
      // 55e: sipush -5047
      // 561: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 564: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 567: iload 5
      // 569: ifne 7a4
      // 56c: goto 573
      // 56f: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 572: athrow
      // 573: ifeq 790
      // 576: goto 57d
      // 579: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57c: athrow
      // 57d: aload 0
      // 57e: sipush 16035
      // 581: ldc2_w 5696974766573689583
      // 584: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 587: putfield com/finalshell/core/Cv2.q I
      // 58a: aload 0
      // 58b: aload 1
      // 58c: putfield com/finalshell/core/Cv2.G Ljava/lang/String;
      // 58f: aload 2
      // 590: iload 6
      // 592: iinc 6 1
      // 595: baload
      // 596: sipush 504
      // 599: ldc2_w 5654009769112053174
      // 59c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 59f: ishl
      // 5a0: sipush 22151
      // 5a3: ldc2_w 7313380122959966929
      // 5a6: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5a9: iand
      // 5aa: aload 2
      // 5ab: iload 6
      // 5ad: iinc 6 1
      // 5b0: baload
      // 5b1: sipush 26961
      // 5b4: ldc2_w 4492612352047467793
      // 5b7: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5ba: ishl
      // 5bb: sipush 551
      // 5be: ldc2_w 4684339154068350573
      // 5c1: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5c4: iand
      // 5c5: ior
      // 5c6: aload 2
      // 5c7: iload 6
      // 5c9: iinc 6 1
      // 5cc: baload
      // 5cd: sipush 6463
      // 5d0: ldc2_w 7373264339257539938
      // 5d3: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5d6: ishl
      // 5d7: sipush 6549
      // 5da: ldc2_w 2463809123935469001
      // 5dd: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5e0: iand
      // 5e1: ior
      // 5e2: aload 2
      // 5e3: iload 6
      // 5e5: iinc 6 1
      // 5e8: baload
      // 5e9: sipush 27363
      // 5ec: ldc2_w 7002881761336348324
      // 5ef: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 5f2: iand
      // 5f3: ior
      // 5f4: goto 5fb
      // 5f7: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fa: athrow
      // 5fb: istore 7
      // 5fd: iload 7
      // 5ff: newarray 8
      // 601: astore 9
      // 603: aload 2
      // 604: iload 6
      // 606: aload 9
      // 608: bipush 0
      // 609: iload 7
      // 60b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 60e: iload 6
      // 610: iload 7
      // 612: iadd
      // 613: istore 6
      // 615: aload 2
      // 616: iload 6
      // 618: iinc 6 1
      // 61b: baload
      // 61c: sipush 504
      // 61f: ldc2_w 5654009769112053174
      // 622: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 625: ishl
      // 626: sipush 22151
      // 629: ldc2_w 7313380122959966929
      // 62c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 62f: iand
      // 630: aload 2
      // 631: iload 6
      // 633: iinc 6 1
      // 636: baload
      // 637: sipush 26961
      // 63a: ldc2_w 4492612352047467793
      // 63d: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 640: ishl
      // 641: sipush 551
      // 644: ldc2_w 4684339154068350573
      // 647: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 64a: iand
      // 64b: ior
      // 64c: aload 2
      // 64d: iload 6
      // 64f: iinc 6 1
      // 652: baload
      // 653: sipush 6463
      // 656: ldc2_w 7373264339257539938
      // 659: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 65c: ishl
      // 65d: sipush 6549
      // 660: ldc2_w 2463809123935469001
      // 663: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 666: iand
      // 667: ior
      // 668: aload 2
      // 669: iload 6
      // 66b: iinc 6 1
      // 66e: baload
      // 66f: sipush 27363
      // 672: ldc2_w 7002881761336348324
      // 675: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 678: iand
      // 679: ior
      // 67a: istore 7
      // 67c: iinc 6 1
      // 67f: iload 7
      // 681: bipush 1
      // 682: isub
      // 683: bipush 2
      // 684: idiv
      // 685: newarray 8
      // 687: astore 9
      // 689: aload 2
      // 68a: iload 6
      // 68c: aload 9
      // 68e: bipush 0
      // 68f: aload 9
      // 691: arraylength
      // 692: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 695: iload 6
      // 697: iload 7
      // 699: bipush 1
      // 69a: isub
      // 69b: bipush 2
      // 69c: idiv
      // 69d: iadd
      // 69e: istore 6
      // 6a0: aload 9
      // 6a2: astore 10
      // 6a4: iload 7
      // 6a6: bipush 1
      // 6a7: isub
      // 6a8: bipush 2
      // 6a9: idiv
      // 6aa: newarray 8
      // 6ac: astore 9
      // 6ae: aload 2
      // 6af: iload 6
      // 6b1: aload 9
      // 6b3: bipush 0
      // 6b4: aload 9
      // 6b6: arraylength
      // 6b7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6ba: iload 6
      // 6bc: iload 7
      // 6be: bipush 1
      // 6bf: isub
      // 6c0: bipush 2
      // 6c1: idiv
      // 6c2: iadd
      // 6c3: istore 6
      // 6c5: aload 9
      // 6c7: astore 11
      // 6c9: aconst_null
      // 6ca: astore 12
      // 6cc: aload 0
      // 6cd: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 6d0: aload 1
      // 6d1: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 6d4: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 6d7: ldc_w com/finalshell/core/Q0_2
      // 6da: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 6dd: astore 13
      // 6df: aload 13
      // 6e1: bipush 0
      // 6e2: anewarray 181
      // 6e5: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 6e8: bipush 0
      // 6e9: anewarray 4
      // 6ec: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 6ef: checkcast com/finalshell/core/Q0_2
      // 6f2: astore 12
      // 6f4: aload 12
      // 6f6: invokeinterface com/finalshell/core/Q0_2.k ()V 1
      // 6fb: goto 70f
      // 6fe: astore 13
      // 700: new com/finalshell/core/Pc2
      // 703: dup
      // 704: aload 13
      // 706: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 709: aload 13
      // 70b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 70e: athrow
      // 70f: aload 12
      // 711: aload 10
      // 713: aload 11
      // 715: invokeinterface com/finalshell/core/Q0_2.T ([B[B)V 3
      // 71a: aload 12
      // 71c: aload 0
      // 71d: getfield com/finalshell/core/Cv2.b [B
      // 720: invokeinterface com/finalshell/core/Q0_2.d ([B)V 2
      // 725: aload 12
      // 727: aload 4
      // 729: invokeinterface com/finalshell/core/Q0_2.g ([B)Z 2
      // 72e: istore 8
      // 730: aload 0
      // 731: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 734: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 737: bipush 1
      // 738: iload 5
      // 73a: ifne 75b
      // 73d: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 742: ifeq 78b
      // 745: goto 74c
      // 748: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74b: athrow
      // 74c: aload 0
      // 74d: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 750: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 753: bipush 1
      // 754: goto 75b
      // 757: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75a: athrow
      // 75b: new java/lang/StringBuilder
      // 75e: dup
      // 75f: invokespecial java/lang/StringBuilder.<init> ()V
      // 762: sipush -1055
      // 765: sipush 22183
      // 768: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 76b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76e: aload 1
      // 76f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 772: sipush -1078
      // 775: sipush -32038
      // 778: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 77b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77e: iload 8
      // 780: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 783: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 786: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 78b: iload 5
      // 78d: ifeq 984
      // 790: aload 1
      // 791: sipush -1031
      // 794: sipush -5948
      // 797: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 79a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 79d: goto 7a4
      // 7a0: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a3: athrow
      // 7a4: iload 5
      // 7a6: ifne 854
      // 7a9: ifne 7d6
      // 7ac: goto 7b3
      // 7af: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b2: athrow
      // 7b3: aload 1
      // 7b4: sipush -1027
      // 7b7: sipush 29789
      // 7ba: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 7bd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7c0: iload 5
      // 7c2: ifne 947
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cb: athrow
      // 7cc: ifeq 933
      // 7cf: goto 7d6
      // 7d2: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d5: athrow
      // 7d6: aload 0
      // 7d7: sipush 22558
      // 7da: ldc2_w 9208030800086596681
      // 7dd: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 7e0: putfield com/finalshell/core/Cv2.q I
      // 7e3: aload 0
      // 7e4: aload 1
      // 7e5: putfield com/finalshell/core/Cv2.G Ljava/lang/String;
      // 7e8: aload 2
      // 7e9: iload 6
      // 7eb: iinc 6 1
      // 7ee: baload
      // 7ef: sipush 504
      // 7f2: ldc2_w 5654009769112053174
      // 7f5: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 7f8: ishl
      // 7f9: sipush 22151
      // 7fc: ldc2_w 7313380122959966929
      // 7ff: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 802: iand
      // 803: aload 2
      // 804: iload 6
      // 806: iinc 6 1
      // 809: baload
      // 80a: sipush 26961
      // 80d: ldc2_w 4492612352047467793
      // 810: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 813: ishl
      // 814: sipush 551
      // 817: ldc2_w 4684339154068350573
      // 81a: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 81d: iand
      // 81e: ior
      // 81f: aload 2
      // 820: iload 6
      // 822: iinc 6 1
      // 825: baload
      // 826: sipush 6463
      // 829: ldc2_w 7373264339257539938
      // 82c: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 82f: ishl
      // 830: sipush 6549
      // 833: ldc2_w 2463809123935469001
      // 836: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 839: iand
      // 83a: ior
      // 83b: aload 2
      // 83c: iload 6
      // 83e: iinc 6 1
      // 841: baload
      // 842: sipush 27363
      // 845: ldc2_w 7002881761336348324
      // 848: invokestatic com/finalshell/core/Cv2.a (IJ)I
      // 84b: iand
      // 84c: ior
      // 84d: goto 854
      // 850: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 853: athrow
      // 854: istore 7
      // 856: iload 7
      // 858: newarray 8
      // 85a: astore 9
      // 85c: aload 2
      // 85d: iload 6
      // 85f: aload 9
      // 861: bipush 0
      // 862: iload 7
      // 864: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 867: iload 6
      // 869: iload 7
      // 86b: iadd
      // 86c: istore 6
      // 86e: aconst_null
      // 86f: astore 10
      // 871: aload 0
      // 872: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 875: aload 1
      // 876: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 879: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 87c: ldc_w com/finalshell/core/Wt2_2
      // 87f: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 882: astore 11
      // 884: aload 11
      // 886: bipush 0
      // 887: anewarray 181
      // 88a: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 88d: bipush 0
      // 88e: anewarray 4
      // 891: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 894: checkcast com/finalshell/core/Wt2_2
      // 897: astore 10
      // 899: aload 10
      // 89b: invokeinterface com/finalshell/core/Wt2_2.k ()V 1
      // 8a0: goto 8b4
      // 8a3: astore 11
      // 8a5: new com/finalshell/core/Pc2
      // 8a8: dup
      // 8a9: aload 11
      // 8ab: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 8ae: aload 11
      // 8b0: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 8b3: athrow
      // 8b4: aload 10
      // 8b6: aload 9
      // 8b8: invokeinterface com/finalshell/core/Wt2_2.v ([B)V 2
      // 8bd: aload 10
      // 8bf: aload 0
      // 8c0: getfield com/finalshell/core/Cv2.b [B
      // 8c3: invokeinterface com/finalshell/core/Wt2_2.d ([B)V 2
      // 8c8: aload 10
      // 8ca: aload 4
      // 8cc: invokeinterface com/finalshell/core/Wt2_2.g ([B)Z 2
      // 8d1: istore 8
      // 8d3: aload 0
      // 8d4: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 8d7: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 8da: bipush 1
      // 8db: iload 5
      // 8dd: ifne 8fe
      // 8e0: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 8e5: ifeq 92e
      // 8e8: goto 8ef
      // 8eb: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ee: athrow
      // 8ef: aload 0
      // 8f0: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 8f3: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 8f6: bipush 1
      // 8f7: goto 8fe
      // 8fa: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8fd: athrow
      // 8fe: new java/lang/StringBuilder
      // 901: dup
      // 902: invokespecial java/lang/StringBuilder.<init> ()V
      // 905: sipush -1047
      // 908: sipush 1131
      // 90b: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 90e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 911: aload 1
      // 912: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 915: sipush -1078
      // 918: sipush -32038
      // 91b: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 91e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 921: iload 8
      // 923: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 926: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 929: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 92e: iload 5
      // 930: ifeq 984
      // 933: aload 0
      // 934: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 937: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 93a: bipush 3
      // 93b: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 940: goto 947
      // 943: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 946: athrow
      // 947: iload 5
      // 949: ifne 986
      // 94c: ifeq 984
      // 94f: goto 956
      // 952: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 955: athrow
      // 956: aload 0
      // 957: getfield com/finalshell/core/Cv2.a Lcom/finalshell/crypto/ConnectHost;
      // 95a: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 95d: bipush 3
      // 95e: new java/lang/StringBuilder
      // 961: dup
      // 962: invokespecial java/lang/StringBuilder.<init> ()V
      // 965: sipush -1033
      // 968: sipush 8334
      // 96b: invokestatic com/finalshell/core/Cv2.a (II)Ljava/lang/String;
      // 96e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 971: aload 1
      // 972: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 975: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 978: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 97d: goto 984
      // 980: invokestatic com/finalshell/core/Cv2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 983: athrow
      // 984: iload 8
      // 986: ireturn
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -1055) & 65535;
      if (ab[var2] == null) {
         char[] var3 = J[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 159;
               break;
            case 1:
               var10000 = 157;
               break;
            case 2:
               var10000 = 158;
               break;
            case 3:
               var10000 = 174;
               break;
            case 4:
               var10000 = 235;
               break;
            case 5:
               var10000 = 97;
               break;
            case 6:
               var10000 = 192;
               break;
            case 7:
               var10000 = 94;
               break;
            case 8:
               var10000 = 112;
               break;
            case 9:
               var10000 = 183;
               break;
            case 10:
               var10000 = 42;
               break;
            case 11:
               var10000 = 127;
               break;
            case 12:
               var10000 = 185;
               break;
            case 13:
               var10000 = 137;
               break;
            case 14:
               var10000 = 91;
               break;
            case 15:
               var10000 = 123;
               break;
            case 16:
               var10000 = 9;
               break;
            case 17:
               var10000 = 100;
               break;
            case 18:
               var10000 = 238;
               break;
            case 19:
               var10000 = 75;
               break;
            case 20:
               var10000 = 216;
               break;
            case 21:
               var10000 = 87;
               break;
            case 22:
               var10000 = 180;
               break;
            case 23:
               var10000 = 69;
               break;
            case 24:
               var10000 = 54;
               break;
            case 25:
               var10000 = 243;
               break;
            case 26:
               var10000 = 50;
               break;
            case 27:
               var10000 = 177;
               break;
            case 28:
               var10000 = 46;
               break;
            case 29:
               var10000 = 250;
               break;
            case 30:
               var10000 = 71;
               break;
            case 31:
               var10000 = 28;
               break;
            case 32:
               var10000 = 207;
               break;
            case 33:
               var10000 = 219;
               break;
            case 34:
               var10000 = 72;
               break;
            case 35:
               var10000 = 27;
               break;
            case 36:
               var10000 = 116;
               break;
            case 37:
               var10000 = 121;
               break;
            case 38:
               var10000 = 83;
               break;
            case 39:
               var10000 = 142;
               break;
            case 40:
               var10000 = 204;
               break;
            case 41:
               var10000 = 67;
               break;
            case 42:
               var10000 = 184;
               break;
            case 43:
               var10000 = 30;
               break;
            case 44:
               var10000 = 70;
               break;
            case 45:
               var10000 = 134;
               break;
            case 46:
               var10000 = 11;
               break;
            case 47:
               var10000 = 173;
               break;
            case 48:
               var10000 = 40;
               break;
            case 49:
               var10000 = 212;
               break;
            case 50:
               var10000 = 55;
               break;
            case 51:
               var10000 = 145;
               break;
            case 52:
               var10000 = 171;
               break;
            case 53:
               var10000 = 202;
               break;
            case 54:
               var10000 = 16;
               break;
            case 55:
               var10000 = 39;
               break;
            case 56:
               var10000 = 231;
               break;
            case 57:
               var10000 = 51;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 119;
               break;
            case 60:
               var10000 = 15;
               break;
            case 61:
               var10000 = 155;
               break;
            case 62:
               var10000 = 12;
               break;
            case 63:
               var10000 = 239;
               break;
            case 64:
               var10000 = 58;
               break;
            case 65:
               var10000 = 124;
               break;
            case 66:
               var10000 = 237;
               break;
            case 67:
               var10000 = 169;
               break;
            case 68:
               var10000 = 96;
               break;
            case 69:
               var10000 = 92;
               break;
            case 70:
               var10000 = 118;
               break;
            case 71:
               var10000 = 227;
               break;
            case 72:
               var10000 = 82;
               break;
            case 73:
               var10000 = 114;
               break;
            case 74:
               var10000 = 230;
               break;
            case 75:
               var10000 = 101;
               break;
            case 76:
               var10000 = 22;
               break;
            case 77:
               var10000 = 60;
               break;
            case 78:
               var10000 = 186;
               break;
            case 79:
               var10000 = 13;
               break;
            case 80:
               var10000 = 217;
               break;
            case 81:
               var10000 = 172;
               break;
            case 82:
               var10000 = 223;
               break;
            case 83:
               var10000 = 187;
               break;
            case 84:
               var10000 = 77;
               break;
            case 85:
               var10000 = 85;
               break;
            case 86:
               var10000 = 104;
               break;
            case 87:
               var10000 = 178;
               break;
            case 88:
               var10000 = 143;
               break;
            case 89:
               var10000 = 122;
               break;
            case 90:
               var10000 = 133;
               break;
            case 91:
               var10000 = 234;
               break;
            case 92:
               var10000 = 138;
               break;
            case 93:
               var10000 = 89;
               break;
            case 94:
               var10000 = 8;
               break;
            case 95:
               var10000 = 108;
               break;
            case 96:
               var10000 = 103;
               break;
            case 97:
               var10000 = 244;
               break;
            case 98:
               var10000 = 205;
               break;
            case 99:
               var10000 = 125;
               break;
            case 100:
               var10000 = 249;
               break;
            case 101:
               var10000 = 93;
               break;
            case 102:
               var10000 = 5;
               break;
            case 103:
               var10000 = 245;
               break;
            case 104:
               var10000 = 35;
               break;
            case 105:
               var10000 = 194;
               break;
            case 106:
               var10000 = 64;
               break;
            case 107:
               var10000 = 86;
               break;
            case 108:
               var10000 = 131;
               break;
            case 109:
               var10000 = 45;
               break;
            case 110:
               var10000 = 84;
               break;
            case 111:
               var10000 = 115;
               break;
            case 112:
               var10000 = 106;
               break;
            case 113:
               var10000 = 191;
               break;
            case 114:
               var10000 = 7;
               break;
            case 115:
               var10000 = 117;
               break;
            case 116:
               var10000 = 160;
               break;
            case 117:
               var10000 = 254;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 201;
               break;
            case 120:
               var10000 = 164;
               break;
            case 121:
               var10000 = 21;
               break;
            case 122:
               var10000 = 44;
               break;
            case 123:
               var10000 = 105;
               break;
            case 124:
               var10000 = 76;
               break;
            case 125:
               var10000 = 242;
               break;
            case 126:
               var10000 = 152;
               break;
            case 127:
               var10000 = 228;
               break;
            case 128:
               var10000 = 200;
               break;
            case 129:
               var10000 = 236;
               break;
            case 130:
               var10000 = 98;
               break;
            case 131:
               var10000 = 56;
               break;
            case 132:
               var10000 = 4;
               break;
            case 133:
               var10000 = 188;
               break;
            case 134:
               var10000 = 226;
               break;
            case 135:
               var10000 = 90;
               break;
            case 136:
               var10000 = 31;
               break;
            case 137:
               var10000 = 107;
               break;
            case 138:
               var10000 = 32;
               break;
            case 139:
               var10000 = 247;
               break;
            case 140:
               var10000 = 214;
               break;
            case 141:
               var10000 = 170;
               break;
            case 142:
               var10000 = 6;
               break;
            case 143:
               var10000 = 139;
               break;
            case 144:
               var10000 = 225;
               break;
            case 145:
               var10000 = 135;
               break;
            case 146:
               var10000 = 153;
               break;
            case 147:
               var10000 = 240;
               break;
            case 148:
               var10000 = 59;
               break;
            case 149:
               var10000 = 57;
               break;
            case 150:
               var10000 = 199;
               break;
            case 151:
               var10000 = 148;
               break;
            case 152:
               var10000 = 81;
               break;
            case 153:
               var10000 = 48;
               break;
            case 154:
               var10000 = 218;
               break;
            case 155:
               var10000 = 176;
               break;
            case 156:
               var10000 = 23;
               break;
            case 157:
               var10000 = 136;
               break;
            case 158:
               var10000 = 181;
               break;
            case 159:
               var10000 = 232;
               break;
            case 160:
               var10000 = 163;
               break;
            case 161:
               var10000 = 47;
               break;
            case 162:
               var10000 = 126;
               break;
            case 163:
               var10000 = 33;
               break;
            case 164:
               var10000 = 195;
               break;
            case 165:
               var10000 = 18;
               break;
            case 166:
               var10000 = 213;
               break;
            case 167:
               var10000 = 130;
               break;
            case 168:
               var10000 = 37;
               break;
            case 169:
               var10000 = 196;
               break;
            case 170:
               var10000 = 20;
               break;
            case 171:
               var10000 = 167;
               break;
            case 172:
               var10000 = 222;
               break;
            case 173:
               var10000 = 88;
               break;
            case 174:
               var10000 = 179;
               break;
            case 175:
               var10000 = 52;
               break;
            case 176:
               var10000 = 208;
               break;
            case 177:
               var10000 = 10;
               break;
            case 178:
               var10000 = 175;
               break;
            case 179:
               var10000 = 19;
               break;
            case 180:
               var10000 = 215;
               break;
            case 181:
               var10000 = 233;
               break;
            case 182:
               var10000 = 255;
               break;
            case 183:
               var10000 = 113;
               break;
            case 184:
               var10000 = 26;
               break;
            case 185:
               var10000 = 78;
               break;
            case 186:
               var10000 = 109;
               break;
            case 187:
               var10000 = 73;
               break;
            case 188:
               var10000 = 79;
               break;
            case 189:
               var10000 = 189;
               break;
            case 190:
               var10000 = 128;
               break;
            case 191:
               var10000 = 210;
               break;
            case 192:
               var10000 = 229;
               break;
            case 193:
               var10000 = 62;
               break;
            case 194:
               var10000 = 38;
               break;
            case 195:
               var10000 = 17;
               break;
            case 196:
               var10000 = 41;
               break;
            case 197:
               var10000 = 140;
               break;
            case 198:
               var10000 = 248;
               break;
            case 199:
               var10000 = 95;
               break;
            case 200:
               var10000 = 34;
               break;
            case 201:
               var10000 = 80;
               break;
            case 202:
               var10000 = 65;
               break;
            case 203:
               var10000 = 74;
               break;
            case 204:
               var10000 = 129;
               break;
            case 205:
               var10000 = 168;
               break;
            case 206:
               var10000 = 166;
               break;
            case 207:
               var10000 = 151;
               break;
            case 208:
               var10000 = 224;
               break;
            case 209:
               var10000 = 25;
               break;
            case 210:
               var10000 = 209;
               break;
            case 211:
               var10000 = 111;
               break;
            case 212:
               var10000 = 150;
               break;
            case 213:
               var10000 = 241;
               break;
            case 214:
               var10000 = 36;
               break;
            case 215:
               var10000 = 154;
               break;
            case 216:
               var10000 = 14;
               break;
            case 217:
               var10000 = 149;
               break;
            case 218:
               var10000 = 147;
               break;
            case 219:
               var10000 = 132;
               break;
            case 220:
               var10000 = 120;
               break;
            case 221:
               var10000 = 3;
               break;
            case 222:
               var10000 = 68;
               break;
            case 223:
               var10000 = 220;
               break;
            case 224:
               var10000 = 43;
               break;
            case 225:
               var10000 = 1;
               break;
            case 226:
               var10000 = 203;
               break;
            case 227:
               var10000 = 99;
               break;
            case 228:
               var10000 = 251;
               break;
            case 229:
               var10000 = 161;
               break;
            case 230:
               var10000 = 2;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 61;
               break;
            case 233:
               var10000 = 144;
               break;
            case 234:
               var10000 = 141;
               break;
            case 235:
               var10000 = 162;
               break;
            case 236:
               var10000 = 24;
               break;
            case 237:
               var10000 = 156;
               break;
            case 238:
               var10000 = 110;
               break;
            case 239:
               var10000 = 246;
               break;
            case 240:
               var10000 = 198;
               break;
            case 241:
               var10000 = 53;
               break;
            case 242:
               var10000 = 190;
               break;
            case 243:
               var10000 = 206;
               break;
            case 244:
               var10000 = 146;
               break;
            case 245:
               var10000 = 252;
               break;
            case 246:
               var10000 = 165;
               break;
            case 247:
               var10000 = 49;
               break;
            case 248:
               var10000 = 193;
               break;
            case 249:
               var10000 = 211;
               break;
            case 250:
               var10000 = 29;
               break;
            case 251:
               var10000 = 66;
               break;
            case 252:
               var10000 = 197;
               break;
            case 253:
               var10000 = 253;
               break;
            case 254:
               var10000 = 221;
               break;
            default:
               var10000 = 0;
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

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9295;
      if (cb[var3] == null) {
         cb[var3] = (int)(bb[var3] ^ var1);
      }

      return cb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var34;
      String[] var13 = new String[51];
      int var11 = 0;
      String var10 = "Xòþÿ àPAöê\u0006sÂ7#®t@\u0010\u000e\u009a?CO¼X\u009cðê\u0016ê&3ºó\u0005{±F\u00adº\u000e\u0019<è\u0006\u0010ºà9ÓÓë¯\r\u008f\u001a÷Vð\u000b\"fÔL\u0002\u0000\u0006s\u00889P\u0096pÕ¸\u0080\u0004b\u0091,\u00ad.\n¿\u009f¡$g[\u0097gü\u0016\u001ckE\u0093¸ÚÑãt¶Wÿñ5,\u0012\u0096F\u001b\u008a(1i,\u0081}Ø\u0094þ\u0007µôCM\u0080\u009a´\u0012ZÚ¾ú(GQRÖ\u0088\u0002?B¾3\u009fvf\u0007÷¦\u000b\u0007\u009fÓ\u0091\fBß\u0089\u008e*ée0é\u00804\u0083\u0006´ûs;Â¤\u001a¶Ñ#\u009b\u009a|1ì8Ì.ÆW\u001c[\u0080å¾954PË\u0002$£\u0010²4)êIuóIò0óÊä\u0090$½\f+\b¤t\u008f¶ÑÛ\u007fýæ,\u0019\fd\u007f\u009cGNZþÈbkòÚNMô\u0003óf]}¦M\u000bª\u0002e\u008e\u0011»\u009e\u0098\u008fµó¦\u0013÷óQlï\u0097\u00adðô\u001cIc×|RYûl\u008e'\u008f\u0095ý°\u0002\f\u007f;ÚFý¤µ8Nïò\u0018\u000b\u0090¾í\u0018YÜh¦\u0006B_\u0011Úå½Ûb\u000e6jåÜ\u0013\u0089§+¤gÕ\u0003\u0001\u000e-\r\u00824`¨\u009a\tF¹\u007fÿ&Û§\u0013ñ»¨b×\u0015BüÔ(1Ð`\u001aÆ~t»g\u000b¼Cb»³St\u0096ºð\u001e\u0002÷¿\u000fù#Ýuö}h4\ftHÓ\u0011\u0095}\u000b»\u0082ºÉ\u0082\u001b~z2q¹\tÕåOo\u0016ÉÆÄ'\r}£U½¿¨6¼\r\u0005ïÇ®\re\u001a£\u008a]sîgP\u0085\u0097YF\u000fßT\u009bJJx\t`CÞ»Ï$2\u0080\u000b:w¸!óû=B¼Þ\n\n\u0088+G²»\u0089\f=\u008f]\bfyHo\u0096GÇ<\u0005Ô\r³Ý\u0004\u0013KËDæþ$\u0018E\n\u007fÂ\nqh?\u0015¯\nH\bh¥\u0089ô®4ÀR\b\u0081¡\u0017Í\u0016\u001f-¼\b\u0005ù\u0087Æ\u0004no\u0090\u0013®ÞøDipêÏT.\t \b-\u0010½M\u0018ô\u000f\u0090ÎðÈSÊÜÂ\u009aª\u009a\b[î6\u000et¸E\u0096¥¨V{\u0005\u009b1¦V®\u000bÑÁ÷¡+\u0016KÛ\u0094Em\u000eaªÖ{\u0017ï1Rª!þ÷\u0080\u0011\u000fõ\u000eK\u0012\u0081q\u0094>Ù\u009d\u00ad||\u008d5\u0006¸ÄòÜòX\u0010òW«K\u009df\u0017¯¬¤¼Ë\u0005½\u0011´\u00130¹+¨\u0013í¥|½X4î¯ôä\u0086Õu$";
      int var12 = "Xòþÿ àPAöê\u0006sÂ7#®t@\u0010\u000e\u009a?CO¼X\u009cðê\u0016ê&3ºó\u0005{±F\u00adº\u000e\u0019<è\u0006\u0010ºà9ÓÓë¯\r\u008f\u001a÷Vð\u000b\"fÔL\u0002\u0000\u0006s\u00889P\u0096pÕ¸\u0080\u0004b\u0091,\u00ad.\n¿\u009f¡$g[\u0097gü\u0016\u001ckE\u0093¸ÚÑãt¶Wÿñ5,\u0012\u0096F\u001b\u008a(1i,\u0081}Ø\u0094þ\u0007µôCM\u0080\u009a´\u0012ZÚ¾ú(GQRÖ\u0088\u0002?B¾3\u009fvf\u0007÷¦\u000b\u0007\u009fÓ\u0091\fBß\u0089\u008e*ée0é\u00804\u0083\u0006´ûs;Â¤\u001a¶Ñ#\u009b\u009a|1ì8Ì.ÆW\u001c[\u0080å¾954PË\u0002$£\u0010²4)êIuóIò0óÊä\u0090$½\f+\b¤t\u008f¶ÑÛ\u007fýæ,\u0019\fd\u007f\u009cGNZþÈbkòÚNMô\u0003óf]}¦M\u000bª\u0002e\u008e\u0011»\u009e\u0098\u008fµó¦\u0013÷óQlï\u0097\u00adðô\u001cIc×|RYûl\u008e'\u008f\u0095ý°\u0002\f\u007f;ÚFý¤µ8Nïò\u0018\u000b\u0090¾í\u0018YÜh¦\u0006B_\u0011Úå½Ûb\u000e6jåÜ\u0013\u0089§+¤gÕ\u0003\u0001\u000e-\r\u00824`¨\u009a\tF¹\u007fÿ&Û§\u0013ñ»¨b×\u0015BüÔ(1Ð`\u001aÆ~t»g\u000b¼Cb»³St\u0096ºð\u001e\u0002÷¿\u000fù#Ýuö}h4\ftHÓ\u0011\u0095}\u000b»\u0082ºÉ\u0082\u001b~z2q¹\tÕåOo\u0016ÉÆÄ'\r}£U½¿¨6¼\r\u0005ïÇ®\re\u001a£\u008a]sîgP\u0085\u0097YF\u000fßT\u009bJJx\t`CÞ»Ï$2\u0080\u000b:w¸!óû=B¼Þ\n\n\u0088+G²»\u0089\f=\u008f]\bfyHo\u0096GÇ<\u0005Ô\r³Ý\u0004\u0013KËDæþ$\u0018E\n\u007fÂ\nqh?\u0015¯\nH\bh¥\u0089ô®4ÀR\b\u0081¡\u0017Í\u0016\u001f-¼\b\u0005ù\u0087Æ\u0004no\u0090\u0013®ÞøDipêÏT.\t \b-\u0010½M\u0018ô\u000f\u0090ÎðÈSÊÜÂ\u009aª\u009a\b[î6\u000et¸E\u0096¥¨V{\u0005\u009b1¦V®\u000bÑÁ÷¡+\u0016KÛ\u0094Em\u000eaªÖ{\u0017ï1Rª!þ÷\u0080\u0011\u000fõ\u000eK\u0012\u0081q\u0094>Ù\u009d\u00ad||\u008d5\u0006¸ÄòÜòX\u0010òW«K\u009df\u0017¯¬¤¼Ë\u0005½\u0011´\u00130¹+¨\u0013í¥|½X4î¯ôä\u0086Õu$"
         .length();
      char var9 = 18;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 72;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var10000;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               } else {
                  var43 = var10000;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 100;
                        break;
                     case 1:
                        var66 = 127;
                        break;
                     case 2:
                        var66 = 77;
                        break;
                     case 3:
                        var66 = 77;
                        break;
                     case 4:
                        var66 = 23;
                        break;
                     case 5:
                        var66 = 32;
                        break;
                     default:
                        var66 = 90;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     J = var13;
                     ab = new String[51];
                     long var0 = 8987258578033441491L;
                     long[] var6 = new long[30];
                     int var3 = 0;
                     String var4 = "\u0085µJ]ôÁ9\u0080Ä.õÍ¬Àß}=\u009a:ú'.T/Ñ\u001e8Ì¯¾à>l!{F(9\u008anN8.¼=\u000e\\¾ºOïç\u0084\u0093Çsô\u0002\u0091\u0092¥ý\u0011$\u0016M\u001eY\u0084À4\u0088\u0003£j\u000fËî'F\u0012RÙµ\u0092XHÇúÂÇÓq\u0019ÄÃ¤¦«\u000eñ2¢É8õbëÍ\u008f\\xìÕ \u009bðw\fù1¾£ õ\u0011·Òé\u0010¾\u008aJã\u0099T$æ\u007f\u001f\u0089J\u009c\u009b\u008cE\u0005Ì\u0098ÃÇ¹l:ðËBÉ8\u001a\u009aæµ¸\u008bôëÆ(\u0082\u0010\u009b\u008cçî\u009eþwñ\u009c¯RB·®¿%ãË¿µ\u001fQiÆ\b\u0090G\u0086\u0099Rá@\tÇ-\u0088\u0002ßÊÃDJÕFr\u0095\u0081`}_Jùk";
                     int var5 = "\u0085µJ]ôÁ9\u0080Ä.õÍ¬Àß}=\u009a:ú'.T/Ñ\u001e8Ì¯¾à>l!{F(9\u008anN8.¼=\u000e\\¾ºOïç\u0084\u0093Çsô\u0002\u0091\u0092¥ý\u0011$\u0016M\u001eY\u0084À4\u0088\u0003£j\u000fËî'F\u0012RÙµ\u0092XHÇúÂÇÓq\u0019ÄÃ¤¦«\u000eñ2¢É8õbëÍ\u008f\\xìÕ \u009bðw\fù1¾£ õ\u0011·Òé\u0010¾\u008aJã\u0099T$æ\u007f\u001f\u0089J\u009c\u009b\u008cE\u0005Ì\u0098ÃÇ¹l:ðËBÉ8\u001a\u009aæµ¸\u008bôëÆ(\u0082\u0010\u009b\u008cçî\u009eþwñ\u009c¯RB·®¿%ãË¿µ\u001fQiÆ\b\u0090G\u0086\u0099Rá@\tÇ-\u0088\u0002ßÊÃDJÕFr\u0095\u0081`}_Jùk"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        long[] var19 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var19[var28] = var55;
                                 if (var2 >= var5) {
                                    bb = var6;
                                    cb = new Integer[30];
                                    String[] var20 = new String[a(2747, 363137600718745334L)];
                                    var20[0] = a(-1075, 5186);
                                    var20[1] = a(-1034, -6472);
                                    var20[2] = a(-1038, 12078);
                                    var20[3] = a(-1087, -8919);
                                    var20[4] = a(-1082, -11609);
                                    var20[5] = a(-1081, 12088);
                                    var20[a(5719, 5855483516180738578L)] = a(-1080, -6866);
                                    var20[a(31188, 7344419028371103122L)] = a(-1029, 27815);
                                    var20[a(12319, 9054970208420369477L)] = a(-1025, -16745);
                                    var20[a(18385, 9043669540619182990L)] = a(-1072, 7703);
                                    t = var20;
                                    F = a(-1051, -29629);
                                    A = a(-1076, -8385);
                                    R = a(-1041, -20029);
                                    g = a(-1045, -10144);
                                    r = a(-1085, 2312);
                                    P = a(-1084, 24460);
                                    V = "";
                                    n = "";
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "7_~O\u0084Ñ\u0002\u0091ô*ýî<Ï5~";
                                 var5 = "7_~O\u0084Ñ\u0002\u0091ô*ýî<Ï5~".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var19 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "?\u0010BaË¤\u00967õ%\u0099ç/\u0003D\u0096û";
                  var12 = "?\u0010BaË¤\u00967õ%\u0099ç/\u0003D\u0096û".length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





