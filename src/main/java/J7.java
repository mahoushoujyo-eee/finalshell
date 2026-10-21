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
import java.lang.reflect.Method;
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

public class J7 {
   Window l;
   public final long u;
   public final BigInteger G;
   public final long R;
   public final BigInteger P;
   private final long H;
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
   UG D;
   boolean j;
   int U;
   boolean O;
   private static final String[] a;
   private static final String[] c;
   private static final long[] d;
   private static final Integer[] e;
   private static final long[] f;
   private static final Long[] g;

   public Window N() {
      return (Window)com.c.c(370337906235180180L).get(this);
   }

   public void C(Window var1) {
      com.c.c(370337906235180180L).set(this, var1);
   }

   public J7() {
      com.ky_4[] var10000 = Vk_2.y();
      this.u = b(1450, 2318923212092311860L);
      this.G = BigInteger.valueOf(b(7881, 33653061672604255L));
      this.R = b(30311, 7493746443976833789L);
      this.P = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(483024724664347952L).get(this));
      com.ky_4[] var1 = var10000;

      try {
         this.H = b(3662, 273416712236892881L);
         this.N = b(19063, 4358343288720967407L);
         this.b = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(343817520107337839L).get(this));
         this.I = b(30191, 100073967694379387L);
         this.h = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(495802560720461204L).get(this));
         this.n = b(15704, 2946372692575433156L);
         this.y = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(291107217730866810L).get(this));
         this.q = b(14124, 2638665222133398459L);
         this.k = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(150091135317611780L).get(this));
         this.Q = BigInteger.valueOf(b(7881, 33653061672604255L)).multiply(BigInteger.valueOf(b(22664, 184674500732343315L)));
         this.Z = ((BigInteger)com.c.c(483024724664347952L).get(this)).multiply((BigInteger)com.c.c(288071105979823784L).get(this));
         this.w = new File[0];
         com.c.c(230435673101303976L).setBoolean(this, false);
         com.c.c(589909688581199231L).setInt(this, 0);
         com.c.c(415499299058536700L).setBoolean(this, false);
         if (var1 == null) {
            com.ky_4.K(new String[5]);
         }
      } catch (NullPointerException var2) {
         throw a(var2);
      }
   }

   public File H(File var1, String[] var2) {
      com.ky_4[] var3 = Vk_2.y();

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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnonnull 1d
      // 08: new java/lang/NullPointerException
      // 0b: dup
      // 0c: sipush 21830
      // 0f: sipush 32093
      // 12: invokestatic J7.a (II)Ljava/lang/String;
      // 15: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 18: athrow
      // 19: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 44: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: ifnonnull 60
      // 4b: goto 52
      // 4e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 6d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      File var10000;
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(543253937601422016L);
      Object[] var10004 = var10003;
      J7 var3 = this;
      Method var10002 = var10005;

      try {
         var2 = (String)var10002.invoke(var3, var10004);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000 = new BufferedOutputStream(var2);
      return var10000;
   }

   public String B() {
      return System.getProperty(a(21807, 10500));
   }

   public File K() {
      File var10000;
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(169445659225053682L);
      Object[] var10004 = var10003;
      J7 var3 = this;
      Method var10002 = var10005;

      try {
         var2 = (String)var10002.invoke(var3, var10004);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000 = new BufferedOutputStream(var2);
      return var10000;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 21
      // 0c: ifeq 9a
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/io/File.isDirectory ()Z
      // 1a: goto 21
      // 1d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 2
      // 22: ifnull 65
      // 25: ifeq 61
      // 28: goto 2f
      // 2b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new java/io/IOException
      // 32: dup
      // 33: new java/lang/StringBuilder
      // 36: dup
      // 37: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a: sipush 21820
      // 3d: sipush -17756
      // 40: invokestatic J7.a (II)Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: aload 1
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4a: sipush 21802
      // 4d: sipush -6239
      // 50: invokestatic J7.a (II)Ljava/lang/String;
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 5c: athrow
      // 5d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 79: invokestatic J7.a (II)Ljava/lang/String;
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: aload 1
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 83: sipush 21778
      // 86: sipush -9604
      // 89: invokestatic J7.a (II)Ljava/lang/String;
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 92: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 95: athrow
      // 96: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: new java/io/FileNotFoundException
      // 9d: dup
      // 9e: new java/lang/StringBuilder
      // a1: dup
      // a2: invokespecial java/lang/StringBuilder.<init> ()V
      // a5: sipush 21882
      // a8: sipush 23816
      // ab: invokestatic J7.a (II)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: aload 1
      // b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b5: sipush 21792
      // b8: sipush -24445
      // bb: invokestatic J7.a (II)Ljava/lang/String;
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

   public FileOutputStream v(File var1) throws IOException {
      Object[] var10001 = com.c.a(var1, false);
      Method var10003 = com.c.d(286016544931944572L);
      Object[] var10002 = var10001;
      J7 var3 = this;
      Method var10000 = var10003;

      try {
         return (FileOutputStream)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: aload 1
      // 04: invokevirtual java/io/File.mkdirs ()Z
      // 07: istore 3
      // 08: astore 2
      // 09: iload 3
      // 0a: aload 2
      // 0b: ifnull 68
      // 0e: ifeq 67
      // 11: goto 18
      // 14: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: ldc2_w 136992684323528157
      // 1c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1f: swap
      // 20: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 23: checkcast UG
      // 26: aload 2
      // 27: ifnull 50
      // 2a: goto 31
      // 2d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifnull 67
      // 34: goto 3b
      // 37: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: ldc2_w 136992684323528157
      // 3f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 42: swap
      // 43: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 46: checkcast UG
      // 49: goto 50
      // 4c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 1
      // 51: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 54: ldc2_w 295103172862149005
      // 57: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 5a: dup_x2
      // 5b: pop
      // 5c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5f: pop
      // 60: goto 67
      // 63: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 66: athrow
      // 67: iload 3
      // 68: ireturn
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 09e
      // 009: invokevirtual java/io/File.exists ()Z
      // 00c: ifeq 09a
      // 00f: goto 016
      // 012: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 1
      // 017: invokevirtual java/io/File.isDirectory ()Z
      // 01a: aload 3
      // 01b: ifnull 065
      // 01e: goto 025
      // 021: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifeq 061
      // 028: goto 02f
      // 02b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: new java/io/IOException
      // 032: dup
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: invokespecial java/lang/StringBuilder.<init> ()V
      // 03a: sipush 21882
      // 03d: sipush 23816
      // 040: invokestatic J7.a (II)Ljava/lang/String;
      // 043: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 046: aload 1
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04a: sipush 21802
      // 04d: sipush -6239
      // 050: invokestatic J7.a (II)Ljava/lang/String;
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 056: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 059: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 05c: athrow
      // 05d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 1
      // 062: invokevirtual java/io/File.canWrite ()Z
      // 065: ifne 11a
      // 068: new java/io/IOException
      // 06b: dup
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 21882
      // 076: sipush 23816
      // 079: invokestatic J7.a (II)Ljava/lang/String;
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: aload 1
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 083: sipush 21795
      // 086: sipush -9298
      // 089: invokestatic J7.a (II)Ljava/lang/String;
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 092: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 095: athrow
      // 096: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 1
      // 09b: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 09e: astore 4
      // 0a0: aload 4
      // 0a2: ifnull 11a
      // 0a5: aload 0
      // 0a6: aload 4
      // 0a8: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ab: ldc2_w 323874994732919696
      // 0ae: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: checkcast java/lang/Boolean
      // 0b9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 3
      // 0c4: ifnull 0e4
      // 0c7: goto 0ce
      // 0ca: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: ifne 11a
      // 0d1: goto 0d8
      // 0d4: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 4
      // 0da: invokevirtual java/io/File.isDirectory ()Z
      // 0dd: goto 0e4
      // 0e0: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: ifne 11a
      // 0e7: new java/io/IOException
      // 0ea: dup
      // 0eb: new java/lang/StringBuilder
      // 0ee: dup
      // 0ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f2: sipush 21827
      // 0f5: sipush 3629
      // 0f8: invokestatic J7.a (II)Ljava/lang/String;
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: aload 4
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 103: sipush 21811
      // 106: sipush 26285
      // 109: invokestatic J7.a (II)Ljava/lang/String;
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 112: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 115: athrow
      // 116: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: new java/io/FileOutputStream
      // 11d: dup
      // 11e: aload 1
      // 11f: iload 2
      // 120: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;Z)V
      // 123: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String J(BigInteger var1) {
      com.ky_4[] var2 = Vk_2.y();

      int var10000;
      label186: {
         label164: {
            try {
               var10000 = var1.divide((BigInteger)com.c.c(374453610808315656L).get(this)).compareTo(BigInteger.ZERO);
               if (var2 == null) {
                  break label186;
               }

               if (var10000 <= 0) {
                  break label164;
               }
            } catch (NullPointerException var18) {
               throw a(var18);
            }

            String var3 = var1.divide((BigInteger)com.c.c(374453610808315656L).get(this)) + a(21874, -10770);

            try {
               if (var2 != null) {
                  return var3;
               }
            } catch (NullPointerException var17) {
               boolean var10001 = false;
               throw a(var17);
            }
         }

         try {
            var10000 = var1.divide((BigInteger)com.c.c(150091135317611780L).get(this)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var16) {
            boolean var24 = false;
            throw a(var16);
         }
      }

      label187: {
         label165: {
            try {
               if (var2 == null) {
                  break label187;
               }

               if (var10000 <= 0) {
                  break label165;
               }
            } catch (NullPointerException var15) {
               throw a(var15);
            }

            String var33 = var1.divide((BigInteger)com.c.c(150091135317611780L).get(this)) + a(21868, -4103);

            try {
               if (var2 != null) {
                  return var33;
               }
            } catch (NullPointerException var14) {
               boolean var25 = false;
               throw a(var14);
            }
         }

         try {
            var10000 = var1.divide((BigInteger)com.c.c(291107217730866810L).get(this)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var13) {
            boolean var26 = false;
            throw a(var13);
         }
      }

      label188: {
         label166: {
            try {
               if (var2 == null) {
                  break label188;
               }

               if (var10000 <= 0) {
                  break label166;
               }
            } catch (NullPointerException var12) {
               throw a(var12);
            }

            String var34 = var1.divide((BigInteger)com.c.c(291107217730866810L).get(this)) + a(21794, 992);

            try {
               if (var2 != null) {
                  return var34;
               }
            } catch (NullPointerException var11) {
               boolean var27 = false;
               throw a(var11);
            }
         }

         try {
            var10000 = var1.divide((BigInteger)com.c.c(495802560720461204L).get(this)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var10) {
            boolean var28 = false;
            throw a(var10);
         }
      }

      label189: {
         label167: {
            try {
               if (var2 == null) {
                  break label189;
               }

               if (var10000 <= 0) {
                  break label167;
               }
            } catch (NullPointerException var9) {
               throw a(var9);
            }

            String var35 = var1.divide((BigInteger)com.c.c(495802560720461204L).get(this)) + a(21845, -6689);

            try {
               if (var2 != null) {
                  return var35;
               }
            } catch (NullPointerException var8) {
               boolean var29 = false;
               throw a(var8);
            }
         }

         try {
            var10000 = var1.divide((BigInteger)com.c.c(343817520107337839L).get(this)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var7) {
            boolean var30 = false;
            throw a(var7);
         }
      }

      label190: {
         label168: {
            try {
               if (var2 == null) {
                  break label190;
               }

               if (var10000 <= 0) {
                  break label168;
               }
            } catch (NullPointerException var6) {
               throw a(var6);
            }

            String var36 = var1.divide((BigInteger)com.c.c(343817520107337839L).get(this)) + a(21855, 5569);

            try {
               if (var2 != null) {
                  return var36;
               }
            } catch (NullPointerException var5) {
               boolean var31 = false;
               throw a(var5);
            }
         }

         try {
            var10000 = var1.divide((BigInteger)com.c.c(483024724664347952L).get(this)).compareTo(BigInteger.ZERO);
         } catch (NullPointerException var4) {
            boolean var32 = false;
            throw a(var4);
         }
      }

      if (var10000 > 0) {
         String var37 = var1.divide((BigInteger)com.c.c(483024724664347952L).get(this)) + a(21862, -24842);
         if (var2 != null) {
            return var37;
         }
      }

      return var1 + a(21836, -24160);
   }

   public String X(long var1) {
      Object[] var10001 = com.c.a(BigInteger.valueOf(var1));
      Method var10003 = com.c.d(491874180315341959L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         return (String)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 41
      // 0c: ifne 3a
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 615606400187031568
      // 1e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 21: dup_x2
      // 22: pop
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: checkcast java/io/FileOutputStream
      // 29: goto 30
      // 2c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual java/io/FileOutputStream.close ()V
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 1
      // 3b: invokestatic java/lang/System.currentTimeMillis ()J
      // 3e: invokevirtual java/io/File.setLastModified (J)Z
      // 41: istore 3
      // 42: iload 3
      // 43: ifne 6c
      // 46: new java/io/IOException
      // 49: dup
      // 4a: new java/lang/StringBuilder
      // 4d: dup
      // 4e: invokespecial java/lang/StringBuilder.<init> ()V
      // 51: sipush 21813
      // 54: sipush 16823
      // 57: invokestatic J7.a (II)Ljava/lang/String;
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: aload 1
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: return
   }

   public File[] o(Collection var1) {
      return var1.toArray(new File[var1.size()]);
   }

   private void d(Collection param1, File param2, IOFileFilter param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: aload 2
      // 04: aload 3
      // 05: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 08: astore 6
      // 0a: astore 5
      // 0c: aload 6
      // 0e: aload 5
      // 10: ifnull 1f
      // 13: ifnull ad
      // 16: goto 1d
      // 19: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 2d: if_icmpge ad
      // 30: aload 7
      // 32: iload 9
      // 34: aaload
      // 35: astore 10
      // 37: aload 10
      // 39: invokevirtual java/io/File.isDirectory ()Z
      // 3c: aload 5
      // 3e: ifnull a4
      // 41: ifeq 95
      // 44: goto 4b
      // 47: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 4
      // 4d: aload 5
      // 4f: ifnull 72
      // 52: goto 59
      // 55: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: ifeq 73
      // 5c: goto 63
      // 5f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 1
      // 64: aload 10
      // 66: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 6b: goto 72
      // 6e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: pop
      // 73: aload 0
      // 74: aload 1
      // 75: aload 10
      // 77: aload 3
      // 78: iload 4
      // 7a: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 7d: ldc2_w 492716143135183590
      // 80: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 83: dup_x2
      // 84: pop
      // 85: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 88: pop
      // 89: goto 90
      // 8c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8f: athrow
      // 90: aload 5
      // 92: ifnonnull a5
      // 95: aload 1
      // 96: aload 10
      // 98: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 9d: goto a4
      // a0: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: pop
      // a5: iinc 9 1
      // a8: aload 5
      // aa: ifnonnull 29
      // ad: return
   }

   public Collection Y(File var1, IOFileFilter var2, IOFileFilter var3) {
      Object[] var10001 = com.c.a(var1, var2);
      Method var10003 = com.c.d(316304120221523271L);
      Object[] var10002 = var10001;
      J7 var16 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var16, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10001 = com.c.a(var2);
      var10003 = com.c.d(197777061342061594L);
      var10002 = var10001;
      J7 var18 = this;
      var10000 = var10003;

      try {
         var12 = (IOFileFilter)var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      IOFileFilter var4 = var12;
      var10001 = com.c.a(var3);
      var10003 = com.c.d(418628711909044211L);
      var10002 = var10001;
      J7 var20 = this;
      var10000 = var10003;

      try {
         var14 = (IOFileFilter)var10000.invoke(var20, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      IOFileFilter var5 = var14;
      LinkedList var6 = new LinkedList();
      var10001 = com.c.a(var6, var1, FileFilterUtils.or(var4, var5), false);
      var10003 = com.c.d(492716143135183590L);
      var10002 = var10001;
      J7 var22 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var22, var10002);
         return var6;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   private void a(File var1, IOFileFilter var2) {
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

   private IOFileFilter f(IOFileFilter var1) {
      return FileFilterUtils.and(var1, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE));
   }

   private IOFileFilter t(IOFileFilter var1) {
      com.ky_4[] var2 = Vk_2.y();

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
      // 03: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 06: ldc2_w 316304120221523271
      // 09: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0c: dup_x2
      // 0d: pop
      // 0e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 11: pop
      // 12: goto 19
      // 15: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 2
      // 1b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e: ldc2_w 197777061342061594
      // 21: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 24: dup_x2
      // 25: pop
      // 26: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 29: checkcast org/apache/commons/io/filefilter/IOFileFilter
      // 2c: goto 33
      // 2f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32: athrow
      // 33: astore 5
      // 35: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 38: aload 0
      // 39: aload 3
      // 3a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3d: ldc2_w 418628711909044211
      // 40: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 43: dup_x2
      // 44: pop
      // 45: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 48: checkcast org/apache/commons/io/filefilter/IOFileFilter
      // 4b: goto 52
      // 4e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 51: athrow
      // 52: astore 6
      // 54: astore 4
      // 56: new java/util/LinkedList
      // 59: dup
      // 5a: invokespecial java/util/LinkedList.<init> ()V
      // 5d: astore 7
      // 5f: aload 4
      // 61: ifnull ae
      // 64: aload 1
      // 65: invokevirtual java/io/File.isDirectory ()Z
      // 68: ifeq 82
      // 6b: goto 72
      // 6e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 7
      // 74: aload 1
      // 75: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 7a: pop
      // 7b: goto 82
      // 7e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 0
      // 83: aload 7
      // 85: aload 1
      // 86: bipush 2
      // 87: anewarray 351
      // 8a: dup
      // 8b: bipush 0
      // 8c: aload 5
      // 8e: aastore
      // 8f: dup
      // 90: bipush 1
      // 91: aload 6
      // 93: aastore
      // 94: invokestatic org/apache/commons/io/filefilter/FileFilterUtils.or ([Lorg/apache/commons/io/filefilter/IOFileFilter;)Lorg/apache/commons/io/filefilter/IOFileFilter;
      // 97: bipush 1
      // 98: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 9b: ldc2_w 492716143135183590
      // 9e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // a1: dup_x2
      // a2: pop
      // a3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // a6: pop
      // a7: goto ae
      // aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ad: athrow
      // ae: aload 7
      // b0: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // b3: ifnull c4
      // b6: bipush 4
      // b7: anewarray 169
      // ba: invokestatic Vk_2.P ([Lcom/ky_4;)V
      // bd: goto c4
      // c0: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: areturn
   }

   public Iterator M(File var1, IOFileFilter var2, IOFileFilter var3) {
      Object[] var10001 = com.c.a(var1, var2, var3);
      Method var10003 = com.c.d(332604683522341613L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var5 = (Collection)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return var5.iterator();
   }

   public Iterator o(File var1, IOFileFilter var2, IOFileFilter var3) {
      Object[] var10001 = com.c.a(var1, var2, var3);
      Method var10003 = com.c.d(460865585641519619L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var5 = (Collection)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return var5.iterator();
   }

   private String[] a(String[] var1) {
      com.ky_4[] var10000 = Vk_2.y();
      String[] var3 = new String[var1.length];
      int var4 = 0;
      com.ky_4[] var2 = var10000;

      while (true) {
         if (var4 < var1.length) {
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
      com.ky_4[] var4 = Vk_2.y();

      Object var5;
      label62: {
         String[] var10000;
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
               } catch (NullPointerException var12) {
                  throw a(var12);
               }

               var5 = TrueFileFilter.INSTANCE;

               try {
                  if (var4 != null) {
                     break label62;
                  }
               } catch (NullPointerException var11) {
                  boolean var10001 = false;
                  throw a(var11);
               }
            }

            try {
               Object[] var18 = com.c.a(var2);
               Method var10003 = com.c.d(538069371577380196L);
               Object[] var10002 = var18;
               J7 var19 = this;
               Method var14 = var10003;

               try {
                  var10000 = (String[])var14.invoke(var19, var10002);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }
            } catch (NullPointerException var10) {
               boolean var17 = false;
               throw a(var10);
            }
         }

         String[] var6 = var10000;
         var5 = new SuffixFileFilter(var6);
      }

      J7 var15;
      File var20;
      Object var23;
      IOFileFilter var25;
      label44: {
         try {
            var15 = this;
            var20 = var1;
            var23 = var5;
            if (var3) {
               var25 = TrueFileFilter.INSTANCE;
               break label44;
            }
         } catch (NullPointerException var9) {
            throw a(var9);
         }

         var25 = FalseFileFilter.INSTANCE;
      }

      Object[] var21 = com.c.a(var20, var23, var25);
      Method var26 = com.c.d(332604683522341613L);
      var23 = var21;
      J7 var22 = var15;
      Method var16 = var26;

      try {
         return (Collection)var16.invoke(var22, (Object[])var23);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public Iterator p(File var1, String[] var2, boolean var3) {
      Object[] var10001 = com.c.a(var1, var2, var3);
      Method var10003 = com.c.d(131995603476880069L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var5 = (Collection)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return var5.iterator();
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
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
      // 01a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: bipush 0
      // 01f: ireturn
      // 020: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: iload 4
      // 026: aload 3
      // 027: ifnull 03e
      // 02a: ifne 03a
      // 02d: goto 034
      // 030: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: bipush 1
      // 035: ireturn
      // 036: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual java/io/File.isDirectory ()Z
      // 03e: aload 3
      // 03f: ifnull 057
      // 042: ifne 065
      // 045: goto 04c
      // 048: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 2
      // 04d: invokevirtual java/io/File.isDirectory ()Z
      // 050: goto 057
      // 053: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: aload 3
      // 058: ifnull 083
      // 05b: ifeq 07a
      // 05e: goto 065
      // 061: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: new java/io/IOException
      // 068: dup
      // 069: sipush 21886
      // 06c: sipush 16973
      // 06f: invokestatic J7.a (II)Ljava/lang/String;
      // 072: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 075: athrow
      // 076: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 08d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: bipush 0
      // 092: ireturn
      // 093: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 0ac: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
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
      // 01c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: iload 5
      // 028: aload 4
      // 02a: ifnull 041
      // 02d: ifne 03d
      // 030: goto 037
      // 033: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: bipush 1
      // 038: ireturn
      // 039: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 1
      // 03e: invokevirtual java/io/File.isDirectory ()Z
      // 041: aload 4
      // 043: ifnull 05b
      // 046: ifne 06a
      // 049: goto 050
      // 04c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 2
      // 051: invokevirtual java/io/File.isDirectory ()Z
      // 054: goto 05b
      // 057: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 4
      // 05d: ifnull 08a
      // 060: ifeq 07f
      // 063: goto 06a
      // 066: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: new java/io/IOException
      // 06d: dup
      // 06e: sipush 21817
      // 071: sipush -32291
      // 074: invokestatic J7.a (II)Ljava/lang/String;
      // 077: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 07a: athrow
      // 07b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 095: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 0b4: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 0e3: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 10f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 7
      // 115: invokevirtual java/io/Reader.close ()V
      // 118: goto 11f
      // 11b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: aload 6
      // 121: aload 4
      // 123: ifnull 132
      // 126: ifnull 135
      // 129: goto 130
      // 12c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 147: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 16e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnull 2d
      // 08: sipush 21826
      // 0b: sipush -18079
      // 0e: invokestatic J7.a (II)Ljava/lang/String;
      // 11: aload 2
      // 12: ifnull 46
      // 15: goto 1c
      // 18: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 20: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 23: ifne 33
      // 26: goto 2d
      // 29: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aconst_null
      // 2e: areturn
      // 2f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual java/net/URL.getFile ()Ljava/lang/String;
      // 37: sipush 11505
      // 3a: ldc2_w 2426654684353707602
      // 3d: invokestatic J7.a (IJ)I
      // 40: getstatic java/io/File.separatorChar C
      // 43: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 46: astore 3
      // 47: aload 0
      // 48: aload 3
      // 49: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4c: ldc2_w 576881140354639569
      // 4f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 52: dup_x2
      // 53: pop
      // 54: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 57: checkcast java/lang/String
      // 5a: goto 61
      // 5d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 60: athrow
      // 61: astore 3
      // 62: new java/io/File
      // 65: dup
      // 66: aload 3
      // 67: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 6a: areturn
   }

   String O(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: aload 1
      // 004: astore 3
      // 005: astore 2
      // 006: aload 1
      // 007: aload 2
      // 008: ifnull 192
      // 00b: ifnull 191
      // 00e: goto 015
      // 011: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 1
      // 016: aload 2
      // 017: ifnull 192
      // 01a: goto 021
      // 01d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: sipush 11917
      // 024: ldc2_w 3055383318256794665
      // 027: invokestatic J7.a (IJ)I
      // 02a: invokevirtual java/lang/String.indexOf (I)I
      // 02d: iflt 191
      // 030: goto 037
      // 033: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 05f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: iload 7
      // 065: invokevirtual java/lang/String.charAt (I)C
      // 068: aload 2
      // 069: ifnull 09f
      // 06c: goto 073
      // 06f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: sipush 3336
      // 076: ldc2_w 1107907955515367343
      // 079: invokestatic J7.a (IJ)I
      // 07c: if_icmpne 178
      // 07f: goto 086
      // 082: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 098: invokestatic J7.a (IJ)I
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
      // 0bc: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: sipush 3336
      // 0c3: ldc2_w 1107907955515367343
      // 0c6: invokestatic J7.a (IJ)I
      // 0c9: if_icmpeq 086
      // 0cc: aload 6
      // 0ce: aload 2
      // 0cf: ifnull 0ff
      // 0d2: invokevirtual java/nio/ByteBuffer.position ()I
      // 0d5: aload 2
      // 0d6: ifnull 0c0
      // 0d9: goto 0e0
      // 0dc: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 114: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 138: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: astore 9
      // 13e: aload 6
      // 140: aload 2
      // 141: ifnull 174
      // 144: invokevirtual java/nio/ByteBuffer.position ()I
      // 147: ifle 175
      // 14a: goto 151
      // 14d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 170: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 14
      // 09: ifnull 23
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: arraylength
      // 15: aload 2
      // 16: ifnull 38
      // 19: ifne 36
      // 1c: goto 23
      // 1f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: ldc2_w 306755196964993345
      // 27: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2a: swap
      // 2b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e: checkcast [Ljava/io/File;
      // 31: areturn
      // 32: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 1
      // 37: arraylength
      // 38: anewarray 149
      // 3b: astore 3
      // 3c: bipush 0
      // 3d: istore 4
      // 3f: iload 4
      // 41: aload 1
      // 42: arraylength
      // 43: if_icmpge c4
      // 46: aload 1
      // 47: iload 4
      // 49: aaload
      // 4a: astore 5
      // 4c: aload 2
      // 4d: ifnull c0
      // 50: aload 5
      // 52: ifnull bd
      // 55: goto 5c
      // 58: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 5
      // 5e: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 61: sipush 21840
      // 64: sipush 9835
      // 67: invokestatic J7.a (II)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6d: ifne 9e
      // 70: goto 77
      // 73: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: new java/lang/IllegalArgumentException
      // 7a: dup
      // 7b: new java/lang/StringBuilder
      // 7e: dup
      // 7f: invokespecial java/lang/StringBuilder.<init> ()V
      // 82: sipush 21849
      // 85: sipush 25835
      // 88: invokestatic J7.a (II)Ljava/lang/String;
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: aload 5
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 96: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 99: athrow
      // 9a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 3
      // 9f: iload 4
      // a1: aload 0
      // a2: aload 5
      // a4: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // a7: ldc2_w 292788731238925935
      // aa: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // ad: dup_x2
      // ae: pop
      // af: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b2: checkcast java/io/File
      // b5: goto bc
      // b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bb: athrow
      // bc: aastore
      // bd: iinc 4 1
      // c0: aload 2
      // c1: ifnonnull 3f
      // c4: aload 3
      // c5: areturn
   }

   public URL[] l(File[] var1) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      URL[] var3 = new URL[var1.length];
      com.ky_4[] var2 = var10000;
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
      Object[] var10001 = com.c.a(var1, var2, true);
      Method var10003 = com.c.d(633380880760312777L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 4
      // 05: aload 2
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/NullPointerException
      // 18: dup
      // 19: sipush 21814
      // 1c: sipush 19208
      // 1f: invokestatic J7.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: aload 4
      // 2d: ifnull 95
      // 30: invokevirtual java/io/File.exists ()Z
      // 33: ifeq 89
      // 36: goto 3d
      // 39: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 2
      // 3e: aload 4
      // 40: ifnull 95
      // 43: goto 4a
      // 46: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: invokevirtual java/io/File.isDirectory ()Z
      // 4d: ifne 89
      // 50: goto 57
      // 53: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: new java/lang/IllegalArgumentException
      // 5a: dup
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 21854
      // 65: sipush -21271
      // 68: invokestatic J7.a (II)Ljava/lang/String;
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: aload 2
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 72: sipush 21869
      // 75: sipush -574
      // 78: invokestatic J7.a (II)Ljava/lang/String;
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 84: athrow
      // 85: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 9c: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 9f: ldc2_w 374593173312356940
      // a2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // a5: dup_x2
      // a6: pop
      // a7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // aa: pop
      // ab: goto b2
      // ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b1: athrow
      // b2: return
   }

   public void D(File var1, File var2) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, true);
      Method var10003 = com.c.d(374593173312356940L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 009: ldc2_w 568032581173433875
      // 00c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00f: dup_x2
      // 010: pop
      // 011: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 014: pop
      // 015: goto 01c
      // 018: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: astore 4
      // 01e: aload 1
      // 01f: invokevirtual java/io/File.isDirectory ()Z
      // 022: aload 4
      // 024: ifnull 07a
      // 027: ifeq 063
      // 02a: goto 031
      // 02d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: new java/io/IOException
      // 034: dup
      // 035: new java/lang/StringBuilder
      // 038: dup
      // 039: invokespecial java/lang/StringBuilder.<init> ()V
      // 03c: sipush 21865
      // 03f: sipush -4101
      // 042: invokestatic J7.a (II)Ljava/lang/String;
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 048: aload 1
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04c: sipush 21781
      // 04f: sipush -7376
      // 052: invokestatic J7.a (II)Ljava/lang/String;
      // 055: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 058: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05b: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 05e: athrow
      // 05f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 1
      // 064: aload 4
      // 066: ifnull 0c3
      // 069: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 06c: aload 2
      // 06d: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 070: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 073: goto 07a
      // 076: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: ifeq 0bf
      // 07d: new java/io/IOException
      // 080: dup
      // 081: new java/lang/StringBuilder
      // 084: dup
      // 085: invokespecial java/lang/StringBuilder.<init> ()V
      // 088: sipush 21865
      // 08b: sipush -4101
      // 08e: invokestatic J7.a (II)Ljava/lang/String;
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: aload 1
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 098: sipush 21783
      // 09b: sipush -20605
      // 09e: invokestatic J7.a (II)Ljava/lang/String;
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: aload 2
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a8: sipush 21884
      // 0ab: sipush -15146
      // 0ae: invokestatic J7.a (II)Ljava/lang/String;
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b7: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0ba: athrow
      // 0bb: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 2
      // 0c0: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0c3: astore 5
      // 0c5: aload 5
      // 0c7: aload 4
      // 0c9: ifnull 159
      // 0cc: ifnull 158
      // 0cf: goto 0d6
      // 0d2: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: aload 5
      // 0d9: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0dc: ldc2_w 323874994732919696
      // 0df: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0e2: dup_x2
      // 0e3: pop
      // 0e4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e7: checkcast java/lang/Boolean
      // 0ea: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ed: goto 0f4
      // 0f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: aload 4
      // 0f6: ifnull 15c
      // 0f9: goto 100
      // 0fc: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: ifne 158
      // 103: goto 10a
      // 106: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 5
      // 10c: invokevirtual java/io/File.isDirectory ()Z
      // 10f: aload 4
      // 111: ifnull 15c
      // 114: goto 11b
      // 117: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: ifne 158
      // 11e: goto 125
      // 121: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: new java/io/IOException
      // 128: dup
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: sipush 21854
      // 133: sipush -21271
      // 136: invokestatic J7.a (II)Ljava/lang/String;
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: aload 5
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 141: sipush 21832
      // 144: sipush -29975
      // 147: invokestatic J7.a (II)Ljava/lang/String;
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 153: athrow
      // 154: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 2
      // 159: invokevirtual java/io/File.exists ()Z
      // 15c: aload 4
      // 15e: ifnull 176
      // 161: ifeq 1ab
      // 164: goto 16b
      // 167: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: aload 2
      // 16c: invokevirtual java/io/File.canWrite ()Z
      // 16f: goto 176
      // 172: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: ifne 1ab
      // 179: new java/io/IOException
      // 17c: dup
      // 17d: new java/lang/StringBuilder
      // 180: dup
      // 181: invokespecial java/lang/StringBuilder.<init> ()V
      // 184: sipush 21854
      // 187: sipush -21271
      // 18a: invokestatic J7.a (II)Ljava/lang/String;
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 2
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 194: sipush 21776
      // 197: sipush -6466
      // 19a: invokestatic J7.a (II)Ljava/lang/String;
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a3: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1a6: athrow
      // 1a7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: aload 2
      // 1ae: iload 3
      // 1af: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 1b2: ldc2_w 360076454015037045
      // 1b5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1b8: dup_x2
      // 1b9: pop
      // 1ba: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1bd: pop
      // 1be: goto 1c5
      // 1c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: return
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

   private void s(File param1, File param2, boolean param3) throws IOException {
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
      // 003: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 006: bipush 0
      // 007: istore 6
      // 009: astore 4
      // 00b: aload 2
      // 00c: invokevirtual java/io/File.exists ()Z
      // 00f: aload 4
      // 011: ifnull 25c
      // 014: ifeq 254
      // 017: goto 01e
      // 01a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aconst_null
      // 01f: astore 7
      // 021: bipush 0
      // 022: istore 8
      // 024: aload 0
      // 025: ldc2_w 230435673101303976
      // 028: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 02b: swap
      // 02c: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02f: aload 4
      // 031: ifnull 058
      // 034: ifeq 050
      // 037: goto 03e
      // 03a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: aload 0
      // 03f: ldc2_w 589909688581199231
      // 042: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 045: swap
      // 046: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 049: istore 8
      // 04b: aload 4
      // 04d: ifnonnull 0fc
      // 050: bipush 0
      // 051: goto 058
      // 054: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: istore 9
      // 05a: aload 0
      // 05b: ldc2_w 415499299058536700
      // 05e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 061: swap
      // 062: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 065: aload 4
      // 067: ifnull 075
      // 06a: ifne 077
      // 06d: goto 074
      // 070: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: bipush 0
      // 075: istore 9
      // 077: new javax/swing/JCheckBox
      // 07a: dup
      // 07b: sipush 21824
      // 07e: sipush 20071
      // 081: invokestatic J7.a (II)Ljava/lang/String;
      // 084: iload 9
      // 086: invokespecial javax/swing/JCheckBox.<init> (Ljava/lang/String;Z)V
      // 089: astore 7
      // 08b: bipush 4
      // 08c: anewarray 4
      // 08f: dup
      // 090: bipush 0
      // 091: sipush 21877
      // 094: sipush -23341
      // 097: invokestatic J7.a (II)Ljava/lang/String;
      // 09a: aastore
      // 09b: dup
      // 09c: bipush 1
      // 09d: sipush 21871
      // 0a0: sipush -26781
      // 0a3: invokestatic J7.a (II)Ljava/lang/String;
      // 0a6: aastore
      // 0a7: dup
      // 0a8: bipush 2
      // 0a9: sipush 21853
      // 0ac: sipush -6093
      // 0af: invokestatic J7.a (II)Ljava/lang/String;
      // 0b2: aastore
      // 0b3: dup
      // 0b4: bipush 3
      // 0b5: aload 7
      // 0b7: aastore
      // 0b8: astore 10
      // 0ba: aload 0
      // 0bb: ldc2_w 370337906235180180
      // 0be: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c1: swap
      // 0c2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast java/awt/Window
      // 0c8: new java/lang/StringBuilder
      // 0cb: dup
      // 0cc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cf: sipush 21858
      // 0d2: sipush 29019
      // 0d5: invokestatic J7.a (II)Ljava/lang/String;
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: aload 2
      // 0dc: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: sipush 21808
      // 0e8: sipush 23779
      // 0eb: invokestatic J7.a (II)Ljava/lang/String;
      // 0ee: bipush 0
      // 0ef: bipush 3
      // 0f0: aconst_null
      // 0f1: aload 10
      // 0f3: aload 10
      // 0f5: bipush 0
      // 0f6: aaload
      // 0f7: invokestatic javax/swing/JOptionPane.showOptionDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
      // 0fa: istore 8
      // 0fc: aload 7
      // 0fe: ifnull 14d
      // 101: iload 8
      // 103: aload 4
      // 105: ifnull 14f
      // 108: goto 10f
      // 10b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: bipush -1
      // 110: if_icmple 14d
      // 113: goto 11a
      // 116: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 7
      // 11d: invokevirtual javax/swing/JCheckBox.isSelected ()Z
      // 120: ldc2_w 230435673101303976
      // 123: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 126: dup_x2
      // 127: pop
      // 128: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 12b: aload 0
      // 12c: iload 8
      // 12e: ldc2_w 589909688581199231
      // 131: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 134: dup_x2
      // 135: pop
      // 136: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 139: aload 0
      // 13a: bipush 1
      // 13b: ldc2_w 415499299058536700
      // 13e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 141: dup_x2
      // 142: pop
      // 143: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 146: goto 14d
      // 149: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: iload 8
      // 14f: aload 4
      // 151: ifnull 16f
      // 154: ifne 166
      // 157: goto 15e
      // 15a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: bipush 1
      // 15f: istore 5
      // 161: aload 4
      // 163: ifnonnull 24f
      // 166: iload 8
      // 168: goto 16f
      // 16b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: bipush 1
      // 170: aload 4
      // 172: ifnull 24a
      // 175: if_icmpne 240
      // 178: goto 17f
      // 17b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: bipush 1
      // 180: istore 9
      // 182: iload 9
      // 184: sipush 32266
      // 187: ldc2_w 6827047560868555951
      // 18a: invokestatic J7.a (IJ)I
      // 18d: if_icmpge 23b
      // 190: new java/lang/StringBuilder
      // 193: dup
      // 194: invokespecial java/lang/StringBuilder.<init> ()V
      // 197: aload 2
      // 198: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: getstatic java/io/File.separator Ljava/lang/String;
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: aload 2
      // 1a5: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1a8: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ab: ldc2_w 247244861321523360
      // 1ae: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1b1: swap
      // 1b2: aconst_null
      // 1b3: swap
      // 1b4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1b7: checkcast java/lang/String
      // 1ba: goto 1c1
      // 1bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c4: ldc_w "_"
      // 1c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ca: iload 9
      // 1cc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1cf: ldc_w "."
      // 1d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d5: aload 2
      // 1d6: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1d9: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1dc: ldc2_w 353935338506646766
      // 1df: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1e2: swap
      // 1e3: aconst_null
      // 1e4: swap
      // 1e5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1e8: checkcast java/lang/String
      // 1eb: goto 1f2
      // 1ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f8: astore 10
      // 1fa: aload 4
      // 1fc: ifnull 236
      // 1ff: new java/io/File
      // 202: dup
      // 203: aload 10
      // 205: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 208: invokevirtual java/io/File.exists ()Z
      // 20b: aload 4
      // 20d: ifnull 262
      // 210: goto 217
      // 213: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 216: athrow
      // 217: ifne 22c
      // 21a: new java/io/File
      // 21d: dup
      // 21e: aload 10
      // 220: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 223: astore 2
      // 224: bipush 1
      // 225: istore 6
      // 227: aload 4
      // 229: ifnonnull 23b
      // 22c: iinc 9 1
      // 22f: goto 236
      // 232: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 235: athrow
      // 236: aload 4
      // 238: ifnonnull 182
      // 23b: aload 4
      // 23d: ifnonnull 24f
      // 240: iload 8
      // 242: bipush 2
      // 243: goto 24a
      // 246: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 249: athrow
      // 24a: if_icmpne 24e
      // 24d: return
      // 24e: return
      // 24f: aload 4
      // 251: ifnonnull 25e
      // 254: bipush 1
      // 255: goto 25c
      // 258: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: istore 6
      // 25e: aload 2
      // 25f: invokevirtual java/io/File.exists ()Z
      // 262: aload 4
      // 264: ifnull 27c
      // 267: ifeq 2b1
      // 26a: goto 271
      // 26d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 270: athrow
      // 271: aload 2
      // 272: invokevirtual java/io/File.isDirectory ()Z
      // 275: goto 27c
      // 278: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: ifeq 2b1
      // 27f: new java/io/IOException
      // 282: dup
      // 283: new java/lang/StringBuilder
      // 286: dup
      // 287: invokespecial java/lang/StringBuilder.<init> ()V
      // 28a: sipush 21854
      // 28d: sipush -21271
      // 290: invokestatic J7.a (II)Ljava/lang/String;
      // 293: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 296: aload 2
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 29a: sipush 21802
      // 29d: sipush -6239
      // 2a0: invokestatic J7.a (II)Ljava/lang/String;
      // 2a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a9: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 2ac: athrow
      // 2ad: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b0: athrow
      // 2b1: new java/io/FileInputStream
      // 2b4: dup
      // 2b5: aload 1
      // 2b6: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 2b9: astore 7
      // 2bb: aload 7
      // 2bd: invokevirtual java/io/FileInputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 2c0: astore 8
      // 2c2: new java/io/FileOutputStream
      // 2c5: dup
      // 2c6: aload 2
      // 2c7: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 2ca: astore 9
      // 2cc: aload 9
      // 2ce: invokevirtual java/io/FileOutputStream.getChannel ()Ljava/nio/channels/FileChannel;
      // 2d1: astore 10
      // 2d3: aload 8
      // 2d5: invokevirtual java/nio/channels/FileChannel.size ()J
      // 2d8: lstore 11
      // 2da: lconst_0
      // 2db: lstore 13
      // 2dd: lconst_0
      // 2de: lstore 15
      // 2e0: lload 13
      // 2e2: lload 11
      // 2e4: lcmp
      // 2e5: ifge 36c
      // 2e8: lload 11
      // 2ea: lload 13
      // 2ec: lsub
      // 2ed: lstore 17
      // 2ef: lload 17
      // 2f1: aload 4
      // 2f3: ifnull 42c
      // 2f6: aload 4
      // 2f8: ifnull 326
      // 2fb: goto 302
      // 2fe: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 301: athrow
      // 302: sipush 16420
      // 305: ldc2_w 4906995396498541745
      // 308: invokestatic J7.b (IJ)J
      // 30b: lcmp
      // 30c: ifle 329
      // 30f: goto 316
      // 312: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 315: athrow
      // 316: sipush 3662
      // 319: ldc2_w 273416712236892881
      // 31c: invokestatic J7.b (IJ)J
      // 31f: goto 326
      // 322: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 325: athrow
      // 326: goto 32b
      // 329: lload 17
      // 32b: lstore 15
      // 32d: aload 10
      // 32f: aload 8
      // 331: lload 13
      // 333: lload 15
      // 335: invokevirtual java/nio/channels/FileChannel.transferFrom (Ljava/nio/channels/ReadableByteChannel;JJ)J
      // 338: lstore 19
      // 33a: lload 19
      // 33c: lconst_0
      // 33d: aload 4
      // 33f: ifnull 364
      // 342: lcmp
      // 343: ifne 359
      // 346: goto 34d
      // 349: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34c: athrow
      // 34d: aload 4
      // 34f: ifnonnull 36c
      // 352: goto 359
      // 355: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 358: athrow
      // 359: lload 13
      // 35b: lload 19
      // 35d: goto 364
      // 360: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 363: athrow
      // 364: ladd
      // 365: lstore 13
      // 367: aload 4
      // 369: ifnonnull 2e0
      // 36c: aload 10
      // 36e: aload 4
      // 370: ifnull 37f
      // 373: ifnull 3ac
      // 376: goto 37d
      // 379: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37c: athrow
      // 37d: aload 10
      // 37f: invokevirtual java/nio/channels/FileChannel.close ()V
      // 382: goto 3ac
      // 385: astore 11
      // 387: aload 10
      // 389: aload 4
      // 38b: ifnull 39a
      // 38e: ifnull 3a9
      // 391: goto 398
      // 394: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 397: athrow
      // 398: aload 10
      // 39a: invokevirtual java/nio/channels/FileChannel.close ()V
      // 39d: goto 3a9
      // 3a0: astore 12
      // 3a2: aload 11
      // 3a4: aload 12
      // 3a6: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 3a9: aload 11
      // 3ab: athrow
      // 3ac: aload 9
      // 3ae: invokevirtual java/io/FileOutputStream.close ()V
      // 3b1: goto 3ca
      // 3b4: astore 10
      // 3b6: aload 9
      // 3b8: invokevirtual java/io/FileOutputStream.close ()V
      // 3bb: goto 3c7
      // 3be: astore 11
      // 3c0: aload 10
      // 3c2: aload 11
      // 3c4: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 3c7: aload 10
      // 3c9: athrow
      // 3ca: aload 8
      // 3cc: aload 4
      // 3ce: ifnull 3dd
      // 3d1: ifnull 40a
      // 3d4: goto 3db
      // 3d7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3da: athrow
      // 3db: aload 8
      // 3dd: invokevirtual java/nio/channels/FileChannel.close ()V
      // 3e0: goto 40a
      // 3e3: astore 9
      // 3e5: aload 8
      // 3e7: aload 4
      // 3e9: ifnull 3f8
      // 3ec: ifnull 407
      // 3ef: goto 3f6
      // 3f2: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f5: athrow
      // 3f6: aload 8
      // 3f8: invokevirtual java/nio/channels/FileChannel.close ()V
      // 3fb: goto 407
      // 3fe: astore 10
      // 400: aload 9
      // 402: aload 10
      // 404: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 407: aload 9
      // 409: athrow
      // 40a: aload 7
      // 40c: invokevirtual java/io/FileInputStream.close ()V
      // 40f: goto 428
      // 412: astore 8
      // 414: aload 7
      // 416: invokevirtual java/io/FileInputStream.close ()V
      // 419: goto 425
      // 41c: astore 9
      // 41e: aload 8
      // 420: aload 9
      // 422: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 425: aload 8
      // 427: athrow
      // 428: aload 1
      // 429: invokevirtual java/io/File.length ()J
      // 42c: lstore 7
      // 42e: aload 2
      // 42f: invokevirtual java/io/File.length ()J
      // 432: lstore 9
      // 434: lload 7
      // 436: lload 9
      // 438: lcmp
      // 439: aload 4
      // 43b: ifnull 4a1
      // 43e: ifeq 4a0
      // 441: goto 448
      // 444: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 447: athrow
      // 448: new java/io/IOException
      // 44b: dup
      // 44c: new java/lang/StringBuilder
      // 44f: dup
      // 450: invokespecial java/lang/StringBuilder.<init> ()V
      // 453: sipush 21810
      // 456: sipush -6006
      // 459: invokestatic J7.a (II)Ljava/lang/String;
      // 45c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45f: aload 1
      // 460: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 463: sipush 21841
      // 466: sipush -10596
      // 469: invokestatic J7.a (II)Ljava/lang/String;
      // 46c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46f: aload 2
      // 470: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 473: sipush 21839
      // 476: sipush 9110
      // 479: invokestatic J7.a (II)Ljava/lang/String;
      // 47c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47f: lload 7
      // 481: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 484: sipush 21812
      // 487: sipush 23452
      // 48a: invokestatic J7.a (II)Ljava/lang/String;
      // 48d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 490: lload 9
      // 492: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 495: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 498: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 49b: athrow
      // 49c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: iload 3
      // 4a1: aload 4
      // 4a3: ifnull 4bf
      // 4a6: ifeq 4c0
      // 4a9: goto 4b0
      // 4ac: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4af: athrow
      // 4b0: aload 2
      // 4b1: aload 1
      // 4b2: invokevirtual java/io/File.lastModified ()J
      // 4b5: invokevirtual java/io/File.setLastModified (J)Z
      // 4b8: goto 4bf
      // 4bb: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4be: athrow
      // 4bf: pop
      // 4c0: aload 0
      // 4c1: ldc2_w 136992684323528157
      // 4c4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4c7: swap
      // 4c8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4cb: checkcast UG
      // 4ce: ifnull 54c
      // 4d1: iload 5
      // 4d3: aload 4
      // 4d5: ifnull 520
      // 4d8: goto 4df
      // 4db: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4de: athrow
      // 4df: ifeq 517
      // 4e2: goto 4e9
      // 4e5: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: aload 0
      // 4ea: ldc2_w 136992684323528157
      // 4ed: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4f0: swap
      // 4f1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4f4: aload 2
      // 4f5: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4f8: ldc2_w 254305348276641042
      // 4fb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4fe: dup_x2
      // 4ff: pop
      // 500: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 503: pop
      // 504: goto 50b
      // 507: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50a: athrow
      // 50b: aload 4
      // 50d: ifnonnull 54c
      // 510: goto 517
      // 513: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 516: athrow
      // 517: iload 6
      // 519: goto 520
      // 51c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51f: athrow
      // 520: ifeq 54c
      // 523: aload 0
      // 524: ldc2_w 136992684323528157
      // 527: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 52a: swap
      // 52b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 52e: aload 2
      // 52f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 532: ldc2_w 551593450223385875
      // 535: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 538: dup_x2
      // 539: pop
      // 53a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 53d: pop
      // 53e: goto 545
      // 541: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 544: athrow
      // 545: goto 54c
      // 548: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54b: athrow
      // 54c: return
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21800
      // 01a: sipush -9616
      // 01d: invokestatic J7.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 1
      // 029: aload 3
      // 02a: ifnull 086
      // 02d: invokevirtual java/io/File.exists ()Z
      // 030: ifeq 085
      // 033: goto 03a
      // 036: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: aload 3
      // 03c: ifnull 086
      // 03f: goto 046
      // 042: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: invokevirtual java/io/File.isDirectory ()Z
      // 049: ifne 085
      // 04c: goto 053
      // 04f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: new java/lang/IllegalArgumentException
      // 056: dup
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: sipush 21878
      // 061: sipush 25936
      // 064: invokestatic J7.a (II)Ljava/lang/String;
      // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06a: aload 2
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 06e: sipush 21857
      // 071: sipush 9180
      // 074: invokestatic J7.a (II)Ljava/lang/String;
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 080: athrow
      // 081: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 2
      // 086: aload 3
      // 087: ifnull 0aa
      // 08a: ifnonnull 0a9
      // 08d: goto 094
      // 090: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: new java/lang/NullPointerException
      // 097: dup
      // 098: sipush 21856
      // 09b: sipush 24535
      // 09e: invokestatic J7.a (II)Ljava/lang/String;
      // 0a1: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 0a4: athrow
      // 0a5: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: invokevirtual java/io/File.exists ()Z
      // 0ad: aload 3
      // 0ae: ifnull 0c6
      // 0b1: ifeq 0fb
      // 0b4: goto 0bb
      // 0b7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 2
      // 0bc: invokevirtual java/io/File.isDirectory ()Z
      // 0bf: goto 0c6
      // 0c2: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: ifne 0fb
      // 0c9: new java/lang/IllegalArgumentException
      // 0cc: dup
      // 0cd: new java/lang/StringBuilder
      // 0d0: dup
      // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d4: sipush 21854
      // 0d7: sipush -21271
      // 0da: invokestatic J7.a (II)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: aload 2
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e4: sipush 21869
      // 0e7: sipush -574
      // 0ea: invokestatic J7.a (II)Ljava/lang/String;
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f3: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0f6: athrow
      // 0f7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 10a: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 10d: ldc2_w 439016544162089963
      // 110: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 113: dup_x2
      // 114: pop
      // 115: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 118: pop
      // 119: goto 120
      // 11c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11f: athrow
      // 120: return
   }

   public void H(File var1, File var2) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, true);
      Method var10003 = com.c.d(439016544162089963L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void z(File var1, File var2, boolean var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, null, var3);
      Method var10003 = com.c.d(563450840600235953L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void C(File var1, File var2, FileFilter var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, true);
      Method var10003 = com.c.d(563450840600235953L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 009: ldc2_w 568032581173433875
      // 00c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00f: dup_x2
      // 010: pop
      // 011: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 014: pop
      // 015: goto 01c
      // 018: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: astore 5
      // 01e: aload 1
      // 01f: invokevirtual java/io/File.isDirectory ()Z
      // 022: aload 5
      // 024: ifnull 06e
      // 027: ifne 063
      // 02a: goto 031
      // 02d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: new java/io/IOException
      // 034: dup
      // 035: new java/lang/StringBuilder
      // 038: dup
      // 039: invokespecial java/lang/StringBuilder.<init> ()V
      // 03c: sipush 21865
      // 03f: sipush -4101
      // 042: invokestatic J7.a (II)Ljava/lang/String;
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 048: aload 1
      // 049: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04c: sipush 21805
      // 04f: sipush -13917
      // 052: invokestatic J7.a (II)Ljava/lang/String;
      // 055: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 058: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05b: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 05e: athrow
      // 05f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 1
      // 064: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 067: aload 2
      // 068: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: ifeq 0b3
      // 071: new java/io/IOException
      // 074: dup
      // 075: new java/lang/StringBuilder
      // 078: dup
      // 079: invokespecial java/lang/StringBuilder.<init> ()V
      // 07c: sipush 21865
      // 07f: sipush -4101
      // 082: invokestatic J7.a (II)Ljava/lang/String;
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: aload 1
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08c: sipush 21816
      // 08f: sipush -14712
      // 092: invokestatic J7.a (II)Ljava/lang/String;
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: aload 2
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09c: sipush 21834
      // 09f: sipush -19824
      // 0a2: invokestatic J7.a (II)Ljava/lang/String;
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ab: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0ae: athrow
      // 0af: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: aconst_null
      // 0b4: astore 6
      // 0b6: aload 2
      // 0b7: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 0ba: aload 1
      // 0bb: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 0be: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0c1: ifeq 14e
      // 0c4: aload 3
      // 0c5: ifnonnull 0da
      // 0c8: goto 0cf
      // 0cb: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 0d3: goto 0df
      // 0d6: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 1
      // 0db: aload 3
      // 0dc: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 0df: astore 7
      // 0e1: aload 7
      // 0e3: aload 5
      // 0e5: ifnull 0f4
      // 0e8: ifnull 14e
      // 0eb: goto 0f2
      // 0ee: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: aload 7
      // 0f4: arraylength
      // 0f5: ifle 14e
      // 0f8: new java/util/ArrayList
      // 0fb: dup
      // 0fc: aload 7
      // 0fe: arraylength
      // 0ff: invokespecial java/util/ArrayList.<init> (I)V
      // 102: astore 6
      // 104: aload 7
      // 106: astore 8
      // 108: aload 8
      // 10a: arraylength
      // 10b: istore 9
      // 10d: bipush 0
      // 10e: istore 10
      // 110: iload 10
      // 112: iload 9
      // 114: if_icmpge 14e
      // 117: aload 8
      // 119: iload 10
      // 11b: aaload
      // 11c: astore 11
      // 11e: new java/io/File
      // 121: dup
      // 122: aload 2
      // 123: aload 11
      // 125: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 128: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 12b: astore 12
      // 12d: aload 6
      // 12f: aload 12
      // 131: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 134: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 139: pop
      // 13a: iinc 10 1
      // 13d: aload 5
      // 13f: ifnull 16c
      // 142: aload 5
      // 144: ifnonnull 110
      // 147: goto 14e
      // 14a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 0
      // 14f: aload 1
      // 150: aload 2
      // 151: aload 3
      // 152: iload 4
      // 154: aload 6
      // 156: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)[Ljava/lang/Object;
      // 159: ldc2_w 549954396057145592
      // 15c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 15f: dup_x2
      // 160: pop
      // 161: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 164: pop
      // 165: goto 16c
      // 168: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: return
   }

   private void P(File param1, File param2) throws FileNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21825
      // 1a: sipush 25410
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: aload 3
      // 2a: ifnull 4d
      // 2d: ifnonnull 4c
      // 30: goto 37
      // 33: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: new java/lang/NullPointerException
      // 3a: dup
      // 3b: sipush 21814
      // 3e: sipush 19208
      // 41: invokestatic J7.a (II)Ljava/lang/String;
      // 44: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 47: athrow
      // 48: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 64: invokestatic J7.a (II)Ljava/lang/String;
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: aload 1
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6e: sipush 21863
      // 71: sipush -24367
      // 74: invokestatic J7.a (II)Ljava/lang/String;
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 80: athrow
      // 81: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: return
   }

   private void j(File param1, File param2, FileFilter param3, boolean param4, List param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 6
      // 005: aload 3
      // 006: ifnonnull 014
      // 009: aload 1
      // 00a: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 00d: goto 019
      // 010: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 031: invokestatic J7.a (II)Ljava/lang/String;
      // 034: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 037: aload 1
      // 038: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 03b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 041: athrow
      // 042: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 2
      // 047: invokevirtual java/io/File.exists ()Z
      // 04a: aload 6
      // 04c: ifnull 0c2
      // 04f: ifeq 0a5
      // 052: goto 059
      // 055: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 2
      // 05a: invokevirtual java/io/File.isDirectory ()Z
      // 05d: aload 6
      // 05f: ifnull 121
      // 062: goto 069
      // 065: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: ifne 11d
      // 06c: goto 073
      // 06f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: new java/io/IOException
      // 076: dup
      // 077: new java/lang/StringBuilder
      // 07a: dup
      // 07b: invokespecial java/lang/StringBuilder.<init> ()V
      // 07e: sipush 21821
      // 081: sipush 23826
      // 084: invokestatic J7.a (II)Ljava/lang/String;
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: aload 2
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08e: sipush 21799
      // 091: sipush 14225
      // 094: invokestatic J7.a (II)Ljava/lang/String;
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0a0: athrow
      // 0a1: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0aa: ldc2_w 323874994732919696
      // 0ad: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b5: checkcast java/lang/Boolean
      // 0b8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0bb: goto 0c2
      // 0be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: ifnull 121
      // 0c7: ifne 11d
      // 0ca: goto 0d1
      // 0cd: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 2
      // 0d2: invokevirtual java/io/File.isDirectory ()Z
      // 0d5: aload 6
      // 0d7: ifnull 121
      // 0da: goto 0e1
      // 0dd: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: ifne 11d
      // 0e4: goto 0eb
      // 0e7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: new java/io/IOException
      // 0ee: dup
      // 0ef: new java/lang/StringBuilder
      // 0f2: dup
      // 0f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f6: sipush 21854
      // 0f9: sipush -21271
      // 0fc: invokestatic J7.a (II)Ljava/lang/String;
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: aload 2
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 106: sipush 21823
      // 109: sipush -3323
      // 10c: invokestatic J7.a (II)Ljava/lang/String;
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 115: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 118: athrow
      // 119: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 2
      // 11e: invokevirtual java/io/File.canWrite ()Z
      // 121: ifne 156
      // 124: new java/io/IOException
      // 127: dup
      // 128: new java/lang/StringBuilder
      // 12b: dup
      // 12c: invokespecial java/lang/StringBuilder.<init> ()V
      // 12f: sipush 21854
      // 132: sipush -21271
      // 135: invokestatic J7.a (II)Ljava/lang/String;
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: aload 2
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13f: sipush 21831
      // 142: sipush -7276
      // 145: invokestatic J7.a (II)Ljava/lang/String;
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 151: athrow
      // 152: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: aload 7
      // 158: astore 8
      // 15a: aload 8
      // 15c: arraylength
      // 15d: istore 9
      // 15f: bipush 0
      // 160: istore 10
      // 162: iload 10
      // 164: iload 9
      // 166: if_icmpge 21e
      // 169: aload 8
      // 16b: iload 10
      // 16d: aaload
      // 16e: astore 11
      // 170: new java/io/File
      // 173: dup
      // 174: aload 2
      // 175: aload 11
      // 177: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 17a: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 17d: astore 12
      // 17f: aload 6
      // 181: ifnull 23f
      // 184: aload 5
      // 186: aload 6
      // 188: ifnull 19e
      // 18b: goto 192
      // 18e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: ifnull 1b7
      // 195: goto 19c
      // 198: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 5
      // 19e: aload 11
      // 1a0: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 1a3: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1a8: aload 6
      // 1aa: ifnull 1c3
      // 1ad: ifne 216
      // 1b0: goto 1b7
      // 1b3: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 11
      // 1b9: invokevirtual java/io/File.isDirectory ()Z
      // 1bc: goto 1c3
      // 1bf: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: ifeq 1f2
      // 1c6: aload 0
      // 1c7: aload 11
      // 1c9: aload 12
      // 1cb: aload 3
      // 1cc: iload 4
      // 1ce: aload 5
      // 1d0: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)[Ljava/lang/Object;
      // 1d3: ldc2_w 549954396057145592
      // 1d6: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d9: dup_x2
      // 1da: pop
      // 1db: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1de: pop
      // 1df: goto 1e6
      // 1e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: aload 6
      // 1e8: ifnonnull 216
      // 1eb: goto 1f2
      // 1ee: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: aload 11
      // 1f5: aload 12
      // 1f7: iload 4
      // 1f9: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 1fc: ldc2_w 360076454015037045
      // 1ff: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 202: dup_x2
      // 203: pop
      // 204: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 207: pop
      // 208: goto 20f
      // 20b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20e: athrow
      // 20f: goto 216
      // 212: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 215: athrow
      // 216: iinc 10 1
      // 219: aload 6
      // 21b: ifnonnull 162
      // 21e: iload 4
      // 220: aload 6
      // 222: ifnull 23e
      // 225: ifeq 23f
      // 228: goto 22f
      // 22b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: aload 2
      // 230: aload 1
      // 231: invokevirtual java/io/File.lastModified ()J
      // 234: invokevirtual java/io/File.setLastModified (J)Z
      // 237: goto 23e
      // 23a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: pop
      // 23f: return
   }

   public void u(URL var1, File var2) throws IOException {
      Object[] var10001 = com.c.a(var1.openStream(), var2);
      Method var10003 = com.c.d(228463439819980284L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void I(URL var1, File var2, int var3, int var4) throws IOException {
      URLConnection var5 = var1.openConnection();
      var5.setConnectTimeout(var3);
      var5.setReadTimeout(var4);
      Object[] var10001 = com.c.a(var5.getInputStream(), var2);
      Method var10003 = com.c.d(228463439819980284L);
      Object[] var10002 = var10001;
      J7 var7 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void u(InputStream var1, File var2) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      InputStream var4 = var1;
      com.ky_4[] var3 = var10000;

      try {
         Object[] var17 = com.c.a(var4, var2);
         Method var10003 = com.c.d(483089660862615658L);
         Object[] var10002 = var17;
         J7 var18 = this;
         Method var14 = var10003;

         try {
            var14.invoke(var18, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } catch (Throwable var11) {
         label44: {
            label43: {
               try {
                  var12 = var4;
                  if (var3 == null) {
                     break label43;
                  }

                  if (var4 == null) {
                     throw var11;
                  }
               } catch (Throwable var10) {
                  throw a(var10);
               }

               try {
                  var12 = var4;
               } catch (Throwable var9) {
                  var13 = var9;
                  boolean var10001 = false;
                  break label44;
               }
            }

            try {
               var12.close();
               throw var11;
            } catch (Throwable var8) {
               var13 = var8;
               boolean var16 = false;
            }
         }

         Throwable var6 = var13;
         var11.addSuppressed(var6);
         throw var11;
      }

      InputStream var15 = var1;
      if (var3 != null) {
         if (var1 == null) {
            return;
         }

         var15 = var1;
      }

      var15.close();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void A(InputStream var1, File var2) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      InputStream var4 = var1;
      com.ky_4[] var3 = var10000;

      label107: {
         try {
            Object[] var26 = com.c.a(var2);
            Method var10003 = com.c.d(615606400187031568L);
            Object[] var10002 = var26;
            J7 var27 = this;
            Method var20 = var10003;

            try {
               var21 = (FileOutputStream)var20.invoke(var27, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            FileOutputStream var5 = var21;

            try {
               var24 = var4;
               if (var3 == null) {
                  break label107;
               }

               IOUtils.copy(var4, var5);
            } catch (Throwable var16) {
               label84: {
                  label83: {
                     try {
                        var22 = var5;
                        if (var3 == null) {
                           break label83;
                        }

                        if (var5 == null) {
                           throw var16;
                        }
                     } catch (Throwable var14) {
                        throw a(var14);
                     }

                     try {
                        var22 = var5;
                     } catch (Throwable var13) {
                        var23 = var13;
                        boolean var28 = false;
                        break label84;
                     }
                  }

                  try {
                     var22.close();
                     throw var16;
                  } catch (Throwable var12) {
                     var23 = var12;
                     boolean var29 = false;
                  }
               }

               Throwable var7 = var23;
               var16.addSuppressed(var7);
               throw var16;
            }

            if (var5 != null) {
               var5.close();
            }
         } catch (Throwable var17) {
            label69: {
               label68: {
                  try {
                     var18 = var4;
                     if (var3 == null) {
                        break label68;
                     }

                     if (var4 == null) {
                        throw var17;
                     }
                  } catch (Throwable var11) {
                     throw a(var11);
                  }

                  try {
                     var18 = var4;
                  } catch (Throwable var10) {
                     var19 = var10;
                     boolean var10001 = false;
                     break label69;
                  }
               }

               try {
                  var18.close();
                  throw var17;
               } catch (Throwable var9) {
                  var19 = var9;
                  boolean var25 = false;
               }
            }

            Throwable var6 = var19;
            var17.addSuppressed(var6);
            throw var17;
         }

         var24 = var1;
      }

      label94: {
         try {
            if (var3 == null) {
               break label94;
            }

            if (var24 == null) {
               return;
            }
         } catch (Throwable var15) {
            throw a(var15);
         }

         var24 = var1;
      }

      var24.close();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21825
      // 1a: sipush 25410
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual java/io/File.isFile ()Z
      // 2c: aload 3
      // 2d: ifnull 69
      // 30: ifeq 5e
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 40: ldc2_w 476303959091785058
      // 43: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 46: dup_x2
      // 47: pop
      // 48: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b: pop
      // 4c: goto 53
      // 4f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 3
      // 54: ifnonnull c2
      // 57: goto 5e
      // 5a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 1
      // 5f: invokevirtual java/io/File.isDirectory ()Z
      // 62: goto 69
      // 65: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: ifeq 90
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 72: ldc2_w 395780898209924483
      // 75: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 78: dup_x2
      // 79: pop
      // 7a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 7d: pop
      // 7e: goto 85
      // 81: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 3
      // 86: ifnonnull c2
      // 89: goto 90
      // 8c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: new java/io/IOException
      // 93: dup
      // 94: new java/lang/StringBuilder
      // 97: dup
      // 98: invokespecial java/lang/StringBuilder.<init> ()V
      // 9b: sipush 21796
      // 9e: sipush 31709
      // a1: invokestatic J7.a (II)Ljava/lang/String;
      // a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a7: aload 1
      // a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ab: sipush 21838
      // ae: sipush 4536
      // b1: invokestatic J7.a (II)Ljava/lang/String;
      // b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ba: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // bd: athrow
      // be: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c1: athrow
      // c2: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21801
      // 1a: sipush 27211
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2e: astore 4
      // 30: aload 4
      // 32: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37: ifeq 64
      // 3a: aload 4
      // 3c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41: checkcast java/io/File
      // 44: astore 5
      // 46: aload 0
      // 47: aload 5
      // 49: aload 2
      // 4a: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d: ldc2_w 476303959091785058
      // 50: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 53: dup_x2
      // 54: pop
      // 55: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 58: pop
      // 59: goto 60
      // 5c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 3
      // 61: ifnonnull 30
      // 64: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 34
      // 0c: ifne 17
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: return
      // 17: aload 0
      // 18: aload 1
      // 19: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1c: ldc2_w 445181380587021203
      // 1f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 22: dup_x2
      // 23: pop
      // 24: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 27: checkcast java/lang/Boolean
      // 2a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d: goto 34
      // 30: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 2
      // 35: ifnull 65
      // 38: ifne 61
      // 3b: goto 42
      // 3e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 47: ldc2_w 186329734048458518
      // 4a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 52: pop
      // 53: goto 5a
      // 56: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59: athrow
      // 5a: goto 61
      // 5d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 1
      // 62: invokevirtual java/io/File.delete ()Z
      // 65: ifne 92
      // 68: new java/lang/StringBuilder
      // 6b: dup
      // 6c: invokespecial java/lang/StringBuilder.<init> ()V
      // 6f: sipush 21822
      // 72: sipush -16830
      // 75: invokestatic J7.a (II)Ljava/lang/String;
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: aload 1
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7f: ldc_w "."
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 88: astore 3
      // 89: new java/io/IOException
      // 8c: dup
      // 8d: aload 3
      // 8e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 91: athrow
      // 92: return
   }

   public boolean Q(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual java/io/File.isDirectory ()Z
      // 1d: ifeq 3f
      // 20: aload 0
      // 21: aload 1
      // 22: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 25: ldc2_w 186329734048458518
      // 28: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2b: dup_x2
      // 2c: pop
      // 2d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 30: pop
      // 31: goto 38
      // 34: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37: athrow
      // 38: goto 3f
      // 3b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: goto 43
      // 42: astore 3
      // 43: aload 1
      // 44: invokevirtual java/io/File.delete ()Z
      // 47: ireturn
      // 48: astore 3
      // 49: bipush 0
      // 4a: ireturn
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 1
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21873
      // 1a: sipush 13699
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: aload 3
      // 2a: ifnull 61
      // 2d: invokevirtual java/io/File.isDirectory ()Z
      // 30: ifne 60
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21780
      // 48: sipush -1347
      // 4b: invokestatic J7.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 1
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 5b: athrow
      // 5c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 2
      // 61: aload 3
      // 62: ifnull 76
      // 65: ifnonnull 75
      // 68: goto 6f
      // 6b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: bipush 0
      // 70: ireturn
      // 71: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 1
      // 76: invokevirtual java/io/File.exists ()Z
      // 79: aload 3
      // 7a: ifnull a8
      // 7d: ifeq a0
      // 80: goto 87
      // 83: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 2
      // 88: aload 3
      // 89: ifnull aa
      // 8c: goto 93
      // 8f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: invokevirtual java/io/File.exists ()Z
      // 96: ifne a9
      // 99: goto a0
      // 9c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: bipush 0
      // a1: goto a8
      // a4: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(417012132292310060L);
      Object[] var10002 = var10001;
      J7 var18 = this;
      Method var10000 = var10003;

      try {
         var15 = (File[])var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      File[] var3 = var15;
      com.ky_4[] var16 = Vk_2.y();
      IOException var4 = null;
      File[] var5 = var3;
      com.ky_4[] var2 = var16;
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
                        var10001 = com.c.a(var8);
                        var10003 = com.c.d(583004256134799533L);
                        var10002 = var10001;
                        J7 var20 = this;
                        var10000 = var10003;

                        try {
                           var10000.invoke(var20, var10002);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }
                     } catch (IOException var13) {
                        var9 = var13;
                        break label44;
                     }

                     if (var2 == null) {
                        break;
                     }
                     break label46;
                  }
               } catch (NullPointerException var14) {
                  throw a(var14);
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
         } catch (IOException var10) {
            throw a(var10);
         }
      }
   }

   private File[] i(File param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 49
      // 0c: ifne 3a
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/StringBuilder
      // 19: dup
      // 1a: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d: aload 1
      // 1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 21: sipush 21838
      // 24: sipush 4536
      // 27: invokestatic J7.a (II)Ljava/lang/String;
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
      // 45: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: ifne 70
      // 4c: new java/lang/StringBuilder
      // 4f: dup
      // 50: invokespecial java/lang/StringBuilder.<init> ()V
      // 53: aload 1
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 57: sipush 21779
      // 5a: sipush 6459
      // 5d: invokestatic J7.a (II)Ljava/lang/String;
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
      // 80: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: new java/io/IOException
      // 87: dup
      // 88: new java/lang/StringBuilder
      // 8b: dup
      // 8c: invokespecial java/lang/StringBuilder.<init> ()V
      // 8f: sipush 21837
      // 92: sipush -29076
      // 95: invokestatic J7.a (II)Ljava/lang/String;
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: aload 1
      // 9c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 9f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // a5: athrow
      // a6: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: iload 2
      // 07: i2l
      // 08: sipush 19641
      // 0b: ldc2_w 7054982995800670244
      // 0e: invokestatic J7.b (IJ)J
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
      // 37: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: ifge 68
      // 3e: goto 45
      // 41: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 0
      // 46: istore 9
      // 48: iload 6
      // 4a: aload 3
      // 4b: ifnull 67
      // 4e: ifeq 65
      // 51: goto 58
      // 54: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 5b: invokevirtual java/lang/Thread.interrupt ()V
      // 5e: goto 65
      // 61: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: iload 9
      // 67: ireturn
      // 68: sipush 10003
      // 6b: ldc2_w 2712449435966843786
      // 6e: invokestatic J7.b (IJ)J
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
      // 91: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: iload 6
      // 97: aload 3
      // 98: ifnull ca
      // 9b: ifeq c9
      // 9e: goto a5
      // a1: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // a8: invokevirtual java/lang/Thread.interrupt ()V
      // ab: goto c9
      // ae: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: astore 10
      // b4: iload 6
      // b6: ifeq c6
      // b9: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // bc: invokevirtual java/lang/Thread.interrupt ()V
      // bf: goto c6
      // c2: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 10
      // c8: athrow
      // c9: bipush 1
      // ca: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String c(File var1, Charset var2) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(630481829109737701L);
      Object[] var10003 = var10002;
      J7 var19 = this;
      Method var10001 = var10004;

      try {
         var16 = (FileInputStream)var10001.invoke(var19, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      FileInputStream var4 = var16;
      com.ky_4[] var3 = var10000;

      String var5;
      try {
         var5 = IOUtils.toString(var4, Charsets.toCharset(var2));
      } catch (Throwable var11) {
         label49: {
            label48: {
               try {
                  var13 = var4;
                  if (var3 == null) {
                     break label48;
                  }

                  if (var4 == null) {
                     throw var11;
                  }
               } catch (Throwable var10) {
                  throw a(var10);
               }

               try {
                  var13 = var4;
               } catch (Throwable var9) {
                  var14 = var9;
                  boolean var17 = false;
                  break label49;
               }
            }

            try {
               var13.close();
               throw var11;
            } catch (Throwable var8) {
               var14 = var8;
               boolean var18 = false;
            }
         }

         Throwable var6 = var14;
         var11.addSuppressed(var6);
         throw var11;
      }

      label61: {
         try {
            var15 = var4;
            if (var3 == null) {
               break label61;
            }

            if (var4 == null) {
               return var5;
            }
         } catch (Throwable var12) {
            throw a(var12);
         }

         var15 = var4;
      }

      var15.close();
      return var5;
   }

   public String Q(File var1, String var2) throws IOException {
      Object[] var10001 = com.c.a(var1, Charsets.toCharset(var2));
      Method var10003 = com.c.d(240901810350722735L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         return (String)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Deprecated
   public String t(File var1) throws IOException {
      Object[] var10001 = com.c.a(var1, Charset.defaultCharset());
      Method var10003 = com.c.d(240901810350722735L);
      Object[] var10002 = var10001;
      J7 var3 = this;
      Method var10000 = var10003;

      try {
         return (String)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public byte[] K(File var1) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(630481829109737701L);
      Object[] var10003 = var10002;
      J7 var21 = this;
      Method var10001 = var10004;

      try {
         var18 = (FileInputStream)var10001.invoke(var21, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      FileInputStream var3 = var18;
      com.ky_4[] var2 = var10000;

      byte[] var6;
      try {
         long var4 = var1.length();

         label74: {
            try {
               if (var4 > 0L) {
                  var16 = IOUtils.toByteArray(var3, var4);
                  break label74;
               }
            } catch (Throwable var12) {
               throw a(var12);
            }

            var16 = IOUtils.toByteArray(var3);
         }

         var6 = var16;
      } catch (Throwable var13) {
         label55: {
            label54: {
               try {
                  var14 = var3;
                  if (var2 == null) {
                     break label54;
                  }

                  if (var3 == null) {
                     throw var13;
                  }
               } catch (Throwable var10) {
                  throw a(var10);
               }

               try {
                  var14 = var3;
               } catch (Throwable var9) {
                  var15 = var9;
                  boolean var19 = false;
                  break label55;
               }
            }

            try {
               var14.close();
               throw var13;
            } catch (Throwable var8) {
               var15 = var8;
               boolean var20 = false;
            }
         }

         Throwable var5 = var15;
         var13.addSuppressed(var5);
         throw var13;
      }

      label65: {
         try {
            var17 = var3;
            if (var2 == null) {
               break label65;
            }

            if (var3 == null) {
               return var6;
            }
         } catch (Throwable var11) {
            throw a(var11);
         }

         var17 = var3;
      }

      var17.close();
      return var6;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public List f(File var1, Charset var2) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(630481829109737701L);
      Object[] var10003 = var10002;
      J7 var19 = this;
      Method var10001 = var10004;

      try {
         var16 = (FileInputStream)var10001.invoke(var19, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      FileInputStream var4 = var16;
      com.ky_4[] var3 = var10000;

      List var5;
      try {
         var5 = IOUtils.readLines(var4, Charsets.toCharset(var2));
      } catch (Throwable var11) {
         label49: {
            label48: {
               try {
                  var13 = var4;
                  if (var3 == null) {
                     break label48;
                  }

                  if (var4 == null) {
                     throw var11;
                  }
               } catch (Throwable var10) {
                  throw a(var10);
               }

               try {
                  var13 = var4;
               } catch (Throwable var9) {
                  var14 = var9;
                  boolean var17 = false;
                  break label49;
               }
            }

            try {
               var13.close();
               throw var11;
            } catch (Throwable var8) {
               var14 = var8;
               boolean var18 = false;
            }
         }

         Throwable var6 = var14;
         var11.addSuppressed(var6);
         throw var11;
      }

      label61: {
         try {
            var15 = var4;
            if (var3 == null) {
               break label61;
            }

            if (var4 == null) {
               return var5;
            }
         } catch (Throwable var12) {
            throw a(var12);
         }

         var15 = var4;
      }

      var15.close();
      return var5;
   }

   public List Y(File var1, String var2) throws IOException {
      Object[] var10001 = com.c.a(var1, Charsets.toCharset(var2));
      Method var10003 = com.c.d(230271745396018754L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         return (List)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Deprecated
   public List K$List(File var1) throws IOException {
      Object[] var10001 = com.c.a(var1, Charset.defaultCharset());
      Method var10003 = com.c.d(230271745396018754L);
      Object[] var10002 = var10001;
      J7 var3 = this;
      Method var10000 = var10003;

      try {
         return (List)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public LineIterator p(File var1, String var2) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      FileInputStream var4 = null;
      com.ky_4[] var3 = var10000;

      try {
         Object[] var10001 = com.c.a(var1);
         Method var10003 = com.c.d(630481829109737701L);
         Object[] var10002 = var10001;
         J7 var14 = this;
         Method var12 = var10003;

         try {
            var13 = (FileInputStream)var12.invoke(var14, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var4 = var13;
         return IOUtils.lineIterator(var4, var2);
      } catch (RuntimeException | IOException var10) {
         try {
            label35: {
               try {
                  var11 = var4;
                  if (var3 == null) {
                     break label35;
                  }

                  if (var4 == null) {
                     throw var10;
                  }
               } catch (IOException var8) {
                  throw a(var8);
               }

               var11 = var4;
            }

            var11.close();
         } catch (IOException var9) {
            var10.addSuppressed(var9);
         }

         throw var10;
      }
   }

   public LineIterator h(File var1) throws IOException {
      Object[] var10001 = com.c.a(var1, null);
      Method var10003 = com.c.d(204519571075360529L);
      Object[] var10002 = var10001;
      J7 var3 = this;
      Method var10000 = var10003;

      try {
         return (LineIterator)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void Z(File var1, String var2, Charset var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, false);
      Method var10003 = com.c.d(158010215926209792L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void Q(File var1, String var2, String var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, false);
      Method var10003 = com.c.d(287050696876581679L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void f(File var1, String var2, Charset var3, boolean var4) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      Object[] var10002 = com.c.a(var1, var4);
      Method var10004 = com.c.d(286016544931944572L);
      Object[] var10003 = var10002;
      J7 var20 = this;
      Method var10001 = var10004;

      try {
         var17 = (FileOutputStream)var10001.invoke(var20, var10003);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      FileOutputStream var6 = var17;
      com.ky_4[] var5 = var10000;

      try {
         IOUtils.write(var2, var6, var3);
      } catch (Throwable var13) {
         label46: {
            label45: {
               try {
                  var14 = var6;
                  if (var5 == null) {
                     break label45;
                  }

                  if (var6 == null) {
                     throw var13;
                  }
               } catch (Throwable var12) {
                  throw a(var12);
               }

               try {
                  var14 = var6;
               } catch (Throwable var11) {
                  var15 = var11;
                  boolean var18 = false;
                  break label46;
               }
            }

            try {
               var14.close();
               throw var13;
            } catch (Throwable var10) {
               var15 = var10;
               boolean var19 = false;
            }
         }

         Throwable var8 = var15;
         var13.addSuppressed(var8);
         throw var13;
      }

      FileOutputStream var16 = var6;
      if (var5 != null) {
         if (var6 == null) {
            return;
         }

         var16 = var6;
      }

      var16.close();
   }

   public void X(File var1, String var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charsets.toCharset(var3), var4);
      Method var10003 = com.c.d(158010215926209792L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Deprecated
   public void o(File var1, String var2) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charset.defaultCharset(), false);
      Method var10003 = com.c.d(158010215926209792L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Deprecated
   public void U(File var1, String var2, boolean var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charset.defaultCharset(), var3);
      Method var10003 = com.c.d(158010215926209792L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Deprecated
   public void K(File var1, CharSequence var2) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charset.defaultCharset(), false);
      Method var10003 = com.c.d(469073223414406336L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Deprecated
   public void r(File var1, CharSequence var2, boolean var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charset.defaultCharset(), var3);
      Method var10003 = com.c.d(469073223414406336L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void e(File var1, CharSequence var2, Charset var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, false);
      Method var10003 = com.c.d(469073223414406336L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void f(File var1, CharSequence var2, String var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, false);
      Method var10003 = com.c.d(202305187229101536L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 5
      // 05: aload 2
      // 06: aload 5
      // 08: ifnull 1e
      // 0b: ifnonnull 1d
      // 0e: goto 15
      // 11: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aconst_null
      // 16: goto 23
      // 19: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 2
      // 1e: invokeinterface java/lang/CharSequence.toString ()Ljava/lang/String; 1
      // 23: astore 6
      // 25: aload 0
      // 26: aload 1
      // 27: aload 6
      // 29: aload 3
      // 2a: iload 4
      // 2c: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 2f: ldc2_w 158010215926209792
      // 32: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 35: dup_x2
      // 36: pop
      // 37: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3a: pop
      // 3b: goto 42
      // 3e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 41: athrow
      // 42: return
   }

   public void B(File var1, CharSequence var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, Charsets.toCharset(var3), var4);
      Method var10003 = com.c.d(469073223414406336L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void B(File var1, byte[] var2) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, false);
      Method var10003 = com.c.d(630759356597215286L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void L(File var1, byte[] var2, boolean var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, 0, var2.length, var3);
      Method var10003 = com.c.d(419982512059814671L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void G(File var1, byte[] var2, int var3, int var4) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, var4, false);
      Method var10003 = com.c.d(419982512059814671L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(File var1, byte[] var2, int var3, int var4, boolean var5) throws IOException {
      com.ky_4[] var10000 = Vk_2.y();
      Object[] var10002 = com.c.a(var1, var5);
      Method var10004 = com.c.d(286016544931944572L);
      Object[] var10003 = var10002;
      J7 var21 = this;
      Method var10001 = var10004;

      try {
         var18 = (FileOutputStream)var10001.invoke(var21, var10003);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      FileOutputStream var7 = var18;
      com.ky_4[] var6 = var10000;

      try {
         var7.write(var2, var3, var4);
      } catch (Throwable var14) {
         label46: {
            label45: {
               try {
                  var15 = var7;
                  if (var6 == null) {
                     break label45;
                  }

                  if (var7 == null) {
                     throw var14;
                  }
               } catch (Throwable var13) {
                  throw a(var13);
               }

               try {
                  var15 = var7;
               } catch (Throwable var12) {
                  var16 = var12;
                  boolean var19 = false;
                  break label46;
               }
            }

            try {
               var15.close();
               throw var14;
            } catch (Throwable var11) {
               var16 = var11;
               boolean var20 = false;
            }
         }

         Throwable var9 = var16;
         var14.addSuppressed(var9);
         throw var14;
      }

      FileOutputStream var17 = var7;
      if (var6 != null) {
         if (var7 == null) {
            return;
         }

         var17 = var7;
      }

      var17.close();
   }

   public void M(File var1, String var2, Collection var3) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, null, false);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void O(File var1, String var2, Collection var3, boolean var4) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, null, var4);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void y(File var1, Collection var2) throws IOException {
      Object[] var10001 = com.c.a(var1, null, var2, null, false);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void R(File var1, Collection var2, boolean var3) throws IOException {
      Object[] var10001 = com.c.a(var1, null, var2, null, var3);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void U(File var1, String var2, Collection var3, String var4) throws IOException {
      Object[] var10001 = com.c.a(var1, var2, var3, var4, false);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void O(File var1, String var2, Collection var3, String var4, boolean var5) throws IOException {
      BufferedOutputStream var10000;
      Object[] var10003 = com.c.a(var1, var5);
      Method var10005 = com.c.d(286016544931944572L);
      Object[] var10004 = var10003;
      J7 var13 = this;
      Method var10002 = var10005;

      try {
         var12 = (FileOutputStream)var10002.invoke(var13, var10004);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10000 = new BufferedOutputStream(var12);
      BufferedOutputStream var6 = var10000;

      try {
         IOUtils.writeLines(var3, var4, var6, var2);
      } catch (Throwable var10) {
         try {
            var6.close();
         } catch (Throwable var9) {
            var10.addSuppressed(var9);
         }

         throw var10;
      }

      var6.close();
   }

   public void t(File var1, Collection var2, String var3) throws IOException {
      Object[] var10001 = com.c.a(var1, null, var2, var3, false);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void Y(File var1, Collection var2, String var3, boolean var4) throws IOException {
      Object[] var10001 = com.c.a(var1, null, var2, var3, var4);
      Method var10003 = com.c.d(185952313372465588L);
      Object[] var10002 = var10001;
      J7 var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.isDirectory ()Z
      // 08: aload 2
      // 09: ifnull 44
      // 0c: ifeq 39
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 519603404431654025
      // 1e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 21: dup_x2
      // 22: pop
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: pop
      // 27: goto 2e
      // 2a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 2
      // 2f: ifnonnull a7
      // 32: goto 39
      // 35: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 1
      // 3a: invokevirtual java/io/File.exists ()Z
      // 3d: goto 44
      // 40: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: istore 3
      // 45: aload 1
      // 46: invokevirtual java/io/File.delete ()Z
      // 49: aload 2
      // 4a: ifnull 58
      // 4d: ifne a7
      // 50: goto 57
      // 53: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: iload 3
      // 58: ifne 81
      // 5b: new java/io/FileNotFoundException
      // 5e: dup
      // 5f: new java/lang/StringBuilder
      // 62: dup
      // 63: invokespecial java/lang/StringBuilder.<init> ()V
      // 66: sipush 21797
      // 69: sipush 26996
      // 6c: invokestatic J7.a (II)Ljava/lang/String;
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: aload 1
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 7c: athrow
      // 7d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: new java/lang/StringBuilder
      // 84: dup
      // 85: invokespecial java/lang/StringBuilder.<init> ()V
      // 88: sipush 21782
      // 8b: sipush -15722
      // 8e: invokestatic J7.a (II)Ljava/lang/String;
      // 91: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 94: aload 1
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 98: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9b: astore 4
      // 9d: new java/io/IOException
      // a0: dup
      // a1: aload 4
      // a3: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // a6: athrow
      // a7: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 41
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 39
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 436571362886361448
      // 1e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 21: dup_x2
      // 22: pop
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: pop
      // 27: goto 2e
      // 2a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 2
      // 2f: ifnonnull 44
      // 32: goto 39
      // 35: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 1
      // 3a: goto 41
      // 3d: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: invokevirtual java/io/File.deleteOnExit ()V
      // 44: return
   }

   private void d(File var1) throws IOException {
      com.ky_4[] var2 = Vk_2.y();

      J7 var8;
      File var10001;
      label50: {
         label49: {
            try {
               var10000 = var1.exists();
               if (var2 == null) {
                  break label49;
               }

               if (!var10000) {
                  return;
               }
            } catch (IOException var7) {
               throw a(var7);
            }

            try {
               var1.deleteOnExit();
               var8 = this;
               var10001 = var1;
               if (var2 == null) {
                  break label50;
               }

               Object[] var11 = com.c.a(var1);
               Method var10003 = com.c.d(445181380587021203L);
               Object[] var10002 = var11;
               J7 var12 = this;
               Method var9 = var10003;

               try {
                  var10000 = (Boolean)var9.invoke(var12, var10002);
               } catch (InvocationTargetException var4) {
                  throw var4.getTargetException();
               }
            } catch (IOException var6) {
               throw a(var6);
            }
         }

         try {
            if (var10000) {
               return;
            }

            var8 = this;
            var10001 = var1;
         } catch (IOException var5) {
            throw a(var5);
         }
      }

      Object[] var13 = com.c.a(var10001);
      Method var16 = com.c.d(462809636395036636L);
      Object[] var15 = var13;
      J7 var14 = var8;
      Method var10 = var16;

      try {
         var10.invoke(var14, var15);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void t$void(File var1) throws IOException {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(417012132292310060L);
      Object[] var10002 = var10001;
      J7 var18 = this;
      Method var10000 = var10003;

      try {
         var15 = (File[])var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      File[] var3 = var15;
      com.ky_4[] var16 = Vk_2.y();
      IOException var4 = null;
      File[] var5 = var3;
      int var6 = var3.length;
      com.ky_4[] var2 = var16;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            File var8 = var5[var7];

            label46: {
               IOException var9;
               try {
                  label44: {
                     try {
                        var10001 = com.c.a(var8);
                        var10003 = com.c.d(275487383563797059L);
                        var10002 = var10001;
                        J7 var20 = this;
                        var10000 = var10003;

                        try {
                           var10000.invoke(var20, var10002);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }
                     } catch (IOException var13) {
                        var9 = var13;
                        break label44;
                     }

                     if (var2 == null) {
                        break;
                     }
                     break label46;
                  }
               } catch (NullPointerException var14) {
                  throw a(var14);
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
         } catch (IOException var10) {
            throw a(var10);
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 71
      // 0c: ifeq 54
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual java/io/File.isDirectory ()Z
      // 1a: ifne b1
      // 1d: goto 24
      // 20: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: sipush 21793
      // 2e: sipush 940
      // 31: invokestatic J7.a (II)Ljava/lang/String;
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: aload 1
      // 38: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3b: sipush 21843
      // 3e: sipush -4237
      // 41: invokestatic J7.a (II)Ljava/lang/String;
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
      // 56: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 59: ldc2_w 323874994732919696
      // 5c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 5f: dup_x2
      // 60: pop
      // 61: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 64: checkcast java/lang/Boolean
      // 67: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6a: goto 71
      // 6d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 2
      // 72: ifnull 8a
      // 75: ifne b1
      // 78: goto 7f
      // 7b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 1
      // 80: invokevirtual java/io/File.isDirectory ()Z
      // 83: goto 8a
      // 86: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: ifne b1
      // 8d: new java/lang/StringBuilder
      // 90: dup
      // 91: invokespecial java/lang/StringBuilder.<init> ()V
      // 94: sipush 21848
      // 97: sipush -3482
      // 9a: invokestatic J7.a (II)Ljava/lang/String;
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0: aload 1
      // a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a7: astore 3
      // a8: new java/io/IOException
      // ab: dup
      // ac: aload 3
      // ad: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // b0: athrow
      // b1: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: aload 1
      // 04: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 2
      // 0a: ifnull 35
      // 0d: aload 3
      // 0e: ifnonnull 1d
      // 11: goto 18
      // 14: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: return
      // 19: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 3
      // 1f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 22: ldc2_w 434472978318978351
      // 25: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 28: dup_x2
      // 29: pop
      // 2a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2d: pop
      // 2e: goto 35
      // 31: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34: athrow
      // 35: return
   }

   public long k(File var1) {
      com.ky_4[] var2 = Vk_2.y();

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
            } catch (NullPointerException var7) {
               throw a(var7);
            }

            try {
               if (var2 == null) {
                  return var1.length();
               }

               var10000 = var1.isDirectory();
            } catch (NullPointerException var5) {
               throw a(var5);
            }
         }

         try {
            if (var10000) {
               Object[] var10001 = com.c.a(var1);
               Method var10003 = com.c.d(516955069676995539L);
               Object[] var10002 = var10001;
               J7 var10 = this;
               Method var9 = var10003;

               try {
                  return (Long)var9.invoke(var10, var10002);
               } catch (InvocationTargetException var4) {
                  throw var4.getTargetException();
               }
            }
         } catch (NullPointerException var6) {
            throw a(var6);
         }

         return var1.length();
      }

      String var3 = var1 + a(21838, 4536);
      throw new IllegalArgumentException(var3);
   }

   public BigInteger P(File var1) {
      com.ky_4[] var2 = Vk_2.y();

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
            } catch (NullPointerException var7) {
               throw a(var7);
            }

            try {
               if (var2 == null) {
                  return BigInteger.valueOf(var1.length());
               }

               var10000 = var1.isDirectory();
            } catch (NullPointerException var5) {
               throw a(var5);
            }
         }

         try {
            if (var10000) {
               Object[] var10001 = com.c.a(var1);
               Method var10003 = com.c.d(322687331344026812L);
               Object[] var10002 = var10001;
               J7 var10 = this;
               Method var9 = var10003;

               try {
                  return (BigInteger)var9.invoke(var10, var10002);
               } catch (InvocationTargetException var4) {
                  throw var4.getTargetException();
               }
            }
         } catch (NullPointerException var6) {
            throw a(var6);
         }

         return BigInteger.valueOf(var1.length());
      }

      String var3 = var1 + a(21833, 13482);
      throw new IllegalArgumentException(var3);
   }

   public long Q$long(File var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(505072782684634901L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(516955069676995539L);
      var10002 = var10001;
      J7 var7 = this;
      var10000 = var10003;

      try {
         return (Long)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   private long O(File var1) {
      com.ky_4[] var10000 = Vk_2.y();
      File[] var3 = var1.listFiles();
      com.ky_4[] var2 = var10000;

      try {
         if (var3 == null) {
            return 0L;
         }
      } catch (IOException var16) {
         throw a(var16);
      }

      long var4 = 0L;

      for (File var9 : var3) {
         label60: {
            try {
               label75: {
                  try {
                     Object[] var10001 = com.c.a(var9);
                     Method var10003 = com.c.d(445181380587021203L);
                     Object[] var10002 = var10001;
                     J7 var19 = this;
                     Method var17 = var10003;

                     try {
                        var18 = (Boolean)var17.invoke(var19, var10002);
                     } catch (InvocationTargetException var12) {
                        throw var12.getTargetException();
                     }

                     if (var2 == null) {
                        break label75;
                     }

                     if (var18 != 0) {
                        break label60;
                     }
                  } catch (IOException var14) {
                     throw a(var14);
                  }

                  Object[] var22 = com.c.a(var9);
                  Method var10004 = com.c.d(126011339481536981L);
                  Object[] var24 = var22;
                  J7 var23 = this;
                  Method var20 = var10004;

                  try {
                     var21 = (Long)var20.invoke(var23, var24);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  var4 += var21;
                  long var25;
                  var18 = (var25 = var4 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
               }

               if (var18 >= 0) {
                  break label60;
               }
            } catch (IOException var15) {
               break label60;
            }

            try {
               if (var2 != null) {
                  break;
               }
            } catch (IOException var13) {
               throw a(var13);
            }
         }

         if (var2 == null) {
            break;
         }
      }

      return var4;
   }

   private long t$long(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 39
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 38
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 516955069676995539
      // 1e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 21: dup_x2
      // 22: pop
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: checkcast java/lang/Long
      // 29: invokevirtual java/lang/Long.longValue ()J
      // 2c: goto 33
      // 2f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32: athrow
      // 33: lreturn
      // 34: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 1
      // 39: invokevirtual java/io/File.length ()J
      // 3c: lreturn
   }

   public BigInteger q(File var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(505072782684634901L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(322687331344026812L);
      var10002 = var10001;
      J7 var7 = this;
      var10000 = var10003;

      try {
         return (BigInteger)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   private BigInteger D(File var1) {
      com.ky_4[] var10000 = Vk_2.y();
      File[] var3 = var1.listFiles();
      com.ky_4[] var2 = var10000;

      try {
         if (var3 == null) {
            return BigInteger.ZERO;
         }
      } catch (IOException var13) {
         throw a(var13);
      }

      BigInteger var4 = BigInteger.ZERO;

      for (File var8 : var3) {
         try {
            Object[] var10001 = com.c.a(var8);
            Method var10003 = com.c.d(445181380587021203L);
            Object[] var10002 = var10001;
            J7 var16 = this;
            Method var14 = var10003;

            try {
               var15 = (Boolean)var14.invoke(var16, var10002);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            if (!var15) {
               var10002 = com.c.a(var8);
               Method var10004 = com.c.d(595512039280100507L);
               Object[] var21 = var10002;
               J7 var20 = this;
               Method var17 = var10004;

               try {
                  var10001 = (BigInteger)var17.invoke(var20, var21);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               var4 = var4.add(var10001);
            }
         } catch (IOException var12) {
         }

         if (var2 == null) {
            break;
         }
      }

      return var4;
   }

   private BigInteger C(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 36
      // 09: invokevirtual java/io/File.isDirectory ()Z
      // 0c: ifeq 35
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b: ldc2_w 322687331344026812
      // 1e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 21: dup_x2
      // 22: pop
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: checkcast java/math/BigInteger
      // 29: goto 30
      // 2c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f: athrow
      // 30: areturn
      // 31: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual java/io/File.length ()J
      // 39: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 3c: areturn
   }

   private void i$void(File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual java/io/File.exists ()Z
      // 08: aload 2
      // 09: ifnull 40
      // 0c: ifne 3c
      // 0f: goto 16
      // 12: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 2b: invokestatic J7.a (II)Ljava/lang/String;
      // 2e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 37: athrow
      // 38: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 58: invokestatic J7.a (II)Ljava/lang/String;
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 61: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 64: athrow
      // 65: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21860
      // 1a: sipush 4492
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 3
      // 2d: ifnull 8d
      // 30: ifne 6c
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21866
      // 48: sipush 1321
      // 4b: invokestatic J7.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 2
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: sipush 21887
      // 58: sipush 30609
      // 5b: invokestatic J7.a (II)Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokevirtual java/io/File.lastModified ()J
      // 72: invokestatic com/c.a (Ljava/lang/Object;J)[Ljava/lang/Object;
      // 75: ldc2_w 449450884059870577
      // 78: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 7b: dup_x2
      // 7c: pop
      // 7d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 80: checkcast java/lang/Boolean
      // 83: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 86: goto 8d
      // 89: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: ireturn
   }

   public boolean O(File var1, Date var2) {
      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a(21818, -32615));
         }
      } catch (NullPointerException var4) {
         throw a(var4);
      }

      Object[] var10001 = com.c.a(var1, var2.getTime());
      Method var10003 = com.c.d(449450884059870577L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         return (Boolean)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: sipush 21804
      // 1c: sipush -15356
      // 1f: invokestatic J7.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/io/File.exists ()Z
      // 2e: aload 4
      // 30: ifnull 49
      // 33: ifne 43
      // 36: goto 3d
      // 39: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual java/io/File.lastModified ()J
      // 47: lload 2
      // 48: lcmp
      // 49: aload 4
      // 4b: ifnull 59
      // 4e: ifle 5c
      // 51: goto 58
      // 54: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: sipush 21879
      // 1a: sipush -8338
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 3
      // 2d: ifnull 8d
      // 30: ifne 6c
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/IllegalArgumentException
      // 3d: dup
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: sipush 21806
      // 48: sipush -17713
      // 4b: invokestatic J7.a (II)Ljava/lang/String;
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: aload 2
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 55: sipush 21842
      // 58: sipush 2846
      // 5b: invokestatic J7.a (II)Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67: athrow
      // 68: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: aload 2
      // 6f: invokevirtual java/io/File.lastModified ()J
      // 72: invokestatic com/c.a (Ljava/lang/Object;J)[Ljava/lang/Object;
      // 75: ldc2_w 160336580247799259
      // 78: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 7b: dup_x2
      // 7c: pop
      // 7d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 80: checkcast java/lang/Boolean
      // 83: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 86: goto 8d
      // 89: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: ireturn
   }

   public boolean p(File var1, Date var2) {
      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a(21809, 21610));
         }
      } catch (NullPointerException var4) {
         throw a(var4);
      }

      Object[] var10001 = com.c.a(var1, var2.getTime());
      Method var10003 = com.c.d(160336580247799259L);
      Object[] var10002 = var10001;
      J7 var5 = this;
      Method var10000 = var10003;

      try {
         return (Boolean)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: sipush 21835
      // 1c: sipush 28338
      // 1f: invokestatic J7.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual java/io/File.exists ()Z
      // 2e: aload 4
      // 30: ifnull 49
      // 33: ifne 43
      // 36: goto 3d
      // 39: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual java/io/File.lastModified ()J
      // 47: lload 2
      // 48: lcmp
      // 49: aload 4
      // 4b: ifnull 59
      // 4e: ifge 5c
      // 51: goto 58
      // 54: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
   }

   public long K$long(File var1) throws IOException {
      CRC32 var2 = new CRC32();
      Object[] var10001 = com.c.a(var1, var2);
      Method var10003 = com.c.d(633118833076006115L);
      Object[] var10002 = var10001;
      J7 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21825
      // 01a: sipush 25410
      // 01d: invokestatic J7.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 2
      // 029: aload 3
      // 02a: ifnull 04d
      // 02d: ifnonnull 04c
      // 030: goto 037
      // 033: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/lang/NullPointerException
      // 03a: dup
      // 03b: sipush 21814
      // 03e: sipush 19208
      // 041: invokestatic J7.a (II)Ljava/lang/String;
      // 044: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual java/io/File.exists ()Z
      // 050: aload 3
      // 051: ifnull 094
      // 054: ifne 090
      // 057: goto 05e
      // 05a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: new java/io/FileNotFoundException
      // 061: dup
      // 062: new java/lang/StringBuilder
      // 065: dup
      // 066: invokespecial java/lang/StringBuilder.<init> ()V
      // 069: sipush 21865
      // 06c: sipush -4101
      // 06f: invokestatic J7.a (II)Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: aload 1
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 079: sipush 21863
      // 07c: sipush -24367
      // 07f: invokestatic J7.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 1
      // 091: invokevirtual java/io/File.isDirectory ()Z
      // 094: aload 3
      // 095: ifnull 0d8
      // 098: ifne 0d4
      // 09b: goto 0a2
      // 09e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: new java/io/IOException
      // 0a5: dup
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 21865
      // 0b0: sipush -4101
      // 0b3: invokestatic J7.a (II)Ljava/lang/String;
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 1
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bd: sipush 21869
      // 0c0: sipush -574
      // 0c3: invokestatic J7.a (II)Ljava/lang/String;
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cc: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0cf: athrow
      // 0d0: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 2
      // 0d5: invokevirtual java/io/File.exists ()Z
      // 0d8: aload 3
      // 0d9: ifnull 11d
      // 0dc: ifeq 118
      // 0df: goto 0e6
      // 0e2: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: new org/apache/commons/io/FileExistsException
      // 0e9: dup
      // 0ea: new java/lang/StringBuilder
      // 0ed: dup
      // 0ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f1: sipush 21854
      // 0f4: sipush -21271
      // 0f7: invokestatic J7.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: aload 2
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 101: sipush 21815
      // 104: sipush -4143
      // 107: invokestatic J7.a (II)Ljava/lang/String;
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: invokespecial org/apache/commons/io/FileExistsException.<init> (Ljava/lang/String;)V
      // 113: athrow
      // 114: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 1
      // 119: aload 2
      // 11a: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 11d: istore 4
      // 11f: iload 4
      // 121: aload 3
      // 122: ifnull 154
      // 125: ifne 20c
      // 128: goto 12f
      // 12b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
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
      // 150: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 3
      // 155: ifnull 1cd
      // 158: ifeq 198
      // 15b: goto 162
      // 15e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: new java/io/IOException
      // 165: dup
      // 166: new java/lang/StringBuilder
      // 169: dup
      // 16a: invokespecial java/lang/StringBuilder.<init> ()V
      // 16d: sipush 21876
      // 170: sipush 14156
      // 173: invokestatic J7.a (II)Ljava/lang/String;
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: aload 1
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17d: sipush 21798
      // 180: sipush -17740
      // 183: invokestatic J7.a (II)Ljava/lang/String;
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: aload 2
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 193: athrow
      // 194: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: aload 0
      // 199: aload 1
      // 19a: aload 2
      // 19b: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 19e: ldc2_w 369759582331880199
      // 1a1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a4: dup_x2
      // 1a5: pop
      // 1a6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a9: pop
      // 1aa: goto 1b1
      // 1ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b6: ldc2_w 519603404431654025
      // 1b9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c1: pop
      // 1c2: goto 1c9
      // 1c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: aload 1
      // 1ca: invokevirtual java/io/File.exists ()Z
      // 1cd: ifeq 20c
      // 1d0: new java/io/IOException
      // 1d3: dup
      // 1d4: new java/lang/StringBuilder
      // 1d7: dup
      // 1d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1db: sipush 21881
      // 1de: sipush 10002
      // 1e1: invokestatic J7.a (II)Ljava/lang/String;
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: aload 1
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1eb: sipush 21829
      // 1ee: sipush 25191
      // 1f1: invokestatic J7.a (II)Ljava/lang/String;
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: aload 2
      // 1f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1fb: ldc_w "'"
      // 1fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 201: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 204: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 207: athrow
      // 208: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: return
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnull 02b
      // 00b: ifnonnull 02a
      // 00e: goto 015
      // 011: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: new java/lang/NullPointerException
      // 018: dup
      // 019: sipush 21825
      // 01c: sipush 25410
      // 01f: invokestatic J7.a (II)Ljava/lang/String;
      // 022: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 025: athrow
      // 026: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 2
      // 02b: aload 4
      // 02d: ifnull 050
      // 030: ifnonnull 04f
      // 033: goto 03a
      // 036: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: new java/lang/NullPointerException
      // 03d: dup
      // 03e: sipush 21852
      // 041: sipush -25196
      // 044: invokestatic J7.a (II)Ljava/lang/String;
      // 047: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 2
      // 050: invokevirtual java/io/File.exists ()Z
      // 053: aload 4
      // 055: ifnull 09c
      // 058: ifne 098
      // 05b: goto 062
      // 05e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 3
      // 063: aload 4
      // 065: ifnull 09c
      // 068: goto 06f
      // 06b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: ifeq 098
      // 072: goto 079
      // 075: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 2
      // 07b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 323874994732919696
      // 081: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 084: dup_x2
      // 085: pop
      // 086: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: pop
      // 091: goto 098
      // 094: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 2
      // 099: invokevirtual java/io/File.exists ()Z
      // 09c: aload 4
      // 09e: ifnull 0eb
      // 0a1: ifne 0e7
      // 0a4: goto 0ab
      // 0a7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: new java/io/FileNotFoundException
      // 0ae: dup
      // 0af: new java/lang/StringBuilder
      // 0b2: dup
      // 0b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b6: sipush 21875
      // 0b9: sipush 29759
      // 0bc: invokestatic J7.a (II)Ljava/lang/String;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 2
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c6: sipush 21803
      // 0c9: sipush 7161
      // 0cc: invokestatic J7.a (II)Ljava/lang/String;
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: iload 3
      // 0d3: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0d6: ldc_w "]"
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0df: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 0e2: athrow
      // 0e3: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 2
      // 0e8: invokevirtual java/io/File.isDirectory ()Z
      // 0eb: ifne 120
      // 0ee: new java/io/IOException
      // 0f1: dup
      // 0f2: new java/lang/StringBuilder
      // 0f5: dup
      // 0f6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f9: sipush 21854
      // 0fc: sipush -21271
      // 0ff: invokestatic J7.a (II)Ljava/lang/String;
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: aload 2
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 109: sipush 21869
      // 10c: sipush -574
      // 10f: invokestatic J7.a (II)Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 11b: athrow
      // 11c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 0
      // 121: aload 1
      // 122: new java/io/File
      // 125: dup
      // 126: aload 2
      // 127: aload 1
      // 128: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 12b: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 12e: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 131: ldc2_w 488329656482662052
      // 134: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 137: dup_x2
      // 138: pop
      // 139: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13c: pop
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: return
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnull 029
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: new java/lang/NullPointerException
      // 016: dup
      // 017: sipush 21825
      // 01a: sipush 25410
      // 01d: invokestatic J7.a (II)Ljava/lang/String;
      // 020: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 2
      // 029: aload 3
      // 02a: ifnull 04d
      // 02d: ifnonnull 04c
      // 030: goto 037
      // 033: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/lang/NullPointerException
      // 03a: dup
      // 03b: sipush 21814
      // 03e: sipush 19208
      // 041: invokestatic J7.a (II)Ljava/lang/String;
      // 044: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual java/io/File.exists ()Z
      // 050: aload 3
      // 051: ifnull 094
      // 054: ifne 090
      // 057: goto 05e
      // 05a: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: new java/io/FileNotFoundException
      // 061: dup
      // 062: new java/lang/StringBuilder
      // 065: dup
      // 066: invokespecial java/lang/StringBuilder.<init> ()V
      // 069: sipush 21865
      // 06c: sipush -4101
      // 06f: invokestatic J7.a (II)Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: aload 1
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 079: sipush 21863
      // 07c: sipush -24367
      // 07f: invokestatic J7.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 1
      // 091: invokevirtual java/io/File.isDirectory ()Z
      // 094: aload 3
      // 095: ifnull 0d7
      // 098: ifeq 0d3
      // 09b: goto 0a2
      // 09e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: new java/io/IOException
      // 0a5: dup
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 21865
      // 0b0: sipush -4101
      // 0b3: invokestatic J7.a (II)Ljava/lang/String;
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 1
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bd: sipush 21850
      // 0c0: bipush 92
      // 0c2: invokestatic J7.a (II)Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0ce: athrow
      // 0cf: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: aload 2
      // 0d4: invokevirtual java/io/File.exists ()Z
      // 0d7: aload 3
      // 0d8: ifnull 11b
      // 0db: ifeq 117
      // 0de: goto 0e5
      // 0e1: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: new org/apache/commons/io/FileExistsException
      // 0e8: dup
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: sipush 21854
      // 0f3: sipush -21271
      // 0f6: invokestatic J7.a (II)Ljava/lang/String;
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: aload 2
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 100: sipush 21867
      // 103: sipush 30799
      // 106: invokestatic J7.a (II)Ljava/lang/String;
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10f: invokespecial org/apache/commons/io/FileExistsException.<init> (Ljava/lang/String;)V
      // 112: athrow
      // 113: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 2
      // 118: invokevirtual java/io/File.isDirectory ()Z
      // 11b: aload 3
      // 11c: ifnull 160
      // 11f: ifeq 15b
      // 122: goto 129
      // 125: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: new java/io/IOException
      // 12c: dup
      // 12d: new java/lang/StringBuilder
      // 130: dup
      // 131: invokespecial java/lang/StringBuilder.<init> ()V
      // 134: sipush 21854
      // 137: sipush -21271
      // 13a: invokestatic J7.a (II)Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: aload 2
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 144: sipush 21819
      // 147: sipush -22930
      // 14a: invokestatic J7.a (II)Ljava/lang/String;
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 153: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 156: athrow
      // 157: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 1
      // 15c: aload 2
      // 15d: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 160: istore 4
      // 162: iload 4
      // 164: aload 3
      // 165: ifnull 196
      // 168: ifne 201
      // 16b: goto 172
      // 16e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 0
      // 173: aload 1
      // 174: aload 2
      // 175: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 178: ldc2_w 172839385836868030
      // 17b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 17e: dup_x2
      // 17f: pop
      // 180: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 183: pop
      // 184: goto 18b
      // 187: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: aload 1
      // 18c: invokevirtual java/io/File.delete ()Z
      // 18f: goto 196
      // 192: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 195: athrow
      // 196: aload 3
      // 197: ifnull 1c8
      // 19a: ifne 201
      // 19d: goto 1a4
      // 1a0: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: aload 2
      // 1a6: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a9: ldc2_w 311170580059209010
      // 1ac: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1b4: checkcast java/lang/Boolean
      // 1b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ba: goto 1c1
      // 1bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: goto 1c8
      // 1c4: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: pop
      // 1c9: new java/io/IOException
      // 1cc: dup
      // 1cd: new java/lang/StringBuilder
      // 1d0: dup
      // 1d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d4: sipush 21864
      // 1d7: sipush -6105
      // 1da: invokestatic J7.a (II)Ljava/lang/String;
      // 1dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e0: aload 1
      // 1e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1e4: sipush 21872
      // 1e7: sipush -24926
      // 1ea: invokestatic J7.a (II)Ljava/lang/String;
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: aload 2
      // 1f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f4: ldc_w "'"
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fd: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 200: athrow
      // 201: return
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
      // 000: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnull 02b
      // 00b: ifnonnull 02a
      // 00e: goto 015
      // 011: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: new java/lang/NullPointerException
      // 018: dup
      // 019: sipush 21825
      // 01c: sipush 25410
      // 01f: invokestatic J7.a (II)Ljava/lang/String;
      // 022: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 025: athrow
      // 026: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 2
      // 02b: aload 4
      // 02d: ifnull 050
      // 030: ifnonnull 04f
      // 033: goto 03a
      // 036: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: new java/lang/NullPointerException
      // 03d: dup
      // 03e: sipush 21885
      // 041: sipush -27612
      // 044: invokestatic J7.a (II)Ljava/lang/String;
      // 047: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 2
      // 050: invokevirtual java/io/File.exists ()Z
      // 053: aload 4
      // 055: ifnull 09c
      // 058: ifne 098
      // 05b: goto 062
      // 05e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iload 3
      // 063: aload 4
      // 065: ifnull 09c
      // 068: goto 06f
      // 06b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: ifeq 098
      // 072: goto 079
      // 075: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 2
      // 07b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 323874994732919696
      // 081: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 084: dup_x2
      // 085: pop
      // 086: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: pop
      // 091: goto 098
      // 094: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 2
      // 099: invokevirtual java/io/File.exists ()Z
      // 09c: aload 4
      // 09e: ifnull 0eb
      // 0a1: ifne 0e7
      // 0a4: goto 0ab
      // 0a7: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: new java/io/FileNotFoundException
      // 0ae: dup
      // 0af: new java/lang/StringBuilder
      // 0b2: dup
      // 0b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b6: sipush 21883
      // 0b9: sipush 23922
      // 0bc: invokestatic J7.a (II)Ljava/lang/String;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c2: aload 2
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c6: sipush 21851
      // 0c9: sipush -3993
      // 0cc: invokestatic J7.a (II)Ljava/lang/String;
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: iload 3
      // 0d3: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0d6: ldc_w "]"
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0df: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 0e2: athrow
      // 0e3: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 2
      // 0e8: invokevirtual java/io/File.isDirectory ()Z
      // 0eb: ifne 120
      // 0ee: new java/io/IOException
      // 0f1: dup
      // 0f2: new java/lang/StringBuilder
      // 0f5: dup
      // 0f6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f9: sipush 21854
      // 0fc: sipush -21271
      // 0ff: invokestatic J7.a (II)Ljava/lang/String;
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: aload 2
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 109: sipush 21869
      // 10c: sipush -574
      // 10f: invokestatic J7.a (II)Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 11b: athrow
      // 11c: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 0
      // 121: aload 1
      // 122: new java/io/File
      // 125: dup
      // 126: aload 2
      // 127: aload 1
      // 128: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 12b: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 12e: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 131: ldc2_w 304348418354541089
      // 134: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 137: dup_x2
      // 138: pop
      // 139: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13c: pop
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 4
      // 05: aload 1
      // 06: aload 4
      // 08: ifnull 2b
      // 0b: ifnonnull 2a
      // 0e: goto 15
      // 11: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: new java/lang/NullPointerException
      // 18: dup
      // 19: sipush 21825
      // 1c: sipush 25410
      // 1f: invokestatic J7.a (II)Ljava/lang/String;
      // 22: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 25: athrow
      // 26: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: aload 4
      // 2d: ifnull 50
      // 30: ifnonnull 4f
      // 33: goto 3a
      // 36: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: new java/lang/NullPointerException
      // 3d: dup
      // 3e: sipush 21814
      // 41: sipush 19208
      // 44: invokestatic J7.a (II)Ljava/lang/String;
      // 47: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 4a: athrow
      // 4b: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 1
      // 50: invokevirtual java/io/File.exists ()Z
      // 53: aload 4
      // 55: ifnull 98
      // 58: ifne 94
      // 5b: goto 62
      // 5e: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: new java/io/FileNotFoundException
      // 65: dup
      // 66: new java/lang/StringBuilder
      // 69: dup
      // 6a: invokespecial java/lang/StringBuilder.<init> ()V
      // 6d: sipush 21865
      // 70: sipush -4101
      // 73: invokestatic J7.a (II)Ljava/lang/String;
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79: aload 1
      // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7d: sipush 21863
      // 80: sipush -24367
      // 83: invokestatic J7.a (II)Ljava/lang/String;
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 8f: athrow
      // 90: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 1
      // 95: invokevirtual java/io/File.isDirectory ()Z
      // 98: ifeq c1
      // 9b: aload 0
      // 9c: aload 1
      // 9d: aload 2
      // 9e: iload 3
      // 9f: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // a2: ldc2_w 591690265631190812
      // a5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // a8: dup_x2
      // a9: pop
      // aa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // ad: pop
      // ae: goto b5
      // b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b4: athrow
      // b5: aload 4
      // b7: ifnonnull e2
      // ba: goto c1
      // bd: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0: athrow
      // c1: aload 0
      // c2: aload 1
      // c3: aload 2
      // c4: iload 3
      // c5: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // c8: ldc2_w 158621969937078300
      // cb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // ce: dup_x2
      // cf: pop
      // d0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // d3: pop
      // d4: goto db
      // d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // da: athrow
      // db: goto e2
      // de: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e1: athrow
      // e2: return
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
      // 00: invokestatic Vk_2.y ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 21870
      // 1a: sipush -25430
      // 1d: invokestatic J7.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic J7.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 2c: invokestatic java/nio/file/Files.isSymbolicLink (Ljava/nio/file/Path;)Z
      // 2f: ireturn
   }

   public UG a() {
      return (UG)com.c.c(136992684323528157L).get(this);
   }

   public void e(UG var1) {
      com.c.c(136992684323528157L).set(this, var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static String a(int var0, int var1) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4775;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 3228) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }
}





