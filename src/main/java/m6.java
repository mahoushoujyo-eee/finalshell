import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class m6 {
   HashMap M;
   U s;
   ArrayList I;
   boolean O;
   static U d;
   U K;
   private static final long a;

   public m6() {
      com.c.c(439877715338463110L).set(this, new HashMap());
      com.c.c(523021799336508930L).set(this, new ArrayList());
      com.c.c(503243291355298476L).setBoolean(this, false);
      com.c.c(362106988670708490L).set(this, null);
   }

   void H() {
      long var1 = System.currentTimeMillis();
      Object[] var10001 = com.c.a(true);
      Method var10003 = com.c.d(561698688134982306L);
      Object[] var10002 = var10001;
      m6 var10 = this;
      Method var10000 = var10003;

      try {
         var7 = (U)var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      U var3 = var7;
      Method var8 = (Method)com.c.c(388376917454860932L).get(null);
      var10001 = com.c.a(new b7_2(this, var3));
      var10003 = com.c.d(434592463220957006L);
      var10002 = var10001;
      var10001 = var8;
      var8 = var10003;

      try {
         var8.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1 = System.currentTimeMillis();
   }

   public int Q() {
      return ((HashMap)com.c.c(439877715338463110L).get(this)).size();
   }

   public void o(U var1) {
      synchronized ((HashMap)com.c.c(439877715338463110L).get(this)) {
         HashMap var10000 = (HashMap)com.c.c(439877715338463110L).get(this);
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(546839558529065481L);
         Object[] var10003 = var10002;
         U var7 = var1;
         Method var10001 = var10004;

         try {
            var6 = (Integer)var10001.invoke(var7, var10003);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10000.remove(var6);
         ((ArrayList)com.c.c(523021799336508930L).get(this)).remove(var1);
      }
   }

   public static void M() {
      com.c.c(476072002709934783L).set(null, new U());
   }

   public U A(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic F8.y ()[Ljava/lang/String;
      // 003: invokestatic java/lang/System.currentTimeMillis ()J
      // 006: lstore 3
      // 007: astore 2
      // 008: aload 0
      // 009: aload 2
      // 00a: ifnonnull 07f
      // 00d: ldc2_w 503243291355298476
      // 010: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 013: swap
      // 014: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 017: ifne 077
      // 01a: goto 021
      // 01d: invokestatic m6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 020: athrow
      // 021: ldc2_w 476072002709934783
      // 024: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 027: aconst_null
      // 028: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02b: checkcast U
      // 02e: ifnonnull 050
      // 031: goto 038
      // 034: invokestatic m6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 037: athrow
      // 038: getstatic m6.a J
      // 03b: invokestatic java/lang/Thread.sleep (J)V
      // 03e: aload 2
      // 03f: ifnonnull 073
      // 042: goto 021
      // 045: astore 5
      // 047: aload 5
      // 049: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 04c: aload 2
      // 04d: ifnull 021
      // 050: aload 0
      // 051: ldc2_w 476072002709934783
      // 054: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 057: aconst_null
      // 058: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05b: ldc2_w 362106988670708490
      // 05e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 061: dup_x2
      // 062: pop
      // 063: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 066: aload 0
      // 067: bipush 1
      // 068: ldc2_w 503243291355298476
      // 06b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 06e: dup_x2
      // 06f: pop
      // 070: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 073: aload 2
      // 074: ifnull 091
      // 077: aload 0
      // 078: goto 07f
      // 07b: invokestatic m6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 07e: athrow
      // 07f: new U
      // 082: dup
      // 083: invokespecial U.<init> ()V
      // 086: ldc2_w 362106988670708490
      // 089: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 091: aload 0
      // 092: ldc2_w 362106988670708490
      // 095: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 098: swap
      // 099: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 09c: iload 1
      // 09d: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 0a0: ldc2_w 559877563028151545
      // 0a3: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0a6: dup_x2
      // 0a7: pop
      // 0a8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ab: pop
      // 0ac: goto 0b3
      // 0af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b6: lstore 5
      // 0b8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0bb: ldc2_w 270389152141252877
      // 0be: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0c1: swap
      // 0c2: aconst_null
      // 0c3: swap
      // 0c4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c7: goto 0ce
      // 0ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: pop
      // 0cf: ldc2_w 388376917454860932
      // 0d2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d5: aconst_null
      // 0d6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d9: new gm_2
      // 0dc: dup
      // 0dd: aload 0
      // 0de: iload 1
      // 0df: invokespecial gm_2.<init> (Lm6;Z)V
      // 0e2: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e5: ldc2_w 434592463220957006
      // 0e8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0f0: pop
      // 0f1: goto 0f8
      // 0f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: ldc2_w 439877715338463110
      // 0fc: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ff: swap
      // 100: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 103: checkcast java/util/HashMap
      // 106: dup
      // 107: astore 7
      // 109: monitorenter
      // 10a: aload 0
      // 10b: ldc2_w 439877715338463110
      // 10e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 111: swap
      // 112: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 115: checkcast java/util/HashMap
      // 118: aload 0
      // 119: ldc2_w 362106988670708490
      // 11c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 11f: swap
      // 120: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 123: invokestatic com/c.f ()[Ljava/lang/Object;
      // 126: ldc2_w 546839558529065481
      // 129: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 131: checkcast java/lang/Integer
      // 134: invokevirtual java/lang/Integer.intValue ()I
      // 137: goto 13e
      // 13a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 141: aload 0
      // 142: ldc2_w 362106988670708490
      // 145: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 148: swap
      // 149: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 14c: checkcast U
      // 14f: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 152: pop
      // 153: aload 7
      // 155: monitorexit
      // 156: goto 161
      // 159: astore 8
      // 15b: aload 7
      // 15d: monitorexit
      // 15e: aload 8
      // 160: athrow
      // 161: aload 0
      // 162: aload 0
      // 163: ldc2_w 362106988670708490
      // 166: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 169: swap
      // 16a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 16d: ldc2_w 169739906864728121
      // 170: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 173: dup_x2
      // 174: pop
      // 175: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 178: aload 0
      // 179: ldc2_w 362106988670708490
      // 17c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 17f: swap
      // 180: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 183: checkcast U
      // 186: areturn
   }

   HashMap B() {
      return (HashMap)((HashMap)com.c.c(439877715338463110L).get(this)).clone();
   }

   public void e(tk_4 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(263176406875877964L);
      Object[] var10002 = var10001;
      m6 var11 = this;
      Method var10000 = var10003;

      try {
         var8 = (HashMap)var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      HashMap var3 = var8;
      String[] var9 = F8.y();
      Iterator var4 = var3.keySet().iterator();
      String[] var2 = var9;

      while (var4.hasNext()) {
         U var5 = (U)var3.get(var4.next());
         var10001 = com.c.a(var5);
         var10003 = com.c.d(234066957994220700L);
         var10002 = var10001;
         tk_4 var13 = var1;
         var10000 = var10003;

         try {
            var10000.invoke(var13, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void w(String var1) {
      Object[] var10001 = com.c.a(new fo_4(this));
      Method var10003 = com.c.d(442259795076941885L);
      Object[] var10002 = var10001;
      m6 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void S() {
      Object[] var10001 = com.c.a(new VR(this));
      Method var10003 = com.c.d(442259795076941885L);
      Object[] var10002 = var10001;
      m6 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public U D() {
      return (U)com.c.c(169739906864728121L).get(this);
   }

   public U W() {
      String[] var1 = F8.y();
      m6 var10000 = this;
      if (var1 == null) {
         if (((ArrayList)com.c.c(523021799336508930L).get(this)).size() > 0) {
            com.c.c(169739906864728121L)
               .set(this, (U)((ArrayList)com.c.c(523021799336508930L).get(this)).get(((ArrayList)com.c.c(523021799336508930L).get(this)).size() - 1));
         }

         var10000 = this;
      }

      return (U)com.c.c(169739906864728121L).get(var10000);
   }

   public void l(U var1) {
      ((ArrayList)com.c.c(523021799336508930L).get(this)).remove(var1);
      ((ArrayList)com.c.c(523021799336508930L).get(this)).add(var1);
      com.c.c(169739906864728121L).set(this, var1);
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 6554860807117375401L;
      long var10002 = 6554860807117375402L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





