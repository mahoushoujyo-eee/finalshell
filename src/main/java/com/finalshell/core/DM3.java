package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.RowFilter.Entry;
import javax.swing.RowSorter.SortKey;

public abstract class DM3 extends RowSorter {
   public boolean M;
   public OY[] z;
   public int[] L;
   public Comparator[] c;
   public boolean[] D;
   public SortKey[] n;
   public Comparator[] Z;
   public RowFilter e;
   public Lj2 A;
   public List u;
   public boolean[] g;
   public boolean U;
   public int q;
   public ZP_2 Y;
   public int f;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] h;

   public DM3() {
      List var10001 = Collections.emptyList();
      long var2 = 126458255422249291L;
      List var1 = var10001;
      Ref.s(126458255422249291L, var1, var2);
      Registry.lookupField(377572770107970079L).setInt(this, a(10542, 338652727483483887L));
   }

   public final void y(ZP_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 39
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush -1475
      // 1a: sipush 7303
      // 1d: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: ldc2_w 609384270617424667
      // 2c: astore 4
      // 2e: ldc2_w 609384270617424667
      // 31: aload 4
      // 33: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 36: checkcast com/finalshell/core/ZP_2
      // 39: astore 3
      // 3a: aload 0
      // 3b: aload 1
      // 3c: iload 2
      // 3d: ifeq ab
      // 40: ldc2_w 609384270617424667
      // 43: astore 7
      // 45: astore 6
      // 47: ldc2_w 609384270617424667
      // 4a: aload 6
      // 4c: aload 7
      // 4e: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 51: aload 3
      // 52: ifnull 84
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 60: ldc2_w 313833118081647101
      // 63: astore 9
      // 65: astore 8
      // 67: ldc2_w 313833118081647101
      // 6a: aload 8
      // 6c: aload 9
      // 6e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 71: pop
      // 72: goto 79
      // 75: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 78: athrow
      // 79: iload 2
      // 7a: ifne d7
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 0
      // 86: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 89: ldc2_w 566043907753096060
      // 8c: astore 11
      // 8e: astore 10
      // 90: ldc2_w 566043907753096060
      // 93: aload 10
      // 95: aload 11
      // 97: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9a: checkcast com/finalshell/core/ZP_2
      // 9d: goto a4
      // a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a3: athrow
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // aa: athrow
      // ab: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // ae: ldc2_w 224663528840055939
      // b1: astore 13
      // b3: astore 12
      // b5: ldc2_w 224663528840055939
      // b8: aload 12
      // ba: aload 13
      // bc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // bf: checkcast java/lang/Integer
      // c2: invokevirtual java/lang/Integer.intValue ()I
      // c5: goto cc
      // c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // cb: athrow
      // cc: ldc2_w 185211116913122441
      // cf: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // d2: dup_x2
      // d3: pop
      // d4: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // d7: return
   }

   public final ZP_2 B() {
      Object var1 = 609384270617424667L;
      return (ZP_2)Ref.g(609384270617424667L, var1);
   }

   @Override
   public final Object getModel() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 566043907753096060L;
      Object[] var1 = var10001;
      Ref.h(566043907753096060L, var1, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 118919302056896338L;
      Object[] var3 = var10002;
      var10002 = Ref.h(118919302056896338L, var3, var4);

      try {
         return (Object)var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void K(int var1, boolean var2) {
      Object[] var11;
      long var14;
      Integer var27;
      Uo2.i();
      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 311908307058196049L;
      Object[] var5 = var10002;
      Ref.h(311908307058196049L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      DM3 var3 = this;

      label57: {
         label62: {
            try {
               Object var7 = 129299070682169446L;
               var10002 = (boolean[])Ref.g(129299070682169446L, var7);
               if (var3 == null) {
                  break label57;
               }

               if (var10002 != null) {
                  break label62;
               }
            } catch (IllegalArgumentException var24) {
               throw a(var24);
            }

            Object[] var10004 = Registry.emptyArgs();
            long var10 = 566043907753096060L;
            Object[] var9 = var10004;
            Ref.h(566043907753096060L, var9, var10);
            Object var10005 = Registry.emptyArgs();
            long var12 = 401679078758232861L;
            var11 = var10005;
            var10005 = Ref.h(401679078758232861L, var11, var12);

            try {
               var27 = (Integer)var10005;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            boolean[] var28 = new boolean[var27];
            var14 = 129299070682169446L;
            boolean[] var13 = var28;
            Ref.s(129299070682169446L, var13, var14);
            Object var15 = 129299070682169446L;
            int var4 = ((boolean[])Ref.g(129299070682169446L, var15)).length - 1;

            while (var4 >= 0) {
               try {
                  Object var17 = 129299070682169446L;
                  ((boolean[])Ref.g(129299070682169446L, var17))[var4] = true;
                  var4--;
                  if (var3 == null) {
                     return;
                  }

                  if (var3 == null) {
                     break;
                  }
               } catch (IllegalArgumentException var23) {
                  throw a(var23);
               }
            }
         }

         var10002 = this;
         Object var19 = 129299070682169446L;
         boolean[] var10003 = (boolean[])Ref.g(129299070682169446L, var19);
      }

      var10002[var1] = var2;
   }

   public boolean X(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 08: ldc2_w 311908307058196049
      // 0b: astore 4
      // 0d: astore 3
      // 0e: ldc2_w 311908307058196049
      // 11: aload 3
      // 12: aload 4
      // 14: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: pop
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: istore 2
      // 20: aload 0
      // 21: ldc2_w 129299070682169446
      // 24: astore 5
      // 26: ldc2_w 129299070682169446
      // 29: aload 5
      // 2b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2e: checkcast [Z
      // 31: iload 2
      // 32: ifne 58
      // 35: ifnonnull 47
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 5a
      // 43: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 0
      // 48: ldc2_w 129299070682169446
      // 4b: astore 7
      // 4d: ldc2_w 129299070682169446
      // 50: aload 7
      // 52: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 55: checkcast [Z
      // 58: iload 1
      // 59: baload
      // 5a: ireturn
   }

   @Override
   public void setSortKeys(List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.k ()Z
      // 003: aload 0
      // 004: ldc2_w 126458255422249291
      // 007: astore 7
      // 009: ldc2_w 126458255422249291
      // 00c: aload 7
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast java/util/List
      // 014: astore 3
      // 015: istore 2
      // 016: aload 1
      // 017: iload 2
      // 018: ifeq 026
      // 01b: ifnull 116
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 024: athrow
      // 025: aload 1
      // 026: invokeinterface java/util/List.size ()I 1
      // 02b: iload 2
      // 02c: ifeq 07d
      // 02f: ifle 116
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 038: athrow
      // 039: aload 0
      // 03a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03d: ldc2_w 566043907753096060
      // 040: astore 10
      // 042: astore 9
      // 044: ldc2_w 566043907753096060
      // 047: aload 9
      // 049: aload 10
      // 04b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04e: goto 055
      // 051: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 054: athrow
      // 055: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 058: ldc2_w 401679078758232861
      // 05b: astore 12
      // 05d: astore 11
      // 05f: ldc2_w 401679078758232861
      // 062: aload 11
      // 064: aload 12
      // 066: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 069: checkcast java/lang/Integer
      // 06c: invokevirtual java/lang/Integer.intValue ()I
      // 06f: goto 076
      // 072: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 075: athrow
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07c: athrow
      // 07d: istore 4
      // 07f: aload 1
      // 080: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 085: astore 5
      // 087: aload 5
      // 089: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08e: ifeq 0f5
      // 091: aload 5
      // 093: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 098: checkcast javax/swing/RowSorter$SortKey
      // 09b: astore 6
      // 09d: iload 2
      // 09e: ifeq 112
      // 0a1: aload 6
      // 0a3: iload 2
      // 0a4: ifeq 0ba
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: ifnull 0dc
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b7: athrow
      // 0b8: aload 6
      // 0ba: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 0bd: iload 2
      // 0be: ifeq 0d7
      // 0c1: iflt 0dc
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: aload 6
      // 0cd: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d6: athrow
      // 0d7: iload 4
      // 0d9: if_icmplt 0f1
      // 0dc: new java/lang/IllegalArgumentException
      // 0df: dup
      // 0e0: sipush -1480
      // 0e3: sipush -4069
      // 0e6: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 0e9: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ec: athrow
      // 0ed: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: iload 2
      // 0f2: ifne 087
      // 0f5: aload 0
      // 0f6: new java/util/ArrayList
      // 0f9: dup
      // 0fa: aload 1
      // 0fb: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0fe: invokestatic java/util/Collections.unmodifiableList (Ljava/util/List;)Ljava/util/List;
      // 101: ldc2_w 126458255422249291
      // 104: astore 14
      // 106: astore 13
      // 108: ldc2_w 126458255422249291
      // 10b: aload 13
      // 10d: aload 14
      // 10f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 112: iload 2
      // 113: ifne 132
      // 116: aload 0
      // 117: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 11a: ldc2_w 126458255422249291
      // 11d: astore 16
      // 11f: astore 15
      // 121: ldc2_w 126458255422249291
      // 124: aload 15
      // 126: aload 16
      // 128: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 131: athrow
      // 132: aload 0
      // 133: iload 2
      // 134: ifeq 163
      // 137: ldc2_w 126458255422249291
      // 13a: astore 17
      // 13c: ldc2_w 126458255422249291
      // 13f: aload 17
      // 141: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 144: checkcast java/util/List
      // 147: aload 3
      // 148: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 14d: ifne 1cd
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 156: athrow
      // 157: aload 0
      // 158: invokevirtual com/finalshell/core/DM3.fireSortOrderChanged ()V
      // 15b: aload 0
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 162: athrow
      // 163: iload 2
      // 164: ifeq 1b1
      // 167: ldc2_w 278246634133162629
      // 16a: astore 19
      // 16c: ldc2_w 278246634133162629
      // 16f: aload 19
      // 171: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 174: checkcast [Lcom/finalshell/core/OY;
      // 177: ifnonnull 1a9
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 180: athrow
      // 181: aload 0
      // 182: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 185: ldc2_w 225648540112251754
      // 188: astore 22
      // 18a: astore 21
      // 18c: ldc2_w 225648540112251754
      // 18f: aload 21
      // 191: aload 22
      // 193: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 196: pop
      // 197: goto 19e
      // 19a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: iload 2
      // 19f: ifne 1cd
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b4: ldc2_w 252925903358213325
      // 1b7: astore 24
      // 1b9: astore 23
      // 1bb: ldc2_w 252925903358213325
      // 1be: aload 23
      // 1c0: aload 24
      // 1c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c5: pop
      // 1c6: goto 1cd
      // 1c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: return
   }

   @Override
   public List getSortKeys() {
      Object var1 = 126458255422249291L;
      return (List)Ref.g(126458255422249291L, var1);
   }

   public void j(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 2
      // 04: iload 2
      // 05: ifeq 36
      // 08: iload 1
      // 09: bipush 1
      // 0a: if_icmpge 29
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: new java/lang/IllegalArgumentException
      // 17: dup
      // 18: sipush -1478
      // 1b: sipush -1138
      // 1e: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 21: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 24: athrow
      // 25: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: aload 0
      // 2a: iload 1
      // 2b: ldc2_w 377572770107970079
      // 2e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 31: dup_x2
      // 32: pop
      // 33: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 36: return
   }

   public int X$int() {
      return Registry.lookupField(377572770107970079L).getInt(this);
   }

   public void m(boolean var1) {
      Registry.lookupField(520561350145766518L).setBoolean(this, var1);
   }

   public boolean Y() {
      return Registry.lookupField(520561350145766518L).getBoolean(this);
   }

   public void o(RowFilter var1) {
      long var3 = 538026900511520240L;
      Ref.s(538026900511520240L, var1, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 225648540112251754L;
      Object[] var4 = var10002;
      Ref.h(225648540112251754L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public RowFilter K() {
      Object var1 = 538026900511520240L;
      return (RowFilter)Ref.g(538026900511520240L, var1);
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
      // 000: invokestatic com/finalshell/core/Uo2.i ()Z
      // 003: aload 0
      // 004: iload 1
      // 005: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 008: ldc2_w 311908307058196049
      // 00b: astore 7
      // 00d: astore 6
      // 00f: ldc2_w 311908307058196049
      // 012: aload 6
      // 014: aload 7
      // 016: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 019: pop
      // 01a: goto 021
      // 01d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 020: athrow
      // 021: istore 2
      // 022: aload 0
      // 023: iload 1
      // 024: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 027: ldc2_w 364275102705086816
      // 02a: astore 9
      // 02c: astore 8
      // 02e: ldc2_w 364275102705086816
      // 031: aload 8
      // 033: aload 9
      // 035: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 038: checkcast java/lang/Boolean
      // 03b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03e: goto 045
      // 041: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 044: athrow
      // 045: ifeq 1ce
      // 048: new java/util/ArrayList
      // 04b: dup
      // 04c: aload 0
      // 04d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 050: ldc2_w 467503709079638034
      // 053: astore 11
      // 055: astore 10
      // 057: ldc2_w 467503709079638034
      // 05a: aload 10
      // 05c: aload 11
      // 05e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 061: checkcast java/util/List
      // 064: goto 06b
      // 067: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 06e: astore 3
      // 06f: aload 3
      // 070: invokeinterface java/util/List.size ()I 1
      // 075: bipush 1
      // 076: isub
      // 077: istore 5
      // 079: iload 5
      // 07b: iflt 0b4
      // 07e: aload 3
      // 07f: iload 5
      // 081: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 086: checkcast javax/swing/RowSorter$SortKey
      // 089: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 08c: iload 1
      // 08d: iload 2
      // 08e: ifne 0c2
      // 091: if_icmpne 0a6
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09a: athrow
      // 09b: iload 2
      // 09c: ifeq 0b4
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: iinc 5 -1
      // 0a9: iload 2
      // 0aa: ifeq 079
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: iload 5
      // 0b6: iload 2
      // 0b7: ifne 0e8
      // 0ba: bipush -1
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c1: athrow
      // 0c2: if_icmpne 0df
      // 0c5: new javax/swing/RowSorter$SortKey
      // 0c8: dup
      // 0c9: iload 1
      // 0ca: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0cd: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 0d0: astore 4
      // 0d2: aload 3
      // 0d3: bipush 0
      // 0d4: aload 4
      // 0d6: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 0db: iload 2
      // 0dc: ifeq 149
      // 0df: iload 5
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e7: athrow
      // 0e8: ifne 127
      // 0eb: aload 3
      // 0ec: bipush 0
      // 0ed: aload 0
      // 0ee: aload 3
      // 0ef: bipush 0
      // 0f0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f5: checkcast javax/swing/RowSorter$SortKey
      // 0f8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fb: ldc2_w 231492029719228538
      // 0fe: astore 13
      // 100: astore 12
      // 102: ldc2_w 231492029719228538
      // 105: aload 12
      // 107: aload 13
      // 109: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10c: checkcast javax/swing/RowSorter$SortKey
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 11b: pop
      // 11c: iload 2
      // 11d: ifeq 149
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 126: athrow
      // 127: aload 3
      // 128: iload 5
      // 12a: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 12f: pop
      // 130: aload 3
      // 131: bipush 0
      // 132: new javax/swing/RowSorter$SortKey
      // 135: dup
      // 136: iload 1
      // 137: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 13a: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 13d: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 148: athrow
      // 149: aload 3
      // 14a: iload 2
      // 14b: ifne 1af
      // 14e: invokeinterface java/util/List.size ()I 1
      // 153: aload 0
      // 154: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 157: ldc2_w 213959212325723240
      // 15a: astore 15
      // 15c: astore 14
      // 15e: ldc2_w 213959212325723240
      // 161: aload 14
      // 163: aload 15
      // 165: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 168: checkcast java/lang/Integer
      // 16b: invokevirtual java/lang/Integer.intValue ()I
      // 16e: goto 175
      // 171: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 174: athrow
      // 175: if_icmple 1b0
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17e: athrow
      // 17f: aload 3
      // 180: bipush 0
      // 181: aload 0
      // 182: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 185: ldc2_w 213959212325723240
      // 188: astore 17
      // 18a: astore 16
      // 18c: ldc2_w 213959212325723240
      // 18f: aload 16
      // 191: aload 17
      // 193: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 196: checkcast java/lang/Integer
      // 199: invokevirtual java/lang/Integer.intValue ()I
      // 19c: goto 1a3
      // 19f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ae: athrow
      // 1af: astore 3
      // 1b0: aload 0
      // 1b1: aload 3
      // 1b2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b5: ldc2_w 313310151501470468
      // 1b8: astore 19
      // 1ba: astore 18
      // 1bc: ldc2_w 313310151501470468
      // 1bf: aload 18
      // 1c1: aload 19
      // 1c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c6: pop
      // 1c7: goto 1ce
      // 1ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: return
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
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 3a
      // 09: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 0c: getstatic javax/swing/SortOrder.ASCENDING Ljavax/swing/SortOrder;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: new javax/swing/RowSorter$SortKey
      // 1c: dup
      // 1d: aload 1
      // 1e: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 21: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 24: invokespecial javax/swing/RowSorter$SortKey.<init> (ILjavax/swing/SortOrder;)V
      // 27: areturn
      // 28: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
   public int convertRowIndexToView(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: ldc2_w 487785452946359037
      // 08: astore 3
      // 09: ldc2_w 487785452946359037
      // 0c: aload 3
      // 0d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast [I
      // 13: iload 2
      // 14: ifeq ab
      // 17: ifnonnull 9a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: iload 1
      // 22: iload 2
      // 23: ifeq 38
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: iflt 83
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: iload 1
      // 38: iload 2
      // 39: ifeq 99
      // 3c: aload 0
      // 3d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 40: ldc2_w 566043907753096060
      // 43: astore 6
      // 45: astore 5
      // 47: ldc2_w 566043907753096060
      // 4a: aload 5
      // 4c: aload 6
      // 4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 51: goto 58
      // 54: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 57: athrow
      // 58: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5b: ldc2_w 224663528840055939
      // 5e: astore 8
      // 60: astore 7
      // 62: ldc2_w 224663528840055939
      // 65: aload 7
      // 67: aload 8
      // 69: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6c: checkcast java/lang/Integer
      // 6f: invokevirtual java/lang/Integer.intValue ()I
      // 72: goto 79
      // 75: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 78: athrow
      // 79: if_icmplt 98
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82: athrow
      // 83: new java/lang/IndexOutOfBoundsException
      // 86: dup
      // 87: sipush -1473
      // 8a: sipush 5550
      // 8d: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 90: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 93: athrow
      // 94: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 97: athrow
      // 98: iload 1
      // 99: ireturn
      // 9a: aload 0
      // 9b: ldc2_w 487785452946359037
      // 9e: astore 9
      // a0: ldc2_w 487785452946359037
      // a3: aload 9
      // a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a8: checkcast [I
      // ab: iload 1
      // ac: iaload
      // ad: ireturn
   }

   @Override
   public int convertRowIndexToModel(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: ldc2_w 278246634133162629
      // 08: astore 3
      // 09: ldc2_w 278246634133162629
      // 0c: aload 3
      // 0d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast [Lcom/finalshell/core/OY;
      // 13: iload 2
      // 14: ifeq ab
      // 17: ifnonnull 9a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: iload 1
      // 22: iload 2
      // 23: ifeq 38
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: iflt 83
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: iload 1
      // 38: iload 2
      // 39: ifeq 99
      // 3c: aload 0
      // 3d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 40: ldc2_w 566043907753096060
      // 43: astore 6
      // 45: astore 5
      // 47: ldc2_w 566043907753096060
      // 4a: aload 5
      // 4c: aload 6
      // 4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 51: goto 58
      // 54: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 57: athrow
      // 58: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5b: ldc2_w 224663528840055939
      // 5e: astore 8
      // 60: astore 7
      // 62: ldc2_w 224663528840055939
      // 65: aload 7
      // 67: aload 8
      // 69: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6c: checkcast java/lang/Integer
      // 6f: invokevirtual java/lang/Integer.intValue ()I
      // 72: goto 79
      // 75: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 78: athrow
      // 79: if_icmplt 98
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82: athrow
      // 83: new java/lang/IndexOutOfBoundsException
      // 86: dup
      // 87: sipush -1474
      // 8a: sipush -16390
      // 8d: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 90: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 93: athrow
      // 94: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 97: athrow
      // 98: iload 1
      // 99: ireturn
      // 9a: aload 0
      // 9b: ldc2_w 278246634133162629
      // 9e: astore 9
      // a0: ldc2_w 278246634133162629
      // a3: aload 9
      // a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a8: checkcast [Lcom/finalshell/core/OY;
      // ab: iload 1
      // ac: aaload
      // ad: ldc2_w 198606278652726872
      // b0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // b3: swap
      // b4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // b7: ireturn
   }

   public boolean E() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: aload 0
      // 04: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07: ldc2_w 467503709079638034
      // 0a: astore 5
      // 0c: astore 4
      // 0e: ldc2_w 467503709079638034
      // 11: aload 4
      // 13: aload 5
      // 15: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18: checkcast java/util/List
      // 1b: goto 22
      // 1e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21: athrow
      // 22: astore 2
      // 23: aload 2
      // 24: invokeinterface java/util/List.size ()I 1
      // 29: istore 3
      // 2a: istore 1
      // 2b: iload 3
      // 2c: iload 1
      // 2d: ifeq 5c
      // 30: ifeq 54
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 2
      // 3b: bipush 0
      // 3c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 41: checkcast javax/swing/RowSorter$SortKey
      // 44: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 47: getstatic javax/swing/SortOrder.UNSORTED Ljavax/swing/SortOrder;
      // 4a: if_acmpne 5f
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   public void O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.k ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: ldc2_w 278246634133162629
      // 008: astore 5
      // 00a: ldc2_w 278246634133162629
      // 00d: aload 5
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast [Lcom/finalshell/core/OY;
      // 015: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 018: ldc2_w 415726833630999005
      // 01b: astore 8
      // 01d: astore 7
      // 01f: ldc2_w 415726833630999005
      // 022: aload 7
      // 024: aload 8
      // 026: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 029: checkcast [I
      // 02c: goto 033
      // 02f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 032: athrow
      // 033: astore 2
      // 034: istore 1
      // 035: aload 0
      // 036: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 039: ldc2_w 227187650800621307
      // 03c: astore 10
      // 03e: astore 9
      // 040: ldc2_w 227187650800621307
      // 043: aload 9
      // 045: aload 10
      // 047: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04a: pop
      // 04b: goto 052
      // 04e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 0
      // 053: aload 0
      // 054: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 057: ldc2_w 467503709079638034
      // 05a: astore 12
      // 05c: astore 11
      // 05e: ldc2_w 467503709079638034
      // 061: aload 11
      // 063: aload 12
      // 065: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 068: goto 06f
      // 06b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 072: ldc2_w 195033820469216983
      // 075: astore 14
      // 077: astore 13
      // 079: ldc2_w 195033820469216983
      // 07c: aload 13
      // 07e: aload 14
      // 080: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 083: pop
      // 084: goto 08b
      // 087: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 0
      // 08c: iload 1
      // 08d: ifeq 1d0
      // 090: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 093: ldc2_w 198985385364630173
      // 096: astore 16
      // 098: astore 15
      // 09a: ldc2_w 198985385364630173
      // 09d: aload 15
      // 09f: aload 16
      // 0a1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a4: checkcast java/lang/Boolean
      // 0a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0aa: goto 0b1
      // 0ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: ifeq 1b4
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: iload 1
      // 0bd: ifeq 10a
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ca: ldc2_w 634483773540315606
      // 0cd: astore 18
      // 0cf: astore 17
      // 0d1: ldc2_w 634483773540315606
      // 0d4: aload 17
      // 0d6: aload 18
      // 0d8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0db: checkcast javax/swing/RowFilter
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: ifnonnull 120
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: aconst_null
      // 0f1: ldc2_w 278246634133162629
      // 0f4: astore 20
      // 0f6: astore 19
      // 0f8: ldc2_w 278246634133162629
      // 0fb: aload 19
      // 0fd: aload 20
      // 0ff: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 102: aload 0
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 109: athrow
      // 10a: aconst_null
      // 10b: ldc2_w 487785452946359037
      // 10e: astore 22
      // 110: astore 21
      // 112: ldc2_w 487785452946359037
      // 115: aload 21
      // 117: aload 22
      // 119: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 11c: iload 1
      // 11d: ifne 1ed
      // 120: bipush 0
      // 121: istore 3
      // 122: bipush 0
      // 123: istore 4
      // 125: iload 4
      // 127: aload 0
      // 128: ldc2_w 487785452946359037
      // 12b: astore 23
      // 12d: ldc2_w 487785452946359037
      // 130: aload 23
      // 132: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 135: checkcast [I
      // 138: arraylength
      // 139: if_icmpge 1b0
      // 13c: aload 0
      // 13d: iload 1
      // 13e: ifeq 1ee
      // 141: ldc2_w 487785452946359037
      // 144: astore 25
      // 146: ldc2_w 487785452946359037
      // 149: aload 25
      // 14b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14e: checkcast [I
      // 151: iload 4
      // 153: iload 1
      // 154: ifeq 1a4
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15d: athrow
      // 15e: iaload
      // 15f: bipush -1
      // 160: if_icmpeq 1a9
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 169: athrow
      // 16a: aload 0
      // 16b: ldc2_w 278246634133162629
      // 16e: astore 27
      // 170: ldc2_w 278246634133162629
      // 173: aload 27
      // 175: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 178: checkcast [Lcom/finalshell/core/OY;
      // 17b: iload 3
      // 17c: aaload
      // 17d: iload 4
      // 17f: ldc2_w 198606278652726872
      // 182: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 185: dup_x2
      // 186: pop
      // 187: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 18a: aload 0
      // 18b: ldc2_w 487785452946359037
      // 18e: astore 29
      // 190: ldc2_w 487785452946359037
      // 193: aload 29
      // 195: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 198: checkcast [I
      // 19b: iload 4
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a3: athrow
      // 1a4: iload 3
      // 1a5: iinc 3 1
      // 1a8: iastore
      // 1a9: iinc 4 1
      // 1ac: iload 1
      // 1ad: ifne 125
      // 1b0: iload 1
      // 1b1: ifne 1ed
      // 1b4: aload 0
      // 1b5: ldc2_w 278246634133162629
      // 1b8: astore 31
      // 1ba: ldc2_w 278246634133162629
      // 1bd: aload 31
      // 1bf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c2: checkcast [Lcom/finalshell/core/OY;
      // 1c5: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 1c8: aload 0
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cf: athrow
      // 1d0: bipush 0
      // 1d1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 1d4: ldc2_w 253439850071505974
      // 1d7: astore 34
      // 1d9: astore 33
      // 1db: ldc2_w 253439850071505974
      // 1de: aload 33
      // 1e0: aload 34
      // 1e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e5: pop
      // 1e6: goto 1ed
      // 1e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: aload 2
      // 1ef: invokevirtual com/finalshell/core/DM3.fireRowSorterChanged ([I)V
      // 1f2: return
   }

   public void X$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.i ()Z
      // 003: aload 0
      // 004: bipush 1
      // 005: ldc2_w 408209420778557084
      // 008: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00b: dup_x2
      // 00c: pop
      // 00d: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 010: aload 0
      // 011: aload 0
      // 012: ldc2_w 278246634133162629
      // 015: astore 3
      // 016: ldc2_w 278246634133162629
      // 019: aload 3
      // 01a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01d: checkcast [Lcom/finalshell/core/OY;
      // 020: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 023: ldc2_w 415726833630999005
      // 026: astore 6
      // 028: astore 5
      // 02a: ldc2_w 415726833630999005
      // 02d: aload 5
      // 02f: aload 6
      // 031: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 034: checkcast [I
      // 037: goto 03e
      // 03a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: astore 2
      // 03f: aload 0
      // 040: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 043: ldc2_w 227187650800621307
      // 046: astore 8
      // 048: astore 7
      // 04a: ldc2_w 227187650800621307
      // 04d: aload 7
      // 04f: aload 8
      // 051: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 054: pop
      // 055: goto 05c
      // 058: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: istore 1
      // 05d: aload 0
      // 05e: iload 1
      // 05f: ifne 195
      // 062: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 065: ldc2_w 198985385364630173
      // 068: astore 10
      // 06a: astore 9
      // 06c: ldc2_w 198985385364630173
      // 06f: aload 9
      // 071: aload 10
      // 073: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 076: checkcast java/lang/Boolean
      // 079: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07c: goto 083
      // 07f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 082: athrow
      // 083: ifeq 154
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: bipush 0
      // 08f: anewarray 174
      // 092: ldc2_w 354418855254718288
      // 095: astore 12
      // 097: astore 11
      // 099: ldc2_w 354418855254718288
      // 09c: aload 11
      // 09e: aload 12
      // 0a0: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a3: aload 0
      // 0a4: iload 1
      // 0a5: ifne 134
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ae: athrow
      // 0af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b2: ldc2_w 634483773540315606
      // 0b5: astore 14
      // 0b7: astore 13
      // 0b9: ldc2_w 634483773540315606
      // 0bc: aload 13
      // 0be: aload 14
      // 0c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c3: checkcast javax/swing/RowFilter
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: ifnonnull 133
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: iload 1
      // 0d9: ifne 118
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2: athrow
      // 0e3: ldc2_w 278246634133162629
      // 0e6: astore 15
      // 0e8: ldc2_w 278246634133162629
      // 0eb: aload 15
      // 0ed: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f0: checkcast [Lcom/finalshell/core/OY;
      // 0f3: ifnull 12e
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: aconst_null
      // 0ff: ldc2_w 278246634133162629
      // 102: astore 18
      // 104: astore 17
      // 106: ldc2_w 278246634133162629
      // 109: aload 17
      // 10b: aload 18
      // 10d: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 110: aload 0
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 117: athrow
      // 118: aconst_null
      // 119: ldc2_w 487785452946359037
      // 11c: astore 20
      // 11e: astore 19
      // 120: ldc2_w 487785452946359037
      // 123: aload 19
      // 125: aload 20
      // 127: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 12a: iload 1
      // 12b: ifeq 2d6
      // 12e: return
      // 12f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 132: athrow
      // 133: aload 0
      // 134: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 137: ldc2_w 258363129530362802
      // 13a: astore 22
      // 13c: astore 21
      // 13e: ldc2_w 258363129530362802
      // 141: aload 21
      // 143: aload 22
      // 145: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 148: pop
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: iload 1
      // 151: ifeq 2d6
      // 154: aload 0
      // 155: aload 0
      // 156: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 159: ldc2_w 467503709079638034
      // 15c: astore 24
      // 15e: astore 23
      // 160: ldc2_w 467503709079638034
      // 163: aload 23
      // 165: aload 24
      // 167: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16a: goto 171
      // 16d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 170: athrow
      // 171: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 174: ldc2_w 195033820469216983
      // 177: astore 26
      // 179: astore 25
      // 17b: ldc2_w 195033820469216983
      // 17e: aload 25
      // 180: aload 26
      // 182: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 185: pop
      // 186: goto 18d
      // 189: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: aload 0
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 194: athrow
      // 195: iload 1
      // 196: ifne 24b
      // 199: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19c: ldc2_w 634483773540315606
      // 19f: astore 28
      // 1a1: astore 27
      // 1a3: ldc2_w 634483773540315606
      // 1a6: aload 27
      // 1a8: aload 28
      // 1aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ad: checkcast javax/swing/RowFilter
      // 1b0: goto 1b7
      // 1b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: ifnull 1e9
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c5: ldc2_w 258363129530362802
      // 1c8: astore 30
      // 1ca: astore 29
      // 1cc: ldc2_w 258363129530362802
      // 1cf: aload 29
      // 1d1: aload 30
      // 1d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d6: pop
      // 1d7: goto 1de
      // 1da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: iload 1
      // 1df: ifeq 2a4
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: aload 0
      // 1eb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ee: ldc2_w 566043907753096060
      // 1f1: astore 32
      // 1f3: astore 31
      // 1f5: ldc2_w 566043907753096060
      // 1f8: aload 31
      // 1fa: aload 32
      // 1fc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ff: goto 206
      // 202: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 205: athrow
      // 206: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 209: ldc2_w 224663528840055939
      // 20c: astore 34
      // 20e: astore 33
      // 210: ldc2_w 224663528840055939
      // 213: aload 33
      // 215: aload 34
      // 217: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 21a: checkcast java/lang/Integer
      // 21d: invokevirtual java/lang/Integer.intValue ()I
      // 220: goto 227
      // 223: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 226: athrow
      // 227: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 22a: ldc2_w 379372218773986585
      // 22d: astore 36
      // 22f: astore 35
      // 231: ldc2_w 379372218773986585
      // 234: aload 35
      // 236: aload 36
      // 238: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23b: pop
      // 23c: goto 243
      // 23f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 242: athrow
      // 243: aload 0
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24a: athrow
      // 24b: aload 0
      // 24c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 24f: ldc2_w 566043907753096060
      // 252: astore 38
      // 254: astore 37
      // 256: ldc2_w 566043907753096060
      // 259: aload 37
      // 25b: aload 38
      // 25d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 260: goto 267
      // 263: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 266: athrow
      // 267: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26a: ldc2_w 224663528840055939
      // 26d: astore 40
      // 26f: astore 39
      // 271: ldc2_w 224663528840055939
      // 274: aload 39
      // 276: aload 40
      // 278: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27b: checkcast java/lang/Integer
      // 27e: invokevirtual java/lang/Integer.intValue ()I
      // 281: goto 288
      // 284: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 287: athrow
      // 288: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 28b: ldc2_w 615719306618141309
      // 28e: astore 42
      // 290: astore 41
      // 292: ldc2_w 615719306618141309
      // 295: aload 41
      // 297: aload 42
      // 299: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29c: pop
      // 29d: goto 2a4
      // 2a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: ldc2_w 278246634133162629
      // 2a8: astore 43
      // 2aa: ldc2_w 278246634133162629
      // 2ad: aload 43
      // 2af: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2b2: checkcast [Lcom/finalshell/core/OY;
      // 2b5: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 2b8: aload 0
      // 2b9: bipush 0
      // 2ba: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 2bd: ldc2_w 253439850071505974
      // 2c0: astore 46
      // 2c2: astore 45
      // 2c4: ldc2_w 253439850071505974
      // 2c7: aload 45
      // 2c9: aload 46
      // 2cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ce: pop
      // 2cf: goto 2d6
      // 2d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d5: athrow
      // 2d6: aload 0
      // 2d7: aload 2
      // 2d8: invokevirtual com/finalshell/core/DM3.fireRowSorterChanged ([I)V
      // 2db: return
   }

   public void f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: aload 0
      // 04: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07: ldc2_w 566043907753096060
      // 0a: astore 4
      // 0c: astore 3
      // 0d: ldc2_w 566043907753096060
      // 10: aload 3
      // 11: aload 4
      // 13: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16: goto 1d
      // 19: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 20: ldc2_w 401679078758232861
      // 23: astore 6
      // 25: astore 5
      // 27: ldc2_w 401679078758232861
      // 2a: aload 5
      // 2c: aload 6
      // 2e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 31: checkcast java/lang/Integer
      // 34: invokevirtual java/lang/Integer.intValue ()I
      // 37: goto 3e
      // 3a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: istore 2
      // 3f: istore 1
      // 40: aload 0
      // 41: iload 1
      // 42: ifeq 8f
      // 45: ldc2_w 270779122022644518
      // 48: astore 7
      // 4a: ldc2_w 270779122022644518
      // 4d: aload 7
      // 4f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 52: checkcast [Z
      // 55: ifnull 87
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: aload 0
      // 60: iload 1
      // 61: ifeq 8f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: ldc2_w 270779122022644518
      // 6e: astore 9
      // 70: ldc2_w 270779122022644518
      // 73: aload 9
      // 75: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 78: checkcast [Z
      // 7b: arraylength
      // 7c: iload 2
      // 7d: if_icmpeq a3
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8e: athrow
      // 8f: iload 2
      // 90: newarray 4
      // 92: ldc2_w 270779122022644518
      // 95: astore 12
      // 97: astore 11
      // 99: ldc2_w 270779122022644518
      // 9c: aload 11
      // 9e: aload 12
      // a0: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // a3: iinc 2 -1
      // a6: iload 2
      // a7: iflt e7
      // aa: aload 0
      // ab: ldc2_w 270779122022644518
      // ae: astore 13
      // b0: ldc2_w 270779122022644518
      // b3: aload 13
      // b5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // b8: checkcast [Z
      // bb: iload 2
      // bc: aload 0
      // bd: iload 2
      // be: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // c1: ldc2_w 497985265472078333
      // c4: astore 16
      // c6: astore 15
      // c8: ldc2_w 497985265472078333
      // cb: aload 15
      // cd: aload 16
      // cf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // d2: checkcast java/lang/Boolean
      // d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // d8: goto df
      // db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // de: athrow
      // df: bastore
      // e0: iinc 2 -1
      // e3: iload 1
      // e4: ifne a6
      // e7: return
   }

   public void V() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.k ()Z
      // 003: aload 0
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 566043907753096060
      // 00a: astore 7
      // 00c: astore 6
      // 00e: ldc2_w 566043907753096060
      // 011: aload 6
      // 013: aload 7
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: goto 01f
      // 01b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 022: ldc2_w 224663528840055939
      // 025: astore 9
      // 027: astore 8
      // 029: ldc2_w 224663528840055939
      // 02c: aload 8
      // 02e: aload 9
      // 030: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 033: checkcast java/lang/Integer
      // 036: invokevirtual java/lang/Integer.intValue ()I
      // 039: goto 040
      // 03c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03f: athrow
      // 040: istore 2
      // 041: istore 1
      // 042: bipush 0
      // 043: istore 5
      // 045: aload 0
      // 046: iload 2
      // 047: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 04a: ldc2_w 379372218773986585
      // 04d: astore 11
      // 04f: astore 10
      // 051: ldc2_w 379372218773986585
      // 054: aload 10
      // 056: aload 11
      // 058: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05b: pop
      // 05c: goto 063
      // 05f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 062: athrow
      // 063: bipush 0
      // 064: istore 3
      // 065: iload 3
      // 066: iload 2
      // 067: if_icmpge 0ed
      // 06a: aload 0
      // 06b: iload 1
      // 06c: ifeq 0d0
      // 06f: iload 3
      // 070: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 073: ldc2_w 391159582674593191
      // 076: astore 13
      // 078: astore 12
      // 07a: ldc2_w 391159582674593191
      // 07d: aload 12
      // 07f: aload 13
      // 081: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 084: checkcast java/lang/Boolean
      // 087: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08a: goto 091
      // 08d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090: athrow
      // 091: iload 1
      // 092: ifeq 111
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09b: athrow
      // 09c: ifeq 0c8
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: ldc2_w 487785452946359037
      // 0aa: astore 14
      // 0ac: ldc2_w 487785452946359037
      // 0af: aload 14
      // 0b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b4: checkcast [I
      // 0b7: iload 3
      // 0b8: iload 3
      // 0b9: iload 5
      // 0bb: isub
      // 0bc: iastore
      // 0bd: iload 1
      // 0be: ifne 0e6
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cf: athrow
      // 0d0: ldc2_w 487785452946359037
      // 0d3: astore 16
      // 0d5: ldc2_w 487785452946359037
      // 0d8: aload 16
      // 0da: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0dd: checkcast [I
      // 0e0: iload 3
      // 0e1: bipush -1
      // 0e2: iastore
      // 0e3: iinc 5 1
      // 0e6: iinc 3 1
      // 0e9: iload 1
      // 0ea: ifne 065
      // 0ed: aload 0
      // 0ee: iload 2
      // 0ef: iload 5
      // 0f1: isub
      // 0f2: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0f5: ldc2_w 615719306618141309
      // 0f8: astore 19
      // 0fa: astore 18
      // 0fc: ldc2_w 615719306618141309
      // 0ff: aload 18
      // 101: aload 19
      // 103: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 106: pop
      // 107: goto 10e
      // 10a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: bipush 0
      // 10f: istore 3
      // 110: bipush 0
      // 111: istore 4
      // 113: iload 3
      // 114: iload 2
      // 115: if_icmpge 16b
      // 118: aload 0
      // 119: iload 1
      // 11a: ifeq 142
      // 11d: ldc2_w 487785452946359037
      // 120: astore 20
      // 122: ldc2_w 487785452946359037
      // 125: aload 20
      // 127: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast [I
      // 12d: iload 3
      // 12e: iaload
      // 12f: bipush -1
      // 130: if_icmpeq 164
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 139: athrow
      // 13a: aload 0
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 141: athrow
      // 142: ldc2_w 278246634133162629
      // 145: astore 22
      // 147: ldc2_w 278246634133162629
      // 14a: aload 22
      // 14c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14f: checkcast [Lcom/finalshell/core/OY;
      // 152: iload 4
      // 154: iinc 4 1
      // 157: aaload
      // 158: iload 3
      // 159: ldc2_w 198606278652726872
      // 15c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 15f: dup_x2
      // 160: pop
      // 161: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 164: iinc 3 1
      // 167: iload 1
      // 168: ifne 113
      // 16b: return
   }

   public void m(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 51
      // 09: ldc2_w 487785452946359037
      // 0c: astore 3
      // 0d: ldc2_w 487785452946359037
      // 10: aload 3
      // 11: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14: checkcast [I
      // 17: ifnull 49
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: iload 2
      // 23: ifne 51
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: ldc2_w 487785452946359037
      // 30: astore 5
      // 32: ldc2_w 487785452946359037
      // 35: aload 5
      // 37: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3a: checkcast [I
      // 3d: arraylength
      // 3e: iload 1
      // 3f: if_icmpeq 65
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: aload 0
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: iload 1
      // 52: newarray 10
      // 54: ldc2_w 487785452946359037
      // 57: astore 8
      // 59: astore 7
      // 5b: ldc2_w 487785452946359037
      // 5e: aload 7
      // 60: aload 8
      // 62: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 65: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void L(int var1) {
      long var14;
      boolean var10000 = Uo2.i();
      int var3 = 0;
      boolean var2 = var10000;

      int var10003;
      label90: {
         label79: {
            label78: {
               label85: {
                  try {
                     if (var2) {
                        break label78;
                     }

                     Object var5 = 278246634133162629L;
                     if ((OY[])Ref.g(278246634133162629L, var5) == null) {
                        break label85;
                     }
                  } catch (IllegalArgumentException var28) {
                     throw a(var28);
                  }

                  Object var7 = 278246634133162629L;
                  var3 = Math.min((int)this, ((OY[])Ref.g(278246634133162629L, var7)).length);

                  try {
                     Object var9 = 278246634133162629L;
                     var10003 = ((OY[])Ref.g(278246634133162629L, var9)).length;
                     if (var2) {
                        break label90;
                     }

                     if (var10003 == var1) {
                        break label79;
                     }
                  } catch (IllegalArgumentException var25) {
                     throw a(var25);
                  }

                  Object var11 = 278246634133162629L;
                  OY[] var4 = (OY[])Ref.g(278246634133162629L, var11);

                  try {
                     OY[] var10005 = new OY[var1];
                     var14 = 278246634133162629L;
                     OY[] var13 = var10005;
                     Ref.s(278246634133162629L, var13, var14);
                     Object var15 = 278246634133162629L;
                     System.arraycopy(false, (int)this, (OY[])Ref.g(278246634133162629L, var15), 0, var3);
                     if (!var2) {
                        break label79;
                     }
                  } catch (IllegalArgumentException var27) {
                     boolean var10001 = false;
                     throw a(var27);
                  }
               }

               try {
                  ;
               } catch (IllegalArgumentException var26) {
                  boolean var31 = false;
                  throw a(var26);
               }
            }

            OY[] var32 = new OY[var1];
            long var18 = 278246634133162629L;
            OY[] var17 = var32;
            Ref.s(278246634133162629L, var17, var18);
         }

         var10003 = 0;
      }

      int var29 = var10003;

      while (true) {
         if (var29 < var3) {
            try {
               Object var19 = 278246634133162629L;
               Registry.lookupField(198606278652726872L).setInt(((OY[])Ref.g(278246634133162629L, var19))[var29], var29);
               var29++;
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            } catch (IllegalArgumentException var24) {
               throw a(var24);
            }
         }

         var29 = var3;
         break;
      }

      try {
         while (var29 < var1) {
            Object var21 = 278246634133162629L;
            ((OY[])Ref.g(278246634133162629L, var21))[var29] = new OY(this, var29);
            var29++;
            if (var2) {
               break;
            }
         }
      } catch (IllegalArgumentException var23) {
         throw a(var23);
      }
   }

   public void r(List var1) {
      SortKey[] var11;
      int var3 = var1.size();
      Comparator[] var10001 = new Comparator[var3];
      long var6 = 487108138525437099L;
      Comparator[] var5 = var10001;
      Ref.s(487108138525437099L, var5, var6);
      boolean var15 = Uo2.i();
      int var4 = 0;
      boolean var2 = var15;

      while (true) {
         if (var4 < var3) {
            try {
               Object var7 = 487108138525437099L;
               Comparator[] var10002 = (Comparator[])Ref.g(487108138525437099L, var7);
               Comparator var10005 = (Comparator)(Registry.packArgs(((SortKey)var1.get(var4)).getColumn()));
               long var10 = 201792723603717432L;
               Object var9 = var10005;
               var10005 = Ref.h(201792723603717432L, var9, var10);

               try {
                  var10005 = (Comparator)var10005;
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               ((Object[])var4)[this] = (int)var10005;
               var4++;
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            } catch (IllegalArgumentException var14) {
               throw a(var14);
            }
         }

         SortKey[] var16 = var1.toArray(new SortKey[var3]);
         long var12 = 354418855254718288L;
         var11 = var16;
         Ref.s(354418855254718288L, var11, var12);
         break;
      }
   }

   public boolean f(int var1) {
      try {
         Comparator var10001 = (Comparator)(Registry.packArgs(var1));
         long var3 = 475220176856492685L;
         Object var2 = var10001;
         var10001 = Ref.h(475220176856492685L, var2, var3);

         try {
            var10001 = (Comparator)var10001;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var10001 == null) {
            return true;
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      return false;
   }

   public void K(boolean var1) {
      boolean var2 = Uo2.k();

      DM3 var3;
      label51: {
         DM3 var10000;
         label50: {
            label55: {
               try {
                  var10000 = (DM3)var1;
                  if (!var2) {
                     break label50;
                  }

                  if (var1 == 0) {
                     break label55;
                  }
               } catch (IllegalArgumentException var16) {
                  throw a(var16);
               }

               Object var4 = 487785452946359037L;
               var3 = ((int[])Ref.g(487785452946359037L, var4)).length - 1;

               while (var3 >= 0) {
                  try {
                     Object var6 = 487785452946359037L;
                     ((int[])Ref.g(487785452946359037L, var6))[var3] = -1;
                     var3--;
                     if (!var2) {
                        break label51;
                     }

                     if (!var2) {
                        break;
                     }
                  } catch (IllegalArgumentException var15) {
                     throw a(var15);
                  }
               }
            }

            var10000 = this;
            Object var8 = 278246634133162629L;
            int var10001 = ((OY[])Ref.g(278246634133162629L, var8)).length - 1;
         }

         var3 = var10000;
      }

      try {
         while (var3 >= 0) {
            Object var10 = 487785452946359037L;
            int[] var10003 = (int[])Ref.g(487785452946359037L, var10);
            Object var12 = 278246634133162629L;
            ((Object[])this)[Registry.lookupField(198606278652726872L).getInt(((OY[])Ref.g(278246634133162629L, var12))[var3])] = var3--;
            if (!var2) {
               break;
            }
         }
      } catch (IllegalArgumentException var14) {
         throw a(var14);
      }
   }

   public int[] e(OY[] var1) {
      int[] var7;
      boolean var2 = Uo2.k();

      OY[] var10000;
      label39: {
         try {
            var10000 = var1;
            if (!var2) {
               break label39;
            }

            if (var1 == null) {
               return new int[0];
            }
         } catch (IllegalArgumentException var6) {
            throw a(var6);
         }

         var10000 = var1;
      }

      int[] var3 = new int[var10000.length];
      int var4 = var1.length - 1;

      while (true) {
         if (var4 >= 0) {
            try {
               var7 = var3;
               if (!var2) {
                  break;
               }

               var3[var4] = Registry.lookupField(198606278652726872L).getInt(var1[var4]);
               var4--;
               if (var2) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public void X(int param1, Comparator param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 08: ldc2_w 311908307058196049
      // 0b: astore 5
      // 0d: astore 4
      // 0f: ldc2_w 311908307058196049
      // 12: aload 4
      // 14: aload 5
      // 16: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: pop
      // 1a: goto 21
      // 1d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20: athrow
      // 21: istore 3
      // 22: aload 0
      // 23: ldc2_w 268358999975777210
      // 26: astore 6
      // 28: ldc2_w 268358999975777210
      // 2b: aload 6
      // 2d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 30: checkcast [Ljava/util/Comparator;
      // 33: iload 3
      // 34: ifne ab
      // 37: ifnonnull 9a
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 0
      // 43: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 46: ldc2_w 566043907753096060
      // 49: astore 9
      // 4b: astore 8
      // 4d: ldc2_w 566043907753096060
      // 50: aload 8
      // 52: aload 9
      // 54: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 57: goto 5e
      // 5a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 61: ldc2_w 401679078758232861
      // 64: astore 11
      // 66: astore 10
      // 68: ldc2_w 401679078758232861
      // 6b: aload 10
      // 6d: aload 11
      // 6f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 72: checkcast java/lang/Integer
      // 75: invokevirtual java/lang/Integer.intValue ()I
      // 78: goto 7f
      // 7b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: anewarray 360
      // 82: ldc2_w 268358999975777210
      // 85: astore 13
      // 87: astore 12
      // 89: ldc2_w 268358999975777210
      // 8c: aload 12
      // 8e: aload 13
      // 90: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 99: athrow
      // 9a: aload 0
      // 9b: ldc2_w 268358999975777210
      // 9e: astore 14
      // a0: ldc2_w 268358999975777210
      // a3: aload 14
      // a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a8: checkcast [Ljava/util/Comparator;
      // ab: iload 1
      // ac: aload 2
      // ad: aastore
      // ae: return
   }

   public Comparator Z(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: aload 0
      // 04: iload 1
      // 05: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 08: ldc2_w 311908307058196049
      // 0b: astore 4
      // 0d: astore 3
      // 0e: ldc2_w 311908307058196049
      // 11: aload 3
      // 12: aload 4
      // 14: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: pop
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: istore 2
      // 20: aload 0
      // 21: ldc2_w 268358999975777210
      // 24: astore 5
      // 26: ldc2_w 268358999975777210
      // 29: aload 5
      // 2b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2e: checkcast [Ljava/util/Comparator;
      // 31: iload 2
      // 32: ifeq 57
      // 35: ifnull 5a
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w 268358999975777210
      // 43: astore 7
      // 45: ldc2_w 268358999975777210
      // 48: aload 7
      // 4a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4d: checkcast [Ljava/util/Comparator;
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 56: athrow
      // 57: iload 1
      // 58: aaload
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
   }

   public Comparator G(int var1) {
      Uo2.k();
      Comparator var10002 = (Comparator)(Registry.packArgs(var1));
      long var5 = 475220176856492685L;
      Object var4 = var10002;
      var10002 = Ref.h(475220176856492685L, var4, var5);

      try {
         var10002 = (Comparator)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Comparator var3 = var10002;
      DM3 var2 = this;

      try {
         if (var2 == null) {
            return var3;
         }

         if (var3 == null) {
            return Collator.getInstance();
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }

      return var3;
   }

   public Entry p(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: ldc2_w 327020378590061592
      // 08: astore 3
      // 09: ldc2_w 327020378590061592
      // 0c: aload 3
      // 0d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast com/finalshell/core/Lj2
      // 13: iload 2
      // 14: ifne 6e
      // 17: ifnonnull 43
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: new com/finalshell/core/Lj2
      // 25: dup
      // 26: aload 0
      // 27: aconst_null
      // 28: invokespecial com/finalshell/core/Lj2.<init> (Lcom/finalshell/core/DM3;Lcom/finalshell/core/Ut4;)V
      // 2b: ldc2_w 327020378590061592
      // 2e: astore 6
      // 30: astore 5
      // 32: ldc2_w 327020378590061592
      // 35: aload 5
      // 37: aload 6
      // 39: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: ldc2_w 327020378590061592
      // 47: astore 7
      // 49: ldc2_w 327020378590061592
      // 4c: aload 7
      // 4e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 51: iload 1
      // 52: ldc2_w 238213257117654142
      // 55: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 58: dup_x2
      // 59: pop
      // 5a: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 5d: aload 0
      // 5e: ldc2_w 327020378590061592
      // 61: astore 9
      // 63: ldc2_w 327020378590061592
      // 66: aload 9
      // 68: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6b: checkcast com/finalshell/core/Lj2
      // 6e: areturn
   }

   @Override
   public int getViewRowCount() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.k ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 39
      // 09: ldc2_w 278246634133162629
      // 0c: astore 2
      // 0d: ldc2_w 278246634133162629
      // 10: aload 2
      // 11: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14: checkcast [Lcom/finalshell/core/OY;
      // 17: ifnull 38
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: ldc2_w 278246634133162629
      // 25: astore 4
      // 27: ldc2_w 278246634133162629
      // 2a: aload 4
      // 2c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f: checkcast [Lcom/finalshell/core/OY;
      // 32: arraylength
      // 33: ireturn
      // 34: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c: ldc2_w 566043907753096060
      // 3f: astore 7
      // 41: astore 6
      // 43: ldc2_w 566043907753096060
      // 46: aload 6
      // 48: aload 7
      // 4a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d: goto 54
      // 50: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53: athrow
      // 54: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 57: ldc2_w 224663528840055939
      // 5a: astore 9
      // 5c: astore 8
      // 5e: ldc2_w 224663528840055939
      // 61: aload 8
      // 63: aload 9
      // 65: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 68: checkcast java/lang/Integer
      // 6b: invokevirtual java/lang/Integer.intValue ()I
      // 6e: goto 75
      // 71: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 74: athrow
      // 75: ireturn
   }

   @Override
   public int getModelRowCount() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 566043907753096060L;
      Object[] var1 = var10001;
      Ref.h(566043907753096060L, var1, var2);
      Object var10002 = Registry.emptyArgs();
      long var4 = 224663528840055939L;
      Object var3 = var10002;
      var10002 = Ref.h(224663528840055939L, var3, var4);

      try {
         return (Integer)var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void F() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: ldc2_w 487785452946359037
      // 05: astore 3
      // 06: astore 2
      // 07: ldc2_w 487785452946359037
      // 0a: aload 2
      // 0b: aload 3
      // 0c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0f: aload 0
      // 10: aconst_null
      // 11: ldc2_w 278246634133162629
      // 14: astore 5
      // 16: astore 4
      // 18: ldc2_w 278246634133162629
      // 1b: aload 4
      // 1d: aload 5
      // 1f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 22: invokestatic com/finalshell/core/Uo2.k ()Z
      // 25: aload 0
      // 26: aconst_null
      // 27: ldc2_w 268358999975777210
      // 2a: astore 7
      // 2c: astore 6
      // 2e: ldc2_w 268358999975777210
      // 31: aload 6
      // 33: aload 7
      // 35: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 38: istore 1
      // 39: aload 0
      // 3a: aconst_null
      // 3b: ldc2_w 129299070682169446
      // 3e: astore 9
      // 40: astore 8
      // 42: ldc2_w 129299070682169446
      // 45: aload 8
      // 47: aload 9
      // 49: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 4c: aload 0
      // 4d: iload 1
      // 4e: ifeq ac
      // 51: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 54: ldc2_w 198985385364630173
      // 57: astore 11
      // 59: astore 10
      // 5b: ldc2_w 198985385364630173
      // 5e: aload 10
      // 60: aload 11
      // 62: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 65: checkcast java/lang/Boolean
      // 68: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6b: goto 72
      // 6e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71: athrow
      // 72: ifeq a4
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 80: ldc2_w 225648540112251754
      // 83: astore 13
      // 85: astore 12
      // 87: ldc2_w 225648540112251754
      // 8a: aload 12
      // 8c: aload 13
      // 8e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 91: pop
      // 92: goto 99
      // 95: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 98: athrow
      // 99: iload 1
      // 9a: ifne c9
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a3: athrow
      // a4: aload 0
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab: athrow
      // ac: aconst_null
      // ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // b0: ldc2_w 313310151501470468
      // b3: astore 15
      // b5: astore 14
      // b7: ldc2_w 313310151501470468
      // ba: aload 14
      // bc: aload 15
      // be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c1: pop
      // c2: goto c9
      // c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c8: athrow
      // c9: return
   }

   @Override
   public void modelStructureChanged() {
      Integer var11;
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 436889711121858348L;
      Object[] var1 = var10001;
      Ref.h(436889711121858348L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var4 = 566043907753096060L;
      Object[] var3 = var10003;
      var10003 = Ref.h(566043907753096060L, var3, var4);
      Object var10004 = Registry.emptyArgs();
      long var6 = 224663528840055939L;
      Object var5 = var10004;
      var10004 = Ref.h(224663528840055939L, var5, var6);

      try {
         var11 = (Integer)var10004;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Registry.lookupField(185211116913122441L).setInt(var10003, var11);
   }

   @Override
   public void allRowsChanged() {
      Integer var11;
      Object[] var10002 = Registry.emptyArgs();
      long var2 = 566043907753096060L;
      Object[] var1 = var10002;
      var10002 = Ref.h(566043907753096060L, var1, var2);
      Object var10003 = Registry.emptyArgs();
      long var4 = 224663528840055939L;
      Object var3 = var10003;
      var10003 = Ref.h(224663528840055939L, var3, var4);

      try {
         var11 = (Integer)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Registry.lookupField(185211116913122441L).setInt(var10002, var11);
      var10003 = Registry.emptyArgs();
      long var6 = 225648540112251754L;
      Object var5 = var10003;
      Ref.h(225648540112251754L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   @Override
   public void rowsInserted(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 06: ldc2_w 211551900283403671
      // 09: astore 6
      // 0b: astore 5
      // 0d: ldc2_w 211551900283403671
      // 10: aload 5
      // 12: aload 6
      // 14: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: pop
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: invokestatic com/finalshell/core/Uo2.i ()Z
      // 22: aload 0
      // 23: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26: ldc2_w 566043907753096060
      // 29: astore 8
      // 2b: astore 7
      // 2d: ldc2_w 566043907753096060
      // 30: aload 7
      // 32: aload 8
      // 34: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 37: goto 3e
      // 3a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 41: ldc2_w 224663528840055939
      // 44: astore 10
      // 46: astore 9
      // 48: ldc2_w 224663528840055939
      // 4b: aload 9
      // 4d: aload 10
      // 4f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 52: checkcast java/lang/Integer
      // 55: invokevirtual java/lang/Integer.intValue ()I
      // 58: goto 5f
      // 5b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: istore 4
      // 61: istore 3
      // 62: iload 2
      // 63: iload 3
      // 64: ifne c5
      // 67: iload 4
      // 69: if_icmplt 88
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 72: athrow
      // 73: new java/lang/IndexOutOfBoundsException
      // 76: dup
      // 77: sipush -1476
      // 7a: sipush 26946
      // 7d: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 80: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 83: athrow
      // 84: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 87: athrow
      // 88: aload 0
      // 89: iload 4
      // 8b: ldc2_w 185211116913122441
      // 8e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 91: dup_x2
      // 92: pop
      // 93: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 96: aload 0
      // 97: iload 1
      // 98: iload 2
      // 99: iload 3
      // 9a: ifne d2
      // 9d: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // a0: ldc2_w 625465436282425528
      // a3: astore 12
      // a5: astore 11
      // a7: ldc2_w 625465436282425528
      // aa: aload 11
      // ac: aload 12
      // ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b1: checkcast java/lang/Boolean
      // b4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // b7: goto be
      // ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bd: athrow
      // be: goto c5
      // c1: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c4: athrow
      // c5: ifeq ee
      // c8: aload 0
      // c9: iload 1
      // ca: iload 2
      // cb: goto d2
      // ce: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d1: athrow
      // d2: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // d5: ldc2_w 153143421279636778
      // d8: astore 14
      // da: astore 13
      // dc: ldc2_w 153143421279636778
      // df: aload 13
      // e1: aload 14
      // e3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // e6: pop
      // e7: goto ee
      // ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ed: athrow
      // ee: return
   }

   @Override
   public void rowsDeleted(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.k ()Z
      // 003: aload 0
      // 004: iload 1
      // 005: iload 2
      // 006: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 009: ldc2_w 211551900283403671
      // 00c: astore 5
      // 00e: astore 4
      // 010: ldc2_w 211551900283403671
      // 013: aload 4
      // 015: aload 5
      // 017: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01a: pop
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: istore 3
      // 023: iload 1
      // 024: aload 0
      // 025: ldc2_w 185211116913122441
      // 028: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02b: swap
      // 02c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 02f: iload 3
      // 030: ifeq 05b
      // 033: if_icmpge 05e
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: iload 2
      // 03e: iload 3
      // 03f: ifeq 0eb
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 048: athrow
      // 049: aload 0
      // 04a: ldc2_w 185211116913122441
      // 04d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 050: swap
      // 051: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05a: athrow
      // 05b: if_icmplt 073
      // 05e: new java/lang/IndexOutOfBoundsException
      // 061: dup
      // 062: sipush -1476
      // 065: sipush 26946
      // 068: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 06b: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 06e: athrow
      // 06f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 072: athrow
      // 073: aload 0
      // 074: aload 0
      // 075: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 078: ldc2_w 566043907753096060
      // 07b: astore 7
      // 07d: astore 6
      // 07f: ldc2_w 566043907753096060
      // 082: aload 6
      // 084: aload 7
      // 086: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 093: ldc2_w 224663528840055939
      // 096: astore 9
      // 098: astore 8
      // 09a: ldc2_w 224663528840055939
      // 09d: aload 8
      // 09f: aload 9
      // 0a1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a4: checkcast java/lang/Integer
      // 0a7: invokevirtual java/lang/Integer.intValue ()I
      // 0aa: goto 0b1
      // 0ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: ldc2_w 185211116913122441
      // 0b4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 0bc: aload 0
      // 0bd: iload 1
      // 0be: iload 2
      // 0bf: iload 3
      // 0c0: ifeq 0f8
      // 0c3: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0c6: ldc2_w 625465436282425528
      // 0c9: astore 11
      // 0cb: astore 10
      // 0cd: ldc2_w 625465436282425528
      // 0d0: aload 10
      // 0d2: aload 11
      // 0d4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d7: checkcast java/lang/Boolean
      // 0da: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0dd: goto 0e4
      // 0e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: ifeq 114
      // 0ee: aload 0
      // 0ef: iload 1
      // 0f0: iload 2
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f7: athrow
      // 0f8: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0fb: ldc2_w 534739234965080409
      // 0fe: astore 13
      // 100: astore 12
      // 102: ldc2_w 534739234965080409
      // 105: aload 12
      // 107: aload 13
      // 109: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10c: pop
      // 10d: goto 114
      // 110: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 113: athrow
      // 114: return
   }

   @Override
   public void rowsUpdated(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.i ()Z
      // 003: aload 0
      // 004: iload 1
      // 005: iload 2
      // 006: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 009: ldc2_w 211551900283403671
      // 00c: astore 5
      // 00e: astore 4
      // 010: ldc2_w 211551900283403671
      // 013: aload 4
      // 015: aload 5
      // 017: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01a: pop
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: istore 3
      // 023: iload 1
      // 024: aload 0
      // 025: ldc2_w 185211116913122441
      // 028: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02b: swap
      // 02c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 02f: iload 3
      // 030: ifne 05b
      // 033: if_icmpge 05e
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: iload 2
      // 03e: iload 3
      // 03f: ifne 0a0
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 048: athrow
      // 049: aload 0
      // 04a: ldc2_w 185211116913122441
      // 04d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 050: swap
      // 051: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05a: athrow
      // 05b: if_icmplt 073
      // 05e: new java/lang/IndexOutOfBoundsException
      // 061: dup
      // 062: sipush -1476
      // 065: sipush 26946
      // 068: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 06b: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 06e: athrow
      // 06f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 072: athrow
      // 073: aload 0
      // 074: iload 3
      // 075: ifne 10e
      // 078: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07b: ldc2_w 255192452957449527
      // 07e: astore 7
      // 080: astore 6
      // 082: ldc2_w 255192452957449527
      // 085: aload 6
      // 087: aload 7
      // 089: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08c: checkcast java/lang/Boolean
      // 08f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 092: goto 099
      // 095: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 098: athrow
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09f: athrow
      // 0a0: ifeq 106
      // 0a3: aload 0
      // 0a4: iload 1
      // 0a5: iload 2
      // 0a6: iload 3
      // 0a7: ifne 0e6
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b0: athrow
      // 0b1: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0b4: ldc2_w 625465436282425528
      // 0b7: astore 9
      // 0b9: astore 8
      // 0bb: ldc2_w 625465436282425528
      // 0be: aload 8
      // 0c0: aload 9
      // 0c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c5: checkcast java/lang/Boolean
      // 0c8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cb: goto 0d2
      // 0ce: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: ifeq 11a
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: iload 1
      // 0de: iload 2
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0e9: ldc2_w 196529538135726950
      // 0ec: astore 11
      // 0ee: astore 10
      // 0f0: ldc2_w 196529538135726950
      // 0f3: aload 10
      // 0f5: aload 11
      // 0f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fa: pop
      // 0fb: goto 102
      // 0fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 101: athrow
      // 102: iload 3
      // 103: ifeq 11a
      // 106: aload 0
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10d: athrow
      // 10e: bipush 0
      // 10f: ldc2_w 408209420778557084
      // 112: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 115: dup_x2
      // 116: pop
      // 117: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 11a: return
   }

   @Override
   public void rowsUpdated(int var1, int var2, int var3) {
      long var7;
      Object[] var10001 = Registry.packArgs(var3);
      long var5 = 311908307058196049L;
      Object[] var4 = var10001;
      Ref.h(311908307058196049L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(var1, var2);
      var7 = 152660171091846130L;
      Object[] var6 = var10002;
      Ref.h(152660171091846130L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void j$void(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifne 1c
      // 09: iload 2
      // 0a: if_icmpgt 48
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: iload 1
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: iload 3
      // 1d: ifne 2b
      // 20: iflt 48
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: iload 2
      // 2b: iload 3
      // 2c: ifne 3a
      // 2f: iflt 48
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: iload 1
      // 3a: aload 0
      // 3b: ldc2_w 185211116913122441
      // 3e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 41: swap
      // 42: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 45: if_icmple 5d
      // 48: new java/lang/IndexOutOfBoundsException
      // 4b: dup
      // 4c: sipush -1479
      // 4f: sipush -12560
      // 52: invokestatic com/finalshell/core/DM3.a (II)Ljava/lang/String;
      // 55: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 58: athrow
      // 59: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: return
   }

   public boolean g(int var1) {
      long var7;
      Uo2.i();
      RowFilter var10002 = (RowFilter)(Registry.emptyArgs());
      long var5 = 634483773540315606L;
      Object var4 = var10002;
      var10002 = Ref.h(634483773540315606L, var4, var5);

      try {
         var10002 = (RowFilter)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      RowFilter var3 = var10002;
      DM3 var2 = this;

      try {
         if (var2 == null && var3 == null) {
            return true;
         }
      } catch (IllegalArgumentException var10) {
         throw a(var10);
      }

      Entry var10003 = (Entry)(Registry.packArgs(var1));
      var7 = 287186724307268996L;
      Object var6 = var10003;
      var10003 = Ref.h(287186724307268996L, var6, var7);

      try {
         var10003 = (Entry)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      return this.include(var10003);
   }

   public int e(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.k ()Z
      // 003: bipush 0
      // 004: istore 9
      // 006: istore 3
      // 007: iload 9
      // 009: aload 0
      // 00a: ldc2_w 354418855254718288
      // 00d: astore 10
      // 00f: ldc2_w 354418855254718288
      // 012: aload 10
      // 014: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 017: checkcast [Ljavax/swing/RowSorter$SortKey;
      // 01a: arraylength
      // 01b: if_icmpge 219
      // 01e: aload 0
      // 01f: ldc2_w 354418855254718288
      // 022: astore 12
      // 024: ldc2_w 354418855254718288
      // 027: aload 12
      // 029: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02c: checkcast [Ljavax/swing/RowSorter$SortKey;
      // 02f: iload 9
      // 031: aaload
      // 032: invokevirtual javax/swing/RowSorter$SortKey.getColumn ()I
      // 035: iload 3
      // 036: ifeq 21c
      // 039: istore 4
      // 03b: aload 0
      // 03c: ldc2_w 354418855254718288
      // 03f: astore 14
      // 041: ldc2_w 354418855254718288
      // 044: aload 14
      // 046: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast [Ljavax/swing/RowSorter$SortKey;
      // 04c: iload 9
      // 04e: aaload
      // 04f: invokevirtual javax/swing/RowSorter$SortKey.getSortOrder ()Ljavax/swing/SortOrder;
      // 052: astore 5
      // 054: aload 5
      // 056: getstatic javax/swing/SortOrder.UNSORTED Ljavax/swing/SortOrder;
      // 059: if_acmpne 065
      // 05c: iload 1
      // 05d: iload 2
      // 05e: isub
      // 05f: istore 8
      // 061: iload 3
      // 062: ifne 1ff
      // 065: aload 0
      // 066: ldc2_w 270779122022644518
      // 069: astore 16
      // 06b: ldc2_w 270779122022644518
      // 06e: aload 16
      // 070: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073: checkcast [Z
      // 076: iload 3
      // 077: ifeq 154
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: iload 4
      // 083: baload
      // 084: ifeq 110
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 092: ldc2_w 566043907753096060
      // 095: astore 19
      // 097: astore 18
      // 099: ldc2_w 566043907753096060
      // 09c: aload 18
      // 09e: aload 19
      // 0a0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a3: goto 0aa
      // 0a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: iload 1
      // 0ab: iload 4
      // 0ad: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0b0: ldc2_w 607512343893312129
      // 0b3: astore 21
      // 0b5: astore 20
      // 0b7: ldc2_w 607512343893312129
      // 0ba: aload 20
      // 0bc: aload 21
      // 0be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c1: checkcast java/lang/String
      // 0c4: goto 0cb
      // 0c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: astore 6
      // 0cd: aload 0
      // 0ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d1: ldc2_w 566043907753096060
      // 0d4: astore 23
      // 0d6: astore 22
      // 0d8: ldc2_w 566043907753096060
      // 0db: aload 22
      // 0dd: aload 23
      // 0df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e2: goto 0e9
      // 0e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: iload 2
      // 0ea: iload 4
      // 0ec: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 0ef: ldc2_w 607512343893312129
      // 0f2: astore 25
      // 0f4: astore 24
      // 0f6: ldc2_w 607512343893312129
      // 0f9: aload 24
      // 0fb: aload 25
      // 0fd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 100: checkcast java/lang/String
      // 103: goto 10a
      // 106: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 109: athrow
      // 10a: astore 7
      // 10c: iload 3
      // 10d: ifne 195
      // 110: aload 0
      // 111: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 114: ldc2_w 566043907753096060
      // 117: astore 27
      // 119: astore 26
      // 11b: ldc2_w 566043907753096060
      // 11e: aload 26
      // 120: aload 27
      // 122: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 125: goto 12c
      // 128: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: iload 1
      // 12d: iload 4
      // 12f: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 132: ldc2_w 533716037937215783
      // 135: astore 29
      // 137: astore 28
      // 139: ldc2_w 533716037937215783
      // 13c: aload 28
      // 13e: aload 29
      // 140: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 143: checkcast java/lang/Object
      // 146: goto 14d
      // 149: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 153: athrow
      // 154: astore 6
      // 156: aload 0
      // 157: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15a: ldc2_w 566043907753096060
      // 15d: astore 31
      // 15f: astore 30
      // 161: ldc2_w 566043907753096060
      // 164: aload 30
      // 166: aload 31
      // 168: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16b: goto 172
      // 16e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 171: athrow
      // 172: iload 2
      // 173: iload 4
      // 175: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 178: ldc2_w 533716037937215783
      // 17b: astore 33
      // 17d: astore 32
      // 17f: ldc2_w 533716037937215783
      // 182: aload 32
      // 184: aload 33
      // 186: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 189: checkcast java/lang/Object
      // 18c: goto 193
      // 18f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 192: athrow
      // 193: astore 7
      // 195: aload 6
      // 197: iload 3
      // 198: ifeq 1c8
      // 19b: ifnonnull 1bf
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a4: athrow
      // 1a5: aload 7
      // 1a7: ifnonnull 1b8
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: bipush 0
      // 1b2: istore 8
      // 1b4: iload 3
      // 1b5: ifne 1f1
      // 1b8: bipush -1
      // 1b9: istore 8
      // 1bb: iload 3
      // 1bc: ifne 1f1
      // 1bf: aload 7
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: ifnonnull 1d2
      // 1cb: bipush 1
      // 1cc: istore 8
      // 1ce: iload 3
      // 1cf: ifne 1f1
      // 1d2: aload 0
      // 1d3: ldc2_w 487108138525437099
      // 1d6: astore 34
      // 1d8: ldc2_w 487108138525437099
      // 1db: aload 34
      // 1dd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e0: checkcast [Ljava/util/Comparator;
      // 1e3: iload 9
      // 1e5: aaload
      // 1e6: aload 6
      // 1e8: aload 7
      // 1ea: invokeinterface java/util/Comparator.compare (Ljava/lang/Object;Ljava/lang/Object;)I 3
      // 1ef: istore 8
      // 1f1: aload 5
      // 1f3: getstatic javax/swing/SortOrder.DESCENDING Ljavax/swing/SortOrder;
      // 1f6: if_acmpne 1ff
      // 1f9: iload 8
      // 1fb: bipush -1
      // 1fc: imul
      // 1fd: istore 8
      // 1ff: iload 8
      // 201: iload 3
      // 202: ifeq 211
      // 205: ifeq 212
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20e: athrow
      // 20f: iload 8
      // 211: ireturn
      // 212: iinc 9 1
      // 215: iload 3
      // 216: ifne 007
      // 219: iload 1
      // 21a: iload 2
      // 21b: isub
      // 21c: ireturn
   }

   public boolean G() {
      try {
         Object var1 = 278246634133162629L;
         if ((OY[])Ref.g(278246634133162629L, var1) != null) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return false;
   }

   public void L(List param1, OY[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: invokestatic com/finalshell/core/Uo2.i ()Z
      // 06: aload 1
      // 07: invokeinterface java/util/List.size ()I 1
      // 0c: istore 6
      // 0e: istore 3
      // 0f: bipush 0
      // 10: istore 7
      // 12: iload 7
      // 14: iload 6
      // 16: if_icmpge 96
      // 19: aload 2
      // 1a: aload 1
      // 1b: iload 7
      // 1d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 22: invokestatic java/util/Arrays.binarySearch ([Ljava/lang/Object;Ljava/lang/Object;)I
      // 25: istore 5
      // 27: iload 3
      // 28: ifne b7
      // 2b: iload 5
      // 2d: iload 3
      // 2e: ifne 8d
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: ifge 48
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: bipush -1
      // 43: iload 5
      // 45: isub
      // 46: istore 5
      // 48: aload 2
      // 49: iload 4
      // 4b: aload 0
      // 4c: ldc2_w 278246634133162629
      // 4f: astore 8
      // 51: ldc2_w 278246634133162629
      // 54: aload 8
      // 56: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 59: checkcast [Lcom/finalshell/core/OY;
      // 5c: iload 4
      // 5e: iload 7
      // 60: iadd
      // 61: iload 5
      // 63: iload 4
      // 65: isub
      // 66: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 69: aload 0
      // 6a: ldc2_w 278246634133162629
      // 6d: astore 10
      // 6f: ldc2_w 278246634133162629
      // 72: aload 10
      // 74: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 77: checkcast [Lcom/finalshell/core/OY;
      // 7a: iload 5
      // 7c: iload 7
      // 7e: iadd
      // 7f: aload 1
      // 80: iload 7
      // 82: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 87: checkcast com/finalshell/core/OY
      // 8a: aastore
      // 8b: iload 5
      // 8d: istore 4
      // 8f: iinc 7 1
      // 92: iload 3
      // 93: ifeq 12
      // 96: aload 2
      // 97: iload 4
      // 99: aload 0
      // 9a: ldc2_w 278246634133162629
      // 9d: astore 12
      // 9f: ldc2_w 278246634133162629
      // a2: aload 12
      // a4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a7: checkcast [Lcom/finalshell/core/OY;
      // aa: iload 4
      // ac: iload 6
      // ae: iadd
      // af: aload 2
      // b0: arraylength
      // b1: iload 4
      // b3: isub
      // b4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // b7: return
   }

   public boolean j$boolean(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Uo2.i ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08: ldc2_w 472236930662976789
      // 0b: astore 5
      // 0d: astore 4
      // 0f: ldc2_w 472236930662976789
      // 12: aload 4
      // 14: aload 5
      // 16: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: checkcast java/lang/Boolean
      // 1c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f: goto 26
      // 22: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25: athrow
      // 26: iload 3
      // 27: ifne 45
      // 2a: ifne 3a
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc2_w 408209420778557084
      // 3e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 41: swap
      // 42: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 45: iload 3
      // 46: ifne ac
      // 49: ifeq 87
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: iload 2
      // 54: iload 1
      // 55: isub
      // 56: iload 3
      // 57: ifne ae
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: aload 0
      // 62: ldc2_w 278246634133162629
      // 65: astore 6
      // 67: ldc2_w 278246634133162629
      // 6a: aload 6
      // 6c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6f: checkcast [Lcom/finalshell/core/OY;
      // 72: arraylength
      // 73: sipush 11202
      // 76: ldc2_w 5414555227380794368
      // 79: invokestatic com/finalshell/core/DM3.a (IJ)I
      // 7c: idiv
      // 7d: if_icmple ad
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 8b: ldc2_w 225648540112251754
      // 8e: astore 9
      // 90: astore 8
      // 92: ldc2_w 225648540112251754
      // 95: aload 8
      // 97: aload 9
      // 99: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9c: pop
      // 9d: goto a4
      // a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a3: athrow
      // a4: bipush 0
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab: athrow
      // ac: ireturn
      // ad: bipush 1
      // ae: ireturn
   }

   public void P(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.i ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: ldc2_w 278246634133162629
      // 008: astore 10
      // 00a: ldc2_w 278246634133162629
      // 00d: aload 10
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast [Lcom/finalshell/core/OY;
      // 015: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 018: ldc2_w 415726833630999005
      // 01b: astore 13
      // 01d: astore 12
      // 01f: ldc2_w 415726833630999005
      // 022: aload 12
      // 024: aload 13
      // 026: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 029: checkcast [I
      // 02c: goto 033
      // 02f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 032: athrow
      // 033: astore 4
      // 035: istore 3
      // 036: iload 2
      // 037: iload 1
      // 038: isub
      // 039: bipush 1
      // 03a: iadd
      // 03b: istore 6
      // 03d: new java/util/ArrayList
      // 040: dup
      // 041: iload 6
      // 043: invokespecial java/util/ArrayList.<init> (I)V
      // 046: astore 7
      // 048: iload 1
      // 049: istore 5
      // 04b: iload 5
      // 04d: iload 2
      // 04e: if_icmpgt 0ae
      // 051: aload 0
      // 052: iload 5
      // 054: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 057: ldc2_w 391159582674593191
      // 05a: astore 15
      // 05c: astore 14
      // 05e: ldc2_w 391159582674593191
      // 061: aload 14
      // 063: aload 15
      // 065: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 068: checkcast java/lang/Boolean
      // 06b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: iload 3
      // 076: ifne 0c2
      // 079: iload 3
      // 07a: ifne 0a6
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: ifeq 0a7
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: aload 7
      // 090: new com/finalshell/core/OY
      // 093: dup
      // 094: aload 0
      // 095: iload 5
      // 097: invokespecial com/finalshell/core/OY.<init> (Lcom/finalshell/core/DM3;I)V
      // 09a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: pop
      // 0a7: iinc 5 1
      // 0aa: iload 3
      // 0ab: ifeq 04b
      // 0ae: aload 0
      // 0af: ldc2_w 487785452946359037
      // 0b2: astore 16
      // 0b4: ldc2_w 487785452946359037
      // 0b7: aload 16
      // 0b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bc: checkcast [I
      // 0bf: arraylength
      // 0c0: bipush 1
      // 0c1: isub
      // 0c2: istore 5
      // 0c4: iload 5
      // 0c6: iload 1
      // 0c7: if_icmplt 137
      // 0ca: aload 0
      // 0cb: ldc2_w 487785452946359037
      // 0ce: astore 18
      // 0d0: ldc2_w 487785452946359037
      // 0d3: aload 18
      // 0d5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d8: checkcast [I
      // 0db: iload 5
      // 0dd: iaload
      // 0de: istore 8
      // 0e0: iload 3
      // 0e1: ifne 133
      // 0e4: iload 8
      // 0e6: iload 3
      // 0e7: ifne 149
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: bipush -1
      // 0f2: if_icmpeq 130
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: ldc2_w 278246634133162629
      // 100: astore 20
      // 102: ldc2_w 278246634133162629
      // 105: aload 20
      // 107: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10a: checkcast [Lcom/finalshell/core/OY;
      // 10d: iload 8
      // 10f: aaload
      // 110: dup
      // 111: ldc2_w 198606278652726872
      // 114: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 117: swap
      // 118: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 11b: iload 6
      // 11d: iadd
      // 11e: ldc2_w 198606278652726872
      // 121: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 124: dup_x2
      // 125: pop
      // 126: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12f: athrow
      // 130: iinc 5 -1
      // 133: iload 3
      // 134: ifeq 0c4
      // 137: aload 7
      // 139: iload 3
      // 13a: ifne 14e
      // 13d: invokeinterface java/util/List.size ()I 1
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 148: athrow
      // 149: ifle 1b4
      // 14c: aload 7
      // 14e: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 151: aload 0
      // 152: ldc2_w 278246634133162629
      // 155: astore 22
      // 157: ldc2_w 278246634133162629
      // 15a: aload 22
      // 15c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15f: checkcast [Lcom/finalshell/core/OY;
      // 162: astore 9
      // 164: aload 0
      // 165: aload 0
      // 166: ldc2_w 278246634133162629
      // 169: astore 24
      // 16b: ldc2_w 278246634133162629
      // 16e: aload 24
      // 170: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 173: checkcast [Lcom/finalshell/core/OY;
      // 176: arraylength
      // 177: aload 7
      // 179: invokeinterface java/util/List.size ()I 1
      // 17e: iadd
      // 17f: anewarray 348
      // 182: ldc2_w 278246634133162629
      // 185: astore 27
      // 187: astore 26
      // 189: ldc2_w 278246634133162629
      // 18c: aload 26
      // 18e: aload 27
      // 190: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 193: aload 0
      // 194: aload 7
      // 196: aload 9
      // 198: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 19b: ldc2_w 591522529993659045
      // 19e: astore 29
      // 1a0: astore 28
      // 1a2: ldc2_w 591522529993659045
      // 1a5: aload 28
      // 1a7: aload 29
      // 1a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ac: pop
      // 1ad: goto 1b4
      // 1b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: aload 0
      // 1b6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b9: ldc2_w 566043907753096060
      // 1bc: astore 31
      // 1be: astore 30
      // 1c0: ldc2_w 566043907753096060
      // 1c3: aload 30
      // 1c5: aload 31
      // 1c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ca: goto 1d1
      // 1cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d4: ldc2_w 224663528840055939
      // 1d7: astore 33
      // 1d9: astore 32
      // 1db: ldc2_w 224663528840055939
      // 1de: aload 32
      // 1e0: aload 33
      // 1e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e5: checkcast java/lang/Integer
      // 1e8: invokevirtual java/lang/Integer.intValue ()I
      // 1eb: goto 1f2
      // 1ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 1f5: ldc2_w 379372218773986585
      // 1f8: astore 35
      // 1fa: astore 34
      // 1fc: ldc2_w 379372218773986585
      // 1ff: aload 34
      // 201: aload 35
      // 203: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 206: pop
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: aload 0
      // 20f: bipush 1
      // 210: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 213: ldc2_w 253439850071505974
      // 216: astore 37
      // 218: astore 36
      // 21a: ldc2_w 253439850071505974
      // 21d: aload 36
      // 21f: aload 37
      // 221: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 224: pop
      // 225: goto 22c
      // 228: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: aload 0
      // 22d: aload 4
      // 22f: invokevirtual com/finalshell/core/DM3.fireRowSorterChanged ([I)V
      // 232: return
   }

   public void I(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: ldc2_w 278246634133162629
      // 005: astore 12
      // 007: ldc2_w 278246634133162629
      // 00a: aload 12
      // 00c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00f: checkcast [Lcom/finalshell/core/OY;
      // 012: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 015: ldc2_w 415726833630999005
      // 018: astore 15
      // 01a: astore 14
      // 01c: ldc2_w 415726833630999005
      // 01f: aload 14
      // 021: aload 15
      // 023: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 026: checkcast [I
      // 029: goto 030
      // 02c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02f: athrow
      // 030: astore 4
      // 032: bipush 0
      // 033: istore 5
      // 035: invokestatic com/finalshell/core/Uo2.k ()Z
      // 038: iload 1
      // 039: istore 6
      // 03b: istore 3
      // 03c: iload 6
      // 03e: iload 2
      // 03f: if_icmpgt 09a
      // 042: aload 0
      // 043: ldc2_w 487785452946359037
      // 046: astore 16
      // 048: ldc2_w 487785452946359037
      // 04b: aload 16
      // 04d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 050: checkcast [I
      // 053: iload 6
      // 055: iaload
      // 056: istore 7
      // 058: iload 3
      // 059: ifeq 096
      // 05c: iload 7
      // 05e: bipush -1
      // 05f: iload 3
      // 060: ifeq 09e
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: if_icmpeq 093
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: iinc 5 1
      // 077: aload 0
      // 078: ldc2_w 278246634133162629
      // 07b: astore 18
      // 07d: ldc2_w 278246634133162629
      // 080: aload 18
      // 082: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 085: checkcast [Lcom/finalshell/core/OY;
      // 088: iload 7
      // 08a: aconst_null
      // 08b: aastore
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 092: athrow
      // 093: iinc 6 1
      // 096: iload 3
      // 097: ifne 03c
      // 09a: iload 2
      // 09b: iload 1
      // 09c: isub
      // 09d: bipush 1
      // 09e: iadd
      // 09f: istore 8
      // 0a1: aload 0
      // 0a2: ldc2_w 487785452946359037
      // 0a5: astore 20
      // 0a7: ldc2_w 487785452946359037
      // 0aa: aload 20
      // 0ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0af: checkcast [I
      // 0b2: arraylength
      // 0b3: bipush 1
      // 0b4: isub
      // 0b5: istore 6
      // 0b7: iload 6
      // 0b9: iload 2
      // 0ba: if_icmple 12a
      // 0bd: aload 0
      // 0be: ldc2_w 487785452946359037
      // 0c1: astore 22
      // 0c3: ldc2_w 487785452946359037
      // 0c6: aload 22
      // 0c8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cb: checkcast [I
      // 0ce: iload 6
      // 0d0: iaload
      // 0d1: istore 7
      // 0d3: iload 3
      // 0d4: ifeq 126
      // 0d7: iload 7
      // 0d9: bipush -1
      // 0da: iload 3
      // 0db: ifeq 155
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e4: athrow
      // 0e5: if_icmpeq 123
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: ldc2_w 278246634133162629
      // 0f3: astore 24
      // 0f5: ldc2_w 278246634133162629
      // 0f8: aload 24
      // 0fa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fd: checkcast [Lcom/finalshell/core/OY;
      // 100: iload 7
      // 102: aaload
      // 103: dup
      // 104: ldc2_w 198606278652726872
      // 107: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10a: swap
      // 10b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 10e: iload 8
      // 110: isub
      // 111: ldc2_w 198606278652726872
      // 114: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 117: dup_x2
      // 118: pop
      // 119: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 122: athrow
      // 123: iinc 6 -1
      // 126: iload 3
      // 127: ifne 0b7
      // 12a: iload 5
      // 12c: iload 3
      // 12d: ifeq 156
      // 130: ifle 228
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 139: athrow
      // 13a: aload 0
      // 13b: ldc2_w 278246634133162629
      // 13e: astore 26
      // 140: ldc2_w 278246634133162629
      // 143: aload 26
      // 145: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 148: checkcast [Lcom/finalshell/core/OY;
      // 14b: arraylength
      // 14c: iload 5
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 154: athrow
      // 155: isub
      // 156: anewarray 348
      // 159: astore 9
      // 15b: bipush 0
      // 15c: istore 10
      // 15e: bipush 0
      // 15f: istore 11
      // 161: bipush 0
      // 162: istore 6
      // 164: iload 6
      // 166: aload 0
      // 167: ldc2_w 278246634133162629
      // 16a: astore 28
      // 16c: ldc2_w 278246634133162629
      // 16f: aload 28
      // 171: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 174: checkcast [Lcom/finalshell/core/OY;
      // 177: arraylength
      // 178: if_icmpge 1e5
      // 17b: aload 0
      // 17c: ldc2_w 278246634133162629
      // 17f: astore 30
      // 181: ldc2_w 278246634133162629
      // 184: aload 30
      // 186: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 189: checkcast [Lcom/finalshell/core/OY;
      // 18c: iload 6
      // 18e: iload 3
      // 18f: ifeq 1f8
      // 192: iload 3
      // 193: ifeq 1c2
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19c: athrow
      // 19d: aaload
      // 19e: ifnonnull 1de
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: ldc2_w 278246634133162629
      // 1ac: astore 32
      // 1ae: ldc2_w 278246634133162629
      // 1b1: aload 32
      // 1b3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b6: checkcast [Lcom/finalshell/core/OY;
      // 1b9: iload 11
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c1: athrow
      // 1c2: aload 9
      // 1c4: iload 10
      // 1c6: iload 6
      // 1c8: iload 11
      // 1ca: isub
      // 1cb: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1ce: iload 10
      // 1d0: iload 6
      // 1d2: iload 11
      // 1d4: isub
      // 1d5: iadd
      // 1d6: istore 10
      // 1d8: iload 6
      // 1da: bipush 1
      // 1db: iadd
      // 1dc: istore 11
      // 1de: iinc 6 1
      // 1e1: iload 3
      // 1e2: ifne 164
      // 1e5: aload 0
      // 1e6: ldc2_w 278246634133162629
      // 1e9: astore 34
      // 1eb: ldc2_w 278246634133162629
      // 1ee: aload 34
      // 1f0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f3: checkcast [Lcom/finalshell/core/OY;
      // 1f6: iload 11
      // 1f8: aload 9
      // 1fa: iload 10
      // 1fc: aload 0
      // 1fd: ldc2_w 278246634133162629
      // 200: astore 36
      // 202: ldc2_w 278246634133162629
      // 205: aload 36
      // 207: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 20a: checkcast [Lcom/finalshell/core/OY;
      // 20d: arraylength
      // 20e: iload 11
      // 210: isub
      // 211: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 214: aload 0
      // 215: aload 9
      // 217: ldc2_w 278246634133162629
      // 21a: astore 39
      // 21c: astore 38
      // 21e: ldc2_w 278246634133162629
      // 221: aload 38
      // 223: aload 39
      // 225: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 228: aload 0
      // 229: aload 0
      // 22a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22d: ldc2_w 566043907753096060
      // 230: astore 41
      // 232: astore 40
      // 234: ldc2_w 566043907753096060
      // 237: aload 40
      // 239: aload 41
      // 23b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23e: goto 245
      // 241: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 244: athrow
      // 245: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 248: ldc2_w 224663528840055939
      // 24b: astore 43
      // 24d: astore 42
      // 24f: ldc2_w 224663528840055939
      // 252: aload 42
      // 254: aload 43
      // 256: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 259: checkcast java/lang/Integer
      // 25c: invokevirtual java/lang/Integer.intValue ()I
      // 25f: goto 266
      // 262: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 265: athrow
      // 266: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 269: ldc2_w 379372218773986585
      // 26c: astore 45
      // 26e: astore 44
      // 270: ldc2_w 379372218773986585
      // 273: aload 44
      // 275: aload 45
      // 277: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27a: pop
      // 27b: goto 282
      // 27e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 281: athrow
      // 282: aload 0
      // 283: bipush 1
      // 284: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 287: ldc2_w 253439850071505974
      // 28a: astore 47
      // 28c: astore 46
      // 28e: ldc2_w 253439850071505974
      // 291: aload 46
      // 293: aload 47
      // 295: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 298: pop
      // 299: goto 2a0
      // 29c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: aload 4
      // 2a3: invokevirtual com/finalshell/core/DM3.fireRowSorterChanged ([I)V
      // 2a6: return
   }

   public void K(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Uo2.i ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: ldc2_w 278246634133162629
      // 008: astore 16
      // 00a: ldc2_w 278246634133162629
      // 00d: aload 16
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast [Lcom/finalshell/core/OY;
      // 015: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 018: ldc2_w 415726833630999005
      // 01b: astore 19
      // 01d: astore 18
      // 01f: ldc2_w 415726833630999005
      // 022: aload 18
      // 024: aload 19
      // 026: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 029: checkcast [I
      // 02c: goto 033
      // 02f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 032: athrow
      // 033: astore 4
      // 035: iload 2
      // 036: iload 1
      // 037: isub
      // 038: bipush 1
      // 039: iadd
      // 03a: istore 7
      // 03c: istore 3
      // 03d: aload 0
      // 03e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 041: ldc2_w 634483773540315606
      // 044: astore 21
      // 046: astore 20
      // 048: ldc2_w 634483773540315606
      // 04b: aload 20
      // 04d: aload 21
      // 04f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 052: checkcast javax/swing/RowFilter
      // 055: goto 05c
      // 058: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: ifnonnull 1a7
      // 05f: iload 7
      // 061: anewarray 348
      // 064: astore 11
      // 066: bipush 0
      // 067: istore 6
      // 069: iload 1
      // 06a: istore 5
      // 06c: iload 5
      // 06e: iload 2
      // 06f: if_icmpgt 0b2
      // 072: aload 11
      // 074: iload 6
      // 076: aload 0
      // 077: ldc2_w 278246634133162629
      // 07a: astore 22
      // 07c: ldc2_w 278246634133162629
      // 07f: aload 22
      // 081: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 084: checkcast [Lcom/finalshell/core/OY;
      // 087: aload 0
      // 088: ldc2_w 487785452946359037
      // 08b: astore 24
      // 08d: ldc2_w 487785452946359037
      // 090: aload 24
      // 092: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 095: checkcast [I
      // 098: iload 5
      // 09a: iaload
      // 09b: aaload
      // 09c: aastore
      // 09d: iinc 5 1
      // 0a0: iinc 6 1
      // 0a3: iload 3
      // 0a4: ifne 0b7
      // 0a7: iload 3
      // 0a8: ifeq 06c
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: aload 11
      // 0b4: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 0b7: aload 0
      // 0b8: ldc2_w 278246634133162629
      // 0bb: astore 26
      // 0bd: ldc2_w 278246634133162629
      // 0c0: aload 26
      // 0c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast [Lcom/finalshell/core/OY;
      // 0c8: arraylength
      // 0c9: iload 7
      // 0cb: isub
      // 0cc: anewarray 348
      // 0cf: astore 12
      // 0d1: bipush 0
      // 0d2: istore 5
      // 0d4: bipush 0
      // 0d5: istore 6
      // 0d7: iload 5
      // 0d9: aload 0
      // 0da: ldc2_w 278246634133162629
      // 0dd: astore 28
      // 0df: ldc2_w 278246634133162629
      // 0e2: aload 28
      // 0e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e7: checkcast [Lcom/finalshell/core/OY;
      // 0ea: arraylength
      // 0eb: if_icmpge 161
      // 0ee: aload 0
      // 0ef: ldc2_w 278246634133162629
      // 0f2: astore 30
      // 0f4: ldc2_w 278246634133162629
      // 0f7: aload 30
      // 0f9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fc: checkcast [Lcom/finalshell/core/OY;
      // 0ff: iload 5
      // 101: aaload
      // 102: ldc2_w 198606278652726872
      // 105: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 108: swap
      // 109: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 10c: istore 8
      // 10e: iload 3
      // 10f: ifne 1a3
      // 112: iload 8
      // 114: iload 1
      // 115: iload 3
      // 116: ifne 134
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11f: athrow
      // 120: if_icmplt 137
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: iload 8
      // 12c: iload 2
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 133: athrow
      // 134: if_icmple 15a
      // 137: aload 12
      // 139: iload 6
      // 13b: iinc 6 1
      // 13e: aload 0
      // 13f: ldc2_w 278246634133162629
      // 142: astore 32
      // 144: ldc2_w 278246634133162629
      // 147: aload 32
      // 149: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14c: checkcast [Lcom/finalshell/core/OY;
      // 14f: iload 5
      // 151: aaload
      // 152: aastore
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 159: athrow
      // 15a: iinc 5 1
      // 15d: iload 3
      // 15e: ifeq 0d7
      // 161: aload 0
      // 162: aload 11
      // 164: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 167: aload 12
      // 169: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 16c: ldc2_w 591522529993659045
      // 16f: astore 35
      // 171: astore 34
      // 173: ldc2_w 591522529993659045
      // 176: aload 34
      // 178: aload 35
      // 17a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17d: pop
      // 17e: goto 185
      // 181: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 184: athrow
      // 185: aload 0
      // 186: bipush 0
      // 187: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 18a: ldc2_w 253439850071505974
      // 18d: astore 37
      // 18f: astore 36
      // 191: ldc2_w 253439850071505974
      // 194: aload 36
      // 196: aload 37
      // 198: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19b: pop
      // 19c: goto 1a3
      // 19f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: iload 3
      // 1a4: ifeq 424
      // 1a7: new java/util/ArrayList
      // 1aa: dup
      // 1ab: iload 7
      // 1ad: invokespecial java/util/ArrayList.<init> (I)V
      // 1b0: astore 11
      // 1b2: bipush 0
      // 1b3: istore 12
      // 1b5: bipush 0
      // 1b6: istore 13
      // 1b8: bipush 0
      // 1b9: istore 14
      // 1bb: iload 1
      // 1bc: istore 5
      // 1be: iload 5
      // 1c0: iload 2
      // 1c1: if_icmpgt 2ee
      // 1c4: aload 0
      // 1c5: ldc2_w 487785452946359037
      // 1c8: astore 38
      // 1ca: ldc2_w 487785452946359037
      // 1cd: aload 38
      // 1cf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d2: checkcast [I
      // 1d5: iload 5
      // 1d7: iaload
      // 1d8: iload 3
      // 1d9: ifne 276
      // 1dc: bipush -1
      // 1dd: iload 3
      // 1de: ifne 307
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e7: athrow
      // 1e8: if_icmpne 24b
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: iload 5
      // 1f5: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 1f8: ldc2_w 391159582674593191
      // 1fb: astore 41
      // 1fd: astore 40
      // 1ff: ldc2_w 391159582674593191
      // 202: aload 40
      // 204: aload 41
      // 206: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 209: checkcast java/lang/Boolean
      // 20c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 20f: goto 216
      // 212: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 215: athrow
      // 216: iload 3
      // 217: ifne 243
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 220: athrow
      // 221: ifeq 2e7
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22a: athrow
      // 22b: aload 11
      // 22d: new com/finalshell/core/OY
      // 230: dup
      // 231: aload 0
      // 232: iload 5
      // 234: invokespecial com/finalshell/core/OY.<init> (Lcom/finalshell/core/DM3;I)V
      // 237: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 242: athrow
      // 243: pop
      // 244: iinc 12 1
      // 247: iload 3
      // 248: ifeq 2e7
      // 24b: aload 0
      // 24c: iload 5
      // 24e: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 251: ldc2_w 391159582674593191
      // 254: astore 43
      // 256: astore 42
      // 258: ldc2_w 391159582674593191
      // 25b: aload 42
      // 25d: aload 43
      // 25f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 262: checkcast java/lang/Boolean
      // 265: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 268: goto 26f
      // 26b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26e: athrow
      // 26f: goto 276
      // 272: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 275: athrow
      // 276: iload 3
      // 277: ifne 2c6
      // 27a: ifne 292
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 283: athrow
      // 284: iinc 13 1
      // 287: iload 3
      // 288: ifeq 2c7
      // 28b: goto 292
      // 28e: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 291: athrow
      // 292: aload 11
      // 294: aload 0
      // 295: ldc2_w 278246634133162629
      // 298: astore 44
      // 29a: ldc2_w 278246634133162629
      // 29d: aload 44
      // 29f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a2: checkcast [Lcom/finalshell/core/OY;
      // 2a5: aload 0
      // 2a6: ldc2_w 487785452946359037
      // 2a9: astore 46
      // 2ab: ldc2_w 487785452946359037
      // 2ae: aload 46
      // 2b0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2b3: checkcast [I
      // 2b6: iload 5
      // 2b8: iaload
      // 2b9: aaload
      // 2ba: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2bf: goto 2c6
      // 2c2: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c5: athrow
      // 2c6: pop
      // 2c7: aload 0
      // 2c8: ldc2_w 487785452946359037
      // 2cb: astore 48
      // 2cd: ldc2_w 487785452946359037
      // 2d0: aload 48
      // 2d2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2d5: checkcast [I
      // 2d8: iload 5
      // 2da: sipush 10849
      // 2dd: ldc2_w 554123652886283682
      // 2e0: invokestatic com/finalshell/core/DM3.a (IJ)I
      // 2e3: iastore
      // 2e4: iinc 14 1
      // 2e7: iinc 5 1
      // 2ea: iload 3
      // 2eb: ifeq 1be
      // 2ee: aload 11
      // 2f0: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 2f3: aload 0
      // 2f4: ldc2_w 278246634133162629
      // 2f7: astore 50
      // 2f9: ldc2_w 278246634133162629
      // 2fc: aload 50
      // 2fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 301: checkcast [Lcom/finalshell/core/OY;
      // 304: arraylength
      // 305: iload 14
      // 307: isub
      // 308: anewarray 348
      // 30b: astore 15
      // 30d: bipush 0
      // 30e: istore 5
      // 310: bipush 0
      // 311: istore 6
      // 313: iload 5
      // 315: aload 0
      // 316: ldc2_w 278246634133162629
      // 319: astore 52
      // 31b: ldc2_w 278246634133162629
      // 31e: aload 52
      // 320: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 323: checkcast [Lcom/finalshell/core/OY;
      // 326: arraylength
      // 327: if_icmpge 3aa
      // 32a: aload 0
      // 32b: ldc2_w 278246634133162629
      // 32e: astore 54
      // 330: ldc2_w 278246634133162629
      // 333: aload 54
      // 335: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 338: checkcast [Lcom/finalshell/core/OY;
      // 33b: iload 5
      // 33d: aaload
      // 33e: ldc2_w 198606278652726872
      // 341: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 344: swap
      // 345: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 348: istore 8
      // 34a: iload 3
      // 34b: ifne 3a6
      // 34e: aload 0
      // 34f: ldc2_w 487785452946359037
      // 352: astore 56
      // 354: ldc2_w 487785452946359037
      // 357: aload 56
      // 359: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 35c: checkcast [I
      // 35f: iload 8
      // 361: iaload
      // 362: sipush 29451
      // 365: ldc2_w 1237652641240325323
      // 368: invokestatic com/finalshell/core/DM3.a (IJ)I
      // 36b: iload 3
      // 36c: ifne 3ae
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 375: athrow
      // 376: if_icmpeq 3a3
      // 379: goto 380
      // 37c: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37f: athrow
      // 380: aload 15
      // 382: iload 6
      // 384: iinc 6 1
      // 387: aload 0
      // 388: ldc2_w 278246634133162629
      // 38b: astore 58
      // 38d: ldc2_w 278246634133162629
      // 390: aload 58
      // 392: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 395: checkcast [Lcom/finalshell/core/OY;
      // 398: iload 5
      // 39a: aaload
      // 39b: aastore
      // 39c: goto 3a3
      // 39f: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a2: athrow
      // 3a3: iinc 5 1
      // 3a6: iload 3
      // 3a7: ifeq 313
      // 3aa: iload 12
      // 3ac: iload 13
      // 3ae: if_icmpeq 3e5
      // 3b1: aload 0
      // 3b2: aload 0
      // 3b3: ldc2_w 278246634133162629
      // 3b6: astore 60
      // 3b8: ldc2_w 278246634133162629
      // 3bb: aload 60
      // 3bd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3c0: checkcast [Lcom/finalshell/core/OY;
      // 3c3: arraylength
      // 3c4: iload 12
      // 3c6: iadd
      // 3c7: iload 13
      // 3c9: isub
      // 3ca: anewarray 348
      // 3cd: ldc2_w 278246634133162629
      // 3d0: astore 63
      // 3d2: astore 62
      // 3d4: ldc2_w 278246634133162629
      // 3d7: aload 62
      // 3d9: aload 63
      // 3db: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3de: goto 3e5
      // 3e1: invokestatic com/finalshell/core/DM3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e4: athrow
      // 3e5: aload 0
      // 3e6: aload 11
      // 3e8: aload 15
      // 3ea: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 3ed: ldc2_w 591522529993659045
      // 3f0: astore 65
      // 3f2: astore 64
      // 3f4: ldc2_w 591522529993659045
      // 3f7: aload 64
      // 3f9: aload 65
      // 3fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3fe: pop
      // 3ff: goto 406
      // 402: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 405: athrow
      // 406: aload 0
      // 407: bipush 1
      // 408: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 40b: ldc2_w 253439850071505974
      // 40e: astore 67
      // 410: astore 66
      // 412: ldc2_w 253439850071505974
      // 415: aload 66
      // 417: aload 67
      // 419: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 41c: pop
      // 41d: goto 424
      // 420: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 423: athrow
      // 424: aload 0
      // 425: aload 4
      // 427: invokevirtual com/finalshell/core/DM3.fireRowSorterChanged ([I)V
      // 42a: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void x(int var1) {
      boolean var11;
      Integer var14;
      boolean var2 = Uo2.i();

      label49: {
         try {
            if (!var2 && var1 < 0) {
               break label49;
            }
         } catch (IllegalArgumentException var10) {
            throw a(var10);
         }

         try {
            Object[] var10002 = Registry.emptyArgs();
            long var4 = 566043907753096060L;
            Object[] var3 = var10002;
            var10002 = Ref.h(566043907753096060L, var3, var4);
            Object var10003 = Registry.emptyArgs();
            long var6 = 401679078758232861L;
            Object var5 = var10003;
            var10003 = Ref.h(401679078758232861L, var5, var6);

            try {
               var14 = (Integer)var10003;
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (!(var10002 >= var14)) {
               return;
            }
         } catch (IllegalArgumentException var9) {
            boolean var10001 = false;
            throw a(var9);
         }
      }

      try {
         throw new IndexOutOfBoundsException(a(-1477, 10294));
      } catch (IllegalArgumentException var8) {
         var11 = false;
         throw a(var8);
      }
   }

   public static int e(DM3 var0, int var1, int var2) {
      Object var10001 = Registry.packArgs(var1, var2);
      long var4 = 165414353185358341L;
      Object var3 = var10001;
      var10001 = Ref.h(165414353185358341L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -1479) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 242;
               break;
            case 1:
               var10000 = 60;
               break;
            case 2:
               var10000 = 142;
               break;
            case 3:
               var10000 = 42;
               break;
            case 4:
               var10000 = 62;
               break;
            case 5:
               var10000 = 54;
               break;
            case 6:
               var10000 = 129;
               break;
            case 7:
               var10000 = 158;
               break;
            case 8:
               var10000 = 124;
               break;
            case 9:
               var10000 = 238;
               break;
            case 10:
               var10000 = 48;
               break;
            case 11:
               var10000 = 5;
               break;
            case 12:
               var10000 = 211;
               break;
            case 13:
               var10000 = 168;
               break;
            case 14:
               var10000 = 0;
               break;
            case 15:
               var10000 = 82;
               break;
            case 16:
               var10000 = 73;
               break;
            case 17:
               var10000 = 140;
               break;
            case 18:
               var10000 = 125;
               break;
            case 19:
               var10000 = 14;
               break;
            case 20:
               var10000 = 190;
               break;
            case 21:
               var10000 = 108;
               break;
            case 22:
               var10000 = 28;
               break;
            case 23:
               var10000 = 95;
               break;
            case 24:
               var10000 = 78;
               break;
            case 25:
               var10000 = 170;
               break;
            case 26:
               var10000 = 213;
               break;
            case 27:
               var10000 = 114;
               break;
            case 28:
               var10000 = 2;
               break;
            case 29:
               var10000 = 237;
               break;
            case 30:
               var10000 = 121;
               break;
            case 31:
               var10000 = 235;
               break;
            case 32:
               var10000 = 131;
               break;
            case 33:
               var10000 = 218;
               break;
            case 34:
               var10000 = 27;
               break;
            case 35:
               var10000 = 148;
               break;
            case 36:
               var10000 = 236;
               break;
            case 37:
               var10000 = 151;
               break;
            case 38:
               var10000 = 41;
               break;
            case 39:
               var10000 = 133;
               break;
            case 40:
               var10000 = 132;
               break;
            case 41:
               var10000 = 198;
               break;
            case 42:
               var10000 = 160;
               break;
            case 43:
               var10000 = 15;
               break;
            case 44:
               var10000 = 191;
               break;
            case 45:
               var10000 = 46;
               break;
            case 46:
               var10000 = 228;
               break;
            case 47:
               var10000 = 253;
               break;
            case 48:
               var10000 = 247;
               break;
            case 49:
               var10000 = 68;
               break;
            case 50:
               var10000 = 75;
               break;
            case 51:
               var10000 = 61;
               break;
            case 52:
               var10000 = 249;
               break;
            case 53:
               var10000 = 229;
               break;
            case 54:
               var10000 = 74;
               break;
            case 55:
               var10000 = 147;
               break;
            case 56:
               var10000 = 29;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 173;
               break;
            case 59:
               var10000 = 167;
               break;
            case 60:
               var10000 = 224;
               break;
            case 61:
               var10000 = 99;
               break;
            case 62:
               var10000 = 243;
               break;
            case 63:
               var10000 = 83;
               break;
            case 64:
               var10000 = 226;
               break;
            case 65:
               var10000 = 101;
               break;
            case 66:
               var10000 = 122;
               break;
            case 67:
               var10000 = 3;
               break;
            case 68:
               var10000 = 181;
               break;
            case 69:
               var10000 = 25;
               break;
            case 70:
               var10000 = 214;
               break;
            case 71:
               var10000 = 128;
               break;
            case 72:
               var10000 = 162;
               break;
            case 73:
               var10000 = 34;
               break;
            case 74:
               var10000 = 139;
               break;
            case 75:
               var10000 = 233;
               break;
            case 76:
               var10000 = 217;
               break;
            case 77:
               var10000 = 96;
               break;
            case 78:
               var10000 = 112;
               break;
            case 79:
               var10000 = 187;
               break;
            case 80:
               var10000 = 219;
               break;
            case 81:
               var10000 = 195;
               break;
            case 82:
               var10000 = 209;
               break;
            case 83:
               var10000 = 134;
               break;
            case 84:
               var10000 = 179;
               break;
            case 85:
               var10000 = 50;
               break;
            case 86:
               var10000 = 10;
               break;
            case 87:
               var10000 = 186;
               break;
            case 88:
               var10000 = 123;
               break;
            case 89:
               var10000 = 52;
               break;
            case 90:
               var10000 = 169;
               break;
            case 91:
               var10000 = 63;
               break;
            case 92:
               var10000 = 84;
               break;
            case 93:
               var10000 = 31;
               break;
            case 94:
               var10000 = 232;
               break;
            case 95:
               var10000 = 120;
               break;
            case 96:
               var10000 = 72;
               break;
            case 97:
               var10000 = 118;
               break;
            case 98:
               var10000 = 90;
               break;
            case 99:
               var10000 = 143;
               break;
            case 100:
               var10000 = 251;
               break;
            case 101:
               var10000 = 152;
               break;
            case 102:
               var10000 = 245;
               break;
            case 103:
               var10000 = 135;
               break;
            case 104:
               var10000 = 32;
               break;
            case 105:
               var10000 = 252;
               break;
            case 106:
               var10000 = 192;
               break;
            case 107:
               var10000 = 225;
               break;
            case 108:
               var10000 = 36;
               break;
            case 109:
               var10000 = 188;
               break;
            case 110:
               var10000 = 156;
               break;
            case 111:
               var10000 = 88;
               break;
            case 112:
               var10000 = 18;
               break;
            case 113:
               var10000 = 119;
               break;
            case 114:
               var10000 = 43;
               break;
            case 115:
               var10000 = 157;
               break;
            case 116:
               var10000 = 97;
               break;
            case 117:
               var10000 = 55;
               break;
            case 118:
               var10000 = 19;
               break;
            case 119:
               var10000 = 38;
               break;
            case 120:
               var10000 = 91;
               break;
            case 121:
               var10000 = 202;
               break;
            case 122:
               var10000 = 241;
               break;
            case 123:
               var10000 = 56;
               break;
            case 124:
               var10000 = 144;
               break;
            case 125:
               var10000 = 255;
               break;
            case 126:
               var10000 = 126;
               break;
            case 127:
               var10000 = 26;
               break;
            case 128:
               var10000 = 49;
               break;
            case 129:
               var10000 = 106;
               break;
            case 130:
               var10000 = 47;
               break;
            case 131:
               var10000 = 23;
               break;
            case 132:
               var10000 = 178;
               break;
            case 133:
               var10000 = 104;
               break;
            case 134:
               var10000 = 161;
               break;
            case 135:
               var10000 = 244;
               break;
            case 136:
               var10000 = 194;
               break;
            case 137:
               var10000 = 116;
               break;
            case 138:
               var10000 = 103;
               break;
            case 139:
               var10000 = 53;
               break;
            case 140:
               var10000 = 208;
               break;
            case 141:
               var10000 = 69;
               break;
            case 142:
               var10000 = 185;
               break;
            case 143:
               var10000 = 248;
               break;
            case 144:
               var10000 = 71;
               break;
            case 145:
               var10000 = 20;
               break;
            case 146:
               var10000 = 204;
               break;
            case 147:
               var10000 = 212;
               break;
            case 148:
               var10000 = 57;
               break;
            case 149:
               var10000 = 222;
               break;
            case 150:
               var10000 = 92;
               break;
            case 151:
               var10000 = 105;
               break;
            case 152:
               var10000 = 4;
               break;
            case 153:
               var10000 = 6;
               break;
            case 154:
               var10000 = 221;
               break;
            case 155:
               var10000 = 184;
               break;
            case 156:
               var10000 = 111;
               break;
            case 157:
               var10000 = 45;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 136;
               break;
            case 160:
               var10000 = 254;
               break;
            case 161:
               var10000 = 30;
               break;
            case 162:
               var10000 = 176;
               break;
            case 163:
               var10000 = 35;
               break;
            case 164:
               var10000 = 203;
               break;
            case 165:
               var10000 = 196;
               break;
            case 166:
               var10000 = 67;
               break;
            case 167:
               var10000 = 89;
               break;
            case 168:
               var10000 = 1;
               break;
            case 169:
               var10000 = 107;
               break;
            case 170:
               var10000 = 64;
               break;
            case 171:
               var10000 = 239;
               break;
            case 172:
               var10000 = 146;
               break;
            case 173:
               var10000 = 223;
               break;
            case 174:
               var10000 = 231;
               break;
            case 175:
               var10000 = 59;
               break;
            case 176:
               var10000 = 113;
               break;
            case 177:
               var10000 = 138;
               break;
            case 178:
               var10000 = 200;
               break;
            case 179:
               var10000 = 130;
               break;
            case 180:
               var10000 = 22;
               break;
            case 181:
               var10000 = 33;
               break;
            case 182:
               var10000 = 171;
               break;
            case 183:
               var10000 = 215;
               break;
            case 184:
               var10000 = 172;
               break;
            case 185:
               var10000 = 205;
               break;
            case 186:
               var10000 = 16;
               break;
            case 187:
               var10000 = 154;
               break;
            case 188:
               var10000 = 8;
               break;
            case 189:
               var10000 = 159;
               break;
            case 190:
               var10000 = 207;
               break;
            case 191:
               var10000 = 150;
               break;
            case 192:
               var10000 = 94;
               break;
            case 193:
               var10000 = 201;
               break;
            case 194:
               var10000 = 80;
               break;
            case 195:
               var10000 = 17;
               break;
            case 196:
               var10000 = 40;
               break;
            case 197:
               var10000 = 12;
               break;
            case 198:
               var10000 = 115;
               break;
            case 199:
               var10000 = 98;
               break;
            case 200:
               var10000 = 182;
               break;
            case 201:
               var10000 = 227;
               break;
            case 202:
               var10000 = 93;
               break;
            case 203:
               var10000 = 77;
               break;
            case 204:
               var10000 = 166;
               break;
            case 205:
               var10000 = 109;
               break;
            case 206:
               var10000 = 177;
               break;
            case 207:
               var10000 = 79;
               break;
            case 208:
               var10000 = 163;
               break;
            case 209:
               var10000 = 87;
               break;
            case 210:
               var10000 = 66;
               break;
            case 211:
               var10000 = 11;
               break;
            case 212:
               var10000 = 7;
               break;
            case 213:
               var10000 = 70;
               break;
            case 214:
               var10000 = 206;
               break;
            case 215:
               var10000 = 197;
               break;
            case 216:
               var10000 = 127;
               break;
            case 217:
               var10000 = 51;
               break;
            case 218:
               var10000 = 165;
               break;
            case 219:
               var10000 = 141;
               break;
            case 220:
               var10000 = 117;
               break;
            case 221:
               var10000 = 175;
               break;
            case 222:
               var10000 = 65;
               break;
            case 223:
               var10000 = 246;
               break;
            case 224:
               var10000 = 193;
               break;
            case 225:
               var10000 = 183;
               break;
            case 226:
               var10000 = 86;
               break;
            case 227:
               var10000 = 189;
               break;
            case 228:
               var10000 = 100;
               break;
            case 229:
               var10000 = 250;
               break;
            case 230:
               var10000 = 180;
               break;
            case 231:
               var10000 = 13;
               break;
            case 232:
               var10000 = 76;
               break;
            case 233:
               var10000 = 24;
               break;
            case 234:
               var10000 = 37;
               break;
            case 235:
               var10000 = 44;
               break;
            case 236:
               var10000 = 220;
               break;
            case 237:
               var10000 = 110;
               break;
            case 238:
               var10000 = 230;
               break;
            case 239:
               var10000 = 9;
               break;
            case 240:
               var10000 = 39;
               break;
            case 241:
               var10000 = 164;
               break;
            case 242:
               var10000 = 174;
               break;
            case 243:
               var10000 = 21;
               break;
            case 244:
               var10000 = 102;
               break;
            case 245:
               var10000 = 149;
               break;
            case 246:
               var10000 = 210;
               break;
            case 247:
               var10000 = 153;
               break;
            case 248:
               var10000 = 145;
               break;
            case 249:
               var10000 = 58;
               break;
            case 250:
               var10000 = 199;
               break;
            case 251:
               var10000 = 240;
               break;
            case 252:
               var10000 = 155;
               break;
            case 253:
               var10000 = 137;
               break;
            case 254:
               var10000 = 216;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28611;
      if (h[var3] == null) {
         h[var3] = (int)(d[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      char[] var33;
      byte[] var7;
      String[] var13 = new String[8];
      var11 = 0;
      String var10 = "\u009ezýâ\n|É³v\u000bó*¼\u000fM$\u0087)E\u0005 \u009cjài\u008b^ãÈ!¨\u0093Nê$ìi\u0004¹ïþ¤=\u001aeÓÆ?\u007fHD\u0013ÿ¤ÕI\u009fo\u0007\u009eX[î\u000b\u0013fLa<\f\u000f½±Êá\u001d\u0090.\u008eM43\u0018â\u009aY'F\t\u00942ô\u0088ÌèÜ\u001ed]yk\u0083\u0094²}\r¡Î\u001atö®Vé\u0085@\u008dCs";
      int var12 = "\u009ezýâ\n|É³v\u000bó*¼\u000fM$\u0087)E\u0005 \u009cjài\u008b^ãÈ!¨\u0093Nê$ìi\u0004¹ïþ¤=\u001aeÓÆ?\u007fHD\u0013ÿ¤ÕI\u009fo\u0007\u009eX[î\u000b\u0013fLa<\f\u000f½±Êá\u001d\u0090.\u008eM43\u0018â\u009aY'F\t\u00942ô\u0088ÌèÜ\u001ed]yk\u0083\u0094²}\r¡Î\u001atö®Vé\u0085@\u008dCs"
         .length();
      char var9 = '\r';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 104;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 49;
                        break;
                     case 1:
                        var65 = 16;
                        break;
                     case 2:
                        var65 = 123;
                        break;
                     case 3:
                        var65 = 8;
                        break;
                     case 4:
                        var65 = 107;
                        break;
                     case 5:
                        var65 = 96;
                        break;
                     default:
                        var65 = 5;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[8];
                     long var0 = 5611620547195163644L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "!ÍcÿÍËé óÀK6A\u001d\u0097ö";
                     int var5 = "!ÍcÿÍËé óÀK6A\u001d\u0097ö".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    d = var6;
                                    h = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¸\u0004k+r\u0007\u0015\u0010\u0089#\u007fâ\u001aR0É";
                                 var5 = "¸\u0004k+r\u0007\u0015\u0010\u0089#\u007fâ\u001aR0É".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u0095\b(\u0018\u0004\u0097¼zw\u0089\u0015\"\u0082\r\u001f\\y\u0092.ÆùPßÌ\u0000\u008a ";
                  var12 = "\u0095\b(\u0018\u0004\u0097¼zw\u0089\u0015\"\u0082\r\u001f\\y\u0092.ÆùPßÌ\u0000\u008a ".length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 55;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





