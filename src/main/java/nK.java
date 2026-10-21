import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class nK extends TransferHandler {
   DataFlavor J;
   DataFlavor N;
   DataFlavor[] w;
   DefaultMutableTreeNode[] A;
   DefaultMutableTreeNode q;
   a3 B;
   private static final String[] a;
   private static final String[] b;

   public nK(a3 var1) {
      com.c.c(495072085072944463L).set(this, new DataFlavor[1]);
      com.c.c(463096657316711081L).set(this, var1);

      try {
         String var2 = a(6139, 18496) + DefaultMutableTreeNode[].class.getName() + "\"";
         com.c.c(372804674539901270L).set(this, new DataFlavor(var2));
         ((DataFlavor[])com.c.c(495072085072944463L).get(this))[0] = (DataFlavor)com.c.c(372804674539901270L).get(this);
         String var3 = a(6129, 2394) + Object.class.getName() + "\"";
         com.c.c(477015896483761842L).set(this, new DataFlavor(var3));
      } catch (ClassNotFoundException var4) {
      }
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      int[] var2;
      TransferSupport var13;
      label181: {
         var2 = a3.I();
         boolean var10000 = var1.isDrop();
         if (var2 != null) {
            if (!var10000) {
               return false;
            }

            var1.setShowDropLocation(true);
            var13 = var1;
            if (var2 == null) {
               break label181;
            }

            var10000 = var1.isDataFlavorSupported((DataFlavor)com.c.c(372804674539901270L).get(this));
         }

         if (var10000) {
            var13 = var1;
            if (var2 == null) {
               break label181;
            }

            if (var1.isDataFlavorSupported((DataFlavor)com.c.c(477015896483761842L).get(this))) {
               var13 = var1;
               if (var2 == null) {
                  break label181;
               }

               if (!var1.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                  return false;
               }
            }
         }

         var13 = var1;
      }

      JTree.DropLocation var3 = (JTree.DropLocation)var13.getDropLocation();
      TreePath var4 = var3.getPath();
      boolean var5 = false;
      if (var2 != null && var3.getChildIndex() > -1) {
         boolean var14 = true;
      }

      if ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this) != null) {
         TreePath var6 = new TreePath(((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this)).getPath());
         if (var6.isDescendant(var4)) {
         }

         var15 = var4;
         label152:
         if (var2 != null) {
            if (var4 != null) {
               var15 = var4;
               if (var2 == null) {
                  break label152;
               }

               if (var4.isDescendant(var6)) {
                  var15 = var6.getParentPath();
                  if (var2 == null) {
                     break label152;
                  }

                  if (var15.equals(var4)) {
                     int var16 = var3.getChildIndex();
                     if (var2 == null) {
                        return (boolean)var16;
                     }

                     if (var16
                        == ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this))
                           .getParent()
                           .getIndex((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this))) {
                        return (boolean)0;
                     }

                     var15 = var3;
                     if (var2 == null) {
                        break label152;
                     }

                     if (var3.getChildIndex()
                        == ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this))
                              .getParent()
                              .getIndex((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this))
                           + 1) {
                        return (boolean)0;
                     }
                  }
               }
            }

            var15 = ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this)).getUserObject();
         }

         Class var7;
         int var9;
         Class var12;
         var7 = var15.getClass();
         JTree.DropLocation var8 = (JTree.DropLocation)var1.getDropLocation();
         var9 = var8.getChildIndex();
         TreePath var10 = var8.getPath();
         DefaultMutableTreeNode var11 = (DefaultMutableTreeNode)var10.getLastPathComponent();
         var12 = var11.getUserObject().getClass();
         var17 = var7.equals(tf_4.class);
         label129:
         if (var2 != null) {
            if (var17) {
               var17 = var12.equals(ck_4.class);
               if (var2 == null) {
                  break label129;
               }

               if (var17) {
                  return false;
               }
            }

            var17 = var7.equals(ck_4.class);
         }

         label121:
         if (var2 != null) {
            if (var17) {
               var17 = var12.equals(ck_4.class);
               if (var2 == null) {
                  break label121;
               }

               if (var17) {
                  return false;
               }
            }

            var17 = var6.getParentPath().equals(var4);
         }

         label114:
         if (var2 != null) {
            label112:
            if (var17) {
               label110: {
                  label187: {
                     var17 = var7.equals(ck_4.class);
                     if (var2 != null) {
                        if (var17) {
                           var18 = var12.equals(tf_4.class);
                           if (var2 == null) {
                              break label110;
                           }

                           if (var18 != 0) {
                              break label187;
                           }
                        }

                        var17 = var7.equals(tf_4.class);
                     }

                     if (var2 == null) {
                        break label114;
                     }

                     if (!var17) {
                        break label112;
                     }

                     var17 = var12.equals(tf_4.class);
                     if (var2 == null) {
                        break label114;
                     }

                     if (!var17) {
                        break label112;
                     }
                  }

                  var18 = var9;
               }

               if (var18 == -1) {
               }
            }

            var17 = var6.equals(var4);
         }

         if (var2 != null) {
            if (var17) {
               return false;
            }

            var17 = var12.equals(tf_4.class);
         }

         if (var2 == null) {
            return var17;
         }

         if (!var17) {
            boolean var19 = var12.equals(ck_4.class);
            if (var2 == null) {
               return var19;
            }

            if (!var19) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      int[] var10000 = a3.I();
      JTree var3 = (JTree)var1;
      int[] var2 = var10000;
      TreePath[] var4 = var3.getSelectionPaths();
      if (var4 == null) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         com.c.c(465495214303676957L).set(this, (DefaultMutableTreeNode)var4[0].getLastPathComponent());
         Object[] var10001 = com.c.a(com.c.c(465495214303676957L).get(this));
         Method var10003 = com.c.d(397670486969265762L);
         Object[] var10002 = var10001;
         nK var18 = this;
         Method var14 = var10003;

         try {
            var15 = (DefaultMutableTreeNode)var14.invoke(var18, var10002);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         DefaultMutableTreeNode var7 = var15;
         var5.add(var7);
         var6.add((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this));
         int var8 = 1;

         while (true) {
            label67:
            if (var8 < var4.length) {
               var10000 = (int[])var4;
               if (var2 == null) {
                  break;
               }

               label74: {
                  DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var4[var8].getLastPathComponent();
                  int var17 = var9.getLevel();
                  int var19 = ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this)).getLevel();
                  if (var2 != null) {
                     if (var17 < var19 && var2 != null) {
                        break label67;
                     }

                     var17 = var9.getLevel();
                     if (var2 == null) {
                        break label74;
                     }

                     var19 = ((DefaultMutableTreeNode)com.c.c(465495214303676957L).get(this)).getLevel();
                  }

                  if (var17 > var19) {
                     var10002 = com.c.a(var9);
                     Method var10004 = com.c.d(397670486969265762L);
                     Object[] var28 = var10002;
                     nK var25 = this;
                     Method var20 = var10004;

                     try {
                        var10001 = (DefaultMutableTreeNode)var20.invoke(var25, var28);
                     } catch (InvocationTargetException var11) {
                        throw var11.getTargetException();
                     }

                     var7.add(var10001);
                     if (var2 != null) {
                        break label74;
                     }
                  }

                  var10002 = com.c.a(var9);
                  Method var30 = com.c.d(397670486969265762L);
                  Object[] var29 = var10002;
                  nK var27 = this;
                  Method var22 = var30;

                  try {
                     var10001 = (DefaultMutableTreeNode)var22.invoke(var27, var29);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  var5.add(var10001);
                  var6.add(var9);
               }

               var8++;
               if (var2 != null) {
                  continue;
               }
            }

            var10000 = var5.toArray((int[])(new DefaultMutableTreeNode[var5.size()]));
            break;
         }

         DefaultMutableTreeNode[] var13 = (DefaultMutableTreeNode[])var10000;
         com.c.c(206399079994630893L).set(this, (DefaultMutableTreeNode[])var6.toArray(new DefaultMutableTreeNode[var6.size()]));
         return new t0_2(this, var13);
      }
   }

   private DefaultMutableTreeNode P(TreeNode var1) {
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
      // 000: invokestatic a3.I ()[I
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 036
      // 009: aload 1
      // 00a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 00d: ldc2_w 326043083934480263
      // 010: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 013: dup_x2
      // 014: pop
      // 015: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 018: checkcast java/lang/Boolean
      // 01b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01e: goto 025
      // 021: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifne 035
      // 028: goto 02f
      // 02b: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 02e: athrow
      // 02f: bipush 0
      // 030: ireturn
      // 031: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 034: athrow
      // 035: aload 0
      // 036: ldc2_w 463096657316711081
      // 039: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 03c: swap
      // 03d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast a3
      // 043: astore 3
      // 044: aload 1
      // 045: invokevirtual javax/swing/TransferHandler$TransferSupport.getDropLocation ()Ljavax/swing/TransferHandler$DropLocation;
      // 048: checkcast javax/swing/JTree$DropLocation
      // 04b: astore 4
      // 04d: aload 4
      // 04f: invokevirtual javax/swing/JTree$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 052: astore 5
      // 054: aload 4
      // 056: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 059: istore 6
      // 05b: aload 4
      // 05d: invokevirtual javax/swing/JTree$DropLocation.getPath ()Ljavax/swing/tree/TreePath;
      // 060: astore 7
      // 062: aload 7
      // 064: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 067: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 06a: astore 8
      // 06c: aload 3
      // 06d: aload 5
      // 06f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 072: ldc2_w 229190360333115919
      // 075: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 078: dup_x2
      // 079: pop
      // 07a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 07d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 080: goto 087
      // 083: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 086: athrow
      // 087: astore 9
      // 089: aload 3
      // 08a: aload 5
      // 08c: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08f: ldc2_w 249787479061393778
      // 092: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 095: dup_x2
      // 096: pop
      // 097: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09a: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 09d: goto 0a4
      // 0a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: astore 9
      // 0a6: aload 0
      // 0a7: ldc2_w 463096657316711081
      // 0aa: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ad: swap
      // 0ae: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0b4: ldc2_w 346382751221538814
      // 0b7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0bf: checkcast F6
      // 0c2: goto 0c9
      // 0c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: astore 10
      // 0cb: bipush 0
      // 0cc: istore 11
      // 0ce: iload 6
      // 0d0: aload 2
      // 0d1: ifnull 0e7
      // 0d4: bipush -1
      // 0d5: if_icmple 0e9
      // 0d8: goto 0df
      // 0db: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0de: athrow
      // 0df: bipush 1
      // 0e0: goto 0e7
      // 0e3: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0e6: athrow
      // 0e7: istore 11
      // 0e9: aload 9
      // 0eb: aload 2
      // 0ec: ifnull 108
      // 0ef: ifnull 12e
      // 0f2: goto 0f9
      // 0f5: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0f8: athrow
      // 0f9: aload 9
      // 0fb: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 0fe: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 101: goto 108
      // 104: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 107: athrow
      // 108: astore 12
      // 10a: aload 9
      // 10c: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 10f: astore 13
      // 111: aload 3
      // 112: aload 9
      // 114: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 117: ldc2_w 181146716655875086
      // 11a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 122: checkcast java/awt/Rectangle
      // 125: goto 12c
      // 128: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: astore 14
      // 12e: aload 0
      // 12f: ldc2_w 463096657316711081
      // 132: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 135: swap
      // 136: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 139: checkcast a3
      // 13c: invokevirtual a3.getModel ()Ljavax/swing/tree/TreeModel;
      // 13f: checkcast Fy_2
      // 142: astore 12
      // 144: aconst_null
      // 145: astore 13
      // 147: aload 1
      // 148: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 14b: astore 14
      // 14d: aload 14
      // 14f: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 154: bipush 0
      // 155: aaload
      // 156: astore 15
      // 158: aload 14
      // 15a: invokeinterface java/awt/datatransfer/Transferable.getTransferDataFlavors ()[Ljava/awt/datatransfer/DataFlavor; 1
      // 15f: astore 16
      // 161: aload 16
      // 163: arraylength
      // 164: istore 17
      // 166: bipush 0
      // 167: istore 18
      // 169: iload 18
      // 16b: iload 17
      // 16d: if_icmpge 19d
      // 170: aload 16
      // 172: iload 18
      // 174: aaload
      // 175: astore 19
      // 177: aload 14
      // 179: aload 19
      // 17b: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 180: astore 20
      // 182: goto 196
      // 185: astore 20
      // 187: aload 20
      // 189: invokevirtual java/awt/datatransfer/UnsupportedFlavorException.printStackTrace ()V
      // 18c: goto 196
      // 18f: astore 20
      // 191: aload 20
      // 193: invokevirtual java/io/IOException.printStackTrace ()V
      // 196: iinc 18 1
      // 199: aload 2
      // 19a: ifnonnull 169
      // 19d: aload 0
      // 19e: ldc2_w 463096657316711081
      // 1a1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1a4: swap
      // 1a5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a8: checkcast a3
      // 1ab: invokestatic javax/swing/SwingUtilities.windowForComponent (Ljava/awt/Component;)Ljava/awt/Window;
      // 1ae: astore 16
      // 1b0: aload 15
      // 1b2: aload 0
      // 1b3: ldc2_w 372804674539901270
      // 1b6: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1b9: swap
      // 1ba: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1bd: checkcast java/awt/datatransfer/DataFlavor
      // 1c0: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 1c3: aload 2
      // 1c4: ifnull 69a
      // 1c7: ifeq 687
      // 1ca: goto 1d1
      // 1cd: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: ldc2_w 465495214303676957
      // 1d5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1d8: swap
      // 1d9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1dc: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 1df: aload 2
      // 1e0: ifnull 20c
      // 1e3: goto 1ea
      // 1e6: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1e9: athrow
      // 1ea: ifnull c2c
      // 1ed: goto 1f4
      // 1f0: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: ldc2_w 465495214303676957
      // 1f8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1fb: swap
      // 1fc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ff: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 202: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 205: goto 20c
      // 208: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 20b: athrow
      // 20c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 20f: ldc ck_4
      // 211: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 214: aload 2
      // 215: ifnull 5aa
      // 218: ifeq 591
      // 21b: goto 222
      // 21e: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 221: athrow
      // 222: aload 0
      // 223: ldc2_w 465495214303676957
      // 226: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 229: swap
      // 22a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 22d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 230: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 233: checkcast ck_4
      // 236: astore 17
      // 238: aload 17
      // 23a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 23d: ldc2_w 272998330038223631
      // 240: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 243: dup_x2
      // 244: pop
      // 245: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 248: checkcast java/io/File
      // 24b: goto 252
      // 24e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 251: athrow
      // 252: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 255: astore 18
      // 257: aload 17
      // 259: invokestatic com/c.f ()[Ljava/lang/Object;
      // 25c: ldc2_w 272998330038223631
      // 25f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 262: dup_x2
      // 263: pop
      // 264: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 267: checkcast java/io/File
      // 26a: goto 271
      // 26d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 270: athrow
      // 271: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 274: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 277: astore 19
      // 279: aload 3
      // 27a: aload 4
      // 27c: invokevirtual javax/swing/JTree$DropLocation.getDropPoint ()Ljava/awt/Point;
      // 27f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 282: ldc2_w 180336831534537747
      // 285: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 288: dup_x2
      // 289: pop
      // 28a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 28d: checkcast javax/swing/tree/TreePath
      // 290: goto 297
      // 293: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 296: athrow
      // 297: astore 20
      // 299: aload 3
      // 29a: aload 20
      // 29c: invokevirtual a3.getPathBounds (Ljavax/swing/tree/TreePath;)Ljava/awt/Rectangle;
      // 29f: astore 21
      // 2a1: aload 8
      // 2a3: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 2a6: checkcast tf_4
      // 2a9: astore 22
      // 2ab: new java/lang/StringBuilder
      // 2ae: dup
      // 2af: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b2: aload 22
      // 2b4: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2b7: ldc2_w 543633160597441792
      // 2ba: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2bd: dup_x2
      // 2be: pop
      // 2bf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2c2: checkcast java/io/File
      // 2c5: goto 2cc
      // 2c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cb: athrow
      // 2cc: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d2: getstatic java/io/File.separator Ljava/lang/String;
      // 2d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d8: aload 17
      // 2da: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2dd: ldc2_w 272998330038223631
      // 2e0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2e3: dup_x2
      // 2e4: pop
      // 2e5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2e8: checkcast java/io/File
      // 2eb: goto 2f2
      // 2ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f1: athrow
      // 2f2: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 2f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fb: astore 23
      // 2fd: new java/io/File
      // 300: dup
      // 301: aload 23
      // 303: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 306: astore 24
      // 308: aload 0
      // 309: ldc2_w 463096657316711081
      // 30c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 30f: swap
      // 310: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 313: aload 19
      // 315: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 318: ldc2_w 224847783244984261
      // 31b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 31e: dup_x2
      // 31f: pop
      // 320: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 323: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 326: goto 32d
      // 329: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: astore 25
      // 32f: aload 12
      // 331: aload 0
      // 332: ldc2_w 465495214303676957
      // 335: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 338: swap
      // 339: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 33c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 33f: invokevirtual Fy_2.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 342: aload 25
      // 344: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 347: checkcast tf_4
      // 34a: astore 26
      // 34c: aload 26
      // 34e: aload 18
      // 350: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 353: ldc2_w 548576199562161390
      // 356: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 359: dup_x2
      // 35a: pop
      // 35b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 35e: pop
      // 35f: goto 366
      // 362: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 365: athrow
      // 366: aload 0
      // 367: ldc2_w 463096657316711081
      // 36a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 36d: swap
      // 36e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 371: aload 18
      // 373: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 376: ldc2_w 247985076524053530
      // 379: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 37c: dup_x2
      // 37d: pop
      // 37e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 381: pop
      // 382: goto 389
      // 385: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 388: athrow
      // 389: aload 19
      // 38b: aload 22
      // 38d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 390: ldc2_w 543633160597441792
      // 393: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 396: dup_x2
      // 397: pop
      // 398: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 39b: checkcast java/io/File
      // 39e: goto 3a5
      // 3a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a4: athrow
      // 3a5: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3ab: aload 2
      // 3ac: ifnull 3fd
      // 3af: ifne 3fe
      // 3b2: goto 3b9
      // 3b5: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3b8: athrow
      // 3b9: aload 17
      // 3bb: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3be: ldc2_w 272998330038223631
      // 3c1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3c4: dup_x2
      // 3c5: pop
      // 3c6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3c9: checkcast java/io/File
      // 3cc: goto 3d3
      // 3cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d2: athrow
      // 3d3: aload 24
      // 3d5: invokestatic com/Cz_2.v (Ljava/io/File;Ljava/io/File;)Z
      // 3d8: pop
      // 3d9: aload 17
      // 3db: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3de: ldc2_w 272998330038223631
      // 3e1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3e4: dup_x2
      // 3e5: pop
      // 3e6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3e9: checkcast java/io/File
      // 3ec: goto 3f3
      // 3ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f2: athrow
      // 3f3: invokevirtual java/io/File.delete ()Z
      // 3f6: goto 3fd
      // 3f9: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 3fc: athrow
      // 3fd: pop
      // 3fe: new ck_4
      // 401: dup
      // 402: invokespecial ck_4.<init> ()V
      // 405: astore 27
      // 407: aload 27
      // 409: aload 24
      // 40b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 40e: ldc2_w 325634526741383265
      // 411: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 414: dup_x2
      // 415: pop
      // 416: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 419: pop
      // 41a: goto 421
      // 41d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 420: athrow
      // 421: aload 22
      // 423: invokestatic com/c.f ()[Ljava/lang/Object;
      // 426: ldc2_w 248698316749304686
      // 429: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 42c: dup_x2
      // 42d: pop
      // 42e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 431: checkcast java/util/List
      // 434: goto 43b
      // 437: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43a: athrow
      // 43b: aload 27
      // 43d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 442: pop
      // 443: invokestatic com/c.f ()[Ljava/lang/Object;
      // 446: ldc2_w 270389152141252877
      // 449: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 44c: swap
      // 44d: aconst_null
      // 44e: swap
      // 44f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 452: goto 459
      // 455: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 458: athrow
      // 459: invokestatic com/c.f ()[Ljava/lang/Object;
      // 45c: ldc2_w 410905379772103887
      // 45f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 462: dup_x2
      // 463: pop
      // 464: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 467: goto 46e
      // 46a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 46d: athrow
      // 46e: aload 23
      // 470: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 473: ldc2_w 392060547546048329
      // 476: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 479: dup_x2
      // 47a: pop
      // 47b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 47e: goto 485
      // 481: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 484: athrow
      // 485: pop
      // 486: goto 490
      // 489: astore 28
      // 48b: aload 28
      // 48d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 490: new javax/swing/tree/DefaultMutableTreeNode
      // 493: dup
      // 494: aload 27
      // 496: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 499: astore 28
      // 49b: aload 0
      // 49c: ldc2_w 463096657316711081
      // 49f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4a2: swap
      // 4a3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4a6: aload 28
      // 4a8: aload 27
      // 4aa: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ad: ldc2_w 388490145237843992
      // 4b0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4b3: dup_x2
      // 4b4: pop
      // 4b5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b8: pop
      // 4b9: goto 4c0
      // 4bc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bf: athrow
      // 4c0: aload 19
      // 4c2: aload 2
      // 4c3: ifnull 525
      // 4c6: aload 22
      // 4c8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4cb: ldc2_w 543633160597441792
      // 4ce: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4d1: dup_x2
      // 4d2: pop
      // 4d3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4d6: checkcast java/io/File
      // 4d9: goto 4e0
      // 4dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4df: athrow
      // 4e0: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 4e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4e6: ifne 50b
      // 4e9: goto 4f0
      // 4ec: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 4ef: athrow
      // 4f0: aload 4
      // 4f2: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 4f5: istore 6
      // 4f7: aload 2
      // 4f8: ifnull 516
      // 4fb: iload 6
      // 4fd: bipush -1
      // 4fe: if_icmpne 50b
      // 501: goto 508
      // 504: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 507: athrow
      // 508: bipush 0
      // 509: istore 6
      // 50b: aload 12
      // 50d: aload 28
      // 50f: aload 8
      // 511: iload 6
      // 513: invokevirtual Fy_2.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 516: new java/io/File
      // 519: dup
      // 51a: aload 23
      // 51c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 51f: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 522: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 525: astore 29
      // 527: aload 0
      // 528: ldc2_w 463096657316711081
      // 52b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 52e: swap
      // 52f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 532: aload 29
      // 534: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 537: ldc2_w 224847783244984261
      // 53a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 53d: dup_x2
      // 53e: pop
      // 53f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 542: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 545: goto 54c
      // 548: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 54b: athrow
      // 54c: astore 30
      // 54e: aload 0
      // 54f: ldc2_w 463096657316711081
      // 552: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 555: swap
      // 556: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 559: checkcast a3
      // 55c: new javax/swing/tree/TreePath
      // 55f: dup
      // 560: aload 8
      // 562: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 565: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 568: invokevirtual a3.expandPath (Ljavax/swing/tree/TreePath;)V
      // 56b: aload 0
      // 56c: ldc2_w 463096657316711081
      // 56f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 572: swap
      // 573: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 576: aload 28
      // 578: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 57b: ldc2_w 325887470340955715
      // 57e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 581: dup_x2
      // 582: pop
      // 583: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 586: pop
      // 587: goto 58e
      // 58a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 58d: athrow
      // 58e: goto c2c
      // 591: aload 0
      // 592: ldc2_w 465495214303676957
      // 595: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 598: swap
      // 599: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 59c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 59f: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 5a2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5a5: ldc tf_4
      // 5a7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 5aa: aload 2
      // 5ab: ifnull c2d
      // 5ae: ifeq c2c
      // 5b1: goto 5b8
      // 5b4: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 5b7: athrow
      // 5b8: aload 0
      // 5b9: ldc2_w 465495214303676957
      // 5bc: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 5bf: swap
      // 5c0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5c3: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 5c6: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 5c9: checkcast tf_4
      // 5cc: astore 17
      // 5ce: aload 8
      // 5d0: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 5d3: checkcast tf_4
      // 5d6: astore 18
      // 5d8: aload 16
      // 5da: new java/lang/StringBuilder
      // 5dd: dup
      // 5de: invokespecial java/lang/StringBuilder.<init> ()V
      // 5e1: sipush 6133
      // 5e4: sipush 14727
      // 5e7: invokestatic nK.a (II)Ljava/lang/String;
      // 5ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5ed: aload 17
      // 5ef: invokestatic com/c.f ()[Ljava/lang/Object;
      // 5f2: ldc2_w 498856411508641826
      // 5f5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 5f8: dup_x2
      // 5f9: pop
      // 5fa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5fd: checkcast java/lang/String
      // 600: goto 607
      // 603: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 606: athrow
      // 607: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60a: sipush 6130
      // 60d: sipush 16313
      // 610: invokestatic nK.a (II)Ljava/lang/String;
      // 613: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 616: aload 18
      // 618: invokestatic com/c.f ()[Ljava/lang/Object;
      // 61b: ldc2_w 498856411508641826
      // 61e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 621: dup_x2
      // 622: pop
      // 623: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 626: checkcast java/lang/String
      // 629: goto 630
      // 62c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 62f: athrow
      // 630: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 633: ldc_w ""
      // 636: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 639: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 63c: sipush 6131
      // 63f: sipush 10341
      // 642: invokestatic nK.a (II)Ljava/lang/String;
      // 645: bipush 2
      // 646: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // 649: istore 19
      // 64b: iload 19
      // 64d: ifne 684
      // 650: ldc2_w 388376917454860932
      // 653: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 656: aconst_null
      // 657: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 65a: new kC_3
      // 65d: dup
      // 65e: aload 0
      // 65f: aload 3
      // 660: aload 17
      // 662: aload 18
      // 664: invokespecial kC_3.<init> (LnK;La3;Ltf_4;Ltf_4;)V
      // 667: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 66a: ldc2_w 434592463220957006
      // 66d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 670: dup_x2
      // 671: pop
      // 672: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 675: pop
      // 676: goto 67d
      // 679: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 67c: athrow
      // 67d: goto 684
      // 680: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 683: athrow
      // 684: goto c2c
      // 687: aload 15
      // 689: aload 0
      // 68a: ldc2_w 477015896483761842
      // 68d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 690: swap
      // 691: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 694: checkcast java/awt/datatransfer/DataFlavor
      // 697: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 69a: aload 2
      // 69b: ifnull 968
      // 69e: ifeq 960
      // 6a1: goto 6a8
      // 6a4: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 6a7: athrow
      // 6a8: aconst_null
      // 6a9: astore 17
      // 6ab: aload 14
      // 6ad: aload 0
      // 6ae: ldc2_w 477015896483761842
      // 6b1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 6b4: swap
      // 6b5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6b8: checkcast java/awt/datatransfer/DataFlavor
      // 6bb: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 6c0: checkcast [Ljava/lang/Object;
      // 6c3: astore 17
      // 6c5: goto 6cf
      // 6c8: astore 18
      // 6ca: aload 18
      // 6cc: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6cf: aload 17
      // 6d1: astore 18
      // 6d3: aload 18
      // 6d5: arraylength
      // 6d6: istore 19
      // 6d8: bipush 0
      // 6d9: istore 20
      // 6db: iload 20
      // 6dd: iload 19
      // 6df: if_icmpge 95d
      // 6e2: aload 18
      // 6e4: iload 20
      // 6e6: aaload
      // 6e7: astore 21
      // 6e9: aload 21
      // 6eb: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6ee: ldc tf_4
      // 6f0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 6f3: aload 2
      // 6f4: ifnull c2d
      // 6f7: aload 2
      // 6f8: ifnull 83a
      // 6fb: goto 702
      // 6fe: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 701: athrow
      // 702: ifeq 81e
      // 705: goto 70c
      // 708: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 70b: athrow
      // 70c: aload 21
      // 70e: checkcast tf_4
      // 711: astore 22
      // 713: aload 8
      // 715: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 718: checkcast tf_4
      // 71b: astore 23
      // 71d: aload 3
      // 71e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 721: ldc2_w 212042562452272939
      // 724: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 727: dup_x2
      // 728: pop
      // 729: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 72c: checkcast zD
      // 72f: goto 736
      // 732: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 735: athrow
      // 736: astore 24
      // 738: aload 22
      // 73a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 73d: ldc2_w 498856411508641826
      // 740: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 743: dup_x2
      // 744: pop
      // 745: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 748: goto 74f
      // 74b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 74e: athrow
      // 74f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 752: ldc2_w 159824902428932603
      // 755: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 758: swap
      // 759: aconst_null
      // 75a: swap
      // 75b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 75e: checkcast java/lang/String
      // 761: goto 768
      // 764: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 767: athrow
      // 768: astore 25
      // 76a: aload 16
      // 76c: new java/lang/StringBuilder
      // 76f: dup
      // 770: invokespecial java/lang/StringBuilder.<init> ()V
      // 773: sipush 6132
      // 776: sipush -29492
      // 779: invokestatic nK.a (II)Ljava/lang/String;
      // 77c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77f: aload 22
      // 781: invokestatic com/c.f ()[Ljava/lang/Object;
      // 784: ldc2_w 498856411508641826
      // 787: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 78a: dup_x2
      // 78b: pop
      // 78c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 78f: checkcast java/lang/String
      // 792: goto 799
      // 795: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 798: athrow
      // 799: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79c: sipush 6128
      // 79f: sipush -13821
      // 7a2: invokestatic nK.a (II)Ljava/lang/String;
      // 7a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a8: aload 23
      // 7aa: invokestatic com/c.f ()[Ljava/lang/Object;
      // 7ad: ldc2_w 498856411508641826
      // 7b0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 7b3: dup_x2
      // 7b4: pop
      // 7b5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 7b8: checkcast java/lang/String
      // 7bb: goto 7c2
      // 7be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7c1: athrow
      // 7c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c5: ldc_w ""
      // 7c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7ce: sipush 6134
      // 7d1: sipush -28080
      // 7d4: invokestatic nK.a (II)Ljava/lang/String;
      // 7d7: bipush 2
      // 7d8: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // 7db: istore 26
      // 7dd: iload 26
      // 7df: ifne 81a
      // 7e2: ldc2_w 388376917454860932
      // 7e5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 7e8: aconst_null
      // 7e9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 7ec: new m2
      // 7ef: dup
      // 7f0: aload 0
      // 7f1: aload 24
      // 7f3: aload 22
      // 7f5: aload 23
      // 7f7: aload 25
      // 7f9: aload 3
      // 7fa: invokespecial m2.<init> (LnK;LzD;Ltf_4;Ltf_4;Ljava/lang/String;La3;)V
      // 7fd: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 800: ldc2_w 434592463220957006
      // 803: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 806: dup_x2
      // 807: pop
      // 808: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 80b: pop
      // 80c: goto 813
      // 80f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 812: athrow
      // 813: goto 81a
      // 816: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 819: athrow
      // 81a: aload 2
      // 81b: ifnonnull 956
      // 81e: aload 21
      // 820: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 823: aload 2
      // 824: ifnull 83f
      // 827: goto 82e
      // 82a: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 82d: athrow
      // 82e: ldc ck_4
      // 830: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 833: goto 83a
      // 836: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 839: athrow
      // 83a: ifeq 956
      // 83d: aload 21
      // 83f: checkcast ck_4
      // 842: astore 22
      // 844: aload 8
      // 846: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 849: checkcast tf_4
      // 84c: astore 23
      // 84e: aload 3
      // 84f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 852: ldc2_w 212042562452272939
      // 855: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 858: dup_x2
      // 859: pop
      // 85a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 85d: checkcast zD
      // 860: goto 867
      // 863: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 866: athrow
      // 867: astore 24
      // 869: aload 22
      // 86b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 86e: ldc2_w 605430732347023634
      // 871: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 874: dup_x2
      // 875: pop
      // 876: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 879: goto 880
      // 87c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 87f: athrow
      // 880: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 883: ldc2_w 159824902428932603
      // 886: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 889: swap
      // 88a: aconst_null
      // 88b: swap
      // 88c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 88f: checkcast java/lang/String
      // 892: goto 899
      // 895: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 898: athrow
      // 899: astore 25
      // 89b: aload 16
      // 89d: new java/lang/StringBuilder
      // 8a0: dup
      // 8a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a4: sipush 6135
      // 8a7: sipush -25487
      // 8aa: invokestatic nK.a (II)Ljava/lang/String;
      // 8ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b0: aload 22
      // 8b2: invokestatic com/c.f ()[Ljava/lang/Object;
      // 8b5: ldc2_w 605430732347023634
      // 8b8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 8bb: dup_x2
      // 8bc: pop
      // 8bd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 8c0: checkcast java/lang/String
      // 8c3: goto 8ca
      // 8c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8c9: athrow
      // 8ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8cd: sipush 6128
      // 8d0: sipush -13821
      // 8d3: invokestatic nK.a (II)Ljava/lang/String;
      // 8d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d9: aload 23
      // 8db: invokestatic com/c.f ()[Ljava/lang/Object;
      // 8de: ldc2_w 498856411508641826
      // 8e1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 8e4: dup_x2
      // 8e5: pop
      // 8e6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 8e9: checkcast java/lang/String
      // 8ec: goto 8f3
      // 8ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8f2: athrow
      // 8f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f6: ldc_w ""
      // 8f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8ff: sipush 6134
      // 902: sipush -28080
      // 905: invokestatic nK.a (II)Ljava/lang/String;
      // 908: bipush 2
      // 909: invokestatic javax/swing/JOptionPane.showConfirmDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
      // 90c: istore 26
      // 90e: aload 2
      // 90f: ifnull 959
      // 912: iload 26
      // 914: ifne 956
      // 917: goto 91e
      // 91a: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 91d: athrow
      // 91e: ldc2_w 388376917454860932
      // 921: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 924: aconst_null
      // 925: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 928: new uU_3
      // 92b: dup
      // 92c: aload 0
      // 92d: aload 24
      // 92f: aload 22
      // 931: aload 23
      // 933: aload 25
      // 935: aload 3
      // 936: invokespecial uU_3.<init> (LnK;LzD;Lck_4;Ltf_4;Ljava/lang/String;La3;)V
      // 939: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 93c: ldc2_w 434592463220957006
      // 93f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 942: dup_x2
      // 943: pop
      // 944: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 947: pop
      // 948: goto 94f
      // 94b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 94e: athrow
      // 94f: goto 956
      // 952: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 955: athrow
      // 956: iinc 20 1
      // 959: aload 2
      // 95a: ifnonnull 6db
      // 95d: goto c2c
      // 960: aload 15
      // 962: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor Ljava/awt/datatransfer/DataFlavor;
      // 965: invokevirtual java/awt/datatransfer/DataFlavor.equals (Ljava/awt/datatransfer/DataFlavor;)Z
      // 968: aload 2
      // 969: ifnull c2d
      // 96c: ifeq c2c
      // 96f: goto 976
      // 972: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 975: athrow
      // 976: aconst_null
      // 977: astore 17
      // 979: aload 14
      // 97b: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor Ljava/awt/datatransfer/DataFlavor;
      // 97e: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 983: checkcast java/util/List
      // 986: astore 17
      // 988: goto 99c
      // 98b: astore 18
      // 98d: aload 18
      // 98f: invokevirtual java/awt/datatransfer/UnsupportedFlavorException.printStackTrace ()V
      // 992: goto 99c
      // 995: astore 18
      // 997: aload 18
      // 999: invokevirtual java/io/IOException.printStackTrace ()V
      // 99c: aload 17
      // 99e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 9a3: astore 18
      // 9a5: aload 18
      // 9a7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9ac: ifeq 9bf
      // 9af: aload 18
      // 9b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 9b6: checkcast java/io/File
      // 9b9: astore 19
      // 9bb: aload 2
      // 9bc: ifnonnull 9a5
      // 9bf: new java/util/ArrayList
      // 9c2: dup
      // 9c3: invokespecial java/util/ArrayList.<init> ()V
      // 9c6: astore 18
      // 9c8: new java/util/ArrayList
      // 9cb: dup
      // 9cc: invokespecial java/util/ArrayList.<init> ()V
      // 9cf: astore 19
      // 9d1: aconst_null
      // 9d2: astore 20
      // 9d4: aload 8
      // 9d6: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 9d9: checkcast tf_4
      // 9dc: astore 21
      // 9de: aload 21
      // 9e0: invokestatic com/c.f ()[Ljava/lang/Object;
      // 9e3: ldc2_w 498856411508641826
      // 9e6: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 9e9: dup_x2
      // 9ea: pop
      // 9eb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 9ee: checkcast java/lang/String
      // 9f1: goto 9f8
      // 9f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9f7: athrow
      // 9f8: astore 22
      // 9fa: aload 17
      // 9fc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a01: astore 23
      // a03: aload 23
      // a05: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a0a: ifeq b05
      // a0d: aload 23
      // a0f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a14: checkcast java/io/File
      // a17: astore 24
      // a19: aload 24
      // a1b: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // a1e: astore 20
      // a20: aload 24
      // a22: invokevirtual java/io/File.isDirectory ()Z
      // a25: aload 2
      // a26: ifnull b4b
      // a29: aload 2
      // a2a: ifnull ada
      // a2d: goto a34
      // a30: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // a33: athrow
      // a34: ifeq ace
      // a37: goto a3e
      // a3a: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // a3d: athrow
      // a3e: aload 18
      // a40: new java/io/File
      // a43: dup
      // a44: aload 24
      // a46: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // a49: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // a4c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // a4f: pop
      // a50: aload 24
      // a52: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // a55: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // a58: ldc2_w 519932412477559507
      // a5b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // a5e: swap
      // a5f: aconst_null
      // a60: swap
      // a61: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // a64: checkcast java/util/ArrayList
      // a67: goto a6e
      // a6a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a6d: athrow
      // a6e: astore 25
      // a70: aload 25
      // a72: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // a75: astore 26
      // a77: aload 26
      // a79: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a7e: ifeq aca
      // a81: aload 26
      // a83: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a88: checkcast java/io/File
      // a8b: astore 27
      // a8d: aload 27
      // a8f: invokevirtual java/io/File.isDirectory ()Z
      // a92: aload 2
      // a93: ifnull a0a
      // a96: aload 2
      // a97: ifnull ac5
      // a9a: ifeq ab7
      // a9d: goto aa4
      // aa0: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // aa3: athrow
      // aa4: aload 18
      // aa6: aload 27
      // aa8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // aab: pop
      // aac: aload 2
      // aad: ifnonnull ac6
      // ab0: goto ab7
      // ab3: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ab6: athrow
      // ab7: aload 19
      // ab9: aload 27
      // abb: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // abe: goto ac5
      // ac1: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ac4: athrow
      // ac5: pop
      // ac6: aload 2
      // ac7: ifnonnull a77
      // aca: aload 2
      // acb: ifnonnull b01
      // ace: aload 24
      // ad0: invokevirtual java/io/File.isFile ()Z
      // ad3: goto ada
      // ad6: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ad9: athrow
      // ada: aload 2
      // adb: ifnull b00
      // ade: ifeq b01
      // ae1: goto ae8
      // ae4: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ae7: athrow
      // ae8: aload 19
      // aea: new java/io/File
      // aed: dup
      // aee: aload 24
      // af0: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // af3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // af6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // af9: goto b00
      // afc: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // aff: athrow
      // b00: pop
      // b01: aload 2
      // b02: ifnonnull a03
      // b05: invokestatic com/c.f ()[Ljava/lang/Object;
      // b08: ldc2_w 270389152141252877
      // b0b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b0e: swap
      // b0f: aconst_null
      // b10: swap
      // b11: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b14: goto b1b
      // b17: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b1a: athrow
      // b1b: invokestatic com/c.f ()[Ljava/lang/Object;
      // b1e: ldc2_w 306266403902896148
      // b21: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b24: dup_x2
      // b25: pop
      // b26: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b29: goto b30
      // b2c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b2f: athrow
      // b30: invokestatic com/c.f ()[Ljava/lang/Object;
      // b33: ldc2_w 518178624564683680
      // b36: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b39: dup_x2
      // b3a: pop
      // b3b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b3e: checkcast java/lang/Boolean
      // b41: invokevirtual java/lang/Boolean.booleanValue ()Z
      // b44: goto b4b
      // b47: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b4a: athrow
      // b4b: aload 2
      // b4c: ifnull ba6
      // b4f: ifeq bf4
      // b52: goto b59
      // b55: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // b58: athrow
      // b59: invokestatic com/c.f ()[Ljava/lang/Object;
      // b5c: ldc2_w 270389152141252877
      // b5f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b62: swap
      // b63: aconst_null
      // b64: swap
      // b65: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b68: goto b6f
      // b6b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b6e: athrow
      // b6f: invokestatic com/c.f ()[Ljava/lang/Object;
      // b72: ldc2_w 163462326892114024
      // b75: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b78: dup_x2
      // b79: pop
      // b7a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b7d: goto b84
      // b80: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b83: athrow
      // b84: invokestatic com/c.f ()[Ljava/lang/Object;
      // b87: ldc2_w 633712494917113170
      // b8a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // b8d: dup_x2
      // b8e: pop
      // b8f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b92: checkcast java/lang/Boolean
      // b95: invokevirtual java/lang/Boolean.booleanValue ()Z
      // b98: goto b9f
      // b9b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b9e: athrow
      // b9f: goto ba6
      // ba2: invokestatic nK.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // ba5: athrow
      // ba6: ifeq bf4
      // ba9: aload 20
      // bab: astore 23
      // bad: new nq_2
      // bb0: dup
      // bb1: aload 10
      // bb3: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // bb6: aload 10
      // bb8: invokespecial nq_2.<init> (Ljava/awt/Window;LF6;)V
      // bbb: astore 24
      // bbd: aload 17
      // bbf: astore 25
      // bc1: ldc2_w 388376917454860932
      // bc4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // bc7: aconst_null
      // bc8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // bcb: new TG
      // bce: dup
      // bcf: aload 0
      // bd0: aload 23
      // bd2: aload 24
      // bd4: aload 25
      // bd6: aload 22
      // bd8: invokespecial TG.<init> (LnK;Ljava/lang/String;Lnq_2;Ljava/util/List;Ljava/lang/String;)V
      // bdb: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // bde: ldc2_w 434592463220957006
      // be1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // be4: dup_x2
      // be5: pop
      // be6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // be9: pop
      // bea: goto bf1
      // bed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bf0: athrow
      // bf1: goto c2a
      // bf4: aload 20
      // bf6: astore 23
      // bf8: ldc2_w 388376917454860932
      // bfb: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // bfe: aconst_null
      // bff: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // c02: new DE
      // c05: dup
      // c06: aload 0
      // c07: aload 18
      // c09: aload 10
      // c0b: aload 23
      // c0d: aload 22
      // c0f: aload 19
      // c11: invokespecial DE.<init> (LnK;Ljava/util/ArrayList;LF6;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
      // c14: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // c17: ldc2_w 434592463220957006
      // c1a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // c1d: dup_x2
      // c1e: pop
      // c1f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // c22: pop
      // c23: goto c2a
      // c26: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c29: athrow
      // c2a: bipush 1
      // c2b: ireturn
      // c2c: bipush 1
      // c2d: ireturn
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   private static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static String a(int var0, int var1) {
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
}





