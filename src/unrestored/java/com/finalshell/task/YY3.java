package com.finalshell.task;
import com.finalshell.reflect.Registry;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.FileBrowserAddressBar;

public class YY3 implements Runnable {
   public String I;
   public final FileBrowserAddressBar L;
   public static String a;

   public YY3(FileBrowserAddressBar var1) {
      this.L = var1;
      long var3 = 418566300718631713L;
      Object var2 = null;
      Ref.s(418566300718631713L, var2, var3);
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
      // 000: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 003: aload 0
      // 004: ldc2_w 216006756334095373
      // 007: astore 5
      // 009: ldc2_w 216006756334095373
      // 00c: aload 5
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: ldc2_w 592875533914623126
      // 014: astore 7
      // 016: ldc2_w 592875533914623126
      // 019: aload 7
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: checkcast javax/swing/JButton
      // 021: bipush 0
      // 022: invokevirtual javax/swing/JButton.setEnabled (Z)V
      // 025: istore 1
      // 026: aload 0
      // 027: ldc2_w 216006756334095373
      // 02a: astore 9
      // 02c: ldc2_w 216006756334095373
      // 02f: aload 9
      // 031: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 034: ldc2_w 460354311900945697
      // 037: astore 11
      // 039: ldc2_w 460354311900945697
      // 03c: aload 11
      // 03e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 041: checkcast com/finalshell/connection/Connection12
      // 044: astore 2
      // 045: aload 0
      // 046: ldc2_w 216006756334095373
      // 049: astore 13
      // 04b: ldc2_w 216006756334095373
      // 04e: aload 13
      // 050: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 053: ldc2_w 130333487516543213
      // 056: astore 15
      // 058: ldc2_w 130333487516543213
      // 05b: aload 15
      // 05d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 060: checkcast java/lang/String
      // 063: astore 3
      // 064: aload 2
      // 065: aload 3
      // 066: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 069: ldc2_w 276206147642460148
      // 06c: astore 18
      // 06e: astore 17
      // 070: ldc2_w 276206147642460148
      // 073: aload 17
      // 075: aload 18
      // 077: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07a: checkcast com/finalshell/ui/model/Tf4
      // 07d: goto 084
      // 080: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 083: athrow
      // 084: astore 4
      // 086: new com/finalshell/task/CE3
      // 089: dup
      // 08a: aload 0
      // 08b: aload 4
      // 08d: invokespecial com/finalshell/task/CE3.<init> (Lcom/finalshell/task/YY3;Lcom/finalshell/ui/model/Tf4;)V
      // 090: invokestatic javax/swing/SwingUtilities.invokeAndWait (Ljava/lang/Runnable;)V
      // 093: goto 0c4
      // 096: astore 4
      // 098: aload 4
      // 09a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 09d: aload 0
      // 09e: new java/lang/StringBuilder
      // 0a1: dup
      // 0a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a5: getstatic com/finalshell/task/YY3.a Ljava/lang/String;
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: aload 4
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b3: ldc2_w 418566300718631713
      // 0b6: astore 20
      // 0b8: astore 19
      // 0ba: ldc2_w 418566300718631713
      // 0bd: aload 19
      // 0bf: aload 20
      // 0c1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c4: aload 0
      // 0c5: iload 1
      // 0c6: ifne 110
      // 0c9: ldc2_w 418566300718631713
      // 0cc: astore 21
      // 0ce: ldc2_w 418566300718631713
      // 0d1: aload 21
      // 0d3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d6: checkcast java/lang/String
      // 0d9: ifnull 10f
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/task/YY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: ldc2_w 216006756334095373
      // 0e7: astore 23
      // 0e9: ldc2_w 216006756334095373
      // 0ec: aload 23
      // 0ee: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f1: checkcast com/finalshell/ui/panel/Address
      // 0f4: aload 0
      // 0f5: ldc2_w 418566300718631713
      // 0f8: astore 25
      // 0fa: ldc2_w 418566300718631713
      // 0fd: aload 25
      // 0ff: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 102: checkcast java/lang/String
      // 105: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/task/YY3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: ldc2_w 216006756334095373
      // 113: astore 27
      // 115: ldc2_w 216006756334095373
      // 118: aload 27
      // 11a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11d: ldc2_w 592875533914623126
      // 120: astore 29
      // 122: ldc2_w 592875533914623126
      // 125: aload 29
      // 127: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast javax/swing/JButton
      // 12d: bipush 1
      // 12e: invokevirtual javax/swing/JButton.setEnabled (Z)V
      // 131: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "初斻奒赸\u001bW".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 43;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      } else {
         var6 = 43;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 1;
               break;
            case 1:
               var23 = 32;
               break;
            case 2:
               var23 = 72;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 17;
               break;
            case 5:
               var23 = 118;
               break;
            default:
               var23 = 58;
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





