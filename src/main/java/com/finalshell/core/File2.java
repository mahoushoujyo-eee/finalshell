package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.awt.Window;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.output.NullOutputStream;

public class File2 {
   public Window l;
   public final long u;
   public final BigInteger G;
   public final long R;
   public final BigInteger P;
   public final long H;
   public final long N;
   public final BigInteger b;
   public final long I;
   public final BigInteger h;
   public final long n;
   public final BigInteger y;
   public final long q;
   public final BigInteger k;
   public final BigInteger Q;
   public final BigInteger Z;
   public final File[] w;
   public UG D;
   public boolean j;
   public int U;
   public boolean O;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;
   public static long[] f;
   public static Long[] g;

   public Window N() {
      Object var1 = 370337906235180180L;
      return (Window)Ref.g(370337906235180180L, var1);
   }

   public void C(Window var1) {
      long var3 = 370337906235180180L;
      Ref.s(370337906235180180L, var1, var3);
   }

   public File2() {
      Vk2.y();
      this.u = b(1450, 2318923212092311860L);
      this.G = BigInteger.valueOf(b(7881, 33653061672604255L));
      this.R = b(30311, 7493746443976833789L);
      Object var2 = 483024724664347952L;
      BigInteger var10003 = (BigInteger)Ref.g(483024724664347952L, var2);
      Object var4 = 483024724664347952L;
      var10003.P = this.multiply((BigInteger)Ref.g(483024724664347952L, var4));
      File2 var1 = this;

      try {
         this.H = b(3662, 273416712236892881L);
         this.N = b(19063, 4358343288720967407L);
         Object var6 = 483024724664347952L;
         BigInteger var10004 = (BigInteger)Ref.g(483024724664347952L, var6);
         Object var8 = 343817520107337839L;
         var10004.b = this.multiply((BigInteger)Ref.g(343817520107337839L, var8));
         this.I = b(30191, 100073967694379387L);
         Object var10 = 483024724664347952L;
         BigInteger var10006 = (BigInteger)Ref.g(483024724664347952L, var10);
         Object var12 = 495802560720461204L;
         var10006.h = this.multiply((BigInteger)Ref.g(495802560720461204L, var12));
         this.n = b(15704, 2946372692575433156L);
         Object var14 = 483024724664347952L;
         BigInteger var10008 = (BigInteger)Ref.g(483024724664347952L, var14);
         Object var16 = 291107217730866810L;
         var10008.y = this.multiply((BigInteger)Ref.g(291107217730866810L, var16));
         this.q = b(14124, 2638665222133398459L);
         Object var18 = 483024724664347952L;
         BigInteger var10010 = (BigInteger)Ref.g(483024724664347952L, var18);
         Object var20 = 150091135317611780L;
         var10010.k = this.multiply((BigInteger)Ref.g(150091135317611780L, var20));
         this.Q = BigInteger.valueOf(b(7881, 33653061672604255L)).multiply(BigInteger.valueOf(b(22664, 184674500732343315L)));
         Object var22 = 483024724664347952L;
         BigInteger var10012 = (BigInteger)Ref.g(483024724664347952L, var22);
         Object var24 = 288071105979823784L;
         var10012.Z = this.multiply((BigInteger)Ref.g(288071105979823784L, var24));
         this.w = new File[0];
         Registry.lookupField(230435673101303976L).setBoolean(this, false);
         Registry.lookupField(589909688581199231L).setInt(this, 0);
         Registry.lookupField(415499299058536700L).setBoolean(this, false);
         if (var1 == null) {
            Ky4.K(new String[5]);
         }
      } catch (NullPointerException var26) {
         throw a(var26);
      }
   }

   public File H(File var1, String[] var2) {
      Ky4[] var3 = Vk2.y();

      try {
         if (var1 == null) {
            throw new NullPointerException(a(21777, -12368));
         }
      } catch (NullPointerException var9) {
         throw a(var9);
      }

      try {
         if (var2 == null) {
            throw new NullPointerException(a(21847, -5734));
         }
      } catch (NullPointerException var10) {
         throw a(var10);
      }

      File var4 = var1;
      String[] var5 = var2;
      int var6 = var2.length;
      int var7 = 0;

      File var10000;
      while (true) {
         if (var7 < var6) {
            String var8 = var5[var7];
            var10000 = new File(var4, var8);
            if (var3 == null) {
               break;
            }

            var4 = var10000;
            var7++;
            if (var3 != null) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   public File u(String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnonnull 1d
      // 08: new java/lang/NullPointerException
      // 0b: dup
      // 0c: sipush 21830
      // 0f: sipush 32093
      // 12: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 15: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 18: athrow
      // 19: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aconst_null
      // 1e: astore 3
      // 1f: aload 1
      // 20: astore 4
      // 22: aload 4
      // 24: arraylength
      // 25: istore 5
      // 27: bipush 0
      // 28: istore 6
      // 2a: iload 6
      // 2c: iload 5
      // 2e: if_icmpge 79
      // 31: aload 4
      // 33: iload 6
      // 35: aaload
      // 36: astore 7
      // 38: aload 3
      // 39: aload 2
      // 3a: ifnull 7a
      // 3d: aload 2
      // 3e: ifnull 71
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: ifnonnull 60
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: new java/io/File
      // 55: dup
      // 56: aload 7
      // 58: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5b: astore 3
      // 5c: aload 2
      // 5d: ifnonnull 72
      // 60: new java/io/File
      // 63: dup
      // 64: aload 3
      // 65: aload 7
      // 67: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: astore 3
      // 72: iinc 6 1
      // 75: aload 2
      // 76: ifnonnull 2a
      // 79: aload 3
      // 7a: areturn
   }

   public String S() {
      return System.getProperty(a(21880, -2672));
   }

   public File H() {
      File var10001;
      String var10003 = (String)(Registry.emptyArgs());
      long var2 = 543253937601422016L;
      Object[] var1 = var10003;
      var10003 = Ref.h(543253937601422016L, var1, var2);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      super(var10003);
      return var10001;
   }

   public String B() {
      return System.getProperty(a(21807, 10500));
   }

   public File K() {
      File var10001;
      String var10003 = (String)(Registry.emptyArgs());
      long var2 = 169445659225053682L;
      Object[] var1 = var10003;
      var10003 = Ref.h(169445659225053682L, var1, var2);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      super(var10003);
      return var10001;
   }

   public FileInputStream N(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 21
      // 0c: ifeq 9a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/io/File.isDirectory ()Z
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 2
      // 22: ifnull 65
      // 25: ifeq 61
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/io/IOException
      // 32: dup
      // 33: new java/lang/StringBuilder
      // 36: dup
      // 37: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a: sipush 21820
      // 3d: sipush -17756
      // 40: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: aload 1
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4a: sipush 21802
      // 4d: sipush -6239
      // 50: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 5c: athrow
      // 5d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 1
      // 62: invokevirtual java/io/File.canRead ()Z
      // 65: ifne c8
      // 68: new java/io/IOException
      // 6b: dup
      // 6c: new java/lang/StringBuilder
      // 6f: dup
      // 70: invokespecial java/lang/StringBuilder.<init> ()V
      // 73: sipush 21882
      // 76: sipush 23816
      // 79: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: aload 1
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 83: sipush 21778
      // 86: sipush -9604
      // 89: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 92: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 95: athrow
      // 96: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: new java/io/FileNotFoundException
      // 9d: dup
      // 9e: new java/lang/StringBuilder
      // a1: dup
      // a2: invokespecial java/lang/StringBuilder.<init> ()V
      // a5: sipush 21882
      // a8: sipush 23816
      // ab: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: aload 1
      // b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b5: sipush 21792
      // b8: sipush -24445
      // bb: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c4: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // c7: athrow
      // c8: new java/io/FileInputStream
      // cb: dup
      // cc: aload 1
      // cd: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // d0: areturn
   }

   public FileOutputStream v$FileOutputStream(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, false);
      long var3 = 286016544931944572L;
      Object[] var2 = var10001;
      var10001 = Ref.h(286016544931944572L, var2, var3);

      try {
         return (FileOutputStream)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public boolean f(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 1
      // 04: invokevirtual java/io/File.mkdirs ()Z
      // 07: istore 3
      // 08: astore 2
      // 09: iload 3
      // 0a: aload 2
      // 0b: ifnull 74
      // 0e: ifeq 73
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: ldc2_w 136992684323528157
      // 1c: astore 4
      // 1e: ldc2_w 136992684323528157
      // 21: aload 4
      // 23: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 26: checkcast com/finalshell/core/UG
      // 29: aload 2
      // 2a: ifnull 56
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: ifnull 73
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w 136992684323528157
      // 42: astore 6
      // 44: ldc2_w 136992684323528157
      // 47: aload 6
      // 49: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4c: checkcast com/finalshell/core/UG
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 1
      // 57: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5a: ldc2_w 295103172862149005
      // 5d: astore 9
      // 5f: astore 8
      // 61: ldc2_w 295103172862149005
      // 64: aload 8
      // 66: aload 9
      // 68: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6b: pop
      // 6c: goto 73
      // 6f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 72: athrow
      // 73: iload 3
      // 74: ireturn
   }

   public FileOutputStream M(File param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 09e
      // 009: invokevirtual java/io/File.exists ()Z
      // 00c: ifeq 09a
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 1
      // 017: invokevirtual java/io/File.isDirectory ()Z
      // 01a: aload 3
      // 01b: ifnull 065
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifeq 061
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: new java/io/IOException
      // 032: dup
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: invokespecial java/lang/StringBuilder.<init> ()V
      // 03a: sipush 21882
      // 03d: sipush 23816
      // 040: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 043: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 046: aload 1
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04a: sipush 21802
      // 04d: sipush -6239
      // 050: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 056: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 059: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 05c: athrow
      // 05d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 1
      // 062: invokevirtual java/io/File.canWrite ()Z
      // 065: ifne 120
      // 068: new java/io/IOException
      // 06b: dup
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 21882
      // 076: sipush 23816
      // 079: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: aload 1
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 083: sipush 21795
      // 086: sipush -9298
      // 089: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 092: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 095: athrow
      // 096: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 1
      // 09b: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 09e: astore 4
      // 0a0: aload 4
      // 0a2: ifnull 120
      // 0a5: aload 0
      // 0a6: aload 4
      // 0a8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ab: ldc2_w 323874994732919696
      // 0ae: astore 6
      // 0b0: astore 5
      // 0b2: ldc2_w 323874994732919696
      // 0b5: aload 5
      // 0b7: aload 6
      // 0b9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bc: checkcast java/lang/Boolean
      // 0bf: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c2: goto 0c9
      // 0c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 3
      // 0ca: ifnull 0ea
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: ifne 120
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: invokevirtual java/io/File.isDirectory ()Z
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: ifne 120
      // 0ed: new java/io/IOException
      // 0f0: dup
      // 0f1: new java/lang/StringBuilder
      // 0f4: dup
      // 0f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f8: sipush 21827
      // 0fb: sipush 3629
      // 0fe: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: aload 4
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 109: sipush 21811
      // 10c: sipush 26285
      // 10f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 11b: athrow
      // 11c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: new java/io/FileOutputStream
      // 123: dup
      // 124: aload 1
      // 125: iload 2
      // 126: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;Z)V
      // 129: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String J(BigInteger var1) {
      Ky4[] var2 = Vk2.y();

      BigInteger var10001;
      label186: {
         label164: {
            try {
               Object var4 = 374453610808315656L;
               var10001 = this.divide((BigInteger)Ref.g(374453610808315656L, var4)).compareTo(BigInteger.ZERO);
               if (var2 == null) {
                  break label186;
               }

               if (!(var10001 > 0)) {
                  break label164;
               }
            } catch (NullPointerException var42) {
               throw a(var42);
            }

            new StringBuilder();
            Object var6 = 374453610808315656L;
            String var3 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(374453610808315656L, var6)))).append(a(21874, -10770)).toString();

            try {
               if (var2 != null) {
                  return var3;
               }
            } catch (NullPointerException var41) {
               boolean var47 = false;
               throw a(var41);
            }
         }

         try {
            var10001 = var1;
            Object var8 = 150091135317611780L;
            this.divide((BigInteger)Ref.g(150091135317611780L, var8)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var40) {
            boolean var48 = false;
            throw a(var40);
         }
      }

      label187: {
         label165: {
            try {
               if (var2 == null) {
                  break label187;
               }

               if (!(var10001 > 0)) {
                  break label165;
               }
            } catch (NullPointerException var39) {
               throw a(var39);
            }

            new StringBuilder();
            Object var10 = 150091135317611780L;
            String var57 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(150091135317611780L, var10)))).append(a(21868, -4103)).toString();

            try {
               if (var2 != null) {
                  return var57;
               }
            } catch (NullPointerException var38) {
               boolean var49 = false;
               throw a(var38);
            }
         }

         try {
            var10001 = var1;
            Object var12 = 291107217730866810L;
            this.divide((BigInteger)Ref.g(291107217730866810L, var12)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var37) {
            boolean var50 = false;
            throw a(var37);
         }
      }

      label188: {
         label166: {
            try {
               if (var2 == null) {
                  break label188;
               }

               if (!(var10001 > 0)) {
                  break label166;
               }
            } catch (NullPointerException var36) {
               throw a(var36);
            }

            new StringBuilder();
            Object var14 = 291107217730866810L;
            String var58 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(291107217730866810L, var14)))).append(a(21794, 992)).toString();

            try {
               if (var2 != null) {
                  return var58;
               }
            } catch (NullPointerException var35) {
               boolean var51 = false;
               throw a(var35);
            }
         }

         try {
            var10001 = var1;
            Object var16 = 495802560720461204L;
            this.divide((BigInteger)Ref.g(495802560720461204L, var16)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var34) {
            boolean var52 = false;
            throw a(var34);
         }
      }

      label189: {
         label167: {
            try {
               if (var2 == null) {
                  break label189;
               }

               if (!(var10001 > 0)) {
                  break label167;
               }
            } catch (NullPointerException var33) {
               throw a(var33);
            }

            new StringBuilder();
            Object var18 = 495802560720461204L;
            String var59 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(495802560720461204L, var18)))).append(a(21845, -6689)).toString();

            try {
               if (var2 != null) {
                  return var59;
               }
            } catch (NullPointerException var32) {
               boolean var53 = false;
               throw a(var32);
            }
         }

         try {
            var10001 = var1;
            Object var20 = 343817520107337839L;
            this.divide((BigInteger)Ref.g(343817520107337839L, var20)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var31) {
            boolean var54 = false;
            throw a(var31);
         }
      }

      label190: {
         label168: {
            try {
               if (var2 == null) {
                  break label190;
               }

               if (!(var10001 > 0)) {
                  break label168;
               }
            } catch (NullPointerException var30) {
               throw a(var30);
            }

            new StringBuilder();
            Object var22 = 343817520107337839L;
            String var60 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(343817520107337839L, var22)))).append(a(21855, 5569)).toString();

            try {
               if (var2 != null) {
                  return var60;
               }
            } catch (NullPointerException var29) {
               boolean var55 = false;
               throw a(var29);
            }
         }

         try {
            var10001 = var1;
            Object var24 = 483024724664347952L;
            this.divide((BigInteger)Ref.g(483024724664347952L, var24)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var28) {
            boolean var56 = false;
            throw a(var28);
         }
      }

      if (var10001 > 0) {
         new StringBuilder();
         Object var26 = 483024724664347952L;
         String var61 = var1.append(String.valueOf(this.divide((BigInteger)Ref.g(483024724664347952L, var26)))).append(a(21862, -24842)).toString();
         if (var2 != null) {
            return var61;
         }
      }

      return var1 + a(21836, -24160);
   }

   public String X(long var1) {
      Object[] var10001 = Registry.packArgs(BigInteger.valueOf(var1));
      long var4 = 491874180315341959L;
      Object[] var3 = var10001;
      var10001 = Ref.h(491874180315341959L, var3, var4);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void H(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 47
      // 0c: ifne 40
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 615606400187031568
      // 1e: astore 5
      // 20: astore 4
      // 22: ldc2_w 615606400187031568
      // 25: aload 4
      // 27: aload 5
      // 29: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c: checkcast java/io/FileOutputStream
      // 2f: goto 36
      // 32: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35: athrow
      // 36: invokevirtual java/io/FileOutputStream.close ()V
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 1
      // 41: invokestatic java/lang/System.currentTimeMillis ()J
      // 44: invokevirtual java/io/File.setLastModified (J)Z
      // 47: istore 3
      // 48: iload 3
      // 49: ifne 72
      // 4c: new java/io/IOException
      // 4f: dup
      // 50: new java/lang/StringBuilder
      // 53: dup
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: sipush 21813
      // 5a: sipush 16823
      // 5d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: aload 1
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 67: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6a: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 6d: athrow
      // 6e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: return
   }

   public File[] o(Collection var1) {
      return var1.toArray(new File[var1.size()]);
   }

   public void d(Collection param1, File param2, IOFileFilter param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 2
      // 04: aload 3
      // 05: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 08: astore 6
      // 0a: astore 5
      // 0c: aload 6
      // 0e: aload 5
      // 10: ifnull 1f
      // 13: ifnull b3
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 6
      // 1f: astore 7
      // 21: aload 7
      // 23: arraylength
      // 24: istore 8
      // 26: bipush 0
      // 27: istore 9
      // 29: iload 9
      // 2b: iload 8
      // 2d: if_icmpge b3
      // 30: aload 7
      // 32: iload 9
      // 34: aaload
      // 35: astore 10
      // 37: aload 10
      // 39: invokevirtual java/io/File.isDirectory ()Z
      // 3c: aload 5
      // 3e: ifnull aa
      // 41: ifeq 9b
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 4
      // 4d: aload 5
      // 4f: ifnull 72
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: ifeq 73
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 1
      // 64: aload 10
      // 66: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: pop
      // 73: aload 0
      // 74: aload 1
      // 75: aload 10
      // 77: aload 3
      // 78: iload 4
      // 7a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 7d: ldc2_w 492716143135183590
      // 80: astore 12
      // 82: astore 11
      // 84: ldc2_w 492716143135183590
      // 87: aload 11
      // 89: aload 12
      // 8b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8e: pop
      // 8f: goto 96
      // 92: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 5
      // 98: ifnonnull ab
      // 9b: aload 1
      // 9c: aload 10
      // 9e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // a3: goto aa
      // a6: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: pop
      // ab: iinc 9 1
      // ae: aload 5
      // b0: ifnonnull 29
      // b3: return
   }

   public Collection Y(File var1, IOFileFilter var2, IOFileFilter var3) {
      Object[] var10001 = Registry.packArgs(var1, var2);
      long var8 = 316304120221523271L;
      Object[] var7 = var10001;
      Ref.h(316304120221523271L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      IOFileFilter var10002 = (IOFileFilter)(Registry.packArgs(var2));
      long var10 = 197777061342061594L;
      Object[] var9 = var10002;
      var10002 = Ref.h(197777061342061594L, var9, var10);

      try {
         var10002 = (IOFileFilter)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      IOFileFilter var4 = var10002;
      IOFileFilter var10003 = (IOFileFilter)(Registry.packArgs(var3));
      long var12 = 418628711909044211L;
      Object[] var11 = var10003;
      var10003 = Ref.h(418628711909044211L, var11, var12);

      try {
         var10003 = (IOFileFilter)var10003;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      IOFileFilter var5 = var10003;
      LinkedList var6 = new LinkedList();
      Object[] var10004 = Registry.packArgs(var6, var1, FileFilterUtils.or(var4, var5), false);
      long var14 = 492716143135183590L;
      Object[] var13 = var10004;
      Ref.h(492716143135183590L, var13, var14);

      try {
         return var6;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }

   public void a(File var1, IOFileFilter var2) {
      try {
         if (!var1.isDirectory()) {
            throw new IllegalArgumentException(a(21859, -5526) + var1);
         }
      } catch (NullPointerException var4) {
         throw a(var4);
      }

      try {
         if (var2 == null) {
            throw new NullPointerException(a(21861, 30246));
         }
      } catch (NullPointerException var3) {
         throw a(var3);
      }
   }

   public IOFileFilter f(IOFileFilter var1) {
      return FileFilterUtils.and(var1, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE));
   }

   public IOFileFilter t(IOFileFilter var1) {
      Ky4[] var2 = Vk2.y();

      try {
         if (var2 == null) {
            return var1;
         }

         if (var1 == null) {
            return FalseFileFilter.INSTANCE;
         }
      } catch (NullPointerException var3) {
         throw a(var3);
      }

      return FileFilterUtils.and(var1, DirectoryFileFilter.INSTANCE);
   }

   public Collection u(File param1, IOFileFilter param2, IOFileFilter param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 06: ldc2_w 316304120221523271
      // 09: astore 9
      // 0b: astore 8
      // 0d: ldc2_w 316304120221523271
      // 10: aload 8
      // 12: aload 9
      // 14: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: pop
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 2
      // 21: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 24: ldc2_w 197777061342061594
      // 27: astore 11
      // 29: astore 10
      // 2b: ldc2_w 197777061342061594
      // 2e: aload 10
      // 30: aload 11
      // 32: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 35: checkcast org/apache/commons/io/filefilter/IOFileFilter
      // 38: goto 3f
      // 3b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: astore 5
      // 41: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 44: aload 0
      // 45: aload 3
      // 46: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 49: ldc2_w 418628711909044211
      // 4c: astore 13
      // 4e: astore 12
      // 50: ldc2_w 418628711909044211
      // 53: aload 12
      // 55: aload 13
      // 57: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a: checkcast org/apache/commons/io/filefilter/IOFileFilter
      // 5d: goto 64
      // 60: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 63: athrow
      // 64: astore 6
      // 66: astore 4
      // 68: new java/util/LinkedList
      // 6b: dup
      // 6c: invokespecial java/util/LinkedList.<init> ()V
      // 6f: astore 7
      // 71: aload 4
      // 73: ifnull c6
      // 76: aload 1
      // 77: invokevirtual java/io/File.isDirectory ()Z
      // 7a: ifeq 94
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: aload 7
      // 86: aload 1
      // 87: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 8c: pop
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 0
      // 95: aload 7
      // 97: aload 1
      // 98: bipush 2
      // 99: anewarray 364
      // 9c: dup
      // 9d: bipush 0
      // 9e: aload 5
      // a0: aastore
      // a1: dup
      // a2: bipush 1
      // a3: aload 6
      // a5: aastore
      // a6: invokestatic org/apache/commons/io/filefilter/FileFilterUtils.or ([Lorg/apache/commons/io/filefilter/IOFileFilter;)Lorg/apache/commons/io/filefilter/IOFileFilter;
      // a9: bipush 1
      // aa: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // ad: ldc2_w 492716143135183590
      // b0: astore 15
      // b2: astore 14
      // b4: ldc2_w 492716143135183590
      // b7: aload 14
      // b9: aload 15
      // bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // be: pop
      // bf: goto c6
      // c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 7
      // c8: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // cb: ifnull dc
      // ce: bipush 4
      // cf: anewarray 171
      // d2: invokestatic com/finalshell/core/Vk2.P ([Lcom/finalshell/ui/panel/Ky4;)V
      // d5: goto dc
      // d8: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // db: athrow
      // dc: areturn
   }

   public Iterator M(File var1, IOFileFilter var2, IOFileFilter var3) {
      Collection var10001 = (Collection)(Registry.packArgs(var1, var2, var3));
      long var5 = 332604683522341613L;
      Object[] var4 = var10001;
      var10001 = Ref.h(332604683522341613L, var4, var5);

      try {
         var10001 = (Collection)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      return var10001.iterator();
   }

   public Iterator o(File var1, IOFileFilter var2, IOFileFilter var3) {
      Collection var10001 = (Collection)(Registry.packArgs(var1, var2, var3));
      long var5 = 460865585641519619L;
      Object[] var4 = var10001;
      var10001 = Ref.h(460865585641519619L, var4, var5);

      try {
         var10001 = (Collection)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      return var10001.iterator();
   }

   public String[] a(String[] var1) {
      Ky4[] var10000 = Vk2.y();
      String[] var3 = new String[var1.length];
      int var4 = 0;
      Ky4[] var2 = var10000;

      while (true) {
         if (var4 < var1.length) {
      long var6;
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = "." + var1[var4];
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (NullPointerException var5) {
      long var6;
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public Collection Y(File var1, String[] var2, boolean var3) {
      Ky4[] var4 = Vk2.y();

      Object var5;
      label62: {
         Object var10000;
         label69: {
            label66: {
               try {
                  var10000 = var2;
                  if (var4 == null) {
                     break label69;
                  }

                  if (var2 != null) {
                     break label66;
                  }
               } catch (NullPointerException var16) {
                  throw a(var16);
               }

               var5 = TrueFileFilter.INSTANCE;

               try {
                  if (var4 != null) {
                     break label62;
                  }
               } catch (NullPointerException var15) {
                  boolean var10001 = false;
                  throw a(var15);
               }
            }

            try {
               var10000 = this;
               Object[] var19 = Registry.packArgs(var2);
               long var8 = 538069371577380196L;
               Object[] var7 = var19;
               Ref.h(538069371577380196L, var7, var8);

               try {
                  ;
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }
            } catch (NullPointerException var14) {
               boolean var18 = false;
               throw a(var14);
            }
         }

         Object var6 = var10000;
         var5 = new SuffixFileFilter((String[])var6);
      }

      File var20;
      Object var10002;
      IOFileFilter var10003;
      label44: {
         try {
            var20 = var1;
            var10002 = var5;
            if (var3) {
               var10003 = TrueFileFilter.INSTANCE;
               break label44;
            }
         } catch (NullPointerException var13) {
            throw a(var13);
         }

         var10003 = FalseFileFilter.INSTANCE;
      }

      Object[] var21 = Registry.packArgs(var20, var10002, var10003);
      long var10 = 332604683522341613L;
      Object[] var9 = var21;
      var20 = (File)Ref.h(332604683522341613L, var9, var10);

      try {
         return (Collection)var20;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public Iterator p(File var1, String[] var2, boolean var3) {
      Object[] var10001 = Registry.packArgs(var1, var2, var3);
      long var5 = 131995603476880069L;
      Object[] var4 = var10001;
      var10001 = Ref.h(131995603476880069L, var4, var5);

      try {
         var10001 = (Collection)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      return var10001.iterator();
   }

   public boolean a(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 1
      // 004: invokevirtual java/io/File.exists ()Z
      // 007: istore 4
      // 009: astore 3
      // 00a: iload 4
      // 00c: aload 3
      // 00d: ifnull 026
      // 010: aload 2
      // 011: invokevirtual java/io/File.exists ()Z
      // 014: if_icmpeq 024
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: bipush 0
      // 01f: ireturn
      // 020: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: iload 4
      // 026: aload 3
      // 027: ifnull 03e
      // 02a: ifne 03a
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: bipush 1
      // 035: ireturn
      // 036: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual java/io/File.isDirectory ()Z
      // 03e: aload 3
      // 03f: ifnull 057
      // 042: ifne 065
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 2
      // 04d: invokevirtual java/io/File.isDirectory ()Z
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: aload 3
      // 058: ifnull 083
      // 05b: ifeq 07a
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: new java/io/IOException
      // 068: dup
      // 069: sipush 21886
      // 06c: sipush 16973
      // 06f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 072: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 075: athrow
      // 076: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 1
      // 07b: invokevirtual java/io/File.length ()J
      // 07e: aload 2
      // 07f: invokevirtual java/io/File.length ()J
      // 082: lcmp
      // 083: aload 3
      // 084: ifnull 0a2
      // 087: ifeq 097
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: bipush 0
      // 092: ireturn
      // 093: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 1
      // 098: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 09b: aload 2
      // 09c: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 09f: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // 0a2: aload 3
      // 0a3: ifnull 0b1
      // 0a6: ifeq 0b2
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: bipush 1
      // 0b1: ireturn
      // 0b2: new java/io/FileInputStream
      // 0b5: dup
      // 0b6: aload 1
      // 0b7: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0ba: astore 5
      // 0bc: new java/io/FileInputStream
      // 0bf: dup
      // 0c0: aload 2
      // 0c1: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0c4: astore 6
      // 0c6: aload 5
      // 0c8: aload 6
      // 0ca: invokestatic org/apache/commons/io/IOUtils.contentEquals (Ljava/io/InputStream;Ljava/io/InputStream;)Z
      // 0cd: istore 7
      // 0cf: aload 6
      // 0d1: invokevirtual java/io/InputStream.close ()V
      // 0d4: aload 5
      // 0d6: invokevirtual java/io/InputStream.close ()V
      // 0d9: iload 7
      // 0db: ireturn
      // 0dc: astore 7
      // 0de: aload 6
      // 0e0: invokevirtual java/io/InputStream.close ()V
      // 0e3: goto 0ef
      // 0e6: astore 8
      // 0e8: aload 7
      // 0ea: aload 8
      // 0ec: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0ef: aload 7
      // 0f1: athrow
      // 0f2: astore 6
      // 0f4: aload 5
      // 0f6: invokevirtual java/io/InputStream.close ()V
      // 0f9: goto 105
      // 0fc: astore 7
      // 0fe: aload 6
      // 100: aload 7
      // 102: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 105: aload 6
      // 107: athrow
   }

   public boolean q(File param1, File param2, String param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 1
      // 004: invokevirtual java/io/File.exists ()Z
      // 007: istore 5
      // 009: astore 4
      // 00b: iload 5
      // 00d: aload 4
      // 00f: ifnull 028
      // 012: aload 2
      // 013: invokevirtual java/io/File.exists ()Z
      // 016: if_icmpeq 026
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: iload 5
      // 028: aload 4
      // 02a: ifnull 041
      // 02d: ifne 03d
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 1
      // 03e: invokevirtual java/io/File.isDirectory ()Z
      // 041: aload 4
      // 043: ifnull 05b
      // 046: ifne 06a
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 2
      // 051: invokevirtual java/io/File.isDirectory ()Z
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 4
      // 05d: ifnull 08a
      // 060: ifeq 07f
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: new java/io/IOException
      // 06d: dup
      // 06e: sipush 21817
      // 071: sipush -32291
      // 074: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 077: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 07a: athrow
      // 07b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 1
      // 080: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 083: aload 2
      // 084: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 087: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // 08a: aload 4
      // 08c: ifnull 09a
      // 08f: ifeq 09b
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: bipush 1
      // 09a: ireturn
      // 09b: aload 3
      // 09c: ifnonnull 0b8
      // 09f: new java/io/InputStreamReader
      // 0a2: dup
      // 0a3: new java/io/FileInputStream
      // 0a6: dup
      // 0a7: aload 1
      // 0a8: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0ab: invokestatic java/nio/charset/Charset.defaultCharset ()Ljava/nio/charset/Charset;
      // 0ae: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 0b1: goto 0c8
      // 0b4: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: new java/io/InputStreamReader
      // 0bb: dup
      // 0bc: new java/io/FileInputStream
      // 0bf: dup
      // 0c0: aload 1
      // 0c1: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0c4: aload 3
      // 0c5: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0c8: astore 6
      // 0ca: aload 3
      // 0cb: ifnonnull 0e7
      // 0ce: new java/io/InputStreamReader
      // 0d1: dup
      // 0d2: new java/io/FileInputStream
      // 0d5: dup
      // 0d6: aload 2
      // 0d7: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0da: invokestatic java/nio/charset/Charset.defaultCharset ()Ljava/nio/charset/Charset;
      // 0dd: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 0e0: goto 0f7
      // 0e3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: new java/io/InputStreamReader
      // 0ea: dup
      // 0eb: new java/io/FileInputStream
      // 0ee: dup
      // 0ef: aload 2
      // 0f0: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 0f3: aload 3
      // 0f4: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0f7: astore 7
      // 0f9: aload 6
      // 0fb: aload 7
      // 0fd: invokestatic org/apache/commons/io/IOUtils.contentEqualsIgnoreEOL (Ljava/io/Reader;Ljava/io/Reader;)Z
      // 100: istore 8
      // 102: aload 7
      // 104: aload 4
      // 106: ifnull 121
      // 109: ifnull 11f
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 7
      // 115: invokevirtual java/io/Reader.close ()V
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: aload 6
      // 121: aload 4
      // 123: ifnull 132
      // 126: ifnull 135
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 6
      // 132: invokevirtual java/io/Reader.close ()V
      // 135: iload 8
      // 137: ireturn
      // 138: astore 8
      // 13a: aload 7
      // 13c: aload 4
      // 13e: ifnull 14d
      // 141: ifnull 15c
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: aload 7
      // 14d: invokevirtual java/io/Reader.close ()V
      // 150: goto 15c
      // 153: astore 9
      // 155: aload 8
      // 157: aload 9
      // 159: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 15c: aload 8
      // 15e: athrow
      // 15f: astore 7
      // 161: aload 6
      // 163: aload 4
      // 165: ifnull 174
      // 168: ifnull 183
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 6
      // 174: invokevirtual java/io/Reader.close ()V
      // 177: goto 183
      // 17a: astore 8
      // 17c: aload 7
      // 17e: aload 8
      // 180: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 183: aload 7
      // 185: athrow
   }

   public File f(URL param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnull 2d
      // 08: sipush 21826
      // 0b: sipush -18079
      // 0e: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 11: aload 2
      // 12: ifnull 46
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 20: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 23: ifne 33
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aconst_null
      // 2e: areturn
      // 2f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual java/net/URL.getFile ()Ljava/lang/String;
      // 37: sipush 11505
      // 3a: ldc2_w 2426654684353707602
      // 3d: invokestatic com/finalshell/core/File2.a (IJ)I
      // 40: getstatic java/io/File.separatorChar C
      // 43: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 46: astore 3
      // 47: aload 0
      // 48: aload 3
      // 49: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4c: ldc2_w 576881140354639569
      // 4f: astore 5
      // 51: astore 4
      // 53: ldc2_w 576881140354639569
      // 56: aload 4
      // 58: aload 5
      // 5a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5d: checkcast java/lang/String
      // 60: goto 67
      // 63: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 66: athrow
      // 67: astore 3
      // 68: new java/io/File
      // 6b: dup
      // 6c: aload 3
      // 6d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 70: areturn
   }

   public String O(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 1
      // 004: astore 3
      // 005: astore 2
      // 006: aload 1
      // 007: aload 2
      // 008: ifnull 192
      // 00b: ifnull 191
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 1
      // 016: aload 2
      // 017: ifnull 192
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: sipush 11917
      // 024: ldc2_w 3055383318256794665
      // 027: invokestatic com/finalshell/core/File2.a (IJ)I
      // 02a: invokevirtual java/lang/String.indexOf (I)I
      // 02d: iflt 191
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 1
      // 038: invokevirtual java/lang/String.length ()I
      // 03b: istore 4
      // 03d: new java/lang/StringBuilder
      // 040: dup
      // 041: invokespecial java/lang/StringBuilder.<init> ()V
      // 044: astore 5
      // 046: iload 4
      // 048: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
      // 04b: astore 6
      // 04d: bipush 0
      // 04e: istore 7
      // 050: iload 7
      // 052: iload 4
      // 054: if_icmpge 18b
      // 057: aload 1
      // 058: aload 2
      // 059: ifnull 190
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: iload 7
      // 065: invokevirtual java/lang/String.charAt (I)C
      // 068: aload 2
      // 069: ifnull 09f
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: sipush 3336
      // 076: ldc2_w 1107907955515367343
      // 079: invokestatic com/finalshell/core/File2.a (IJ)I
      // 07c: if_icmpne 178
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 1
      // 087: iload 7
      // 089: bipush 1
      // 08a: iadd
      // 08b: iload 7
      // 08d: bipush 3
      // 08e: iadd
      // 08f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 092: sipush 22370
      // 095: ldc2_w 4246480825472959940
      // 098: invokestatic com/finalshell/core/File2.a (IJ)I
      // 09b: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 09e: i2b
      // 09f: istore 8
      // 0a1: aload 6
      // 0a3: iload 8
      // 0a5: invokevirtual java/nio/ByteBuffer.put (B)Ljava/nio/ByteBuffer;
      // 0a8: pop
      // 0a9: iinc 7 3
      // 0ac: iload 7
      // 0ae: iload 4
      // 0b0: if_icmpge 0cc
      // 0b3: aload 1
      // 0b4: iload 7
      // 0b6: invokevirtual java/lang/String.charAt (I)C
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: sipush 3336
      // 0c3: ldc2_w 1107907955515367343
      // 0c6: invokestatic com/finalshell/core/File2.a (IJ)I
      // 0c9: if_icmpeq 086
      // 0cc: aload 6
      // 0ce: aload 2
      // 0cf: ifnull 0ff
      // 0d2: invokevirtual java/nio/ByteBuffer.position ()I
      // 0d5: aload 2
      // 0d6: ifnull 0c0
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: ifle 050
      // 0e3: aload 6
      // 0e5: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 0e8: pop
      // 0e9: aload 5
      // 0eb: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 0ee: aload 6
      // 0f0: invokevirtual java/nio/charset/Charset.decode (Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
      // 0f3: invokevirtual java/nio/CharBuffer.toString ()Ljava/lang/String;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: pop
      // 0fa: aload 6
      // 0fc: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
      // 0ff: pop
      // 100: goto 050
      // 103: astore 8
      // 105: aload 2
      // 106: ifnull 187
      // 109: aload 6
      // 10b: invokevirtual java/nio/ByteBuffer.position ()I
      // 10e: ifle 178
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 6
      // 11a: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 11d: pop
      // 11e: aload 5
      // 120: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 123: aload 6
      // 125: invokevirtual java/nio/charset/Charset.decode (Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
      // 128: invokevirtual java/nio/CharBuffer.toString ()Ljava/lang/String;
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: pop
      // 12f: aload 6
      // 131: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
      // 134: pop
      // 135: goto 178
      // 138: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: astore 9
      // 13e: aload 6
      // 140: aload 2
      // 141: ifnull 174
      // 144: invokevirtual java/nio/ByteBuffer.position ()I
      // 147: ifle 175
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: aload 6
      // 153: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 156: pop
      // 157: aload 5
      // 159: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 15c: aload 6
      // 15e: invokevirtual java/nio/charset/Charset.decode (Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
      // 161: invokevirtual java/nio/CharBuffer.toString ()Ljava/lang/String;
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: pop
      // 168: aload 6
      // 16a: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: pop
      // 175: aload 9
      // 177: athrow
      // 178: aload 5
      // 17a: aload 1
      // 17b: iload 7
      // 17d: iinc 7 1
      // 180: invokevirtual java/lang/String.charAt (I)C
      // 183: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 186: pop
      // 187: aload 2
      // 188: ifnonnull 050
      // 18b: aload 5
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: astore 3
      // 191: aload 3
      // 192: areturn
   }

   public File[] W(URL[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 14
      // 09: ifnull 23
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: arraylength
      // 15: aload 2
      // 16: ifnull 3b
      // 19: ifne 39
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: ldc2_w 306755196964993345
      // 27: astore 6
      // 29: ldc2_w 306755196964993345
      // 2c: aload 6
      // 2e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 31: checkcast [Ljava/io/File;
      // 34: areturn
      // 35: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 1
      // 3a: arraylength
      // 3b: anewarray 143
      // 3e: astore 3
      // 3f: bipush 0
      // 40: istore 4
      // 42: iload 4
      // 44: aload 1
      // 45: arraylength
      // 46: if_icmpge cd
      // 49: aload 1
      // 4a: iload 4
      // 4c: aaload
      // 4d: astore 5
      // 4f: aload 2
      // 50: ifnull c9
      // 53: aload 5
      // 55: ifnull c6
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 5
      // 61: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 64: sipush 21840
      // 67: sipush 9835
      // 6a: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 6d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 70: ifne a1
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: new java/lang/IllegalArgumentException
      // 7d: dup
      // 7e: new java/lang/StringBuilder
      // 81: dup
      // 82: invokespecial java/lang/StringBuilder.<init> ()V
      // 85: sipush 21849
      // 88: sipush 25835
      // 8b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: aload 5
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 96: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 99: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 9c: athrow
      // 9d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: aload 3
      // a2: iload 4
      // a4: aload 0
      // a5: aload 5
      // a7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // aa: ldc2_w 292788731238925935
      // ad: astore 9
      // af: astore 8
      // b1: ldc2_w 292788731238925935
      // b4: aload 8
      // b6: aload 9
      // b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // bb: checkcast java/io/File
      // be: goto c5
      // c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c4: athrow
      // c5: aastore
      // c6: iinc 4 1
      // c9: aload 2
      // ca: ifnonnull 42
      // cd: aload 3
      // ce: areturn
   }

   public URL[] l(File[] var1) throws IOException {
      Ky4[] var10000 = Vk2.y();
      URL[] var3 = new URL[var1.length];
      Ky4[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3.length) {
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = var1[var4].toURI().toURL();
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (IOException var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public void Y(File var1, File var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, true);
      long var4 = 633380880760312777L;
      Object[] var3 = var10001;
      Ref.h(633380880760312777L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void v(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 2
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/NullPointerException
      // 18: dup
      // 19: sipush 21814
      // 1c: sipush 19208
      // 1f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: aload 4
      // 2d: ifnull 95
      // 30: invokevirtual java/io/File.exists ()Z
      // 33: ifeq 89
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 2
      // 3e: aload 4
      // 40: ifnull 95
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: invokevirtual java/io/File.isDirectory ()Z
      // 4d: ifne 89
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: new java/lang/IllegalArgumentException
      // 5a: dup
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 21854
      // 65: sipush -21271
      // 68: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: aload 2
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 72: sipush 21869
      // 75: sipush -574
      // 78: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 84: athrow
      // 85: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: new java/io/File
      // 8c: dup
      // 8d: aload 2
      // 8e: aload 1
      // 8f: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 92: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 95: astore 5
      // 97: aload 0
      // 98: aload 1
      // 99: aload 5
      // 9b: iload 3
      // 9c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 9f: ldc2_w 374593173312356940
      // a2: astore 7
      // a4: astore 6
      // a6: ldc2_w 374593173312356940
      // a9: aload 6
      // ab: aload 7
      // ad: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b0: pop
      // b1: goto b8
      // b4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b7: athrow
      // b8: return
   }

   public void D(File var1, File var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, true);
      long var4 = 374593173312356940L;
      Object[] var3 = var10001;
      Ref.h(374593173312356940L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void n(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 009: ldc2_w 568032581173433875
      // 00c: astore 7
      // 00e: astore 6
      // 010: ldc2_w 568032581173433875
      // 013: aload 6
      // 015: aload 7
      // 017: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01a: pop
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 4
      // 024: aload 1
      // 025: invokevirtual java/io/File.isDirectory ()Z
      // 028: aload 4
      // 02a: ifnull 080
      // 02d: ifeq 069
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/io/IOException
      // 03a: dup
      // 03b: new java/lang/StringBuilder
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuilder.<init> ()V
      // 042: sipush 21865
      // 045: sipush -4101
      // 048: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: aload 1
      // 04f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 052: sipush 21781
      // 055: sipush -7376
      // 058: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 05b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 061: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 1
      // 06a: aload 4
      // 06c: ifnull 0c9
      // 06f: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 072: aload 2
      // 073: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 076: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: ifeq 0c5
      // 083: new java/io/IOException
      // 086: dup
      // 087: new java/lang/StringBuilder
      // 08a: dup
      // 08b: invokespecial java/lang/StringBuilder.<init> ()V
      // 08e: sipush 21865
      // 091: sipush -4101
      // 094: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: aload 1
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09e: sipush 21783
      // 0a1: sipush -20605
      // 0a4: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: aload 2
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ae: sipush 21884
      // 0b1: sipush -15146
      // 0b4: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bd: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0c0: athrow
      // 0c1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 2
      // 0c6: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0c9: astore 5
      // 0cb: aload 5
      // 0cd: aload 4
      // 0cf: ifnull 165
      // 0d2: ifnull 164
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 5
      // 0df: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e2: ldc2_w 323874994732919696
      // 0e5: astore 9
      // 0e7: astore 8
      // 0e9: ldc2_w 323874994732919696
      // 0ec: aload 8
      // 0ee: aload 9
      // 0f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f3: checkcast java/lang/Boolean
      // 0f6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 4
      // 102: ifnull 168
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: ifne 164
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 5
      // 118: invokevirtual java/io/File.isDirectory ()Z
      // 11b: aload 4
      // 11d: ifnull 168
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: ifne 164
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: new java/io/IOException
      // 134: dup
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: sipush 21854
      // 13f: sipush -21271
      // 142: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: aload 5
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14d: sipush 21832
      // 150: sipush -29975
      // 153: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15c: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 15f: athrow
      // 160: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: aload 2
      // 165: invokevirtual java/io/File.exists ()Z
      // 168: aload 4
      // 16a: ifnull 182
      // 16d: ifeq 1b7
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 2
      // 178: invokevirtual java/io/File.canWrite ()Z
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: ifne 1b7
      // 185: new java/io/IOException
      // 188: dup
      // 189: new java/lang/StringBuilder
      // 18c: dup
      // 18d: invokespecial java/lang/StringBuilder.<init> ()V
      // 190: sipush 21854
      // 193: sipush -21271
      // 196: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 199: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19c: aload 2
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a0: sipush 21776
      // 1a3: sipush -6466
      // 1a6: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1b2: athrow
      // 1b3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: aload 1
      // 1b9: aload 2
      // 1ba: iload 3
      // 1bb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 1be: ldc2_w 360076454015037045
      // 1c1: astore 11
      // 1c3: astore 10
      // 1c5: ldc2_w 360076454015037045
      // 1c8: aload 10
      // 1ca: aload 11
      // 1cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1cf: pop
      // 1d0: goto 1d7
      // 1d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d6: athrow
      // 1d7: return
   }

   public long k(File var1, OutputStream var2) throws IOException {
      FileInputStream var3 = new FileInputStream(var1);

      long var4;
      try {
         var4 = IOUtils.copyLarge(var3, var2);
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
      return var4;
   }

   public void s(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 5
      // 003: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 006: bipush 0
      // 007: istore 6
      // 009: astore 4
      // 00b: aload 2
      // 00c: invokevirtual java/io/File.exists ()Z
      // 00f: aload 4
      // 011: ifnull 261
      // 014: ifeq 259
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aconst_null
      // 01f: astore 7
      // 021: bipush 0
      // 022: istore 8
      // 024: aload 0
      // 025: ldc2_w 230435673101303976
      // 028: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02b: swap
      // 02c: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02f: aload 4
      // 031: ifnull 058
      // 034: ifeq 050
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: aload 0
      // 03f: ldc2_w 589909688581199231
      // 042: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 045: swap
      // 046: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 049: istore 8
      // 04b: aload 4
      // 04d: ifnonnull 0ff
      // 050: bipush 0
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: istore 9
      // 05a: aload 0
      // 05b: ldc2_w 415499299058536700
      // 05e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 061: swap
      // 062: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 065: aload 4
      // 067: ifnull 075
      // 06a: ifne 077
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: bipush 0
      // 075: istore 9
      // 077: new javax/swing/JCheckBox
      // 07a: dup
      // 07b: sipush 21824
      // 07e: sipush 20071
      // 081: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 084: iload 9
      // 086: invokespecial javax/swing/JCheckBox.<init> (Ljava/lang/String;Z)V
      // 089: astore 7
      // 08b: bipush 4
      // 08c: anewarray 4
      // 08f: dup
      // 090: bipush 0
      // 091: sipush 21877
      // 094: sipush -23341
      // 097: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 09a: aastore
      // 09b: dup
      // 09c: bipush 1
      // 09d: sipush 21871
      // 0a0: sipush -26781
      // 0a3: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0a6: aastore
      // 0a7: dup
      // 0a8: bipush 2
      // 0a9: sipush 21853
      // 0ac: sipush -6093
      // 0af: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0b2: aastore
      // 0b3: dup
      // 0b4: bipush 3
      // 0b5: aload 7
      // 0b7: aastore
      // 0b8: astore 10
      // 0ba: aload 0
      // 0bb: ldc2_w 370337906235180180
      // 0be: astore 21
      // 0c0: ldc2_w 370337906235180180
      // 0c3: aload 21
      // 0c5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c8: checkcast java/awt/Window
      // 0cb: new java/lang/StringBuilder
      // 0ce: dup
      // 0cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d2: sipush 21858
      // 0d5: sipush 29019
      // 0d8: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: aload 2
      // 0df: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: sipush 21808
      // 0eb: sipush 23779
      // 0ee: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0f1: bipush 0
      // 0f2: bipush 3
      // 0f3: aconst_null
      // 0f4: aload 10
      // 0f6: aload 10
      // 0f8: bipush 0
      // 0f9: aaload
      // 0fa: invokestatic javax/swing/JOptionPane.showOptionDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
      // 0fd: istore 8
      // 0ff: aload 7
      // 101: ifnull 150
      // 104: iload 8
      // 106: aload 4
      // 108: ifnull 152
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: bipush -1
      // 113: if_icmple 150
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 0
      // 11e: aload 7
      // 120: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 123: ldc2_w 230435673101303976
      // 126: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 129: dup_x2
      // 12a: pop
      // 12b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 12e: aload 0
      // 12f: iload 8
      // 131: ldc2_w 589909688581199231
      // 134: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 137: dup_x2
      // 138: pop
      // 139: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 13c: aload 0
      // 13d: bipush 1
      // 13e: ldc2_w 415499299058536700
      // 141: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 144: dup_x2
      // 145: pop
      // 146: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: iload 8
      // 152: aload 4
      // 154: ifnull 172
      // 157: ifne 169
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: bipush 1
      // 162: istore 5
      // 164: aload 4
      // 166: ifnonnull 254
      // 169: iload 8
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: bipush 1
      // 173: aload 4
      // 175: ifnull 24f
      // 178: if_icmpne 245
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: bipush 1
      // 183: istore 9
      // 185: iload 9
      // 187: sipush 32266
      // 18a: ldc2_w 6827047560868555951
      // 18d: invokestatic com/finalshell/core/File2.a (IJ)I
      // 190: if_icmpge 240
      // 193: new java/lang/StringBuilder
      // 196: dup
      // 197: invokespecial java/lang/StringBuilder.<init> ()V
      // 19a: aload 2
      // 19b: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: getstatic java/io/File.separator Ljava/lang/String;
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 2
      // 1a8: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1ab: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ae: ldc2_w 247244861321523360
      // 1b1: astore 23
      // 1b3: ldc2_w 247244861321523360
      // 1b6: aload 23
      // 1b8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1bb: checkcast java/lang/String
      // 1be: goto 1c5
      // 1c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: ldc_w "_"
      // 1cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ce: iload 9
      // 1d0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1d3: ldc_w "."
      // 1d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d9: aload 2
      // 1da: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1dd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e0: ldc2_w 353935338506646766
      // 1e3: astore 25
      // 1e5: ldc2_w 353935338506646766
      // 1e8: aload 25
      // 1ea: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ed: checkcast java/lang/String
      // 1f0: goto 1f7
      // 1f3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f6: athrow
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fd: astore 10
      // 1ff: aload 4
      // 201: ifnull 23b
      // 204: new java/io/File
      // 207: dup
      // 208: aload 10
      // 20a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 20d: invokevirtual java/io/File.exists ()Z
      // 210: aload 4
      // 212: ifnull 267
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: ifne 231
      // 21f: new java/io/File
      // 222: dup
      // 223: aload 10
      // 225: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 228: astore 2
      // 229: bipush 1
      // 22a: istore 6
      // 22c: aload 4
      // 22e: ifnonnull 240
      // 231: iinc 9 1
      // 234: goto 23b
      // 237: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: aload 4
      // 23d: ifnonnull 185
      // 240: aload 4
      // 242: ifnonnull 254
      // 245: iload 8
      // 247: bipush 2
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24e: athrow
      // 24f: if_icmpne 253
      // 252: return
      // 253: return
      // 254: aload 4
      // 256: ifnonnull 263
      // 259: bipush 1
      // 25a: goto 261
      // 25d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 260: athrow
      // 261: istore 6
      // 263: aload 2
      // 264: invokevirtual java/io/File.exists ()Z
      // 267: aload 4
      // 269: ifnull 281
      // 26c: ifeq 2b6
      // 26f: goto 276
      // 272: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 275: athrow
      // 276: aload 2
      // 277: invokevirtual java/io/File.isDirectory ()Z
      // 27a: goto 281
      // 27d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 280: athrow
      // 281: ifeq 2b6
      // 284: new java/io/IOException
      // 287: dup
      // 288: new java/lang/StringBuilder
      // 28b: dup
      // 28c: invokespecial java/lang/StringBuilder.<init> ()V
      // 28f: sipush 21854
      // 292: sipush -21271
      // 295: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 298: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29b: aload 2
      // 29c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 29f: sipush 21802
      // 2a2: sipush -6239
      // 2a5: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 2a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ae: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 2b1: athrow
      // 2b2: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: new java/io/FileInputStream
      // 2b9: dup
      // 2ba: aload 1
      // 2bb: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 2be: astore 7
      // 2c0: aload 7
      // 2c2: invokevirtual java/io/FileInputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 2c5: astore 8
      // 2c7: new java/io/FileOutputStream
      // 2ca: dup
      // 2cb: aload 2
      // 2cc: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 2cf: astore 9
      // 2d1: aload 9
      // 2d3: invokevirtual java/io/FileOutputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 2d6: astore 10
      // 2d8: aload 8
      // 2da: invokevirtual java/nio/channels/FileChannel.size ()J
      // 2dd: lstore 11
      // 2df: lconst_0
      // 2e0: lstore 13
      // 2e2: lconst_0
      // 2e3: lstore 15
      // 2e5: lload 13
      // 2e7: lload 11
      // 2e9: lcmp
      // 2ea: ifge 371
      // 2ed: lload 11
      // 2ef: lload 13
      // 2f1: lsub
      // 2f2: lstore 17
      // 2f4: lload 17
      // 2f6: aload 4
      // 2f8: ifnull 431
      // 2fb: aload 4
      // 2fd: ifnull 32b
      // 300: goto 307
      // 303: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 306: athrow
      // 307: sipush 16420
      // 30a: ldc2_w 4906995396498541745
      // 30d: invokestatic com/finalshell/core/File2.b (IJ)J
      // 310: lcmp
      // 311: ifle 32e
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: sipush 3662
      // 31e: ldc2_w 273416712236892881
      // 321: invokestatic com/finalshell/core/File2.b (IJ)J
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: goto 330
      // 32e: lload 17
      // 330: lstore 15
      // 332: aload 10
      // 334: aload 8
      // 336: lload 13
      // 338: lload 15
      // 33a: invokevirtual java/nio/channels/FileChannel.transferFrom (Ljava/nio/channels/ReadableByteChannel;JJ)J
      // 33d: lstore 19
      // 33f: lload 19
      // 341: lconst_0
      // 342: aload 4
      // 344: ifnull 369
      // 347: lcmp
      // 348: ifne 35e
      // 34b: goto 352
      // 34e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 351: athrow
      // 352: aload 4
      // 354: ifnonnull 371
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35d: athrow
      // 35e: lload 13
      // 360: lload 19
      // 362: goto 369
      // 365: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: ladd
      // 36a: lstore 13
      // 36c: aload 4
      // 36e: ifnonnull 2e5
      // 371: aload 10
      // 373: aload 4
      // 375: ifnull 384
      // 378: ifnull 3b1
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 381: athrow
      // 382: aload 10
      // 384: invokevirtual java/nio/channels/FileChannel.close ()V
      // 387: goto 3b1
      // 38a: astore 11
      // 38c: aload 10
      // 38e: aload 4
      // 390: ifnull 39f
      // 393: ifnull 3ae
      // 396: goto 39d
      // 399: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: aload 10
      // 39f: invokevirtual java/nio/channels/FileChannel.close ()V
      // 3a2: goto 3ae
      // 3a5: astore 12
      // 3a7: aload 11
      // 3a9: aload 12
      // 3ab: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 3ae: aload 11
      // 3b0: athrow
      // 3b1: aload 9
      // 3b3: invokevirtual java/io/FileOutputStream.close ()V
      // 3b6: goto 3cf
      // 3b9: astore 10
      // 3bb: aload 9
      // 3bd: invokevirtual java/io/FileOutputStream.close ()V
      // 3c0: goto 3cc
      // 3c3: astore 11
      // 3c5: aload 10
      // 3c7: aload 11
      // 3c9: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 3cc: aload 10
      // 3ce: athrow
      // 3cf: aload 8
      // 3d1: aload 4
      // 3d3: ifnull 3e2
      // 3d6: ifnull 40f
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3df: athrow
      // 3e0: aload 8
      // 3e2: invokevirtual java/nio/channels/FileChannel.close ()V
      // 3e5: goto 40f
      // 3e8: astore 9
      // 3ea: aload 8
      // 3ec: aload 4
      // 3ee: ifnull 3fd
      // 3f1: ifnull 40c
      // 3f4: goto 3fb
      // 3f7: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fa: athrow
      // 3fb: aload 8
      // 3fd: invokevirtual java/nio/channels/FileChannel.close ()V
      // 400: goto 40c
      // 403: astore 10
      // 405: aload 9
      // 407: aload 10
      // 409: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 40c: aload 9
      // 40e: athrow
      // 40f: aload 7
      // 411: invokevirtual java/io/FileInputStream.close ()V
      // 414: goto 42d
      // 417: astore 8
      // 419: aload 7
      // 41b: invokevirtual java/io/FileInputStream.close ()V
      // 41e: goto 42a
      // 421: astore 9
      // 423: aload 8
      // 425: aload 9
      // 427: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 42a: aload 8
      // 42c: athrow
      // 42d: aload 1
      // 42e: invokevirtual java/io/File.length ()J
      // 431: lstore 7
      // 433: aload 2
      // 434: invokevirtual java/io/File.length ()J
      // 437: lstore 9
      // 439: lload 7
      // 43b: lload 9
      // 43d: lcmp
      // 43e: aload 4
      // 440: ifnull 4a6
      // 443: ifeq 4a5
      // 446: goto 44d
      // 449: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44c: athrow
      // 44d: new java/io/IOException
      // 450: dup
      // 451: new java/lang/StringBuilder
      // 454: dup
      // 455: invokespecial java/lang/StringBuilder.<init> ()V
      // 458: sipush 21810
      // 45b: sipush -6006
      // 45e: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 461: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 464: aload 1
      // 465: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 468: sipush 21841
      // 46b: sipush -10596
      // 46e: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 471: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 474: aload 2
      // 475: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 478: sipush 21839
      // 47b: sipush 9110
      // 47e: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 481: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 484: lload 7
      // 486: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 489: sipush 21812
      // 48c: sipush 23452
      // 48f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 492: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 495: lload 9
      // 497: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 49a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49d: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 4a0: athrow
      // 4a1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a4: athrow
      // 4a5: iload 3
      // 4a6: aload 4
      // 4a8: ifnull 4c4
      // 4ab: ifeq 4c5
      // 4ae: goto 4b5
      // 4b1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b4: athrow
      // 4b5: aload 2
      // 4b6: aload 1
      // 4b7: invokevirtual java/io/File.lastModified ()J
      // 4ba: invokevirtual java/io/File.setLastModified (J)Z
      // 4bd: goto 4c4
      // 4c0: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c3: athrow
      // 4c4: pop
      // 4c5: aload 0
      // 4c6: ldc2_w 136992684323528157
      // 4c9: astore 27
      // 4cb: ldc2_w 136992684323528157
      // 4ce: aload 27
      // 4d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4d3: checkcast com/finalshell/core/UG
      // 4d6: ifnull 566
      // 4d9: iload 5
      // 4db: aload 4
      // 4dd: ifnull 531
      // 4e0: goto 4e7
      // 4e3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: ifeq 528
      // 4ea: goto 4f1
      // 4ed: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f0: athrow
      // 4f1: aload 0
      // 4f2: ldc2_w 136992684323528157
      // 4f5: astore 29
      // 4f7: ldc2_w 136992684323528157
      // 4fa: aload 29
      // 4fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4ff: aload 2
      // 500: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 503: ldc2_w 254305348276641042
      // 506: astore 32
      // 508: astore 31
      // 50a: ldc2_w 254305348276641042
      // 50d: aload 31
      // 50f: aload 32
      // 511: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 514: pop
      // 515: goto 51c
      // 518: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 51b: athrow
      // 51c: aload 4
      // 51e: ifnonnull 566
      // 521: goto 528
      // 524: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 527: athrow
      // 528: iload 6
      // 52a: goto 531
      // 52d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 530: athrow
      // 531: ifeq 566
      // 534: aload 0
      // 535: ldc2_w 136992684323528157
      // 538: astore 33
      // 53a: ldc2_w 136992684323528157
      // 53d: aload 33
      // 53f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 542: aload 2
      // 543: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 546: ldc2_w 551593450223385875
      // 549: astore 36
      // 54b: astore 35
      // 54d: ldc2_w 551593450223385875
      // 550: aload 35
      // 552: aload 36
      // 554: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 557: pop
      // 558: goto 55f
      // 55b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 55e: athrow
      // 55f: goto 566
      // 562: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 565: athrow
      // 566: return
   }

   public void F(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21800
      // 01a: sipush -9616
      // 01d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 1
      // 029: aload 3
      // 02a: ifnull 086
      // 02d: invokevirtual java/io/File.exists ()Z
      // 030: ifeq 085
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: aload 3
      // 03c: ifnull 086
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: invokevirtual java/io/File.isDirectory ()Z
      // 049: ifne 085
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: new java/lang/IllegalArgumentException
      // 056: dup
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: sipush 21878
      // 061: sipush 25936
      // 064: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06a: aload 2
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 06e: sipush 21857
      // 071: sipush 9180
      // 074: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 080: athrow
      // 081: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 2
      // 086: aload 3
      // 087: ifnull 0aa
      // 08a: ifnonnull 0a9
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: new java/lang/NullPointerException
      // 097: dup
      // 098: sipush 21856
      // 09b: sipush 24535
      // 09e: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0a1: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: invokevirtual java/io/File.exists ()Z
      // 0ad: aload 3
      // 0ae: ifnull 0c6
      // 0b1: ifeq 0fb
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 2
      // 0bc: invokevirtual java/io/File.isDirectory ()Z
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: ifne 0fb
      // 0c9: new java/lang/IllegalArgumentException
      // 0cc: dup
      // 0cd: new java/lang/StringBuilder
      // 0d0: dup
      // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d4: sipush 21854
      // 0d7: sipush -21271
      // 0da: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: aload 2
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e4: sipush 21869
      // 0e7: sipush -574
      // 0ea: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f3: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0f6: athrow
      // 0f7: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: new java/io/File
      // 100: dup
      // 101: aload 2
      // 102: aload 1
      // 103: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 106: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 109: bipush 1
      // 10a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 10d: ldc2_w 439016544162089963
      // 110: astore 5
      // 112: astore 4
      // 114: ldc2_w 439016544162089963
      // 117: aload 4
      // 119: aload 5
      // 11b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11e: pop
      // 11f: goto 126
      // 122: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 125: athrow
      // 126: return
   }

   public void H$void(File var1, File var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, true);
      long var4 = 439016544162089963L;
      Object[] var3 = var10001;
      Ref.h(439016544162089963L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void z(File var1, File var2, boolean var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, null, var3);
      long var5 = 563450840600235953L;
      Object[] var4 = var10001;
      Ref.h(563450840600235953L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void C(File var1, File var2, FileFilter var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, true);
      long var5 = 563450840600235953L;
      Object[] var4 = var10001;
      Ref.h(563450840600235953L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void o(File param1, File param2, FileFilter param3, boolean param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 009: ldc2_w 568032581173433875
      // 00c: astore 14
      // 00e: astore 13
      // 010: ldc2_w 568032581173433875
      // 013: aload 13
      // 015: aload 14
      // 017: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01a: pop
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 5
      // 024: aload 1
      // 025: invokevirtual java/io/File.isDirectory ()Z
      // 028: aload 5
      // 02a: ifnull 074
      // 02d: ifne 069
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/io/IOException
      // 03a: dup
      // 03b: new java/lang/StringBuilder
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuilder.<init> ()V
      // 042: sipush 21865
      // 045: sipush -4101
      // 048: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: aload 1
      // 04f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 052: sipush 21805
      // 055: sipush -13917
      // 058: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 05b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 061: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 1
      // 06a: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 06d: aload 2
      // 06e: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 071: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 074: ifeq 0b9
      // 077: new java/io/IOException
      // 07a: dup
      // 07b: new java/lang/StringBuilder
      // 07e: dup
      // 07f: invokespecial java/lang/StringBuilder.<init> ()V
      // 082: sipush 21865
      // 085: sipush -4101
      // 088: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08e: aload 1
      // 08f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 092: sipush 21816
      // 095: sipush -14712
      // 098: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 2
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a2: sipush 21834
      // 0a5: sipush -19824
      // 0a8: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b1: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0b4: athrow
      // 0b5: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: aconst_null
      // 0ba: astore 6
      // 0bc: aload 2
      // 0bd: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 0c0: aload 1
      // 0c1: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 0c4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0c7: ifeq 154
      // 0ca: aload 3
      // 0cb: ifnonnull 0e0
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 0d9: goto 0e5
      // 0dc: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 1
      // 0e1: aload 3
      // 0e2: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 0e5: astore 7
      // 0e7: aload 7
      // 0e9: aload 5
      // 0eb: ifnull 0fa
      // 0ee: ifnull 154
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 7
      // 0fa: arraylength
      // 0fb: ifle 154
      // 0fe: new java/util/ArrayList
      // 101: dup
      // 102: aload 7
      // 104: arraylength
      // 105: invokespecial java/util/ArrayList.<init> (I)V
      // 108: astore 6
      // 10a: aload 7
      // 10c: astore 8
      // 10e: aload 8
      // 110: arraylength
      // 111: istore 9
      // 113: bipush 0
      // 114: istore 10
      // 116: iload 10
      // 118: iload 9
      // 11a: if_icmpge 154
      // 11d: aload 8
      // 11f: iload 10
      // 121: aaload
      // 122: astore 11
      // 124: new java/io/File
      // 127: dup
      // 128: aload 2
      // 129: aload 11
      // 12b: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 12e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 131: astore 12
      // 133: aload 6
      // 135: aload 12
      // 137: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 13a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13f: pop
      // 140: iinc 10 1
      // 143: aload 5
      // 145: ifnull 178
      // 148: aload 5
      // 14a: ifnonnull 116
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 0
      // 155: aload 1
      // 156: aload 2
      // 157: aload 3
      // 158: iload 4
      // 15a: aload 6
      // 15c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)[Ljava/lang/Object;
      // 15f: ldc2_w 549954396057145592
      // 162: astore 16
      // 164: astore 15
      // 166: ldc2_w 549954396057145592
      // 169: aload 15
      // 16b: aload 16
      // 16d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 170: pop
      // 171: goto 178
      // 174: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 177: athrow
      // 178: return
   }

   public void P(File param1, File param2) throws FileNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21825
      // 1a: sipush 25410
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: aload 3
      // 2a: ifnull 4d
      // 2d: ifnonnull 4c
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: new java/lang/NullPointerException
      // 3a: dup
      // 3b: sipush 21814
      // 3e: sipush 19208
      // 41: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 44: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 47: athrow
      // 48: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual java/io/File.exists ()Z
      // 50: ifne 85
      // 53: new java/io/FileNotFoundException
      // 56: dup
      // 57: new java/lang/StringBuilder
      // 5a: dup
      // 5b: invokespecial java/lang/StringBuilder.<init> ()V
      // 5e: sipush 21865
      // 61: sipush -4101
      // 64: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: aload 1
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6e: sipush 21863
      // 71: sipush -24367
      // 74: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 80: athrow
      // 81: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: return
   }

   public void j(File param1, File param2, FileFilter param3, boolean param4, List param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 6
      // 005: aload 3
      // 006: ifnonnull 014
      // 009: aload 1
      // 00a: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 00d: goto 019
      // 010: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 1
      // 015: aload 3
      // 016: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 019: astore 7
      // 01b: aload 7
      // 01d: ifnonnull 046
      // 020: new java/io/IOException
      // 023: dup
      // 024: new java/lang/StringBuilder
      // 027: dup
      // 028: invokespecial java/lang/StringBuilder.<init> ()V
      // 02b: sipush 21828
      // 02e: sipush 21652
      // 031: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 034: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 037: aload 1
      // 038: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 03b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 041: athrow
      // 042: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 2
      // 047: invokevirtual java/io/File.exists ()Z
      // 04a: aload 6
      // 04c: ifnull 0c8
      // 04f: ifeq 0a5
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 2
      // 05a: invokevirtual java/io/File.isDirectory ()Z
      // 05d: aload 6
      // 05f: ifnull 127
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: ifne 123
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: new java/io/IOException
      // 076: dup
      // 077: new java/lang/StringBuilder
      // 07a: dup
      // 07b: invokespecial java/lang/StringBuilder.<init> ()V
      // 07e: sipush 21821
      // 081: sipush 23826
      // 084: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: aload 2
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08e: sipush 21799
      // 091: sipush 14225
      // 094: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0a0: athrow
      // 0a1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0aa: ldc2_w 323874994732919696
      // 0ad: astore 14
      // 0af: astore 13
      // 0b1: ldc2_w 323874994732919696
      // 0b4: aload 13
      // 0b6: aload 14
      // 0b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bb: checkcast java/lang/Boolean
      // 0be: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c1: goto 0c8
      // 0c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 6
      // 0ca: ifnull 127
      // 0cd: ifne 123
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 2
      // 0d8: invokevirtual java/io/File.isDirectory ()Z
      // 0db: aload 6
      // 0dd: ifnull 127
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: ifne 123
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: new java/io/IOException
      // 0f4: dup
      // 0f5: new java/lang/StringBuilder
      // 0f8: dup
      // 0f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fc: sipush 21854
      // 0ff: sipush -21271
      // 102: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 108: aload 2
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10c: sipush 21823
      // 10f: sipush -3323
      // 112: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 115: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 118: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11b: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 11e: athrow
      // 11f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: aload 2
      // 124: invokevirtual java/io/File.canWrite ()Z
      // 127: ifne 15c
      // 12a: new java/io/IOException
      // 12d: dup
      // 12e: new java/lang/StringBuilder
      // 131: dup
      // 132: invokespecial java/lang/StringBuilder.<init> ()V
      // 135: sipush 21854
      // 138: sipush -21271
      // 13b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: aload 2
      // 142: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 145: sipush 21831
      // 148: sipush -7276
      // 14b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 154: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 157: athrow
      // 158: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 7
      // 15e: astore 8
      // 160: aload 8
      // 162: arraylength
      // 163: istore 9
      // 165: bipush 0
      // 166: istore 10
      // 168: iload 10
      // 16a: iload 9
      // 16c: if_icmpge 230
      // 16f: aload 8
      // 171: iload 10
      // 173: aaload
      // 174: astore 11
      // 176: new java/io/File
      // 179: dup
      // 17a: aload 2
      // 17b: aload 11
      // 17d: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 180: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 183: astore 12
      // 185: aload 6
      // 187: ifnull 251
      // 18a: aload 5
      // 18c: aload 6
      // 18e: ifnull 1a4
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: ifnull 1bd
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a1: athrow
      // 1a2: aload 5
      // 1a4: aload 11
      // 1a6: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 1a9: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1ae: aload 6
      // 1b0: ifnull 1c9
      // 1b3: ifne 228
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bc: athrow
      // 1bd: aload 11
      // 1bf: invokevirtual java/io/File.isDirectory ()Z
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: ifeq 1fe
      // 1cc: aload 0
      // 1cd: aload 11
      // 1cf: aload 12
      // 1d1: aload 3
      // 1d2: iload 4
      // 1d4: aload 5
      // 1d6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)[Ljava/lang/Object;
      // 1d9: ldc2_w 549954396057145592
      // 1dc: astore 16
      // 1de: astore 15
      // 1e0: ldc2_w 549954396057145592
      // 1e3: aload 15
      // 1e5: aload 16
      // 1e7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ea: pop
      // 1eb: goto 1f2
      // 1ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: aload 6
      // 1f4: ifnonnull 228
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: aload 11
      // 201: aload 12
      // 203: iload 4
      // 205: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 208: ldc2_w 360076454015037045
      // 20b: astore 18
      // 20d: astore 17
      // 20f: ldc2_w 360076454015037045
      // 212: aload 17
      // 214: aload 18
      // 216: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 219: pop
      // 21a: goto 221
      // 21d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 220: athrow
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 227: athrow
      // 228: iinc 10 1
      // 22b: aload 6
      // 22d: ifnonnull 168
      // 230: iload 4
      // 232: aload 6
      // 234: ifnull 250
      // 237: ifeq 251
      // 23a: goto 241
      // 23d: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 2
      // 242: aload 1
      // 243: invokevirtual java/io/File.lastModified ()J
      // 246: invokevirtual java/io/File.setLastModified (J)Z
      // 249: goto 250
      // 24c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f: athrow
      // 250: pop
      // 251: return
   }

   public void u(URL var1, File var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1.openStream(), var2);
      long var4 = 228463439819980284L;
      Object[] var3 = var10001;
      Ref.h(228463439819980284L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void I(URL var1, File var2, int var3, int var4) throws IOException {
      URLConnection var5 = var1.openConnection();
      var5.setConnectTimeout(var3);
      var5.setReadTimeout(var4);
      Object[] var10001 = Registry.packArgs(var5.getInputStream(), var2);
      long var7 = 228463439819980284L;
      Object[] var6 = var10001;
      Ref.h(228463439819980284L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void u(InputStream var1, File var2) throws IOException {
      Ky4[] var10000 = Vk2.y();
      InputStream var4 = var1;
      Ky4[] var3 = var10000;

      try {
         Object[] var17 = Registry.packArgs(var4, var2);
         long var8 = 483089660862615658L;
         Object[] var7 = var17;
         Ref.h(483089660862615658L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      } catch (Throwable var13) {
         label44: {
            label43: {
               try {
                  var14 = var4;
                  if (var3 == null) {
                     break label43;
                  }

                  if (var4 == null) {
                     throw var13;
                  }
               } catch (Throwable var12) {
                  throw a(var12);
               }

               try {
                  var14 = var4;
               } catch (Throwable var11) {
                  var15 = var11;
                  boolean var10001 = false;
                  break label44;
               }
            }

            try {
               var14.close();
               throw var13;
            } catch (Throwable var10) {
               var15 = var10;
               boolean var16 = false;
            }
         }

         Throwable var6 = var15;
         var13.addSuppressed(var6);
         throw var13;
      }

      InputStream var18 = var1;
      if (var3 != null) {
         if (var1 == null) {
            return;
         }

         var18 = var1;
      }

      var18.close();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void A(InputStream var1, File var2) throws IOException {
      Ky4[] var10000 = Vk2.y();
      InputStream var4 = var1;
      Ky4[] var3 = var10000;

      InputStream var30;
      label107: {
         try {
            Object[] var25 = Registry.packArgs(var2);
            long var9 = 615606400187031568L;
            Object[] var8 = var25;
            Object var26 = Ref.h(615606400187031568L, var8, var9);

            try {
               var26 = (FileOutputStream)var26;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            FileOutputStream var5 = (FileOutputStream)var26;

            try {
               var30 = var4;
               if (var3 == null) {
                  break label107;
               }

               IOUtils.copy(var4, var5);
            } catch (Throwable var18) {
               label84: {
                  label83: {
                     try {
                        var22 = var5;
                        if (var3 == null) {
                           break label83;
                        }

                        if (var5 == null) {
                           throw var18;
                        }
                     } catch (Throwable var16) {
                        throw a(var16);
                     }

                     try {
                        var22 = var5;
                     } catch (Throwable var15) {
                        var23 = var15;
                        boolean var28 = false;
                        break label84;
                     }
                  }

                  try {
                     var22.close();
                     throw var18;
                  } catch (Throwable var14) {
                     var23 = var14;
                     boolean var29 = false;
                  }
               }

               Throwable var7 = var23;
               var18.addSuppressed(var7);
               throw var18;
            }

            if (var5 != null) {
               var5.close();
            }
         } catch (Throwable var19) {
            label69: {
               label68: {
                  try {
                     var20 = var4;
                     if (var3 == null) {
                        break label68;
                     }

                     if (var4 == null) {
                        throw var19;
                     }
                  } catch (Throwable var13) {
                     throw a(var13);
                  }

                  try {
                     var20 = var4;
                  } catch (Throwable var12) {
                     var21 = var12;
                     boolean var10001 = false;
                     break label69;
                  }
               }

               try {
                  var20.close();
                  throw var19;
               } catch (Throwable var11) {
                  var21 = var11;
                  boolean var24 = false;
               }
            }

            Throwable var6 = var21;
            var19.addSuppressed(var6);
            throw var19;
         }

         var30 = var1;
      }

      label94: {
         try {
            if (var3 == null) {
               break label94;
            }

            if (var30 == null) {
               return;
            }
         } catch (Throwable var17) {
            throw a(var17);
         }

         var30 = var1;
      }

      var30.close();
   }

   public void f(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21825
      // 1a: sipush 25410
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual java/io/File.isFile ()Z
      // 2c: aload 3
      // 2d: ifnull 6f
      // 30: ifeq 64
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 40: ldc2_w 476303959091785058
      // 43: astore 5
      // 45: astore 4
      // 47: ldc2_w 476303959091785058
      // 4a: aload 4
      // 4c: aload 5
      // 4e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 51: pop
      // 52: goto 59
      // 55: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 3
      // 5a: ifnonnull ce
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 1
      // 65: invokevirtual java/io/File.isDirectory ()Z
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: ifeq 9c
      // 72: aload 0
      // 73: aload 1
      // 74: aload 2
      // 75: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 78: ldc2_w 395780898209924483
      // 7b: astore 7
      // 7d: astore 6
      // 7f: ldc2_w 395780898209924483
      // 82: aload 6
      // 84: aload 7
      // 86: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 89: pop
      // 8a: goto 91
      // 8d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 3
      // 92: ifnonnull ce
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: new java/io/IOException
      // 9f: dup
      // a0: new java/lang/StringBuilder
      // a3: dup
      // a4: invokespecial java/lang/StringBuilder.<init> ()V
      // a7: sipush 21796
      // aa: sipush 31709
      // ad: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: aload 1
      // b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b7: sipush 21838
      // ba: sipush 4536
      // bd: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c6: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // c9: athrow
      // ca: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cd: athrow
      // ce: return
   }

   public void X(Iterable param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21801
      // 1a: sipush 27211
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2e: astore 4
      // 30: aload 4
      // 32: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37: ifeq 6a
      // 3a: aload 4
      // 3c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41: checkcast java/io/File
      // 44: astore 5
      // 46: aload 0
      // 47: aload 5
      // 49: aload 2
      // 4a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d: ldc2_w 476303959091785058
      // 50: astore 7
      // 52: astore 6
      // 54: ldc2_w 476303959091785058
      // 57: aload 6
      // 59: aload 7
      // 5b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5e: pop
      // 5f: goto 66
      // 62: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 3
      // 67: ifnonnull 30
      // 6a: return
   }

   public void X(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 3a
      // 0c: ifne 17
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: return
      // 17: aload 0
      // 18: aload 1
      // 19: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c: ldc2_w 445181380587021203
      // 1f: astore 5
      // 21: astore 4
      // 23: ldc2_w 445181380587021203
      // 26: aload 4
      // 28: aload 5
      // 2a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d: checkcast java/lang/Boolean
      // 30: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 33: goto 3a
      // 36: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 2
      // 3b: ifnull 71
      // 3e: ifne 6d
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d: ldc2_w 186329734048458518
      // 50: astore 7
      // 52: astore 6
      // 54: ldc2_w 186329734048458518
      // 57: aload 6
      // 59: aload 7
      // 5b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5e: pop
      // 5f: goto 66
      // 62: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65: athrow
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 1
      // 6e: invokevirtual java/io/File.delete ()Z
      // 71: ifne 9e
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: sipush 21822
      // 7e: sipush -16830
      // 81: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: aload 1
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8b: ldc_w "."
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 94: astore 3
      // 95: new java/io/IOException
      // 98: dup
      // 99: aload 3
      // 9a: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 9d: athrow
      // 9e: return
   }

   public boolean Q$boolean(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual java/io/File.isDirectory ()Z
      // 1d: ifeq 45
      // 20: aload 0
      // 21: aload 1
      // 22: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 25: ldc2_w 186329734048458518
      // 28: astore 5
      // 2a: astore 4
      // 2c: ldc2_w 186329734048458518
      // 2f: aload 4
      // 31: aload 5
      // 33: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36: pop
      // 37: goto 3e
      // 3a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: goto 49
      // 48: astore 3
      // 49: aload 1
      // 4a: invokevirtual java/io/File.delete ()Z
      // 4d: ireturn
      // 4e: astore 3
      // 4f: bipush 0
      // 50: ireturn
   }

   public boolean H$boolean(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21873
      // 1a: sipush 13699
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: aload 3
      // 2a: ifnull 61
      // 2d: invokevirtual java/io/File.isDirectory ()Z
      // 30: ifne 60
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21780
      // 48: sipush -1347
      // 4b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 1
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 5b: athrow
      // 5c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 2
      // 61: aload 3
      // 62: ifnull 76
      // 65: ifnonnull 75
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: bipush 0
      // 70: ireturn
      // 71: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 1
      // 76: invokevirtual java/io/File.exists ()Z
      // 79: aload 3
      // 7a: ifnull a8
      // 7d: ifeq a0
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 2
      // 88: aload 3
      // 89: ifnull aa
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: invokevirtual java/io/File.exists ()Z
      // 96: ifne a9
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: bipush 0
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: ireturn
      // a9: aload 1
      // aa: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // ad: astore 4
      // af: aload 2
      // b0: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // b3: astore 5
      // b5: aload 4
      // b7: aload 5
      // b9: invokestatic org/apache/commons/io/FilenameUtils.directoryContains (Ljava/lang/String;Ljava/lang/String;)Z
      // bc: ireturn
   }

   public void E(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1);
      long var11 = 417012132292310060L;
      Object[] var10 = var10001;
      var10001 = Ref.h(417012132292310060L, var10, var11);

      try {
         var10001 = (File[])var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      File[] var3 = var10001;
      Ky4[] var21 = Vk2.y();
      IOException var4 = null;
      File[] var5 = var3;
      Ky4[] var2 = var21;
      int var6 = var3.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            File var8 = var5[var7];

            label46: {
               IOException var9;
               try {
                  label44: {
                     try {
                        Object[] var10002 = Registry.packArgs(var8);
                        long var13 = 583004256134799533L;
                        Object[] var12 = var10002;
                        Ref.h(583004256134799533L, var12, var13);

                        try {
                           ;
                        } catch (InvocationTargetException var15) {
                           throw var15.getTargetException();
                        }
                     } catch (IOException var17) {
                        var9 = var17;
                        break label44;
                     }

                     if (var2 == null) {
                        break;
                     }
                     break label46;
                  }
               } catch (NullPointerException var18) {
                  throw a(var18);
               }

               var4 = var9;
            }

            var7++;
            if (var2 != null) {
               continue;
            }
         }

         try {
            if (null != var4) {
               throw var4;
            }
            break;
         } catch (IOException var14) {
            throw a(var14);
         }
      }
   }

   public File[] i$arrFile(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 49
      // 0c: ifne 3a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/StringBuilder
      // 19: dup
      // 1a: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d: aload 1
      // 1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 21: sipush 21838
      // 24: sipush 4536
      // 27: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30: astore 3
      // 31: new java/lang/IllegalArgumentException
      // 34: dup
      // 35: aload 3
      // 36: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: aload 1
      // 3b: aload 2
      // 3c: ifnull 71
      // 3f: invokevirtual java/io/File.isDirectory ()Z
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: ifne 70
      // 4c: new java/lang/StringBuilder
      // 4f: dup
      // 50: invokespecial java/lang/StringBuilder.<init> ()V
      // 53: aload 1
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 57: sipush 21779
      // 5a: sipush 6459
      // 5d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: astore 3
      // 67: new java/lang/IllegalArgumentException
      // 6a: dup
      // 6b: aload 3
      // 6c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 6f: athrow
      // 70: aload 1
      // 71: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 74: astore 3
      // 75: aload 3
      // 76: aload 2
      // 77: ifnull ab
      // 7a: ifnonnull aa
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: new java/io/IOException
      // 87: dup
      // 88: new java/lang/StringBuilder
      // 8b: dup
      // 8c: invokespecial java/lang/StringBuilder.<init> ()V
      // 8f: sipush 21837
      // 92: sipush -29076
      // 95: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: aload 1
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // a5: athrow
      // a6: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: aload 3
      // ab: areturn
   }

   public boolean H(File param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: iload 2
      // 07: i2l
      // 08: sipush 19641
      // 0b: ldc2_w 7054982995800670244
      // 0e: invokestatic com/finalshell/core/File2.b (IJ)J
      // 11: lmul
      // 12: ladd
      // 13: lstore 4
      // 15: astore 3
      // 16: bipush 0
      // 17: istore 6
      // 19: aload 1
      // 1a: invokevirtual java/io/File.exists ()Z
      // 1d: ifne 95
      // 20: lload 4
      // 22: invokestatic java/lang/System.currentTimeMillis ()J
      // 25: lsub
      // 26: lstore 7
      // 28: lload 7
      // 2a: lconst_0
      // 2b: aload 3
      // 2c: ifnull 73
      // 2f: lcmp
      // 30: aload 3
      // 31: ifnull 97
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: ifge 68
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 0
      // 46: istore 9
      // 48: iload 6
      // 4a: aload 3
      // 4b: ifnull 67
      // 4e: ifeq 65
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 5b: invokevirtual java/lang/Thread.interrupt ()V
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: iload 9
      // 67: ireturn
      // 68: sipush 10003
      // 6b: ldc2_w 2712449435966843786
      // 6e: invokestatic com/finalshell/core/File2.b (IJ)J
      // 71: lload 7
      // 73: invokestatic java/lang/Math.min (JJ)J
      // 76: invokestatic java/lang/Thread.sleep (J)V
      // 79: goto 8a
      // 7c: astore 9
      // 7e: bipush 1
      // 7f: istore 6
      // 81: goto 8a
      // 84: astore 9
      // 86: aload 3
      // 87: ifnonnull 95
      // 8a: aload 3
      // 8b: ifnonnull 19
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: iload 6
      // 97: aload 3
      // 98: ifnull ca
      // 9b: ifeq c9
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // a8: invokevirtual java/lang/Thread.interrupt ()V
      // ab: goto c9
      // ae: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: astore 10
      // b4: iload 6
      // b6: ifeq c6
      // b9: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // bc: invokevirtual java/lang/Thread.interrupt ()V
      // bf: goto c6
      // c2: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 10
      // c8: athrow
      // c9: bipush 1
      // ca: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String c(File var1, Charset var2) throws IOException {
      Vk2.y();
      Object[] var10002 = Registry.packArgs(var1);
      long var8 = 630481829109737701L;
      Object[] var7 = var10002;
      var10002 = Ref.h(630481829109737701L, var7, var8);

      try {
         var10002 = (FileInputStream)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      FileInputStream var4 = var10002;
      File2 var3 = this;

      String var5;
      try {
         var5 = IOUtils.toString(var4, Charsets.toCharset(var2));
      } catch (Throwable var13) {
         Throwable var15;
         label49: {
            label48: {
               try {
                  var10000 = var4;
                  if (var3 == null) {
                     break label48;
                  }

                  if (var4 == null) {
                     throw var13;
                  }
               } catch (Throwable var12) {
                  throw a(var12);
               }

               try {
                  var10000 = var4;
               } catch (Throwable var11) {
                  var15 = var11;
                  boolean var10001 = false;
                  break label49;
               }
            }

            try {
               var10000.close();
               throw var13;
            } catch (Throwable var10) {
               var15 = var10;
               boolean var16 = false;
            }
         }

         Throwable var6 = var15;
         var13.addSuppressed(var6);
         throw var13;
      }

      FileInputStream var17;
      label61: {
         try {
            var17 = var4;
            if (var3 == null) {
               break label61;
            }

            if (var4 == null) {
               return var5;
            }
         } catch (Throwable var14) {
            throw a(var14);
         }

         var17 = var4;
      }

      var17.close();
      return var5;
   }

   public String Q(File var1, String var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, Charsets.toCharset(var2));
      long var4 = 240901810350722735L;
      Object[] var3 = var10001;
      var10001 = Ref.h(240901810350722735L, var3, var4);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Deprecated
   public String t$String(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, Charset.defaultCharset());
      long var3 = 240901810350722735L;
      Object[] var2 = var10001;
      var10001 = Ref.h(240901810350722735L, var2, var3);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public byte[] K$arrbyte(File var1) throws IOException {
      Vk2.y();
      Object[] var10002 = Registry.packArgs(var1);
      long var8 = 630481829109737701L;
      Object[] var7 = var10002;
      var10002 = Ref.h(630481829109737701L, var7, var8);

      try {
         var10002 = (FileInputStream)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      FileInputStream var3 = var10002;
      File2 var2 = this;

      byte[] var6;
      try {
         long var4 = var1.length();

         byte[] var18;
         label74: {
            try {
               if (var4 > 0L) {
                  var18 = IOUtils.toByteArray(var3, var4);
                  break label74;
               }
            } catch (Throwable var14) {
               throw a(var14);
            }

            var18 = IOUtils.toByteArray(var3);
         }

         var6 = var18;
      } catch (Throwable var15) {
         Throwable var16;
         label55: {
            label54: {
               try {
                  var10000 = var3;
                  if (var2 == null) {
                     break label54;
                  }

                  if (var3 == null) {
                     throw var15;
                  }
               } catch (Throwable var12) {
                  throw a(var12);
               }

               try {
                  var10000 = var3;
               } catch (Throwable var11) {
                  var16 = var11;
                  boolean var10001 = false;
                  break label55;
               }
            }

            try {
               var10000.close();
               throw var15;
            } catch (Throwable var10) {
               var16 = var10;
               boolean var17 = false;
            }
         }

         Throwable var5 = var16;
         var15.addSuppressed(var5);
         throw var15;
      }

      FileInputStream var19;
      label65: {
         try {
            var19 = var3;
            if (var2 == null) {
               break label65;
            }

            if (var3 == null) {
               return var6;
            }
         } catch (Throwable var13) {
            throw a(var13);
         }

         var19 = var3;
      }

      var19.close();
      return var6;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public List f(File var1, Charset var2) throws IOException {
      Vk2.y();
      Object[] var10002 = Registry.packArgs(var1);
      long var8 = 630481829109737701L;
      Object[] var7 = var10002;
      var10002 = Ref.h(630481829109737701L, var7, var8);

      try {
         var10002 = (FileInputStream)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      FileInputStream var4 = var10002;
      File2 var3 = this;

      List var5;
      try {
         var5 = IOUtils.readLines(var4, Charsets.toCharset(var2));
      } catch (Throwable var13) {
         Throwable var15;
         label49: {
            label48: {
               try {
                  var10000 = var4;
                  if (var3 == null) {
                     break label48;
                  }

                  if (var4 == null) {
                     throw var13;
                  }
               } catch (Throwable var12) {
                  throw a(var12);
               }

               try {
                  var10000 = var4;
               } catch (Throwable var11) {
                  var15 = var11;
                  boolean var10001 = false;
                  break label49;
               }
            }

            try {
               var10000.close();
               throw var13;
            } catch (Throwable var10) {
               var15 = var10;
               boolean var16 = false;
            }
         }

         Throwable var6 = var15;
         var13.addSuppressed(var6);
         throw var13;
      }

      FileInputStream var17;
      label61: {
         try {
            var17 = var4;
            if (var3 == null) {
               break label61;
            }

            if (var4 == null) {
               return var5;
            }
         } catch (Throwable var14) {
            throw a(var14);
         }

         var17 = var4;
      }

      var17.close();
      return var5;
   }

   public List Y(File var1, String var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, Charsets.toCharset(var2));
      long var4 = 230271745396018754L;
      Object[] var3 = var10001;
      var10001 = Ref.h(230271745396018754L, var3, var4);

      try {
         return (List)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Deprecated
   public List K$List(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, Charset.defaultCharset());
      long var3 = 230271745396018754L;
      Object[] var2 = var10001;
      var10001 = Ref.h(230271745396018754L, var2, var3);

      try {
         return (List)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public LineIterator p(File var1, String var2) throws IOException {
      Ky4[] var10000 = Vk2.y();
      FileInputStream var4 = null;
      Ky4[] var3 = var10000;

      try {
         Object[] var10001 = Registry.packArgs(var1);
         long var8 = 630481829109737701L;
         Object[] var7 = var10001;
         var10001 = Ref.h(630481829109737701L, var7, var8);

         try {
            var10001 = (FileInputStream)var10001;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var4 = var10001;
         return IOUtils.lineIterator(var4, var2);
      } catch (RuntimeException | IOException var12) {
         try {
            label35: {
               try {
                  var13 = var4;
                  if (var3 == null) {
                     break label35;
                  }

                  if (var4 == null) {
                     throw var12;
                  }
               } catch (IOException var10) {
                  throw a(var10);
               }

               var13 = var4;
            }

            var13.close();
         } catch (IOException var11) {
            var12.addSuppressed(var11);
         }

         throw var12;
      }
   }

   public LineIterator h(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, null);
      long var3 = 204519571075360529L;
      Object[] var2 = var10001;
      var10001 = Ref.h(204519571075360529L, var2, var3);

      try {
         return (LineIterator)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void Z(File var1, String var2, Charset var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, false);
      long var5 = 158010215926209792L;
      Object[] var4 = var10001;
      Ref.h(158010215926209792L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void Q(File var1, String var2, String var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, false);
      long var5 = 287050696876581679L;
      Object[] var4 = var10001;
      Ref.h(287050696876581679L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void f(File var1, String var2, Charset var3, boolean var4) throws IOException {
      Vk2.y();
      Object[] var10002 = Registry.packArgs(var1, var4);
      long var10 = 286016544931944572L;
      Object[] var9 = var10002;
      var10002 = Ref.h(286016544931944572L, var9, var10);

      try {
         var10002 = (FileOutputStream)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      FileOutputStream var6 = var10002;
      File2 var5 = this;

      try {
         IOUtils.write(var2, var6, var3);
      } catch (Throwable var15) {
         Throwable var16;
         label46: {
            label45: {
               try {
                  var10000 = var6;
                  if (var5 == null) {
                     break label45;
                  }

                  if (var6 == null) {
                     throw var15;
                  }
               } catch (Throwable var14) {
                  throw a(var14);
               }

               try {
                  var10000 = var6;
               } catch (Throwable var13) {
                  var16 = var13;
                  boolean var10001 = false;
                  break label46;
               }
            }

            try {
               var10000.close();
               throw var15;
            } catch (Throwable var12) {
               var16 = var12;
               boolean var17 = false;
            }
         }

         Throwable var8 = var16;
         var15.addSuppressed(var8);
         throw var15;
      }

      FileOutputStream var18 = var6;
      if (this != null) {
         if (var6 == null) {
            return;
         }

         var18 = var6;
      }

      var18.close();
   }

   public void X(File var1, String var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charsets.toCharset(var3), var4);
      long var6 = 158010215926209792L;
      Object[] var5 = var10001;
      Ref.h(158010215926209792L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   @Deprecated
   public void o(File var1, String var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charset.defaultCharset(), false);
      long var4 = 158010215926209792L;
      Object[] var3 = var10001;
      Ref.h(158010215926209792L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Deprecated
   public void U(File var1, String var2, boolean var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charset.defaultCharset(), var3);
      long var5 = 158010215926209792L;
      Object[] var4 = var10001;
      Ref.h(158010215926209792L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Deprecated
   public void K(File var1, CharSequence var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charset.defaultCharset(), false);
      long var4 = 469073223414406336L;
      Object[] var3 = var10001;
      Ref.h(469073223414406336L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Deprecated
   public void r(File var1, CharSequence var2, boolean var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charset.defaultCharset(), var3);
      long var5 = 469073223414406336L;
      Object[] var4 = var10001;
      Ref.h(469073223414406336L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void e(File var1, CharSequence var2, Charset var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, false);
      long var5 = 469073223414406336L;
      Object[] var4 = var10001;
      Ref.h(469073223414406336L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void f(File var1, CharSequence var2, String var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, false);
      long var5 = 202305187229101536L;
      Object[] var4 = var10001;
      Ref.h(202305187229101536L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void J(File param1, CharSequence param2, Charset param3, boolean param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 5
      // 05: aload 2
      // 06: aload 5
      // 08: ifnull 1e
      // 0b: ifnonnull 1d
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aconst_null
      // 16: goto 23
      // 19: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 2
      // 1e: invokeinterface java/lang/CharSequence.toString ()Ljava/lang/String; 1
      // 23: astore 6
      // 25: aload 0
      // 26: aload 1
      // 27: aload 6
      // 29: aload 3
      // 2a: iload 4
      // 2c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 2f: ldc2_w 158010215926209792
      // 32: astore 8
      // 34: astore 7
      // 36: ldc2_w 158010215926209792
      // 39: aload 7
      // 3b: aload 8
      // 3d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40: pop
      // 41: goto 48
      // 44: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47: athrow
      // 48: return
   }

   public void B(File var1, CharSequence var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, Charsets.toCharset(var3), var4);
      long var6 = 469073223414406336L;
      Object[] var5 = var10001;
      Ref.h(469073223414406336L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void B(File var1, byte[] var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, false);
      long var4 = 630759356597215286L;
      Object[] var3 = var10001;
      Ref.h(630759356597215286L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void L(File var1, byte[] var2, boolean var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, 0, var2.length, var3);
      long var5 = 419982512059814671L;
      Object[] var4 = var10001;
      Ref.h(419982512059814671L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void G(File var1, byte[] var2, int var3, int var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, var4, false);
      long var6 = 419982512059814671L;
      Object[] var5 = var10001;
      Ref.h(419982512059814671L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(File var1, byte[] var2, int var3, int var4, boolean var5) throws IOException {
      Vk2.y();
      Object[] var10002 = Registry.packArgs(var1, var5);
      long var11 = 286016544931944572L;
      Object[] var10 = var10002;
      var10002 = Ref.h(286016544931944572L, var10, var11);

      try {
         var10002 = (FileOutputStream)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      FileOutputStream var7 = var10002;
      File2 var6 = this;

      try {
         var7.write(var2, var3, var4);
      } catch (Throwable var16) {
         Throwable var17;
         label46: {
            label45: {
               try {
                  var10000 = var7;
                  if (var6 == null) {
                     break label45;
                  }

                  if (var7 == null) {
                     throw var16;
                  }
               } catch (Throwable var15) {
                  throw a(var15);
               }

               try {
                  var10000 = var7;
               } catch (Throwable var14) {
                  var17 = var14;
                  boolean var10001 = false;
                  break label46;
               }
            }

            try {
               var10000.close();
               throw var16;
            } catch (Throwable var13) {
               var17 = var13;
               boolean var18 = false;
            }
         }

         Throwable var9 = var17;
         var16.addSuppressed(var9);
         throw var16;
      }

      FileOutputStream var19 = var7;
      if (this != null) {
         if (var7 == null) {
            return;
         }

         var19 = var7;
      }

      var19.close();
   }

   public void M(File var1, String var2, Collection var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, null, false);
      long var5 = 185952313372465588L;
      Object[] var4 = var10001;
      Ref.h(185952313372465588L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void O(File var1, String var2, Collection var3, boolean var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, null, var4);
      long var6 = 185952313372465588L;
      Object[] var5 = var10001;
      Ref.h(185952313372465588L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void y(File var1, Collection var2) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, null, var2, null, false);
      long var4 = 185952313372465588L;
      Object[] var3 = var10001;
      Ref.h(185952313372465588L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void R(File var1, Collection var2, boolean var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, null, var2, null, var3);
      long var5 = 185952313372465588L;
      Object[] var4 = var10001;
      Ref.h(185952313372465588L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void U(File var1, String var2, Collection var3, String var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, var4, false);
      long var6 = 185952313372465588L;
      Object[] var5 = var10001;
      Ref.h(185952313372465588L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void O(File var1, String var2, Collection var3, String var4, boolean var5) throws IOException {
      BufferedOutputStream var10001;
      Object[] var10003 = Registry.packArgs(var1, var5);
      long var10 = 286016544931944572L;
      Object[] var9 = var10003;
      var10003 = Ref.h(286016544931944572L, var9, var10);

      try {
         var10003 = (FileOutputStream)var10003;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      super(var10003);
      BufferedOutputStream var6 = var10001;

      try {
         IOUtils.writeLines(var3, var4, var6, var2);
      } catch (Throwable var12) {
         try {
            var6.close();
         } catch (Throwable var11) {
            var12.addSuppressed(var11);
         }

         throw var12;
      }

      var6.close();
   }

   public void t(File var1, Collection var2, String var3) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, null, var2, var3, false);
      long var5 = 185952313372465588L;
      Object[] var4 = var10001;
      Ref.h(185952313372465588L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void Y(File var1, Collection var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = Registry.packArgs(var1, null, var2, var3, var4);
      long var6 = 185952313372465588L;
      Object[] var5 = var10001;
      Ref.h(185952313372465588L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void y(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.isDirectory ()Z
      // 08: aload 2
      // 09: ifnull 4a
      // 0c: ifeq 3f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 519603404431654025
      // 1e: astore 6
      // 20: astore 5
      // 22: ldc2_w 519603404431654025
      // 25: aload 5
      // 27: aload 6
      // 29: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c: pop
      // 2d: goto 34
      // 30: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 2
      // 35: ifnonnull ad
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 1
      // 40: invokevirtual java/io/File.exists ()Z
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: istore 3
      // 4b: aload 1
      // 4c: invokevirtual java/io/File.delete ()Z
      // 4f: aload 2
      // 50: ifnull 5e
      // 53: ifne ad
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: iload 3
      // 5e: ifne 87
      // 61: new java/io/FileNotFoundException
      // 64: dup
      // 65: new java/lang/StringBuilder
      // 68: dup
      // 69: invokespecial java/lang/StringBuilder.<init> ()V
      // 6c: sipush 21797
      // 6f: sipush 26996
      // 72: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78: aload 1
      // 79: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7f: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 82: athrow
      // 83: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: new java/lang/StringBuilder
      // 8a: dup
      // 8b: invokespecial java/lang/StringBuilder.<init> ()V
      // 8e: sipush 21782
      // 91: sipush -15722
      // 94: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 1
      // 9b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 9e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a1: astore 4
      // a3: new java/io/IOException
      // a6: dup
      // a7: aload 4
      // a9: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // ac: athrow
      // ad: return
   }

   public void l(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 45
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 3d
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 436571362886361448
      // 1e: astore 4
      // 20: astore 3
      // 21: ldc2_w 436571362886361448
      // 24: aload 3
      // 25: aload 4
      // 27: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a: pop
      // 2b: goto 32
      // 2e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 2
      // 33: ifnonnull 48
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 1
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: invokevirtual java/io/File.deleteOnExit ()V
      // 48: return
   }

   public void d(File var1) throws IOException {
      Ky4[] var2 = Vk2.y();

      File var10001;
      label50: {
         File2 var10000;
         label49: {
            try {
               var10000 = var1.exists();
               if (var2 == null) {
                  break label49;
               }

               if (var10000 == null) {
                  return;
               }
            } catch (IOException var11) {
               throw a(var11);
            }

            try {
               var1.deleteOnExit();
               var10000 = this;
               var10001 = var1;
               if (var2 == null) {
                  break label50;
               }

               Object[] var12 = Registry.packArgs(var1);
               long var4 = 445181380587021203L;
               Object[] var3 = var12;
               var10001 = (File)Ref.h(445181380587021203L, var3, var4);

               try {
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }
            } catch (IOException var10) {
               throw a(var10);
            }
         }

         try {
            if (var10000 == null) {
               return;
            }

            var10001 = var1;
         } catch (IOException var9) {
            throw a(var9);
         }
      }

      Object[] var14 = Registry.packArgs(var10001);
      long var6 = 462809636395036636L;
      Object[] var5 = var14;
      Ref.h(462809636395036636L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void t$void(File var1) throws IOException {
      Object[] var10001 = Registry.packArgs(var1);
      long var11 = 417012132292310060L;
      Object[] var10 = var10001;
      var10001 = Ref.h(417012132292310060L, var10, var11);

      try {
         var10001 = (File[])var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      File[] var3 = var10001;
      Ky4[] var21 = Vk2.y();
      IOException var4 = null;
      File[] var5 = var3;
      int var6 = var3.length;
      Ky4[] var2 = var21;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            File var8 = var5[var7];

            label46: {
               IOException var9;
               try {
                  label44: {
                     try {
                        Object[] var10002 = Registry.packArgs(var8);
                        long var13 = 275487383563797059L;
                        Object[] var12 = var10002;
                        Ref.h(275487383563797059L, var12, var13);

                        try {
                           ;
                        } catch (InvocationTargetException var15) {
                           throw var15.getTargetException();
                        }
                     } catch (IOException var17) {
                        var9 = var17;
                        break label44;
                     }

                     if (var2 == null) {
                        break;
                     }
                     break label46;
                  }
               } catch (NullPointerException var18) {
                  throw a(var18);
               }

               var4 = var9;
            }

            var7++;
            if (var2 != null) {
               continue;
            }
         }

         try {
            if (null != var4) {
               throw var4;
            }
            break;
         } catch (IOException var14) {
            throw a(var14);
         }
      }
   }

   public void v$void(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 77
      // 0c: ifeq 54
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/io/File.isDirectory ()Z
      // 1a: ifne b7
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: sipush 21793
      // 2e: sipush 940
      // 31: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: aload 1
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3b: sipush 21843
      // 3e: sipush -4237
      // 41: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a: astore 3
      // 4b: new java/io/IOException
      // 4e: dup
      // 4f: aload 3
      // 50: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 53: athrow
      // 54: aload 0
      // 55: aload 1
      // 56: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 59: ldc2_w 323874994732919696
      // 5c: astore 5
      // 5e: astore 4
      // 60: ldc2_w 323874994732919696
      // 63: aload 4
      // 65: aload 5
      // 67: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6a: checkcast java/lang/Boolean
      // 6d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 70: goto 77
      // 73: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 2
      // 78: ifnull 90
      // 7b: ifne b7
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 1
      // 86: invokevirtual java/io/File.isDirectory ()Z
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: ifne b7
      // 93: new java/lang/StringBuilder
      // 96: dup
      // 97: invokespecial java/lang/StringBuilder.<init> ()V
      // 9a: sipush 21848
      // 9d: sipush -3482
      // a0: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6: aload 1
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ad: astore 3
      // ae: new java/io/IOException
      // b1: dup
      // b2: aload 3
      // b3: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // b6: athrow
      // b7: return
   }

   public void K$void(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 1
      // 04: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 2
      // 0a: ifnull 3b
      // 0d: aload 3
      // 0e: ifnonnull 1d
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: return
      // 19: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 3
      // 1f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 22: ldc2_w 434472978318978351
      // 25: astore 5
      // 27: astore 4
      // 29: ldc2_w 434472978318978351
      // 2c: aload 4
      // 2e: aload 5
      // 30: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33: pop
      // 34: goto 3b
      // 37: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: return
   }

   public long k(File var1) {
      Ky4[] var2 = Vk2.y();

      label57: {
         boolean var10000;
         label47: {
            try {
               var10000 = var1.exists();
               if (var2 == null) {
                  break label47;
               }

               if (!var10000) {
                  break label57;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            try {
               if (var2 == null) {
                  return var1.length();
               }

               var10000 = var1.isDirectory();
            } catch (NullPointerException var7) {
               throw a(var7);
            }
         }

         try {
            if (var10000) {
               Object[] var10001 = Registry.packArgs(var1);
               long var5 = 516955069676995539L;
               Object[] var4 = var10001;
               var10001 = Ref.h(516955069676995539L, var4, var5);

               try {
                  return (Long)var10001;
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }
            }
         } catch (NullPointerException var8) {
            throw a(var8);
         }

         return var1.length();
      }

      String var3 = var1 + a(21838, 4536);
      throw new IllegalArgumentException(var3);
   }

   public BigInteger P(File var1) {
      Ky4[] var2 = Vk2.y();

      label57: {
         boolean var10000;
         label47: {
            try {
               var10000 = var1.exists();
               if (var2 == null) {
                  break label47;
               }

               if (!var10000) {
                  break label57;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            try {
               if (var2 == null) {
                  return BigInteger.valueOf(var1.length());
               }

               var10000 = var1.isDirectory();
            } catch (NullPointerException var7) {
               throw a(var7);
            }
         }

         try {
            if (var10000) {
               Object[] var10001 = Registry.packArgs(var1);
               long var5 = 322687331344026812L;
               Object[] var4 = var10001;
               var10001 = Ref.h(322687331344026812L, var4, var5);

               try {
                  return (BigInteger)var10001;
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }
            }
         } catch (NullPointerException var8) {
            throw a(var8);
         }

         return BigInteger.valueOf(var1.length());
      }

      String var3 = var1 + a(21833, 13482);
      throw new IllegalArgumentException(var3);
   }

   public long Q$long(File var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 505072782684634901L;
      Object[] var2 = var10001;
      Ref.h(505072782684634901L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 516955069676995539L;
      Object[] var4 = var10002;
      var10002 = Ref.h(516955069676995539L, var4, var5);

      try {
         return (Long)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public long O(File var1) {
      Ky4[] var10000 = Vk2.y();
      File[] var3 = var1.listFiles();
      Ky4[] var2 = var10000;

      try {
         if (var3 == null) {
            return 0L;
         }
      } catch (IOException var20) {
         throw a(var20);
      }

      long var4 = 0L;

      for (File var9 : var3) {
         label60: {
            try {
               long var22;
               label75: {
                  try {
                     Object[] var10001 = Registry.packArgs(var9);
                     long var12 = 445181380587021203L;
                     Object[] var11 = var10001;
                     Object var21 = Ref.h(445181380587021203L, var11, var12);

                     try {
                        var22 = (long)(Boolean)var21;
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     if (var2 == null) {
                        break label75;
                     }

                     if (var22 != 0) {
                        break label60;
                     }
                  } catch (IOException var18) {
                     throw a(var18);
                  }

                  var22 = var4;
                  Object[] var10003 = Registry.packArgs(var9);
                  long var14 = 126011339481536981L;
                  Object[] var13 = var10003;
                  var10003 = Ref.h(126011339481536981L, var13, var14);

                  try {
                     var24 = (Long)var10003;
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }

                  var4 = this + var24;
                  long var25;
                  int var10002 = (var25 = var4 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
               }

               if (!(var22 < 0)) {
                  break label60;
               }
            } catch (IOException var19) {
               break label60;
            }

            try {
               if (var2 != null) {
                  break;
               }
            } catch (IOException var17) {
               throw a(var17);
            }
         }

         if (var2 == null) {
            break;
         }
      }

      return var4;
   }

   public long t$long(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3d
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 3c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 516955069676995539
      // 1e: astore 4
      // 20: astore 3
      // 21: ldc2_w 516955069676995539
      // 24: aload 3
      // 25: aload 4
      // 27: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a: checkcast java/lang/Long
      // 2d: invokevirtual java/lang/Long.longValue ()J
      // 30: goto 37
      // 33: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36: athrow
      // 37: lreturn
      // 38: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: invokevirtual java/io/File.length ()J
      // 40: lreturn
   }

   public BigInteger q(File var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 505072782684634901L;
      Object[] var2 = var10001;
      Ref.h(505072782684634901L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 322687331344026812L;
      Object[] var4 = var10002;
      var10002 = Ref.h(322687331344026812L, var4, var5);

      try {
         return (BigInteger)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public BigInteger D(File var1) {
      Ky4[] var10000 = Vk2.y();
      File[] var3 = var1.listFiles();
      Ky4[] var2 = var10000;

      try {
         if (var3 == null) {
            return BigInteger.ZERO;
         }
      } catch (IOException var17) {
         throw a(var17);
      }

      BigInteger var4 = BigInteger.ZERO;

      for (File var8 : var3) {
         try {
            Object[] var10001 = Registry.packArgs(var8);
            long var11 = 445181380587021203L;
            Object[] var10 = var10001;
            var10001 = Ref.h(445181380587021203L, var10, var11);

            try {
               var19 = (Boolean)var10001;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            if (!var19) {
               Object[] var10003 = Registry.packArgs(var8);
               long var13 = 595512039280100507L;
               Object[] var12 = var10003;
               var10003 = Ref.h(595512039280100507L, var12, var13);

               try {
                  var10003 = (BigInteger)var10003;
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               var4 = this.add(var10003);
            }
         } catch (IOException var16) {
         }

         if (var2 == null) {
            break;
         }
      }

      return var4;
   }

   public BigInteger C(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 3a
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 39
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 322687331344026812
      // 1e: astore 4
      // 20: astore 3
      // 21: ldc2_w 322687331344026812
      // 24: aload 3
      // 25: aload 4
      // 27: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a: checkcast java/math/BigInteger
      // 2d: goto 34
      // 30: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33: athrow
      // 34: areturn
      // 35: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 1
      // 3a: invokevirtual java/io/File.length ()J
      // 3d: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 40: areturn
   }

   public void i$void(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 40
      // 0c: ifne 3c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/IllegalArgumentException
      // 19: dup
      // 1a: new java/lang/StringBuilder
      // 1d: dup
      // 1e: invokespecial java/lang/StringBuilder.<init> ()V
      // 21: aload 1
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 25: sipush 21838
      // 28: sipush 4536
      // 2b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 2e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 37: athrow
      // 38: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: invokevirtual java/io/File.isDirectory ()Z
      // 40: ifne 69
      // 43: new java/lang/IllegalArgumentException
      // 46: dup
      // 47: new java/lang/StringBuilder
      // 4a: dup
      // 4b: invokespecial java/lang/StringBuilder.<init> ()V
      // 4e: aload 1
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 52: sipush 21844
      // 55: sipush 17994
      // 58: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 61: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 64: athrow
      // 65: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: return
   }

   public boolean s(File param1, File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21860
      // 1a: sipush 4492
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 3
      // 2d: ifnull 93
      // 30: ifne 6c
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21866
      // 48: sipush 1321
      // 4b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 2
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: sipush 21887
      // 58: sipush 30609
      // 5b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokevirtual java/io/File.lastModified ()J
      // 72: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;J)[Ljava/lang/Object;
      // 75: ldc2_w 449450884059870577
      // 78: astore 5
      // 7a: astore 4
      // 7c: ldc2_w 449450884059870577
      // 7f: aload 4
      // 81: aload 5
      // 83: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 86: checkcast java/lang/Boolean
      // 89: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8c: goto 93
      // 8f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 92: athrow
      // 93: ireturn
   }

   public boolean O(File var1, Date var2) {
      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a(21818, -32615));
         }
      } catch (NullPointerException var6) {
         throw a(var6);
      }

      Object[] var10001 = Registry.packArgs(var1, var2.getTime());
      long var4 = 449450884059870577L;
      Object[] var3 = var10001;
      var10001 = Ref.h(449450884059870577L, var3, var4);

      try {
         return (Boolean)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public boolean R(File param1, long param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: sipush 21804
      // 1c: sipush -15356
      // 1f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/io/File.exists ()Z
      // 2e: aload 4
      // 30: ifnull 49
      // 33: ifne 43
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual java/io/File.lastModified ()J
      // 47: lload 2
      // 48: lcmp
      // 49: aload 4
      // 4b: ifnull 59
      // 4e: ifle 5c
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
   }

   public boolean J(File param1, File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21879
      // 1a: sipush -8338
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 3
      // 2d: ifnull 93
      // 30: ifne 6c
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21806
      // 48: sipush -17713
      // 4b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 2
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: sipush 21842
      // 58: sipush 2846
      // 5b: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokevirtual java/io/File.lastModified ()J
      // 72: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;J)[Ljava/lang/Object;
      // 75: ldc2_w 160336580247799259
      // 78: astore 5
      // 7a: astore 4
      // 7c: ldc2_w 160336580247799259
      // 7f: aload 4
      // 81: aload 5
      // 83: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 86: checkcast java/lang/Boolean
      // 89: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8c: goto 93
      // 8f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 92: athrow
      // 93: ireturn
   }

   public boolean p(File var1, Date var2) {
      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a(21809, 21610));
         }
      } catch (NullPointerException var6) {
         throw a(var6);
      }

      Object[] var10001 = Registry.packArgs(var1, var2.getTime());
      long var4 = 160336580247799259L;
      Object[] var3 = var10001;
      var10001 = Ref.h(160336580247799259L, var3, var4);

      try {
         return (Boolean)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public boolean n(File param1, long param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: sipush 21835
      // 1c: sipush 28338
      // 1f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/io/File.exists ()Z
      // 2e: aload 4
      // 30: ifnull 49
      // 33: ifne 43
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual java/io/File.lastModified ()J
      // 47: lload 2
      // 48: lcmp
      // 49: aload 4
      // 4b: ifnull 59
      // 4e: ifge 5c
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
   }

   public long K$long(File var1) throws IOException {
      CRC32 var2 = new CRC32();
      Object[] var10001 = Registry.packArgs(var1, var2);
      long var4 = 633118833076006115L;
      Object[] var3 = var10001;
      Ref.h(633118833076006115L, var3, var4);
      return var2.getValue();
   }

   public Checksum T(File var1, Checksum var2) throws IOException {
      try {
         if (var1.isDirectory()) {
            throw new IllegalArgumentException(a(21846, 3341));
         }
      } catch (Throwable var8) {
         throw a(var8);
      }

      CheckedInputStream var3 = new CheckedInputStream(new FileInputStream(var1), var2);

      try {
         IOUtils.copy(var3, new NullOutputStream());
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
      return var2;
   }

   public void G(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21825
      // 01a: sipush 25410
      // 01d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 2
      // 029: aload 3
      // 02a: ifnull 04d
      // 02d: ifnonnull 04c
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/lang/NullPointerException
      // 03a: dup
      // 03b: sipush 21814
      // 03e: sipush 19208
      // 041: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 044: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual java/io/File.exists ()Z
      // 050: aload 3
      // 051: ifnull 094
      // 054: ifne 090
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: new java/io/FileNotFoundException
      // 061: dup
      // 062: new java/lang/StringBuilder
      // 065: dup
      // 066: invokespecial java/lang/StringBuilder.<init> ()V
      // 069: sipush 21865
      // 06c: sipush -4101
      // 06f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: aload 1
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 079: sipush 21863
      // 07c: sipush -24367
      // 07f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 1
      // 091: invokevirtual java/io/File.isDirectory ()Z
      // 094: aload 3
      // 095: ifnull 0d8
      // 098: ifne 0d4
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: new java/io/IOException
      // 0a5: dup
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 21865
      // 0b0: sipush -4101
      // 0b3: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 1
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bd: sipush 21869
      // 0c0: sipush -574
      // 0c3: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cc: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0cf: athrow
      // 0d0: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 2
      // 0d5: invokevirtual java/io/File.exists ()Z
      // 0d8: aload 3
      // 0d9: ifnull 11d
      // 0dc: ifeq 118
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: new org/apache/commons/io/FileExistsException
      // 0e9: dup
      // 0ea: new java/lang/StringBuilder
      // 0ed: dup
      // 0ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f1: sipush 21854
      // 0f4: sipush -21271
      // 0f7: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: aload 2
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 101: sipush 21815
      // 104: sipush -4143
      // 107: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: invokespecial org/apache/commons/io/FileExistsException.<init> (Ljava/lang/String;)V
      // 113: athrow
      // 114: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 1
      // 119: aload 2
      // 11a: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 11d: istore 4
      // 11f: iload 4
      // 121: aload 3
      // 122: ifnull 154
      // 125: ifne 218
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 2
      // 130: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 133: new java/lang/StringBuilder
      // 136: dup
      // 137: invokespecial java/lang/StringBuilder.<init> ()V
      // 13a: aload 1
      // 13b: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: getstatic java/io/File.separator Ljava/lang/String;
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 3
      // 155: ifnull 1d9
      // 158: ifeq 198
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: new java/io/IOException
      // 165: dup
      // 166: new java/lang/StringBuilder
      // 169: dup
      // 16a: invokespecial java/lang/StringBuilder.<init> ()V
      // 16d: sipush 21876
      // 170: sipush 14156
      // 173: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: aload 1
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17d: sipush 21798
      // 180: sipush -17740
      // 183: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: aload 2
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 193: athrow
      // 194: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: aload 0
      // 199: aload 1
      // 19a: aload 2
      // 19b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 19e: ldc2_w 369759582331880199
      // 1a1: astore 6
      // 1a3: astore 5
      // 1a5: ldc2_w 369759582331880199
      // 1a8: aload 5
      // 1aa: aload 6
      // 1ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1af: pop
      // 1b0: goto 1b7
      // 1b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: aload 1
      // 1b9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1bc: ldc2_w 519603404431654025
      // 1bf: astore 8
      // 1c1: astore 7
      // 1c3: ldc2_w 519603404431654025
      // 1c6: aload 7
      // 1c8: aload 8
      // 1ca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1cd: pop
      // 1ce: goto 1d5
      // 1d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: aload 1
      // 1d6: invokevirtual java/io/File.exists ()Z
      // 1d9: ifeq 218
      // 1dc: new java/io/IOException
      // 1df: dup
      // 1e0: new java/lang/StringBuilder
      // 1e3: dup
      // 1e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e7: sipush 21881
      // 1ea: sipush 10002
      // 1ed: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 1f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f3: aload 1
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f7: sipush 21829
      // 1fa: sipush 25191
      // 1fd: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: aload 2
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 207: ldc_w "'"
      // 20a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 210: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 213: athrow
      // 214: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: return
   }

   public void j(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnull 02b
      // 00b: ifnonnull 02a
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: new java/lang/NullPointerException
      // 018: dup
      // 019: sipush 21825
      // 01c: sipush 25410
      // 01f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 022: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 025: athrow
      // 026: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 2
      // 02b: aload 4
      // 02d: ifnull 050
      // 030: ifnonnull 04f
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: new java/lang/NullPointerException
      // 03d: dup
      // 03e: sipush 21852
      // 041: sipush -25196
      // 044: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 047: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 2
      // 050: invokevirtual java/io/File.exists ()Z
      // 053: aload 4
      // 055: ifnull 0a2
      // 058: ifne 09e
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 3
      // 063: aload 4
      // 065: ifnull 0a2
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: ifeq 09e
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 2
      // 07b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 323874994732919696
      // 081: astore 6
      // 083: astore 5
      // 085: ldc2_w 323874994732919696
      // 088: aload 5
      // 08a: aload 6
      // 08c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08f: goto 096
      // 092: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 095: athrow
      // 096: pop
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 2
      // 09f: invokevirtual java/io/File.exists ()Z
      // 0a2: aload 4
      // 0a4: ifnull 0f1
      // 0a7: ifne 0ed
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: new java/io/FileNotFoundException
      // 0b4: dup
      // 0b5: new java/lang/StringBuilder
      // 0b8: dup
      // 0b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc: sipush 21875
      // 0bf: sipush 29759
      // 0c2: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: aload 2
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0cc: sipush 21803
      // 0cf: sipush 7161
      // 0d2: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: iload 3
      // 0d9: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0dc: ldc_w "]"
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 0e8: athrow
      // 0e9: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 2
      // 0ee: invokevirtual java/io/File.isDirectory ()Z
      // 0f1: ifne 126
      // 0f4: new java/io/IOException
      // 0f7: dup
      // 0f8: new java/lang/StringBuilder
      // 0fb: dup
      // 0fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ff: sipush 21854
      // 102: sipush -21271
      // 105: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: aload 2
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10f: sipush 21869
      // 112: sipush -574
      // 115: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 0
      // 127: aload 1
      // 128: new java/io/File
      // 12b: dup
      // 12c: aload 2
      // 12d: aload 1
      // 12e: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 131: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 134: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 137: ldc2_w 488329656482662052
      // 13a: astore 8
      // 13c: astore 7
      // 13e: ldc2_w 488329656482662052
      // 141: aload 7
      // 143: aload 8
      // 145: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 148: pop
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: return
   }

   public void v(File param1, File param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21825
      // 01a: sipush 25410
      // 01d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 2
      // 029: aload 3
      // 02a: ifnull 04d
      // 02d: ifnonnull 04c
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/lang/NullPointerException
      // 03a: dup
      // 03b: sipush 21814
      // 03e: sipush 19208
      // 041: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 044: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual java/io/File.exists ()Z
      // 050: aload 3
      // 051: ifnull 094
      // 054: ifne 090
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: new java/io/FileNotFoundException
      // 061: dup
      // 062: new java/lang/StringBuilder
      // 065: dup
      // 066: invokespecial java/lang/StringBuilder.<init> ()V
      // 069: sipush 21865
      // 06c: sipush -4101
      // 06f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: aload 1
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 079: sipush 21863
      // 07c: sipush -24367
      // 07f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 1
      // 091: invokevirtual java/io/File.isDirectory ()Z
      // 094: aload 3
      // 095: ifnull 0d7
      // 098: ifeq 0d3
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: new java/io/IOException
      // 0a5: dup
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 21865
      // 0b0: sipush -4101
      // 0b3: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 1
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bd: sipush 21850
      // 0c0: bipush 92
      // 0c2: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0ce: athrow
      // 0cf: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: aload 2
      // 0d4: invokevirtual java/io/File.exists ()Z
      // 0d7: aload 3
      // 0d8: ifnull 11b
      // 0db: ifeq 117
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: new org/apache/commons/io/FileExistsException
      // 0e8: dup
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: sipush 21854
      // 0f3: sipush -21271
      // 0f6: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: aload 2
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 100: sipush 21867
      // 103: sipush 30799
      // 106: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10f: invokespecial org/apache/commons/io/FileExistsException.<init> (Ljava/lang/String;)V
      // 112: athrow
      // 113: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 2
      // 118: invokevirtual java/io/File.isDirectory ()Z
      // 11b: aload 3
      // 11c: ifnull 160
      // 11f: ifeq 15b
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: new java/io/IOException
      // 12c: dup
      // 12d: new java/lang/StringBuilder
      // 130: dup
      // 131: invokespecial java/lang/StringBuilder.<init> ()V
      // 134: sipush 21854
      // 137: sipush -21271
      // 13a: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: aload 2
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 144: sipush 21819
      // 147: sipush -22930
      // 14a: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 153: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 156: athrow
      // 157: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 1
      // 15c: aload 2
      // 15d: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 160: istore 4
      // 162: iload 4
      // 164: aload 3
      // 165: ifnull 19c
      // 168: ifne 20d
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 0
      // 173: aload 1
      // 174: aload 2
      // 175: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 178: ldc2_w 172839385836868030
      // 17b: astore 6
      // 17d: astore 5
      // 17f: ldc2_w 172839385836868030
      // 182: aload 5
      // 184: aload 6
      // 186: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 189: pop
      // 18a: goto 191
      // 18d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 1
      // 192: invokevirtual java/io/File.delete ()Z
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 3
      // 19d: ifnull 1d4
      // 1a0: ifne 20d
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: aload 2
      // 1ac: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1af: ldc2_w 311170580059209010
      // 1b2: astore 8
      // 1b4: astore 7
      // 1b6: ldc2_w 311170580059209010
      // 1b9: aload 7
      // 1bb: aload 8
      // 1bd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c0: checkcast java/lang/Boolean
      // 1c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c6: goto 1cd
      // 1c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: pop
      // 1d5: new java/io/IOException
      // 1d8: dup
      // 1d9: new java/lang/StringBuilder
      // 1dc: dup
      // 1dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e0: sipush 21864
      // 1e3: sipush -6105
      // 1e6: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 1e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ec: aload 1
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f0: sipush 21872
      // 1f3: sipush -24926
      // 1f6: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: aload 2
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 200: ldc_w "'"
      // 203: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 206: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 209: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 20c: athrow
      // 20d: return
   }

   public void d(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnull 02b
      // 00b: ifnonnull 02a
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: new java/lang/NullPointerException
      // 018: dup
      // 019: sipush 21825
      // 01c: sipush 25410
      // 01f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 022: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 025: athrow
      // 026: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 2
      // 02b: aload 4
      // 02d: ifnull 050
      // 030: ifnonnull 04f
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: new java/lang/NullPointerException
      // 03d: dup
      // 03e: sipush 21885
      // 041: sipush -27612
      // 044: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 047: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 2
      // 050: invokevirtual java/io/File.exists ()Z
      // 053: aload 4
      // 055: ifnull 0a2
      // 058: ifne 09e
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 3
      // 063: aload 4
      // 065: ifnull 0a2
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: ifeq 09e
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 2
      // 07b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 323874994732919696
      // 081: astore 6
      // 083: astore 5
      // 085: ldc2_w 323874994732919696
      // 088: aload 5
      // 08a: aload 6
      // 08c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08f: goto 096
      // 092: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 095: athrow
      // 096: pop
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 2
      // 09f: invokevirtual java/io/File.exists ()Z
      // 0a2: aload 4
      // 0a4: ifnull 0f1
      // 0a7: ifne 0ed
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: new java/io/FileNotFoundException
      // 0b4: dup
      // 0b5: new java/lang/StringBuilder
      // 0b8: dup
      // 0b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc: sipush 21883
      // 0bf: sipush 23922
      // 0c2: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: aload 2
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0cc: sipush 21851
      // 0cf: sipush -3993
      // 0d2: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: iload 3
      // 0d9: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0dc: ldc_w "]"
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 0e8: athrow
      // 0e9: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 2
      // 0ee: invokevirtual java/io/File.isDirectory ()Z
      // 0f1: ifne 126
      // 0f4: new java/io/IOException
      // 0f7: dup
      // 0f8: new java/lang/StringBuilder
      // 0fb: dup
      // 0fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ff: sipush 21854
      // 102: sipush -21271
      // 105: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: aload 2
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10f: sipush 21869
      // 112: sipush -574
      // 115: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 0
      // 127: aload 1
      // 128: new java/io/File
      // 12b: dup
      // 12c: aload 2
      // 12d: aload 1
      // 12e: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 131: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 134: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 137: ldc2_w 304348418354541089
      // 13a: astore 8
      // 13c: astore 7
      // 13e: ldc2_w 304348418354541089
      // 141: aload 7
      // 143: aload 8
      // 145: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 148: pop
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: return
   }

   public void Z(File param1, File param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/NullPointerException
      // 18: dup
      // 19: sipush 21825
      // 1c: sipush 25410
      // 1f: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: aload 4
      // 2d: ifnull 50
      // 30: ifnonnull 4f
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/NullPointerException
      // 3d: dup
      // 3e: sipush 21814
      // 41: sipush 19208
      // 44: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 47: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 4a: athrow
      // 4b: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 1
      // 50: invokevirtual java/io/File.exists ()Z
      // 53: aload 4
      // 55: ifnull 98
      // 58: ifne 94
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: new java/io/FileNotFoundException
      // 65: dup
      // 66: new java/lang/StringBuilder
      // 69: dup
      // 6a: invokespecial java/lang/StringBuilder.<init> ()V
      // 6d: sipush 21865
      // 70: sipush -4101
      // 73: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: aload 1
      // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7d: sipush 21863
      // 80: sipush -24367
      // 83: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 8f: athrow
      // 90: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 1
      // 95: invokevirtual java/io/File.isDirectory ()Z
      // 98: ifeq c7
      // 9b: aload 0
      // 9c: aload 1
      // 9d: aload 2
      // 9e: iload 3
      // 9f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // a2: ldc2_w 591690265631190812
      // a5: astore 6
      // a7: astore 5
      // a9: ldc2_w 591690265631190812
      // ac: aload 5
      // ae: aload 6
      // b0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b3: pop
      // b4: goto bb
      // b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ba: athrow
      // bb: aload 4
      // bd: ifnonnull ee
      // c0: goto c7
      // c3: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c6: athrow
      // c7: aload 0
      // c8: aload 1
      // c9: aload 2
      // ca: iload 3
      // cb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // ce: ldc2_w 158621969937078300
      // d1: astore 8
      // d3: astore 7
      // d5: ldc2_w 158621969937078300
      // d8: aload 7
      // da: aload 8
      // dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // df: pop
      // e0: goto e7
      // e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // e6: athrow
      // e7: goto ee
      // ea: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ed: athrow
      // ee: return
   }

   public boolean J(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Vk2.y ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21870
      // 1a: sipush -25430
      // 1d: invokestatic com/finalshell/core/File2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/File2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 2c: invokestatic java/nio/file/Files.isSymbolicLink (Ljava/nio/file/Path;)Z
      // 2f: ireturn
   }

   public UG a() {
      Object var1 = 136992684323528157L;
      return (UG)Ref.g(136992684323528157L, var1);
   }

   public void e(UG var1) {
      long var3 = 136992684323528157L;
      Ref.s(136992684323528157L, var1, var3);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 21873) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 28;
               break;
            case 1:
               var10000 = 63;
               break;
            case 2:
               var10000 = 103;
               break;
            case 3:
               var10000 = 75;
               break;
            case 4:
               var10000 = 109;
               break;
            case 5:
               var10000 = 31;
               break;
            case 6:
               var10000 = 8;
               break;
            case 7:
               var10000 = 29;
               break;
            case 8:
               var10000 = 239;
               break;
            case 9:
               var10000 = 224;
               break;
            case 10:
               var10000 = 208;
               break;
            case 11:
               var10000 = 254;
               break;
            case 12:
               var10000 = 59;
               break;
            case 13:
               var10000 = 226;
               break;
            case 14:
               var10000 = 90;
               break;
            case 15:
               var10000 = 238;
               break;
            case 16:
               var10000 = 181;
               break;
            case 17:
               var10000 = 114;
               break;
            case 18:
               var10000 = 227;
               break;
            case 19:
               var10000 = 17;
               break;
            case 20:
               var10000 = 182;
               break;
            case 21:
               var10000 = 252;
               break;
            case 22:
               var10000 = 50;
               break;
            case 23:
               var10000 = 184;
               break;
            case 24:
               var10000 = 201;
               break;
            case 25:
               var10000 = 219;
               break;
            case 26:
               var10000 = 44;
               break;
            case 27:
               var10000 = 244;
               break;
            case 28:
               var10000 = 157;
               break;
            case 29:
               var10000 = 78;
               break;
            case 30:
               var10000 = 84;
               break;
            case 31:
               var10000 = 120;
               break;
            case 32:
               var10000 = 14;
               break;
            case 33:
               var10000 = 149;
               break;
            case 34:
               var10000 = 99;
               break;
            case 35:
               var10000 = 128;
               break;
            case 36:
               var10000 = 217;
               break;
            case 37:
               var10000 = 133;
               break;
            case 38:
               var10000 = 130;
               break;
            case 39:
               var10000 = 46;
               break;
            case 40:
               var10000 = 165;
               break;
            case 41:
               var10000 = 147;
               break;
            case 42:
               var10000 = 191;
               break;
            case 43:
               var10000 = 96;
               break;
            case 44:
               var10000 = 4;
               break;
            case 45:
               var10000 = 135;
               break;
            case 46:
               var10000 = 86;
               break;
            case 47:
               var10000 = 83;
               break;
            case 48:
               var10000 = 228;
               break;
            case 49:
               var10000 = 95;
               break;
            case 50:
               var10000 = 115;
               break;
            case 51:
               var10000 = 148;
               break;
            case 52:
               var10000 = 108;
               break;
            case 53:
               var10000 = 158;
               break;
            case 54:
               var10000 = 160;
               break;
            case 55:
               var10000 = 134;
               break;
            case 56:
               var10000 = 32;
               break;
            case 57:
               var10000 = 21;
               break;
            case 58:
               var10000 = 40;
               break;
            case 59:
               var10000 = 34;
               break;
            case 60:
               var10000 = 155;
               break;
            case 61:
               var10000 = 209;
               break;
            case 62:
               var10000 = 1;
               break;
            case 63:
               var10000 = 56;
               break;
            case 64:
               var10000 = 74;
               break;
            case 65:
               var10000 = 72;
               break;
            case 66:
               var10000 = 221;
               break;
            case 67:
               var10000 = 216;
               break;
            case 68:
               var10000 = 48;
               break;
            case 69:
               var10000 = 7;
               break;
            case 70:
               var10000 = 189;
               break;
            case 71:
               var10000 = 100;
               break;
            case 72:
               var10000 = 197;
               break;
            case 73:
               var10000 = 118;
               break;
            case 74:
               var10000 = 77;
               break;
            case 75:
               var10000 = 37;
               break;
            case 76:
               var10000 = 169;
               break;
            case 77:
               var10000 = 229;
               break;
            case 78:
               var10000 = 43;
               break;
            case 79:
               var10000 = 49;
               break;
            case 80:
               var10000 = 255;
               break;
            case 81:
               var10000 = 38;
               break;
            case 82:
               var10000 = 138;
               break;
            case 83:
               var10000 = 0;
               break;
            case 84:
               var10000 = 69;
               break;
            case 85:
               var10000 = 222;
               break;
            case 86:
               var10000 = 20;
               break;
            case 87:
               var10000 = 223;
               break;
            case 88:
               var10000 = 220;
               break;
            case 89:
               var10000 = 51;
               break;
            case 90:
               var10000 = 240;
               break;
            case 91:
               var10000 = 87;
               break;
            case 92:
               var10000 = 45;
               break;
            case 93:
               var10000 = 190;
               break;
            case 94:
               var10000 = 101;
               break;
            case 95:
               var10000 = 57;
               break;
            case 96:
               var10000 = 132;
               break;
            case 97:
               var10000 = 159;
               break;
            case 98:
               var10000 = 195;
               break;
            case 99:
               var10000 = 92;
               break;
            case 100:
               var10000 = 79;
               break;
            case 101:
               var10000 = 58;
               break;
            case 102:
               var10000 = 98;
               break;
            case 103:
               var10000 = 39;
               break;
            case 104:
               var10000 = 161;
               break;
            case 105:
               var10000 = 247;
               break;
            case 106:
               var10000 = 140;
               break;
            case 107:
               var10000 = 24;
               break;
            case 108:
               var10000 = 53;
               break;
            case 109:
               var10000 = 199;
               break;
            case 110:
               var10000 = 66;
               break;
            case 111:
               var10000 = 11;
               break;
            case 112:
               var10000 = 127;
               break;
            case 113:
               var10000 = 144;
               break;
            case 114:
               var10000 = 105;
               break;
            case 115:
               var10000 = 35;
               break;
            case 116:
               var10000 = 193;
               break;
            case 117:
               var10000 = 76;
               break;
            case 118:
               var10000 = 180;
               break;
            case 119:
               var10000 = 81;
               break;
            case 120:
               var10000 = 36;
               break;
            case 121:
               var10000 = 211;
               break;
            case 122:
               var10000 = 203;
               break;
            case 123:
               var10000 = 170;
               break;
            case 124:
               var10000 = 67;
               break;
            case 125:
               var10000 = 89;
               break;
            case 126:
               var10000 = 176;
               break;
            case 127:
               var10000 = 61;
               break;
            case 128:
               var10000 = 231;
               break;
            case 129:
               var10000 = 194;
               break;
            case 130:
               var10000 = 253;
               break;
            case 131:
               var10000 = 54;
               break;
            case 132:
               var10000 = 102;
               break;
            case 133:
               var10000 = 107;
               break;
            case 134:
               var10000 = 116;
               break;
            case 135:
               var10000 = 73;
               break;
            case 136:
               var10000 = 64;
               break;
            case 137:
               var10000 = 117;
               break;
            case 138:
               var10000 = 249;
               break;
            case 139:
               var10000 = 187;
               break;
            case 140:
               var10000 = 23;
               break;
            case 141:
               var10000 = 137;
               break;
            case 142:
               var10000 = 179;
               break;
            case 143:
               var10000 = 245;
               break;
            case 144:
               var10000 = 164;
               break;
            case 145:
               var10000 = 124;
               break;
            case 146:
               var10000 = 246;
               break;
            case 147:
               var10000 = 70;
               break;
            case 148:
               var10000 = 233;
               break;
            case 149:
               var10000 = 82;
               break;
            case 150:
               var10000 = 141;
               break;
            case 151:
               var10000 = 142;
               break;
            case 152:
               var10000 = 119;
               break;
            case 153:
               var10000 = 19;
               break;
            case 154:
               var10000 = 18;
               break;
            case 155:
               var10000 = 143;
               break;
            case 156:
               var10000 = 154;
               break;
            case 157:
               var10000 = 136;
               break;
            case 158:
               var10000 = 22;
               break;
            case 159:
               var10000 = 122;
               break;
            case 160:
               var10000 = 110;
               break;
            case 161:
               var10000 = 242;
               break;
            case 162:
               var10000 = 129;
               break;
            case 163:
               var10000 = 205;
               break;
            case 164:
               var10000 = 177;
               break;
            case 165:
               var10000 = 163;
               break;
            case 166:
               var10000 = 27;
               break;
            case 167:
               var10000 = 47;
               break;
            case 168:
               var10000 = 172;
               break;
            case 169:
               var10000 = 113;
               break;
            case 170:
               var10000 = 168;
               break;
            case 171:
               var10000 = 9;
               break;
            case 172:
               var10000 = 112;
               break;
            case 173:
               var10000 = 167;
               break;
            case 174:
               var10000 = 139;
               break;
            case 175:
               var10000 = 156;
               break;
            case 176:
               var10000 = 26;
               break;
            case 177:
               var10000 = 202;
               break;
            case 178:
               var10000 = 15;
               break;
            case 179:
               var10000 = 111;
               break;
            case 180:
               var10000 = 10;
               break;
            case 181:
               var10000 = 68;
               break;
            case 182:
               var10000 = 152;
               break;
            case 183:
               var10000 = 106;
               break;
            case 184:
               var10000 = 145;
               break;
            case 185:
               var10000 = 97;
               break;
            case 186:
               var10000 = 210;
               break;
            case 187:
               var10000 = 234;
               break;
            case 188:
               var10000 = 251;
               break;
            case 189:
               var10000 = 5;
               break;
            case 190:
               var10000 = 12;
               break;
            case 191:
               var10000 = 153;
               break;
            case 192:
               var10000 = 85;
               break;
            case 193:
               var10000 = 196;
               break;
            case 194:
               var10000 = 186;
               break;
            case 195:
               var10000 = 16;
               break;
            case 196:
               var10000 = 3;
               break;
            case 197:
               var10000 = 178;
               break;
            case 198:
               var10000 = 151;
               break;
            case 199:
               var10000 = 174;
               break;
            case 200:
               var10000 = 125;
               break;
            case 201:
               var10000 = 6;
               break;
            case 202:
               var10000 = 185;
               break;
            case 203:
               var10000 = 121;
               break;
            case 204:
               var10000 = 71;
               break;
            case 205:
               var10000 = 237;
               break;
            case 206:
               var10000 = 213;
               break;
            case 207:
               var10000 = 166;
               break;
            case 208:
               var10000 = 33;
               break;
            case 209:
               var10000 = 173;
               break;
            case 210:
               var10000 = 126;
               break;
            case 211:
               var10000 = 215;
               break;
            case 212:
               var10000 = 123;
               break;
            case 213:
               var10000 = 55;
               break;
            case 214:
               var10000 = 250;
               break;
            case 215:
               var10000 = 225;
               break;
            case 216:
               var10000 = 212;
               break;
            case 217:
               var10000 = 162;
               break;
            case 218:
               var10000 = 146;
               break;
            case 219:
               var10000 = 131;
               break;
            case 220:
               var10000 = 232;
               break;
            case 221:
               var10000 = 183;
               break;
            case 222:
               var10000 = 175;
               break;
            case 223:
               var10000 = 188;
               break;
            case 224:
               var10000 = 230;
               break;
            case 225:
               var10000 = 60;
               break;
            case 226:
               var10000 = 52;
               break;
            case 227:
               var10000 = 94;
               break;
            case 228:
               var10000 = 192;
               break;
            case 229:
               var10000 = 30;
               break;
            case 230:
               var10000 = 241;
               break;
            case 231:
               var10000 = 150;
               break;
            case 232:
               var10000 = 206;
               break;
            case 233:
               var10000 = 207;
               break;
            case 234:
               var10000 = 104;
               break;
            case 235:
               var10000 = 248;
               break;
            case 236:
               var10000 = 88;
               break;
            case 237:
               var10000 = 25;
               break;
            case 238:
               var10000 = 2;
               break;
            case 239:
               var10000 = 93;
               break;
            case 240:
               var10000 = 204;
               break;
            case 241:
               var10000 = 236;
               break;
            case 242:
               var10000 = 13;
               break;
            case 243:
               var10000 = 62;
               break;
            case 244:
               var10000 = 80;
               break;
            case 245:
               var10000 = 198;
               break;
            case 246:
               var10000 = 235;
               break;
            case 247:
               var10000 = 41;
               break;
            case 248:
               var10000 = 200;
               break;
            case 249:
               var10000 = 243;
               break;
            case 250:
               var10000 = 91;
               break;
            case 251:
               var10000 = 214;
               break;
            case 252:
               var10000 = 171;
               break;
            case 253:
               var10000 = 65;
               break;
            case 254:
               var10000 = 218;
               break;
            default:
               var10000 = 42;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4775;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 3228) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[104];
      int var19 = 0;
      String var18 = "\u0083B\u0012X§¡zQ\u0080ê\u001a¶ç\u0097,R\u0012¬Z\u001aä \u000f\u0099\u001f>\u0011Å\u0098Æ`[Ô\r\u009eÊD\u0017É«õÓP\u0003\u0017\u009e®°YØ¨Ð/\n¬Z\u008d\u009b\u0012\u0004W\u0003fºSB\u009b\r\u0003zXõ\u0002解瘼\u0017\u0099ðª\f#A(Rz \u0099&\u0089gFùK³³écÖ.\u001b8Ô|Za$ßÉ¦È*\u0083»\u0004Ûî\u000b4wÃªSN\u0019µ_\u0080\b,;\u0015¦ \u009aÕP%\u0095Ñ\u0089*ª×R\u008b5wq\u0015½àÏ\u0084ÿ\u0007\u0013\u001c×C+\u0091\u009båá\u001fKöêR\u0087ÕåKù\u000e\u0094f\u001fÑÏ\t\u0093¦°\u008e\u00adÏµ\u008d\u0017Û¿\u0018{Íìr§^½Ð¯ÊV.ßFw\u0012qWß¯\u0006S×Têñ¤&.á¦°\u001a\u0095\u0088\u0088\u0001X;\u0013·Á\u0081-³)¬º\u0080¦\u001fYa>\u0006½fT²#\u00ad}ü\u0013d\t\u000eò¹ P\u0096\u0001\u0081\u0081\u009b©øÊx\u009f\u000f\fkú\u0017h\u0004DWkÕÃ\\Ïa$%AB±\u0013[\u0096\u001ctÕ *¢z¦\u000f\u00ad§¥\u0011\u001e¬¦JQOuÃ\u0086ß\ný±5l\u008eAw\u0014cs\u001a\b\u009de\u0016\u0096T\u0095¿!\u00adPyaN}ûC\u001cæ\u0011¿®9Vìð\u008dWªò\u008cáÏ§\u0018Qòê\u0012(7×p\u0011Ö{*î\u0001)=Î\u0098\u0083RÌ\u007f³\u0015ËÖµ±×gÈ\u0000ì\u009b\u0003ø5Öúã\u0010ÓÚb¬ÁZ\u008aÂíáü-\u0007\r瘳梮攎仵巾寙垵©邦抩搀伇i\u001eà?èúö`\u0084M,\u009c¯kHEÅ;Ä´\u0012\u0005$£¬\u0002ó\u009e\u001ala\u000e\u001b:Î<\u0019iLÞÄ\u0086i.·;\u0082Ë>\t.7\u0080¢;O\u0014\u0095þ\u0084\u0010Þ´ ì#{cñ\u00135ñ\u0083u>GÃ\u0003¥8\u000e\bb\u001cÜB\u0099\u0006òÃ _gÐü\u0081\r7Ð\u0099\u001cäx\u000fM\u009915±JÊü\u0099NÊ7\u008evrå[¡´\u0010\nª?,b\u0016ÿ\u0082ÿDýn\b'Ü¾\u0014USÍ\u001e¸\u0095£ó\u0098\u000epÑßû¹\u0006-ÐÞã\u0014Ëß\u000f\u009d?×BÀÞ_îx\u0087{<\u0004æÑîÖ\u0003Ôà \u0003鄹咃咂\u0015'hÚ\u001d \u0010»\\ìj8¼ÇÛ\u008d\u000ecW\u00872©\u0006\u0016\u0089©KUÛ\u0004\u0086\u0012ÊR;æ\u0081\\¡5\u0013&U\u008c<\u0089¾§n}\u008a8·\u001fz\t\u008bX7\u001b\u0003Éî\\\u0012E\u0005¬ýå\u0093©åÅ»äC\u0090\n¤-\u0093\u009aF\u0013±$&an¢¨\u009bÛ\u000f\u0001w[\u0094\\tÂY»\u0014Ùd\u008cfL\u0003\u000e1{\u0013ÜÇ\u0010\u00adËé@r§\u0096ì%\u0010k°äª%\u0014\u0016äd\u008e\u0095ØL\u008557Õê\u0094\u0001«oÙp\u0004\u0013ÆC\u0082*Àµ\u008a\u0081I[´ö\nâ\u000e£·ðÌÉÝI\u000f\u0094D\u001dNÊò]×¬\u0090ël\u008bzü\u0080-\u0099\u0019\u008ar\u001f\u0097&¥{Ûfg\u0090x\u0011\u0084?'\u0016$\u008eñ¤ì\u000fl\u0097\u0097Ù\fZéoÃ\u009fÞ\u001dä\u0096-\u0088©ÝÚ\u008e\u001b²[\u0014\u009b\u0019/\fµþ°\u000fú\u009cìÃ\u0081~¬8\u0018È±\u0090\u008a«\u0010~ Ì\fâûk\u0099j\u00ad2¾Õòñ\u0010×\u0006\u001bP\u009e_W[c\u009fãåÔï.Z§\u0003\u0010ÉtOè7v\f\nø\u0007\u000f\u0005K.\f\n\u0002跌迳&¹¿T{DìC§x½\u0014¯RV=ß$w^qÞßÔv\u0018Û)\u0001\u0083Ã\u000eÑ:#\u000eØ:p\u0003±~\u008c\r<~äCRë\u0081G ¡\u001f,p\u0017R\u0011ÚãY2ê\u000f8\u008e\u0099V°o,{Á\u001f\u008cS.HF\u0006丩君哗梪搀俏\u000bm?Ï÷\u001cT\rïn=\u008d\u0004$-\u009eµ\u0011 \u0002z3Ì¾ÿÓ\u0094íÜüÒSü\u0084æ\u001bíÔ\u0086\u008aKÃn\t²'\u0089\u0013´¼F:_\u0017§3\u008e65Àåà\t\u0016\u0082\b,u^\u009aéi«i\u0005\u0099\t\u008b<\rk\u000fC\u001fQE\u0016è\u0099\u000f*è»\u0083Ë÷\nòo\u0002Ô\u000f6|ù\u0092ysu\u000f÷giPfôQ8Éy\u0097ÉEÓu\u001dÀxcsLX8[S? A6\u0083JgY\n3ÎÉ:§Í¯^_\r\u0098\u0011'\u009c\u009fS\u001d\u0005PíWL\u0014\u0013|\u0002/²\u0018\u000eC|\u0016èP\u0016Yc\u0080õ\u009bA\u0014î\u001bÜ\u0087 à\u008f\u008eö ¡\u0012ëµøhÏ nD\u0081YJ{\u00adiöÕk\u0006\b\u000b\u0080\n\u0099ß\u0013p¤Tù\u00ad:F\u0017\u0096 \n*\u0017$¡g\u000b\u001d\u009e\u000f¹J õ_@v®-«\u000b\u0093Ö\u0098\u0007\u0011\u009fö\u0088\u001eÿ¬\fØÜêeÇR\u009aâû¨\u0002认咭\u0016§¹\u0088MÑPk&ßS\u001dr,áf¢F\u000f/K#\u001a#\u0091\u0096\tÂºÊP(u\u0003~\u0091§'Gàeë¡«XÓ^P<$-º\u0092\u0018Ø÷ðK\u0017-\u0092}\u0010_\u0099·\u001c¦üÒ_¡\u00953Ñ\u001ey·0¤z@FC²vª®\u0095(KO÷k:\"¤Õ2!±e\u0090@l\t\u0085ù+\u0013¥îíGH\u0010¾Å©Á°«¥5´²\u0094°%üyÅ\u001c¨\u0092vÞ\u0000XË1io6õ\u001f\u0001½»VÒ;\u009a+&\u0010\u0016\u0094)J|%° \u008f_\u009c\u001fäEÊ\u0086Éf\u0006>\u0080¾VÇ/Rk/²`PS B£\u0092r¢Ä\u000e°\r°\u0013ZA5S5þÄs7\u000f£ÏFÀ\u0001¹Ö¤ä\u0010\u0093\u0012\u0004$^ï!9]a»ÉÝ·Þ9\u0011¡ùOÿ\u0007\u0090\u0013_?\u001a\u0019ÙÝY\u0013\u0083\u0096\rqÁM´g\u0015'\u0098ôZ\u0085S#\u0006}â\u0091LIp\u001d1\u0006]¼\u008b¡ÀdLØC½J\u001cÅ\u0094¨t\r\u0001\u000eÃ_ò°¹¼ñä\u001b\u0082{\u0012\u009fÙ¯\u0014¥ý²h\u00ad\u009e÷«fsP\u0099\u0087üB\u0016ô{ßd\u0005Yß\u0015ëÙ\u0010I\u007fR\u0095}T¨\u0014j\u0089Þ\u0014\u0090Ìû\u009d\u0016\u0006ª¼!L\u0010«8ãC\fÜ(#\u0018\u0018ï\u00adÓKCÏ\u0003&)~\u0015Û¿EçÓFß¨> \u0085õpò|6óóôNª\u000b/«\u0082\u0001P|\u008c\u0092\u001d×½\u001fj\u00897\\ü\u0098A\u0090Æ±¸Öû§Å¤\u0017î\u008fh\u0084ä\u008d\r\u001a:\u000b\u0014ì>º\u001e\u009anÄ&Á×èFV«¼U¡\u001bd7Ø,½«\u001b:\u0094Ë\u0094\\ôÊ¨ç\u0018þ\u007fO.ë\u008bïu¹#µq\u009cT5iØ\u0084à\u0089U\u008dQÚ\u0017\"ÖÔ\u001b\u0098-Òì?òyÙ¬\u009e¯E±Ø\u0082«ïW~ °Ëm\u0003\u009a\u0086TNõÂ-}îá48g\u0097\u0011§¦D]|$\u0099,`1«D=\u001b0¯|\u0098\u0095\u0000l\u0083cÓ\f\u009am.\u0017\u0095B\u0087Ûª\u000f\u0099\u008aR\u0000xì\u001f!^^¦ÑÇä{rÌ.y)R\u009f\u001a\\9æ\u0092©»(æ®G\u009d»>Ëà\u0011fY·ë\u0018\u0012ð\u000fC\u0010\u0096\u0098,s%\u009cY\tò\u008f<¯Ú¶13õ\u0014\u0001\u008cGåéê\u0089\u001cÝóØnÊ\f\u001bøy\u000fT\u0018\u001aý\u008dù¡Ú\u009eÕ¶u\u0016¤)0dÖ,Mc±ã\u0099\u009f ~êÂ\u00195DÜå\u0081¯îv3m\u0006M,Ô?ÊT)m\u009f#\u0099¶\u0001=\u0013\u00041\u000bs¨2,\t*ù]È&ÖvSrÓ\u000f\u0010\"\u00998GÜÜ¹¡¡pDº$ø4\u0086\u001b\\Öñ·$åZ?¥DÔhvpt^.þV\u0085¾|¼îÆï4\u0011Íw\u0096}ó¼¹7\u0099\u001b]dÜê\u008do\u001b";
      int var20 = "\u0083B\u0012X§¡zQ\u0080ê\u001a¶ç\u0097,R\u0012¬Z\u001aä \u000f\u0099\u001f>\u0011Å\u0098Æ`[Ô\r\u009eÊD\u0017É«õÓP\u0003\u0017\u009e®°YØ¨Ð/\n¬Z\u008d\u009b\u0012\u0004W\u0003fºSB\u009b\r\u0003zXõ\u0002解瘼\u0017\u0099ðª\f#A(Rz \u0099&\u0089gFùK³³écÖ.\u001b8Ô|Za$ßÉ¦È*\u0083»\u0004Ûî\u000b4wÃªSN\u0019µ_\u0080\b,;\u0015¦ \u009aÕP%\u0095Ñ\u0089*ª×R\u008b5wq\u0015½àÏ\u0084ÿ\u0007\u0013\u001c×C+\u0091\u009båá\u001fKöêR\u0087ÕåKù\u000e\u0094f\u001fÑÏ\t\u0093¦°\u008e\u00adÏµ\u008d\u0017Û¿\u0018{Íìr§^½Ð¯ÊV.ßFw\u0012qWß¯\u0006S×Têñ¤&.á¦°\u001a\u0095\u0088\u0088\u0001X;\u0013·Á\u0081-³)¬º\u0080¦\u001fYa>\u0006½fT²#\u00ad}ü\u0013d\t\u000eò¹ P\u0096\u0001\u0081\u0081\u009b©øÊx\u009f\u000f\fkú\u0017h\u0004DWkÕÃ\\Ïa$%AB±\u0013[\u0096\u001ctÕ *¢z¦\u000f\u00ad§¥\u0011\u001e¬¦JQOuÃ\u0086ß\ný±5l\u008eAw\u0014cs\u001a\b\u009de\u0016\u0096T\u0095¿!\u00adPyaN}ûC\u001cæ\u0011¿®9Vìð\u008dWªò\u008cáÏ§\u0018Qòê\u0012(7×p\u0011Ö{*î\u0001)=Î\u0098\u0083RÌ\u007f³\u0015ËÖµ±×gÈ\u0000ì\u009b\u0003ø5Öúã\u0010ÓÚb¬ÁZ\u008aÂíáü-\u0007\r瘳梮攎仵巾寙垵©邦抩搀伇i\u001eà?èúö`\u0084M,\u009c¯kHEÅ;Ä´\u0012\u0005$£¬\u0002ó\u009e\u001ala\u000e\u001b:Î<\u0019iLÞÄ\u0086i.·;\u0082Ë>\t.7\u0080¢;O\u0014\u0095þ\u0084\u0010Þ´ ì#{cñ\u00135ñ\u0083u>GÃ\u0003¥8\u000e\bb\u001cÜB\u0099\u0006òÃ _gÐü\u0081\r7Ð\u0099\u001cäx\u000fM\u009915±JÊü\u0099NÊ7\u008evrå[¡´\u0010\nª?,b\u0016ÿ\u0082ÿDýn\b'Ü¾\u0014USÍ\u001e¸\u0095£ó\u0098\u000epÑßû¹\u0006-ÐÞã\u0014Ëß\u000f\u009d?×BÀÞ_îx\u0087{<\u0004æÑîÖ\u0003Ôà \u0003鄹咃咂\u0015'hÚ\u001d \u0010»\\ìj8¼ÇÛ\u008d\u000ecW\u00872©\u0006\u0016\u0089©KUÛ\u0004\u0086\u0012ÊR;æ\u0081\\¡5\u0013&U\u008c<\u0089¾§n}\u008a8·\u001fz\t\u008bX7\u001b\u0003Éî\\\u0012E\u0005¬ýå\u0093©åÅ»äC\u0090\n¤-\u0093\u009aF\u0013±$&an¢¨\u009bÛ\u000f\u0001w[\u0094\\tÂY»\u0014Ùd\u008cfL\u0003\u000e1{\u0013ÜÇ\u0010\u00adËé@r§\u0096ì%\u0010k°äª%\u0014\u0016äd\u008e\u0095ØL\u008557Õê\u0094\u0001«oÙp\u0004\u0013ÆC\u0082*Àµ\u008a\u0081I[´ö\nâ\u000e£·ðÌÉÝI\u000f\u0094D\u001dNÊò]×¬\u0090ël\u008bzü\u0080-\u0099\u0019\u008ar\u001f\u0097&¥{Ûfg\u0090x\u0011\u0084?'\u0016$\u008eñ¤ì\u000fl\u0097\u0097Ù\fZéoÃ\u009fÞ\u001dä\u0096-\u0088©ÝÚ\u008e\u001b²[\u0014\u009b\u0019/\fµþ°\u000fú\u009cìÃ\u0081~¬8\u0018È±\u0090\u008a«\u0010~ Ì\fâûk\u0099j\u00ad2¾Õòñ\u0010×\u0006\u001bP\u009e_W[c\u009fãåÔï.Z§\u0003\u0010ÉtOè7v\f\nø\u0007\u000f\u0005K.\f\n\u0002跌迳&¹¿T{DìC§x½\u0014¯RV=ß$w^qÞßÔv\u0018Û)\u0001\u0083Ã\u000eÑ:#\u000eØ:p\u0003±~\u008c\r<~äCRë\u0081G ¡\u001f,p\u0017R\u0011ÚãY2ê\u000f8\u008e\u0099V°o,{Á\u001f\u008cS.HF\u0006丩君哗梪搀俏\u000bm?Ï÷\u001cT\rïn=\u008d\u0004$-\u009eµ\u0011 \u0002z3Ì¾ÿÓ\u0094íÜüÒSü\u0084æ\u001bíÔ\u0086\u008aKÃn\t²'\u0089\u0013´¼F:_\u0017§3\u008e65Àåà\t\u0016\u0082\b,u^\u009aéi«i\u0005\u0099\t\u008b<\rk\u000fC\u001fQE\u0016è\u0099\u000f*è»\u0083Ë÷\nòo\u0002Ô\u000f6|ù\u0092ysu\u000f÷giPfôQ8Éy\u0097ÉEÓu\u001dÀxcsLX8[S? A6\u0083JgY\n3ÎÉ:§Í¯^_\r\u0098\u0011'\u009c\u009fS\u001d\u0005PíWL\u0014\u0013|\u0002/²\u0018\u000eC|\u0016èP\u0016Yc\u0080õ\u009bA\u0014î\u001bÜ\u0087 à\u008f\u008eö ¡\u0012ëµøhÏ nD\u0081YJ{\u00adiöÕk\u0006\b\u000b\u0080\n\u0099ß\u0013p¤Tù\u00ad:F\u0017\u0096 \n*\u0017$¡g\u000b\u001d\u009e\u000f¹J õ_@v®-«\u000b\u0093Ö\u0098\u0007\u0011\u009fö\u0088\u001eÿ¬\fØÜêeÇR\u009aâû¨\u0002认咭\u0016§¹\u0088MÑPk&ßS\u001dr,áf¢F\u000f/K#\u001a#\u0091\u0096\tÂºÊP(u\u0003~\u0091§'Gàeë¡«XÓ^P<$-º\u0092\u0018Ø÷ðK\u0017-\u0092}\u0010_\u0099·\u001c¦üÒ_¡\u00953Ñ\u001ey·0¤z@FC²vª®\u0095(KO÷k:\"¤Õ2!±e\u0090@l\t\u0085ù+\u0013¥îíGH\u0010¾Å©Á°«¥5´²\u0094°%üyÅ\u001c¨\u0092vÞ\u0000XË1io6õ\u001f\u0001½»VÒ;\u009a+&\u0010\u0016\u0094)J|%° \u008f_\u009c\u001fäEÊ\u0086Éf\u0006>\u0080¾VÇ/Rk/²`PS B£\u0092r¢Ä\u000e°\r°\u0013ZA5S5þÄs7\u000f£ÏFÀ\u0001¹Ö¤ä\u0010\u0093\u0012\u0004$^ï!9]a»ÉÝ·Þ9\u0011¡ùOÿ\u0007\u0090\u0013_?\u001a\u0019ÙÝY\u0013\u0083\u0096\rqÁM´g\u0015'\u0098ôZ\u0085S#\u0006}â\u0091LIp\u001d1\u0006]¼\u008b¡ÀdLØC½J\u001cÅ\u0094¨t\r\u0001\u000eÃ_ò°¹¼ñä\u001b\u0082{\u0012\u009fÙ¯\u0014¥ý²h\u00ad\u009e÷«fsP\u0099\u0087üB\u0016ô{ßd\u0005Yß\u0015ëÙ\u0010I\u007fR\u0095}T¨\u0014j\u0089Þ\u0014\u0090Ìû\u009d\u0016\u0006ª¼!L\u0010«8ãC\fÜ(#\u0018\u0018ï\u00adÓKCÏ\u0003&)~\u0015Û¿EçÓFß¨> \u0085õpò|6óóôNª\u000b/«\u0082\u0001P|\u008c\u0092\u001d×½\u001fj\u00897\\ü\u0098A\u0090Æ±¸Öû§Å¤\u0017î\u008fh\u0084ä\u008d\r\u001a:\u000b\u0014ì>º\u001e\u009anÄ&Á×èFV«¼U¡\u001bd7Ø,½«\u001b:\u0094Ë\u0094\\ôÊ¨ç\u0018þ\u007fO.ë\u008bïu¹#µq\u009cT5iØ\u0084à\u0089U\u008dQÚ\u0017\"ÖÔ\u001b\u0098-Òì?òyÙ¬\u009e¯E±Ø\u0082«ïW~ °Ëm\u0003\u009a\u0086TNõÂ-}îá48g\u0097\u0011§¦D]|$\u0099,`1«D=\u001b0¯|\u0098\u0095\u0000l\u0083cÓ\f\u009am.\u0017\u0095B\u0087Ûª\u000f\u0099\u008aR\u0000xì\u001f!^^¦ÑÇä{rÌ.y)R\u009f\u001a\\9æ\u0092©»(æ®G\u009d»>Ëà\u0011fY·ë\u0018\u0012ð\u000fC\u0010\u0096\u0098,s%\u009cY\tò\u008f<¯Ú¶13õ\u0014\u0001\u008cGåéê\u0089\u001cÝóØnÊ\f\u001bøy\u000fT\u0018\u001aý\u008dù¡Ú\u009eÕ¶u\u0016¤)0dÖ,Mc±ã\u0099\u009f ~êÂ\u00195DÜå\u0081¯îv3m\u0006M,Ô?ÊT)m\u009f#\u0099¶\u0001=\u0013\u00041\u000bs¨2,\t*ù]È&ÖvSrÓ\u000f\u0010\"\u00998GÜÜ¹¡¡pDº$ø4\u0086\u001b\\Öñ·$åZ?¥DÔhvpt^.þV\u0085¾|¼îÆï4\u0011Íw\u0096}ó¼¹7\u0099\u001b]dÜê\u008do\u001b"
         .length();
      char var17 = 26;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 106;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 45;
                        break;
                     case 1:
                        var84 = 115;
                        break;
                     case 2:
                        var84 = 94;
                        break;
                     case 3:
                        var84 = 120;
                        break;
                     case 4:
                        var84 = 86;
                        break;
                     case 5:
                        var84 = 63;
                        break;
                     default:
                        var84 = 3;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     c = new String[104];
                     long var8 = 8291072884836189304L;
                     long[] var14 = new long[5];
                     int var11 = 0;
                     String var12 = "ÇTR\u0017?Ú[ò\u009aÜÿü\u0080Z\u0001¬ÊG\n\u0080\u0081Ì«?";
                     int var13 = "ÇTR\u0017?Ú[ò\u009aÜÿü\u0080Z\u0001¬ÊG\n\u0080\u0081Ì«?".length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    d = var14;
                                    e = new Integer[5];
                                    long var0 = 4843400937460680283L;
                                    long[] var6 = new long[12];
                                    int var3 = 0;
                                    String var4 = "kÐ©'Êý÷\u009f\"ßbÚ_=\u0085\u0097c\u0019O\u001d°\bËo@ühp§JD\u008a\u007fLÅ\\ÓH\u0080´f\u0093¹\u0019° mµ$È\u0015ÒP&¼¦Q§/\u0007a\u001a\u0012HBT¾Ãñ\u008c¿ \u0007.\u0011--\u0006\u008aê";
                                    int var5 = "kÐ©'Êý÷\u009f\"ßbÚ_=\u0085\u0097c\u0019O\u001d°\bËo@ühp§JD\u008a\u007fLÅ\\ÓH\u0080´f\u0093¹\u0019° mµ$È\u0015ÒP&¼¦Q§/\u0007a\u001a\u0012HBT¾Ãñ\u008c¿ \u0007.\u0011--\u0006\u008aê"
                                       .length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   f = var6;
                                                   g = new Long[12];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "C@¸5¼ºÐ\u0004w©[w°S}à";
                                                var5 = "C@¸5¼ºÐ\u0004w©[w°S}à".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "·\u0012QòÂÑxtÓ«é\u0017Nøz\u0005";
                                 var13 = "·\u0012QòÂÑxtÓ«é\u0017Nøz\u0005".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "X}Fçh[\\ô\u0017Ì\u0094\u0084\u0093\u009a\u0088ÁÔ\u0098\u0097\u0017ù@NËa\u00160¡J\u0001\u00adè\u0015lé&\biÅÏDüf";
                  var20 = "X}Fçh[\\ô\u0017Ì\u0094\u0084\u0093\u009a\u0088ÁÔ\u0098\u0097\u0017ù@NËa\u00160¡J\u0001\u00adè\u0015lé&\biÅÏDüf".length();
                  var17 = 19;
                  var26 = -1;
            }

            var10000 = 123;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}






