package com.finalshell.ui.listener;

import com.finalshell.core.AW;
import com.finalshell.core.QT;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@Deprecated(
   forRemoval = true
)
public final class PN implements AW, KeyListener {
   public final Object K = new Object();
   public final QT b;
   public StringBuffer L;
   public boolean A;
   public static long a;

   public PN(QT var1) {
      this.b = var1;
      this.A = true;
   }

   @Override
   public String k(String var1) {
      this.A = false;
      String var2 = this.S(var1, null);
      this.A = true;
      return var2;
   }

   @Override
   public String S(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/listener/PN.K Ljava/lang/Object;
      // 07: dup
      // 08: astore 4
      // 0a: monitorenter
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield com/finalshell/ui/listener/PN.b Lcom/finalshell/core/QT;
      // 10: aload 1
      // 11: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 16: aload 0
      // 17: new java/lang/StringBuffer
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuffer.<init> ()V
      // 1e: putfield com/finalshell/ui/listener/PN.L Ljava/lang/StringBuffer;
      // 21: aload 2
      // 22: iload 3
      // 23: ifne 4e
      // 26: ifnull 4a
      // 29: goto 30
      // 2c: invokestatic com/finalshell/ui/listener/PN.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/finalshell/ui/listener/PN.L Ljava/lang/StringBuffer;
      // 34: aload 2
      // 35: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 38: pop
      // 39: aload 0
      // 3a: getfield com/finalshell/ui/listener/PN.b Lcom/finalshell/core/QT;
      // 3d: aload 2
      // 3e: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 43: goto 4a
      // 46: invokestatic com/finalshell/ui/listener/PN.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield com/finalshell/ui/listener/PN.K Ljava/lang/Object;
      // 4e: invokevirtual java/lang/Object.wait ()V
      // 51: goto 5b
      // 54: astore 5
      // 56: aload 5
      // 58: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 5b: aload 0
      // 5c: getfield com/finalshell/ui/listener/PN.L Ljava/lang/StringBuffer;
      // 5f: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 62: astore 5
      // 64: aload 0
      // 65: aconst_null
      // 66: putfield com/finalshell/ui/listener/PN.L Ljava/lang/StringBuffer;
      // 69: aload 5
      // 6b: aload 4
      // 6d: monitorexit
      // 6e: areturn
      // 6f: astore 6
      // 71: aload 4
      // 73: monitorexit
      // 74: aload 6
      // 76: athrow
   }

   @Override
   public void U(String var1) {
      this.b.a(var1);
      this.b.K();
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      byte var7;
      int var2 = ConnectionProperty.M$int();
      Object var10000 = this.L;
      if (var2 != 0) {
         if (this.L == null) {
            return;
         }

         var10000 = this.K;
      }

      synchronized (var10000) {
         byte var4 = 0;
         var7 = (byte)(var1.getKeyCode());
         label39:
         if (var2 != 0) {
            switch (var7) {
               case 8:
                  var7 = (byte)(this.L.length());
                  if (var2 == 0) {
                     break label39;
                  }

                  if (var7 <= 0) {
                     break;
                  }

                  this.b.Q();
                  this.b.b(0);
                  this.L.deleteCharAt(this.L.length() - 1);
                  if (var2 != 0) {
                     break;
                  }
               case 10:
                  this.b.K();
                  var4 = 1;
            }

            var7 = var4;
         }

         if (var7 != 0) {
            this.K.notifyAll();
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      int var2 = ConnectionProperty.y();
      if (this.L != null) {
         char var3;
         PN var4;
         label30: {
            var3 = var1.getKeyChar();
            int var10000 = Character.getType(var3);
            if (var2 == 0) {
               if (var10000 == (int)a) {
                  return;
               }

               var4 = this;
               if (var2 != 0) {
                  break label30;
               }

               var10000 = (this.A) ? 1 : 0;
            }

            if (var10000 != 0) {
               this.b.k(Character.toString(var3));
            }

            var4 = this;
         }

         var4.L.append(var3);
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8889063918216737247L;
      long var10002 = 1151477886894272976L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





