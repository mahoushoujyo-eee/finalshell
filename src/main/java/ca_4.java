import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Iterator;

public class ca_4 {
   WatchService u;
   String S;
   HashMap Y;
   HashMap C;
   Object y;
   private static final long[] a;
   private static final Long[] b;

   static void y() {
      long var9;
      label59: {
         boolean var0 = F6.i();
         long var27;
         int var10000 = (var27 = com.DI.ia - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
         if (var0) {
            if (var10000 > 0) {
               Object[] var5 = com.c.f();
               Method var6 = com.c.d(270389152141252877L);
               Object[] var21 = var5;
               Object var14 = null;

               try {
                  var7 = var6.invoke(var14, var21);
               } catch (InvocationTargetException var4) {
                  throw var4.getTargetException();
               }

               var14 = com.c.f();
               Method var10003 = com.c.d(145683417870459673L);
               var21 = (Object[])var14;
               var14 = var7;
               Method var8 = var10003;

               try {
                  var8.invoke(var14, var21);
               } catch (InvocationTargetException var3) {
                  throw var3.getTargetException();
               }

               com.DI.ia = 0L;
               if (var0) {
                  return;
               }
            }

            var9 = com.DI.J;
            if (!var0) {
               break label59;
            }

            long var28;
            var10000 = (var28 = com.DI.J - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
         }

         if (var10000 <= 0) {
            return;
         }

         Object[] var10 = com.c.f();
         Method var11 = com.c.d(270389152141252877L);
         Object[] var24 = var10;
         Object var18 = null;

         try {
            var12 = var11.invoke(var18, var24);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }

         var18 = com.c.f();
         Method var26 = com.c.d(522101553831913305L);
         var24 = (Object[])var18;
         var18 = var12;
         Method var13 = var26;

         try {
            var13.invoke(var18, var24);
         } catch (InvocationTargetException var1) {
            throw var1.getTargetException();
         }

         var9 = 0L;
      }

      com.DI.J = var9;
   }

   public ca_4() throws IOException {
      com.c.c(234610728094808892L).set(this, com.c.c(439146272996415412L).get(null));
      com.c.c(594978751216619164L).set(this, new HashMap());
      com.c.c(596681963206121946L).set(this, new HashMap());
      com.c.c(437411261289262047L).set(this, new Object());
      com.c.c(216967237284821558L).set(this, FileSystems.getDefault().newWatchService());
      Path var1 = Paths.get((String)com.c.c(234610728094808892L).get(this));
      WatchKey var2 = var1.register(
         (WatchService)com.c.c(216967237284821558L).get(this), StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE
      );
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new QZ(this));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = (Method)com.c.c(388376917454860932L).get(null);
      var10001 = com.c.a(new gM(this));
      var10003 = com.c.d(434592463220957006L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void U() {
      boolean var10000 = F6.i();
      Object var2;
      synchronized (var2 = com.c.c(437411261289262047L).get(this)){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         Iterator var3 = ((HashMap)com.c.c(596681963206121946L).get(this)).keySet().iterator();

         while (true) {
            label120:
            if (var3.hasNext()) {
               String var4 = (String)var3.next();
               YI var5 = (YI)((HashMap)com.c.c(596681963206121946L).get(this)).get(var4);
               if (!var1) {
                  break;
               }

               label117: {
                  if (var1) {
                     long var21 = System.currentTimeMillis();
                     Object[] var10002 = com.c.f();
                     Method var10004 = com.c.d(463739992279195407L);
                     Object[] var10003 = var10002;
                     YI var41 = var5;
                     Method var10001 = var10004;

                     try {
                        var30 = (Long)var10001.invoke(var41, var10003);
                     } catch (InvocationTargetException var19) {
                        throw var19.getTargetException();
                     }

                     if (var21 - var30 <= a(23198, 8419433224076059951L)) {
                        break label117;
                     }

                     Object[] var31 = com.c.f();
                     Method var48 = com.c.d(268465037806953599L);
                     var10002 = var31;
                     YI var32 = var5;
                     Method var22 = var48;

                     try {
                        var22.invoke(var32, var10002);
                     } catch (InvocationTargetException var18) {
                        throw var18.getTargetException();
                     }

                     Object[] var23 = com.c.f();
                     Method var24 = com.c.d(270389152141252877L);
                     var10002 = var23;
                     var10001 = null;

                     try {
                        var25 = var24.invoke(var10001, var10002);
                     } catch (InvocationTargetException var17) {
                        throw var17.getTargetException();
                     }

                     Object[] var35 = com.c.f();
                     Method var49 = com.c.d(377280722715900564L);
                     var10002 = var35;
                     var10001 = (Method)var25;
                     Method var26 = var49;

                     try {
                        var27 = var26.invoke(var10001, var10002);
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     Object[] var37 = com.c.a(var5);
                     Method var50 = com.c.d(118191003152152827L);
                     var10002 = var37;
                     var10001 = (Method)var27;
                     Method var28 = var50;

                     try {
                        var28.invoke(var10001, var10002);
                     } catch (InvocationTargetException var15) {
                        throw var15.getTargetException();
                     }

                     ((HashMap)com.c.c(596681963206121946L).get(this)).remove(var4);
                     Object[] var39 = com.c.a(new CZ(this, var5, var4));
                     Method var51 = com.c.d(541437196102236947L);
                     var10002 = var39;
                     YI var40 = var5;
                     Method var29 = var51;

                     try {
                        var29.invoke(var40, var10002);
                     } catch (InvocationTargetException var14) {
                        throw var14.getTargetException();
                     }
                  }

                  if (var1) {
                     break label120;
                  }
               }

               if (var1) {
                  continue;
               }
            }

            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public void l(String var1, YI var2) {
      String var3 = new File(var1).getAbsolutePath();
      ((HashMap)com.c.c(594978751216619164L).get(this)).put(var3, var2);
   }

   public void O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic F6.g ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 216967237284821558
      // 008: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00b: swap
      // 00c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00f: checkcast java/nio/file/WatchService
      // 012: invokeinterface java/nio/file/WatchService.take ()Ljava/nio/file/WatchKey; 1
      // 017: astore 2
      // 018: aload 2
      // 019: invokeinterface java/nio/file/WatchKey.pollEvents ()Ljava/util/List; 1
      // 01e: astore 3
      // 01f: aload 3
      // 020: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 025: astore 4
      // 027: aload 4
      // 029: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02e: ifeq 22c
      // 031: aload 4
      // 033: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 038: checkcast java/nio/file/WatchEvent
      // 03b: astore 5
      // 03d: new java/io/File
      // 040: dup
      // 041: new java/lang/StringBuilder
      // 044: dup
      // 045: invokespecial java/lang/StringBuilder.<init> ()V
      // 048: aload 0
      // 049: ldc2_w 234610728094808892
      // 04c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04f: swap
      // 050: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 053: checkcast java/lang/String
      // 056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 059: getstatic java/io/File.separator Ljava/lang/String;
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: aload 5
      // 061: invokeinterface java/nio/file/WatchEvent.context ()Ljava/lang/Object; 1
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 069: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 06f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 072: astore 6
      // 074: new java/io/File
      // 077: dup
      // 078: aload 6
      // 07a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 07d: astore 7
      // 07f: invokestatic java/lang/System.currentTimeMillis ()J
      // 082: aload 7
      // 084: invokevirtual java/io/File.lastModified ()J
      // 087: lsub
      // 088: lstore 8
      // 08a: iload 1
      // 08b: ifne 0bb
      // 08e: aload 7
      // 090: invokevirtual java/io/File.exists ()Z
      // 093: iload 1
      // 094: ifne 232
      // 097: goto 09e
      // 09a: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09d: athrow
      // 09e: ifne 0c6
      // 0a1: goto 0a8
      // 0a4: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: ldc2_w 216967237284821558
      // 0ac: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0af: swap
      // 0b0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b3: checkcast java/nio/file/WatchService
      // 0b6: invokeinterface java/nio/file/WatchService.close ()V 1
      // 0bb: goto 0c5
      // 0be: astore 10
      // 0c0: aload 10
      // 0c2: invokevirtual java/io/IOException.printStackTrace ()V
      // 0c5: return
      // 0c6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0c9: ldc2_w 270389152141252877
      // 0cc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0cf: swap
      // 0d0: aconst_null
      // 0d1: swap
      // 0d2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d5: goto 0dc
      // 0d8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0df: ldc2_w 377280722715900564
      // 0e2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ea: checkcast lL_3
      // 0ed: goto 0f4
      // 0f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: astore 10
      // 0f6: aload 10
      // 0f8: aload 6
      // 0fa: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fd: ldc2_w 495693745913590487
      // 100: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 103: dup_x2
      // 104: pop
      // 105: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 108: checkcast java/lang/Boolean
      // 10b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10e: goto 115
      // 111: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 114: athrow
      // 115: iload 1
      // 116: ifne 13f
      // 119: ifne 228
      // 11c: goto 123
      // 11f: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 122: athrow
      // 123: invokestatic com/c.f ()[Ljava/lang/Object;
      // 126: ldc2_w 454647487873911743
      // 129: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 12c: swap
      // 12d: aconst_null
      // 12e: swap
      // 12f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 132: checkcast java/lang/Boolean
      // 135: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 138: goto 13f
      // 13b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: ifeq 180
      // 142: invokestatic java/lang/System.currentTimeMillis ()J
      // 145: aload 10
      // 147: aload 6
      // 149: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14c: ldc2_w 481459519974677321
      // 14f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 152: dup_x2
      // 153: pop
      // 154: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 157: checkcast java/lang/Long
      // 15a: invokevirtual java/lang/Long.longValue ()J
      // 15d: goto 164
      // 160: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 163: athrow
      // 164: lsub
      // 165: lstore 11
      // 167: lload 11
      // 169: bipush 90
      // 16b: ldc2_w 2228209822511349738
      // 16e: invokestatic ca_4.a (IJ)J
      // 171: lcmp
      // 172: ifge 180
      // 175: iload 1
      // 176: ifeq 027
      // 179: goto 180
      // 17c: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17f: athrow
      // 180: aload 7
      // 182: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 185: astore 11
      // 187: aload 11
      // 189: bipush 0
      // 18a: bipush 2
      // 18b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 18e: astore 12
      // 190: aload 0
      // 191: ldc2_w 594978751216619164
      // 194: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 197: swap
      // 198: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 19b: checkcast java/util/HashMap
      // 19e: aload 6
      // 1a0: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a3: checkcast YI
      // 1a6: astore 13
      // 1a8: aload 13
      // 1aa: iload 1
      // 1ab: ifne 1e8
      // 1ae: ifnull 228
      // 1b1: goto 1b8
      // 1b4: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b7: athrow
      // 1b8: aload 13
      // 1ba: invokestatic java/lang/System.currentTimeMillis ()J
      // 1bd: invokestatic com/c.e (J)[Ljava/lang/Object;
      // 1c0: ldc2_w 443295053115350124
      // 1c3: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1c6: dup_x2
      // 1c7: pop
      // 1c8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1cb: pop
      // 1cc: goto 1d3
      // 1cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: ldc2_w 437411261289262047
      // 1d7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1da: swap
      // 1db: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1de: checkcast java/lang/Object
      // 1e1: goto 1e8
      // 1e4: invokestatic ca_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e7: athrow
      // 1e8: dup
      // 1e9: astore 14
      // 1eb: monitorenter
      // 1ec: aload 0
      // 1ed: ldc2_w 596681963206121946
      // 1f0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1f3: swap
      // 1f4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f7: checkcast java/util/HashMap
      // 1fa: aload 13
      // 1fc: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1ff: ldc2_w 191716730601734423
      // 202: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 205: dup_x2
      // 206: pop
      // 207: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 20a: checkcast java/lang/String
      // 20d: goto 214
      // 210: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 213: athrow
      // 214: aload 13
      // 216: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 219: pop
      // 21a: aload 14
      // 21c: monitorexit
      // 21d: goto 228
      // 220: astore 15
      // 222: aload 14
      // 224: monitorexit
      // 225: aload 15
      // 227: athrow
      // 228: iload 1
      // 229: ifeq 027
      // 22c: aload 2
      // 22d: invokeinterface java/nio/file/WatchKey.reset ()Z 1
      // 232: pop
      // 233: goto 004
      // 236: astore 2
      // 237: aload 2
      // 238: invokevirtual java/lang/Exception.printStackTrace ()V
      // 23b: aload 0
      // 23c: ldc2_w 216967237284821558
      // 23f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 242: swap
      // 243: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 246: checkcast java/nio/file/WatchService
      // 249: invokeinterface java/nio/file/WatchService.close ()V 1
      // 24e: goto 27b
      // 251: astore 2
      // 252: aload 2
      // 253: invokevirtual java/io/IOException.printStackTrace ()V
      // 256: goto 27b
      // 259: astore 16
      // 25b: aload 0
      // 25c: ldc2_w 216967237284821558
      // 25f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 262: swap
      // 263: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 266: checkcast java/nio/file/WatchService
      // 269: invokeinterface java/nio/file/WatchService.close ()V 1
      // 26e: goto 278
      // 271: astore 17
      // 273: aload 17
      // 275: invokevirtual java/io/IOException.printStackTrace ()V
      // 278: aload 16
      // 27a: athrow
      // 27b: return
   }

   static {
      long var10 = 7912007353809633475L;
      long var10002 = 3694413090488188939L ^ var10;
      int var10001 = -1;
      long var8 = var10002;
      long var0 = 375315575166384396L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "qâ¶n3Z_Ë\u001bÙR\u0081Û¥\u00816";
      int var5 = "qâ¶n3Z_Ë\u001bÙR\u0081Û¥\u00816".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
      com.DI.W();
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var16 = com.c.a(new BG(), (int)var8);
      Method var19 = com.c.d(201859364639460244L);
      Object[] var18 = var16;
      Object var17 = var10000;
      var10000 = var19;

      try {
         var10000.invoke(var17, var18);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16305) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





