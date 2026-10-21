import java.util.concurrent.LinkedBlockingQueue;

public class Tb_2 implements Runnable {
   boolean C = false;
   Object S = new Object();
   long E = 0L;
   LinkedBlockingQueue X = new LinkedBlockingQueue();

   public Tb_2() {
      lA_3.b.execute(this);
   }

   public void x(Qm_2 var1, int var2) {
      Lq_2 var3 = new Lq_2(var1, var2);
      var3.q(this.z(var1));
      this.X.add(var3);
   }

   long z(Qm_2 var1) {
      com.ky_4[] var10000 = Qm_2.J();
      int var3 = var1.d.s + (int)((float)var1.d.s * Cs_2.P);
      com.ky_4[] var2 = var10000;
      int var6 = var3;
      if (var2 != null) {
         if (var3 >= Cs_2.C) {
            return System.currentTimeMillis() + (long)var3;
         }

         var6 = Cs_2.C;
      }

      var3 = var6;
      return System.currentTimeMillis() + (long)var3;
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
      // 00: invokestatic Qm_2.J ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield Tb_2.X Ljava/util/concurrent/LinkedBlockingQueue;
      // 08: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 0b: checkcast Lq_2
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield Lq_2.V LQm_2;
      // 13: invokevirtual Qm_2.Z ()Z
      // 16: ifeq c4
      // 19: aload 2
      // 1a: invokevirtual Lq_2.V ()J
      // 1d: invokestatic java/lang/System.currentTimeMillis ()J
      // 20: lsub
      // 21: lstore 3
      // 22: aload 1
      // 23: ifnull 42
      // 26: lload 3
      // 27: lconst_0
      // 28: lcmp
      // 29: ifle 3e
      // 2c: goto 33
      // 2f: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 32: athrow
      // 33: lload 3
      // 34: invokestatic java/lang/Thread.sleep (J)V
      // 37: goto 3e
      // 3a: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3d: athrow
      // 3e: aload 2
      // 3f: invokevirtual Lq_2.g ()V
      // 42: aload 2
      // 43: aload 1
      // 44: ifnull 94
      // 47: getfield Lq_2.V LQm_2;
      // 4a: getfield Qm_2.J Lx1;
      // 4d: aload 2
      // 4e: getfield Lq_2.h I
      // 51: invokevirtual x1.Y (I)LVw_2;
      // 54: ifnull 93
      // 57: goto 5e
      // 5a: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 5d: athrow
      // 5e: aload 2
      // 5f: getfield Lq_2.V LQm_2;
      // 62: getfield Qm_2.Q Z
      // 65: aload 1
      // 66: ifnull 97
      // 69: goto 70
      // 6c: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6f: athrow
      // 70: ifne 93
      // 73: goto 7a
      // 76: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 79: athrow
      // 7a: aload 2
      // 7b: getfield Lq_2.V LQm_2;
      // 7e: getfield Qm_2.J Lx1;
      // 81: aload 2
      // 82: getfield Lq_2.h I
      // 85: aload 2
      // 86: invokevirtual Lq_2.H ()I
      // 89: invokevirtual x1.T (II)V
      // 8c: goto 93
      // 8f: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 92: athrow
      // 93: aload 2
      // 94: invokevirtual Lq_2.H ()I
      // 97: aload 1
      // 98: ifnull ce
      // 9b: getstatic Cs_2.h I
      // 9e: if_icmpge c4
      // a1: goto a8
      // a4: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // a7: athrow
      // a8: aload 2
      // a9: aload 0
      // aa: aload 2
      // ab: getfield Lq_2.V LQm_2;
      // ae: invokevirtual Tb_2.z (LQm_2;)J
      // b1: invokevirtual Lq_2.q (J)V
      // b4: aload 0
      // b5: getfield Tb_2.X Ljava/util/concurrent/LinkedBlockingQueue;
      // b8: aload 2
      // b9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // bc: pop
      // bd: goto c4
      // c0: invokestatic Tb_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c3: athrow
      // c4: aload 2
      // c5: getfield Lq_2.V LQm_2;
      // c8: getfield Qm_2.d Lf9_2;
      // cb: getfield f9_2.u Z
      // ce: ifeq 04
      // d1: aload 1
      // d2: ifnull c4
      // d5: goto e0
      // d8: astore 2
      // d9: aload 2
      // da: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // dd: goto 04
      // e0: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





