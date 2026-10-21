package com.finalshell.task;

import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class Bl2 implements Runnable {
   long n;
   final SetBackgroundImagePanel u;
   public static String a;

   Bl2(SetBackgroundImagePanel var1) {
      this.u = var1;
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.M$int ()I
      // 03: aload 0
      // 04: getfield com/finalshell/task/Bl2.u Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 19
      // 0e: ifnull f9
      // 11: goto 18
      // 14: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.isShowing ()Z
      // 1c: iload 1
      // 1d: ifeq 50
      // 20: ifeq f9
      // 23: goto 2a
      // 26: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.D (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Lcom/finalshell/core/D__2;
      // 2e: invokevirtual com/finalshell/core/D__2.F ()V
      // 31: aload 2
      // 32: bipush 0
      // 33: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.H (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Z)V
      // 36: aload 2
      // 37: iload 1
      // 38: ifeq 5e
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.p (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Ljava/util/concurrent/atomic/AtomicBoolean;
      // 45: bipush 0
      // 46: invokevirtual java/util/concurrent/atomic/AtomicBoolean.getAndSet (Z)Z
      // 49: goto 50
      // 4c: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: ifeq f2
      // 53: aload 0
      // 54: getfield com/finalshell/task/Bl2.u Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: invokestatic javax/swing/SwingUtilities.windowForComponent (Ljava/awt/Component;)Ljava/awt/Window;
      // 61: astore 3
      // 62: bipush 0
      // 63: istore 4
      // 65: aload 3
      // 66: instanceof com/finalshell/ui/frame/U
      // 69: iload 1
      // 6a: ifeq bc
      // 6d: ifeq b8
      // 70: goto 77
      // 73: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 3
      // 78: checkcast com/finalshell/ui/frame/U
      // 7b: astore 5
      // 7d: aload 0
      // 7e: getfield com/finalshell/task/Bl2.u Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 81: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 84: aload 5
      // 86: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 89: ldc2_w 179934491990092343
      // 8c: astore 9
      // 8e: astore 8
      // 90: ldc2_w 179934491990092343
      // 93: aload 8
      // 95: aload 9
      // 97: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9a: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 9d: goto a4
      // a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a3: athrow
      // a4: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // a7: iload 1
      // a8: ifeq bc
      // ab: ifeq b8
      // ae: goto b5
      // b1: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4: athrow
      // b5: bipush 1
      // b6: istore 4
      // b8: aload 3
      // b9: instanceof com/finalshell/ui/dialog/U1
      // bc: iload 1
      // bd: ifeq cf
      // c0: ifeq cd
      // c3: goto ca
      // c6: invokestatic com/finalshell/task/Bl2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: bipush 1
      // cb: istore 4
      // cd: iload 4
      // cf: ifeq f2
      // d2: invokestatic java/lang/System.currentTimeMillis ()J
      // d5: lstore 5
      // d7: aload 2
      // d8: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.V (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)V
      // db: goto f2
      // de: astore 7
      // e0: aload 7
      // e2: invokevirtual java/lang/Exception.printStackTrace ()V
      // e5: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.t$Logger ()Lorg/slf4j/Logger;
      // e8: getstatic com/finalshell/task/Bl2.a Ljava/lang/String;
      // eb: aload 7
      // ed: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // f2: aload 0
      // f3: invokestatic java/lang/System.currentTimeMillis ()J
      // f6: putfield com/finalshell/task/Bl2.n J
      // f9: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0013j\u0002Y[UN>q\u001cS\t\u0001\\$u\u0019XH\u0019\u0019&y\u001eSEUK3|\u0002W^".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 23;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      } else {
         var6 = 23;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 65;
               break;
            case 1:
               var23 = 15;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 33;
               break;
            case 4:
               var23 = 62;
               break;
            case 5:
               var23 = 98;
               break;
            default:
               var23 = 46;
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





