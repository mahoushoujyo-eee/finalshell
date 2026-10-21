package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Random;
import org.icmp4j.j;

public class Dw4 {
   public ArrayList N;
   public String U;
   public String j;
   public InetAddress f;
   public RouteTracePanel k;
   public boolean i;
   public Object n;
   public static long[] a;
   public static Integer[] b;
   public static long c;

   public Dw4(RouteTracePanel var1, String var2) {
      ArrayList var10001 = new ArrayList();
      long var4 = 145412445008776377L;
      ArrayList var3 = var10001;
      Ref.s(145412445008776377L, var3, var4);
      Registry.lookupField(175400870153177569L).setBoolean(this, true);
      Object var10002 = new Object();
      long var6 = 210486900701643716L;
      Object var5 = var10002;
      Ref.s(210486900701643716L, var5, var6);
      long var8 = 487072334706875582L;
      Ref.s(487072334706875582L, var1, var8);
      long var10 = 188881920873049499L;
      Ref.s(188881920873049499L, var2, var10);
   }

   public void Q() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Kd2(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public synchronized void Z(int var1, String var2) {
      int[] var3 = L9.X();
      Object var11 = 488976998546483488L;
      if (var3 != null || this.equals((String)Ref.g(488976998546483488L, var11))) {
         if (var3 == null) {
            Object var13 = 145412445008776377L;
            if (!(0 < ((ArrayList)Ref.g(145412445008776377L, var13)).size() - 1)) {
               return;
            }

            boolean var10002 = false;
         }

         ArrayList var5 = new ArrayList();
         Object var15 = 145412445008776377L;
         ArrayList var34 = (ArrayList)Ref.g(145412445008776377L, var15);
         Object var17 = 145412445008776377L;
         L9 var6 = (L9)this.get(((ArrayList)Ref.g(145412445008776377L, var17)).size() - 1);
         String var10004 = (String)(Registry.emptyArgs());
         long var20 = 564648154927582737L;
         Object var19 = var10004;
         var10004 = Ref.h(564648154927582737L, var19, var20);

         try {
            var10004 = (String)var10004;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         String var7 = var10004;
         Object var10005 = Registry.emptyArgs();
         long var22 = 127422501806576014L;
         Object var21 = var10005;
         var10005 = Ref.h(127422501806576014L, var21, var22);

         try {
            var38 = (Integer)var10005;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         int var8 = var38;
         if (var7 != null) {
            int var9 = 1;

            do {
               Object var23 = 145412445008776377L;
               if (!(0 < ((ArrayList)Ref.g(145412445008776377L, var23)).size())) {
                  break;
               }

               Object var25 = 145412445008776377L;
               ArrayList var10007 = (ArrayList)Ref.g(145412445008776377L, var25);
               Object var27 = 145412445008776377L;
               L9 var10 = (L9)this.get(((ArrayList)Ref.g(145412445008776377L, var27)).size() - var9 - 1);
               if (var3 == null) {
                  String var10010 = (String)(Registry.emptyArgs());
                  long var30 = 564648154927582737L;
                  Object var29 = var10010;
                  var10010 = Ref.h(564648154927582737L, var29, var30);

                  try {
                     var10010 = (String)var10010;
                  } catch (InvocationTargetException var31) {
                     throw var31.getTargetException();
                  }

                  if (var10.equals(var10010)) {
                     var5.add(var10);
                     var8--;
                  }

                  var9++;
               }
            } while (var3 == null);
         }
      }
   }

   public synchronized void S() {
      int[] var1 = L9.X();
      Object var9 = 145412445008776377L;
      int var10001 = ((ArrayList)Ref.g(145412445008776377L, var9)).size();
      if (var1 == null) {
         if (var10001 <= 1) {
            return;
         }

         var10001 = 0;
      }

      int var2 = var10001;
      Object var11 = 145412445008776377L;
      ArrayList var10002 = (ArrayList)Ref.g(145412445008776377L, var11);
      Object var13 = 145412445008776377L;
      L9 var3 = (L9)this.get(((ArrayList)Ref.g(145412445008776377L, var13)).size() - 1);
      String var10004 = (String)(Registry.emptyArgs());
      long var16 = 564648154927582737L;
      Object var15 = var10004;
      var10004 = Ref.h(564648154927582737L, var15, var16);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      String var4 = var10004;
      if (var4 != null) {
         Object var10005 = Registry.emptyArgs();
         long var18 = 127422501806576014L;
         Object var17 = var10005;
         var10005 = Ref.h(127422501806576014L, var17, var18);

         try {
            var45 = (Integer)var10005;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         int var5 = var45;
         ArrayList var6 = new ArrayList();
         int var7 = 1;

         label97: {
            do {
               Object var19 = 145412445008776377L;
               if (!(0 < ((ArrayList)Ref.g(145412445008776377L, var19)).size())) {
                  break;
               }

               Object var21 = 145412445008776377L;
               ArrayList var10007 = (ArrayList)Ref.g(145412445008776377L, var21);
               Object var23 = 145412445008776377L;
               L9 var8 = (L9)this.get(((ArrayList)Ref.g(145412445008776377L, var23)).size() - var7 - 1);
               if (var1 != null) {
                  break label97;
               }

               if (var1 == null) {
                  String var10010 = (String)(Registry.emptyArgs());
                  long var26 = 564648154927582737L;
                  Object var25 = var10010;
                  var10010 = Ref.h(564648154927582737L, var25, var26);

                  try {
                     var10010 = (String)var10010;
                  } catch (InvocationTargetException var37) {
                     throw var37.getTargetException();
                  }

                  if (var8.equals(var10010)) {
                     var6.add(var8);
                     var5--;
                  }

                  var7++;
               }
            } while (var1 == null);

            Object[] var46 = Registry.packArgs(var5);
            long var28 = 551056457079808348L;
            Object[] var27 = var46;
            Ref.h(551056457079808348L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var36) {
               throw var36.getTargetException();
            }
         }

         for (L9 var41 : var6) {
            Object var29 = 145412445008776377L;
            ((ArrayList)Ref.g(145412445008776377L, var29)).remove(var41);
            var2 = 1;
            if (var1 != null) {
               return;
            }

            if (var1 != null) {
               break;
            }
         }

         if (var2 != 0) {
            Object var31 = 487072334706875582L;
            Ref.g(487072334706875582L, var31);
            Object[] var49 = Registry.emptyArgs();
            long var34 = 206535674231405864L;
            Object[] var33 = var49;
            Ref.h(206535674231405864L, var33, var34);

            try {
               ;
            } catch (InvocationTargetException var35) {
               throw var35.getTargetException();
            }
         }
      }
   }

   public void f(L9 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var8 = 127422501806576014L;
      Object[] var7 = var10001;
      var10001 = Ref.h(127422501806576014L, var7, var8);

      try {
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      int var3 = Math.abs(new Random().nextInt(a(14120, 6740195840310472513L)));
      Object var10002 = Registry.emptyArgs();
      long var10 = 127422501806576014L;
      Object var9 = var10002;
      var10002 = Ref.h(127422501806576014L, var9, var10);

      try {
         var24 = (Integer)var10002;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      int var4 = var24 + 1;
      j var5 = new j();
      var5.v(false);
      var5.R(System.currentTimeMillis());

      try {
         Xq2.A();
         Object var11 = 315004095662248503L;
         this.E((InetAddress)Ref.g(315004095662248503L, var11), var3, var4, new Lo4_2(this, var5, var1));
      } catch (Exception var18) {
      }

      var10001 = Registry.packArgs(new com.finalshell.task.Cn2(this, var5, var1), a(13039, 794786308109888132L));
      long var14 = 266288712085965362L;
      Object[] var13 = var10001;
      Ref.h(266288712085965362L, var13, var14);
      var10002 = Registry.emptyArgs();
      long var16 = 564648154927582737L;
      Object var15 = var10002;
      var10002 = Ref.h(564648154927582737L, var15, var16);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      if (var10002 == null) {
      }
   }

   public void M() {
      Registry.lookupField(175400870153177569L).setBoolean(this, false);
   }

   public void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/L9.X ()[I
      // 003: aload 0
      // 004: ldc2_w 210486900701643716
      // 007: astore 16
      // 009: ldc2_w 210486900701643716
      // 00c: aload 16
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast java/lang/Object
      // 014: dup
      // 015: astore 2
      // 016: monitorenter
      // 017: astore 1
      // 018: new java/util/ArrayList
      // 01b: dup
      // 01c: invokespecial java/util/ArrayList.<init> ()V
      // 01f: astore 3
      // 020: sipush 10859
      // 023: ldc2_w 3771339016516334083
      // 026: invokestatic com/finalshell/core/Dw4.a (IJ)I
      // 029: istore 4
      // 02b: new java/util/TreeMap
      // 02e: dup
      // 02f: invokespecial java/util/TreeMap.<init> ()V
      // 032: astore 5
      // 034: new java/util/Random
      // 037: dup
      // 038: invokespecial java/util/Random.<init> ()V
      // 03b: sipush 20864
      // 03e: ldc2_w 3848744046678215146
      // 041: invokestatic com/finalshell/core/Dw4.a (IJ)I
      // 044: invokevirtual java/util/Random.nextInt (I)I
      // 047: invokestatic java/lang/Math.abs (I)I
      // 04a: istore 6
      // 04c: bipush 1
      // 04d: istore 7
      // 04f: iload 7
      // 051: iload 4
      // 053: if_icmpgt 0bb
      // 056: iload 6
      // 058: iload 7
      // 05a: iadd
      // 05b: istore 8
      // 05d: iload 7
      // 05f: istore 9
      // 061: new org/icmp4j/j
      // 064: dup
      // 065: invokespecial org/icmp4j/j.<init> ()V
      // 068: astore 10
      // 06a: aload 10
      // 06c: invokestatic java/lang/System.currentTimeMillis ()J
      // 06f: invokevirtual org/icmp4j/j.R (J)V
      // 072: aload 5
      // 074: iload 9
      // 076: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 079: aload 10
      // 07b: invokevirtual java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 07e: pop
      // 07f: invokestatic com/finalshell/core/Xq2.A ()Lcom/finalshell/core/Xq2;
      // 082: aload 0
      // 083: ldc2_w 315004095662248503
      // 086: astore 18
      // 088: ldc2_w 315004095662248503
      // 08b: aload 18
      // 08d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 090: checkcast java/net/InetAddress
      // 093: iload 8
      // 095: iload 9
      // 097: new com/finalshell/core/Kk4
      // 09a: dup
      // 09b: aload 0
      // 09c: aload 10
      // 09e: iload 9
      // 0a0: invokespecial com/finalshell/core/Kk4.<init> (Lcom/finalshell/core/Dw4;Lorg/icmp4j/j;I)V
      // 0a3: invokevirtual com/finalshell/core/Xq2.E (Ljava/net/InetAddress;IILcom/finalshell/core/Q0;)Lorg/icmp4j/j;
      // 0a6: pop
      // 0a7: aload 1
      // 0a8: ifnonnull 0c1
      // 0ab: goto 0b4
      // 0ae: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: astore 11
      // 0b4: iinc 7 1
      // 0b7: aload 1
      // 0b8: ifnull 04f
      // 0bb: getstatic com/finalshell/core/Dw4.c J
      // 0be: invokestatic java/lang/Thread.sleep (J)V
      // 0c1: goto 0c6
      // 0c4: astore 7
      // 0c6: bipush 0
      // 0c7: istore 7
      // 0c9: aload 5
      // 0cb: invokevirtual java/util/TreeMap.keySet ()Ljava/util/Set;
      // 0ce: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d3: astore 8
      // 0d5: aload 8
      // 0d7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0dc: ifeq 2aa
      // 0df: aload 8
      // 0e1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e6: checkcast java/lang/Integer
      // 0e9: invokevirtual java/lang/Integer.intValue ()I
      // 0ec: istore 9
      // 0ee: aload 5
      // 0f0: iload 9
      // 0f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5: invokevirtual java/util/TreeMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f8: checkcast org/icmp4j/j
      // 0fb: astore 10
      // 0fd: aload 10
      // 0ff: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 102: astore 11
      // 104: aconst_null
      // 105: astore 12
      // 107: aload 11
      // 109: aload 1
      // 10a: ifnonnull 2e8
      // 10d: ifnull 117
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 12
      // 119: ifnonnull 18d
      // 11c: new com/finalshell/core/L9
      // 11f: dup
      // 120: invokespecial com/finalshell/core/L9.<init> ()V
      // 123: astore 12
      // 125: new com/finalshell/core/KV
      // 128: dup
      // 129: invokespecial com/finalshell/core/KV.<init> ()V
      // 12c: astore 13
      // 12e: aload 13
      // 130: bipush 1
      // 131: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 134: ldc2_w 331692188691262730
      // 137: astore 21
      // 139: astore 20
      // 13b: ldc2_w 331692188691262730
      // 13e: aload 20
      // 140: aload 21
      // 142: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 145: pop
      // 146: goto 14d
      // 149: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 12
      // 14f: aload 13
      // 151: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 154: ldc2_w 383789951970149471
      // 157: astore 23
      // 159: astore 22
      // 15b: ldc2_w 383789951970149471
      // 15e: aload 22
      // 160: aload 23
      // 162: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 165: pop
      // 166: goto 16d
      // 169: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 12
      // 16f: aload 11
      // 171: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 174: ldc2_w 475741620269029750
      // 177: astore 25
      // 179: astore 24
      // 17b: ldc2_w 475741620269029750
      // 17e: aload 24
      // 180: aload 25
      // 182: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 185: pop
      // 186: goto 18d
      // 189: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: aload 12
      // 18f: iload 7
      // 191: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 194: ldc2_w 551056457079808348
      // 197: astore 27
      // 199: astore 26
      // 19b: ldc2_w 551056457079808348
      // 19e: aload 26
      // 1a0: aload 27
      // 1a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a5: pop
      // 1a6: goto 1ad
      // 1a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: aload 3
      // 1ae: aload 12
      // 1b0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1b3: aload 1
      // 1b4: ifnonnull 22b
      // 1b7: pop
      // 1b8: aload 11
      // 1ba: ifnull 21b
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c3: athrow
      // 1c4: aload 12
      // 1c6: aload 0
      // 1c7: ldc2_w 487072334706875582
      // 1ca: astore 28
      // 1cc: ldc2_w 487072334706875582
      // 1cf: aload 28
      // 1d1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d7: ldc2_w 268398290601759208
      // 1da: astore 30
      // 1dc: ldc2_w 268398290601759208
      // 1df: aload 30
      // 1e1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e4: pop
      // 1e5: goto 1ec
      // 1e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 12
      // 1ee: aload 0
      // 1ef: ldc2_w 487072334706875582
      // 1f2: astore 32
      // 1f4: ldc2_w 487072334706875582
      // 1f7: aload 32
      // 1f9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1fc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ff: ldc2_w 146445297662860567
      // 202: astore 34
      // 204: ldc2_w 146445297662860567
      // 207: aload 34
      // 209: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 20c: pop
      // 20d: goto 214
      // 210: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 213: athrow
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: aload 10
      // 21d: aload 1
      // 21e: ifnonnull 25d
      // 221: invokevirtual org/icmp4j/j.q$boolean ()Z
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: ifne 25b
      // 22e: aload 10
      // 230: invokevirtual org/icmp4j/j.h ()Ljava/lang/String;
      // 233: astore 13
      // 235: aload 10
      // 237: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 23a: astore 14
      // 23c: aload 12
      // 23e: bipush 1
      // 23f: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 242: ldc2_w 389069285032847247
      // 245: astore 37
      // 247: astore 36
      // 249: ldc2_w 389069285032847247
      // 24c: aload 36
      // 24e: aload 37
      // 250: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 253: pop
      // 254: goto 25b
      // 257: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: aload 10
      // 25d: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 260: aload 1
      // 261: ifnonnull 286
      // 264: ifnull 29c
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: aload 0
      // 26f: ldc2_w 488976998546483488
      // 272: astore 38
      // 274: ldc2_w 488976998546483488
      // 277: aload 38
      // 279: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27c: checkcast java/lang/String
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: aload 10
      // 288: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 28b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28e: ifeq 29c
      // 291: aload 1
      // 292: ifnull 2aa
      // 295: goto 29c
      // 298: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: iinc 7 1
      // 29f: aload 1
      // 2a0: ifnull 0d5
      // 2a3: goto 2aa
      // 2a6: invokestatic com/finalshell/core/Dw4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a9: athrow
      // 2aa: aload 0
      // 2ab: aload 3
      // 2ac: ldc2_w 145412445008776377
      // 2af: astore 41
      // 2b1: astore 40
      // 2b3: ldc2_w 145412445008776377
      // 2b6: aload 40
      // 2b8: aload 41
      // 2ba: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2bd: aload 0
      // 2be: ldc2_w 487072334706875582
      // 2c1: astore 42
      // 2c3: ldc2_w 487072334706875582
      // 2c6: aload 42
      // 2c8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ce: ldc2_w 206535674231405864
      // 2d1: astore 45
      // 2d3: astore 44
      // 2d5: ldc2_w 206535674231405864
      // 2d8: aload 44
      // 2da: aload 45
      // 2dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2df: pop
      // 2e0: goto 2e7
      // 2e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e6: athrow
      // 2e7: aload 2
      // 2e8: monitorexit
      // 2e9: goto 2f3
      // 2ec: astore 15
      // 2ee: aload 2
      // 2ef: monitorexit
      // 2f0: aload 15
      // 2f2: athrow
      // 2f3: return
   }

   public RouteTracePanel W() {
      Object var1 = 487072334706875582L;
      return (RouteTracePanel)Ref.g(487072334706875582L, var1);
   }

   public void b(RouteTracePanel var1) {
      long var3 = 487072334706875582L;
      Ref.s(487072334706875582L, var1, var3);
   }

   public ArrayList R() {
      Object var1 = 145412445008776377L;
      return (ArrayList)Ref.g(145412445008776377L, var1);
   }

   public void v(ArrayList var1) {
      long var3 = 145412445008776377L;
      Ref.s(145412445008776377L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22632;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var2 = 2032872822685852955L;
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "¨lÇÄbº\u00978\u001f>q³\u001fù5¥";
      int var7 = "¨lÇÄbº\u00978\u001f>q³\u001fù5¥".length();
      byte var4 = 0;

      label20:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var10000 = var8;
         var10001 = var5++;
         long var10002 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var17 = var10002 ^ var2;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var17;
                  if (var4 >= var7) {
                     a = var8;
                     b = new Integer[4];
                     long var0 = 2724642410473835435L;
                     var10002 = 2724642410473834563L ^ var0;
                     byte var13 = -1;
                     c = var10002;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var17;
                  if (var4 < var7) {
                     continue label20;
                  }

                  var6 = "tÑy\u0096`\u001bÓ\u000e£Fl\u008cj\u0087\u008c\u001b";
                  var7 = "tÑy\u0096`\u001bÓ\u000e£Fl\u008cj\u0087\u008c\u001b".length();
                  var4 = 0;
            }

            byte var12 = var4;
            var4 += 8;
            var9 = var6.substring(var12, var4).getBytes("ISO-8859-1");
            var10000 = var8;
            var10001 = var5++;
            var10002 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var10003 = 0;
         }
      }
   }
   private static Object var38;
   private static Object var45;
   private static int var24;
}





