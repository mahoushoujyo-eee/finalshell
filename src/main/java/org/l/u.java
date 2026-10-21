package org.l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class u implements Iterator {
   private final Iterator D;
   private Iterator E = Collections.emptyList().iterator();
   private static final String a;

   public u(Iterator[] var1) {
      this.D = Arrays.asList(var1).iterator();
   }

   public u(Collection[] var1) {
      this.D = Arrays.asList(var1).iterator();
   }

   public u(Object[][] var1) {
      this.D = Arrays.asList(var1).iterator();
   }

   public u(Collection var1) {
      this.D = var1.iterator();
   }

   public u(Iterator var1) {
      this.D = var1;
   }

   public u(Object[] var1) {
      this.D = Arrays.asList(var1).iterator();
   }

   public u(Object var1, Collection var2) {
      this.D = Arrays.asList(new Object[]{var1}, var2).iterator();
   }

   public u(Collection var1, Object var2) {
      this.D = Arrays.asList(var1, new Object[]{var2}).iterator();
   }

   public u(Object var1, Iterator var2) {
      this.D = Arrays.asList(new Object[]{var1}, var2).iterator();
   }

   public u(Iterator param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/l/F.s ()Z
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: istore 3
      // 08: aload 0
      // 09: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: putfield org/l/u.E Ljava/util/Iterator;
      // 14: aload 0
      // 15: bipush 2
      // 16: anewarray 4
      // 19: dup
      // 1a: bipush 0
      // 1b: aload 1
      // 1c: aastore
      // 1d: dup
      // 1e: bipush 1
      // 1f: bipush 1
      // 20: anewarray 4
      // 23: dup
      // 24: bipush 0
      // 25: aload 2
      // 26: aastore
      // 27: aastore
      // 28: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 2b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 30: putfield org/l/u.D Ljava/util/Iterator;
      // 33: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 36: ifnull 50
      // 39: iload 3
      // 3a: ifeq 4c
      // 3d: goto 44
      // 40: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 43: athrow
      // 44: bipush 0
      // 45: goto 4d
      // 48: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: invokestatic org/l/F.u (Z)V
      // 50: return
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
      // 00: invokestatic org/l/F.s ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield org/l/u.E Ljava/util/Iterator;
      // 08: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d: ifeq 21
      // 10: bipush 1
      // 11: iload 1
      // 12: ifeq 35
      // 15: goto 1c
      // 18: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 1b: athrow
      // 1c: ireturn
      // 1d: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 20: athrow
      // 21: aload 0
      // 22: getfield org/l/u.D Ljava/util/Iterator;
      // 25: iload 1
      // 26: ifeq 47
      // 29: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2e: goto 35
      // 31: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 34: athrow
      // 35: ifne 3e
      // 38: bipush 0
      // 39: ireturn
      // 3a: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield org/l/u.D Ljava/util/Iterator;
      // 42: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47: astore 2
      // 48: aload 2
      // 49: instanceof java/util/Iterator
      // 4c: iload 1
      // 4d: ifeq 73
      // 50: ifeq 68
      // 53: goto 5a
      // 56: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 59: athrow
      // 5a: aload 2
      // 5b: checkcast java/util/Iterator
      // 5e: astore 3
      // 5f: aload 0
      // 60: aload 3
      // 61: putfield org/l/u.E Ljava/util/Iterator;
      // 64: iload 1
      // 65: ifne ee
      // 68: aload 2
      // 69: instanceof java/util/Collection
      // 6c: goto 73
      // 6f: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 72: athrow
      // 73: iload 1
      // 74: ifeq aa
      // 77: ifeq 94
      // 7a: goto 81
      // 7d: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 80: athrow
      // 81: aload 2
      // 82: checkcast java/util/Collection
      // 85: astore 3
      // 86: aload 0
      // 87: aload 3
      // 88: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 8d: putfield org/l/u.E Ljava/util/Iterator;
      // 90: iload 1
      // 91: ifne ee
      // 94: aload 2
      // 95: iload 1
      // 96: ifeq ae
      // 99: goto a0
      // 9c: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 9f: athrow
      // a0: instanceof [Ljava/lang/Object;
      // a3: goto aa
      // a6: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // a9: athrow
      // aa: ifeq c3
      // ad: aload 2
      // ae: checkcast [Ljava/lang/Object;
      // b1: astore 3
      // b2: aload 0
      // b3: aload 3
      // b4: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // b7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // bc: putfield org/l/u.E Ljava/util/Iterator;
      // bf: iload 1
      // c0: ifne ee
      // c3: new org/P
      // c6: dup
      // c7: new java/lang/StringBuilder
      // ca: dup
      // cb: invokespecial java/lang/StringBuilder.<init> ()V
      // ce: getstatic org/l/u.a Ljava/lang/String;
      // d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d4: aload 2
      // d5: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // d8: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // de: ldc "\""
      // e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e6: invokespecial org/P.<init> (Ljava/lang/String;)V
      // e9: athrow
      // ea: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // ed: athrow
      // ee: goto 04
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
      // 00: invokestatic org/l/F.G ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 26
      // 09: invokevirtual org/l/u.hasNext ()Z
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 15: athrow
      // 16: aload 0
      // 17: getfield org/l/u.E Ljava/util/Iterator;
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: goto 26
      // 22: invokestatic org/l/u.a (Lorg/P;)Lorg/P;
      // 25: athrow
      // 26: areturn
      // 27: new java/util/NoSuchElementException
      // 2a: dup
      // 2b: invokespecial java/util/NoSuchElementException.<init> ()V
      // 2e: athrow
   }

   @Override
   public void remove() {
      this.E.remove();
   }

   private static org.P a(org.P var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "_'# UJ1~,\"x@C7g,(,\u0005[+z,fz".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 119;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 119;
         var10006 = var0;
      } else {
         var6 = 119;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 119;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 125;
               break;
            case 1:
               var23 = 62;
               break;
            case 2:
               var23 = 49;
               break;
            case 3:
               var23 = 47;
               break;
            case 4:
               var23 = 82;
               break;
            case 5:
               var23 = 88;
               break;
            default:
               var23 = 37;
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





