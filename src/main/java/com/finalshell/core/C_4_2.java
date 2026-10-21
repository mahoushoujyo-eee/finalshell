package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class C_4_2 implements Transferable {
   public static DataFlavor[] U;
   public final List o;

   public C_4_2(File var1) {
      int var10000 = NV_2.V();
      this(Arrays.asList(var1));
      int var2 = var10000;
      if (Ky4.F$arrString() != null) {
         NV_2.g(++var2);
      }
   }

   public C_4_2(List var1) {
      this.o = var1;
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return U;
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      DataFlavor[] var3 = U;
      int var4 = var3.length;
      int var10000 = NV_2.b();
      int var5 = 0;
      int var2 = var10000;

      while (true) {
         if (var5 < var4) {
            DataFlavor var6 = var3[var5];
            if (var2 == 0) {
               var7 = var6.equals(var1);
               if (var2 != 0) {
                  break;
               }

               if (var7) {
                  return true;
               }

               var5++;
            }

            if (var2 == 0) {
               continue;
            }

            Ky4.K(new String[1]);
         }

         var7 = false;
         break;
      }

      return var7;
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
      // 00: invokestatic com/finalshell/core/NV_2.V ()I
      // 03: istore 2
      // 04: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor Ljava/awt/datatransfer/DataFlavor;
      // 07: aload 1
      // 08: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 0b: iload 2
      // 0c: ifeq 29
      // 0f: ifeq 22
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/C_4_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/C_4_2.o Ljava/util/List;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/C_4_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 21: athrow
      // 22: invokestatic com/finalshell/core/PG.v ()Ljava/awt/datatransfer/DataFlavor;
      // 25: aload 1
      // 26: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 29: ifeq 38
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/C_4_2.o Ljava/util/List;
      // 30: invokestatic com/finalshell/core/PG.p (Ljava/util/List;)Ljava/lang/String;
      // 33: areturn
      // 34: invokestatic com/finalshell/core/C_4_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 37: athrow
      // 38: aconst_null
      // 39: areturn
   }

   static {
      __vfClinit__();
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      U = new DataFlavor[]{DataFlavor.javaFileListFlavor, PG.v()};
   }
}





