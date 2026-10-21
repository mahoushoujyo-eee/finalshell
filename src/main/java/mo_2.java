import java.util.concurrent.LinkedBlockingQueue;

public class mo_2 implements Runnable {
   boolean Y = false;
   Object n = new Object();
   long J = 0L;
   LinkedBlockingQueue r = new LinkedBlockingQueue();
   LinkedBlockingQueue A = new LinkedBlockingQueue();
   private static final long a;

   public mo_2() {
      QI.U.execute(this);
      QI.U.execute(new UE(this));
   }

   public void T(UR var1, int var2) {
      LJ var3 = new LJ(var1, var2);
      var3.C(this.t(var1));
      this.r.add(var3);
   }

   long t(UR var1) {
      String[] var10000 = QI.N();
      int var3 = var1.B.E + (int)((float)var1.B.E * Yh_2.o);
      String[] var2 = var10000;
      int var6 = var3;
      if (var2 != null) {
         if (var3 >= Yh_2.g) {
            return System.currentTimeMillis() + (long)var3;
         }

         var6 = Yh_2.g;
      }

      var3 = var6;
      return System.currentTimeMillis() + (long)var3;
   }

   long g(UR var1) {
      return System.currentTimeMillis() + a;
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
      // 000: invokestatic QI.N ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield mo_2.r Ljava/util/concurrent/LinkedBlockingQueue;
      // 008: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 00b: checkcast LJ
      // 00e: astore 2
      // 00f: aload 2
      // 010: getfield LJ.t LUR;
      // 013: invokevirtual UR.V ()Z
      // 016: ifeq 0e4
      // 019: aload 2
      // 01a: invokevirtual LJ.J ()J
      // 01d: invokestatic java/lang/System.currentTimeMillis ()J
      // 020: lsub
      // 021: lstore 3
      // 022: lload 3
      // 023: aload 1
      // 024: ifnull 03b
      // 027: lconst_0
      // 028: lcmp
      // 029: ifle 03e
      // 02c: goto 033
      // 02f: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 032: athrow
      // 033: lload 3
      // 034: goto 03b
      // 037: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03a: athrow
      // 03b: invokestatic java/lang/Thread.sleep (J)V
      // 03e: aload 2
      // 03f: getfield LJ.t LUR;
      // 042: aload 1
      // 043: ifnull 0e8
      // 046: getfield UR.z LP;
      // 049: aload 2
      // 04a: getfield LJ.r I
      // 04d: invokevirtual P.e (I)LWI;
      // 050: ifnull 0e4
      // 053: goto 05a
      // 056: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 059: athrow
      // 05a: aload 2
      // 05b: getfield LJ.t LUR;
      // 05e: getfield UR.H Z
      // 061: aload 1
      // 062: ifnull 0ee
      // 065: goto 06c
      // 068: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 06b: athrow
      // 06c: ifne 0e4
      // 06f: goto 076
      // 072: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 075: athrow
      // 076: aload 2
      // 077: invokevirtual LJ.J ()V
      // 07a: aload 2
      // 07b: getfield LJ.t LUR;
      // 07e: getfield UR.z LP;
      // 081: aload 2
      // 082: getfield LJ.r I
      // 085: aload 2
      // 086: invokevirtual LJ.l ()I
      // 089: invokevirtual P.u (II)V
      // 08c: aload 2
      // 08d: invokevirtual LJ.l ()I
      // 090: aload 1
      // 091: ifnull 0e3
      // 094: goto 09b
      // 097: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09a: athrow
      // 09b: getstatic Yh_2.X I
      // 09e: if_icmpge 0c8
      // 0a1: goto 0a8
      // 0a4: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a7: athrow
      // 0a8: aload 2
      // 0a9: aload 0
      // 0aa: aload 2
      // 0ab: getfield LJ.t LUR;
      // 0ae: invokevirtual mo_2.t (LUR;)J
      // 0b1: invokevirtual LJ.C (J)V
      // 0b4: aload 0
      // 0b5: getfield mo_2.r Ljava/util/concurrent/LinkedBlockingQueue;
      // 0b8: aload 2
      // 0b9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 0bc: pop
      // 0bd: aload 1
      // 0be: ifnonnull 0e4
      // 0c1: goto 0c8
      // 0c4: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: aload 0
      // 0ca: aload 2
      // 0cb: getfield LJ.t LUR;
      // 0ce: invokevirtual mo_2.g (LUR;)J
      // 0d1: invokevirtual LJ.C (J)V
      // 0d4: aload 0
      // 0d5: getfield mo_2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // 0d8: aload 2
      // 0d9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 0dc: goto 0e3
      // 0df: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e2: athrow
      // 0e3: pop
      // 0e4: aload 2
      // 0e5: getfield LJ.t LUR;
      // 0e8: getfield UR.B LB2;
      // 0eb: getfield B2.m Z
      // 0ee: ifeq 004
      // 0f1: aload 1
      // 0f2: ifnull 0e4
      // 0f5: goto 100
      // 0f8: astore 2
      // 0f9: aload 2
      // 0fa: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0fd: goto 004
      // 100: return
   }

   public void o() {
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
      // 05: getfield mo_2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // 08: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 0b: checkcast LJ
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield LJ.t LUR;
      // 13: invokevirtual UR.V ()Z
      // 16: ifeq c8
      // 19: aload 2
      // 1a: invokevirtual LJ.J ()J
      // 1d: invokestatic java/lang/System.currentTimeMillis ()J
      // 20: lsub
      // 21: lstore 3
      // 22: lload 3
      // 23: aload 1
      // 24: ifnull 3b
      // 27: lconst_0
      // 28: lcmp
      // 29: ifle 3e
      // 2c: goto 33
      // 2f: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 32: athrow
      // 33: lload 3
      // 34: goto 3b
      // 37: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3a: athrow
      // 3b: invokestatic java/lang/Thread.sleep (J)V
      // 3e: aload 2
      // 3f: getfield LJ.t LUR;
      // 42: aload 1
      // 43: ifnull cc
      // 46: getfield UR.z LP;
      // 49: aload 2
      // 4a: getfield LJ.r I
      // 4d: invokevirtual P.e (I)LWI;
      // 50: ifnull c8
      // 53: goto 5a
      // 56: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 59: athrow
      // 5a: aload 2
      // 5b: getfield LJ.t LUR;
      // 5e: getfield UR.H Z
      // 61: aload 1
      // 62: ifnull d2
      // 65: goto 6c
      // 68: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6b: athrow
      // 6c: ifne c8
      // 6f: goto 76
      // 72: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 75: athrow
      // 76: aload 2
      // 77: invokevirtual LJ.J ()V
      // 7a: aload 2
      // 7b: getfield LJ.t LUR;
      // 7e: getfield UR.z LP;
      // 81: aload 2
      // 82: getfield LJ.r I
      // 85: aload 2
      // 86: invokevirtual LJ.l ()I
      // 89: invokevirtual P.u (II)V
      // 8c: aload 2
      // 8d: invokevirtual LJ.l ()I
      // 90: aload 1
      // 91: ifnull d2
      // 94: goto 9b
      // 97: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 9a: athrow
      // 9b: getstatic Yh_2.X I
      // 9e: getstatic Yh_2.q I
      // a1: iadd
      // a2: if_icmpge c8
      // a5: goto ac
      // a8: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // ab: athrow
      // ac: aload 2
      // ad: aload 0
      // ae: aload 2
      // af: getfield LJ.t LUR;
      // b2: invokevirtual mo_2.g (LUR;)J
      // b5: invokevirtual LJ.C (J)V
      // b8: aload 0
      // b9: getfield mo_2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // bc: aload 2
      // bd: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // c0: pop
      // c1: goto c8
      // c4: invokestatic mo_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c7: athrow
      // c8: aload 2
      // c9: getfield LJ.t LUR;
      // cc: getfield UR.B LB2;
      // cf: getfield B2.m Z
      // d2: ifeq 04
      // d5: aload 1
      // d6: ifnull c8
      // d9: goto e4
      // dc: astore 2
      // dd: aload 2
      // de: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // e1: goto 04
      // e4: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 5663622085784394973L;
      long var10002 = 5663622085784395573L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





