package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class FV_2 {
   public static String v;

   public static Window L(Component var0) {
      String var1 = D();
      Component var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         if (var10000 instanceof Window) {
            return (Window)var0;
         }

         var10000 = var0;
      }

      Container var2 = var10000.getParent();

      while (var2 != null) {
         Container var3 = var2;
         if (var1 == null) {
            if (var2 instanceof Window) {
               return (Window)var2;
            }

            var3 = var2.getParent();
         }

         var2 = var3;
         if (var1 != null) {
            break;
         }
      }

      return null;
   }

   public static void p(Runnable var0) {
      label16: {
         String var1 = D();
         if (var1 == null) {
            if (!SwingUtilities.isEventDispatchThread()) {
               break label16;
            }

            var0.run();
         }

         if (var1 == null) {
            return;
         }
      }

      SwingUtilities.invokeLater(var0);
   }

   public static void T(Runnable param0) throws InterruptedException, InvocationTargetException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 1
      // 05: ifnonnull 22
      // 08: invokestatic javax/swing/SwingUtilities.isEventDispatchThread ()Z
      // 0b: ifeq 26
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/FV_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 14: athrow
      // 15: aload 0
      // 16: invokeinterface java/lang/Runnable.run ()V 1
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/FV_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 21: athrow
      // 22: aload 1
      // 23: ifnull 31
      // 26: aload 0
      // 27: invokestatic javax/swing/SwingUtilities.invokeAndWait (Ljava/lang/Runnable;)V
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/FV_2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 30: athrow
      // 31: return
   }

   public static void G(Runnable var0) {
      try {
         T(var0);
      } catch (Throwable var2) {
      }
   }

   public static void D(String var0) {
      v = var0;
   }

   public static String D() {
      return v;
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (D() != null) {
         D("gJ9Ic");
      }
   }
}





