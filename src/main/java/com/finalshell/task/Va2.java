package com.finalshell.task;

import com.finalshell.ui.panel.Connection4;
import javax.swing.event.TreeExpansionEvent;

public class Va2 implements Runnable {
   public final TreeExpansionEvent E;
   public final Connection4 Y;
   public static String a;

   public Va2(Connection4 var1, TreeExpansionEvent var2) {
      this.Y = var1;
      this.E = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: aload 0
      // 004: ldc2_w 393592511450193894
      // 007: astore 12
      // 009: ldc2_w 393592511450193894
      // 00c: aload 12
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: checkcast javax/swing/event/TreeExpansionEvent
      // 014: invokevirtual javax/swing/event/TreeExpansionEvent.getPath ()Ljavax/swing/tree/TreePath;
      // 017: invokevirtual javax/swing/tree/TreePath.getLastPathComponent ()Ljava/lang/Object;
      // 01a: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 01d: astore 2
      // 01e: astore 1
      // 01f: aload 2
      // 020: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 023: astore 3
      // 024: aload 2
      // 025: aload 0
      // 026: ldc2_w 157149866259065396
      // 029: astore 14
      // 02b: ldc2_w 157149866259065396
      // 02e: aload 14
      // 030: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 033: ldc2_w 501060827386673421
      // 036: astore 16
      // 038: ldc2_w 501060827386673421
      // 03b: aload 16
      // 03d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 043: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 046: aload 1
      // 047: ifnull 06f
      // 04a: ifne 38f
      // 04d: goto 054
      // 050: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: aload 3
      // 055: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 058: aload 1
      // 059: ifnull 073
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: ldc com/finalshell/ui/model/Tf4
      // 065: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: ifeq 38f
      // 072: aload 3
      // 073: checkcast com/finalshell/ui/model/Tf4
      // 076: astore 4
      // 078: aload 0
      // 079: ldc2_w 157149866259065396
      // 07c: astore 18
      // 07e: ldc2_w 157149866259065396
      // 081: aload 18
      // 083: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 086: ldc2_w 490343386624486773
      // 089: astore 20
      // 08b: ldc2_w 490343386624486773
      // 08e: aload 20
      // 090: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 093: checkcast java/util/HashSet
      // 096: aload 4
      // 098: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09b: ldc2_w 498856411508641826
      // 09e: astore 23
      // 0a0: astore 22
      // 0a2: ldc2_w 498856411508641826
      // 0a5: aload 22
      // 0a7: aload 23
      // 0a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ac: checkcast java/lang/String
      // 0af: goto 0b6
      // 0b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 0b9: aload 1
      // 0ba: ifnull 133
      // 0bd: ifne 105
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: ldc2_w 157149866259065396
      // 0cb: astore 24
      // 0cd: ldc2_w 157149866259065396
      // 0d0: aload 24
      // 0d2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d5: aload 2
      // 0d6: aload 4
      // 0d8: bipush 1
      // 0d9: bipush 1
      // 0da: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0dd: aconst_null
      // 0de: bipush 0
      // 0df: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 0e2: ldc2_w 280876818035359663
      // 0e5: astore 27
      // 0e7: astore 26
      // 0e9: ldc2_w 280876818035359663
      // 0ec: aload 26
      // 0ee: aload 27
      // 0f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f3: pop
      // 0f4: goto 0fb
      // 0f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: goto 105
      // 0fe: astore 5
      // 100: aload 5
      // 102: invokevirtual java/lang/Exception.printStackTrace ()V
      // 105: aload 4
      // 107: aload 1
      // 108: ifnull 138
      // 10b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10e: ldc2_w 490764181082108623
      // 111: astore 29
      // 113: astore 28
      // 115: ldc2_w 490764181082108623
      // 118: aload 28
      // 11a: aload 29
      // 11c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11f: checkcast java/lang/Boolean
      // 122: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 125: goto 12c
      // 128: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: ifeq 38f
      // 136: aload 4
      // 138: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 13b: ldc2_w 369380169373911815
      // 13e: astore 31
      // 140: astore 30
      // 142: ldc2_w 369380169373911815
      // 145: aload 30
      // 147: aload 31
      // 149: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 14c: checkcast java/util/List
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: astore 5
      // 158: aload 5
      // 15a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 15f: astore 6
      // 161: aload 6
      // 163: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 168: ifeq 38f
      // 16b: aload 6
      // 16d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 172: checkcast com/finalshell/ui/model/Tf4
      // 175: astore 7
      // 177: aload 0
      // 178: ldc2_w 157149866259065396
      // 17b: astore 32
      // 17d: ldc2_w 157149866259065396
      // 180: aload 32
      // 182: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 185: ldc2_w 159245943539531162
      // 188: astore 34
      // 18a: ldc2_w 159245943539531162
      // 18d: aload 34
      // 18f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 192: checkcast java/util/HashMap
      // 195: aload 4
      // 197: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19a: ldc2_w 498856411508641826
      // 19d: astore 37
      // 19f: astore 36
      // 1a1: ldc2_w 498856411508641826
      // 1a4: aload 36
      // 1a6: aload 37
      // 1a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ab: checkcast java/lang/String
      // 1ae: goto 1b5
      // 1b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1b8: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 1bb: astore 8
      // 1bd: aload 7
      // 1bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c2: ldc2_w 543633160597441792
      // 1c5: astore 39
      // 1c7: astore 38
      // 1c9: ldc2_w 543633160597441792
      // 1cc: aload 38
      // 1ce: aload 39
      // 1d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d3: checkcast java/io/File
      // 1d6: goto 1dd
      // 1d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1e0: getstatic com/finalshell/task/Va2.a Ljava/lang/String;
      // 1e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e6: ifeq 1e9
      // 1e9: aload 0
      // 1ea: ldc2_w 157149866259065396
      // 1ed: astore 40
      // 1ef: ldc2_w 157149866259065396
      // 1f2: aload 40
      // 1f4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f7: ldc2_w 159245943539531162
      // 1fa: astore 42
      // 1fc: ldc2_w 159245943539531162
      // 1ff: aload 42
      // 201: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 204: checkcast java/util/HashMap
      // 207: aload 7
      // 209: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 20c: ldc2_w 498856411508641826
      // 20f: astore 45
      // 211: astore 44
      // 213: ldc2_w 498856411508641826
      // 216: aload 44
      // 218: aload 45
      // 21a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 21d: checkcast java/lang/String
      // 220: goto 227
      // 223: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 226: athrow
      // 227: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 22a: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 22d: astore 9
      // 22f: bipush 0
      // 230: istore 10
      // 232: aload 0
      // 233: ldc2_w 157149866259065396
      // 236: astore 46
      // 238: ldc2_w 157149866259065396
      // 23b: aload 46
      // 23d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 240: ldc2_w 490343386624486773
      // 243: astore 48
      // 245: ldc2_w 490343386624486773
      // 248: aload 48
      // 24a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24d: checkcast java/util/HashSet
      // 250: aload 7
      // 252: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 255: ldc2_w 498856411508641826
      // 258: astore 51
      // 25a: astore 50
      // 25c: ldc2_w 498856411508641826
      // 25f: aload 50
      // 261: aload 51
      // 263: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 266: checkcast java/lang/String
      // 269: goto 270
      // 26c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26f: athrow
      // 270: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 273: aload 1
      // 274: ifnull 31b
      // 277: ifne 2da
      // 27a: goto 281
      // 27d: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: aload 0
      // 282: ldc2_w 157149866259065396
      // 285: astore 52
      // 287: ldc2_w 157149866259065396
      // 28a: aload 52
      // 28c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 28f: ldc2_w 467542466021000295
      // 292: astore 54
      // 294: ldc2_w 467542466021000295
      // 297: aload 54
      // 299: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29c: checkcast java/util/HashSet
      // 29f: aload 7
      // 2a1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2a4: ldc2_w 498856411508641826
      // 2a7: astore 57
      // 2a9: astore 56
      // 2ab: ldc2_w 498856411508641826
      // 2ae: aload 56
      // 2b0: aload 57
      // 2b2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b5: checkcast java/lang/String
      // 2b8: goto 2bf
      // 2bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 2c2: aload 1
      // 2c3: ifnull 31b
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: ifne 2da
      // 2d0: goto 2d7
      // 2d3: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: bipush 1
      // 2d8: istore 10
      // 2da: aload 0
      // 2db: ldc2_w 157149866259065396
      // 2de: astore 58
      // 2e0: ldc2_w 157149866259065396
      // 2e3: aload 58
      // 2e5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2e8: ldc2_w 490343386624486773
      // 2eb: astore 60
      // 2ed: ldc2_w 490343386624486773
      // 2f0: aload 60
      // 2f2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f5: checkcast java/util/HashSet
      // 2f8: aload 7
      // 2fa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2fd: ldc2_w 498856411508641826
      // 300: astore 63
      // 302: astore 62
      // 304: ldc2_w 498856411508641826
      // 307: aload 62
      // 309: aload 63
      // 30b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30e: checkcast java/lang/String
      // 311: goto 318
      // 314: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 317: athrow
      // 318: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 31b: aload 1
      // 31c: ifnull 348
      // 31f: ifeq 346
      // 322: goto 329
      // 325: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: aload 9
      // 32b: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 32e: aload 1
      // 32f: ifnull 348
      // 332: goto 339
      // 335: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 338: athrow
      // 339: ifne 346
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/task/Va2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 342: athrow
      // 343: bipush 1
      // 344: istore 10
      // 346: iload 10
      // 348: ifeq 38b
      // 34b: aload 0
      // 34c: ldc2_w 157149866259065396
      // 34f: astore 64
      // 351: ldc2_w 157149866259065396
      // 354: aload 64
      // 356: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 359: aload 8
      // 35b: aload 7
      // 35d: bipush 1
      // 35e: bipush 0
      // 35f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 362: aload 9
      // 364: bipush 0
      // 365: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 368: ldc2_w 280876818035359663
      // 36b: astore 67
      // 36d: astore 66
      // 36f: ldc2_w 280876818035359663
      // 372: aload 66
      // 374: aload 67
      // 376: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 379: pop
      // 37a: goto 381
      // 37d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 380: athrow
      // 381: goto 38b
      // 384: astore 11
      // 386: aload 11
      // 388: invokevirtual java/lang/Exception.printStackTrace ()V
      // 38b: aload 1
      // 38c: ifnonnull 161
      // 38f: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "N\u001e/\u00144.".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 51;
               break;
            case 1:
               var23 = 70;
               break;
            case 2:
               var23 = 96;
               break;
            case 3:
               var23 = 85;
               break;
            case 4:
               var23 = 112;
               break;
            case 5:
               var23 = 96;
               break;
            default:
               var23 = 52;
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





