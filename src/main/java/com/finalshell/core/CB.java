package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.JV;
import com.finalshell.task.OG;
import com.finalshell.task.Yl2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

public class CB {
   ConnectionProperty C;
   Connect_2 V;
   E0 c;
   ConnectHost w;
   ArrayList y;
   String n;
   KV g;
   boolean j;
   boolean U;
   Thread p;
   Ty2 F;
   GH_2 b;
   Pattern N;
   static int R;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;
   public static long[] h;
   public static Long[] i;

   public CB(ConnectionProperty var1) {
      String var10001 = a(-16548, -30736);
      long var3 = 465937413613183069L;
      String var2 = var10001;
      Ref.s(465937413613183069L, var2, var3);
      KV var10002 = new KV();
      long var5 = 612473087890652491L;
      KV var4 = var10002;
      Ref.s(612473087890652491L, var4, var5);
      Registry.lookupField(461874265872729632L).setBoolean(this, true);
      Registry.lookupField(288681454708139251L).setBoolean(this, true);
      Pattern var10003 = Pattern.compile(a(-16571, 17490));
      long var7 = 441946618932660847L;
      Pattern var6 = var10003;
      Ref.s(441946618932660847L, var6, var7);
      long var9 = 494234311615034477L;
      Ref.s(494234311615034477L, var1, var9);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10005 = Registry.packArgs(new com.finalshell.task.Oi4(this));
      long var11 = 434592463220957006L;
      Object[] var10 = var10005;
      Ref.h(434592463220957006L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10007 = Registry.packArgs(new JV(this), a(11885, 3655797795666828065L));
      long var13 = 201859364639460244L;
      Object[] var12 = var10007;
      var10007 = Ref.h(201859364639460244L, var12, var13);
      long var15 = 569355164589280895L;
      Object var14 = var10007;
      Ref.s(569355164589280895L, var14, var15);
   }

   synchronized void V() {
      KV.b$arrString();
      Object var10 = 494234311615034477L;
      Ty2 var2 = ((ConnectionProperty)Ref.g(494234311615034477L, var10)).M$Ty_2();
      CB var1 = this;
      if (this != null || var2 != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var13 = 121632250293569146L;
         Object[] var12 = var10002;
         Ref.h(121632250293569146L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
         long var15 = 604361570872278918L;
         Object[] var14 = var10003;
         var10003 = Ref.h(604361570872278918L, var14, var15);

         try {
            var10003 = (ArrayList)var10003;
         } catch (InvocationTargetException var40) {
            throw var40.getTargetException();
         }

         ArrayList var4 = var10003;
         HashMap var5 = new HashMap();

         for (LI3_2 var7 : var4) {
            if (var1 != null) {
               return;
            }

            if (var1 == null && var7 != null) {
               Object[] var10005 = Registry.emptyArgs();
               long var17 = 419335026051024288L;
               Object[] var16 = var10005;
               var10005 = Ref.h(419335026051024288L, var16, var17);

               try {
                  var50 = (Integer)var10005;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               var7.put(var50, var7);
            }

            if (var1 != null) {
               break;
            }
         }

         HashMap var10004 = (HashMap)(Registry.emptyArgs());
         long var19 = 234562395176240269L;
         Object[] var18 = var10004;
         var10004 = Ref.h(234562395176240269L, var18, var19);

         try {
            var10004 = (HashMap)var10004;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         HashMap var42 = var10004;

         for (int var8 : var42.keySet()) {
            label143: {
               HashMap var48 = var5;
               Integer var51 = var8;
               if (var1 == null) {
                  if (var5.containsKey(var51)) {
                     break label143;
                  }

                  var48 = var42;
                  var51 = var8;
               }

               U82 var9 = (U82)var48.get(var51);
               Object[] var10006 = Registry.emptyArgs();
               long var21 = 340521912883652737L;
               Object[] var20 = var10006;
               var10006 = Ref.h(340521912883652737L, var20, var21);

               try {
                  var53 = (Integer)var10006;
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               var10006 = Registry.packArgs(var53);
               long var23 = 353864682499479325L;
               Object[] var22 = var10006;
               Ref.h(353864682499479325L, var22, var23);

               try {
                  ;
               } catch (InvocationTargetException var36) {
                  throw var36.getTargetException();
               }

               Object[] var10007 = Registry.emptyArgs();
               long var25 = 123113172687576260L;
               Object[] var24 = var10007;
               Ref.h(123113172687576260L, var24, var25);

               try {
                  ;
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }

               Object[] var10009 = Registry.emptyArgs();
               long var27 = 340521912883652737L;
               Object[] var26 = var10009;
               var10009 = Ref.h(340521912883652737L, var26, var27);

               try {
                  var56 = (Integer)var10009;
               } catch (InvocationTargetException var34) {
                  throw var34.getTargetException();
               }

               var9.remove(var56);
               var10009 = Registry.emptyArgs();
               long var29 = 262176401034774370L;
               Object[] var28 = var10009;
               Ref.h(262176401034774370L, var28, var29);

               try {
                  ;
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }

               Object[] var10011 = Registry.emptyArgs();
               long var31 = 340521912883652737L;
               Object[] var30 = var10011;
               var10011 = Ref.h(340521912883652737L, var30, var31);

               try {
                  var59 = (Integer)var10011;
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               var9.remove(var59);
            }

            if (var1 != null) {
               break;
            }
         }
      }
   }

   void s() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/KV.b$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 494234311615034477
      // 007: astore 6
      // 009: ldc2_w 494234311615034477
      // 00c: aload 6
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 014: invokevirtual com/finalshell/ui/panel/ConnectionProperty.J$IR ()Lcom/finalshell/core/Connect_2;
      // 017: astore 2
      // 018: bipush 0
      // 019: istore 3
      // 01a: astore 1
      // 01b: aload 0
      // 01c: ldc2_w 288681454708139251
      // 01f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 022: swap
      // 023: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 026: ifeq 178
      // 029: bipush 1
      // 02a: istore 4
      // 02c: aload 0
      // 02d: aload 1
      // 02e: ifnonnull 20f
      // 031: ldc2_w 494234311615034477
      // 034: astore 8
      // 036: ldc2_w 494234311615034477
      // 039: aload 8
      // 03b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03e: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 041: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 044: aload 1
      // 045: ifnonnull 074
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 04e: athrow
      // 04f: ifnull 136
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 058: athrow
      // 059: aload 0
      // 05a: ldc2_w 494234311615034477
      // 05d: astore 10
      // 05f: ldc2_w 494234311615034477
      // 062: aload 10
      // 064: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 067: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 06a: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 073: athrow
      // 074: invokeinterface com/finalshell/core/Fv2_2.K ()Z 1
      // 079: aload 1
      // 07a: ifnonnull 138
      // 07d: ifeq 136
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 086: athrow
      // 087: aload 0
      // 088: ldc2_w 494234311615034477
      // 08b: astore 12
      // 08d: ldc2_w 494234311615034477
      // 090: aload 12
      // 092: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 095: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 098: invokevirtual com/finalshell/ui/panel/ConnectionProperty.M$Ty_2 ()Lcom/finalshell/core/Ty2;
      // 09b: aload 1
      // 09c: ifnonnull 0cb
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a5: athrow
      // 0a6: ifnull 136
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: ldc2_w 494234311615034477
      // 0b4: astore 14
      // 0b6: ldc2_w 494234311615034477
      // 0b9: aload 14
      // 0bb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0be: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 0c1: invokevirtual com/finalshell/ui/panel/ConnectionProperty.M$Ty_2 ()Lcom/finalshell/core/Ty2;
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ca: athrow
      // 0cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ce: ldc2_w 121632250293569146
      // 0d1: astore 17
      // 0d3: astore 16
      // 0d5: ldc2_w 121632250293569146
      // 0d8: aload 16
      // 0da: aload 17
      // 0dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0df: goto 0e6
      // 0e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e9: ldc2_w 209399997283157048
      // 0ec: astore 19
      // 0ee: astore 18
      // 0f0: ldc2_w 209399997283157048
      // 0f3: aload 18
      // 0f5: aload 19
      // 0f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fa: checkcast java/lang/String
      // 0fd: goto 104
      // 100: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 103: athrow
      // 104: astore 5
      // 106: aload 5
      // 108: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10b: ldc2_w 330094358428833085
      // 10e: astore 20
      // 110: ldc2_w 330094358428833085
      // 113: aload 20
      // 115: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 118: checkcast java/lang/Boolean
      // 11b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11e: goto 125
      // 121: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 1
      // 126: ifnonnull 138
      // 129: ifne 136
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 132: athrow
      // 133: bipush 0
      // 134: istore 4
      // 136: iload 4
      // 138: aload 1
      // 139: ifnonnull 168
      // 13c: ifeq 160
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 145: athrow
      // 146: sipush 31941
      // 149: ldc2_w 7292783747471261
      // 14c: invokestatic com/finalshell/core/CB.b (IJ)J
      // 14f: invokestatic java/lang/Thread.sleep (J)V
      // 152: goto 16d
      // 155: astore 5
      // 157: aload 5
      // 159: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 15c: aload 1
      // 15d: ifnull 16d
      // 160: bipush 1
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 167: athrow
      // 168: istore 3
      // 169: aload 1
      // 16a: ifnull 178
      // 16d: aload 1
      // 16e: ifnull 01b
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 177: athrow
      // 178: iload 3
      // 179: ifne 181
      // 17c: return
      // 17d: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 180: athrow
      // 181: sipush 16769
      // 184: ldc2_w 4915683047734323930
      // 187: invokestatic com/finalshell/core/CB.b (IJ)J
      // 18a: invokestatic java/lang/Thread.sleep (J)V
      // 18d: goto 197
      // 190: astore 4
      // 192: aload 4
      // 194: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 197: aload 0
      // 198: aload 0
      // 199: ldc2_w 494234311615034477
      // 19c: astore 22
      // 19e: ldc2_w 494234311615034477
      // 1a1: aload 22
      // 1a3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a6: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 1a9: invokevirtual com/finalshell/ui/panel/ConnectionProperty.C$E0 ()Lcom/finalshell/core/E0;
      // 1ac: ldc2_w 605457745951191257
      // 1af: astore 25
      // 1b1: astore 24
      // 1b3: ldc2_w 605457745951191257
      // 1b6: aload 24
      // 1b8: aload 25
      // 1ba: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1bd: aload 0
      // 1be: aload 0
      // 1bf: ldc2_w 494234311615034477
      // 1c2: astore 26
      // 1c4: ldc2_w 494234311615034477
      // 1c7: aload 26
      // 1c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1cc: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 1cf: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 1d2: invokeinterface com/finalshell/core/Fv2_2.e ()Lcom/finalshell/crypto/ConnectHost; 1
      // 1d7: ldc2_w 192945024419546406
      // 1da: astore 29
      // 1dc: astore 28
      // 1de: ldc2_w 192945024419546406
      // 1e1: aload 28
      // 1e3: aload 29
      // 1e5: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1e8: aload 0
      // 1e9: sipush -16576
      // 1ec: sipush 6381
      // 1ef: invokestatic com/finalshell/core/CB.a (II)Ljava/lang/String;
      // 1f2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1f5: ldc2_w 316461647454649571
      // 1f8: astore 31
      // 1fa: astore 30
      // 1fc: ldc2_w 316461647454649571
      // 1ff: aload 30
      // 201: aload 31
      // 203: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 206: pop
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: aload 0
      // 20f: new java/lang/StringBuilder
      // 212: dup
      // 213: invokespecial java/lang/StringBuilder.<init> ()V
      // 216: ldc2_w 133405405151830121
      // 219: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 21c: aconst_null
      // 21d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 220: checkcast java/lang/String
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: sipush -16549
      // 229: sipush -10771
      // 22c: invokestatic com/finalshell/core/CB.a (II)Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 235: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 238: ldc2_w 316461647454649571
      // 23b: astore 33
      // 23d: astore 32
      // 23f: ldc2_w 316461647454649571
      // 242: aload 32
      // 244: aload 33
      // 246: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 249: pop
      // 24a: goto 251
      // 24d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 250: athrow
      // 251: ldc2_w 388376917454860932
      // 254: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 257: aconst_null
      // 258: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 25b: new com/finalshell/task/XW
      // 25e: dup
      // 25f: aload 0
      // 260: invokespecial com/finalshell/task/XW.<init> (Lcom/finalshell/core/CB;)V
      // 263: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 266: ldc2_w 434592463220957006
      // 269: astore 35
      // 26b: astore 34
      // 26d: ldc2_w 434592463220957006
      // 270: aload 34
      // 272: aload 35
      // 274: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 277: pop
      // 278: goto 27f
      // 27b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: return
   }

   public void C() {
      Registry.lookupField(288681454708139251L).setBoolean(this, false);
      KV.b$arrString();
      Object var2 = 612473087890652491L;
      Object var10002 = Ref.g(612473087890652491L, var2);
      Object[] var10003 = Registry.emptyArgs();
      long var5 = 457070090305342817L;
      Object[] var4 = var10003;
      Ref.h(457070090305342817L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object var1 = var10002;
      Object var6 = 569355164589280895L;
      Ref.g(569355164589280895L, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 624731062495880669L;
      Object[] var8 = var10004;
      Ref.h(624731062495880669L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      if (var1 == null) {
         Object var10 = 423426464359177155L;
         if ((Thread)Ref.g(423426464359177155L, var10) != null) {
            Object var12 = 423426464359177155L;
            ((Thread)Ref.g(423426464359177155L, var12)).interrupt();
         }
      }

      Object[] var10005 = Registry.emptyArgs();
      long var15 = 170703241402506848L;
      Object[] var14 = var10005;
      Ref.h(170703241402506848L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public synchronized void q() {
      Object var35 = 494234311615034477L;
      Im4 var2 = ((ConnectionProperty)Ref.g(494234311615034477L, var35)).b$im_4();
      Ua2 var3 = var2.l();
      int var4 = var3.b();
      Object var5 = -1;
      Object var6 = -1;
      Object var7 = -1;
      KV.b$arrString();
      Object var8 = -1;
      Object var9 = -1;
      Object var10 = -1;
      Object var37 = 494234311615034477L;
      Ty2 var11 = ((ConnectionProperty)Ref.g(494234311615034477L, var37)).M$Ty_2();
      ArrayList var12 = new ArrayList();
      boolean var13 = false;
      String var14 = a(-16565, -22485);
      String var15 = a(-16574, 21723);
      String var16 = a(-16563, -21860);
      Object var17 = 0;
      boolean var18 = false;
      Object var19 = 0;
      CB var1 = this;

      label721:
      while (true) {
         Object var10002 = var19;

         label718:
         while (var10002 < var4) {
            String var20 = var3.U((int)var19).trim();
            if (var1 != null) {
               return;
            }

            if (var20.trim().equals("")) {
            }

            if (var19 < a(21095, 1930403221210851118L)) {
            }

            String[] var21;
            var21 = var20.split(a(-16568, -30989));
            var10002 = var20.contains(a(-16569, -17510));
            label712:
            if (var1 == null) {
               if (var10002 != 0) {
                  var13 = true;
                  var10002 = var20.contains("+");
                  if (var1 != null) {
                     break label712;
                  }

                  if (var10002 != 0) {
                     var20 = var20.replaceAll(a(-16564, -19130), " ");
                  }
               }

               var10002 = var17;
            }

            label705: {
               label727: {
                  Object var10003;
                  label728: {
                     label702:
                     if (var1 == null) {
                        if (var10002 == 0) {
                           Object var23 = var20.indexOf(var14);
                           var10002 = var23;
                           if (var1 == null) {
                              if (var23 < 0) {
                                 var23 = var20.indexOf(var15);
                              }

                              var10002 = var23;
                           }

                           if (var1 == null) {
                              if (var10002 < 0) {
                                 var23 = var20.indexOf(var16);
                              }

                              var10002 = var23;
                           }

                           if (var1 != null) {
                              break label702;
                           }

                           if (var10002 > 0) {
                              String var24 = var20.substring(0, (int)var23);
                              int var25 = var24.lastIndexOf(" ");
                              String var26 = var24.substring(var25);
                              float var27 = Float.parseFloat(var26);
                              float var28 = (100.0F - var27) / 100.0F;
                              var10002 = this;
                              Object var39 = 414347828709011535L;
                              var10003 = Ref.g(414347828709011535L, var39);
                              KV var10004 = (KV)(Registry.emptyArgs());
                              long var42 = 121632250293569146L;
                              Object[] var41 = var10004;
                              var10004 = Ref.h(121632250293569146L, var41, var42);

                              try {
                                 var10004 = (KV)var10004;
                              } catch (InvocationTargetException var134) {
                                 throw var134.getTargetException();
                              }

                              KV var29 = var10004;
                              Object[] var10005 = Registry.packArgs(var28);
                              long var44 = 298942617489864694L;
                              Object[] var43 = var10005;
                              Ref.h(298942617489864694L, var43, var44);

                              try {
                                 ;
                              } catch (InvocationTargetException var133) {
                                 throw var133.getTargetException();
                              }

                              var17 = true;
                              Registry.lookupField(226189277201249473L).setFloat(var29, var27);
                              Object var45 = 441946618932660847L;
                              Registry.packArgs(Ref.g(441946618932660847L, var45), var20);
                              long var47 = 448766365701270717L;
                              Object var10007 = Ref.h2(448766365701270717L, var47);

                              try {
                                 var10007 = (ArrayList)var10007;
                              } catch (InvocationTargetException var132) {
                                 throw var132.getTargetException();
                              }

                              ArrayList var30 = (ArrayList)var10007;
                              int var31 = 0;

                              for (String var33 : var30) {
                                 var31++;
                                 float var34 = Float.parseFloat(var33);
                                 int var208 = var31;
                                 int var10008 = 1;
                                 if (var1 != null) {
                                    break label728;
                                 }

                                 label732: {
                                    if (var1 == null) {
                                       if (var31 == 1) {
                                          Registry.lookupField(233921421001411278L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = 2;
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(210203416783283258L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = 3;
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(167657311795516799L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = 4;
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(226189277201249473L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = 5;
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(291919004099278990L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = a(12300, 7577784234782721351L);
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(403721587605272966L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = a(7430, 4678139241571723336L);
                                    }

                                    if (var1 == null) {
                                       if (var208 == var10008) {
                                          Registry.lookupField(469575105869966877L).setFloat(var29, var34);
                                          if (var1 == null) {
                                             break label732;
                                          }
                                       }

                                       var208 = var31;
                                       var10008 = a(19595, 8134975020447496644L);
                                    }

                                    if (var208 == var10008) {
                                       Registry.lookupField(623923395514501325L).setFloat(var29, var34);
                                    }
                                 }

                                 if (var1 != null) {
                                    break;
                                 }
                              }
                           }
                        }

                        var10002 = var20.contains(a(-16566, -14453));
                     }

                     label638: {
                        label733: {
                           if (var1 == null) {
                              if (var10002 == 0) {
                                 var10002 = var20.contains(a(-16570, -15086));
                                 if (var1 != null) {
                                    break label638;
                                 }

                                 if (var10002 == 0) {
                                    break label733;
                                 }
                              }

                              var10002 = var20.contains(a(-16572, 3158));
                           }

                           if (var1 != null) {
                              break label638;
                           }

                           if (var10002 != 0) {
                              Object var22 = 0;

                              while (var22 < var21.length) {
                                 String var143 = var21[var22];
                                 var10002 = var143.equals(a(-16551, 20092));
                                 if (var1 != null) {
                                    continue label718;
                                 }

                                 label623: {
                                    label736: {
                                       if (var1 == null) {
                                          if (var10002 != false) {
                                             var5 = var22;
                                             if (var1 == null) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var143.equals(a(-16547, 1096));
                                       }

                                       if (var1 == null) {
                                          if (var10002 != false) {
                                             var6 = var22;
                                             if (var1 == null) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var143.equals(a(-16561, -3441));
                                       }

                                       label609: {
                                          label608: {
                                             if (var1 == null) {
                                                if (var10002 == false) {
                                                   var10002 = var143.equals(a(-16560, 29603));
                                                   if (var1 != null) {
                                                      break label609;
                                                   }

                                                   if (var10002 == 0) {
                                                      break label608;
                                                   }
                                                }

                                                var10002 = var22;
                                             }

                                             var7 = var10002;
                                             if (var1 == null) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var143.equals(a(-16573, -7363));
                                       }

                                       if (var1 == null) {
                                          if (var10002 != 0) {
                                             var8 = var22;
                                             if (var1 == null) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var143.equals(a(-16567, 12963));
                                       }

                                       if (var1 == null) {
                                          if (var10002 != 0) {
                                             var9 = var22;
                                             if (var1 == null) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var143.equals(a(-16550, -29832));
                                       }

                                       if (var1 == null) {
                                          if (var10002 == 0) {
                                             var10002 = var143.equals(a(-16545, 17675));
                                             if (var1 != null) {
                                                break label623;
                                             }

                                             if (var10002 == false) {
                                                break label736;
                                             }
                                          }

                                          var10002 = var22;
                                       }

                                       var10 = var10002;
                                    }

                                    var10002 = var143.equals(a(-16546, -25675));
                                 }

                                 if (var1 == null) {
                                    if (var10002 != 0) {
                                       var6 = var22;
                                       var13 = true;
                                    }

                                    var10002 = var143.equals(a(-16552, 32270));
                                 }

                                 label574: {
                                    if (var1 == null) {
                                       if (var10002 == 0) {
                                          break label574;
                                       }

                                       var10002 = var22;
                                    }

                                    var8 = var10002;
                                 }

                                 var22++;
                                 if (var1 != null) {
                                    break;
                                 }
                              }

                              if (var1 == null) {
                                 break label727;
                              }
                           }
                        }

                        var10002 = var5;
                     }

                     var10003 = -1;
                  }

                  if (var1 == null) {
                     if (var10002 <= var10003) {
                        break label727;
                     }

                     var10002 = var6;
                     var10003 = -1;
                  }

                  if (var1 == null) {
                     if (var10002 <= var10003) {
                        break label727;
                     }

                     var10002 = var9;
                     var10003 = -1;
                  }

                  if (var10002 > var10003) {
                     LI3_2 var140 = new LI3_2();
                     String var144 = var21[var5];
                     if (var1 != null) {
                        break label705;
                     }

                     label547:
                     if (!var144.equals("")) {
                        var10003 = Registry.packArgs(Integer.parseInt(var21[var5]));
                        long var50 = 463707540165777128L;
                        Object[] var49 = (Object[])var10003;
                        Ref.h(463707540165777128L, var49, var50);

                        try {
                           ;
                        } catch (InvocationTargetException var131) {
                           throw var131.getTargetException();
                        }

                        label738: {
                           String var147 = var21[var6].toLowerCase();
                           var10003 = var147;
                           if (var1 == null) {
                              if (var147.endsWith("k") | var147.endsWith("m") | var147.endsWith("g") | var147.endsWith("t")) {
                                 label740: {
                                    String var149 = var147.substring(0, var147.length() - 1);
                                    float var153 = Float.parseFloat(var149);
                                    boolean var161 = var147.endsWith("t");
                                    if (var1 == null) {
                                       if (var161) {
                                          new StringBuilder();
                                          Object[] var169 = Registry.packArgs(var153);
                                          long var51 = 122164552401629502L;
                                          Object var181 = Ref.h2(122164552401629502L, var51);

                                          try {
                                             var181 = (String)var181;
                                          } catch (InvocationTargetException var130) {
                                             throw var130.getTargetException();
                                          }

                                          var147 = var169.append((String)var181).append("t").toString();
                                          var181 = Registry.e((long)(1.0995116E12F * var153));
                                          long var54 = 507393495849422758L;
                                          Object[] var53 = (Object[])var181;
                                          Ref.h(507393495849422758L, var53, var54);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var129) {
                                             throw var129.getTargetException();
                                          }

                                          if (var1 == null) {
                                             break label740;
                                          }
                                       }

                                       var161 = var147.endsWith("g");
                                    }

                                    if (var1 == null) {
                                       if (var161) {
                                          new StringBuilder();
                                          Object[] var170 = Registry.packArgs(var153);
                                          long var55 = 122164552401629502L;
                                          Object var184 = Ref.h2(122164552401629502L, var55);

                                          try {
                                             var184 = (String)var184;
                                          } catch (InvocationTargetException var128) {
                                             throw var128.getTargetException();
                                          }

                                          var147 = var170.append((String)var184).append("g").toString();
                                          var184 = Registry.e((long)(1.0737418E9F * var153));
                                          long var58 = 507393495849422758L;
                                          Object[] var57 = (Object[])var184;
                                          Ref.h(507393495849422758L, var57, var58);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var127) {
                                             throw var127.getTargetException();
                                          }

                                          if (var1 == null) {
                                             break label740;
                                          }
                                       }

                                       var161 = var147.endsWith("m");
                                    }

                                    if (var1 == null) {
                                       if (var161) {
                                          Object[] var171 = Registry.e((long)(1048576.0F * var153));
                                          long var60 = 507393495849422758L;
                                          Object[] var59 = var171;
                                          Ref.h(507393495849422758L, var59, var60);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var126) {
                                             throw var126.getTargetException();
                                          }

                                          if (var1 == null) {
                                             break label740;
                                          }
                                       }

                                       var161 = var147.endsWith("k");
                                    }

                                    if (var161) {
                                       Object[] var172 = Registry.e((long)(1024.0F * var153));
                                       long var62 = 507393495849422758L;
                                       Object[] var61 = var172;
                                       Ref.h(507393495849422758L, var61, var62);

                                       try {
                                          ;
                                       } catch (InvocationTargetException var125) {
                                          throw var125.getTargetException();
                                       }
                                    }
                                 }

                                 Object[] var173 = Registry.packArgs(var147);
                                 long var64 = 232079950911053536L;
                                 Object[] var63 = var173;
                                 Ref.h(232079950911053536L, var63, var64);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var124) {
                                    throw var124.getTargetException();
                                 }

                                 if (var1 == null) {
                                    break label738;
                                 }
                              }

                              var10003 = var21[var6];
                           }

                           String var150 = (String)var10003;
                           if (var1 != null) {
                              break label705;
                           }

                           if (var150.equals("<")) {
                              break label547;
                           }

                           var10003 = var150;
                           if (var1 == null) {
                              if (var150.equals("N") && var1 == null) {
                                 break label547;
                              }

                              var10003 = var150;
                           }

                           long var154;
                           label744: {
                              label745: {
                                 var154 = Long.parseLong((String)var10003);
                                 float var155 = (float)var154 / 1024.0F;
                                 float var211;
                                 int var163 = (var211 = var155 - 1.0F) == 0.0F ? 0 : (var211 < 0.0F ? -1 : 1);
                                 if (var1 == null) {
                                    if (var163 <= 0) {
                                       break label745;
                                    }

                                    float var212;
                                    var163 = (var212 = var155 - 10.0F) == 0.0F ? 0 : (var212 < 0.0F ? -1 : 1);
                                 }

                                 if (var163 < 0) {
                                    new StringBuilder();
                                    Object[] var187 = Registry.packArgs(var155);
                                    long var65 = 122164552401629502L;
                                    Object var10006 = Ref.h2(122164552401629502L, var65);

                                    try {
                                       var10006 = (String)var10006;
                                    } catch (InvocationTargetException var123) {
                                       throw var123.getTargetException();
                                    }

                                    var187 = Registry.packArgs(var187.append((String)var10006).append("m").toString());
                                    long var68 = 232079950911053536L;
                                    Object[] var67 = var187;
                                    Ref.h(232079950911053536L, var67, var68);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var122) {
                                       throw var122.getTargetException();
                                    }

                                    if (var1 == null) {
                                       break label744;
                                    }
                                 }

                                 Object[] var174 = Registry.packArgs((long)var155 + "m");
                                 long var70 = 232079950911053536L;
                                 Object[] var69 = var174;
                                 Ref.h(232079950911053536L, var69, var70);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var121) {
                                    throw var121.getTargetException();
                                 }

                                 if (var1 == null) {
                                    break label744;
                                 }
                              }

                              Object[] var189 = Registry.packArgs(var154 + "");
                              long var72 = 232079950911053536L;
                              Object[] var71 = var189;
                              Ref.h(232079950911053536L, var71, var72);

                              try {
                                 ;
                              } catch (InvocationTargetException var120) {
                                 throw var120.getTargetException();
                              }
                           }

                           Object[] var190 = Registry.e(var154 * b(22719, 7527106416344511461L));
                           long var74 = 507393495849422758L;
                           Object[] var73 = var190;
                           Ref.h(507393495849422758L, var73, var74);

                           try {
                              ;
                           } catch (InvocationTargetException var119) {
                              throw var119.getTargetException();
                           }
                        }

                        String var151 = var21[var7];
                        LI3_2 var191 = var151.endsWith("%");
                        if (var1 == null) {
                           if (var191 != false) {
                              var151 = var151.substring(0, var151.length() - 1);
                           }

                           var191 = var140;
                           Object[] var199 = Registry.packArgs(Float.parseFloat(var151));
                           long var76 = 556286615155400779L;
                           Object[] var75 = var199;
                           Ref.h(556286615155400779L, var75, var76);

                           try {
                              ;
                           } catch (InvocationTargetException var118) {
                              throw var118.getTargetException();
                           }
                        }

                        if (var1 == null) {
                           if (var191 > -1) {
                              Object[] var200 = Registry.packArgs(Float.parseFloat(var21[var8]));
                              long var78 = 527230421287520322L;
                              Object[] var77 = var200;
                              Ref.h(527230421287520322L, var77, var78);

                              try {
                                 ;
                              } catch (InvocationTargetException var117) {
                                 throw var117.getTargetException();
                              }
                           }

                           Object[] var201 = Registry.packArgs(var21[var9]);
                           long var80 = 557805610972727916L;
                           Object[] var79 = var201;
                           Ref.h(557805610972727916L, var79, var80);

                           try {
                              ;
                           } catch (InvocationTargetException var116) {
                              throw var116.getTargetException();
                           }

                           Object[] var209 = Registry.packArgs(var12.size());
                           long var82 = 245181613633392289L;
                           Object[] var81 = var209;
                           Ref.h(245181613633392289L, var81, var82);

                           try {
                              ;
                           } catch (InvocationTargetException var115) {
                              throw var115.getTargetException();
                           }

                           Object[] var210 = Registry.packArgs(var21[var10]);
                           long var84 = 363828870343456302L;
                           Object[] var83 = var210;
                           Ref.h(363828870343456302L, var83, var84);

                           try {
                              ;
                           } catch (InvocationTargetException var114) {
                              throw var114.getTargetException();
                           }

                           Object[] var10009 = Registry.packArgs(this);
                           long var86 = 453043506737409515L;
                           Object[] var85 = var10009;
                           Ref.h(453043506737409515L, var85, var86);

                           try {
                              ;
                           } catch (InvocationTargetException var113) {
                              throw var113.getTargetException();
                           }

                           var12.add(var140);
                        }
                     }
                  }
               }

               var19++;
            }

            if (var1 == null) {
               continue label721;
            }
            break;
         }

         if (var1 == null && var11 == null) {
            break;
         }

         KV var164 = (KV)(Registry.emptyArgs());
         long var88 = 121632250293569146L;
         Object[] var87 = var164;
         var164 = Ref.h(121632250293569146L, var87, var88);

         try {
            var164 = (KV)var164;
         } catch (InvocationTargetException var112) {
            throw var112.getTargetException();
         }

         if (var1 == null) {
            if (var164 == null) {
               break;
            }

            Object[] var175 = Registry.emptyArgs();
            long var90 = 121632250293569146L;
            Object[] var89 = var175;
            Ref.h(121632250293569146L, var89, var90);

            try {
               ;
            } catch (InvocationTargetException var111) {
               throw var111.getTargetException();
            }
         }

         ArrayList var176 = (ArrayList)(Registry.emptyArgs());
         long var92 = 604361570872278918L;
         Object[] var91 = var176;
         var176 = Ref.h(604361570872278918L, var91, var92);

         try {
            var176 = (ArrayList)var176;
         } catch (InvocationTargetException var110) {
            throw var110.getTargetException();
         }

         ArrayList var137 = var176;
         byte var138 = 0;
         int var179 = var137.size();
         if (var1 == null) {
            if (var179 > a(32622, 8221998769936386595L)) {
               var138 = 1;
            }

            var179 = var138;
         }

         label442:
         if (var179 != 0) {
            HashSet var139 = new HashSet();

            for (LI3_2 var145 : var137) {
               Object[] var202 = Registry.emptyArgs();
               long var94 = 419335026051024288L;
               Object[] var93 = var202;
               var202 = Ref.h(419335026051024288L, var93, var94);

               try {
                  var204 = (Integer)var202;
               } catch (InvocationTargetException var109) {
                  throw var109.getTargetException();
               }

               var145.add(var204);
               if (var1 != null) {
                  break label442;
               }

               if (var1 != null) {
                  break;
               }
            }

            ArrayList var142 = new ArrayList();
            Iterator var146 = var12.iterator();

            while (true) {
               if (var146.hasNext()) {
                  LI3_2 var148 = (LI3_2)var146.next();
                  var176 = var148;
                  Object[] var192 = Registry.emptyArgs();
                  long var96 = 419335026051024288L;
                  Object[] var95 = var192;
                  var192 = Ref.h(419335026051024288L, var95, var96);

                  try {
                     var194 = (Integer)var192;
                  } catch (InvocationTargetException var108) {
                     throw var108.getTargetException();
                  }

                  int var152 = var194;
                  boolean var195 = var139.contains(var152);
                  if (var1 != null) {
                     break;
                  }

                  if (var1 == null && !var195) {
                     var142.add(var148);
                  }

                  if (var1 == null) {
                     continue;
                  }
               }

               var176 = var142.size();
               break;
            }

            if (var176 > 0) {
               Registry.lookupField(388376917454860932L).get(null);
               Object[] var196 = Registry.packArgs(new com.finalshell.task.BF(this, var142));
               long var98 = 434592463220957006L;
               Object[] var97 = var196;
               Ref.h(434592463220957006L, var97, var98);

               try {
                  ;
               } catch (InvocationTargetException var107) {
                  throw var107.getTargetException();
               }

               Registry.lookupField(388376917454860932L).get(null);
               Object[] var205 = Registry.packArgs(new OG(this, var142));
               long var100 = 434592463220957006L;
               Object[] var99 = var205;
               Ref.h(434592463220957006L, var99, var100);

               try {
                  ;
               } catch (InvocationTargetException var106) {
                  throw var106.getTargetException();
               }
            }
         }

         Object[] var197 = Registry.emptyArgs();
         long var102 = 121632250293569146L;
         Object[] var101 = var197;
         Ref.h(121632250293569146L, var101, var102);
         Object[] var206 = Registry.packArgs(var12);
         long var104 = 193101484728505773L;
         Object[] var103 = var206;
         Ref.h(193101484728505773L, var103, var104);

         try {
            break;
         } catch (InvocationTargetException var105) {
            throw var105.getTargetException();
         }
      }
   }

   void i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/KV.b$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 494234311615034477
      // 007: astore 7
      // 009: ldc2_w 494234311615034477
      // 00c: aload 7
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 014: invokevirtual com/finalshell/ui/panel/ConnectionProperty.J$IR ()Lcom/finalshell/core/Connect_2;
      // 017: astore 2
      // 018: astore 1
      // 019: bipush 0
      // 01a: istore 3
      // 01b: bipush 0
      // 01c: istore 4
      // 01e: iload 4
      // 020: sipush 1395
      // 023: ldc2_w 3265576280394313787
      // 026: invokestatic com/finalshell/core/CB.a (IJ)I
      // 029: if_icmpge 0d2
      // 02c: bipush 1
      // 02d: istore 5
      // 02f: aload 0
      // 030: aload 1
      // 031: ifnonnull 1ae
      // 034: ldc2_w 494234311615034477
      // 037: astore 9
      // 039: ldc2_w 494234311615034477
      // 03c: aload 9
      // 03e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 041: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 044: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 047: aload 1
      // 048: ifnonnull 077
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 051: athrow
      // 052: ifnull 08d
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: ldc2_w 494234311615034477
      // 060: astore 11
      // 062: ldc2_w 494234311615034477
      // 065: aload 11
      // 067: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 06d: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 076: athrow
      // 077: invokeinterface com/finalshell/core/Fv2_2.K ()Z 1
      // 07c: aload 1
      // 07d: ifnonnull 08f
      // 080: ifeq 08d
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 089: athrow
      // 08a: bipush 0
      // 08b: istore 5
      // 08d: iload 5
      // 08f: aload 1
      // 090: ifnonnull 0bf
      // 093: ifeq 0b7
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09c: athrow
      // 09d: sipush 16769
      // 0a0: ldc2_w 4915683047734323930
      // 0a3: invokestatic com/finalshell/core/CB.b (IJ)J
      // 0a6: invokestatic java/lang/Thread.sleep (J)V
      // 0a9: goto 0c4
      // 0ac: astore 6
      // 0ae: aload 6
      // 0b0: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0b3: aload 1
      // 0b4: ifnull 0c4
      // 0b7: bipush 1
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0be: athrow
      // 0bf: istore 3
      // 0c0: aload 1
      // 0c1: ifnull 0d2
      // 0c4: iinc 4 1
      // 0c7: aload 1
      // 0c8: ifnull 01e
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0d1: athrow
      // 0d2: iload 3
      // 0d3: ifne 0db
      // 0d6: return
      // 0d7: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0da: athrow
      // 0db: sipush 16769
      // 0de: ldc2_w 4915683047734323930
      // 0e1: invokestatic com/finalshell/core/CB.b (IJ)J
      // 0e4: invokestatic java/lang/Thread.sleep (J)V
      // 0e7: goto 0f1
      // 0ea: astore 4
      // 0ec: aload 4
      // 0ee: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0f1: aload 0
      // 0f2: aload 0
      // 0f3: ldc2_w 494234311615034477
      // 0f6: astore 13
      // 0f8: ldc2_w 494234311615034477
      // 0fb: aload 13
      // 0fd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 100: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 103: invokevirtual com/finalshell/ui/panel/ConnectionProperty.C$E0 ()Lcom/finalshell/core/E0;
      // 106: ldc2_w 605457745951191257
      // 109: astore 16
      // 10b: astore 15
      // 10d: ldc2_w 605457745951191257
      // 110: aload 15
      // 112: aload 16
      // 114: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 117: aload 0
      // 118: aload 0
      // 119: ldc2_w 494234311615034477
      // 11c: astore 17
      // 11e: ldc2_w 494234311615034477
      // 121: aload 17
      // 123: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 126: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 129: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 12c: invokeinterface com/finalshell/core/Fv2_2.e ()Lcom/finalshell/crypto/ConnectHost; 1
      // 131: ldc2_w 192945024419546406
      // 134: astore 20
      // 136: astore 19
      // 138: ldc2_w 192945024419546406
      // 13b: aload 19
      // 13d: aload 20
      // 13f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 142: aload 0
      // 143: new java/util/ArrayList
      // 146: dup
      // 147: invokespecial java/util/ArrayList.<init> ()V
      // 14a: ldc2_w 459174019006547256
      // 14d: astore 22
      // 14f: astore 21
      // 151: ldc2_w 459174019006547256
      // 154: aload 21
      // 156: aload 22
      // 158: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 15b: aload 0
      // 15c: ldc2_w 459174019006547256
      // 15f: astore 23
      // 161: ldc2_w 459174019006547256
      // 164: aload 23
      // 166: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 169: checkcast java/util/ArrayList
      // 16c: new com/finalshell/core/VC
      // 16f: dup
      // 170: ldc2_w 325091899221814899
      // 173: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 176: aconst_null
      // 177: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 17a: checkcast java/lang/String
      // 17d: invokespecial com/finalshell/core/VC.<init> (Ljava/lang/String;)V
      // 180: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 183: pop
      // 184: aload 0
      // 185: ldc2_w 459174019006547256
      // 188: astore 25
      // 18a: ldc2_w 459174019006547256
      // 18d: aload 25
      // 18f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 192: checkcast java/util/ArrayList
      // 195: new com/finalshell/core/VC
      // 198: dup
      // 199: ldc2_w 517036517890312843
      // 19c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 19f: aconst_null
      // 1a0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a3: checkcast java/lang/String
      // 1a6: invokespecial com/finalshell/core/VC.<init> (Ljava/lang/String;)V
      // 1a9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ac: pop
      // 1ad: aload 0
      // 1ae: ldc2_w 459174019006547256
      // 1b1: astore 27
      // 1b3: ldc2_w 459174019006547256
      // 1b6: aload 27
      // 1b8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1bb: checkcast java/util/ArrayList
      // 1be: new com/finalshell/core/VC
      // 1c1: dup
      // 1c2: ldc2_w 386046141245462363
      // 1c5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1c8: aconst_null
      // 1c9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cc: checkcast java/lang/String
      // 1cf: invokespecial com/finalshell/core/VC.<init> (Ljava/lang/String;)V
      // 1d2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1d5: pop
      // 1d6: aload 0
      // 1d7: ldc2_w 192945024419546406
      // 1da: astore 29
      // 1dc: ldc2_w 192945024419546406
      // 1df: aload 29
      // 1e1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e4: checkcast com/finalshell/crypto/ConnectHost
      // 1e7: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 1ea: ifeq 258
      // 1ed: aload 0
      // 1ee: aload 1
      // 1ef: ifnonnull 232
      // 1f2: goto 1f9
      // 1f5: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f8: athrow
      // 1f9: ldc2_w 461874265872729632
      // 1fc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1ff: swap
      // 200: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 203: ifeq 23e
      // 206: goto 20d
      // 209: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 20c: athrow
      // 20d: aload 0
      // 20e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 211: ldc2_w 535930732557897699
      // 214: astore 32
      // 216: astore 31
      // 218: ldc2_w 535930732557897699
      // 21b: aload 31
      // 21d: aload 32
      // 21f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 222: pop
      // 223: goto 22a
      // 226: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 229: athrow
      // 22a: aload 0
      // 22b: goto 232
      // 22e: invokestatic com/finalshell/core/CB.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 231: athrow
      // 232: bipush 0
      // 233: ldc2_w 461874265872729632
      // 236: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 239: dup_x2
      // 23a: pop
      // 23b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 23e: sipush 1341
      // 241: ldc2_w 1553324349603049060
      // 244: invokestatic com/finalshell/core/CB.b (IJ)J
      // 247: invokestatic java/lang/Thread.sleep (J)V
      // 24a: goto 1d6
      // 24d: astore 4
      // 24f: aload 4
      // 251: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 254: aload 1
      // 255: ifnull 1d6
      // 258: return
   }

   void u() {
      StringBuffer var2 = new StringBuffer();
      String[] var10000 = KV.b$arrString();
      int var3 = 0;
      String[] var1 = var10000;
      Object var6 = 459174019006547256L;
      Iterator var4 = ((ArrayList)Ref.g(459174019006547256L, var6)).iterator();

      while (true) {
         if (var4.hasNext()) {
            VC var5 = (VC)var4.next();
            String var10003 = (String)(Registry.emptyArgs());
            long var9 = 461417416405690030L;
            Object[] var8 = var10003;
            var10003 = Ref.h(461417416405690030L, var8, var9);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var5.append((String)var10003);
            StringBuilder var28 = new StringBuilder().append(a(-16559, 588));
            Object var10 = 465937413613183069L;
            var28.append(this.append((String)Ref.g(465937413613183069L, var10)).append(";").toString());
            var3++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var2.append(a(-16562, -26366));
         var3 = 0;
         break;
      }

      Object var12 = 459174019006547256L;
      var4 = ((ArrayList)Ref.g(459174019006547256L, var12)).iterator();

      StringBuffer var10002;
      while (true) {
         if (var4.hasNext()) {
            VC var25 = (VC)var4.next();
            var10002 = var2;
            String var10004 = (String)(Registry.emptyArgs());
            long var15 = 461417416405690030L;
            Object[] var14 = var10004;
            var10004 = Ref.h(461417416405690030L, var14, var15);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            var25.append((String)var10004);
            StringBuilder var32 = new StringBuilder().append(a(-16575, -26654));
            Object var16 = 465937413613183069L;
            var32.append(this.append((String)Ref.g(465937413613183069L, var16)).append(";").toString());
            if (var1 != null) {
               break;
            }

            var3++;
            if (var1 == null) {
               continue;
            }
         }

         var10002 = var2;
         break;
      }

      String var24 = var10002.toString();
      Object[] var29 = Registry.packArgs(var24);
      long var19 = 316461647454649571L;
      Object[] var18 = var29;
      Ref.h(316461647454649571L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   void O(String var1) {
      Object var2 = 494234311615034477L;
      E0 var10002 = ((ConnectionProperty)Ref.g(494234311615034477L, var2)).C$E0();
      long var5 = 605457745951191257L;
      E0 var4 = var10002;
      Ref.s(605457745951191257L, var4, var5);
      Object var6 = 605457745951191257L;
      ((E0)Ref.g(605457745951191257L, var6)).D(var1 + "\n");
   }

   public void c(LM var1) {
      KV.b$arrString();
      Registry.lookupField(461874265872729632L).setBoolean(this, true);
      Object[] var10002 = Registry.emptyArgs();
      long var11 = 616809793215823369L;
      Object[] var10 = var10002;
      Ref.h(616809793215823369L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      LM var2 = var1;
      StringBuilder var44 = new StringBuilder();
      Object var12 = 465937413613183069L;
      String[] var4 = var44.split(this.append((String)Ref.g(465937413613183069L, var12)).append("\n").toString());
      int var5 = 0;

      while (true) {
         if (var5 < var4.length) {
            String var10004 = var4[var5];
            Object var14 = 465937413613183069L;
            ((Object[])var5)[var10004] = (int)this.replaceAll((String)Ref.g(465937413613183069L, var14), "");
            var4[var5] = var4[var5].substring(0, var4[var5].length() - 1);
            var5++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         Object var16 = 459174019006547256L;
         var5 = ((ArrayList)Ref.g(459174019006547256L, var16)).size();
         break;
      }

      for (String var9 : var4) {
         if (var2 != null) {
            break;
         }
      }

      int var38 = 0;

      while (true) {
         if (var38 < var5) {
            Object var18 = 459174019006547256L;
            VC var39 = (VC)((ArrayList)Ref.g(459174019006547256L, var18)).get(var38);
            String var41 = var4[var38];
            Object[] var10005 = Registry.packArgs(var41);
            long var21 = 304109380477257653L;
            Object[] var20 = var10005;
            Ref.h(304109380477257653L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var36) {
               throw var36.getTargetException();
            }

            var38++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var38 = 0;
         break;
      }

      int var40 = var5;

      while (var40 < 2 * var5) {
         Object var22 = 459174019006547256L;
         VC var42 = (VC)((ArrayList)Ref.g(459174019006547256L, var22)).get(var38);
         String var43 = var4[var40];
         Object[] var45 = Registry.packArgs(var43);
         long var25 = 416220076523284420L;
         Object[] var24 = var45;
         Ref.h(416220076523284420L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         Object var26 = 612473087890652491L;
         Object[] var10007 = Registry.packArgs(Ref.g(612473087890652491L, var26));
         long var29 = 565357188175605126L;
         Object[] var28 = var10007;
         Ref.h(565357188175605126L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         Object var30 = 612473087890652491L;
         Registry.lookupField(461634183601281643L).setBoolean(Ref.g(612473087890652491L, var30), false);
         Object var32 = 612473087890652491L;
         Registry.lookupField(208124046164384842L).setLong(Ref.g(612473087890652491L, var32), System.currentTimeMillis());
         var38++;
         var40++;
         if (var2 != null) {
            break;
         }
      }
   }

   public KV O() {
      Object var1 = 612473087890652491L;
      return (KV)Ref.g(612473087890652491L, var1);
   }

   public Ty2 Z() {
      Object var1 = 414347828709011535L;
      return (Ty2)Ref.g(414347828709011535L, var1);
   }

   public void p(Ty2 var1) {
      long var3 = 414347828709011535L;
      Ref.s(414347828709011535L, var1, var3);
   }

   public void P() {
      long var2 = 494234311615034477L;
      Object var1 = null;
      Ref.s(494234311615034477L, var1, var2);
      long var4 = 322212976240245898L;
      Object var3 = null;
      Ref.s(322212976240245898L, var3, var4);
      long var6 = 605457745951191257L;
      Object var5 = null;
      Ref.s(605457745951191257L, var5, var6);
      long var8 = 192945024419546406L;
      Object var7 = null;
      Ref.s(192945024419546406L, var7, var8);
      long var10 = 459174019006547256L;
      Object var9 = null;
      Ref.s(459174019006547256L, var9, var10);
      long var12 = 465937413613183069L;
      Object var11 = null;
      Ref.s(465937413613183069L, var11, var12);
      long var14 = 612473087890652491L;
      Object var13 = null;
      Ref.s(612473087890652491L, var13, var14);
      long var16 = 423426464359177155L;
      Object var15 = null;
      Ref.s(423426464359177155L, var15, var16);
      long var18 = 414347828709011535L;
      Object var17 = null;
      Ref.s(414347828709011535L, var17, var18);
      long var20 = 569355164589280895L;
      Object var19 = null;
      Ref.s(569355164589280895L, var19, var20);
      long var22 = 441946618932660847L;
      Object var21 = null;
      Ref.s(441946618932660847L, var21, var22);
   }

   public void r() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Yl2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -16567) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 110;
               break;
            case 1:
               var10000 = 142;
               break;
            case 2:
               var10000 = 72;
               break;
            case 3:
               var10000 = 121;
               break;
            case 4:
               var10000 = 163;
               break;
            case 5:
               var10000 = 233;
               break;
            case 6:
               var10000 = 171;
               break;
            case 7:
               var10000 = 112;
               break;
            case 8:
               var10000 = 145;
               break;
            case 9:
               var10000 = 13;
               break;
            case 10:
               var10000 = 232;
               break;
            case 11:
               var10000 = 102;
               break;
            case 12:
               var10000 = 194;
               break;
            case 13:
               var10000 = 89;
               break;
            case 14:
               var10000 = 63;
               break;
            case 15:
               var10000 = 165;
               break;
            case 16:
               var10000 = 101;
               break;
            case 17:
               var10000 = 76;
               break;
            case 18:
               var10000 = 116;
               break;
            case 19:
               var10000 = 252;
               break;
            case 20:
               var10000 = 150;
               break;
            case 21:
               var10000 = 114;
               break;
            case 22:
               var10000 = 5;
               break;
            case 23:
               var10000 = 47;
               break;
            case 24:
               var10000 = 231;
               break;
            case 25:
               var10000 = 120;
               break;
            case 26:
               var10000 = 184;
               break;
            case 27:
               var10000 = 154;
               break;
            case 28:
               var10000 = 238;
               break;
            case 29:
               var10000 = 7;
               break;
            case 30:
               var10000 = 46;
               break;
            case 31:
               var10000 = 107;
               break;
            case 32:
               var10000 = 91;
               break;
            case 33:
               var10000 = 148;
               break;
            case 34:
               var10000 = 60;
               break;
            case 35:
               var10000 = 237;
               break;
            case 36:
               var10000 = 234;
               break;
            case 37:
               var10000 = 75;
               break;
            case 38:
               var10000 = 198;
               break;
            case 39:
               var10000 = 250;
               break;
            case 40:
               var10000 = 86;
               break;
            case 41:
               var10000 = 255;
               break;
            case 42:
               var10000 = 82;
               break;
            case 43:
               var10000 = 124;
               break;
            case 44:
               var10000 = 52;
               break;
            case 45:
               var10000 = 182;
               break;
            case 46:
               var10000 = 84;
               break;
            case 47:
               var10000 = 15;
               break;
            case 48:
               var10000 = 156;
               break;
            case 49:
               var10000 = 166;
               break;
            case 50:
               var10000 = 170;
               break;
            case 51:
               var10000 = 50;
               break;
            case 52:
               var10000 = 24;
               break;
            case 53:
               var10000 = 199;
               break;
            case 54:
               var10000 = 236;
               break;
            case 55:
               var10000 = 183;
               break;
            case 56:
               var10000 = 4;
               break;
            case 57:
               var10000 = 247;
               break;
            case 58:
               var10000 = 226;
               break;
            case 59:
               var10000 = 228;
               break;
            case 60:
               var10000 = 242;
               break;
            case 61:
               var10000 = 19;
               break;
            case 62:
               var10000 = 23;
               break;
            case 63:
               var10000 = 105;
               break;
            case 64:
               var10000 = 61;
               break;
            case 65:
               var10000 = 16;
               break;
            case 66:
               var10000 = 69;
               break;
            case 67:
               var10000 = 141;
               break;
            case 68:
               var10000 = 26;
               break;
            case 69:
               var10000 = 146;
               break;
            case 70:
               var10000 = 9;
               break;
            case 71:
               var10000 = 28;
               break;
            case 72:
               var10000 = 42;
               break;
            case 73:
               var10000 = 211;
               break;
            case 74:
               var10000 = 222;
               break;
            case 75:
               var10000 = 27;
               break;
            case 76:
               var10000 = 175;
               break;
            case 77:
               var10000 = 209;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 92;
               break;
            case 80:
               var10000 = 78;
               break;
            case 81:
               var10000 = 14;
               break;
            case 82:
               var10000 = 29;
               break;
            case 83:
               var10000 = 127;
               break;
            case 84:
               var10000 = 203;
               break;
            case 85:
               var10000 = 168;
               break;
            case 86:
               var10000 = 71;
               break;
            case 87:
               var10000 = 207;
               break;
            case 88:
               var10000 = 176;
               break;
            case 89:
               var10000 = 49;
               break;
            case 90:
               var10000 = 206;
               break;
            case 91:
               var10000 = 65;
               break;
            case 92:
               var10000 = 152;
               break;
            case 93:
               var10000 = 220;
               break;
            case 94:
               var10000 = 133;
               break;
            case 95:
               var10000 = 43;
               break;
            case 96:
               var10000 = 210;
               break;
            case 97:
               var10000 = 200;
               break;
            case 98:
               var10000 = 230;
               break;
            case 99:
               var10000 = 122;
               break;
            case 100:
               var10000 = 186;
               break;
            case 101:
               var10000 = 169;
               break;
            case 102:
               var10000 = 41;
               break;
            case 103:
               var10000 = 159;
               break;
            case 104:
               var10000 = 90;
               break;
            case 105:
               var10000 = 96;
               break;
            case 106:
               var10000 = 108;
               break;
            case 107:
               var10000 = 177;
               break;
            case 108:
               var10000 = 202;
               break;
            case 109:
               var10000 = 216;
               break;
            case 110:
               var10000 = 109;
               break;
            case 111:
               var10000 = 172;
               break;
            case 112:
               var10000 = 205;
               break;
            case 113:
               var10000 = 179;
               break;
            case 114:
               var10000 = 178;
               break;
            case 115:
               var10000 = 137;
               break;
            case 116:
               var10000 = 94;
               break;
            case 117:
               var10000 = 88;
               break;
            case 118:
               var10000 = 31;
               break;
            case 119:
               var10000 = 32;
               break;
            case 120:
               var10000 = 39;
               break;
            case 121:
               var10000 = 35;
               break;
            case 122:
               var10000 = 201;
               break;
            case 123:
               var10000 = 83;
               break;
            case 124:
               var10000 = 131;
               break;
            case 125:
               var10000 = 136;
               break;
            case 126:
               var10000 = 221;
               break;
            case 127:
               var10000 = 208;
               break;
            case 128:
               var10000 = 123;
               break;
            case 129:
               var10000 = 55;
               break;
            case 130:
               var10000 = 243;
               break;
            case 131:
               var10000 = 3;
               break;
            case 132:
               var10000 = 185;
               break;
            case 133:
               var10000 = 174;
               break;
            case 134:
               var10000 = 229;
               break;
            case 135:
               var10000 = 193;
               break;
            case 136:
               var10000 = 162;
               break;
            case 137:
               var10000 = 59;
               break;
            case 138:
               var10000 = 153;
               break;
            case 139:
               var10000 = 245;
               break;
            case 140:
               var10000 = 34;
               break;
            case 141:
               var10000 = 143;
               break;
            case 142:
               var10000 = 253;
               break;
            case 143:
               var10000 = 74;
               break;
            case 144:
               var10000 = 97;
               break;
            case 145:
               var10000 = 219;
               break;
            case 146:
               var10000 = 244;
               break;
            case 147:
               var10000 = 98;
               break;
            case 148:
               var10000 = 44;
               break;
            case 149:
               var10000 = 11;
               break;
            case 150:
               var10000 = 30;
               break;
            case 151:
               var10000 = 38;
               break;
            case 152:
               var10000 = 204;
               break;
            case 153:
               var10000 = 160;
               break;
            case 154:
               var10000 = 149;
               break;
            case 155:
               var10000 = 246;
               break;
            case 156:
               var10000 = 214;
               break;
            case 157:
               var10000 = 48;
               break;
            case 158:
               var10000 = 218;
               break;
            case 159:
               var10000 = 251;
               break;
            case 160:
               var10000 = 70;
               break;
            case 161:
               var10000 = 190;
               break;
            case 162:
               var10000 = 115;
               break;
            case 163:
               var10000 = 164;
               break;
            case 164:
               var10000 = 129;
               break;
            case 165:
               var10000 = 225;
               break;
            case 166:
               var10000 = 85;
               break;
            case 167:
               var10000 = 144;
               break;
            case 168:
               var10000 = 249;
               break;
            case 169:
               var10000 = 57;
               break;
            case 170:
               var10000 = 197;
               break;
            case 171:
               var10000 = 79;
               break;
            case 172:
               var10000 = 195;
               break;
            case 173:
               var10000 = 119;
               break;
            case 174:
               var10000 = 68;
               break;
            case 175:
               var10000 = 173;
               break;
            case 176:
               var10000 = 45;
               break;
            case 177:
               var10000 = 224;
               break;
            case 178:
               var10000 = 212;
               break;
            case 179:
               var10000 = 21;
               break;
            case 180:
               var10000 = 104;
               break;
            case 181:
               var10000 = 241;
               break;
            case 182:
               var10000 = 58;
               break;
            case 183:
               var10000 = 217;
               break;
            case 184:
               var10000 = 239;
               break;
            case 185:
               var10000 = 248;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 132;
               break;
            case 188:
               var10000 = 18;
               break;
            case 189:
               var10000 = 54;
               break;
            case 190:
               var10000 = 100;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 135;
               break;
            case 193:
               var10000 = 93;
               break;
            case 194:
               var10000 = 33;
               break;
            case 195:
               var10000 = 77;
               break;
            case 196:
               var10000 = 117;
               break;
            case 197:
               var10000 = 81;
               break;
            case 198:
               var10000 = 227;
               break;
            case 199:
               var10000 = 67;
               break;
            case 200:
               var10000 = 188;
               break;
            case 201:
               var10000 = 111;
               break;
            case 202:
               var10000 = 10;
               break;
            case 203:
               var10000 = 118;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 151;
               break;
            case 206:
               var10000 = 87;
               break;
            case 207:
               var10000 = 66;
               break;
            case 208:
               var10000 = 99;
               break;
            case 209:
               var10000 = 6;
               break;
            case 210:
               var10000 = 187;
               break;
            case 211:
               var10000 = 12;
               break;
            case 212:
               var10000 = 25;
               break;
            case 213:
               var10000 = 103;
               break;
            case 214:
               var10000 = 64;
               break;
            case 215:
               var10000 = 22;
               break;
            case 216:
               var10000 = 191;
               break;
            case 217:
               var10000 = 80;
               break;
            case 218:
               var10000 = 0;
               break;
            case 219:
               var10000 = 62;
               break;
            case 220:
               var10000 = 157;
               break;
            case 221:
               var10000 = 106;
               break;
            case 222:
               var10000 = 147;
               break;
            case 223:
               var10000 = 36;
               break;
            case 224:
               var10000 = 73;
               break;
            case 225:
               var10000 = 37;
               break;
            case 226:
               var10000 = 56;
               break;
            case 227:
               var10000 = 180;
               break;
            case 228:
               var10000 = 223;
               break;
            case 229:
               var10000 = 140;
               break;
            case 230:
               var10000 = 130;
               break;
            case 231:
               var10000 = 196;
               break;
            case 232:
               var10000 = 213;
               break;
            case 233:
               var10000 = 51;
               break;
            case 234:
               var10000 = 134;
               break;
            case 235:
               var10000 = 189;
               break;
            case 236:
               var10000 = 40;
               break;
            case 237:
               var10000 = 155;
               break;
            case 238:
               var10000 = 2;
               break;
            case 239:
               var10000 = 53;
               break;
            case 240:
               var10000 = 113;
               break;
            case 241:
               var10000 = 181;
               break;
            case 242:
               var10000 = 215;
               break;
            case 243:
               var10000 = 126;
               break;
            case 244:
               var10000 = 240;
               break;
            case 245:
               var10000 = 8;
               break;
            case 246:
               var10000 = 20;
               break;
            case 247:
               var10000 = 125;
               break;
            case 248:
               var10000 = 254;
               break;
            case 249:
               var10000 = 158;
               break;
            case 250:
               var10000 = 161;
               break;
            case 251:
               var10000 = 235;
               break;
            case 252:
               var10000 = 1;
               break;
            case 253:
               var10000 = 138;
               break;
            case 254:
               var10000 = 128;
               break;
            default:
               var10000 = 95;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13646;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 27480) & 32767;
      if (i[var3] == null) {
         i[var3] = h[var3] ^ var1;
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[26];
      int var19 = 0;
      String var18 = "\u0084ïÍXçÂ¿\u0003\u0010RÅ\u0003\u0006×\u001e\u0004Ðbð|\u00048s|H\u0002\u0085Q\u0004§t\u001e¾\b ¸GÝª1tÂ\u0006?ºã¸ç1\u000f°mD\n¢iT<àªbÜ§\u000e\b\u0004\u0017É\u001dÞ\u0004Ã]«¥\u0007\u0007\u001d'Y\u007fÃ\u000e\u0003Ê5|\u0007et÷¤B¶¯\u0004ð'ÈÔ\u0003\u000fTÄ\u0004ÛH\u0092\u0081\u0003àÓ\u00ad\u0004NKHL\u0003\u0090Ûb\u0016à\u0014U\u0003Ïì[¯·é\u0098Ý\u00ad[ï©Ó\u0080\u0090z\u0087W\bºvÖë\u0082Gô?\u0003ù\u0002Â";
      int var20 = "\u0084ïÍXçÂ¿\u0003\u0010RÅ\u0003\u0006×\u001e\u0004Ðbð|\u00048s|H\u0002\u0085Q\u0004§t\u001e¾\b ¸GÝª1tÂ\u0006?ºã¸ç1\u000f°mD\n¢iT<àªbÜ§\u000e\b\u0004\u0017É\u001dÞ\u0004Ã]«¥\u0007\u0007\u001d'Y\u007fÃ\u000e\u0003Ê5|\u0007et÷¤B¶¯\u0004ð'ÈÔ\u0003\u000fTÄ\u0004ÛH\u0092\u0081\u0003àÓ\u00ad\u0004NKHL\u0003\u0090Ûb\u0016à\u0014U\u0003Ïì[¯·é\u0098Ý\u00ad[ï©Ó\u0080\u0090z\u0087W\bºvÖë\u0082Gô?\u0003ù\u0002Â"
         .length();
      char var17 = 7;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 55;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
      long var46;
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 12;
                        break;
                     case 1:
                        var84 = 28;
                        break;
                     case 2:
                        var84 = 107;
                        break;
                     case 3:
                        var84 = 28;
                        break;
                     case 4:
                        var84 = 71;
                        break;
                     case 5:
                        var84 = 49;
                        break;
                     default:
                        var84 = 87;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     d = new String[26];
                     long var8 = 4761181882641538023L;
                     long[] var14 = new long[8];
                     int var11 = 0;
                     String var12 = "æ\u008d\u00adÜþms¨{\u009f\u00928W\u00ad\"+£Áî½\u009c¿gÖX[\u0003yð\u001e\u0011Î\u00069\\ãöµ1\u008eõ\u0088ñ~\u0093\u0018^¦";
                     int var13 = "æ\u008d\u00adÜþms¨{\u009f\u00928W\u00ad\"+£Áî½\u009c¿gÖX[\u0003yð\u001e\u0011Î\u00069\\ãöµ1\u008eõ\u0088ñ~\u0093\u0018^¦"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    e = var14;
                                    f = new Integer[8];
                                    long var0 = 4584171703774347332L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "?\u0087×_ào\u0017½*\u0010»¤wÓî*";
                                    int var5 = "?\u0087×_ào\u0017½*\u0010»¤wÓî*".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   h = var6;
                                                   i = new Long[4];
                                                   Registry.lookupField(182216215957619048L).setInt(null, a(24358, 8051284793656797804L));
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "Wë\u0098\u0087¬\u00197¡{¦<PhC*ú";
                                                var5 = "Wë\u0098\u0087¬\u00197¡{¦<PhC*ú".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "-Ó\u00adÙ\n\u0007ë¸Ã\u0013Ñ\u009dÈU<Ã";
                                 var13 = "-Ó\u00adÙ\n\u0007ë¸Ã\u0013Ñ\u009dÈU<Ã".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "áñ®GØX\u0004±åv\u001a";
                  var20 = "áñ®GØX\u0004±åv\u001a".length();
                  var17 = 6;
                  var26 = -1;
            }

            var10000 = 35;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





