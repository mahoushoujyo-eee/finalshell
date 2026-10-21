import java.net.InetAddress;

class Qt_2 implements Runnable {
   final fH_3 Q;
   private final InetAddress e;
   private static final long[] a;
   private static final Integer[] b;

   Qt_2(fH_3 var1, InetAddress var2) {
      this.Q = var1;
      this.e = var2;
   }

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
      // 00: invokestatic xQ.B ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield Qt_2.Q LfH_3;
      // 08: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 0b: aload 1
      // 0c: ifnull 28
      // 0f: getfield dX_3.w Z
      // 12: ifeq 21
      // 15: goto 1c
      // 18: invokestatic Qt_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: return
      // 1d: invokestatic Qt_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield Qt_2.Q LfH_3;
      // 25: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 28: dup
      // 29: getfield dX_3.A I
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield dX_3.A I
      // 31: new org/icmp4j/j
      // 34: dup
      // 35: invokespecial org/icmp4j/j.<init> ()V
      // 38: astore 2
      // 39: invokestatic xq_2.A ()Lxq_2;
      // 3c: aload 0
      // 3d: getfield Qt_2.e Ljava/net/InetAddress;
      // 40: aload 0
      // 41: getfield Qt_2.Q LfH_3;
      // 44: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 47: getfield dX_3.K S
      // 4a: aload 0
      // 4b: getfield Qt_2.Q LfH_3;
      // 4e: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 51: invokevirtual xq_2.p (Ljava/net/InetAddress;ILQ0;)Lorg/icmp4j/j;
      // 54: astore 2
      // 55: goto 59
      // 58: astore 3
      // 59: aload 2
      // 5a: aload 0
      // 5b: getfield Qt_2.Q LfH_3;
      // 5e: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 61: getfield dX_3.A I
      // 64: invokevirtual org/icmp4j/j.n (I)V
      // 67: aload 2
      // 68: astore 3
      // 69: getstatic xQ.x Ld8_2;
      // 6c: new Lx_2
      // 6f: dup
      // 70: aload 0
      // 71: aload 3
      // 72: invokespecial Lx_2.<init> (LQt_2;Lorg/icmp4j/j;)V
      // 75: sipush 29194
      // 78: ldc2_w 9068389979354858305
      // 7b: invokestatic Qt_2.a (IJ)I
      // 7e: invokestatic com/c.a (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 81: ldc2_w 266288712085965362
      // 84: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 87: dup_x2
      // 88: pop
      // 89: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 8c: goto 93
      // 8f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 92: athrow
      // 93: pop
      // 94: aload 0
      // 95: getfield Qt_2.Q LfH_3;
      // 98: invokestatic fH_3.P (LfH_3;)LdX_3;
      // 9b: dup
      // 9c: getfield dX_3.K S
      // 9f: bipush 1
      // a0: iadd
      // a1: i2s
      // a2: putfield dX_3.K S
      // a5: aload 0
      // a6: getfield Qt_2.Q LfH_3;
      // a9: invokestatic fH_3.P (LfH_3;)LdX_3;
      // ac: aload 1
      // ad: ifnull d4
      // b0: getfield dX_3.K S
      // b3: sipush 17708
      // b6: ldc2_w 7282457621599564902
      // b9: invokestatic Qt_2.a (IJ)I
      // bc: if_icmpne da
      // bf: goto c6
      // c2: invokestatic Qt_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: aload 0
      // c7: getfield Qt_2.Q LfH_3;
      // ca: invokestatic fH_3.P (LfH_3;)LdX_3;
      // cd: goto d4
      // d0: invokestatic Qt_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: invokestatic dX_3.I ()S
      // d7: putfield dX_3.K S
      // da: return
   }

   static fH_3 A(Qt_2 var0) {
      return var0.Q;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 5599926709614369977L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ýý\u0097húáÜ|ß¼OØ]\u008e\u0017 ";
      int var5 = "Ýý\u0097húáÜ|ß¼OØ]\u008e\u0017 ".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29003;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





