package com.finalshell.task;

public class TF3 implements Runnable {
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
      // 00: invokestatic com/finalshell/core/BN3.Z ()I
      // 03: istore 1
      // 04: bipush 2
      // 05: invokestatic com/finalshell/core/BN3.E (I)V
      // 08: sipush 11234
      // 0b: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e: invokestatic com/finalshell/core/BS3.v (J)J
      // 11: pop2
      // 12: ldc2_w 4752015861437679003
      // 15: invokestatic com/finalshell/task/TF3.a (IJ)I
      // 18: invokestatic com/finalshell/core/BN3.D (I)V
      // 1b: getstatic com/finalshell/core/BN3.y Ljava/io/OutputStream;
      // 1e: sipush 21908
      // 21: ldc2_w 3003856844670483436
      // 24: invokestatic com/finalshell/task/TF3.a (IJ)I
      // 27: newarray 8
      // 29: invokevirtual java/io/OutputStream.write ([B)V
      // 2c: goto 61
      // 2f: astore 2
      // 30: goto 61
      // 33: astore 2
      // 34: aload 2
      // 35: invokevirtual java/lang/Exception.printStackTrace ()V
      // 38: iload 1
      // 39: ifeq 5b
      // 3c: invokestatic com/finalshell/core/BS3.m ()Ljava/lang/Exception;
      // 3f: ifnonnull 55
      // 42: goto 49
      // 45: invokestatic com/finalshell/task/TF3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 48: athrow
      // 49: aload 2
      // 4a: invokestatic com/finalshell/core/BS3.w (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: pop
      // 4e: goto 55
      // 51: invokestatic com/finalshell/task/TF3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 54: athrow
      // 55: invokestatic com/finalshell/core/BS3.G ()Ljava/lang/Thread;
      // 58: invokevirtual java/lang/Thread.interrupt ()V
      // 5b: invokestatic com/finalshell/core/BS3.D ()Ljava/lang/Thread;
      // 5e: invokevirtual java/lang/Thread.interrupt ()V
      // 61: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28281;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8735284352673407664L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Hà-\u0085ù#\u0080;½ãúµÃ\u0095Ù[";
      int var5 = "Hà-\u0085ù#\u0080;½ãúµÃ\u0095Ù[".length();
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
      b = new Integer[2];
   }
}





