package com.finalshell.core;

public class P3 extends Ps2 {
   public final String F;
   public static long[] a;
   public static Integer[] b;

   public P3(String var1) {
      this.F = var1;
      this.c();
      this.N();
   }

   @Override
   void c() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: dup
      // 05: getfield com/finalshell/core/P3.p I
      // 08: bipush 1
      // 09: iadd
      // 0a: putfield com/finalshell/core/P3.p I
      // 0d: astore 1
      // 0e: aload 0
      // 0f: aload 1
      // 10: ifnonnull 44
      // 13: getfield com/finalshell/core/P3.p I
      // 16: aload 0
      // 17: getfield com/finalshell/core/P3.F Ljava/lang/String;
      // 1a: invokevirtual java/lang/String.length ()I
      // 1d: if_icmplt 3c
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 26: athrow
      // 27: aload 0
      // 28: bipush 0
      // 29: putfield com/finalshell/core/P3.D C
      // 2c: aload 0
      // 2d: bipush 1
      // 2e: putfield com/finalshell/core/P3.o Z
      // 31: aload 1
      // 32: ifnull 52
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/P3.F Ljava/lang/String;
      // 48: aload 0
      // 49: getfield com/finalshell/core/P3.p I
      // 4c: invokevirtual java/lang/String.charAt (I)C
      // 4f: putfield com/finalshell/core/P3.D C
      // 52: return
   }

   @Override
   protected final void B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/P3.p I
      // 007: bipush 1
      // 008: iadd
      // 009: istore 2
      // 00a: astore 1
      // 00b: iload 2
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/P3.F Ljava/lang/String;
      // 010: invokevirtual java/lang/String.length ()I
      // 013: if_icmpge 082
      // 016: aload 0
      // 017: getfield com/finalshell/core/P3.F Ljava/lang/String;
      // 01a: iload 2
      // 01b: invokevirtual java/lang/String.charAt (I)C
      // 01e: istore 3
      // 01f: iload 3
      // 020: sipush 29902
      // 023: ldc2_w 8841087341138747027
      // 026: invokestatic com/finalshell/core/P3.b (IJ)I
      // 029: aload 1
      // 02a: ifnonnull 093
      // 02d: aload 1
      // 02e: ifnonnull 05e
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 037: athrow
      // 038: if_icmpne 04d
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 041: athrow
      // 042: aload 1
      // 043: ifnull 082
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 04c: athrow
      // 04d: iload 3
      // 04e: sipush 10106
      // 051: ldc2_w 6941471577648319777
      // 054: invokestatic com/finalshell/core/P3.b (IJ)I
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 05d: athrow
      // 05e: if_icmpne 07b
      // 061: aload 0
      // 062: aload 0
      // 063: getfield com/finalshell/core/P3.F Ljava/lang/String;
      // 066: iload 2
      // 067: bipush 1
      // 068: iadd
      // 069: invokevirtual java/lang/String.charAt (I)C
      // 06c: putfield com/finalshell/core/P3.D C
      // 06f: aload 0
      // 070: iload 2
      // 071: bipush 1
      // 072: iadd
      // 073: putfield com/finalshell/core/P3.p I
      // 076: return
      // 077: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 07a: athrow
      // 07b: iinc 2 1
      // 07e: aload 1
      // 07f: ifnull 00b
      // 082: aload 0
      // 083: invokevirtual com/finalshell/core/P3.c ()V
      // 086: aload 0
      // 087: getfield com/finalshell/core/P3.D C
      // 08a: sipush 21283
      // 08d: ldc2_w 4679770532779735418
      // 090: invokestatic com/finalshell/core/P3.b (IJ)I
      // 093: if_icmpne 0ee
      // 096: aload 0
      // 097: invokevirtual com/finalshell/core/P3.c ()V
      // 09a: aload 0
      // 09b: aload 1
      // 09c: ifnonnull 0e7
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0a5: athrow
      // 0a6: getfield com/finalshell/core/P3.D C
      // 0a9: sipush 11105
      // 0ac: ldc2_w 8750538030182875449
      // 0af: invokestatic com/finalshell/core/P3.b (IJ)I
      // 0b2: aload 1
      // 0b3: ifnonnull 106
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0bc: athrow
      // 0bd: if_icmpne 0e6
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: invokevirtual com/finalshell/core/P3.c ()V
      // 0cb: aload 0
      // 0cc: invokevirtual com/finalshell/core/P3.c ()V
      // 0cf: aload 0
      // 0d0: invokevirtual com/finalshell/core/P3.c ()V
      // 0d3: aload 0
      // 0d4: invokevirtual com/finalshell/core/P3.c ()V
      // 0d7: aload 0
      // 0d8: invokevirtual com/finalshell/core/P3.c ()V
      // 0db: aload 1
      // 0dc: ifnull 086
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: invokevirtual com/finalshell/core/P3.c ()V
      // 0ea: aload 1
      // 0eb: ifnull 086
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/P3.D C
      // 0f2: aload 1
      // 0f3: ifnonnull 12e
      // 0f6: sipush 17077
      // 0f9: ldc2_w 6777162843506125039
      // 0fc: invokestatic com/finalshell/core/P3.b (IJ)I
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 105: athrow
      // 106: if_icmpne 118
      // 109: aload 0
      // 10a: invokevirtual com/finalshell/core/P3.c ()V
      // 10d: aload 1
      // 10e: ifnull 14b
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 117: athrow
      // 118: aload 0
      // 119: aload 1
      // 11a: ifnonnull 144
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 123: athrow
      // 124: getfield com/finalshell/core/P3.o Z
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 12d: athrow
      // 12e: ifeq 13c
      // 131: aload 1
      // 132: ifnull 14b
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 13b: athrow
      // 13c: aload 0
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/P3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 143: athrow
      // 144: invokevirtual com/finalshell/core/P3.c ()V
      // 147: aload 1
      // 148: ifnull 086
      // 14b: return
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27225;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8019264614180948973L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "®ä\u008f\u0005\u008c°²Ë\u0004tÊX\"\u0085J¡ÍÿÆ!\u0094/Fî";
      int var5 = "®ä\u008f\u0005\u008c°²Ë\u0004tÊX\"\u0085J¡ÍÿÆ!\u0094/Fî".length();
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
                     b = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "k\u007f²\u009eÀ5# ìXÀIüÚ\u0095\"";
                  var5 = "k\u007f²\u009eÀ5# ìXÀIüÚ\u0095\"".length();
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





