package com.finalshell.task;

public class FO3 implements Runnable {
   public static long[] a;
   public static Integer[] b;

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.C ()I
      // 03: istore 1
      // 04: bipush 2
      // 05: invokestatic com/finalshell/core/BN3.E (I)V
      // 08: sipush 18427
      // 0b: ldc2_w 8671834275942224305
      // 0e: invokestatic com/finalshell/task/FO3.a (IJ)I
      // 11: invokestatic com/finalshell/core/BN3.D (I)V
      // 14: getstatic com/finalshell/core/BN3.y Ljava/io/OutputStream;
      // 17: sipush 23546
      // 1a: ldc2_w 3309506564528590257
      // 1d: invokestatic com/finalshell/task/FO3.a (IJ)I
      // 20: invokevirtual java/io/OutputStream.write (I)V
      // 23: goto 58
      // 26: astore 2
      // 27: goto 58
      // 2a: astore 2
      // 2b: aload 2
      // 2c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2f: iload 1
      // 30: ifne 52
      // 33: invokestatic com/finalshell/core/Bl4.J ()Ljava/lang/Exception;
      // 36: ifnonnull 4c
      // 39: goto 40
      // 3c: invokestatic com/finalshell/task/FO3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3f: athrow
      // 40: aload 2
      // 41: invokestatic com/finalshell/core/Bl4.g (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: pop
      // 45: goto 4c
      // 48: invokestatic com/finalshell/task/FO3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 4b: athrow
      // 4c: invokestatic com/finalshell/core/Bl4.x ()Ljava/lang/Thread;
      // 4f: invokevirtual java/lang/Thread.interrupt ()V
      // 52: invokestatic com/finalshell/core/Bl4.d ()Ljava/lang/Thread;
      // 55: invokevirtual java/lang/Thread.interrupt ()V
      // 58: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5706;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5233909076563516805L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "¨qó\f?Õ+$\t\u001b\u000fÞ\u0087Î\u0010}";
      int var5 = "¨qó\f?Õ+$\t\u001b\u000fÞ\u0087Î\u0010}".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
      b = new Integer[2];
   }
}





