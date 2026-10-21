package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;

public class WB implements Ak2 {
   public static WB Y;
   public static long[] a;
   public static Integer[] b;

   @Override
   public final void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 2
      // 00c: aload 6
      // 00e: ifnull 029
      // 011: ifnonnull 028
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01a: athrow
      // 01b: aload 7
      // 01d: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 020: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 023: return
      // 024: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 027: athrow
      // 028: aload 2
      // 029: instanceof [I
      // 02c: aload 6
      // 02e: ifnull 0a5
      // 031: ifeq 0a1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03a: athrow
      // 03b: aload 2
      // 03c: checkcast [I
      // 03f: astore 8
      // 041: aload 7
      // 043: sipush 18913
      // 046: ldc2_w 7846542905544252198
      // 049: invokestatic com/finalshell/core/WB.a (IJ)I
      // 04c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04f: bipush 0
      // 050: istore 9
      // 052: iload 9
      // 054: aload 8
      // 056: arraylength
      // 057: if_icmpge 092
      // 05a: aload 6
      // 05c: ifnull 0a0
      // 05f: iload 9
      // 061: ifeq 080
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 06a: athrow
      // 06b: aload 7
      // 06d: sipush 9376
      // 070: ldc2_w 6835608769074493030
      // 073: invokestatic com/finalshell/core/WB.a (IJ)I
      // 076: invokevirtual com/finalshell/io/YM3.write (I)V
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 07f: athrow
      // 080: aload 7
      // 082: aload 8
      // 084: iload 9
      // 086: iaload
      // 087: invokevirtual com/finalshell/io/YM3.v (I)V
      // 08a: iinc 9 1
      // 08d: aload 6
      // 08f: ifnonnull 052
      // 092: aload 7
      // 094: sipush 3354
      // 097: ldc2_w 7745441219909279710
      // 09a: invokestatic com/finalshell/core/WB.a (IJ)I
      // 09d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0a0: return
      // 0a1: aload 2
      // 0a2: instanceof [S
      // 0a5: aload 6
      // 0a7: ifnull 11e
      // 0aa: ifeq 11a
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: checkcast [S
      // 0b8: astore 8
      // 0ba: aload 7
      // 0bc: sipush 30554
      // 0bf: ldc2_w 8385075334033024409
      // 0c2: invokestatic com/finalshell/core/WB.a (IJ)I
      // 0c5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0c8: bipush 0
      // 0c9: istore 9
      // 0cb: iload 9
      // 0cd: aload 8
      // 0cf: arraylength
      // 0d0: if_icmpge 10b
      // 0d3: aload 6
      // 0d5: ifnull 119
      // 0d8: iload 9
      // 0da: ifeq 0f9
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e3: athrow
      // 0e4: aload 7
      // 0e6: sipush 15665
      // 0e9: ldc2_w 4376801414612086772
      // 0ec: invokestatic com/finalshell/core/WB.a (IJ)I
      // 0ef: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f8: athrow
      // 0f9: aload 7
      // 0fb: aload 8
      // 0fd: iload 9
      // 0ff: saload
      // 100: invokevirtual com/finalshell/io/YM3.v (I)V
      // 103: iinc 9 1
      // 106: aload 6
      // 108: ifnonnull 0cb
      // 10b: aload 7
      // 10d: sipush 17893
      // 110: ldc2_w 773889578374698791
      // 113: invokestatic com/finalshell/core/WB.a (IJ)I
      // 116: invokevirtual com/finalshell/io/YM3.write (I)V
      // 119: return
      // 11a: aload 2
      // 11b: instanceof [J
      // 11e: aload 6
      // 120: ifnull 197
      // 123: ifeq 193
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12c: athrow
      // 12d: aload 2
      // 12e: checkcast [J
      // 131: astore 8
      // 133: aload 7
      // 135: sipush 30554
      // 138: ldc2_w 8385075334033024409
      // 13b: invokestatic com/finalshell/core/WB.a (IJ)I
      // 13e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 141: bipush 0
      // 142: istore 9
      // 144: iload 9
      // 146: aload 8
      // 148: arraylength
      // 149: if_icmpge 184
      // 14c: aload 6
      // 14e: ifnull 192
      // 151: iload 9
      // 153: ifeq 172
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15c: athrow
      // 15d: aload 7
      // 15f: sipush 15665
      // 162: ldc2_w 4376801414612086772
      // 165: invokestatic com/finalshell/core/WB.a (IJ)I
      // 168: invokevirtual com/finalshell/io/YM3.write (I)V
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 171: athrow
      // 172: aload 7
      // 174: aload 8
      // 176: iload 9
      // 178: laload
      // 179: invokevirtual com/finalshell/io/YM3.i (J)V
      // 17c: iinc 9 1
      // 17f: aload 6
      // 181: ifnonnull 144
      // 184: aload 7
      // 186: sipush 17893
      // 189: ldc2_w 773889578374698791
      // 18c: invokestatic com/finalshell/core/WB.a (IJ)I
      // 18f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 192: return
      // 193: aload 2
      // 194: instanceof [Z
      // 197: aload 6
      // 199: ifnull 210
      // 19c: ifeq 20c
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a5: athrow
      // 1a6: aload 2
      // 1a7: checkcast [Z
      // 1aa: astore 8
      // 1ac: aload 7
      // 1ae: sipush 30554
      // 1b1: ldc2_w 8385075334033024409
      // 1b4: invokestatic com/finalshell/core/WB.a (IJ)I
      // 1b7: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1ba: bipush 0
      // 1bb: istore 9
      // 1bd: iload 9
      // 1bf: aload 8
      // 1c1: arraylength
      // 1c2: if_icmpge 1fd
      // 1c5: aload 6
      // 1c7: ifnull 20b
      // 1ca: iload 9
      // 1cc: ifeq 1eb
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d5: athrow
      // 1d6: aload 7
      // 1d8: sipush 15665
      // 1db: ldc2_w 4376801414612086772
      // 1de: invokestatic com/finalshell/core/WB.a (IJ)I
      // 1e1: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ea: athrow
      // 1eb: aload 7
      // 1ed: aload 8
      // 1ef: iload 9
      // 1f1: baload
      // 1f2: invokevirtual com/finalshell/io/YM3.u (Z)V
      // 1f5: iinc 9 1
      // 1f8: aload 6
      // 1fa: ifnonnull 1bd
      // 1fd: aload 7
      // 1ff: sipush 17893
      // 202: ldc2_w 773889578374698791
      // 205: invokestatic com/finalshell/core/WB.a (IJ)I
      // 208: invokevirtual com/finalshell/io/YM3.write (I)V
      // 20b: return
      // 20c: aload 2
      // 20d: instanceof [F
      // 210: aload 6
      // 212: ifnull 2bd
      // 215: ifeq 2b9
      // 218: goto 21f
      // 21b: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21e: athrow
      // 21f: aload 2
      // 220: checkcast [F
      // 223: astore 8
      // 225: aload 7
      // 227: sipush 30554
      // 22a: ldc2_w 8385075334033024409
      // 22d: invokestatic com/finalshell/core/WB.a (IJ)I
      // 230: invokevirtual com/finalshell/io/YM3.write (I)V
      // 233: bipush 0
      // 234: istore 9
      // 236: iload 9
      // 238: aload 8
      // 23a: arraylength
      // 23b: if_icmpge 2aa
      // 23e: aload 6
      // 240: ifnull 2b8
      // 243: iload 9
      // 245: ifeq 264
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24e: athrow
      // 24f: aload 7
      // 251: sipush 15665
      // 254: ldc2_w 4376801414612086772
      // 257: invokestatic com/finalshell/core/WB.a (IJ)I
      // 25a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 25d: goto 264
      // 260: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 263: athrow
      // 264: aload 8
      // 266: iload 9
      // 268: faload
      // 269: fstore 10
      // 26b: aload 6
      // 26d: ifnull 28b
      // 270: fload 10
      // 272: invokestatic java/lang/Float.isNaN (F)Z
      // 275: ifeq 290
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27e: athrow
      // 27f: aload 7
      // 281: invokevirtual com/finalshell/io/YM3.Y ()V
      // 284: goto 28b
      // 287: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 28a: athrow
      // 28b: aload 6
      // 28d: ifnonnull 2a2
      // 290: aload 7
      // 292: fload 10
      // 294: invokestatic java/lang/Float.toString (F)Ljava/lang/String;
      // 297: invokevirtual com/finalshell/io/YM3.q (Ljava/lang/CharSequence;)Lcom/finalshell/io/YM3;
      // 29a: pop
      // 29b: goto 2a2
      // 29e: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2a1: athrow
      // 2a2: iinc 9 1
      // 2a5: aload 6
      // 2a7: ifnonnull 236
      // 2aa: aload 7
      // 2ac: sipush 17893
      // 2af: ldc2_w 773889578374698791
      // 2b2: invokestatic com/finalshell/core/WB.a (IJ)I
      // 2b5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 2b8: return
      // 2b9: aload 2
      // 2ba: instanceof [D
      // 2bd: aload 6
      // 2bf: ifnull 376
      // 2c2: ifeq 366
      // 2c5: goto 2cc
      // 2c8: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2cb: athrow
      // 2cc: aload 2
      // 2cd: checkcast [D
      // 2d0: astore 8
      // 2d2: aload 7
      // 2d4: sipush 30554
      // 2d7: ldc2_w 8385075334033024409
      // 2da: invokestatic com/finalshell/core/WB.a (IJ)I
      // 2dd: invokevirtual com/finalshell/io/YM3.write (I)V
      // 2e0: bipush 0
      // 2e1: istore 9
      // 2e3: iload 9
      // 2e5: aload 8
      // 2e7: arraylength
      // 2e8: if_icmpge 357
      // 2eb: aload 6
      // 2ed: ifnull 365
      // 2f0: iload 9
      // 2f2: ifeq 311
      // 2f5: goto 2fc
      // 2f8: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2fb: athrow
      // 2fc: aload 7
      // 2fe: sipush 15665
      // 301: ldc2_w 4376801414612086772
      // 304: invokestatic com/finalshell/core/WB.a (IJ)I
      // 307: invokevirtual com/finalshell/io/YM3.write (I)V
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 310: athrow
      // 311: aload 8
      // 313: iload 9
      // 315: daload
      // 316: dstore 10
      // 318: aload 6
      // 31a: ifnull 338
      // 31d: dload 10
      // 31f: invokestatic java/lang/Double.isNaN (D)Z
      // 322: ifeq 33d
      // 325: goto 32c
      // 328: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 32b: athrow
      // 32c: aload 7
      // 32e: invokevirtual com/finalshell/io/YM3.Y ()V
      // 331: goto 338
      // 334: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 337: athrow
      // 338: aload 6
      // 33a: ifnonnull 34f
      // 33d: aload 7
      // 33f: dload 10
      // 341: invokestatic java/lang/Double.toString (D)Ljava/lang/String;
      // 344: invokevirtual com/finalshell/io/YM3.q (Ljava/lang/CharSequence;)Lcom/finalshell/io/YM3;
      // 347: pop
      // 348: goto 34f
      // 34b: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 34e: athrow
      // 34f: iinc 9 1
      // 352: aload 6
      // 354: ifnonnull 2e3
      // 357: aload 7
      // 359: sipush 17893
      // 35c: ldc2_w 773889578374698791
      // 35f: invokestatic com/finalshell/core/WB.a (IJ)I
      // 362: invokevirtual com/finalshell/io/YM3.write (I)V
      // 365: return
      // 366: aload 2
      // 367: aload 6
      // 369: ifnull 388
      // 36c: instanceof [B
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/WB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 375: athrow
      // 376: ifeq 387
      // 379: aload 2
      // 37a: checkcast [B
      // 37d: astore 8
      // 37f: aload 7
      // 381: aload 8
      // 383: invokevirtual com/finalshell/io/YM3.B ([B)V
      // 386: return
      // 387: aload 2
      // 388: checkcast [C
      // 38b: astore 8
      // 38d: aload 7
      // 38f: aload 8
      // 391: invokevirtual com/finalshell/io/YM3.v ([C)V
      // 394: return
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21190;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5430100571168378078L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "J¤1\u0085o\u0019ú\u0094ãoQ>0ð\u0097£¸\u008bW\u0017\u008a\u007fS]¡iD\u0011\u0095Bc\u0006";
      int var5 = "J¤1\u0085o\u0019ú\u0094ãoQ>0ð\u0097£¸\u008bW\u0017\u008a\u007fS]¡iD\u0011\u0095Bc\u0006".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[6];
                     Y = new WB();
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "!°xj±E\u009b¤wí\u009cÆ\fÎ©\u001c";
                  var5 = "!°xj±E\u009b¤wí\u009cÆ\fÎ©\u001c".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





