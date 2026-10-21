import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class tt_4 implements ActionListener {
   final aW w;

   tt_4(aW var1) {
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
      // 00: invokestatic DU.u ()[I
      // 03: astore 2
      // 04: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 07: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 0f: aload 2
      // 10: ifnull 2b
      // 13: invokevirtual java/awt/datatransfer/Clipboard.isDataFlavorAvailable (Ljava/awt/datatransfer/DataFlavor;)Z
      // 16: ifeq 69
      // 19: goto 20
      // 1c: invokestatic tt_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 3
      // 21: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 24: goto 2b
      // 27: invokestatic tt_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: invokevirtual java/awt/datatransfer/Clipboard.getData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
      // 2e: checkcast java/lang/String
      // 31: astore 4
      // 33: aload 0
      // 34: ldc2_w 181688419079834339
      // 37: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3a: swap
      // 3b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3e: ldc2_w 220378371334645424
      // 41: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 44: swap
      // 45: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 48: checkcast javax/swing/JTextField
      // 4b: aload 4
      // 4d: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 50: ldc2_w 492016222988846142
      // 53: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 56: swap
      // 57: aconst_null
      // 58: swap
      // 59: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5c: checkcast java/lang/String
      // 5f: goto 66
      // 62: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65: athrow
      // 66: invokevirtual javax/swing/JTextField.setText (Ljava/lang/String;)V
      // 69: goto 6d
      // 6c: astore 3
      // 6d: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





