package com;

import java.util.ArrayList;
import java.util.List;

class ka_4 implements N5 {
   private boolean V;
   private List c = new ArrayList(2);

   public ka_4(N5 var1, N5 var2, boolean var3) {
      this.c.add(var1);
      this.c.add(var2);
      this.V = var3;
   }

   @Override
   public boolean x(ph_4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: astore 5
      // 05: aload 0
      // 06: aload 5
      // 08: ifnonnull 6a
      // 0b: getfield com/ka_4.V Z
      // 0e: ifeq 69
      // 11: goto 18
      // 14: invokestatic com/ka_4.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/ka_4.c Ljava/util/List;
      // 1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 21: astore 6
      // 23: aload 6
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 67
      // 2d: aload 6
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/N5
      // 37: astore 7
      // 39: aload 7
      // 3b: aload 1
      // 3c: aload 2
      // 3d: aload 3
      // 3e: aload 4
      // 40: invokeinterface com/N5.x (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z 5
      // 45: aload 5
      // 47: ifnonnull 68
      // 4a: aload 5
      // 4c: ifnonnull 61
      // 4f: goto 56
      // 52: invokestatic com/ka_4.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 55: athrow
      // 56: ifne 62
      // 59: goto 60
      // 5c: invokestatic com/ka_4.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 5f: athrow
      // 60: bipush 0
      // 61: ireturn
      // 62: aload 5
      // 64: ifnull 23
      // 67: bipush 1
      // 68: ireturn
      // 69: aload 0
      // 6a: getfield com/ka_4.c Ljava/util/List;
      // 6d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 72: astore 6
      // 74: aload 6
      // 76: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7b: ifeq b8
      // 7e: aload 6
      // 80: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 85: checkcast com/N5
      // 88: astore 7
      // 8a: aload 7
      // 8c: aload 1
      // 8d: aload 2
      // 8e: aload 3
      // 8f: aload 4
      // 91: invokeinterface com/N5.x (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z 5
      // 96: aload 5
      // 98: ifnonnull b9
      // 9b: aload 5
      // 9d: ifnonnull b2
      // a0: goto a7
      // a3: invokestatic com/ka_4.a (Lcom/Hi_2;)Lcom/Hi_2;
      // a6: athrow
      // a7: ifeq b3
      // aa: goto b1
      // ad: invokestatic com/ka_4.a (Lcom/Hi_2;)Lcom/Hi_2;
      // b0: athrow
      // b1: bipush 1
      // b2: ireturn
      // b3: aload 5
      // b5: ifnull 74
      // b8: bipush 0
      // b9: ireturn
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





