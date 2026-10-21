package com.finalshell.core;

public class Cf4 {
   public Object f = new Object();
   public int z;
   public long T = 0L;
   public long u = 0L;
   public Object W = new Object();
   public long Y;
   public long I;
   public static long[] a;
   public static Long[] b;

   public Cf4(int var1) {
      this.z = var1;
   }

   public synchronized void V(long param1, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/core/Cf4.T J
      // 009: lconst_0
      // 00a: lcmp
      // 00b: aload 4
      // 00d: ifnull 04b
      // 010: ifne 026
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 019: athrow
      // 01a: aload 0
      // 01b: lload 1
      // 01c: putfield com/finalshell/core/Cf4.u J
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 025: athrow
      // 026: aload 0
      // 027: dup
      // 028: getfield com/finalshell/core/Cf4.T J
      // 02b: iload 3
      // 02c: i2l
      // 02d: ladd
      // 02e: putfield com/finalshell/core/Cf4.T J
      // 031: aload 0
      // 032: getfield com/finalshell/core/Cf4.T J
      // 035: aload 4
      // 037: ifnull 064
      // 03a: sipush 11877
      // 03d: ldc2_w 6820222292677765034
      // 040: invokestatic com/finalshell/core/Cf4.a (IJ)J
      // 043: lcmp
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04a: athrow
      // 04b: ifle 143
      // 04e: ldc 1.0E9
      // 050: aload 0
      // 051: getfield com/finalshell/core/Cf4.T J
      // 054: l2f
      // 055: fmul
      // 056: aload 0
      // 057: getfield com/finalshell/core/Cf4.z I
      // 05a: i2f
      // 05b: fdiv
      // 05c: f2l
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 063: athrow
      // 064: lstore 5
      // 066: invokestatic java/lang/System.nanoTime ()J
      // 069: aload 0
      // 06a: getfield com/finalshell/core/Cf4.u J
      // 06d: lsub
      // 06e: lstore 7
      // 070: lload 7
      // 072: lload 5
      // 074: aload 4
      // 076: ifnull 08f
      // 079: lcmp
      // 07a: ifge 13e
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 083: athrow
      // 084: lload 5
      // 086: lload 7
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 08e: athrow
      // 08f: lsub
      // 090: lstore 9
      // 092: aload 0
      // 093: dup
      // 094: getfield com/finalshell/core/Cf4.Y J
      // 097: lload 9
      // 099: ladd
      // 09a: putfield com/finalshell/core/Cf4.Y J
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/Cf4.I J
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/Cf4.Y J
      // 0a5: lsub
      // 0a6: lstore 11
      // 0a8: lload 11
      // 0aa: lconst_0
      // 0ab: aload 4
      // 0ad: ifnull 0ef
      // 0b0: lcmp
      // 0b1: ifle 0e4
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ba: athrow
      // 0bb: lload 9
      // 0bd: lload 11
      // 0bf: aload 4
      // 0c1: ifnull 0ef
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ca: athrow
      // 0cb: lcmp
      // 0cc: ifgt 0e4
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0d5: athrow
      // 0d6: lconst_0
      // 0d7: lstore 9
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield com/finalshell/core/Cf4.I J
      // 0de: lload 9
      // 0e0: lsub
      // 0e1: putfield com/finalshell/core/Cf4.I J
      // 0e4: lload 5
      // 0e6: sipush 26313
      // 0e9: ldc2_w 6796033583056940805
      // 0ec: invokestatic com/finalshell/core/Cf4.a (IJ)J
      // 0ef: ldiv
      // 0f0: lstore 13
      // 0f2: lload 5
      // 0f4: sipush 22179
      // 0f7: ldc2_w 422734991612010349
      // 0fa: invokestatic com/finalshell/core/Cf4.a (IJ)J
      // 0fd: lrem
      // 0fe: l2i
      // 0ff: istore 15
      // 101: invokestatic java/lang/System.nanoTime ()J
      // 104: lstore 16
      // 106: lload 9
      // 108: aload 4
      // 10a: ifnull 13c
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 139
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Cf4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 118: athrow
      // 119: lload 13
      // 11b: iload 15
      // 11d: invokestatic java/lang/Thread.sleep (JI)V
      // 120: goto 12a
      // 123: astore 18
      // 125: aload 18
      // 127: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 12a: aload 0
      // 12b: dup
      // 12c: getfield com/finalshell/core/Cf4.I J
      // 12f: invokestatic java/lang/System.nanoTime ()J
      // 132: lload 16
      // 134: lsub
      // 135: ladd
      // 136: putfield com/finalshell/core/Cf4.I J
      // 139: invokestatic java/lang/System.nanoTime ()J
      // 13c: lstore 18
      // 13e: aload 0
      // 13f: lconst_0
      // 140: putfield com/finalshell/core/Cf4.T J
      // 143: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 2510) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6718733727889700929L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "Xàg\u0086Vk%l\u0003\u009bð°#\u000f7ë\u0003mà3\bù\u0095\u0004";
      int var5 = "Xàg\u0086Vk%l\u0003\u009bð°#\u000f7ë\u0003mà3\bù\u0095\u0004".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[3];
   }
}





