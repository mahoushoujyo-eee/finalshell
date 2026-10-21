package com.finalshell.ui.model;

import java.util.Iterator;

public class TQ implements Iterator {
   public Iterator j;
   public static String a;

   public TQ(Iterator param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Qm2.J ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: aload 0
      // 08: aconst_null
      // 09: putfield com/finalshell/ui/model/TQ.j Ljava/util/Iterator;
      // 0c: new java/util/LinkedList
      // 0f: dup
      // 10: invokespecial java/util/LinkedList.<init> ()V
      // 13: astore 3
      // 14: astore 2
      // 15: aload 2
      // 16: ifnonnull 2b
      // 19: aload 3
      // 1a: aload 1
      // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 23: pop
      // 24: goto 2b
      // 27: invokestatic com/finalshell/ui/model/TQ.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2a: athrow
      // 2b: aload 1
      // 2c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 31: ifne 19
      // 34: aload 0
      // 35: aload 3
      // 36: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 39: putfield com/finalshell/ui/model/TQ.j Ljava/util/Iterator;
      // 3c: return
   }

   @Override
   public boolean hasNext() {
      return this.j.hasNext();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException(a);
   }

   @Override
   public Object next() {
      return this.j.next();
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "(Gs?\f=\u0012\\N:>I5\u0005Q@t Ut\b\bJh-X;\u0013R".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 36;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 36;
         var10006 = var0;
      } else {
         var6 = 36;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 36;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 88;
            case 1 -> 11;
            case 2 -> 62;
            case 3 -> 104;
            case 4 -> 8;
            case 5 -> 112;
            default -> 69;
         });
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





