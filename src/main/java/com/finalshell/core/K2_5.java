package com.finalshell.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;

public final class K2_5 {
   public static ClassLoader r;
   public static ClassLoader c;
   public static S_6 L;
   static boolean p;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public static ClassLoader V(J_5 var0, @C_9 ClassLoader var1) {
      return new H2_5(var1, var0);
   }

   public static Map D(@C_9 ClassLoader param0, String param1, boolean param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/GO.B ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 18
      // 0b: ifnonnull 19
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14: athrow
      // 15: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 18: astore 0
      // 19: getstatic com/finalshell/core/K2_5.p Z
      // 1c: ifne 36
      // 1f: aload 0
      // 20: ifnonnull 36
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 29: athrow
      // 2a: new java/lang/AssertionError
      // 2d: dup
      // 2e: invokespecial java/lang/AssertionError.<init> ()V
      // 31: athrow
      // 32: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: new java/util/HashMap
      // 39: dup
      // 3a: invokespecial java/util/HashMap.<init> ()V
      // 3d: astore 5
      // 3f: aload 0
      // 40: aload 1
      // 41: invokevirtual java/lang/ClassLoader.getResources (Ljava/lang/String;)Ljava/util/Enumeration;
      // 44: invokestatic java/util/Collections.list (Ljava/util/Enumeration;)Ljava/util/ArrayList;
      // 47: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 4a: astore 6
      // 4c: aload 6
      // 4e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 53: ifeq 87
      // 56: aload 6
      // 58: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5d: checkcast java/net/URL
      // 60: astore 7
      // 62: aload 5
      // 64: aload 7
      // 66: aload 1
      // 67: iload 2
      // 68: iload 3
      // 69: invokestatic com/finalshell/core/K2_5.U (Ljava/net/URL;Ljava/lang/String;ZZ)Ljava/util/Map;
      // 6c: invokevirtual java/util/HashMap.putAll (Ljava/util/Map;)V
      // 6f: iload 4
      // 71: ifne ad
      // 74: iload 4
      // 76: ifeq 4c
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7f: athrow
      // 80: bipush 4
      // 81: anewarray 95
      // 84: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 87: aload 5
      // 89: iload 4
      // 8b: ifne af
      // 8e: invokevirtual java/util/HashMap.isEmpty ()Z
      // 91: ifne a2
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 9a: athrow
      // 9b: aload 5
      // 9d: areturn
      // 9e: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a1: athrow
      // a2: aload 5
      // a4: aload 1
      // a5: iload 2
      // a6: iload 3
      // a7: invokestatic com/finalshell/core/K2_5.p (Ljava/lang/String;ZZ)Ljava/util/Map;
      // aa: invokevirtual java/util/HashMap.putAll (Ljava/util/Map;)V
      // ad: aload 5
      // af: areturn
   }

   public static Map p(String var0, boolean var1, boolean var2) throws IOException {
      return L.T(var0, var1, var2);
   }

   public static Map U(URL param0, String param1, boolean param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/GO.B ()Z
      // 03: aload 0
      // 04: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 07: astore 5
      // 09: istore 4
      // 0b: sipush -18025
      // 0e: sipush 20520
      // 11: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 14: aload 5
      // 16: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 19: iload 4
      // 1b: ifne a4
      // 1e: ifeq 8a
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 2c: checkcast java/net/JarURLConnection
      // 2f: astore 6
      // 31: aload 6
      // 33: bipush 0
      // 34: invokevirtual java/net/JarURLConnection.setUseCaches (Z)V
      // 37: aload 6
      // 39: iload 4
      // 3b: ifne 5a
      // 3e: invokevirtual java/net/JarURLConnection.getJarEntry ()Ljava/util/jar/JarEntry;
      // 41: invokevirtual java/util/jar/JarEntry.isDirectory ()Z
      // 44: ifne 58
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4d: athrow
      // 4e: aload 1
      // 4f: aload 0
      // 50: invokestatic java/util/Collections.singletonMap (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
      // 53: areturn
      // 54: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 57: athrow
      // 58: aload 6
      // 5a: invokevirtual java/net/JarURLConnection.getJarFileURL ()Ljava/net/URL;
      // 5d: astore 7
      // 5f: aload 6
      // 61: invokevirtual java/net/JarURLConnection.getJarFile ()Ljava/util/jar/JarFile;
      // 64: astore 8
      // 66: aload 7
      // 68: aload 8
      // 6a: aload 1
      // 6b: iload 2
      // 6c: iload 3
      // 6d: invokestatic com/finalshell/core/K2_5.C (Ljava/net/URL;Ljava/util/jar/JarFile;Ljava/lang/String;ZZ)Ljava/util/Map;
      // 70: astore 9
      // 72: iload 2
      // 73: ifeq 87
      // 76: aload 9
      // 78: aload 1
      // 79: aload 0
      // 7a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7f: pop
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 86: athrow
      // 87: aload 9
      // 89: areturn
      // 8a: sipush -18026
      // 8d: sipush -16316
      // 90: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 93: iload 4
      // 95: ifne b4
      // 98: aload 5
      // 9a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a3: athrow
      // a4: ifeq b3
      // a7: aload 0
      // a8: aload 1
      // a9: iload 2
      // aa: iload 3
      // ab: invokestatic com/finalshell/core/K2_5.s (Ljava/net/URL;Ljava/lang/String;ZZ)Ljava/util/Map;
      // ae: areturn
      // af: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b2: athrow
      // b3: aload 1
      // b4: aload 0
      // b5: invokestatic java/util/Collections.singletonMap (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
      // b8: areturn
   }

   public static Map C(URL param0, JarFile param1, String param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/GO.s ()Z
      // 003: new java/util/HashMap
      // 006: dup
      // 007: invokespecial java/util/HashMap.<init> ()V
      // 00a: astore 6
      // 00c: istore 5
      // 00e: aload 1
      // 00f: invokevirtual java/util/jar/JarFile.entries ()Ljava/util/Enumeration;
      // 012: astore 7
      // 014: aload 7
      // 016: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 01b: ifeq 100
      // 01e: aload 7
      // 020: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 025: checkcast java/util/jar/JarEntry
      // 028: astore 8
      // 02a: aload 8
      // 02c: invokevirtual java/util/jar/JarEntry.isDirectory ()Z
      // 02f: iload 5
      // 031: ifeq 065
      // 034: ifeq 055
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03d: athrow
      // 03e: iload 3
      // 03f: iload 5
      // 041: ifeq 065
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04a: athrow
      // 04b: ifeq 0fb
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 054: athrow
      // 055: aload 8
      // 057: invokevirtual java/util/jar/JarEntry.getName ()Ljava/lang/String;
      // 05a: aload 2
      // 05b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 064: athrow
      // 065: iload 5
      // 067: ifeq 076
      // 06a: ifeq 0fb
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 073: athrow
      // 074: iload 4
      // 076: iload 5
      // 078: ifeq 0a1
      // 07b: ifne 0a5
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 084: athrow
      // 085: aload 8
      // 087: invokevirtual java/util/jar/JarEntry.getName ()Ljava/lang/String;
      // 08a: sipush 15266
      // 08d: ldc2_w 9139316777076811693
      // 090: invokestatic com/finalshell/core/K2_5.a (IJ)I
      // 093: aload 2
      // 094: invokevirtual java/lang/String.length ()I
      // 097: invokevirtual java/lang/String.indexOf (II)I
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a0: athrow
      // 0a1: bipush -1
      // 0a2: if_icmpne 0fb
      // 0a5: new java/net/URL
      // 0a8: dup
      // 0a9: sipush -18028
      // 0ac: sipush -27043
      // 0af: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 0b2: aconst_null
      // 0b3: new java/lang/StringBuilder
      // 0b6: dup
      // 0b7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ba: aload 0
      // 0bb: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 0be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c1: sipush -18029
      // 0c4: sipush -16355
      // 0c7: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: aload 8
      // 0cf: invokevirtual java/util/jar/JarEntry.getName ()Ljava/lang/String;
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d8: invokespecial java/net/URL.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0db: astore 9
      // 0dd: goto 0ec
      // 0e0: astore 10
      // 0e2: new java/lang/AssertionError
      // 0e5: dup
      // 0e6: aload 10
      // 0e8: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 0eb: athrow
      // 0ec: aload 6
      // 0ee: aload 8
      // 0f0: invokevirtual java/util/jar/JarEntry.getName ()Ljava/lang/String;
      // 0f3: aload 9
      // 0f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fa: pop
      // 0fb: iload 5
      // 0fd: ifne 014
      // 100: aload 6
      // 102: areturn
   }

   public static Map s(URL var0, String var1, boolean var2, boolean var3) {
      boolean var10000 = GO.s();
      File var5 = new File(var0.getFile());
      boolean var4 = var10000;
      var10000 = var5.isFile();
      if (var4) {
         if (var10000) {
            return Collections.singletonMap(var1, var0);
         }

         var10000 = var5.isDirectory();
      }

      if (var4) {
         if (!var10000) {
            return Collections.emptyMap();
         }

         var10000 = var1.isEmpty();
      }

      label70: {
         label76: {
            if (var4) {
               if (var10000) {
                  break label70;
               }

               var14 = var1;
               if (!var4) {
                  break label76;
               }

               var10000 = var1.endsWith("/");
            }

            if (var10000) {
               break label70;
            }

            var14 = var1 + a(9348, 7304328070342506634L);
         }

         var1 = var14;
      }

      HashMap var6 = new HashMap();
      if (var2) {
         var6.put(var1, var0);
      }

      for (File var10 : var5.listFiles()) {
         label79: {
            String var11 = var1 + var10.getName();
            URL var12 = Z(var10);
            var10000 = var3;
            if (var4) {
               if (var3) {
                  var6.putAll(s(var12, var11, var2, var3));
                  if (var4) {
                     break label79;
                  }
               }

               if (!var4) {
                  break label79;
               }

               var10000 = var10.isFile();
            }

            if (var10000) {
               var6.put(var11, var12);
            }
         }

         if (!var4) {
            break;
         }
      }

      return var6;
   }

   public static URL Z(File var0) {
      try {
         return var0.toURI().toURL();
      } catch (MalformedURLException var2) {
         throw new AssertionError(var2);
      }
   }

   static Map Z(URL var0, JarFile var1, String var2, boolean var3, boolean var4) {
      return C(var0, var1, var2, var3, var4);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -18025) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 203;
               break;
            case 1:
               var10000 = 150;
               break;
            case 2:
               var10000 = 214;
               break;
            case 3:
               var10000 = 159;
               break;
            case 4:
               var10000 = 172;
               break;
            case 5:
               var10000 = 8;
               break;
            case 6:
               var10000 = 220;
               break;
            case 7:
               var10000 = 164;
               break;
            case 8:
               var10000 = 69;
               break;
            case 9:
               var10000 = 33;
               break;
            case 10:
               var10000 = 179;
               break;
            case 11:
               var10000 = 236;
               break;
            case 12:
               var10000 = 39;
               break;
            case 13:
               var10000 = 95;
               break;
            case 14:
               var10000 = 170;
               break;
            case 15:
               var10000 = 237;
               break;
            case 16:
               var10000 = 178;
               break;
            case 17:
               var10000 = 30;
               break;
            case 18:
               var10000 = 185;
               break;
            case 19:
               var10000 = 65;
               break;
            case 20:
               var10000 = 148;
               break;
            case 21:
               var10000 = 186;
               break;
            case 22:
               var10000 = 34;
               break;
            case 23:
               var10000 = 143;
               break;
            case 24:
               var10000 = 100;
               break;
            case 25:
               var10000 = 221;
               break;
            case 26:
               var10000 = 11;
               break;
            case 27:
               var10000 = 191;
               break;
            case 28:
               var10000 = 75;
               break;
            case 29:
               var10000 = 153;
               break;
            case 30:
               var10000 = 76;
               break;
            case 31:
               var10000 = 24;
               break;
            case 32:
               var10000 = 245;
               break;
            case 33:
               var10000 = 4;
               break;
            case 34:
               var10000 = 58;
               break;
            case 35:
               var10000 = 51;
               break;
            case 36:
               var10000 = 6;
               break;
            case 37:
               var10000 = 79;
               break;
            case 38:
               var10000 = 17;
               break;
            case 39:
               var10000 = 244;
               break;
            case 40:
               var10000 = 137;
               break;
            case 41:
               var10000 = 146;
               break;
            case 42:
               var10000 = 122;
               break;
            case 43:
               var10000 = 87;
               break;
            case 44:
               var10000 = 187;
               break;
            case 45:
               var10000 = 151;
               break;
            case 46:
               var10000 = 168;
               break;
            case 47:
               var10000 = 249;
               break;
            case 48:
               var10000 = 10;
               break;
            case 49:
               var10000 = 63;
               break;
            case 50:
               var10000 = 118;
               break;
            case 51:
               var10000 = 252;
               break;
            case 52:
               var10000 = 113;
               break;
            case 53:
               var10000 = 192;
               break;
            case 54:
               var10000 = 117;
               break;
            case 55:
               var10000 = 201;
               break;
            case 56:
               var10000 = 50;
               break;
            case 57:
               var10000 = 2;
               break;
            case 58:
               var10000 = 71;
               break;
            case 59:
               var10000 = 48;
               break;
            case 60:
               var10000 = 35;
               break;
            case 61:
               var10000 = 181;
               break;
            case 62:
               var10000 = 156;
               break;
            case 63:
               var10000 = 174;
               break;
            case 64:
               var10000 = 108;
               break;
            case 65:
               var10000 = 251;
               break;
            case 66:
               var10000 = 134;
               break;
            case 67:
               var10000 = 78;
               break;
            case 68:
               var10000 = 227;
               break;
            case 69:
               var10000 = 67;
               break;
            case 70:
               var10000 = 1;
               break;
            case 71:
               var10000 = 73;
               break;
            case 72:
               var10000 = 208;
               break;
            case 73:
               var10000 = 182;
               break;
            case 74:
               var10000 = 74;
               break;
            case 75:
               var10000 = 204;
               break;
            case 76:
               var10000 = 7;
               break;
            case 77:
               var10000 = 90;
               break;
            case 78:
               var10000 = 21;
               break;
            case 79:
               var10000 = 129;
               break;
            case 80:
               var10000 = 72;
               break;
            case 81:
               var10000 = 26;
               break;
            case 82:
               var10000 = 230;
               break;
            case 83:
               var10000 = 233;
               break;
            case 84:
               var10000 = 232;
               break;
            case 85:
               var10000 = 123;
               break;
            case 86:
               var10000 = 25;
               break;
            case 87:
               var10000 = 229;
               break;
            case 88:
               var10000 = 200;
               break;
            case 89:
               var10000 = 199;
               break;
            case 90:
               var10000 = 209;
               break;
            case 91:
               var10000 = 247;
               break;
            case 92:
               var10000 = 14;
               break;
            case 93:
               var10000 = 154;
               break;
            case 94:
               var10000 = 234;
               break;
            case 95:
               var10000 = 126;
               break;
            case 96:
               var10000 = 55;
               break;
            case 97:
               var10000 = 160;
               break;
            case 98:
               var10000 = 202;
               break;
            case 99:
               var10000 = 41;
               break;
            case 100:
               var10000 = 183;
               break;
            case 101:
               var10000 = 23;
               break;
            case 102:
               var10000 = 105;
               break;
            case 103:
               var10000 = 102;
               break;
            case 104:
               var10000 = 254;
               break;
            case 105:
               var10000 = 219;
               break;
            case 106:
               var10000 = 62;
               break;
            case 107:
               var10000 = 149;
               break;
            case 108:
               var10000 = 19;
               break;
            case 109:
               var10000 = 195;
               break;
            case 110:
               var10000 = 12;
               break;
            case 111:
               var10000 = 37;
               break;
            case 112:
               var10000 = 145;
               break;
            case 113:
               var10000 = 163;
               break;
            case 114:
               var10000 = 83;
               break;
            case 115:
               var10000 = 59;
               break;
            case 116:
               var10000 = 81;
               break;
            case 117:
               var10000 = 68;
               break;
            case 118:
               var10000 = 135;
               break;
            case 119:
               var10000 = 184;
               break;
            case 120:
               var10000 = 197;
               break;
            case 121:
               var10000 = 16;
               break;
            case 122:
               var10000 = 212;
               break;
            case 123:
               var10000 = 64;
               break;
            case 124:
               var10000 = 53;
               break;
            case 125:
               var10000 = 240;
               break;
            case 126:
               var10000 = 157;
               break;
            case 127:
               var10000 = 207;
               break;
            case 128:
               var10000 = 162;
               break;
            case 129:
               var10000 = 193;
               break;
            case 130:
               var10000 = 18;
               break;
            case 131:
               var10000 = 189;
               break;
            case 132:
               var10000 = 136;
               break;
            case 133:
               var10000 = 99;
               break;
            case 134:
               var10000 = 96;
               break;
            case 135:
               var10000 = 173;
               break;
            case 136:
               var10000 = 141;
               break;
            case 137:
               var10000 = 20;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 180;
               break;
            case 140:
               var10000 = 215;
               break;
            case 141:
               var10000 = 66;
               break;
            case 142:
               var10000 = 27;
               break;
            case 143:
               var10000 = 196;
               break;
            case 144:
               var10000 = 231;
               break;
            case 145:
               var10000 = 250;
               break;
            case 146:
               var10000 = 239;
               break;
            case 147:
               var10000 = 106;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 246;
               break;
            case 150:
               var10000 = 198;
               break;
            case 151:
               var10000 = 28;
               break;
            case 152:
               var10000 = 107;
               break;
            case 153:
               var10000 = 205;
               break;
            case 154:
               var10000 = 49;
               break;
            case 155:
               var10000 = 127;
               break;
            case 156:
               var10000 = 98;
               break;
            case 157:
               var10000 = 109;
               break;
            case 158:
               var10000 = 44;
               break;
            case 159:
               var10000 = 213;
               break;
            case 160:
               var10000 = 91;
               break;
            case 161:
               var10000 = 228;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 80;
               break;
            case 164:
               var10000 = 190;
               break;
            case 165:
               var10000 = 77;
               break;
            case 166:
               var10000 = 121;
               break;
            case 167:
               var10000 = 248;
               break;
            case 168:
               var10000 = 45;
               break;
            case 169:
               var10000 = 165;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 52;
               break;
            case 172:
               var10000 = 255;
               break;
            case 173:
               var10000 = 119;
               break;
            case 174:
               var10000 = 86;
               break;
            case 175:
               var10000 = 155;
               break;
            case 176:
               var10000 = 175;
               break;
            case 177:
               var10000 = 82;
               break;
            case 178:
               var10000 = 70;
               break;
            case 179:
               var10000 = 147;
               break;
            case 180:
               var10000 = 9;
               break;
            case 181:
               var10000 = 218;
               break;
            case 182:
               var10000 = 130;
               break;
            case 183:
               var10000 = 132;
               break;
            case 184:
               var10000 = 56;
               break;
            case 185:
               var10000 = 224;
               break;
            case 186:
               var10000 = 104;
               break;
            case 187:
               var10000 = 47;
               break;
            case 188:
               var10000 = 167;
               break;
            case 189:
               var10000 = 169;
               break;
            case 190:
               var10000 = 15;
               break;
            case 191:
               var10000 = 124;
               break;
            case 192:
               var10000 = 158;
               break;
            case 193:
               var10000 = 57;
               break;
            case 194:
               var10000 = 31;
               break;
            case 195:
               var10000 = 226;
               break;
            case 196:
               var10000 = 133;
               break;
            case 197:
               var10000 = 206;
               break;
            case 198:
               var10000 = 243;
               break;
            case 199:
               var10000 = 61;
               break;
            case 200:
               var10000 = 5;
               break;
            case 201:
               var10000 = 3;
               break;
            case 202:
               var10000 = 97;
               break;
            case 203:
               var10000 = 36;
               break;
            case 204:
               var10000 = 112;
               break;
            case 205:
               var10000 = 138;
               break;
            case 206:
               var10000 = 46;
               break;
            case 207:
               var10000 = 210;
               break;
            case 208:
               var10000 = 216;
               break;
            case 209:
               var10000 = 222;
               break;
            case 210:
               var10000 = 211;
               break;
            case 211:
               var10000 = 115;
               break;
            case 212:
               var10000 = 225;
               break;
            case 213:
               var10000 = 166;
               break;
            case 214:
               var10000 = 223;
               break;
            case 215:
               var10000 = 188;
               break;
            case 216:
               var10000 = 32;
               break;
            case 217:
               var10000 = 22;
               break;
            case 218:
               var10000 = 42;
               break;
            case 219:
               var10000 = 176;
               break;
            case 220:
               var10000 = 144;
               break;
            case 221:
               var10000 = 84;
               break;
            case 222:
               var10000 = 116;
               break;
            case 223:
               var10000 = 43;
               break;
            case 224:
               var10000 = 0;
               break;
            case 225:
               var10000 = 93;
               break;
            case 226:
               var10000 = 114;
               break;
            case 227:
               var10000 = 120;
               break;
            case 228:
               var10000 = 152;
               break;
            case 229:
               var10000 = 103;
               break;
            case 230:
               var10000 = 217;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 194;
               break;
            case 233:
               var10000 = 139;
               break;
            case 234:
               var10000 = 242;
               break;
            case 235:
               var10000 = 235;
               break;
            case 236:
               var10000 = 88;
               break;
            case 237:
               var10000 = 241;
               break;
            case 238:
               var10000 = 29;
               break;
            case 239:
               var10000 = 140;
               break;
            case 240:
               var10000 = 40;
               break;
            case 241:
               var10000 = 38;
               break;
            case 242:
               var10000 = 131;
               break;
            case 243:
               var10000 = 60;
               break;
            case 244:
               var10000 = 85;
               break;
            case 245:
               var10000 = 177;
               break;
            case 246:
               var10000 = 125;
               break;
            case 247:
               var10000 = 238;
               break;
            case 248:
               var10000 = 142;
               break;
            case 249:
               var10000 = 110;
               break;
            case 250:
               var10000 = 54;
               break;
            case 251:
               var10000 = 94;
               break;
            case 252:
               var10000 = 101;
               break;
            case 253:
               var10000 = 161;
               break;
            case 254:
               var10000 = 253;
               break;
            default:
               var10000 = 171;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23567;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 7
      // 002: anewarray 95
      // 005: astore 13
      // 007: bipush 0
      // 008: istore 11
      // 00a: ldc_w "\u0081\u009bÕ\u0004å\u0017Ê%\u0016&d%Fbõ¾e\u0018\u0090!ëôo\u008eµ@ÉÞK\u0010\u0003\u0003Çl\u001d\u0002\u0091\u009b"
      // 00d: dup
      // 00e: astore 10
      // 010: invokevirtual java/lang/String.length ()I
      // 013: istore 12
      // 015: bipush 3
      // 016: istore 9
      // 018: bipush -1
      // 019: istore 8
      // 01b: bipush 65
      // 01d: iinc 8 1
      // 020: aload 10
      // 022: iload 8
      // 024: dup
      // 025: iload 9
      // 027: iadd
      // 028: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 02b: bipush -1
      // 02c: goto 0aa
      // 02f: aload 13
      // 031: swap
      // 032: iload 11
      // 034: iinc 11 1
      // 037: swap
      // 038: aastore
      // 039: iload 8
      // 03b: iload 9
      // 03d: iadd
      // 03e: dup
      // 03f: istore 8
      // 041: iload 12
      // 043: if_icmpge 052
      // 046: aload 10
      // 048: iload 8
      // 04a: invokevirtual java/lang/String.charAt (I)C
      // 04d: istore 9
      // 04f: goto 01b
      // 052: ldc_w "³\u008c\u0093M\u001c\u00032Ñ=·Ù\u000fW}\u0086<b\u0014U%¡eú1næ\u0010Ußò¶e÷\u0004\u009fÂ7\bÝ\u0091\\ë%-ë\u008d1\u000f\u009aJ\u0086°ô`è\u0090_\u0088º\u009f§E\b,\u0094\u009b¢o£\b\u0092\u008e\u0015\u0084»ñ\"¥7;\u0093"
      // 055: dup
      // 056: astore 10
      // 058: invokevirtual java/lang/String.length ()I
      // 05b: istore 12
      // 05d: bipush 3
      // 05e: istore 9
      // 060: bipush -1
      // 061: istore 8
      // 063: bipush 42
      // 065: iinc 8 1
      // 068: aload 10
      // 06a: iload 8
      // 06c: dup
      // 06d: iload 9
      // 06f: iadd
      // 070: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 073: bipush 0
      // 074: goto 0aa
      // 077: aload 13
      // 079: swap
      // 07a: iload 11
      // 07c: iinc 11 1
      // 07f: swap
      // 080: aastore
      // 081: iload 8
      // 083: iload 9
      // 085: iadd
      // 086: dup
      // 087: istore 8
      // 089: iload 12
      // 08b: if_icmpge 09a
      // 08e: aload 10
      // 090: iload 8
      // 092: invokevirtual java/lang/String.charAt (I)C
      // 095: istore 9
      // 097: goto 063
      // 09a: aload 13
      // 09c: putstatic com/finalshell/core/K2_5.a [Ljava/lang/String;
      // 09f: bipush 7
      // 0a1: anewarray 95
      // 0a4: putstatic com/finalshell/core/K2_5.b [Ljava/lang/String;
      // 0a7: goto 148
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokevirtual java/lang/String.toCharArray ()[C
      // 0af: dup_x1
      // 0b0: arraylength
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: bipush 0
      // 0b4: istore 14
      // 0b6: dup2_x1
      // 0b7: pop2
      // 0b8: dup_x2
      // 0b9: bipush 1
      // 0ba: if_icmpgt 120
      // 0bd: dup2
      // 0be: swap
      // 0bf: iload 14
      // 0c1: dup2_x1
      // 0c2: caload
      // 0c3: swap
      // 0c4: iload 14
      // 0c6: bipush 7
      // 0c8: irem
      // 0c9: tableswitch 69 0 5 39 44 49 54 59 64
      // 0f0: bipush 30
      // 0f2: goto 110
      // 0f5: bipush 103
      // 0f7: goto 110
      // 0fa: bipush 26
      // 0fc: goto 110
      // 0ff: bipush 99
      // 101: goto 110
      // 104: bipush 123
      // 106: goto 110
      // 109: bipush 25
      // 10b: goto 110
      // 10e: bipush 95
      // 110: ixor
      // 111: ixor
      // 112: i2c
      // 113: castore
      // 114: iinc 14 1
      // 117: dup
      // 118: ifne 120
      // 11b: dup2
      // 11c: dup_x1
      // 11d: goto 0c1
      // 120: dup2_x1
      // 121: pop2
      // 122: dup_x2
      // 123: iload 14
      // 125: if_icmpgt 0bd
      // 128: pop
      // 129: new java/lang/String
      // 12c: dup_x1
      // 12d: swap
      // 12e: invokespecial java/lang/String.<init> ([C)V
      // 131: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 134: swap
      // 135: pop
      // 136: swap
      // 137: tableswitch -264 0 0 -192
      // 148: ldc2_w 6211108986649984253
      // 14b: lstore 0
      // 14c: bipush 2
      // 14d: newarray 11
      // 14f: astore 6
      // 151: bipush 0
      // 152: istore 3
      // 153: ldc_w "³)\u0088¼éì[\u007fí]\u0000h9/ÄX"
      // 156: dup
      // 157: astore 4
      // 159: invokevirtual java/lang/String.length ()I
      // 15c: istore 5
      // 15e: bipush 0
      // 15f: istore 2
      // 160: aload 4
      // 162: iload 2
      // 163: iinc 2 8
      // 166: iload 2
      // 167: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 16a: ldc_w "ISO-8859-1"
      // 16d: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 170: astore 7
      // 172: aload 6
      // 174: iload 3
      // 175: iinc 3 1
      // 178: aload 7
      // 17a: bipush 0
      // 17b: baload
      // 17c: i2l
      // 17d: ldc2_w 255
      // 180: land
      // 181: bipush 56
      // 183: lshl
      // 184: aload 7
      // 186: bipush 1
      // 187: baload
      // 188: i2l
      // 189: ldc2_w 255
      // 18c: land
      // 18d: bipush 48
      // 18f: lshl
      // 190: lor
      // 191: aload 7
      // 193: bipush 2
      // 194: baload
      // 195: i2l
      // 196: ldc2_w 255
      // 199: land
      // 19a: bipush 40
      // 19c: lshl
      // 19d: lor
      // 19e: aload 7
      // 1a0: bipush 3
      // 1a1: baload
      // 1a2: i2l
      // 1a3: ldc2_w 255
      // 1a6: land
      // 1a7: bipush 32
      // 1a9: lshl
      // 1aa: lor
      // 1ab: aload 7
      // 1ad: bipush 4
      // 1ae: baload
      // 1af: i2l
      // 1b0: ldc2_w 255
      // 1b3: land
      // 1b4: bipush 24
      // 1b6: lshl
      // 1b7: lor
      // 1b8: aload 7
      // 1ba: bipush 5
      // 1bb: baload
      // 1bc: i2l
      // 1bd: ldc2_w 255
      // 1c0: land
      // 1c1: bipush 16
      // 1c3: lshl
      // 1c4: lor
      // 1c5: aload 7
      // 1c7: bipush 6
      // 1c9: baload
      // 1ca: i2l
      // 1cb: ldc2_w 255
      // 1ce: land
      // 1cf: bipush 8
      // 1d1: lshl
      // 1d2: lor
      // 1d3: aload 7
      // 1d5: bipush 7
      // 1d7: baload
      // 1d8: i2l
      // 1d9: ldc2_w 255
      // 1dc: land
      // 1dd: lor
      // 1de: bipush -1
      // 1df: goto 1f8
      // 1e2: lastore
      // 1e3: iload 2
      // 1e4: iload 5
      // 1e6: if_icmplt 160
      // 1e9: aload 6
      // 1eb: putstatic com/finalshell/core/K2_5.d [J
      // 1ee: bipush 2
      // 1ef: anewarray 295
      // 1f2: putstatic com/finalshell/core/K2_5.e [Ljava/lang/Integer;
      // 1f5: goto 202
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: lload 0
      // 1fb: lxor
      // 1fc: dup2_x1
      // 1fd: pop2
      // 1fe: pop
      // 1ff: goto 1e2
      // 202: ldc com/finalshell/core/K2_5
      // 204: invokevirtual java/lang/Class.desiredAssertionStatus ()Z
      // 207: ifne 212
      // 20a: bipush 1
      // 20b: goto 213
      // 20e: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 211: athrow
      // 212: bipush 0
      // 213: putstatic com/finalshell/core/K2_5.p Z
      // 216: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 219: putstatic com/finalshell/core/K2_5.r Ljava/lang/ClassLoader;
      // 21c: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 21f: invokevirtual java/lang/ClassLoader.getParent ()Ljava/lang/ClassLoader;
      // 222: putstatic com/finalshell/core/K2_5.c Ljava/lang/ClassLoader;
      // 225: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 228: sipush -18027
      // 22b: sipush 13091
      // 22e: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 231: invokevirtual java/lang/ClassLoader.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 234: astore 15
      // 236: getstatic com/finalshell/core/K2_5.p Z
      // 239: ifne 254
      // 23c: aload 15
      // 23e: ifnonnull 254
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 247: athrow
      // 248: new java/lang/AssertionError
      // 24b: dup
      // 24c: invokespecial java/lang/AssertionError.<init> ()V
      // 24f: athrow
      // 250: invokestatic com/finalshell/core/K2_5.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 253: athrow
      // 254: aload 15
      // 256: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 259: astore 16
      // 25b: sipush -18025
      // 25e: sipush 20520
      // 261: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 264: aload 16
      // 266: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 269: ifeq 2aa
      // 26c: aload 15
      // 26e: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 271: checkcast java/net/JarURLConnection
      // 274: astore 19
      // 276: aload 19
      // 278: bipush 0
      // 279: invokevirtual java/net/JarURLConnection.setUseCaches (Z)V
      // 27c: aload 19
      // 27e: invokevirtual java/net/JarURLConnection.getJarFileURL ()Ljava/net/URL;
      // 281: astore 17
      // 283: aload 19
      // 285: invokevirtual java/net/JarURLConnection.getJarFile ()Ljava/util/jar/JarFile;
      // 288: astore 18
      // 28a: goto 299
      // 28d: astore 19
      // 28f: new java/lang/AssertionError
      // 292: dup
      // 293: aload 19
      // 295: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 298: athrow
      // 299: new com/finalshell/core/I4_2
      // 29c: dup
      // 29d: aload 17
      // 29f: aload 18
      // 2a1: invokespecial com/finalshell/core/I4_2.<init> (Ljava/net/URL;Ljava/util/jar/JarFile;)V
      // 2a4: putstatic com/finalshell/core/K2_5.L Lcom/finalshell/core/S_6;
      // 2a7: goto 2e3
      // 2aa: sipush -18030
      // 2ad: sipush 24730
      // 2b0: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 2b3: aload 16
      // 2b5: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 2b8: ifeq 2d2
      // 2bb: invokestatic com/finalshell/core/T_7.c ()Lcom/finalshell/core/T_7;
      // 2be: invokevirtual com/finalshell/core/T_7.W ()Ljava/util/Set;
      // 2c1: astore 17
      // 2c3: new com/finalshell/core/P3_3
      // 2c6: dup
      // 2c7: aload 17
      // 2c9: invokespecial com/finalshell/core/P3_3.<init> (Ljava/util/Set;)V
      // 2cc: putstatic com/finalshell/core/K2_5.L Lcom/finalshell/core/S_6;
      // 2cf: goto 2e3
      // 2d2: new java/lang/AssertionError
      // 2d5: dup
      // 2d6: sipush -18031
      // 2d9: sipush -21101
      // 2dc: invokestatic com/finalshell/core/K2_5.a (II)Ljava/lang/String;
      // 2df: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 2e2: athrow
      // 2e3: return
   }
}





