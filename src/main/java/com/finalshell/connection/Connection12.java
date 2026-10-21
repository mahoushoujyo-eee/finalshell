package com.finalshell.connection;

import com.finalshell.core.C_p_2;
import com.finalshell.core.DB3;
import com.finalshell.core.DY3;
import com.finalshell.core.Dm4;
import com.finalshell.core.Dn2_2;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Ms2;
import com.finalshell.core.Pc2;
import com.finalshell.core.Yl4;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.KS3;
import com.finalshell.task.Ui4;
import com.finalshell.ui.dialog.ProgressDialog;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Connection12 implements Ms2 {
   String w;
   Lv4_2 a;
   ConnectHost M;
   DY3 e;
   LinkedBlockingQueue W;
   boolean P;
   boolean U;
   Address l;
   boolean z;
   public static int s;
   public static int E;
   int Z;
   boolean b;
   Object B;
   ConnectHost J;
   public static boolean O;
   public static String[] c;
   public static String[] d;
   public static long[] f;
   public static Integer[] g;
   public static long[] h;
   public static Long[] i;

   public Connection12(Lv4_2 var1, ConnectHost var2, int var3) {
      LinkedBlockingQueue var10001 = new LinkedBlockingQueue();
      long var6 = 353497257519915637L;
      LinkedBlockingQueue var5 = var10001;
      Ref.s(353497257519915637L, var5, var6);
      Registry.lookupField(516591042377540953L).setBoolean(this, false);
      Registry.lookupField(300177220168695197L).setBoolean(this, true);
      Registry.lookupField(538791385288143541L).setBoolean(this, true);
      Object var10002 = new Object();
      long var8 = 367769791574410028L;
      Object var7 = var10002;
      Ref.s(367769791574410028L, var7, var8);
      X();
      long var10 = 413998988881633946L;
      Ref.s(413998988881633946L, var1, var10);
      int var10003 = var3;
      int var10004 = Registry.lookupField(172266869270573121L).getInt(null);
      if (this != false) {
         label21: {
            if (var3 == var10004) {
               var10003 = (Registry.lookupField(538791385288143541L).getBoolean(this)) ? 1 : 0;
               if (this == false) {
                  break label21;
               }

               if (var10003 == 0) {
                  long var12 = 473156217884412983L;
                  Ref.s(473156217884412983L, var2, var12);
               }
            }

            var10003 = var3;
         }

         var10004 = Registry.lookupField(383997995785705643L).getInt(null);
      }

      if (var10003 == var10004) {
         long var14 = 473156217884412983L;
         Ref.s(473156217884412983L, var2, var14);
      }

      Registry.lookupField(213204054013945548L).setInt(this, var3);
   }

   public void N() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 335950632529437253L;
      Object[] var1 = var10001;
      Ref.h(335950632529437253L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var10002 = Registry.emptyArgs();
      long var4 = 295134617216462786L;
      Object[] var3 = var10002;
      Ref.h(295134617216462786L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void p() {
      boolean var1 = X();
      if (var1) {
         if (Registry.lookupField(516591042377540953L).getBoolean(this)) {
            return;
         }

         Registry.lookupField(516591042377540953L).setBoolean(this, true);
      }

      if (var1) {
         Object var4 = 598356069828463222L;
         if ((DY3)Ref.g(598356069828463222L, var4) != null) {
            Object var6 = 598356069828463222L;
            ((DY3)Ref.g(598356069828463222L, var6)).r();
         }
      }

      if (var1) {
         Object var8 = 473156217884412983L;
         if ((ConnectHost)Ref.g(473156217884412983L, var8) != null) {
            Object var10 = 473156217884412983L;
            ((ConnectHost)Ref.g(473156217884412983L, var10)).G();
         }
      }

      Object var12 = 353497257519915637L;

      for (DY3 var3 : (LinkedBlockingQueue)Ref.g(353497257519915637L, var12)) {
         var3.r();
         if (!var1) {
            break;
         }
      }
   }

   public void e$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 353497257519915637
      // 004: astore 4
      // 006: ldc2_w 353497257519915637
      // 009: aload 4
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast java/util/concurrent/LinkedBlockingQueue
      // 011: invokevirtual java/util/concurrent/LinkedBlockingQueue.clear ()V
      // 014: invokestatic com/finalshell/connection/Connection12.d$boolean ()Z
      // 017: aload 0
      // 018: bipush 0
      // 019: ldc2_w 516591042377540953
      // 01c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01f: dup_x2
      // 020: pop
      // 021: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 024: istore 1
      // 025: new com/finalshell/core/Xe2
      // 028: dup
      // 029: invokespecial com/finalshell/core/Xe2.<init> ()V
      // 02c: astore 2
      // 02d: aload 0
      // 02e: aload 2
      // 02f: aload 0
      // 030: ldc2_w 413998988881633946
      // 033: astore 6
      // 035: ldc2_w 413998988881633946
      // 038: aload 6
      // 03a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 040: ldc2_w 255973732097233937
      // 043: astore 9
      // 045: astore 8
      // 047: ldc2_w 255973732097233937
      // 04a: aload 8
      // 04c: aload 9
      // 04e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 051: checkcast java/lang/String
      // 054: goto 05b
      // 057: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: ldc2_w 413998988881633946
      // 05f: astore 10
      // 061: ldc2_w 413998988881633946
      // 064: aload 10
      // 066: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 069: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06c: ldc2_w 380415140795833934
      // 06f: astore 13
      // 071: astore 12
      // 073: ldc2_w 380415140795833934
      // 076: aload 12
      // 078: aload 13
      // 07a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07d: checkcast java/lang/String
      // 080: goto 087
      // 083: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 0
      // 088: ldc2_w 413998988881633946
      // 08b: astore 14
      // 08d: ldc2_w 413998988881633946
      // 090: aload 14
      // 092: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 095: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 098: ldc2_w 255354522009994316
      // 09b: astore 17
      // 09d: astore 16
      // 09f: ldc2_w 255354522009994316
      // 0a2: aload 16
      // 0a4: aload 17
      // 0a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a9: checkcast java/lang/Integer
      // 0ac: invokevirtual java/lang/Integer.intValue ()I
      // 0af: goto 0b6
      // 0b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: aload 0
      // 0b8: ldc2_w 413998988881633946
      // 0bb: astore 18
      // 0bd: ldc2_w 413998988881633946
      // 0c0: aload 18
      // 0c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast com/finalshell/core/Lv4_2
      // 0c8: ldc2_w 426110742590203935
      // 0cb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ce: aconst_null
      // 0cf: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0d2: invokevirtual com/finalshell/core/Xe2.J (Ljava/lang/String;Ljava/lang/String;ILcom/finalshell/core/Ms2;Lcom/finalshell/core/Lv4_2;I)Lcom/finalshell/crypto/ConnectHost;
      // 0d5: ldc2_w 473156217884412983
      // 0d8: astore 21
      // 0da: astore 20
      // 0dc: ldc2_w 473156217884412983
      // 0df: aload 20
      // 0e1: aload 21
      // 0e3: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0e6: aload 0
      // 0e7: ldc2_w 473156217884412983
      // 0ea: astore 22
      // 0ec: ldc2_w 473156217884412983
      // 0ef: aload 22
      // 0f1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f4: checkcast com/finalshell/crypto/ConnectHost
      // 0f7: aload 0
      // 0f8: ldc2_w 343226264098752116
      // 0fb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0fe: swap
      // 0ff: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 102: invokevirtual com/finalshell/crypto/ConnectHost.B (Z)V
      // 105: aload 0
      // 106: iload 1
      // 107: ifne 12c
      // 10a: ldc2_w 176708525791811192
      // 10d: astore 24
      // 10f: ldc2_w 176708525791811192
      // 112: aload 24
      // 114: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 117: checkcast com/finalshell/ui/panel/Address
      // 11a: ifnull 16b
      // 11d: goto 124
      // 120: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: aload 0
      // 125: goto 12c
      // 128: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: ldc2_w 473156217884412983
      // 12f: astore 26
      // 131: ldc2_w 473156217884412983
      // 134: aload 26
      // 136: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 139: checkcast com/finalshell/crypto/ConnectHost
      // 13c: aload 0
      // 13d: ldc2_w 176708525791811192
      // 140: astore 28
      // 142: ldc2_w 176708525791811192
      // 145: aload 28
      // 147: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14d: ldc2_w 205360729747621821
      // 150: astore 31
      // 152: astore 30
      // 154: ldc2_w 205360729747621821
      // 157: aload 30
      // 159: aload 31
      // 15b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15e: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 161: goto 168
      // 164: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 167: athrow
      // 168: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/ui/panel/ConnectionProperty;)V
      // 16b: new com/finalshell/core/Mv2
      // 16e: dup
      // 16f: invokespecial com/finalshell/core/Mv2.<init> ()V
      // 172: astore 3
      // 173: aload 3
      // 174: aload 0
      // 175: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 178: ldc2_w 147767431922088244
      // 17b: astore 33
      // 17d: astore 32
      // 17f: ldc2_w 147767431922088244
      // 182: aload 32
      // 184: aload 33
      // 186: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 189: pop
      // 18a: goto 191
      // 18d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 0
      // 192: ldc2_w 473156217884412983
      // 195: astore 34
      // 197: ldc2_w 473156217884412983
      // 19a: aload 34
      // 19c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19f: checkcast com/finalshell/crypto/ConnectHost
      // 1a2: aload 3
      // 1a3: invokevirtual com/finalshell/crypto/ConnectHost.Q (Lcom/finalshell/core/Gq2;)V
      // 1a6: aload 0
      // 1a7: ldc2_w 473156217884412983
      // 1aa: astore 36
      // 1ac: ldc2_w 473156217884412983
      // 1af: aload 36
      // 1b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b4: checkcast com/finalshell/crypto/ConnectHost
      // 1b7: invokevirtual com/finalshell/crypto/ConnectHost.C$void ()V
      // 1ba: return
   }

   public void j(ConnectHost param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: ldc2_w 473156217884412983
      // 005: astore 8
      // 007: astore 7
      // 009: ldc2_w 473156217884412983
      // 00c: aload 7
      // 00e: aload 8
      // 010: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 013: invokestatic com/finalshell/connection/Connection12.d$boolean ()Z
      // 016: aload 0
      // 017: bipush 0
      // 018: ldc2_w 516591042377540953
      // 01b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01e: dup_x2
      // 01f: pop
      // 020: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 023: istore 2
      // 024: aload 1
      // 025: invokevirtual com/finalshell/crypto/ConnectHost.a ()Lcom/finalshell/ui/panel/ConnectionProperty;
      // 028: astore 3
      // 029: aload 3
      // 02a: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$boolean ()Z
      // 02d: pop
      // 02e: bipush 1
      // 02f: istore 4
      // 031: bipush 0
      // 032: istore 5
      // 034: iload 5
      // 036: sipush 12674
      // 039: ldc2_w 4474776978685384015
      // 03c: invokestatic com/finalshell/connection/Connection12.a (IJ)I
      // 03f: if_icmpge 0d9
      // 042: aload 0
      // 043: ldc2_w 516591042377540953
      // 046: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 049: swap
      // 04a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 04d: iload 2
      // 04e: ifne 0dd
      // 051: iload 2
      // 052: ifne 0dd
      // 055: goto 05c
      // 058: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: ifne 0d9
      // 05f: goto 066
      // 062: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 3
      // 067: invokevirtual com/finalshell/ui/panel/ConnectionProperty.G$DI ()Lcom/finalshell/crypto/ConnectHost;
      // 06a: astore 1
      // 06b: aload 1
      // 06c: iload 2
      // 06d: ifne 089
      // 070: ifnonnull 081
      // 073: goto 07a
      // 076: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: bipush 1
      // 07b: istore 4
      // 07d: iload 2
      // 07e: ifeq 0a1
      // 081: aload 1
      // 082: goto 089
      // 085: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: invokevirtual com/finalshell/crypto/ConnectHost.Y$boolean ()Z
      // 08c: iload 2
      // 08d: ifne 09b
      // 090: ifne 09e
      // 093: goto 09a
      // 096: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: bipush 1
      // 09b: goto 09f
      // 09e: bipush 0
      // 09f: istore 4
      // 0a1: iload 4
      // 0a3: ifne 0b1
      // 0a6: iload 2
      // 0a7: ifeq 0d9
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: sipush 5422
      // 0b4: ldc2_w 3094900123446399735
      // 0b7: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 0ba: invokestatic java/lang/Thread.sleep (J)V
      // 0bd: goto 0cb
      // 0c0: astore 6
      // 0c2: aload 6
      // 0c4: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0c7: iload 2
      // 0c8: ifeq 0d9
      // 0cb: iinc 5 1
      // 0ce: iload 2
      // 0cf: ifeq 034
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 1
      // 0da: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 0dd: istore 5
      // 0df: aload 1
      // 0e0: iload 2
      // 0e1: ifne 0ef
      // 0e4: ifnull 115
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 1
      // 0ef: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 0f2: iload 2
      // 0f3: ifne 112
      // 0f6: ifeq 115
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: ldc2_w 516591042377540953
      // 104: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 107: swap
      // 108: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: ifeq 12b
      // 115: new com/finalshell/core/Dn2_2
      // 118: dup
      // 119: bipush 0
      // 11a: sipush 10449
      // 11d: sipush -7669
      // 120: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 123: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 126: athrow
      // 127: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: aload 1
      // 12c: sipush 10456
      // 12f: sipush -19129
      // 132: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 135: invokevirtual com/finalshell/crypto/ConnectHost.i$dm_4 (Ljava/lang/String;)Lcom/finalshell/core/Dm4;
      // 138: astore 6
      // 13a: aload 6
      // 13c: invokevirtual com/finalshell/core/Dm4.I ()V
      // 13f: aload 0
      // 140: aload 6
      // 142: checkcast com/finalshell/core/DY3
      // 145: ldc2_w 598356069828463222
      // 148: astore 10
      // 14a: astore 9
      // 14c: ldc2_w 598356069828463222
      // 14f: aload 9
      // 151: aload 10
      // 153: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 156: aload 0
      // 157: aload 0
      // 158: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15b: ldc2_w 619137651581852627
      // 15e: astore 12
      // 160: astore 11
      // 162: ldc2_w 619137651581852627
      // 165: aload 11
      // 167: aload 12
      // 169: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16c: goto 173
      // 16f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 172: athrow
      // 173: ldc2_w 277333437534738353
      // 176: astore 14
      // 178: astore 13
      // 17a: ldc2_w 277333437534738353
      // 17d: aload 13
      // 17f: aload 14
      // 181: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 184: iload 2
      // 185: ifne 1a8
      // 188: aload 0
      // 189: ldc2_w 516591042377540953
      // 18c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18f: swap
      // 190: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 193: ifeq 1a9
      // 196: goto 19d
      // 199: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: aload 1
      // 19e: invokevirtual com/finalshell/crypto/ConnectHost.G ()V
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: return
      // 1a9: return
   }

   public synchronized void S() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 10d
      // 009: ldc2_w 213204054013945548
      // 00c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00f: swap
      // 010: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 013: ldc2_w 172266869270573121
      // 016: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 019: aconst_null
      // 01a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 01d: if_icmpne 105
      // 020: goto 027
      // 023: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: iload 1
      // 029: ifeq 10d
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: ldc2_w 538791385288143541
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: swap
      // 03a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 03d: ifeq 105
      // 040: goto 047
      // 043: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: iload 1
      // 049: ifeq 0e5
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: ldc2_w 516591042377540953
      // 056: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 059: swap
      // 05a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 05d: ifne 0dd
      // 060: goto 067
      // 063: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 0
      // 068: iload 1
      // 069: ifeq 0e5
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: ldc2_w 473156217884412983
      // 076: astore 3
      // 077: ldc2_w 473156217884412983
      // 07a: aload 3
      // 07b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07e: checkcast com/finalshell/crypto/ConnectHost
      // 081: ifnull 0dd
      // 084: goto 08b
      // 087: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 0
      // 08c: iload 1
      // 08d: ifeq 36c
      // 090: goto 097
      // 093: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: ldc2_w 473156217884412983
      // 09a: astore 5
      // 09c: ldc2_w 473156217884412983
      // 09f: aload 5
      // 0a1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a4: checkcast com/finalshell/crypto/ConnectHost
      // 0a7: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 0aa: ifne 36b
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: iload 1
      // 0b6: ifeq 36c
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: ldc2_w 473156217884412983
      // 0c3: astore 7
      // 0c5: ldc2_w 473156217884412983
      // 0c8: aload 7
      // 0ca: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cd: checkcast com/finalshell/crypto/ConnectHost
      // 0d0: invokevirtual com/finalshell/crypto/ConnectHost.i$boolean ()Z
      // 0d3: ifne 36b
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e8: ldc2_w 546204988560239460
      // 0eb: astore 10
      // 0ed: astore 9
      // 0ef: ldc2_w 546204988560239460
      // 0f2: aload 9
      // 0f4: aload 10
      // 0f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f9: pop
      // 0fa: goto 101
      // 0fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 100: athrow
      // 101: iload 1
      // 102: ifne 36b
      // 105: aload 0
      // 106: goto 10d
      // 109: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: ldc2_w 473156217884412983
      // 110: astore 11
      // 112: ldc2_w 473156217884412983
      // 115: aload 11
      // 117: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11a: checkcast com/finalshell/crypto/ConnectHost
      // 11d: invokevirtual com/finalshell/crypto/ConnectHost.a ()Lcom/finalshell/ui/panel/ConnectionProperty;
      // 120: astore 2
      // 121: aload 0
      // 122: aload 2
      // 123: invokevirtual com/finalshell/ui/panel/ConnectionProperty.G$DI ()Lcom/finalshell/crypto/ConnectHost;
      // 126: ldc2_w 473156217884412983
      // 129: astore 14
      // 12b: astore 13
      // 12d: ldc2_w 473156217884412983
      // 130: aload 13
      // 132: aload 14
      // 134: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 137: aload 0
      // 138: iload 1
      // 139: ifeq 24f
      // 13c: ldc2_w 516591042377540953
      // 13f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 142: swap
      // 143: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 146: ifne 24e
      // 149: goto 150
      // 14c: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 0
      // 151: iload 1
      // 152: ifeq 24f
      // 155: goto 15c
      // 158: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: ldc2_w 598356069828463222
      // 15f: astore 15
      // 161: ldc2_w 598356069828463222
      // 164: aload 15
      // 166: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 169: checkcast com/finalshell/core/DY3
      // 16c: ifnull 24e
      // 16f: goto 176
      // 172: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: aload 0
      // 177: iload 1
      // 178: ifeq 24f
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: ldc2_w 473156217884412983
      // 185: astore 17
      // 187: ldc2_w 473156217884412983
      // 18a: aload 17
      // 18c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 18f: checkcast com/finalshell/crypto/ConnectHost
      // 192: ifnull 24e
      // 195: goto 19c
      // 198: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: aload 0
      // 19d: ldc2_w 473156217884412983
      // 1a0: astore 19
      // 1a2: ldc2_w 473156217884412983
      // 1a5: aload 19
      // 1a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1aa: checkcast com/finalshell/crypto/ConnectHost
      // 1ad: iload 1
      // 1ae: ifeq 211
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b7: athrow
      // 1b8: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 1bb: ifne 1ee
      // 1be: goto 1c5
      // 1c1: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: iload 1
      // 1c7: ifeq 24f
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: ldc2_w 473156217884412983
      // 1d4: astore 21
      // 1d6: ldc2_w 473156217884412983
      // 1d9: aload 21
      // 1db: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1de: checkcast com/finalshell/crypto/ConnectHost
      // 1e1: invokevirtual com/finalshell/crypto/ConnectHost.i$boolean ()Z
      // 1e4: ifeq 24e
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: iload 1
      // 1f0: ifeq 24f
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: ldc2_w 170983454032355616
      // 1fd: astore 23
      // 1ff: ldc2_w 170983454032355616
      // 202: aload 23
      // 204: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 207: checkcast com/finalshell/crypto/ConnectHost
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: ifnull 24e
      // 214: aload 0
      // 215: ldc2_w 170983454032355616
      // 218: astore 25
      // 21a: ldc2_w 170983454032355616
      // 21d: aload 25
      // 21f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 222: checkcast com/finalshell/crypto/ConnectHost
      // 225: aload 0
      // 226: ldc2_w 473156217884412983
      // 229: astore 27
      // 22b: ldc2_w 473156217884412983
      // 22e: aload 27
      // 230: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 233: checkcast com/finalshell/crypto/ConnectHost
      // 236: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 239: iload 1
      // 23a: ifeq 284
      // 23d: goto 244
      // 240: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: ifne 279
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: aload 0
      // 24f: aload 0
      // 250: ldc2_w 473156217884412983
      // 253: astore 29
      // 255: ldc2_w 473156217884412983
      // 258: aload 29
      // 25a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 25d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 260: ldc2_w 560726183690328344
      // 263: astore 32
      // 265: astore 31
      // 267: ldc2_w 560726183690328344
      // 26a: aload 31
      // 26c: aload 32
      // 26e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 271: pop
      // 272: goto 279
      // 275: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 278: athrow
      // 279: aload 0
      // 27a: ldc2_w 213204054013945548
      // 27d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 280: swap
      // 281: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 284: ldc2_w 383997995785705643
      // 287: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 28a: aconst_null
      // 28b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 28e: iload 1
      // 28f: ifeq 2bf
      // 292: if_icmpne 29f
      // 295: goto 29c
      // 298: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: goto 36b
      // 29f: aload 0
      // 2a0: iload 1
      // 2a1: ifeq 36c
      // 2a4: ldc2_w 213204054013945548
      // 2a7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2aa: swap
      // 2ab: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2ae: ldc2_w 172266869270573121
      // 2b1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b4: aconst_null
      // 2b5: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: if_icmpne 36b
      // 2c2: aload 0
      // 2c3: iload 1
      // 2c4: ifeq 32a
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cd: athrow
      // 2ce: ldc2_w 170983454032355616
      // 2d1: astore 33
      // 2d3: ldc2_w 170983454032355616
      // 2d6: aload 33
      // 2d8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2db: checkcast com/finalshell/crypto/ConnectHost
      // 2de: ifnull 322
      // 2e1: goto 2e8
      // 2e4: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: aload 0
      // 2e9: iload 1
      // 2ea: ifeq 36c
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: ldc2_w 170983454032355616
      // 2f7: astore 35
      // 2f9: ldc2_w 170983454032355616
      // 2fc: aload 35
      // 2fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 301: checkcast com/finalshell/crypto/ConnectHost
      // 304: aload 0
      // 305: ldc2_w 473156217884412983
      // 308: astore 37
      // 30a: ldc2_w 473156217884412983
      // 30d: aload 37
      // 30f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 312: checkcast com/finalshell/crypto/ConnectHost
      // 315: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 318: ifne 36b
      // 31b: goto 322
      // 31e: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 321: athrow
      // 322: aload 0
      // 323: goto 32a
      // 326: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: ldc2_w 353497257519915637
      // 32d: astore 39
      // 32f: ldc2_w 353497257519915637
      // 332: aload 39
      // 334: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 337: checkcast java/util/concurrent/LinkedBlockingQueue
      // 33a: invokevirtual java/util/concurrent/LinkedBlockingQueue.clear ()V
      // 33d: ldc2_w 388376917454860932
      // 340: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 343: aconst_null
      // 344: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 347: new com/finalshell/task/Kr2
      // 34a: dup
      // 34b: aload 0
      // 34c: invokespecial com/finalshell/task/Kr2.<init> (Lcom/finalshell/connection/Connection12;)V
      // 34f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 352: ldc2_w 434592463220957006
      // 355: astore 42
      // 357: astore 41
      // 359: ldc2_w 434592463220957006
      // 35c: aload 41
      // 35e: aload 42
      // 360: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 363: pop
      // 364: goto 36b
      // 367: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36a: athrow
      // 36b: aload 0
      // 36c: aload 0
      // 36d: ldc2_w 473156217884412983
      // 370: astore 43
      // 372: ldc2_w 473156217884412983
      // 375: aload 43
      // 377: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 37a: ldc2_w 170983454032355616
      // 37d: astore 46
      // 37f: astore 45
      // 381: ldc2_w 170983454032355616
      // 384: aload 45
      // 386: aload 46
      // 388: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 38b: return
   }

   public void K() throws Exception {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 423536212718626306L;
      Object[] var1 = var10001;
      Ref.h(423536212718626306L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var4 = 500567178637023399L;
      Object[] var3 = var10003;
      var10003 = Ref.h(500567178637023399L, var3, var4);
      long var6 = 598356069828463222L;
      Object var5 = var10003;
      Ref.s(598356069828463222L, var5, var6);
      Object[] var10005 = Registry.emptyArgs();
      long var8 = 619137651581852627L;
      Object[] var7 = var10005;
      var10005 = Ref.h(619137651581852627L, var7, var8);
      long var10 = 277333437534738353L;
      Object var9 = var10005;
      Ref.s(277333437534738353L, var9, var10);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10006 = Registry.packArgs(new KS3(this));
      long var12 = 434592463220957006L;
      Object[] var11 = var10006;
      Ref.h(434592463220957006L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   public DB3 J(String var1) throws Exception {
      Object var3 = 473156217884412983L;
      DB3 var2 = (DB3)((ConnectHost)Ref.g(473156217884412983L, var3)).i$dm_4(a(10454, 29613));
      var2.X(null);
      var2.h(var1);
      return var2;
   }

   synchronized DY3 I() throws Exception {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 135220879492188512L;
      Object[] var1 = var10001;
      Ref.h(135220879492188512L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      Object var3 = 598356069828463222L;
      return (DY3)Ref.g(598356069828463222L, var3);
   }

   public Ck4 d(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 03: aload 1
      // 04: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07: ldc2_w 477969598131796924
      // 0a: astore 7
      // 0c: ldc2_w 477969598131796924
      // 0f: aload 7
      // 11: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 14: checkcast java/lang/String
      // 17: goto 1e
      // 1a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: astore 3
      // 1f: istore 2
      // 20: new java/io/File
      // 23: dup
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: ldc2_w 179276309776747034
      // 2e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 31: aconst_null
      // 32: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 35: checkcast java/lang/String
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b: getstatic java/io/File.separator Ljava/lang/String;
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: aload 3
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 48: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 4b: astore 4
      // 4d: aload 4
      // 4f: invokevirtual java/io/File.exists ()Z
      // 52: iload 2
      // 53: ifeq 72
      // 56: ifeq 6d
      // 59: goto 60
      // 5c: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 4
      // 62: invokevirtual java/io/File.delete ()Z
      // 65: pop
      // 66: goto 6d
      // 69: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 4
      // 6f: invokevirtual java/io/File.createNewFile ()Z
      // 72: pop
      // 73: goto 7d
      // 76: astore 5
      // 78: aload 5
      // 7a: invokevirtual java/io/IOException.printStackTrace ()V
      // 7d: aload 4
      // 7f: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 82: astore 5
      // 84: aload 0
      // 85: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 88: ldc2_w 614246546767074737
      // 8b: astore 10
      // 8d: astore 9
      // 8f: ldc2_w 614246546767074737
      // 92: aload 9
      // 94: aload 10
      // 96: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 99: checkcast com/finalshell/core/DY3
      // 9c: goto a3
      // 9f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a2: athrow
      // a3: aload 5
      // a5: aload 1
      // a6: aconst_null
      // a7: bipush 0
      // a8: invokevirtual com/finalshell/core/DY3.d (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // ab: aload 0
      // ac: aload 1
      // ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // b0: ldc2_w 303344491018408266
      // b3: astore 12
      // b5: astore 11
      // b7: ldc2_w 303344491018408266
      // ba: aload 11
      // bc: aload 12
      // be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c1: checkcast com/finalshell/ui/model/Ck4
      // c4: goto cb
      // c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ca: athrow
      // cb: astore 6
      // cd: aload 6
      // cf: areturn
   }

   void D$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 03: aload 0
      // 04: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07: ldc2_w 500567178637023399
      // 0a: astore 4
      // 0c: astore 3
      // 0d: ldc2_w 500567178637023399
      // 10: aload 3
      // 11: aload 4
      // 13: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16: checkcast com/finalshell/core/DY3
      // 19: goto 20
      // 1c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f: athrow
      // 20: astore 2
      // 21: istore 1
      // 22: aload 0
      // 23: ldc2_w 516591042377540953
      // 26: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 29: swap
      // 2a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2d: iload 1
      // 2e: ifeq 94
      // 31: ifeq 7f
      // 34: goto 3b
      // 37: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: ldc2_w 388376917454860932
      // 3e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 41: aconst_null
      // 42: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 45: new com/finalshell/task/XV
      // 48: dup
      // 49: aload 0
      // 4a: aload 2
      // 4b: invokespecial com/finalshell/task/XV.<init> (Lcom/finalshell/connection/Connection12;Lcom/finalshell/core/DY3;)V
      // 4e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 51: ldc2_w 434592463220957006
      // 54: astore 6
      // 56: astore 5
      // 58: ldc2_w 434592463220957006
      // 5b: aload 5
      // 5d: aload 6
      // 5f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 62: pop
      // 63: goto 6a
      // 66: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 69: athrow
      // 6a: new java/lang/Exception
      // 6d: dup
      // 6e: sipush 10457
      // 71: sipush -27897
      // 74: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 77: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 7a: athrow
      // 7b: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 0
      // 80: ldc2_w 353497257519915637
      // 83: astore 7
      // 85: ldc2_w 353497257519915637
      // 88: aload 7
      // 8a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 8d: checkcast java/util/concurrent/LinkedBlockingQueue
      // 90: aload 2
      // 91: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 94: pop
      // 95: return
   }

   public synchronized void N(String param1, String param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 3d
      // 09: aload 2
      // 0a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 589009658161056061
      // 10: astore 5
      // 12: astore 4
      // 14: ldc2_w 589009658161056061
      // 17: aload 4
      // 19: aload 5
      // 1b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e: checkcast java/lang/Boolean
      // 21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24: goto 2b
      // 27: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifne 64
      // 2e: goto 35
      // 31: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: goto 3d
      // 39: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 40: ldc2_w 614246546767074737
      // 43: astore 7
      // 45: astore 6
      // 47: ldc2_w 614246546767074737
      // 4a: aload 6
      // 4c: aload 7
      // 4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 51: checkcast com/finalshell/core/DY3
      // 54: goto 5b
      // 57: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 1
      // 5c: aload 2
      // 5d: invokevirtual com/finalshell/core/DY3.l (Ljava/lang/String;Ljava/lang/String;)V
      // 60: iload 3
      // 61: ifne 7a
      // 64: new com/finalshell/core/Dn2_2
      // 67: dup
      // 68: bipush -1
      // 69: sipush 10460
      // 6c: sipush 8370
      // 6f: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 72: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 75: athrow
      // 76: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: return
   }

   public synchronized Tf4 q(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 3d
      // 09: aload 1
      // 0a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d: ldc2_w 589009658161056061
      // 10: astore 5
      // 12: astore 4
      // 14: ldc2_w 589009658161056061
      // 17: aload 4
      // 19: aload 5
      // 1b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e: checkcast java/lang/Boolean
      // 21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24: goto 2b
      // 27: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifne 63
      // 2e: goto 35
      // 31: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: goto 3d
      // 39: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 40: ldc2_w 614246546767074737
      // 43: astore 7
      // 45: astore 6
      // 47: ldc2_w 614246546767074737
      // 4a: aload 6
      // 4c: aload 7
      // 4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 51: checkcast com/finalshell/core/DY3
      // 54: goto 5b
      // 57: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 1
      // 5c: invokevirtual com/finalshell/core/DY3.d (Ljava/lang/String;)V
      // 5f: iload 2
      // 60: ifne 79
      // 63: new com/finalshell/core/Dn2_2
      // 66: dup
      // 67: bipush -1
      // 68: sipush 10450
      // 6b: sipush 13896
      // 6e: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 71: invokespecial com/finalshell/core/Dn2_2.<init> (ILjava/lang/String;)V
      // 74: athrow
      // 75: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 0
      // 7a: aload 1
      // 7b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 7e: ldc2_w 291861634241198552
      // 81: astore 9
      // 83: astore 8
      // 85: ldc2_w 291861634241198552
      // 88: aload 8
      // 8a: aload 9
      // 8c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8f: checkcast com/finalshell/ui/model/Tf4
      // 92: goto 99
      // 95: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 98: athrow
      // 99: astore 3
      // 9a: aload 3
      // 9b: areturn
   }

   public synchronized void t(int var1, String var2) throws Exception {
      DY3 var10001 = Registry.emptyArgs();
      long var4 = 614246546767074737L;
      Object[] var3 = var10001;
      var10001 = Ref.h(614246546767074737L, var3, var4);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001.G(var1, var2);
   }

   public synchronized void m(String var1) throws Exception {
      DY3 var10001 = Registry.emptyArgs();
      long var3 = 614246546767074737L;
      Object[] var2 = var10001;
      var10001 = Ref.h(614246546767074737L, var2, var3);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001.c$void(var1);
   }

   public synchronized void f(String var1) throws Exception {
      DY3 var10001 = Registry.emptyArgs();
      long var3 = 614246546767074737L;
      Object[] var2 = var10001;
      var10001 = Ref.h(614246546767074737L, var2, var3);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001.V$void(var1);
   }

   public synchronized String x() throws Exception {
      DY3 var10001 = (DY3)(Registry.emptyArgs());
      long var2 = 614246546767074737L;
      Object[] var1 = var10001;
      var10001 = Ref.h(614246546767074737L, var1, var2);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return var10001.k();
   }

   public String g() throws Exception {
      Object var1 = 598356069828463222L;
      return ((DY3)Ref.g(598356069828463222L, var1)).k();
   }

   public synchronized void q(ArrayList param1, ProgressDialog param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 003: bipush 0
      // 004: istore 4
      // 006: istore 3
      // 007: iload 4
      // 009: aload 1
      // 00a: invokevirtual java/util/ArrayList.size ()I
      // 00d: if_icmpge 12f
      // 010: aload 1
      // 011: iload 4
      // 013: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 016: checkcast com/finalshell/core/GZ_2
      // 019: astore 5
      // 01b: iload 3
      // 01c: ifeq 0ee
      // 01f: aload 5
      // 021: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 024: ldc2_w 501901987609518328
      // 027: astore 7
      // 029: astore 6
      // 02b: ldc2_w 501901987609518328
      // 02e: aload 6
      // 030: aload 7
      // 032: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 035: checkcast java/lang/Boolean
      // 038: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03b: goto 042
      // 03e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 041: athrow
      // 042: ifeq 091
      // 045: goto 04c
      // 048: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 5
      // 04f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 052: ldc2_w 552192581091318882
      // 055: astore 9
      // 057: astore 8
      // 059: ldc2_w 552192581091318882
      // 05c: aload 8
      // 05e: aload 9
      // 060: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 063: goto 06a
      // 066: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 069: athrow
      // 06a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 06d: ldc2_w 314023774882650709
      // 070: astore 11
      // 072: astore 10
      // 074: ldc2_w 314023774882650709
      // 077: aload 10
      // 079: aload 11
      // 07b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07e: pop
      // 07f: goto 086
      // 082: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 085: athrow
      // 086: iload 3
      // 087: ifne 128
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 2
      // 092: new java/lang/StringBuilder
      // 095: dup
      // 096: invokespecial java/lang/StringBuilder.<init> ()V
      // 099: sipush 10448
      // 09c: sipush -24064
      // 09f: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: aload 5
      // 0a7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0aa: ldc2_w 552192581091318882
      // 0ad: astore 13
      // 0af: astore 12
      // 0b1: ldc2_w 552192581091318882
      // 0b4: aload 12
      // 0b6: aload 13
      // 0b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bb: checkcast java/lang/String
      // 0be: goto 0c5
      // 0c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ce: ldc2_w 403347985419057804
      // 0d1: astore 15
      // 0d3: astore 14
      // 0d5: ldc2_w 403347985419057804
      // 0d8: aload 14
      // 0da: aload 15
      // 0dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0df: pop
      // 0e0: goto 0e7
      // 0e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: aload 5
      // 0f1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f4: ldc2_w 552192581091318882
      // 0f7: astore 17
      // 0f9: astore 16
      // 0fb: ldc2_w 552192581091318882
      // 0fe: aload 16
      // 100: aload 17
      // 102: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 105: goto 10c
      // 108: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10f: ldc2_w 596624758422184723
      // 112: astore 19
      // 114: astore 18
      // 116: ldc2_w 596624758422184723
      // 119: aload 18
      // 11b: aload 19
      // 11d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 120: pop
      // 121: goto 128
      // 124: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 127: athrow
      // 128: iinc 4 1
      // 12b: iload 3
      // 12c: ifne 007
      // 12f: return
   }

   public synchronized void G(String param1, ArrayList param2, ProgressDialog param3, boolean param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 004: ldc2_w 614246546767074737
      // 007: astore 12
      // 009: astore 11
      // 00b: ldc2_w 614246546767074737
      // 00e: aload 11
      // 010: aload 12
      // 012: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 015: checkcast com/finalshell/core/DY3
      // 018: goto 01f
      // 01b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 1
      // 020: invokevirtual com/finalshell/core/DY3.M$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 023: astore 6
      // 025: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 028: aload 3
      // 029: new java/lang/StringBuilder
      // 02c: dup
      // 02d: invokespecial java/lang/StringBuilder.<init> ()V
      // 030: sipush 10455
      // 033: sipush 26846
      // 036: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 039: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03c: aload 1
      // 03d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 040: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 043: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 046: ldc2_w 403347985419057804
      // 049: astore 14
      // 04b: astore 13
      // 04d: ldc2_w 403347985419057804
      // 050: aload 13
      // 052: aload 14
      // 054: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 057: pop
      // 058: goto 05f
      // 05b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: istore 5
      // 061: aload 6
      // 063: invokevirtual java/util/Vector.iterator ()Ljava/util/Iterator;
      // 066: astore 7
      // 068: aload 7
      // 06a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06f: ifeq 25d
      // 072: aload 7
      // 074: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 079: checkcast com/finalshell/core/W4_2
      // 07c: astore 8
      // 07e: aload 8
      // 080: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 083: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 086: iload 5
      // 088: ifeq 0a7
      // 08b: ifeq 1b7
      // 08e: goto 095
      // 091: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 8
      // 097: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 09a: ldc_w "."
      // 09d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: iload 5
      // 0a9: ifeq 0da
      // 0ac: ifne 258
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 8
      // 0b8: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 0bb: iload 5
      // 0bd: ifeq 0de
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: sipush 10458
      // 0ca: sipush 1646
      // 0cd: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 0d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: ifne 258
      // 0dd: aload 1
      // 0de: astore 9
      // 0e0: aload 9
      // 0e2: iload 5
      // 0e4: ifeq 125
      // 0e7: ldc_w "/"
      // 0ea: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0ed: ifne 10e
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: new java/lang/StringBuilder
      // 0fa: dup
      // 0fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe: aload 9
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: ldc_w "/"
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10c: astore 9
      // 10e: new java/lang/StringBuilder
      // 111: dup
      // 112: invokespecial java/lang/StringBuilder.<init> ()V
      // 115: aload 9
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: aload 8
      // 11c: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 125: astore 10
      // 127: aload 3
      // 128: new java/lang/StringBuilder
      // 12b: dup
      // 12c: invokespecial java/lang/StringBuilder.<init> ()V
      // 12f: sipush 10459
      // 132: sipush 16561
      // 135: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: aload 10
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 146: ldc2_w 403347985419057804
      // 149: astore 16
      // 14b: astore 15
      // 14d: ldc2_w 403347985419057804
      // 150: aload 15
      // 152: aload 16
      // 154: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 157: pop
      // 158: goto 15f
      // 15b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: aload 0
      // 160: aload 10
      // 162: aload 2
      // 163: aload 3
      // 164: iload 4
      // 166: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 169: ldc2_w 557010342823591586
      // 16c: astore 18
      // 16e: astore 17
      // 170: ldc2_w 557010342823591586
      // 173: aload 17
      // 175: aload 18
      // 177: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17a: pop
      // 17b: goto 182
      // 17e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 181: athrow
      // 182: iload 4
      // 184: iload 5
      // 186: ifeq 1b1
      // 189: ifeq 1b2
      // 18c: goto 193
      // 18f: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: aload 2
      // 194: new com/finalshell/core/GZ_2
      // 197: dup
      // 198: aload 10
      // 19a: lconst_0
      // 19b: aload 8
      // 19d: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 1a0: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 1a3: bipush 1
      // 1a4: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 1a7: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: pop
      // 1b2: iload 5
      // 1b4: ifne 258
      // 1b7: aload 1
      // 1b8: astore 9
      // 1ba: aload 9
      // 1bc: iload 5
      // 1be: ifeq 1ff
      // 1c1: ldc_w "/"
      // 1c4: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1c7: ifne 1e8
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: new java/lang/StringBuilder
      // 1d4: dup
      // 1d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d8: aload 9
      // 1da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dd: ldc_w "/"
      // 1e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e6: astore 9
      // 1e8: new java/lang/StringBuilder
      // 1eb: dup
      // 1ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ef: aload 9
      // 1f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f4: aload 8
      // 1f6: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ff: astore 10
      // 201: aload 3
      // 202: new java/lang/StringBuilder
      // 205: dup
      // 206: invokespecial java/lang/StringBuilder.<init> ()V
      // 209: sipush 10453
      // 20c: sipush 31280
      // 20f: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: aload 10
      // 217: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 220: ldc2_w 403347985419057804
      // 223: astore 20
      // 225: astore 19
      // 227: ldc2_w 403347985419057804
      // 22a: aload 19
      // 22c: aload 20
      // 22e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 231: pop
      // 232: goto 239
      // 235: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 238: athrow
      // 239: aload 2
      // 23a: new com/finalshell/core/GZ_2
      // 23d: dup
      // 23e: aload 10
      // 240: aload 8
      // 242: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 245: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 248: aload 8
      // 24a: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 24d: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 250: bipush 0
      // 251: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 254: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 257: pop
      // 258: iload 5
      // 25a: ifne 068
      // 25d: return
   }

   public synchronized boolean V$boolean(String var1) throws Exception {
      boolean var2 = true;

      try {
         DY3 var10001 = Registry.emptyArgs();
         long var5 = 614246546767074737L;
         Object[] var4 = var10001;
         var10001 = Ref.h(614246546767074737L, var4, var5);

         try {
            var10001 = (DY3)var10001;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         C_p_2 var3 = var10001.s(var1);
      } catch (Dn2_2 var7) {
         var2 = false;
      }

      return var2;
   }

   public synchronized Tf4 V$tf_4(String var1) throws Exception {
      Tf4 var2 = null;
      DY3 var10001 = Registry.emptyArgs();
      long var5 = 614246546767074737L;
      Object[] var4 = var10001;
      var10001 = Ref.h(614246546767074737L, var4, var5);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      C_p_2 var3 = var10001.s(var1);
      if (var3.e$boolean()) {
         var2 = new Tf4();
         Object[] var10002 = Registry.packArgs(false);
         long var7 = 239155702935749150L;
         Object[] var6 = var10002;
         Ref.h(239155702935749150L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         Registry.packArgs(var1);
         long var8 = 477969598131796924L;
         Object[] var10004 = Registry.packArgs(Ref.h2(477969598131796924L, var8));
         long var11 = 268583885901814073L;
         Object[] var10 = var10004;
         Ref.h(268583885901814073L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         Object[] var10005 = Registry.packArgs(var1);
         long var13 = 309720334529505891L;
         Object[] var12 = var10005;
         Ref.h(309720334529505891L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Object[] var10006 = Registry.e((long)var3.S() * b(32535, 7918094795288066252L));
         long var15 = 181429069641073377L;
         Object[] var14 = var10006;
         Ref.h(181429069641073377L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         Object[] var10007 = Registry.packArgs(var3.C());
         long var17 = 571538188428705630L;
         Object[] var16 = var10007;
         Ref.h(571538188428705630L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Object[] var10008 = Registry.packArgs(var3.T());
         long var19 = 261395141772414485L;
         Object[] var18 = var10008;
         Ref.h(261395141772414485L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         Object[] var10009 = Registry.packArgs(var3.M$int());
         long var21 = 301184803164991541L;
         Object[] var20 = var10009;
         Ref.h(301184803164991541L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         Object[] var10010 = Registry.packArgs(var3.k());
         long var23 = 352629843184101547L;
         Object[] var22 = var10010;
         Ref.h(352629843184101547L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }

      return var2;
   }

   public synchronized Ck4 X(String var1) throws Exception {
      Ck4 var2 = null;
      DY3 var10001 = Registry.emptyArgs();
      long var5 = 614246546767074737L;
      Object[] var4 = var10001;
      var10001 = Ref.h(614246546767074737L, var4, var5);

      try {
         var10001 = (DY3)var10001;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      C_p_2 var3 = var10001.s(var1);
      if (var3.V()) {
         var2 = new Ck4();
         Object[] var10002 = Registry.packArgs(false);
         long var7 = 303967888743537614L;
         Object[] var6 = var10002;
         Ref.h(303967888743537614L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         Registry.packArgs(var1);
         long var8 = 477969598131796924L;
         Object[] var10004 = Registry.packArgs(Ref.h2(477969598131796924L, var8));
         long var11 = 155850144873198620L;
         Object[] var10 = var10004;
         Ref.h(155850144873198620L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         Object[] var10005 = Registry.packArgs(var1);
         long var13 = 584136914483294074L;
         Object[] var12 = var10005;
         Ref.h(584136914483294074L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Object[] var10006 = Registry.e(var3.v());
         long var15 = 130797771737578875L;
         Object[] var14 = var10006;
         Ref.h(130797771737578875L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         Object[] var10007 = Registry.e((long)var3.S() * b(32535, 7918094795288066252L));
         long var17 = 571461084289720403L;
         Object[] var16 = var10007;
         Ref.h(571461084289720403L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Object[] var10008 = Registry.packArgs(var3.C());
         long var19 = 304207951791694868L;
         Object[] var18 = var10008;
         Ref.h(304207951791694868L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         Object[] var10009 = Registry.packArgs(var3.T());
         long var21 = 171079686275957967L;
         Object[] var20 = var10009;
         Ref.h(171079686275957967L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         Object[] var10010 = Registry.packArgs(var3.M$int());
         long var23 = 419886369293011317L;
         Object[] var22 = var10010;
         Ref.h(419886369293011317L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }

      return var2;
   }

   public synchronized Tf4 o(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 003: aload 1
      // 004: astore 3
      // 005: istore 2
      // 006: aload 1
      // 007: ldc_w "/"
      // 00a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 00d: ifne 010
      // 010: aload 0
      // 011: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 014: ldc2_w 614246546767074737
      // 017: astore 18
      // 019: astore 17
      // 01b: ldc2_w 614246546767074737
      // 01e: aload 17
      // 020: aload 18
      // 022: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 025: checkcast com/finalshell/core/DY3
      // 028: goto 02f
      // 02b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 3
      // 030: invokevirtual com/finalshell/core/DY3.M$Vector (Ljava/lang/String;)Ljava/util/Vector;
      // 033: astore 4
      // 035: new java/util/Vector
      // 038: dup
      // 039: invokespecial java/util/Vector.<init> ()V
      // 03c: astore 5
      // 03e: new java/util/Vector
      // 041: dup
      // 042: invokespecial java/util/Vector.<init> ()V
      // 045: astore 6
      // 047: new com/finalshell/ui/model/Tf4
      // 04a: dup
      // 04b: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 04e: astore 7
      // 050: aload 7
      // 052: bipush 0
      // 053: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 056: ldc2_w 239155702935749150
      // 059: astore 20
      // 05b: astore 19
      // 05d: ldc2_w 239155702935749150
      // 060: aload 19
      // 062: aload 20
      // 064: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 067: pop
      // 068: goto 06f
      // 06b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 7
      // 071: aload 1
      // 072: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 075: ldc2_w 309720334529505891
      // 078: astore 22
      // 07a: astore 21
      // 07c: ldc2_w 309720334529505891
      // 07f: aload 21
      // 081: aload 22
      // 083: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 086: pop
      // 087: goto 08e
      // 08a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: new java/util/ArrayList
      // 091: dup
      // 092: invokespecial java/util/ArrayList.<init> ()V
      // 095: astore 8
      // 097: aload 4
      // 099: invokevirtual java/util/Vector.iterator ()Ljava/util/Iterator;
      // 09c: astore 9
      // 09e: aload 9
      // 0a0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a5: ifeq 161
      // 0a8: aload 9
      // 0aa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0af: checkcast com/finalshell/core/W4_2
      // 0b2: astore 10
      // 0b4: aload 10
      // 0b6: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 0b9: ldc_w "."
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: iload 2
      // 0c0: ifeq 0e5
      // 0c3: ifne 156
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: aload 10
      // 0cf: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 0d2: sipush 10452
      // 0d5: sipush -26103
      // 0d8: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 0db: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: iload 2
      // 0e6: ifeq 102
      // 0e9: ifne 156
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 10
      // 0f5: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 0f8: invokevirtual com/finalshell/core/C_p_2.L ()Z
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: ifeq 156
      // 105: aload 1
      // 106: astore 11
      // 108: aload 11
      // 10a: iload 2
      // 10b: ifeq 14c
      // 10e: ldc_w "/"
      // 111: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 114: ifne 135
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: invokespecial java/lang/StringBuilder.<init> ()V
      // 125: aload 11
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12a: ldc_w "/"
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 133: astore 11
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: aload 11
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: aload 10
      // 143: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14c: astore 12
      // 14e: aload 8
      // 150: aload 12
      // 152: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 155: pop
      // 156: iload 2
      // 157: ifne 09e
      // 15a: bipush 2
      // 15b: anewarray 165
      // 15e: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 161: aload 0
      // 162: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 165: ldc2_w 614246546767074737
      // 168: astore 24
      // 16a: astore 23
      // 16c: ldc2_w 614246546767074737
      // 16f: aload 23
      // 171: aload 24
      // 173: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 176: checkcast com/finalshell/core/DY3
      // 179: goto 180
      // 17c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 8
      // 182: invokevirtual com/finalshell/core/DY3.C (Ljava/util/ArrayList;)Ljava/util/HashMap;
      // 185: astore 9
      // 187: aload 4
      // 189: invokevirtual java/util/Vector.iterator ()Ljava/util/Iterator;
      // 18c: astore 10
      // 18e: aload 10
      // 190: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 195: ifeq 9a8
      // 198: aload 10
      // 19a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19f: checkcast com/finalshell/core/W4_2
      // 1a2: astore 11
      // 1a4: aload 11
      // 1a6: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 1a9: astore 12
      // 1ab: aload 12
      // 1ad: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 1b0: iload 2
      // 1b1: ifeq 393
      // 1b4: ifeq 384
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: aload 11
      // 1c0: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 1c3: ldc_w "."
      // 1c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c9: iload 2
      // 1ca: ifeq 1f6
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: ifne 9a4
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: aload 11
      // 1e0: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 1e3: sipush 10452
      // 1e6: sipush -26103
      // 1e9: invokestatic com/finalshell/connection/Connection12.a (II)Ljava/lang/String;
      // 1ec: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: ifne 9a4
      // 1f9: new com/finalshell/ui/model/Tf4
      // 1fc: dup
      // 1fd: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 200: astore 13
      // 202: aload 13
      // 204: bipush 0
      // 205: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 208: ldc2_w 239155702935749150
      // 20b: astore 26
      // 20d: astore 25
      // 20f: ldc2_w 239155702935749150
      // 212: aload 25
      // 214: aload 26
      // 216: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 219: pop
      // 21a: goto 221
      // 21d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 220: athrow
      // 221: aload 13
      // 223: aload 11
      // 225: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 228: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 22b: ldc2_w 268583885901814073
      // 22e: astore 28
      // 230: astore 27
      // 232: ldc2_w 268583885901814073
      // 235: aload 27
      // 237: aload 28
      // 239: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23c: pop
      // 23d: goto 244
      // 240: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 243: athrow
      // 244: aload 1
      // 245: astore 14
      // 247: aload 14
      // 249: iload 2
      // 24a: ifeq 28b
      // 24d: ldc_w "/"
      // 250: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 253: ifne 274
      // 256: goto 25d
      // 259: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25c: athrow
      // 25d: new java/lang/StringBuilder
      // 260: dup
      // 261: invokespecial java/lang/StringBuilder.<init> ()V
      // 264: aload 14
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 269: ldc_w "/"
      // 26c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 272: astore 14
      // 274: new java/lang/StringBuilder
      // 277: dup
      // 278: invokespecial java/lang/StringBuilder.<init> ()V
      // 27b: aload 14
      // 27d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 280: aload 11
      // 282: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 285: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 288: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 28b: astore 15
      // 28d: aload 13
      // 28f: aload 15
      // 291: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 294: ldc2_w 309720334529505891
      // 297: astore 30
      // 299: astore 29
      // 29b: ldc2_w 309720334529505891
      // 29e: aload 29
      // 2a0: aload 30
      // 2a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a5: pop
      // 2a6: goto 2ad
      // 2a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: aload 13
      // 2af: aload 11
      // 2b1: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 2b4: invokevirtual com/finalshell/core/C_p_2.S ()I
      // 2b7: i2l
      // 2b8: sipush 18012
      // 2bb: ldc2_w 1796558263293346182
      // 2be: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 2c1: lmul
      // 2c2: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 2c5: ldc2_w 181429069641073377
      // 2c8: astore 32
      // 2ca: astore 31
      // 2cc: ldc2_w 181429069641073377
      // 2cf: aload 31
      // 2d1: aload 32
      // 2d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d6: pop
      // 2d7: goto 2de
      // 2da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dd: athrow
      // 2de: aload 13
      // 2e0: aload 11
      // 2e2: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 2e5: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 2e8: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 2eb: ldc2_w 571538188428705630
      // 2ee: astore 34
      // 2f0: astore 33
      // 2f2: ldc2_w 571538188428705630
      // 2f5: aload 33
      // 2f7: aload 34
      // 2f9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2fc: pop
      // 2fd: goto 304
      // 300: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 303: athrow
      // 304: aload 13
      // 306: aload 11
      // 308: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 30b: invokevirtual com/finalshell/core/C_p_2.T ()Ljava/lang/String;
      // 30e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 311: ldc2_w 261395141772414485
      // 314: astore 36
      // 316: astore 35
      // 318: ldc2_w 261395141772414485
      // 31b: aload 35
      // 31d: aload 36
      // 31f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 322: pop
      // 323: goto 32a
      // 326: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 329: athrow
      // 32a: aload 13
      // 32c: aload 11
      // 32e: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 331: invokevirtual com/finalshell/core/C_p_2.M$int ()I
      // 334: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 337: ldc2_w 301184803164991541
      // 33a: astore 38
      // 33c: astore 37
      // 33e: ldc2_w 301184803164991541
      // 341: aload 37
      // 343: aload 38
      // 345: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 348: pop
      // 349: goto 350
      // 34c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34f: athrow
      // 350: aload 13
      // 352: aload 11
      // 354: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 357: invokevirtual com/finalshell/core/C_p_2.k ()I
      // 35a: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 35d: ldc2_w 352629843184101547
      // 360: astore 40
      // 362: astore 39
      // 364: ldc2_w 352629843184101547
      // 367: aload 39
      // 369: aload 40
      // 36b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36e: pop
      // 36f: goto 376
      // 372: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 375: athrow
      // 376: aload 5
      // 378: aload 13
      // 37a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 37f: pop
      // 380: iload 2
      // 381: ifne 9a4
      // 384: aload 11
      // 386: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 389: invokevirtual com/finalshell/core/C_p_2.V ()Z
      // 38c: goto 393
      // 38f: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 392: athrow
      // 393: iload 2
      // 394: ifeq 55e
      // 397: ifeq 54f
      // 39a: goto 3a1
      // 39d: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a0: athrow
      // 3a1: new com/finalshell/ui/model/Ck4
      // 3a4: dup
      // 3a5: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 3a8: astore 13
      // 3aa: aload 13
      // 3ac: bipush 0
      // 3ad: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 3b0: ldc2_w 303967888743537614
      // 3b3: astore 42
      // 3b5: astore 41
      // 3b7: ldc2_w 303967888743537614
      // 3ba: aload 41
      // 3bc: aload 42
      // 3be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c1: pop
      // 3c2: goto 3c9
      // 3c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3c8: athrow
      // 3c9: aload 13
      // 3cb: aload 11
      // 3cd: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 3d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3d3: ldc2_w 155850144873198620
      // 3d6: astore 44
      // 3d8: astore 43
      // 3da: ldc2_w 155850144873198620
      // 3dd: aload 43
      // 3df: aload 44
      // 3e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e4: pop
      // 3e5: goto 3ec
      // 3e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3eb: athrow
      // 3ec: aload 1
      // 3ed: astore 14
      // 3ef: aload 14
      // 3f1: iload 2
      // 3f2: ifeq 433
      // 3f5: ldc_w "/"
      // 3f8: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3fb: ifne 41c
      // 3fe: goto 405
      // 401: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 404: athrow
      // 405: new java/lang/StringBuilder
      // 408: dup
      // 409: invokespecial java/lang/StringBuilder.<init> ()V
      // 40c: aload 14
      // 40e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 411: ldc_w "/"
      // 414: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 417: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41a: astore 14
      // 41c: new java/lang/StringBuilder
      // 41f: dup
      // 420: invokespecial java/lang/StringBuilder.<init> ()V
      // 423: aload 14
      // 425: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 428: aload 11
      // 42a: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 42d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 430: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 433: astore 15
      // 435: aload 13
      // 437: aload 15
      // 439: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 43c: ldc2_w 584136914483294074
      // 43f: astore 46
      // 441: astore 45
      // 443: ldc2_w 584136914483294074
      // 446: aload 45
      // 448: aload 46
      // 44a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 44d: pop
      // 44e: goto 455
      // 451: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 454: athrow
      // 455: aload 13
      // 457: aload 11
      // 459: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 45c: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 45f: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 462: ldc2_w 130797771737578875
      // 465: astore 48
      // 467: astore 47
      // 469: ldc2_w 130797771737578875
      // 46c: aload 47
      // 46e: aload 48
      // 470: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 473: pop
      // 474: goto 47b
      // 477: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47a: athrow
      // 47b: aload 13
      // 47d: aload 11
      // 47f: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 482: invokevirtual com/finalshell/core/C_p_2.S ()I
      // 485: i2l
      // 486: sipush 32535
      // 489: ldc2_w 7918094795288066252
      // 48c: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 48f: lmul
      // 490: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 493: ldc2_w 571461084289720403
      // 496: astore 50
      // 498: astore 49
      // 49a: ldc2_w 571461084289720403
      // 49d: aload 49
      // 49f: aload 50
      // 4a1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a4: pop
      // 4a5: goto 4ac
      // 4a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ab: athrow
      // 4ac: aload 13
      // 4ae: aload 11
      // 4b0: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 4b3: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 4b6: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 4b9: ldc2_w 304207951791694868
      // 4bc: astore 52
      // 4be: astore 51
      // 4c0: ldc2_w 304207951791694868
      // 4c3: aload 51
      // 4c5: aload 52
      // 4c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4ca: pop
      // 4cb: goto 4d2
      // 4ce: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d1: athrow
      // 4d2: aload 13
      // 4d4: aload 11
      // 4d6: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 4d9: invokevirtual com/finalshell/core/C_p_2.T ()Ljava/lang/String;
      // 4dc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4df: ldc2_w 171079686275957967
      // 4e2: astore 54
      // 4e4: astore 53
      // 4e6: ldc2_w 171079686275957967
      // 4e9: aload 53
      // 4eb: aload 54
      // 4ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f0: pop
      // 4f1: goto 4f8
      // 4f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f7: athrow
      // 4f8: aload 13
      // 4fa: aload 11
      // 4fc: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 4ff: invokevirtual com/finalshell/core/C_p_2.M$int ()I
      // 502: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 505: ldc2_w 419886369293011317
      // 508: astore 56
      // 50a: astore 55
      // 50c: ldc2_w 419886369293011317
      // 50f: aload 55
      // 511: aload 56
      // 513: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 516: pop
      // 517: goto 51e
      // 51a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 51d: athrow
      // 51e: aload 13
      // 520: aload 12
      // 522: invokevirtual com/finalshell/core/C_p_2.k ()I
      // 525: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 528: ldc2_w 485845807038919269
      // 52b: astore 58
      // 52d: astore 57
      // 52f: ldc2_w 485845807038919269
      // 532: aload 57
      // 534: aload 58
      // 536: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 539: pop
      // 53a: goto 541
      // 53d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 540: athrow
      // 541: aload 6
      // 543: aload 13
      // 545: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 54a: pop
      // 54b: iload 2
      // 54c: ifne 9a4
      // 54f: aload 11
      // 551: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 554: invokevirtual com/finalshell/core/C_p_2.L ()Z
      // 557: goto 55e
      // 55a: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55d: athrow
      // 55e: ifeq 8b5
      // 561: aload 1
      // 562: astore 13
      // 564: aload 13
      // 566: iload 2
      // 567: ifeq 5a8
      // 56a: ldc_w "/"
      // 56d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 570: ifne 591
      // 573: goto 57a
      // 576: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 579: athrow
      // 57a: new java/lang/StringBuilder
      // 57d: dup
      // 57e: invokespecial java/lang/StringBuilder.<init> ()V
      // 581: aload 13
      // 583: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 586: ldc_w "/"
      // 589: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58f: astore 13
      // 591: new java/lang/StringBuilder
      // 594: dup
      // 595: invokespecial java/lang/StringBuilder.<init> ()V
      // 598: aload 13
      // 59a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59d: aload 11
      // 59f: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 5a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5a8: astore 14
      // 5aa: aload 9
      // 5ac: aload 14
      // 5ae: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5b1: checkcast com/finalshell/core/C_p_2
      // 5b4: astore 15
      // 5b6: aload 15
      // 5b8: iload 2
      // 5b9: ifeq 5c8
      // 5bc: ifnull 8b1
      // 5bf: goto 5c6
      // 5c2: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c5: athrow
      // 5c6: aload 15
      // 5c8: invokevirtual com/finalshell/core/C_p_2.e$boolean ()Z
      // 5cb: iload 2
      // 5cc: ifeq 73a
      // 5cf: ifeq 72e
      // 5d2: goto 5d9
      // 5d5: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d8: athrow
      // 5d9: new com/finalshell/ui/model/Tf4
      // 5dc: dup
      // 5dd: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 5e0: astore 16
      // 5e2: aload 16
      // 5e4: bipush 1
      // 5e5: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 5e8: ldc2_w 340248338757761856
      // 5eb: astore 60
      // 5ed: astore 59
      // 5ef: ldc2_w 340248338757761856
      // 5f2: aload 59
      // 5f4: aload 60
      // 5f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f9: pop
      // 5fa: goto 601
      // 5fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 600: athrow
      // 601: aload 16
      // 603: bipush 0
      // 604: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 607: ldc2_w 239155702935749150
      // 60a: astore 62
      // 60c: astore 61
      // 60e: ldc2_w 239155702935749150
      // 611: aload 61
      // 613: aload 62
      // 615: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 618: pop
      // 619: goto 620
      // 61c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 61f: athrow
      // 620: aload 16
      // 622: aload 11
      // 624: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 627: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 62a: ldc2_w 268583885901814073
      // 62d: astore 64
      // 62f: astore 63
      // 631: ldc2_w 268583885901814073
      // 634: aload 63
      // 636: aload 64
      // 638: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 63b: pop
      // 63c: goto 643
      // 63f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 642: athrow
      // 643: aload 16
      // 645: aload 14
      // 647: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 64a: ldc2_w 309720334529505891
      // 64d: astore 66
      // 64f: astore 65
      // 651: ldc2_w 309720334529505891
      // 654: aload 65
      // 656: aload 66
      // 658: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 65b: pop
      // 65c: goto 663
      // 65f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 662: athrow
      // 663: aload 16
      // 665: aload 15
      // 667: invokevirtual com/finalshell/core/C_p_2.S ()I
      // 66a: i2l
      // 66b: sipush 32535
      // 66e: ldc2_w 7918094795288066252
      // 671: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 674: lmul
      // 675: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 678: ldc2_w 181429069641073377
      // 67b: astore 68
      // 67d: astore 67
      // 67f: ldc2_w 181429069641073377
      // 682: aload 67
      // 684: aload 68
      // 686: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 689: pop
      // 68a: goto 691
      // 68d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 690: athrow
      // 691: aload 16
      // 693: aload 15
      // 695: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 698: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 69b: ldc2_w 571538188428705630
      // 69e: astore 70
      // 6a0: astore 69
      // 6a2: ldc2_w 571538188428705630
      // 6a5: aload 69
      // 6a7: aload 70
      // 6a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6ac: pop
      // 6ad: goto 6b4
      // 6b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6b3: athrow
      // 6b4: aload 16
      // 6b6: aload 15
      // 6b8: invokevirtual com/finalshell/core/C_p_2.T ()Ljava/lang/String;
      // 6bb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6be: ldc2_w 261395141772414485
      // 6c1: astore 72
      // 6c3: astore 71
      // 6c5: ldc2_w 261395141772414485
      // 6c8: aload 71
      // 6ca: aload 72
      // 6cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6cf: pop
      // 6d0: goto 6d7
      // 6d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6d6: athrow
      // 6d7: aload 16
      // 6d9: aload 11
      // 6db: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 6de: invokevirtual com/finalshell/core/C_p_2.M$int ()I
      // 6e1: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 6e4: ldc2_w 301184803164991541
      // 6e7: astore 74
      // 6e9: astore 73
      // 6eb: ldc2_w 301184803164991541
      // 6ee: aload 73
      // 6f0: aload 74
      // 6f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f5: pop
      // 6f6: goto 6fd
      // 6f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6fc: athrow
      // 6fd: aload 16
      // 6ff: aload 12
      // 701: invokevirtual com/finalshell/core/C_p_2.k ()I
      // 704: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 707: ldc2_w 352629843184101547
      // 70a: astore 76
      // 70c: astore 75
      // 70e: ldc2_w 352629843184101547
      // 711: aload 75
      // 713: aload 76
      // 715: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 718: pop
      // 719: goto 720
      // 71c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71f: athrow
      // 720: aload 5
      // 722: aload 16
      // 724: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 729: pop
      // 72a: iload 2
      // 72b: ifne 8b1
      // 72e: aload 15
      // 730: invokevirtual com/finalshell/core/C_p_2.V ()Z
      // 733: goto 73a
      // 736: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 739: athrow
      // 73a: ifeq 8b1
      // 73d: new com/finalshell/ui/model/Ck4
      // 740: dup
      // 741: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 744: astore 16
      // 746: aload 16
      // 748: bipush 1
      // 749: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 74c: ldc2_w 512849084043364150
      // 74f: astore 78
      // 751: astore 77
      // 753: ldc2_w 512849084043364150
      // 756: aload 77
      // 758: aload 78
      // 75a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 75d: pop
      // 75e: goto 765
      // 761: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 764: athrow
      // 765: aload 16
      // 767: bipush 0
      // 768: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 76b: ldc2_w 303967888743537614
      // 76e: astore 80
      // 770: astore 79
      // 772: ldc2_w 303967888743537614
      // 775: aload 79
      // 777: aload 80
      // 779: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 77c: pop
      // 77d: goto 784
      // 780: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 783: athrow
      // 784: aload 16
      // 786: aload 11
      // 788: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 78b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 78e: ldc2_w 155850144873198620
      // 791: astore 82
      // 793: astore 81
      // 795: ldc2_w 155850144873198620
      // 798: aload 81
      // 79a: aload 82
      // 79c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 79f: pop
      // 7a0: goto 7a7
      // 7a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7a6: athrow
      // 7a7: aload 16
      // 7a9: aload 14
      // 7ab: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 7ae: ldc2_w 584136914483294074
      // 7b1: astore 84
      // 7b3: astore 83
      // 7b5: ldc2_w 584136914483294074
      // 7b8: aload 83
      // 7ba: aload 84
      // 7bc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7bf: pop
      // 7c0: goto 7c7
      // 7c3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7c6: athrow
      // 7c7: aload 16
      // 7c9: aload 15
      // 7cb: invokevirtual com/finalshell/core/C_p_2.v ()J
      // 7ce: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 7d1: ldc2_w 130797771737578875
      // 7d4: astore 86
      // 7d6: astore 85
      // 7d8: ldc2_w 130797771737578875
      // 7db: aload 85
      // 7dd: aload 86
      // 7df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7e2: pop
      // 7e3: goto 7ea
      // 7e6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7e9: athrow
      // 7ea: aload 16
      // 7ec: aload 15
      // 7ee: invokevirtual com/finalshell/core/C_p_2.S ()I
      // 7f1: i2l
      // 7f2: sipush 32535
      // 7f5: ldc2_w 7918094795288066252
      // 7f8: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 7fb: lmul
      // 7fc: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 7ff: ldc2_w 571461084289720403
      // 802: astore 88
      // 804: astore 87
      // 806: ldc2_w 571461084289720403
      // 809: aload 87
      // 80b: aload 88
      // 80d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 810: pop
      // 811: goto 818
      // 814: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 817: athrow
      // 818: aload 16
      // 81a: aload 15
      // 81c: invokevirtual com/finalshell/core/C_p_2.C ()I
      // 81f: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 822: ldc2_w 304207951791694868
      // 825: astore 90
      // 827: astore 89
      // 829: ldc2_w 304207951791694868
      // 82c: aload 89
      // 82e: aload 90
      // 830: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 833: pop
      // 834: goto 83b
      // 837: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 83a: athrow
      // 83b: aload 16
      // 83d: aload 15
      // 83f: invokevirtual com/finalshell/core/C_p_2.T ()Ljava/lang/String;
      // 842: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 845: ldc2_w 171079686275957967
      // 848: astore 92
      // 84a: astore 91
      // 84c: ldc2_w 171079686275957967
      // 84f: aload 91
      // 851: aload 92
      // 853: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 856: pop
      // 857: goto 85e
      // 85a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 85d: athrow
      // 85e: aload 16
      // 860: aload 11
      // 862: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 865: invokevirtual com/finalshell/core/C_p_2.M$int ()I
      // 868: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 86b: ldc2_w 419886369293011317
      // 86e: astore 94
      // 870: astore 93
      // 872: ldc2_w 419886369293011317
      // 875: aload 93
      // 877: aload 94
      // 879: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 87c: pop
      // 87d: goto 884
      // 880: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 883: athrow
      // 884: aload 16
      // 886: aload 12
      // 888: invokevirtual com/finalshell/core/C_p_2.k ()I
      // 88b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 88e: ldc2_w 485845807038919269
      // 891: astore 96
      // 893: astore 95
      // 895: ldc2_w 485845807038919269
      // 898: aload 95
      // 89a: aload 96
      // 89c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 89f: pop
      // 8a0: goto 8a7
      // 8a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8a6: athrow
      // 8a7: aload 6
      // 8a9: aload 16
      // 8ab: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8b0: pop
      // 8b1: iload 2
      // 8b2: ifne 9a4
      // 8b5: new com/finalshell/ui/model/Tf4
      // 8b8: dup
      // 8b9: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 8bc: astore 13
      // 8be: aload 13
      // 8c0: bipush 0
      // 8c1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 8c4: ldc2_w 239155702935749150
      // 8c7: astore 98
      // 8c9: astore 97
      // 8cb: ldc2_w 239155702935749150
      // 8ce: aload 97
      // 8d0: aload 98
      // 8d2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8d5: pop
      // 8d6: goto 8dd
      // 8d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8dc: athrow
      // 8dd: aload 13
      // 8df: aload 11
      // 8e1: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 8e4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 8e7: ldc2_w 268583885901814073
      // 8ea: astore 100
      // 8ec: astore 99
      // 8ee: ldc2_w 268583885901814073
      // 8f1: aload 99
      // 8f3: aload 100
      // 8f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8f8: pop
      // 8f9: goto 900
      // 8fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8ff: athrow
      // 900: aload 1
      // 901: astore 14
      // 903: aload 14
      // 905: iload 2
      // 906: ifeq 947
      // 909: ldc_w "/"
      // 90c: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 90f: ifne 930
      // 912: goto 919
      // 915: invokestatic com/finalshell/connection/Connection12.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 918: athrow
      // 919: new java/lang/StringBuilder
      // 91c: dup
      // 91d: invokespecial java/lang/StringBuilder.<init> ()V
      // 920: aload 14
      // 922: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 925: ldc_w "/"
      // 928: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 92e: astore 14
      // 930: new java/lang/StringBuilder
      // 933: dup
      // 934: invokespecial java/lang/StringBuilder.<init> ()V
      // 937: aload 14
      // 939: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93c: aload 11
      // 93e: invokevirtual com/finalshell/core/W4_2.z ()Ljava/lang/String;
      // 941: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 944: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 947: astore 15
      // 949: aload 13
      // 94b: aload 15
      // 94d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 950: ldc2_w 309720334529505891
      // 953: astore 102
      // 955: astore 101
      // 957: ldc2_w 309720334529505891
      // 95a: aload 101
      // 95c: aload 102
      // 95e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 961: pop
      // 962: goto 969
      // 965: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 968: athrow
      // 969: aload 13
      // 96b: aload 11
      // 96d: invokevirtual com/finalshell/core/W4_2.x ()Lcom/finalshell/core/C_p_2;
      // 970: invokevirtual com/finalshell/core/C_p_2.S ()I
      // 973: i2l
      // 974: sipush 32535
      // 977: ldc2_w 7918094795288066252
      // 97a: invokestatic com/finalshell/connection/Connection12.b (IJ)J
      // 97d: lmul
      // 97e: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 981: ldc2_w 181429069641073377
      // 984: astore 104
      // 986: astore 103
      // 988: ldc2_w 181429069641073377
      // 98b: aload 103
      // 98d: aload 104
      // 98f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 992: pop
      // 993: goto 99a
      // 996: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 999: athrow
      // 99a: aload 5
      // 99c: aload 13
      // 99e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9a3: pop
      // 9a4: iload 2
      // 9a5: ifne 18e
      // 9a8: getstatic java/util/Locale.CHINA Ljava/util/Locale;
      // 9ab: invokestatic java/text/Collator.getInstance (Ljava/util/Locale;)Ljava/text/Collator;
      // 9ae: astore 10
      // 9b0: aload 5
      // 9b2: new com/finalshell/ui/model/FQ
      // 9b5: dup
      // 9b6: aload 0
      // 9b7: aload 10
      // 9b9: invokespecial com/finalshell/ui/model/FQ.<init> (Lcom/finalshell/connection/Connection12;Ljava/text/Collator;)V
      // 9bc: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 9bf: aload 6
      // 9c1: new com/finalshell/ui/model/Xm2
      // 9c4: dup
      // 9c5: aload 0
      // 9c6: aload 10
      // 9c8: invokespecial com/finalshell/ui/model/Xm2.<init> (Lcom/finalshell/connection/Connection12;Ljava/text/Collator;)V
      // 9cb: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 9ce: aload 7
      // 9d0: aload 6
      // 9d2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 9d5: ldc2_w 486938477933204520
      // 9d8: astore 106
      // 9da: astore 105
      // 9dc: ldc2_w 486938477933204520
      // 9df: aload 105
      // 9e1: aload 106
      // 9e3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9e6: pop
      // 9e7: goto 9ee
      // 9ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9ed: athrow
      // 9ee: aload 7
      // 9f0: aload 5
      // 9f2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 9f5: ldc2_w 407744580579201251
      // 9f8: astore 108
      // 9fa: astore 107
      // 9fc: ldc2_w 407744580579201251
      // 9ff: aload 107
      // a01: aload 108
      // a03: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a06: pop
      // a07: goto a0e
      // a0a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a0d: athrow
      // a0e: aload 7
      // a10: areturn
   }

   DY3 e$dY_3() throws Pc2 {
      Object var3 = 473156217884412983L;
      Dm4 var1 = ((ConnectHost)Ref.g(473156217884412983L, var3)).i$dm_4(a(10451, -4460));
      var1.I();
      return (DY3)var1;
   }

   @Override
   public void M(Yl4 var1) {
   }

   public String d$String() {
      Object var1 = 277333437534738353L;
      return (String)Ref.g(277333437534738353L, var1);
   }

   public DY3 H() throws Exception {
      int var1 = this.hashCode();
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 135220879492188512L;
      Object[] var3 = var10001;
      Ref.h(135220879492188512L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object var5 = 353497257519915637L;
      return (DY3)((LinkedBlockingQueue)Ref.g(353497257519915637L, var5)).take();
   }

   public void D(DY3 var1) throws Exception {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 135220879492188512L;
      Object[] var2 = var10001;
      Ref.h(135220879492188512L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object var4 = 353497257519915637L;
      ((LinkedBlockingQueue)Ref.g(353497257519915637L, var4)).put(var1);
   }

   public boolean Q$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: No common supertype for ternary expression
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.getExprType(FunctionExprent.java:224)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.checkExprTypeBounds(FunctionExprent.java:375)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExpr(VarTypeProcessor.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExprent(VarTypeProcessor.java:121)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.lambda$processVarTypes$2(VarTypeProcessor.java:114)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectGraph.iterateExprents(DirectGraph.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.processVarTypes(VarTypeProcessor.java:114)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.calculateVarTypes(VarTypeProcessor.java:44)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarVersionsProcessor.setVarVersions(VarVersionsProcessor.java:68)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarVersions(VarProcessor.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:295)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: ldc2_w 473156217884412983
      // 08: astore 2
      // 09: ldc2_w 473156217884412983
      // 0c: aload 2
      // 0d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10: checkcast com/finalshell/crypto/ConnectHost
      // 13: iload 1
      // 14: ifeq 2d
      // 17: ifnonnull 1c
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: aload 0
      // 1d: ldc2_w 473156217884412983
      // 20: astore 4
      // 22: ldc2_w 473156217884412983
      // 25: aload 4
      // 27: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast com/finalshell/crypto/ConnectHost
      // 2d: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 30: iload 1
      // 31: ifeq 4b
      // 34: ifne 56
      // 37: aload 0
      // 38: ldc2_w 473156217884412983
      // 3b: astore 6
      // 3d: ldc2_w 473156217884412983
      // 40: aload 6
      // 42: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 45: checkcast com/finalshell/crypto/ConnectHost
      // 48: invokevirtual com/finalshell/crypto/ConnectHost.i$boolean ()Z
      // 4b: iload 1
      // 4c: ifeq 53
      // 4f: ifne 56
      // 52: bipush 1
      // 53: goto 57
      // 56: bipush 0
      // 57: ireturn
   }

   public ConnectHost V() {
      Object var1 = 473156217884412983L;
      return (ConnectHost)Ref.g(473156217884412983L, var1);
   }

   public void T(ConnectHost var1) {
      long var3 = 473156217884412983L;
      Ref.s(473156217884412983L, var1, var3);
   }

   public boolean D$boolean() {
      return Registry.lookupField(343226264098752116L).getBoolean(this);
   }

   public void e(boolean var1) {
      Registry.lookupField(343226264098752116L).setBoolean(this, var1);
   }

   public Address Q$F6() {
      Object var1 = 176708525791811192L;
      return (Address)Ref.g(176708525791811192L, var1);
   }

   public void k(Address var1) {
      long var3 = 176708525791811192L;
      Ref.s(176708525791811192L, var1, var3);
   }

   public Lv4_2 f() {
      Object var1 = 413998988881633946L;
      return (Lv4_2)Ref.g(413998988881633946L, var1);
   }

   public void I(Lv4_2 var1) {
      long var3 = 413998988881633946L;
      Ref.s(413998988881633946L, var1, var3);
   }

   public void s() {
      long var2 = 277333437534738353L;
      Object var1 = null;
      Ref.s(277333437534738353L, var1, var2);
      long var4 = 413998988881633946L;
      Object var3 = null;
      Ref.s(413998988881633946L, var3, var4);
      long var6 = 473156217884412983L;
      Object var5 = null;
      Ref.s(473156217884412983L, var5, var6);
      long var8 = 598356069828463222L;
      Object var7 = null;
      Ref.s(598356069828463222L, var7, var8);
      long var10 = 353497257519915637L;
      Object var9 = null;
      Ref.s(353497257519915637L, var9, var10);
      long var12 = 176708525791811192L;
      Object var11 = null;
      Ref.s(176708525791811192L, var11, var12);
      long var14 = 367769791574410028L;
      Object var13 = null;
      Ref.s(367769791574410028L, var13, var14);
      long var16 = 170983454032355616L;
      Object var15 = null;
      Ref.s(170983454032355616L, var15, var16);
   }

   public void Y() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Ui4(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static void c(boolean var0) {
      O = var0;
   }

   public static boolean d$boolean() {
      return O;
   }

   public static boolean X() {
      boolean var0 = d$boolean();
      return !var0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 10448) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 200;
               break;
            case 1:
               var10000 = 73;
               break;
            case 2:
               var10000 = 5;
               break;
            case 3:
               var10000 = 164;
               break;
            case 4:
               var10000 = 86;
               break;
            case 5:
               var10000 = 202;
               break;
            case 6:
               var10000 = 92;
               break;
            case 7:
               var10000 = 221;
               break;
            case 8:
               var10000 = 151;
               break;
            case 9:
               var10000 = 236;
               break;
            case 10:
               var10000 = 225;
               break;
            case 11:
               var10000 = 97;
               break;
            case 12:
               var10000 = 57;
               break;
            case 13:
               var10000 = 53;
               break;
            case 14:
               var10000 = 217;
               break;
            case 15:
               var10000 = 71;
               break;
            case 16:
               var10000 = 6;
               break;
            case 17:
               var10000 = 233;
               break;
            case 18:
               var10000 = 61;
               break;
            case 19:
               var10000 = 31;
               break;
            case 20:
               var10000 = 123;
               break;
            case 21:
               var10000 = 147;
               break;
            case 22:
               var10000 = 174;
               break;
            case 23:
               var10000 = 149;
               break;
            case 24:
               var10000 = 199;
               break;
            case 25:
               var10000 = 242;
               break;
            case 26:
               var10000 = 168;
               break;
            case 27:
               var10000 = 251;
               break;
            case 28:
               var10000 = 196;
               break;
            case 29:
               var10000 = 130;
               break;
            case 30:
               var10000 = 218;
               break;
            case 31:
               var10000 = 46;
               break;
            case 32:
               var10000 = 232;
               break;
            case 33:
               var10000 = 185;
               break;
            case 34:
               var10000 = 214;
               break;
            case 35:
               var10000 = 146;
               break;
            case 36:
               var10000 = 29;
               break;
            case 37:
               var10000 = 98;
               break;
            case 38:
               var10000 = 16;
               break;
            case 39:
               var10000 = 106;
               break;
            case 40:
               var10000 = 197;
               break;
            case 41:
               var10000 = 40;
               break;
            case 42:
               var10000 = 13;
               break;
            case 43:
               var10000 = 58;
               break;
            case 44:
               var10000 = 150;
               break;
            case 45:
               var10000 = 240;
               break;
            case 46:
               var10000 = 152;
               break;
            case 47:
               var10000 = 210;
               break;
            case 48:
               var10000 = 169;
               break;
            case 49:
               var10000 = 7;
               break;
            case 50:
               var10000 = 115;
               break;
            case 51:
               var10000 = 247;
               break;
            case 52:
               var10000 = 56;
               break;
            case 53:
               var10000 = 230;
               break;
            case 54:
               var10000 = 55;
               break;
            case 55:
               var10000 = 250;
               break;
            case 56:
               var10000 = 48;
               break;
            case 57:
               var10000 = 167;
               break;
            case 58:
               var10000 = 132;
               break;
            case 59:
               var10000 = 183;
               break;
            case 60:
               var10000 = 189;
               break;
            case 61:
               var10000 = 228;
               break;
            case 62:
               var10000 = 59;
               break;
            case 63:
               var10000 = 79;
               break;
            case 64:
               var10000 = 9;
               break;
            case 65:
               var10000 = 51;
               break;
            case 66:
               var10000 = 105;
               break;
            case 67:
               var10000 = 63;
               break;
            case 68:
               var10000 = 76;
               break;
            case 69:
               var10000 = 81;
               break;
            case 70:
               var10000 = 111;
               break;
            case 71:
               var10000 = 180;
               break;
            case 72:
               var10000 = 128;
               break;
            case 73:
               var10000 = 107;
               break;
            case 74:
               var10000 = 24;
               break;
            case 75:
               var10000 = 32;
               break;
            case 76:
               var10000 = 25;
               break;
            case 77:
               var10000 = 237;
               break;
            case 78:
               var10000 = 65;
               break;
            case 79:
               var10000 = 177;
               break;
            case 80:
               var10000 = 170;
               break;
            case 81:
               var10000 = 103;
               break;
            case 82:
               var10000 = 95;
               break;
            case 83:
               var10000 = 37;
               break;
            case 84:
               var10000 = 141;
               break;
            case 85:
               var10000 = 134;
               break;
            case 86:
               var10000 = 129;
               break;
            case 87:
               var10000 = 155;
               break;
            case 88:
               var10000 = 2;
               break;
            case 89:
               var10000 = 229;
               break;
            case 90:
               var10000 = 226;
               break;
            case 91:
               var10000 = 171;
               break;
            case 92:
               var10000 = 23;
               break;
            case 93:
               var10000 = 89;
               break;
            case 94:
               var10000 = 125;
               break;
            case 95:
               var10000 = 162;
               break;
            case 96:
               var10000 = 45;
               break;
            case 97:
               var10000 = 121;
               break;
            case 98:
               var10000 = 122;
               break;
            case 99:
               var10000 = 231;
               break;
            case 100:
               var10000 = 104;
               break;
            case 101:
               var10000 = 176;
               break;
            case 102:
               var10000 = 41;
               break;
            case 103:
               var10000 = 235;
               break;
            case 104:
               var10000 = 143;
               break;
            case 105:
               var10000 = 38;
               break;
            case 106:
               var10000 = 26;
               break;
            case 107:
               var10000 = 239;
               break;
            case 108:
               var10000 = 4;
               break;
            case 109:
               var10000 = 154;
               break;
            case 110:
               var10000 = 64;
               break;
            case 111:
               var10000 = 77;
               break;
            case 112:
               var10000 = 110;
               break;
            case 113:
               var10000 = 22;
               break;
            case 114:
               var10000 = 68;
               break;
            case 115:
               var10000 = 15;
               break;
            case 116:
               var10000 = 11;
               break;
            case 117:
               var10000 = 172;
               break;
            case 118:
               var10000 = 216;
               break;
            case 119:
               var10000 = 234;
               break;
            case 120:
               var10000 = 3;
               break;
            case 121:
               var10000 = 160;
               break;
            case 122:
               var10000 = 139;
               break;
            case 123:
               var10000 = 204;
               break;
            case 124:
               var10000 = 33;
               break;
            case 125:
               var10000 = 206;
               break;
            case 126:
               var10000 = 246;
               break;
            case 127:
               var10000 = 39;
               break;
            case 128:
               var10000 = 44;
               break;
            case 129:
               var10000 = 18;
               break;
            case 130:
               var10000 = 186;
               break;
            case 131:
               var10000 = 109;
               break;
            case 132:
               var10000 = 49;
               break;
            case 133:
               var10000 = 178;
               break;
            case 134:
               var10000 = 60;
               break;
            case 135:
               var10000 = 78;
               break;
            case 136:
               var10000 = 173;
               break;
            case 137:
               var10000 = 208;
               break;
            case 138:
               var10000 = 119;
               break;
            case 139:
               var10000 = 88;
               break;
            case 140:
               var10000 = 253;
               break;
            case 141:
               var10000 = 34;
               break;
            case 142:
               var10000 = 156;
               break;
            case 143:
               var10000 = 187;
               break;
            case 144:
               var10000 = 195;
               break;
            case 145:
               var10000 = 101;
               break;
            case 146:
               var10000 = 190;
               break;
            case 147:
               var10000 = 108;
               break;
            case 148:
               var10000 = 94;
               break;
            case 149:
               var10000 = 66;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 84;
               break;
            case 152:
               var10000 = 96;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 201;
               break;
            case 155:
               var10000 = 127;
               break;
            case 156:
               var10000 = 249;
               break;
            case 157:
               var10000 = 254;
               break;
            case 158:
               var10000 = 194;
               break;
            case 159:
               var10000 = 42;
               break;
            case 160:
               var10000 = 136;
               break;
            case 161:
               var10000 = 179;
               break;
            case 162:
               var10000 = 27;
               break;
            case 163:
               var10000 = 219;
               break;
            case 164:
               var10000 = 243;
               break;
            case 165:
               var10000 = 47;
               break;
            case 166:
               var10000 = 213;
               break;
            case 167:
               var10000 = 166;
               break;
            case 168:
               var10000 = 83;
               break;
            case 169:
               var10000 = 138;
               break;
            case 170:
               var10000 = 223;
               break;
            case 171:
               var10000 = 245;
               break;
            case 172:
               var10000 = 135;
               break;
            case 173:
               var10000 = 21;
               break;
            case 174:
               var10000 = 93;
               break;
            case 175:
               var10000 = 17;
               break;
            case 176:
               var10000 = 99;
               break;
            case 177:
               var10000 = 112;
               break;
            case 178:
               var10000 = 212;
               break;
            case 179:
               var10000 = 203;
               break;
            case 180:
               var10000 = 248;
               break;
            case 181:
               var10000 = 0;
               break;
            case 182:
               var10000 = 120;
               break;
            case 183:
               var10000 = 191;
               break;
            case 184:
               var10000 = 113;
               break;
            case 185:
               var10000 = 52;
               break;
            case 186:
               var10000 = 20;
               break;
            case 187:
               var10000 = 91;
               break;
            case 188:
               var10000 = 54;
               break;
            case 189:
               var10000 = 148;
               break;
            case 190:
               var10000 = 153;
               break;
            case 191:
               var10000 = 182;
               break;
            case 192:
               var10000 = 8;
               break;
            case 193:
               var10000 = 159;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 181;
               break;
            case 196:
               var10000 = 82;
               break;
            case 197:
               var10000 = 87;
               break;
            case 198:
               var10000 = 193;
               break;
            case 199:
               var10000 = 133;
               break;
            case 200:
               var10000 = 62;
               break;
            case 201:
               var10000 = 227;
               break;
            case 202:
               var10000 = 75;
               break;
            case 203:
               var10000 = 102;
               break;
            case 204:
               var10000 = 209;
               break;
            case 205:
               var10000 = 90;
               break;
            case 206:
               var10000 = 131;
               break;
            case 207:
               var10000 = 140;
               break;
            case 208:
               var10000 = 85;
               break;
            case 209:
               var10000 = 224;
               break;
            case 210:
               var10000 = 215;
               break;
            case 211:
               var10000 = 124;
               break;
            case 212:
               var10000 = 30;
               break;
            case 213:
               var10000 = 244;
               break;
            case 214:
               var10000 = 163;
               break;
            case 215:
               var10000 = 36;
               break;
            case 216:
               var10000 = 12;
               break;
            case 217:
               var10000 = 116;
               break;
            case 218:
               var10000 = 69;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 192;
               break;
            case 221:
               var10000 = 43;
               break;
            case 222:
               var10000 = 188;
               break;
            case 223:
               var10000 = 198;
               break;
            case 224:
               var10000 = 118;
               break;
            case 225:
               var10000 = 175;
               break;
            case 226:
               var10000 = 67;
               break;
            case 227:
               var10000 = 100;
               break;
            case 228:
               var10000 = 158;
               break;
            case 229:
               var10000 = 205;
               break;
            case 230:
               var10000 = 35;
               break;
            case 231:
               var10000 = 142;
               break;
            case 232:
               var10000 = 144;
               break;
            case 233:
               var10000 = 50;
               break;
            case 234:
               var10000 = 1;
               break;
            case 235:
               var10000 = 161;
               break;
            case 236:
               var10000 = 184;
               break;
            case 237:
               var10000 = 222;
               break;
            case 238:
               var10000 = 238;
               break;
            case 239:
               var10000 = 255;
               break;
            case 240:
               var10000 = 74;
               break;
            case 241:
               var10000 = 126;
               break;
            case 242:
               var10000 = 145;
               break;
            case 243:
               var10000 = 70;
               break;
            case 244:
               var10000 = 14;
               break;
            case 245:
               var10000 = 211;
               break;
            case 246:
               var10000 = 137;
               break;
            case 247:
               var10000 = 207;
               break;
            case 248:
               var10000 = 19;
               break;
            case 249:
               var10000 = 220;
               break;
            case 250:
               var10000 = 80;
               break;
            case 251:
               var10000 = 252;
               break;
            case 252:
               var10000 = 114;
               break;
            case 253:
               var10000 = 165;
               break;
            case 254:
               var10000 = 157;
               break;
            default:
               var10000 = 10;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25804;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18395) & 32767;
      if (i[var3] == null) {
         i[var3] = h[var3] ^ var1;
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[13];
      int var19 = 0;
      c(false);
      String var18 = "剡隳攂乊I\u0004轱挅妗趶\u0005斐产崚宦垳\u0004\u0007\f\u0004y\u0002Ñ4\u0005匢獡斥乞½\u0004½\u001a\u0096u\u0006郼叙敱亹夔o\u0004ì?y\u001f\u0005輻授崝斏彻\u0002º¦";
      int var20 = "剡隳攂乊I\u0004轱挅妗趶\u0005斐产崚宦垳\u0004\u0007\f\u0004y\u0002Ñ4\u0005匢獡斥乞½\u0004½\u001a\u0096u\u0006郼叙敱亹夔o\u0004ì?y\u001f\u0005輻授崝斏彻\u0002º¦"
         .length();
      char var17 = 5;
      int var24 = -1;

      label71:
      while (true) {
         byte var10000 = 78;
         String var10001 = var18.substring(++var24, var24 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var40;
            label66: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var22 = 0;
               byte var47 = var10000;
               var40 = var44;
               int var30 = var10004;
               byte var54;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               } else {
                  var47 = var10000;
                  var30 = var10004;
                  if (var10004 <= var22) {
                     break label66;
                  }

                  var60 = var44;
                  var54 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var69 = var60[var10006];
                  byte var70;
                  switch (var22 % 7) {
                     case 0:
                        var70 = 51;
                        break;
                     case 1:
                        var70 = 71;
                        break;
                     case 2:
                        var70 = 108;
                        break;
                     case 3:
                        var70 = 77;
                        break;
                     case 4:
                        var70 = 126;
                        break;
                     case 5:
                        var70 = 84;
                        break;
                     default:
                        var70 = 18;
                  }

                  var60[var10006] = (char)(var69 ^ var54 ^ var70);
                  var22++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var60 = var40;
                     var54 = var47;
                  } else {
                     if (var30 <= var22) {
                        break;
                     }

                     var60 = var40;
                     var54 = var47;
                     var10006 = var22;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var49;
                  if ((var24 += var17) >= var20) {
                     c = var21;
                     d = new String[13];
                     long var8 = 8653507214677009136L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "\u000e\u0016\u009b\u0099oC\\Ðí\u0007\u001cÆ\u008f¹7\u0083\u0011Mæ|H\u009e\r[";
                     int var13 = "\u000e\u0016\u009b\u0099oC\\Ðí\u0007\u001cÆ\u008f¹7\u0083\u0011Mæ|H\u009e\r[".length();
                     byte var10 = 0;

                     do {
                        byte var32 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var32, var10).getBytes("ISO-8859-1");
                        int var33 = var11++;
                        long var58 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var50 = -1;
                        var14[var33] = var58;
                     } while (var10 < var13);

                     f = var14;
                     g = new Integer[3];
                     long var0 = 6884009437113566075L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "2jS_\u009a\u0094ø_GfB$äsÁ\u0015u{¡_àÂ\u0090x";
                     int var5 = "2jS_\u009a\u0094ø_GfB$äsÁ\u0015u{¡_àÂ\u0090x".length();
                     byte var2 = 0;

                     do {
                        byte var34 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        int var35 = var3++;
                        long var59 = (
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
                        byte var51 = -1;
                        var6[var35] = var59;
                     } while (var2 < var5);

                     h = var6;
                     i = new Long[3];
                     Registry.lookupField(383997995785705643L).setInt(null, a(2817, 3635003359502823375L));
                     Registry.lookupField(172266869270573121L).setInt(null, a(23177, 3071356186438221381L));
                     return;
                  }

                  var17 = var18.charAt(var24);
                  break;
               default:
                  var21[var19++] = var49;
                  if ((var24 += var17) < var20) {
                     var17 = var18.charAt(var24);
                     continue label71;
                  }

                  var18 = "选叇文串如V\u0005时丅嶞宺坫";
                  var20 = "选叇文串如V\u0005时丅嶞宺坫".length();
                  var17 = 6;
                  var24 = -1;
            }

            var10000 = 14;
            var10001 = var18.substring(++var24, var24 + var17);
            var10002 = 0;
         }
      }
   }
}





