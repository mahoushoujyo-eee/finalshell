import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class v implements Runnable {
   HashMap o;
   HashMap c;
   boolean z = false;
   Object D = new Object();
   Thread m;
   long u = 0L;
   LinkedBlockingQueue Z = new LinkedBlockingQueue();

   public v() {
      this.o = new HashMap();
      this.c = new HashMap();
      this.m = new Thread(this);
      this.m.start();
   }

   public void p(Qu_2 var1, int var2) {
      Cd_2 var3 = new Cd_2(var1, var2);
      var3.V(this.k(var1));
      this.Z.add(var3);
   }

   long k(Qu_2 var1) {
      int var2 = (int)((float)var1.P.E * Yh_2.o);
      return System.currentTimeMillis() + (long)var1.P.E + (long)var2;
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
      // 03: astore 1
      // 04: aload 0
      // 05: getfield v.Z Ljava/util/concurrent/LinkedBlockingQueue;
      // 08: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 0b: checkcast Cd_2
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield Cd_2.q LQu_2;
      // 13: invokevirtual Qu_2.I ()Z
      // 16: ifeq 04
      // 19: aload 2
      // 1a: invokevirtual Cd_2.H ()J
      // 1d: invokestatic java/lang/System.currentTimeMillis ()J
      // 20: lsub
      // 21: lstore 3
      // 22: aload 1
      // 23: ifnull 46
      // 26: lload 3
      // 27: lconst_0
      // 28: lcmp
      // 29: aload 1
      // 2a: ifnull 16
      // 2d: goto 34
      // 30: invokestatic v.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 33: athrow
      // 34: ifle 42
      // 37: lload 3
      // 38: invokestatic java/lang/Thread.sleep (J)V
      // 3b: goto 42
      // 3e: invokestatic v.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 41: athrow
      // 42: aload 2
      // 43: invokevirtual Cd_2.C ()V
      // 46: aload 2
      // 47: aload 1
      // 48: ifnull 76
      // 4b: getfield Cd_2.q LQu_2;
      // 4e: aload 2
      // 4f: getfield Cd_2.S I
      // 52: invokevirtual Qu_2.g (I)LWr_2;
      // 55: ifnull 75
      // 58: goto 5f
      // 5b: invokestatic v.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 5e: athrow
      // 5f: getstatic QI.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 62: new Tu_2
      // 65: dup
      // 66: aload 0
      // 67: aload 2
      // 68: invokespecial Tu_2.<init> (Lv;LCd_2;)V
      // 6b: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 6e: goto 75
      // 71: invokestatic v.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 74: athrow
      // 75: aload 2
      // 76: invokevirtual Cd_2.i ()I
      // 79: aload 1
      // 7a: ifnull 9e
      // 7d: getstatic Yh_2.B I
      // 80: if_icmpge 04
      // 83: goto 8a
      // 86: invokestatic v.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 89: athrow
      // 8a: aload 2
      // 8b: aload 0
      // 8c: aload 2
      // 8d: getfield Cd_2.q LQu_2;
      // 90: invokevirtual v.k (LQu_2;)J
      // 93: invokevirtual Cd_2.V (J)V
      // 96: aload 0
      // 97: getfield v.Z Ljava/util/concurrent/LinkedBlockingQueue;
      // 9a: aload 2
      // 9b: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 9e: pop
      // 9f: goto 04
      // a2: astore 2
      // a3: aload 2
      // a4: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // a7: goto 04
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





