package com.finalshell.ui.listener;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.ui.dialog.AW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tt4 implements ActionListener {
   public final AW w;

   public Tt4(AW var1) {
      this.w = var1;
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
      // 00: invokestatic com/finalshell/ui/dialog/DU.u ()[I
      // 03: astore 2
      // 04: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 07: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 0f: aload 2
      // 10: ifnull 2b
      // 13: invokevirtual java/awt/datatransfer/Clipboard.isDataFlavorAvailable (Ljava/awt/datatransfer/DataFlavor;)Z
      // 16: ifeq 70
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/listener/Tt4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 3
      // 21: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 24: goto 2b
      // 27: invokestatic com/finalshell/ui/listener/Tt4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: invokevirtual java/awt/datatransfer/Clipboard.getData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
      // 2e: checkcast java/lang/String
      // 31: astore 4
      // 33: aload 0
      // 34: ldc2_w 181688419079834339
      // 37: astore 5
      // 39: ldc2_w 181688419079834339
      // 3c: aload 5
      // 3e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 41: ldc2_w 220378371334645424
      // 44: astore 7
      // 46: ldc2_w 220378371334645424
      // 49: aload 7
      // 4b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4e: checkcast javax/swing/JTextField
      // 51: aload 4
      // 53: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 56: ldc2_w 492016222988846142
      // 59: astore 9
      // 5b: ldc2_w 492016222988846142
      // 5e: aload 9
      // 60: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 63: checkcast java/lang/String
      // 66: goto 6d
      // 69: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: invokevirtual javax/swing/JTextField.setText (Ljava/lang/String;)V
      // 70: goto 74
      // 73: astore 3
      // 74: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





