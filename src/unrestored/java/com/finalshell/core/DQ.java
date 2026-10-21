package com.finalshell.core;

public class DQ {
   public static byte[][] g;
   public String f;
   public String Y;
   public int h;
   public byte[] v;
   public String U;
   public static String[] a;
   public static String[] b;
   public static long[] e;
   public static Integer[] i;

   public DQ(String var1, byte[] var2) throws Pc2 {
      this(var1, 0, var2);
   }

   public DQ(String var1, int var2, byte[] var3) throws Pc2 {
      this(var1, var2, var3, null);
   }

   public DQ(String var1, int var2, byte[] var3, String var4) throws Pc2 {
      this("", var1, var2, var3, var4);
   }

   public DQ(String param1, String param2, int param3, byte[] param4, String param5) throws Pc2 {
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
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: aload 0
      // 008: aload 1
      // 009: putfield com/finalshell/core/DQ.f Ljava/lang/String;
      // 00c: istore 6
      // 00e: aload 0
      // 00f: iload 6
      // 011: ifne 2d8
      // 014: aload 2
      // 015: putfield com/finalshell/core/DQ.Y Ljava/lang/String;
      // 018: iload 3
      // 019: ifne 2d7
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 4
      // 025: sipush 1442
      // 028: ldc2_w 2008269334481741623
      // 02b: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 02e: baload
      // 02f: sipush 30550
      // 032: ldc2_w 6904243569250096587
      // 035: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 038: iload 6
      // 03a: ifne 07b
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: if_icmpne 05f
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: bipush 1
      // 050: putfield com/finalshell/core/DQ.h I
      // 053: iload 6
      // 055: ifeq 2dc
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 4
      // 061: sipush 10901
      // 064: ldc2_w 7804555461999134741
      // 067: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 06a: baload
      // 06b: sipush 1108
      // 06e: ldc2_w 5251181019159045836
      // 071: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: iload 6
      // 07d: ifne 0bf
      // 080: if_icmpne 0a3
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 0
      // 08b: sipush 23575
      // 08e: ldc2_w 3781714820315807363
      // 091: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 094: putfield com/finalshell/core/DQ.h I
      // 097: iload 6
      // 099: ifeq 2dc
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: aload 4
      // 0a5: sipush 10901
      // 0a8: ldc2_w 7804555461999134741
      // 0ab: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 0ae: baload
      // 0af: sipush 24644
      // 0b2: ldc2_w 2707396131081667269
      // 0b5: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 6
      // 0c1: ifne 12e
      // 0c4: if_icmpne 112
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 4
      // 0d0: sipush 9680
      // 0d3: ldc2_w 3918355996874671956
      // 0d6: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 0d9: baload
      // 0da: sipush 11928
      // 0dd: ldc2_w 461802674278829066
      // 0e0: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 0e3: iload 6
      // 0e5: ifne 12e
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: if_icmpne 112
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: sipush 9708
      // 0fd: ldc2_w 6325326380741461857
      // 100: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 103: putfield com/finalshell/core/DQ.h I
      // 106: iload 6
      // 108: ifeq 2dc
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 4
      // 114: sipush 10901
      // 117: ldc2_w 7804555461999134741
      // 11a: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 11d: baload
      // 11e: sipush 18507
      // 121: ldc2_w 2919593415484336846
      // 124: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: iload 6
      // 130: ifne 19d
      // 133: if_icmpne 181
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 4
      // 13f: sipush 5778
      // 142: ldc2_w 7506249650081051656
      // 145: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 148: baload
      // 149: sipush 8840
      // 14c: ldc2_w 2762093213379690506
      // 14f: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 152: iload 6
      // 154: ifne 19d
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: if_icmpne 181
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 0
      // 169: sipush 30256
      // 16c: ldc2_w 2925202608942732457
      // 16f: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 172: putfield com/finalshell/core/DQ.h I
      // 175: iload 6
      // 177: ifeq 2dc
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: aload 4
      // 183: sipush 10901
      // 186: ldc2_w 7804555461999134741
      // 189: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 18c: baload
      // 18d: sipush 24102
      // 190: ldc2_w 3839684704532561079
      // 193: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: iload 6
      // 19f: ifne 20c
      // 1a2: if_icmpne 1f0
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab: athrow
      // 1ac: aload 4
      // 1ae: sipush 26417
      // 1b1: ldc2_w 1919007467341661614
      // 1b4: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 1b7: baload
      // 1b8: sipush 3511
      // 1bb: ldc2_w 7340168163495259945
      // 1be: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 1c1: iload 6
      // 1c3: ifne 20c
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: if_icmpne 1f0
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: aload 0
      // 1d8: sipush 5154
      // 1db: ldc2_w 8099864774327547582
      // 1de: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 1e1: putfield com/finalshell/core/DQ.h I
      // 1e4: iload 6
      // 1e6: ifeq 2dc
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 4
      // 1f2: sipush 10901
      // 1f5: ldc2_w 7804555461999134741
      // 1f8: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 1fb: baload
      // 1fc: sipush 3661
      // 1ff: ldc2_w 5635713706786991306
      // 202: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: iload 6
      // 20e: ifne 27b
      // 211: if_icmpne 25f
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: aload 4
      // 21d: sipush 30300
      // 220: ldc2_w 8678656782350963911
      // 223: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 226: baload
      // 227: sipush 24206
      // 22a: ldc2_w 8984947641618693133
      // 22d: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 230: iload 6
      // 232: ifne 27b
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: if_icmpne 25f
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: aload 0
      // 247: sipush 29906
      // 24a: ldc2_w 227132057531930206
      // 24d: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 250: putfield com/finalshell/core/DQ.h I
      // 253: iload 6
      // 255: ifeq 2dc
      // 258: goto 25f
      // 25b: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: aload 4
      // 261: sipush 10901
      // 264: ldc2_w 7804555461999134741
      // 267: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 26a: baload
      // 26b: sipush 3661
      // 26e: ldc2_w 5635713706786991306
      // 271: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: iload 6
      // 27d: ifne 2a6
      // 280: if_icmpne 2c2
      // 283: goto 28a
      // 286: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 289: athrow
      // 28a: aload 4
      // 28c: sipush 30300
      // 28f: ldc2_w 8678656782350963911
      // 292: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 295: baload
      // 296: sipush 2805
      // 299: ldc2_w 3117040135571810402
      // 29c: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: if_icmpne 2c2
      // 2a9: aload 0
      // 2aa: sipush 32030
      // 2ad: ldc2_w 563467607327170456
      // 2b0: invokestatic com/finalshell/core/DQ.a (IJ)I
      // 2b3: putfield com/finalshell/core/DQ.h I
      // 2b6: iload 6
      // 2b8: ifeq 2dc
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: new com/finalshell/core/Pc2
      // 2c5: dup
      // 2c6: sipush -26701
      // 2c9: sipush -12494
      // 2cc: invokestatic com/finalshell/core/DQ.a (II)Ljava/lang/String;
      // 2cf: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 2d2: athrow
      // 2d3: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: aload 0
      // 2d8: iload 3
      // 2d9: putfield com/finalshell/core/DQ.h I
      // 2dc: aload 0
      // 2dd: aload 4
      // 2df: putfield com/finalshell/core/DQ.v [B
      // 2e2: aload 0
      // 2e3: aload 5
      // 2e5: putfield com/finalshell/core/DQ.U Ljava/lang/String;
      // 2e8: return
   }

   public String c() {
      return this.Y;
   }

   public String J() {
      boolean var1 = Dm4.J$boolean();
      int var10000 = this.h;
      int var10001 = 1;
      if (!var1) {
         if (this.h == 1) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = 2;
      }

      if (!var1) {
         if (var10000 == var10001) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = a(9708, 6325326380741461857L);
      }

      if (!var1) {
         if (var10000 == var10001) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = a(30256, 2925202608942732457L);
      }

      if (!var1) {
         if (var10000 == var10001) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = 3;
      }

      if (!var1) {
         if (var10000 == var10001) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = 4;
      }

      if (!var1) {
         if (var10000 == var10001) {
            return E8.B(g[this.h - 1]);
         }

         var10000 = this.h;
         var10001 = 5;
      }

      return var10000 != var10001 ? a(-26698, 26046) : E8.B(g[this.h - 1]);
   }

   public static int v(String var0) {
      byte var10000 = (byte)((Dm4.F$boolean()) ? 1 : 0);
      int var2 = 0;
      boolean var1 = ((boolean)var10000) != 0;

      while (true) {
         if (var2 < g.length) {
            var10000 = (byte)((E8.B(g[var2]).equals(var0)) ? 1 : 0);
            if (!var1) {
               break;
            }

            if (!var1) {
               return var10000;
            }

            if (var10000 != 0) {
               return var2 + 1;
            }

            var2++;
            if (var1) {
               continue;
            }
         }

         var10000 = -1;
         break;
      }

      return var10000;
   }

   public String C() {
      return E8.B(E8.V(this.v, 0, this.v.length, true));
   }

   public String A(Xe2 param1) {
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
      // 04: astore 3
      // 05: istore 2
      // 06: sipush -26704
      // 09: sipush -16425
      // 0c: invokestatic com/finalshell/core/DQ.a (II)Ljava/lang/String;
      // 0f: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 12: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 15: astore 4
      // 17: aload 4
      // 19: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 1c: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 1f: ldc com/finalshell/core/Y_2
      // 21: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 24: astore 5
      // 26: aload 5
      // 28: bipush 0
      // 29: anewarray 155
      // 2c: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 2f: bipush 0
      // 30: anewarray 4
      // 33: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 36: checkcast com/finalshell/core/Y_2
      // 39: astore 3
      // 3a: goto 88
      // 3d: astore 4
      // 3f: aload 1
      // 40: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 43: bipush 3
      // 44: iload 2
      // 45: ifeq 63
      // 48: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 4d: ifeq 88
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 1
      // 58: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 5b: bipush 3
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/DQ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: new java/lang/StringBuilder
      // 66: dup
      // 67: invokespecial java/lang/StringBuilder.<init> ()V
      // 6a: sipush -26702
      // 6d: sipush -9584
      // 70: invokestatic com/finalshell/core/DQ.a (II)Ljava/lang/String;
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: aload 4
      // 78: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: aload 4
      // 83: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 88: aload 3
      // 89: aload 0
      // 8a: getfield com/finalshell/core/DQ.v [B
      // 8d: bipush 0
      // 8e: bipush 1
      // 8f: invokestatic com/finalshell/core/E8.s (Lcom/finalshell/core/Y_2;[BZZ)Ljava/lang/String;
      // 92: areturn
   }

   public String y() {
      return this.U;
   }

   public String T() {
      return this.f;
   }

   public boolean p(String var1) {
      return this.l(var1);
   }

   public boolean l(String var1) {
      int var3 = 0;
      String var4 = this.Y;
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      int var5 = var4.length();
      int var6 = var1.length();
      boolean var2 = (var10000) != 0;

      while (true) {
         if (var3 < var5) {
            int var7 = var4.indexOf(a(20730, 1343142608657707625L), var3);
            var10000 = var7;
            if (var2) {
               break;
            }

            int var10001 = -1;
            if (!var2) {
               if (var7 == -1) {
                  var10000 = var6;
                  if (!var2) {
                     if (var6 != var5 - var3) {
                        return false;
                     }

                     var10000 = (var4.regionMatches(true, var3, var1, 0, var6)) ? 1 : 0;
                  }

                  return var10000 != 0;
               }

               var10000 = var6;
               var10001 = var7 - var3;
            }

            label43: {
               if (!var2) {
                  if (var10000 == var10001) {
                     var10000 = (var4.regionMatches(true, var3, var1, 0, var6)) ? 1 : 0;
                     if (var2) {
                        break label43;
                     }

                     if (var10000 != 0) {
                        return true;
                     }
                  }

                  var10000 = var7;
                  var10001 = 1;
               }

               var10000 += var10001;
            }

            var3 = var10000;
            if (!var2) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      return var10000 != 0;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26699) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 175;
               break;
            case 1:
               var10000 = 57;
               break;
            case 2:
               var10000 = 200;
               break;
            case 3:
               var10000 = 199;
               break;
            case 4:
               var10000 = 87;
               break;
            case 5:
               var10000 = 69;
               break;
            case 6:
               var10000 = 95;
               break;
            case 7:
               var10000 = 31;
               break;
            case 8:
               var10000 = 58;
               break;
            case 9:
               var10000 = 243;
               break;
            case 10:
               var10000 = 153;
               break;
            case 11:
               var10000 = 212;
               break;
            case 12:
               var10000 = 105;
               break;
            case 13:
               var10000 = 147;
               break;
            case 14:
               var10000 = 142;
               break;
            case 15:
               var10000 = 195;
               break;
            case 16:
               var10000 = 168;
               break;
            case 17:
               var10000 = 47;
               break;
            case 18:
               var10000 = 64;
               break;
            case 19:
               var10000 = 96;
               break;
            case 20:
               var10000 = 70;
               break;
            case 21:
               var10000 = 100;
               break;
            case 22:
               var10000 = 191;
               break;
            case 23:
               var10000 = 71;
               break;
            case 24:
               var10000 = 248;
               break;
            case 25:
               var10000 = 172;
               break;
            case 26:
               var10000 = 253;
               break;
            case 27:
               var10000 = 203;
               break;
            case 28:
               var10000 = 7;
               break;
            case 29:
               var10000 = 68;
               break;
            case 30:
               var10000 = 41;
               break;
            case 31:
               var10000 = 165;
               break;
            case 32:
               var10000 = 233;
               break;
            case 33:
               var10000 = 202;
               break;
            case 34:
               var10000 = 178;
               break;
            case 35:
               var10000 = 148;
               break;
            case 36:
               var10000 = 143;
               break;
            case 37:
               var10000 = 17;
               break;
            case 38:
               var10000 = 18;
               break;
            case 39:
               var10000 = 249;
               break;
            case 40:
               var10000 = 54;
               break;
            case 41:
               var10000 = 33;
               break;
            case 42:
               var10000 = 151;
               break;
            case 43:
               var10000 = 239;
               break;
            case 44:
               var10000 = 62;
               break;
            case 45:
               var10000 = 38;
               break;
            case 46:
               var10000 = 119;
               break;
            case 47:
               var10000 = 135;
               break;
            case 48:
               var10000 = 4;
               break;
            case 49:
               var10000 = 48;
               break;
            case 50:
               var10000 = 60;
               break;
            case 51:
               var10000 = 29;
               break;
            case 52:
               var10000 = 224;
               break;
            case 53:
               var10000 = 108;
               break;
            case 54:
               var10000 = 219;
               break;
            case 55:
               var10000 = 230;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 93;
               break;
            case 58:
               var10000 = 228;
               break;
            case 59:
               var10000 = 0;
               break;
            case 60:
               var10000 = 12;
               break;
            case 61:
               var10000 = 123;
               break;
            case 62:
               var10000 = 50;
               break;
            case 63:
               var10000 = 182;
               break;
            case 64:
               var10000 = 9;
               break;
            case 65:
               var10000 = 25;
               break;
            case 66:
               var10000 = 241;
               break;
            case 67:
               var10000 = 94;
               break;
            case 68:
               var10000 = 122;
               break;
            case 69:
               var10000 = 42;
               break;
            case 70:
               var10000 = 121;
               break;
            case 71:
               var10000 = 159;
               break;
            case 72:
               var10000 = 86;
               break;
            case 73:
               var10000 = 220;
               break;
            case 74:
               var10000 = 180;
               break;
            case 75:
               var10000 = 215;
               break;
            case 76:
               var10000 = 242;
               break;
            case 77:
               var10000 = 113;
               break;
            case 78:
               var10000 = 221;
               break;
            case 79:
               var10000 = 197;
               break;
            case 80:
               var10000 = 226;
               break;
            case 81:
               var10000 = 16;
               break;
            case 82:
               var10000 = 80;
               break;
            case 83:
               var10000 = 170;
               break;
            case 84:
               var10000 = 205;
               break;
            case 85:
               var10000 = 90;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 157;
               break;
            case 88:
               var10000 = 73;
               break;
            case 89:
               var10000 = 51;
               break;
            case 90:
               var10000 = 134;
               break;
            case 91:
               var10000 = 223;
               break;
            case 92:
               var10000 = 115;
               break;
            case 93:
               var10000 = 40;
               break;
            case 94:
               var10000 = 238;
               break;
            case 95:
               var10000 = 130;
               break;
            case 96:
               var10000 = 10;
               break;
            case 97:
               var10000 = 101;
               break;
            case 98:
               var10000 = 236;
               break;
            case 99:
               var10000 = 192;
               break;
            case 100:
               var10000 = 176;
               break;
            case 101:
               var10000 = 131;
               break;
            case 102:
               var10000 = 75;
               break;
            case 103:
               var10000 = 15;
               break;
            case 104:
               var10000 = 49;
               break;
            case 105:
               var10000 = 156;
               break;
            case 106:
               var10000 = 174;
               break;
            case 107:
               var10000 = 132;
               break;
            case 108:
               var10000 = 214;
               break;
            case 109:
               var10000 = 88;
               break;
            case 110:
               var10000 = 217;
               break;
            case 111:
               var10000 = 89;
               break;
            case 112:
               var10000 = 186;
               break;
            case 113:
               var10000 = 209;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 252;
               break;
            case 116:
               var10000 = 22;
               break;
            case 117:
               var10000 = 35;
               break;
            case 118:
               var10000 = 138;
               break;
            case 119:
               var10000 = 189;
               break;
            case 120:
               var10000 = 102;
               break;
            case 121:
               var10000 = 139;
               break;
            case 122:
               var10000 = 36;
               break;
            case 123:
               var10000 = 20;
               break;
            case 124:
               var10000 = 235;
               break;
            case 125:
               var10000 = 32;
               break;
            case 126:
               var10000 = 216;
               break;
            case 127:
               var10000 = 13;
               break;
            case 128:
               var10000 = 169;
               break;
            case 129:
               var10000 = 34;
               break;
            case 130:
               var10000 = 117;
               break;
            case 131:
               var10000 = 152;
               break;
            case 132:
               var10000 = 164;
               break;
            case 133:
               var10000 = 126;
               break;
            case 134:
               var10000 = 116;
               break;
            case 135:
               var10000 = 166;
               break;
            case 136:
               var10000 = 206;
               break;
            case 137:
               var10000 = 145;
               break;
            case 138:
               var10000 = 136;
               break;
            case 139:
               var10000 = 28;
               break;
            case 140:
               var10000 = 210;
               break;
            case 141:
               var10000 = 184;
               break;
            case 142:
               var10000 = 232;
               break;
            case 143:
               var10000 = 213;
               break;
            case 144:
               var10000 = 83;
               break;
            case 145:
               var10000 = 120;
               break;
            case 146:
               var10000 = 3;
               break;
            case 147:
               var10000 = 109;
               break;
            case 148:
               var10000 = 198;
               break;
            case 149:
               var10000 = 125;
               break;
            case 150:
               var10000 = 98;
               break;
            case 151:
               var10000 = 193;
               break;
            case 152:
               var10000 = 183;
               break;
            case 153:
               var10000 = 72;
               break;
            case 154:
               var10000 = 53;
               break;
            case 155:
               var10000 = 160;
               break;
            case 156:
               var10000 = 144;
               break;
            case 157:
               var10000 = 196;
               break;
            case 158:
               var10000 = 37;
               break;
            case 159:
               var10000 = 188;
               break;
            case 160:
               var10000 = 26;
               break;
            case 161:
               var10000 = 133;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 154;
               break;
            case 164:
               var10000 = 111;
               break;
            case 165:
               var10000 = 104;
               break;
            case 166:
               var10000 = 201;
               break;
            case 167:
               var10000 = 2;
               break;
            case 168:
               var10000 = 103;
               break;
            case 169:
               var10000 = 211;
               break;
            case 170:
               var10000 = 227;
               break;
            case 171:
               var10000 = 74;
               break;
            case 172:
               var10000 = 14;
               break;
            case 173:
               var10000 = 158;
               break;
            case 174:
               var10000 = 99;
               break;
            case 175:
               var10000 = 112;
               break;
            case 176:
               var10000 = 124;
               break;
            case 177:
               var10000 = 11;
               break;
            case 178:
               var10000 = 79;
               break;
            case 179:
               var10000 = 19;
               break;
            case 180:
               var10000 = 85;
               break;
            case 181:
               var10000 = 141;
               break;
            case 182:
               var10000 = 218;
               break;
            case 183:
               var10000 = 81;
               break;
            case 184:
               var10000 = 208;
               break;
            case 185:
               var10000 = 1;
               break;
            case 186:
               var10000 = 244;
               break;
            case 187:
               var10000 = 231;
               break;
            case 188:
               var10000 = 106;
               break;
            case 189:
               var10000 = 5;
               break;
            case 190:
               var10000 = 250;
               break;
            case 191:
               var10000 = 128;
               break;
            case 192:
               var10000 = 171;
               break;
            case 193:
               var10000 = 118;
               break;
            case 194:
               var10000 = 67;
               break;
            case 195:
               var10000 = 207;
               break;
            case 196:
               var10000 = 229;
               break;
            case 197:
               var10000 = 150;
               break;
            case 198:
               var10000 = 181;
               break;
            case 199:
               var10000 = 44;
               break;
            case 200:
               var10000 = 225;
               break;
            case 201:
               var10000 = 246;
               break;
            case 202:
               var10000 = 177;
               break;
            case 203:
               var10000 = 187;
               break;
            case 204:
               var10000 = 146;
               break;
            case 205:
               var10000 = 76;
               break;
            case 206:
               var10000 = 185;
               break;
            case 207:
               var10000 = 162;
               break;
            case 208:
               var10000 = 161;
               break;
            case 209:
               var10000 = 110;
               break;
            case 210:
               var10000 = 222;
               break;
            case 211:
               var10000 = 255;
               break;
            case 212:
               var10000 = 234;
               break;
            case 213:
               var10000 = 84;
               break;
            case 214:
               var10000 = 237;
               break;
            case 215:
               var10000 = 77;
               break;
            case 216:
               var10000 = 43;
               break;
            case 217:
               var10000 = 23;
               break;
            case 218:
               var10000 = 65;
               break;
            case 219:
               var10000 = 127;
               break;
            case 220:
               var10000 = 63;
               break;
            case 221:
               var10000 = 173;
               break;
            case 222:
               var10000 = 59;
               break;
            case 223:
               var10000 = 107;
               break;
            case 224:
               var10000 = 245;
               break;
            case 225:
               var10000 = 140;
               break;
            case 226:
               var10000 = 163;
               break;
            case 227:
               var10000 = 8;
               break;
            case 228:
               var10000 = 167;
               break;
            case 229:
               var10000 = 61;
               break;
            case 230:
               var10000 = 55;
               break;
            case 231:
               var10000 = 204;
               break;
            case 232:
               var10000 = 137;
               break;
            case 233:
               var10000 = 78;
               break;
            case 234:
               var10000 = 6;
               break;
            case 235:
               var10000 = 97;
               break;
            case 236:
               var10000 = 46;
               break;
            case 237:
               var10000 = 56;
               break;
            case 238:
               var10000 = 91;
               break;
            case 239:
               var10000 = 21;
               break;
            case 240:
               var10000 = 149;
               break;
            case 241:
               var10000 = 24;
               break;
            case 242:
               var10000 = 82;
               break;
            case 243:
               var10000 = 155;
               break;
            case 244:
               var10000 = 254;
               break;
            case 245:
               var10000 = 240;
               break;
            case 246:
               var10000 = 45;
               break;
            case 247:
               var10000 = 251;
               break;
            case 248:
               var10000 = 39;
               break;
            case 249:
               var10000 = 247;
               break;
            case 250:
               var10000 = 27;
               break;
            case 251:
               var10000 = 129;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 30;
               break;
            default:
               var10000 = 194;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8852;
      if (i[var3] == null) {
         i[var3] = (int)(e[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var34;
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "û\u0005\u009cÐb\u0080\u0098Ö\u0082Ã<\u001aÌy\u008f¯w²Ô\t3n]ñÓxmõÊ\u0007\rf\u009að<O0\u0007¤7n#Ø\u001e\u0019\u0007\u0003U[\u0096\u0012\u00833\u000f®Z{dÑßi\u0093×nÆ^é\u0013>\u0010×T\u0086D|\u0006à\u0082r_=z/øIÁ\u0010«ÜÄ\u0018sI§Éàî^\u00963\bÙ6\u000bT\u0005±\u009cNÕØA·ÄP";
      int var12 = "û\u0005\u009cÐb\u0080\u0098Ö\u0082Ã<\u001aÌy\u008f¯w²Ô\t3n]ñÓxmõÊ\u0007\rf\u009að<O0\u0007¤7n#Ø\u001e\u0019\u0007\u0003U[\u0096\u0012\u00833\u000f®Z{dÑßi\u0093×nÆ^é\u0013>\u0010×T\u0086D|\u0006à\u0082r_=z/øIÁ\u0010«ÜÄ\u0018sI§Éàî^\u00963\bÙ6\u000bT\u0005±\u009cNÕØA·ÄP"
         .length();
      char var9 = 19;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 82;
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
                        var66 = 49;
                        break;
                     case 1:
                        var66 = 18;
                        break;
                     case 2:
                        var66 = 112;
                        break;
                     case 3:
                        var66 = 86;
                        break;
                     case 4:
                        var66 = 110;
                        break;
                     case 5:
                        var66 = 120;
                        break;
                     default:
                        var66 = 63;
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
                     a = var13;
                     b = new String[11];
                     long var0 = 1515512188181007762L;
                     long[] var6 = new long[26];
                     int var3 = 0;
                     String var4 = "¥Üúö\u0087\u008d3\u0013ô±\u0088¤úUê\u00ad%Òé\u008c\u0097Ñ\u0089\u0094]\u0005):2)eÅ\u009a\u007f\n»^)\u009c:Û\u008e'G\u0012d1DòHh\u009dÙúÁª\u008fb\u0092Ò*ö?×.I\u0014.×3û/\u0014X%\u0088\u0016 \u0098=È\u0093\t{5\u0089â\u0089´O|\u0019ñu\b(\u00ad\u000fÁ×\u009frk,.¢*Ú\u007f^\u0019<xX\u00ad²I6ù\u0090ytÆo\u0092Ý\u0099AêNî^ìqJÌh\u009aùo\u001fÎ§9\u0095R¦=\u008ca\u0012\u000fÂüÊcñ\u009ba9\u0015©Ü/\u009b\u0006Å\u008f\u000f\u007fÒ\u0087î.\u000f2º÷©ê\u0089NM¬\u0095É×Ä¥g±¬";
                     int var5 = "¥Üúö\u0087\u008d3\u0013ô±\u0088¤úUê\u00ad%Òé\u008c\u0097Ñ\u0089\u0094]\u0005):2)eÅ\u009a\u007f\n»^)\u009c:Û\u008e'G\u0012d1DòHh\u009dÙúÁª\u008fb\u0092Ò*ö?×.I\u0014.×3û/\u0014X%\u0088\u0016 \u0098=È\u0093\t{5\u0089â\u0089´O|\u0019ñu\b(\u00ad\u000fÁ×\u009frk,.¢*Ú\u007f^\u0019<xX\u00ad²I6ù\u0090ytÆo\u0092Ý\u0099AêNî^ìqJÌh\u009aùo\u001fÎ§9\u0095R¦=\u008ca\u0012\u000fÂüÊcñ\u009ba9\u0015©Ü/\u009b\u0006Å\u008f\u000f\u007fÒ\u0087î.\u000f2º÷©ê\u0089NM¬\u0095É×Ä¥g±¬"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
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
                                    e = var6;
                                    i = new Integer[26];
                                    byte[][] var20 = new byte[a(26263, 2655291601502094337L)][];
                                    var20[0] = E8.J(a(-26703, 28701));
                                    var20[1] = E8.J(a(-26697, 12022));
                                    var20[2] = E8.J(a(-26699, -8780));
                                    var20[3] = E8.J(a(-26689, -10940));
                                    var20[4] = E8.J(a(-26692, 16430));
                                    var20[5] = E8.J(a(-26691, 7210));
                                    var20[a(29502, 2254596169774944686L)] = E8.J(a(-26700, 16133));
                                    g = var20;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¡hnô\u001b\u0006\u009bÈüZe\u008f±ÍJõ";
                                 var5 = "¡hnô\u001b\u0006\u009bÈüZe\u008f±ÍJõ".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
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

                  var10 = "0#,Ý½èª\u0012\r\u0092\u0004ù\u0002Ì\u009fÐ»\u0093d\u0013W\u0083ÀÉ j\u0019B{\u0098Ê¸Ûä¤ÕÚ9\u008b";
                  var12 = "0#,Ý½èª\u0012\r\u0092\u0004ù\u0002Ì\u009fÐ»\u0093d\u0013W\u0083ÀÉ j\u0019B{\u0098Ê¸Ûä¤ÕÚ9\u008b".length();
                  var9 = 19;
                  var17 = -1;
            }

            var10000 = 55;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





