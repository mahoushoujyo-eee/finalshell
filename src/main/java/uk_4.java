import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class uk_4 implements Transferable {
   Object[] j;
   DataFlavor G;
   DataFlavor[] A;
   final Yd_2 R;
   private static final String a;

   public uk_4(Yd_2 var1, Object[] var2) {
      this.R = var1;
      com.c.c(340773235516701023L).set(this, new DataFlavor[1]);
      com.c.c(168910181291744918L).set(this, var2);
      String var3 = a + Object.class.getName() + "\"";

      try {
         com.c.c(500870716948248309L).set(this, new DataFlavor(var3));
         ((DataFlavor[])com.c.c(340773235516701023L).get(this))[0] = (DataFlavor)com.c.c(500870716948248309L).get(this);
      } catch (ClassNotFoundException var5) {
         var5.printStackTrace();
      }
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
      // 00: invokestatic Km_2.U ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 3d
      // 09: aload 1
      // 0a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 521429674354691289
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
      // 2b: invokestatic uk_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 2e: athrow
      // 2f: new java/awt/datatransfer/UnsupportedFlavorException
      // 32: dup
      // 33: aload 1
      // 34: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 37: athrow
      // 38: invokestatic uk_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc2_w 168910181291744918
      // 40: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 43: swap
      // 44: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 47: checkcast [Ljava/lang/Object;
      // 4a: areturn
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return (DataFlavor[])com.c.c(340773235516701023L).get(this);
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return ((DataFlavor)com.c.c(500870716948248309L).get(this)).equals(var1);
   }

   private static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "1:8Z\u001e?t$#'XX$8:+>WZ6c=g$Y\u0014=y}%*\\\u0012?a\"/.\r\u00140t#9u\u0014".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 38;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 38;
         var10006 = var0;
      } else {
         var6 = 38;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 38;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 118;
               break;
            case 1:
               var23 = 108;
               break;
            case 2:
               var23 = 110;
               break;
            case 3:
               var23 = 16;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 122;
               break;
            default:
               var23 = 51;
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





