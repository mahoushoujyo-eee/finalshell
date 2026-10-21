package com.finalshell.core;

import java.util.List;
import javax.swing.JTree;

public final class U4 {
   public static String[] a;
   public static String[] b;

   public static com.finalshell.ui.model.P2 q(JTree var0) {
      return L(var0, true);
   }

   public static com.finalshell.ui.model.P2 L(JTree param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/S.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual javax/swing/JTree.getModel ()Ljavax/swing/tree/TreeModel;
      // 07: invokeinterface javax/swing/tree/TreeModel.getRoot ()Ljava/lang/Object; 1
      // 0c: astore 3
      // 0d: astore 2
      // 0e: aload 3
      // 0f: instanceof com/finalshell/ui/model/Q_2
      // 12: ifne 2a
      // 15: new java/lang/RuntimeException
      // 18: dup
      // 19: sipush 7800
      // 1c: sipush 27296
      // 1f: invokestatic com/finalshell/core/U4.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: new com/finalshell/ui/model/P2
      // 2d: dup
      // 2e: invokespecial com/finalshell/ui/model/P2.<init> ()V
      // 31: astore 4
      // 33: new java/util/ArrayList
      // 36: dup
      // 37: invokespecial java/util/ArrayList.<init> ()V
      // 3a: astore 5
      // 3c: aload 5
      // 3e: aload 3
      // 3f: checkcast com/finalshell/ui/model/Q_2
      // 42: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 47: pop
      // 48: aload 5
      // 4a: invokeinterface java/util/List.size ()I 1
      // 4f: ifle f6
      // 52: aload 5
      // 54: bipush 0
      // 55: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5a: checkcast com/finalshell/ui/model/Q_2
      // 5d: astore 6
      // 5f: new javax/swing/tree/TreePath
      // 62: dup
      // 63: aload 6
      // 65: invokevirtual com/finalshell/ui/model/Q_2.getPath ()[Ljavax/swing/tree/TreeNode;
      // 68: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 6b: astore 7
      // 6d: aload 4
      // 6f: aload 2
      // 70: ifnull f8
      // 73: aload 6
      // 75: invokevirtual com/finalshell/ui/model/Q_2.H ()Ljava/lang/String;
      // 78: aload 0
      // 79: aload 7
      // 7b: invokevirtual javax/swing/JTree.isExpanded (Ljavax/swing/tree/TreePath;)Z
      // 7e: iload 1
      // 7f: aload 2
      // 80: ifnull a1
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 89: athrow
      // 8a: ifeq b3
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: aload 0
      // 95: aload 7
      // 97: invokevirtual javax/swing/JTree.isPathSelected (Ljavax/swing/tree/TreePath;)Z
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a0: athrow
      // a1: aload 2
      // a2: ifnull b0
      // a5: ifeq b3
      // a8: goto af
      // ab: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ae: athrow
      // af: bipush 1
      // b0: goto b4
      // b3: bipush 0
      // b4: invokevirtual com/finalshell/ui/model/P2.P (Ljava/lang/String;ZZ)V
      // b7: bipush 0
      // b8: istore 8
      // ba: iload 8
      // bc: aload 6
      // be: invokevirtual com/finalshell/ui/model/Q_2.getChildCount ()I
      // c1: if_icmpge e8
      // c4: aload 5
      // c6: aload 6
      // c8: iload 8
      // ca: invokevirtual com/finalshell/ui/model/Q_2.getChildAt (I)Ljavax/swing/tree/TreeNode;
      // cd: checkcast com/finalshell/ui/model/Q_2
      // d0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d5: pop
      // d6: iinc 8 1
      // d9: aload 2
      // da: ifnull f2
      // dd: aload 2
      // de: ifnonnull ba
      // e1: goto e8
      // e4: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e7: athrow
      // e8: aload 5
      // ea: aload 6
      // ec: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // f1: pop
      // f2: aload 2
      // f3: ifnonnull 48
      // f6: aload 4
      // f8: areturn
   }

   public static void A(JTree var0, com.finalshell.ui.model.P2 var1) {
      T(var0, var1, true);
   }

   public static void T(JTree param0, com.finalshell.ui.model.P2 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/S.d ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual javax/swing/JTree.getModel ()Ljavax/swing/tree/TreeModel;
      // 007: invokeinterface javax/swing/tree/TreeModel.getRoot ()Ljava/lang/Object; 1
      // 00c: astore 4
      // 00e: astore 3
      // 00f: aload 4
      // 011: instanceof com/finalshell/ui/model/Q_2
      // 014: ifne 02c
      // 017: new java/lang/RuntimeException
      // 01a: dup
      // 01b: sipush 7801
      // 01e: sipush 6672
      // 021: invokestatic com/finalshell/core/U4.a (II)Ljava/lang/String;
      // 024: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 027: athrow
      // 028: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02b: athrow
      // 02c: aload 1
      // 02d: ifnonnull 035
      // 030: return
      // 031: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 034: athrow
      // 035: aload 0
      // 036: invokevirtual javax/swing/JTree.clearSelection ()V
      // 039: new java/util/ArrayList
      // 03c: dup
      // 03d: invokespecial java/util/ArrayList.<init> ()V
      // 040: astore 5
      // 042: aload 5
      // 044: aload 4
      // 046: checkcast com/finalshell/ui/model/Q_2
      // 049: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 04e: pop
      // 04f: aload 5
      // 051: invokeinterface java/util/List.size ()I 1
      // 056: ifle 12e
      // 059: aload 5
      // 05b: bipush 0
      // 05c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 061: checkcast com/finalshell/ui/model/Q_2
      // 064: astore 6
      // 066: new javax/swing/tree/TreePath
      // 069: dup
      // 06a: aload 6
      // 06c: invokevirtual com/finalshell/ui/model/Q_2.getPath ()[Ljavax/swing/tree/TreeNode;
      // 06f: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 072: astore 7
      // 074: aload 1
      // 075: aload 6
      // 077: invokevirtual com/finalshell/ui/model/Q_2.H ()Ljava/lang/String;
      // 07a: invokevirtual com/finalshell/ui/model/P2.y (Ljava/lang/String;)Z
      // 07d: aload 3
      // 07e: ifnull 099
      // 081: ifeq 0d3
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08a: athrow
      // 08b: aload 0
      // 08c: aload 7
      // 08e: invokevirtual javax/swing/JTree.expandPath (Ljavax/swing/tree/TreePath;)V
      // 091: bipush 0
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 098: athrow
      // 099: istore 8
      // 09b: iload 8
      // 09d: aload 6
      // 09f: invokevirtual com/finalshell/ui/model/Q_2.getChildCount ()I
      // 0a2: if_icmpge 0cf
      // 0a5: aload 5
      // 0a7: aload 0
      // 0a8: invokevirtual javax/swing/JTree.getModel ()Ljavax/swing/tree/TreeModel;
      // 0ab: aload 6
      // 0ad: iload 8
      // 0af: invokeinterface javax/swing/tree/TreeModel.getChild (Ljava/lang/Object;I)Ljava/lang/Object; 3
      // 0b4: checkcast com/finalshell/ui/model/Q_2
      // 0b7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0bc: pop
      // 0bd: iinc 8 1
      // 0c0: aload 3
      // 0c1: ifnull 0e0
      // 0c4: aload 3
      // 0c5: ifnonnull 09b
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 3
      // 0d0: ifnonnull 0e0
      // 0d3: aload 0
      // 0d4: aload 7
      // 0d6: invokevirtual javax/swing/JTree.collapsePath (Ljavax/swing/tree/TreePath;)V
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0df: athrow
      // 0e0: iload 2
      // 0e1: aload 3
      // 0e2: ifnull 129
      // 0e5: ifeq 120
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: aload 6
      // 0f2: invokevirtual com/finalshell/ui/model/Q_2.H ()Ljava/lang/String;
      // 0f5: invokevirtual com/finalshell/ui/model/P2.D (Ljava/lang/String;)Z
      // 0f8: ifeq 113
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: aload 0
      // 103: aload 7
      // 105: invokevirtual javax/swing/JTree.addSelectionPath (Ljavax/swing/tree/TreePath;)V
      // 108: aload 3
      // 109: ifnonnull 120
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 112: athrow
      // 113: aload 0
      // 114: aload 7
      // 116: invokevirtual javax/swing/JTree.removeSelectionPath (Ljavax/swing/tree/TreePath;)V
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11f: athrow
      // 120: aload 5
      // 122: aload 6
      // 124: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 129: pop
      // 12a: aload 3
      // 12b: ifnonnull 04f
      // 12e: return
   }

   public static void z(List param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/S.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokeinterface java/util/List.size ()I 1
      // 09: bipush 1
      // 0a: isub
      // 0b: istore 2
      // 0c: astore 1
      // 0d: iload 2
      // 0e: iflt 8f
      // 11: aload 0
      // 12: iload 2
      // 13: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 18: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 1b: astore 3
      // 1c: aload 0
      // 1d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 22: astore 4
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 88
      // 2e: aload 4
      // 30: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 38: astore 5
      // 3a: aload 5
      // 3c: aload 1
      // 3d: ifnull 1b
      // 40: aload 3
      // 41: aload 1
      // 42: ifnull 64
      // 45: if_acmpeq 7d
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 3
      // 50: aload 1
      // 51: ifnull 78
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5a: athrow
      // 5b: aload 5
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 63: athrow
      // 64: invokevirtual javax/swing/tree/DefaultMutableTreeNode.isNodeAncestor (Ljavax/swing/tree/TreeNode;)Z
      // 67: ifeq 7d
      // 6a: aload 0
      // 6b: iload 2
      // 6c: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 77: athrow
      // 78: pop
      // 79: aload 1
      // 7a: ifnonnull 88
      // 7d: aload 1
      // 7e: ifnonnull 24
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/U4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 87: athrow
      // 88: iinc 2 -1
      // 8b: aload 1
      // 8c: ifnonnull 0d
      // 8f: return
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 7801) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 2;
               break;
            case 1:
               var10000 = 149;
               break;
            case 2:
               var10000 = 169;
               break;
            case 3:
               var10000 = 240;
               break;
            case 4:
               var10000 = 204;
               break;
            case 5:
               var10000 = 109;
               break;
            case 6:
               var10000 = 4;
               break;
            case 7:
               var10000 = 192;
               break;
            case 8:
               var10000 = 167;
               break;
            case 9:
               var10000 = 55;
               break;
            case 10:
               var10000 = 25;
               break;
            case 11:
               var10000 = 112;
               break;
            case 12:
               var10000 = 26;
               break;
            case 13:
               var10000 = 14;
               break;
            case 14:
               var10000 = 121;
               break;
            case 15:
               var10000 = 19;
               break;
            case 16:
               var10000 = 138;
               break;
            case 17:
               var10000 = 76;
               break;
            case 18:
               var10000 = 205;
               break;
            case 19:
               var10000 = 189;
               break;
            case 20:
               var10000 = 35;
               break;
            case 21:
               var10000 = 239;
               break;
            case 22:
               var10000 = 217;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 77;
               break;
            case 25:
               var10000 = 49;
               break;
            case 26:
               var10000 = 98;
               break;
            case 27:
               var10000 = 31;
               break;
            case 28:
               var10000 = 12;
               break;
            case 29:
               var10000 = 74;
               break;
            case 30:
               var10000 = 134;
               break;
            case 31:
               var10000 = 153;
               break;
            case 32:
               var10000 = 94;
               break;
            case 33:
               var10000 = 155;
               break;
            case 34:
               var10000 = 42;
               break;
            case 35:
               var10000 = 182;
               break;
            case 36:
               var10000 = 110;
               break;
            case 37:
               var10000 = 230;
               break;
            case 38:
               var10000 = 124;
               break;
            case 39:
               var10000 = 75;
               break;
            case 40:
               var10000 = 126;
               break;
            case 41:
               var10000 = 119;
               break;
            case 42:
               var10000 = 88;
               break;
            case 43:
               var10000 = 130;
               break;
            case 44:
               var10000 = 5;
               break;
            case 45:
               var10000 = 103;
               break;
            case 46:
               var10000 = 3;
               break;
            case 47:
               var10000 = 10;
               break;
            case 48:
               var10000 = 105;
               break;
            case 49:
               var10000 = 140;
               break;
            case 50:
               var10000 = 89;
               break;
            case 51:
               var10000 = 159;
               break;
            case 52:
               var10000 = 30;
               break;
            case 53:
               var10000 = 61;
               break;
            case 54:
               var10000 = 199;
               break;
            case 55:
               var10000 = 214;
               break;
            case 56:
               var10000 = 139;
               break;
            case 57:
               var10000 = 66;
               break;
            case 58:
               var10000 = 147;
               break;
            case 59:
               var10000 = 58;
               break;
            case 60:
               var10000 = 183;
               break;
            case 61:
               var10000 = 173;
               break;
            case 62:
               var10000 = 237;
               break;
            case 63:
               var10000 = 157;
               break;
            case 64:
               var10000 = 193;
               break;
            case 65:
               var10000 = 51;
               break;
            case 66:
               var10000 = 95;
               break;
            case 67:
               var10000 = 16;
               break;
            case 68:
               var10000 = 191;
               break;
            case 69:
               var10000 = 218;
               break;
            case 70:
               var10000 = 37;
               break;
            case 71:
               var10000 = 198;
               break;
            case 72:
               var10000 = 53;
               break;
            case 73:
               var10000 = 243;
               break;
            case 74:
               var10000 = 245;
               break;
            case 75:
               var10000 = 222;
               break;
            case 76:
               var10000 = 247;
               break;
            case 77:
               var10000 = 142;
               break;
            case 78:
               var10000 = 22;
               break;
            case 79:
               var10000 = 175;
               break;
            case 80:
               var10000 = 11;
               break;
            case 81:
               var10000 = 81;
               break;
            case 82:
               var10000 = 241;
               break;
            case 83:
               var10000 = 161;
               break;
            case 84:
               var10000 = 132;
               break;
            case 85:
               var10000 = 181;
               break;
            case 86:
               var10000 = 244;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 180;
               break;
            case 89:
               var10000 = 164;
               break;
            case 90:
               var10000 = 54;
               break;
            case 91:
               var10000 = 177;
               break;
            case 92:
               var10000 = 160;
               break;
            case 93:
               var10000 = 115;
               break;
            case 94:
               var10000 = 150;
               break;
            case 95:
               var10000 = 15;
               break;
            case 96:
               var10000 = 46;
               break;
            case 97:
               var10000 = 166;
               break;
            case 98:
               var10000 = 156;
               break;
            case 99:
               var10000 = 190;
               break;
            case 100:
               var10000 = 39;
               break;
            case 101:
               var10000 = 48;
               break;
            case 102:
               var10000 = 117;
               break;
            case 103:
               var10000 = 227;
               break;
            case 104:
               var10000 = 210;
               break;
            case 105:
               var10000 = 187;
               break;
            case 106:
               var10000 = 174;
               break;
            case 107:
               var10000 = 33;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 178;
               break;
            case 110:
               var10000 = 151;
               break;
            case 111:
               var10000 = 64;
               break;
            case 112:
               var10000 = 246;
               break;
            case 113:
               var10000 = 211;
               break;
            case 114:
               var10000 = 108;
               break;
            case 115:
               var10000 = 17;
               break;
            case 116:
               var10000 = 34;
               break;
            case 117:
               var10000 = 87;
               break;
            case 118:
               var10000 = 236;
               break;
            case 119:
               var10000 = 201;
               break;
            case 120:
               var10000 = 118;
               break;
            case 121:
               var10000 = 226;
               break;
            case 122:
               var10000 = 102;
               break;
            case 123:
               var10000 = 242;
               break;
            case 124:
               var10000 = 23;
               break;
            case 125:
               var10000 = 220;
               break;
            case 126:
               var10000 = 100;
               break;
            case 127:
               var10000 = 207;
               break;
            case 128:
               var10000 = 137;
               break;
            case 129:
               var10000 = 148;
               break;
            case 130:
               var10000 = 255;
               break;
            case 131:
               var10000 = 202;
               break;
            case 132:
               var10000 = 158;
               break;
            case 133:
               var10000 = 125;
               break;
            case 134:
               var10000 = 171;
               break;
            case 135:
               var10000 = 104;
               break;
            case 136:
               var10000 = 162;
               break;
            case 137:
               var10000 = 216;
               break;
            case 138:
               var10000 = 113;
               break;
            case 139:
               var10000 = 80;
               break;
            case 140:
               var10000 = 106;
               break;
            case 141:
               var10000 = 250;
               break;
            case 142:
               var10000 = 254;
               break;
            case 143:
               var10000 = 133;
               break;
            case 144:
               var10000 = 7;
               break;
            case 145:
               var10000 = 83;
               break;
            case 146:
               var10000 = 200;
               break;
            case 147:
               var10000 = 123;
               break;
            case 148:
               var10000 = 225;
               break;
            case 149:
               var10000 = 13;
               break;
            case 150:
               var10000 = 209;
               break;
            case 151:
               var10000 = 184;
               break;
            case 152:
               var10000 = 188;
               break;
            case 153:
               var10000 = 252;
               break;
            case 154:
               var10000 = 65;
               break;
            case 155:
               var10000 = 84;
               break;
            case 156:
               var10000 = 249;
               break;
            case 157:
               var10000 = 1;
               break;
            case 158:
               var10000 = 36;
               break;
            case 159:
               var10000 = 136;
               break;
            case 160:
               var10000 = 170;
               break;
            case 161:
               var10000 = 234;
               break;
            case 162:
               var10000 = 52;
               break;
            case 163:
               var10000 = 43;
               break;
            case 164:
               var10000 = 8;
               break;
            case 165:
               var10000 = 56;
               break;
            case 166:
               var10000 = 6;
               break;
            case 167:
               var10000 = 146;
               break;
            case 168:
               var10000 = 185;
               break;
            case 169:
               var10000 = 40;
               break;
            case 170:
               var10000 = 47;
               break;
            case 171:
               var10000 = 235;
               break;
            case 172:
               var10000 = 116;
               break;
            case 173:
               var10000 = 208;
               break;
            case 174:
               var10000 = 72;
               break;
            case 175:
               var10000 = 29;
               break;
            case 176:
               var10000 = 212;
               break;
            case 177:
               var10000 = 71;
               break;
            case 178:
               var10000 = 186;
               break;
            case 179:
               var10000 = 248;
               break;
            case 180:
               var10000 = 38;
               break;
            case 181:
               var10000 = 96;
               break;
            case 182:
               var10000 = 144;
               break;
            case 183:
               var10000 = 9;
               break;
            case 184:
               var10000 = 41;
               break;
            case 185:
               var10000 = 203;
               break;
            case 186:
               var10000 = 152;
               break;
            case 187:
               var10000 = 224;
               break;
            case 188:
               var10000 = 196;
               break;
            case 189:
               var10000 = 57;
               break;
            case 190:
               var10000 = 69;
               break;
            case 191:
               var10000 = 195;
               break;
            case 192:
               var10000 = 145;
               break;
            case 193:
               var10000 = 111;
               break;
            case 194:
               var10000 = 73;
               break;
            case 195:
               var10000 = 92;
               break;
            case 196:
               var10000 = 219;
               break;
            case 197:
               var10000 = 20;
               break;
            case 198:
               var10000 = 154;
               break;
            case 199:
               var10000 = 90;
               break;
            case 200:
               var10000 = 63;
               break;
            case 201:
               var10000 = 228;
               break;
            case 202:
               var10000 = 60;
               break;
            case 203:
               var10000 = 120;
               break;
            case 204:
               var10000 = 93;
               break;
            case 205:
               var10000 = 194;
               break;
            case 206:
               var10000 = 221;
               break;
            case 207:
               var10000 = 86;
               break;
            case 208:
               var10000 = 215;
               break;
            case 209:
               var10000 = 251;
               break;
            case 210:
               var10000 = 168;
               break;
            case 211:
               var10000 = 232;
               break;
            case 212:
               var10000 = 85;
               break;
            case 213:
               var10000 = 101;
               break;
            case 214:
               var10000 = 163;
               break;
            case 215:
               var10000 = 172;
               break;
            case 216:
               var10000 = 27;
               break;
            case 217:
               var10000 = 143;
               break;
            case 218:
               var10000 = 107;
               break;
            case 219:
               var10000 = 129;
               break;
            case 220:
               var10000 = 78;
               break;
            case 221:
               var10000 = 45;
               break;
            case 222:
               var10000 = 68;
               break;
            case 223:
               var10000 = 97;
               break;
            case 224:
               var10000 = 122;
               break;
            case 225:
               var10000 = 197;
               break;
            case 226:
               var10000 = 131;
               break;
            case 227:
               var10000 = 21;
               break;
            case 228:
               var10000 = 28;
               break;
            case 229:
               var10000 = 32;
               break;
            case 230:
               var10000 = 233;
               break;
            case 231:
               var10000 = 44;
               break;
            case 232:
               var10000 = 135;
               break;
            case 233:
               var10000 = 62;
               break;
            case 234:
               var10000 = 82;
               break;
            case 235:
               var10000 = 91;
               break;
            case 236:
               var10000 = 141;
               break;
            case 237:
               var10000 = 223;
               break;
            case 238:
               var10000 = 165;
               break;
            case 239:
               var10000 = 176;
               break;
            case 240:
               var10000 = 128;
               break;
            case 241:
               var10000 = 59;
               break;
            case 242:
               var10000 = 114;
               break;
            case 243:
               var10000 = 99;
               break;
            case 244:
               var10000 = 229;
               break;
            case 245:
               var10000 = 213;
               break;
            case 246:
               var10000 = 127;
               break;
            case 247:
               var10000 = 18;
               break;
            case 248:
               var10000 = 50;
               break;
            case 249:
               var10000 = 206;
               break;
            case 250:
               var10000 = 24;
               break;
            case 251:
               var10000 = 0;
               break;
            case 252:
               var10000 = 231;
               break;
            case 253:
               var10000 = 238;
               break;
            case 254:
               var10000 = 67;
               break;
            default:
               var10000 = 79;
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
      String var2 = "\u0089ÐÏt¨\u0080úM\u008a6\u0097?/±J;a\"\u008ch´|£ÞXdQ\u0005®\u009dè°Gç<\u001e>Vþ9_é\u009eèqßt¨\u000bóª\u0010X,QêµE§Z{pÔÏ\u008dTþRÌ\u001c.\u009b\u0092\u0081+\u0001üªõùi\u0083ÆÚ¥edèX\f\u009d\u007fÉ¾¡8iÒ²\u009c¯N£fyäj<a¢]aú\u0000àZ\u0095Ï\u008fÄòÂ¯\u008c\u0017(w<\u001d\u0007m\u0095x\u0010ÍXê\u008e»\u001a\u0019N\r\u0093ÎíÁ¬Ê\u001abø\u008d\b\u001cN[Ú=ì¿Ê\u0005 \u0091\u009d¸Ù»ìËvÓ³D¦Ì";
      int var4 = "\u0089ÐÏt¨\u0080úM\u008a6\u0097?/±J;a\"\u008ch´|£ÞXdQ\u0005®\u009dè°Gç<\u001e>Vþ9_é\u009eèqßt¨\u000bóª\u0010X,QêµE§Z{pÔÏ\u008dTþRÌ\u001c.\u009b\u0092\u0081+\u0001üªõùi\u0083ÆÚ¥edèX\f\u009d\u007fÉ¾¡8iÒ²\u009c¯N£fyäj<a¢]aú\u0000àZ\u0095Ï\u008fÄòÂ¯\u008c\u0017(w<\u001d\u0007m\u0095x\u0010ÍXê\u008e»\u001a\u0019N\r\u0093ÎíÁ¬Ê\u001abø\u008d\b\u001cN[Ú=ì¿Ê\u0005 \u0091\u009d¸Ù»ìËvÓ³D¦Ì"
         .length();
      char var1 = 'X';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 99;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 99;
               var10006 = var6;
            } else {
               var13 = 99;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 99;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 49;
                     break;
                  case 1:
                     var29 = 69;
                     break;
                  case 2:
                     var29 = 41;
                     break;
                  case 3:
                     var29 = 56;
                     break;
                  case 4:
                     var29 = 58;
                     break;
                  case 5:
                     var29 = 111;
                     break;
                  default:
                     var29 = 78;
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





