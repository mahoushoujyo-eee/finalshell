package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.tree.TreePath;

public class OP3_2 implements Transferable {
   public static DataFlavor w;
   public DataFlavor[] H;
   public TreePath v;

   public OP3_2(TreePath var1) {
      DataFlavor[] var10001 = new DataFlavor[]{(DataFlavor)Ref.g(387210057534719865L, null)};
      long var3 = 439415252605407244L;
      DataFlavor[] var2 = var10001;
      Ref.s(439415252605407244L, var2, var3);
      long var5 = 403113679548510838L;
      Ref.s(403113679548510838L, var1, var5);
   }

   @Override
   public synchronized DataFlavor[] getTransferDataFlavors() {
      Object var1 = 439415252605407244L;
      return (DataFlavor[])Ref.g(439415252605407244L, var1);
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return var1.getRepresentationClass() == TreePath.class;
   }

   @Override
   public synchronized Object getTransferData(DataFlavor param1) throws UnsupportedFlavorException, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 3b
      // 09: aload 1
      // 0a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 527614775428911064
      // 10: astore 4
      // 12: astore 3
      // 13: ldc2_w 527614775428911064
      // 16: aload 3
      // 17: aload 4
      // 19: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c: checkcast java/lang/Boolean
      // 1f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 22: goto 29
      // 25: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28: athrow
      // 29: ifeq 4c
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/OP3_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 32: athrow
      // 33: aload 0
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/OP3_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3a: athrow
      // 3b: ldc2_w 403113679548510838
      // 3e: astore 5
      // 40: ldc2_w 403113679548510838
      // 43: aload 5
      // 45: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 48: checkcast javax/swing/tree/TreePath
      // 4b: areturn
      // 4c: new java/awt/datatransfer/UnsupportedFlavorException
      // 4f: dup
      // 50: aload 1
      // 51: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 54: athrow
   }

   static {
      __vfClinit__();
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0005q7c\u0002/T%k".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 106;
      char[] var10002 = var10003;
      int var3 = var10004;
      char[] var12;
      byte var16;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var12 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 106;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 59;
               break;
            case 1:
               var16 = 105;
               break;
            case 2:
               var16 = 56;
               break;
            case 3:
               var16 = 108;
               break;
            case 4:
               var16 = 72;
               break;
            case 5:
               var16 = 21;
               break;
            default:
               var16 = 95;
         }
      } else {
         var8 = 106;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            Ref.setField(0L, null, new DataFlavor(TreePath.class, var2));
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 106;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 59;
               break;
            case 1:
               var16 = 105;
               break;
            case 2:
               var16 = 56;
               break;
            case 3:
               var16 = 108;
               break;
            case 4:
               var16 = 72;
               break;
            case 5:
               var16 = 21;
               break;
            default:
               var16 = 95;
         }
      }

      while (true) {
         var12[var10005] = (char)(var10006 ^ var10007 ^ var16);
         var1++;
         if (var8 == 0) {
            var12 = var10002;
            var10005 = var8;
            char var19 = var10002[var8];
            var10007 = var8;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var16 = 59;
                  break;
               case 1:
                  var16 = 105;
                  break;
               case 2:
                  var16 = 56;
                  break;
               case 3:
                  var16 = 108;
                  break;
               case 4:
                  var16 = 72;
                  break;
               case 5:
                  var16 = 21;
                  break;
               default:
                  var16 = 95;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               Ref.setField(0L, null, new DataFlavor(TreePath.class, var0));
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 59;
                  break;
               case 1:
                  var16 = 105;
                  break;
               case 2:
                  var16 = 56;
                  break;
               case 3:
                  var16 = 108;
                  break;
               case 4:
                  var16 = 72;
                  break;
               case 5:
                  var16 = 21;
                  break;
               default:
                  var16 = 95;
            }
         }
      }
   }
}





