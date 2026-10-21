package com.finalshell.task;

import com.finalshell.core.Cs2;
import com.finalshell.core.LA3;
import com.finalshell.core.Lq2;
import com.finalshell.core.Qm2;
import java.util.concurrent.LinkedBlockingQueue;

public class Tb2 implements Runnable {
   boolean C = false;
   Object S = new Object();
   long E = 0L;
   LinkedBlockingQueue X = new LinkedBlockingQueue();

   public Tb2() {
      LA3.b.execute(this);
   }

   public void x(Qm2 var1, int var2) {
      Lq2 var3 = new Lq2(var1, var2);
      var3.q(this.z(var1));
      this.X.add(var3);
   }

   long z(Qm2 var1) {
      com.finalshell.ui.panel.Ky4[] var10000 = Qm2.J();
      int var3 = var1.d.s + (int)((float)var1.d.s * Cs2.P);
      com.finalshell.ui.panel.Ky4[] var2 = var10000;
      int var6 = var3;
      if (var2 != null) {
         if (var3 >= Cs2.C) {
            return System.currentTimeMillis() + (long)var3;
         }

         var6 = Cs2.C;
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
      // 00: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/task/Tb2.X Ljava/util/concurrent/LinkedBlockingQueue;
      // 08: invokevirtual java/util/concurrent/LinkedBlockingQueue.take ()Ljava/lang/Object;
      // 0b: checkcast com/finalshell/core/Lq2
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // 13: invokevirtual com/finalshell/core/Qm2.Z ()Z
      // 16: ifeq c4
      // 19: aload 2
      // 1a: invokevirtual com/finalshell/core/Lq2.V ()J
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
      // 2f: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 32: athrow
      // 33: lload 3
      // 34: invokestatic java/lang/Thread.sleep (J)V
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3d: athrow
      // 3e: aload 2
      // 3f: invokevirtual com/finalshell/core/Lq2.g ()V
      // 42: aload 2
      // 43: aload 1
      // 44: ifnull 94
      // 47: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // 4a: getfield com/finalshell/core/Qm2.J Lcom/finalshell/core/Rdp2;
      // 4d: aload 2
      // 4e: getfield com/finalshell/core/Lq2.h I
      // 51: invokevirtual com/finalshell/core/Rdp2.Y (I)Lcom/finalshell/core/Vw2;
      // 54: ifnull 93
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 5d: athrow
      // 5e: aload 2
      // 5f: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // 62: getfield com/finalshell/core/Qm2.Q Z
      // 65: aload 1
      // 66: ifnull 97
      // 69: goto 70
      // 6c: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6f: athrow
      // 70: ifne 93
      // 73: goto 7a
      // 76: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 79: athrow
      // 7a: aload 2
      // 7b: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // 7e: getfield com/finalshell/core/Qm2.J Lcom/finalshell/core/Rdp2;
      // 81: aload 2
      // 82: getfield com/finalshell/core/Lq2.h I
      // 85: aload 2
      // 86: invokevirtual com/finalshell/core/Lq2.H ()I
      // 89: invokevirtual com/finalshell/core/Rdp2.T (II)V
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 92: athrow
      // 93: aload 2
      // 94: invokevirtual com/finalshell/core/Lq2.H ()I
      // 97: aload 1
      // 98: ifnull ce
      // 9b: getstatic com/finalshell/core/Cs2.h I
      // 9e: if_icmpge c4
      // a1: goto a8
      // a4: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // a7: athrow
      // a8: aload 2
      // a9: aload 0
      // aa: aload 2
      // ab: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // ae: invokevirtual com/finalshell/task/Tb2.z (Lcom/finalshell/core/Qm2;)J
      // b1: invokevirtual com/finalshell/core/Lq2.q (J)V
      // b4: aload 0
      // b5: getfield com/finalshell/task/Tb2.X Ljava/util/concurrent/LinkedBlockingQueue;
      // b8: aload 2
      // b9: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // bc: pop
      // bd: goto c4
      // c0: invokestatic com/finalshell/task/Tb2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c3: athrow
      // c4: aload 2
      // c5: getfield com/finalshell/core/Lq2.V Lcom/finalshell/core/Qm2;
      // c8: getfield com/finalshell/core/Qm2.d Lcom/finalshell/core/F92;
      // cb: getfield com/finalshell/core/F92.u Z
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

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





