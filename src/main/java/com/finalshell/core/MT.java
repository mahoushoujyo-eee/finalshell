package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.VI;
import com.finalshell.ui.listener.Dk_4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Connection4;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.AbstractCellEditor;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellEditor;

public class MT extends AbstractCellEditor implements TableCellEditor {
   public Object T;
   public Object w;
   public Connection4 Y;
   public Address s;
   public Ne4 L;
   public com.finalshell.ui.panel.Wb2 z;
   public JTable F;
   public static String a;

   public MT() {
      Ne4 var10001 = new Ne4();
      long var2 = 322039006491270402L;
      Ne4 var1 = var10001;
      Ref.s(322039006491270402L, var1, var2);
      com.finalshell.ui.panel.Wb2 var10002 = new com.finalshell.ui.panel.Wb2();
      long var4 = 481380019933828086L;
      com.finalshell.ui.panel.Wb2 var3 = var10002;
      Ref.s(481380019933828086L, var3, var4);
      Object var5 = 322039006491270402L;
      ((Ne4)Ref.g(322039006491270402L, var5)).F(0);
      Object var7 = 322039006491270402L;
      Ne4 var10004 = (Ne4)Ref.g(322039006491270402L, var7);
      Object var9 = 481380019933828086L;
      this.v((com.finalshell.ui.panel.Wb2)Ref.g(481380019933828086L, var9));
      Object var11 = 322039006491270402L;
      ((Ne4)Ref.g(322039006491270402L, var11)).addFocusListener(new Dk_4(this));
   }

   public void O() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 174250768797137272L;
      Object[] var1 = var10001;
      Ref.h(174250768797137272L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public Object getCellEditorValue() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Km2.U$String ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 322039006491270402
      // 008: astore 9
      // 00a: ldc2_w 322039006491270402
      // 00d: aload 9
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast com/finalshell/core/Ne4
      // 015: aload 1
      // 016: ifnonnull 04d
      // 019: invokevirtual com/finalshell/core/Ne4.isFocusOwner ()Z
      // 01c: ifne 03c
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 0
      // 027: ldc2_w 217476342349774680
      // 02a: astore 11
      // 02c: ldc2_w 217476342349774680
      // 02f: aload 11
      // 031: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 034: checkcast java/lang/Object
      // 037: areturn
      // 038: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 0
      // 03d: ldc2_w 322039006491270402
      // 040: astore 13
      // 042: ldc2_w 322039006491270402
      // 045: aload 13
      // 047: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04a: checkcast com/finalshell/core/Ne4
      // 04d: invokevirtual com/finalshell/core/Ne4.getText ()Ljava/lang/String;
      // 050: astore 2
      // 051: aload 2
      // 052: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 055: astore 2
      // 056: aload 2
      // 057: astore 3
      // 058: aload 0
      // 059: ldc2_w 217476342349774680
      // 05c: astore 15
      // 05e: ldc2_w 217476342349774680
      // 061: aload 15
      // 063: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 066: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 069: ldc com/finalshell/ui/model/Ck4
      // 06b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 06e: aload 1
      // 06f: ifnonnull 1cb
      // 072: ifeq 1a3
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: ldc2_w 217476342349774680
      // 080: astore 17
      // 082: ldc2_w 217476342349774680
      // 085: aload 17
      // 087: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08a: checkcast com/finalshell/ui/model/Ck4
      // 08d: astore 4
      // 08f: aload 4
      // 091: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 094: ldc2_w 605430732347023634
      // 097: astore 20
      // 099: astore 19
      // 09b: ldc2_w 605430732347023634
      // 09e: aload 19
      // 0a0: aload 20
      // 0a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a5: goto 0ac
      // 0a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 2
      // 0ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b0: ldc2_w 416107726621374295
      // 0b3: astore 21
      // 0b5: ldc2_w 416107726621374295
      // 0b8: aload 21
      // 0ba: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bd: checkcast java/lang/String
      // 0c0: goto 0c7
      // 0c3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: astore 5
      // 0c9: aload 4
      // 0cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ce: ldc2_w 605430732347023634
      // 0d1: astore 24
      // 0d3: astore 23
      // 0d5: ldc2_w 605430732347023634
      // 0d8: aload 23
      // 0da: aload 24
      // 0dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0df: checkcast java/lang/String
      // 0e2: goto 0e9
      // 0e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: astore 6
      // 0eb: aload 6
      // 0ed: aload 5
      // 0ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f2: aload 1
      // 0f3: ifnonnull 101
      // 0f6: ifne 19f
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: bipush 1
      // 101: istore 7
      // 103: aload 4
      // 105: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 108: ldc2_w 376601465768231673
      // 10b: astore 26
      // 10d: astore 25
      // 10f: ldc2_w 376601465768231673
      // 112: aload 25
      // 114: aload 26
      // 116: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 119: checkcast java/lang/Boolean
      // 11c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11f: goto 126
      // 122: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 125: athrow
      // 126: ifeq 165
      // 129: new java/io/File
      // 12c: dup
      // 12d: aload 4
      // 12f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 132: ldc2_w 605430732347023634
      // 135: astore 28
      // 137: astore 27
      // 139: ldc2_w 605430732347023634
      // 13c: aload 27
      // 13e: aload 28
      // 140: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 143: checkcast java/lang/String
      // 146: goto 14d
      // 149: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 150: astore 8
      // 152: aload 8
      // 154: new java/io/File
      // 157: dup
      // 158: aload 5
      // 15a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 15d: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 160: pop
      // 161: aload 1
      // 162: ifnull 19f
      // 165: ldc2_w 388376917454860932
      // 168: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 16b: aconst_null
      // 16c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 16f: new com/finalshell/task/TI3
      // 172: dup
      // 173: aload 0
      // 174: aload 6
      // 176: aload 5
      // 178: aload 3
      // 179: invokespecial com/finalshell/task/TI3.<init> (Lcom/finalshell/core/MT;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 17c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 17f: ldc2_w 434592463220957006
      // 182: astore 30
      // 184: astore 29
      // 186: ldc2_w 434592463220957006
      // 189: aload 29
      // 18b: aload 30
      // 18d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 190: pop
      // 191: goto 198
      // 194: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 197: athrow
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: aload 1
      // 1a0: ifnull 2fa
      // 1a3: aload 0
      // 1a4: ldc2_w 217476342349774680
      // 1a7: astore 31
      // 1a9: ldc2_w 217476342349774680
      // 1ac: aload 31
      // 1ae: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1b4: aload 1
      // 1b5: ifnonnull 30b
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: ldc com/finalshell/ui/model/Tf4
      // 1c1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: ifeq 2fa
      // 1ce: aload 0
      // 1cf: ldc2_w 217476342349774680
      // 1d2: astore 33
      // 1d4: ldc2_w 217476342349774680
      // 1d7: aload 33
      // 1d9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1dc: checkcast com/finalshell/ui/model/Tf4
      // 1df: astore 4
      // 1e1: aload 4
      // 1e3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e6: ldc2_w 498856411508641826
      // 1e9: astore 36
      // 1eb: astore 35
      // 1ed: ldc2_w 498856411508641826
      // 1f0: aload 35
      // 1f2: aload 36
      // 1f4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f7: goto 1fe
      // 1fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: aload 2
      // 1ff: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 202: ldc2_w 416107726621374295
      // 205: astore 37
      // 207: ldc2_w 416107726621374295
      // 20a: aload 37
      // 20c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 20f: checkcast java/lang/String
      // 212: goto 219
      // 215: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 218: athrow
      // 219: astore 5
      // 21b: aload 4
      // 21d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 220: ldc2_w 498856411508641826
      // 223: astore 40
      // 225: astore 39
      // 227: ldc2_w 498856411508641826
      // 22a: aload 39
      // 22c: aload 40
      // 22e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 231: checkcast java/lang/String
      // 234: goto 23b
      // 237: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: astore 6
      // 23d: aload 6
      // 23f: aload 1
      // 240: ifnonnull 30b
      // 243: aload 5
      // 245: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 248: ifne 2fa
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: aload 4
      // 254: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 257: ldc2_w 490764181082108623
      // 25a: astore 42
      // 25c: astore 41
      // 25e: ldc2_w 490764181082108623
      // 261: aload 41
      // 263: aload 42
      // 265: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 268: checkcast java/lang/Boolean
      // 26b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26e: goto 275
      // 271: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 274: athrow
      // 275: ifeq 2bb
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/MT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: new java/io/File
      // 282: dup
      // 283: aload 4
      // 285: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 288: ldc2_w 498856411508641826
      // 28b: astore 44
      // 28d: astore 43
      // 28f: ldc2_w 498856411508641826
      // 292: aload 43
      // 294: aload 44
      // 296: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 299: checkcast java/lang/String
      // 29c: goto 2a3
      // 29f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a2: athrow
      // 2a3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2a6: astore 7
      // 2a8: aload 7
      // 2aa: new java/io/File
      // 2ad: dup
      // 2ae: aload 5
      // 2b0: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2b3: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 2b6: pop
      // 2b7: aload 1
      // 2b8: ifnull 2fa
      // 2bb: ldc2_w 388376917454860932
      // 2be: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c1: aconst_null
      // 2c2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c5: new com/finalshell/task/FG
      // 2c8: dup
      // 2c9: aload 0
      // 2ca: aload 6
      // 2cc: aload 5
      // 2ce: aload 3
      // 2cf: aload 4
      // 2d1: invokespecial com/finalshell/task/FG.<init> (Lcom/finalshell/core/MT;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/ui/model/Tf4;)V
      // 2d4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d7: ldc2_w 434592463220957006
      // 2da: astore 46
      // 2dc: astore 45
      // 2de: ldc2_w 434592463220957006
      // 2e1: aload 45
      // 2e3: aload 46
      // 2e5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e8: pop
      // 2e9: goto 2f0
      // 2ec: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ef: athrow
      // 2f0: goto 2fa
      // 2f3: astore 7
      // 2f5: aload 7
      // 2f7: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2fa: aload 0
      // 2fb: ldc2_w 217476342349774680
      // 2fe: astore 47
      // 300: ldc2_w 217476342349774680
      // 303: aload 47
      // 305: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 308: checkcast java/lang/Object
      // 30b: areturn
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      String var7;
      Icon var8;
      label57: {
         Km2.U$String();
         long var13 = 217476342349774680L;
         Ref.s(217476342349774680L, var2, var13);
         var7 = a;
         var8 = null;
         Object var14 = 217476342349774680L;
         Object var10002 = Ref.g(217476342349774680L, var14).getClass();
         if (this == null) {
            if (!var10002.equals(com.finalshell.ui.model.Ck4.class)) {
               break label57;
            }

            var10002 = this;
            Object var16 = 217476342349774680L;
            Object var10003 = Ref.g(217476342349774680L, var16);
         }

         com.finalshell.ui.model.Ck4 var9 = (com.finalshell.ui.model.Ck4)var10002;
         String var46 = (String)(Registry.emptyArgs());
         long var19 = 396085629172753019L;
         Object[] var18 = var46;
         var46 = Ref.h(396085629172753019L, var18, var19);

         try {
            var46 = (String)var46;
         } catch (InvocationTargetException var43) {
            throw var43.getTargetException();
         }

         var7 = var46;
         Registry.packArgs(var9);
         long var20 = 420211340852268698L;
         Object var10004 = Ref.h2(420211340852268698L, var20);

         try {
            var10004 = (Icon)var10004;
         } catch (InvocationTargetException var42) {
            throw var42.getTargetException();
         }

         var8 = (Icon)var10004;
      }

      if (this == null) {
         Object var22 = 217476342349774680L;
         if (Ref.g(217476342349774680L, var22).getClass().equals(Tf4.class)) {
            Object var24 = 217476342349774680L;
            Tf4 var44 = (Tf4)Ref.g(217476342349774680L, var24);
            String var10007 = (String)(Registry.emptyArgs());
            long var27 = 179612178163941306L;
            Object[] var26 = var10007;
            var10007 = Ref.h(179612178163941306L, var26, var27);

            try {
               var10007 = (String)var10007;
            } catch (InvocationTargetException var41) {
               throw var41.getTargetException();
            }

            var7 = var10007;
            Registry.packArgs(var44);
            long var28 = 244109252701542571L;
            Object var10008 = Ref.h2(244109252701542571L, var28);

            try {
               var10008 = (Icon)var10008;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }

            var8 = (Icon)var10008;
         }
      }

      Object var30 = 322039006491270402L;
      Ne4 var45 = (Ne4)Ref.g(322039006491270402L, var30);
      Object var32 = 322039006491270402L;
      ((Ne4)Ref.g(322039006491270402L, var32)).setText(var7);
      BufferedImage var10 = new BufferedImage(var8.getIconWidth(), var8.getIconHeight(), 2);
      Graphics2D var11 = var10.createGraphics();
      var8.paintIcon(null, var11, 0, 0);
      var11.dispose();
      Object var34 = 481380019933828086L;
      ((com.finalshell.ui.panel.Wb2)Ref.g(481380019933828086L, var34)).H(var10);
      Object var36 = 322039006491270402L;
      ((Ne4)Ref.g(322039006491270402L, var36)).I(0, 3, 0, 0);
      Object var38 = 322039006491270402L;
      ((Ne4)Ref.g(322039006491270402L, var38)).d(1, 4, 0, 0);
      SwingUtilities.invokeLater(new com.finalshell.task.Cj4(this));
      return var45;
   }

   public Connection4 y$a3() {
      Object var1 = 400471378487267832L;
      return (Connection4)Ref.g(400471378487267832L, var1);
   }

   public void A(Connection4 var1) {
      long var3 = 400471378487267832L;
      Ref.s(400471378487267832L, var1, var3);
   }

   public Address u() {
      Object var1 = 219976392524080121L;
      return (Address)Ref.g(219976392524080121L, var1);
   }

   public void K(Address var1) {
      long var3 = 219976392524080121L;
      Ref.s(219976392524080121L, var1, var3);
   }

   public void g() {
      long var2 = 393770391187872066L;
      Object var1 = null;
      Ref.s(393770391187872066L, var1, var2);
      long var4 = 217476342349774680L;
      Object var3 = null;
      Ref.s(217476342349774680L, var3, var4);
      long var6 = 400471378487267832L;
      Object var5 = null;
      Ref.s(400471378487267832L, var5, var6);
      long var8 = 219976392524080121L;
      Object var7 = null;
      Ref.s(219976392524080121L, var7, var8);
      long var10 = 322039006491270402L;
      Object var9 = null;
      Ref.s(322039006491270402L, var9, var10);
      long var12 = 481380019933828086L;
      Object var11 = null;
      Ref.s(481380019933828086L, var11, var12);
      long var14 = 481936950311888439L;
      Object var13 = null;
      Ref.s(481936950311888439L, var13, var14);
   }

   public void y$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new VI(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "CV`".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 2;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      } else {
         var6 = 2;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 126;
               break;
            case 1:
               var23 = 107;
               break;
            case 2:
               var23 = 93;
               break;
            case 3:
               var23 = 53;
               break;
            case 4:
               var23 = 80;
               break;
            case 5:
               var23 = 86;
               break;
            default:
               var23 = 100;
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





