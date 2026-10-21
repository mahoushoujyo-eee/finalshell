package com.finalshell.core;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class EB implements Transferable {
   final WQ3 O;

   EB(WQ3 var1) {
      this.O = var1;
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return WQ3.r();
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return var1.equals(DataFlavor.imageFlavor);
   }

   @Override
   public Object getTransferData(DataFlavor param1) throws UnsupportedFlavorException, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/EY.P$int ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1f
      // 09: aload 1
      // 0a: invokevirtual com/finalshell/core/EB.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z
      // 0d: ifeq 26
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/EB.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/EB.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1e: athrow
      // 1f: getfield com/finalshell/core/EB.O Lcom/finalshell/core/WQ3;
      // 22: invokestatic com/finalshell/core/WQ3.Y (Lcom/finalshell/core/WQ3;)Ljava/awt/image/BufferedImage;
      // 25: areturn
      // 26: aconst_null
      // 27: areturn
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





