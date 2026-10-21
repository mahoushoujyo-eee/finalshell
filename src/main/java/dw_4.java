import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Random;

public class dw_4 {
   ArrayList N;
   String U;
   String j;
   InetAddress f;
   f3_2 k;
   boolean i;
   Object n;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   dw_4(f3_2 var1, String var2) {
      com.c.c(145412445008776377L).set(this, new ArrayList());
      com.c.c(175400870153177569L).setBoolean(this, true);
      com.c.c(210486900701643716L).set(this, new Object());
      com.c.c(487072334706875582L).set(this, var1);
      com.c.c(188881920873049499L).set(this, var2);
   }

   void Q() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new Kd_2(this));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   synchronized void Z(int var1, String var2) {
      int[] var3 = L9.X();
      int var10000 = var2.equals((String)com.c.c(488976998546483488L).get(this));
      if (var3 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1;
      }

      if (var3 == null) {
         if (var10000 >= ((ArrayList)com.c.c(145412445008776377L).get(this)).size() - 1) {
            return;
         }

         boolean var14 = false;
      }

      ArrayList var5 = new ArrayList();
      L9 var6 = (L9)((ArrayList)com.c.c(145412445008776377L).get(this)).get(((ArrayList)com.c.c(145412445008776377L).get(this)).size() - 1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(564648154927582737L);
      Object[] var10002 = var10001;
      L9 var19 = var6;
      Method var15 = var10003;

      try {
         var16 = (String)var15.invoke(var19, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var7 = var16;
      var10001 = com.c.f();
      var10003 = com.c.d(127422501806576014L);
      var10002 = var10001;
      L9 var21 = var6;
      Method var17 = var10003;

      try {
         var10000 = (Integer)var17.invoke(var21, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      int var8 = var10000;
      if (var7 != null) {
         int var9 = 1;

         while (var9 < ((ArrayList)com.c.c(145412445008776377L).get(this)).size()) {
            L9 var10 = (L9)((ArrayList)com.c.c(145412445008776377L).get(this)).get(((ArrayList)com.c.c(145412445008776377L).get(this)).size() - var9 - 1);
            if (var3 == null) {
               var10002 = com.c.f();
               Method var10004 = com.c.d(564648154927582737L);
               Object[] var28 = var10002;
               L9 var26 = var10;
               Method var22 = var10004;

               try {
                  var10001 = (String)var22.invoke(var26, var28);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               if (var7.equals(var10001)) {
                  var5.add(var10);
                  var8--;
               }

               var9++;
            }

            if (var3 != null) {
               break;
            }
         }
      }
   }

   synchronized void S() {
      int[] var1 = L9.X();
      int var10000 = ((ArrayList)com.c.c(145412445008776377L).get(this)).size();
      if (var1 == null) {
         if (var10000 <= 1) {
            return;
         }

         var10000 = 0;
      }

      int var2 = var10000;
      L9 var3 = (L9)((ArrayList)com.c.c(145412445008776377L).get(this)).get(((ArrayList)com.c.c(145412445008776377L).get(this)).size() - 1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(564648154927582737L);
      Object[] var10002 = var10001;
      L9 var23 = var3;
      Method var16 = var10003;

      try {
         var17 = (String)var16.invoke(var23, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var4 = var17;
      if (var4 != null) {
         var10001 = com.c.f();
         var10003 = com.c.d(127422501806576014L);
         var10002 = var10001;
         L9 var25 = var3;
         Method var18 = var10003;

         try {
            var10000 = (Integer)var18.invoke(var25, var10002);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         int var5 = var10000;
         ArrayList var6 = new ArrayList();
         int var7 = 1;

         label97: {
            while (var7 < ((ArrayList)com.c.c(145412445008776377L).get(this)).size()) {
               L9 var8 = (L9)((ArrayList)com.c.c(145412445008776377L).get(this)).get(((ArrayList)com.c.c(145412445008776377L).get(this)).size() - var7 - 1);
               if (var1 != null) {
                  break label97;
               }

               if (var1 == null) {
                  var10002 = com.c.f();
                  Method var10004 = com.c.d(564648154927582737L);
                  Object[] var38 = var10002;
                  L9 var34 = var8;
                  Method var26 = var10004;

                  try {
                     var10001 = (String)var26.invoke(var34, var38);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  if (var4.equals(var10001)) {
                     var6.add(var8);
                     var5--;
                  }

                  var7++;
               }

               if (var1 != null) {
                  break;
               }
            }

            var10001 = com.c.a(var5);
            var10003 = com.c.d(551056457079808348L);
            var10002 = var10001;
            L9 var29 = var3;
            Method var20 = var10003;

            try {
               var20.invoke(var29, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         for (L9 var15 : var6) {
            ((ArrayList)com.c.c(145412445008776377L).get(this)).remove(var15);
            var2 = 1;
            if (var1 != null) {
               return;
            }

            if (var1 != null) {
               break;
            }
         }

         if (var2 != 0) {
            Object var21 = com.c.c(487072334706875582L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(206535674231405864L);
            var10002 = var10001;
            var10001 = (Object[])var21;
            Method var22 = var10003;

            try {
               var22.invoke(var10001, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }
      }
   }

   void f(L9 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(127422501806576014L);
      Object[] var10002 = var10001;
      L9 var18 = var1;
      Method var10000 = var10003;

      try {
         var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      int var3 = Math.abs(new Random().nextInt(a(14120, 6740195840310472513L)));
      var10001 = com.c.f();
      var10003 = com.c.d(127422501806576014L);
      var10002 = var10001;
      L9 var20 = var1;
      var10000 = var10003;

      try {
         var13 = (Integer)var10000.invoke(var20, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      int var4 = var13 + 1;
      org.icmp4j.j var5 = new org.icmp4j.j();
      var5.v(false);
      var5.R(System.currentTimeMillis());

      try {
         xq_2.A().E((InetAddress)com.c.c(315004095662248503L).get(this), var3, var4, new lo_4(this, var5, var1));
      } catch (Exception var9) {
      }

      d8_2 var14 = xQ.x;
      var10001 = com.c.a(new Cn_2(this, var5, var1), a(13039, 794786308109888132L));
      var10003 = com.c.d(266288712085965362L);
      var10002 = var10001;
      d8_2 var22 = var14;
      var10000 = var10003;

      try {
         var10000.invoke(var22, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(564648154927582737L);
      var10002 = var10001;
      L9 var24 = var1;
      var10000 = var10003;

      try {
         var17 = (String)var10000.invoke(var24, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      if (var17 == null) {
      }
   }

   void M() {
      com.c.c(175400870153177569L).setBoolean(this, false);
   }

   void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic L9.X ()[I
      // 003: aload 0
      // 004: ldc2_w 210486900701643716
      // 007: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00a: swap
      // 00b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast java/lang/Object
      // 011: dup
      // 012: astore 2
      // 013: monitorenter
      // 014: astore 1
      // 015: new java/util/ArrayList
      // 018: dup
      // 019: invokespecial java/util/ArrayList.<init> ()V
      // 01c: astore 3
      // 01d: sipush 10859
      // 020: ldc2_w 3771339016516334083
      // 023: invokestatic dw_4.a (IJ)I
      // 026: istore 4
      // 028: new java/util/TreeMap
      // 02b: dup
      // 02c: invokespecial java/util/TreeMap.<init> ()V
      // 02f: astore 5
      // 031: new java/util/Random
      // 034: dup
      // 035: invokespecial java/util/Random.<init> ()V
      // 038: sipush 20864
      // 03b: ldc2_w 3848744046678215146
      // 03e: invokestatic dw_4.a (IJ)I
      // 041: invokevirtual java/util/Random.nextInt (I)I
      // 044: invokestatic java/lang/Math.abs (I)I
      // 047: istore 6
      // 049: bipush 1
      // 04a: istore 7
      // 04c: iload 7
      // 04e: iload 4
      // 050: if_icmpgt 0b5
      // 053: iload 6
      // 055: iload 7
      // 057: iadd
      // 058: istore 8
      // 05a: iload 7
      // 05c: istore 9
      // 05e: new org/icmp4j/j
      // 061: dup
      // 062: invokespecial org/icmp4j/j.<init> ()V
      // 065: astore 10
      // 067: aload 10
      // 069: invokestatic java/lang/System.currentTimeMillis ()J
      // 06c: invokevirtual org/icmp4j/j.R (J)V
      // 06f: aload 5
      // 071: iload 9
      // 073: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 076: aload 10
      // 078: invokevirtual java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 07b: pop
      // 07c: invokestatic xq_2.A ()Lxq_2;
      // 07f: aload 0
      // 080: ldc2_w 315004095662248503
      // 083: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 086: swap
      // 087: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08a: checkcast java/net/InetAddress
      // 08d: iload 8
      // 08f: iload 9
      // 091: new kk_4
      // 094: dup
      // 095: aload 0
      // 096: aload 10
      // 098: iload 9
      // 09a: invokespecial kk_4.<init> (Ldw_4;Lorg/icmp4j/j;I)V
      // 09d: invokevirtual xq_2.E (Ljava/net/InetAddress;IILQ0;)Lorg/icmp4j/j;
      // 0a0: pop
      // 0a1: aload 1
      // 0a2: ifnonnull 0bb
      // 0a5: goto 0ae
      // 0a8: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: astore 11
      // 0ae: iinc 7 1
      // 0b1: aload 1
      // 0b2: ifnull 04c
      // 0b5: getstatic dw_4.c J
      // 0b8: invokestatic java/lang/Thread.sleep (J)V
      // 0bb: goto 0c0
      // 0be: astore 7
      // 0c0: bipush 0
      // 0c1: istore 7
      // 0c3: aload 5
      // 0c5: invokevirtual java/util/TreeMap.keySet ()Ljava/util/Set;
      // 0c8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0cd: astore 8
      // 0cf: aload 8
      // 0d1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d6: ifeq 27b
      // 0d9: aload 8
      // 0db: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e0: checkcast java/lang/Integer
      // 0e3: invokevirtual java/lang/Integer.intValue ()I
      // 0e6: istore 9
      // 0e8: aload 5
      // 0ea: iload 9
      // 0ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ef: invokevirtual java/util/TreeMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f2: checkcast org/icmp4j/j
      // 0f5: astore 10
      // 0f7: aload 10
      // 0f9: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 0fc: astore 11
      // 0fe: aconst_null
      // 0ff: astore 12
      // 101: aload 11
      // 103: aload 1
      // 104: ifnonnull 2aa
      // 107: ifnull 111
      // 10a: goto 111
      // 10d: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 12
      // 113: ifnonnull 175
      // 116: new L9
      // 119: dup
      // 11a: invokespecial L9.<init> ()V
      // 11d: astore 12
      // 11f: new KV
      // 122: dup
      // 123: invokespecial KV.<init> ()V
      // 126: astore 13
      // 128: aload 13
      // 12a: bipush 1
      // 12b: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 12e: ldc2_w 331692188691262730
      // 131: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 134: dup_x2
      // 135: pop
      // 136: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 139: pop
      // 13a: goto 141
      // 13d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 12
      // 143: aload 13
      // 145: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 148: ldc2_w 383789951970149471
      // 14b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 14e: dup_x2
      // 14f: pop
      // 150: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 153: pop
      // 154: goto 15b
      // 157: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 12
      // 15d: aload 11
      // 15f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 162: ldc2_w 475741620269029750
      // 165: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 168: dup_x2
      // 169: pop
      // 16a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16d: pop
      // 16e: goto 175
      // 171: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 174: athrow
      // 175: aload 12
      // 177: iload 7
      // 179: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 17c: ldc2_w 551056457079808348
      // 17f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 182: dup_x2
      // 183: pop
      // 184: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 187: pop
      // 188: goto 18f
      // 18b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: aload 3
      // 190: aload 12
      // 192: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 195: aload 1
      // 196: ifnonnull 205
      // 199: pop
      // 19a: aload 11
      // 19c: ifnull 1f5
      // 19f: goto 1a6
      // 1a2: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: aload 12
      // 1a8: aload 0
      // 1a9: ldc2_w 487072334706875582
      // 1ac: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1af: swap
      // 1b0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1b3: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b6: ldc2_w 268398290601759208
      // 1b9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1bc: swap
      // 1bd: aconst_null
      // 1be: swap
      // 1bf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c2: pop
      // 1c3: goto 1ca
      // 1c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: aload 12
      // 1cc: aload 0
      // 1cd: ldc2_w 487072334706875582
      // 1d0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1d3: swap
      // 1d4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d7: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1da: ldc2_w 146445297662860567
      // 1dd: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1e0: swap
      // 1e1: aconst_null
      // 1e2: swap
      // 1e3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1e6: pop
      // 1e7: goto 1ee
      // 1ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: goto 1f5
      // 1f1: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: aload 10
      // 1f7: aload 1
      // 1f8: ifnonnull 231
      // 1fb: invokevirtual org/icmp4j/j.q ()Z
      // 1fe: goto 205
      // 201: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: ifne 22f
      // 208: aload 10
      // 20a: invokevirtual org/icmp4j/j.h ()Ljava/lang/String;
      // 20d: astore 13
      // 20f: aload 10
      // 211: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 214: astore 14
      // 216: aload 12
      // 218: bipush 1
      // 219: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 21c: ldc2_w 389069285032847247
      // 21f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 222: dup_x2
      // 223: pop
      // 224: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 227: pop
      // 228: goto 22f
      // 22b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: aload 10
      // 231: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 234: aload 1
      // 235: ifnonnull 257
      // 238: ifnull 26d
      // 23b: goto 242
      // 23e: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 0
      // 243: ldc2_w 488976998546483488
      // 246: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 249: swap
      // 24a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 24d: checkcast java/lang/String
      // 250: goto 257
      // 253: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: aload 10
      // 259: invokevirtual org/icmp4j/j.A ()Ljava/lang/String;
      // 25c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25f: ifeq 26d
      // 262: aload 1
      // 263: ifnull 27b
      // 266: goto 26d
      // 269: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26c: athrow
      // 26d: iinc 7 1
      // 270: aload 1
      // 271: ifnull 0cf
      // 274: goto 27b
      // 277: invokestatic dw_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 0
      // 27c: aload 3
      // 27d: ldc2_w 145412445008776377
      // 280: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 283: dup_x2
      // 284: pop
      // 285: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 288: aload 0
      // 289: ldc2_w 487072334706875582
      // 28c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 28f: swap
      // 290: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 293: invokestatic com/c.f ()[Ljava/lang/Object;
      // 296: ldc2_w 206535674231405864
      // 299: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 29c: dup_x2
      // 29d: pop
      // 29e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a1: pop
      // 2a2: goto 2a9
      // 2a5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: aload 2
      // 2aa: monitorexit
      // 2ab: goto 2b5
      // 2ae: astore 15
      // 2b0: aload 2
      // 2b1: monitorexit
      // 2b2: aload 15
      // 2b4: athrow
      // 2b5: return
   }

   public f3_2 W() {
      return (f3_2)com.c.c(487072334706875582L).get(this);
   }

   public void b(f3_2 var1) {
      com.c.c(487072334706875582L).set(this, var1);
   }

   public ArrayList R() {
      return (ArrayList)com.c.c(145412445008776377L).get(this);
   }

   public void v(ArrayList var1) {
      com.c.c(145412445008776377L).set(this, var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22632;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





