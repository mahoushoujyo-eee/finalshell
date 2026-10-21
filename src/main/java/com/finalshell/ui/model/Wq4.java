package com.finalshell.ui.model;

import com.finalshell.core.Yz2_2;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.Serializable;
import java.util.List;

public class Wq4 implements Transferable, Serializable {
   protected final List j;
   final Yz2_2 n;

   public Wq4(Yz2_2 var1, List var2) {
      this.n = var1;
      this.j = var2;
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
      // 00: invokestatic com/finalshell/ui/model/CB3.C$arrString ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 25
      // 09: aload 1
      // 0a: invokevirtual com/finalshell/ui/model/Wq4.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z
      // 0d: ifne 24
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/model/Wq4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 16: athrow
      // 17: new java/awt/datatransfer/UnsupportedFlavorException
      // 1a: dup
      // 1b: aload 1
      // 1c: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 1f: athrow
      // 20: invokestatic com/finalshell/ui/model/Wq4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/finalshell/ui/model/Wq4.j Ljava/util/List;
      // 28: areturn
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return this.n.e;
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return this.n.q.equals(var1);
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





