package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import com.finalshell.ui.model.Wq4;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public abstract class Yz2_2 extends TransferHandler {
   public boolean l = false;
   public DataFlavor q;
   public DataFlavor[] e = new DataFlavor[1];
   public List c;
   public Map k;
   public static String a;

   public Yz2_2() {
      try {
         this.q = new DataFlavor(a + List.class.getName() + "\"");
         this.e[0] = this.q;
      } catch (ClassNotFoundException var2) {
         var2.printStackTrace();
      }
   }

   public boolean e() {
      return this.l;
   }

   public void P(boolean var1) {
      this.l = var1;
   }

   @Override
   public boolean canImport(TransferSupport param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/CB3.C$arrString ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: invokevirtual javax/swing/TransferHandler$TransferSupport.isDrop ()Z
      // 008: aload 2
      // 009: ifnull 02f
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 01b: athrow
      // 01c: aload 1
      // 01d: aload 2
      // 01e: ifnull 039
      // 021: aload 0
      // 022: getfield com/finalshell/core/Yz2_2.q Ljava/awt/datatransfer/DataFlavor;
      // 025: invokevirtual javax/swing/TransferHandler$TransferSupport.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 02e: athrow
      // 02f: ifne 038
      // 032: bipush 0
      // 033: ireturn
      // 034: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 037: athrow
      // 038: aload 1
      // 039: invokevirtual javax/swing/TransferHandler$TransferSupport.getDropLocation ()Ljavax/swing/TransferHandler$DropLocation;
      // 03c: checkcast javax/swing/JTree$DropLocation
      // 03f: astore 3
      // 040: aload 3
      // 041: invokevirtual javax/swing/JTree$DropLocation.getPath ()Ljavax/swing/tree/TreePath;
      // 044: astore 4
      // 046: aload 4
      // 048: aload 2
      // 049: ifnull 061
      // 04c: ifnonnull 05c
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 055: athrow
      // 056: bipush 0
      // 057: ireturn
      // 058: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 05b: athrow
      // 05c: aload 4
      // 05e: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 061: checkcast com/finalshell/ui/model/CB3
      // 064: astore 5
      // 066: aload 5
      // 068: invokevirtual com/finalshell/ui/model/CB3.d ()Z
      // 06b: aload 2
      // 06c: ifnull 094
      // 06f: ifne 093
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 078: athrow
      // 079: aload 5
      // 07b: invokevirtual com/finalshell/ui/model/CB3.u ()Z
      // 07e: aload 2
      // 07f: ifnull 094
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 088: athrow
      // 089: ifeq 095
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 092: athrow
      // 093: bipush 0
      // 094: ireturn
      // 095: aload 0
      // 096: getfield com/finalshell/core/Yz2_2.c Ljava/util/List;
      // 099: aload 2
      // 09a: ifnull 117
      // 09d: ifnull 107
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield com/finalshell/core/Yz2_2.c Ljava/util/List;
      // 0ab: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b0: astore 6
      // 0b2: aload 6
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 107
      // 0bc: aload 6
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast com/finalshell/ui/model/CB3
      // 0c6: astore 7
      // 0c8: aload 5
      // 0ca: aload 2
      // 0cb: ifnull 114
      // 0ce: aload 7
      // 0d0: aload 2
      // 0d1: ifnull 0f0
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0da: athrow
      // 0db: if_acmpeq 101
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0e4: athrow
      // 0e5: aload 5
      // 0e7: aload 7
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0ef: athrow
      // 0f0: invokevirtual com/finalshell/ui/model/CB3.isNodeAncestor (Ljavax/swing/tree/TreeNode;)Z
      // 0f3: aload 2
      // 0f4: ifnull 102
      // 0f7: ifeq 103
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 100: athrow
      // 101: bipush 0
      // 102: ireturn
      // 103: aload 2
      // 104: ifnonnull 0b2
      // 107: aload 1
      // 108: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 10b: aload 0
      // 10c: getfield com/finalshell/core/Yz2_2.q Ljava/awt/datatransfer/DataFlavor;
      // 10f: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 114: checkcast java/util/List
      // 117: astore 6
      // 119: aload 0
      // 11a: aload 6
      // 11c: aload 5
      // 11e: aload 3
      // 11f: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 122: invokevirtual com/finalshell/core/Yz2_2.y (Ljava/util/List;Lcom/finalshell/ui/model/CB3;I)Z
      // 125: istore 7
      // 127: aload 1
      // 128: iload 7
      // 12a: invokevirtual javax/swing/TransferHandler$TransferSupport.setShowDropLocation (Z)V
      // 12d: iload 7
      // 12f: ireturn
      // 130: astore 6
      // 132: bipush 0
      // 133: ireturn
      // 134: astore 6
      // 136: bipush 0
      // 137: ireturn
   }

   @Override
   public Transferable createTransferable(JComponent var1) {
      String[] var10000 = CB3.C$arrString();
      com.finalshell.ui.panel.Us2 var3 = (com.finalshell.ui.panel.Us2)var1;
      String[] var2 = var10000;
      List var4 = var3.V();
      boolean var12 = var4.isEmpty();
      if (var2 != null) {
         if (var12) {
            return null;
         }

         var12 = var4.contains(var3.M());
      }

      if (var2 != null) {
         if (var12) {
            return null;
         }

         U4.z(var4);
         var12 = this.i(var4);
      }

      if (!var12) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         Iterator var6 = var4.iterator();

         while (true) {
            if (var6.hasNext()) {
               CB3 var7 = (CB3)var6.next();
               var5.add(this.D(var7));
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            this.c = var4;
            this.k = new HashMap(1);
            break;
         }

         for (CB3 var11 : this.c) {
            CB3 var8 = var11.C$cB_3();
            Object var9 = (List)this.k.get(var8.H());
            Object var13 = var9;
            if (var2 != null) {
               if (var9 == null) {
                  var9 = new ArrayList(1);
                  this.k.put(var8.H(), var9);
               }

               var13 = var9;
            }

            var13.add(var8.getIndex(var11));
            if (var2 == null) {
               break;
            }
         }

         return new Wq4(this, var5);
      }
   }

   @Override
   public void exportDone(JComponent var1, Transferable var2, int var3) {
      if ((var3 & 2) == 2) {
         com.finalshell.ui.panel.Us2 var4 = (com.finalshell.ui.panel.Us2)var1;
         var4.s(this.c);
         this.c = null;
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
      // 000: invokestatic com/finalshell/ui/model/CB3.C$arrString ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 02a
      // 009: aload 1
      // 00a: invokevirtual com/finalshell/core/Yz2_2.canImport (Ljavax/swing/TransferHandler$TransferSupport;)Z
      // 00d: ifne 01d
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 01c: athrow
      // 01d: aload 1
      // 01e: invokevirtual javax/swing/TransferHandler$TransferSupport.getTransferable ()Ljava/awt/datatransfer/Transferable;
      // 021: aload 0
      // 022: getfield com/finalshell/core/Yz2_2.q Ljava/awt/datatransfer/DataFlavor;
      // 025: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 02a: checkcast java/util/List
      // 02d: astore 3
      // 02e: goto 039
      // 031: astore 4
      // 033: bipush 0
      // 034: ireturn
      // 035: astore 4
      // 037: bipush 0
      // 038: ireturn
      // 039: aload 1
      // 03a: invokevirtual javax/swing/TransferHandler$TransferSupport.getDropLocation ()Ljavax/swing/TransferHandler$DropLocation;
      // 03d: checkcast javax/swing/JTree$DropLocation
      // 040: astore 4
      // 042: aload 4
      // 044: invokevirtual javax/swing/JTree$DropLocation.getChildIndex ()I
      // 047: istore 5
      // 049: aload 4
      // 04b: invokevirtual javax/swing/JTree$DropLocation.getPath ()Ljavax/swing/tree/TreePath;
      // 04e: astore 6
      // 050: aload 6
      // 052: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 055: checkcast com/finalshell/ui/model/CB3
      // 058: astore 7
      // 05a: aload 1
      // 05b: invokevirtual javax/swing/TransferHandler$TransferSupport.getComponent ()Ljava/awt/Component;
      // 05e: checkcast com/finalshell/ui/panel/Us2
      // 061: astore 8
      // 063: aload 8
      // 065: invokevirtual com/finalshell/ui/panel/Us2.getModel ()Ljavax/swing/tree/TreeModel;
      // 068: checkcast com/finalshell/core/Zn2
      // 06b: astore 9
      // 06d: aload 0
      // 06e: getfield com/finalshell/core/Yz2_2.l Z
      // 071: aload 2
      // 072: ifnull 0e1
      // 075: ifeq 0dc
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 07e: athrow
      // 07f: aload 7
      // 081: aload 2
      // 082: ifnull 0d9
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 08b: athrow
      // 08c: invokevirtual com/finalshell/ui/model/CB3.g$boolean ()Z
      // 08f: ifeq 0b7
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 098: athrow
      // 099: aload 0
      // 09a: aload 3
      // 09b: aload 7
      // 09d: aload 8
      // 09f: aload 9
      // 0a1: aload 0
      // 0a2: iload 5
      // 0a4: aload 7
      // 0a6: invokevirtual com/finalshell/core/Yz2_2.x (ILcom/finalshell/ui/model/CB3;)I
      // 0a9: invokevirtual com/finalshell/core/Yz2_2.b (Ljava/util/List;Lcom/finalshell/ui/model/CB3;Lcom/finalshell/ui/panel/Us2;Lcom/finalshell/core/Zn2;I)V
      // 0ac: aload 2
      // 0ad: ifnonnull 0da
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0b6: athrow
      // 0b7: aload 8
      // 0b9: new com/finalshell/core/Sl2
      // 0bc: dup
      // 0bd: aload 0
      // 0be: aload 7
      // 0c0: aload 3
      // 0c1: aload 8
      // 0c3: aload 9
      // 0c5: invokespecial com/finalshell/core/Sl2.<init> (Lcom/finalshell/core/Yz2_2;Lcom/finalshell/ui/model/CB3;Ljava/util/List;Lcom/finalshell/ui/panel/Us2;Lcom/finalshell/core/Zn2;)V
      // 0c8: invokevirtual com/finalshell/ui/panel/Us2.d (Lcom/finalshell/core/NX3;)V
      // 0cb: aload 8
      // 0cd: aload 7
      // 0cf: invokevirtual com/finalshell/ui/panel/Us2.K (Lcom/finalshell/ui/model/CB3;)Lcom/finalshell/ui/model/CB3;
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0d8: athrow
      // 0d9: pop
      // 0da: bipush 1
      // 0db: ireturn
      // 0dc: aload 7
      // 0de: invokevirtual com/finalshell/ui/model/CB3.g$boolean ()Z
      // 0e1: aload 2
      // 0e2: ifnull 103
      // 0e5: ifne 0fe
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0ee: athrow
      // 0ef: aload 8
      // 0f1: aload 7
      // 0f3: invokevirtual com/finalshell/ui/panel/Us2.w (Lcom/finalshell/ui/model/CB3;)Lcom/finalshell/ui/model/CB3;
      // 0f6: pop
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0fd: athrow
      // 0fe: aload 7
      // 100: invokevirtual com/finalshell/ui/model/CB3.g$boolean ()Z
      // 103: aload 2
      // 104: ifnull 12b
      // 107: ifeq 12a
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 110: athrow
      // 111: aload 0
      // 112: aload 3
      // 113: aload 7
      // 115: aload 8
      // 117: aload 9
      // 119: aload 0
      // 11a: iload 5
      // 11c: aload 7
      // 11e: invokevirtual com/finalshell/core/Yz2_2.x (ILcom/finalshell/ui/model/CB3;)I
      // 121: invokevirtual com/finalshell/core/Yz2_2.b (Ljava/util/List;Lcom/finalshell/ui/model/CB3;Lcom/finalshell/ui/panel/Us2;Lcom/finalshell/core/Zn2;I)V
      // 124: bipush 1
      // 125: ireturn
      // 126: invokestatic com/finalshell/core/Yz2_2.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 129: athrow
      // 12a: bipush 0
      // 12b: ireturn
   }

   public int x(int var1, CB3 var2) {
      String[] var3 = CB3.C$arrString();
      int var10000 = var1;
      if (var3 != null) {
         var10000 = var1 == -1 ? var2.getChildCount() : var1;
      }

      int var4 = var10000;
      var10000 = (this.k.containsKey(var2.H())) ? 1 : 0;
      if (var3 != null) {
         if (var10000 != 0) {
            for (Integer var6 : (List)this.k.get(var2.H())) {
               var10000 = var6;
               if (var3 == null) {
                  return var10000;
               }

               if (var10000 < var4) {
                  var4--;
               }

               if (var3 == null) {
                  break;
               }
            }
         }

         var10000 = var4;
      }

      return var10000;
   }

   public void b(List var1, CB3 var2, com.finalshell.ui.panel.Us2 var3, Zn2 var4, int var5) {
      SwingUtilities.invokeLater(new com.finalshell.task.Cw2(this, var4, var1, var2, var5, var3));
   }

   public abstract boolean i(List var1);

   public abstract boolean y(List var1, CB3 var2, int var3);

   public abstract CB3 D(CB3 var1);

   public abstract void p(List var1, CB3 var2, com.finalshell.ui.panel.Us2 var3, Zn2 var4, int var5);

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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "vYD0fi\u001ec@[2 rR}HB=\"`\tz\u0004X3lk\u0013:FV6ji\u000beLRglf\u001edZ\t~".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 75;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      } else {
         var6 = 75;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 92;
               break;
            case 1:
               var23 = 98;
               break;
            case 2:
               var23 = 127;
               break;
            case 3:
               var23 = 23;
               break;
            case 4:
               var23 = 68;
               break;
            case 5:
               var23 = 65;
               break;
            default:
               var23 = 52;
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





