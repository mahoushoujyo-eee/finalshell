import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.plaf.UIResource;

class dz_4 implements Transferable, UIResource {
   protected String y;
   protected String Y;
   private static DataFlavor[] p;
   private static DataFlavor[] B;
   private static DataFlavor[] d;

   public dz_4(String var1, String var2) {
      com.c.c(259584263947102711L).set(this, var1);
      com.c.c(267752808280314255L).set(this, var2);
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      String var10000 = aA.z();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(391034260468315379L);
      Object[] var10003 = var10002;
      dz_4 var31 = this;
      Method var10001 = var10004;

      try {
         var24 = (DataFlavor[])var10001.invoke(var31, var10003);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var1;
      DataFlavor[] var2;
      label104: {
         var2 = var24;
         var1 = var10000;
         DataFlavor[] var14 = var2;
         if (var1 == null) {
            if (var2 == null) {
               var15 = 0;
               break label104;
            }

            var14 = var2;
         }

         var15 = var14.length;
      }

      int var3 = var15;
      Object[] var25 = com.c.f();
      Method var35 = com.c.d(279607164078141109L);
      var10002 = var25;
      dz_4 var26 = this;
      Method var16 = var35;

      try {
         var17 = (Boolean)var16.invoke(var26, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (var1 == null) {
         var17 = var17 != 0 ? ((DataFlavor[])com.c.c(371162706378214403L).get(null)).length : 0;
      }

      int var4 = var17;
      Object[] var27 = com.c.f();
      Method var36 = com.c.d(352033277708314820L);
      var10002 = var27;
      dz_4 var28 = this;
      Method var18 = var36;

      try {
         var19 = (Boolean)var18.invoke(var28, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      if (var1 == null) {
         var19 = var19 != 0 ? ((DataFlavor[])com.c.c(507666187908136268L).get(null)).length : 0;
      }

      int var5 = var19;
      Object[] var29 = com.c.f();
      Method var37 = com.c.d(352033277708314820L);
      var10002 = var29;
      dz_4 var30 = this;
      Method var20 = var37;

      try {
         var21 = (Boolean)var20.invoke(var30, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      if (var1 == null) {
         var21 = var21 != 0 ? ((DataFlavor[])com.c.c(551288916370793759L).get(null)).length : 0;
      }

      int var6 = var21;
      int var7 = var3 + var4 + var5 + var6;
      DataFlavor[] var8 = new DataFlavor[var7];
      int var9 = 0;
      int var22 = var3;
      if (var1 == null) {
         if (var3 > 0) {
            System.arraycopy(var2, 0, var8, var9, var3);
            var9 += var3;
         }

         var22 = var4;
      }

      if (var1 == null) {
         if (var22 > 0) {
            System.arraycopy((DataFlavor[])com.c.c(371162706378214403L).get(null), 0, var8, var9, var4);
            var9 += var4;
         }

         var22 = var5;
      }

      if (var1 == null) {
         if (var22 > 0) {
            System.arraycopy((DataFlavor[])com.c.c(507666187908136268L).get(null), 0, var8, var9, var5);
            var9 += var5;
         }

         var22 = var6;
      }

      if (var1 == null && var22 > 0) {
         System.arraycopy((DataFlavor[])com.c.c(551288916370793759L).get(null), 0, var8, var9, var6);
         int var23 = var9 + var6;
      }

      return var8;
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      String var10000 = aA.z();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(341170898807886266L);
      Object[] var10003 = var10002;
      dz_4 var8 = this;
      Method var10001 = var10004;

      try {
         var7 = (DataFlavor[])var10001.invoke(var8, var10003);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      DataFlavor[] var3 = var7;
      String var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3.length) {
            var6 = var3[var4].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var6;
            }

            if (var6) {
               return true;
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
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
      // 000: invokestatic aA.z ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokestatic com/c.f ()[Ljava/lang/Object;
      // 007: ldc2_w 391034260468315379
      // 00a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00d: dup_x2
      // 00e: pop
      // 00f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast [Ljava/awt/datatransfer/DataFlavor;
      // 015: goto 01c
      // 018: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: astore 3
      // 01d: astore 2
      // 01e: aload 0
      // 01f: aload 1
      // 020: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 023: ldc2_w 280381941802925388
      // 026: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 029: dup_x2
      // 02a: pop
      // 02b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: goto 03b
      // 037: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 2
      // 03c: ifnonnull 085
      // 03f: ifeq 068
      // 042: goto 049
      // 045: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 048: athrow
      // 049: aload 0
      // 04a: aload 1
      // 04b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04e: ldc2_w 422399409620005495
      // 051: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 054: dup_x2
      // 055: pop
      // 056: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 059: checkcast java/lang/Object
      // 05c: goto 063
      // 05f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 062: athrow
      // 063: areturn
      // 064: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 067: athrow
      // 068: aload 0
      // 069: aload 1
      // 06a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 06d: ldc2_w 368137195686887320
      // 070: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 073: dup_x2
      // 074: pop
      // 075: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 078: checkcast java/lang/Boolean
      // 07b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07e: goto 085
      // 081: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 2
      // 086: ifnonnull 14c
      // 089: ifeq 128
      // 08c: goto 093
      // 08f: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 092: athrow
      // 093: aload 0
      // 094: invokestatic com/c.f ()[Ljava/lang/Object;
      // 097: ldc2_w 139217337829105825
      // 09a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0a2: checkcast java/lang/String
      // 0a5: goto 0ac
      // 0a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: astore 4
      // 0ae: aload 4
      // 0b0: aload 2
      // 0b1: ifnonnull 0c0
      // 0b4: ifnonnull 0c3
      // 0b7: goto 0be
      // 0ba: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0bd: athrow
      // 0be: ldc ""
      // 0c0: goto 0c5
      // 0c3: aload 4
      // 0c5: astore 4
      // 0c7: ldc java/lang/String
      // 0c9: aload 1
      // 0ca: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 0cd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0d0: aload 2
      // 0d1: ifnonnull 0ee
      // 0d4: ifeq 0e5
      // 0d7: goto 0de
      // 0da: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: areturn
      // 0e1: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0e4: athrow
      // 0e5: ldc java/io/Reader
      // 0e7: aload 1
      // 0e8: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 0eb: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0ee: aload 2
      // 0ef: ifnonnull 113
      // 0f2: ifeq 10a
      // 0f5: goto 0fc
      // 0f8: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 0fb: athrow
      // 0fc: new java/io/StringReader
      // 0ff: dup
      // 100: aload 4
      // 102: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 105: areturn
      // 106: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 109: athrow
      // 10a: ldc java/io/InputStream
      // 10c: aload 1
      // 10d: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 110: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 113: ifeq 124
      // 116: new java/io/StringBufferInputStream
      // 119: dup
      // 11a: aload 4
      // 11c: invokespecial java/io/StringBufferInputStream.<init> (Ljava/lang/String;)V
      // 11f: areturn
      // 120: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 123: athrow
      // 124: aload 2
      // 125: ifnull 258
      // 128: aload 0
      // 129: aload 1
      // 12a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12d: ldc2_w 208711108930071249
      // 130: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 133: dup_x2
      // 134: pop
      // 135: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 138: checkcast java/lang/Boolean
      // 13b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 13e: goto 145
      // 141: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 144: athrow
      // 145: goto 14c
      // 148: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 14b: athrow
      // 14c: aload 2
      // 14d: ifnonnull 21e
      // 150: ifeq 1ef
      // 153: goto 15a
      // 156: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 159: athrow
      // 15a: aload 0
      // 15b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 15e: ldc2_w 379229271643411724
      // 161: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 164: dup_x2
      // 165: pop
      // 166: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 169: checkcast java/lang/String
      // 16c: goto 173
      // 16f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 172: athrow
      // 173: astore 4
      // 175: aload 4
      // 177: aload 2
      // 178: ifnonnull 187
      // 17b: ifnonnull 18a
      // 17e: goto 185
      // 181: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 184: athrow
      // 185: ldc ""
      // 187: goto 18c
      // 18a: aload 4
      // 18c: astore 4
      // 18e: ldc java/lang/String
      // 190: aload 1
      // 191: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 194: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 197: aload 2
      // 198: ifnonnull 1b5
      // 19b: ifeq 1ac
      // 19e: goto 1a5
      // 1a1: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1a4: athrow
      // 1a5: aload 4
      // 1a7: areturn
      // 1a8: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1ab: athrow
      // 1ac: ldc java/io/Reader
      // 1ae: aload 1
      // 1af: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 1b2: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1b5: aload 2
      // 1b6: ifnonnull 1da
      // 1b9: ifeq 1d1
      // 1bc: goto 1c3
      // 1bf: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1c2: athrow
      // 1c3: new java/io/StringReader
      // 1c6: dup
      // 1c7: aload 4
      // 1c9: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 1cc: areturn
      // 1cd: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1d0: athrow
      // 1d1: ldc java/io/InputStream
      // 1d3: aload 1
      // 1d4: invokevirtual java/awt/datatransfer/DataFlavor.getRepresentationClass ()Ljava/lang/Class;
      // 1d7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1da: ifeq 1eb
      // 1dd: new java/io/StringBufferInputStream
      // 1e0: dup
      // 1e1: aload 4
      // 1e3: invokespecial java/io/StringBufferInputStream.<init> (Ljava/lang/String;)V
      // 1e6: areturn
      // 1e7: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1ea: athrow
      // 1eb: aload 2
      // 1ec: ifnull 258
      // 1ef: aload 0
      // 1f0: aload 2
      // 1f1: ifnonnull 222
      // 1f4: goto 1fb
      // 1f7: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 1fa: athrow
      // 1fb: aload 1
      // 1fc: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ff: ldc2_w 522266153142723246
      // 202: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 205: dup_x2
      // 206: pop
      // 207: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 20a: checkcast java/lang/Boolean
      // 20d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 210: goto 217
      // 213: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 216: athrow
      // 217: goto 21e
      // 21a: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 21d: athrow
      // 21e: ifeq 258
      // 221: aload 0
      // 222: invokestatic com/c.f ()[Ljava/lang/Object;
      // 225: ldc2_w 379229271643411724
      // 228: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 230: checkcast java/lang/String
      // 233: goto 23a
      // 236: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 239: athrow
      // 23a: astore 4
      // 23c: aload 4
      // 23e: aload 2
      // 23f: ifnonnull 24e
      // 242: ifnonnull 251
      // 245: goto 24c
      // 248: invokestatic dz_4.a (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
      // 24b: athrow
      // 24c: ldc ""
      // 24e: goto 253
      // 251: aload 4
      // 253: astore 4
      // 255: aload 4
      // 257: areturn
      // 258: new java/awt/datatransfer/UnsupportedFlavorException
      // 25b: dup
      // 25c: aload 1
      // 25d: invokespecial java/awt/datatransfer/UnsupportedFlavorException.<init> (Ljava/awt/datatransfer/DataFlavor;)V
      // 260: athrow
   }

   protected boolean N(DataFlavor var1) {
      String var10000 = aA.z();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(391034260468315379L);
      Object[] var10003 = var10002;
      dz_4 var11 = this;
      Method var10001 = var10004;

      try {
         var10 = (DataFlavor[])var10001.invoke(var11, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String var2;
      DataFlavor[] var3;
      label47: {
         var3 = var10;
         var2 = var10000;
         DataFlavor[] var7 = var3;
         if (var2 == null) {
            if (var3 == null) {
               var8 = 0;
               break label47;
            }

            var7 = var3;
         }

         var8 = var7.length;
      }

      int var4 = var8;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            var9 = var3[var5].equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var9;
            }

            if (var9) {
               return true;
            }

            var5++;
            if (var2 == null) {
               continue;
            }
         }

         var9 = false;
         break;
      }

      return var9;
   }

   protected DataFlavor[] M() {
      return null;
   }

   protected Object T(DataFlavor var1) throws UnsupportedFlavorException {
      return null;
   }

   protected boolean T$boolean(DataFlavor var1) {
      DataFlavor[] var3 = (DataFlavor[])com.c.c(371162706378214403L).get(null);
      String var10000 = aA.z();
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

   protected boolean F() {
      return (String)com.c.c(267752808280314255L).get(this) != null;
   }

   protected String y() {
      return (String)com.c.c(267752808280314255L).get(this);
   }

   protected boolean i(DataFlavor var1) {
      DataFlavor[] var3 = (DataFlavor[])com.c.c(507666187908136268L).get(null);
      String var10000 = aA.z();
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

   protected boolean P() {
      return (String)com.c.c(259584263947102711L).get(this) != null;
   }

   protected String Z() {
      return (String)com.c.c(259584263947102711L).get(this);
   }

   protected boolean t(DataFlavor var1) {
      String var10000 = aA.z();
      DataFlavor[] var3 = (DataFlavor[])com.c.c(551288916370793759L).get(null);
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[7];
      int var4 = 0;
      String var3 = "|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA";
      int var5 = "|ImfnogiE{)\"sj{_(x ij&Ez<\u0013zjlIg |Imfnw\u007fe@.q-~x{\u0011\u007fs7~%dM{uoL\u007fzE{u=i\\e~(|j|Ez|ng&bMcslu}e\u0001y}\"~g%Cwx$|\u007fzIs)\"sj{_(x ij&@t|&1X|^||&\u001e|Imfnw\u007fe@.q-~x{\u0011\u007fs7~%aC;@$~om^3|Imfnw\u007fe@.q)~y{Ia/4qbkCqwz|gi_f/+~}i\u0002|}oVexYaA5mniA"
         .length();
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
               byte var29 = var10000;
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

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  if ((var10 += var2) >= var5) {
                     try {
                        com.c.c(371162706378214403L).set(null, new DataFlavor[3]);
                        ((DataFlavor[])com.c.c(371162706378214403L).get(null))[0] = new DataFlavor(var0[1]);
                        ((DataFlavor[])com.c.c(371162706378214403L).get(null))[1] = new DataFlavor(var0[3]);
                        ((DataFlavor[])com.c.c(371162706378214403L).get(null))[2] = new DataFlavor(var0[4]);
                        com.c.c(507666187908136268L).set(null, new DataFlavor[3]);
                        ((DataFlavor[])com.c.c(507666187908136268L).get(null))[0] = new DataFlavor(var0[6]);
                        ((DataFlavor[])com.c.c(507666187908136268L).get(null))[1] = new DataFlavor(var0[0]);
                        ((DataFlavor[])com.c.c(507666187908136268L).get(null))[2] = new DataFlavor(var0[5]);
                        com.c.c(551288916370793759L).set(null, new DataFlavor[2]);
                        ((DataFlavor[])com.c.c(551288916370793759L).get(null))[0] = new DataFlavor(var0[2]);
                        ((DataFlavor[])com.c.c(551288916370793759L).get(null))[1] = DataFlavor.stringFlavor;
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
                  var5 = "~KodlmekGy+ uhx]rd~hgcMxt&&jfOdc~wh|O9y,3@d^bd\u0010i{oOz!~KodlmekGy+ qhy]*z\"kh$Bv~$3Z~\\~~$".length();
                  var2 = '4';
                  var10 = -1;
            }

            var10000 = 120;
            var10001 = var3.substring(++var10, var10 + var2);
            var10002 = 0;
         }
      }
   }

   private static UnsupportedFlavorException a(UnsupportedFlavorException var0) {
      return var0;
   }
}





