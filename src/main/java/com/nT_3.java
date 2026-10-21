package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

class nT_3 implements ActionListener {
   private WeakReference y;
   long O;
   final pA_3 R;
   private static final String a;

   public nT_3(pA_3 var1, pA_3 var2) {
      this.R = var1;
      this.y = new WeakReference(var2);
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: getfield com/nT_3.y Ljava/lang/ref/WeakReference;
      // 07: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 0a: checkcast com/pA_3
      // 0d: astore 3
      // 0e: istore 2
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne d2
      // 14: ifnull c7
      // 17: goto 1e
      // 1a: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 3
      // 1f: invokestatic com/pA_3.D (Lcom/pA_3;)Lcom/d__2;
      // 22: invokevirtual com/d__2.F ()V
      // 25: aload 3
      // 26: bipush 0
      // 27: invokestatic com/pA_3.H (Lcom/pA_3;Z)V
      // 2a: iload 2
      // 2b: ifne c3
      // 2e: goto 35
      // 31: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 3
      // 36: invokestatic com/pA_3.p (Lcom/pA_3;)Ljava/util/concurrent/atomic/AtomicBoolean;
      // 39: bipush 0
      // 3a: invokevirtual java/util/concurrent/atomic/AtomicBoolean.getAndSet (Z)Z
      // 3d: ifeq bc
      // 40: goto 47
      // 43: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/nT_3.R Lcom/pA_3;
      // 4b: invokestatic javax/swing/SwingUtilities.windowForComponent (Ljava/awt/Component;)Ljava/awt/Window;
      // 4e: astore 4
      // 50: iload 2
      // 51: ifne c3
      // 54: aload 4
      // 56: instanceof U
      // 59: ifeq bc
      // 5c: goto 63
      // 5f: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 4
      // 65: checkcast U
      // 68: astore 5
      // 6a: aload 0
      // 6b: iload 2
      // 6c: ifne bd
      // 6f: getfield com/nT_3.R Lcom/pA_3;
      // 72: getfield com/pA_3.L Lcom/_y_2;
      // 75: aload 5
      // 77: invokestatic com/c.f ()[Ljava/lang/Object;
      // 7a: ldc2_w 179934491990092343
      // 7d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 80: dup_x2
      // 81: pop
      // 82: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 85: checkcast com/_y_2
      // 88: goto 8f
      // 8b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 92: ifeq bc
      // 95: goto 9c
      // 98: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: invokestatic java/lang/System.currentTimeMillis ()J
      // 9f: lstore 6
      // a1: aload 3
      // a2: invokestatic com/pA_3.V (Lcom/pA_3;)V
      // a5: goto bc
      // a8: astore 8
      // aa: aload 8
      // ac: invokevirtual java/lang/Exception.printStackTrace ()V
      // af: invokestatic com/pA_3.t ()Lorg/slf4j/Logger;
      // b2: getstatic com/nT_3.a Ljava/lang/String;
      // b5: aload 8
      // b7: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // bc: aload 0
      // bd: invokestatic java/lang/System.currentTimeMillis ()J
      // c0: putfield com/nT_3.O J
      // c3: iload 2
      // c4: ifeq e2
      // c7: aload 1
      // c8: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // cb: goto d2
      // ce: invokestatic com/nT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d1: athrow
      // d2: checkcast javax/swing/Timer
      // d5: astore 4
      // d7: aload 4
      // d9: aload 0
      // da: invokevirtual javax/swing/Timer.removeActionListener (Ljava/awt/event/ActionListener;)V
      // dd: aload 4
      // df: invokevirtual javax/swing/Timer.stop ()V
      // e2: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "$&Fwip\u0019\t=X};$\u000b\u00139]vz<N\u00115Z}wp\u001c\u00040Fyl".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 75;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      } else {
         var6 = 75;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 42;
               break;
            case 1:
               var23 = 31;
               break;
            case 2:
               var23 = 127;
               break;
            case 3:
               var23 = 83;
               break;
            case 4:
               var23 = 80;
               break;
            case 5:
               var23 = 27;
               break;
            default:
               var23 = 37;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





