package com.finalshell.task;

import com.finalshell.core.LJ;
import com.finalshell.core.UR;
import com.finalshell.core.Yh2;
import com.finalshell.crypto.PingMessageReceiver;
import java.util.concurrent.LinkedBlockingQueue;

public class Mo2 implements Runnable {
   public boolean Y = false;
   public Object n = new Object();
   public long J = 0L;
   public LinkedBlockingQueue r = new LinkedBlockingQueue();
   public LinkedBlockingQueue A = new LinkedBlockingQueue();
   public static long a;

   public Mo2() {
      PingMessageReceiver.U.execute(this);
      PingMessageReceiver.U.execute(new UE(this));
   }

   public void T(UR var1, int var2) {
      LJ var3 = new LJ(var1, var2);
      var3.C(this.t(var1));
      this.r.add(var3);
   }

   public long t(UR var1) {
      String[] var10000 = PingMessageReceiver.N();
      int var3 = var1.B.E + (int)((float)var1.B.E * Yh2.o);
      String[] var2 = var10000;
      int var6 = var3;
      if (var2 != null) {
         if (var3 >= Yh2.g) {
            return System.currentTimeMillis() + (long)var3;
         }

         var6 = Yh2.g;
      }

      var3 = var6;
      return System.currentTimeMillis() + (long)var3;
   }

   public long g(UR var1) {
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
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/task/Mo2.r Ljava/util/concurrent/LinkedBlockingQueue;
      // 008: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 00b: checkcast com/finalshell/core/LJ
      // 00e: astore 2
      // 00f: aload 2
      // 010: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 013: invokevirtual com/finalshell/core/UR.V ()Z
      // 016: ifeq 0e4
      // 019: aload 2
      // 01a: invokevirtual com/finalshell/core/LJ.J$long ()J
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
      // 02f: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 032: athrow
      // 033: lload 3
      // 034: goto 03b
      // 037: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 03a: athrow
      // 03b: invokestatic java/lang/Thread.sleep (J)V
      // 03e: aload 2
      // 03f: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 042: aload 1
      // 043: ifnull 0e8
      // 046: getfield com/finalshell/core/UR.z Lcom/finalshell/core/Rdp;
      // 049: aload 2
      // 04a: getfield com/finalshell/core/LJ.r I
      // 04d: invokevirtual com/finalshell/core/Rdp.e$WI (I)Lcom/finalshell/core/WI;
      // 050: ifnull 0e4
      // 053: goto 05a
      // 056: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 059: athrow
      // 05a: aload 2
      // 05b: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 05e: getfield com/finalshell/core/UR.H Z
      // 061: aload 1
      // 062: ifnull 0ee
      // 065: goto 06c
      // 068: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 06b: athrow
      // 06c: ifne 0e4
      // 06f: goto 076
      // 072: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 075: athrow
      // 076: aload 2
      // 077: invokevirtual com/finalshell/core/LJ.J$void ()V
      // 07a: aload 2
      // 07b: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 07e: getfield com/finalshell/core/UR.z Lcom/finalshell/core/Rdp;
      // 081: aload 2
      // 082: getfield com/finalshell/core/LJ.r I
      // 085: aload 2
      // 086: invokevirtual com/finalshell/core/LJ.l ()I
      // 089: invokevirtual com/finalshell/core/Rdp.u (II)V
      // 08c: aload 2
      // 08d: invokevirtual com/finalshell/core/LJ.l ()I
      // 090: aload 1
      // 091: ifnull 0e3
      // 094: goto 09b
      // 097: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09a: athrow
      // 09b: getstatic com/finalshell/core/Yh2.X I
      // 09e: if_icmpge 0c8
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a7: athrow
      // 0a8: aload 2
      // 0a9: aload 0
      // 0aa: aload 2
      // 0ab: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 0ae: invokevirtual com/finalshell/task/Mo2.t (Lcom/finalshell/core/UR;)J
      // 0b1: invokevirtual com/finalshell/core/LJ.C (J)V
      // 0b4: aload 0
      // 0b5: getfield com/finalshell/task/Mo2.r Ljava/util/concurrent/LinkedBlockingQueue;
      // 0b8: aload 2
      // 0b9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 0bc: pop
      // 0bd: aload 1
      // 0be: ifnonnull 0e4
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: aload 0
      // 0ca: aload 2
      // 0cb: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 0ce: invokevirtual com/finalshell/task/Mo2.g (Lcom/finalshell/core/UR;)J
      // 0d1: invokevirtual com/finalshell/core/LJ.C (J)V
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/task/Mo2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // 0d8: aload 2
      // 0d9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e2: athrow
      // 0e3: pop
      // 0e4: aload 2
      // 0e5: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 0e8: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // 0eb: getfield com/finalshell/core/B2.m Z
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
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/task/Mo2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // 08: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 0b: checkcast com/finalshell/core/LJ
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 13: invokevirtual com/finalshell/core/UR.V ()Z
      // 16: ifeq c8
      // 19: aload 2
      // 1a: invokevirtual com/finalshell/core/LJ.J$long ()J
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
      // 2f: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 32: athrow
      // 33: lload 3
      // 34: goto 3b
      // 37: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3a: athrow
      // 3b: invokestatic java/lang/Thread.sleep (J)V
      // 3e: aload 2
      // 3f: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 42: aload 1
      // 43: ifnull cc
      // 46: getfield com/finalshell/core/UR.z Lcom/finalshell/core/Rdp;
      // 49: aload 2
      // 4a: getfield com/finalshell/core/LJ.r I
      // 4d: invokevirtual com/finalshell/core/Rdp.e$WI (I)Lcom/finalshell/core/WI;
      // 50: ifnull c8
      // 53: goto 5a
      // 56: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 59: athrow
      // 5a: aload 2
      // 5b: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 5e: getfield com/finalshell/core/UR.H Z
      // 61: aload 1
      // 62: ifnull d2
      // 65: goto 6c
      // 68: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6b: athrow
      // 6c: ifne c8
      // 6f: goto 76
      // 72: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 75: athrow
      // 76: aload 2
      // 77: invokevirtual com/finalshell/core/LJ.J$void ()V
      // 7a: aload 2
      // 7b: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // 7e: getfield com/finalshell/core/UR.z Lcom/finalshell/core/Rdp;
      // 81: aload 2
      // 82: getfield com/finalshell/core/LJ.r I
      // 85: aload 2
      // 86: invokevirtual com/finalshell/core/LJ.l ()I
      // 89: invokevirtual com/finalshell/core/Rdp.u (II)V
      // 8c: aload 2
      // 8d: invokevirtual com/finalshell/core/LJ.l ()I
      // 90: aload 1
      // 91: ifnull d2
      // 94: goto 9b
      // 97: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 9a: athrow
      // 9b: getstatic com/finalshell/core/Yh2.X I
      // 9e: getstatic com/finalshell/core/Yh2.q I
      // a1: iadd
      // a2: if_icmpge c8
      // a5: goto ac
      // a8: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // ab: athrow
      // ac: aload 2
      // ad: aload 0
      // ae: aload 2
      // af: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // b2: invokevirtual com/finalshell/task/Mo2.g (Lcom/finalshell/core/UR;)J
      // b5: invokevirtual com/finalshell/core/LJ.C (J)V
      // b8: aload 0
      // b9: getfield com/finalshell/task/Mo2.A Ljava/util/concurrent/LinkedBlockingQueue;
      // bc: aload 2
      // bd: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // c0: pop
      // c1: goto c8
      // c4: invokestatic com/finalshell/task/Mo2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c7: athrow
      // c8: aload 2
      // c9: getfield com/finalshell/core/LJ.t Lcom/finalshell/core/UR;
      // cc: getfield com/finalshell/core/UR.B Lcom/finalshell/core/B2;
      // cf: getfield com/finalshell/core/B2.m Z
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

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5663622085784394973L;
      long var10002 = 5663622085784395573L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





