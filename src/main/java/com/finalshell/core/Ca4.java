package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.BG;
import com.finalshell.task.QZ;
import com.finalshell.ui.panel.Address;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Iterator;

public class Ca4 {
   public WatchService u;
   public String S;
   public HashMap Y;
   public HashMap C;
   public Object y;
   public static long[] a;
   public static Long[] b;

   public static void y() {
      long var9;
      label38: {
         long var0 = (((((long)Address.i()) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
         long var11;
         int var10000 = (var11 = ConnectHost.ia - 0L) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         if (var0 != false) {
            if (var10000 > 0) {
               Registry.emptyArgs();
               long var1 = 270389152141252877L;
               Ref.h2(270389152141252877L, var1);
               Object[] var10002 = Registry.emptyArgs();
               long var4 = 145683417870459673L;
               Object[] var3 = var10002;
               Ref.h(145683417870459673L, var3, var4);
               ConnectHost.ia = 0L;
               var9 = var0;
               if (var0 != false) {
                  return;
               }
            }

            if (var0 == false) {
               break label38;
            }

            long var12;
            var10000 = (var12 = ConnectHost.J - 0L) == 0L ? 0 : (var12 < 0L ? -1 : 1);
         }

         if (var10000 <= 0) {
            return;
         }

         Registry.emptyArgs();
         long var5 = 270389152141252877L;
         Ref.h2(270389152141252877L, var5);
         Object[] var10 = Registry.emptyArgs();
         long var8 = 522101553831913305L;
         Object[] var7 = var10;
         Ref.h(522101553831913305L, var7, var8);
         var9 = 0L;
      }

      ConnectHost.J = var9;
   }

   public Ca4() throws IOException {
      Object var10001 = Registry.lookupField(439146272996415412L).get(null);
      long var4 = 234610728094808892L;
      Object var3 = var10001;
      Ref.s(234610728094808892L, var3, var4);
      HashMap var10002 = new HashMap();
      long var6 = 594978751216619164L;
      HashMap var5 = var10002;
      Ref.s(594978751216619164L, var5, var6);
      HashMap var10003 = new HashMap();
      long var8 = 596681963206121946L;
      HashMap var7 = var10003;
      Ref.s(596681963206121946L, var7, var8);
      Object var10004 = new Object();
      long var10 = 437411261289262047L;
      Object var9 = var10004;
      Ref.s(437411261289262047L, var9, var10);
      WatchService var10005 = FileSystems.getDefault().newWatchService();
      long var12 = 216967237284821558L;
      WatchService var11 = var10005;
      Ref.s(216967237284821558L, var11, var12);
      Object var13 = 234610728094808892L;
      Path var1 = Paths.get((String)Ref.g(234610728094808892L, var13));
      Object var15 = 216967237284821558L;
      WatchKey var2 = this.register((WatchService)Ref.g(216967237284821558L, var15), StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10008 = Registry.packArgs(new QZ(this));
      long var18 = 434592463220957006L;
      Object[] var17 = var10008;
      Ref.h(434592463220957006L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10009 = Registry.packArgs(new com.finalshell.task.GM(this));
      long var20 = 434592463220957006L;
      Object[] var19 = var10009;
      Ref.h(434592463220957006L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void U() {
      Address.i();
      Object var7 = 437411261289262047L;
      Object var2;
      synchronized (var2 = Ref.g(437411261289262047L, var7)){} // $VF: monitorenter 
      Ca4 var1 = this;

      try {
         Object var9 = 596681963206121946L;
         Iterator var3 = ((HashMap)Ref.g(596681963206121946L, var9)).keySet().iterator();

         while (true) {
            label104:
            if (var3.hasNext()) {
               String var4 = (String)var3.next();
               Object var11 = 596681963206121946L;
               YI var5 = (YI)((HashMap)Ref.g(596681963206121946L, var11)).get(var4);
               if (var1 == null) {
                  break;
               }

               label101: {
                  if (var1 == null) {
                     System.currentTimeMillis();
                     Object[] var10005 = Registry.emptyArgs();
                     long var14 = 463739992279195407L;
                     Object[] var13 = var10005;
                     var10005 = Ref.h(463739992279195407L, var13, var14);

                     try {
                        var38 = (Long)var10005;
                     } catch (InvocationTargetException var35) {
                        throw var35.getTargetException();
                     }

                     if (var5 - var38 <= a(23198, 8419433224076059951L)) {
                        break label101;
                     }

                     var10005 = Registry.emptyArgs();
                     long var16 = 268465037806953599L;
                     Object[] var15 = var10005;
                     Ref.h(268465037806953599L, var15, var16);

                     try {
                        ;
                     } catch (InvocationTargetException var34) {
                        throw var34.getTargetException();
                     }

                     Registry.emptyArgs();
                     long var17 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var17);
                     Object[] var10007 = Registry.emptyArgs();
                     long var20 = 377280722715900564L;
                     Object[] var19 = var10007;
                     Ref.h(377280722715900564L, var19, var20);
                     Object[] var10008 = Registry.packArgs(var5);
                     long var22 = 118191003152152827L;
                     Object[] var21 = var10008;
                     Ref.h(118191003152152827L, var21, var22);

                     try {
                        ;
                     } catch (InvocationTargetException var33) {
                        throw var33.getTargetException();
                     }

                     Object var23 = 596681963206121946L;
                     ((HashMap)Ref.g(596681963206121946L, var23)).remove(var4);
                     Object[] var10010 = Registry.packArgs(new CZ(this, var5, var4));
                     long var26 = 541437196102236947L;
                     Object[] var25 = var10010;
                     Ref.h(541437196102236947L, var25, var26);

                     try {
                        ;
                     } catch (InvocationTargetException var32) {
                        throw var32.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     break label104;
                  }
               }

               if (var1 == null) {
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
      Object var4 = 594978751216619164L;
      ((HashMap)Ref.g(594978751216619164L, var4)).put(var3, var2);
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
      // 000: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 216967237284821558
      // 008: astore 18
      // 00a: ldc2_w 216967237284821558
      // 00d: aload 18
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast java/nio/file/WatchService
      // 015: invokeinterface java/nio/file/WatchService.take ()Ljava/nio/file/WatchKey; 1
      // 01a: astore 2
      // 01b: aload 2
      // 01c: invokeinterface java/nio/file/WatchKey.pollEvents ()Ljava/util/List; 1
      // 021: astore 3
      // 022: aload 3
      // 023: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 028: astore 4
      // 02a: aload 4
      // 02c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 031: ifeq 25e
      // 034: aload 4
      // 036: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03b: checkcast java/nio/file/WatchEvent
      // 03e: astore 5
      // 040: new java/io/File
      // 043: dup
      // 044: new java/lang/StringBuilder
      // 047: dup
      // 048: invokespecial java/lang/StringBuilder.<init> ()V
      // 04b: aload 0
      // 04c: ldc2_w 234610728094808892
      // 04f: astore 20
      // 051: ldc2_w 234610728094808892
      // 054: aload 20
      // 056: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 059: checkcast java/lang/String
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: getstatic java/io/File.separator Ljava/lang/String;
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: aload 5
      // 067: invokeinterface java/nio/file/WatchEvent.context ()Ljava/lang/Object; 1
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 06f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 072: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 075: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 078: astore 6
      // 07a: new java/io/File
      // 07d: dup
      // 07e: aload 6
      // 080: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 083: astore 7
      // 085: invokestatic java/lang/System.currentTimeMillis ()J
      // 088: aload 7
      // 08a: invokevirtual java/io/File.lastModified ()J
      // 08d: lsub
      // 08e: lstore 8
      // 090: iload 1
      // 091: ifne 0c4
      // 094: aload 7
      // 096: invokevirtual java/io/File.exists ()Z
      // 099: iload 1
      // 09a: ifne 264
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a3: athrow
      // 0a4: ifne 0cf
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: ldc2_w 216967237284821558
      // 0b2: astore 22
      // 0b4: ldc2_w 216967237284821558
      // 0b7: aload 22
      // 0b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bc: checkcast java/nio/file/WatchService
      // 0bf: invokeinterface java/nio/file/WatchService.close ()V 1
      // 0c4: goto 0ce
      // 0c7: astore 10
      // 0c9: aload 10
      // 0cb: invokevirtual java/io/IOException.printStackTrace ()V
      // 0ce: return
      // 0cf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d2: ldc2_w 270389152141252877
      // 0d5: astore 24
      // 0d7: ldc2_w 270389152141252877
      // 0da: aload 24
      // 0dc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0df: goto 0e6
      // 0e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e9: ldc2_w 377280722715900564
      // 0ec: astore 27
      // 0ee: astore 26
      // 0f0: ldc2_w 377280722715900564
      // 0f3: aload 26
      // 0f5: aload 27
      // 0f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fa: checkcast com/finalshell/core/LL3_2
      // 0fd: goto 104
      // 100: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 103: athrow
      // 104: astore 10
      // 106: aload 10
      // 108: aload 6
      // 10a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10d: ldc2_w 495693745913590487
      // 110: astore 29
      // 112: astore 28
      // 114: ldc2_w 495693745913590487
      // 117: aload 28
      // 119: aload 29
      // 11b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11e: checkcast java/lang/Boolean
      // 121: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 124: goto 12b
      // 127: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: iload 1
      // 12c: ifne 156
      // 12f: ifne 25a
      // 132: goto 139
      // 135: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 138: athrow
      // 139: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 13c: ldc2_w 454647487873911743
      // 13f: astore 30
      // 141: ldc2_w 454647487873911743
      // 144: aload 30
      // 146: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 149: checkcast java/lang/Boolean
      // 14c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: ifeq 19d
      // 159: invokestatic java/lang/System.currentTimeMillis ()J
      // 15c: aload 10
      // 15e: aload 6
      // 160: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 163: ldc2_w 481459519974677321
      // 166: astore 33
      // 168: astore 32
      // 16a: ldc2_w 481459519974677321
      // 16d: aload 32
      // 16f: aload 33
      // 171: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 174: checkcast java/lang/Long
      // 177: invokevirtual java/lang/Long.longValue ()J
      // 17a: goto 181
      // 17d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 180: athrow
      // 181: lsub
      // 182: lstore 11
      // 184: lload 11
      // 186: bipush 90
      // 188: ldc2_w 2228209822511349738
      // 18b: invokestatic com/finalshell/core/Ca4.a (IJ)J
      // 18e: lcmp
      // 18f: ifge 19d
      // 192: iload 1
      // 193: ifeq 02a
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19c: athrow
      // 19d: aload 7
      // 19f: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1a2: astore 11
      // 1a4: aload 11
      // 1a6: bipush 0
      // 1a7: bipush 2
      // 1a8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1ab: astore 12
      // 1ad: aload 0
      // 1ae: ldc2_w 594978751216619164
      // 1b1: astore 34
      // 1b3: ldc2_w 594978751216619164
      // 1b6: aload 34
      // 1b8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1bb: checkcast java/util/HashMap
      // 1be: aload 6
      // 1c0: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c3: checkcast com/finalshell/core/YI
      // 1c6: astore 13
      // 1c8: aload 13
      // 1ca: iload 1
      // 1cb: ifne 211
      // 1ce: ifnull 25a
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d7: athrow
      // 1d8: aload 13
      // 1da: invokestatic java/lang/System.currentTimeMillis ()J
      // 1dd: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 1e0: ldc2_w 443295053115350124
      // 1e3: astore 37
      // 1e5: astore 36
      // 1e7: ldc2_w 443295053115350124
      // 1ea: aload 36
      // 1ec: aload 37
      // 1ee: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f1: pop
      // 1f2: goto 1f9
      // 1f5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: ldc2_w 437411261289262047
      // 1fd: astore 38
      // 1ff: ldc2_w 437411261289262047
      // 202: aload 38
      // 204: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 207: checkcast java/lang/Object
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/core/Ca4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 210: athrow
      // 211: dup
      // 212: astore 14
      // 214: monitorenter
      // 215: aload 0
      // 216: ldc2_w 596681963206121946
      // 219: astore 40
      // 21b: ldc2_w 596681963206121946
      // 21e: aload 40
      // 220: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 223: checkcast java/util/HashMap
      // 226: aload 13
      // 228: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22b: ldc2_w 191716730601734423
      // 22e: astore 43
      // 230: astore 42
      // 232: ldc2_w 191716730601734423
      // 235: aload 42
      // 237: aload 43
      // 239: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23c: checkcast java/lang/String
      // 23f: goto 246
      // 242: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 245: athrow
      // 246: aload 13
      // 248: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 24b: pop
      // 24c: aload 14
      // 24e: monitorexit
      // 24f: goto 25a
      // 252: astore 15
      // 254: aload 14
      // 256: monitorexit
      // 257: aload 15
      // 259: athrow
      // 25a: iload 1
      // 25b: ifeq 02a
      // 25e: aload 2
      // 25f: invokeinterface java/nio/file/WatchKey.reset ()Z 1
      // 264: pop
      // 265: goto 004
      // 268: astore 2
      // 269: aload 2
      // 26a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 26d: aload 0
      // 26e: ldc2_w 216967237284821558
      // 271: astore 44
      // 273: ldc2_w 216967237284821558
      // 276: aload 44
      // 278: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27b: checkcast java/nio/file/WatchService
      // 27e: invokeinterface java/nio/file/WatchService.close ()V 1
      // 283: goto 2b3
      // 286: astore 2
      // 287: aload 2
      // 288: invokevirtual java/io/IOException.printStackTrace ()V
      // 28b: goto 2b3
      // 28e: astore 16
      // 290: aload 0
      // 291: ldc2_w 216967237284821558
      // 294: astore 46
      // 296: ldc2_w 216967237284821558
      // 299: aload 46
      // 29b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29e: checkcast java/nio/file/WatchService
      // 2a1: invokeinterface java/nio/file/WatchService.close ()V 1
      // 2a6: goto 2b0
      // 2a9: astore 17
      // 2ab: aload 17
      // 2ad: invokevirtual java/io/IOException.printStackTrace ()V
      // 2b0: aload 16
      // 2b2: athrow
      // 2b3: return
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16305) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
      ConnectHost.W$void();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var16 = Registry.packArgs(new BG(), (int)var8);
      long var13 = 201859364639460244L;
      Object[] var12 = var16;
      Ref.h(201859364639460244L, var12, var13);
   }
}





