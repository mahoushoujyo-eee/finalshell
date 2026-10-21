package com.finalshell.ui.model;

import com.finalshell.core.D3_3;
import com.finalshell.core.F3_3;
import java.util.Iterator;

public class S_2 implements Iterator {
   public final Iterator[] g;
   public static Iterator S;
   public static String a;

   public S_2(Iterator var1, int var2) {
   super();
      boolean var10000 = F3_3.s();
      this.g = new Iterator[var2];
      this.g[0] = var1;
      int var4 = 1;
      boolean var3 = var10000;

      while (var4 < var2) {
         this.g[var4] = S;
         var4++;
         if (!var3) {
            break;
         }
      }
   }

   @Override
   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/F3_3.G ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 008: aload 0
      // 009: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 00c: arraylength
      // 00d: bipush 1
      // 00e: isub
      // 00f: aaload
      // 010: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 015: iload 1
      // 016: ifne 030
      // 019: ifeq 029
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 022: athrow
      // 023: bipush 1
      // 024: ireturn
      // 025: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 02d: arraylength
      // 02e: bipush 2
      // 02f: isub
      // 030: istore 2
      // 031: iload 2
      // 032: iload 1
      // 033: ifne 051
      // 036: ifge 046
      // 039: goto 040
      // 03c: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 03f: athrow
      // 040: bipush 0
      // 041: ireturn
      // 042: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 04a: iload 2
      // 04b: aaload
      // 04c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 051: ifne 07e
      // 054: iload 2
      // 055: iload 1
      // 056: ifne 07f
      // 059: goto 060
      // 05c: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 05f: athrow
      // 060: iload 1
      // 061: ifne 076
      // 064: goto 06b
      // 067: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 06a: athrow
      // 06b: ifne 077
      // 06e: goto 075
      // 071: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 074: athrow
      // 075: bipush 0
      // 076: ireturn
      // 077: iinc 2 -1
      // 07a: iload 1
      // 07b: ifeq 046
      // 07e: iload 2
      // 07f: iload 1
      // 080: ifne 09c
      // 083: aload 0
      // 084: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 087: arraylength
      // 088: bipush 1
      // 089: isub
      // 08a: if_icmpne 09d
      // 08d: goto 094
      // 090: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 093: athrow
      // 094: bipush 1
      // 095: goto 09c
      // 098: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 09b: athrow
      // 09c: ireturn
      // 09d: aload 0
      // 09e: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 0a1: iload 2
      // 0a2: aaload
      // 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a8: astore 3
      // 0a9: aload 3
      // 0aa: instanceof java/util/Iterator
      // 0ad: iload 1
      // 0ae: ifne 0de
      // 0b1: ifeq 0d3
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 0bf: iinc 2 1
      // 0c2: iload 2
      // 0c3: aload 3
      // 0c4: checkcast java/util/Iterator
      // 0c7: aastore
      // 0c8: iload 1
      // 0c9: ifeq 17b
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 0d2: athrow
      // 0d3: aload 3
      // 0d4: instanceof [Ljava/lang/Object;
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 0dd: athrow
      // 0de: iload 1
      // 0df: ifne 117
      // 0e2: ifeq 10c
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 0f0: iinc 2 1
      // 0f3: iload 2
      // 0f4: aload 3
      // 0f5: checkcast [Ljava/lang/Object;
      // 0f8: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 0fb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 100: aastore
      // 101: iload 1
      // 102: ifeq 17b
      // 105: goto 10c
      // 108: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 10b: athrow
      // 10c: aload 3
      // 10d: instanceof java/util/Collection
      // 110: goto 117
      // 113: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 116: athrow
      // 117: iload 1
      // 118: ifne 14d
      // 11b: ifeq 142
      // 11e: goto 125
      // 121: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 124: athrow
      // 125: aload 0
      // 126: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 129: iinc 2 1
      // 12c: iload 2
      // 12d: aload 3
      // 12e: checkcast java/util/Collection
      // 131: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 136: aastore
      // 137: iload 1
      // 138: ifeq 17b
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 141: athrow
      // 142: aload 3
      // 143: instanceof java/util/Enumeration
      // 146: goto 14d
      // 149: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 14c: athrow
      // 14d: ifeq 16f
      // 150: aload 0
      // 151: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 154: iinc 2 1
      // 157: iload 2
      // 158: new com/finalshell/ui/model/G_2
      // 15b: dup
      // 15c: aload 3
      // 15d: checkcast java/util/Enumeration
      // 160: invokespecial com/finalshell/ui/model/G_2.<init> (Ljava/util/Enumeration;)V
      // 163: aastore
      // 164: iload 1
      // 165: ifeq 17b
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 16e: athrow
      // 16f: new com/finalshell/core/D3_3
      // 172: dup
      // 173: invokespecial com/finalshell/core/D3_3.<init> ()V
      // 176: athrow
      // 177: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 17a: athrow
      // 17b: goto 046
   }

   @Override
   public Object next() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/F3_3.G ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/ui/model/S_2.hasNext ()Z
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 15: athrow
      // 16: new java/util/NoSuchElementException
      // 19: dup
      // 1a: invokespecial java/util/NoSuchElementException.<init> ()V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/ui/model/S_2.a (Lcom/finalshell/core/D3_3;)Lcom/finalshell/core/D3_3;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 26: aload 0
      // 27: getfield com/finalshell/ui/model/S_2.g [Ljava/util/Iterator;
      // 2a: arraylength
      // 2b: bipush 1
      // 2c: isub
      // 2d: aaload
      // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33: astore 2
      // 34: aload 2
      // 35: areturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException(a);
   }

   static {
      __vfClinit__();
   }

   public static D3_3 a(D3_3 var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\f`\u000eHr\u0010".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 64;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      } else {
         var6 = 64;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            S = new P_2();
            return;
         }

         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 62;
               break;
            case 1:
               var23 = 69;
               break;
            case 2:
               var23 = 35;
               break;
            case 3:
               var23 = 103;
               break;
            case 4:
               var23 = 68;
               break;
            case 5:
               var23 = 53;
               break;
            default:
               var23 = 81;
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
               S = new P_2();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





