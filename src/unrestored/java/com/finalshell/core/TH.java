package com.finalshell.core;
import com.finalshell.reflect.Registry;

import com.finalshell.reflect.Ref;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.tree.DefaultMutableTreeNode;

public class TH implements Transferable {
   public DefaultMutableTreeNode[] M;
   public final Wa2 e;

   public TH(Wa2 var1, DefaultMutableTreeNode[] var2) {
      this.e = var1;
      long var4 = 507890315163233410L;
      Ref.s(507890315163233410L, var2, var4);
   }

   @Override
   public Object getTransferData(DataFlavor param1) throws UnsupportedFlavorException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 41
      // 09: aload 1
      // 0a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 171426505168582456
      // 10: astore 4
      // 12: astore 3
      // 13: ldc2_w 171426505168582456
      // 16: aload 3
      // 17: aload 4
      // 19: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c: checkcast java/lang/Boolean
      // 1f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 22: goto 29
      // 25: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28: athrow
      // 29: ifne 40
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/TH.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 32: athrow
      // 33: new java/awt/datatransfer/UnsupportedFlavorException
      // 36: dup
      // 37: aload 1
      // 38: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 3b: athrow
      // 3c: invokestatic com/finalshell/core/TH.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3f: athrow
      // 40: aload 0
      // 41: ldc2_w 507890315163233410
      // 44: astore 5
      // 46: ldc2_w 507890315163233410
      // 49: aload 5
      // 4b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4e: checkcast [Ljavax/swing/tree/DefaultMutableTreeNode;
      // 51: areturn
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      Object var1 = 604893005071395676L;
      Ref.g(604893005071395676L, var1);
      Object var3 = 151856102573410630L;
      return (DataFlavor[])Ref.g(151856102573410630L, var3);
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      Object var2 = 604893005071395676L;
      Ref.g(604893005071395676L, var2);
      Object var4 = 387411512747640120L;
      return ((DataFlavor)Ref.g(387411512747640120L, var4)).equals(var1);
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





