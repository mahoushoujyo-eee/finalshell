package com.finalshell.ui.model;

import com.finalshell.core.NI;
import com.finalshell.core.Ph2;
import com.finalshell.util.Xy4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class B2 implements Iterator {
   public NI K;
   public int L;
   public int p;
   public NI A;
   public final Xy4 O;

   public B2(Xy4 var1) {
   super();
      int var10000 = Ph2.u();
      this.O = var1;
      int var2 = var10000;
      this.L = var1.b;
      Xy4 var6 = var1;
      if (var2 == 0) {
         try {
            if (var6.t <= 0) {
               return;
            }

            var6 = var1;
         } catch (ConcurrentModificationException var5) {
            throw new RuntimeException(a(var5));
         }
      }

      NI[] var3 = var6.v;

      while (this.p < var3.length) {
         try {
            if ((this.K = var3[this.p++]) != null || var2 != 0) {
               break;
            }
         } catch (ConcurrentModificationException var4) {
            throw new RuntimeException(a(var4));
         }
      }
   }

   @Override
   public final boolean hasNext() {
      try {
         if (this.K != null) {
            return true;
         }
      } catch (ConcurrentModificationException var1) {
         throw new RuntimeException(a(var1));
      }

      return false;
   }

   public final NI L() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 2a
      // 09: getfield com/finalshell/ui/model/B2.O Lcom/finalshell/util/Xy4;
      // 0c: getfield com/finalshell/util/Xy4.b I
      // 0f: aload 0
      // 10: getfield com/finalshell/ui/model/B2.L I
      // 13: if_icmpeq 29
      // 16: goto 1d
      // 19: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 1c: athrow
      // 1d: new java/util/ConcurrentModificationException
      // 20: dup
      // 21: invokespecial java/util/ConcurrentModificationException.<init> ()V
      // 24: athrow
      // 25: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield com/finalshell/ui/model/B2.K Lcom/finalshell/core/NI;
      // 2d: astore 2
      // 2e: aload 2
      // 2f: iload 1
      // 30: ifeq 52
      // 33: ifnonnull 49
      // 36: goto 3d
      // 39: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 3c: athrow
      // 3d: new java/util/NoSuchElementException
      // 40: dup
      // 41: invokespecial java/util/NoSuchElementException.<init> ()V
      // 44: athrow
      // 45: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 4e: dup_x1
      // 4f: putfield com/finalshell/ui/model/B2.K Lcom/finalshell/core/NI;
      // 52: iload 1
      // 53: ifeq ad
      // 56: ifnonnull a7
      // 59: goto 60
      // 5c: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield com/finalshell/ui/model/B2.O Lcom/finalshell/util/Xy4;
      // 64: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 67: astore 3
      // 68: aload 0
      // 69: getfield com/finalshell/ui/model/B2.p I
      // 6c: aload 3
      // 6d: arraylength
      // 6e: if_icmpge a7
      // 71: aload 0
      // 72: aload 3
      // 73: aload 0
      // 74: dup
      // 75: getfield com/finalshell/ui/model/B2.p I
      // 78: dup_x1
      // 79: bipush 1
      // 7a: iadd
      // 7b: putfield com/finalshell/ui/model/B2.p I
      // 7e: aaload
      // 7f: dup_x1
      // 80: putfield com/finalshell/ui/model/B2.K Lcom/finalshell/core/NI;
      // 83: iload 1
      // 84: ifeq ad
      // 87: iload 1
      // 88: ifeq ad
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 91: athrow
      // 92: ifnonnull a7
      // 95: goto 9c
      // 98: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 9b: athrow
      // 9c: iload 1
      // 9d: ifne 68
      // a0: goto a7
      // a3: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // a6: athrow
      // a7: aload 0
      // a8: aload 2
      // a9: putfield com/finalshell/ui/model/B2.A Lcom/finalshell/core/NI;
      // ac: aload 2
      // ad: areturn
   }

   @Override
   public void remove() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: getfield com/finalshell/ui/model/B2.A Lcom/finalshell/core/NI;
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 15: athrow
      // 16: new java/lang/IllegalStateException
      // 19: dup
      // 1a: invokespecial java/lang/IllegalStateException.<init> ()V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/ui/model/B2.O Lcom/finalshell/util/Xy4;
      // 26: iload 1
      // 27: ifeq 4e
      // 2a: getfield com/finalshell/util/Xy4.b I
      // 2d: aload 0
      // 2e: getfield com/finalshell/ui/model/B2.L I
      // 31: if_icmpeq 47
      // 34: goto 3b
      // 37: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 3a: athrow
      // 3b: new java/util/ConcurrentModificationException
      // 3e: dup
      // 3f: invokespecial java/util/ConcurrentModificationException.<init> ()V
      // 42: athrow
      // 43: invokestatic com/finalshell/ui/model/B2.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/finalshell/ui/model/B2.A Lcom/finalshell/core/NI;
      // 4b: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 4e: astore 2
      // 4f: aload 0
      // 50: aconst_null
      // 51: putfield com/finalshell/ui/model/B2.A Lcom/finalshell/core/NI;
      // 54: aload 0
      // 55: getfield com/finalshell/ui/model/B2.O Lcom/finalshell/util/Xy4;
      // 58: aload 2
      // 59: invokevirtual com/finalshell/util/Xy4.O (Ljava/lang/Object;)Lcom/finalshell/core/NI;
      // 5c: pop
      // 5d: aload 0
      // 5e: aload 0
      // 5f: getfield com/finalshell/ui/model/B2.O Lcom/finalshell/util/Xy4;
      // 62: getfield com/finalshell/util/Xy4.b I
      // 65: putfield com/finalshell/ui/model/B2.L I
      // 68: return
   }

   public static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}





