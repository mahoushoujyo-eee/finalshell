import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.tree.TreePath;

class oP_3 implements Transferable {
   public static DataFlavor w;
   DataFlavor[] H;
   TreePath v;

   public oP_3(TreePath var1) {
      com.c.c(439415252605407244L).set(this, new DataFlavor[]{(DataFlavor)com.c.c(387210057534719865L).get(null)});
      com.c.c(403113679548510838L).set(this, var1);
   }

   @Override
   public synchronized DataFlavor[] getTransferDataFlavors() {
      return (DataFlavor[])com.c.c(439415252605407244L).get(this);
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
      // 00: invokestatic a3.I ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 37
      // 09: aload 1
      // 0a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 527614775428911064
      // 10: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 13: dup_x2
      // 14: pop
      // 15: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18: checkcast java/lang/Boolean
      // 1b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e: goto 25
      // 21: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 45
      // 28: goto 2f
      // 2b: invokestatic oP_3.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 37
      // 33: invokestatic oP_3.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 36: athrow
      // 37: ldc2_w 403113679548510838
      // 3a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3d: swap
      // 3e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 41: checkcast javax/swing/tree/TreePath
      // 44: areturn
      // 45: new java/awt/datatransfer/UnsupportedFlavorException
      // 48: dup
      // 49: aload 1
      // 4a: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 4d: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
            com.c.c(387210057534719865L).set(null, new DataFlavor(TreePath.class, var2));
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
               com.c.c(387210057534719865L).set(null, new DataFlavor(TreePath.class, var0));
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

   private static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





