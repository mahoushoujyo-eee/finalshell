package com.finalshell.core;

import javax.swing.RowSorter.SortKey;
import javax.swing.table.TableRowSorter;

public class DP3 extends TableRowSorter {
   public final UT d;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public DP3(UT var1, com.finalshell.ui.model.Cd4 var2) {
      super(var2);
      this.d = var1;
   }

   public SortKey t(SortKey param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/CE.S$arrint ()[I
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3a
      // 09: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 0c: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 18: athrow
      // 19: new javax/swing/RowSorter$SortKey
      // 1c: dup
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 21: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 24: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 27: areturn
      // 28: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
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
      // 000: invokestatic com/finalshell/ui/panel/CE.S$arrint ()[I
      // 003: aload 0
      // 004: ldc2_w 492322600855252495
      // 007: astore 7
      // 009: ldc2_w 492322600855252495
      // 00c: aload 7
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: aload 0
      // 012: ldc2_w 492322600855252495
      // 015: astore 9
      // 017: ldc2_w 492322600855252495
      // 01a: aload 9
      // 01c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01f: ldc2_w 369213064747264380
      // 022: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 025: swap
      // 026: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 029: ldc2_w 448041790433139499
      // 02c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02f: dup_x2
      // 030: pop
      // 031: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 034: astore 2
      // 035: aload 0
      // 036: ldc2_w 492322600855252495
      // 039: astore 11
      // 03b: ldc2_w 492322600855252495
      // 03e: aload 11
      // 040: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 043: iload 1
      // 044: ldc2_w 369213064747264380
      // 047: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 04a: dup_x2
      // 04b: pop
      // 04c: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 04f: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 052: astore 3
      // 053: iload 1
      // 054: bipush 4
      // 055: aload 2
      // 056: ifnull 06c
      // 059: if_icmpeq 0b8
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 062: athrow
      // 063: iload 1
      // 064: bipush 5
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 06b: athrow
      // 06c: aload 2
      // 06d: ifnull 08b
      // 070: if_icmpeq 0b8
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 079: athrow
      // 07a: iload 1
      // 07b: sipush 14267
      // 07e: ldc2_w 5851305096518317405
      // 081: invokestatic com/finalshell/core/DP3.a (IJ)I
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 08a: athrow
      // 08b: aload 2
      // 08c: ifnull 0b5
      // 08f: if_icmpeq 0b8
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 098: athrow
      // 099: iload 1
      // 09a: aload 2
      // 09b: ifnull 0bd
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0a4: athrow
      // 0a5: sipush 24127
      // 0a8: ldc2_w 883278026876509400
      // 0ab: invokestatic com/finalshell/core/DP3.a (IJ)I
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0b4: athrow
      // 0b5: if_icmpne 0bc
      // 0b8: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 0bb: astore 3
      // 0bc: iload 1
      // 0bd: aload 2
      // 0be: ifnull 0cc
      // 0c1: iflt 0e1
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ca: athrow
      // 0cb: iload 1
      // 0cc: aload 2
      // 0cd: ifnull 0f5
      // 0d0: aload 0
      // 0d1: invokevirtual com/finalshell/core/DP3.getModelWrapper ()Ljavax/swing/DefaultRowSorter$ModelWrapper;
      // 0d4: invokevirtual javax/swing/DefaultRowSorter$ModelWrapper.getColumnCount ()I
      // 0d7: if_icmplt 0f0
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0e0: athrow
      // 0e1: new java/lang/IndexOutOfBoundsException
      // 0e4: dup
      // 0e5: getstatic com/finalshell/core/DP3.a Ljava/lang/String;
      // 0e8: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0eb: athrow
      // 0ec: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: iload 1
      // 0f2: invokevirtual com/finalshell/core/DP3.isSortable (I)Z
      // 0f5: ifeq 216
      // 0f8: new java/util/ArrayList
      // 0fb: dup
      // 0fc: aload 0
      // 0fd: invokevirtual com/finalshell/core/DP3.getSortKeys ()Ljava/util/List;
      // 100: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 103: astore 4
      // 105: aload 4
      // 107: invokeinterface java/util/List.size ()I 1
      // 10c: bipush 1
      // 10d: isub
      // 10e: istore 6
      // 110: iload 6
      // 112: iflt 14c
      // 115: aload 4
      // 117: iload 6
      // 119: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11e: checkcast javax/swing/RowSorter$SortKey
      // 121: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 124: iload 1
      // 125: aload 2
      // 126: ifnull 15a
      // 129: if_icmpne 13e
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 132: athrow
      // 133: aload 2
      // 134: ifnonnull 14c
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 13d: athrow
      // 13e: iinc 6 -1
      // 141: aload 2
      // 142: ifnonnull 110
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 14b: athrow
      // 14c: iload 6
      // 14e: aload 2
      // 14f: ifnull 17f
      // 152: bipush -1
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 159: athrow
      // 15a: if_icmpne 176
      // 15d: new javax/swing/RowSorter$SortKey
      // 160: dup
      // 161: iload 1
      // 162: aload 3
      // 163: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 166: astore 5
      // 168: aload 4
      // 16a: bipush 0
      // 16b: aload 5
      // 16d: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 172: aload 2
      // 173: ifnonnull 1e2
      // 176: iload 6
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 17e: athrow
      // 17f: ifne 1c0
      // 182: aload 4
      // 184: bipush 0
      // 185: aload 0
      // 186: aload 4
      // 188: bipush 0
      // 189: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 18e: checkcast javax/swing/RowSorter$SortKey
      // 191: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 194: ldc2_w 373330776753603824
      // 197: astore 14
      // 199: astore 13
      // 19b: ldc2_w 373330776753603824
      // 19e: aload 13
      // 1a0: aload 14
      // 1a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a5: checkcast javax/swing/RowSorter$SortKey
      // 1a8: goto 1af
      // 1ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 1b4: pop
      // 1b5: aload 2
      // 1b6: ifnonnull 1e2
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1bf: athrow
      // 1c0: aload 4
      // 1c2: iload 6
      // 1c4: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 1c9: pop
      // 1ca: aload 4
      // 1cc: bipush 0
      // 1cd: new javax/swing/RowSorter$SortKey
      // 1d0: dup
      // 1d1: iload 1
      // 1d2: aload 3
      // 1d3: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 1d6: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 1db: goto 1e2
      // 1de: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1e1: athrow
      // 1e2: aload 4
      // 1e4: aload 2
      // 1e5: ifnull 20e
      // 1e8: invokeinterface java/util/List.size ()I 1
      // 1ed: aload 0
      // 1ee: invokevirtual com/finalshell/core/DP3.getMaxSortKeys ()I
      // 1f1: if_icmple 210
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1fa: athrow
      // 1fb: aload 4
      // 1fd: bipush 0
      // 1fe: aload 0
      // 1ff: invokevirtual com/finalshell/core/DP3.getMaxSortKeys ()I
      // 202: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/DP3.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 20d: athrow
      // 20e: astore 4
      // 210: aload 0
      // 211: aload 4
      // 213: invokevirtual com/finalshell/core/DP3.setSortKeys (Ljava/util/List;)V
      // 216: return
   }

   public static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 743;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
}





