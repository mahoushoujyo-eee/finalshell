package com.finalshell.core;

import java.util.ArrayList;

public class W3_2 implements A0_2 {
   public final String e;
   public final long H;
   public final boolean v;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public W3_2(String var1, boolean var2) {
      this.e = var1;
      this.H = B8_2.z$long(var1);
      this.v = var2;
   }

   @Override
   public Object Y(Ph4 var1, Object var2, Object var3) {
      String var4 = Hi2.C();

      label27: {
         try {
            if (var4 != null) {
               return this;
            }

            if (this.v) {
               break label27;
            }
         } catch (UnsupportedOperationException var6) {
            throw a(var6);
         }

         return var1.S(var3, this.e, this.H);
      }

      ArrayList var5 = new ArrayList();
      var1.L(var3, this.e, var5);
      return var5;
   }

   @Override
   public void Z(Ph4 param1, Yn4 param2, KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 2
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: checkcast com/finalshell/core/U9
      // 00a: astore 5
      // 00c: astore 4
      // 00e: aload 0
      // 00f: getfield com/finalshell/core/W3_2.v Z
      // 012: aload 4
      // 014: ifnonnull 052
      // 017: ifeq 04d
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 020: athrow
      // 021: aload 3
      // 022: aload 4
      // 024: ifnonnull 043
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 02d: athrow
      // 02e: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 031: ifnonnull 04d
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 03a: athrow
      // 03b: aload 3
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 042: athrow
      // 043: new com/finalshell/ui/model/Oc2
      // 046: dup
      // 047: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 04a: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 04d: aload 5
      // 04f: invokevirtual com/finalshell/core/U9.P ()I
      // 052: aload 4
      // 054: ifnonnull 337
      // 057: sipush 16838
      // 05a: ldc2_w 2498432083119098875
      // 05d: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 060: if_icmpne 333
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 069: athrow
      // 06a: ldc "*"
      // 06c: aload 0
      // 06d: getfield com/finalshell/core/W3_2.e Ljava/lang/String;
      // 070: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 073: aload 4
      // 075: ifnonnull 09f
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 07e: athrow
      // 07f: ifeq 08a
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 088: athrow
      // 089: return
      // 08a: aload 5
      // 08c: invokevirtual com/finalshell/core/U9.K ()V
      // 08f: aload 0
      // 090: aload 4
      // 092: ifnonnull 0ad
      // 095: getfield com/finalshell/core/W3_2.v Z
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 09e: athrow
      // 09f: ifeq 0b7
      // 0a2: aload 3
      // 0a3: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ac: athrow
      // 0ad: checkcast com/finalshell/ui/model/Oc2
      // 0b0: astore 6
      // 0b2: aload 4
      // 0b4: ifnull 0c0
      // 0b7: new com/finalshell/ui/model/Oc2
      // 0ba: dup
      // 0bb: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 0be: astore 6
      // 0c0: aload 5
      // 0c2: invokevirtual com/finalshell/core/U9.P ()I
      // 0c5: tableswitch 450 2 14 438 438 438 438 438 438 438 450 450 450 67 450 375
      // 108: aload 0
      // 109: getfield com/finalshell/core/W3_2.v Z
      // 10c: aload 4
      // 10e: ifnonnull 142
      // 111: ifeq 12e
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 11a: athrow
      // 11b: aload 0
      // 11c: aload 1
      // 11d: aload 2
      // 11e: aload 3
      // 11f: invokevirtual com/finalshell/core/W3_2.Z (Lcom/finalshell/core/Ph4;Lcom/finalshell/core/Yn4;Lcom/finalshell/core/KE;)V
      // 122: aload 4
      // 124: ifnull 287
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 12d: athrow
      // 12e: aload 5
      // 130: aload 0
      // 131: getfield com/finalshell/core/W3_2.H J
      // 134: aload 0
      // 135: getfield com/finalshell/core/W3_2.v Z
      // 138: invokevirtual com/finalshell/core/U9.w (JZ)I
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 141: athrow
      // 142: istore 7
      // 144: iload 7
      // 146: bipush 3
      // 147: aload 4
      // 149: ifnonnull 20a
      // 14c: if_icmpne 1f4
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 155: athrow
      // 156: aload 5
      // 158: aload 4
      // 15a: ifnonnull 1b1
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 163: athrow
      // 164: invokevirtual com/finalshell/core/U9.P ()I
      // 167: lookupswitch 63 2 2 29 4 46
      // 180: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 183: athrow
      // 184: aload 5
      // 186: invokevirtual com/finalshell/core/U9.j ()Ljava/lang/Number;
      // 189: astore 8
      // 18b: aload 5
      // 18d: invokevirtual com/finalshell/core/U9.K ()V
      // 190: aload 4
      // 192: ifnull 1b3
      // 195: aload 5
      // 197: invokevirtual com/finalshell/core/U9.z ()Ljava/lang/String;
      // 19a: astore 8
      // 19c: aload 5
      // 19e: invokevirtual com/finalshell/core/U9.K ()V
      // 1a1: aload 4
      // 1a3: ifnull 1b3
      // 1a6: aload 2
      // 1a7: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1b0: athrow
      // 1b1: astore 8
      // 1b3: aload 6
      // 1b5: aload 8
      // 1b7: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 1ba: pop
      // 1bb: aload 5
      // 1bd: aload 4
      // 1bf: ifnonnull 1eb
      // 1c2: invokevirtual com/finalshell/core/U9.P ()I
      // 1c5: sipush 14786
      // 1c8: ldc2_w 1817364102195131389
      // 1cb: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 1ce: if_icmpne 1e9
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1d7: athrow
      // 1d8: aload 5
      // 1da: invokevirtual com/finalshell/core/U9.K ()V
      // 1dd: aload 4
      // 1df: ifnull 0c0
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1e8: athrow
      // 1e9: aload 5
      // 1eb: bipush 0
      // 1ec: invokevirtual com/finalshell/core/U9.d (Z)V
      // 1ef: aload 4
      // 1f1: ifnull 287
      // 1f4: iload 7
      // 1f6: aload 4
      // 1f8: ifnonnull 21d
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 201: athrow
      // 202: bipush -1
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 209: athrow
      // 20a: if_icmpne 219
      // 20d: aload 4
      // 20f: ifnull 0c0
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 218: athrow
      // 219: aload 0
      // 21a: getfield com/finalshell/core/W3_2.v Z
      // 21d: ifeq 231
      // 220: new java/lang/UnsupportedOperationException
      // 223: dup
      // 224: aload 5
      // 226: invokevirtual com/finalshell/core/U9.C$String ()Ljava/lang/String;
      // 229: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 22c: athrow
      // 22d: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 230: athrow
      // 231: aload 5
      // 233: bipush 0
      // 234: invokevirtual com/finalshell/core/U9.d (Z)V
      // 237: aload 4
      // 239: ifnull 287
      // 23c: aload 0
      // 23d: aload 4
      // 23f: ifnonnull 25e
      // 242: goto 249
      // 245: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 248: athrow
      // 249: getfield com/finalshell/core/W3_2.v Z
      // 24c: ifeq 269
      // 24f: goto 256
      // 252: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 255: athrow
      // 256: aload 0
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 25d: athrow
      // 25e: aload 1
      // 25f: aload 2
      // 260: aload 3
      // 261: invokevirtual com/finalshell/core/W3_2.Z (Lcom/finalshell/core/Ph4;Lcom/finalshell/core/Yn4;Lcom/finalshell/core/KE;)V
      // 264: aload 4
      // 266: ifnull 287
      // 269: aload 5
      // 26b: bipush 0
      // 26c: invokevirtual com/finalshell/core/U9.d (Z)V
      // 26f: aload 4
      // 271: ifnull 287
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 27a: athrow
      // 27b: aload 5
      // 27d: invokevirtual com/finalshell/core/U9.K ()V
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 286: athrow
      // 287: aload 5
      // 289: invokevirtual com/finalshell/core/U9.P ()I
      // 28c: sipush 14149
      // 28f: ldc2_w 1938244912688184701
      // 292: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 295: aload 4
      // 297: ifnonnull 2d6
      // 29a: if_icmpne 2b5
      // 29d: goto 2a4
      // 2a0: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2a3: athrow
      // 2a4: aload 5
      // 2a6: invokevirtual com/finalshell/core/U9.K ()V
      // 2a9: aload 4
      // 2ab: ifnull 303
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2b4: athrow
      // 2b5: aload 5
      // 2b7: aload 4
      // 2b9: ifnonnull 2db
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2c2: athrow
      // 2c3: invokevirtual com/finalshell/core/U9.P ()I
      // 2c6: sipush 7765
      // 2c9: ldc2_w 3013900387449443433
      // 2cc: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2d5: athrow
      // 2d6: if_icmpne 2e3
      // 2d9: aload 5
      // 2db: invokevirtual com/finalshell/core/U9.K ()V
      // 2de: aload 4
      // 2e0: ifnull 0c0
      // 2e3: new com/finalshell/core/Hi2
      // 2e6: dup
      // 2e7: new java/lang/StringBuilder
      // 2ea: dup
      // 2eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ee: getstatic com/finalshell/core/W3_2.a Ljava/lang/String;
      // 2f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f4: aload 5
      // 2f6: invokevirtual com/finalshell/core/U9.C$String ()Ljava/lang/String;
      // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ff: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 302: athrow
      // 303: aload 0
      // 304: getfield com/finalshell/core/W3_2.v Z
      // 307: aload 4
      // 309: ifnonnull 322
      // 30c: ifne 332
      // 30f: goto 316
      // 312: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 315: athrow
      // 316: aload 6
      // 318: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 31b: goto 322
      // 31e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 321: athrow
      // 322: ifle 332
      // 325: aload 3
      // 326: aload 6
      // 328: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 331: athrow
      // 332: return
      // 333: aload 0
      // 334: getfield com/finalshell/core/W3_2.v Z
      // 337: aload 4
      // 339: ifnonnull 43d
      // 33c: ifne 430
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 345: athrow
      // 346: aload 5
      // 348: aload 0
      // 349: getfield com/finalshell/core/W3_2.H J
      // 34c: aload 0
      // 34d: getfield com/finalshell/core/W3_2.v Z
      // 350: invokevirtual com/finalshell/core/U9.w (JZ)I
      // 353: istore 6
      // 355: iload 6
      // 357: aload 4
      // 359: ifnonnull 372
      // 35c: bipush 3
      // 35d: if_icmpne 42f
      // 360: goto 367
      // 363: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 366: athrow
      // 367: aload 3
      // 368: getfield com/finalshell/core/KE.o Z
      // 36b: goto 372
      // 36e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 371: athrow
      // 372: aload 4
      // 374: ifnonnull 399
      // 377: ifeq 42f
      // 37a: goto 381
      // 37d: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 380: athrow
      // 381: aload 5
      // 383: aload 4
      // 385: ifnonnull 40d
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 38e: athrow
      // 38f: invokevirtual com/finalshell/core/U9.P ()I
      // 392: goto 399
      // 395: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 398: athrow
      // 399: tableswitch 105 2 4 27 53 79
      // 3b4: aload 5
      // 3b6: invokevirtual com/finalshell/core/U9.j ()Ljava/lang/Number;
      // 3b9: astore 7
      // 3bb: aload 5
      // 3bd: sipush 27205
      // 3c0: ldc2_w 8776221799930060923
      // 3c3: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 3c6: invokevirtual com/finalshell/core/U9.S (I)V
      // 3c9: aload 4
      // 3cb: ifnull 40f
      // 3ce: aload 5
      // 3d0: invokevirtual com/finalshell/core/U9.c$BigDecimal ()Ljava/math/BigDecimal;
      // 3d3: astore 7
      // 3d5: aload 5
      // 3d7: sipush 27205
      // 3da: ldc2_w 8776221799930060923
      // 3dd: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 3e0: invokevirtual com/finalshell/core/U9.S (I)V
      // 3e3: aload 4
      // 3e5: ifnull 40f
      // 3e8: aload 5
      // 3ea: invokevirtual com/finalshell/core/U9.z ()Ljava/lang/String;
      // 3ed: astore 7
      // 3ef: aload 5
      // 3f1: sipush 27205
      // 3f4: ldc2_w 8776221799930060923
      // 3f7: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 3fa: invokevirtual com/finalshell/core/U9.S (I)V
      // 3fd: aload 4
      // 3ff: ifnull 40f
      // 402: aload 2
      // 403: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 406: goto 40d
      // 409: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 40c: athrow
      // 40d: astore 7
      // 40f: aload 3
      // 410: aload 4
      // 412: ifnonnull 42a
      // 415: getfield com/finalshell/core/KE.o Z
      // 418: ifeq 42f
      // 41b: goto 422
      // 41e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 421: athrow
      // 422: aload 3
      // 423: goto 42a
      // 426: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 429: athrow
      // 42a: aload 7
      // 42c: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 42f: return
      // 430: aload 5
      // 432: aload 0
      // 433: getfield com/finalshell/core/W3_2.H J
      // 436: aload 0
      // 437: getfield com/finalshell/core/W3_2.v Z
      // 43a: invokevirtual com/finalshell/core/U9.w (JZ)I
      // 43d: istore 6
      // 43f: iload 6
      // 441: bipush -1
      // 442: if_icmpne 45d
      // 445: aload 4
      // 447: ifnonnull 5c3
      // 44a: goto 451
      // 44d: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 450: athrow
      // 451: aload 4
      // 453: ifnull 5f5
      // 456: goto 45d
      // 459: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 45c: athrow
      // 45d: iload 6
      // 45f: bipush 3
      // 460: aload 4
      // 462: ifnonnull 5c6
      // 465: goto 46c
      // 468: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 46b: athrow
      // 46c: if_icmpne 5c3
      // 46f: goto 476
      // 472: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 475: athrow
      // 476: aload 3
      // 477: getfield com/finalshell/core/KE.o Z
      // 47a: aload 4
      // 47c: ifnonnull 4a8
      // 47f: goto 486
      // 482: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 485: athrow
      // 486: ifeq 5f0
      // 489: goto 490
      // 48c: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 48f: athrow
      // 490: aload 5
      // 492: aload 4
      // 494: ifnonnull 51d
      // 497: goto 49e
      // 49a: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 49d: athrow
      // 49e: invokevirtual com/finalshell/core/U9.P ()I
      // 4a1: goto 4a8
      // 4a4: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 4a7: athrow
      // 4a8: tableswitch 106 2 4 28 54 80
      // 4c4: aload 5
      // 4c6: invokevirtual com/finalshell/core/U9.j ()Ljava/lang/Number;
      // 4c9: astore 7
      // 4cb: aload 5
      // 4cd: sipush 27205
      // 4d0: ldc2_w 8776221799930060923
      // 4d3: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 4d6: invokevirtual com/finalshell/core/U9.S (I)V
      // 4d9: aload 4
      // 4db: ifnull 51f
      // 4de: aload 5
      // 4e0: invokevirtual com/finalshell/core/U9.c$BigDecimal ()Ljava/math/BigDecimal;
      // 4e3: astore 7
      // 4e5: aload 5
      // 4e7: sipush 27205
      // 4ea: ldc2_w 8776221799930060923
      // 4ed: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 4f0: invokevirtual com/finalshell/core/U9.S (I)V
      // 4f3: aload 4
      // 4f5: ifnull 51f
      // 4f8: aload 5
      // 4fa: invokevirtual com/finalshell/core/U9.z ()Ljava/lang/String;
      // 4fd: astore 7
      // 4ff: aload 5
      // 501: sipush 27205
      // 504: ldc2_w 8776221799930060923
      // 507: invokestatic com/finalshell/core/W3_2.a (IJ)I
      // 50a: invokevirtual com/finalshell/core/U9.S (I)V
      // 50d: aload 4
      // 50f: ifnull 51f
      // 512: aload 2
      // 513: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 516: goto 51d
      // 519: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 51c: athrow
      // 51d: astore 7
      // 51f: aload 3
      // 520: getfield com/finalshell/core/KE.o Z
      // 523: aload 4
      // 525: ifnonnull 54c
      // 528: ifeq 5be
      // 52b: goto 532
      // 52e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 531: athrow
      // 532: aload 3
      // 533: aload 4
      // 535: ifnonnull 5b9
      // 538: goto 53f
      // 53b: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 53e: athrow
      // 53f: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 542: instanceof java/util/List
      // 545: goto 54c
      // 548: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 54b: athrow
      // 54c: ifeq 5b1
      // 54f: aload 3
      // 550: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 553: checkcast java/util/List
      // 556: astore 8
      // 558: aload 8
      // 55a: invokeinterface java/util/List.size ()I 1
      // 55f: aload 4
      // 561: ifnonnull 5ab
      // 564: ifne 59b
      // 567: goto 56e
      // 56a: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 56d: athrow
      // 56e: aload 7
      // 570: instanceof java/util/List
      // 573: aload 4
      // 575: ifnonnull 5ab
      // 578: goto 57f
      // 57b: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 57e: athrow
      // 57f: ifeq 59b
      // 582: goto 589
      // 585: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 588: athrow
      // 589: aload 3
      // 58a: aload 7
      // 58c: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 58f: aload 4
      // 591: ifnull 5ac
      // 594: goto 59b
      // 597: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 59a: athrow
      // 59b: aload 8
      // 59d: aload 7
      // 59f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a4: goto 5ab
      // 5a7: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5aa: athrow
      // 5ab: pop
      // 5ac: aload 4
      // 5ae: ifnull 5be
      // 5b1: aload 3
      // 5b2: goto 5b9
      // 5b5: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5b8: athrow
      // 5b9: aload 7
      // 5bb: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 5be: aload 4
      // 5c0: ifnull 5f0
      // 5c3: iload 6
      // 5c5: bipush 1
      // 5c6: aload 4
      // 5c8: ifnonnull 5df
      // 5cb: if_icmpeq 5e2
      // 5ce: goto 5d5
      // 5d1: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5d4: athrow
      // 5d5: iload 6
      // 5d7: bipush 2
      // 5d8: goto 5df
      // 5db: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5de: athrow
      // 5df: if_icmpne 5f0
      // 5e2: aload 0
      // 5e3: aload 1
      // 5e4: aload 2
      // 5e5: aload 3
      // 5e6: invokevirtual com/finalshell/core/W3_2.Z (Lcom/finalshell/core/Ph4;Lcom/finalshell/core/Yn4;Lcom/finalshell/core/KE;)V
      // 5e9: goto 5f0
      // 5ec: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5ef: athrow
      // 5f0: aload 4
      // 5f2: ifnull 430
      // 5f5: return
   }

   public void M(Ph4 param1, Object param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: getfield com/finalshell/core/W3_2.v Z
      // 09: aload 4
      // 0b: ifnonnull 47
      // 0e: ifeq 32
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: aload 0
      // 1b: getfield com/finalshell/core/W3_2.e Ljava/lang/String;
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/W3_2.H J
      // 22: aload 3
      // 23: invokevirtual com/finalshell/core/Ph4.R (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)V
      // 26: aload 4
      // 28: ifnull 48
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: aload 0
      // 35: getfield com/finalshell/core/W3_2.e Ljava/lang/String;
      // 38: aload 0
      // 39: getfield com/finalshell/core/W3_2.H J
      // 3c: aload 3
      // 3d: invokevirtual com/finalshell/core/Ph4.u (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)Z
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/W3_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 46: athrow
      // 47: pop
      // 48: return
   }

   public boolean m(Ph4 var1, Object var2) {
      return var1.N(var2, this.e, this.v);
   }

   static boolean Z(W3_2 var0) {
      return var0.v;
   }

   static String h(W3_2 var0) {
      return var0.e;
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2620;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "A&&)L]4\b 9#E\u001cb\b".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 45;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 45;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 5;
               break;
            case 1:
               var50 = 103;
               break;
            case 2:
               var50 = 103;
               break;
            case 3:
               var50 = 97;
               break;
            case 4:
               var50 = 6;
               break;
            case 5:
               var50 = 17;
               break;
            default:
               var50 = 117;
         }
      } else {
         var34 = 45;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 2545553499727064658L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "Ã\u000b\u0011ÆÕ\u00adú+Þ.Å¶Â;%§\u009c\r%\u0089M%\u000e9";
            int var13 = "Ã\u000b\u0011ÆÕ\u00adú+Þ.Å¶Â;%§\u009c\r%\u0089M%\u000e9".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "^ÂÊÿa\u0018Ý¢\u0098á²K_\u0087S ";
                        var13 = "^ÂÊÿa\u0018Ý¢\u0098á²K_\u0087S ".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 45;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 5;
               break;
            case 1:
               var50 = 103;
               break;
            case 2:
               var50 = 103;
               break;
            case 3:
               var50 = 97;
               break;
            case 4:
               var50 = 6;
               break;
            case 5:
               var50 = 17;
               break;
            default:
               var50 = 117;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 5;
                  break;
               case 1:
                  var50 = 103;
                  break;
               case 2:
                  var50 = 103;
                  break;
               case 3:
                  var50 = 97;
                  break;
               case 4:
                  var50 = 6;
                  break;
               case 5:
                  var50 = 17;
                  break;
               default:
                  var50 = 117;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 2545553499727064658L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "Ã\u000b\u0011ÆÕ\u00adú+Þ.Å¶Â;%§\u009c\r%\u0089M%\u000e9";
               int var5 = "Ã\u000b\u0011ÆÕ\u00adú+Þ.Å¶Â;%§\u009c\r%\u0089M%\u000e9".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "^ÂÊÿa\u0018Ý¢\u0098á²K_\u0087S ";
                           var5 = "^ÂÊÿa\u0018Ý¢\u0098á²K_\u0087S ".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 5;
                  break;
               case 1:
                  var50 = 103;
                  break;
               case 2:
                  var50 = 103;
                  break;
               case 3:
                  var50 = 97;
                  break;
               case 4:
                  var50 = 6;
                  break;
               case 5:
                  var50 = 17;
                  break;
               default:
                  var50 = 117;
            }
         }
      }
   }
}





