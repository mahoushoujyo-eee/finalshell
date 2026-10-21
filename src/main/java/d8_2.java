import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d8_2 {
   Thread K;
   ArrayList l;
   ArrayList b;
   ThreadPoolExecutor f;
   ArrayList g;
   private static String c;
   private static final long[] a;
   private static final Integer[] d;
   private static final long e;

   public d8_2() {
      com.c.c(602098013160617303L).set(this, new ArrayList());
      com.c.c(506247411018488204L).set(this, new ArrayList());
      com.c.c(242797524627253281L).set(this, new ArrayList());
      SynchronousQueue var1 = new SynchronousQueue();
      com.c.c(242191247135395792L)
         .set(this, new ThreadPoolExecutor(a(10105, 8523259108155111408L), a(186, 8351325949674262578L), e, TimeUnit.MILLISECONDS, var1));
      com.c.c(170196379106653716L).set(this, new Ue_2(this));
      ((Thread)com.c.c(170196379106653716L).get(this)).start();
   }

   private synchronized void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic d8_2.Q ()Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 242797524627253281
      // 007: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00a: swap
      // 00b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast java/util/ArrayList
      // 011: invokevirtual java/util/ArrayList.clear ()V
      // 014: astore 1
      // 015: aload 0
      // 016: ldc2_w 602098013160617303
      // 019: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 01c: swap
      // 01d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 020: checkcast java/util/ArrayList
      // 023: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 026: astore 3
      // 027: aload 1
      // 028: ifnull 12b
      // 02b: aload 3
      // 02c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 031: checkcast gH
      // 034: astore 2
      // 035: aload 2
      // 036: invokestatic com/c.f ()[Ljava/lang/Object;
      // 039: ldc2_w 206226757312698766
      // 03c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 03f: dup_x2
      // 040: pop
      // 041: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 044: checkcast java/lang/Boolean
      // 047: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04a: goto 051
      // 04d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 1
      // 052: ifnonnull 131
      // 055: ifne 12b
      // 058: invokestatic java/lang/System.currentTimeMillis ()J
      // 05b: aload 2
      // 05c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 05f: ldc2_w 449057115245158516
      // 062: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 065: dup_x2
      // 066: pop
      // 067: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast java/lang/Long
      // 06d: invokevirtual java/lang/Long.longValue ()J
      // 070: goto 077
      // 073: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 076: athrow
      // 077: lcmp
      // 078: aload 1
      // 079: ifnonnull 131
      // 07c: iflt 12b
      // 07f: aload 2
      // 080: invokestatic com/c.f ()[Ljava/lang/Object;
      // 083: ldc2_w 140051292629163334
      // 086: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 089: dup_x2
      // 08a: pop
      // 08b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 08e: checkcast java/lang/Integer
      // 091: invokevirtual java/lang/Integer.intValue ()I
      // 094: goto 09b
      // 097: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 1
      // 09c: ifnonnull 0df
      // 09f: ldc2_w 171346713126145274
      // 0a2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a5: aconst_null
      // 0a6: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0a9: if_icmpne 0bf
      // 0ac: aload 0
      // 0ad: ldc2_w 242797524627253281
      // 0b0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b3: swap
      // 0b4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b7: checkcast java/util/ArrayList
      // 0ba: aload 2
      // 0bb: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0be: pop
      // 0bf: aload 2
      // 0c0: aload 1
      // 0c1: ifnonnull 0fa
      // 0c4: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0c7: ldc2_w 434390456563867566
      // 0ca: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0cd: dup_x2
      // 0ce: pop
      // 0cf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d2: checkcast java/lang/Boolean
      // 0d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d8: goto 0df
      // 0db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: ifeq 0f9
      // 0e2: aload 0
      // 0e3: ldc2_w 242797524627253281
      // 0e6: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e9: swap
      // 0ea: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ed: checkcast java/util/ArrayList
      // 0f0: aload 2
      // 0f1: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0f4: pop
      // 0f5: aload 1
      // 0f6: ifnull 12b
      // 0f9: aload 2
      // 0fa: bipush 1
      // 0fb: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 0fe: ldc2_w 573074163756087155
      // 101: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 104: dup_x2
      // 105: pop
      // 106: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 109: pop
      // 10a: goto 111
      // 10d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 0
      // 112: ldc2_w 242191247135395792
      // 115: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 118: swap
      // 119: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 11c: checkcast java/util/concurrent/ThreadPoolExecutor
      // 11f: new fh_4
      // 122: dup
      // 123: aload 0
      // 124: aload 2
      // 125: invokespecial fh_4.<init> (Ld8_2;LgH;)V
      // 128: invokevirtual java/util/concurrent/ThreadPoolExecutor.execute (Ljava/lang/Runnable;)V
      // 12b: aload 3
      // 12c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 131: ifne 02b
      // 134: aload 0
      // 135: ldc2_w 602098013160617303
      // 138: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 13b: swap
      // 13c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 13f: checkcast java/util/ArrayList
      // 142: aload 0
      // 143: ldc2_w 242797524627253281
      // 146: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 149: swap
      // 14a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 14d: checkcast java/util/ArrayList
      // 150: invokevirtual java/util/ArrayList.removeAll (Ljava/util/Collection;)Z
      // 153: pop
      // 154: aload 1
      // 155: ifnonnull 12b
      // 158: return
   }

   public void J(Runnable var1) {
      ((ThreadPoolExecutor)com.c.c(242191247135395792L).get(this)).execute(var1);
   }

   public synchronized gH W(Runnable var1, int var2) {
      gH var3 = new gH(var1, com.c.c(171346713126145274L).getInt(null));
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(430080285622242540L);
      Object[] var10002 = var10001;
      gH var7 = var3;
      Method var10000 = var10003;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.e(System.currentTimeMillis() + (long)var2);
      var10003 = com.c.d(231959045328111640L);
      var10002 = var10001;
      gH var9 = var3;
      var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      ((ArrayList)com.c.c(602098013160617303L).get(this)).add(var3);
      return var3;
   }

   public synchronized gH V(Runnable var1, int var2) {
      gH var3 = new gH(var1, com.c.c(439517225992595079L).getInt(null));
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(430080285622242540L);
      Object[] var10002 = var10001;
      gH var7 = var3;
      Method var10000 = var10003;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.e(System.currentTimeMillis() + (long)var2);
      var10003 = com.c.d(231959045328111640L);
      var10002 = var10001;
      gH var9 = var3;
      var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      ((ArrayList)com.c.c(602098013160617303L).get(this)).add(var3);
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
            Future var8 = ((ThreadPoolExecutor)com.c.c(242191247135395792L).get(this)).submit(var4);
            var3.add(var8);
         } while (++var5 < var6);
      }

      Iterator var12 = var3.iterator();
      if (var2 != null) {
         Future var10 = (Future)var12.next();
         long var13 = System.currentTimeMillis();
         var10.get();
      }

      while (var12.hasNext()) {
         Future var11 = (Future)var12.next();
         long var14 = System.currentTimeMillis();
         var11.get();
      }

      try {
         if (com.ky_4.F() != null) {
            U("mN1sNb");
         }
      } catch (Exception var9) {
         throw a(var9);
      }
   }

   public ThreadPoolExecutor h() {
      return (ThreadPoolExecutor)com.c.c(242191247135395792L).get(this);
   }

   public void P(ThreadPoolExecutor var1) {
      com.c.c(242191247135395792L).set(this, var1);
   }

   public static void U(String var0) {
      c = var0;
   }

   public static String Q() {
      return c;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
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
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4233;
      if (d[var3] == null) {
         d[var3] = (int)(a[var3] ^ var1);
      }

      return d[var3];
   }
}





