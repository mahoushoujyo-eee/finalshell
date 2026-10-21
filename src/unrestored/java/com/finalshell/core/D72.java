package com.finalshell.core;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import javax.swing.RowSorter.SortKey;
import javax.swing.table.TableRowSorter;

public class D72 extends TableRowSorter {
   public final Y62_2 P;
   public static String a;

   public D72(Y62_2 var1, com.finalshell.ui.model.GR var2) {
      super(var2);
      this.P = var1;
   }

   public SortKey f(SortKey param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Y62_2.Z ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3a
      // 09: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 0c: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 18: athrow
      // 19: new javax/swing/RowSorter$SortKey
      // 1c: dup
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 21: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 24: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 27: areturn
      // 28: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2b: athrow
      // 2c: new javax/swing/RowSorter$SortKey
      // 2f: dup
      // 30: aload 1
      // 31: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 34: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 37: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 3a: areturn
   }

   @Override
   public void toggleSortOrder(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 460104209761769664
      // 004: astore 7
      // 006: ldc2_w 460104209761769664
      // 009: aload 7
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: aload 0
      // 00f: ldc2_w 460104209761769664
      // 012: astore 9
      // 014: ldc2_w 460104209761769664
      // 017: aload 9
      // 019: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01c: ldc2_w 200363817758425901
      // 01f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 022: swap
      // 023: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 026: ldc2_w 236308356153440319
      // 029: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02c: dup_x2
      // 02d: pop
      // 02e: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 031: invokestatic com/finalshell/core/Y62_2.Z ()[Ljava/lang/String;
      // 034: aload 0
      // 035: ldc2_w 460104209761769664
      // 038: astore 11
      // 03a: ldc2_w 460104209761769664
      // 03d: aload 11
      // 03f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 042: iload 1
      // 043: ldc2_w 200363817758425901
      // 046: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 049: dup_x2
      // 04a: pop
      // 04b: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 04e: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 051: astore 3
      // 052: astore 2
      // 053: iload 1
      // 054: bipush 4
      // 055: aload 2
      // 056: ifnull 077
      // 059: if_icmpeq 07a
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 062: athrow
      // 063: iload 1
      // 064: aload 2
      // 065: ifnull 07f
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 06e: athrow
      // 06f: bipush 3
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 076: athrow
      // 077: if_icmpne 07e
      // 07a: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 07d: astore 3
      // 07e: iload 1
      // 07f: aload 2
      // 080: ifnull 08e
      // 083: iflt 0a3
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 08c: athrow
      // 08d: iload 1
      // 08e: aload 2
      // 08f: ifnull 0b7
      // 092: aload 0
      // 093: invokevirtual com/finalshell/core/D72.getModelWrapper ()Ljavax/swing/DefaultRowSorter$ModelWrapper;
      // 096: invokevirtual javax/swing/DefaultRowSorter$ModelWrapper.getColumnCount ()I
      // 099: if_icmplt 0b2
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0a2: athrow
      // 0a3: new java/lang/IndexOutOfBoundsException
      // 0a6: dup
      // 0a7: getstatic com/finalshell/core/D72.a Ljava/lang/String;
      // 0aa: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0ad: athrow
      // 0ae: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: iload 1
      // 0b4: invokevirtual com/finalshell/core/D72.isSortable (I)Z
      // 0b7: ifeq 1d8
      // 0ba: new java/util/ArrayList
      // 0bd: dup
      // 0be: aload 0
      // 0bf: invokevirtual com/finalshell/core/D72.getSortKeys ()Ljava/util/List;
      // 0c2: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0c5: astore 4
      // 0c7: aload 4
      // 0c9: invokeinterface java/util/List.size ()I 1
      // 0ce: bipush 1
      // 0cf: isub
      // 0d0: istore 6
      // 0d2: iload 6
      // 0d4: iflt 10e
      // 0d7: aload 4
      // 0d9: iload 6
      // 0db: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e0: checkcast javax/swing/RowSorter$SortKey
      // 0e3: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 0e6: iload 1
      // 0e7: aload 2
      // 0e8: ifnull 11c
      // 0eb: if_icmpne 100
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0f4: athrow
      // 0f5: aload 2
      // 0f6: ifnonnull 10e
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ff: athrow
      // 100: iinc 6 -1
      // 103: aload 2
      // 104: ifnonnull 0d2
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 10d: athrow
      // 10e: iload 6
      // 110: aload 2
      // 111: ifnull 141
      // 114: bipush -1
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 11b: athrow
      // 11c: if_icmpne 138
      // 11f: new javax/swing/RowSorter$SortKey
      // 122: dup
      // 123: iload 1
      // 124: aload 3
      // 125: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 128: astore 5
      // 12a: aload 4
      // 12c: bipush 0
      // 12d: aload 5
      // 12f: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 134: aload 2
      // 135: ifnonnull 1a4
      // 138: iload 6
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 140: athrow
      // 141: ifne 182
      // 144: aload 4
      // 146: bipush 0
      // 147: aload 0
      // 148: aload 4
      // 14a: bipush 0
      // 14b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 150: checkcast javax/swing/RowSorter$SortKey
      // 153: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 156: ldc2_w 460646088160096422
      // 159: astore 14
      // 15b: astore 13
      // 15d: ldc2_w 460646088160096422
      // 160: aload 13
      // 162: aload 14
      // 164: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 167: checkcast javax/swing/RowSorter$SortKey
      // 16a: goto 171
      // 16d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 170: athrow
      // 171: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 176: pop
      // 177: aload 2
      // 178: ifnonnull 1a4
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 181: athrow
      // 182: aload 4
      // 184: iload 6
      // 186: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 18b: pop
      // 18c: aload 4
      // 18e: bipush 0
      // 18f: new javax/swing/RowSorter$SortKey
      // 192: dup
      // 193: iload 1
      // 194: aload 3
      // 195: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 198: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1a3: athrow
      // 1a4: aload 4
      // 1a6: aload 2
      // 1a7: ifnull 1d0
      // 1aa: invokeinterface java/util/List.size ()I 1
      // 1af: aload 0
      // 1b0: invokevirtual com/finalshell/core/D72.getMaxSortKeys ()I
      // 1b3: if_icmple 1d2
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1bc: athrow
      // 1bd: aload 4
      // 1bf: bipush 0
      // 1c0: aload 0
      // 1c1: invokevirtual com/finalshell/core/D72.getMaxSortKeys ()I
      // 1c4: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/D72.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1cf: athrow
      // 1d0: astore 4
      // 1d2: aload 0
      // 1d3: aload 4
      // 1d5: invokevirtual com/finalshell/core/D72.setSortKeys (Ljava/util/List;)V
      // 1d8: return
   }

   public static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "22KRE\u0015U38^HF\u001fU#<I@M[\u001a7}sFJ\u0017\u0010\u001c2CBD".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 34;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      } else {
         var6 = 34;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 115;
               break;
            case 1:
               var23 = 127;
               break;
            case 2:
               var23 = 5;
               break;
            case 3:
               var23 = 5;
               break;
            case 4:
               var23 = 10;
               break;
            case 5:
               var23 = 89;
               break;
            default:
               var23 = 87;
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





