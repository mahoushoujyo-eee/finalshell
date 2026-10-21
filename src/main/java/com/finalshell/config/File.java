package com.finalshell.config;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

public class File {
   String Q;
   HashMap h;
   public static String[] a;
   public static String[] b;

   File(String var1) {
      HashMap var10001 = new HashMap();
      long var3 = 304274842285362681L;
      HashMap var2 = var10001;
      Ref.s(304274842285362681L, var2, var3);
      long var5 = 188853339583617942L;
      Ref.s(188853339583617942L, var1, var5);
   }

   public void F() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: ldc2_w 188853339583617942
      // 07: astore 10
      // 09: ldc2_w 188853339583617942
      // 0c: aload 10
      // 0e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14: ldc2_w 531525474533222429
      // 17: astore 12
      // 19: ldc2_w 531525474533222429
      // 1c: aload 12
      // 1e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 21: checkcast java/lang/String
      // 24: goto 2b
      // 27: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: astore 2
      // 2c: astore 1
      // 2d: aload 2
      // 2e: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 31: astore 3
      // 32: aload 3
      // 33: sipush 29029
      // 36: sipush 12327
      // 39: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 3c: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 3f: astore 4
      // 41: aload 4
      // 43: ifnull e4
      // 46: bipush 0
      // 47: istore 5
      // 49: iload 5
      // 4b: aload 4
      // 4d: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 50: if_icmpge e4
      // 53: aload 4
      // 55: iload 5
      // 57: invokevirtual com/finalshell/ui/model/Oc2.get (I)Ljava/lang/Object;
      // 5a: checkcast com/finalshell/ui/model/O0
      // 5d: astore 6
      // 5f: aload 6
      // 61: sipush 29026
      // 64: sipush -2186
      // 67: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 6a: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 6d: astore 7
      // 6f: aload 6
      // 71: sipush 29025
      // 74: sipush -23896
      // 77: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 7a: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 7d: istore 8
      // 7f: new java/io/File
      // 82: dup
      // 83: new java/lang/StringBuilder
      // 86: dup
      // 87: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a: ldc2_w 478301022169899080
      // 8d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 90: aconst_null
      // 91: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 94: checkcast java/lang/String
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 7
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // a5: astore 9
      // a7: aload 1
      // a8: ifnull e0
      // ab: aload 9
      // ad: invokevirtual java/io/File.exists ()Z
      // b0: ifeq dd
      // b3: goto ba
      // b6: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b9: athrow
      // ba: aload 0
      // bb: ldc2_w 304274842285362681
      // be: astore 14
      // c0: ldc2_w 304274842285362681
      // c3: aload 14
      // c5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // c8: checkcast java/util/HashMap
      // cb: aload 7
      // cd: iload 8
      // cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d2: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // d5: pop
      // d6: goto dd
      // d9: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dc: athrow
      // dd: iinc 5 1
      // e0: aload 1
      // e1: ifnonnull 49
      // e4: return
   }

   public void e(String var1, int var2) {
      Object var3 = 304274842285362681L;
      ((HashMap)Ref.g(304274842285362681L, var3)).put(var1, var2);
   }

   public int Q(java.io.File var1) {
      YT3_2.c();
      int var3 = 0;
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 356145384774107640L;
      Object var10002 = Ref.h2(356145384774107640L, var5);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      String var4 = (String)var10002;
      Object[] var2 = var10001;
      Object var7 = 304274842285362681L;
      int var13 = (((HashMap)Ref.g(304274842285362681L, var7)).containsKey(var4)) ? 1 : 0;
      if (var2 != null) {
         if (var13 != 0) {
            Object var9 = 304274842285362681L;
            var3 = (Integer)((HashMap)Ref.g(304274842285362681L, var9)).get(var4);
         }

         var13 = var3;
      }

      return var13;
   }

   public void X() throws Exception {
      O0 var2 = new O0();
      Oc2 var3 = new Oc2();
      var2.C(a(29031, -17703), var3);
      YT3_2.c();
      Object var8 = 304274842285362681L;
      Iterator var4 = ((HashMap)Ref.g(304274842285362681L, var8)).keySet().iterator();
      File var1 = this;

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            Object var10 = 304274842285362681L;
            int var6 = (Integer)((HashMap)Ref.g(304274842285362681L, var10)).get(var5);
            O0 var7 = new O0();

            try {
               var7.C(a(29038, -1244), var5);
               var7.C(a(29030, 14544), var6);
               var3.add(var7);
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            } catch (Exception var17) {
               throw a(var17);
            }
         }

         var2.V().getBytes(a(29037, 299));
         Object var12 = 188853339583617942L;
         Object[] var10003 = Registry.packArgs(this, Ref.g(188853339583617942L, var12));
         long var15 = 500254107892663862L;
         Object[] var14 = var10003;
         Ref.h(500254107892663862L, var14, var15);

         try {
            break;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }
      }
   }

   void J(byte[] param1, String param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: new java/io/File
      // 06: dup
      // 07: aload 2
      // 08: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0b: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0e: astore 4
      // 10: astore 3
      // 11: aload 4
      // 13: aload 3
      // 14: ifnull 23
      // 17: ifnull 41
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 4
      // 23: invokevirtual java/io/File.exists ()Z
      // 26: aload 3
      // 27: ifnull 40
      // 2a: ifne 41
      // 2d: goto 34
      // 30: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 4
      // 36: invokevirtual java/io/File.mkdirs ()Z
      // 39: goto 40
      // 3c: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: pop
      // 41: aconst_null
      // 42: astore 5
      // 44: sipush 29036
      // 47: sipush -16727
      // 4a: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 4d: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 50: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 53: astore 6
      // 55: new java/io/FileOutputStream
      // 58: dup
      // 59: aload 2
      // 5a: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 5d: astore 5
      // 5f: aload 5
      // 61: aload 1
      // 62: invokevirtual java/io/FileOutputStream.write ([B)V
      // 65: aload 5
      // 67: aload 3
      // 68: ifnull 70
      // 6b: ifnull cb
      // 6e: aload 5
      // 70: invokevirtual java/io/FileOutputStream.close ()V
      // 73: goto cb
      // 76: astore 7
      // 78: aload 6
      // 7a: sipush 29027
      // 7d: sipush 16121
      // 80: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 83: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 86: ifeq ae
      // 89: aconst_null
      // 8a: new java/lang/StringBuilder
      // 8d: dup
      // 8e: invokespecial java/lang/StringBuilder.<init> ()V
      // 91: sipush 29024
      // 94: sipush 15443
      // 97: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 9a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9d: aload 2
      // 9e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a4: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // a7: goto ae
      // aa: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad: athrow
      // ae: aload 7
      // b0: athrow
      // b1: astore 8
      // b3: aload 5
      // b5: aload 3
      // b6: ifnull c5
      // b9: ifnull c8
      // bc: goto c3
      // bf: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: aload 5
      // c5: invokevirtual java/io/FileOutputStream.close ()V
      // c8: aload 8
      // ca: athrow
      // cb: return
   }

   public static String h(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 2
      // 05: aconst_null
      // 06: astore 3
      // 07: aconst_null
      // 08: astore 4
      // 0a: astore 1
      // 0b: new java/io/File
      // 0e: dup
      // 0f: aload 0
      // 10: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 13: astore 5
      // 15: aload 5
      // 17: invokevirtual java/io/File.length ()J
      // 1a: l2i
      // 1b: istore 6
      // 1d: iload 6
      // 1f: newarray 8
      // 21: astore 7
      // 23: new java/io/FileInputStream
      // 26: dup
      // 27: aload 5
      // 29: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 2c: astore 3
      // 2d: new java/io/DataInputStream
      // 30: dup
      // 31: aload 3
      // 32: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 35: astore 4
      // 37: aload 4
      // 39: aload 7
      // 3b: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 3e: new java/lang/String
      // 41: dup
      // 42: aload 7
      // 44: sipush 29028
      // 47: sipush -27275
      // 4a: invokestatic com/finalshell/config/File.a (II)Ljava/lang/String;
      // 4d: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 50: astore 2
      // 51: aload 3
      // 52: aload 1
      // 53: ifnull 61
      // 56: ifnull 6e
      // 59: goto 60
      // 5c: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 3
      // 61: invokevirtual java/io/FileInputStream.close ()V
      // 64: goto 6e
      // 67: astore 5
      // 69: aload 5
      // 6b: invokevirtual java/io/IOException.printStackTrace ()V
      // 6e: aload 4
      // 70: aload 1
      // 71: ifnull 80
      // 74: ifnull d6
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: aload 4
      // 80: invokevirtual java/io/DataInputStream.close ()V
      // 83: goto d6
      // 86: astore 5
      // 88: aload 5
      // 8a: invokevirtual java/io/IOException.printStackTrace ()V
      // 8d: goto d6
      // 90: astore 5
      // 92: aload 5
      // 94: athrow
      // 95: astore 8
      // 97: aload 3
      // 98: aload 1
      // 99: ifnull a7
      // 9c: ifnull b4
      // 9f: goto a6
      // a2: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5: athrow
      // a6: aload 3
      // a7: invokevirtual java/io/FileInputStream.close ()V
      // aa: goto b4
      // ad: astore 9
      // af: aload 9
      // b1: invokevirtual java/io/IOException.printStackTrace ()V
      // b4: aload 4
      // b6: aload 1
      // b7: ifnull c6
      // ba: ifnull d3
      // bd: goto c4
      // c0: invokestatic com/finalshell/config/File.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3: athrow
      // c4: aload 4
      // c6: invokevirtual java/io/DataInputStream.close ()V
      // c9: goto d3
      // cc: astore 9
      // ce: aload 9
      // d0: invokevirtual java/io/IOException.printStackTrace ()V
      // d3: aload 8
      // d5: athrow
      // d6: aload 2
      // d7: areturn
   }

   public String j() {
      Object var1 = 188853339583617942L;
      return (String)Ref.g(188853339583617942L, var1);
   }

   public void U(String var1) {
      long var3 = 188853339583617942L;
      Ref.s(188853339583617942L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 29028) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 219;
               break;
            case 1:
               var10000 = 75;
               break;
            case 2:
               var10000 = 59;
               break;
            case 3:
               var10000 = 211;
               break;
            case 4:
               var10000 = 62;
               break;
            case 5:
               var10000 = 255;
               break;
            case 6:
               var10000 = 169;
               break;
            case 7:
               var10000 = 141;
               break;
            case 8:
               var10000 = 121;
               break;
            case 9:
               var10000 = 192;
               break;
            case 10:
               var10000 = 116;
               break;
            case 11:
               var10000 = 109;
               break;
            case 12:
               var10000 = 250;
               break;
            case 13:
               var10000 = 118;
               break;
            case 14:
               var10000 = 128;
               break;
            case 15:
               var10000 = 216;
               break;
            case 16:
               var10000 = 80;
               break;
            case 17:
               var10000 = 175;
               break;
            case 18:
               var10000 = 51;
               break;
            case 19:
               var10000 = 13;
               break;
            case 20:
               var10000 = 98;
               break;
            case 21:
               var10000 = 245;
               break;
            case 22:
               var10000 = 130;
               break;
            case 23:
               var10000 = 252;
               break;
            case 24:
               var10000 = 249;
               break;
            case 25:
               var10000 = 63;
               break;
            case 26:
               var10000 = 137;
               break;
            case 27:
               var10000 = 28;
               break;
            case 28:
               var10000 = 123;
               break;
            case 29:
               var10000 = 248;
               break;
            case 30:
               var10000 = 1;
               break;
            case 31:
               var10000 = 38;
               break;
            case 32:
               var10000 = 23;
               break;
            case 33:
               var10000 = 187;
               break;
            case 34:
               var10000 = 126;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 94;
               break;
            case 37:
               var10000 = 177;
               break;
            case 38:
               var10000 = 138;
               break;
            case 39:
               var10000 = 96;
               break;
            case 40:
               var10000 = 158;
               break;
            case 41:
               var10000 = 207;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 150;
               break;
            case 44:
               var10000 = 170;
               break;
            case 45:
               var10000 = 54;
               break;
            case 46:
               var10000 = 108;
               break;
            case 47:
               var10000 = 222;
               break;
            case 48:
               var10000 = 30;
               break;
            case 49:
               var10000 = 20;
               break;
            case 50:
               var10000 = 184;
               break;
            case 51:
               var10000 = 176;
               break;
            case 52:
               var10000 = 26;
               break;
            case 53:
               var10000 = 180;
               break;
            case 54:
               var10000 = 56;
               break;
            case 55:
               var10000 = 42;
               break;
            case 56:
               var10000 = 220;
               break;
            case 57:
               var10000 = 95;
               break;
            case 58:
               var10000 = 64;
               break;
            case 59:
               var10000 = 178;
               break;
            case 60:
               var10000 = 201;
               break;
            case 61:
               var10000 = 100;
               break;
            case 62:
               var10000 = 3;
               break;
            case 63:
               var10000 = 79;
               break;
            case 64:
               var10000 = 45;
               break;
            case 65:
               var10000 = 15;
               break;
            case 66:
               var10000 = 49;
               break;
            case 67:
               var10000 = 35;
               break;
            case 68:
               var10000 = 124;
               break;
            case 69:
               var10000 = 47;
               break;
            case 70:
               var10000 = 58;
               break;
            case 71:
               var10000 = 227;
               break;
            case 72:
               var10000 = 11;
               break;
            case 73:
               var10000 = 188;
               break;
            case 74:
               var10000 = 236;
               break;
            case 75:
               var10000 = 203;
               break;
            case 76:
               var10000 = 119;
               break;
            case 77:
               var10000 = 92;
               break;
            case 78:
               var10000 = 48;
               break;
            case 79:
               var10000 = 120;
               break;
            case 80:
               var10000 = 107;
               break;
            case 81:
               var10000 = 147;
               break;
            case 82:
               var10000 = 8;
               break;
            case 83:
               var10000 = 239;
               break;
            case 84:
               var10000 = 189;
               break;
            case 85:
               var10000 = 73;
               break;
            case 86:
               var10000 = 93;
               break;
            case 87:
               var10000 = 165;
               break;
            case 88:
               var10000 = 162;
               break;
            case 89:
               var10000 = 233;
               break;
            case 90:
               var10000 = 67;
               break;
            case 91:
               var10000 = 99;
               break;
            case 92:
               var10000 = 71;
               break;
            case 93:
               var10000 = 78;
               break;
            case 94:
               var10000 = 139;
               break;
            case 95:
               var10000 = 83;
               break;
            case 96:
               var10000 = 208;
               break;
            case 97:
               var10000 = 9;
               break;
            case 98:
               var10000 = 142;
               break;
            case 99:
               var10000 = 12;
               break;
            case 100:
               var10000 = 234;
               break;
            case 101:
               var10000 = 88;
               break;
            case 102:
               var10000 = 200;
               break;
            case 103:
               var10000 = 37;
               break;
            case 104:
               var10000 = 117;
               break;
            case 105:
               var10000 = 68;
               break;
            case 106:
               var10000 = 18;
               break;
            case 107:
               var10000 = 6;
               break;
            case 108:
               var10000 = 174;
               break;
            case 109:
               var10000 = 247;
               break;
            case 110:
               var10000 = 103;
               break;
            case 111:
               var10000 = 91;
               break;
            case 112:
               var10000 = 39;
               break;
            case 113:
               var10000 = 87;
               break;
            case 114:
               var10000 = 210;
               break;
            case 115:
               var10000 = 70;
               break;
            case 116:
               var10000 = 161;
               break;
            case 117:
               var10000 = 205;
               break;
            case 118:
               var10000 = 74;
               break;
            case 119:
               var10000 = 153;
               break;
            case 120:
               var10000 = 33;
               break;
            case 121:
               var10000 = 85;
               break;
            case 122:
               var10000 = 212;
               break;
            case 123:
               var10000 = 167;
               break;
            case 124:
               var10000 = 31;
               break;
            case 125:
               var10000 = 206;
               break;
            case 126:
               var10000 = 110;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 90;
               break;
            case 129:
               var10000 = 21;
               break;
            case 130:
               var10000 = 135;
               break;
            case 131:
               var10000 = 157;
               break;
            case 132:
               var10000 = 160;
               break;
            case 133:
               var10000 = 22;
               break;
            case 134:
               var10000 = 2;
               break;
            case 135:
               var10000 = 181;
               break;
            case 136:
               var10000 = 168;
               break;
            case 137:
               var10000 = 190;
               break;
            case 138:
               var10000 = 53;
               break;
            case 139:
               var10000 = 27;
               break;
            case 140:
               var10000 = 179;
               break;
            case 141:
               var10000 = 154;
               break;
            case 142:
               var10000 = 86;
               break;
            case 143:
               var10000 = 155;
               break;
            case 144:
               var10000 = 97;
               break;
            case 145:
               var10000 = 132;
               break;
            case 146:
               var10000 = 163;
               break;
            case 147:
               var10000 = 0;
               break;
            case 148:
               var10000 = 221;
               break;
            case 149:
               var10000 = 213;
               break;
            case 150:
               var10000 = 106;
               break;
            case 151:
               var10000 = 10;
               break;
            case 152:
               var10000 = 46;
               break;
            case 153:
               var10000 = 185;
               break;
            case 154:
               var10000 = 131;
               break;
            case 155:
               var10000 = 241;
               break;
            case 156:
               var10000 = 243;
               break;
            case 157:
               var10000 = 19;
               break;
            case 158:
               var10000 = 197;
               break;
            case 159:
               var10000 = 246;
               break;
            case 160:
               var10000 = 112;
               break;
            case 161:
               var10000 = 40;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 76;
               break;
            case 164:
               var10000 = 4;
               break;
            case 165:
               var10000 = 125;
               break;
            case 166:
               var10000 = 230;
               break;
            case 167:
               var10000 = 164;
               break;
            case 168:
               var10000 = 114;
               break;
            case 169:
               var10000 = 134;
               break;
            case 170:
               var10000 = 224;
               break;
            case 171:
               var10000 = 186;
               break;
            case 172:
               var10000 = 102;
               break;
            case 173:
               var10000 = 215;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 60;
               break;
            case 176:
               var10000 = 115;
               break;
            case 177:
               var10000 = 171;
               break;
            case 178:
               var10000 = 149;
               break;
            case 179:
               var10000 = 5;
               break;
            case 180:
               var10000 = 235;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 199;
               break;
            case 183:
               var10000 = 148;
               break;
            case 184:
               var10000 = 7;
               break;
            case 185:
               var10000 = 225;
               break;
            case 186:
               var10000 = 251;
               break;
            case 187:
               var10000 = 202;
               break;
            case 188:
               var10000 = 152;
               break;
            case 189:
               var10000 = 24;
               break;
            case 190:
               var10000 = 136;
               break;
            case 191:
               var10000 = 198;
               break;
            case 192:
               var10000 = 84;
               break;
            case 193:
               var10000 = 50;
               break;
            case 194:
               var10000 = 25;
               break;
            case 195:
               var10000 = 223;
               break;
            case 196:
               var10000 = 113;
               break;
            case 197:
               var10000 = 77;
               break;
            case 198:
               var10000 = 159;
               break;
            case 199:
               var10000 = 34;
               break;
            case 200:
               var10000 = 191;
               break;
            case 201:
               var10000 = 17;
               break;
            case 202:
               var10000 = 253;
               break;
            case 203:
               var10000 = 166;
               break;
            case 204:
               var10000 = 229;
               break;
            case 205:
               var10000 = 196;
               break;
            case 206:
               var10000 = 101;
               break;
            case 207:
               var10000 = 231;
               break;
            case 208:
               var10000 = 217;
               break;
            case 209:
               var10000 = 55;
               break;
            case 210:
               var10000 = 52;
               break;
            case 211:
               var10000 = 214;
               break;
            case 212:
               var10000 = 89;
               break;
            case 213:
               var10000 = 226;
               break;
            case 214:
               var10000 = 43;
               break;
            case 215:
               var10000 = 32;
               break;
            case 216:
               var10000 = 240;
               break;
            case 217:
               var10000 = 218;
               break;
            case 218:
               var10000 = 29;
               break;
            case 219:
               var10000 = 195;
               break;
            case 220:
               var10000 = 140;
               break;
            case 221:
               var10000 = 129;
               break;
            case 222:
               var10000 = 57;
               break;
            case 223:
               var10000 = 81;
               break;
            case 224:
               var10000 = 41;
               break;
            case 225:
               var10000 = 82;
               break;
            case 226:
               var10000 = 69;
               break;
            case 227:
               var10000 = 237;
               break;
            case 228:
               var10000 = 182;
               break;
            case 229:
               var10000 = 143;
               break;
            case 230:
               var10000 = 104;
               break;
            case 231:
               var10000 = 145;
               break;
            case 232:
               var10000 = 44;
               break;
            case 233:
               var10000 = 238;
               break;
            case 234:
               var10000 = 14;
               break;
            case 235:
               var10000 = 66;
               break;
            case 236:
               var10000 = 144;
               break;
            case 237:
               var10000 = 72;
               break;
            case 238:
               var10000 = 193;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 209;
               break;
            case 241:
               var10000 = 36;
               break;
            case 242:
               var10000 = 122;
               break;
            case 243:
               var10000 = 65;
               break;
            case 244:
               var10000 = 111;
               break;
            case 245:
               var10000 = 151;
               break;
            case 246:
               var10000 = 194;
               break;
            case 247:
               var10000 = 244;
               break;
            case 248:
               var10000 = 105;
               break;
            case 249:
               var10000 = 183;
               break;
            case 250:
               var10000 = 146;
               break;
            case 251:
               var10000 = 254;
               break;
            case 252:
               var10000 = 133;
               break;
            case 253:
               var10000 = 204;
               break;
            case 254:
               var10000 = 242;
               break;
            default:
               var10000 = 16;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "Q\u0003)(\u0091\t\u0011vZpÓA¼\u0001\u00ad\u0005\u0084\u0002È\u0086¥\tä¹ä\u0089\u0004~Fæò\u0014信対醩罽数丐奓趴[譞亸筅璢呾躂乫迠裼Ñ\u0090\u0005<XßÍG\u00042Ñò\u0080\u0007áÉu\u0086D¥b\u0007:¾U;\u0006Có";
      int var4 = "Q\u0003)(\u0091\t\u0011vZpÓA¼\u0001\u00ad\u0005\u0084\u0002È\u0086¥\tä¹ä\u0089\u0004~Fæò\u0014信対醩罽数丐奓趴[譞亸筅璢呾躂乫迠裼Ñ\u0090\u0005<XßÍG\u00042Ñò\u0080\u0007áÉu\u0086D¥b\u0007:¾U;\u0006Có"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 65;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 127;
                        break;
                     case 1:
                        var46 = 12;
                        break;
                     case 2:
                        var46 = 56;
                        break;
                     case 3:
                        var46 = 119;
                        break;
                     case 4:
                        var46 = 72;
                        break;
                     case 5:
                        var46 = 109;
                        break;
                     default:
                        var46 = 123;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[11];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Z\u0002£ã+\u0004õná\u009c";
                  var4 = "Z\u0002£ã+\u0004õná\u009c".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





