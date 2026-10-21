import javax.swing.RowSorter.SortKey;
import javax.swing.table.TableRowSorter;

class d7_2 extends TableRowSorter {
   final y6_2 P;
   private static final String a;

   d7_2(y6_2 var1, gR var2) {
      super(var2);
      this.P = var1;
   }

   private SortKey f(SortKey param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic y6_2.Z ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3a
      // 09: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 0c: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 18: athrow
      // 19: new javax/swing/RowSorter$SortKey
      // 1c: dup
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 21: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 24: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 27: areturn
      // 28: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
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
      // 004: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 007: swap
      // 008: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: aload 0
      // 00c: ldc2_w 460104209761769664
      // 00f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 012: swap
      // 013: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 016: ldc2_w 200363817758425901
      // 019: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 01c: swap
      // 01d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 020: ldc2_w 236308356153440319
      // 023: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 026: dup_x2
      // 027: pop
      // 028: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 02b: invokestatic y6_2.Z ()[Ljava/lang/String;
      // 02e: aload 0
      // 02f: ldc2_w 460104209761769664
      // 032: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 035: swap
      // 036: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 039: iload 1
      // 03a: ldc2_w 200363817758425901
      // 03d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 040: dup_x2
      // 041: pop
      // 042: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 045: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 048: astore 3
      // 049: astore 2
      // 04a: iload 1
      // 04b: bipush 4
      // 04c: aload 2
      // 04d: ifnull 06e
      // 050: if_icmpeq 071
      // 053: goto 05a
      // 056: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 059: athrow
      // 05a: iload 1
      // 05b: aload 2
      // 05c: ifnull 076
      // 05f: goto 066
      // 062: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 065: athrow
      // 066: bipush 3
      // 067: goto 06e
      // 06a: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 06d: athrow
      // 06e: if_icmpne 075
      // 071: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 074: astore 3
      // 075: iload 1
      // 076: aload 2
      // 077: ifnull 085
      // 07a: iflt 09a
      // 07d: goto 084
      // 080: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 083: athrow
      // 084: iload 1
      // 085: aload 2
      // 086: ifnull 0ae
      // 089: aload 0
      // 08a: invokevirtual d7_2.getModelWrapper ()Ljavax/swing/DefaultRowSorter$ModelWrapper;
      // 08d: invokevirtual javax/swing/DefaultRowSorter$ModelWrapper.getColumnCount ()I
      // 090: if_icmplt 0a9
      // 093: goto 09a
      // 096: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 099: athrow
      // 09a: new java/lang/IndexOutOfBoundsException
      // 09d: dup
      // 09e: getstatic d7_2.a Ljava/lang/String;
      // 0a1: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 1
      // 0ab: invokevirtual d7_2.isSortable (I)Z
      // 0ae: ifeq 1c9
      // 0b1: new java/util/ArrayList
      // 0b4: dup
      // 0b5: aload 0
      // 0b6: invokevirtual d7_2.getSortKeys ()Ljava/util/List;
      // 0b9: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0bc: astore 4
      // 0be: aload 4
      // 0c0: invokeinterface java/util/List.size ()I 1
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: istore 6
      // 0c9: iload 6
      // 0cb: iflt 105
      // 0ce: aload 4
      // 0d0: iload 6
      // 0d2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d7: checkcast javax/swing/RowSorter$SortKey
      // 0da: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 0dd: iload 1
      // 0de: aload 2
      // 0df: ifnull 113
      // 0e2: if_icmpne 0f7
      // 0e5: goto 0ec
      // 0e8: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0eb: athrow
      // 0ec: aload 2
      // 0ed: ifnonnull 105
      // 0f0: goto 0f7
      // 0f3: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0f6: athrow
      // 0f7: iinc 6 -1
      // 0fa: aload 2
      // 0fb: ifnonnull 0c9
      // 0fe: goto 105
      // 101: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 104: athrow
      // 105: iload 6
      // 107: aload 2
      // 108: ifnull 138
      // 10b: bipush -1
      // 10c: goto 113
      // 10f: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 112: athrow
      // 113: if_icmpne 12f
      // 116: new javax/swing/RowSorter$SortKey
      // 119: dup
      // 11a: iload 1
      // 11b: aload 3
      // 11c: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 11f: astore 5
      // 121: aload 4
      // 123: bipush 0
      // 124: aload 5
      // 126: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 12b: aload 2
      // 12c: ifnonnull 195
      // 12f: iload 6
      // 131: goto 138
      // 134: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 137: athrow
      // 138: ifne 173
      // 13b: aload 4
      // 13d: bipush 0
      // 13e: aload 0
      // 13f: aload 4
      // 141: bipush 0
      // 142: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 147: checkcast javax/swing/RowSorter$SortKey
      // 14a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14d: ldc2_w 460646088160096422
      // 150: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 153: dup_x2
      // 154: pop
      // 155: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 158: checkcast javax/swing/RowSorter$SortKey
      // 15b: goto 162
      // 15e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 161: athrow
      // 162: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 167: pop
      // 168: aload 2
      // 169: ifnonnull 195
      // 16c: goto 173
      // 16f: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 172: athrow
      // 173: aload 4
      // 175: iload 6
      // 177: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 17c: pop
      // 17d: aload 4
      // 17f: bipush 0
      // 180: new javax/swing/RowSorter$SortKey
      // 183: dup
      // 184: iload 1
      // 185: aload 3
      // 186: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 189: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 18e: goto 195
      // 191: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 194: athrow
      // 195: aload 4
      // 197: aload 2
      // 198: ifnull 1c1
      // 19b: invokeinterface java/util/List.size ()I 1
      // 1a0: aload 0
      // 1a1: invokevirtual d7_2.getMaxSortKeys ()I
      // 1a4: if_icmple 1c3
      // 1a7: goto 1ae
      // 1aa: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: bipush 0
      // 1b1: aload 0
      // 1b2: invokevirtual d7_2.getMaxSortKeys ()I
      // 1b5: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 1ba: goto 1c1
      // 1bd: invokestatic d7_2.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1c0: athrow
      // 1c1: astore 4
      // 1c3: aload 0
      // 1c4: aload 4
      // 1c6: invokevirtual d7_2.setSortKeys (Ljava/util/List;)V
      // 1c9: return
   }

   private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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





