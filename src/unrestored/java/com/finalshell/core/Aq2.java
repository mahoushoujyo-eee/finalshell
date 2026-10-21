package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.awt.Point;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Aq2 implements DropTargetListener {
   public DropTarget F;
   public JTree Z;

   public Aq2(JTree var1) {
      super();
      long var3 = 595964023562665259L;
      Ref.s(595964023562665259L, var1, var3);
      DropTarget var10003;
      Object var4 = 595964023562665259L;
      // [VF-super] super((JTree)Ref.g(595964023562665259L, var4), this);
      long var7 = 345692346018177470L;
      DropTarget var6 = var10003;
      Ref.s(345692346018177470L, var6, var7);
   }

   public TreeNode V(DropTargetDragEvent var1) {
      Point var2 = var1.getLocation();
      DropTargetContext var3 = var1.getDropTargetContext();
      JTree var4 = (JTree)var3.getComponent();
      TreePath var5 = var4.getClosestPathForLocation(var2.x, var2.y);
      return (TreeNode)var5.getLastPathComponent();
   }

   @Override
   public void dragEnter(DropTargetDragEvent var1) {
      ConnectionInfoPanel.I();
      TreeNode var10002 = (TreeNode)(Registry.packArgs(var1));
      long var5 = 214395011641258320L;
      Object var4 = var10002;
      var10002 = Ref.h(214395011641258320L, var4, var5);

      try {
         var10002 = (TreeNode)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label24: {
         TreeNode var3 = var10002;
         if (this != null) {
            if (!var3.isLeaf()) {
               break label24;
            }

            var1.rejectDrag();
         }

         if (this != null) {
            return;
         }
      }

      var1.acceptDrag(var1.getDropAction());
   }

   @Override
   public void dragOver(DropTargetDragEvent var1) {
      ConnectionInfoPanel.I();
      TreeNode var10002 = (TreeNode)(Registry.packArgs(var1));
      long var5 = 214395011641258320L;
      Object var4 = var10002;
      var10002 = Ref.h(214395011641258320L, var4, var5);

      try {
         var10002 = (TreeNode)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label24: {
         TreeNode var3 = var10002;
         if (this != null) {
            if (!var3.isLeaf()) {
               break label24;
            }

            var1.rejectDrag();
         }

         if (this != null) {
            return;
         }
      }

      var1.acceptDrag(var1.getDropAction());
   }

   @Override
   public void dragExit(DropTargetEvent var1) {
   }

   @Override
   public void dropActionChanged(DropTargetDragEvent var1) {
   }

   @Override
   public void drop(DropTargetDropEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual java/awt/dnd/DropTargetDropEvent.getLocation ()Ljava/awt/Point;
      // 04: astore 3
      // 05: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 08: aload 1
      // 09: invokevirtual java/awt/dnd/DropTargetDropEvent.getDropTargetContext ()Ljava/awt/dnd/DropTargetContext;
      // 0c: astore 4
      // 0e: astore 2
      // 0f: aload 4
      // 11: invokevirtual java/awt/dnd/DropTargetContext.getComponent ()Ljava/awt/Component;
      // 14: checkcast javax/swing/JTree
      // 17: astore 5
      // 19: aload 5
      // 1b: aload 3
      // 1c: getfield java/awt/Point.x I
      // 1f: aload 3
      // 20: getfield java/awt/Point.y I
      // 23: invokevirtual javax/swing/JTree.getClosestPathForLocation (II)Ljavax/swing/tree/TreePath;
      // 26: astore 6
      // 28: aload 6
      // 2a: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 2d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 30: astore 7
      // 32: aload 2
      // 33: ifnull 50
      // 36: aload 7
      // 38: invokevirtual javax/swing/tree/DefaultMutableTreeNode.isLeaf ()Z
      // 3b: ifeq 51
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Aq2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 1
      // 46: invokevirtual java/awt/dnd/DropTargetDropEvent.rejectDrop ()V
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Aq2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: return
      // 51: aload 1
      // 52: invokevirtual java/awt/dnd/DropTargetDropEvent.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 55: astore 8
      // 57: aload 8
      // 59: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 5e: astore 9
      // 60: bipush 0
      // 61: istore 10
      // 63: iload 10
      // 65: aload 9
      // 67: arraylength
      // 68: if_icmpge db
      // 6b: aload 2
      // 6c: ifnull df
      // 6f: aload 8
      // 71: aload 9
      // 73: iload 10
      // 75: aaload
      // 76: aload 2
      // 77: ifnull a6
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/Aq2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: invokeinterface java/awt/datatransfer/Transferable.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z 2
      // 86: ifeq d4
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/Aq2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f: athrow
      // 90: aload 1
      // 91: aload 1
      // 92: invokevirtual java/awt/dnd/DropTargetDropEvent.getDropAction ()I
      // 95: invokevirtual java/awt/dnd/DropTargetDropEvent.acceptDrop (I)V
      // 98: aload 8
      // 9a: aload 9
      // 9c: iload 10
      // 9e: aaload
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/Aq2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5: athrow
      // a6: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // ab: checkcast javax/swing/tree/TreePath
      // ae: astore 11
      // b0: aload 11
      // b2: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // b5: checkcast javax/swing/tree/DefaultMutableTreeNode
      // b8: astore 12
      // ba: aload 5
      // bc: invokevirtual javax/swing/JTree.getModel ()Ljavax/swing/tree/TreeModel;
      // bf: checkcast javax/swing/tree/DefaultTreeModel
      // c2: astore 13
      // c4: aload 13
      // c6: aload 12
      // c8: aload 7
      // ca: bipush 0
      // cb: invokevirtual javax/swing/tree/DefaultTreeModel.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // ce: aload 1
      // cf: bipush 1
      // d0: invokevirtual java/awt/dnd/DropTargetDropEvent.dropComplete (Z)V
      // d3: return
      // d4: iinc 10 1
      // d7: aload 2
      // d8: ifnonnull 63
      // db: aload 1
      // dc: invokevirtual java/awt/dnd/DropTargetDropEvent.rejectDrop ()V
      // df: goto ed
      // e2: astore 8
      // e4: aload 8
      // e6: invokevirtual java/lang/Exception.printStackTrace ()V
      // e9: aload 1
      // ea: invokevirtual java/awt/dnd/DropTargetDropEvent.rejectDrop ()V
      // ed: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





