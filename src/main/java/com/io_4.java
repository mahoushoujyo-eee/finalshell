package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class io_4 implements PropertyChangeListener {
   final com.a9 U;
   private static final String a;

   io_4(com.a9 var1) {
      this.U = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/xD_3.U ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/beans/PropertyChangeEvent.getPropertyName ()Ljava/lang/String;
      // 08: getstatic com/io_4.a Ljava/lang/String;
      // 0b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e: aload 2
      // 0f: ifnonnull 2a
      // 12: ifeq 7c
      // 15: goto 1c
      // 18: invokestatic com/io_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/beans/PropertyChangeEvent.getNewValue ()Ljava/lang/Object;
      // 20: instanceof com/a9
      // 23: goto 2a
      // 26: invokestatic com/io_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: ifnonnull 48
      // 2e: ifeq 78
      // 31: goto 38
      // 34: invokestatic com/io_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: invokestatic com/a9.w ()Z
      // 3b: invokestatic javax/swing/JFrame.setDefaultLookAndFeelDecorated (Z)V
      // 3e: invokestatic com/a9.n ()Z
      // 41: goto 48
      // 44: invokestatic com/io_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: invokestatic javax/swing/JDialog.setDefaultLookAndFeelDecorated (Z)V
      // 4b: ldc com/Sj_2
      // 4d: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 50: ldc com/m/p_2
      // 52: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 55: ldc com/m/b_2
      // 57: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 5a: ldc com/Ed_2
      // 5c: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 5f: ldc com/PV
      // 61: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 64: ldc com/t/A
      // 66: invokestatic com/PM.m (Ljava/lang/Class;)V
      // 69: invokestatic com/a9.v ()V
      // 6c: new javax/swing/JSpinner
      // 6f: dup
      // 70: invokespecial javax/swing/JSpinner.<init> ()V
      // 73: pop
      // 74: goto 78
      // 77: astore 3
      // 78: aload 0
      // 79: invokestatic javax/swing/UIManager.removePropertyChangeListener (Ljava/beans/PropertyChangeListener;)V
      // 7c: return
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u00125Xe=vB8?Rb".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 62;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 62;
         var10006 = var0;
      } else {
         var6 = 62;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 62;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 64;
               break;
            case 1:
               var23 = 100;
               break;
            case 2:
               var23 = 9;
               break;
            case 3:
               var23 = 48;
               break;
            case 4:
               var23 = 66;
               break;
            case 5:
               var23 = 38;
               break;
            default:
               var23 = 24;
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





