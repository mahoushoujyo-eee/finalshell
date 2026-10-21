import javax.swing.RowSorter.SortKey;
import javax.swing.table.TableRowSorter;

class dP_3 extends TableRowSorter {
   final UT d;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   dP_3(UT var1, cd_4 var2) {
      super(var2);
      this.d = var1;
   }

   private SortKey t(SortKey param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic CE.S ()[I
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3a
      // 09: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 0c: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 18: athrow
      // 19: new javax/swing/RowSorter$SortKey
      // 1c: dup
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 21: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 24: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 27: areturn
      // 28: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
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
      // 000: invokestatic CE.S ()[I
      // 003: aload 0
      // 004: ldc2_w 492322600855252495
      // 007: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00a: swap
      // 00b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00e: aload 0
      // 00f: ldc2_w 492322600855252495
      // 012: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 015: swap
      // 016: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 019: ldc2_w 369213064747264380
      // 01c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 01f: swap
      // 020: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 023: ldc2_w 448041790433139499
      // 026: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 029: dup_x2
      // 02a: pop
      // 02b: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 02e: astore 2
      // 02f: aload 0
      // 030: ldc2_w 492322600855252495
      // 033: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 036: swap
      // 037: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03a: iload 1
      // 03b: ldc2_w 369213064747264380
      // 03e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 041: dup_x2
      // 042: pop
      // 043: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 046: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 049: astore 3
      // 04a: iload 1
      // 04b: bipush 4
      // 04c: aload 2
      // 04d: ifnull 063
      // 050: if_icmpeq 0af
      // 053: goto 05a
      // 056: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 059: athrow
      // 05a: iload 1
      // 05b: bipush 5
      // 05c: goto 063
      // 05f: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 062: athrow
      // 063: aload 2
      // 064: ifnull 082
      // 067: if_icmpeq 0af
      // 06a: goto 071
      // 06d: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 070: athrow
      // 071: iload 1
      // 072: sipush 14267
      // 075: ldc2_w 5851305096518317405
      // 078: invokestatic dP_3.a (IJ)I
      // 07b: goto 082
      // 07e: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 081: athrow
      // 082: aload 2
      // 083: ifnull 0ac
      // 086: if_icmpeq 0af
      // 089: goto 090
      // 08c: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 08f: athrow
      // 090: iload 1
      // 091: aload 2
      // 092: ifnull 0b4
      // 095: goto 09c
      // 098: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 09b: athrow
      // 09c: sipush 24127
      // 09f: ldc2_w 883278026876509400
      // 0a2: invokestatic dP_3.a (IJ)I
      // 0a5: goto 0ac
      // 0a8: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ab: athrow
      // 0ac: if_icmpne 0b3
      // 0af: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 0b2: astore 3
      // 0b3: iload 1
      // 0b4: aload 2
      // 0b5: ifnull 0c3
      // 0b8: iflt 0d8
      // 0bb: goto 0c2
      // 0be: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0c1: athrow
      // 0c2: iload 1
      // 0c3: aload 2
      // 0c4: ifnull 0ec
      // 0c7: aload 0
      // 0c8: invokevirtual dP_3.getModelWrapper ()Ljavax/swing/DefaultRowSorter$ModelWrapper;
      // 0cb: invokevirtual javax/swing/DefaultRowSorter$ModelWrapper.getColumnCount ()I
      // 0ce: if_icmplt 0e7
      // 0d1: goto 0d8
      // 0d4: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0d7: athrow
      // 0d8: new java/lang/IndexOutOfBoundsException
      // 0db: dup
      // 0dc: getstatic dP_3.a Ljava/lang/String;
      // 0df: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0e2: athrow
      // 0e3: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: iload 1
      // 0e9: invokevirtual dP_3.isSortable (I)Z
      // 0ec: ifeq 207
      // 0ef: new java/util/ArrayList
      // 0f2: dup
      // 0f3: aload 0
      // 0f4: invokevirtual dP_3.getSortKeys ()Ljava/util/List;
      // 0f7: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0fa: astore 4
      // 0fc: aload 4
      // 0fe: invokeinterface java/util/List.size ()I 1
      // 103: bipush 1
      // 104: isub
      // 105: istore 6
      // 107: iload 6
      // 109: iflt 143
      // 10c: aload 4
      // 10e: iload 6
      // 110: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 115: checkcast javax/swing/RowSorter$SortKey
      // 118: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 11b: iload 1
      // 11c: aload 2
      // 11d: ifnull 151
      // 120: if_icmpne 135
      // 123: goto 12a
      // 126: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 129: athrow
      // 12a: aload 2
      // 12b: ifnonnull 143
      // 12e: goto 135
      // 131: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 134: athrow
      // 135: iinc 6 -1
      // 138: aload 2
      // 139: ifnonnull 107
      // 13c: goto 143
      // 13f: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 142: athrow
      // 143: iload 6
      // 145: aload 2
      // 146: ifnull 176
      // 149: bipush -1
      // 14a: goto 151
      // 14d: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 150: athrow
      // 151: if_icmpne 16d
      // 154: new javax/swing/RowSorter$SortKey
      // 157: dup
      // 158: iload 1
      // 159: aload 3
      // 15a: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 15d: astore 5
      // 15f: aload 4
      // 161: bipush 0
      // 162: aload 5
      // 164: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 169: aload 2
      // 16a: ifnonnull 1d3
      // 16d: iload 6
      // 16f: goto 176
      // 172: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 175: athrow
      // 176: ifne 1b1
      // 179: aload 4
      // 17b: bipush 0
      // 17c: aload 0
      // 17d: aload 4
      // 17f: bipush 0
      // 180: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 185: checkcast javax/swing/RowSorter$SortKey
      // 188: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 18b: ldc2_w 373330776753603824
      // 18e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 191: dup_x2
      // 192: pop
      // 193: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 196: checkcast javax/swing/RowSorter$SortKey
      // 199: goto 1a0
      // 19c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 1a5: pop
      // 1a6: aload 2
      // 1a7: ifnonnull 1d3
      // 1aa: goto 1b1
      // 1ad: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1b0: athrow
      // 1b1: aload 4
      // 1b3: iload 6
      // 1b5: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 1ba: pop
      // 1bb: aload 4
      // 1bd: bipush 0
      // 1be: new javax/swing/RowSorter$SortKey
      // 1c1: dup
      // 1c2: iload 1
      // 1c3: aload 3
      // 1c4: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 1c7: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 1cc: goto 1d3
      // 1cf: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1d2: athrow
      // 1d3: aload 4
      // 1d5: aload 2
      // 1d6: ifnull 1ff
      // 1d9: invokeinterface java/util/List.size ()I 1
      // 1de: aload 0
      // 1df: invokevirtual dP_3.getMaxSortKeys ()I
      // 1e2: if_icmple 201
      // 1e5: goto 1ec
      // 1e8: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1eb: athrow
      // 1ec: aload 4
      // 1ee: bipush 0
      // 1ef: aload 0
      // 1f0: invokevirtual dP_3.getMaxSortKeys ()I
      // 1f3: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 1f8: goto 1ff
      // 1fb: invokestatic dP_3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1fe: athrow
      // 1ff: astore 4
      // 201: aload 0
      // 202: aload 4
      // 204: invokevirtual dP_3.setSortKeys (Ljava/util/List;)V
      // 207: return
   }

   private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "%\u0014\u0017Y\u0010MU$\u001e\u0002C\u0013GU4\u001a\u0015K\u0018\u0003\u001a [/M\u001fO\u0010\u000b\u0014\u001fI\u0011".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 54;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 112;
               break;
            case 1:
               var37 = 77;
               break;
            case 2:
               var37 = 77;
               break;
            case 3:
               var37 = 26;
               break;
            case 4:
               var37 = 75;
               break;
            case 5:
               var37 = 21;
               break;
            default:
               var37 = 67;
         }
      } else {
         var25 = 54;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 632690917215362454L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "îÖ\u00adcøÝ\u0001I¢T\u0085\u001b«TèÍ";
            int var13 = "îÖ\u00adcøÝ\u0001I¢T\u0085\u001b«TèÍ".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 54;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 112;
               break;
            case 1:
               var37 = 77;
               break;
            case 2:
               var37 = 77;
               break;
            case 3:
               var37 = 26;
               break;
            case 4:
               var37 = 75;
               break;
            case 5:
               var37 = 21;
               break;
            default:
               var37 = 67;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 112;
                  break;
               case 1:
                  var37 = 77;
                  break;
               case 2:
                  var37 = 77;
                  break;
               case 3:
                  var37 = 26;
                  break;
               case 4:
                  var37 = 75;
                  break;
               case 5:
                  var37 = 21;
                  break;
               default:
                  var37 = 67;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 632690917215362454L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "îÖ\u00adcøÝ\u0001I¢T\u0085\u001b«TèÍ";
               int var5 = "îÖ\u00adcøÝ\u0001I¢T\u0085\u001b«TèÍ".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 112;
                  break;
               case 1:
                  var37 = 77;
                  break;
               case 2:
                  var37 = 77;
                  break;
               case 3:
                  var37 = 26;
                  break;
               case 4:
                  var37 = 75;
                  break;
               case 5:
                  var37 = 21;
                  break;
               default:
                  var37 = 67;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 743;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





