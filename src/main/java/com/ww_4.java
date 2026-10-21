package com;

import java.util.Iterator;

class ww_4 implements Iterator {
   private int p;
   final j_2 E;
   private static final String a;

   ww_4(j_2 var1) {
      this.E = var1;
      this.p = j_2.C(this.E);
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
      // 00: invokestatic com/j_2.P ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/ww_4.p I
      // 08: aload 0
      // 09: getfield com/ww_4.E Lcom/j_2;
      // 0c: invokestatic com/j_2.j (Lcom/j_2;)[C
      // 0f: arraylength
      // 10: iload 1
      // 11: ifne 43
      // 14: if_icmpge 4a
      // 17: goto 1e
      // 1a: invokestatic com/ww_4.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/ww_4.p I
      // 22: iload 1
      // 23: ifne 47
      // 26: goto 2d
      // 29: invokestatic com/ww_4.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/ww_4.E Lcom/j_2;
      // 31: invokestatic com/j_2.C (Lcom/j_2;)I
      // 34: aload 0
      // 35: getfield com/ww_4.E Lcom/j_2;
      // 38: invokestatic com/j_2.a (Lcom/j_2;)I
      // 3b: iadd
      // 3c: goto 43
      // 3f: invokestatic com/ww_4.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 42: athrow
      // 43: if_icmpge 4a
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public Character k() {
      return j_2.j(this.E)[this.p];
   }

   @Override
   public void remove() {
      throw new IllegalStateException(a);
   }

   @Override
   public Object next() {
      return this.k();
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u000eAq?SG/(MpnBG;?Or8E\u0012;+Em".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 47;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      } else {
         var6 = 47;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 98;
               break;
            case 1:
               var23 = 15;
               break;
            case 2:
               var23 = 48;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 8;
               break;
            case 5:
               var23 = 72;
               break;
            default:
               var23 = 114;
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





