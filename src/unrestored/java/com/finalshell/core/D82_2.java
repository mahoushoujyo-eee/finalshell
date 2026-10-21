package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class D82_2 {
   public Thread K;
   public ArrayList l;
   public ArrayList b;
   public ThreadPoolExecutor f;
   public ArrayList g;
   public static String c;
   public static long[] a;
   public static Integer[] d;
   public static long e;

   public D82_2() {
      ArrayList var10001 = new ArrayList();
      long var3 = 602098013160617303L;
      ArrayList var2 = var10001;
      Ref.s(602098013160617303L, var2, var3);
      ArrayList var10002 = new ArrayList();
      long var5 = 506247411018488204L;
      ArrayList var4 = var10002;
      Ref.s(506247411018488204L, var4, var5);
      ArrayList var10003 = new ArrayList();
      long var7 = 242797524627253281L;
      ArrayList var6 = var10003;
      Ref.s(242797524627253281L, var6, var7);
      SynchronousQueue var1 = new SynchronousQueue();
      ThreadPoolExecutor var10004 = new ThreadPoolExecutor(a(10105, 8523259108155111408L), a(186, 8351325949674262578L), e, TimeUnit.MILLISECONDS, var1);
      long var9 = 242191247135395792L;
      ThreadPoolExecutor var8 = var10004;
      Ref.s(242191247135395792L, var8, var9);
      com.finalshell.task.Ue2 var10005 = new com.finalshell.task.Ue2(this);
      long var11 = 170196379106653716L;
      com.finalshell.task.Ue2 var10 = var10005;
      Ref.s(170196379106653716L, var10, var11);
      Object var12 = 170196379106653716L;
      ((Thread)Ref.g(170196379106653716L, var12)).start();
   }

   public synchronized void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/D82_2.Q ()Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 242797524627253281
      // 007: astore 4
      // 009: ldc2_w 242797524627253281
      // 00c: aload 4
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast java/util/ArrayList
      // 014: invokevirtual java/util/ArrayList.clear ()V
      // 017: astore 1
      // 018: aload 0
      // 019: ldc2_w 602098013160617303
      // 01c: astore 6
      // 01e: ldc2_w 602098013160617303
      // 021: aload 6
      // 023: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 026: checkcast java/util/ArrayList
      // 029: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 02c: astore 3
      // 02d: aload 1
      // 02e: ifnull 158
      // 031: aload 3
      // 032: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 037: checkcast com/finalshell/core/GH_2
      // 03a: astore 2
      // 03b: aload 2
      // 03c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03f: ldc2_w 206226757312698766
      // 042: astore 9
      // 044: astore 8
      // 046: ldc2_w 206226757312698766
      // 049: aload 8
      // 04b: aload 9
      // 04d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 050: checkcast java/lang/Boolean
      // 053: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 056: goto 05d
      // 059: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 1
      // 05e: ifnonnull 15e
      // 061: ifne 158
      // 064: invokestatic java/lang/System.currentTimeMillis ()J
      // 067: aload 2
      // 068: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06b: ldc2_w 449057115245158516
      // 06e: astore 11
      // 070: astore 10
      // 072: ldc2_w 449057115245158516
      // 075: aload 10
      // 077: aload 11
      // 079: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07c: checkcast java/lang/Long
      // 07f: invokevirtual java/lang/Long.longValue ()J
      // 082: goto 089
      // 085: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 088: athrow
      // 089: lcmp
      // 08a: aload 1
      // 08b: ifnonnull 15e
      // 08e: iflt 158
      // 091: aload 2
      // 092: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 095: ldc2_w 140051292629163334
      // 098: astore 13
      // 09a: astore 12
      // 09c: ldc2_w 140051292629163334
      // 09f: aload 12
      // 0a1: aload 13
      // 0a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a6: checkcast java/lang/Integer
      // 0a9: invokevirtual java/lang/Integer.intValue ()I
      // 0ac: goto 0b3
      // 0af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: ifnonnull 100
      // 0b7: ldc2_w 171346713126145274
      // 0ba: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bd: aconst_null
      // 0be: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0c1: if_icmpne 0da
      // 0c4: aload 0
      // 0c5: ldc2_w 242797524627253281
      // 0c8: astore 14
      // 0ca: ldc2_w 242797524627253281
      // 0cd: aload 14
      // 0cf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d2: checkcast java/util/ArrayList
      // 0d5: aload 2
      // 0d6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0d9: pop
      // 0da: aload 2
      // 0db: aload 1
      // 0dc: ifnonnull 11e
      // 0df: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e2: ldc2_w 434390456563867566
      // 0e5: astore 17
      // 0e7: astore 16
      // 0e9: ldc2_w 434390456563867566
      // 0ec: aload 16
      // 0ee: aload 17
      // 0f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f3: checkcast java/lang/Boolean
      // 0f6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: ifeq 11d
      // 103: aload 0
      // 104: ldc2_w 242797524627253281
      // 107: astore 18
      // 109: ldc2_w 242797524627253281
      // 10c: aload 18
      // 10e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 111: checkcast java/util/ArrayList
      // 114: aload 2
      // 115: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 118: pop
      // 119: aload 1
      // 11a: ifnull 158
      // 11d: aload 2
      // 11e: bipush 1
      // 11f: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 122: ldc2_w 573074163756087155
      // 125: astore 21
      // 127: astore 20
      // 129: ldc2_w 573074163756087155
      // 12c: aload 20
      // 12e: aload 21
      // 130: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 133: pop
      // 134: goto 13b
      // 137: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: ldc2_w 242191247135395792
      // 13f: astore 22
      // 141: ldc2_w 242191247135395792
      // 144: aload 22
      // 146: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 149: checkcast java/util/concurrent/ThreadPoolExecutor
      // 14c: new com/finalshell/task/Fh4
      // 14f: dup
      // 150: aload 0
      // 151: aload 2
      // 152: invokespecial com/finalshell/task/Fh4.<init> (Lcom/finalshell/core/D82_2;Lcom/finalshell/core/GH_2;)V
      // 155: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 158: aload 3
      // 159: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15e: ifne 031
      // 161: aload 0
      // 162: ldc2_w 602098013160617303
      // 165: astore 24
      // 167: ldc2_w 602098013160617303
      // 16a: aload 24
      // 16c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 16f: checkcast java/util/ArrayList
      // 172: aload 0
      // 173: ldc2_w 242797524627253281
      // 176: astore 26
      // 178: ldc2_w 242797524627253281
      // 17b: aload 26
      // 17d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 180: checkcast java/util/ArrayList
      // 183: invokevirtual java/util/ArrayList.removeAll (Ljava/util/Collection;)Z
      // 186: pop
      // 187: aload 1
      // 188: ifnonnull 158
      // 18b: return
   }

   public void J(Runnable var1) {
      Object var2 = 242191247135395792L;
      ((ThreadPoolExecutor)Ref.g(242191247135395792L, var2)).execute(var1);
   }

   public synchronized GH_2 W(Runnable var1, int var2) {
      GH_2 var3 = new GH_2(var1, ((Integer)Ref.g(171346713126145274L, null)).intValue());
      Object[] var10001 = Registry.packArgs(var2);
      long var5 = 430080285622242540L;
      Object[] var4 = var10001;
      Ref.h(430080285622242540L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }

      Object[] var10002 = Registry.e(System.currentTimeMillis() + (long)var2);
      long var7 = 231959045328111640L;
      Object[] var6 = var10002;
      Ref.h(231959045328111640L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }

      Object var8 = 602098013160617303L;
      ((ArrayList)Ref.g(602098013160617303L, var8)).add(var3);
      return var3;
   }

   public synchronized GH_2 V(Runnable var1, int var2) {
      GH_2 var3 = new GH_2(var1, ((Integer)Ref.g(439517225992595079L, null)).intValue());
      Object[] var10001 = Registry.packArgs(var2);
      long var5 = 430080285622242540L;
      Object[] var4 = var10001;
      Ref.h(430080285622242540L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }

      Object[] var10002 = Registry.e(System.currentTimeMillis() + (long)var2);
      long var7 = 231959045328111640L;
      Object[] var6 = var10002;
      Ref.h(231959045328111640L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }

      Object var8 = 602098013160617303L;
      ((ArrayList)Ref.g(602098013160617303L, var8)).add(var3);
      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void E(Runnable[] var1) throws Exception {
      String var10000 = Q();
      ArrayList var3 = new ArrayList();
      String var2 = var10000;
      Runnable[] var7 = var1;
      int var6 = var1.length;
      int var5 = 0;
      if (var2 != null || var5 < var6) {
         do {
            Runnable var4 = var7[var5];
            Object var9 = 242191247135395792L;
            Future var8 = ((ThreadPoolExecutor)Ref.g(242191247135395792L, var9)).submit(var4);
            var3.add(var8);
         } while (++var5 < var6);
      }

      Iterator var14 = var3.iterator();
      if (var2 != null) {
         Future var12 = (Future)var14.next();
         long var15 = System.currentTimeMillis();
         var12.get();
      }

      while (var14.hasNext()) {
         Future var13 = (Future)var14.next();
         long var16 = System.currentTimeMillis();
         var13.get();
      }

      try {
         if (Ky4.F$arrString() != null) {
            U("mN1sNb");
         }
      } catch (Exception var11) {
         throw new RuntimeException(a(var11));
      }
   }

   public ThreadPoolExecutor h() {
      Object var1 = 242191247135395792L;
      return (ThreadPoolExecutor)Ref.g(242191247135395792L, var1);
   }

   public void P(ThreadPoolExecutor var1) {
      long var3 = 242191247135395792L;
      Ref.s(242191247135395792L, var1, var3);
   }

   public static void U(String var0) {
      c = var0;
   }

   public static String Q() {
      return c;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4233;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var2 = 3169038958883167846L;
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "2H\u008b\f¡¨i\u0088\u0002ÍØ\u008d¶LÍ¼";
      int var7 = "2H\u008b\f¡¨i\u0088\u0002ÍØ\u008d¶LÍ¼".length();
      byte var4 = 0;
      U(null);

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var5++;
         long var10004 = (
               ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      d = new Integer[2];
      long var0 = 6768596462281022791L;
      long var10002 = 6768596462281030231L ^ var0;
      byte var11 = -1;
      e = var10002;
   }
}





