package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.socket.PlainConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.http.io.SocketConfig;
import org.apache.hc.core5.pool.PoolConcurrencyPolicy;
import org.apache.hc.core5.pool.PoolReusePolicy;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.TimeValue;

public class Bh4 {
   static String D;
   static String n;
   static String O;
   static String V;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public static void B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/NR_2.k ()Z
      // 03: istore 0
      // 04: ldc2_w 434787546011183607
      // 07: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0a: aconst_null
      // 0b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e: checkcast java/lang/String
      // 11: iload 0
      // 12: ifne 64
      // 15: ldc2_w 367612586935092048
      // 18: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1b: aconst_null
      // 1c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f: checkcast java/lang/String
      // 22: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25: ifeq 50
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: ldc2_w 149525762923151185
      // 32: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 35: aconst_null
      // 36: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 39: ldc2_w 434787546011183607
      // 3c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3f: aconst_null
      // 40: dup2_x1
      // 41: pop2
      // 42: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 45: iload 0
      // 46: ifeq 70
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: ldc2_w 367612586935092048
      // 53: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 56: aconst_null
      // 57: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5a: checkcast java/lang/String
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: ldc2_w 434787546011183607
      // 67: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 6a: aconst_null
      // 6b: dup2_x1
      // 6c: pop2
      // 6d: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 70: return
   }

   public static HttpClient F() {
      HttpClientBuilder var1 = HttpClients.custom();
      var1.disableAutomaticRetries();
      var1.disableRedirectHandling();
      var1.setKeepAliveStrategy(new WV());
      boolean var10000 = NR_2.Q();
      V5 var2 = new V5();
      SSLContext var3 = SSLContexts.createSystemDefault();
      Registry var4 = RegistryBuilder.<PlainConnectionSocketFactory>create()
         .register(a(21611, -29524), PlainConnectionSocketFactory.INSTANCE)
         .register(a(21609, 19754), new SSLConnectionSocketFactory(var3))
         .build();
      PoolingHttpClientConnectionManager var5 = new PoolingHttpClientConnectionManager(
         var4, PoolConcurrencyPolicy.STRICT, PoolReusePolicy.LIFO, TimeValue.ofMinutes(b(2958, 354079901741763460L)), null, var2, null
      );
      var5.setMaxTotal(a(20814, 436679161938611678L));
      boolean var0 = var10000;
      var5.setDefaultMaxPerRoute(a(2746, 2792776411231737387L));
      SocketConfig var6 = SocketConfig.custom().setSoKeepAlive(true).setTcpNoDelay(true).setSoReuseAddress(true).build();
      var5.setDefaultSocketConfig(var6);
      var1.setConnectionManager(var5);
      var1.setDefaultRequestConfig(
         RequestConfig.custom()
            .setConnectTimeout(b(3746, 2521592345735810731L), TimeUnit.MILLISECONDS)
            .setConnectionRequestTimeout(b(4092, 7456802563643789303L), TimeUnit.MILLISECONDS)
            .build()
      );
      CloseableHttpClient var7 = var1.build();

      try {
         if (!var0) {
            Ky4.K(new String[5]);
         }

         return var7;
      } catch (ArrayIndexOutOfBoundsException var8) {
         throw a(var8);
      }
   }

   public static byte[] Y(String var0) throws Exception {
      com.finalshell.reflect.Registry.packArgs(com.finalshell.reflect.Registry.lookupField(620693334424877816L).get(null), var0);
      long var1 = 533567384221236451L;
      Object var10001 = Ref.h2(533567384221236451L, var1);

      try {
         return (byte[])var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static byte[] n(HttpClient param0, String param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/NR_2.Q ()Z
      // 003: bipush 0
      // 004: newarray 8
      // 006: astore 3
      // 007: istore 2
      // 008: new org/apache/hc/client5/http/classic/methods/HttpGet
      // 00b: dup
      // 00c: aload 1
      // 00d: invokespecial org/apache/hc/client5/http/classic/methods/HttpGet.<init> (Ljava/lang/String;)V
      // 010: astore 4
      // 012: invokestatic java/lang/System.currentTimeMillis ()J
      // 015: lstore 5
      // 017: sipush 17954
      // 01a: aload 0
      // 01b: aload 4
      // 01d: invokeinterface org/apache/hc/client5/http/classic/HttpClient.execute (Lorg/apache/hc/core5/http/ClassicHttpRequest;)Lorg/apache/hc/core5/http/HttpResponse; 2
      // 022: checkcast org/apache/hc/client5/http/impl/classic/CloseableHttpResponse
      // 025: astore 7
      // 027: ldc2_w 7934913447095409329
      // 02a: aload 7
      // 02c: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getEntity ()Lorg/apache/hc/core5/http/HttpEntity;
      // 02f: astore 8
      // 031: aload 8
      // 033: invokeinterface org/apache/hc/core5/http/HttpEntity.getContent ()Ljava/io/InputStream; 1
      // 038: astore 9
      // 03a: aload 7
      // 03c: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getCode ()I
      // 03f: istore 10
      // 041: new java/io/DataInputStream
      // 044: dup
      // 045: aload 9
      // 047: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 04a: astore 11
      // 04c: new java/io/ByteArrayOutputStream
      // 04f: dup
      // 050: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 053: astore 12
      // 055: invokestatic com/finalshell/core/Bh4.a (IJ)I
      // 058: newarray 8
      // 05a: astore 13
      // 05c: bipush 0
      // 05d: istore 14
      // 05f: aload 11
      // 061: aload 13
      // 063: invokevirtual java/io/DataInputStream.read ([B)I
      // 066: dup
      // 067: istore 14
      // 069: ifle 085
      // 06c: aload 12
      // 06e: aload 13
      // 070: bipush 0
      // 071: iload 14
      // 073: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 076: iload 2
      // 077: ifeq 095
      // 07a: iload 2
      // 07b: ifne 05f
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 12
      // 087: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 08a: astore 3
      // 08b: aload 12
      // 08d: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 090: aload 9
      // 092: invokevirtual java/io/InputStream.close ()V
      // 095: goto 0f4
      // 098: astore 5
      // 09a: aload 5
      // 09c: iload 2
      // 09d: ifeq 0f3
      // 0a0: instanceof java/io/IOException
      // 0a3: ifeq 0f1
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 4
      // 0af: invokevirtual org/apache/hc/client5/http/classic/methods/HttpGet.getUri ()Ljava/net/URI;
      // 0b2: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 0b5: ldc2_w 381524296324133692
      // 0b8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bb: aconst_null
      // 0bc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0bf: checkcast java/lang/String
      // 0c2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c5: ifeq 0e7
      // 0c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cb: ldc2_w 267474303766099851
      // 0ce: astore 15
      // 0d0: ldc2_w 267474303766099851
      // 0d3: aload 15
      // 0d5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d8: pop
      // 0d9: goto 0e0
      // 0dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: goto 0f1
      // 0ea: astore 6
      // 0ec: aload 6
      // 0ee: invokevirtual java/net/URISyntaxException.printStackTrace ()V
      // 0f1: aload 5
      // 0f3: athrow
      // 0f4: aload 3
      // 0f5: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 0f8: ifnull 112
      // 0fb: iload 2
      // 0fc: ifeq 10e
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: bipush 0
      // 107: goto 10f
      // 10a: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: bipush 1
      // 10f: invokestatic com/finalshell/core/NR_2.S (Z)V
      // 112: areturn
   }

   public static O0 x(O0 var0, String var1, HttpClient var2) throws IOException {
      byte[] var3 = var0.toString().getBytes(a(21610, -24320));
      com.finalshell.reflect.Registry.packArgs(var3, var1, var2, 3);
      long var7 = 206825864939775472L;
      Object var10001 = Ref.h2(206825864939775472L, var7);

      try {
         var10001 = (byte[])var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      byte[] var4 = (byte[])var10001;
      String var5 = new String(var4, a(21608, -6709));
      return O0.y(var5);
   }

   public static byte[] C(byte[] param0, String param1, HttpClient param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/NR_2.k ()Z
      // 003: bipush 0
      // 004: istore 5
      // 006: bipush 0
      // 007: istore 6
      // 009: istore 4
      // 00b: aconst_null
      // 00c: astore 7
      // 00e: aload 0
      // 00f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 012: ldc2_w 129862144128276763
      // 015: astore 23
      // 017: ldc2_w 129862144128276763
      // 01a: aload 23
      // 01c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01f: checkcast [B
      // 022: goto 029
      // 025: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 028: athrow
      // 029: astore 0
      // 02a: goto 034
      // 02d: astore 8
      // 02f: aload 8
      // 031: invokevirtual java/lang/Exception.printStackTrace ()V
      // 034: aconst_null
      // 035: astore 8
      // 037: iload 5
      // 039: iload 3
      // 03a: if_icmpge 21e
      // 03d: iinc 5 1
      // 040: new org/apache/hc/client5/http/classic/methods/HttpPost
      // 043: dup
      // 044: aload 1
      // 045: invokespecial org/apache/hc/client5/http/classic/methods/HttpPost.<init> (Ljava/lang/String;)V
      // 048: astore 9
      // 04a: aconst_null
      // 04b: astore 10
      // 04d: new org/apache/hc/core5/http/io/entity/ByteArrayEntity
      // 050: dup
      // 051: aload 0
      // 052: getstatic org/apache/hc/core5/http/ContentType.DEFAULT_BINARY Lorg/apache/hc/core5/http/ContentType;
      // 055: invokespecial org/apache/hc/core5/http/io/entity/ByteArrayEntity.<init> ([BLorg/apache/hc/core5/http/ContentType;)V
      // 058: astore 11
      // 05a: sipush 14101
      // 05d: aload 9
      // 05f: aload 11
      // 061: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.setEntity (Lorg/apache/hc/core5/http/HttpEntity;)V
      // 064: ldc2_w 3431877568965438343
      // 067: aload 2
      // 068: aload 9
      // 06a: invokeinterface org/apache/hc/client5/http/classic/HttpClient.execute (Lorg/apache/hc/core5/http/ClassicHttpRequest;)Lorg/apache/hc/core5/http/HttpResponse; 2
      // 06f: checkcast org/apache/hc/client5/http/impl/classic/CloseableHttpResponse
      // 072: astore 12
      // 074: aload 12
      // 076: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getEntity ()Lorg/apache/hc/core5/http/HttpEntity;
      // 079: astore 13
      // 07b: aload 13
      // 07d: invokeinterface org/apache/hc/core5/http/HttpEntity.getContent ()Ljava/io/InputStream; 1
      // 082: astore 14
      // 084: new java/io/DataInputStream
      // 087: dup
      // 088: aload 14
      // 08a: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 08d: astore 10
      // 08f: new java/io/ByteArrayOutputStream
      // 092: dup
      // 093: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 096: astore 15
      // 098: bipush 0
      // 099: istore 16
      // 09b: invokestatic com/finalshell/core/Bh4.a (IJ)I
      // 09e: newarray 8
      // 0a0: astore 17
      // 0a2: aload 14
      // 0a4: aload 17
      // 0a6: invokevirtual java/io/InputStream.read ([B)I
      // 0a9: dup
      // 0aa: istore 16
      // 0ac: bipush -1
      // 0ad: if_icmple 0cb
      // 0b0: aload 15
      // 0b2: aload 17
      // 0b4: bipush 0
      // 0b5: iload 16
      // 0b7: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0ba: iload 4
      // 0bc: ifne 0f5
      // 0bf: iload 4
      // 0c1: ifeq 0a2
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 15
      // 0cd: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0d0: astore 7
      // 0d2: aload 7
      // 0d4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d7: ldc2_w 356223458641838477
      // 0da: astore 25
      // 0dc: ldc2_w 356223458641838477
      // 0df: aload 25
      // 0e1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e4: checkcast [B
      // 0e7: goto 0ee
      // 0ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: astore 7
      // 0f0: aload 15
      // 0f2: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 0f5: goto 129
      // 0f8: astore 18
      // 0fa: aload 18
      // 0fc: iload 4
      // 0fe: ifne 220
      // 101: astore 8
      // 103: aload 15
      // 105: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 108: aload 10
      // 10a: ifnull 21e
      // 10d: aload 10
      // 10f: invokevirtual java/io/DataInputStream.close ()V
      // 112: goto 21e
      // 115: astore 19
      // 117: aload 19
      // 119: invokevirtual java/io/IOException.printStackTrace ()V
      // 11c: goto 21e
      // 11f: astore 20
      // 121: aload 15
      // 123: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 126: aload 20
      // 128: athrow
      // 129: bipush 1
      // 12a: istore 6
      // 12c: aload 10
      // 12e: iload 4
      // 130: ifne 13f
      // 133: ifnull 21e
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 10
      // 13f: invokevirtual java/io/DataInputStream.close ()V
      // 142: goto 21e
      // 145: astore 18
      // 147: aload 18
      // 149: invokevirtual java/io/IOException.printStackTrace ()V
      // 14c: goto 21e
      // 14f: astore 11
      // 151: iload 4
      // 153: ifne 1c7
      // 156: aload 11
      // 158: instanceof java/io/IOException
      // 15b: ifeq 1bb
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: iload 5
      // 167: iload 4
      // 169: ifne 196
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: bipush 2
      // 174: if_icmpne 1bb
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: aload 9
      // 180: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.getUri ()Ljava/net/URI;
      // 183: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 186: ldc2_w 381524296324133692
      // 189: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18c: aconst_null
      // 18d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 190: checkcast java/lang/String
      // 193: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 196: ifeq 1b1
      // 199: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19c: ldc2_w 267474303766099851
      // 19f: astore 27
      // 1a1: ldc2_w 267474303766099851
      // 1a4: aload 27
      // 1a6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a9: pop
      // 1aa: goto 1b1
      // 1ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: goto 1bb
      // 1b4: astore 12
      // 1b6: aload 12
      // 1b8: invokevirtual java/net/URISyntaxException.printStackTrace ()V
      // 1bb: sipush 2071
      // 1be: ldc2_w 7445704708453648415
      // 1c1: invokestatic com/finalshell/core/Bh4.b (IJ)J
      // 1c4: invokestatic java/lang/Thread.sleep (J)V
      // 1c7: goto 1d1
      // 1ca: astore 12
      // 1cc: aload 12
      // 1ce: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1d1: aload 10
      // 1d3: iload 4
      // 1d5: ifne 1e4
      // 1d8: ifnull 219
      // 1db: goto 1e2
      // 1de: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e1: athrow
      // 1e2: aload 10
      // 1e4: invokevirtual java/io/DataInputStream.close ()V
      // 1e7: goto 219
      // 1ea: astore 11
      // 1ec: aload 11
      // 1ee: invokevirtual java/io/IOException.printStackTrace ()V
      // 1f1: goto 219
      // 1f4: astore 21
      // 1f6: aload 10
      // 1f8: iload 4
      // 1fa: ifne 209
      // 1fd: ifnull 216
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 10
      // 209: invokevirtual java/io/DataInputStream.close ()V
      // 20c: goto 216
      // 20f: astore 22
      // 211: aload 22
      // 213: invokevirtual java/io/IOException.printStackTrace ()V
      // 216: aload 21
      // 218: athrow
      // 219: iload 4
      // 21b: ifeq 037
      // 21e: aload 8
      // 220: iload 4
      // 222: ifne 231
      // 225: ifnull 232
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22e: athrow
      // 22f: aload 8
      // 231: athrow
      // 232: iload 6
      // 234: ifne 24c
      // 237: new java/io/IOException
      // 23a: dup
      // 23b: sipush 21613
      // 23e: sipush 22156
      // 241: invokestatic com/finalshell/core/Bh4.a (II)Ljava/lang/String;
      // 244: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 247: athrow
      // 248: invokestatic com/finalshell/core/Bh4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24b: athrow
      // 24c: aload 7
      // 24e: areturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 21611) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 2;
               break;
            case 1:
               var10000 = 248;
               break;
            case 2:
               var10000 = 206;
               break;
            case 3:
               var10000 = 163;
               break;
            case 4:
               var10000 = 175;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 94;
               break;
            case 7:
               var10000 = 61;
               break;
            case 8:
               var10000 = 252;
               break;
            case 9:
               var10000 = 127;
               break;
            case 10:
               var10000 = 174;
               break;
            case 11:
               var10000 = 4;
               break;
            case 12:
               var10000 = 89;
               break;
            case 13:
               var10000 = 219;
               break;
            case 14:
               var10000 = 126;
               break;
            case 15:
               var10000 = 69;
               break;
            case 16:
               var10000 = 113;
               break;
            case 17:
               var10000 = 30;
               break;
            case 18:
               var10000 = 251;
               break;
            case 19:
               var10000 = 246;
               break;
            case 20:
               var10000 = 49;
               break;
            case 21:
               var10000 = 169;
               break;
            case 22:
               var10000 = 75;
               break;
            case 23:
               var10000 = 172;
               break;
            case 24:
               var10000 = 132;
               break;
            case 25:
               var10000 = 84;
               break;
            case 26:
               var10000 = 58;
               break;
            case 27:
               var10000 = 155;
               break;
            case 28:
               var10000 = 11;
               break;
            case 29:
               var10000 = 239;
               break;
            case 30:
               var10000 = 181;
               break;
            case 31:
               var10000 = 34;
               break;
            case 32:
               var10000 = 187;
               break;
            case 33:
               var10000 = 109;
               break;
            case 34:
               var10000 = 123;
               break;
            case 35:
               var10000 = 144;
               break;
            case 36:
               var10000 = 18;
               break;
            case 37:
               var10000 = 139;
               break;
            case 38:
               var10000 = 190;
               break;
            case 39:
               var10000 = 121;
               break;
            case 40:
               var10000 = 243;
               break;
            case 41:
               var10000 = 0;
               break;
            case 42:
               var10000 = 68;
               break;
            case 43:
               var10000 = 28;
               break;
            case 44:
               var10000 = 85;
               break;
            case 45:
               var10000 = 195;
               break;
            case 46:
               var10000 = 54;
               break;
            case 47:
               var10000 = 76;
               break;
            case 48:
               var10000 = 107;
               break;
            case 49:
               var10000 = 1;
               break;
            case 50:
               var10000 = 137;
               break;
            case 51:
               var10000 = 46;
               break;
            case 52:
               var10000 = 230;
               break;
            case 53:
               var10000 = 157;
               break;
            case 54:
               var10000 = 185;
               break;
            case 55:
               var10000 = 36;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 111;
               break;
            case 58:
               var10000 = 179;
               break;
            case 59:
               var10000 = 92;
               break;
            case 60:
               var10000 = 129;
               break;
            case 61:
               var10000 = 255;
               break;
            case 62:
               var10000 = 53;
               break;
            case 63:
               var10000 = 95;
               break;
            case 64:
               var10000 = 184;
               break;
            case 65:
               var10000 = 99;
               break;
            case 66:
               var10000 = 142;
               break;
            case 67:
               var10000 = 50;
               break;
            case 68:
               var10000 = 173;
               break;
            case 69:
               var10000 = 215;
               break;
            case 70:
               var10000 = 130;
               break;
            case 71:
               var10000 = 43;
               break;
            case 72:
               var10000 = 235;
               break;
            case 73:
               var10000 = 149;
               break;
            case 74:
               var10000 = 45;
               break;
            case 75:
               var10000 = 80;
               break;
            case 76:
               var10000 = 104;
               break;
            case 77:
               var10000 = 182;
               break;
            case 78:
               var10000 = 158;
               break;
            case 79:
               var10000 = 245;
               break;
            case 80:
               var10000 = 197;
               break;
            case 81:
               var10000 = 6;
               break;
            case 82:
               var10000 = 42;
               break;
            case 83:
               var10000 = 199;
               break;
            case 84:
               var10000 = 38;
               break;
            case 85:
               var10000 = 51;
               break;
            case 86:
               var10000 = 234;
               break;
            case 87:
               var10000 = 156;
               break;
            case 88:
               var10000 = 186;
               break;
            case 89:
               var10000 = 25;
               break;
            case 90:
               var10000 = 242;
               break;
            case 91:
               var10000 = 218;
               break;
            case 92:
               var10000 = 150;
               break;
            case 93:
               var10000 = 72;
               break;
            case 94:
               var10000 = 67;
               break;
            case 95:
               var10000 = 154;
               break;
            case 96:
               var10000 = 164;
               break;
            case 97:
               var10000 = 115;
               break;
            case 98:
               var10000 = 116;
               break;
            case 99:
               var10000 = 223;
               break;
            case 100:
               var10000 = 233;
               break;
            case 101:
               var10000 = 48;
               break;
            case 102:
               var10000 = 178;
               break;
            case 103:
               var10000 = 232;
               break;
            case 104:
               var10000 = 60;
               break;
            case 105:
               var10000 = 226;
               break;
            case 106:
               var10000 = 160;
               break;
            case 107:
               var10000 = 15;
               break;
            case 108:
               var10000 = 238;
               break;
            case 109:
               var10000 = 13;
               break;
            case 110:
               var10000 = 203;
               break;
            case 111:
               var10000 = 133;
               break;
            case 112:
               var10000 = 162;
               break;
            case 113:
               var10000 = 17;
               break;
            case 114:
               var10000 = 33;
               break;
            case 115:
               var10000 = 70;
               break;
            case 116:
               var10000 = 201;
               break;
            case 117:
               var10000 = 211;
               break;
            case 118:
               var10000 = 159;
               break;
            case 119:
               var10000 = 12;
               break;
            case 120:
               var10000 = 176;
               break;
            case 121:
               var10000 = 161;
               break;
            case 122:
               var10000 = 81;
               break;
            case 123:
               var10000 = 23;
               break;
            case 124:
               var10000 = 22;
               break;
            case 125:
               var10000 = 167;
               break;
            case 126:
               var10000 = 110;
               break;
            case 127:
               var10000 = 108;
               break;
            case 128:
               var10000 = 103;
               break;
            case 129:
               var10000 = 204;
               break;
            case 130:
               var10000 = 71;
               break;
            case 131:
               var10000 = 214;
               break;
            case 132:
               var10000 = 180;
               break;
            case 133:
               var10000 = 105;
               break;
            case 134:
               var10000 = 24;
               break;
            case 135:
               var10000 = 7;
               break;
            case 136:
               var10000 = 41;
               break;
            case 137:
               var10000 = 198;
               break;
            case 138:
               var10000 = 134;
               break;
            case 139:
               var10000 = 153;
               break;
            case 140:
               var10000 = 5;
               break;
            case 141:
               var10000 = 166;
               break;
            case 142:
               var10000 = 200;
               break;
            case 143:
               var10000 = 88;
               break;
            case 144:
               var10000 = 39;
               break;
            case 145:
               var10000 = 170;
               break;
            case 146:
               var10000 = 145;
               break;
            case 147:
               var10000 = 10;
               break;
            case 148:
               var10000 = 114;
               break;
            case 149:
               var10000 = 147;
               break;
            case 150:
               var10000 = 37;
               break;
            case 151:
               var10000 = 82;
               break;
            case 152:
               var10000 = 78;
               break;
            case 153:
               var10000 = 66;
               break;
            case 154:
               var10000 = 96;
               break;
            case 155:
               var10000 = 124;
               break;
            case 156:
               var10000 = 8;
               break;
            case 157:
               var10000 = 83;
               break;
            case 158:
               var10000 = 90;
               break;
            case 159:
               var10000 = 231;
               break;
            case 160:
               var10000 = 135;
               break;
            case 161:
               var10000 = 47;
               break;
            case 162:
               var10000 = 100;
               break;
            case 163:
               var10000 = 64;
               break;
            case 164:
               var10000 = 65;
               break;
            case 165:
               var10000 = 52;
               break;
            case 166:
               var10000 = 183;
               break;
            case 167:
               var10000 = 97;
               break;
            case 168:
               var10000 = 73;
               break;
            case 169:
               var10000 = 3;
               break;
            case 170:
               var10000 = 20;
               break;
            case 171:
               var10000 = 229;
               break;
            case 172:
               var10000 = 228;
               break;
            case 173:
               var10000 = 236;
               break;
            case 174:
               var10000 = 120;
               break;
            case 175:
               var10000 = 212;
               break;
            case 176:
               var10000 = 31;
               break;
            case 177:
               var10000 = 151;
               break;
            case 178:
               var10000 = 140;
               break;
            case 179:
               var10000 = 254;
               break;
            case 180:
               var10000 = 213;
               break;
            case 181:
               var10000 = 143;
               break;
            case 182:
               var10000 = 196;
               break;
            case 183:
               var10000 = 224;
               break;
            case 184:
               var10000 = 227;
               break;
            case 185:
               var10000 = 119;
               break;
            case 186:
               var10000 = 57;
               break;
            case 187:
               var10000 = 93;
               break;
            case 188:
               var10000 = 192;
               break;
            case 189:
               var10000 = 32;
               break;
            case 190:
               var10000 = 59;
               break;
            case 191:
               var10000 = 79;
               break;
            case 192:
               var10000 = 16;
               break;
            case 193:
               var10000 = 241;
               break;
            case 194:
               var10000 = 56;
               break;
            case 195:
               var10000 = 91;
               break;
            case 196:
               var10000 = 209;
               break;
            case 197:
               var10000 = 189;
               break;
            case 198:
               var10000 = 77;
               break;
            case 199:
               var10000 = 193;
               break;
            case 200:
               var10000 = 86;
               break;
            case 201:
               var10000 = 249;
               break;
            case 202:
               var10000 = 188;
               break;
            case 203:
               var10000 = 117;
               break;
            case 204:
               var10000 = 205;
               break;
            case 205:
               var10000 = 101;
               break;
            case 206:
               var10000 = 208;
               break;
            case 207:
               var10000 = 19;
               break;
            case 208:
               var10000 = 128;
               break;
            case 209:
               var10000 = 220;
               break;
            case 210:
               var10000 = 141;
               break;
            case 211:
               var10000 = 221;
               break;
            case 212:
               var10000 = 210;
               break;
            case 213:
               var10000 = 125;
               break;
            case 214:
               var10000 = 222;
               break;
            case 215:
               var10000 = 216;
               break;
            case 216:
               var10000 = 44;
               break;
            case 217:
               var10000 = 202;
               break;
            case 218:
               var10000 = 63;
               break;
            case 219:
               var10000 = 122;
               break;
            case 220:
               var10000 = 168;
               break;
            case 221:
               var10000 = 98;
               break;
            case 222:
               var10000 = 112;
               break;
            case 223:
               var10000 = 152;
               break;
            case 224:
               var10000 = 240;
               break;
            case 225:
               var10000 = 146;
               break;
            case 226:
               var10000 = 177;
               break;
            case 227:
               var10000 = 138;
               break;
            case 228:
               var10000 = 148;
               break;
            case 229:
               var10000 = 247;
               break;
            case 230:
               var10000 = 244;
               break;
            case 231:
               var10000 = 250;
               break;
            case 232:
               var10000 = 26;
               break;
            case 233:
               var10000 = 194;
               break;
            case 234:
               var10000 = 217;
               break;
            case 235:
               var10000 = 207;
               break;
            case 236:
               var10000 = 165;
               break;
            case 237:
               var10000 = 29;
               break;
            case 238:
               var10000 = 171;
               break;
            case 239:
               var10000 = 55;
               break;
            case 240:
               var10000 = 118;
               break;
            case 241:
               var10000 = 106;
               break;
            case 242:
               var10000 = 62;
               break;
            case 243:
               var10000 = 87;
               break;
            case 244:
               var10000 = 136;
               break;
            case 245:
               var10000 = 191;
               break;
            case 246:
               var10000 = 225;
               break;
            case 247:
               var10000 = 14;
               break;
            case 248:
               var10000 = 40;
               break;
            case 249:
               var10000 = 21;
               break;
            case 250:
               var10000 = 35;
               break;
            case 251:
               var10000 = 253;
               break;
            case 252:
               var10000 = 131;
               break;
            case 253:
               var10000 = 237;
               break;
            case 254:
               var10000 = 74;
               break;
            default:
               var10000 = 9;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23696;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16395) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[8];
      int var19 = 0;
      String var18 = "inÙÏ\u0005¨uMñ*\u0005\u001f\u001d\u0017¡z\u0005IMqö\u00ad0\u008a\u001c×VÌþ\u0080gò\u0099\tëv!s¬É9´¬7\u0087\u001dô\u0004Æ·À\u0083K\r\u000e\u000ePþäG/\u0004Ïß\u0080«\u008a¾Þù\u00130\u0082\u0002Ö\u0095ì\u0086\u0084hrx\u0019×t¦3\\Á'µo\u0017ÿ\u0019û\u0084'§ü\u0081ÌMþ\u0006Nÿ'gW\u0000À_a»¶¼Y¹ã";
      int var20 = "inÙÏ\u0005¨uMñ*\u0005\u001f\u001d\u0017¡z\u0005IMqö\u00ad0\u008a\u001c×VÌþ\u0080gò\u0099\tëv!s¬É9´¬7\u0087\u001dô\u0004Æ·À\u0083K\r\u000e\u000ePþäG/\u0004Ïß\u0080«\u008a¾Þù\u00130\u0082\u0002Ö\u0095ì\u0086\u0084hrx\u0019×t¦3\\Á'µo\u0017ÿ\u0019û\u0084'§ü\u0081ÌMþ\u0006Nÿ'gW\u0000À_a»¶¼Y¹ã"
         .length();
      char var17 = 4;
      int var32 = -1;

      label88:
      while (true) {
         byte var10000 = 30;
         String var10001 = var18.substring(++var32, var32 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var52;
            label83: {
               char[] var60 = var10001.toCharArray();
               int var10004 = var60.length;
               int var22 = 0;
               byte var63 = var10000;
               var52 = var60;
               int var40 = var10004;
               byte var72;
               char[] var80;
               int var10006;
               if (var10004 <= 1) {
                  var80 = var60;
                  var72 = var10000;
                  var10006 = var22;
               } else {
                  var63 = var10000;
                  var40 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var80 = var60;
                  var72 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var89 = var80[var10006];
                  byte var90;
                  switch (var22 % 7) {
                     case 0:
                        var90 = 112;
                        break;
                     case 1:
                        var90 = 75;
                        break;
                     case 2:
                        var90 = 54;
                        break;
                     case 3:
                        var90 = 60;
                        break;
                     case 4:
                        var90 = 10;
                        break;
                     case 5:
                        var90 = 60;
                        break;
                     default:
                        var90 = 113;
                  }

                  var80[var10006] = (char)(var89 ^ var72 ^ var90);
                  var22++;
                  if (var63 == 0) {
                     var10006 = var63;
                     var80 = var52;
                     var72 = var63;
                  } else {
                     if (var40 <= var22) {
                        break;
                     }

                     var80 = var52;
                     var72 = var63;
                     var10006 = var22;
                  }
               }
            }

            String var65 = new String(var52).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var65;
                  if ((var32 += var17) >= var20) {
                     a = var21;
                     b = new String[8];
                     long var8 = 3507457910665409463L;
                     long[] var14 = new long[4];
                     int var11 = 0;
                     String var12 = "s\\·9µòþ\r\bÌx\u000e\u0085V¥\u0096";
                     int var13 = "s\\·9µòþ\r\bÌx\u000e\u0085V¥\u0096".length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var42 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var42, var10).getBytes("ISO-8859-1");
                        long[] var34 = var14;
                        int var43 = var11++;
                        long var56 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var66 = -1;

                        while (true) {
                           long var77 = var56 ^ var8;
                           switch (var66) {
                              case 0:
                                 var34[var43] = var77;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[4];
                                    long var0 = 1534900869834763428L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "r6òY\tÅ\u0084C\u0011¤áþ\u001a\u009c'%";
                                    int var5 = "r6òY\tÅ\u0084C\u0011¤áþ\u001a\u009c'%".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var45 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
                                       long[] var35 = var6;
                                       int var46 = var3++;
                                       long var58 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var68 = -1;

                                       while (true) {
                                          var77 = var58 ^ var0;
                                          switch (var68) {
                                             case 0:
                                                var35[var46] = var77;
                                                if (var2 >= var5) {
                                                   e = var6;
                                                   f = new Long[4];
                                                   com.finalshell.reflect.Registry.packArgs(a(21615, 3395));
                                                   long var23 = 517287540690064504L;
                                                   com.finalshell.reflect.Registry.lookupField(381524296324133692L)
                                                      .set(null, Ref.h2(517287540690064504L, var23));
                                                   com.finalshell.reflect.Registry.packArgs(a(21614, 3148));
                                                   long var25 = 517287540690064504L;
                                                   com.finalshell.reflect.Registry.lookupField(367612586935092048L)
                                                      .set(null, Ref.h2(517287540690064504L, var25));
                                                   com.finalshell.reflect.Registry.packArgs(a(21612, 5939));
                                                   long var27 = 517287540690064504L;
                                                   com.finalshell.reflect.Registry.lookupField(149525762923151185L)
                                                      .set(null, Ref.h2(517287540690064504L, var27));
                                                   com.finalshell.reflect.Registry.lookupField(434787546011183607L)
                                                      .set(null, com.finalshell.reflect.Registry.lookupField(367612586935092048L).get(null));
                                                   return;
                                                }
                                                break;
                                             default:
                                                var35[var46] = var77;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "7³nÕ\u0094\u001d\u0005\u001fr\u0019dÎÎ%/\u0003";
                                                var5 = "7³nÕ\u0094\u001d\u0005\u001fr\u0019dÎÎ%/\u0003".length();
                                                var2 = 0;
                                          }

                                          byte var47 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                          var35 = var6;
                                          var46 = var3++;
                                          var58 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var68 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var34[var43] = var77;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "»dx¯¿\b\u009bØ§Ç\u007f8ÔOí\u0006";
                                 var13 = "»dx¯¿\b\u009bØ§Ç\u007f8ÔOí\u0006".length();
                                 var10 = 0;
                           }

                           byte var44 = var10;
                           var10 += 8;
                           var15 = var12.substring(var44, var10).getBytes("ISO-8859-1");
                           var34 = var14;
                           var43 = var11++;
                           var56 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var66 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var32);
                  break;
               default:
                  var21[var19++] = var65;
                  if ((var32 += var17) < var20) {
                     var17 = var18.charAt(var32);
                     continue label88;
                  }

                  var18 = "ÕÃÉ\u0097Éç²0©}¥D(;\u001c<¿¡a\u0099\u0006\u0094\u0082\u0007´\u0086\u0004ÏxÀ\u0098~\u0083\u009fÊ\u0091%º\r6>\u0093Ä\u001ai0`¹&! ²ï)ZÊ^»}\u007f\u0082\u001bQrõ0ÄØÑ\u008cmEN¢ÓM";
                  var20 = "ÕÃÉ\u0097Éç²0©}¥D(;\u001c<¿¡a\u0099\u0006\u0094\u0082\u0007´\u0086\u0004ÏxÀ\u0098~\u0083\u009fÊ\u0091%º\r6>\u0093Ä\u001ai0`¹&! ²ï)ZÊ^»}\u007f\u0082\u001bQrõ0ÄØÑ\u008cmEN¢ÓM"
                     .length();
                  var17 = 15;
                  var32 = -1;
            }

            var10000 = 107;
            var10001 = var18.substring(++var32, var32 + var17);
            var10002 = 0;
         }
      }
   }
}





