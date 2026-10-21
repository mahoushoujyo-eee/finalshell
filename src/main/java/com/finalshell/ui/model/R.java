package com.finalshell.ui.model;

import com.finalshell.core.C_9;
import com.finalshell.util.C;
import java.util.Iterator;

public class R implements Iterator {
   @C_9
   public Iterator G;
   public final C K;

   public R(C var1) {
      this.K = var1;
      this.G = C.K(this.K).iterator();
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
      // 00: invokestatic com/finalshell/core/F3_3.s ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/ui/model/R.G Ljava/util/Iterator;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 52
      // 0e: ifnull 46
      // 11: goto 18
      // 14: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 2
      // 19: iload 1
      // 1a: ifeq 40
      // 1d: goto 24
      // 20: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 23: athrow
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 41
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 32: athrow
      // 33: aload 2
      // 34: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 3f: athrow
      // 40: areturn
      // 41: aload 0
      // 42: aconst_null
      // 43: putfield com/finalshell/ui/model/R.G Ljava/util/Iterator;
      // 46: aload 0
      // 47: getfield com/finalshell/ui/model/R.K Lcom/finalshell/util/C;
      // 4a: invokestatic com/finalshell/util/C.R (Lcom/finalshell/util/C;)Ljava/util/Iterator;
      // 4d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 52: astore 3
      // 53: aload 0
      // 54: getfield com/finalshell/ui/model/R.K Lcom/finalshell/util/C;
      // 57: invokestatic com/finalshell/util/C.K (Lcom/finalshell/util/C;)Ljava/util/List;
      // 5a: aload 3
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 3
      // 62: areturn
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
      // 00: invokestatic com/finalshell/core/F3_3.s ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/R.G Ljava/util/Iterator;
      // 08: iload 1
      // 09: ifeq 42
      // 0c: ifnull 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/ui/model/R.G Ljava/util/Iterator;
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: iload 1
      // 20: ifeq 56
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 29: athrow
      // 2a: ifne 55
      // 2d: goto 34
      // 30: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/ui/model/R.K Lcom/finalshell/util/C;
      // 38: invokestatic com/finalshell/util/C.R (Lcom/finalshell/util/C;)Ljava/util/Iterator;
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 41: athrow
      // 42: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 47: iload 1
      // 48: ifeq 56
      // 4b: ifeq 59
      // 4e: goto 55
      // 51: invokestatic com/finalshell/ui/model/R.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}





