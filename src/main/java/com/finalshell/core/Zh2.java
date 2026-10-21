package com.finalshell.core;

import com.finalshell.ui.model.S6;

public class Zh2 extends Z8 {
   public final double j;
   public final S6 o;

   public Zh2(String var1, boolean var2, double var3, S6 var5) {
      super(var1, var2);
      this.j = var3;
      this.o = var5;
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
      // 008: invokevirtual com/finalshell/core/Zh2.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 6
      // 011: aload 5
      // 013: ifnonnull 028
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 025: athrow
      // 026: aload 6
      // 028: aload 5
      // 02a: ifnonnull 042
      // 02d: instanceof java/lang/Number
      // 030: ifne 040
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 039: athrow
      // 03a: bipush 0
      // 03b: ireturn
      // 03c: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 03f: athrow
      // 040: aload 6
      // 042: checkcast java/lang/Number
      // 045: invokevirtual java/lang/Number.doubleValue ()D
      // 048: dstore 7
      // 04a: getstatic com/finalshell/core/L12.U [I
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Zh2.o Lcom/finalshell/ui/model/S6;
      // 051: invokevirtual com/finalshell/ui/model/S6.ordinal ()I
      // 054: iaload
      // 055: aload 5
      // 057: ifnonnull 134
      // 05a: tableswitch 217 1 6 42 77 105 133 161 189
      // 080: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 083: athrow
      // 084: dload 7
      // 086: aload 0
      // 087: getfield com/finalshell/core/Zh2.j D
      // 08a: dcmpl
      // 08b: aload 5
      // 08d: ifnonnull 0a2
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 096: athrow
      // 097: ifne 0a5
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0a0: athrow
      // 0a1: bipush 1
      // 0a2: goto 0a6
      // 0a5: bipush 0
      // 0a6: ireturn
      // 0a7: dload 7
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/Zh2.j D
      // 0ad: dcmpl
      // 0ae: aload 5
      // 0b0: ifnonnull 0be
      // 0b3: ifeq 0c1
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0bc: athrow
      // 0bd: bipush 1
      // 0be: goto 0c2
      // 0c1: bipush 0
      // 0c2: ireturn
      // 0c3: dload 7
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/Zh2.j D
      // 0c9: dcmpl
      // 0ca: aload 5
      // 0cc: ifnonnull 0da
      // 0cf: iflt 0dd
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0d8: athrow
      // 0d9: bipush 1
      // 0da: goto 0de
      // 0dd: bipush 0
      // 0de: ireturn
      // 0df: dload 7
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/Zh2.j D
      // 0e5: dcmpl
      // 0e6: aload 5
      // 0e8: ifnonnull 0f6
      // 0eb: ifle 0f9
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0f4: athrow
      // 0f5: bipush 1
      // 0f6: goto 0fa
      // 0f9: bipush 0
      // 0fa: ireturn
      // 0fb: dload 7
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/Zh2.j D
      // 101: dcmpg
      // 102: aload 5
      // 104: ifnonnull 112
      // 107: ifgt 115
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 110: athrow
      // 111: bipush 1
      // 112: goto 116
      // 115: bipush 0
      // 116: ireturn
      // 117: dload 7
      // 119: aload 0
      // 11a: getfield com/finalshell/core/Zh2.j D
      // 11d: dcmpg
      // 11e: aload 5
      // 120: ifnonnull 12e
      // 123: ifge 131
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/Zh2.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 12c: athrow
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 0
      // 132: ireturn
      // 133: bipush 0
      // 134: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





