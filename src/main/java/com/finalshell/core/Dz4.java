package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.swing.plaf.UIResource;

public class Dz4 implements Transferable, UIResource {
   public String y;
   public String Y;
   public static DataFlavor[] p;
   public static DataFlavor[] B;
   public static DataFlavor[] d;

   public Dz4(String var1, String var2) {
      long var4 = 259584263947102711L;
      Ref.s(259584263947102711L, var1, var4);
      long var6 = 267752808280314255L;
      Ref.s(267752808280314255L, var2, var6);
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      Object[] var10;
      int var22;
      com.finalshell.ui.panel.AA.z();
      Object var10002 = Registry.emptyArgs();
      long var11 = 391034260468315379L;
      var10 = var10002;
      var10002 = Ref.h(391034260468315379L, var10, var11);

      try {
         var10002 = (DataFlavor[])var10002;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      DataFlavor[] var2;
      label104: {
         var2 = (DataFlavor[])(var10002);
         DataFlavor[] var10001 = var2;
         if (this == null) {
            if (var2 == null) {
               var22 = 0;
               break label104;
            }

            var10001 = var2;
         }

         var22 = var10001.length;
      }

      int var3 = var22;
      var10002 = Registry.emptyArgs();
      long var13 = 279607164078141109L;
      Object var12 = var10002;
      var10002 = Ref.h(279607164078141109L, var12, var13);

      try {
         var27 = (Boolean)var10002;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      if (this == null) {
         var27 = var27 != 0 ? ((DataFlavor[])Registry.lookupField(371162706378214403L).get(null)).length : 0;
      }

      int var4 = var27;
      Object var10003 = Registry.emptyArgs();
      long var15 = 352033277708314820L;
      Object var14 = var10003;
      var10003 = Ref.h(352033277708314820L, var14, var15);

      try {
         var29 = (Boolean)var10003;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      if (this == null) {
         var29 = var29 != 0 ? ((DataFlavor[])Registry.lookupField(507666187908136268L).get(null)).length : 0;
      }

      int var5 = var29;
      Object var10004 = Registry.emptyArgs();
      long var17 = 352033277708314820L;
      Object var16 = var10004;
      var10004 = Ref.h(352033277708314820L, var16, var17);

      try {
         var31 = (Boolean)var10004;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      if (this == null) {
         var31 = var31 != 0 ? ((DataFlavor[])Registry.lookupField(551288916370793759L).get(null)).length : 0;
      }

      int var6 = var31;
      int var7 = var3 + var4 + var5 + var6;
      DataFlavor[] var8 = new DataFlavor[var7];
      int var9 = 0;
      int var32 = var3;
      if (this == null) {
         if (var3 > 0) {
            System.arraycopy(var2, 0, var8, var9, var3);
            var9 += var3;
         }

         var32 = var4;
      }

      if (this == null) {
         if (var32 > 0) {
            System.arraycopy((DataFlavor[])Registry.lookupField(371162706378214403L).get(null), 0, var8, var9, var4);
            var9 += var4;
         }

         var32 = var5;
      }

      if (this == null) {
         if (var32 > 0) {
            System.arraycopy((DataFlavor[])Registry.lookupField(507666187908136268L).get(null), 0, var8, var9, var5);
            var9 += var5;
         }

         var32 = var6;
      }

      if (this == null && var32 > 0) {
         System.arraycopy((DataFlavor[])Registry.lookupField(551288916370793759L).get(null), 0, var8, var9, var6);
         int var33 = var9 + var6;
      }

      return var8;
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      Object[] var5;
      com.finalshell.ui.panel.AA.z();
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 341170898807886266L;
      var5 = var10002;
      var10002 = Ref.h(341170898807886266L, var5, var6);

      try {
         var10002 = (DataFlavor[])var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      DataFlavor[] var3 = var10002;
      Dz4 var2 = this;
      int var4 = 0;

      boolean var10001;
      while (true) {
         if (var4 < var3.length) {
            var10001 = var3[var4].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var10001;
            }

            if (var10001) {
               return true;
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var10001 = false;
         break;
      }

      return var10001;
   }

   @Override
   public Object getTransferData(DataFlavor param1) throws UnsupportedFlavorException, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 391034260468315379
      // 00a: astore 6
      // 00c: astore 5
      // 00e: ldc2_w 391034260468315379
      // 011: aload 5
      // 013: aload 6
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: checkcast [Ljava/awt/datatransfer/DataFlavor;
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 3
      // 023: astore 2
      // 024: aload 0
      // 025: aload 1
      // 026: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 029: ldc2_w 280381941802925388
      // 02c: astore 8
      // 02e: astore 7
      // 030: ldc2_w 280381941802925388
      // 033: aload 7
      // 035: aload 8
      // 037: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03a: checkcast java/lang/Boolean
      // 03d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 040: goto 047
      // 043: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 2
      // 048: ifnonnull 09d
      // 04b: ifeq 07a
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 054: athrow
      // 055: aload 0
      // 056: aload 1
      // 057: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05a: ldc2_w 422399409620005495
      // 05d: astore 10
      // 05f: astore 9
      // 061: ldc2_w 422399409620005495
      // 064: aload 9
      // 066: aload 10
      // 068: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06b: checkcast java/lang/Object
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: areturn
      // 076: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 1
      // 07c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07f: ldc2_w 368137195686887320
      // 082: astore 12
      // 084: astore 11
      // 086: ldc2_w 368137195686887320
      // 089: aload 11
      // 08b: aload 12
      // 08d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 090: checkcast java/lang/Boolean
      // 093: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 096: goto 09d
      // 099: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 2
      // 09e: ifnonnull 170
      // 0a1: ifeq 146
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0af: ldc2_w 139217337829105825
      // 0b2: astore 14
      // 0b4: astore 13
      // 0b6: ldc2_w 139217337829105825
      // 0b9: aload 13
      // 0bb: aload 14
      // 0bd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c0: checkcast java/lang/String
      // 0c3: goto 0ca
      // 0c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: astore 4
      // 0cc: aload 4
      // 0ce: aload 2
      // 0cf: ifnonnull 0de
      // 0d2: ifnonnull 0e1
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0db: athrow
      // 0dc: ldc ""
      // 0de: goto 0e3
      // 0e1: aload 4
      // 0e3: astore 4
      // 0e5: ldc java/lang/String
      // 0e7: aload 1
      // 0e8: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 0eb: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0ee: aload 2
      // 0ef: ifnonnull 10c
      // 0f2: ifeq 103
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0fb: athrow
      // 0fc: aload 4
      // 0fe: areturn
      // 0ff: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 102: athrow
      // 103: ldc java/io/Reader
      // 105: aload 1
      // 106: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 109: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 10c: aload 2
      // 10d: ifnonnull 131
      // 110: ifeq 128
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 119: athrow
      // 11a: new java/io/StringReader
      // 11d: dup
      // 11e: aload 4
      // 120: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 123: areturn
      // 124: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 127: athrow
      // 128: ldc java/io/InputStream
      // 12a: aload 1
      // 12b: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 12e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 131: ifeq 142
      // 134: new java/io/StringBufferInputStream
      // 137: dup
      // 138: aload 4
      // 13a: invokespecial java/io/StringBufferInputStream.<init> (Ljava/lang/String;)V
      // 13d: areturn
      // 13e: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 141: athrow
      // 142: aload 2
      // 143: ifnull 28e
      // 146: aload 0
      // 147: aload 1
      // 148: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14b: ldc2_w 208711108930071249
      // 14e: astore 16
      // 150: astore 15
      // 152: ldc2_w 208711108930071249
      // 155: aload 15
      // 157: aload 16
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: checkcast java/lang/Boolean
      // 15f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 16f: athrow
      // 170: aload 2
      // 171: ifnonnull 24e
      // 174: ifeq 219
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 17d: athrow
      // 17e: aload 0
      // 17f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 182: ldc2_w 379229271643411724
      // 185: astore 18
      // 187: astore 17
      // 189: ldc2_w 379229271643411724
      // 18c: aload 17
      // 18e: aload 18
      // 190: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 193: checkcast java/lang/String
      // 196: goto 19d
      // 199: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: astore 4
      // 19f: aload 4
      // 1a1: aload 2
      // 1a2: ifnonnull 1b1
      // 1a5: ifnonnull 1b4
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1ae: athrow
      // 1af: ldc ""
      // 1b1: goto 1b6
      // 1b4: aload 4
      // 1b6: astore 4
      // 1b8: ldc java/lang/String
      // 1ba: aload 1
      // 1bb: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 1be: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1c1: aload 2
      // 1c2: ifnonnull 1df
      // 1c5: ifeq 1d6
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1ce: athrow
      // 1cf: aload 4
      // 1d1: areturn
      // 1d2: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1d5: athrow
      // 1d6: ldc java/io/Reader
      // 1d8: aload 1
      // 1d9: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 1dc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1df: aload 2
      // 1e0: ifnonnull 204
      // 1e3: ifeq 1fb
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1ec: athrow
      // 1ed: new java/io/StringReader
      // 1f0: dup
      // 1f1: aload 4
      // 1f3: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 1f6: areturn
      // 1f7: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1fa: athrow
      // 1fb: ldc java/io/InputStream
      // 1fd: aload 1
      // 1fe: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 201: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 204: ifeq 215
      // 207: new java/io/StringBufferInputStream
      // 20a: dup
      // 20b: aload 4
      // 20d: invokespecial java/io/StringBufferInputStream.<init> (Ljava/lang/String;)V
      // 210: areturn
      // 211: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 214: athrow
      // 215: aload 2
      // 216: ifnull 28e
      // 219: aload 0
      // 21a: aload 2
      // 21b: ifnonnull 252
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 224: athrow
      // 225: aload 1
      // 226: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 229: ldc2_w 522266153142723246
      // 22c: astore 20
      // 22e: astore 19
      // 230: ldc2_w 522266153142723246
      // 233: aload 19
      // 235: aload 20
      // 237: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23a: checkcast java/lang/Boolean
      // 23d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 240: goto 247
      // 243: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 246: athrow
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 24d: athrow
      // 24e: ifeq 28e
      // 251: aload 0
      // 252: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 255: ldc2_w 379229271643411724
      // 258: astore 22
      // 25a: astore 21
      // 25c: ldc2_w 379229271643411724
      // 25f: aload 21
      // 261: aload 22
      // 263: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 266: checkcast java/lang/String
      // 269: goto 270
      // 26c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26f: athrow
      // 270: astore 4
      // 272: aload 4
      // 274: aload 2
      // 275: ifnonnull 284
      // 278: ifnonnull 287
      // 27b: goto 282
      // 27e: invokestatic com/finalshell/core/Dz4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 281: athrow
      // 282: ldc ""
      // 284: goto 289
      // 287: aload 4
      // 289: astore 4
      // 28b: aload 4
      // 28d: areturn
      // 28e: new java/awt/datatransfer/UnsupportedFlavorException
      // 291: dup
      // 292: aload 1
      // 293: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 296: athrow
   }

   public boolean N(DataFlavor var1) {
      boolean var10;
      int var5;
      com.finalshell.ui.panel.AA.z();
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 391034260468315379L;
      Object[] var6 = var10002;
      var10002 = Ref.h(391034260468315379L, var6, var7);

      try {
         var10002 = (DataFlavor[])var10002;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Dz4 var2;
      DataFlavor[] var3;
      int var9;
      label47: {
         var3 = (DataFlavor[])(var10002);
         var2 = this;
         DataFlavor[] var10001 = var3;
         if (this == null) {
            if (var3 == null) {
               var9 = 0;
               break label47;
            }

            var10001 = var3;
         }

         var9 = var10001.length;
      }

      int var4 = var9;
      var5 = 0;

      while (true) {
         if (var5 < var4) {
            var10 = var3[var5].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var10;
            }

            if (var10) {
               return true;
            }

            var5++;
            if (var2 == null) {
               continue;
            }
         }

         var10 = false;
         break;
      }

      return var10;
   }

   public DataFlavor[] M() {
      return null;
   }

   public Object T$Object(DataFlavor var1) throws UnsupportedFlavorException {
      return null;
   }

   public boolean T$boolean(DataFlavor var1) {
      boolean var5;
      DataFlavor[] var3 = (DataFlavor[])Registry.lookupField(371162706378214403L).get(null);
      String var10000 = com.finalshell.ui.panel.AA.z();
      int var4 = 0;
      String var2 = var10000;

      while (true) {
         if (var4 < var3.length) {
            var5 = var3[var4].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public boolean F() {
      Object var1 = 267752808280314255L;
      return (String)Ref.g(267752808280314255L, var1) != null;
   }

   public String y() {
      Object var1 = 267752808280314255L;
      return (String)Ref.g(267752808280314255L, var1);
   }

   public boolean i(DataFlavor var1) {
      boolean var5;
      DataFlavor[] var3 = (DataFlavor[])Registry.lookupField(507666187908136268L).get(null);
      String var10000 = com.finalshell.ui.panel.AA.z();
      int var4 = 0;
      String var2 = var10000;

      while (true) {
         if (var4 < var3.length) {
            var5 = var3[var4].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public boolean P() {
      Object var1 = 259584263947102711L;
      return (String)Ref.g(259584263947102711L, var1) != null;
   }

   public String Z() {
      Object var1 = 259584263947102711L;
      return (String)Ref.g(259584263947102711L, var1);
   }

   public boolean t(DataFlavor var1) {
      boolean var5;
      String var10000 = com.finalshell.ui.panel.AA.z();
      DataFlavor[] var3 = (DataFlavor[])Registry.lookupField(551288916370793759L).get(null);
      int var4 = 0;
      String var2 = var10000;

      while (true) {
         if (var4 < var3.length) {
            var5 = var3[var4].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   static {
      __vfClinit__();
   }

   public static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var22;
      byte var29;
      String var31;
      boolean var5;
      String[] var0 = new String[7];
      int var4 = 0;
      String var3 = "|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA";
      var5 = (boolean)("|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA");
         // [VF] .length();
      char var2 = 31;
      int var10 = -1;

      label60:
      while (true) {
         byte var10000 = 122;
         String var10001 = var3.substring(++var10, var10 + var2);
         byte var10002 = -1;

         while (true) {
            label55: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label55;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var47 = var38[var10006];
                  byte var48;
                  switch (var6 % 7) {
                     case 0:
                        var48 = 114;
                        break;
                     case 1:
                        var48 = 86;
                        break;
                     case 2:
                        var48 = 111;
                        break;
                     case 3:
                        var48 = 104;
                        break;
                     case 4:
                        var48 = 59;
                        break;
                     case 5:
                        var48 = 101;
                        break;
                     default:
                        var48 = 113;
                  }

                  var38[var10006] = (char)(var47 ^ var34 ^ var48);
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  if ((var10 += var2) >= var5) {
                     try {
                        Registry.lookupField(371162706378214403L).set(null, new DataFlavor[3]);
                        ((DataFlavor[])Registry.lookupField(371162706378214403L).get(null))[0] = new DataFlavor(var0[1]);
                        ((DataFlavor[])Registry.lookupField(371162706378214403L).get(null))[1] = new DataFlavor(var0[3]);
                        ((DataFlavor[])Registry.lookupField(371162706378214403L).get(null))[2] = new DataFlavor(var0[4]);
                        Registry.lookupField(507666187908136268L).set(null, new DataFlavor[3]);
                        ((DataFlavor[])Registry.lookupField(507666187908136268L).get(null))[0] = new DataFlavor(var0[6]);
                        ((DataFlavor[])Registry.lookupField(507666187908136268L).get(null))[1] = new DataFlavor(var0[0]);
                        ((DataFlavor[])Registry.lookupField(507666187908136268L).get(null))[2] = new DataFlavor(var0[5]);
                        Registry.lookupField(551288916370793759L).set(null, new DataFlavor[2]);
                        ((DataFlavor[])Registry.lookupField(551288916370793759L).get(null))[0] = new DataFlavor(var0[2]);
                        ((DataFlavor[])Registry.lookupField(551288916370793759L).get(null))[1] = DataFlavor.stringFlavor;
                     } catch (ClassNotFoundException var8) {
                     }

                     return;
                  }

                  var2 = var3.charAt(var10);
                  break;
               default:
                  var0[var4++] = var31;
                  if ((var10 += var2) < var5) {
                     var2 = var3.charAt(var10);
                     continue label60;
                  }

                  var3 = "~KodlmekGy+ uhx]rd~hgcMxt&&jfOdc~wh|O9y,3@d^bd\u0010i{oOz!~KodlmekGy+ qhy]*z\"kh$Bv~$3Z~\\~~$";
                  var5 = ("~KodlmekGy+ uhx]rd~hgcMxt&&jfOdc~wh|O9y,3@d^bd\u0010i{oOz!~KodlmekGy+ qhy]*z\"kh$Bv~$3Z~\\~~$".length()) != 0;
                  var2 = '4';
                  var10 = -1;
            }

            var10000 = 120;
            var10001 = var3.substring(++var10, var10 + var2);
            var10002 = 0;
         }
      }
   }
   private static Object var27;
}





