package com.finalshell.core;

public class YK3_2 implements FW3 {
   public final int[] M;
   public static long[] a;
   public static Integer[] b;

   public YK3_2(int[] var1) {
      this.M = var1;
   }

   @Override
   public void w(TX param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.C ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/TX.C ()I
      // 08: bipush 3
      // 09: iload 2
      // 0a: ifne 2d
      // 0d: if_icmpne 28
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getfield com/finalshell/core/YK3_2.M [I
      // 1b: bipush 3
      // 1c: dup2
      // 1d: iaload
      // 1e: bipush 1
      // 1f: iadd
      // 20: iastore
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual com/finalshell/core/TX.C ()I
      // 2c: bipush 5
      // 2d: iload 2
      // 2e: ifne 59
      // 31: if_icmpne 4c
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield com/finalshell/core/YK3_2.M [I
      // 3f: bipush 5
      // 40: dup2
      // 41: iaload
      // 42: bipush 1
      // 43: iadd
      // 44: iastore
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual com/finalshell/core/TX.C ()I
      // 50: sipush 5446
      // 53: ldc2_w 1453797078823476111
      // 56: invokestatic com/finalshell/core/YK3_2.a (IJ)I
      // 59: iload 2
      // 5a: ifne 85
      // 5d: if_icmpne 80
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 0
      // 68: getfield com/finalshell/core/YK3_2.M [I
      // 6b: sipush 22049
      // 6e: ldc2_w 6289867132438796521
      // 71: invokestatic com/finalshell/core/YK3_2.a (IJ)I
      // 74: dup2
      // 75: iaload
      // 76: bipush 1
      // 77: iadd
      // 78: iastore
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 1
      // 81: invokevirtual com/finalshell/core/TX.C ()I
      // 84: bipush 4
      // 85: if_icmpne 99
      // 88: aload 0
      // 89: getfield com/finalshell/core/YK3_2.M [I
      // 8c: bipush 4
      // 8d: dup2
      // 8e: iaload
      // 8f: bipush 1
      // 90: iadd
      // 91: iastore
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/YK3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: goto a1
      // 9c: astore 3
      // 9d: aload 3
      // 9e: invokevirtual java/lang/Exception.printStackTrace ()V
      // a1: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3785;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1265709999880789886L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008aàvÄiKÄ÷\u0002\f¯ç\u0002æ\u0087\u0091";
      int var5 = "\u008aàvÄiKÄ÷\u0002\f¯ç\u0002æ\u0087\u0091".length();
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





