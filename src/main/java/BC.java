import java.net.UnknownHostException;

class BC implements Runnable {
   final Qu_2 H;
   private final We_2 A;

   BC(Qu_2 var1, We_2 var2) {
      this.H = var1;
      this.A = var2;
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
      // 00: invokestatic QI.N ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield BC.H LQu_2;
      // 07: aload 0
      // 08: getfield BC.A LWe_2;
      // 0b: invokevirtual We_2.r ()Ljava/lang/String;
      // 0e: putfield Qu_2.M Ljava/lang/String;
      // 11: astore 1
      // 12: aload 0
      // 13: getfield BC.H LQu_2;
      // 16: aload 0
      // 17: getfield BC.H LQu_2;
      // 1a: getfield Qu_2.M Ljava/lang/String;
      // 1d: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 20: putfield Qu_2.s Ljava/net/InetAddress;
      // 23: goto 2b
      // 26: astore 2
      // 27: aload 2
      // 28: invokevirtual java/net/UnknownHostException.printStackTrace ()V
      // 2b: aload 0
      // 2c: getfield BC.H LQu_2;
      // 2f: aload 0
      // 30: getfield BC.A LWe_2;
      // 33: invokevirtual We_2.x ()I
      // 36: putfield Qu_2.F I
      // 39: aload 0
      // 3a: getfield BC.H LQu_2;
      // 3d: aload 1
      // 3e: ifnull 6b
      // 41: getfield Qu_2.N Z
      // 44: ifne 60
      // 47: goto 4e
      // 4a: invokestatic BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield BC.H LQu_2;
      // 52: invokevirtual Qu_2.X ()V
      // 55: aload 1
      // 56: ifnonnull 6e
      // 59: goto 60
      // 5c: invokestatic BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield BC.H LQu_2;
      // 64: goto 6b
      // 67: invokestatic BC.a (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
      // 6a: athrow
      // 6b: invokevirtual Qu_2.b ()V
      // 6e: return
   }

   private static UnknownHostException a(UnknownHostException var0) {
      return var0;
   }
}





