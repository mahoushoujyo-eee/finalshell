package com.finalshell.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Nc4 {
   public static String a;

   public static List Q(Xq4 var0) {
      String var10000 = FV_2.D();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      HashMap var3 = new HashMap();

      for (Object var5 : var0.f()) {
         R(var5, var2, var3, var0);
         if (var1 != null) {
            break;
         }
      }

      List var9 = I(var2);
      ArrayList var10 = new ArrayList(var9.size());
      Iterator var6 = var9.iterator();

      while (true) {
         if (var6.hasNext()) {
      ArrayList var11;
            Iz2 var7 = (Iz2)var6.next();

            try {
               var11 = var10;
               if (var1 != null) {
                  break;
               }

               var10.add(var7.P());
               if (var1 == null) {
                  continue;
               }
            } catch (RuntimeException var8) {
      ArrayList var11;
               throw a(var8);
            }
         }

         var11 = var10;
         break;
      }

      return var11;
   }

   public static Iz2 R(Object param0, List param1, Map param2, Xq4 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 2
      // 06: aload 0
      // 07: aload 4
      // 09: ifnonnull 24
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifeq 33
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 2
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 29: checkcast com/finalshell/core/Iz2
      // 2c: astore 5
      // 2e: aload 4
      // 30: ifnull 90
      // 33: new com/finalshell/core/Iz2
      // 36: dup
      // 37: aload 0
      // 38: invokespecial com/finalshell/core/Iz2.<init> (Ljava/lang/Object;)V
      // 3b: astore 5
      // 3d: aload 1
      // 3e: aload 5
      // 40: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 45: pop
      // 46: aload 2
      // 47: aload 0
      // 48: aload 5
      // 4a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4f: pop
      // 50: aload 3
      // 51: aload 0
      // 52: invokeinterface com/finalshell/core/Xq4.i (Ljava/lang/Object;)Ljava/util/List; 2
      // 57: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5c: astore 6
      // 5e: aload 6
      // 60: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 65: ifeq 90
      // 68: aload 6
      // 6a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6f: astore 7
      // 71: aload 5
      // 73: aload 7
      // 75: aload 1
      // 76: aload 2
      // 77: aload 3
      // 78: invokestatic com/finalshell/core/Nc4.R (Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Lcom/finalshell/core/Xq4;)Lcom/finalshell/core/Iz2;
      // 7b: invokevirtual com/finalshell/core/Iz2.F (Lcom/finalshell/core/Iz2;)Lcom/finalshell/core/Iz2;
      // 7e: aload 4
      // 80: ifnonnull 92
      // 83: pop
      // 84: aload 4
      // 86: ifnull 5e
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8f: athrow
      // 90: aload 5
      // 92: areturn
   }

   public static List I(List param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 2
      // 008: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 00b: new java/util/HashSet
      // 00e: dup
      // 00f: invokespecial java/util/HashSet.<init> ()V
      // 012: astore 3
      // 013: astore 1
      // 014: aload 0
      // 015: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01a: astore 4
      // 01c: aload 4
      // 01e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 023: ifeq 065
      // 026: aload 4
      // 028: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02d: checkcast com/finalshell/core/Iz2
      // 030: astore 5
      // 032: aload 5
      // 034: getfield com/finalshell/core/Iz2.f Ljava/util/HashSet;
      // 037: invokevirtual java/util/HashSet.size ()I
      // 03a: aload 1
      // 03b: ifnonnull 069
      // 03e: aload 1
      // 03f: ifnonnull 060
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: ifne 061
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 052: athrow
      // 053: aload 3
      // 054: aload 5
      // 056: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05f: athrow
      // 060: pop
      // 061: aload 1
      // 062: ifnull 01c
      // 065: aload 3
      // 066: invokevirtual java/util/HashSet.isEmpty ()Z
      // 069: ifne 0f5
      // 06c: aload 3
      // 06d: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 070: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 075: checkcast com/finalshell/core/Iz2
      // 078: astore 4
      // 07a: aload 3
      // 07b: aload 4
      // 07d: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 080: pop
      // 081: aload 2
      // 082: aload 4
      // 084: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 087: aload 1
      // 088: ifnonnull 0f6
      // 08b: pop
      // 08c: aload 4
      // 08e: getfield com/finalshell/core/Iz2.D Ljava/util/HashSet;
      // 091: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 094: astore 5
      // 096: aload 5
      // 098: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09d: ifeq 0f1
      // 0a0: aload 5
      // 0a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a7: checkcast com/finalshell/core/FZ
      // 0aa: astore 6
      // 0ac: aload 6
      // 0ae: getfield com/finalshell/core/FZ.l Lcom/finalshell/core/Iz2;
      // 0b1: astore 7
      // 0b3: aload 5
      // 0b5: invokeinterface java/util/Iterator.remove ()V 1
      // 0ba: aload 7
      // 0bc: getfield com/finalshell/core/Iz2.f Ljava/util/HashSet;
      // 0bf: aload 6
      // 0c1: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 0c4: pop
      // 0c5: aload 7
      // 0c7: getfield com/finalshell/core/Iz2.f Ljava/util/HashSet;
      // 0ca: invokevirtual java/util/HashSet.isEmpty ()Z
      // 0cd: aload 1
      // 0ce: ifnonnull 069
      // 0d1: aload 1
      // 0d2: ifnonnull 0ec
      // 0d5: ifeq 0ed
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: aload 3
      // 0e0: aload 7
      // 0e2: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0eb: athrow
      // 0ec: pop
      // 0ed: aload 1
      // 0ee: ifnull 096
      // 0f1: aload 1
      // 0f2: ifnull 065
      // 0f5: bipush 0
      // 0f6: istore 4
      // 0f8: aload 0
      // 0f9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0fe: astore 5
      // 100: aload 5
      // 102: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 107: ifeq 149
      // 10a: aload 5
      // 10c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 111: checkcast com/finalshell/core/Iz2
      // 114: astore 6
      // 116: aload 6
      // 118: getfield com/finalshell/core/Iz2.f Ljava/util/HashSet;
      // 11b: invokevirtual java/util/HashSet.isEmpty ()Z
      // 11e: aload 1
      // 11f: ifnonnull 14b
      // 122: aload 1
      // 123: ifnonnull 138
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12c: athrow
      // 12d: ifne 13e
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 136: athrow
      // 137: bipush 1
      // 138: istore 4
      // 13a: aload 1
      // 13b: ifnull 149
      // 13e: aload 1
      // 13f: ifnull 100
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 148: athrow
      // 149: iload 4
      // 14b: ifne 154
      // 14e: aload 2
      // 14f: areturn
      // 150: invokestatic com/finalshell/core/Nc4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 153: athrow
      // 154: new java/lang/RuntimeException
      // 157: dup
      // 158: getstatic com/finalshell/core/Nc4.a Ljava/lang/String;
      // 15b: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 15e: athrow
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "u{XodouDgHfo;)\u0016vTsn#jQkXbmovYpO#o q\u0016rTpr&gZg".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 117;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 117;
         var10006 = var0;
      } else {
         var6 = 117;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 117;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 67;
               break;
            case 1:
               var23 = 119;
               break;
            case 2:
               var23 = 78;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 116;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 112;
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






