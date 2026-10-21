package com.finalshell.core;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;

public final class Kp2 {
   public static boolean M;
   public static Map t;
   public static String[] a;
   public static String[] b;

   public static boolean a() {
      return M;
   }

   public static void l(boolean var0) {
      M = var0;
   }

   public static Object T(Object var0, Object[] var1) {
      try {
         return m(var0, var1);
      } catch (Throwable var4) {
         Throwable var2 = var4;

         try {
            if (M) {
               NE3.j(a(17760, 30185), var2);
            }

            return null;
         } catch (Throwable var3) {
            throw a(var3);
         }
      }
   }

   public static Object m(Object param0, Object[] param1) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07: aload 1
      // 08: invokestatic com/finalshell/core/Kp2.f (Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 3
      // 0c: astore 2
      // 0d: aload 0
      // 0e: invokestatic com/finalshell/core/Kp2.p (Ljava/lang/Object;)Ljava/util/List;
      // 11: astore 4
      // 13: aload 4
      // 15: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 5
      // 1c: aload 5
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq cc
      // 26: aload 5
      // 28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d: checkcast java/lang/reflect/Field
      // 30: astore 6
      // 32: aload 6
      // 34: bipush 1
      // 35: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 38: aload 6
      // 3a: aload 2
      // 3b: ifnonnull cd
      // 3e: aload 2
      // 3f: ifnonnull 6a
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 4c: invokestatic java/lang/reflect/Modifier.isTransient (I)Z
      // 4f: ifeq 64
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 2
      // 5a: ifnull 1c
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 6
      // 66: aload 0
      // 67: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6a: astore 7
      // 6c: aload 7
      // 6e: instanceof java/util/Collection
      // 71: aload 2
      // 72: ifnonnull a4
      // 75: ifeq 8d
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 7
      // 81: checkcast java/util/Collection
      // 84: invokestatic com/finalshell/core/AL_2.U (Ljava/util/Collection;)Ljava/util/ArrayList;
      // 87: astore 8
      // 89: aload 2
      // 8a: ifnull c0
      // 8d: aload 7
      // 8f: aload 2
      // 90: ifnonnull be
      // 93: goto 9a
      // 96: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: instanceof java/lang/Cloneable
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: ifeq b5
      // a7: aload 7
      // a9: checkcast java/lang/Cloneable
      // ac: invokestatic com/finalshell/core/Kp2.L (Ljava/lang/Cloneable;)Ljava/lang/Cloneable;
      // af: astore 8
      // b1: aload 2
      // b2: ifnull c0
      // b5: aload 7
      // b7: goto be
      // ba: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: astore 8
      // c0: aload 6
      // c2: aload 3
      // c3: aload 8
      // c5: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // c8: aload 2
      // c9: ifnull 1c
      // cc: aload 3
      // cd: areturn
   }

   public static List p(Object var0) {
      return Z(var0, new ArrayList());
   }

   public static List Z(Object var0, List var1) {
      String var2 = FV_2.D();
      Object var10000 = var0;
      if (var2 == null) {
         if (var0 instanceof java.lang.Class) {
            java.lang.Class var3 = (java.lang.Class)var0;
            Field[] var4 = var3.getDeclaredFields();
            ArrayList var5 = new ArrayList(var4.length);
            Field[] var6 = var4;
            int var7 = var4.length;
            int var8 = 0;

            while (var8 < var7) {
               Field var9 = var6[var8];
               int var10 = var9.getModifiers();
               if (var2 == null) {
                  if (!var1.contains(var9.getName()) && var2 == null && !Modifier.isStatic(var10)) {
                     var5.add(var9);
                     var1.add(var9.getName());
                  }

                  var8++;
               }

               if (var2 != null) {
                  break;
               }
            }

            java.lang.Class var11 = var3.getSuperclass();
            if (var11 != null) {
               var5.addAll(p(var11));
            }

            return var5;
         }

         var10000 = var0;
      }

      return p(var10000.getClass());
   }

   public static java.lang.Class E(java.lang.Class var0, String var1) {
      try {
         return z(var0, var1);
      } catch (NoSuchFieldException var4) {
         NoSuchFieldException var2 = var4;

         try {
            if (M) {
               NE3.j(a(17742, -23834), var2);
            }

            return null;
         } catch (NoSuchFieldException var3) {
            throw a(var3);
         }
      }
   }

   public static java.lang.Class z(java.lang.Class var0, String var1) throws NoSuchFieldException {
      return k(var0, var1).getType();
   }

   public static Field P$Field(java.lang.Class var0, String var1) {
      try {
         return k(var0, var1);
      } catch (NoSuchFieldException var4) {
         NoSuchFieldException var2 = var4;

         try {
            if (M) {
               NE3.j(a(17780, 20052), var2);
            }

            return null;
         } catch (NoSuchFieldException var3) {
            throw a(var3);
         }
      }
   }

   public static Field k(java.lang.Class var0, String var1) throws NoSuchFieldException {
      String var10000 = FV_2.D();
      Field var3 = X(var0, var1);
      String var2 = var10000;

      try {
         if (var2 != null) {
            return var3;
         }

         if (var3 == null) {
            throw new NoSuchFieldException(a(17761, -28417) + var1 + a(17790, -14829) + var0.getCanonicalName());
         }
      } catch (NoSuchFieldException var4) {
         throw a(var4);
      }

      return var3;
   }

   public static Field X(java.lang.Class var0, String var1) throws NoSuchFieldException {
      String var2 = FV_2.D();

      Field var3;
      try {
         var3 = var0.getDeclaredField(var1);
      } catch (NoSuchFieldException var7) {
      ArrayList var10000;
         java.lang.Class var5 = var0.getSuperclass();

         Field var8;
         label29: {
            label28: {
               label27: {
                  try {
                     var10000 = var5;
                     if (var2 != null) {
                        break label28;
                     }

                     if (var5 == null) {
                        break label27;
                     }
                  } catch (NoSuchFieldException var6) {
                     throw a(var6);
                  }

                  var10000 = var5;
                  break label28;
               }

               var8 = null;
               break label29;
            }

            var8 = X(var10000, var1);
         }

         var3 = var8;
      }

      return var3;
   }

   public static boolean k(Object param0, String param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokestatic com/finalshell/core/Kp2.v (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
      // 0a: bipush 1
      // 0b: ireturn
      // 0c: astore 4
      // 0e: getstatic com/finalshell/core/Kp2.M Z
      // 11: aload 3
      // 12: ifnonnull 35
      // 15: ifeq 34
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: sipush 17779
      // 22: sipush -16573
      // 25: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 28: aload 4
      // 2a: invokestatic com/finalshell/core/NE3.j (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
   }

   public static void v(Object var0, String var1, Object var2) throws IllegalAccessException, NoSuchFieldException {
      Field var3 = k(var0.getClass(), var1);
      var3.setAccessible(true);
      var3.set(var0, var2);
   }

   public static Object G(Object var0, String var1) {
      try {
         return E(var0, var1);
      } catch (Throwable var4) {
         Throwable var2 = var4;

         try {
            if (M) {
               NE3.j(a(17772, 29724), var2);
            }

            return null;
         } catch (Throwable var3) {
            throw a(var3);
         }
      }
   }

   public static Object E(Object var0, String var1) throws NoSuchFieldException, IllegalAccessException {
      Field var2 = k(var0.getClass(), var1);
      var2.setAccessible(true);
      return var2.get(var0);
   }

   public static Object Q(java.lang.Class var0, String var1) {
      try {
         return O(var0, var1);
      } catch (Throwable var4) {
         Throwable var2 = var4;

         try {
            if (M) {
               NE3.j(a(17782, 16347), var2);
            }

            return null;
         } catch (Throwable var3) {
            throw a(var3);
         }
      }
   }

   public static Object O(java.lang.Class var0, String var1) throws NoSuchFieldException, IllegalAccessException {
      return var0.getField(var1).get(null);
   }

   public static java.lang.Class f(String var0) {
      try {
         return java.lang.Class.forName(var0);
      } catch (ClassNotFoundException var3) {
         ClassNotFoundException var1 = var3;

         try {
            if (M) {
               NE3.j(a(17767, -11092), var1);
            }

            return null;
         } catch (ClassNotFoundException var2) {
            throw a(var2);
         }
      }
   }

   public static java.lang.Class e(String var0) throws ClassNotFoundException {
      return java.lang.Class.forName(var0);
   }

   public static P2 w(java.lang.Class var0) {
      return E(var0, null, null);
   }

   public static P2 E(java.lang.Class var0, List var1, List var2) {
      return c(var0, var1, var2, null);
   }

   public static P2 c(java.lang.Class param0, List param1, List param2, RP param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // 009: invokevirtual java/security/ProtectionDomain.getCodeSource ()Ljava/security/CodeSource;
      // 00c: astore 5
      // 00e: aload 5
      // 010: aload 4
      // 012: ifnonnull 021
      // 015: ifnull 14f
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 5
      // 021: invokevirtual java/security/CodeSource.getLocation ()Ljava/net/URL;
      // 024: astore 6
      // 026: aload 6
      // 028: invokevirtual java/net/URL.toURI ()Ljava/net/URI;
      // 02b: astore 7
      // 02d: aload 7
      // 02f: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 032: astore 9
      // 034: aload 9
      // 036: aload 4
      // 038: ifnonnull 085
      // 03b: ifnull 079
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 9
      // 047: sipush 17776
      // 04a: sipush -30022
      // 04d: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 050: aload 4
      // 052: ifnonnull 08e
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 05f: ifeq 079
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: new java/io/File
      // 06c: dup
      // 06d: aload 7
      // 06f: invokespecial java/io/File.<init> (Ljava/net/URI;)V
      // 072: astore 8
      // 074: aload 4
      // 076: ifnull 0a0
      // 079: aload 6
      // 07b: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: sipush 17775
      // 088: sipush -17155
      // 08b: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 08e: sipush 17791
      // 091: sipush -14876
      // 094: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 097: invokestatic java/io/File.createTempFile (Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
      // 09a: aload 3
      // 09b: invokestatic com/finalshell/core/Cz2.z (Ljava/lang/String;Ljava/io/File;Lcom/finalshell/core/RP;)Ljava/io/File;
      // 09e: astore 8
      // 0a0: new com/finalshell/core/X2
      // 0a3: dup
      // 0a4: getstatic com/finalshell/ui/model/L.jarEntry Lcom/finalshell/ui/model/L;
      // 0a7: aload 8
      // 0a9: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0ac: invokespecial com/finalshell/core/X2.<init> (Lcom/finalshell/ui/model/L;Ljava/lang/String;)V
      // 0af: astore 10
      // 0b1: new com/finalshell/core/P2
      // 0b4: dup
      // 0b5: aload 10
      // 0b7: invokespecial com/finalshell/core/P2.<init> (Lcom/finalshell/core/X2;)V
      // 0ba: astore 11
      // 0bc: aload 11
      // 0be: aload 8
      // 0c0: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0c3: invokevirtual com/finalshell/core/P2.o$void (Ljava/lang/String;)V
      // 0c6: new java/util/zip/ZipInputStream
      // 0c9: dup
      // 0ca: aload 6
      // 0cc: invokevirtual java/net/URL.openStream ()Ljava/io/InputStream;
      // 0cf: invokespecial java/util/zip/ZipInputStream.<init> (Ljava/io/InputStream;)V
      // 0d2: astore 12
      // 0d4: aload 12
      // 0d6: invokevirtual java/util/zip/ZipInputStream.getNextEntry ()Ljava/util/zip/ZipEntry;
      // 0d9: dup
      // 0da: astore 13
      // 0dc: ifnull 147
      // 0df: aload 13
      // 0e1: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 0e4: astore 14
      // 0e6: aload 4
      // 0e8: ifnonnull 14c
      // 0eb: aload 14
      // 0ed: aload 2
      // 0ee: invokestatic com/finalshell/core/Kp2.n (Ljava/lang/String;Ljava/util/List;)Z
      // 0f1: aload 4
      // 0f3: ifnonnull 113
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: ifeq 142
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: aload 13
      // 109: invokevirtual java/util/zip/ZipEntry.isDirectory ()Z
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 4
      // 115: ifnonnull 12f
      // 118: ifne 132
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 14
      // 124: aload 1
      // 125: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/String;Ljava/util/List;)Z
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: ifeq 142
      // 132: aload 10
      // 134: aload 14
      // 136: aload 13
      // 138: invokestatic com/finalshell/core/Kp2.Z (Lcom/finalshell/core/X2;Ljava/lang/String;Ljava/util/zip/ZipEntry;)V
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: aload 4
      // 144: ifnull 0d4
      // 147: aload 12
      // 149: invokevirtual java/util/zip/ZipInputStream.close ()V
      // 14c: aload 11
      // 14e: areturn
      // 14f: goto 167
      // 152: astore 5
      // 154: ldc com/finalshell/core/Kp2
      // 156: aload 5
      // 158: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 15b: goto 167
      // 15e: astore 5
      // 160: ldc com/finalshell/core/Kp2
      // 162: aload 5
      // 164: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 167: aconst_null
      // 168: areturn
   }

   public static URL Z(java.lang.Class var0) {
      String var10000 = FV_2.D();
      CodeSource var2 = var0.getProtectionDomain().getCodeSource();
      String var1 = var10000;
      CodeSource var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      return var3.getLocation();
   }

   public static File j(java.lang.Class var0) {
      String var1 = FV_2.D();

      try {
         CodeSource var2 = var0.getProtectionDomain().getCodeSource();

         CodeSource var10000;
         label43: {
            try {
               var10000 = var2;
               if (var1 != null) {
                  break label43;
               }

               if (var2 == null) {
                  return null;
               }
            } catch (URISyntaxException var7) {
      ArrayList var9;
               throw a(var7);
            }

            var10000 = var2;
         }

         URL var3 = var10000.getLocation();
         URI var4 = var3.toURI();
         String var5 = var4.getScheme();

         label34: {
            try {
               var9 = var5;
               if (var1 != null) {
                  break label34;
               }

               if (var5 == null) {
                  return null;
               }
            } catch (URISyntaxException var6) {
               throw a(var6);
            }

            var9 = var5;
         }

         if (var9.equalsIgnoreCase(a(17787, 14400))) {
            return new File(var4);
         }
      } catch (URISyntaxException var8) {
         NE3.g(Kp2.class, var8);
      }

      return null;
   }

   public static boolean a(String var0, List var1) {
      String var2 = FV_2.D();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return (boolean)1;
         }

         var10000 = var1;
      }

      int var4 = var10000.size();
      if (var2 != null) {
         return (boolean)var4;
      } else if (var4 != 0) {
         String var3 = Cz2.G(var0, true).toLowerCase();
         return var1.contains(var3);
      } else {
         return (boolean)1;
      }
   }

   public static boolean n(String var0, List var1) {
      String var2 = FV_2.D();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000.size() == 0) {
            return true;
         }

         var10000 = var1;
      }

      Iterator var3 = var10000.iterator();

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var5 = var0.startsWith(var4);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public static void Z(X2 var0, String var1, ZipEntry var2) {
      String var10000 = FV_2.D();
      String[] var4 = var1.split("/");
      X2 var5 = var0;
      String var3 = var10000;
      int var6 = 0;

      while (var6 < var4.length) {
         label25: {
            if (var6 < var4.length - 1) {
               X2 var7 = var5.q(var4[var6]);
               X2 var9 = var7;
               if (var3 == null) {
                  if (var7 == null) {
                     var7 = new X2(com.finalshell.ui.model.L.packageEntry, var4[var6], var5);
                     var7.x(var2);
                     var5.C(var7);
                  }

                  var9 = var7;
               }

               var5 = var9;
               if (var3 == null) {
                  break label25;
               }
            }

            X2 var8 = new X2(G(var4[var6]), var4[var6], var5);
            var8.x(var2);
            var5.C(var8);
         }

         var6++;
         if (var3 != null) {
            break;
         }
      }
   }

   public static com.finalshell.ui.model.L G(String var0) {
      String var10000 = FV_2.D();
      String var2 = Cz2.G(var0, false);
      String var1 = var10000;
      boolean var3 = var2.equals(a(17762, -2695));
      if (var1 == null) {
         if (var3) {
            return com.finalshell.ui.model.L.javaEntry;
         }

         var3 = var2.equals(a(17788, -28730));
      }

      if (var1 == null) {
         if (var3) {
            return com.finalshell.ui.model.L.classEntry;
         }

         var3 = var2.isEmpty();
      }

      return !var3 ? com.finalshell.ui.model.L.fileEntry : com.finalshell.ui.model.L.packageEntry;
   }

   public static java.lang.Class v() {
      return d(1);
   }

   public static java.lang.Class d(int var0) {
      int var1 = 2 + var0;

      try {
         return (java.lang.Class)x(a(17764, -32669), a(17774, 23636), new Object[]{var1 + 3});
      } catch (Throwable var5) {
         try {
            return java.lang.Class.forName(new Throwable().getStackTrace()[var1].getClassName());
         } catch (ClassNotFoundException var4) {
            return null;
         }
      }
   }

   public static String c(Object var0) {
      return G(var0.getClass());
   }

   public static String G(java.lang.Class var0) {
      return c(var0) + a(17783, -2963);
   }

   public static String L(Object var0) {
      return O(var0.getClass());
   }

   public static String O(java.lang.Class var0) {
      return c(var0) + a(17765, 26482);
   }

   public static String E(Object var0) {
      return c(var0.getClass());
   }

   public static String c(java.lang.Class var0) {
      String var1 = var0.getCanonicalName();
      String var2 = var1 != null ? var1 : var0.toString();
      int var3 = var2.lastIndexOf(".");
      return var3 != -1 ? var2.substring(var3 + 1) : var2;
   }

   public static String[] U(Object var0) {
      return n(var0.getClass());
   }

   public static String[] n(java.lang.Class var0) {
      return K(var0.getPackage().getName());
   }

   public static String[] K(String var0) {
      return var0.split(a(17740, -30644));
   }

   public static java.lang.Class l(java.lang.Class var0, String var1) {
      for (java.lang.Class var5 : var0.getDeclaredClasses()) {
         if (c(var5).equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public static Object y(String var0, Object[] var1) {
      try {
         return w(var0, var1);
      } catch (Throwable var4) {
         Throwable var2 = var4;

         try {
            if (M) {
               NE3.j(a(17768, 28268), var2);
            }

            return null;
         } catch (Throwable var3) {
            throw a(var3);
         }
      }
   }

   public static Object w(String var0, Object[] var1) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
      return f(P(var0), var1);
   }

   public static Object U(java.lang.Class var0, Object[] var1) {
      try {
         return f(var0, var1);
      } catch (Throwable var4) {
         Throwable var2 = var4;

         try {
            if (M) {
               NE3.j(a(17777, 25618), var2);
            }

            return null;
         } catch (Throwable var3) {
            throw a(var3);
         }
      }
   }

   public static Object f(java.lang.Class var0, Object[] var1) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      java.lang.Class[] var2 = W(var1);
      Constructor var3 = W(var0, var2);
      var3.setAccessible(true);
      return var3.newInstance(var1);
   }

   public static Constructor W(java.lang.Class param0, java.lang.Class[] param1) throws NoSuchMethodException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: arraylength
      // 006: ifne 016
      // 009: aload 0
      // 00a: bipush 0
      // 00b: anewarray 126
      // 00e: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 011: areturn
      // 012: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual java/lang/Class.getDeclaredConstructors ()[Ljava/lang/reflect/Constructor;
      // 01a: astore 3
      // 01b: aload 3
      // 01c: arraylength
      // 01d: istore 4
      // 01f: bipush 0
      // 020: istore 5
      // 022: iload 5
      // 024: iload 4
      // 026: if_icmpge 0e8
      // 029: aload 3
      // 02a: iload 5
      // 02c: aaload
      // 02d: astore 6
      // 02f: aload 6
      // 031: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 034: astore 7
      // 036: aload 7
      // 038: arraylength
      // 039: aload 1
      // 03a: arraylength
      // 03b: aload 2
      // 03c: ifnonnull 06b
      // 03f: if_icmpeq 054
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 2
      // 04a: ifnull 0e1
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 7
      // 056: arraylength
      // 057: aload 2
      // 058: ifnonnull 08e
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: aload 1
      // 063: arraylength
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: if_icmpne 08d
      // 06e: aload 7
      // 070: arraylength
      // 071: aload 2
      // 072: ifnonnull 08e
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: ifne 08d
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 6
      // 088: areturn
      // 089: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: istore 8
      // 090: bipush 0
      // 091: istore 9
      // 093: iload 9
      // 095: aload 7
      // 097: arraylength
      // 098: if_icmpge 0d5
      // 09b: aload 7
      // 09d: iload 9
      // 09f: aaload
      // 0a0: aload 1
      // 0a1: iload 9
      // 0a3: aaload
      // 0a4: invokestatic com/finalshell/core/Kp2.d (Ljava/lang/Class;Ljava/lang/Class;)Z
      // 0a7: aload 2
      // 0a8: ifnonnull 0d7
      // 0ab: aload 2
      // 0ac: ifnonnull 0c1
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: ifne 0c7
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: istore 8
      // 0c3: aload 2
      // 0c4: ifnull 0d5
      // 0c7: iinc 9 1
      // 0ca: aload 2
      // 0cb: ifnull 093
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: iload 8
      // 0d7: ifeq 0e1
      // 0da: aload 6
      // 0dc: areturn
      // 0dd: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: iinc 5 1
      // 0e4: aload 2
      // 0e5: ifnull 022
      // 0e8: new java/lang/NoSuchMethodException
      // 0eb: dup
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: aload 0
      // 0f4: invokevirtual java/lang/Class.getCanonicalName ()Ljava/lang/String;
      // 0f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fa: aload 1
      // 0fb: invokestatic com/finalshell/core/Kp2.U ([Ljava/lang/Class;)Ljava/lang/String;
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 104: invokespecial java/lang/NoSuchMethodException.<init> (Ljava/lang/String;)V
      // 107: athrow
   }

   public static Object U(String var0, String var1, Object[] var2) {
      try {
         return x(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17786, -11913), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static Object x(String var0, String var1, Object[] var2) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
      return Q(e(var0), var1, var2);
   }

   public static Object W(java.lang.Class var0, String var1, Object[] var2) {
      try {
         return Q(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17789, -29668), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static Object Q(java.lang.Class var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var3 = r(var0, var1, var2);
      return var3.invoke(null, var2);
   }

   public static List S(List var0, String var1, Object[] var2) {
      try {
         return c(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17784, 8981), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static List c(List var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      String var10000 = FV_2.D();
      ArrayList var4 = new ArrayList();
      Iterator var5 = var0.iterator();
      String var3 = var10000;

      while (true) {
         if (var5.hasNext()) {
            Object var6 = var5.next();

            try {
               var8 = var4;
               if (var3 != null) {
                  break;
               }

               var4.add(j(var6, var1, var2));
               if (var3 == null) {
                  continue;
               }
            } catch (NoSuchMethodException var7) {
               throw a(var7);
            }
         }

         var8 = var4;
         break;
      }

      return var8;
   }

   public static Object[] e(Object[] var0, String var1, Object[] var2) {
      try {
         return E(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17785, 10139), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static Object[] E(Object[] var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Object[] var4 = new Object[var0.length];
      String var10000 = FV_2.D();
      int var5 = 0;
      String var3 = var10000;

      while (true) {
         if (var5 < var0.length) {
            try {
               var10000 = var4;
               if (var3 != null) {
                  break;
               }

               var4[var5] = j(var0[var5], var1, var2);
               var5++;
               if (var3 == null) {
                  continue;
               }
            } catch (NoSuchMethodException var6) {
               throw a(var6);
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   public static Object I(Object var0, String var1, Object[] var2) {
      try {
         return j(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17769, -5096), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static Object j(Object var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var3 = r(var0.getClass(), var1, var2);
      return var3.invoke(var0, var2);
   }

   public static Method i(Object var0, String var1) {
      return P$Method(var0.getClass(), var1);
   }

   public static Method P$Method(java.lang.Class var0, String var1) {
      String var10000 = FV_2.D();
      Method var3 = H(var0, N(var1), new Object[0]);
      String var2 = var10000;
      Method var5 = var3;
      if (var2 == null) {
         if (var3 != null) {
            return var3;
         }

         var5 = H(var0, q(var1), new Object[0]);
      }

      Method var4 = var5;
      Method var6 = var4;
      if (var2 == null) {
         var6 = var4 != null ? var4 : null;
      }

      return var6;
   }

   public static String W(String var0) {
      return a(17770, -16318) + var0.substring(0, 1).toUpperCase(Locale.ENGLISH) + var0.substring(1);
   }

   public static String N(String var0) {
      return a(17771, 9429) + var0.substring(0, 1).toUpperCase(Locale.ENGLISH) + var0.substring(1);
   }

   public static String q(String var0) {
      return a(17766, -23179) + var0.substring(0, 1).toUpperCase(Locale.ENGLISH) + var0.substring(1);
   }

   public static Method Y(Object var0, String var1, Object[] var2) {
      return H(var0.getClass(), var1, var2);
   }

   public static Method H(java.lang.Class var0, String var1, Object[] var2) {
      try {
         return r(var0, var1, var2);
      } catch (Throwable var5) {
         Throwable var3 = var5;

         try {
            if (M) {
               NE3.j(a(17781, -9377), var3);
            }

            return null;
         } catch (Throwable var4) {
            throw a(var4);
         }
      }
   }

   public static Method R(Object var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      return r(var0.getClass(), var1, var2);
   }

   public static Method r(java.lang.Class var0, String var1, Object[] var2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      java.lang.Class[] var3 = W(var2);
      String var4 = var0.getCanonicalName() + "." + var1 + U(var3);
      Method var5 = null;
      Object var6 = (Map)t.get(var0);
      if (var6 != null) {
         var5 = (Method)var6.get(var4);
      } else {
         var6 = new HashMap(1);
         t.put(var0, var6);
      }

      if (var5 == null) {
         var5 = e(var0, var1, var2);
         var6.put(var4, var5);
      }

      return var5;
   }

   protected static Method e(java.lang.Class var0, String var1, Object[] var2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      java.lang.Class[] var3 = W(var2);
      Method var4 = j(var0, var0, var1, var3);
      var4.setAccessible(true);
      return var4;
   }

   public static Method j(java.lang.Class var0, java.lang.Class var1, String var2, java.lang.Class[] var3) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      for (Method var7 : var1.getDeclaredMethods()) {
         if (var7.getName().equals(var2)) {
            java.lang.Class[] var8 = var7.getParameterTypes();
            if (var8.length == var3.length) {
               boolean var9 = true;
               int var10 = 0;

               label52: {
                  while (true) {
                     try {
                        if (var10 >= var8.length) {
                           break label52;
                        }

                        if (!d(var8[var10], var3[var10])) {
                           break;
                        }
                     } catch (IllegalAccessException var13) {
                        throw a(var13);
                     }

                     var10++;
                  }

                  var9 = false;
               }

               try {
                  if (var9) {
                     return var7;
                  }
               } catch (IllegalAccessException var11) {
                  throw a(var11);
               }
            }
         }
      }

      java.lang.Class var14 = var1.getSuperclass();

      try {
         if (var14 != null) {
            return j(var0, var14, var2, var3);
         }
      } catch (IllegalAccessException var12) {
         throw a(var12);
      }

      throw new NoSuchMethodException(var0.getCanonicalName() + "." + var2 + U(var3));
   }

   public static String U(java.lang.Class[] var0) {
      StringBuilder var1 = new StringBuilder("(");
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var2 > 0) {
               var1.append(a(17778, -21950));
            }

            java.lang.Class var3 = var0[var2];
            var1.append(var3 == null ? a(17763, 16092) : var3.getCanonicalName());
         }
      }

      return var1.append(")").toString();
   }

   public static Cloneable L(Cloneable param0) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 2d
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: sipush 17773
      // 1d: sipush -13960
      // 20: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 23: bipush 0
      // 24: anewarray 4
      // 27: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast java/lang/Cloneable
      // 2d: areturn
   }

   public static Cloneable E(Cloneable var0) {
      String var1 = FV_2.D();
      Cloneable var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = (Cloneable)I(var0, a(17741, 22552), new Object[0]);
      }

      return var10000;
   }

   public static Object J(Object param0) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 2a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Kp2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: sipush 17741
      // 1d: sipush 22552
      // 20: invokestatic com/finalshell/core/Kp2.a (II)Ljava/lang/String;
      // 23: bipush 0
      // 24: anewarray 4
      // 27: invokestatic com/finalshell/core/Kp2.j (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: areturn
   }

   public static Object S(Object var0) {
      String var1 = FV_2.D();
      Object var10000 = var0;
      if (var1 == null) {
         if (var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      var10000 = var10000.getClass();
      if (var1 == null) {
         if (var10000.isPrimitive()) {
            return var0;
         }

         var10000 = I(var0, a(17741, 22552), new Object[0]);
      }

      return var10000;
   }

   public static java.lang.Class P(String var0) throws ClassNotFoundException {
      return Kp2.class.getClassLoader().loadClass(var0);
   }

   public static java.lang.Class[] W(Object[] var0) {
      java.lang.Class[] var1 = new java.lang.Class[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2] != null ? var0[var2].getClass() : null;
      }

      return var1;
   }

   public static boolean d(java.lang.Class var0, java.lang.Class var1) {
      if (var1 == null) {
         return !var0.isPrimitive();
      } else if (var0.isAssignableFrom(var1)) {
         return true;
      } else {
         if (var0.isPrimitive()) {
            if (var0 == boolean.class) {
               return Boolean.class.isAssignableFrom(var1);
            }

            if (var0 == int.class) {
               return Integer.class.isAssignableFrom(var1);
            }

            if (var0 == char.class) {
               return Character.class.isAssignableFrom(var1);
            }

            if (var0 == byte.class) {
               return Byte.class.isAssignableFrom(var1);
            }

            if (var0 == short.class) {
               return Short.class.isAssignableFrom(var1);
            }

            if (var0 == long.class) {
               return Long.class.isAssignableFrom(var1);
            }

            if (var0 == float.class) {
               return Float.class.isAssignableFrom(var1);
            }

            if (var0 == double.class) {
               return Double.class.isAssignableFrom(var1);
            }

            if (var0 == void.class) {
               return Void.class.isAssignableFrom(var1);
            }
         }

         return false;
      }
   }

   public static boolean S(java.lang.Class var0, String var1) {
      String var2 = FV_2.D();
      java.lang.Class var10000 = var0;
      if (var2 == null) {
         if (var0 == null) {
            return false;
         }

         var10000 = var0;
      }

      String var3 = var10000.getCanonicalName();
      String var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return S(var0.getSuperclass(), var1);
         }

         var4 = var3;
      }

      boolean var5 = var4.contains(var1);
      if (var2 == null) {
         if (!var5) {
            boolean var6 = S(var0.getSuperclass(), var1);
            if (var2 != null) {
               return var6;
            }

            if (!var6) {
               return false;
            }
         }

         var5 = true;
      }

      return var5;
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 17772) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 209;
               break;
            case 1:
               var10000 = 238;
               break;
            case 2:
               var10000 = 10;
               break;
            case 3:
               var10000 = 232;
               break;
            case 4:
               var10000 = 249;
               break;
            case 5:
               var10000 = 235;
               break;
            case 6:
               var10000 = 76;
               break;
            case 7:
               var10000 = 68;
               break;
            case 8:
               var10000 = 103;
               break;
            case 9:
               var10000 = 65;
               break;
            case 10:
               var10000 = 84;
               break;
            case 11:
               var10000 = 98;
               break;
            case 12:
               var10000 = 195;
               break;
            case 13:
               var10000 = 146;
               break;
            case 14:
               var10000 = 199;
               break;
            case 15:
               var10000 = 26;
               break;
            case 16:
               var10000 = 109;
               break;
            case 17:
               var10000 = 92;
               break;
            case 18:
               var10000 = 34;
               break;
            case 19:
               var10000 = 167;
               break;
            case 20:
               var10000 = 219;
               break;
            case 21:
               var10000 = 55;
               break;
            case 22:
               var10000 = 154;
               break;
            case 23:
               var10000 = 51;
               break;
            case 24:
               var10000 = 27;
               break;
            case 25:
               var10000 = 133;
               break;
            case 26:
               var10000 = 59;
               break;
            case 27:
               var10000 = 151;
               break;
            case 28:
               var10000 = 8;
               break;
            case 29:
               var10000 = 140;
               break;
            case 30:
               var10000 = 176;
               break;
            case 31:
               var10000 = 177;
               break;
            case 32:
               var10000 = 1;
               break;
            case 33:
               var10000 = 62;
               break;
            case 34:
               var10000 = 31;
               break;
            case 35:
               var10000 = 201;
               break;
            case 36:
               var10000 = 242;
               break;
            case 37:
               var10000 = 99;
               break;
            case 38:
               var10000 = 66;
               break;
            case 39:
               var10000 = 237;
               break;
            case 40:
               var10000 = 125;
               break;
            case 41:
               var10000 = 117;
               break;
            case 42:
               var10000 = 214;
               break;
            case 43:
               var10000 = 210;
               break;
            case 44:
               var10000 = 104;
               break;
            case 45:
               var10000 = 126;
               break;
            case 46:
               var10000 = 239;
               break;
            case 47:
               var10000 = 179;
               break;
            case 48:
               var10000 = 218;
               break;
            case 49:
               var10000 = 191;
               break;
            case 50:
               var10000 = 189;
               break;
            case 51:
               var10000 = 101;
               break;
            case 52:
               var10000 = 11;
               break;
            case 53:
               var10000 = 194;
               break;
            case 54:
               var10000 = 198;
               break;
            case 55:
               var10000 = 88;
               break;
            case 56:
               var10000 = 54;
               break;
            case 57:
               var10000 = 13;
               break;
            case 58:
               var10000 = 159;
               break;
            case 59:
               var10000 = 156;
               break;
            case 60:
               var10000 = 113;
               break;
            case 61:
               var10000 = 174;
               break;
            case 62:
               var10000 = 212;
               break;
            case 63:
               var10000 = 67;
               break;
            case 64:
               var10000 = 3;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 57;
               break;
            case 67:
               var10000 = 228;
               break;
            case 68:
               var10000 = 225;
               break;
            case 69:
               var10000 = 79;
               break;
            case 70:
               var10000 = 47;
               break;
            case 71:
               var10000 = 206;
               break;
            case 72:
               var10000 = 75;
               break;
            case 73:
               var10000 = 83;
               break;
            case 74:
               var10000 = 186;
               break;
            case 75:
               var10000 = 87;
               break;
            case 76:
               var10000 = 215;
               break;
            case 77:
               var10000 = 53;
               break;
            case 78:
               var10000 = 241;
               break;
            case 79:
               var10000 = 153;
               break;
            case 80:
               var10000 = 22;
               break;
            case 81:
               var10000 = 166;
               break;
            case 82:
               var10000 = 163;
               break;
            case 83:
               var10000 = 147;
               break;
            case 84:
               var10000 = 44;
               break;
            case 85:
               var10000 = 184;
               break;
            case 86:
               var10000 = 43;
               break;
            case 87:
               var10000 = 150;
               break;
            case 88:
               var10000 = 240;
               break;
            case 89:
               var10000 = 251;
               break;
            case 90:
               var10000 = 16;
               break;
            case 91:
               var10000 = 37;
               break;
            case 92:
               var10000 = 160;
               break;
            case 93:
               var10000 = 93;
               break;
            case 94:
               var10000 = 207;
               break;
            case 95:
               var10000 = 124;
               break;
            case 96:
               var10000 = 170;
               break;
            case 97:
               var10000 = 82;
               break;
            case 98:
               var10000 = 221;
               break;
            case 99:
               var10000 = 15;
               break;
            case 100:
               var10000 = 20;
               break;
            case 101:
               var10000 = 18;
               break;
            case 102:
               var10000 = 107;
               break;
            case 103:
               var10000 = 28;
               break;
            case 104:
               var10000 = 213;
               break;
            case 105:
               var10000 = 114;
               break;
            case 106:
               var10000 = 181;
               break;
            case 107:
               var10000 = 4;
               break;
            case 108:
               var10000 = 94;
               break;
            case 109:
               var10000 = 69;
               break;
            case 110:
               var10000 = 105;
               break;
            case 111:
               var10000 = 250;
               break;
            case 112:
               var10000 = 200;
               break;
            case 113:
               var10000 = 137;
               break;
            case 114:
               var10000 = 78;
               break;
            case 115:
               var10000 = 197;
               break;
            case 116:
               var10000 = 211;
               break;
            case 117:
               var10000 = 236;
               break;
            case 118:
               var10000 = 145;
               break;
            case 119:
               var10000 = 25;
               break;
            case 120:
               var10000 = 253;
               break;
            case 121:
               var10000 = 164;
               break;
            case 122:
               var10000 = 85;
               break;
            case 123:
               var10000 = 119;
               break;
            case 124:
               var10000 = 32;
               break;
            case 125:
               var10000 = 14;
               break;
            case 126:
               var10000 = 100;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 9;
               break;
            case 129:
               var10000 = 157;
               break;
            case 130:
               var10000 = 245;
               break;
            case 131:
               var10000 = 132;
               break;
            case 132:
               var10000 = 123;
               break;
            case 133:
               var10000 = 136;
               break;
            case 134:
               var10000 = 23;
               break;
            case 135:
               var10000 = 169;
               break;
            case 136:
               var10000 = 224;
               break;
            case 137:
               var10000 = 155;
               break;
            case 138:
               var10000 = 58;
               break;
            case 139:
               var10000 = 42;
               break;
            case 140:
               var10000 = 29;
               break;
            case 141:
               var10000 = 19;
               break;
            case 142:
               var10000 = 56;
               break;
            case 143:
               var10000 = 247;
               break;
            case 144:
               var10000 = 129;
               break;
            case 145:
               var10000 = 2;
               break;
            case 146:
               var10000 = 122;
               break;
            case 147:
               var10000 = 244;
               break;
            case 148:
               var10000 = 0;
               break;
            case 149:
               var10000 = 208;
               break;
            case 150:
               var10000 = 102;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 134;
               break;
            case 153:
               var10000 = 171;
               break;
            case 154:
               var10000 = 152;
               break;
            case 155:
               var10000 = 231;
               break;
            case 156:
               var10000 = 111;
               break;
            case 157:
               var10000 = 175;
               break;
            case 158:
               var10000 = 46;
               break;
            case 159:
               var10000 = 71;
               break;
            case 160:
               var10000 = 74;
               break;
            case 161:
               var10000 = 243;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 185;
               break;
            case 164:
               var10000 = 192;
               break;
            case 165:
               var10000 = 120;
               break;
            case 166:
               var10000 = 115;
               break;
            case 167:
               var10000 = 7;
               break;
            case 168:
               var10000 = 61;
               break;
            case 169:
               var10000 = 183;
               break;
            case 170:
               var10000 = 248;
               break;
            case 171:
               var10000 = 41;
               break;
            case 172:
               var10000 = 110;
               break;
            case 173:
               var10000 = 135;
               break;
            case 174:
               var10000 = 220;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 233;
               break;
            case 177:
               var10000 = 128;
               break;
            case 178:
               var10000 = 108;
               break;
            case 179:
               var10000 = 127;
               break;
            case 180:
               var10000 = 196;
               break;
            case 181:
               var10000 = 204;
               break;
            case 182:
               var10000 = 131;
               break;
            case 183:
               var10000 = 162;
               break;
            case 184:
               var10000 = 149;
               break;
            case 185:
               var10000 = 91;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 255;
               break;
            case 188:
               var10000 = 205;
               break;
            case 189:
               var10000 = 121;
               break;
            case 190:
               var10000 = 226;
               break;
            case 191:
               var10000 = 6;
               break;
            case 192:
               var10000 = 12;
               break;
            case 193:
               var10000 = 203;
               break;
            case 194:
               var10000 = 50;
               break;
            case 195:
               var10000 = 188;
               break;
            case 196:
               var10000 = 49;
               break;
            case 197:
               var10000 = 106;
               break;
            case 198:
               var10000 = 40;
               break;
            case 199:
               var10000 = 217;
               break;
            case 200:
               var10000 = 96;
               break;
            case 201:
               var10000 = 33;
               break;
            case 202:
               var10000 = 38;
               break;
            case 203:
               var10000 = 216;
               break;
            case 204:
               var10000 = 77;
               break;
            case 205:
               var10000 = 193;
               break;
            case 206:
               var10000 = 17;
               break;
            case 207:
               var10000 = 89;
               break;
            case 208:
               var10000 = 35;
               break;
            case 209:
               var10000 = 230;
               break;
            case 210:
               var10000 = 24;
               break;
            case 211:
               var10000 = 246;
               break;
            case 212:
               var10000 = 143;
               break;
            case 213:
               var10000 = 73;
               break;
            case 214:
               var10000 = 72;
               break;
            case 215:
               var10000 = 222;
               break;
            case 216:
               var10000 = 95;
               break;
            case 217:
               var10000 = 165;
               break;
            case 218:
               var10000 = 229;
               break;
            case 219:
               var10000 = 52;
               break;
            case 220:
               var10000 = 21;
               break;
            case 221:
               var10000 = 141;
               break;
            case 222:
               var10000 = 118;
               break;
            case 223:
               var10000 = 182;
               break;
            case 224:
               var10000 = 80;
               break;
            case 225:
               var10000 = 97;
               break;
            case 226:
               var10000 = 252;
               break;
            case 227:
               var10000 = 116;
               break;
            case 228:
               var10000 = 39;
               break;
            case 229:
               var10000 = 161;
               break;
            case 230:
               var10000 = 90;
               break;
            case 231:
               var10000 = 63;
               break;
            case 232:
               var10000 = 223;
               break;
            case 233:
               var10000 = 138;
               break;
            case 234:
               var10000 = 180;
               break;
            case 235:
               var10000 = 158;
               break;
            case 236:
               var10000 = 139;
               break;
            case 237:
               var10000 = 202;
               break;
            case 238:
               var10000 = 30;
               break;
            case 239:
               var10000 = 168;
               break;
            case 240:
               var10000 = 45;
               break;
            case 241:
               var10000 = 178;
               break;
            case 242:
               var10000 = 64;
               break;
            case 243:
               var10000 = 48;
               break;
            case 244:
               var10000 = 81;
               break;
            case 245:
               var10000 = 148;
               break;
            case 246:
               var10000 = 5;
               break;
            case 247:
               var10000 = 190;
               break;
            case 248:
               var10000 = 227;
               break;
            case 249:
               var10000 = 36;
               break;
            case 250:
               var10000 = 112;
               break;
            case 251:
               var10000 = 144;
               break;
            case 252:
               var10000 = 187;
               break;
            case 253:
               var10000 = 130;
               break;
            case 254:
               var10000 = 254;
               break;
            default:
               var10000 = 142;
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
      String[] var5 = new String[35];
      int var3 = 0;
      String var2 = "\u0099üÏ·Y\\=¥\u0081\u001cj;óZ\u00019Òë\u0081ô\u000e×ÐöÒrSÄ§Ø¾\u008cùF\u001b\u0013;ÈGÁIcY[!N\u0014ÉïÁ\u0005ë\u000f\u009fã{\u000e©\u0089H6ý©5ù\u00867\rÃ\u001bí\b\búÖÀïí\u0090Ô3®¡)\u001c\u0085)¦\u000bòÉ\u0004\u0081>\r¸Óå¶g_Ò¢KX¡§=~j\u008f\u0007bÙ\u000eÍ4\"·n\u008a2\u0086\u009aM\u0017x%x'\u0081ç/\u0014Í~\u0091o\u0098û=Y\u000fqY\u0090\u0016m°_Ú0Ò8\u0013\u0016n\naH¦Ä\u0094Ò\u0001pk\u0084\u0089§#Ø\u009e2©\u0087ÙZp\u0094\u0003õ[U\u0003¶ÿ«\u0016)0Ô~$iuÀÒ\u0018jMÍ\u008c\u008f\u0087¼ÿE±\u0096T\u00068Z\u0002¨½\u0003\u0002F\u0096-¦Ã(P¥ ¢:rï\u0014E<\u0095øÀíÔf\u0013ò+Oi!\u0081-ºh\u0017GuÆyùñÆ.kä9hGxÚ2\u009c\ro\u0089M\u009b¿]Ñ\u0003`Ø²&)¶×\u001a!Ê\u001a\u0010R\u000e\u0082mY'æ¤\u0096\u0007õ¨\u009aº\u0001eáüÿ\u001c\u001a¢z¥\u007f´\u0082n\u0007û\u009d\u0016\u0016\u0000+a\u0004\u008f\u0002\"á\u0004ß\\¶±\u0005Ñ\u00adÖª\u008b5\u0099äÏ´Y<=©\u0081\u009dj\u000bó\\\u0001ùÒó\u0081÷\u000e·ÐúÒóSô§Þ¾HýB5²\u0080\u008c\u0013ÚÓùX\u001c(\u009bk\u008aOFr\u008cs\u0016\u0098ï\u0099;\u008bíF¾¤¹¦Û}\u009a\u0083 ºçªêÙ(\u0004zûKx0\u0004;|O/CóFX`Q´\u0094«í\u0007O,2\fxÈ\u001e\u0015\u000b\u000ehKÀ)R¶`\u009d\u0086WçøÐå3æ\u0095\u0013oÇD`0\u0013\u008a\u009eys\u0085x\u009e){\u007f×QÇU\u008aX\u009dÐ:$\u000e\u0095Íz\u0015F(\u0005Eê;w,da»>[=Bý»pª«üí5\u0097À\u000e0a¬:»aßvCpUqØÜ×@s6'×è2±O¼$×Îiófô6¸\u001c\u0014È3»DT«\u0092\u001b«Ab³\bK\u0004öÛ\u009a×-\t\u0002Ýh\u001b§uÚ\u0088óKÆ×å\u0085ÎB\u0015\u0093+L,\u0098\u0089Û\u009dr9\u0083g:{i¸\tÌy3\u000f»@\u0083h\u0005?.ÁHÄ!8\u008e\u0011ÿ\u0004WÚRåwÃ\u009c\u008a_\u008abo\u0005ü¬W9ã\u00ad±õ|)¡ò\u001b\u0089@\u0012\u0010,û§hoIÐ8Ä-d\u008d,\u001b\u0093MT\u0001Ð\u0098¤.ë·\u008f:*Î{\u0090~\u001e\u0007oégð¬T\u0002¤\u0097¥4_\u008aB§b9ï¼Ò\u00ad¼m\u0004a»\u0006¥\u0087Zë\u0005C¤`HO\u0004ú¿\u001b[3Î1%\u000e\u0004k\u0096CôÀÄ &)»W\u0085&kMSà{\u0010§®ý_r«\u0004æ¹\u009eÁ&£õ^Â4\u008fZl\u000f\\&üG\u0011ë\u0002\u0092<2\u0002\u008b¼Y7\u0081ð\u001e8k]Õ\u0015\u0087Ý\u0082I\u009cò\u001a`\n\u001dMk\u0005d*A\u0005b#b%h\u007fUE\u008apðUn\u009dÇ\u0096ÈÒt¢\u0002 $";
      int var4 = "\u0099üÏ·Y\\=¥\u0081\u001cj;óZ\u00019Òë\u0081ô\u000e×ÐöÒrSÄ§Ø¾\u008cùF\u001b\u0013;ÈGÁIcY[!N\u0014ÉïÁ\u0005ë\u000f\u009fã{\u000e©\u0089H6ý©5ù\u00867\rÃ\u001bí\b\búÖÀïí\u0090Ô3®¡)\u001c\u0085)¦\u000bòÉ\u0004\u0081>\r¸Óå¶g_Ò¢KX¡§=~j\u008f\u0007bÙ\u000eÍ4\"·n\u008a2\u0086\u009aM\u0017x%x'\u0081ç/\u0014Í~\u0091o\u0098û=Y\u000fqY\u0090\u0016m°_Ú0Ò8\u0013\u0016n\naH¦Ä\u0094Ò\u0001pk\u0084\u0089§#Ø\u009e2©\u0087ÙZp\u0094\u0003õ[U\u0003¶ÿ«\u0016)0Ô~$iuÀÒ\u0018jMÍ\u008c\u008f\u0087¼ÿE±\u0096T\u00068Z\u0002¨½\u0003\u0002F\u0096-¦Ã(P¥ ¢:rï\u0014E<\u0095øÀíÔf\u0013ò+Oi!\u0081-ºh\u0017GuÆyùñÆ.kä9hGxÚ2\u009c\ro\u0089M\u009b¿]Ñ\u0003`Ø²&)¶×\u001a!Ê\u001a\u0010R\u000e\u0082mY'æ¤\u0096\u0007õ¨\u009aº\u0001eáüÿ\u001c\u001a¢z¥\u007f´\u0082n\u0007û\u009d\u0016\u0016\u0000+a\u0004\u008f\u0002\"á\u0004ß\\¶±\u0005Ñ\u00adÖª\u008b5\u0099äÏ´Y<=©\u0081\u009dj\u000bó\\\u0001ùÒó\u0081÷\u000e·ÐúÒóSô§Þ¾HýB5²\u0080\u008c\u0013ÚÓùX\u001c(\u009bk\u008aOFr\u008cs\u0016\u0098ï\u0099;\u008bíF¾¤¹¦Û}\u009a\u0083 ºçªêÙ(\u0004zûKx0\u0004;|O/CóFX`Q´\u0094«í\u0007O,2\fxÈ\u001e\u0015\u000b\u000ehKÀ)R¶`\u009d\u0086WçøÐå3æ\u0095\u0013oÇD`0\u0013\u008a\u009eys\u0085x\u009e){\u007f×QÇU\u008aX\u009dÐ:$\u000e\u0095Íz\u0015F(\u0005Eê;w,da»>[=Bý»pª«üí5\u0097À\u000e0a¬:»aßvCpUqØÜ×@s6'×è2±O¼$×Îiófô6¸\u001c\u0014È3»DT«\u0092\u001b«Ab³\bK\u0004öÛ\u009a×-\t\u0002Ýh\u001b§uÚ\u0088óKÆ×å\u0085ÎB\u0015\u0093+L,\u0098\u0089Û\u009dr9\u0083g:{i¸\tÌy3\u000f»@\u0083h\u0005?.ÁHÄ!8\u008e\u0011ÿ\u0004WÚRåwÃ\u009c\u008a_\u008abo\u0005ü¬W9ã\u00ad±õ|)¡ò\u001b\u0089@\u0012\u0010,û§hoIÐ8Ä-d\u008d,\u001b\u0093MT\u0001Ð\u0098¤.ë·\u008f:*Î{\u0090~\u001e\u0007oégð¬T\u0002¤\u0097¥4_\u008aB§b9ï¼Ò\u00ad¼m\u0004a»\u0006¥\u0087Zë\u0005C¤`HO\u0004ú¿\u001b[3Î1%\u000e\u0004k\u0096CôÀÄ &)»W\u0085&kMSà{\u0010§®ý_r«\u0004æ¹\u009eÁ&£õ^Â4\u008fZl\u000f\\&üG\u0011ë\u0002\u0092<2\u0002\u008b¼Y7\u0081ð\u001e8k]Õ\u0015\u0087Ý\u0082I\u009cò\u001a`\n\u001dMk\u0005d*A\u0005b#b%h\u007fUE\u008apðUn\u009dÇ\u0096ÈÒt¢\u0002 $"
         .length();
      char var1 = '2';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 59;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 69;
                        break;
                     case 2:
                        var46 = 49;
                        break;
                     case 3:
                        var46 = 121;
                        break;
                     case 4:
                        var46 = 21;
                        break;
                     case 5:
                        var46 = 91;
                        break;
                     default:
                        var46 = 85;
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
                     b = new String[35];
                     M = false;
                     t = new HashMap();
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

                  var2 = "H=\u0011_P1C²n\u0084\u0097À\u001eÌ\u001fËC;, \u0000\u009c\b¥ ÇÀKó\u009fL¥zÄx\"¿)#\bº õTdªÏªx1ß\u000eFÕ)";
                  var4 = "H=\u0011_P1C²n\u0084\u0097À\u001eÌ\u001fËC;, \u0000\u009c\b¥ ÇÀKó\u009fL¥zÄx\"¿)#\bº õTdªÏªx1ß\u000eFÕ)".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}






