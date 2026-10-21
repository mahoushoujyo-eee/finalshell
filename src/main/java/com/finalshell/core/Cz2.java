package com.finalshell.core;

import com.finalshell.ui.listener.RK3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.JTextComponent;

public final class Cz2 {
   public static ImageIcon p;
   public static FileSystemView W;
   public static SimpleDateFormat k;
   public static char[] R;
   public static Map K;
   public static Map x;
   public static Map j;
   public static Map w;
   public static Map M;
   public static Map E;
   public static Map A;
   public static Map Y;
   public static Map f;
   public static Map e;
   public static Map N;
   public static Object z;
   public static Map D;
   public static Map S;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] g;
   public static Long[] h;

   public static void s(File[] param0) {
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
      // 06: ifnonnull 14
      // 09: ifnull 4a
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: ifnonnull 2b
      // 18: arraylength
      // 19: ifle 4a
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: astore 2
      // 2c: aload 2
      // 2d: arraylength
      // 2e: istore 3
      // 2f: bipush 0
      // 30: istore 4
      // 32: iload 4
      // 34: iload 3
      // 35: if_icmpge 4a
      // 38: aload 2
      // 39: iload 4
      // 3b: aaload
      // 3c: astore 5
      // 3e: aload 5
      // 40: invokestatic com/finalshell/core/Cz2.U (Ljava/io/File;)V
      // 43: iinc 4 1
      // 46: aload 1
      // 47: ifnull 32
      // 4a: return
   }

   public static void U(File var0) {
      String var1 = FV_2.D();

      File var10000;
      label20: {
         try {
            var10000 = var0;
            if (var1 != null) {
               break label20;
            }

            if (var0 == null) {
               return;
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }

         var10000 = var0;
      }

      X(var10000.getAbsolutePath());
   }

   public static void X(String var0) {
      W$void(var0);
      G(var0);
      p(var0);
      s(var0);
      q(var0);
      V(var0);
      E(var0);
      j$void(var0);
      C(var0);
      A(var0);
      c(var0);
   }

   public static List c(File var0) {
      ArrayList var3;
      String var10000 = FV_2.D();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;

      while (true) {
         if (var0 != null) {
            var3 = var2;
            if (var1 != null) {
               break;
            }

            var2.add(0, var0);
            var0 = var0.getParentFile();
            if (var1 == null) {
               continue;
            }
         }

         var3 = var2;
         break;
      }

      return var3;
   }

   public static String w$String(File var0, File var1) {
      return var1.toURI().relativize(var0.toURI()).getPath();
   }

   public static boolean J(File param0) {
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
      // 05: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 08: aload 1
      // 09: ifnonnull 17
      // 0c: ifnull 48
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/io/File.canWrite ()Z
      // 1a: aload 1
      // 1b: ifnonnull 36
      // 1e: ifeq 48
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 2c: invokevirtual java/io/File.canWrite ()Z
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 1
      // 37: ifnonnull 45
      // 3a: ifeq 48
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: bipush 1
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
   }

   public static void D(JTextComponent param0, File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 0
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 35
      // 0f: invokevirtual javax/swing/text/JTextComponent.setText (Ljava/lang/String;)V
      // 12: aload 0
      // 13: bipush 0
      // 14: invokevirtual javax/swing/text/JTextComponent.setSelectionStart (I)V
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual java/io/File.isDirectory ()Z
      // 1c: ifeq 31
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 3
      // 27: invokevirtual java/lang/String.length ()I
      // 2a: goto 38
      // 2d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 3
      // 32: invokestatic com/finalshell/core/Cz2.Z (Ljava/lang/String;)Ljava/lang/String;
      // 35: invokevirtual java/lang/String.length ()I
      // 38: invokevirtual javax/swing/text/JTextComponent.setSelectionEnd (I)V
      // 3b: return
   }

   public static File G() {
      return new File(x$String());
   }

   public static String x$String() {
      return System.getProperty(a(-7681, -1214));
   }

   public static boolean u(File var0) {
      try {
         return var0.setExecutable(true, false);
      } catch (Throwable var2) {
         NE3.g(Cz2.class, var2);
         return false;
      }
   }

   public static File M(File param0) {
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
      // 06: ifnonnull 1e
      // 09: ifnull 21
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: goto 22
      // 21: aload 0
      // 22: areturn
      // 23: astore 2
      // 24: aload 0
      // 25: areturn
   }

   public static File f$File() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: invokestatic com/finalshell/core/Cz2.B ()[Ljava/io/File;
      // 06: astore 1
      // 07: astore 0
      // 08: aload 1
      // 09: aload 0
      // 0a: ifnonnull 20
      // 0d: arraylength
      // 0e: ifle 25
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: aaload
      // 22: goto 26
      // 25: aconst_null
      // 26: areturn
   }

   public static File[] B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/Cz2.W Ljavax/swing/filechooser/FileSystemView;
      // 06: invokevirtual javax/swing/filechooser/FileSystemView.getRoots ()[Ljava/io/File;
      // 09: astore 1
      // 0a: astore 0
      // 0b: aload 1
      // 0c: aload 0
      // 0d: ifnonnull 3a
      // 10: ifnull 37
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 0
      // 1c: ifnonnull 3a
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: arraylength
      // 27: ifle 37
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 1
      // 32: areturn
      // 33: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: invokestatic com/finalshell/core/Cz2.z ()[Ljava/io/File;
      // 3a: areturn
   }

   public static File[] z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: invokestatic java/io/File.listRoots ()[Ljava/io/File;
      // 06: astore 1
      // 07: astore 0
      // 08: bipush 0
      // 09: istore 2
      // 0a: aload 1
      // 0b: astore 3
      // 0c: aload 3
      // 0d: arraylength
      // 0e: istore 4
      // 10: bipush 0
      // 11: istore 5
      // 13: iload 5
      // 15: iload 4
      // 17: if_icmpge 48
      // 1a: aload 3
      // 1b: iload 5
      // 1d: aaload
      // 1e: astore 6
      // 20: aload 0
      // 21: ifnonnull 44
      // 24: aload 6
      // 26: invokestatic com/finalshell/core/Cz2.z (Ljava/io/File;)Z
      // 29: aload 0
      // 2a: ifnonnull 4e
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: ifeq 41
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: iinc 2 1
      // 41: iinc 5 1
      // 44: aload 0
      // 45: ifnull 13
      // 48: iload 2
      // 49: anewarray 61
      // 4c: astore 3
      // 4d: bipush 0
      // 4e: istore 4
      // 50: aload 1
      // 51: astore 5
      // 53: aload 5
      // 55: arraylength
      // 56: istore 6
      // 58: bipush 0
      // 59: istore 7
      // 5b: iload 7
      // 5d: iload 6
      // 5f: if_icmpge 97
      // 62: aload 5
      // 64: aload 0
      // 65: ifnonnull 98
      // 68: iload 7
      // 6a: aaload
      // 6b: astore 8
      // 6d: aload 0
      // 6e: ifnonnull 93
      // 71: aload 8
      // 73: invokestatic com/finalshell/core/Cz2.z (Ljava/io/File;)Z
      // 76: ifeq 90
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 3
      // 81: iload 4
      // 83: aload 8
      // 85: aastore
      // 86: iinc 4 1
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: iinc 7 1
      // 93: aload 0
      // 94: ifnull 5b
      // 97: aload 3
      // 98: areturn
   }

   public static File[] w(File var0, On2 var1) {
      return k(var0, new Eq2(var1));
   }

   public static File[] k(File var0, FileFilter var1) {
      String var10000 = FV_2.D();
      File[] var3 = var0.listFiles(var1);
      String var2 = var10000;

      try {
         if (var2 != null) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return new File[0];
   }

   public static String h(File var0) {
      return v(var0, a(25117, 2398101724558223259L));
   }

   public static String v(File var0, int var1) {
      try {
         return H(new FileInputStream(var0), var1);
      } catch (FileNotFoundException var3) {
         return null;
      }
   }

   public static String v(InputStream var0) {
      return H(var0, a(29007, 5209399603526169830L));
   }

   public static String H(InputStream var0, int var1) {
      BufferedInputStream var3;
      BigInteger var8;
      String var10000 = FV_2.D();
      var3 = new BufferedInputStream(var0);
      String var2 = var10000;

      Object var5;
      try {
         MessageDigest var4 = MessageDigest.getInstance(a(-7706, -727));
         byte[] var23 = new byte[var1];

         label80: {
            int var6;
            while ((var6 = var3.read(var23, 0, var23.length)) > 0) {
      MessageDigest var24;
               try {
                  var24 = var4;
                  if (var2 != null) {
                     break label80;
                  }

                  var4.update(var23, 0, var6);
                  if (var2 != null) {
                     break;
                  }
               } catch (Throwable var20) {
                  throw a(var20);
               }
            }

            var24 = var4;
         }

         byte[] var7 = var24.digest();
         var8 = new BigInteger(1, var7);
         return var8.toString(a(18346, 504352758455812617L));
      } catch (Throwable var21) {
         var5 = null;
      } finally {
         try {
            var3.close();
         } catch (Throwable var19) {
         }
      }

      return (String)var5;
   }

   public static File b() {
      return new File(p());
   }

   public static String p() {
      return System.getProperty(a(-7693, -44));
   }

   public static File x$File() {
      return new File(f$String());
   }

   public static String f$String() {
      String var0 = System.getProperty(a(-7690, 26431));
      if (!var0.endsWith(File.separator)) {
         var0 = var0 + File.separator;
      }

      return var0;
   }

   public static boolean n(File param0, File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 30
      // 09: ifnonnull 2f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 30
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 1
      // 2a: ireturn
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 2
      // 31: ifnonnull 3f
      // 34: ifnull 4a
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 1
      // 3f: ifnull 4a
      // 42: bipush 1
      // 43: goto 4b
      // 46: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: bipush 0
      // 4b: istore 3
      // 4c: iload 3
      // 4d: aload 2
      // 4e: ifnonnull 6d
      // 51: ifeq 7f
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 0
      // 5c: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 5f: aload 1
      // 60: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 63: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 2
      // 6e: ifnonnull 7c
      // 71: ifeq 7f
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: bipush 1
      // 7c: goto 80
      // 7f: bipush 0
      // 80: ireturn
      // 81: astore 4
      // 83: iload 3
      // 84: aload 2
      // 85: ifnonnull a4
      // 88: ifeq b6
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 0
      // 93: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 96: aload 1
      // 97: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 9a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: aload 2
      // a5: ifnonnull b3
      // a8: ifeq b6
      // ab: goto b2
      // ae: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: bipush 1
      // b3: goto b7
      // b6: bipush 0
      // b7: ireturn
   }

   public static boolean v(List param0, List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: invokeinterface java/util/List.size ()I 1
      // 0a: aload 1
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: aload 2
      // 11: ifnonnull 3b
      // 14: if_icmpeq 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: invokeinterface java/util/List.size ()I 1
      // 2a: aload 2
      // 2b: ifnonnull 60
      // 2e: aload 1
      // 2f: invokeinterface java/util/List.size ()I 1
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: if_icmpne 5f
      // 3e: aload 1
      // 3f: invokeinterface java/util/List.size ()I 1
      // 44: aload 2
      // 45: ifnonnull 60
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: ifne 5f
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: bipush 1
      // 5a: ireturn
      // 5b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: bipush 0
      // 60: istore 3
      // 61: iload 3
      // 62: aload 0
      // 63: invokeinterface java/util/List.size ()I 1
      // 68: if_icmpge aa
      // 6b: aload 0
      // 6c: iload 3
      // 6d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 72: checkcast java/io/File
      // 75: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 78: aload 1
      // 79: iload 3
      // 7a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7f: checkcast java/io/File
      // 82: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 85: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 88: aload 2
      // 89: ifnonnull ab
      // 8c: aload 2
      // 8d: ifnonnull a2
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: ifne a3
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: bipush 0
      // a2: ireturn
      // a3: iinc 3 1
      // a6: aload 2
      // a7: ifnull 61
      // aa: bipush 1
      // ab: ireturn
   }

   public static boolean y(List param0, File param1) {
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
      // 04: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09: astore 3
      // 0a: astore 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 97
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: astore 4
      // 1c: aload 4
      // 1e: instanceof java/io/File
      // 21: aload 2
      // 22: ifnonnull 98
      // 25: aload 2
      // 26: ifnonnull 65
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: ifeq 60
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 4
      // 3c: checkcast java/io/File
      // 3f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 42: aload 1
      // 43: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 46: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49: aload 2
      // 4a: ifnonnull 5f
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: ifeq 93
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: ireturn
      // 60: aload 4
      // 62: instanceof java/lang/String
      // 65: aload 2
      // 66: ifnonnull 83
      // 69: ifeq 93
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aload 4
      // 75: aload 1
      // 76: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 79: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 2
      // 84: ifnonnull 92
      // 87: ifeq 93
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: bipush 1
      // 92: ireturn
      // 93: aload 2
      // 94: ifnull 0b
      // 97: bipush 0
      // 98: ireturn
   }

   public static boolean U(File param0, List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 27
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 2e
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: ifne 2d
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: bipush 1
      // 28: ireturn
      // 29: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 33: astore 3
      // 34: aload 3
      // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a: ifeq 6f
      // 3d: aload 3
      // 3e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 43: checkcast java/io/FileFilter
      // 46: astore 4
      // 48: aload 4
      // 4a: aload 0
      // 4b: invokeinterface java/io/FileFilter.accept (Ljava/io/File;)Z 2
      // 50: aload 2
      // 51: ifnonnull 70
      // 54: aload 2
      // 55: ifnonnull 6a
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: ifeq 6b
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: bipush 1
      // 6a: ireturn
      // 6b: aload 2
      // 6c: ifnull 34
      // 6f: bipush 0
      // 70: ireturn
   }

   public static String f$String(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: astore 2
      // 0b: astore 1
      // 0c: bipush 0
      // 0d: istore 3
      // 0e: iload 3
      // 0f: aload 0
      // 10: invokevirtual java/lang/String.length ()I
      // 13: if_icmpge 44
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 51
      // 1b: iload 3
      // 1c: invokevirtual java/lang/String.charAt (I)C
      // 1f: invokestatic com/finalshell/core/Cz2.r (C)Z
      // 22: ifne 3d
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 2
      // 2d: aload 0
      // 2e: iload 3
      // 2f: invokevirtual java/lang/String.charAt (I)C
      // 32: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 35: pop
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iinc 3 1
      // 40: aload 1
      // 41: ifnull 0e
      // 44: aload 2
      // 45: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 48: ldc_w " "
      // 4b: ldc_w "_"
      // 4e: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 51: areturn
   }

   public static boolean r(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: getstatic com/finalshell/core/Cz2.R [C
      // 09: astore 3
      // 0a: aload 3
      // 0b: arraylength
      // 0c: istore 4
      // 0e: bipush 0
      // 0f: istore 5
      // 11: iload 5
      // 13: iload 4
      // 15: if_icmpge 43
      // 18: aload 3
      // 19: iload 5
      // 1b: caload
      // 1c: istore 6
      // 1e: aload 1
      // 1f: ifnonnull 3f
      // 22: iload 0
      // 23: aload 1
      // 24: ifnonnull 44
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iload 6
      // 30: if_icmpne 3c
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: istore 2
      // 3c: iinc 5 1
      // 3f: aload 1
      // 40: ifnull 11
      // 43: iload 2
      // 44: ireturn
   }

   public static String m(File var0) {
      try {
         return var0.getCanonicalPath();
      } catch (IOException var2) {
         return var0.getAbsolutePath();
      }
   }

   public static File x(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsoluteFile ()Ljava/io/File;
      // 07: astore 0
      // 08: astore 1
      // 09: aload 0
      // 0a: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0d: astore 2
      // 0e: aload 2
      // 0f: aload 1
      // 10: ifnonnull 27
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aconst_null
      // 1e: areturn
      // 1f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 2
      // 24: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 27: ifnull 3e
      // 2a: aload 2
      // 2b: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 2e: aload 1
      // 2f: ifnonnull 3f
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: astore 2
      // 3a: aload 1
      // 3b: ifnull 23
      // 3e: aload 2
      // 3f: areturn
   }

   public static boolean Z(File param0, File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 0
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: ifnonnull 30
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 2
      // 31: ifnonnull 45
      // 34: ifnonnull 44
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: ireturn
      // 40: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 1
      // 45: aload 2
      // 46: ifnonnull 66
      // 49: aload 0
      // 4a: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // 4d: ifeq 5d
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: bipush 0
      // 58: ireturn
      // 59: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 1
      // 5e: invokevirtual java/io/File.getAbsoluteFile ()Ljava/io/File;
      // 61: astore 1
      // 62: aload 1
      // 63: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 66: astore 3
      // 67: aload 3
      // 68: ifnull 98
      // 6b: aload 3
      // 6c: aload 2
      // 6d: ifnonnull 93
      // 70: aload 0
      // 71: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // 74: aload 2
      // 75: ifnonnull 99
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: ifeq 8f
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: bipush 1
      // 8a: ireturn
      // 8b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: aload 3
      // 90: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 93: astore 3
      // 94: aload 2
      // 95: ifnull 67
      // 98: bipush 0
      // 99: ireturn
   }

   public static String Q(File var0) {
      String var1 = FV_2.D();

      try {
         if (var1 != null) {
            return Z(var0.getName());
         }

         if (var0 == null) {
            return "";
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return Z(var0.getName());
   }

   public static String Z(String var0) {
      String var1 = FV_2.D();

      label47: {
         try {
            if (var1 != null) {
               return var0;
            }

            if (!NE.B(var0)) {
               break label47;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         return "";
      }

      int var2 = var0.lastIndexOf(".");

      try {
         if (var2 == -1) {
            return var0;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return var0.substring(0, var2);
   }

   public static String r(File var0, boolean var1) {
      String var2 = FV_2.D();

      try {
         if (var2 != null) {
            return G(var0.getName(), var1);
         }

         if (var0 == null) {
            return "";
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return G(var0.getName(), var1);
   }

   public static String G(String param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 53
      // 09: invokestatic com/finalshell/core/NE.B (Ljava/lang/String;)Z
      // 0c: ifne 50
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: ldc_w "."
      // 1a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1d: istore 3
      // 1e: iload 3
      // 1f: aload 2
      // 20: ifnonnull 39
      // 23: bipush -1
      // 24: if_icmpne 38
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ldc_w ""
      // 31: goto 4f
      // 34: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: iload 1
      // 39: ifeq 48
      // 3c: aload 0
      // 3d: iload 3
      // 3e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 41: goto 4f
      // 44: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: iload 3
      // 4a: bipush 1
      // 4b: iadd
      // 4c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4f: areturn
      // 50: ldc_w ""
      // 53: areturn
   }

   public static String U(String var0) {
      return b(var0, a(23698, 498440931062110518L));
   }

   public static String b(String param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: bipush 2
      // 06: if_icmpge 0f
      // 09: aload 0
      // 0a: areturn
      // 0b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: aload 0
      // 10: invokestatic com/finalshell/core/Cz2.Z (Ljava/lang/String;)Ljava/lang/String;
      // 13: astore 3
      // 14: aload 3
      // 15: aload 2
      // 16: ifnonnull 56
      // 19: invokevirtual java/lang/String.length ()I
      // 1c: iload 1
      // 1d: if_icmple 55
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: new java/lang/StringBuilder
      // 2a: dup
      // 2b: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e: aload 3
      // 2f: bipush 0
      // 30: iload 1
      // 31: bipush 2
      // 32: isub
      // 33: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39: sipush -7703
      // 3c: sipush -20226
      // 3f: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: aload 0
      // 46: bipush 0
      // 47: invokestatic com/finalshell/core/Cz2.G (Ljava/lang/String;Z)Ljava/lang/String;
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50: areturn
      // 51: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: areturn
   }

   public static List X(List param0) {
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
      // 06: ifnonnull 22
      // 09: ifnull 21
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: getstatic com/finalshell/core/DE.n Lcom/finalshell/ui/model/Py4;
      // 17: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: areturn
   }

   public static File[] C(File[] param0) {
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
      // 06: ifnonnull 22
      // 09: ifnull 21
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: getstatic com/finalshell/core/DE.n Lcom/finalshell/ui/model/Py4;
      // 17: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: areturn
   }

   public static String H(String var0, String var1) {
      return a(new File(var0), var1);
   }

   public static String a(File var0, String var1) {
      File[] var11;
      ArrayList var3;
      String var10000 = FV_2.D();
      var3 = new ArrayList();
      File[] var4 = var0.listFiles();
      String var2 = var10000;

      label39: {
         try {
            var11 = var4;
            if (var2 != null) {
               break label39;
            }

            if (var4 == null) {
               return I(var3, var1);
            }
         } catch (RuntimeException var10) {
            throw a(var10);
         }

         var11 = var4;
      }

      File[] var5 = var11;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         File var8 = var5[var7];

         try {
            String var10001 = var8.getName();
            if (var2 != null) {
               return I(var3, var10001);
            }

            var3.add(var10001);
            var7++;
            if (var2 != null) {
               break;
            }
         } catch (RuntimeException var9) {
            throw a(var9);
         }
      }

      return I(var3, var1);
   }

   public static String I(List param0, String param1) {
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
      // 004: aload 0
      // 005: aload 1
      // 006: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 00b: aload 2
      // 00c: ifnonnull 026
      // 00f: ifne 01f
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 1
      // 01a: areturn
      // 01b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 1
      // 020: ldc_w "."
      // 023: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 026: istore 3
      // 027: iload 3
      // 028: bipush -1
      // 029: if_icmpeq 03c
      // 02c: aload 1
      // 02d: bipush 0
      // 02e: iload 3
      // 02f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 032: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 035: goto 03d
      // 038: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: aload 1
      // 03d: astore 4
      // 03f: iload 3
      // 040: bipush -1
      // 041: if_icmpeq 056
      // 044: aload 1
      // 045: aload 1
      // 046: ldc_w "."
      // 049: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 04c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 04f: goto 057
      // 052: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aconst_null
      // 057: astore 5
      // 059: aload 4
      // 05b: ldc_w "("
      // 05e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 061: istore 6
      // 063: aload 4
      // 065: ldc_w ")"
      // 068: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 06b: istore 7
      // 06d: aconst_null
      // 06e: astore 8
      // 070: aconst_null
      // 071: astore 9
      // 073: iload 6
      // 075: iload 7
      // 077: aload 2
      // 078: ifnonnull 095
      // 07b: if_icmpge 0cd
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: iload 7
      // 087: aload 4
      // 089: invokevirtual java/lang/String.length ()I
      // 08c: bipush 1
      // 08d: isub
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: if_icmpne 0cd
      // 098: aload 4
      // 09a: bipush 0
      // 09b: iload 6
      // 09d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0a0: astore 8
      // 0a2: aload 4
      // 0a4: iload 6
      // 0a6: bipush 1
      // 0a7: iadd
      // 0a8: iload 7
      // 0aa: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ad: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b3: astore 9
      // 0b5: aload 9
      // 0b7: astore 10
      // 0b9: aload 9
      // 0bb: invokevirtual java/lang/Integer.intValue ()I
      // 0be: bipush 1
      // 0bf: iadd
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: astore 9
      // 0c5: aload 10
      // 0c7: pop
      // 0c8: goto 0cd
      // 0cb: astore 10
      // 0cd: bipush 1
      // 0ce: istore 10
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0d7: ifeq 187
      // 0da: aload 8
      // 0dc: aload 2
      // 0dd: ifnonnull 188
      // 0e0: ifnull 13e
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 9
      // 0ec: aload 2
      // 0ed: ifnonnull 129
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: ifnull 13e
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: new java/lang/StringBuilder
      // 104: dup
      // 105: invokespecial java/lang/StringBuilder.<init> ()V
      // 108: aload 8
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: ldc_w "("
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: aload 9
      // 115: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 118: ldc_w ")"
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: aload 5
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 126: astore 1
      // 127: aload 9
      // 129: astore 11
      // 12b: aload 9
      // 12d: invokevirtual java/lang/Integer.intValue ()I
      // 130: bipush 1
      // 131: iadd
      // 132: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 135: astore 9
      // 137: aload 11
      // 139: pop
      // 13a: aload 2
      // 13b: ifnull 0d0
      // 13e: new java/lang/StringBuilder
      // 141: dup
      // 142: invokespecial java/lang/StringBuilder.<init> ()V
      // 145: aload 4
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14a: sipush -7736
      // 14d: sipush 26354
      // 150: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: iload 10
      // 158: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 15b: ldc_w ")"
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: aload 5
      // 163: aload 2
      // 164: ifnonnull 173
      // 167: ifnull 176
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 5
      // 173: goto 179
      // 176: ldc_w ""
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17f: astore 1
      // 180: iinc 10 1
      // 183: aload 2
      // 184: ifnull 0d0
      // 187: aload 1
      // 188: areturn
   }

   public static List b(Object[] param0) {
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
      // 04: new java/util/ArrayList
      // 07: dup
      // 08: aload 0
      // 09: ifnull 15
      // 0c: aload 0
      // 0d: arraylength
      // 0e: goto 16
      // 11: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: invokespecial java/util/ArrayList.<init> (I)V
      // 19: astore 2
      // 1a: aload 2
      // 1b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 20: astore 3
      // 21: aload 3
      // 22: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27: ifeq 5c
      // 2a: aload 3
      // 2b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30: astore 4
      // 32: aload 4
      // 34: instanceof java/io/File
      // 37: aload 1
      // 38: ifnonnull 57
      // 3b: ifeq 58
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 2
      // 46: aload 4
      // 48: checkcast java/io/File
      // 4b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: pop
      // 58: aload 1
      // 59: ifnull 21
      // 5c: aload 2
      // 5d: areturn
   }

   public static void D(Object[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: astore 2
      // 02: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 05: aload 2
      // 06: arraylength
      // 07: istore 3
      // 08: astore 1
      // 09: bipush 0
      // 0a: istore 4
      // 0c: iload 4
      // 0e: iload 3
      // 0f: if_icmpge 41
      // 12: aload 2
      // 13: iload 4
      // 15: aaload
      // 16: astore 5
      // 18: aload 1
      // 19: ifnonnull 3d
      // 1c: aload 5
      // 1e: instanceof java/io/File
      // 21: ifeq 3a
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 5
      // 2d: checkcast java/io/File
      // 30: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: iinc 4 1
      // 3d: aload 1
      // 3e: ifnull 0c
      // 41: return
   }

   public static void r(List param0) {
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
      // 04: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09: astore 2
      // 0a: astore 1
      // 0b: aload 2
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 3f
      // 14: aload 2
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: astore 3
      // 1b: aload 3
      // 1c: aload 1
      // 1d: ifnonnull 35
      // 20: instanceof java/io/File
      // 23: ifeq 3b
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 3
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: checkcast java/io/File
      // 38: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 3b: aload 1
      // 3c: ifnull 0b
      // 3f: return
   }

   public static void H$void(File param0) {
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
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifeq bb
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/io/File.isFile ()Z
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: ifnonnull 6d
      // 25: ifeq 57
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: ifnonnull 50
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: invokevirtual java/io/File.delete ()Z
      // 3e: ifne bb
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: invokevirtual java/io/File.deleteOnExit ()V
      // 53: aload 1
      // 54: ifnull bb
      // 57: aload 0
      // 58: aload 1
      // 59: ifnonnull 71
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: invokevirtual java/io/File.isDirectory ()Z
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: ifeq bb
      // 70: aload 0
      // 71: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 74: astore 2
      // 75: aload 2
      // 76: arraylength
      // 77: istore 3
      // 78: bipush 0
      // 79: istore 4
      // 7b: iload 4
      // 7d: iload 3
      // 7e: if_icmpge 9e
      // 81: aload 2
      // 82: iload 4
      // 84: aaload
      // 85: astore 5
      // 87: aload 5
      // 89: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 8c: iinc 4 1
      // 8f: aload 1
      // 90: ifnonnull bb
      // 93: aload 1
      // 94: ifnull 7b
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 0
      // 9f: aload 1
      // a0: ifnonnull b8
      // a3: invokevirtual java/io/File.delete ()Z
      // a6: ifne bb
      // a9: goto b0
      // ac: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af: athrow
      // b0: aload 0
      // b1: goto b8
      // b4: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b7: athrow
      // b8: invokevirtual java/io/File.deleteOnExit ()V
      // bb: return
   }

   public static void e(File param0) {
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
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 1
      // 09: ifnonnull 2c
      // 0c: ifeq 52
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual java/io/File.isDirectory ()Z
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: ifeq 52
      // 2f: aload 0
      // 30: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 33: astore 2
      // 34: aload 2
      // 35: arraylength
      // 36: istore 3
      // 37: bipush 0
      // 38: istore 4
      // 3a: iload 4
      // 3c: iload 3
      // 3d: if_icmpge 52
      // 40: aload 2
      // 41: iload 4
      // 43: aaload
      // 44: astore 5
      // 46: aload 5
      // 48: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 4b: iinc 4 1
      // 4e: aload 1
      // 4f: ifnull 3a
      // 52: return
   }

   public static V3 c(FileFilter param0) {
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
      // 06: ifnonnull 1e
      // 09: instanceof com/finalshell/core/V3
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: checkcast com/finalshell/core/V3
      // 21: astore 2
      // 22: aload 1
      // 23: ifnull 41
      // 26: new com/finalshell/core/Dt2
      // 29: dup
      // 2a: getstatic com/finalshell/core/DE.F Lcom/finalshell/core/Q5;
      // 2d: invokevirtual com/finalshell/core/Q5.b ()Ljavax/swing/ImageIcon;
      // 30: sipush -7700
      // 33: sipush 6211
      // 36: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 39: invokestatic com/finalshell/core/I22.O (Ljava/lang/String;)Ljava/lang/String;
      // 3c: aload 0
      // 3d: invokespecial com/finalshell/core/Dt2.<init> (Ljavax/swing/ImageIcon;Ljava/lang/String;Ljava/io/FileFilter;)V
      // 40: astore 2
      // 41: aload 2
      // 42: areturn
   }

   public static V3 S(javax.swing.filechooser.FileFilter param0) {
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
      // 06: ifnonnull 1e
      // 09: instanceof com/finalshell/core/V3
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: checkcast com/finalshell/core/V3
      // 21: astore 2
      // 22: aload 1
      // 23: ifnull 39
      // 26: new com/finalshell/core/DZ
      // 29: dup
      // 2a: getstatic com/finalshell/core/DE.F Lcom/finalshell/core/Q5;
      // 2d: invokevirtual com/finalshell/core/Q5.b ()Ljavax/swing/ImageIcon;
      // 30: aload 0
      // 31: invokevirtual javax/swing/filechooser/FileFilter.getDescription ()Ljava/lang/String;
      // 34: aload 0
      // 35: invokespecial com/finalshell/core/DZ.<init> (Ljavax/swing/ImageIcon;Ljava/lang/String;Ljavax/swing/filechooser/FileFilter;)V
      // 38: astore 2
      // 39: aload 2
      // 3a: areturn
   }

   public static List F(Collection param0, V3 param1) {
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
      // 04: aload 0
      // 05: invokeinterface java/util/Collection.size ()I 1
      // 0a: invokespecial java/util/ArrayList.<init> (I)V
      // 0d: astore 3
      // 0e: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 11: aload 0
      // 12: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 17: astore 4
      // 19: astore 2
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 58
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast java/io/File
      // 2e: astore 5
      // 30: aload 1
      // 31: aload 5
      // 33: invokevirtual com/finalshell/core/V3.accept (Ljava/io/File;)Z
      // 36: aload 2
      // 37: ifnonnull 53
      // 3a: ifeq 54
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 3
      // 45: aload 5
      // 47: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: pop
      // 54: aload 2
      // 55: ifnull 1a
      // 58: aload 3
      // 59: areturn
   }

   public static Yt2 p(File var0, String var1) {
      StringBuilder var8;
      String var10000 = FV_2.D();
      String var3 = X(var0);
      String var2 = var10000;

      label36: {
         String var10001;
         label35: {
            label40: {
               try {
                  if (!var0.isFile()) {
                     break label40;
                  }

                  var8 = new StringBuilder().append(n(var0));
                  var10001 = var1;
                  if (var2 != null) {
                     break label35;
                  }
               } catch (RuntimeException var7) {
                  throw a(var7);
               }

               try {
                  if (var10001 != null) {
                     var10001 = a(-7686, -5110) + var1 + ")";
                     break label35;
                  }
               } catch (RuntimeException var6) {
                  throw a(var6);
               }

               var10001 = "";
               break label35;
            }

            var10000 = null;
            break label36;
         }

         var10000 = var8.append(var10001).toString();
      }

      String var4 = var10000;
      String var5 = T(var0);
      return new Yt2(var3, var4, var5, null);
   }

   public static String n(File var0) {
      return W(var0.length());
   }

   public static String o(File var0, int var1) {
      return n(var0.length(), var1);
   }

   public static String W(long var0) {
      return n(var0, 2);
   }

   public static String n(long param0, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 3
      // 004: new java/text/DecimalFormat
      // 007: dup
      // 008: iload 2
      // 009: ifne 016
      // 00c: ldc_w "#"
      // 00f: goto 033
      // 012: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: new java/lang/StringBuilder
      // 019: dup
      // 01a: invokespecial java/lang/StringBuilder.<init> ()V
      // 01d: sipush -7698
      // 020: sipush 6792
      // 023: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 026: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 029: iload 2
      // 02a: invokestatic com/finalshell/core/Cz2.g (I)Ljava/lang/String;
      // 02d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 030: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 033: invokespecial java/text/DecimalFormat.<init> (Ljava/lang/String;)V
      // 036: astore 4
      // 038: lload 0
      // 039: sipush 9714
      // 03c: ldc2_w 4303420196688507716
      // 03f: invokestatic com/finalshell/core/Cz2.b (IJ)J
      // 042: lcmp
      // 043: aload 3
      // 044: ifnonnull 089
      // 047: ifge 07e
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: new java/lang/StringBuilder
      // 054: dup
      // 055: invokespecial java/lang/StringBuilder.<init> ()V
      // 058: aload 4
      // 05a: lload 0
      // 05b: invokevirtual java/text/DecimalFormat.format (J)Ljava/lang/String;
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: ldc_w " "
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: sipush -7704
      // 06a: sipush -7599
      // 06d: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 070: invokestatic com/finalshell/core/I22.O (Ljava/lang/String;)Ljava/lang/String;
      // 073: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 076: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 079: areturn
      // 07a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: lload 0
      // 07f: sipush 11996
      // 082: ldc2_w 1273050218992810093
      // 085: invokestatic com/finalshell/core/Cz2.b (IJ)J
      // 088: lcmp
      // 089: aload 3
      // 08a: ifnonnull 0f5
      // 08d: iflt 0ea
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: lload 0
      // 098: sipush 785
      // 09b: ldc2_w 7203795819345548708
      // 09e: invokestatic com/finalshell/core/Cz2.b (IJ)J
      // 0a1: lcmp
      // 0a2: aload 3
      // 0a3: ifnonnull 0f5
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: ifge 0ea
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: aload 4
      // 0c0: lload 0
      // 0c1: l2f
      // 0c2: ldc_w 1024.0
      // 0c5: fdiv
      // 0c6: f2d
      // 0c7: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: ldc_w " "
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: sipush -7708
      // 0d6: sipush -9300
      // 0d9: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0dc: invokestatic com/finalshell/core/I22.O (Ljava/lang/String;)Ljava/lang/String;
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: areturn
      // 0e6: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: lload 0
      // 0eb: sipush 8349
      // 0ee: ldc2_w 1335978203410708010
      // 0f1: invokestatic com/finalshell/core/Cz2.b (IJ)J
      // 0f4: lcmp
      // 0f5: aload 3
      // 0f6: ifnonnull 115
      // 0f9: iflt 14b
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: lload 0
      // 104: sipush 7785
      // 107: ldc2_w 7155398347642505437
      // 10a: invokestatic com/finalshell/core/Cz2.b (IJ)J
      // 10d: lcmp
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: ifge 14b
      // 118: new java/lang/StringBuilder
      // 11b: dup
      // 11c: invokespecial java/lang/StringBuilder.<init> ()V
      // 11f: aload 4
      // 121: lload 0
      // 122: l2f
      // 123: ldc_w 1048576.0
      // 126: fdiv
      // 127: f2d
      // 128: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: ldc_w " "
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: sipush -7733
      // 137: sipush 14105
      // 13a: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 13d: invokestatic com/finalshell/core/I22.O (Ljava/lang/String;)Ljava/lang/String;
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: areturn
      // 147: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: new java/lang/StringBuilder
      // 14e: dup
      // 14f: invokespecial java/lang/StringBuilder.<init> ()V
      // 152: aload 4
      // 154: lload 0
      // 155: l2f
      // 156: ldc_w 1.07374182E9
      // 159: fdiv
      // 15a: f2d
      // 15b: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: ldc_w " "
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: sipush -7696
      // 16a: sipush 21082
      // 16d: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 170: invokestatic com/finalshell/core/I22.O (Ljava/lang/String;)Ljava/lang/String;
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 179: areturn
   }

   public static String g(int var0) {
      int var3;
      StringBuilder var5;
      StringBuilder var2 = new StringBuilder(var0);
      String var10000 = FV_2.D();
      var3 = 0;
      String var1 = var10000;

      while (true) {
         if (var3 < var0) {
            try {
               var5 = var2.append("#");
               if (var1 != null) {
                  break;
               }

               var3++;
               if (var1 == null) {
                  continue;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5.toString();
   }

   public static boolean A(String var0, String var1) {
      return I(var0, var1, false);
   }

   public static boolean I(String var0, String var1, boolean var2) {
      return k(new File(var0), new File(var1), var2);
   }

   public static boolean w$boolean(File var0, File var1) {
      return k(var0, var1, false);
   }

   public static boolean k(File param0, File param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: invokevirtual java/io/File.exists ()Z
      // 008: aload 3
      // 009: ifnonnull 168
      // 00c: ifeq 167
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual java/io/File.isDirectory ()Z
      // 01a: aload 3
      // 01b: ifnonnull 168
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifeq 167
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 1
      // 030: invokestatic com/finalshell/core/Cz2.H$boolean (Ljava/io/File;)Z
      // 033: aload 3
      // 034: ifnonnull 166
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: ifeq 165
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: bipush 1
      // 049: istore 4
      // 04b: aload 0
      // 04c: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 04f: astore 5
      // 051: aload 5
      // 053: arraylength
      // 054: istore 6
      // 056: bipush 0
      // 057: istore 7
      // 059: iload 7
      // 05b: iload 6
      // 05d: if_icmpge 162
      // 060: aload 5
      // 062: iload 7
      // 064: aaload
      // 065: astore 8
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: invokespecial java/lang/StringBuilder.<init> ()V
      // 06e: aload 1
      // 06f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: getstatic java/io/File.separator Ljava/lang/String;
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: aload 8
      // 07d: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 086: astore 9
      // 088: aload 8
      // 08a: invokevirtual java/io/File.isDirectory ()Z
      // 08d: aload 3
      // 08e: ifnonnull 164
      // 091: aload 3
      // 092: ifnonnull 10e
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: ifeq 104
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 8
      // 0a8: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0ab: aload 9
      // 0ad: invokestatic com/finalshell/core/Cz2.A (Ljava/lang/String;Ljava/lang/String;)Z
      // 0b0: aload 3
      // 0b1: ifnonnull 0c7
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: ifeq 0d9
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: iload 4
      // 0c7: aload 3
      // 0c8: ifnonnull 0d6
      // 0cb: ifeq 0d9
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: goto 0da
      // 0d9: bipush 0
      // 0da: istore 4
      // 0dc: aload 3
      // 0dd: ifnonnull 15e
      // 0e0: iload 4
      // 0e2: ifne 15b
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: aload 3
      // 0ee: ifnonnull 103
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: ifeq 15b
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: bipush 0
      // 103: ireturn
      // 104: aload 8
      // 106: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 109: aload 9
      // 10b: invokestatic com/finalshell/core/Cz2.p (Ljava/lang/String;Ljava/lang/String;)Z
      // 10e: aload 3
      // 10f: ifnonnull 11e
      // 112: ifeq 130
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: iload 4
      // 11e: aload 3
      // 11f: ifnonnull 12d
      // 122: ifeq 130
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: bipush 1
      // 12d: goto 131
      // 130: bipush 0
      // 131: istore 4
      // 133: aload 3
      // 134: ifnonnull 15e
      // 137: iload 4
      // 139: ifne 15b
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: iload 2
      // 144: aload 3
      // 145: ifnonnull 15a
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: ifeq 15b
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: bipush 0
      // 15a: ireturn
      // 15b: iinc 7 1
      // 15e: aload 3
      // 15f: ifnull 059
      // 162: iload 4
      // 164: ireturn
      // 165: bipush 0
      // 166: ireturn
      // 167: bipush 0
      // 168: ireturn
   }

   public static boolean p(String var0, String var1) {
      File var3;
      String var2 = FV_2.D();

      try {
         var3 = new File(new File(var1).getParent());

         label34: {
            try {
               boolean var10000 = H$boolean(var3);
               if (var2 != null) {
                  return var10000;
               }

               if (var10000) {
                  break label34;
               }
            } catch (FileNotFoundException var6) {
               throw a(var6);
            }

            return false;
         }

         FileChannel var4 = new FileInputStream(var0).getChannel();
         FileChannel var5 = new FileOutputStream(var1).getChannel();
         return B(var4, var5);
      } catch (FileNotFoundException var7) {
         return false;
      }
   }

   public static boolean v(File param0, File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnonnull 75
      // 0c: ifeq 74
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/io/File.isFile ()Z
      // 1a: aload 2
      // 1b: ifnonnull 75
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 74
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/io/File
      // 32: dup
      // 33: aload 1
      // 34: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 37: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3a: astore 3
      // 3b: aload 3
      // 3c: invokestatic com/finalshell/core/Cz2.H$boolean (Ljava/io/File;)Z
      // 3f: aload 2
      // 40: ifnonnull 70
      // 43: ifeq 6f
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: new java/io/FileInputStream
      // 50: dup
      // 51: aload 0
      // 52: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 55: invokevirtual java/io/FileInputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 58: astore 4
      // 5a: new java/io/FileOutputStream
      // 5d: dup
      // 5e: aload 1
      // 5f: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 62: invokevirtual java/io/FileOutputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 65: astore 5
      // 67: aload 4
      // 69: aload 5
      // 6b: invokestatic com/finalshell/core/Cz2.B (Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;)Z
      // 6e: ireturn
      // 6f: bipush 0
      // 70: ireturn
      // 71: astore 3
      // 72: bipush 0
      // 73: ireturn
      // 74: bipush 0
      // 75: ireturn
   }

   public static boolean B(FileChannel var0, FileChannel var1) {
      try {
         var1.transferFrom(var0, 0L, var0.size());
         var0.close();
         var1.close();
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public static String R(java.lang.Class var0, String var1) {
      return y(var0, var1, a(-7688, -25714));
   }

   public static String y(java.lang.Class var0, String var1, String var2) {
      try {
         return y(var0.getResourceAsStream(var1), var2);
      } catch (Throwable var4) {
         return null;
      }
   }

   public static String B(URL var0) {
      return E(var0, a(-7688, -25714));
   }

   public static String E(URL var0, String var1) {
      try {
         return y(var0.openStream(), var1);
      } catch (Throwable var3) {
         return null;
      }
   }

   public static String g(File var0) {
      return r(var0, a(-7682, 24331));
   }

   public static String r(File param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 14
      // 09: ifnull 40
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/io/File.exists ()Z
      // 17: aload 2
      // 18: ifnonnull 30
      // 1b: ifeq 40
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual java/io/File.isFile ()Z
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: ifeq 40
      // 33: new java/io/FileInputStream
      // 36: dup
      // 37: aload 0
      // 38: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 3b: aload 1
      // 3c: invokestatic com/finalshell/core/Cz2.y (Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
      // 3f: areturn
      // 40: aconst_null
      // 41: areturn
      // 42: astore 3
      // 43: aconst_null
      // 44: areturn
   }

   public static String W(InputStream var0) {
      return y(var0, a(-7688, -25714));
   }

   public static String y(InputStream var0, String var1) {
      String var2;
      try {
         if (var0 == null) {
            return null;
         }

         var2 = H(new InputStreamReader(var0, var1));
      } catch (Throwable var14) {
         return null;
      } finally {
         try {
            var0.close();
         } catch (IOException var13) {
         }
      }

      return var2;
   }

   public static String H(Reader var0) {
      String var1 = FV_2.D();

      String var2;
      try {
         if (var0 != null) {
            char[] var21 = new char[a(22549, 5707338930402942341L)];
            StringBuilder var4 = new StringBuilder();

            StringBuilder var10000;
            while (true) {
               int var20;
               if ((var20 = var0.read(var21, 0, a(17321, 9043834275778545191L))) != -1) {
                  try {
                     var10000 = var4.append(var21, 0, var20);
                     if (var1 != null) {
                        break;
                     }

                     if (var1 == null) {
                        continue;
                     }
                  } catch (IOException var17) {
                     throw a(var17);
                  }
               }

               var10000 = var4;
               break;
            }

            return var10000.toString();
         }

         var2 = "";
      } catch (Throwable var18) {
         return "";
      } finally {
         try {
            var0.close();
         } catch (IOException var16) {
         }
      }

      return var2;
   }

   public static void T(String var0, File var1) {
      N(var0, var1, a(-7688, -25714));
   }

   public static void N(String param0, File param1, String param2) {
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
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 3
      // 09: ifnonnull 4b
      // 0c: ifeq 44
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/io/File.isDirectory ()Z
      // 1a: aload 3
      // 1b: ifnonnull 4b
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 44
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/lang/RuntimeException
      // 32: dup
      // 33: sipush -7699
      // 36: sipush 7046
      // 39: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 3c: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 1
      // 45: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 48: invokevirtual java/io/File.mkdirs ()Z
      // 4b: pop
      // 4c: aconst_null
      // 4d: astore 4
      // 4f: new java/io/PrintWriter
      // 52: dup
      // 53: aload 1
      // 54: aload 2
      // 55: invokespecial java/io/PrintWriter.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 58: astore 4
      // 5a: aload 4
      // 5c: aload 0
      // 5d: invokevirtual java/io/PrintWriter.write (Ljava/lang/String;)V
      // 60: aload 4
      // 62: aload 3
      // 63: ifnonnull 6b
      // 66: ifnull bf
      // 69: aload 4
      // 6b: invokevirtual java/io/PrintWriter.close ()V
      // 6e: goto bf
      // 71: astore 5
      // 73: ldc com/finalshell/core/Cz2
      // 75: aload 5
      // 77: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 7a: aload 4
      // 7c: aload 3
      // 7d: ifnonnull 85
      // 80: ifnull bf
      // 83: aload 4
      // 85: invokevirtual java/io/PrintWriter.close ()V
      // 88: goto bf
      // 8b: astore 5
      // 8d: ldc com/finalshell/core/Cz2
      // 8f: aload 5
      // 91: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 94: aload 4
      // 96: aload 3
      // 97: ifnonnull 9f
      // 9a: ifnull bf
      // 9d: aload 4
      // 9f: invokevirtual java/io/PrintWriter.close ()V
      // a2: goto bf
      // a5: astore 6
      // a7: aload 4
      // a9: aload 3
      // aa: ifnonnull b9
      // ad: ifnull bc
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: aload 4
      // b9: invokevirtual java/io/PrintWriter.close ()V
      // bc: aload 6
      // be: athrow
      // bf: return
   }

   public static List f$List(String var0) {
      return S(new File(var0));
   }

   public static List S(File var0) {
      return P(var0, "");
   }

   public static List P(File var0, String var1) {
      return H(var0, var1, new ArrayList());
   }

   public static List H(File param0, String param1, List param2) {
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
      // 04: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: arraylength
      // 0d: istore 5
      // 0f: bipush 0
      // 10: istore 6
      // 12: iload 6
      // 14: iload 5
      // 16: if_icmpge 9f
      // 19: aload 4
      // 1b: iload 6
      // 1d: aaload
      // 1e: astore 7
      // 20: aload 7
      // 22: invokevirtual java/io/File.isFile ()Z
      // 25: aload 3
      // 26: ifnonnull 72
      // 29: ifeq 5b
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 2
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: aload 1
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: aload 7
      // 41: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4f: pop
      // 50: aload 3
      // 51: ifnull 98
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 7
      // 5d: aload 3
      // 5e: ifnonnull 77
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: invokevirtual java/io/File.isDirectory ()Z
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: ifeq 98
      // 75: aload 7
      // 77: new java/lang/StringBuilder
      // 7a: dup
      // 7b: invokespecial java/lang/StringBuilder.<init> ()V
      // 7e: aload 1
      // 7f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 82: aload 7
      // 84: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8a: getstatic java/io/File.separator Ljava/lang/String;
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93: aload 2
      // 94: invokestatic com/finalshell/core/Cz2.H (Ljava/io/File;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
      // 97: pop
      // 98: iinc 6 1
      // 9b: aload 3
      // 9c: ifnull 12
      // 9f: aload 2
      // a0: areturn
   }

   public static File v(String var0, File var1) {
      return X(var0, var1, false, null, a(25633, 2405070994529477035L), null);
   }

   public static File z(String var0, File var1, RP var2) {
      return X(var0, var1, false, null, a(17468, 2142237117939958176L), var2);
   }

   public static File h(String var0, String var1, boolean var2, String var3, int var4) {
      return X(var0, new File(var1), var2, var3, var4, null);
   }

   public static File h(String var0, String var1, boolean var2, String var3, int var4, RP var5) {
      return X(var0, new File(var1), var2, var3, var4, var5);
   }

   public static File U(String var0, File var1, boolean var2, String var3, int var4) {
      return X(var0, var1, var2, var3, var4, null);
   }

   public static File X(String param0, File param1, boolean param2, String param3, int param4, RP param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 6
      // 005: new java/net/URL
      // 008: dup
      // 009: iload 2
      // 00a: ifeq 018
      // 00d: aload 0
      // 00e: invokestatic com/finalshell/core/PK.w (Ljava/lang/String;)Ljava/lang/String;
      // 011: goto 019
      // 014: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 01c: astore 7
      // 01e: aload 7
      // 020: invokestatic com/finalshell/core/EE.Z (Ljava/net/URL;)Ljava/net/URLConnection;
      // 023: astore 8
      // 025: aload 6
      // 027: ifnonnull 044
      // 02a: iload 4
      // 02c: ifeq 04b
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 8
      // 038: iload 4
      // 03a: invokevirtual java/net/URLConnection.setConnectTimeout (I)V
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 8
      // 046: iload 4
      // 048: invokevirtual java/net/URLConnection.setReadTimeout (I)V
      // 04b: aload 5
      // 04d: aload 6
      // 04f: ifnonnull 05e
      // 052: ifnull 06c
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 5
      // 05e: invokeinterface com/finalshell/core/RP.i ()Z 1
      // 063: ifeq 06c
      // 066: aload 1
      // 067: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 06a: aconst_null
      // 06b: areturn
      // 06c: aload 3
      // 06d: aload 6
      // 06f: ifnonnull 088
      // 072: ifnull 0ac
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 8
      // 07e: invokevirtual java/net/URLConnection.getContentType ()Ljava/lang/String;
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: astore 9
      // 08a: aload 6
      // 08c: ifnonnull 0aa
      // 08f: aload 9
      // 091: aload 3
      // 092: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 095: ifne 0ac
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aconst_null
      // 0ab: areturn
      // 0ac: aload 5
      // 0ae: aload 6
      // 0b0: ifnonnull 0de
      // 0b3: ifnull 0f3
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 5
      // 0bf: aload 8
      // 0c1: invokevirtual java/net/URLConnection.getContentLength ()I
      // 0c4: invokeinterface com/finalshell/core/RP.w (I)V 2
      // 0c9: aload 6
      // 0cb: ifnonnull 0f1
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 5
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: invokeinterface com/finalshell/core/RP.i ()Z 1
      // 0e3: ifeq 0f3
      // 0e6: aload 1
      // 0e7: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aconst_null
      // 0f2: areturn
      // 0f3: aload 8
      // 0f5: invokevirtual java/net/URLConnection.getInputStream ()Ljava/io/InputStream;
      // 0f8: astore 9
      // 0fa: new java/io/FileOutputStream
      // 0fd: dup
      // 0fe: aload 1
      // 0ff: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 102: astore 10
      // 104: aload 5
      // 106: aload 6
      // 108: ifnonnull 117
      // 10b: ifnull 140
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 5
      // 117: invokeinterface com/finalshell/core/RP.i ()Z 1
      // 11c: aload 6
      // 11e: ifnonnull 149
      // 121: ifeq 140
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: aload 10
      // 12d: invokevirtual java/io/FileOutputStream.flush ()V
      // 130: aload 10
      // 132: invokevirtual java/io/FileOutputStream.close ()V
      // 135: aload 9
      // 137: invokevirtual java/io/InputStream.close ()V
      // 13a: aload 1
      // 13b: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 13e: aconst_null
      // 13f: areturn
      // 140: sipush 6356
      // 143: ldc2_w 1909181917496417600
      // 146: invokestatic com/finalshell/core/Cz2.a (IJ)I
      // 149: newarray 8
      // 14b: astore 11
      // 14d: bipush 0
      // 14e: istore 12
      // 150: aload 9
      // 152: aload 11
      // 154: invokevirtual java/io/InputStream.read ([B)I
      // 157: dup
      // 158: istore 13
      // 15a: bipush -1
      // 15b: if_icmpeq 1c5
      // 15e: aload 5
      // 160: aload 6
      // 162: ifnonnull 1d6
      // 165: aload 6
      // 167: ifnonnull 199
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: ifnull 1b6
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: iload 12
      // 17d: iload 13
      // 17f: iadd
      // 180: istore 12
      // 182: aload 5
      // 184: iload 12
      // 186: invokeinterface com/finalshell/core/RP.F (I)V 2
      // 18b: aload 6
      // 18d: ifnonnull 1c0
      // 190: aload 5
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 198: athrow
      // 199: invokeinterface com/finalshell/core/RP.i ()Z 1
      // 19e: ifeq 1b6
      // 1a1: aload 10
      // 1a3: invokevirtual java/io/FileOutputStream.flush ()V
      // 1a6: aload 10
      // 1a8: invokevirtual java/io/FileOutputStream.close ()V
      // 1ab: aload 9
      // 1ad: invokevirtual java/io/InputStream.close ()V
      // 1b0: aload 1
      // 1b1: invokestatic com/finalshell/core/Cz2.H$void (Ljava/io/File;)V
      // 1b4: aconst_null
      // 1b5: areturn
      // 1b6: aload 10
      // 1b8: aload 11
      // 1ba: bipush 0
      // 1bb: iload 13
      // 1bd: invokevirtual java/io/FileOutputStream.write ([BII)V
      // 1c0: aload 6
      // 1c2: ifnull 150
      // 1c5: aload 10
      // 1c7: invokevirtual java/io/FileOutputStream.flush ()V
      // 1ca: aload 10
      // 1cc: invokevirtual java/io/FileOutputStream.close ()V
      // 1cf: aload 9
      // 1d1: invokevirtual java/io/InputStream.close ()V
      // 1d4: aload 5
      // 1d6: aload 6
      // 1d8: ifnonnull 1e7
      // 1db: ifnull 1ed
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: aload 5
      // 1e7: aload 1
      // 1e8: invokeinterface com/finalshell/core/RP.X (Ljava/io/File;)V 2
      // 1ed: aload 1
      // 1ee: areturn
      // 1ef: astore 7
      // 1f1: aload 5
      // 1f3: aload 6
      // 1f5: ifnonnull 204
      // 1f8: ifnull 20b
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: aload 5
      // 204: aload 7
      // 206: invokeinterface com/finalshell/core/RP.n (Ljava/lang/Throwable;)V 2
      // 20b: aconst_null
      // 20c: areturn
   }

   public static int j$int(String var0) {
      try {
         return t(new URL(var0));
      } catch (Throwable var2) {
         NE3.g(Cz2.class, var2);
         return -1;
      }
   }

   public static int t(URL var0) {
      try {
         URLConnection var1 = EE.Z(var0);
         return var1.getContentLength();
      } catch (Throwable var2) {
         NE3.g(Cz2.class, var2);
         return -1;
      }
   }

   public static List R(String var0, List var1) {
      return W(new File(var0), var1);
   }

   public static List W(File var0, List var1) {
      return u(var0, var1, true);
   }

   public static List J(String var0, List var1, boolean var2) {
      return u(new File(var0), var1, var2);
   }

   public static List u(File var0, List var1, boolean var2) {
      return G(var0, var1, var2, null);
   }

   public static List y(String var0, List var1, boolean var2, List var3) {
      return G(new File(var0), var1, var2, var3);
   }

   public static List G(File var0, List var1, boolean var2, List var3) {
      return r(var0, new CP(var1, var2), var3);
   }

   public static List X(String var0, FileFilter var1) {
      return T(new File(var0), var1);
   }

   public static List T(File var0, FileFilter var1) {
      return r(var0, var1, null);
   }

   public static List O(String var0, FileFilter var1, List var2) {
      return r(new File(var0), var1, var2);
   }

   public static List r(File param0, FileFilter param1, List param2) {
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
      // 04: aload 2
      // 05: ifnonnull 10
      // 08: new java/util/ArrayList
      // 0b: dup
      // 0c: invokespecial java/util/ArrayList.<init> ()V
      // 0f: astore 2
      // 10: aload 0
      // 11: invokevirtual java/io/File.exists ()Z
      // 14: aload 3
      // 15: ifnonnull 38
      // 18: ifeq 9f
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: aload 3
      // 24: ifnonnull 3c
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: invokevirtual java/io/File.isDirectory ()Z
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: ifeq 9f
      // 3b: aload 0
      // 3c: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 3f: astore 4
      // 41: aload 4
      // 43: arraylength
      // 44: istore 5
      // 46: bipush 0
      // 47: istore 6
      // 49: iload 6
      // 4b: iload 5
      // 4d: if_icmpge 9f
      // 50: aload 4
      // 52: iload 6
      // 54: aaload
      // 55: astore 7
      // 57: aload 1
      // 58: aload 7
      // 5a: invokeinterface java/io/FileFilter.accept (Ljava/io/File;)Z 2
      // 5f: aload 3
      // 60: ifnonnull 8d
      // 63: ifeq 7d
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 2
      // 6e: aload 7
      // 70: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 75: pop
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 7
      // 7f: aload 3
      // 80: ifnonnull 92
      // 83: invokevirtual java/io/File.isDirectory ()Z
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: ifeq 98
      // 90: aload 7
      // 92: aload 1
      // 93: aload 2
      // 94: invokestatic com/finalshell/core/Cz2.r (Ljava/io/File;Ljava/io/FileFilter;Ljava/util/List;)Ljava/util/List;
      // 97: pop
      // 98: iinc 6 1
      // 9b: aload 3
      // 9c: ifnull 49
      // 9f: aload 2
      // a0: areturn
   }

   public static boolean W$boolean(String var0) {
      return H$boolean(new File(var0));
   }

   public static boolean H$boolean(File param0) {
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
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 1
      // 09: ifnonnull 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/io/File.mkdirs ()Z
      // 1a: aload 1
      // 1b: ifnonnull 30
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public static void e() {
      K.clear();
   }

   public static void V(String var0) {
      K.remove(var0);
   }

   public static boolean t(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/Cz2.K Ljava/util/Map;
      // 0c: aload 2
      // 0d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 12: aload 1
      // 13: ifnonnull 3b
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/Cz2.K Ljava/util/Map;
      // 23: aload 2
      // 24: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: ireturn
      // 30: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: getstatic com/finalshell/core/Cz2.W Ljavax/swing/filechooser/FileSystemView;
      // 37: aload 0
      // 38: invokevirtual javax/swing/filechooser/FileSystemView.isDrive (Ljava/io/File;)Z
      // 3b: istore 3
      // 3c: getstatic com/finalshell/core/Cz2.K Ljava/util/Map;
      // 3f: aload 2
      // 40: iload 3
      // 41: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 49: pop
      // 4a: iload 3
      // 4b: ireturn
   }

   public static void n() {
      x.clear();
   }

   public static void q(String var0) {
      x.remove(var0);
   }

   public static boolean o(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/Cz2.x Ljava/util/Map;
      // 0c: aload 2
      // 0d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 12: aload 1
      // 13: ifnonnull 3b
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/Cz2.x Ljava/util/Map;
      // 23: aload 2
      // 24: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: ireturn
      // 30: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: getstatic com/finalshell/core/Cz2.W Ljavax/swing/filechooser/FileSystemView;
      // 37: aload 0
      // 38: invokevirtual javax/swing/filechooser/FileSystemView.isComputerNode (Ljava/io/File;)Z
      // 3b: istore 3
      // 3c: getstatic com/finalshell/core/Cz2.x Ljava/util/Map;
      // 3f: aload 2
      // 40: iload 3
      // 41: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 49: pop
      // 4a: iload 3
      // 4b: ireturn
   }

   public static void N() {
      j.clear();
   }

   public static void E(String var0) {
      j.remove(var0);
   }

   public static boolean I(File param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 007: astore 2
      // 008: astore 1
      // 009: getstatic com/finalshell/core/Cz2.j Ljava/util/Map;
      // 00c: aload 2
      // 00d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 012: aload 1
      // 013: ifnonnull 036
      // 016: ifeq 037
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: getstatic com/finalshell/core/Cz2.j Ljava/util/Map;
      // 023: aload 2
      // 024: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 029: checkcast java/lang/Boolean
      // 02c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: ireturn
      // 037: aload 0
      // 038: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 03b: aload 1
      // 03c: ifnonnull 054
      // 03f: ifnonnull 10d
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 0
      // 04a: invokestatic com/finalshell/core/Cz2.T (Ljava/io/File;)Ljava/lang/String;
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: astore 4
      // 056: aload 4
      // 058: aload 1
      // 059: ifnonnull 07c
      // 05c: ifnull 071
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 4
      // 068: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 06b: astore 5
      // 06d: aload 1
      // 06e: ifnull 07e
      // 071: aload 0
      // 072: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: astore 5
      // 07e: aload 5
      // 080: sipush -7684
      // 083: sipush 11264
      // 086: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 089: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08c: aload 1
      // 08d: ifnonnull 104
      // 090: ifne 103
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 5
      // 09c: sipush -7691
      // 09f: sipush -22282
      // 0a2: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0a5: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0a8: aload 1
      // 0a9: ifnonnull 104
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: ifne 103
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 5
      // 0bf: sipush -7712
      // 0c2: sipush 1269
      // 0c5: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0c8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0cb: aload 1
      // 0cc: ifnonnull 104
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: ifne 103
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 5
      // 0e2: sipush -7692
      // 0e5: sipush -19979
      // 0e8: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0eb: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0ee: aload 1
      // 0ef: ifnonnull 104
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: ifeq 107
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: bipush 1
      // 104: goto 108
      // 107: bipush 0
      // 108: istore 3
      // 109: aload 1
      // 10a: ifnull 10f
      // 10d: bipush 0
      // 10e: istore 3
      // 10f: getstatic com/finalshell/core/Cz2.j Ljava/util/Map;
      // 112: aload 2
      // 113: iload 3
      // 114: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 117: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11c: pop
      // 11d: iload 3
      // 11e: ireturn
   }

   public static void g() {
      w.clear();
   }

   public static void p(String var0) {
      w.remove(var0);
   }

   public static boolean V(File param0) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/Cz2.w Ljava/util/Map;
      // 11: aload 0
      // 12: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 15: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1a: aload 1
      // 1b: ifnonnull 43
      // 1e: ifeq 3f
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: getstatic com/finalshell/core/Cz2.w Ljava/util/Map;
      // 2b: aload 0
      // 2c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 34: checkcast java/lang/Boolean
      // 37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3a: ireturn
      // 3b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual java/io/File.isFile ()Z
      // 43: istore 2
      // 44: getstatic com/finalshell/core/Cz2.w Ljava/util/Map;
      // 47: aload 0
      // 48: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 4b: iload 2
      // 4c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 54: pop
      // 55: iload 2
      // 56: ireturn
   }

   public static void O() {
      M.clear();
   }

   public static void s(String var0) {
      M.remove(var0);
   }

   public static boolean z(File param0) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/Cz2.M Ljava/util/Map;
      // 11: aload 0
      // 12: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 15: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1a: aload 1
      // 1b: ifnonnull 43
      // 1e: ifeq 3f
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: getstatic com/finalshell/core/Cz2.M Ljava/util/Map;
      // 2b: aload 0
      // 2c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 34: checkcast java/lang/Boolean
      // 37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3a: ireturn
      // 3b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual java/io/File.isDirectory ()Z
      // 43: istore 2
      // 44: getstatic com/finalshell/core/Cz2.M Ljava/util/Map;
      // 47: aload 0
      // 48: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 4b: iload 2
      // 4c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 54: pop
      // 55: iload 2
      // 56: ireturn
   }

   public static void l() {
      E.clear();
   }

   public static void G(String var0) {
      E.remove(var0);
   }

   public static boolean v(File param0) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/Cz2.E Ljava/util/Map;
      // 11: aload 0
      // 12: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 15: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1a: aload 1
      // 1b: ifnonnull 41
      // 1e: ifeq 42
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: getstatic com/finalshell/core/Cz2.E Ljava/util/Map;
      // 2b: aload 0
      // 2c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 34: checkcast java/lang/Boolean
      // 37: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: ireturn
      // 42: aload 0
      // 43: invokevirtual java/io/File.getAbsoluteFile ()Ljava/io/File;
      // 46: astore 0
      // 47: aload 0
      // 48: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 4b: aload 1
      // 4c: ifnonnull 5a
      // 4f: ifnull 6f
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 0
      // 5a: invokevirtual java/io/File.isHidden ()Z
      // 5d: aload 1
      // 5e: ifnonnull 6c
      // 61: ifeq 6f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: istore 2
      // 71: getstatic com/finalshell/core/Cz2.E Ljava/util/Map;
      // 74: aload 0
      // 75: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 78: iload 2
      // 79: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 81: pop
      // 82: iload 2
      // 83: ireturn
   }

   public static void j() {
      Y.clear();
   }

   public static void j$void(String var0) {
      Y.remove(var0);
   }

   public static Yt2 t(File param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 2
      // 04: getstatic com/finalshell/core/Cz2.Y Ljava/util/Map;
      // 07: aload 0
      // 08: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0b: aload 2
      // 0c: ifnonnull 2c
      // 0f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 14: ifeq 35
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getstatic com/finalshell/core/Cz2.Y Ljava/util/Map;
      // 21: aload 0
      // 22: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast com/finalshell/core/Yt2
      // 34: areturn
      // 35: aload 0
      // 36: aload 1
      // 37: invokestatic com/finalshell/core/Cz2.p (Ljava/io/File;Ljava/lang/String;)Lcom/finalshell/core/Yt2;
      // 3a: astore 3
      // 3b: getstatic com/finalshell/core/Cz2.Y Ljava/util/Map;
      // 3e: aload 0
      // 3f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 42: aload 3
      // 43: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 48: pop
      // 49: aload 3
      // 4a: areturn
   }

   public static void R() {
      A.clear();
   }

   public static void W$void(String var0) {
      A.remove(var0);
   }

   public static String X(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/Cz2.A Ljava/util/Map;
      // 0c: aload 2
      // 0d: aload 1
      // 0e: ifnonnull 2b
      // 11: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/Cz2.A Ljava/util/Map;
      // 23: aload 2
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: checkcast java/lang/String
      // 33: areturn
      // 34: getstatic com/finalshell/core/Cz2.W Ljavax/swing/filechooser/FileSystemView;
      // 37: aload 0
      // 38: invokevirtual javax/swing/filechooser/FileSystemView.getSystemDisplayName (Ljava/io/File;)Ljava/lang/String;
      // 3b: astore 3
      // 3c: aload 3
      // 3d: aload 1
      // 3e: ifnonnull 75
      // 41: ifnull 6a
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 3
      // 4c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 4f: aload 1
      // 50: ifnonnull 82
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: ldc_w ""
      // 5d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 60: ifeq 76
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: invokestatic com/finalshell/core/Cz2.T (Ljava/io/File;)Ljava/lang/String;
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: astore 3
      // 76: getstatic com/finalshell/core/Cz2.A Ljava/util/Map;
      // 79: aload 2
      // 7a: aload 3
      // 7b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 80: pop
      // 81: aload 3
      // 82: areturn
   }

   public static void V() {
      e.clear();
   }

   public static void A(String var0) {
      e.remove(var0);
   }

   public static String w(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/Cz2.e Ljava/util/Map;
      // 0c: aload 2
      // 0d: aload 1
      // 0e: ifnonnull 2b
      // 11: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/Cz2.e Ljava/util/Map;
      // 23: aload 2
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: checkcast java/lang/String
      // 33: areturn
      // 34: getstatic com/finalshell/core/Cz2.k Ljava/text/SimpleDateFormat;
      // 37: new java/util/Date
      // 3a: dup
      // 3b: aload 0
      // 3c: invokevirtual java/io/File.lastModified ()J
      // 3f: invokespecial java/util/Date.<init> (J)V
      // 42: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 45: astore 3
      // 46: getstatic com/finalshell/core/Cz2.e Ljava/util/Map;
      // 49: aload 2
      // 4a: aload 3
      // 4b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 50: pop
      // 51: aload 3
      // 52: areturn
   }

   public static void X() {
      N.clear();
   }

   public static void c(String var0) {
      N.remove(var0);
   }

   public static String F(File param0) {
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
      // 04: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 07: astore 2
      // 08: astore 1
      // 09: getstatic com/finalshell/core/Cz2.N Ljava/util/Map;
      // 0c: aload 2
      // 0d: aload 1
      // 0e: ifnonnull 2b
      // 11: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/Cz2.N Ljava/util/Map;
      // 23: aload 2
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: checkcast java/lang/String
      // 33: areturn
      // 34: getstatic com/finalshell/core/Cz2.k Ljava/text/SimpleDateFormat;
      // 37: new java/util/Date
      // 3a: dup
      // 3b: aload 0
      // 3c: invokevirtual java/io/File.lastModified ()J
      // 3f: invokespecial java/util/Date.<init> (J)V
      // 42: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 45: astore 3
      // 46: getstatic com/finalshell/core/Cz2.N Ljava/util/Map;
      // 49: aload 2
      // 4a: aload 3
      // 4b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 50: pop
      // 51: aload 3
      // 52: areturn
   }

   public static void k() {
      f.clear();
   }

   public static void C(String var0) {
      f.remove(var0);
   }

   public static String T(File param0) {
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
      // 06: ifnonnull 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: ldc_w ""
      // 16: areturn
      // 17: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1f: astore 2
      // 20: getstatic com/finalshell/core/Cz2.f Ljava/util/Map;
      // 23: aload 2
      // 24: aload 1
      // 25: ifnonnull 42
      // 28: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2d: ifeq 4b
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: getstatic com/finalshell/core/Cz2.f Ljava/util/Map;
      // 3a: aload 2
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 47: checkcast java/lang/String
      // 4a: areturn
      // 4b: getstatic com/finalshell/core/Cz2.W Ljavax/swing/filechooser/FileSystemView;
      // 4e: aload 0
      // 4f: invokevirtual javax/swing/filechooser/FileSystemView.getSystemTypeDescription (Ljava/io/File;)Ljava/lang/String;
      // 52: astore 3
      // 53: getstatic com/finalshell/core/Cz2.f Ljava/util/Map;
      // 56: aload 2
      // 57: aload 3
      // 58: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5d: pop
      // 5e: aload 3
      // 5f: areturn
   }

   public static ImageIcon C() {
      return p;
   }

   public static ImageIcon B(File var0) {
      return U(var0, false);
   }

   public static ImageIcon U(File var0, boolean var1) {
      return q(var0, var1);
   }

   public static ImageIcon q(File var0, boolean var1) {
      return a(var0, var1, true);
   }

   public static ImageIcon a(File param0, boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: aload 3
      // 006: ifnonnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: invokestatic com/finalshell/core/Cz2.z (Ljava/io/File;)Z
      // 01d: aload 3
      // 01e: ifnonnull 069
      // 021: ifne 05e
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 02f: bipush 0
      // 030: invokestatic com/finalshell/core/Cz2.G (Ljava/lang/String;Z)Ljava/lang/String;
      // 033: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 036: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 039: astore 4
      // 03b: aload 4
      // 03d: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 040: ldc_w ""
      // 043: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 046: aload 3
      // 047: ifnonnull 0da
      // 04a: ifeq 0d6
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 058: astore 4
      // 05a: aload 3
      // 05b: ifnull 0d6
      // 05e: aload 0
      // 05f: invokestatic com/finalshell/core/Cz2.I (Ljava/io/File;)Z
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 3
      // 06a: ifnonnull 091
      // 06d: ifeq 086
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: sipush -7701
      // 07a: sipush -24396
      // 07d: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 080: astore 4
      // 082: aload 3
      // 083: ifnull 0d6
      // 086: aload 0
      // 087: invokestatic com/finalshell/core/Cz2.t (Ljava/io/File;)Z
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 3
      // 092: ifnonnull 0b9
      // 095: ifeq 0ae
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: sipush -7695
      // 0a2: sipush -19006
      // 0a5: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0a8: astore 4
      // 0aa: aload 3
      // 0ab: ifnull 0d6
      // 0ae: aload 0
      // 0af: invokestatic com/finalshell/core/Cz2.o (Ljava/io/File;)Z
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: ifeq 0cb
      // 0bc: sipush -7689
      // 0bf: sipush -4457
      // 0c2: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0c5: astore 4
      // 0c7: aload 3
      // 0c8: ifnull 0d6
      // 0cb: sipush -7702
      // 0ce: sipush -18877
      // 0d1: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 0d4: astore 4
      // 0d6: aload 0
      // 0d7: invokestatic com/finalshell/core/Cz2.v (Ljava/io/File;)Z
      // 0da: ifeq 0e7
      // 0dd: ldc_w 0.5
      // 0e0: goto 0e8
      // 0e3: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: fconst_1
      // 0e8: fstore 5
      // 0ea: aload 4
      // 0ec: iload 1
      // 0ed: fload 5
      // 0ef: iload 2
      // 0f0: invokestatic com/finalshell/core/Cz2.J (Ljava/lang/String;ZFZ)Ljava/lang/String;
      // 0f3: astore 6
      // 0f5: getstatic com/finalshell/core/Cz2.z Ljava/lang/Object;
      // 0f8: dup
      // 0f9: astore 8
      // 0fb: monitorenter
      // 0fc: getstatic com/finalshell/core/Cz2.D Ljava/util/Map;
      // 0ff: aload 6
      // 101: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 106: istore 7
      // 108: aload 8
      // 10a: monitorexit
      // 10b: goto 116
      // 10e: astore 9
      // 110: aload 8
      // 112: monitorexit
      // 113: aload 9
      // 115: athrow
      // 116: iload 7
      // 118: aload 3
      // 119: ifnonnull 147
      // 11c: ifeq 146
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: getstatic com/finalshell/core/Cz2.z Ljava/lang/Object;
      // 129: dup
      // 12a: astore 8
      // 12c: monitorenter
      // 12d: getstatic com/finalshell/core/Cz2.D Ljava/util/Map;
      // 130: aload 6
      // 132: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 137: checkcast javax/swing/ImageIcon
      // 13a: aload 8
      // 13c: monitorexit
      // 13d: areturn
      // 13e: astore 10
      // 140: aload 8
      // 142: monitorexit
      // 143: aload 10
      // 145: athrow
      // 146: iload 1
      // 147: aload 4
      // 149: fload 5
      // 14b: invokestatic com/finalshell/core/Cz2.a (ZLjava/lang/String;F)Ljavax/swing/ImageIcon;
      // 14e: astore 8
      // 150: aload 8
      // 152: aload 3
      // 153: ifnonnull 176
      // 156: ifnonnull 178
      // 159: goto 160
      // 15c: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: iload 1
      // 161: sipush -7709
      // 164: sipush 27177
      // 167: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 16a: fload 5
      // 16c: invokestatic com/finalshell/core/Cz2.a (ZLjava/lang/String;F)Ljavax/swing/ImageIcon;
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: astore 8
      // 178: iload 2
      // 179: ifeq 1a2
      // 17c: getstatic com/finalshell/core/Cz2.z Ljava/lang/Object;
      // 17f: dup
      // 180: astore 9
      // 182: monitorenter
      // 183: getstatic com/finalshell/core/Cz2.D Ljava/util/Map;
      // 186: aload 6
      // 188: aload 8
      // 18a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18f: pop
      // 190: aload 9
      // 192: monitorexit
      // 193: goto 19e
      // 196: astore 11
      // 198: aload 9
      // 19a: monitorexit
      // 19b: aload 11
      // 19d: athrow
      // 19e: aload 3
      // 19f: ifnull 1f4
      // 1a2: getstatic com/finalshell/core/Cz2.z Ljava/lang/Object;
      // 1a5: dup
      // 1a6: astore 9
      // 1a8: monitorenter
      // 1a9: getstatic com/finalshell/core/Cz2.D Ljava/util/Map;
      // 1ac: aload 4
      // 1ae: iload 1
      // 1af: fload 5
      // 1b1: bipush 1
      // 1b2: invokestatic com/finalshell/core/Cz2.J (Ljava/lang/String;ZFZ)Ljava/lang/String;
      // 1b5: aload 8
      // 1b7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1bc: pop
      // 1bd: aload 9
      // 1bf: monitorexit
      // 1c0: goto 1cb
      // 1c3: astore 12
      // 1c5: aload 9
      // 1c7: monitorexit
      // 1c8: aload 12
      // 1ca: athrow
      // 1cb: aload 8
      // 1cd: invokestatic com/finalshell/core/Xg2.J (Ljavax/swing/ImageIcon;)Ljavax/swing/ImageIcon;
      // 1d0: astore 8
      // 1d2: getstatic com/finalshell/core/Cz2.z Ljava/lang/Object;
      // 1d5: dup
      // 1d6: astore 9
      // 1d8: monitorenter
      // 1d9: getstatic com/finalshell/core/Cz2.D Ljava/util/Map;
      // 1dc: aload 6
      // 1de: aload 8
      // 1e0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1e5: pop
      // 1e6: aload 9
      // 1e8: monitorexit
      // 1e9: goto 1f4
      // 1ec: astore 13
      // 1ee: aload 9
      // 1f0: monitorexit
      // 1f1: aload 13
      // 1f3: athrow
      // 1f4: aload 8
      // 1f6: areturn
   }

   public static String J(String var0, boolean var1, float var2, boolean var3) {
      return var0 + a(-7687, 19566) + var1 + a(-7687, 19566) + var2 + a(-7687, 19566) + var3;
   }

   public static ImageIcon a(boolean param0, String param1, float param2) {
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
      // 04: ldc com/finalshell/core/Cz2
      // 06: new java/lang/StringBuilder
      // 09: dup
      // 0a: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d: sipush -7735
      // 10: sipush -10723
      // 13: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 16: aload 3
      // 17: ifnonnull 38
      // 1a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d: iload 0
      // 1e: ifeq 3b
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: sipush -7685
      // 2b: sipush -24027
      // 2e: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: goto 44
      // 3b: sipush -7710
      // 3e: sipush 8809
      // 41: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: sipush -7697
      // 4a: sipush 1654
      // 4d: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: aload 1
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: sipush -7705
      // 5a: sipush 6551
      // 5d: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: fload 2
      // 67: invokestatic com/finalshell/core/Cz2.D (Ljava/lang/Class;Ljava/lang/String;F)Ljavax/swing/ImageIcon;
      // 6a: areturn
   }

   public static ImageIcon m(java.lang.Class var0, String var1) {
      return D(var0, var1, 1.0F);
   }

   public static ImageIcon D(java.lang.Class param0, String param1, float param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: new java/lang/StringBuilder
      // 06: dup
      // 07: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a: aload 0
      // 0b: invokevirtual java/lang/Class.getCanonicalName ()Ljava/lang/String;
      // 0e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11: sipush -7683
      // 14: sipush -3178
      // 17: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 1a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d: aload 1
      // 1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21: sipush -7687
      // 24: sipush 19566
      // 27: invokestatic com/finalshell/core/Cz2.a (II)Ljava/lang/String;
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: fload 2
      // 2e: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 31: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34: astore 4
      // 36: astore 3
      // 37: getstatic com/finalshell/core/Cz2.S Ljava/util/Map;
      // 3a: aload 4
      // 3c: aload 3
      // 3d: ifnonnull 5b
      // 40: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 45: ifeq 64
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: getstatic com/finalshell/core/Cz2.S Ljava/util/Map;
      // 52: aload 4
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 60: checkcast javax/swing/ImageIcon
      // 63: areturn
      // 64: aload 0
      // 65: aload 1
      // 66: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 69: astore 5
      // 6b: aload 5
      // 6d: ifnull 98
      // 70: new javax/swing/ImageIcon
      // 73: dup
      // 74: aload 5
      // 76: invokespecial javax/swing/ImageIcon.<init> (Ljava/net/URL;)V
      // 79: astore 6
      // 7b: aload 3
      // 7c: ifnonnull a8
      // 7f: fload 2
      // 80: fconst_1
      // 81: fcmpg
      // 82: ifge 9b
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/Cz2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 6
      // 8e: fload 2
      // 8f: invokestatic com/finalshell/core/Xg2.f (Ljavax/swing/ImageIcon;F)Ljavax/swing/ImageIcon;
      // 92: astore 6
      // 94: aload 3
      // 95: ifnull 9b
      // 98: aconst_null
      // 99: astore 6
      // 9b: getstatic com/finalshell/core/Cz2.S Ljava/util/Map;
      // 9e: aload 4
      // a0: aload 6
      // a2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a7: pop
      // a8: aload 6
      // aa: areturn
   }

   public static WC_2 l(File var0, O32 var1) {
      return S(var0, var1, b(3860, 1688288127278619044L));
   }

   public static WC_2 S(File var0, O32 var1, long var2) {
      WC_2 var4 = new WC_2(a(-7711, 11647) + var0.getName(), var2, 0L);
      var4.q(new RK3(var0, var1, var4));
      var4.O(true);
      return var4;
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -7703) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 156;
               break;
            case 1:
               var10000 = 232;
               break;
            case 2:
               var10000 = 134;
               break;
            case 3:
               var10000 = 194;
               break;
            case 4:
               var10000 = 217;
               break;
            case 5:
               var10000 = 9;
               break;
            case 6:
               var10000 = 199;
               break;
            case 7:
               var10000 = 102;
               break;
            case 8:
               var10000 = 125;
               break;
            case 9:
               var10000 = 204;
               break;
            case 10:
               var10000 = 123;
               break;
            case 11:
               var10000 = 192;
               break;
            case 12:
               var10000 = 151;
               break;
            case 13:
               var10000 = 154;
               break;
            case 14:
               var10000 = 220;
               break;
            case 15:
               var10000 = 149;
               break;
            case 16:
               var10000 = 200;
               break;
            case 17:
               var10000 = 162;
               break;
            case 18:
               var10000 = 240;
               break;
            case 19:
               var10000 = 58;
               break;
            case 20:
               var10000 = 198;
               break;
            case 21:
               var10000 = 183;
               break;
            case 22:
               var10000 = 24;
               break;
            case 23:
               var10000 = 90;
               break;
            case 24:
               var10000 = 93;
               break;
            case 25:
               var10000 = 63;
               break;
            case 26:
               var10000 = 121;
               break;
            case 27:
               var10000 = 75;
               break;
            case 28:
               var10000 = 17;
               break;
            case 29:
               var10000 = 22;
               break;
            case 30:
               var10000 = 224;
               break;
            case 31:
               var10000 = 138;
               break;
            case 32:
               var10000 = 96;
               break;
            case 33:
               var10000 = 55;
               break;
            case 34:
               var10000 = 238;
               break;
            case 35:
               var10000 = 207;
               break;
            case 36:
               var10000 = 48;
               break;
            case 37:
               var10000 = 5;
               break;
            case 38:
               var10000 = 18;
               break;
            case 39:
               var10000 = 83;
               break;
            case 40:
               var10000 = 20;
               break;
            case 41:
               var10000 = 89;
               break;
            case 42:
               var10000 = 165;
               break;
            case 43:
               var10000 = 249;
               break;
            case 44:
               var10000 = 237;
               break;
            case 45:
               var10000 = 40;
               break;
            case 46:
               var10000 = 103;
               break;
            case 47:
               var10000 = 14;
               break;
            case 48:
               var10000 = 205;
               break;
            case 49:
               var10000 = 197;
               break;
            case 50:
               var10000 = 8;
               break;
            case 51:
               var10000 = 144;
               break;
            case 52:
               var10000 = 2;
               break;
            case 53:
               var10000 = 174;
               break;
            case 54:
               var10000 = 170;
               break;
            case 55:
               var10000 = 234;
               break;
            case 56:
               var10000 = 235;
               break;
            case 57:
               var10000 = 254;
               break;
            case 58:
               var10000 = 6;
               break;
            case 59:
               var10000 = 208;
               break;
            case 60:
               var10000 = 21;
               break;
            case 61:
               var10000 = 7;
               break;
            case 62:
               var10000 = 176;
               break;
            case 63:
               var10000 = 164;
               break;
            case 64:
               var10000 = 227;
               break;
            case 65:
               var10000 = 214;
               break;
            case 66:
               var10000 = 130;
               break;
            case 67:
               var10000 = 181;
               break;
            case 68:
               var10000 = 136;
               break;
            case 69:
               var10000 = 95;
               break;
            case 70:
               var10000 = 70;
               break;
            case 71:
               var10000 = 231;
               break;
            case 72:
               var10000 = 171;
               break;
            case 73:
               var10000 = 30;
               break;
            case 74:
               var10000 = 0;
               break;
            case 75:
               var10000 = 111;
               break;
            case 76:
               var10000 = 255;
               break;
            case 77:
               var10000 = 122;
               break;
            case 78:
               var10000 = 106;
               break;
            case 79:
               var10000 = 99;
               break;
            case 80:
               var10000 = 16;
               break;
            case 81:
               var10000 = 12;
               break;
            case 82:
               var10000 = 215;
               break;
            case 83:
               var10000 = 4;
               break;
            case 84:
               var10000 = 218;
               break;
            case 85:
               var10000 = 23;
               break;
            case 86:
               var10000 = 243;
               break;
            case 87:
               var10000 = 132;
               break;
            case 88:
               var10000 = 107;
               break;
            case 89:
               var10000 = 26;
               break;
            case 90:
               var10000 = 28;
               break;
            case 91:
               var10000 = 124;
               break;
            case 92:
               var10000 = 226;
               break;
            case 93:
               var10000 = 44;
               break;
            case 94:
               var10000 = 195;
               break;
            case 95:
               var10000 = 105;
               break;
            case 96:
               var10000 = 109;
               break;
            case 97:
               var10000 = 213;
               break;
            case 98:
               var10000 = 253;
               break;
            case 99:
               var10000 = 236;
               break;
            case 100:
               var10000 = 180;
               break;
            case 101:
               var10000 = 19;
               break;
            case 102:
               var10000 = 177;
               break;
            case 103:
               var10000 = 206;
               break;
            case 104:
               var10000 = 72;
               break;
            case 105:
               var10000 = 142;
               break;
            case 106:
               var10000 = 84;
               break;
            case 107:
               var10000 = 118;
               break;
            case 108:
               var10000 = 219;
               break;
            case 109:
               var10000 = 73;
               break;
            case 110:
               var10000 = 246;
               break;
            case 111:
               var10000 = 230;
               break;
            case 112:
               var10000 = 115;
               break;
            case 113:
               var10000 = 85;
               break;
            case 114:
               var10000 = 186;
               break;
            case 115:
               var10000 = 127;
               break;
            case 116:
               var10000 = 175;
               break;
            case 117:
               var10000 = 128;
               break;
            case 118:
               var10000 = 79;
               break;
            case 119:
               var10000 = 34;
               break;
            case 120:
               var10000 = 182;
               break;
            case 121:
               var10000 = 119;
               break;
            case 122:
               var10000 = 190;
               break;
            case 123:
               var10000 = 193;
               break;
            case 124:
               var10000 = 45;
               break;
            case 125:
               var10000 = 221;
               break;
            case 126:
               var10000 = 113;
               break;
            case 127:
               var10000 = 216;
               break;
            case 128:
               var10000 = 82;
               break;
            case 129:
               var10000 = 153;
               break;
            case 130:
               var10000 = 250;
               break;
            case 131:
               var10000 = 32;
               break;
            case 132:
               var10000 = 33;
               break;
            case 133:
               var10000 = 252;
               break;
            case 134:
               var10000 = 101;
               break;
            case 135:
               var10000 = 47;
               break;
            case 136:
               var10000 = 189;
               break;
            case 137:
               var10000 = 78;
               break;
            case 138:
               var10000 = 53;
               break;
            case 139:
               var10000 = 43;
               break;
            case 140:
               var10000 = 210;
               break;
            case 141:
               var10000 = 37;
               break;
            case 142:
               var10000 = 80;
               break;
            case 143:
               var10000 = 251;
               break;
            case 144:
               var10000 = 150;
               break;
            case 145:
               var10000 = 54;
               break;
            case 146:
               var10000 = 25;
               break;
            case 147:
               var10000 = 59;
               break;
            case 148:
               var10000 = 202;
               break;
            case 149:
               var10000 = 184;
               break;
            case 150:
               var10000 = 157;
               break;
            case 151:
               var10000 = 159;
               break;
            case 152:
               var10000 = 50;
               break;
            case 153:
               var10000 = 178;
               break;
            case 154:
               var10000 = 247;
               break;
            case 155:
               var10000 = 158;
               break;
            case 156:
               var10000 = 169;
               break;
            case 157:
               var10000 = 201;
               break;
            case 158:
               var10000 = 61;
               break;
            case 159:
               var10000 = 244;
               break;
            case 160:
               var10000 = 52;
               break;
            case 161:
               var10000 = 160;
               break;
            case 162:
               var10000 = 104;
               break;
            case 163:
               var10000 = 98;
               break;
            case 164:
               var10000 = 108;
               break;
            case 165:
               var10000 = 46;
               break;
            case 166:
               var10000 = 1;
               break;
            case 167:
               var10000 = 229;
               break;
            case 168:
               var10000 = 100;
               break;
            case 169:
               var10000 = 173;
               break;
            case 170:
               var10000 = 71;
               break;
            case 171:
               var10000 = 145;
               break;
            case 172:
               var10000 = 35;
               break;
            case 173:
               var10000 = 86;
               break;
            case 174:
               var10000 = 64;
               break;
            case 175:
               var10000 = 15;
               break;
            case 176:
               var10000 = 42;
               break;
            case 177:
               var10000 = 38;
               break;
            case 178:
               var10000 = 148;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 39;
               break;
            case 181:
               var10000 = 74;
               break;
            case 182:
               var10000 = 241;
               break;
            case 183:
               var10000 = 10;
               break;
            case 184:
               var10000 = 225;
               break;
            case 185:
               var10000 = 13;
               break;
            case 186:
               var10000 = 167;
               break;
            case 187:
               var10000 = 29;
               break;
            case 188:
               var10000 = 110;
               break;
            case 189:
               var10000 = 152;
               break;
            case 190:
               var10000 = 185;
               break;
            case 191:
               var10000 = 146;
               break;
            case 192:
               var10000 = 161;
               break;
            case 193:
               var10000 = 222;
               break;
            case 194:
               var10000 = 137;
               break;
            case 195:
               var10000 = 155;
               break;
            case 196:
               var10000 = 67;
               break;
            case 197:
               var10000 = 91;
               break;
            case 198:
               var10000 = 228;
               break;
            case 199:
               var10000 = 31;
               break;
            case 200:
               var10000 = 203;
               break;
            case 201:
               var10000 = 76;
               break;
            case 202:
               var10000 = 140;
               break;
            case 203:
               var10000 = 196;
               break;
            case 204:
               var10000 = 191;
               break;
            case 205:
               var10000 = 94;
               break;
            case 206:
               var10000 = 139;
               break;
            case 207:
               var10000 = 147;
               break;
            case 208:
               var10000 = 27;
               break;
            case 209:
               var10000 = 211;
               break;
            case 210:
               var10000 = 163;
               break;
            case 211:
               var10000 = 81;
               break;
            case 212:
               var10000 = 223;
               break;
            case 213:
               var10000 = 131;
               break;
            case 214:
               var10000 = 188;
               break;
            case 215:
               var10000 = 135;
               break;
            case 216:
               var10000 = 212;
               break;
            case 217:
               var10000 = 172;
               break;
            case 218:
               var10000 = 179;
               break;
            case 219:
               var10000 = 126;
               break;
            case 220:
               var10000 = 65;
               break;
            case 221:
               var10000 = 120;
               break;
            case 222:
               var10000 = 168;
               break;
            case 223:
               var10000 = 36;
               break;
            case 224:
               var10000 = 49;
               break;
            case 225:
               var10000 = 112;
               break;
            case 226:
               var10000 = 166;
               break;
            case 227:
               var10000 = 62;
               break;
            case 228:
               var10000 = 233;
               break;
            case 229:
               var10000 = 248;
               break;
            case 230:
               var10000 = 239;
               break;
            case 231:
               var10000 = 60;
               break;
            case 232:
               var10000 = 209;
               break;
            case 233:
               var10000 = 129;
               break;
            case 234:
               var10000 = 57;
               break;
            case 235:
               var10000 = 51;
               break;
            case 236:
               var10000 = 3;
               break;
            case 237:
               var10000 = 117;
               break;
            case 238:
               var10000 = 92;
               break;
            case 239:
               var10000 = 56;
               break;
            case 240:
               var10000 = 141;
               break;
            case 241:
               var10000 = 133;
               break;
            case 242:
               var10000 = 143;
               break;
            case 243:
               var10000 = 41;
               break;
            case 244:
               var10000 = 116;
               break;
            case 245:
               var10000 = 69;
               break;
            case 246:
               var10000 = 242;
               break;
            case 247:
               var10000 = 245;
               break;
            case 248:
               var10000 = 114;
               break;
            case 249:
               var10000 = 187;
               break;
            case 250:
               var10000 = 88;
               break;
            case 251:
               var10000 = 11;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 77;
               break;
            case 254:
               var10000 = 68;
               break;
            default:
               var10000 = 97;
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
            var8 = var7 % 2;
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
      int var3;
      var3 = var0 ^ (int)(var1 & 32767L) ^ 1445;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3;
      var3 = (var0 ^ (int)var1 ^ 5813) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      int var3;
      char[] var47;
      boolean var5;
      long var8;
      String[] var21 = new String[35];
      int var19 = 0;
      String var18 = "Wÿ;\u0012írR7\u001d\"x6î\u0014 Uý\u0090fPÃ}\bÓ&>\u0094\u0019PÑ\u0095\u0006bè\u009e'O=)\u008eÞ\u0099\u001a\u008biä\\ßv©\u009b°êi\u0087r;º\u0014?æí\u0083»\u008fhé·n\u0096\u0085éphû¨\u008dM3\u0002\u0019\u0011bÍ5îb\u0006>!\u0015Ùu×\u0094\u0082ÁÀlç\u0091Úð\u0097x¹\u0010ñ6\u0089Ü\bf\u0015¾|ÑÇ\u0098qÙº\u0085\u0002zÿ\u000fÛ\u0018\u008dþh!ã\u0001@\u0012¾.}l\u0015\u0007LmÆ½i\u001dÐ\u0004\u007f/=\u0018\u0002\u0014Ô\u0011cý°Æg2\u0090e,\u0097v\u009c\u0093G·§ò\u0013Z\u0005¤ÙÃÿ£\u008d\u0095cO»\u0010MÛët\u0003\u001f\u0004Û\u0015êg\u0003ð\u000bÛ\u0004D$æ$\u0005Û³ÖYt\u0002pò\u0002\u008f{\u0004\u0084çþ\\\u0002\fÁ\u000e#\u007f!\u001fª\u0084iD¸\u001aAÿ|Ý\u0005Ì\u00874ß(\u0005ôÉ\u000b¯X\u0013\u008c\u0088~h\u0098ÉÈKø»â ¥.m\u0087¢\u0082Å\b\u0095 \u0018§üï¥Ù\u0012âäc!\u0085ëvfÏ*\u0090WïÚ¤t\u0005K\u0003É\u000b¡\u0006L\u0098Æ\\z\u008d\b}ÆÙö\u0096\u0097ÔÄ\t\u0091¡\u0098\u0087ìç¡J°\u0011´é©\u0080Üß[÷µøþ½V}^=S";
      int var20 = "Wÿ;\u0012írR7\u001d\"x6î\u0014 Uý\u0090fPÃ}\bÓ&>\u0094\u0019PÑ\u0095\u0006bè\u009e'O=)\u008eÞ\u0099\u001a\u008biä\\ßv©\u009b°êi\u0087r;º\u0014?æí\u0083»\u008fhé·n\u0096\u0085éphû¨\u008dM3\u0002\u0019\u0011bÍ5îb\u0006>!\u0015Ùu×\u0094\u0082ÁÀlç\u0091Úð\u0097x¹\u0010ñ6\u0089Ü\bf\u0015¾|ÑÇ\u0098qÙº\u0085\u0002zÿ\u000fÛ\u0018\u008dþh!ã\u0001@\u0012¾.}l\u0015\u0007LmÆ½i\u001dÐ\u0004\u007f/=\u0018\u0002\u0014Ô\u0011cý°Æg2\u0090e,\u0097v\u009c\u0093G·§ò\u0013Z\u0005¤ÙÃÿ£\u008d\u0095cO»\u0010MÛët\u0003\u001f\u0004Û\u0015êg\u0003ð\u000bÛ\u0004D$æ$\u0005Û³ÖYt\u0002pò\u0002\u008f{\u0004\u0084çþ\\\u0002\fÁ\u000e#\u007f!\u001fª\u0084iD¸\u001aAÿ|Ý\u0005Ì\u00874ß(\u0005ôÉ\u000b¯X\u0013\u008c\u0088~h\u0098ÉÈKø»â ¥.m\u0087¢\u0082Å\b\u0095 \u0018§üï¥Ù\u0012âäc!\u0085ëvfÏ*\u0090WïÚ¤t\u0005K\u0003É\u000b¡\u0006L\u0098Æ\\z\u008d\b}ÆÙö\u0096\u0097ÔÄ\t\u0091¡\u0098\u0087ìç¡J°\u0011´é©\u0080Üß[÷µøþ½V}^=S"
         .length();
      char var17 = 3;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 109;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var55 = var10001.toCharArray();
               int var10004 = var55.length;
               int var22 = 0;
               byte var58 = var10000;
               var47 = var55;
               int var35 = var10004;
               byte var67;
               char[] var75;
               int var10006;
               if (var10004 <= 1) {
                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               } else {
                  var58 = var10000;
                  var35 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var84 = var75[var10006];
                  byte var85;
                  switch (var22 % 7) {
                     case 0:
                        var85 = 94;
                        break;
                     case 1:
                        var85 = 64;
                        break;
                     case 2:
                        var85 = 31;
                        break;
                     case 3:
                        var85 = 20;
                        break;
                     case 4:
                        var85 = 59;
                        break;
                     case 5:
                        var85 = 1;
                        break;
                     default:
                        var85 = 31;
                  }

                  var75[var10006] = (char)(var84 ^ var67 ^ var85);
                  var22++;
                  if (var58 == 0) {
                     var10006 = var58;
                     var75 = var47;
                     var67 = var58;
                  } else {
                     if (var35 <= var22) {
                        break;
                     }

                     var75 = var47;
                     var67 = var58;
                     var10006 = var22;
                  }
               }
            }

            String var60 = new String(var47).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var60;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     b = new String[35];
                     var8 = 6012521551019362092L;
                     long[] var14 = new long[61];
                     var11 = 0;
                     String var12 = "\u0085<*\u0090È\\\u0080ë\u001a¿jFy\u009b\u001e\u0004ºÑ#\u0098íVýÑWDEÿ j=ïå\u000fK!\u0019]±Ti\u001b\u008c\u0010®cÐ£\u008aÂÜÒÕÜ\u00855î\u007fÍÊRZç\u0017\u0014¥}\u0014\u0001Âôê5ÑÀÕ}\u008eÂ\u0005N\u0000Æ=ï×ØT\u0017dÌè¼Ø£[÷©.G\tÞ£Ê\u0016'Kº;a\u0002\u0092^Ç©Ä\u0085+t\u0080kã©\u0005\u0099+Ë;Á\u008f¿\u0085\u0081Ù\u009aÊ\u001a¡þ\u0019÷£q\u00921£Ñ>oìd/rGêÎt\u008f\r\u008cX£\u0011Ö¢\u009aÇì\u0014g#èj\u009b¶CÌâF\u0001[x#äqF/zê\u0087¦Tí\f\u009ad\u0097Ø¯\u0000M\fìb\u0019\u000føÕö\u009d.\u009fÖoo»®½\u0019Q[`2\u0089Uº0:Ê¦c\u009b\u0080\u0007è9ÆlÉY\nQ3\u008dM\u000ed\u009ce3\u0010\u0017N\u0014±o\u000ee\u0083\u0092.fzK'WÅå¡ÌH\u0084¬0g¦\u009câEw@9\u001eü§i0·yß¯>qÎ\u009d\u008e:\u009bU\u001f¾\u0012È®\u008aE¡è eh\u0083\u001c|8{÷b/µôAÖ`ad¤Z¨â\u0098\u0086A³üfÅç~\u0096\u001fXC\u001d\u0099â\u0014I3ª\u0081\u000bxÇQO²º\u0019\u0013±èÃ\u009c\u0010\u0083]\u008eï¢ wµÍaÉä\u0094@\u0082\u0004e\u00ad?Ë\u0098}Ä\u001avÄNÐ¾z6\u0007\u001a\u0012lkæÚý£âÁtÚ\u0013q\u0088ï!»\u0081\u0000\u0011\u0087Ý\\l\"O\u0085Ò±ä\u0003\u008e\u001a©~}È`\u0097¢¹n¬¤jGË\u0090ÊCSF\u007fïÖ\u008e\u0092Ç¸. \n³\u0094\r4òÎöñößq¯";
                     int var13 = "\u0085<*\u0090È\\\u0080ë\u001a¿jFy\u009b\u001e\u0004ºÑ#\u0098íVýÑWDEÿ j=ïå\u000fK!\u0019]±Ti\u001b\u008c\u0010®cÐ£\u008aÂÜÒÕÜ\u00855î\u007fÍÊRZç\u0017\u0014¥}\u0014\u0001Âôê5ÑÀÕ}\u008eÂ\u0005N\u0000Æ=ï×ØT\u0017dÌè¼Ø£[÷©.G\tÞ£Ê\u0016'Kº;a\u0002\u0092^Ç©Ä\u0085+t\u0080kã©\u0005\u0099+Ë;Á\u008f¿\u0085\u0081Ù\u009aÊ\u001a¡þ\u0019÷£q\u00921£Ñ>oìd/rGêÎt\u008f\r\u008cX£\u0011Ö¢\u009aÇì\u0014g#èj\u009b¶CÌâF\u0001[x#äqF/zê\u0087¦Tí\f\u009ad\u0097Ø¯\u0000M\fìb\u0019\u000føÕö\u009d.\u009fÖoo»®½\u0019Q[`2\u0089Uº0:Ê¦c\u009b\u0080\u0007è9ÆlÉY\nQ3\u008dM\u000ed\u009ce3\u0010\u0017N\u0014±o\u000ee\u0083\u0092.fzK'WÅå¡ÌH\u0084¬0g¦\u009câEw@9\u001eü§i0·yß¯>qÎ\u009d\u008e:\u009bU\u001f¾\u0012È®\u008aE¡è eh\u0083\u001c|8{÷b/µôAÖ`ad¤Z¨â\u0098\u0086A³üfÅç~\u0096\u001fXC\u001d\u0099â\u0014I3ª\u0081\u000bxÇQO²º\u0019\u0013±èÃ\u009c\u0010\u0083]\u008eï¢ wµÍaÉä\u0094@\u0082\u0004e\u00ad?Ë\u0098}Ä\u001avÄNÐ¾z6\u0007\u001a\u0012lkæÚý£âÁtÚ\u0013q\u0088ï!»\u0081\u0000\u0011\u0087Ý\\l\"O\u0085Ò±ä\u0003\u008e\u001a©~}È`\u0097¢¹n¬¤jGË\u0090ÊCSF\u007fïÖ\u008e\u0092Ç¸. \n³\u0094\r4òÎöñößq¯"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var37 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var37, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var38 = var11++;
                        long var51 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var61 = -1;

                        while (true) {
                           long var72 = var51 ^ var8;
                           switch (var61) {
                              case 0:
                                 var28[var38] = var72;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[61];
                                    long var0 = 2828086039467416516L;
                                    long[] var6 = new long[6];
                                    var3 = 0;
                                    String var4 = "DÆge¾+N`Dru¦A\u0014S\u00195µ8]áWíî\u001c\u0087°\u009a®nl\u0080";
                                    var5 = "DÆge¾+N`Dru¦A\u0014S\u00195µ8]áWíî\u001c\u0087°\u009a®nl\u0080".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var40 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var41 = var3++;
                                       long var53 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var63 = -1;

                                       while (true) {
                                          var72 = var53 ^ var0;
                                          switch (var63) {
                                             case 0:
                                                var29[var41] = var72;
                                                if (var2 >= var5) {
                                                   g = var6;
                                                   h = new Long[6];
                                                   p = new ImageIcon(Cz2.class.getResource(a(-7694, 32139)));
                                                   W = FileSystemView.getFileSystemView();
                                                   k = new SimpleDateFormat(a(-7707, -15292));
                                                   char[] var30 = new char[a(13079, 2245651693683390115L)];
                                                   var30[0] = (char)a(1374, 8528407966091116783L);
                                                   var30[1] = (char)a(9918, 2017023186835579657L);
                                                   var30[2] = (char)a(24950, 3301034901911626949L);
                                                   var30[3] = (char)a(1790, 3521478675722994539L);
                                                   var30[4] = 0;
                                                   var30[5] = (char)a(16214, 194837993137453809L);
                                                   var30[a(31703, 3187176049905598020L)] = (char)a(11530, 6002117682853095605L);
                                                   var30[a(6864, 5880681253416738687L)] = (char)a(8558, 136705615694505175L);
                                                   var30[a(16078, 3872650368560151362L)] = (char)a(23447, 6164120201284148766L);
                                                   var30[a(29648, 574367108985419377L)] = (char)a(16425, 6214623920860087681L);
                                                   var30[a(28059, 7863235424712091686L)] = (char)a(2263, 6113169809442278725L);
                                                   var30[a(26352, 43710117682045821L)] = (char)a(24750, 6876697962870727999L);
                                                   var30[a(10784, 5564704313605271459L)] = (char)a(25061, 1016223927052756043L);
                                                   var30[a(24366, 5326854593994119855L)] = (char)a(32603, 4842156399121791741L);
                                                   var30[a(31029, 1688431785391848611L)] = (char)a(4691, 1060695702369212403L);
                                                   var30[a(2003, 2214158703794422356L)] = (char)a(29925, 429117191367455061L);
                                                   var30[a(9755, 2444215615459533728L)] = (char)a(1012, 6023208913061611107L);
                                                   var30[a(20583, 2538726776288138746L)] = (char)a(2451, 8066372989849439289L);
                                                   var30[a(13945, 5208197154281173972L)] = (char)a(9026, 2820494131265971913L);
                                                   var30[a(27912, 7940735984101091466L)] = (char)a(20275, 8372848883456068229L);
                                                   var30[a(14582, 7291190811323383155L)] = (char)a(29661, 8146617800018327143L);
                                                   var30[a(144, 9077223971122644284L)] = (char)a(510, 7912463083723523185L);
                                                   var30[a(7996, 2806717476646197940L)] = (char)a(3054, 3116761840534621782L);
                                                   var30[a(25821, 8566349162929742191L)] = (char)a(14875, 7513171815475986343L);
                                                   var30[a(2586, 2752732870487379866L)] = (char)a(2647, 1651069563052199891L);
                                                   var30[a(22602, 7320385355897265663L)] = (char)a(28774, 3417378973183899096L);
                                                   var30[a(13062, 827502618363082393L)] = (char)a(13916, 5050892840990192631L);
                                                   var30[a(24373, 3324617238991231660L)] = (char)a(16959, 4884461596807481242L);
                                                   var30[a(9605, 9206913756112166951L)] = (char)a(21125, 4707269824109795099L);
                                                   R = var30;
                                                   K = new HashMap();
                                                   x = new HashMap();
                                                   j = new HashMap();
                                                   w = new HashMap();
                                                   M = new HashMap();
                                                   E = new HashMap();
                                                   A = new HashMap();
                                                   Y = new HashMap();
                                                   f = new HashMap();
                                                   e = new HashMap();
                                                   N = new HashMap();
                                                   z = new Object();
                                                   D = new HashMap();
                                                   S = new HashMap();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var41] = var72;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "6\u0095©)\u0004þç©0Q`_¸AÑè";
                                                var5 = "6\u0095©)\u0004þç©0Q`_¸AÑè".length();
                                                var2 = 0;
                                          }

                                          byte var42 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var41 = var3++;
                                          var53 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var63 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var38] = var72;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "\u00056{MK\u0019\u0010jt\u0083£l\u001cÕ\u009d\u009b";
                                 var13 = "\u00056{MK\u0019\u0010jt\u0083£l\u001cÕ\u009d\u009b".length();
                                 var10 = 0;
                           }

                           byte var39 = var10;
                           var10 += 8;
                           var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var38 = var11++;
                           var51 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var61 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var60;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "\u008f-\u0013\u001aô\u0017\\\u000eô¡Wn\u0083\u008b\u001c3\u0002\u0004¹4ô¬";
                  var20 = "\u008f-\u0013\u001aô\u0017\\\u000eô¡Wn\u0083\u008b\u001c3\u0002\u0004¹4ô¬".length();
                  var17 = 2;
                  var26 = -1;
            }

            var10000 = 81;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





