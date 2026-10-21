package com.finalshell.core;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.naming.NamingException;

public class OB3 {
   String k = null;
   boolean I = true;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public static void p(String[] var0) throws NamingException {
      OB3 var1 = new OB3();
      String var2 = var1.q();
   }

   public String q() {
      return a(1128, 11070);
   }

   public String T() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: aload 2
      // 09: sipush 1125
      // 0c: sipush 6733
      // 0f: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 12: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 15: pop
      // 16: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 19: aload 2
      // 1a: sipush 1134
      // 1d: sipush -29387
      // 20: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 23: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 26: pop
      // 27: invokestatic java/util/concurrent/Executors.newCachedThreadPool ()Ljava/util/concurrent/ExecutorService;
      // 2a: astore 3
      // 2b: astore 1
      // 2c: new java/util/Random
      // 2f: dup
      // 30: sipush 9995
      // 33: ldc2_w 2390898214508309344
      // 36: invokestatic com/finalshell/core/OB3.b (IJ)J
      // 39: invokespecial java/util/Random.<init> (J)V
      // 3c: astore 4
      // 3e: bipush 0
      // 3f: istore 5
      // 41: aload 1
      // 42: ifnonnull 85
      // 45: aload 4
      // 47: sipush 6278
      // 4a: ldc2_w 688494463938226611
      // 4d: invokestatic com/finalshell/core/OB3.a (IJ)I
      // 50: invokevirtual java/util/Random.nextInt (I)I
      // 53: istore 6
      // 55: new java/lang/StringBuilder
      // 58: dup
      // 59: sipush 1126
      // 5c: sipush -3578
      // 5f: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 62: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 65: iload 6
      // 67: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6a: sipush 1123
      // 6d: sipush -3228
      // 70: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: astore 7
      // 7b: aload 2
      // 7c: aload 7
      // 7e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 81: pop
      // 82: iinc 5 1
      // 85: iload 5
      // 87: sipush 31938
      // 8a: ldc2_w 4329103918180273654
      // 8d: invokestatic com/finalshell/core/OB3.a (IJ)I
      // 90: if_icmplt 45
      // 93: aload 2
      // 94: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 97: astore 6
      // 99: aload 1
      // 9a: ifnonnull c0
      // 9d: aload 6
      // 9f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a4: goto ab
      // a7: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa: athrow
      // ab: checkcast java/lang/String
      // ae: astore 5
      // b0: aload 3
      // b1: new com/finalshell/task/Dp4
      // b4: dup
      // b5: aload 0
      // b6: aload 5
      // b8: invokespecial com/finalshell/task/Dp4.<init> (Lcom/finalshell/core/OB3;Ljava/lang/String;)V
      // bb: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
      // c0: aload 6
      // c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // c7: ifne 9d
      // ca: new com/finalshell/task/JZ
      // cd: dup
      // ce: aload 0
      // cf: invokespecial com/finalshell/task/JZ.<init> (Lcom/finalshell/core/OB3;)V
      // d2: astore 5
      // d4: aload 5
      // d6: invokevirtual java/lang/Thread.start ()V
      // d9: aload 3
      // da: invokeinterface java/util/concurrent/ExecutorService.shutdownNow ()Ljava/util/List; 1
      // df: pop
      // e0: aload 5
      // e2: aload 1
      // e3: ifnull ab
      // e6: invokevirtual java/lang/Thread.join ()V
      // e9: goto f3
      // ec: astore 6
      // ee: aload 6
      // f0: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // f3: aload 0
      // f4: getfield com/finalshell/core/OB3.k Ljava/lang/String;
      // f7: areturn
   }

   static boolean S() {
      boolean var0 = false;

      try {
         InetAddress var1 = InetAddress.getByName(a(1124, 10050));
      } catch (UnknownHostException var2) {
         var2.printStackTrace();
      }

      return var0;
   }

   static String w() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 1
      // 005: astore 0
      // 006: sipush 1133
      // 009: sipush -4647
      // 00c: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 00f: astore 2
      // 010: bipush 0
      // 011: istore 3
      // 012: goto 08f
      // 015: aload 2
      // 016: invokestatic com/finalshell/core/OB3.X (Ljava/lang/String;)Ljava/lang/String;
      // 019: astore 4
      // 01b: aload 4
      // 01d: sipush 1130
      // 020: sipush -18550
      // 023: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 026: invokestatic com/finalshell/core/OB3.e (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 029: astore 5
      // 02b: aload 5
      // 02d: ifnull 038
      // 030: bipush 1
      // 031: goto 039
      // 034: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: bipush 0
      // 039: aload 5
      // 03b: ldc ""
      // 03d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 040: aload 0
      // 041: ifnull 04f
      // 044: ifeq 052
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: bipush 0
      // 04f: goto 053
      // 052: bipush 1
      // 053: iand
      // 054: ifeq 094
      // 057: aload 5
      // 059: astore 1
      // 05a: goto 094
      // 05d: astore 4
      // 05f: aload 4
      // 061: invokevirtual javax/naming/NameNotFoundException.printStackTrace ()V
      // 064: goto 094
      // 067: astore 4
      // 069: aload 4
      // 06b: invokevirtual javax/naming/NamingException.printStackTrace ()V
      // 06e: sipush 30367
      // 071: ldc2_w 9067086024916269814
      // 074: invokestatic com/finalshell/core/OB3.b (IJ)J
      // 077: invokestatic java/lang/Thread.sleep (J)V
      // 07a: goto 08c
      // 07d: astore 5
      // 07f: goto 08c
      // 082: astore 4
      // 084: goto 094
      // 087: astore 4
      // 089: goto 094
      // 08c: iinc 3 1
      // 08f: iload 3
      // 090: bipush 1
      // 091: if_icmplt 015
      // 094: sipush 1127
      // 097: sipush 6471
      // 09a: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 09d: astore 3
      // 09e: aload 1
      // 09f: aload 0
      // 0a0: ifnull 12f
      // 0a3: ifnonnull 12e
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: bipush 0
      // 0ae: istore 4
      // 0b0: aload 0
      // 0b1: ifnonnull 128
      // 0b4: aload 3
      // 0b5: invokestatic com/finalshell/core/OB3.X (Ljava/lang/String;)Ljava/lang/String;
      // 0b8: astore 5
      // 0ba: aload 5
      // 0bc: sipush 1120
      // 0bf: sipush -27249
      // 0c2: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 0c5: invokestatic com/finalshell/core/OB3.e (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0c8: astore 6
      // 0ca: aload 6
      // 0cc: ifnull 0d3
      // 0cf: bipush 1
      // 0d0: goto 0d4
      // 0d3: bipush 0
      // 0d4: aload 6
      // 0d6: ldc ""
      // 0d8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0db: aload 0
      // 0dc: ifnull 0ea
      // 0df: ifeq 0ed
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: bipush 0
      // 0ea: goto 0ee
      // 0ed: bipush 1
      // 0ee: iand
      // 0ef: ifeq 11e
      // 0f2: aload 6
      // 0f4: astore 1
      // 0f5: goto 11e
      // 0f8: astore 5
      // 0fa: goto 12e
      // 0fd: astore 5
      // 0ff: sipush 8421
      // 102: ldc2_w 196259477868850317
      // 105: invokestatic com/finalshell/core/OB3.b (IJ)J
      // 108: invokestatic java/lang/Thread.sleep (J)V
      // 10b: goto 11e
      // 10e: astore 6
      // 110: goto 11e
      // 113: astore 5
      // 115: goto 12e
      // 118: astore 5
      // 11a: aload 0
      // 11b: ifnonnull 12e
      // 11e: iinc 4 1
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: iload 4
      // 12a: bipush 1
      // 12b: if_icmplt 0b4
      // 12e: aload 1
      // 12f: areturn
   }

   public static String e(String var0, String var1) throws IOException, Exception {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (IOException var4) {
         throw a(var4);
      }

      byte[] var2 = Base64.getDecoder().decode(var0);
      byte[] var3 = l(var2, var1.getBytes());
      return new String(var3);
   }

   public static byte[] l(byte[] var0, byte[] var1) throws Exception {
      SecureRandom var2 = new SecureRandom();
      DESKeySpec var3 = new DESKeySpec(var1);
      SecretKeyFactory var4 = SecretKeyFactory.getInstance(a(1129, -26127));
      SecretKey var5 = var4.generateSecret(var3);
      Cipher var6 = Cipher.getInstance(a(1135, 22527));
      var6.init(2, var5, var2);
      return var6.doFinal(var0);
   }

   public static String X(String param0) throws NamingException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/Hashtable
      // 03: dup
      // 04: invokespecial java/util/Hashtable.<init> ()V
      // 07: astore 2
      // 08: aload 2
      // 09: sipush 1131
      // 0c: sipush -13099
      // 0f: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 12: sipush 1121
      // 15: sipush -16076
      // 18: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 1b: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1e: pop
      // 1f: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 22: new javax/naming/directory/InitialDirContext
      // 25: dup
      // 26: aload 2
      // 27: invokespecial javax/naming/directory/InitialDirContext.<init> (Ljava/util/Hashtable;)V
      // 2a: astore 3
      // 2b: aload 3
      // 2c: aload 0
      // 2d: bipush 1
      // 2e: anewarray 112
      // 31: dup
      // 32: bipush 0
      // 33: sipush 1132
      // 36: sipush -29840
      // 39: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 3c: aastore
      // 3d: invokeinterface javax/naming/directory/DirContext.getAttributes (Ljava/lang/String;[Ljava/lang/String;)Ljavax/naming/directory/Attributes; 3
      // 42: astore 4
      // 44: astore 1
      // 45: aload 4
      // 47: sipush 1122
      // 4a: sipush -378
      // 4d: invokestatic com/finalshell/core/OB3.a (II)Ljava/lang/String;
      // 50: invokeinterface javax/naming/directory/Attributes.get (Ljava/lang/String;)Ljavax/naming/directory/Attribute; 2
      // 55: astore 5
      // 57: ldc ""
      // 59: astore 6
      // 5b: aload 5
      // 5d: aload 1
      // 5e: ifnull 79
      // 61: ifnull 7e
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 5
      // 6d: invokeinterface javax/naming/directory/Attribute.get ()Ljava/lang/Object; 1
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/OB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 7c: astore 6
      // 7e: aload 6
      // 80: areturn
   }

   public void H(String var1) {
      this.k = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1128) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 56;
               break;
            case 1:
               var10000 = 242;
               break;
            case 2:
               var10000 = 85;
               break;
            case 3:
               var10000 = 47;
               break;
            case 4:
               var10000 = 104;
               break;
            case 5:
               var10000 = 188;
               break;
            case 6:
               var10000 = 25;
               break;
            case 7:
               var10000 = 59;
               break;
            case 8:
               var10000 = 166;
               break;
            case 9:
               var10000 = 120;
               break;
            case 10:
               var10000 = 112;
               break;
            case 11:
               var10000 = 211;
               break;
            case 12:
               var10000 = 240;
               break;
            case 13:
               var10000 = 145;
               break;
            case 14:
               var10000 = 121;
               break;
            case 15:
               var10000 = 160;
               break;
            case 16:
               var10000 = 176;
               break;
            case 17:
               var10000 = 219;
               break;
            case 18:
               var10000 = 27;
               break;
            case 19:
               var10000 = 88;
               break;
            case 20:
               var10000 = 138;
               break;
            case 21:
               var10000 = 90;
               break;
            case 22:
               var10000 = 163;
               break;
            case 23:
               var10000 = 185;
               break;
            case 24:
               var10000 = 201;
               break;
            case 25:
               var10000 = 48;
               break;
            case 26:
               var10000 = 30;
               break;
            case 27:
               var10000 = 68;
               break;
            case 28:
               var10000 = 152;
               break;
            case 29:
               var10000 = 128;
               break;
            case 30:
               var10000 = 19;
               break;
            case 31:
               var10000 = 189;
               break;
            case 32:
               var10000 = 49;
               break;
            case 33:
               var10000 = 218;
               break;
            case 34:
               var10000 = 97;
               break;
            case 35:
               var10000 = 102;
               break;
            case 36:
               var10000 = 200;
               break;
            case 37:
               var10000 = 33;
               break;
            case 38:
               var10000 = 65;
               break;
            case 39:
               var10000 = 187;
               break;
            case 40:
               var10000 = 34;
               break;
            case 41:
               var10000 = 143;
               break;
            case 42:
               var10000 = 20;
               break;
            case 43:
               var10000 = 248;
               break;
            case 44:
               var10000 = 192;
               break;
            case 45:
               var10000 = 82;
               break;
            case 46:
               var10000 = 100;
               break;
            case 47:
               var10000 = 139;
               break;
            case 48:
               var10000 = 224;
               break;
            case 49:
               var10000 = 93;
               break;
            case 50:
               var10000 = 215;
               break;
            case 51:
               var10000 = 155;
               break;
            case 52:
               var10000 = 150;
               break;
            case 53:
               var10000 = 246;
               break;
            case 54:
               var10000 = 3;
               break;
            case 55:
               var10000 = 117;
               break;
            case 56:
               var10000 = 233;
               break;
            case 57:
               var10000 = 130;
               break;
            case 58:
               var10000 = 179;
               break;
            case 59:
               var10000 = 61;
               break;
            case 60:
               var10000 = 9;
               break;
            case 61:
               var10000 = 214;
               break;
            case 62:
               var10000 = 254;
               break;
            case 63:
               var10000 = 244;
               break;
            case 64:
               var10000 = 136;
               break;
            case 65:
               var10000 = 73;
               break;
            case 66:
               var10000 = 8;
               break;
            case 67:
               var10000 = 157;
               break;
            case 68:
               var10000 = 2;
               break;
            case 69:
               var10000 = 255;
               break;
            case 70:
               var10000 = 84;
               break;
            case 71:
               var10000 = 133;
               break;
            case 72:
               var10000 = 147;
               break;
            case 73:
               var10000 = 238;
               break;
            case 74:
               var10000 = 230;
               break;
            case 75:
               var10000 = 158;
               break;
            case 76:
               var10000 = 21;
               break;
            case 77:
               var10000 = 223;
               break;
            case 78:
               var10000 = 182;
               break;
            case 79:
               var10000 = 149;
               break;
            case 80:
               var10000 = 205;
               break;
            case 81:
               var10000 = 132;
               break;
            case 82:
               var10000 = 39;
               break;
            case 83:
               var10000 = 79;
               break;
            case 84:
               var10000 = 202;
               break;
            case 85:
               var10000 = 135;
               break;
            case 86:
               var10000 = 77;
               break;
            case 87:
               var10000 = 98;
               break;
            case 88:
               var10000 = 184;
               break;
            case 89:
               var10000 = 235;
               break;
            case 90:
               var10000 = 118;
               break;
            case 91:
               var10000 = 170;
               break;
            case 92:
               var10000 = 137;
               break;
            case 93:
               var10000 = 116;
               break;
            case 94:
               var10000 = 156;
               break;
            case 95:
               var10000 = 131;
               break;
            case 96:
               var10000 = 109;
               break;
            case 97:
               var10000 = 26;
               break;
            case 98:
               var10000 = 226;
               break;
            case 99:
               var10000 = 199;
               break;
            case 100:
               var10000 = 106;
               break;
            case 101:
               var10000 = 225;
               break;
            case 102:
               var10000 = 207;
               break;
            case 103:
               var10000 = 0;
               break;
            case 104:
               var10000 = 86;
               break;
            case 105:
               var10000 = 247;
               break;
            case 106:
               var10000 = 14;
               break;
            case 107:
               var10000 = 114;
               break;
            case 108:
               var10000 = 53;
               break;
            case 109:
               var10000 = 134;
               break;
            case 110:
               var10000 = 10;
               break;
            case 111:
               var10000 = 141;
               break;
            case 112:
               var10000 = 37;
               break;
            case 113:
               var10000 = 36;
               break;
            case 114:
               var10000 = 24;
               break;
            case 115:
               var10000 = 167;
               break;
            case 116:
               var10000 = 23;
               break;
            case 117:
               var10000 = 69;
               break;
            case 118:
               var10000 = 173;
               break;
            case 119:
               var10000 = 177;
               break;
            case 120:
               var10000 = 195;
               break;
            case 121:
               var10000 = 148;
               break;
            case 122:
               var10000 = 57;
               break;
            case 123:
               var10000 = 70;
               break;
            case 124:
               var10000 = 110;
               break;
            case 125:
               var10000 = 210;
               break;
            case 126:
               var10000 = 31;
               break;
            case 127:
               var10000 = 146;
               break;
            case 128:
               var10000 = 101;
               break;
            case 129:
               var10000 = 165;
               break;
            case 130:
               var10000 = 58;
               break;
            case 131:
               var10000 = 4;
               break;
            case 132:
               var10000 = 51;
               break;
            case 133:
               var10000 = 161;
               break;
            case 134:
               var10000 = 213;
               break;
            case 135:
               var10000 = 204;
               break;
            case 136:
               var10000 = 216;
               break;
            case 137:
               var10000 = 103;
               break;
            case 138:
               var10000 = 41;
               break;
            case 139:
               var10000 = 208;
               break;
            case 140:
               var10000 = 151;
               break;
            case 141:
               var10000 = 196;
               break;
            case 142:
               var10000 = 162;
               break;
            case 143:
               var10000 = 54;
               break;
            case 144:
               var10000 = 231;
               break;
            case 145:
               var10000 = 221;
               break;
            case 146:
               var10000 = 171;
               break;
            case 147:
               var10000 = 124;
               break;
            case 148:
               var10000 = 44;
               break;
            case 149:
               var10000 = 62;
               break;
            case 150:
               var10000 = 249;
               break;
            case 151:
               var10000 = 60;
               break;
            case 152:
               var10000 = 174;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 154;
               break;
            case 155:
               var10000 = 123;
               break;
            case 156:
               var10000 = 99;
               break;
            case 157:
               var10000 = 250;
               break;
            case 158:
               var10000 = 72;
               break;
            case 159:
               var10000 = 66;
               break;
            case 160:
               var10000 = 168;
               break;
            case 161:
               var10000 = 92;
               break;
            case 162:
               var10000 = 81;
               break;
            case 163:
               var10000 = 243;
               break;
            case 164:
               var10000 = 212;
               break;
            case 165:
               var10000 = 220;
               break;
            case 166:
               var10000 = 142;
               break;
            case 167:
               var10000 = 74;
               break;
            case 168:
               var10000 = 126;
               break;
            case 169:
               var10000 = 191;
               break;
            case 170:
               var10000 = 178;
               break;
            case 171:
               var10000 = 15;
               break;
            case 172:
               var10000 = 13;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 16;
               break;
            case 175:
               var10000 = 105;
               break;
            case 176:
               var10000 = 55;
               break;
            case 177:
               var10000 = 203;
               break;
            case 178:
               var10000 = 197;
               break;
            case 179:
               var10000 = 17;
               break;
            case 180:
               var10000 = 236;
               break;
            case 181:
               var10000 = 43;
               break;
            case 182:
               var10000 = 115;
               break;
            case 183:
               var10000 = 38;
               break;
            case 184:
               var10000 = 193;
               break;
            case 185:
               var10000 = 29;
               break;
            case 186:
               var10000 = 67;
               break;
            case 187:
               var10000 = 45;
               break;
            case 188:
               var10000 = 159;
               break;
            case 189:
               var10000 = 42;
               break;
            case 190:
               var10000 = 175;
               break;
            case 191:
               var10000 = 78;
               break;
            case 192:
               var10000 = 18;
               break;
            case 193:
               var10000 = 22;
               break;
            case 194:
               var10000 = 46;
               break;
            case 195:
               var10000 = 169;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 7;
               break;
            case 198:
               var10000 = 95;
               break;
            case 199:
               var10000 = 52;
               break;
            case 200:
               var10000 = 241;
               break;
            case 201:
               var10000 = 127;
               break;
            case 202:
               var10000 = 183;
               break;
            case 203:
               var10000 = 153;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 40;
               break;
            case 206:
               var10000 = 87;
               break;
            case 207:
               var10000 = 129;
               break;
            case 208:
               var10000 = 80;
               break;
            case 209:
               var10000 = 245;
               break;
            case 210:
               var10000 = 64;
               break;
            case 211:
               var10000 = 35;
               break;
            case 212:
               var10000 = 239;
               break;
            case 213:
               var10000 = 234;
               break;
            case 214:
               var10000 = 107;
               break;
            case 215:
               var10000 = 91;
               break;
            case 216:
               var10000 = 227;
               break;
            case 217:
               var10000 = 50;
               break;
            case 218:
               var10000 = 122;
               break;
            case 219:
               var10000 = 96;
               break;
            case 220:
               var10000 = 11;
               break;
            case 221:
               var10000 = 113;
               break;
            case 222:
               var10000 = 119;
               break;
            case 223:
               var10000 = 237;
               break;
            case 224:
               var10000 = 6;
               break;
            case 225:
               var10000 = 172;
               break;
            case 226:
               var10000 = 181;
               break;
            case 227:
               var10000 = 108;
               break;
            case 228:
               var10000 = 71;
               break;
            case 229:
               var10000 = 1;
               break;
            case 230:
               var10000 = 209;
               break;
            case 231:
               var10000 = 180;
               break;
            case 232:
               var10000 = 190;
               break;
            case 233:
               var10000 = 232;
               break;
            case 234:
               var10000 = 75;
               break;
            case 235:
               var10000 = 5;
               break;
            case 236:
               var10000 = 206;
               break;
            case 237:
               var10000 = 12;
               break;
            case 238:
               var10000 = 76;
               break;
            case 239:
               var10000 = 111;
               break;
            case 240:
               var10000 = 140;
               break;
            case 241:
               var10000 = 217;
               break;
            case 242:
               var10000 = 32;
               break;
            case 243:
               var10000 = 164;
               break;
            case 244:
               var10000 = 89;
               break;
            case 245:
               var10000 = 228;
               break;
            case 246:
               var10000 = 63;
               break;
            case 247:
               var10000 = 251;
               break;
            case 248:
               var10000 = 125;
               break;
            case 249:
               var10000 = 222;
               break;
            case 250:
               var10000 = 94;
               break;
            case 251:
               var10000 = 144;
               break;
            case 252:
               var10000 = 229;
               break;
            case 253:
               var10000 = 253;
               break;
            case 254:
               var10000 = 198;
               break;
            default:
               var10000 = 83;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28980;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 3177) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[16];
      int var19 = 0;
      String var18 = "¾N&Ë>\u008b X4×º¢Fc\u0003 ]p\u0018££\u0080\u001cÞ\u0011ë18èÃ&Ï½\u0006³\u0011Ð©\u008aç9LÛ\u001b.*oMv\u001f\u0011xBZOË\u0091¦®©N\u0099?´\u008dFØä\u0012\nÿ\u0003¨ßd\f¢ç{«ýjj\u000e\u0012fâ£\u000f(Mô«d\u0087kÙ]ç\u0097®â¢Å\u0003.\u0093¡\u0018Q*Þ-\u00157\u0092õ\u0017p&5sß\u0091ÿãY÷»,\u001f5\u001f\"kÆôP \u0001\"\u0080Én^\n\u00984ÃY\u000eVIà\u009c;\u0092j°Â><\t.ã\u0081ù^\u0003UÕÛ\u0005\u008b©\u000f3 \u0017}\u001bx\u0093-j»×\u0092\u008b|ZíyZ\u0017Äá\u008döa©¤\u000eÖ\u0096+Ð\u009fè\u00144²Zj\u0013\\U";
      int var20 = "¾N&Ë>\u008b X4×º¢Fc\u0003 ]p\u0018££\u0080\u001cÞ\u0011ë18èÃ&Ï½\u0006³\u0011Ð©\u008aç9LÛ\u001b.*oMv\u001f\u0011xBZOË\u0091¦®©N\u0099?´\u008dFØä\u0012\nÿ\u0003¨ßd\f¢ç{«ýjj\u000e\u0012fâ£\u000f(Mô«d\u0087kÙ]ç\u0097®â¢Å\u0003.\u0093¡\u0018Q*Þ-\u00157\u0092õ\u0017p&5sß\u0091ÿãY÷»,\u001f5\u001f\"kÆôP \u0001\"\u0080Én^\n\u00984ÃY\u000eVIà\u009c;\u0092j°Â><\t.ã\u0081ù^\u0003UÕÛ\u0005\u008b©\u000f3 \u0017}\u001bx\u0093-j»×\u0092\u008b|ZíyZ\u0017Äá\u008döa©¤\u000eÖ\u0096+Ð\u009fè\u00144²Zj\u0013\\U"
         .length();
      char var17 = 14;
      int var24 = -1;

      label71:
      while (true) {
         byte var10000 = 111;
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
                        var70 = 57;
                        break;
                     case 1:
                        var70 = 45;
                        break;
                     case 2:
                        var70 = 94;
                        break;
                     case 3:
                        var70 = 3;
                        break;
                     case 4:
                        var70 = 68;
                        break;
                     case 5:
                        var70 = 119;
                        break;
                     default:
                        var70 = 95;
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
                     a = var21;
                     b = new String[16];
                     long var8 = 4030264419180945487L;
                     long[] var14 = new long[2];
                     int var11 = 0;
                     String var12 = "\u0019$\u0091cfÎ-Ý½;ÉÓàñnó";
                     int var13 = "\u0019$\u0091cfÎ-Ý½;ÉÓàñnó".length();
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

                     c = var14;
                     d = new Integer[2];
                     long var0 = 7941472620108685294L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0013á\u0005ö\u008c\u001bfðl\u008c\u0087±=<°\u008bO\u001bê\u000e»Ým\u009c";
                     int var5 = "\u0013á\u0005ö\u008c\u001bfðl\u008c\u0087±=<°\u008bO\u001bê\u000e»Ým\u009c".length();
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

                     e = var6;
                     f = new Long[3];
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

                  var18 = "t}Ç\u0015ºè\b\u0012U\u0094^\u0097ñ´] É7\"²Éâ²G)ñ";
                  var20 = "t}Ç\u0015ºè\b\u0012U\u0094^\u0097ñ´] É7\"²Éâ²G)ñ".length();
                  var17 = 7;
                  var24 = -1;
            }

            var10000 = 25;
            var10001 = var18.substring(++var24, var24 + var17);
            var10002 = 0;
         }
      }
   }
}





