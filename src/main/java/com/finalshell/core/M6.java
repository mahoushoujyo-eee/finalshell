package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.B72;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class M6 {
   public HashMap M;
   public com.finalshell.ui.frame.U s;
   public ArrayList I;
   public boolean O;
   public static com.finalshell.ui.frame.U d;
   public com.finalshell.ui.frame.U K;
   public static long a;

   public M6() {
      HashMap var10001 = new HashMap();
      long var2 = 439877715338463110L;
      HashMap var1 = var10001;
      Ref.s(439877715338463110L, var1, var2);
      ArrayList var10002 = new ArrayList();
      long var4 = 523021799336508930L;
      ArrayList var3 = var10002;
      Ref.s(523021799336508930L, var3, var4);
      Registry.lookupField(503243291355298476L).setBoolean(this, false);
      long var6 = 362106988670708490L;
      Object var5 = null;
      Ref.s(362106988670708490L, var5, var6);
   }

   public void H() {
      long var1 = System.currentTimeMillis();
      Object[] var10001 = Registry.packArgs(true);
      long var5 = 561698688134982306L;
      Object[] var4 = var10001;
      var10001 = Ref.h(561698688134982306L, var4, var5);

      try {
         var10001 = (com.finalshell.ui.frame.U)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      com.finalshell.ui.frame.U var3 = var10001;
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10002 = Registry.packArgs(new B72(this, var3));
      long var7 = 434592463220957006L;
      Object[] var6 = var10002;
      Ref.h(434592463220957006L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var1 = System.currentTimeMillis();
   }

   public int Q() {
      Object var1 = 439877715338463110L;
      return ((HashMap)Ref.g(439877715338463110L, var1)).size();
   }

   public void o(com.finalshell.ui.frame.U var1) {
      Object var4 = 439877715338463110L;
      synchronized ((HashMap)Ref.g(439877715338463110L, var4)) {
         Object var6 = 439877715338463110L;
         HashMap var10002 = (HashMap)Ref.g(439877715338463110L, var6);
         Object[] var10004 = Registry.emptyArgs();
         long var9 = 546839558529065481L;
         Object[] var8 = var10004;
         var10004 = Ref.h(546839558529065481L, var8, var9);

         try {
            var15 = (Integer)var10004;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         var1.remove(var15);
         Object var10 = 523021799336508930L;
         ((ArrayList)Ref.g(523021799336508930L, var10)).remove(var1);
      }
   }

   public static void M() {
      Registry.lookupField(476072002709934783L).set(null, new com.finalshell.ui.frame.U());
   }

   public com.finalshell.ui.frame.U A(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: invokestatic java/lang/System.currentTimeMillis ()J
      // 006: lstore 3
      // 007: astore 2
      // 008: aload 0
      // 009: aload 2
      // 00a: ifnonnull 085
      // 00d: ldc2_w 503243291355298476
      // 010: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 013: swap
      // 014: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 017: ifne 07d
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/M6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 020: athrow
      // 021: ldc2_w 476072002709934783
      // 024: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 027: aconst_null
      // 028: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02b: checkcast com/finalshell/ui/frame/U
      // 02e: ifnonnull 050
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/M6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 037: athrow
      // 038: getstatic com/finalshell/core/M6.a J
      // 03b: invokestatic java/lang/Thread.sleep (J)V
      // 03e: aload 2
      // 03f: ifnonnull 079
      // 042: goto 021
      // 045: astore 5
      // 047: aload 5
      // 049: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 04c: aload 2
      // 04d: ifnull 021
      // 050: aload 0
      // 051: ldc2_w 476072002709934783
      // 054: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 057: aconst_null
      // 058: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05b: ldc2_w 362106988670708490
      // 05e: astore 10
      // 060: astore 9
      // 062: ldc2_w 362106988670708490
      // 065: aload 9
      // 067: aload 10
      // 069: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 06c: aload 0
      // 06d: bipush 1
      // 06e: ldc2_w 503243291355298476
      // 071: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 074: dup_x2
      // 075: pop
      // 076: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 079: aload 2
      // 07a: ifnull 09d
      // 07d: aload 0
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/M6.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 084: athrow
      // 085: new com/finalshell/ui/frame/U
      // 088: dup
      // 089: invokespecial com/finalshell/ui/frame/U.<init> ()V
      // 08c: ldc2_w 362106988670708490
      // 08f: astore 12
      // 091: astore 11
      // 093: ldc2_w 362106988670708490
      // 096: aload 11
      // 098: aload 12
      // 09a: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 09d: aload 0
      // 09e: ldc2_w 362106988670708490
      // 0a1: astore 13
      // 0a3: ldc2_w 362106988670708490
      // 0a6: aload 13
      // 0a8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ab: iload 1
      // 0ac: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0af: ldc2_w 559877563028151545
      // 0b2: astore 16
      // 0b4: astore 15
      // 0b6: ldc2_w 559877563028151545
      // 0b9: aload 15
      // 0bb: aload 16
      // 0bd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c0: pop
      // 0c1: goto 0c8
      // 0c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: invokestatic java/lang/System.currentTimeMillis ()J
      // 0cb: lstore 5
      // 0cd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d0: ldc2_w 270389152141252877
      // 0d3: astore 17
      // 0d5: ldc2_w 270389152141252877
      // 0d8: aload 17
      // 0da: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0dd: goto 0e4
      // 0e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: pop
      // 0e5: ldc2_w 388376917454860932
      // 0e8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0eb: aconst_null
      // 0ec: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ef: new com/finalshell/task/Gm2
      // 0f2: dup
      // 0f3: aload 0
      // 0f4: iload 1
      // 0f5: invokespecial com/finalshell/task/Gm2.<init> (Lcom/finalshell/core/M6;Z)V
      // 0f8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fb: ldc2_w 434592463220957006
      // 0fe: astore 20
      // 100: astore 19
      // 102: ldc2_w 434592463220957006
      // 105: aload 19
      // 107: aload 20
      // 109: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10c: pop
      // 10d: goto 114
      // 110: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 0
      // 115: ldc2_w 439877715338463110
      // 118: astore 21
      // 11a: ldc2_w 439877715338463110
      // 11d: aload 21
      // 11f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 122: checkcast java/util/HashMap
      // 125: dup
      // 126: astore 7
      // 128: monitorenter
      // 129: aload 0
      // 12a: ldc2_w 439877715338463110
      // 12d: astore 23
      // 12f: ldc2_w 439877715338463110
      // 132: aload 23
      // 134: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 137: checkcast java/util/HashMap
      // 13a: aload 0
      // 13b: ldc2_w 362106988670708490
      // 13e: astore 25
      // 140: ldc2_w 362106988670708490
      // 143: aload 25
      // 145: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 148: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14b: ldc2_w 546839558529065481
      // 14e: astore 28
      // 150: astore 27
      // 152: ldc2_w 546839558529065481
      // 155: aload 27
      // 157: aload 28
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: checkcast java/lang/Integer
      // 15f: invokevirtual java/lang/Integer.intValue ()I
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: aload 0
      // 16d: ldc2_w 362106988670708490
      // 170: astore 29
      // 172: ldc2_w 362106988670708490
      // 175: aload 29
      // 177: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17a: checkcast com/finalshell/ui/frame/U
      // 17d: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 180: pop
      // 181: aload 7
      // 183: monitorexit
      // 184: goto 18f
      // 187: astore 8
      // 189: aload 7
      // 18b: monitorexit
      // 18c: aload 8
      // 18e: athrow
      // 18f: aload 0
      // 190: aload 0
      // 191: ldc2_w 362106988670708490
      // 194: astore 31
      // 196: ldc2_w 362106988670708490
      // 199: aload 31
      // 19b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19e: ldc2_w 169739906864728121
      // 1a1: astore 34
      // 1a3: astore 33
      // 1a5: ldc2_w 169739906864728121
      // 1a8: aload 33
      // 1aa: aload 34
      // 1ac: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1af: aload 0
      // 1b0: ldc2_w 362106988670708490
      // 1b3: astore 35
      // 1b5: ldc2_w 362106988670708490
      // 1b8: aload 35
      // 1ba: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1bd: checkcast com/finalshell/ui/frame/U
      // 1c0: areturn
   }

   public HashMap B() {
      Object var2 = 439877715338463110L;
      return (HashMap)((HashMap)Ref.g(439877715338463110L, var2)).clone();
   }

   public void e(Tk4 var1) {
      HashMap var10001 = (HashMap)(Registry.emptyArgs());
      long var7 = 263176406875877964L;
      Object[] var6 = var10001;
      var10001 = Ref.h(263176406875877964L, var6, var7);

      try {
         var10001 = (HashMap)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      HashMap var3 = var10001;
      String[] var14 = com.finalshell.ui.panel.F8.y();
      Iterator var4 = var3.keySet().iterator();
      String[] var2 = var14;

      while (var4.hasNext()) {
         com.finalshell.ui.frame.U var5 = (com.finalshell.ui.frame.U)var3.get(var4.next());
         Object[] var10002 = Registry.packArgs(var5);
         long var9 = 234066957994220700L;
         Object[] var8 = var10002;
         Ref.h(234066957994220700L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void w(String var1) {
      Object[] var10001 = Registry.packArgs(new Fo4(this));
      long var3 = 442259795076941885L;
      Object[] var2 = var10001;
      Ref.h(442259795076941885L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void S() {
      Object[] var10001 = Registry.packArgs(new VR(this));
      long var2 = 442259795076941885L;
      Object[] var1 = var10001;
      Ref.h(442259795076941885L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public com.finalshell.ui.frame.U D() {
      Object var1 = 169739906864728121L;
      return (com.finalshell.ui.frame.U)Ref.g(169739906864728121L, var1);
   }

   public com.finalshell.ui.frame.U W() {
      String[] var1 = com.finalshell.ui.panel.F8.y();
      if (var1 == null) {
         Object var2 = 523021799336508930L;
         if (((ArrayList)Ref.g(523021799336508930L, var2)).size() > 0) {
            Object var4 = 523021799336508930L;
            ArrayList var10003 = (ArrayList)Ref.g(523021799336508930L, var4);
            Object var6 = 523021799336508930L;
            com.finalshell.ui.frame.U var10004 = (com.finalshell.ui.frame.U)this.get(((ArrayList)Ref.g(523021799336508930L, var6)).size() - 1);
            long var9 = 169739906864728121L;
            com.finalshell.ui.frame.U var8 = var10004;
            Ref.s(169739906864728121L, var8, var9);
         }
      }

      Object var10 = 169739906864728121L;
      return (com.finalshell.ui.frame.U)Ref.g(169739906864728121L, var10);
   }

   public void l(com.finalshell.ui.frame.U var1) {
      Object var2 = 523021799336508930L;
      ((ArrayList)Ref.g(523021799336508930L, var2)).remove(var1);
      Object var4 = 523021799336508930L;
      ((ArrayList)Ref.g(523021799336508930L, var4)).add(var1);
      long var7 = 169739906864728121L;
      Ref.s(169739906864728121L, var1, var7);
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6554860807117375401L;
      long var10002 = 6554860807117375402L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





