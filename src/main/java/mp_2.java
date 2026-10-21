import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class mp_2 extends mW {
   private static int[] A;
   private InputStream j;
   private tr_4 p = new tr_4(DZ.CRC16);
   private boolean Z = false;
   private boolean H = true;
   private static String[] U;
   private static final long[] a;
   private static final Integer[] b;

   public mp_2(InputStream var1) {
      this.j = var1;
   }

   private boolean i(int var1) {
      String[] var2 = o();
      int var10000 = Arrays.binarySearch(A, var1);
      if (var2 != null) {
         var10000 = var10000 >= 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   private byte Z() throws IOException {
      while (true) {
         mp_2 var10000 = this;
         int var1;
         int var10001 = var1 = this.j.read();

         try {
            if (var10000.i(var10001)) {
               continue;
            }
         } catch (IOException var3) {
            throw a(var3);
         }

         char var2 = (char)var1;
         return (byte)var1;
      }
   }

   public Ub_2 G() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 18799
      // 003: ldc2_w 8446551102877665149
      // 006: invokestatic mp_2.a (IJ)I
      // 009: invokestatic Kk_2.v (I)LKk_2;
      // 00c: astore 2
      // 00d: invokestatic mp_2.o ()[Ljava/lang/String;
      // 010: bipush 1
      // 011: istore 3
      // 012: getstatic gV.ESCAPE LgV;
      // 015: astore 4
      // 017: bipush -1
      // 018: istore 5
      // 01a: astore 1
      // 01b: bipush 0
      // 01c: istore 6
      // 01e: iload 3
      // 01f: ifeq 1d2
      // 022: aload 0
      // 023: invokespecial mp_2.Z ()B
      // 026: istore 7
      // 028: aload 1
      // 029: ifnull 1d6
      // 02c: aload 0
      // 02d: getfield mp_2.Z Z
      // 030: aload 1
      // 031: ifnull 092
      // 034: goto 03b
      // 037: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03a: athrow
      // 03b: ifeq 090
      // 03e: goto 045
      // 041: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 044: athrow
      // 045: iload 7
      // 047: sipush 31475
      // 04a: ldc2_w 119318289512477920
      // 04d: invokestatic mp_2.a (IJ)I
      // 050: aload 1
      // 051: ifnull 0a3
      // 054: goto 05b
      // 057: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05a: athrow
      // 05b: if_icmpne 090
      // 05e: goto 065
      // 061: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 064: athrow
      // 065: aload 0
      // 066: invokespecial mp_2.Z ()B
      // 069: istore 7
      // 06b: iload 7
      // 06d: sipush 14070
      // 070: ldc2_w 1743523885827913952
      // 073: invokestatic mp_2.a (IJ)I
      // 076: aload 1
      // 077: ifnull 0a3
      // 07a: if_icmpne 090
      // 07d: goto 084
      // 080: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 083: athrow
      // 084: new Um_2
      // 087: dup
      // 088: invokespecial Um_2.<init> ()V
      // 08b: areturn
      // 08c: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 08f: athrow
      // 090: iload 7
      // 092: aload 1
      // 093: ifnull 16c
      // 096: getstatic x9.ZDLE Lx9;
      // 099: invokevirtual x9.r ()B
      // 09c: goto 0a3
      // 09f: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a2: athrow
      // 0a3: if_icmpne 163
      // 0a6: aload 0
      // 0a7: getfield mp_2.j Ljava/io/InputStream;
      // 0aa: invokevirtual java/io/InputStream.read ()I
      // 0ad: i2b
      // 0ae: istore 7
      // 0b0: iload 7
      // 0b2: i2c
      // 0b3: istore 8
      // 0b5: iload 7
      // 0b7: aload 1
      // 0b8: ifnull 0e1
      // 0bb: getstatic x9.ZDLE Lx9;
      // 0be: invokevirtual x9.r ()B
      // 0c1: if_icmpne 0d9
      // 0c4: goto 0cb
      // 0c7: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ca: athrow
      // 0cb: iinc 6 2
      // 0ce: aload 1
      // 0cf: ifnonnull 0e3
      // 0d2: goto 0d9
      // 0d5: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d8: athrow
      // 0d9: bipush 0
      // 0da: goto 0e1
      // 0dd: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e0: athrow
      // 0e1: istore 6
      // 0e3: iload 7
      // 0e5: aload 0
      // 0e6: getfield mp_2.H Z
      // 0e9: invokestatic xP.g (BZ)LxP;
      // 0ec: astore 9
      // 0ee: aload 9
      // 0f0: invokevirtual xP.V ()LgV;
      // 0f3: getstatic gV.ESCAPE LgV;
      // 0f6: if_acmpeq 155
      // 0f9: iload 5
      // 0fb: aload 1
      // 0fc: ifnull 161
      // 0ff: goto 106
      // 102: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 105: athrow
      // 106: ifge 155
      // 109: goto 110
      // 10c: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 10f: athrow
      // 110: aload 9
      // 112: invokevirtual xP.V ()LgV;
      // 115: astore 4
      // 117: aload 9
      // 119: aload 1
      // 11a: ifnull 143
      // 11d: invokevirtual xP.V ()LgV;
      // 120: getstatic gV.DATA LgV;
      // 123: if_acmpne 13a
      // 126: goto 12d
      // 129: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield mp_2.p Ltr_4;
      // 131: invokevirtual tr_4.i ()I
      // 134: istore 5
      // 136: aload 1
      // 137: ifnonnull 148
      // 13a: aload 9
      // 13c: goto 143
      // 13f: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 142: athrow
      // 143: invokevirtual xP.C ()I
      // 146: istore 5
      // 148: aload 0
      // 149: getfield mp_2.p Ltr_4;
      // 14c: iload 7
      // 14e: invokevirtual tr_4.x (B)V
      // 151: aload 1
      // 152: ifnonnull 163
      // 155: iload 7
      // 157: invokestatic xP.c (B)B
      // 15a: goto 161
      // 15d: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 160: athrow
      // 161: istore 7
      // 163: aload 2
      // 164: iload 7
      // 166: invokevirtual Kk_2.c (B)LKy_2;
      // 169: pop
      // 16a: iload 5
      // 16c: aload 1
      // 16d: ifnull 18c
      // 170: ifge 18a
      // 173: goto 17a
      // 176: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield mp_2.p Ltr_4;
      // 17e: iload 7
      // 180: invokevirtual tr_4.x (B)V
      // 183: goto 18a
      // 186: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 189: athrow
      // 18a: iload 5
      // 18c: aload 1
      // 18d: ifnull 19e
      // 190: ifne 19c
      // 193: goto 19a
      // 196: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 199: athrow
      // 19a: bipush 0
      // 19b: istore 3
      // 19c: iload 5
      // 19e: aload 1
      // 19f: ifnull 1b1
      // 1a2: ifle 1af
      // 1a5: goto 1ac
      // 1a8: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ab: athrow
      // 1ac: iinc 5 -1
      // 1af: iload 6
      // 1b1: aload 1
      // 1b2: ifnull 1c8
      // 1b5: bipush 5
      // 1b6: if_icmplt 1ce
      // 1b9: goto 1c0
      // 1bc: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1bf: athrow
      // 1c0: bipush 0
      // 1c1: goto 1c8
      // 1c4: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c7: athrow
      // 1c8: istore 3
      // 1c9: getstatic gV.CANCEL LgV;
      // 1cc: astore 4
      // 1ce: aload 1
      // 1cf: ifnonnull 01e
      // 1d2: aload 2
      // 1d3: invokevirtual Kk_2.a ()V
      // 1d6: aconst_null
      // 1d7: astore 7
      // 1d9: getstatic C0.k [I
      // 1dc: aload 4
      // 1de: invokevirtual gV.ordinal ()I
      // 1e1: iaload
      // 1e2: tableswitch 327 1 3 26 209 300
      // 1fc: aload 2
      // 1fd: invokestatic Uw_2.J (LKy_2;)LUw_2;
      // 200: astore 7
      // 202: aload 1
      // 203: ifnull 230
      // 206: aload 7
      // 208: checkcast Uw_2
      // 20b: invokevirtual Uw_2.f ()Lyu_4;
      // 20e: getstatic yu_4.BIN32 Lyu_4;
      // 211: if_acmpne 234
      // 214: goto 21b
      // 217: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21a: athrow
      // 21b: aload 0
      // 21c: new tr_4
      // 21f: dup
      // 220: getstatic DZ.CRC32 LDZ;
      // 223: invokespecial tr_4.<init> (LDZ;)V
      // 226: putfield mp_2.p Ltr_4;
      // 229: goto 230
      // 22c: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22f: athrow
      // 230: aload 1
      // 231: ifnonnull 249
      // 234: aload 0
      // 235: new tr_4
      // 238: dup
      // 239: getstatic DZ.CRC16 LDZ;
      // 23c: invokespecial tr_4.<init> (LDZ;)V
      // 23f: putfield mp_2.p Ltr_4;
      // 242: goto 249
      // 245: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 248: athrow
      // 249: aload 7
      // 24b: checkcast Uw_2
      // 24e: invokevirtual Uw_2.h ()Lx9;
      // 251: getstatic x9.ZFIN Lx9;
      // 254: aload 1
      // 255: ifnull 279
      // 258: if_acmpne 26e
      // 25b: goto 262
      // 25e: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 261: athrow
      // 262: aload 0
      // 263: bipush 1
      // 264: putfield mp_2.Z Z
      // 267: goto 26e
      // 26a: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 26d: athrow
      // 26e: aload 7
      // 270: checkcast Uw_2
      // 273: invokevirtual Uw_2.h ()Lx9;
      // 276: getstatic x9.ZDATA Lx9;
      // 279: aload 1
      // 27a: ifnull 2a4
      // 27d: if_acmpeq 2a7
      // 280: goto 287
      // 283: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 286: athrow
      // 287: aload 7
      // 289: checkcast Uw_2
      // 28c: aload 1
      // 28d: ifnull 32b
      // 290: goto 297
      // 293: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 296: athrow
      // 297: invokevirtual Uw_2.h ()Lx9;
      // 29a: getstatic x9.ZFILE Lx9;
      // 29d: goto 2a4
      // 2a0: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2a3: athrow
      // 2a4: if_acmpne 329
      // 2a7: aload 0
      // 2a8: bipush 0
      // 2a9: putfield mp_2.H Z
      // 2ac: goto 329
      // 2af: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2b2: athrow
      // 2b3: aload 0
      // 2b4: getfield mp_2.p Ltr_4;
      // 2b7: invokevirtual tr_4.finalize ()V
      // 2ba: aload 2
      // 2bb: aload 0
      // 2bc: getfield mp_2.p Ltr_4;
      // 2bf: invokestatic UK.v (LKy_2;Ltr_4;)LUK;
      // 2c2: astore 7
      // 2c4: aload 0
      // 2c5: new tr_4
      // 2c8: dup
      // 2c9: aload 0
      // 2ca: getfield mp_2.p Ltr_4;
      // 2cd: invokevirtual tr_4.y ()LDZ;
      // 2d0: invokespecial tr_4.<init> (LDZ;)V
      // 2d3: putfield mp_2.p Ltr_4;
      // 2d6: aload 1
      // 2d7: ifnull 30b
      // 2da: aload 7
      // 2dc: checkcast UK
      // 2df: invokevirtual UK.e ()Lx9;
      // 2e2: getstatic x9.ZCRCG Lx9;
      // 2e5: if_acmpne 2ff
      // 2e8: goto 2ef
      // 2eb: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2ee: athrow
      // 2ef: aload 0
      // 2f0: bipush 0
      // 2f1: putfield mp_2.H Z
      // 2f4: aload 1
      // 2f5: ifnonnull 329
      // 2f8: goto 2ff
      // 2fb: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2fe: athrow
      // 2ff: aload 0
      // 300: bipush 1
      // 301: putfield mp_2.H Z
      // 304: goto 30b
      // 307: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 30a: athrow
      // 30b: goto 329
      // 30e: new Ut_2
      // 311: dup
      // 312: invokespecial Ut_2.<init> ()V
      // 315: astore 7
      // 317: aload 0
      // 318: new tr_4
      // 31b: dup
      // 31c: aload 0
      // 31d: getfield mp_2.p Ltr_4;
      // 320: invokevirtual tr_4.y ()LDZ;
      // 323: invokespecial tr_4.<init> (LDZ;)V
      // 326: putfield mp_2.p Ltr_4;
      // 329: aload 7
      // 32b: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 32e: ifnull 33f
      // 331: bipush 3
      // 332: anewarray 213
      // 335: invokestatic mp_2.T ([Ljava/lang/String;)V
      // 338: goto 33f
      // 33b: invokestatic mp_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33e: athrow
      // 33f: areturn
   }

   @Override
   public Object Z$Object() throws IOException {
      return this.G();
   }

   static {
      long var0 = 3556322743778078676L;
      String[] var10000 = new String[2];
      long[] var6 = new long[7];
      T(var10000);
      int var3 = 0;
      String var4 = "%\u0086J9é¦\u0097{«¢p?.´p©Ú7Se¹ý¨\u008c\u0096&´F»$\u009f\u001dÐ\u009cK¹\u0089½ø©";
      int var5 = "%\u0086J9é¦\u0097{«¢p?.´p©Ú7Se¹ý¨\u008c\u0096&´F»$\u009f\u001dÐ\u009cK¹\u0089½ø©".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var9 = var6;
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
            long var14 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var9[var10001] = var14;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[7];
                     A = new int[]{a(10673, 2641214239820539809L), a(20857, 453810510861475694L), a(2525, 6345260218187073481L), a(15951, 691144332357169242L)};
                     return;
                  }
                  break;
               default:
                  var9[var10001] = var14;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "qad\u0016\\\u0011Û{\u008eý\u0016¢\u0005¼\bd";
                  var5 = "qad\u0016\\\u0011Û{\u008eý\u0016¢\u0005¼\bd".length();
                  var2 = 0;
            }

            byte var11 = var2;
            var2 += 8;
            var7 = var4.substring(var11, var2).getBytes("ISO-8859-1");
            var9 = var6;
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

   public static void T(String[] var0) {
      U = var0;
   }

   public static String[] o() {
      return U;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19990;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





