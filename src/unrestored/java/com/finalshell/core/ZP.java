package com.finalshell.core;

import com.finalshell.ui.model.S6;

public class ZP extends Z8 {
   public final String A;
   public final S6 l;

   public ZP(String var1, boolean var2, String var3, S6 var4) {
      super(var1, var2);
      this.A = var3;
      this.l = var4;
   }

   @Override
   public boolean x(Ph4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: aload 4
      // 008: invokevirtual com/finalshell/core/ZP.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 0
      // 010: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 013: getstatic com/finalshell/ui/model/S6.EQ Lcom/finalshell/ui/model/S6;
      // 016: aload 5
      // 018: ifnonnull 046
      // 01b: if_acmpne 033
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 024: athrow
      // 025: aload 0
      // 026: getfield com/finalshell/core/ZP.A Ljava/lang/String;
      // 029: aload 6
      // 02b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02e: ireturn
      // 02f: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 032: athrow
      // 033: aload 0
      // 034: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 037: aload 5
      // 039: ifnonnull 070
      // 03c: getstatic com/finalshell/ui/model/S6.NE Lcom/finalshell/ui/model/S6;
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 045: athrow
      // 046: if_acmpne 06e
      // 049: aload 0
      // 04a: getfield com/finalshell/core/ZP.A Ljava/lang/String;
      // 04d: aload 6
      // 04f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 052: aload 5
      // 054: ifnonnull 069
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 05d: athrow
      // 05e: ifne 06c
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 067: athrow
      // 068: bipush 1
      // 069: goto 06d
      // 06c: bipush 0
      // 06d: ireturn
      // 06e: aload 6
      // 070: ifnonnull 079
      // 073: bipush 0
      // 074: ireturn
      // 075: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield com/finalshell/core/ZP.A Ljava/lang/String;
      // 07d: aload 6
      // 07f: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 082: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 085: istore 7
      // 087: aload 0
      // 088: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 08b: getstatic com/finalshell/ui/model/S6.GE Lcom/finalshell/ui/model/S6;
      // 08e: aload 5
      // 090: ifnonnull 0c2
      // 093: if_acmpne 0bb
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 09c: athrow
      // 09d: iload 7
      // 09f: aload 5
      // 0a1: ifnonnull 0b6
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0aa: athrow
      // 0ab: ifgt 0b9
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0b4: athrow
      // 0b5: bipush 1
      // 0b6: goto 0ba
      // 0b9: bipush 0
      // 0ba: ireturn
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 0bf: getstatic com/finalshell/ui/model/S6.GT Lcom/finalshell/ui/model/S6;
      // 0c2: aload 5
      // 0c4: ifnonnull 0f6
      // 0c7: if_acmpne 0ef
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0d0: athrow
      // 0d1: iload 7
      // 0d3: aload 5
      // 0d5: ifnonnull 0ea
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0de: athrow
      // 0df: ifge 0ed
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0e8: athrow
      // 0e9: bipush 1
      // 0ea: goto 0ee
      // 0ed: bipush 0
      // 0ee: ireturn
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 0f3: getstatic com/finalshell/ui/model/S6.LE Lcom/finalshell/ui/model/S6;
      // 0f6: aload 5
      // 0f8: ifnonnull 12a
      // 0fb: if_acmpne 123
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 104: athrow
      // 105: iload 7
      // 107: aload 5
      // 109: ifnonnull 11e
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 112: athrow
      // 113: iflt 121
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 11c: athrow
      // 11d: bipush 1
      // 11e: goto 122
      // 121: bipush 0
      // 122: ireturn
      // 123: aload 0
      // 124: getfield com/finalshell/core/ZP.l Lcom/finalshell/ui/model/S6;
      // 127: getstatic com/finalshell/ui/model/S6.LT Lcom/finalshell/ui/model/S6;
      // 12a: if_acmpne 14b
      // 12d: iload 7
      // 12f: aload 5
      // 131: ifnonnull 146
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 13a: athrow
      // 13b: ifle 149
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/ZP.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 144: athrow
      // 145: bipush 1
      // 146: goto 14a
      // 149: bipush 0
      // 14a: ireturn
      // 14b: bipush 0
      // 14c: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





