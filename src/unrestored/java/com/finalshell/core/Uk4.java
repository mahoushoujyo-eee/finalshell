package com.finalshell.core;

import com.finalshell.reflect.Ref;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class Uk4 implements Transferable {
   public Object[] j;
   public DataFlavor G;
   public DataFlavor[] A;
   public final Yd2 R;
   public static String a;

   public Uk4(Yd2 var1, Object[] var2) {
      this.R = var1;
      DataFlavor[] var10001 = new DataFlavor[1];
      long var6 = 340773235516701023L;
      DataFlavor[] var5 = var10001;
      Ref.s(340773235516701023L, var5, var6);
      long var8 = 168910181291744918L;
      Ref.s(168910181291744918L, var2, var8);
      String var3 = a + Object.class.getName() + "\"";

      try {
         DataFlavor var10003 = new DataFlavor(var3);
         long var10 = 500870716948248309L;
         DataFlavor var9 = var10003;
         Ref.s(500870716948248309L, var9, var10);
         Object var11 = 340773235516701023L;
         DataFlavor[] var10004 = (DataFlavor[])Ref.g(340773235516701023L, var11);
         Object var13 = 500870716948248309L;
         ((Object[])false)[this] = (boolean)((DataFlavor)Ref.g(500870716948248309L, var13));
      } catch (ClassNotFoundException var15) {
         var15.printStackTrace();
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
      // 00: invokestatic com/finalshell/core/Km2.U$String ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 41
      // 09: aload 1
      // 0a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 521429674354691289
      // 10: astore 4
      // 12: astore 3
      // 13: ldc2_w 521429674354691289
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
      // 2f: invokestatic com/finalshell/core/Uk4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 32: athrow
      // 33: new java/awt/datatransfer/UnsupportedFlavorException
      // 36: dup
      // 37: aload 1
      // 38: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 3b: athrow
      // 3c: invokestatic com/finalshell/core/Uk4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3f: athrow
      // 40: aload 0
      // 41: ldc2_w 168910181291744918
      // 44: astore 5
      // 46: ldc2_w 168910181291744918
      // 49: aload 5
      // 4b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4e: checkcast [Ljava/lang/Object;
      // 51: areturn
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      Object var1 = 340773235516701023L;
      return (DataFlavor[])Ref.g(340773235516701023L, var1);
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      Object var2 = 500870716948248309L;
      return ((DataFlavor)Ref.g(500870716948248309L, var2)).equals(var1);
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





