package com.finalshell.ui.listener;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

public class NT3 implements ActionListener {
   public WeakReference y;
   public long O;
   public final SetBackgroundImagePanel R;
   public static String a;

   public NT3(SetBackgroundImagePanel var1, SetBackgroundImagePanel var2) {
      this.R = var1;
      this.y = new WeakReference<>(var2);
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: getfield com/finalshell/ui/listener/NT3.y Ljava/lang/ref/WeakReference;
      // 07: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 0a: checkcast com/finalshell/ui/panel/SetBackgroundImagePanel
      // 0d: astore 3
      // 0e: istore 2
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne d8
      // 14: ifnull cd
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 3
      // 1f: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.D (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Lcom/finalshell/core/D__2;
      // 22: invokevirtual com/finalshell/core/D__2.F ()V
      // 25: aload 3
      // 26: bipush 0
      // 27: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.H (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;Z)V
      // 2a: iload 2
      // 2b: ifne c9
      // 2e: goto 35
      // 31: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 3
      // 36: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.p (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Ljava/util/concurrent/atomic/AtomicBoolean;
      // 39: bipush 0
      // 3a: invokevirtual java/util/concurrent/atomic/AtomicBoolean.getAndSet (Z)Z
      // 3d: ifeq c2
      // 40: goto 47
      // 43: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/finalshell/ui/listener/NT3.R Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 4b: invokestatic javax/swing/SwingUtilities.windowForComponent (Ljava/awt/Component;)Ljava/awt/Window;
      // 4e: astore 4
      // 50: iload 2
      // 51: ifne c9
      // 54: aload 4
      // 56: instanceof com/finalshell/ui/frame/U
      // 59: ifeq c2
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 4
      // 65: checkcast com/finalshell/ui/frame/U
      // 68: astore 5
      // 6a: aload 0
      // 6b: iload 2
      // 6c: ifne c3
      // 6f: getfield com/finalshell/ui/listener/NT3.R Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 72: getfield com/finalshell/ui/panel/SetBackgroundImagePanel.L Lcom/finalshell/ui/panel/ConnectionProperty;
      // 75: aload 5
      // 77: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7a: ldc2_w 179934491990092343
      // 7d: astore 10
      // 7f: astore 9
      // 81: ldc2_w 179934491990092343
      // 84: aload 9
      // 86: aload 10
      // 88: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8b: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 8e: goto 95
      // 91: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 94: athrow
      // 95: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 98: ifeq c2
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: invokestatic java/lang/System.currentTimeMillis ()J
      // a5: lstore 6
      // a7: aload 3
      // a8: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.V (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)V
      // ab: goto c2
      // ae: astore 8
      // b0: aload 8
      // b2: invokevirtual java/lang/Exception.printStackTrace ()V
      // b5: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.t$Logger ()Lorg/slf4j/Logger;
      // b8: getstatic com/finalshell/ui/listener/NT3.a Ljava/lang/String;
      // bb: aload 8
      // bd: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // c2: aload 0
      // c3: invokestatic java/lang/System.currentTimeMillis ()J
      // c6: putfield com/finalshell/ui/listener/NT3.O J
      // c9: iload 2
      // ca: ifeq e8
      // cd: aload 1
      // ce: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // d1: goto d8
      // d4: invokestatic com/finalshell/ui/listener/NT3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d7: athrow
      // d8: checkcast javax/swing/Timer
      // db: astore 4
      // dd: aload 4
      // df: aload 0
      // e0: invokevirtual javax/swing/Timer.removeActionListener (Ljava/awt/event/ActionListener;)V
      // e3: aload 4
      // e5: invokevirtual javax/swing/Timer.stop ()V
      // e8: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





