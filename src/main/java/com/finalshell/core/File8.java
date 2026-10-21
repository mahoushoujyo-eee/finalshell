package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
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

public class File8 extends TransferHandler {
   public DataFlavor J;
   public DataFlavor N;
   public DataFlavor[] w;
   public DefaultMutableTreeNode[] A;
   public DefaultMutableTreeNode q;
   public Connection4 B;
   public static String[] a;
   public static String[] b;

   public File8(Connection4 var1) {
      DataFlavor[] var10001 = new DataFlavor[1];
      long var5 = 495072085072944463L;
      DataFlavor[] var4 = var10001;
      Ref.s(495072085072944463L, var4, var5);
      long var7 = 463096657316711081L;
      Ref.s(463096657316711081L, var1, var7);

      try {
         String var2 = a(6139, 18496) + DefaultMutableTreeNode[].class.getName() + "\"";
         DataFlavor var10003 = new DataFlavor(var2);
         long var9 = 372804674539901270L;
         DataFlavor var8 = var10003;
         Ref.s(372804674539901270L, var8, var9);
         Object var10 = 495072085072944463L;
         DataFlavor[] var10004 = (DataFlavor[])Ref.g(495072085072944463L, var10);
         Object var12 = 372804674539901270L;
         ((Object[])false)[this] = (boolean)((DataFlavor)Ref.g(372804674539901270L, var12));
         String var3 = a(6129, 2394) + Object.class.getName() + "\"";
         DataFlavor var10006 = new DataFlavor(var3);
         long var15 = 477015896483761842L;
         DataFlavor var14 = var10006;
         Ref.s(477015896483761842L, var14, var15);
      } catch (ClassNotFoundException var16) {
      }
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      int[] var2;
      TransferSupport var10000;
      label181: {
         var2 = Connection4.I();
         var10000 = var1.isDrop();
         if (var2 != null) {
            if (var10000 == null) {
               return false;
            }

            var1.setShowDropLocation(true);
            var10000 = var1;
            if (var2 == null) {
               break label181;
            }

            Object var13 = 372804674539901270L;
            this.isDataFlavorSupported((DataFlavor)Ref.g(372804674539901270L, var13));
         }

         if (var10000 == null) {
            var10000 = var1;
            if (var2 == null) {
               break label181;
            }

            Object var15 = 477015896483761842L;
            if (this.isDataFlavorSupported((DataFlavor)Ref.g(477015896483761842L, var15))) {
               if (var2 == null) {
                  break label181;
               }

               if (!var1.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                  return false;
               }
            }
         }

         var10000 = var1;
      }

      JTree.DropLocation var3 = (JTree.DropLocation)var10000.getDropLocation();
      TreePath var4 = var3.getPath();
      boolean var5 = false;
      if (var2 != null && var3.getChildIndex() > -1) {
         boolean var31 = true;
      }

      Object var33;
      label202: {
         Object var17 = 465495214303676957L;
         var33 = var17;
         if ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var17) != null) {
            TreePath var32;
            Object var19 = 465495214303676957L;
            super(((DefaultMutableTreeNode)Ref.g(465495214303676957L, var19)).getPath());
            TreePath var6 = var32;
            if (var6.isDescendant(var4)) {
            }

            var33 = var4;
            label152:
            if (var2 != null) {
               if (var4 != null) {
                  var33 = var4;
                  if (var2 == null) {
                     break label152;
                  }

                  if (var4.isDescendant(var6)) {
                     var33 = var6.getParentPath();
                     if (var2 == null) {
                        break label152;
                     }

                     if (var33.equals(var4)) {
                        var33 = var3.getChildIndex();
                        if (var2 == null) {
                           return (boolean)var33;
                        }

                        Object var21 = 465495214303676957L;
                        TreeNode var10004 = ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var21)).getParent();
                        Object var23 = 465495214303676957L;
                        if (var10004 == this.getIndex((DefaultMutableTreeNode)Ref.g(465495214303676957L, var23))) {
                           break label202;
                        }

                        if (var2 == null) {
                           break label152;
                        }

                        var3.getChildIndex();
                        Object var25 = 465495214303676957L;
                        TreeNode var10006 = ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var25)).getParent();
                        Object var27 = 465495214303676957L;
                        if (var10006 == this.getIndex((DefaultMutableTreeNode)Ref.g(465495214303676957L, var27)) + 1) {
                           break label202;
                        }
                     }
                  }
               }

               var33 = this;
               Object var29 = 465495214303676957L;
               ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var29)).getUserObject();
            }

            java.lang.Class var7;
            int var9;
            java.lang.Class var12;
            var7 = var33.getClass();
            JTree.DropLocation var8 = (JTree.DropLocation)var1.getDropLocation();
            var9 = var8.getChildIndex();
            TreePath var10 = var8.getPath();
            DefaultMutableTreeNode var11 = (DefaultMutableTreeNode)var10.getLastPathComponent();
            var12 = var11.getUserObject().getClass();
            var33 = var7.equals(Tf4.class);
            label129:
            if (var2 != null) {
               if (var33 == null) {
                  var33 = var12.equals(com.finalshell.ui.model.Ck4.class);
                  if (var2 == null) {
                     break label129;
                  }

                  if (var33 == null) {
                     return false;
                  }
               }

               var33 = var7.equals(com.finalshell.ui.model.Ck4.class);
            }

            label121:
            if (var2 != null) {
               if (var33 == null) {
                  var33 = var12.equals(com.finalshell.ui.model.Ck4.class);
                  if (var2 == null) {
                     break label121;
                  }

                  if (var33 == null) {
                     return false;
                  }
               }

               var33 = var6.getParentPath().equals(var4);
            }

            label114:
            if (var2 != null) {
               label112:
               if (var33 == null) {
                  label110: {
                     label187: {
                        var33 = var7.equals(com.finalshell.ui.model.Ck4.class);
                        if (var2 != null) {
                           if (var33 == null) {
                              var34 = var12.equals(Tf4.class);
                              if (var2 == null) {
                                 break label110;
                              }

                              if (var34 != 0) {
                                 break label187;
                              }
                           }

                           var33 = var7.equals(Tf4.class);
                        }

                        if (var2 == null) {
                           break label114;
                        }

                        if (var33 == null) {
                           break label112;
                        }

                        var33 = var12.equals(Tf4.class);
                        if (var2 == null) {
                           break label114;
                        }

                        if (var33 == null) {
      long var34;
      long var34;
                           break label112;
                        }
                     }

                     var34 = var9;
                  }

                  if (var34 == -1) {
                  }
               }

               var33 = var6.equals(var4);
            }

            if (var2 != null) {
               if (var33 == null) {
                  return false;
               }

               var33 = var12.equals(Tf4.class);
            }

            if (var2 == null) {
               return (boolean)var33;
            }

            if (var33 == null) {
               var33 = var12.equals(com.finalshell.ui.model.Ck4.class);
               if (var2 == null) {
                  return (boolean)var33;
               }

               if (var33 == null) {
                  return false;
               }
            }
         }

         boolean var10001 = true;
         return (boolean)var33;
      }

      boolean var35 = false;
      return (boolean)var33;
   }

   @Override
   public Transferable createTransferable(JComponent var1) {
      int[] var10000 = Connection4.I();
      JTree var3 = (JTree)var1;
      int[] var2 = var10000;
      TreePath[] var4 = var3.getSelectionPaths();
      if (var4 == null) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         DefaultMutableTreeNode var10001 = (DefaultMutableTreeNode)var4[0].getLastPathComponent();
         long var11 = 465495214303676957L;
         DefaultMutableTreeNode var10 = var10001;
         Ref.s(465495214303676957L, var10, var11);
         Object var12 = 465495214303676957L;
         Object[] var10003 = Registry.packArgs(Ref.g(465495214303676957L, var12));
         long var15 = 397670486969265762L;
         Object[] var14 = var10003;
         var10003 = Ref.h(397670486969265762L, var14, var15);

         try {
            var10003 = (DefaultMutableTreeNode)var10003;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         DefaultMutableTreeNode var7 = var10003;
         var5.add(var7);
         Object var16 = 465495214303676957L;
         this.add((DefaultMutableTreeNode)Ref.g(465495214303676957L, var16));
         int var8 = 1;

         Object var10004;
         while (true) {
            label67:
            if (var8 < var4.length) {
               var10004 = var4;
               if (var2 == null) {
                  break;
               }

               label74: {
                  DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var4[var8].getLastPathComponent();
                  var9.getLevel();
                  File8 var10005 = this;
                  Object var18 = 465495214303676957L;
                  File8 var10006 = ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var18)).getLevel();
                  if (var2 != null) {
                     if (this < var10006 && var2 != null) {
                        break label67;
                     }

                     var10005 = var9.getLevel();
                     if (var2 == null) {
                        break label74;
                     }

                     var10006 = this;
                     Object var20 = 465495214303676957L;
                     ((DefaultMutableTreeNode)Ref.g(465495214303676957L, var20)).getLevel();
                  }

                  if (var10005 > var10006) {
                     Object[] var10007 = Registry.packArgs(var9);
                     long var23 = 397670486969265762L;
                     Object[] var22 = var10007;
                     var10007 = Ref.h(397670486969265762L, var22, var23);

                     try {
                        var10007 = (DefaultMutableTreeNode)var10007;
                     } catch (InvocationTargetException var29) {
                        throw var29.getTargetException();
                     }

                     this.add(var10007);
                     if (var2 != null) {
                        break label74;
                     }
                  }

                  Object[] var37 = Registry.packArgs(var9);
                  long var25 = 397670486969265762L;
                  Object[] var24 = var37;
                  var37 = Ref.h(397670486969265762L, var24, var25);

                  try {
                     var37 = (DefaultMutableTreeNode)var37;
                  } catch (InvocationTargetException var28) {
                     throw var28.getTargetException();
                  }

                  this.add(var37);
                  var6.add(var9);
               }

               var8++;
               if (var2 != null) {
                  continue;
               }
            }

            var10004 = var5.toArray(new DefaultMutableTreeNode[var5.size()]);
            break;
         }

         DefaultMutableTreeNode[] var31 = (DefaultMutableTreeNode[])var10004;
         DefaultMutableTreeNode[] var34 = var6.toArray(new DefaultMutableTreeNode[var6.size()]);
         long var27 = 206399079994630893L;
         DefaultMutableTreeNode[] var26 = var34;
         Ref.s(206399079994630893L, var26, var27);
         return new T02(this, var31);
      }
   }

   public DefaultMutableTreeNode P(TreeNode var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1;
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode();
      var3.setUserObject(var2.getUserObject());
      return var3;
   }

   @Override
   public void exportDone(JComponent var1, Transferable var2, int var3) {
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
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 03c
      // 009: aload 1
      // 00a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 00d: ldc2_w 326043083934480263
      // 010: astore 32
      // 012: astore 31
      // 014: ldc2_w 326043083934480263
      // 017: aload 31
      // 019: aload 32
      // 01b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: goto 02b
      // 027: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: ifne 03b
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 034: athrow
      // 035: bipush 0
      // 036: ireturn
      // 037: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 03a: athrow
      // 03b: aload 0
      // 03c: ldc2_w 463096657316711081
      // 03f: astore 33
      // 041: ldc2_w 463096657316711081
      // 044: aload 33
      // 046: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast com/finalshell/ui/panel/Connection4
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
      // 07b: ldc2_w 229190360333115919
      // 07e: astore 36
      // 080: astore 35
      // 082: ldc2_w 229190360333115919
      // 085: aload 35
      // 087: aload 36
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
      // 0a1: astore 38
      // 0a3: astore 37
      // 0a5: ldc2_w 249787479061393778
      // 0a8: aload 37
      // 0aa: aload 38
      // 0ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0af: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0b2: goto 0b9
      // 0b5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: astore 9
      // 0bb: aload 0
      // 0bc: ldc2_w 463096657316711081
      // 0bf: astore 39
      // 0c1: ldc2_w 463096657316711081
      // 0c4: aload 39
      // 0c6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cc: ldc2_w 346382751221538814
      // 0cf: astore 42
      // 0d1: astore 41
      // 0d3: ldc2_w 346382751221538814
      // 0d6: aload 41
      // 0d8: aload 42
      // 0da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0dd: checkcast com/finalshell/ui/panel/Address
      // 0e0: goto 0e7
      // 0e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: astore 10
      // 0e9: bipush 0
      // 0ea: istore 11
      // 0ec: iload 6
      // 0ee: aload 2
      // 0ef: ifnull 105
      // 0f2: bipush -1
      // 0f3: if_icmple 107
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0fc: athrow
      // 0fd: bipush 1
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 104: athrow
      // 105: istore 11
      // 107: aload 9
      // 109: aload 2
      // 10a: ifnull 126
      // 10d: ifnull 152
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 116: athrow
      // 117: aload 9
      // 119: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 11c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 125: athrow
      // 126: astore 12
      // 128: aload 9
      // 12a: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 12d: astore 13
      // 12f: aload 3
      // 130: aload 9
      // 132: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 135: ldc2_w 181146716655875086
      // 138: astore 44
      // 13a: astore 43
      // 13c: ldc2_w 181146716655875086
      // 13f: aload 43
      // 141: aload 44
      // 143: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 146: checkcast java/awt/Rectangle
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: astore 14
      // 152: aload 0
      // 153: ldc2_w 463096657316711081
      // 156: astore 45
      // 158: ldc2_w 463096657316711081
      // 15b: aload 45
      // 15d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 160: checkcast com/finalshell/ui/panel/Connection4
      // 163: invokevirtual com/finalshell/ui/panel/Connection4.getModel ()Ljavax/swing/tree/TreeModel;
      // 166: checkcast com/finalshell/core/Fy2
      // 169: astore 12
      // 16b: aconst_null
      // 16c: astore 13
      // 16e: aload 1
      // 16f: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 172: astore 14
      // 174: aload 14
      // 176: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 17b: bipush 0
      // 17c: aaload
      // 17d: astore 15
      // 17f: aload 14
      // 181: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 186: astore 16
      // 188: aload 16
      // 18a: arraylength
      // 18b: istore 17
      // 18d: bipush 0
      // 18e: istore 18
      // 190: iload 18
      // 192: iload 17
      // 194: if_icmpge 1c4
      // 197: aload 16
      // 199: iload 18
      // 19b: aaload
      // 19c: astore 19
      // 19e: aload 14
      // 1a0: aload 19
      // 1a2: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 1a7: astore 20
      // 1a9: goto 1bd
      // 1ac: astore 20
      // 1ae: aload 20
      // 1b0: invokevirtual java/awt/datatransfer/UnsupportedFlavorException.printStackTrace ()V
      // 1b3: goto 1bd
      // 1b6: astore 20
      // 1b8: aload 20
      // 1ba: invokevirtual java/io/IOException.printStackTrace ()V
      // 1bd: iinc 18 1
      // 1c0: aload 2
      // 1c1: ifnonnull 190
      // 1c4: aload 0
      // 1c5: ldc2_w 463096657316711081
      // 1c8: astore 47
      // 1ca: ldc2_w 463096657316711081
      // 1cd: aload 47
      // 1cf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d2: checkcast com/finalshell/ui/panel/Connection4
      // 1d5: invokestatic javax/swing/SwingUtilities.windowForComponent (Ljava/awt/Component;)Ljava/awt/Window;
      // 1d8: astore 16
      // 1da: aload 15
      // 1dc: aload 0
      // 1dd: ldc2_w 372804674539901270
      // 1e0: astore 49
      // 1e2: ldc2_w 372804674539901270
      // 1e5: aload 49
      // 1e7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ea: checkcast java/awt/datatransfer/DataFlavor
      // 1ed: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 1f0: aload 2
      // 1f1: ifnull 773
      // 1f4: ifeq 75d
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: ldc2_w 465495214303676957
      // 202: astore 51
      // 204: ldc2_w 465495214303676957
      // 207: aload 51
      // 209: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 20c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 20f: aload 2
      // 210: ifnull 23f
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 219: athrow
      // 21a: ifnull d73
      // 21d: goto 224
      // 220: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 223: athrow
      // 224: aload 0
      // 225: ldc2_w 465495214303676957
      // 228: astore 53
      // 22a: ldc2_w 465495214303676957
      // 22d: aload 53
      // 22f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 232: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 235: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 23e: athrow
      // 23f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 242: ldc com/finalshell/ui/model/Ck4
      // 244: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 247: aload 2
      // 248: ifnull 66b
      // 24b: ifeq 64f
      // 24e: goto 255
      // 251: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 254: athrow
      // 255: aload 0
      // 256: ldc2_w 465495214303676957
      // 259: astore 55
      // 25b: ldc2_w 465495214303676957
      // 25e: aload 55
      // 260: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 263: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 266: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 269: checkcast com/finalshell/ui/model/Ck4
      // 26c: astore 17
      // 26e: aload 17
      // 270: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 273: ldc2_w 272998330038223631
      // 276: astore 58
      // 278: astore 57
      // 27a: ldc2_w 272998330038223631
      // 27d: aload 57
      // 27f: aload 58
      // 281: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 284: checkcast java/io/File
      // 287: goto 28e
      // 28a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28d: athrow
      // 28e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 291: astore 18
      // 293: aload 17
      // 295: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 298: ldc2_w 272998330038223631
      // 29b: astore 60
      // 29d: astore 59
      // 29f: ldc2_w 272998330038223631
      // 2a2: aload 59
      // 2a4: aload 60
      // 2a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a9: checkcast java/io/File
      // 2ac: goto 2b3
      // 2af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b2: athrow
      // 2b3: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 2b6: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2b9: astore 19
      // 2bb: aload 3
      // 2bc: aload 4
      // 2be: invokevirtual javax/swing/JTree$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 2c1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2c4: ldc2_w 180336831534537747
      // 2c7: astore 62
      // 2c9: astore 61
      // 2cb: ldc2_w 180336831534537747
      // 2ce: aload 61
      // 2d0: aload 62
      // 2d2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d5: checkcast javax/swing/tree/TreePath
      // 2d8: goto 2df
      // 2db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: astore 20
      // 2e1: aload 3
      // 2e2: aload 20
      // 2e4: invokevirtual com/finalshell/ui/panel/Connection4.getPathBounds (Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
      // 2e7: astore 21
      // 2e9: aload 8
      // 2eb: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 2ee: checkcast com/finalshell/ui/model/Tf4
      // 2f1: astore 22
      // 2f3: new java/lang/StringBuilder
      // 2f6: dup
      // 2f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2fa: aload 22
      // 2fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ff: ldc2_w 543633160597441792
      // 302: astore 64
      // 304: astore 63
      // 306: ldc2_w 543633160597441792
      // 309: aload 63
      // 30b: aload 64
      // 30d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 310: checkcast java/io/File
      // 313: goto 31a
      // 316: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 319: athrow
      // 31a: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 31d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 320: getstatic java/io/File.separator Ljava/lang/String;
      // 323: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 326: aload 17
      // 328: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 32b: ldc2_w 272998330038223631
      // 32e: astore 66
      // 330: astore 65
      // 332: ldc2_w 272998330038223631
      // 335: aload 65
      // 337: aload 66
      // 339: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33c: checkcast java/io/File
      // 33f: goto 346
      // 342: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 345: athrow
      // 346: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 349: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34f: astore 23
      // 351: new java/io/File
      // 354: dup
      // 355: aload 23
      // 357: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 35a: astore 24
      // 35c: aload 0
      // 35d: ldc2_w 463096657316711081
      // 360: astore 67
      // 362: ldc2_w 463096657316711081
      // 365: aload 67
      // 367: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 36a: aload 19
      // 36c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 36f: ldc2_w 224847783244984261
      // 372: astore 70
      // 374: astore 69
      // 376: ldc2_w 224847783244984261
      // 379: aload 69
      // 37b: aload 70
      // 37d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 380: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 383: goto 38a
      // 386: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 389: athrow
      // 38a: astore 25
      // 38c: aload 12
      // 38e: aload 0
      // 38f: ldc2_w 465495214303676957
      // 392: astore 71
      // 394: ldc2_w 465495214303676957
      // 397: aload 71
      // 399: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 39c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 39f: invokevirtual com/finalshell/core/Fy2.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 3a2: aload 25
      // 3a4: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3a7: checkcast com/finalshell/ui/model/Tf4
      // 3aa: astore 26
      // 3ac: aload 26
      // 3ae: aload 18
      // 3b0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3b3: ldc2_w 548576199562161390
      // 3b6: astore 74
      // 3b8: astore 73
      // 3ba: ldc2_w 548576199562161390
      // 3bd: aload 73
      // 3bf: aload 74
      // 3c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c4: pop
      // 3c5: goto 3cc
      // 3c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3cb: athrow
      // 3cc: aload 0
      // 3cd: ldc2_w 463096657316711081
      // 3d0: astore 75
      // 3d2: ldc2_w 463096657316711081
      // 3d5: aload 75
      // 3d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3da: aload 18
      // 3dc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3df: ldc2_w 247985076524053530
      // 3e2: astore 78
      // 3e4: astore 77
      // 3e6: ldc2_w 247985076524053530
      // 3e9: aload 77
      // 3eb: aload 78
      // 3ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f0: pop
      // 3f1: goto 3f8
      // 3f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f7: athrow
      // 3f8: aload 19
      // 3fa: aload 22
      // 3fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3ff: ldc2_w 543633160597441792
      // 402: astore 80
      // 404: astore 79
      // 406: ldc2_w 543633160597441792
      // 409: aload 79
      // 40b: aload 80
      // 40d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 410: checkcast java/io/File
      // 413: goto 41a
      // 416: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 419: athrow
      // 41a: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 41d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 420: aload 2
      // 421: ifnull 47e
      // 424: ifne 47f
      // 427: goto 42e
      // 42a: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 42d: athrow
      // 42e: aload 17
      // 430: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 433: ldc2_w 272998330038223631
      // 436: astore 82
      // 438: astore 81
      // 43a: ldc2_w 272998330038223631
      // 43d: aload 81
      // 43f: aload 82
      // 441: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 444: checkcast java/io/File
      // 447: goto 44e
      // 44a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44d: athrow
      // 44e: aload 24
      // 450: invokestatic com/finalshell/core/Cz2.v (Ljava/io/File;Ljava/io/File;)Z
      // 453: pop
      // 454: aload 17
      // 456: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 459: ldc2_w 272998330038223631
      // 45c: astore 84
      // 45e: astore 83
      // 460: ldc2_w 272998330038223631
      // 463: aload 83
      // 465: aload 84
      // 467: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 46a: checkcast java/io/File
      // 46d: goto 474
      // 470: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 473: athrow
      // 474: invokevirtual java/io/File.delete ()Z
      // 477: goto 47e
      // 47a: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 47d: athrow
      // 47e: pop
      // 47f: new com/finalshell/ui/model/Ck4
      // 482: dup
      // 483: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 486: astore 27
      // 488: aload 27
      // 48a: aload 24
      // 48c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 48f: ldc2_w 325634526741383265
      // 492: astore 86
      // 494: astore 85
      // 496: ldc2_w 325634526741383265
      // 499: aload 85
      // 49b: aload 86
      // 49d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a0: pop
      // 4a1: goto 4a8
      // 4a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a7: athrow
      // 4a8: aload 22
      // 4aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4ad: ldc2_w 248698316749304686
      // 4b0: astore 88
      // 4b2: astore 87
      // 4b4: ldc2_w 248698316749304686
      // 4b7: aload 87
      // 4b9: aload 88
      // 4bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4be: checkcast java/util/List
      // 4c1: goto 4c8
      // 4c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c7: athrow
      // 4c8: aload 27
      // 4ca: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4cf: pop
      // 4d0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4d3: ldc2_w 270389152141252877
      // 4d6: astore 89
      // 4d8: ldc2_w 270389152141252877
      // 4db: aload 89
      // 4dd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e0: goto 4e7
      // 4e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4ea: ldc2_w 410905379772103887
      // 4ed: astore 92
      // 4ef: astore 91
      // 4f1: ldc2_w 410905379772103887
      // 4f4: aload 91
      // 4f6: aload 92
      // 4f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4fb: goto 502
      // 4fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 501: athrow
      // 502: aload 23
      // 504: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 507: ldc2_w 392060547546048329
      // 50a: astore 94
      // 50c: astore 93
      // 50e: ldc2_w 392060547546048329
      // 511: aload 93
      // 513: aload 94
      // 515: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 518: goto 51f
      // 51b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 51e: athrow
      // 51f: pop
      // 520: goto 52a
      // 523: astore 28
      // 525: aload 28
      // 527: invokevirtual java/lang/Exception.printStackTrace ()V
      // 52a: new javax/swing/tree/DefaultMutableTreeNode
      // 52d: dup
      // 52e: aload 27
      // 530: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 533: astore 28
      // 535: aload 0
      // 536: ldc2_w 463096657316711081
      // 539: astore 95
      // 53b: ldc2_w 463096657316711081
      // 53e: aload 95
      // 540: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 543: aload 28
      // 545: aload 27
      // 547: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 54a: ldc2_w 388490145237843992
      // 54d: astore 98
      // 54f: astore 97
      // 551: ldc2_w 388490145237843992
      // 554: aload 97
      // 556: aload 98
      // 558: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55b: pop
      // 55c: goto 563
      // 55f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 562: athrow
      // 563: aload 19
      // 565: aload 2
      // 566: ifnull 5ce
      // 569: aload 22
      // 56b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 56e: ldc2_w 543633160597441792
      // 571: astore 100
      // 573: astore 99
      // 575: ldc2_w 543633160597441792
      // 578: aload 99
      // 57a: aload 100
      // 57c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 57f: checkcast java/io/File
      // 582: goto 589
      // 585: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 588: athrow
      // 589: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 58c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 58f: ifne 5b4
      // 592: goto 599
      // 595: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 598: athrow
      // 599: aload 4
      // 59b: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 59e: istore 6
      // 5a0: aload 2
      // 5a1: ifnull 5bf
      // 5a4: iload 6
      // 5a6: bipush -1
      // 5a7: if_icmpne 5b4
      // 5aa: goto 5b1
      // 5ad: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 5b0: athrow
      // 5b1: bipush 0
      // 5b2: istore 6
      // 5b4: aload 12
      // 5b6: aload 28
      // 5b8: aload 8
      // 5ba: iload 6
      // 5bc: invokevirtual com/finalshell/core/Fy2.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 5bf: new java/io/File
      // 5c2: dup
      // 5c3: aload 23
      // 5c5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5c8: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 5cb: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 5ce: astore 29
      // 5d0: aload 0
      // 5d1: ldc2_w 463096657316711081
      // 5d4: astore 101
      // 5d6: ldc2_w 463096657316711081
      // 5d9: aload 101
      // 5db: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5de: aload 29
      // 5e0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5e3: ldc2_w 224847783244984261
      // 5e6: astore 104
      // 5e8: astore 103
      // 5ea: ldc2_w 224847783244984261
      // 5ed: aload 103
      // 5ef: aload 104
      // 5f1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f4: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 5f7: goto 5fe
      // 5fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5fd: athrow
      // 5fe: astore 30
      // 600: aload 0
      // 601: ldc2_w 463096657316711081
      // 604: astore 105
      // 606: ldc2_w 463096657316711081
      // 609: aload 105
      // 60b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 60e: checkcast com/finalshell/ui/panel/Connection4
      // 611: new javax/swing/tree/TreePath
      // 614: dup
      // 615: aload 8
      // 617: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 61a: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 61d: invokevirtual com/finalshell/ui/panel/Connection4.expandPath (Ljavax/swing/tree/TreePath;)V
      // 620: aload 0
      // 621: ldc2_w 463096657316711081
      // 624: astore 107
      // 626: ldc2_w 463096657316711081
      // 629: aload 107
      // 62b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 62e: aload 28
      // 630: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 633: ldc2_w 325887470340955715
      // 636: astore 110
      // 638: astore 109
      // 63a: ldc2_w 325887470340955715
      // 63d: aload 109
      // 63f: aload 110
      // 641: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 644: pop
      // 645: goto 64c
      // 648: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 64b: athrow
      // 64c: goto d73
      // 64f: aload 0
      // 650: ldc2_w 465495214303676957
      // 653: astore 111
      // 655: ldc2_w 465495214303676957
      // 658: aload 111
      // 65a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 65d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 660: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 663: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 666: ldc com/finalshell/ui/model/Tf4
      // 668: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 66b: aload 2
      // 66c: ifnull d74
      // 66f: ifeq d73
      // 672: goto 679
      // 675: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 678: athrow
      // 679: aload 0
      // 67a: ldc2_w 465495214303676957
      // 67d: astore 113
      // 67f: ldc2_w 465495214303676957
      // 682: aload 113
      // 684: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 687: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 68a: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 68d: checkcast com/finalshell/ui/model/Tf4
      // 690: astore 17
      // 692: aload 8
      // 694: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 697: checkcast com/finalshell/ui/model/Tf4
      // 69a: astore 18
      // 69c: aload 16
      // 69e: new java/lang/StringBuilder
      // 6a1: dup
      // 6a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 6a5: sipush 6133
      // 6a8: sipush 14727
      // 6ab: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 6ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b1: aload 17
      // 6b3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6b6: ldc2_w 498856411508641826
      // 6b9: astore 116
      // 6bb: astore 115
      // 6bd: ldc2_w 498856411508641826
      // 6c0: aload 115
      // 6c2: aload 116
      // 6c4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6c7: checkcast java/lang/String
      // 6ca: goto 6d1
      // 6cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6d0: athrow
      // 6d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d4: sipush 6130
      // 6d7: sipush 16313
      // 6da: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 6dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e0: aload 18
      // 6e2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6e5: ldc2_w 498856411508641826
      // 6e8: astore 118
      // 6ea: astore 117
      // 6ec: ldc2_w 498856411508641826
      // 6ef: aload 117
      // 6f1: aload 118
      // 6f3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f6: checkcast java/lang/String
      // 6f9: goto 700
      // 6fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6ff: athrow
      // 700: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 703: ldc_w ""
      // 706: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 709: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 70c: sipush 6131
      // 70f: sipush 10341
      // 712: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 715: bipush 2
      // 716: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // 719: istore 19
      // 71b: iload 19
      // 71d: ifne 75a
      // 720: ldc2_w 388376917454860932
      // 723: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 726: aconst_null
      // 727: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 72a: new com/finalshell/task/KC3
      // 72d: dup
      // 72e: aload 0
      // 72f: aload 3
      // 730: aload 17
      // 732: aload 18
      // 734: invokespecial com/finalshell/task/KC3.<init> (Lcom/finalshell/core/File8;Lcom/finalshell/ui/panel/Connection4;Lcom/finalshell/ui/model/Tf4;Lcom/finalshell/ui/model/Tf4;)V
      // 737: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 73a: ldc2_w 434592463220957006
      // 73d: astore 120
      // 73f: astore 119
      // 741: ldc2_w 434592463220957006
      // 744: aload 119
      // 746: aload 120
      // 748: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 74b: pop
      // 74c: goto 753
      // 74f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 752: athrow
      // 753: goto 75a
      // 756: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 759: athrow
      // 75a: goto d73
      // 75d: aload 15
      // 75f: aload 0
      // 760: ldc2_w 477015896483761842
      // 763: astore 121
      // 765: ldc2_w 477015896483761842
      // 768: aload 121
      // 76a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 76d: checkcast java/awt/datatransfer/DataFlavor
      // 770: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 773: aload 2
      // 774: ifnull a82
      // 777: ifeq a7a
      // 77a: goto 781
      // 77d: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 780: athrow
      // 781: aconst_null
      // 782: astore 17
      // 784: aload 14
      // 786: aload 0
      // 787: ldc2_w 477015896483761842
      // 78a: astore 123
      // 78c: ldc2_w 477015896483761842
      // 78f: aload 123
      // 791: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 794: checkcast java/awt/datatransfer/DataFlavor
      // 797: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 79c: checkcast [Ljava/lang/Object;
      // 79f: astore 17
      // 7a1: goto 7ab
      // 7a4: astore 18
      // 7a6: aload 18
      // 7a8: invokevirtual java/lang/Exception.printStackTrace ()V
      // 7ab: aload 17
      // 7ad: astore 18
      // 7af: aload 18
      // 7b1: arraylength
      // 7b2: istore 19
      // 7b4: bipush 0
      // 7b5: istore 20
      // 7b7: iload 20
      // 7b9: iload 19
      // 7bb: if_icmpge a77
      // 7be: aload 18
      // 7c0: iload 20
      // 7c2: aaload
      // 7c3: astore 21
      // 7c5: aload 21
      // 7c7: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 7ca: ldc com/finalshell/ui/model/Tf4
      // 7cc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 7cf: aload 2
      // 7d0: ifnull d74
      // 7d3: aload 2
      // 7d4: ifnull 935
      // 7d7: goto 7de
      // 7da: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 7dd: athrow
      // 7de: ifeq 919
      // 7e1: goto 7e8
      // 7e4: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 7e7: athrow
      // 7e8: aload 21
      // 7ea: checkcast com/finalshell/ui/model/Tf4
      // 7ed: astore 22
      // 7ef: aload 8
      // 7f1: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 7f4: checkcast com/finalshell/ui/model/Tf4
      // 7f7: astore 23
      // 7f9: aload 3
      // 7fa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7fd: ldc2_w 212042562452272939
      // 800: astore 126
      // 802: astore 125
      // 804: ldc2_w 212042562452272939
      // 807: aload 125
      // 809: aload 126
      // 80b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 80e: checkcast com/finalshell/connection/Connection12
      // 811: goto 818
      // 814: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 817: athrow
      // 818: astore 24
      // 81a: aload 22
      // 81c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 81f: ldc2_w 498856411508641826
      // 822: astore 128
      // 824: astore 127
      // 826: ldc2_w 498856411508641826
      // 829: aload 127
      // 82b: aload 128
      // 82d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 830: goto 837
      // 833: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 836: athrow
      // 837: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 83a: ldc2_w 159824902428932603
      // 83d: astore 129
      // 83f: ldc2_w 159824902428932603
      // 842: aload 129
      // 844: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 847: checkcast java/lang/String
      // 84a: goto 851
      // 84d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 850: athrow
      // 851: astore 25
      // 853: aload 16
      // 855: new java/lang/StringBuilder
      // 858: dup
      // 859: invokespecial java/lang/StringBuilder.<init> ()V
      // 85c: sipush 6132
      // 85f: sipush -29492
      // 862: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 865: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 868: aload 22
      // 86a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 86d: ldc2_w 498856411508641826
      // 870: astore 132
      // 872: astore 131
      // 874: ldc2_w 498856411508641826
      // 877: aload 131
      // 879: aload 132
      // 87b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 87e: checkcast java/lang/String
      // 881: goto 888
      // 884: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 887: athrow
      // 888: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 88b: sipush 6128
      // 88e: sipush -13821
      // 891: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 894: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 897: aload 23
      // 899: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 89c: ldc2_w 498856411508641826
      // 89f: astore 134
      // 8a1: astore 133
      // 8a3: ldc2_w 498856411508641826
      // 8a6: aload 133
      // 8a8: aload 134
      // 8aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8ad: checkcast java/lang/String
      // 8b0: goto 8b7
      // 8b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8b6: athrow
      // 8b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8ba: ldc_w ""
      // 8bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c3: sipush 6134
      // 8c6: sipush -28080
      // 8c9: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 8cc: bipush 2
      // 8cd: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // 8d0: istore 26
      // 8d2: iload 26
      // 8d4: ifne 915
      // 8d7: ldc2_w 388376917454860932
      // 8da: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 8dd: aconst_null
      // 8de: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 8e1: new com/finalshell/task/M2
      // 8e4: dup
      // 8e5: aload 0
      // 8e6: aload 24
      // 8e8: aload 22
      // 8ea: aload 23
      // 8ec: aload 25
      // 8ee: aload 3
      // 8ef: invokespecial com/finalshell/task/M2.<init> (Lcom/finalshell/core/File8;Lcom/finalshell/connection/Connection12;Lcom/finalshell/ui/model/Tf4;Lcom/finalshell/ui/model/Tf4;Ljava/lang/String;Lcom/finalshell/ui/panel/Connection4;)V
      // 8f2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8f5: ldc2_w 434592463220957006
      // 8f8: astore 136
      // 8fa: astore 135
      // 8fc: ldc2_w 434592463220957006
      // 8ff: aload 135
      // 901: aload 136
      // 903: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 906: pop
      // 907: goto 90e
      // 90a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 90d: athrow
      // 90e: goto 915
      // 911: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 914: athrow
      // 915: aload 2
      // 916: ifnonnull a70
      // 919: aload 21
      // 91b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 91e: aload 2
      // 91f: ifnull 93a
      // 922: goto 929
      // 925: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 928: athrow
      // 929: ldc com/finalshell/ui/model/Ck4
      // 92b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 92e: goto 935
      // 931: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 934: athrow
      // 935: ifeq a70
      // 938: aload 21
      // 93a: checkcast com/finalshell/ui/model/Ck4
      // 93d: astore 22
      // 93f: aload 8
      // 941: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 944: checkcast com/finalshell/ui/model/Tf4
      // 947: astore 23
      // 949: aload 3
      // 94a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 94d: ldc2_w 212042562452272939
      // 950: astore 138
      // 952: astore 137
      // 954: ldc2_w 212042562452272939
      // 957: aload 137
      // 959: aload 138
      // 95b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 95e: checkcast com/finalshell/connection/Connection12
      // 961: goto 968
      // 964: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 967: athrow
      // 968: astore 24
      // 96a: aload 22
      // 96c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 96f: ldc2_w 605430732347023634
      // 972: astore 140
      // 974: astore 139
      // 976: ldc2_w 605430732347023634
      // 979: aload 139
      // 97b: aload 140
      // 97d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 980: goto 987
      // 983: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 986: athrow
      // 987: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 98a: ldc2_w 159824902428932603
      // 98d: astore 141
      // 98f: ldc2_w 159824902428932603
      // 992: aload 141
      // 994: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 997: checkcast java/lang/String
      // 99a: goto 9a1
      // 99d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9a0: athrow
      // 9a1: astore 25
      // 9a3: aload 16
      // 9a5: new java/lang/StringBuilder
      // 9a8: dup
      // 9a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 9ac: sipush 6135
      // 9af: sipush -25487
      // 9b2: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 9b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b8: aload 22
      // 9ba: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 9bd: ldc2_w 605430732347023634
      // 9c0: astore 144
      // 9c2: astore 143
      // 9c4: ldc2_w 605430732347023634
      // 9c7: aload 143
      // 9c9: aload 144
      // 9cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9ce: checkcast java/lang/String
      // 9d1: goto 9d8
      // 9d4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9d7: athrow
      // 9d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9db: sipush 6128
      // 9de: sipush -13821
      // 9e1: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // 9e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e7: aload 23
      // 9e9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 9ec: ldc2_w 498856411508641826
      // 9ef: astore 146
      // 9f1: astore 145
      // 9f3: ldc2_w 498856411508641826
      // 9f6: aload 145
      // 9f8: aload 146
      // 9fa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9fd: checkcast java/lang/String
      // a00: goto a07
      // a03: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a06: athrow
      // a07: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0a: ldc_w ""
      // a0d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a10: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a13: sipush 6134
      // a16: sipush -28080
      // a19: invokestatic com/finalshell/core/File8.a (II)Ljava/lang/String;
      // a1c: bipush 2
      // a1d: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // a20: istore 26
      // a22: aload 2
      // a23: ifnull a73
      // a26: iload 26
      // a28: ifne a70
      // a2b: goto a32
      // a2e: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // a31: athrow
      // a32: ldc2_w 388376917454860932
      // a35: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // a38: aconst_null
      // a39: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // a3c: new com/finalshell/task/UU3
      // a3f: dup
      // a40: aload 0
      // a41: aload 24
      // a43: aload 22
      // a45: aload 23
      // a47: aload 25
      // a49: aload 3
      // a4a: invokespecial com/finalshell/task/UU3.<init> (Lcom/finalshell/core/File8;Lcom/finalshell/connection/Connection12;Lcom/finalshell/ui/model/Ck4;Lcom/finalshell/ui/model/Tf4;Ljava/lang/String;Lcom/finalshell/ui/panel/Connection4;)V
      // a4d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // a50: ldc2_w 434592463220957006
      // a53: astore 148
      // a55: astore 147
      // a57: ldc2_w 434592463220957006
      // a5a: aload 147
      // a5c: aload 148
      // a5e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a61: pop
      // a62: goto a69
      // a65: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a68: athrow
      // a69: goto a70
      // a6c: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // a6f: athrow
      // a70: iinc 20 1
      // a73: aload 2
      // a74: ifnonnull 7b7
      // a77: goto d73
      // a7a: aload 15
      // a7c: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor Ljava/awt/datatransfer/DataFlavor;
      // a7f: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // a82: aload 2
      // a83: ifnull d74
      // a86: ifeq d73
      // a89: goto a90
      // a8c: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // a8f: athrow
      // a90: aconst_null
      // a91: astore 17
      // a93: aload 14
      // a95: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor Ljava/awt/datatransfer/DataFlavor;
      // a98: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // a9d: checkcast java/util/List
      // aa0: astore 17
      // aa2: goto ab6
      // aa5: astore 18
      // aa7: aload 18
      // aa9: invokevirtual java/awt/datatransfer/UnsupportedFlavorException.printStackTrace ()V
      // aac: goto ab6
      // aaf: astore 18
      // ab1: aload 18
      // ab3: invokevirtual java/io/IOException.printStackTrace ()V
      // ab6: aload 17
      // ab8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // abd: astore 18
      // abf: aload 18
      // ac1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // ac6: ifeq ad9
      // ac9: aload 18
      // acb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ad0: checkcast java/io/File
      // ad3: astore 19
      // ad5: aload 2
      // ad6: ifnonnull abf
      // ad9: new java/util/ArrayList
      // adc: dup
      // add: invokespecial java/util/ArrayList.<init> ()V
      // ae0: astore 18
      // ae2: new java/util/ArrayList
      // ae5: dup
      // ae6: invokespecial java/util/ArrayList.<init> ()V
      // ae9: astore 19
      // aeb: aconst_null
      // aec: astore 20
      // aee: aload 8
      // af0: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // af3: checkcast com/finalshell/ui/model/Tf4
      // af6: astore 21
      // af8: aload 21
      // afa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // afd: ldc2_w 498856411508641826
      // b00: astore 150
      // b02: astore 149
      // b04: ldc2_w 498856411508641826
      // b07: aload 149
      // b09: aload 150
      // b0b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b0e: checkcast java/lang/String
      // b11: goto b18
      // b14: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b17: athrow
      // b18: astore 22
      // b1a: aload 17
      // b1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // b21: astore 23
      // b23: aload 23
      // b25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b2a: ifeq c26
      // b2d: aload 23
      // b2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b34: checkcast java/io/File
      // b37: astore 24
      // b39: aload 24
      // b3b: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // b3e: astore 20
      // b40: aload 24
      // b42: invokevirtual java/io/File.isDirectory ()Z
      // b45: aload 2
      // b46: ifnull c79
      // b49: aload 2
      // b4a: ifnull bfb
      // b4d: goto b54
      // b50: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // b53: athrow
      // b54: ifeq bef
      // b57: goto b5e
      // b5a: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // b5d: athrow
      // b5e: aload 18
      // b60: new java/io/File
      // b63: dup
      // b64: aload 24
      // b66: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // b69: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // b6c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // b6f: pop
      // b70: aload 24
      // b72: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // b75: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // b78: ldc2_w 519932412477559507
      // b7b: astore 151
      // b7d: ldc2_w 519932412477559507
      // b80: aload 151
      // b82: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // b85: checkcast java/util/ArrayList
      // b88: goto b8f
      // b8b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b8e: athrow
      // b8f: astore 25
      // b91: aload 25
      // b93: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // b96: astore 26
      // b98: aload 26
      // b9a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b9f: ifeq beb
      // ba2: aload 26
      // ba4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ba9: checkcast java/io/File
      // bac: astore 27
      // bae: aload 27
      // bb0: invokevirtual java/io/File.isDirectory ()Z
      // bb3: aload 2
      // bb4: ifnull b2a
      // bb7: aload 2
      // bb8: ifnull be6
      // bbb: ifeq bd8
      // bbe: goto bc5
      // bc1: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // bc4: athrow
      // bc5: aload 18
      // bc7: aload 27
      // bc9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // bcc: pop
      // bcd: aload 2
      // bce: ifnonnull be7
      // bd1: goto bd8
      // bd4: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // bd7: athrow
      // bd8: aload 19
      // bda: aload 27
      // bdc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // bdf: goto be6
      // be2: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // be5: athrow
      // be6: pop
      // be7: aload 2
      // be8: ifnonnull b98
      // beb: aload 2
      // bec: ifnonnull c22
      // bef: aload 24
      // bf1: invokevirtual java/io/File.isFile ()Z
      // bf4: goto bfb
      // bf7: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // bfa: athrow
      // bfb: aload 2
      // bfc: ifnull c21
      // bff: ifeq c22
      // c02: goto c09
      // c05: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // c08: athrow
      // c09: aload 19
      // c0b: new java/io/File
      // c0e: dup
      // c0f: aload 24
      // c11: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // c14: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // c17: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // c1a: goto c21
      // c1d: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // c20: athrow
      // c21: pop
      // c22: aload 2
      // c23: ifnonnull b23
      // c26: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // c29: ldc2_w 270389152141252877
      // c2c: astore 153
      // c2e: ldc2_w 270389152141252877
      // c31: aload 153
      // c33: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // c36: goto c3d
      // c39: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c3c: athrow
      // c3d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // c40: ldc2_w 306266403902896148
      // c43: astore 156
      // c45: astore 155
      // c47: ldc2_w 306266403902896148
      // c4a: aload 155
      // c4c: aload 156
      // c4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c51: goto c58
      // c54: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c57: athrow
      // c58: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // c5b: ldc2_w 518178624564683680
      // c5e: astore 158
      // c60: astore 157
      // c62: ldc2_w 518178624564683680
      // c65: aload 157
      // c67: aload 158
      // c69: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c6c: checkcast java/lang/Boolean
      // c6f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // c72: goto c79
      // c75: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c78: athrow
      // c79: aload 2
      // c7a: ifnull ce1
      // c7d: ifeq d35
      // c80: goto c87
      // c83: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // c86: athrow
      // c87: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // c8a: ldc2_w 270389152141252877
      // c8d: astore 159
      // c8f: ldc2_w 270389152141252877
      // c92: aload 159
      // c94: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // c97: goto c9e
      // c9a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c9d: athrow
      // c9e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // ca1: ldc2_w 163462326892114024
      // ca4: astore 162
      // ca6: astore 161
      // ca8: ldc2_w 163462326892114024
      // cab: aload 161
      // cad: aload 162
      // caf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // cb2: goto cb9
      // cb5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // cb8: athrow
      // cb9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // cbc: ldc2_w 633712494917113170
      // cbf: astore 164
      // cc1: astore 163
      // cc3: ldc2_w 633712494917113170
      // cc6: aload 163
      // cc8: aload 164
      // cca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // ccd: checkcast java/lang/Boolean
      // cd0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // cd3: goto cda
      // cd6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // cd9: athrow
      // cda: goto ce1
      // cdd: invokestatic com/finalshell/core/File8.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ce0: athrow
      // ce1: ifeq d35
      // ce4: aload 20
      // ce6: astore 23
      // ce8: new com/finalshell/ui/dialog/Nq2
      // ceb: dup
      // cec: aload 10
      // cee: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // cf1: aload 10
      // cf3: invokespecial com/finalshell/ui/dialog/Nq2.<init> (Ljava/awt/Window;Lcom/finalshell/ui/panel/Address;)V
      // cf6: astore 24
      // cf8: aload 17
      // cfa: astore 25
      // cfc: ldc2_w 388376917454860932
      // cff: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // d02: aconst_null
      // d03: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // d06: new com/finalshell/task/TG
      // d09: dup
      // d0a: aload 0
      // d0b: aload 23
      // d0d: aload 24
      // d0f: aload 25
      // d11: aload 22
      // d13: invokespecial com/finalshell/task/TG.<init> (Lcom/finalshell/core/File8;Ljava/lang/String;Lcom/finalshell/ui/dialog/Nq2;Ljava/util/List;Ljava/lang/String;)V
      // d16: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // d19: ldc2_w 434592463220957006
      // d1c: astore 166
      // d1e: astore 165
      // d20: ldc2_w 434592463220957006
      // d23: aload 165
      // d25: aload 166
      // d27: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // d2a: pop
      // d2b: goto d32
      // d2e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // d31: athrow
      // d32: goto d71
      // d35: aload 20
      // d37: astore 23
      // d39: ldc2_w 388376917454860932
      // d3c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // d3f: aconst_null
      // d40: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // d43: new com/finalshell/task/FileJob
      // d46: dup
      // d47: aload 0
      // d48: aload 18
      // d4a: aload 10
      // d4c: aload 23
      // d4e: aload 22
      // d50: aload 19
      // d52: invokespecial com/finalshell/task/FileJob.<init> (Lcom/finalshell/core/File8;Ljava/util/ArrayList;Lcom/finalshell/ui/panel/Address;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
      // d55: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // d58: ldc2_w 434592463220957006
      // d5b: astore 168
      // d5d: astore 167
      // d5f: ldc2_w 434592463220957006
      // d62: aload 167
      // d64: aload 168
      // d66: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // d69: pop
      // d6a: goto d71
      // d6d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // d70: athrow
      // d71: bipush 1
      // d72: ireturn
      // d73: bipush 1
      // d74: ireturn
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 6131) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 19;
               break;
            case 1:
               var10000 = 5;
               break;
            case 2:
               var10000 = 176;
               break;
            case 3:
               var10000 = 167;
               break;
            case 4:
               var10000 = 145;
               break;
            case 5:
               var10000 = 123;
               break;
            case 6:
               var10000 = 29;
               break;
            case 7:
               var10000 = 231;
               break;
            case 8:
               var10000 = 253;
               break;
            case 9:
               var10000 = 124;
               break;
            case 10:
               var10000 = 73;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 106;
               break;
            case 13:
               var10000 = 111;
               break;
            case 14:
               var10000 = 84;
               break;
            case 15:
               var10000 = 189;
               break;
            case 16:
               var10000 = 56;
               break;
            case 17:
               var10000 = 142;
               break;
            case 18:
               var10000 = 171;
               break;
            case 19:
               var10000 = 99;
               break;
            case 20:
               var10000 = 198;
               break;
            case 21:
               var10000 = 117;
               break;
            case 22:
               var10000 = 200;
               break;
            case 23:
               var10000 = 172;
               break;
            case 24:
               var10000 = 209;
               break;
            case 25:
               var10000 = 101;
               break;
            case 26:
               var10000 = 85;
               break;
            case 27:
               var10000 = 76;
               break;
            case 28:
               var10000 = 100;
               break;
            case 29:
               var10000 = 128;
               break;
            case 30:
               var10000 = 233;
               break;
            case 31:
               var10000 = 173;
               break;
            case 32:
               var10000 = 183;
               break;
            case 33:
               var10000 = 219;
               break;
            case 34:
               var10000 = 191;
               break;
            case 35:
               var10000 = 8;
               break;
            case 36:
               var10000 = 14;
               break;
            case 37:
               var10000 = 20;
               break;
            case 38:
               var10000 = 135;
               break;
            case 39:
               var10000 = 180;
               break;
            case 40:
               var10000 = 92;
               break;
            case 41:
               var10000 = 186;
               break;
            case 42:
               var10000 = 245;
               break;
            case 43:
               var10000 = 68;
               break;
            case 44:
               var10000 = 94;
               break;
            case 45:
               var10000 = 133;
               break;
            case 46:
               var10000 = 116;
               break;
            case 47:
               var10000 = 121;
               break;
            case 48:
               var10000 = 113;
               break;
            case 49:
               var10000 = 136;
               break;
            case 50:
               var10000 = 64;
               break;
            case 51:
               var10000 = 90;
               break;
            case 52:
               var10000 = 125;
               break;
            case 53:
               var10000 = 226;
               break;
            case 54:
               var10000 = 65;
               break;
            case 55:
               var10000 = 22;
               break;
            case 56:
               var10000 = 254;
               break;
            case 57:
               var10000 = 195;
               break;
            case 58:
               var10000 = 193;
               break;
            case 59:
               var10000 = 160;
               break;
            case 60:
               var10000 = 184;
               break;
            case 61:
               var10000 = 227;
               break;
            case 62:
               var10000 = 181;
               break;
            case 63:
               var10000 = 251;
               break;
            case 64:
               var10000 = 146;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 187;
               break;
            case 67:
               var10000 = 66;
               break;
            case 68:
               var10000 = 26;
               break;
            case 69:
               var10000 = 162;
               break;
            case 70:
               var10000 = 154;
               break;
            case 71:
               var10000 = 229;
               break;
            case 72:
               var10000 = 51;
               break;
            case 73:
               var10000 = 53;
               break;
            case 74:
               var10000 = 225;
               break;
            case 75:
               var10000 = 3;
               break;
            case 76:
               var10000 = 16;
               break;
            case 77:
               var10000 = 217;
               break;
            case 78:
               var10000 = 252;
               break;
            case 79:
               var10000 = 33;
               break;
            case 80:
               var10000 = 159;
               break;
            case 81:
               var10000 = 21;
               break;
            case 82:
               var10000 = 40;
               break;
            case 83:
               var10000 = 237;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 248;
               break;
            case 86:
               var10000 = 91;
               break;
            case 87:
               var10000 = 122;
               break;
            case 88:
               var10000 = 175;
               break;
            case 89:
               var10000 = 132;
               break;
            case 90:
               var10000 = 156;
               break;
            case 91:
               var10000 = 202;
               break;
            case 92:
               var10000 = 105;
               break;
            case 93:
               var10000 = 42;
               break;
            case 94:
               var10000 = 157;
               break;
            case 95:
               var10000 = 213;
               break;
            case 96:
               var10000 = 25;
               break;
            case 97:
               var10000 = 163;
               break;
            case 98:
               var10000 = 27;
               break;
            case 99:
               var10000 = 88;
               break;
            case 100:
               var10000 = 185;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 110;
               break;
            case 103:
               var10000 = 87;
               break;
            case 104:
               var10000 = 95;
               break;
            case 105:
               var10000 = 12;
               break;
            case 106:
               var10000 = 166;
               break;
            case 107:
               var10000 = 98;
               break;
            case 108:
               var10000 = 170;
               break;
            case 109:
               var10000 = 13;
               break;
            case 110:
               var10000 = 137;
               break;
            case 111:
               var10000 = 164;
               break;
            case 112:
               var10000 = 235;
               break;
            case 113:
               var10000 = 242;
               break;
            case 114:
               var10000 = 115;
               break;
            case 115:
               var10000 = 179;
               break;
            case 116:
               var10000 = 216;
               break;
            case 117:
               var10000 = 161;
               break;
            case 118:
               var10000 = 75;
               break;
            case 119:
               var10000 = 220;
               break;
            case 120:
               var10000 = 223;
               break;
            case 121:
               var10000 = 158;
               break;
            case 122:
               var10000 = 46;
               break;
            case 123:
               var10000 = 69;
               break;
            case 124:
               var10000 = 103;
               break;
            case 125:
               var10000 = 222;
               break;
            case 126:
               var10000 = 241;
               break;
            case 127:
               var10000 = 60;
               break;
            case 128:
               var10000 = 109;
               break;
            case 129:
               var10000 = 35;
               break;
            case 130:
               var10000 = 89;
               break;
            case 131:
               var10000 = 23;
               break;
            case 132:
               var10000 = 47;
               break;
            case 133:
               var10000 = 67;
               break;
            case 134:
               var10000 = 151;
               break;
            case 135:
               var10000 = 45;
               break;
            case 136:
               var10000 = 238;
               break;
            case 137:
               var10000 = 11;
               break;
            case 138:
               var10000 = 155;
               break;
            case 139:
               var10000 = 126;
               break;
            case 140:
               var10000 = 82;
               break;
            case 141:
               var10000 = 48;
               break;
            case 142:
               var10000 = 192;
               break;
            case 143:
               var10000 = 169;
               break;
            case 144:
               var10000 = 177;
               break;
            case 145:
               var10000 = 190;
               break;
            case 146:
               var10000 = 6;
               break;
            case 147:
               var10000 = 144;
               break;
            case 148:
               var10000 = 120;
               break;
            case 149:
               var10000 = 143;
               break;
            case 150:
               var10000 = 34;
               break;
            case 151:
               var10000 = 255;
               break;
            case 152:
               var10000 = 218;
               break;
            case 153:
               var10000 = 165;
               break;
            case 154:
               var10000 = 134;
               break;
            case 155:
               var10000 = 77;
               break;
            case 156:
               var10000 = 205;
               break;
            case 157:
               var10000 = 63;
               break;
            case 158:
               var10000 = 54;
               break;
            case 159:
               var10000 = 36;
               break;
            case 160:
               var10000 = 83;
               break;
            case 161:
               var10000 = 188;
               break;
            case 162:
               var10000 = 81;
               break;
            case 163:
               var10000 = 49;
               break;
            case 164:
               var10000 = 236;
               break;
            case 165:
               var10000 = 224;
               break;
            case 166:
               var10000 = 250;
               break;
            case 167:
               var10000 = 247;
               break;
            case 168:
               var10000 = 131;
               break;
            case 169:
               var10000 = 39;
               break;
            case 170:
               var10000 = 7;
               break;
            case 171:
               var10000 = 127;
               break;
            case 172:
               var10000 = 71;
               break;
            case 173:
               var10000 = 215;
               break;
            case 174:
               var10000 = 152;
               break;
            case 175:
               var10000 = 196;
               break;
            case 176:
               var10000 = 78;
               break;
            case 177:
               var10000 = 28;
               break;
            case 178:
               var10000 = 212;
               break;
            case 179:
               var10000 = 182;
               break;
            case 180:
               var10000 = 240;
               break;
            case 181:
               var10000 = 43;
               break;
            case 182:
               var10000 = 201;
               break;
            case 183:
               var10000 = 234;
               break;
            case 184:
               var10000 = 221;
               break;
            case 185:
               var10000 = 93;
               break;
            case 186:
               var10000 = 149;
               break;
            case 187:
               var10000 = 112;
               break;
            case 188:
               var10000 = 211;
               break;
            case 189:
               var10000 = 138;
               break;
            case 190:
               var10000 = 130;
               break;
            case 191:
               var10000 = 168;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 50;
               break;
            case 194:
               var10000 = 243;
               break;
            case 195:
               var10000 = 30;
               break;
            case 196:
               var10000 = 79;
               break;
            case 197:
               var10000 = 80;
               break;
            case 198:
               var10000 = 32;
               break;
            case 199:
               var10000 = 114;
               break;
            case 200:
               var10000 = 139;
               break;
            case 201:
               var10000 = 147;
               break;
            case 202:
               var10000 = 41;
               break;
            case 203:
               var10000 = 232;
               break;
            case 204:
               var10000 = 107;
               break;
            case 205:
               var10000 = 228;
               break;
            case 206:
               var10000 = 204;
               break;
            case 207:
               var10000 = 72;
               break;
            case 208:
               var10000 = 153;
               break;
            case 209:
               var10000 = 10;
               break;
            case 210:
               var10000 = 55;
               break;
            case 211:
               var10000 = 61;
               break;
            case 212:
               var10000 = 140;
               break;
            case 213:
               var10000 = 148;
               break;
            case 214:
               var10000 = 38;
               break;
            case 215:
               var10000 = 2;
               break;
            case 216:
               var10000 = 57;
               break;
            case 217:
               var10000 = 74;
               break;
            case 218:
               var10000 = 206;
               break;
            case 219:
               var10000 = 102;
               break;
            case 220:
               var10000 = 129;
               break;
            case 221:
               var10000 = 0;
               break;
            case 222:
               var10000 = 246;
               break;
            case 223:
               var10000 = 1;
               break;
            case 224:
               var10000 = 104;
               break;
            case 225:
               var10000 = 199;
               break;
            case 226:
               var10000 = 15;
               break;
            case 227:
               var10000 = 24;
               break;
            case 228:
               var10000 = 58;
               break;
            case 229:
               var10000 = 174;
               break;
            case 230:
               var10000 = 31;
               break;
            case 231:
               var10000 = 203;
               break;
            case 232:
               var10000 = 119;
               break;
            case 233:
               var10000 = 194;
               break;
            case 234:
               var10000 = 230;
               break;
            case 235:
               var10000 = 44;
               break;
            case 236:
               var10000 = 178;
               break;
            case 237:
               var10000 = 96;
               break;
            case 238:
               var10000 = 141;
               break;
            case 239:
               var10000 = 18;
               break;
            case 240:
               var10000 = 37;
               break;
            case 241:
               var10000 = 97;
               break;
            case 242:
               var10000 = 210;
               break;
            case 243:
               var10000 = 17;
               break;
            case 244:
               var10000 = 108;
               break;
            case 245:
               var10000 = 197;
               break;
            case 246:
               var10000 = 208;
               break;
            case 247:
               var10000 = 62;
               break;
            case 248:
               var10000 = 59;
               break;
            case 249:
               var10000 = 52;
               break;
            case 250:
               var10000 = 4;
               break;
            case 251:
               var10000 = 9;
               break;
            case 252:
               var10000 = 244;
               break;
            case 253:
               var10000 = 249;
               break;
            case 254:
               var10000 = 239;
               break;
            default:
               var10000 = 214;
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
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "掳鄅\u0006é禯刓劺ﾒl.\u0015\u008eR8\n¨Óõ;æ¶& \u0094\u0082\u001eÌ\u0014[\u0088\"À´y\u008aú\u009f\u008b\b\u009a&@Øa\u0011ÊØÎ\u0012G_1â}±k\u00064离动券￥<\u0007曄咡岙斪乔５5\u0002捳释\u0007晛哝屪癌徉ﾍY";
      int var4 = "掳鄅\u0006é禯刓劺ﾒl.\u0015\u008eR8\n¨Óõ;æ¶& \u0094\u0082\u001eÌ\u0014[\u0088\"À´y\u008aú\u009f\u008b\b\u009a&@Øa\u0011ÊØÎ\u0012G_1â}±k\u00064离动券￥<\u0007曄咡岙斪乔５5\u0002捳释\u0007晛哝屪癌徉ﾍY"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 8;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 126;
                        break;
                     case 1:
                        var46 = 71;
                        break;
                     case 2:
                        var46 = 11;
                        break;
                     case 3:
                        var46 = 26;
                        break;
                     case 4:
                        var46 = 63;
                        break;
                     case 5:
                        var46 = 103;
                        break;
                     default:
                        var46 = 89;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[9];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "昋哻峔瘼忪Ｗ\u0081.\u00033$;p|(Ûð\u0097{¼-s\u0097VÚ©-\u008bX\u0014OWA\u008bR\u0011\u0005}3\bÎÜgÉ¢\u001aéi\u0094@/ç¼\u008c";
                  var4 = "昋哻峔瘼忪Ｗ\u0081.\u00033$;p|(Ûð\u0097{¼-s\u0097VÚ©-\u008bX\u0014OWA\u008bR\u0011\u0005}3\bÎÜgÉ¢\u001aéi\u0094@/ç¼\u008c".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}






