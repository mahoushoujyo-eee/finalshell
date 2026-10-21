import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.tree.DefaultMutableTreeNode;

public class TH implements Transferable {
   DefaultMutableTreeNode[] M;
   final Wa_2 e;

   public TH(Wa_2 var1, DefaultMutableTreeNode[] var2) {
      this.e = var1;
      com.c.c(507890315163233410L).set(this, var2);
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
      // 00: invokestatic aA.z ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 3d
      // 09: aload 1
      // 0a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 171426505168582456
      // 10: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 13: dup_x2
      // 14: pop
      // 15: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18: checkcast java/lang/Boolean
      // 1b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e: goto 25
      // 21: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifne 3c
      // 28: goto 2f
      // 2b: invokestatic TH.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 2e: athrow
      // 2f: new java/awt/datatransfer/UnsupportedFlavorException
      // 32: dup
      // 33: aload 1
      // 34: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 37: athrow
      // 38: invokestatic TH.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 507890315163233410
      // 40: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 43: swap
      // 44: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 47: checkcast [Ljavax/swing/tree/DefaultMutableTreeNode;
      // 4a: areturn
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return (DataFlavor[])com.c.c(151856102573410630L).get(com.c.c(604893005071395676L).get(this));
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return ((DataFlavor)com.c.c(387411512747640120L).get(com.c.c(604893005071395676L).get(this))).equals(var1);
   }

   private static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





