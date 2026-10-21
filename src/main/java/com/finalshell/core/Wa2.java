package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Wa2 extends TransferHandler {
   DataFlavor Y;
   DataFlavor F;
   DataFlavor[] k;
   DefaultMutableTreeNode[] y;
   DefaultMutableTreeNode P;
   Connection5 v;
   public static String[] a;
   public static String[] b;

   public Wa2(Connection5 var1) {
      DataFlavor[] var10001 = new DataFlavor[1];
      long var5 = 151856102573410630L;
      DataFlavor[] var4 = var10001;
      Ref.s(151856102573410630L, var4, var5);
      long var7 = 244998488210668727L;
      Ref.s(244998488210668727L, var1, var7);

      try {
         String var2 = a(5265, -29366) + DefaultMutableTreeNode[].class.getName() + "\"";
         DataFlavor var10003 = new DataFlavor(var2);
         long var9 = 387411512747640120L;
         DataFlavor var8 = var10003;
         Ref.s(387411512747640120L, var8, var9);
         Object var10 = 151856102573410630L;
         DataFlavor[] var10004 = (DataFlavor[])Ref.g(151856102573410630L, var10);
         Object var12 = 387411512747640120L;
         ((Object[])false)[this] = (boolean)((DataFlavor)Ref.g(387411512747640120L, var12));
         String var3 = a(5264, 1037) + com.finalshell.ui.model.Ck4.class.getName() + "\"";
         DataFlavor var10006 = new DataFlavor(var3);
         long var15 = 202783090542620461L;
         DataFlavor var14 = var10006;
         Ref.s(202783090542620461L, var14, var15);
      } catch (ClassNotFoundException var16) {
      }
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      var1.setShowDropLocation(false);
      return true;
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      String var10000 = com.finalshell.ui.panel.AA.z();
      JTree var3 = (JTree)var1;
      String var2 = var10000;
      TreePath[] var4 = var3.getSelectionPaths();
      if (var4 == null) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         DefaultMutableTreeNode var10001 = (DefaultMutableTreeNode)var4[0].getLastPathComponent();
         long var11 = 529627744240700508L;
         DefaultMutableTreeNode var10 = var10001;
         Ref.s(529627744240700508L, var10, var11);
         Object var12 = 529627744240700508L;
         DefaultMutableTreeNode var10003 = (DefaultMutableTreeNode)(Registry.packArgs(Ref.g(529627744240700508L, var12)));
         long var15 = 372481440858701339L;
         Object[] var14 = var10003;
         var10003 = Ref.h(372481440858701339L, var14, var15);

         try {
            var10003 = (DefaultMutableTreeNode)var10003;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         DefaultMutableTreeNode var7 = var10003;
         var5.add(var7);
         Object var16 = 529627744240700508L;
         this.add((DefaultMutableTreeNode)Ref.g(529627744240700508L, var16));
         int var8 = 1;

         Object var10004;
         while (true) {
            label67:
            if (var8 < var4.length) {
               var10004 = var4;
               if (var2 != null) {
                  break;
               }

               label74: {
                  DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var4[var8].getLastPathComponent();
                  var9.getLevel();
                  Wa2 var10005 = this;
                  Object var18 = 529627744240700508L;
                  Wa2 var10006 = ((DefaultMutableTreeNode)Ref.g(529627744240700508L, var18)).getLevel();
                  if (var2 == null) {
                     if (this < var10006 && var2 == null) {
                        break label67;
                     }

                     var10005 = var9.getLevel();
                     if (var2 != null) {
                        break label74;
                     }

                     var10006 = this;
                     Object var20 = 529627744240700508L;
                     ((DefaultMutableTreeNode)Ref.g(529627744240700508L, var20)).getLevel();
                  }

                  if (var10005 > var10006) {
                     DefaultMutableTreeNode var10007 = (DefaultMutableTreeNode)(Registry.packArgs(var9));
                     long var23 = 372481440858701339L;
                     Object[] var22 = var10007;
                     var10007 = Ref.h(372481440858701339L, var22, var23);

                     try {
                        var10007 = (DefaultMutableTreeNode)var10007;
                     } catch (InvocationTargetException var29) {
                        throw var29.getTargetException();
                     }

                     this.add(var10007);
                     if (var2 == null) {
                        break label74;
                     }
                  }

                  DefaultMutableTreeNode var37 = (DefaultMutableTreeNode)(Registry.packArgs(var9));
                  long var25 = 372481440858701339L;
                  Object[] var24 = var37;
                  var37 = Ref.h(372481440858701339L, var24, var25);

                  try {
                     var37 = (DefaultMutableTreeNode)var37;
                  } catch (InvocationTargetException var28) {
                     throw var28.getTargetException();
                  }

                  this.add(var37);
                  var6.add(var9);
               }

               var8++;
               if (var2 == null) {
                  continue;
               }
            }

            var10004 = var5.toArray(new DefaultMutableTreeNode[var5.size()]);
            break;
         }

         DefaultMutableTreeNode[] var31 = (DefaultMutableTreeNode[])var10004;
         DefaultMutableTreeNode[] var34 = var6.toArray(new DefaultMutableTreeNode[var6.size()]);
         long var27 = 362328065066847528L;
         DefaultMutableTreeNode[] var26 = var34;
         Ref.s(362328065066847528L, var26, var27);
         return new TH(this, var31);
      }
   }

   public DefaultMutableTreeNode z(TreeNode var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1;
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode();
      var3.setUserObject(var2.getUserObject());
      return var3;
   }

   @Override
   protected void exportDone(JComponent var1, Transferable var2, int var3) {
      if ((var3 & 2) == 2) {
         JTree var4 = (JTree)var1;
         DefaultTreeModel var5 = (DefaultTreeModel)var4.getModel();
      }
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 2;
   }

   @Override
   public boolean importData(TransferSupport param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnonnull 03c
      // 009: aload 1
      // 00a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 00d: ldc2_w 593643793838565634
      // 010: astore 33
      // 012: astore 32
      // 014: ldc2_w 593643793838565634
      // 017: aload 32
      // 019: aload 33
      // 01b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: goto 02b
      // 027: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: ifne 03b
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 034: athrow
      // 035: bipush 0
      // 036: ireturn
      // 037: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03a: athrow
      // 03b: aload 0
      // 03c: ldc2_w 244998488210668727
      // 03f: astore 34
      // 041: ldc2_w 244998488210668727
      // 044: aload 34
      // 046: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast com/finalshell/ui/panel/Connection5
      // 04c: astore 3
      // 04d: aload 1
      // 04e: invokevirtual javax/swing/TransferHandler$TransferSupport.getDropLocation ()Ljavax/swing/TransferHandler$DropLocation;
      // 051: checkcast javax/swing/JTree$DropLocation
      // 054: astore 4
      // 056: aload 4
      // 058: invokevirtual javax/swing/JTree$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 05b: astore 5
      // 05d: aload 4
      // 05f: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 062: istore 6
      // 064: aload 4
      // 066: invokevirtual javax/swing/JTree$DropLocation.getPath ()Ljavax/swing/tree/TreePath;
      // 069: astore 7
      // 06b: aload 7
      // 06d: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 070: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 073: astore 8
      // 075: aload 3
      // 076: aload 5
      // 078: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07b: ldc2_w 520457556467656899
      // 07e: astore 37
      // 080: astore 36
      // 082: ldc2_w 520457556467656899
      // 085: aload 36
      // 087: aload 37
      // 089: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 08f: goto 096
      // 092: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 095: athrow
      // 096: astore 9
      // 098: aload 3
      // 099: aload 5
      // 09b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09e: ldc2_w 249787479061393778
      // 0a1: astore 39
      // 0a3: astore 38
      // 0a5: ldc2_w 249787479061393778
      // 0a8: aload 38
      // 0aa: aload 39
      // 0ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0af: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0b2: goto 0b9
      // 0b5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: astore 9
      // 0bb: bipush 0
      // 0bc: istore 10
      // 0be: iload 6
      // 0c0: aload 2
      // 0c1: ifnonnull 0d7
      // 0c4: bipush -1
      // 0c5: if_icmple 0d9
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ce: athrow
      // 0cf: bipush 1
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d6: athrow
      // 0d7: istore 10
      // 0d9: aload 0
      // 0da: ldc2_w 244998488210668727
      // 0dd: astore 40
      // 0df: ldc2_w 244998488210668727
      // 0e2: aload 40
      // 0e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e7: checkcast com/finalshell/ui/panel/Connection5
      // 0ea: invokevirtual com/finalshell/ui/panel/Connection5.getUI ()Ljavax/swing/plaf/TreeUI;
      // 0ed: astore 11
      // 0ef: aload 9
      // 0f1: aload 2
      // 0f2: ifnonnull 10e
      // 0f5: ifnull 13a
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0fe: athrow
      // 0ff: aload 9
      // 101: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 104: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 10d: athrow
      // 10e: astore 12
      // 110: aload 9
      // 112: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 115: astore 13
      // 117: aload 3
      // 118: aload 9
      // 11a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 11d: ldc2_w 137915523920596499
      // 120: astore 43
      // 122: astore 42
      // 124: ldc2_w 137915523920596499
      // 127: aload 42
      // 129: aload 43
      // 12b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12e: checkcast java/awt/Rectangle
      // 131: goto 138
      // 134: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 137: athrow
      // 138: astore 14
      // 13a: aload 0
      // 13b: ldc2_w 244998488210668727
      // 13e: astore 44
      // 140: ldc2_w 244998488210668727
      // 143: aload 44
      // 145: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 148: checkcast com/finalshell/ui/panel/Connection5
      // 14b: invokevirtual com/finalshell/ui/panel/Connection5.getModel ()Ljavax/swing/tree/TreeModel;
      // 14e: checkcast com/finalshell/core/Yo4
      // 151: astore 12
      // 153: aload 0
      // 154: ldc2_w 529627744240700508
      // 157: astore 46
      // 159: ldc2_w 529627744240700508
      // 15c: aload 46
      // 15e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 161: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 164: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 167: aload 0
      // 168: ldc2_w 529627744240700508
      // 16b: astore 48
      // 16d: ldc2_w 529627744240700508
      // 170: aload 48
      // 172: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 175: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 178: invokeinterface javax/swing/tree/TreeNode.getIndex (Ljavax/swing/tree/TreeNode;)I 2
      // 17d: istore 13
      // 17f: iload 13
      // 181: aload 2
      // 182: ifnonnull 1c3
      // 185: iload 6
      // 187: if_icmpge 1ba
      // 18a: goto 191
      // 18d: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 190: athrow
      // 191: iload 6
      // 193: bipush 1
      // 194: aload 2
      // 195: ifnonnull 1b3
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19e: athrow
      // 19f: if_icmple 1c5
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a8: athrow
      // 1a9: iload 6
      // 1ab: bipush 1
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b2: athrow
      // 1b3: isub
      // 1b4: istore 6
      // 1b6: aload 2
      // 1b7: ifnull 1c5
      // 1ba: iload 6
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c2: athrow
      // 1c3: istore 6
      // 1c5: aconst_null
      // 1c6: astore 14
      // 1c8: aload 1
      // 1c9: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 1cc: astore 15
      // 1ce: aload 15
      // 1d0: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 1d5: bipush 0
      // 1d6: aaload
      // 1d7: astore 16
      // 1d9: aload 16
      // 1db: aload 0
      // 1dc: ldc2_w 387411512747640120
      // 1df: astore 50
      // 1e1: ldc2_w 387411512747640120
      // 1e4: aload 50
      // 1e6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e9: checkcast java/awt/datatransfer/DataFlavor
      // 1ec: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 1ef: aload 2
      // 1f0: ifnonnull b12
      // 1f3: ifeq af5
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: ldc2_w 529627744240700508
      // 201: astore 52
      // 203: ldc2_w 529627744240700508
      // 206: aload 52
      // 208: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 20b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 20e: aload 2
      // 20f: ifnonnull 23e
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 218: athrow
      // 219: ifnull b59
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 222: athrow
      // 223: aload 0
      // 224: ldc2_w 529627744240700508
      // 227: astore 54
      // 229: ldc2_w 529627744240700508
      // 22c: aload 54
      // 22e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 231: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 234: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 23d: athrow
      // 23e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 241: ldc com/finalshell/ui/model/Ck4
      // 243: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 246: aload 2
      // 247: ifnonnull 6ee
      // 24a: ifeq 6ca
      // 24d: goto 254
      // 250: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 253: athrow
      // 254: aload 0
      // 255: ldc2_w 529627744240700508
      // 258: astore 56
      // 25a: ldc2_w 529627744240700508
      // 25d: aload 56
      // 25f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 262: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 265: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 268: checkcast com/finalshell/ui/model/Ck4
      // 26b: astore 17
      // 26d: aload 17
      // 26f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 272: ldc2_w 272998330038223631
      // 275: astore 59
      // 277: astore 58
      // 279: ldc2_w 272998330038223631
      // 27c: aload 58
      // 27e: aload 59
      // 280: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 283: checkcast java/io/File
      // 286: goto 28d
      // 289: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 290: astore 18
      // 292: aload 17
      // 294: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 297: ldc2_w 272998330038223631
      // 29a: astore 61
      // 29c: astore 60
      // 29e: ldc2_w 272998330038223631
      // 2a1: aload 60
      // 2a3: aload 61
      // 2a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a8: checkcast java/io/File
      // 2ab: goto 2b2
      // 2ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b1: athrow
      // 2b2: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 2b5: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2b8: astore 19
      // 2ba: aload 3
      // 2bb: aload 4
      // 2bd: invokevirtual javax/swing/JTree$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 2c0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2c3: ldc2_w 180336831534537747
      // 2c6: astore 63
      // 2c8: astore 62
      // 2ca: ldc2_w 180336831534537747
      // 2cd: aload 62
      // 2cf: aload 63
      // 2d1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d4: checkcast javax/swing/tree/TreePath
      // 2d7: goto 2de
      // 2da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dd: athrow
      // 2de: astore 20
      // 2e0: aload 3
      // 2e1: aload 20
      // 2e3: invokevirtual com/finalshell/ui/panel/Connection5.getPathBounds (Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
      // 2e6: astore 21
      // 2e8: aconst_null
      // 2e9: astore 22
      // 2eb: aload 8
      // 2ed: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 2f0: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2f3: aload 2
      // 2f4: ifnonnull 326
      // 2f7: ldc com/finalshell/ui/model/Ck4
      // 2f9: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2fc: ifeq 321
      // 2ff: goto 306
      // 302: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 305: athrow
      // 306: aload 8
      // 308: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 30b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 30e: astore 23
      // 310: aload 23
      // 312: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 315: checkcast com/finalshell/ui/model/Tf4
      // 318: astore 22
      // 31a: aload 23
      // 31c: astore 8
      // 31e: goto 32b
      // 321: aload 8
      // 323: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 326: checkcast com/finalshell/ui/model/Tf4
      // 329: astore 22
      // 32b: new java/lang/StringBuilder
      // 32e: dup
      // 32f: invokespecial java/lang/StringBuilder.<init> ()V
      // 332: aload 22
      // 334: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 337: ldc2_w 543633160597441792
      // 33a: astore 65
      // 33c: astore 64
      // 33e: ldc2_w 543633160597441792
      // 341: aload 64
      // 343: aload 65
      // 345: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 348: checkcast java/io/File
      // 34b: goto 352
      // 34e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 351: athrow
      // 352: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 355: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 358: getstatic java/io/File.separator Ljava/lang/String;
      // 35b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35e: aload 17
      // 360: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 363: ldc2_w 272998330038223631
      // 366: astore 67
      // 368: astore 66
      // 36a: ldc2_w 272998330038223631
      // 36d: aload 66
      // 36f: aload 67
      // 371: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 374: checkcast java/io/File
      // 377: goto 37e
      // 37a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37d: athrow
      // 37e: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 381: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 384: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 387: astore 23
      // 389: new java/io/File
      // 38c: dup
      // 38d: aload 23
      // 38f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 392: astore 24
      // 394: bipush 1
      // 395: istore 25
      // 397: aload 2
      // 398: ifnonnull 3f2
      // 39b: aload 19
      // 39d: aload 22
      // 39f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a2: ldc2_w 543633160597441792
      // 3a5: astore 69
      // 3a7: astore 68
      // 3a9: ldc2_w 543633160597441792
      // 3ac: aload 68
      // 3ae: aload 69
      // 3b0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b3: checkcast java/io/File
      // 3b6: goto 3bd
      // 3b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bc: athrow
      // 3bd: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3c0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3c3: ifne 6c6
      // 3c6: goto 3cd
      // 3c9: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3cc: athrow
      // 3cd: aload 17
      // 3cf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d2: ldc2_w 272998330038223631
      // 3d5: astore 71
      // 3d7: astore 70
      // 3d9: ldc2_w 272998330038223631
      // 3dc: aload 70
      // 3de: aload 71
      // 3e0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e3: checkcast java/io/File
      // 3e6: goto 3ed
      // 3e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ec: athrow
      // 3ed: aload 24
      // 3ef: invokestatic org/apache/commons/io/FileUtils.moveFile (Ljava/io/File;Ljava/io/File;)V
      // 3f2: goto 3ff
      // 3f5: astore 26
      // 3f7: aload 26
      // 3f9: invokevirtual java/io/IOException.printStackTrace ()V
      // 3fc: bipush 0
      // 3fd: istore 25
      // 3ff: iload 25
      // 401: ifeq 6c6
      // 404: aload 0
      // 405: ldc2_w 244998488210668727
      // 408: astore 72
      // 40a: ldc2_w 244998488210668727
      // 40d: aload 72
      // 40f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 412: aload 19
      // 414: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 417: ldc2_w 509874190727776741
      // 41a: astore 75
      // 41c: astore 74
      // 41e: ldc2_w 509874190727776741
      // 421: aload 74
      // 423: aload 75
      // 425: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 428: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 42b: goto 432
      // 42e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 431: athrow
      // 432: astore 26
      // 434: aload 12
      // 436: aload 0
      // 437: ldc2_w 529627744240700508
      // 43a: astore 76
      // 43c: ldc2_w 529627744240700508
      // 43f: aload 76
      // 441: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 444: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 447: invokevirtual com/finalshell/core/Yo4.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 44a: aload 26
      // 44c: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 44f: checkcast com/finalshell/ui/model/Tf4
      // 452: astore 27
      // 454: aload 27
      // 456: aload 18
      // 458: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 45b: ldc2_w 548576199562161390
      // 45e: astore 79
      // 460: astore 78
      // 462: ldc2_w 548576199562161390
      // 465: aload 78
      // 467: aload 79
      // 469: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 46c: pop
      // 46d: goto 474
      // 470: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 473: athrow
      // 474: aload 0
      // 475: ldc2_w 244998488210668727
      // 478: astore 80
      // 47a: ldc2_w 244998488210668727
      // 47d: aload 80
      // 47f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 482: aload 18
      // 484: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 487: ldc2_w 387993827549279839
      // 48a: astore 83
      // 48c: astore 82
      // 48e: ldc2_w 387993827549279839
      // 491: aload 82
      // 493: aload 83
      // 495: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 498: pop
      // 499: goto 4a0
      // 49c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: new com/finalshell/ui/model/Ck4
      // 4a3: dup
      // 4a4: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 4a7: astore 28
      // 4a9: aload 28
      // 4ab: aload 24
      // 4ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4b0: ldc2_w 325634526741383265
      // 4b3: astore 85
      // 4b5: astore 84
      // 4b7: ldc2_w 325634526741383265
      // 4ba: aload 84
      // 4bc: aload 85
      // 4be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c1: pop
      // 4c2: goto 4c9
      // 4c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c8: athrow
      // 4c9: aload 28
      // 4cb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ce: ldc2_w 336419247910974761
      // 4d1: astore 86
      // 4d3: ldc2_w 336419247910974761
      // 4d6: aload 86
      // 4d8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4db: pop
      // 4dc: goto 4e3
      // 4df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4e2: athrow
      // 4e3: aload 22
      // 4e5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4e8: ldc2_w 248698316749304686
      // 4eb: astore 89
      // 4ed: astore 88
      // 4ef: ldc2_w 248698316749304686
      // 4f2: aload 88
      // 4f4: aload 89
      // 4f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f9: checkcast java/util/List
      // 4fc: goto 503
      // 4ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 502: athrow
      // 503: aload 28
      // 505: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 50a: pop
      // 50b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 50e: ldc2_w 270389152141252877
      // 511: astore 90
      // 513: ldc2_w 270389152141252877
      // 516: aload 90
      // 518: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 51b: goto 522
      // 51e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 521: athrow
      // 522: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 525: ldc2_w 410905379772103887
      // 528: astore 93
      // 52a: astore 92
      // 52c: ldc2_w 410905379772103887
      // 52f: aload 92
      // 531: aload 93
      // 533: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 536: goto 53d
      // 539: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53c: athrow
      // 53d: aload 17
      // 53f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 542: ldc2_w 605430732347023634
      // 545: astore 95
      // 547: astore 94
      // 549: ldc2_w 605430732347023634
      // 54c: aload 94
      // 54e: aload 95
      // 550: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 553: goto 55a
      // 556: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 559: athrow
      // 55a: aload 23
      // 55c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 55f: ldc2_w 120242074362177751
      // 562: astore 97
      // 564: astore 96
      // 566: ldc2_w 120242074362177751
      // 569: aload 96
      // 56b: aload 97
      // 56d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 570: pop
      // 571: goto 578
      // 574: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 577: athrow
      // 578: new javax/swing/tree/DefaultMutableTreeNode
      // 57b: dup
      // 57c: aload 28
      // 57e: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 581: astore 29
      // 583: aload 0
      // 584: ldc2_w 244998488210668727
      // 587: astore 98
      // 589: ldc2_w 244998488210668727
      // 58c: aload 98
      // 58e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 591: aload 29
      // 593: aload 28
      // 595: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 598: ldc2_w 148501163140533206
      // 59b: astore 101
      // 59d: astore 100
      // 59f: ldc2_w 148501163140533206
      // 5a2: aload 100
      // 5a4: aload 101
      // 5a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a9: pop
      // 5aa: goto 5b1
      // 5ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5b0: athrow
      // 5b1: aload 19
      // 5b3: aload 2
      // 5b4: ifnonnull 61c
      // 5b7: aload 22
      // 5b9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5bc: ldc2_w 543633160597441792
      // 5bf: astore 103
      // 5c1: astore 102
      // 5c3: ldc2_w 543633160597441792
      // 5c6: aload 102
      // 5c8: aload 103
      // 5ca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5cd: checkcast java/io/File
      // 5d0: goto 5d7
      // 5d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d6: athrow
      // 5d7: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 5da: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5dd: ifne 602
      // 5e0: goto 5e7
      // 5e3: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5e6: athrow
      // 5e7: aload 4
      // 5e9: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 5ec: istore 6
      // 5ee: aload 2
      // 5ef: ifnonnull 60d
      // 5f2: iload 6
      // 5f4: bipush -1
      // 5f5: if_icmpne 602
      // 5f8: goto 5ff
      // 5fb: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5fe: athrow
      // 5ff: bipush 0
      // 600: istore 6
      // 602: aload 12
      // 604: aload 29
      // 606: aload 8
      // 608: iload 6
      // 60a: invokevirtual com/finalshell/core/Yo4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 60d: new java/io/File
      // 610: dup
      // 611: aload 23
      // 613: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 616: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 619: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 61c: astore 30
      // 61e: aload 0
      // 61f: ldc2_w 244998488210668727
      // 622: astore 104
      // 624: ldc2_w 244998488210668727
      // 627: aload 104
      // 629: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 62c: aload 30
      // 62e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 631: ldc2_w 509874190727776741
      // 634: astore 107
      // 636: astore 106
      // 638: ldc2_w 509874190727776741
      // 63b: aload 106
      // 63d: aload 107
      // 63f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 642: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 645: goto 64c
      // 648: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 64b: athrow
      // 64c: astore 31
      // 64e: aload 0
      // 64f: ldc2_w 244998488210668727
      // 652: astore 108
      // 654: ldc2_w 244998488210668727
      // 657: aload 108
      // 659: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 65c: aload 31
      // 65e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 661: ldc2_w 276002133797788160
      // 664: astore 111
      // 666: astore 110
      // 668: ldc2_w 276002133797788160
      // 66b: aload 110
      // 66d: aload 111
      // 66f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 672: pop
      // 673: goto 67a
      // 676: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 679: athrow
      // 67a: aload 0
      // 67b: ldc2_w 244998488210668727
      // 67e: astore 112
      // 680: ldc2_w 244998488210668727
      // 683: aload 112
      // 685: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 688: checkcast com/finalshell/ui/panel/Connection5
      // 68b: new javax/swing/tree/TreePath
      // 68e: dup
      // 68f: aload 8
      // 691: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 694: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 697: invokevirtual com/finalshell/ui/panel/Connection5.expandPath (Ljavax/swing/tree/TreePath;)V
      // 69a: aload 0
      // 69b: ldc2_w 244998488210668727
      // 69e: astore 114
      // 6a0: ldc2_w 244998488210668727
      // 6a3: aload 114
      // 6a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6a8: aload 29
      // 6aa: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6ad: ldc2_w 592526597199428069
      // 6b0: astore 117
      // 6b2: astore 116
      // 6b4: ldc2_w 592526597199428069
      // 6b7: aload 116
      // 6b9: aload 117
      // 6bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6be: pop
      // 6bf: goto 6c6
      // 6c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6c5: athrow
      // 6c6: aload 2
      // 6c7: ifnull b59
      // 6ca: aload 0
      // 6cb: ldc2_w 529627744240700508
      // 6ce: astore 118
      // 6d0: ldc2_w 529627744240700508
      // 6d3: aload 118
      // 6d5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6d8: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 6db: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 6de: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6e1: ldc_w com/finalshell/ui/model/Tf4
      // 6e4: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 6e7: goto 6ee
      // 6ea: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6ed: athrow
      // 6ee: aload 2
      // 6ef: ifnonnull b5a
      // 6f2: ifeq b59
      // 6f5: goto 6fc
      // 6f8: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6fb: athrow
      // 6fc: aload 0
      // 6fd: ldc2_w 529627744240700508
      // 700: astore 120
      // 702: ldc2_w 529627744240700508
      // 705: aload 120
      // 707: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 70a: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 70d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 710: checkcast com/finalshell/ui/model/Tf4
      // 713: astore 17
      // 715: aload 17
      // 717: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 71a: ldc2_w 543633160597441792
      // 71d: astore 123
      // 71f: astore 122
      // 721: ldc2_w 543633160597441792
      // 724: aload 122
      // 726: aload 123
      // 728: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 72b: checkcast java/io/File
      // 72e: goto 735
      // 731: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 734: athrow
      // 735: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 738: astore 18
      // 73a: aload 17
      // 73c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 73f: ldc2_w 543633160597441792
      // 742: astore 125
      // 744: astore 124
      // 746: ldc2_w 543633160597441792
      // 749: aload 124
      // 74b: aload 125
      // 74d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 750: checkcast java/io/File
      // 753: goto 75a
      // 756: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 759: athrow
      // 75a: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 75d: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 760: astore 19
      // 762: aconst_null
      // 763: astore 20
      // 765: aload 8
      // 767: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 76a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 76d: aload 2
      // 76e: ifnonnull 7a0
      // 771: ldc com/finalshell/ui/model/Ck4
      // 773: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 776: ifeq 79b
      // 779: goto 780
      // 77c: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 77f: athrow
      // 780: aload 8
      // 782: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 785: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 788: astore 21
      // 78a: aload 21
      // 78c: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 78f: checkcast com/finalshell/ui/model/Tf4
      // 792: astore 20
      // 794: aload 21
      // 796: astore 8
      // 798: goto 7a5
      // 79b: aload 8
      // 79d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 7a0: checkcast com/finalshell/ui/model/Tf4
      // 7a3: astore 20
      // 7a5: new java/lang/StringBuilder
      // 7a8: dup
      // 7a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 7ac: aload 20
      // 7ae: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7b1: ldc2_w 543633160597441792
      // 7b4: astore 127
      // 7b6: astore 126
      // 7b8: ldc2_w 543633160597441792
      // 7bb: aload 126
      // 7bd: aload 127
      // 7bf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7c2: checkcast java/io/File
      // 7c5: goto 7cc
      // 7c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7cb: athrow
      // 7cc: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 7cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d2: getstatic java/io/File.separator Ljava/lang/String;
      // 7d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d8: aload 17
      // 7da: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7dd: ldc2_w 543633160597441792
      // 7e0: astore 129
      // 7e2: astore 128
      // 7e4: ldc2_w 543633160597441792
      // 7e7: aload 128
      // 7e9: aload 129
      // 7eb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7ee: checkcast java/io/File
      // 7f1: goto 7f8
      // 7f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7f7: athrow
      // 7f8: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 7fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 801: astore 21
      // 803: new java/io/File
      // 806: dup
      // 807: aload 21
      // 809: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 80c: astore 22
      // 80e: bipush 1
      // 80f: istore 23
      // 811: aload 2
      // 812: ifnonnull 86c
      // 815: aload 19
      // 817: aload 20
      // 819: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 81c: ldc2_w 543633160597441792
      // 81f: astore 131
      // 821: astore 130
      // 823: ldc2_w 543633160597441792
      // 826: aload 130
      // 828: aload 131
      // 82a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 82d: checkcast java/io/File
      // 830: goto 837
      // 833: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 836: athrow
      // 837: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 83a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 83d: ifne af1
      // 840: goto 847
      // 843: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 846: athrow
      // 847: aload 17
      // 849: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 84c: ldc2_w 543633160597441792
      // 84f: astore 133
      // 851: astore 132
      // 853: ldc2_w 543633160597441792
      // 856: aload 132
      // 858: aload 133
      // 85a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 85d: checkcast java/io/File
      // 860: goto 867
      // 863: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 866: athrow
      // 867: aload 22
      // 869: invokestatic org/apache/commons/io/FileUtils.moveDirectory (Ljava/io/File;Ljava/io/File;)V
      // 86c: goto 874
      // 86f: astore 24
      // 871: bipush 0
      // 872: istore 23
      // 874: iload 23
      // 876: ifeq af1
      // 879: aload 0
      // 87a: ldc2_w 244998488210668727
      // 87d: astore 134
      // 87f: ldc2_w 244998488210668727
      // 882: aload 134
      // 884: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 887: aload 19
      // 889: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 88c: ldc2_w 509874190727776741
      // 88f: astore 137
      // 891: astore 136
      // 893: ldc2_w 509874190727776741
      // 896: aload 136
      // 898: aload 137
      // 89a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 89d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 8a0: goto 8a7
      // 8a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8a6: athrow
      // 8a7: astore 24
      // 8a9: aload 12
      // 8ab: aload 0
      // 8ac: ldc2_w 529627744240700508
      // 8af: astore 138
      // 8b1: ldc2_w 529627744240700508
      // 8b4: aload 138
      // 8b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 8b9: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 8bc: invokevirtual com/finalshell/core/Yo4.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 8bf: aload 24
      // 8c1: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 8c4: checkcast com/finalshell/ui/model/Tf4
      // 8c7: astore 25
      // 8c9: aload 25
      // 8cb: aload 18
      // 8cd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8d0: ldc2_w 548576199562161390
      // 8d3: astore 141
      // 8d5: astore 140
      // 8d7: ldc2_w 548576199562161390
      // 8da: aload 140
      // 8dc: aload 141
      // 8de: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8e1: pop
      // 8e2: goto 8e9
      // 8e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8e8: athrow
      // 8e9: aload 0
      // 8ea: ldc2_w 244998488210668727
      // 8ed: astore 142
      // 8ef: ldc2_w 244998488210668727
      // 8f2: aload 142
      // 8f4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 8f7: aload 18
      // 8f9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8fc: ldc2_w 387993827549279839
      // 8ff: astore 145
      // 901: astore 144
      // 903: ldc2_w 387993827549279839
      // 906: aload 144
      // 908: aload 145
      // 90a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 90d: pop
      // 90e: goto 915
      // 911: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 914: athrow
      // 915: new com/finalshell/ui/model/Tf4
      // 918: dup
      // 919: aload 22
      // 91b: invokespecial com/finalshell/ui/model/Tf4.<init> (Ljava/io/File;)V
      // 91e: astore 26
      // 920: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 923: ldc2_w 270389152141252877
      // 926: astore 146
      // 928: ldc2_w 270389152141252877
      // 92b: aload 146
      // 92d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 930: goto 937
      // 933: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 936: athrow
      // 937: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 93a: ldc2_w 410905379772103887
      // 93d: astore 149
      // 93f: astore 148
      // 941: ldc2_w 410905379772103887
      // 944: aload 148
      // 946: aload 149
      // 948: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 94b: goto 952
      // 94e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 951: athrow
      // 952: aload 22
      // 954: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 957: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 95a: ldc2_w 400136252523980506
      // 95d: astore 151
      // 95f: astore 150
      // 961: ldc2_w 400136252523980506
      // 964: aload 150
      // 966: aload 151
      // 968: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 96b: pop
      // 96c: goto 973
      // 96f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 972: athrow
      // 973: new java/io/File
      // 976: dup
      // 977: aload 21
      // 979: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 97c: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 97f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 982: astore 27
      // 984: aload 0
      // 985: ldc2_w 244998488210668727
      // 988: astore 152
      // 98a: ldc2_w 244998488210668727
      // 98d: aload 152
      // 98f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 992: aload 27
      // 994: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 997: ldc2_w 509874190727776741
      // 99a: astore 155
      // 99c: astore 154
      // 99e: ldc2_w 509874190727776741
      // 9a1: aload 154
      // 9a3: aload 155
      // 9a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9a8: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 9ab: goto 9b2
      // 9ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9b1: athrow
      // 9b2: astore 28
      // 9b4: aload 0
      // 9b5: ldc2_w 244998488210668727
      // 9b8: astore 156
      // 9ba: ldc2_w 244998488210668727
      // 9bd: aload 156
      // 9bf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 9c2: aload 26
      // 9c4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 9c7: ldc2_w 593150792091308133
      // 9ca: astore 159
      // 9cc: astore 158
      // 9ce: ldc2_w 593150792091308133
      // 9d1: aload 158
      // 9d3: aload 159
      // 9d5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9d8: pop
      // 9d9: goto 9e0
      // 9dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9df: athrow
      // 9e0: aload 19
      // 9e2: aload 20
      // 9e4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 9e7: ldc2_w 543633160597441792
      // 9ea: astore 161
      // 9ec: astore 160
      // 9ee: ldc2_w 543633160597441792
      // 9f1: aload 160
      // 9f3: aload 161
      // 9f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9f8: checkcast java/io/File
      // 9fb: goto a02
      // 9fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a01: athrow
      // a02: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // a05: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a08: aload 2
      // a09: ifnonnull a33
      // a0c: ifne a31
      // a0f: goto a16
      // a12: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a15: athrow
      // a16: aload 4
      // a18: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // a1b: istore 6
      // a1d: iload 6
      // a1f: bipush -1
      // a20: aload 2
      // a21: ifnonnull a3f
      // a24: if_icmpne a31
      // a27: goto a2e
      // a2a: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a2d: athrow
      // a2e: bipush 0
      // a2f: istore 6
      // a31: iload 6
      // a33: aload 2
      // a34: ifnonnull a43
      // a37: bipush -1
      // a38: goto a3f
      // a3b: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a3e: athrow
      // a3f: if_icmpne a45
      // a42: bipush 0
      // a43: istore 6
      // a45: aload 0
      // a46: ldc2_w 244998488210668727
      // a49: astore 162
      // a4b: ldc2_w 244998488210668727
      // a4e: aload 162
      // a50: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a53: aload 8
      // a55: aload 26
      // a57: iload 6
      // a59: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;I)[Ljava/lang/Object;
      // a5c: ldc2_w 485298920737977777
      // a5f: astore 165
      // a61: astore 164
      // a63: ldc2_w 485298920737977777
      // a66: aload 164
      // a68: aload 165
      // a6a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a6d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // a70: goto a77
      // a73: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a76: athrow
      // a77: astore 29
      // a79: aload 0
      // a7a: ldc2_w 244998488210668727
      // a7d: astore 166
      // a7f: ldc2_w 244998488210668727
      // a82: aload 166
      // a84: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a87: aload 28
      // a89: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // a8c: ldc2_w 276002133797788160
      // a8f: astore 169
      // a91: astore 168
      // a93: ldc2_w 276002133797788160
      // a96: aload 168
      // a98: aload 169
      // a9a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a9d: pop
      // a9e: goto aa5
      // aa1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // aa4: athrow
      // aa5: aload 0
      // aa6: ldc2_w 244998488210668727
      // aa9: astore 170
      // aab: ldc2_w 244998488210668727
      // aae: aload 170
      // ab0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // ab3: checkcast com/finalshell/ui/panel/Connection5
      // ab6: new javax/swing/tree/TreePath
      // ab9: dup
      // aba: aload 8
      // abc: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // abf: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // ac2: invokevirtual com/finalshell/ui/panel/Connection5.expandPath (Ljavax/swing/tree/TreePath;)V
      // ac5: aload 0
      // ac6: ldc2_w 244998488210668727
      // ac9: astore 172
      // acb: ldc2_w 244998488210668727
      // ace: aload 172
      // ad0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // ad3: aload 29
      // ad5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // ad8: ldc2_w 592526597199428069
      // adb: astore 175
      // add: astore 174
      // adf: ldc2_w 592526597199428069
      // ae2: aload 174
      // ae4: aload 175
      // ae6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // ae9: pop
      // aea: goto af1
      // aed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // af0: athrow
      // af1: aload 2
      // af2: ifnull b59
      // af5: aload 16
      // af7: aload 0
      // af8: ldc2_w 202783090542620461
      // afb: astore 176
      // afd: ldc2_w 202783090542620461
      // b00: aload 176
      // b02: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // b05: checkcast java/awt/datatransfer/DataFlavor
      // b08: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // b0b: goto b12
      // b0e: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b11: athrow
      // b12: aload 2
      // b13: ifnonnull b5a
      // b16: ifeq b59
      // b19: goto b20
      // b1c: invokestatic com/finalshell/core/Wa2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b1f: athrow
      // b20: aconst_null
      // b21: astore 17
      // b23: aload 15
      // b25: aload 0
      // b26: ldc2_w 202783090542620461
      // b29: astore 178
      // b2b: ldc2_w 202783090542620461
      // b2e: aload 178
      // b30: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // b33: checkcast java/awt/datatransfer/DataFlavor
      // b36: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // b3b: checkcast [Lcom/finalshell/ui/model/Ck4;
      // b3e: astore 17
      // b40: goto b54
      // b43: astore 18
      // b45: aload 18
      // b47: invokevirtual java/awt/datatransfer/UnsupportedFlavorException.printStackTrace ()V
      // b4a: goto b54
      // b4d: astore 18
      // b4f: aload 18
      // b51: invokevirtual java/io/IOException.printStackTrace ()V
      // b54: aload 17
      // b56: ifnull b59
      // b59: bipush 1
      // b5a: ireturn
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 5264) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 150;
               break;
            case 1:
               var10000 = 116;
               break;
            case 2:
               var10000 = 221;
               break;
            case 3:
               var10000 = 34;
               break;
            case 4:
               var10000 = 202;
               break;
            case 5:
               var10000 = 238;
               break;
            case 6:
               var10000 = 209;
               break;
            case 7:
               var10000 = 197;
               break;
            case 8:
               var10000 = 64;
               break;
            case 9:
               var10000 = 40;
               break;
            case 10:
               var10000 = 63;
               break;
            case 11:
               var10000 = 44;
               break;
            case 12:
               var10000 = 72;
               break;
            case 13:
               var10000 = 66;
               break;
            case 14:
               var10000 = 125;
               break;
            case 15:
               var10000 = 53;
               break;
            case 16:
               var10000 = 122;
               break;
            case 17:
               var10000 = 222;
               break;
            case 18:
               var10000 = 22;
               break;
            case 19:
               var10000 = 219;
               break;
            case 20:
               var10000 = 88;
               break;
            case 21:
               var10000 = 8;
               break;
            case 22:
               var10000 = 73;
               break;
            case 23:
               var10000 = 5;
               break;
            case 24:
               var10000 = 58;
               break;
            case 25:
               var10000 = 245;
               break;
            case 26:
               var10000 = 165;
               break;
            case 27:
               var10000 = 112;
               break;
            case 28:
               var10000 = 119;
               break;
            case 29:
               var10000 = 101;
               break;
            case 30:
               var10000 = 162;
               break;
            case 31:
               var10000 = 166;
               break;
            case 32:
               var10000 = 74;
               break;
            case 33:
               var10000 = 156;
               break;
            case 34:
               var10000 = 240;
               break;
            case 35:
               var10000 = 208;
               break;
            case 36:
               var10000 = 175;
               break;
            case 37:
               var10000 = 30;
               break;
            case 38:
               var10000 = 171;
               break;
            case 39:
               var10000 = 183;
               break;
            case 40:
               var10000 = 51;
               break;
            case 41:
               var10000 = 124;
               break;
            case 42:
               var10000 = 96;
               break;
            case 43:
               var10000 = 137;
               break;
            case 44:
               var10000 = 231;
               break;
            case 45:
               var10000 = 213;
               break;
            case 46:
               var10000 = 154;
               break;
            case 47:
               var10000 = 46;
               break;
            case 48:
               var10000 = 24;
               break;
            case 49:
               var10000 = 252;
               break;
            case 50:
               var10000 = 144;
               break;
            case 51:
               var10000 = 42;
               break;
            case 52:
               var10000 = 210;
               break;
            case 53:
               var10000 = 1;
               break;
            case 54:
               var10000 = 81;
               break;
            case 55:
               var10000 = 91;
               break;
            case 56:
               var10000 = 235;
               break;
            case 57:
               var10000 = 142;
               break;
            case 58:
               var10000 = 172;
               break;
            case 59:
               var10000 = 236;
               break;
            case 60:
               var10000 = 196;
               break;
            case 61:
               var10000 = 148;
               break;
            case 62:
               var10000 = 194;
               break;
            case 63:
               var10000 = 251;
               break;
            case 64:
               var10000 = 212;
               break;
            case 65:
               var10000 = 110;
               break;
            case 66:
               var10000 = 164;
               break;
            case 67:
               var10000 = 118;
               break;
            case 68:
               var10000 = 25;
               break;
            case 69:
               var10000 = 9;
               break;
            case 70:
               var10000 = 176;
               break;
            case 71:
               var10000 = 35;
               break;
            case 72:
               var10000 = 211;
               break;
            case 73:
               var10000 = 97;
               break;
            case 74:
               var10000 = 77;
               break;
            case 75:
               var10000 = 155;
               break;
            case 76:
               var10000 = 36;
               break;
            case 77:
               var10000 = 225;
               break;
            case 78:
               var10000 = 189;
               break;
            case 79:
               var10000 = 244;
               break;
            case 80:
               var10000 = 149;
               break;
            case 81:
               var10000 = 108;
               break;
            case 82:
               var10000 = 106;
               break;
            case 83:
               var10000 = 214;
               break;
            case 84:
               var10000 = 3;
               break;
            case 85:
               var10000 = 68;
               break;
            case 86:
               var10000 = 94;
               break;
            case 87:
               var10000 = 230;
               break;
            case 88:
               var10000 = 109;
               break;
            case 89:
               var10000 = 115;
               break;
            case 90:
               var10000 = 95;
               break;
            case 91:
               var10000 = 136;
               break;
            case 92:
               var10000 = 160;
               break;
            case 93:
               var10000 = 18;
               break;
            case 94:
               var10000 = 153;
               break;
            case 95:
               var10000 = 227;
               break;
            case 96:
               var10000 = 41;
               break;
            case 97:
               var10000 = 55;
               break;
            case 98:
               var10000 = 79;
               break;
            case 99:
               var10000 = 50;
               break;
            case 100:
               var10000 = 13;
               break;
            case 101:
               var10000 = 20;
               break;
            case 102:
               var10000 = 250;
               break;
            case 103:
               var10000 = 60;
               break;
            case 104:
               var10000 = 188;
               break;
            case 105:
               var10000 = 76;
               break;
            case 106:
               var10000 = 7;
               break;
            case 107:
               var10000 = 82;
               break;
            case 108:
               var10000 = 92;
               break;
            case 109:
               var10000 = 103;
               break;
            case 110:
               var10000 = 43;
               break;
            case 111:
               var10000 = 129;
               break;
            case 112:
               var10000 = 200;
               break;
            case 113:
               var10000 = 246;
               break;
            case 114:
               var10000 = 113;
               break;
            case 115:
               var10000 = 71;
               break;
            case 116:
               var10000 = 2;
               break;
            case 117:
               var10000 = 131;
               break;
            case 118:
               var10000 = 32;
               break;
            case 119:
               var10000 = 52;
               break;
            case 120:
               var10000 = 180;
               break;
            case 121:
               var10000 = 243;
               break;
            case 122:
               var10000 = 134;
               break;
            case 123:
               var10000 = 86;
               break;
            case 124:
               var10000 = 45;
               break;
            case 125:
               var10000 = 201;
               break;
            case 126:
               var10000 = 54;
               break;
            case 127:
               var10000 = 169;
               break;
            case 128:
               var10000 = 59;
               break;
            case 129:
               var10000 = 0;
               break;
            case 130:
               var10000 = 75;
               break;
            case 131:
               var10000 = 14;
               break;
            case 132:
               var10000 = 105;
               break;
            case 133:
               var10000 = 185;
               break;
            case 134:
               var10000 = 253;
               break;
            case 135:
               var10000 = 80;
               break;
            case 136:
               var10000 = 184;
               break;
            case 137:
               var10000 = 168;
               break;
            case 138:
               var10000 = 33;
               break;
            case 139:
               var10000 = 233;
               break;
            case 140:
               var10000 = 254;
               break;
            case 141:
               var10000 = 111;
               break;
            case 142:
               var10000 = 239;
               break;
            case 143:
               var10000 = 249;
               break;
            case 144:
               var10000 = 37;
               break;
            case 145:
               var10000 = 102;
               break;
            case 146:
               var10000 = 39;
               break;
            case 147:
               var10000 = 193;
               break;
            case 148:
               var10000 = 57;
               break;
            case 149:
               var10000 = 138;
               break;
            case 150:
               var10000 = 31;
               break;
            case 151:
               var10000 = 170;
               break;
            case 152:
               var10000 = 127;
               break;
            case 153:
               var10000 = 98;
               break;
            case 154:
               var10000 = 174;
               break;
            case 155:
               var10000 = 6;
               break;
            case 156:
               var10000 = 141;
               break;
            case 157:
               var10000 = 216;
               break;
            case 158:
               var10000 = 70;
               break;
            case 159:
               var10000 = 179;
               break;
            case 160:
               var10000 = 237;
               break;
            case 161:
               var10000 = 145;
               break;
            case 162:
               var10000 = 117;
               break;
            case 163:
               var10000 = 195;
               break;
            case 164:
               var10000 = 135;
               break;
            case 165:
               var10000 = 217;
               break;
            case 166:
               var10000 = 167;
               break;
            case 167:
               var10000 = 23;
               break;
            case 168:
               var10000 = 114;
               break;
            case 169:
               var10000 = 11;
               break;
            case 170:
               var10000 = 56;
               break;
            case 171:
               var10000 = 26;
               break;
            case 172:
               var10000 = 128;
               break;
            case 173:
               var10000 = 229;
               break;
            case 174:
               var10000 = 190;
               break;
            case 175:
               var10000 = 29;
               break;
            case 176:
               var10000 = 248;
               break;
            case 177:
               var10000 = 178;
               break;
            case 178:
               var10000 = 181;
               break;
            case 179:
               var10000 = 10;
               break;
            case 180:
               var10000 = 21;
               break;
            case 181:
               var10000 = 121;
               break;
            case 182:
               var10000 = 228;
               break;
            case 183:
               var10000 = 204;
               break;
            case 184:
               var10000 = 163;
               break;
            case 185:
               var10000 = 161;
               break;
            case 186:
               var10000 = 87;
               break;
            case 187:
               var10000 = 85;
               break;
            case 188:
               var10000 = 205;
               break;
            case 189:
               var10000 = 242;
               break;
            case 190:
               var10000 = 191;
               break;
            case 191:
               var10000 = 78;
               break;
            case 192:
               var10000 = 203;
               break;
            case 193:
               var10000 = 100;
               break;
            case 194:
               var10000 = 99;
               break;
            case 195:
               var10000 = 199;
               break;
            case 196:
               var10000 = 198;
               break;
            case 197:
               var10000 = 90;
               break;
            case 198:
               var10000 = 107;
               break;
            case 199:
               var10000 = 146;
               break;
            case 200:
               var10000 = 49;
               break;
            case 201:
               var10000 = 69;
               break;
            case 202:
               var10000 = 15;
               break;
            case 203:
               var10000 = 192;
               break;
            case 204:
               var10000 = 104;
               break;
            case 205:
               var10000 = 47;
               break;
            case 206:
               var10000 = 241;
               break;
            case 207:
               var10000 = 61;
               break;
            case 208:
               var10000 = 215;
               break;
            case 209:
               var10000 = 220;
               break;
            case 210:
               var10000 = 120;
               break;
            case 211:
               var10000 = 140;
               break;
            case 212:
               var10000 = 143;
               break;
            case 213:
               var10000 = 130;
               break;
            case 214:
               var10000 = 19;
               break;
            case 215:
               var10000 = 232;
               break;
            case 216:
               var10000 = 67;
               break;
            case 217:
               var10000 = 84;
               break;
            case 218:
               var10000 = 151;
               break;
            case 219:
               var10000 = 223;
               break;
            case 220:
               var10000 = 182;
               break;
            case 221:
               var10000 = 48;
               break;
            case 222:
               var10000 = 206;
               break;
            case 223:
               var10000 = 17;
               break;
            case 224:
               var10000 = 186;
               break;
            case 225:
               var10000 = 158;
               break;
            case 226:
               var10000 = 83;
               break;
            case 227:
               var10000 = 147;
               break;
            case 228:
               var10000 = 38;
               break;
            case 229:
               var10000 = 207;
               break;
            case 230:
               var10000 = 89;
               break;
            case 231:
               var10000 = 28;
               break;
            case 232:
               var10000 = 123;
               break;
            case 233:
               var10000 = 133;
               break;
            case 234:
               var10000 = 152;
               break;
            case 235:
               var10000 = 93;
               break;
            case 236:
               var10000 = 247;
               break;
            case 237:
               var10000 = 159;
               break;
            case 238:
               var10000 = 218;
               break;
            case 239:
               var10000 = 177;
               break;
            case 240:
               var10000 = 12;
               break;
            case 241:
               var10000 = 255;
               break;
            case 242:
               var10000 = 126;
               break;
            case 243:
               var10000 = 65;
               break;
            case 244:
               var10000 = 187;
               break;
            case 245:
               var10000 = 173;
               break;
            case 246:
               var10000 = 157;
               break;
            case 247:
               var10000 = 27;
               break;
            case 248:
               var10000 = 4;
               break;
            case 249:
               var10000 = 139;
               break;
            case 250:
               var10000 = 62;
               break;
            case 251:
               var10000 = 224;
               break;
            case 252:
               var10000 = 132;
               break;
            case 253:
               var10000 = 16;
               break;
            case 254:
               var10000 = 226;
               break;
            default:
               var10000 = 234;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "0WáKÕÌ®·\u0092¹Ëd\u0085ZøÁ\u0094§ùôð\u0081èFI´íÄ\u0088u!õ\u0091Ý¾\u0093+ò$i\u0093rµ\u0013Lî.\n-¦\u0004=%³\u008a1\u001e¿\u0090\u000bÄ)\u0012®Ý¾»\u0018hõ{ê\u0013\u00990\u0006ëð&«§ùÜÃ\u001b9T0ÕÁçÂp";
      int var4 = "0WáKÕÌ®·\u0092¹Ëd\u0085ZøÁ\u0094§ùôð\u0081èFI´íÄ\u0088u!õ\u0091Ý¾\u0093+ò$i\u0093rµ\u0013Lî.\n-¦\u0004=%³\u008a1\u001e¿\u0090\u000bÄ)\u0012®Ý¾»\u0018hõ{ê\u0013\u00990\u0006ëð&«§ùÜÃ\u001b9T0ÕÁçÂp"
         .length();
      char var1 = '.';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 82;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 82;
               var10006 = var6;
            } else {
               var13 = 82;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 82;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 47;
                     break;
                  case 1:
                     var29 = 86;
                     break;
                  case 2:
                     var29 = 39;
                     break;
                  case 3:
                     var29 = 97;
                     break;
                  case 4:
                     var29 = 2;
                     break;
                  case 5:
                     var29 = 19;
                     break;
                  default:
                     var29 = 105;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





