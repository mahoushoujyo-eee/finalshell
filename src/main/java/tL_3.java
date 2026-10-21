import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.socket.PlainConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.config.Registry;
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.http.io.SocketConfig;
import org.apache.hc.core5.pool.PoolConcurrencyPolicy;
import org.apache.hc.core5.pool.PoolReusePolicy;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.TimeValue;

public class tL_3 {
   String e;
   HttpClient d;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] f;
   private static final long[] g;
   private static final Long[] h;

   public tL_3() {
      Object[] var10001 = com.c.a(a(-7474, 9651));
      Method var2 = com.c.d(517287540690064504L);
      Object[] var5 = var10001;
      Object var4 = null;

      try {
         var10001 = (Object[])var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(457982698878206003L).set(this, var10001);
   }

   public HttpClient F() {
      HttpClientBuilder var2 = HttpClients.custom();
      var2.disableAutomaticRetries();
      var2.disableRedirectHandling();
      var2.setKeepAliveStrategy(new WV());
      yV_3 var3 = new yV_3(this);
      dA_3.q();
      SSLContext var4 = SSLContexts.createSystemDefault();
      Registry var5 = RegistryBuilder.<PlainConnectionSocketFactory>create()
         .register(a(-7476, -23222), PlainConnectionSocketFactory.INSTANCE)
         .register(a(-7473, 16784), new SSLConnectionSocketFactory(var4))
         .build();
      PoolingHttpClientConnectionManager var6 = new PoolingHttpClientConnectionManager(
         var5, PoolConcurrencyPolicy.STRICT, PoolReusePolicy.LIFO, TimeValue.ofMinutes(b(32428, 3707881505874886973L)), null, var3, null
      );
      var6.setMaxTotal(a(11984, 6439027342389080325L));
      var6.setDefaultMaxPerRoute(a(29029, 8468272075680132785L));
      SocketConfig var7 = SocketConfig.custom().setSoKeepAlive(true).setTcpNoDelay(true).setSoReuseAddress(true).build();
      var6.setDefaultSocketConfig(var7);
      var2.setConnectionManager(var6);
      var2.setDefaultRequestConfig(
         RequestConfig.custom()
            .setConnectTimeout(b(27854, 4248411583100900188L), TimeUnit.MILLISECONDS)
            .setConnectionRequestTimeout(b(14271, 1119984585618720815L), TimeUnit.MILLISECONDS)
            .build()
      );
      CloseableHttpClient var8 = var2.build();

      try {
         if (com.ky_4.F() != null) {
            dA_3.r(new String[5]);
         }

         return var8;
      } catch (ArrayIndexOutOfBoundsException var9) {
         throw a(var9);
      }
   }

   public byte[] L(String var1) throws Exception {
      Object[] var10001 = com.c.a(com.c.c(262738112449243103L).get(this), var1);
      Method var10003 = com.c.d(180374036209255532L);
      Object[] var10002 = var10001;
      tL_3 var3 = this;
      Method var10000 = var10003;

      try {
         return (byte[])var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public byte[] Q(HttpClient var1, String var2) {
      String[] var10000 = dA_3.q();
      byte[] var4 = null;
      String[] var3 = var10000;
      HttpGet var5 = new HttpGet(var2);

      try {
         long var21 = System.currentTimeMillis();
         CloseableHttpResponse var8 = (CloseableHttpResponse)var1.execute(var5);
         HttpEntity var9 = var8.getEntity();
         InputStream var10 = var9.getContent();
         int var11 = var8.getCode();
         DataInputStream var12 = new DataInputStream(var10);
         ByteArrayOutputStream var13 = new ByteArrayOutputStream();
         byte[] var14 = new byte[a(13705, 4538711414556027487L)];
         int var15 = 0;

         label55: {
            while ((var15 = var12.read(var14)) > 0) {
               try {
                  var24 = var13;
                  if (var3 != null) {
                     break label55;
                  }

                  var13.write(var14, 0, var15);
                  if (var3 != null) {
                     break;
                  }
               } catch (Exception var19) {
                  throw a(var19);
               }
            }

            var24 = var13;
         }

         var4 = var24.toByteArray();
         var13.close();
         var10.close();
      } catch (Exception var20) {
         Exception var6 = var20;

         label42: {
            try {
               var23 = var6 instanceof IOException;
               if (var3 != null) {
                  break label42;
               }

               if (!var23) {
                  return var4;
               }
            } catch (Exception var18) {
               throw a(var18);
            }

            try {
               var23 = var5.getUri().getHost().equals((String)com.c.c(457982698878206003L).get(this));
            } catch (URISyntaxException var17) {
               boolean var10001 = false;
               return var4;
            }
         }

         try {
            if (var23) {
            }
         } catch (URISyntaxException var16) {
            boolean var25 = false;
         }
      }

      return var4;
   }

   public com.O0 K(com.O0 var1, String var2, HttpClient var3) throws IOException {
      byte[] var4 = var1.toString().getBytes(a(-7479, -2859));
      Object[] var10001 = com.c.a(var4, var2, var3, 3);
      Method var10003 = com.c.d(444236696396461940L);
      Object[] var10002 = var10001;
      tL_3 var10 = this;
      Method var10000 = var10003;

      try {
         var9 = (byte[])var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      byte[] var5 = var9;
      String var6 = new String(var5, a(-7480, -32744));
      return com.O0.y(var6);
   }

   public byte[] m(byte[] param1, String param2, HttpClient param3, int param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic dA_3.q ()[Ljava/lang/String;
      // 003: bipush 0
      // 004: istore 6
      // 006: bipush 0
      // 007: istore 7
      // 009: astore 5
      // 00b: aconst_null
      // 00c: astore 8
      // 00e: aload 1
      // 00f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 012: ldc2_w 129862144128276763
      // 015: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 018: swap
      // 019: aconst_null
      // 01a: swap
      // 01b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 01e: checkcast [B
      // 021: goto 028
      // 024: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 027: athrow
      // 028: astore 1
      // 029: goto 033
      // 02c: astore 9
      // 02e: aload 9
      // 030: invokevirtual java/lang/Exception.printStackTrace ()V
      // 033: aconst_null
      // 034: astore 9
      // 036: iload 6
      // 038: iload 4
      // 03a: if_icmpge 206
      // 03d: iinc 6 1
      // 040: new org/apache/hc/client5/http/classic/methods/HttpPost
      // 043: dup
      // 044: aload 2
      // 045: invokespecial org/apache/hc/client5/http/classic/methods/HttpPost.<init> (Ljava/lang/String;)V
      // 048: astore 10
      // 04a: aconst_null
      // 04b: astore 11
      // 04d: new org/apache/hc/core5/http/io/entity/ByteArrayEntity
      // 050: dup
      // 051: aload 1
      // 052: getstatic org/apache/hc/core5/http/ContentType.DEFAULT_BINARY Lorg/apache/hc/core5/http/ContentType;
      // 055: invokespecial org/apache/hc/core5/http/io/entity/ByteArrayEntity.<init> ([BLorg/apache/hc/core5/http/ContentType;)V
      // 058: astore 12
      // 05a: sipush 8553
      // 05d: aload 10
      // 05f: aload 12
      // 061: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.setEntity (Lorg/apache/hc/core5/http/HttpEntity;)V
      // 064: ldc2_w 2475277870912863934
      // 067: aload 3
      // 068: aload 10
      // 06a: invokeinterface org/apache/hc/client5/http/classic/HttpClient.execute (Lorg/apache/hc/core5/http/ClassicHttpRequest;)Lorg/apache/hc/core5/http/HttpResponse; 2
      // 06f: checkcast org/apache/hc/client5/http/impl/classic/CloseableHttpResponse
      // 072: astore 13
      // 074: aload 13
      // 076: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getEntity ()Lorg/apache/hc/core5/http/HttpEntity;
      // 079: astore 14
      // 07b: aload 14
      // 07d: invokeinterface org/apache/hc/core5/http/HttpEntity.getContent ()Ljava/io/InputStream; 1
      // 082: astore 15
      // 084: new java/io/DataInputStream
      // 087: dup
      // 088: aload 15
      // 08a: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 08d: astore 11
      // 08f: new java/io/ByteArrayOutputStream
      // 092: dup
      // 093: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 096: astore 16
      // 098: bipush 0
      // 099: istore 17
      // 09b: invokestatic tL_3.a (IJ)I
      // 09e: newarray 8
      // 0a0: astore 18
      // 0a2: aload 15
      // 0a4: aload 18
      // 0a6: invokevirtual java/io/InputStream.read ([B)I
      // 0a9: dup
      // 0aa: istore 17
      // 0ac: bipush -1
      // 0ad: if_icmple 0cb
      // 0b0: aload 16
      // 0b2: aload 18
      // 0b4: bipush 0
      // 0b5: iload 17
      // 0b7: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0ba: aload 5
      // 0bc: ifnonnull 0f4
      // 0bf: aload 5
      // 0c1: ifnull 0a2
      // 0c4: goto 0cb
      // 0c7: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 16
      // 0cd: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0d0: astore 8
      // 0d2: aload 8
      // 0d4: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d7: ldc2_w 356223458641838477
      // 0da: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0dd: swap
      // 0de: aconst_null
      // 0df: swap
      // 0e0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e3: checkcast [B
      // 0e6: goto 0ed
      // 0e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: astore 8
      // 0ef: aload 16
      // 0f1: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 0f4: goto 128
      // 0f7: astore 19
      // 0f9: aload 19
      // 0fb: aload 5
      // 0fd: ifnonnull 208
      // 100: astore 9
      // 102: aload 16
      // 104: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 107: aload 11
      // 109: ifnull 206
      // 10c: aload 11
      // 10e: invokevirtual java/io/DataInputStream.close ()V
      // 111: goto 206
      // 114: astore 20
      // 116: aload 20
      // 118: invokevirtual java/io/IOException.printStackTrace ()V
      // 11b: goto 206
      // 11e: astore 21
      // 120: aload 16
      // 122: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 125: aload 21
      // 127: athrow
      // 128: bipush 1
      // 129: istore 7
      // 12b: aload 11
      // 12d: aload 5
      // 12f: ifnonnull 13e
      // 132: ifnull 206
      // 135: goto 13c
      // 138: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: aload 11
      // 13e: invokevirtual java/io/DataInputStream.close ()V
      // 141: goto 206
      // 144: astore 19
      // 146: aload 19
      // 148: invokevirtual java/io/IOException.printStackTrace ()V
      // 14b: goto 206
      // 14e: astore 12
      // 150: aload 5
      // 152: ifnonnull 1af
      // 155: aload 12
      // 157: instanceof java/io/IOException
      // 15a: ifeq 1a3
      // 15d: goto 164
      // 160: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: iload 6
      // 166: aload 5
      // 168: ifnonnull 196
      // 16b: goto 172
      // 16e: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: bipush 2
      // 173: if_icmpne 1a3
      // 176: goto 17d
      // 179: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 10
      // 17f: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.getUri ()Ljava/net/URI;
      // 182: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 185: aload 0
      // 186: ldc2_w 457982698878206003
      // 189: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 18c: swap
      // 18d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 190: checkcast java/lang/String
      // 193: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 196: ifeq 199
      // 199: goto 1a3
      // 19c: astore 13
      // 19e: aload 13
      // 1a0: invokevirtual java/net/URISyntaxException.printStackTrace ()V
      // 1a3: sipush 29272
      // 1a6: ldc2_w 7358110075891994059
      // 1a9: invokestatic tL_3.b (IJ)J
      // 1ac: invokestatic java/lang/Thread.sleep (J)V
      // 1af: goto 1b9
      // 1b2: astore 13
      // 1b4: aload 13
      // 1b6: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1b9: aload 11
      // 1bb: aload 5
      // 1bd: ifnonnull 1cc
      // 1c0: ifnull 201
      // 1c3: goto 1ca
      // 1c6: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: aload 11
      // 1cc: invokevirtual java/io/DataInputStream.close ()V
      // 1cf: goto 201
      // 1d2: astore 12
      // 1d4: aload 12
      // 1d6: invokevirtual java/io/IOException.printStackTrace ()V
      // 1d9: goto 201
      // 1dc: astore 22
      // 1de: aload 11
      // 1e0: aload 5
      // 1e2: ifnonnull 1f1
      // 1e5: ifnull 1fe
      // 1e8: goto 1ef
      // 1eb: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 11
      // 1f1: invokevirtual java/io/DataInputStream.close ()V
      // 1f4: goto 1fe
      // 1f7: astore 23
      // 1f9: aload 23
      // 1fb: invokevirtual java/io/IOException.printStackTrace ()V
      // 1fe: aload 22
      // 200: athrow
      // 201: aload 5
      // 203: ifnull 036
      // 206: aload 9
      // 208: aload 5
      // 20a: ifnonnull 219
      // 20d: ifnull 21a
      // 210: goto 217
      // 213: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: aload 9
      // 219: athrow
      // 21a: iload 7
      // 21c: ifne 234
      // 21f: new java/io/IOException
      // 222: dup
      // 223: sipush -7475
      // 226: sipush -10383
      // 229: invokestatic tL_3.a (II)Ljava/lang/String;
      // 22c: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 22f: athrow
      // 230: invokestatic tL_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: aload 8
      // 236: areturn
   }

   public HttpClient r() {
      return (HttpClient)com.c.c(262738112449243103L).get(this);
   }

   public void a(HttpClient var1) {
      com.c.c(262738112449243103L).set(this, var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[6];
      int var19 = 0;
      String var18 = "<úþØÆü\u0083^\"º¼UùÉ+\u0004SéO\u008c\u0005Ãó]Ï\u00010\u0004\u009a×5þ»Í\u0019-\u0087A\u001aV\u0014¡|B\u0090÷°TÒ\u0007\u008fô\u009b\u0080`³)ÚñÆ\u0086ìès\u007f1÷P\u008c\u008c}\u008b\u0093m\u0093";
      int var20 = "<úþØÆü\u0083^\"º¼UùÉ+\u0004SéO\u008c\u0005Ãó]Ï\u00010\u0004\u009a×5þ»Í\u0019-\u0087A\u001aV\u0014¡|B\u0090÷°TÒ\u0007\u008fô\u009b\u0080`³)ÚñÆ\u0086ìès\u007f1÷P\u008c\u008c}\u008b\u0093m\u0093"
         .length();
      char var17 = 15;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 49;
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
                        var84 = 73;
                        break;
                     case 1:
                        var84 = 50;
                        break;
                     case 2:
                        var84 = 10;
                        break;
                     case 3:
                        var84 = 106;
                        break;
                     case 4:
                        var84 = 117;
                        break;
                     case 5:
                        var84 = 21;
                        break;
                     default:
                        var84 = 95;
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
                     b = new String[6];
                     long var8 = 3821258940242515560L;
                     long[] var14 = new long[4];
                     int var11 = 0;
                     String var12 = "ãMçP\u009do¸7ôDãPwÕ«>";
                     int var13 = "ãMçP\u009do¸7ôDãPwÕ«>".length();
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
                                    c = var14;
                                    f = new Integer[4];
                                    long var0 = 8301651899344201709L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "|¿\u0098`îì\bÒ@@nþ\u0087²fÕ";
                                    int var5 = "|¿\u0098`îì\bÒ@@nþ\u0087²fÕ".length();
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
                                                   g = var6;
                                                   h = new Long[4];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "IÀ\u0007¸{9Ó¡\u0015(&J\u0016\u0098a\u009e";
                                                var5 = "IÀ\u0007¸{9Ó¡\u0015(&J\u0016\u0098a\u009e".length();
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

                                 var12 = "ô£å\u009a\u009b¶øÓÛRÅ(=Ð'\t";
                                 var13 = "ô£å\u009a\u009b¶øÓÛRÅ(=Ð'\t".length();
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

                  var18 = "\u001b\u0082\u0094Â]\u0005N\u009c>\u0001\b";
                  var20 = "\u001b\u0082\u0094Â]\u0005N\u009c>\u0001\b".length();
                  var17 = 5;
                  var26 = -1;
            }

            var10000 = 65;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7475) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 168;
               break;
            case 1:
               var10000 = 98;
               break;
            case 2:
               var10000 = 185;
               break;
            case 3:
               var10000 = 198;
               break;
            case 4:
               var10000 = 232;
               break;
            case 5:
               var10000 = 37;
               break;
            case 6:
               var10000 = 190;
               break;
            case 7:
               var10000 = 219;
               break;
            case 8:
               var10000 = 199;
               break;
            case 9:
               var10000 = 51;
               break;
            case 10:
               var10000 = 35;
               break;
            case 11:
               var10000 = 239;
               break;
            case 12:
               var10000 = 121;
               break;
            case 13:
               var10000 = 224;
               break;
            case 14:
               var10000 = 161;
               break;
            case 15:
               var10000 = 211;
               break;
            case 16:
               var10000 = 75;
               break;
            case 17:
               var10000 = 20;
               break;
            case 18:
               var10000 = 255;
               break;
            case 19:
               var10000 = 111;
               break;
            case 20:
               var10000 = 201;
               break;
            case 21:
               var10000 = 132;
               break;
            case 22:
               var10000 = 76;
               break;
            case 23:
               var10000 = 254;
               break;
            case 24:
               var10000 = 191;
               break;
            case 25:
               var10000 = 180;
               break;
            case 26:
               var10000 = 24;
               break;
            case 27:
               var10000 = 2;
               break;
            case 28:
               var10000 = 65;
               break;
            case 29:
               var10000 = 44;
               break;
            case 30:
               var10000 = 72;
               break;
            case 31:
               var10000 = 172;
               break;
            case 32:
               var10000 = 252;
               break;
            case 33:
               var10000 = 176;
               break;
            case 34:
               var10000 = 1;
               break;
            case 35:
               var10000 = 247;
               break;
            case 36:
               var10000 = 43;
               break;
            case 37:
               var10000 = 160;
               break;
            case 38:
               var10000 = 250;
               break;
            case 39:
               var10000 = 84;
               break;
            case 40:
               var10000 = 205;
               break;
            case 41:
               var10000 = 70;
               break;
            case 42:
               var10000 = 118;
               break;
            case 43:
               var10000 = 7;
               break;
            case 44:
               var10000 = 99;
               break;
            case 45:
               var10000 = 136;
               break;
            case 46:
               var10000 = 97;
               break;
            case 47:
               var10000 = 78;
               break;
            case 48:
               var10000 = 86;
               break;
            case 49:
               var10000 = 179;
               break;
            case 50:
               var10000 = 253;
               break;
            case 51:
               var10000 = 213;
               break;
            case 52:
               var10000 = 184;
               break;
            case 53:
               var10000 = 15;
               break;
            case 54:
               var10000 = 158;
               break;
            case 55:
               var10000 = 206;
               break;
            case 56:
               var10000 = 236;
               break;
            case 57:
               var10000 = 212;
               break;
            case 58:
               var10000 = 145;
               break;
            case 59:
               var10000 = 62;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 151;
               break;
            case 62:
               var10000 = 215;
               break;
            case 63:
               var10000 = 103;
               break;
            case 64:
               var10000 = 4;
               break;
            case 65:
               var10000 = 246;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 177;
               break;
            case 68:
               var10000 = 59;
               break;
            case 69:
               var10000 = 14;
               break;
            case 70:
               var10000 = 229;
               break;
            case 71:
               var10000 = 106;
               break;
            case 72:
               var10000 = 0;
               break;
            case 73:
               var10000 = 223;
               break;
            case 74:
               var10000 = 208;
               break;
            case 75:
               var10000 = 150;
               break;
            case 76:
               var10000 = 77;
               break;
            case 77:
               var10000 = 112;
               break;
            case 78:
               var10000 = 202;
               break;
            case 79:
               var10000 = 23;
               break;
            case 80:
               var10000 = 166;
               break;
            case 81:
               var10000 = 178;
               break;
            case 82:
               var10000 = 143;
               break;
            case 83:
               var10000 = 226;
               break;
            case 84:
               var10000 = 183;
               break;
            case 85:
               var10000 = 139;
               break;
            case 86:
               var10000 = 8;
               break;
            case 87:
               var10000 = 32;
               break;
            case 88:
               var10000 = 33;
               break;
            case 89:
               var10000 = 28;
               break;
            case 90:
               var10000 = 31;
               break;
            case 91:
               var10000 = 3;
               break;
            case 92:
               var10000 = 101;
               break;
            case 93:
               var10000 = 216;
               break;
            case 94:
               var10000 = 91;
               break;
            case 95:
               var10000 = 240;
               break;
            case 96:
               var10000 = 248;
               break;
            case 97:
               var10000 = 163;
               break;
            case 98:
               var10000 = 108;
               break;
            case 99:
               var10000 = 131;
               break;
            case 100:
               var10000 = 182;
               break;
            case 101:
               var10000 = 93;
               break;
            case 102:
               var10000 = 21;
               break;
            case 103:
               var10000 = 100;
               break;
            case 104:
               var10000 = 162;
               break;
            case 105:
               var10000 = 196;
               break;
            case 106:
               var10000 = 193;
               break;
            case 107:
               var10000 = 115;
               break;
            case 108:
               var10000 = 187;
               break;
            case 109:
               var10000 = 27;
               break;
            case 110:
               var10000 = 125;
               break;
            case 111:
               var10000 = 123;
               break;
            case 112:
               var10000 = 149;
               break;
            case 113:
               var10000 = 29;
               break;
            case 114:
               var10000 = 127;
               break;
            case 115:
               var10000 = 22;
               break;
            case 116:
               var10000 = 242;
               break;
            case 117:
               var10000 = 47;
               break;
            case 118:
               var10000 = 10;
               break;
            case 119:
               var10000 = 209;
               break;
            case 120:
               var10000 = 69;
               break;
            case 121:
               var10000 = 57;
               break;
            case 122:
               var10000 = 82;
               break;
            case 123:
               var10000 = 235;
               break;
            case 124:
               var10000 = 124;
               break;
            case 125:
               var10000 = 157;
               break;
            case 126:
               var10000 = 231;
               break;
            case 127:
               var10000 = 88;
               break;
            case 128:
               var10000 = 36;
               break;
            case 129:
               var10000 = 89;
               break;
            case 130:
               var10000 = 197;
               break;
            case 131:
               var10000 = 218;
               break;
            case 132:
               var10000 = 117;
               break;
            case 133:
               var10000 = 110;
               break;
            case 134:
               var10000 = 153;
               break;
            case 135:
               var10000 = 135;
               break;
            case 136:
               var10000 = 80;
               break;
            case 137:
               var10000 = 46;
               break;
            case 138:
               var10000 = 169;
               break;
            case 139:
               var10000 = 234;
               break;
            case 140:
               var10000 = 92;
               break;
            case 141:
               var10000 = 144;
               break;
            case 142:
               var10000 = 85;
               break;
            case 143:
               var10000 = 164;
               break;
            case 144:
               var10000 = 56;
               break;
            case 145:
               var10000 = 200;
               break;
            case 146:
               var10000 = 147;
               break;
            case 147:
               var10000 = 83;
               break;
            case 148:
               var10000 = 30;
               break;
            case 149:
               var10000 = 130;
               break;
            case 150:
               var10000 = 210;
               break;
            case 151:
               var10000 = 38;
               break;
            case 152:
               var10000 = 174;
               break;
            case 153:
               var10000 = 48;
               break;
            case 154:
               var10000 = 26;
               break;
            case 155:
               var10000 = 233;
               break;
            case 156:
               var10000 = 146;
               break;
            case 157:
               var10000 = 221;
               break;
            case 158:
               var10000 = 152;
               break;
            case 159:
               var10000 = 41;
               break;
            case 160:
               var10000 = 155;
               break;
            case 161:
               var10000 = 173;
               break;
            case 162:
               var10000 = 188;
               break;
            case 163:
               var10000 = 122;
               break;
            case 164:
               var10000 = 107;
               break;
            case 165:
               var10000 = 171;
               break;
            case 166:
               var10000 = 81;
               break;
            case 167:
               var10000 = 244;
               break;
            case 168:
               var10000 = 237;
               break;
            case 169:
               var10000 = 195;
               break;
            case 170:
               var10000 = 102;
               break;
            case 171:
               var10000 = 55;
               break;
            case 172:
               var10000 = 61;
               break;
            case 173:
               var10000 = 148;
               break;
            case 174:
               var10000 = 170;
               break;
            case 175:
               var10000 = 222;
               break;
            case 176:
               var10000 = 53;
               break;
            case 177:
               var10000 = 9;
               break;
            case 178:
               var10000 = 71;
               break;
            case 179:
               var10000 = 203;
               break;
            case 180:
               var10000 = 58;
               break;
            case 181:
               var10000 = 67;
               break;
            case 182:
               var10000 = 52;
               break;
            case 183:
               var10000 = 42;
               break;
            case 184:
               var10000 = 90;
               break;
            case 185:
               var10000 = 128;
               break;
            case 186:
               var10000 = 227;
               break;
            case 187:
               var10000 = 189;
               break;
            case 188:
               var10000 = 220;
               break;
            case 189:
               var10000 = 95;
               break;
            case 190:
               var10000 = 49;
               break;
            case 191:
               var10000 = 207;
               break;
            case 192:
               var10000 = 119;
               break;
            case 193:
               var10000 = 156;
               break;
            case 194:
               var10000 = 186;
               break;
            case 195:
               var10000 = 175;
               break;
            case 196:
               var10000 = 87;
               break;
            case 197:
               var10000 = 154;
               break;
            case 198:
               var10000 = 12;
               break;
            case 199:
               var10000 = 17;
               break;
            case 200:
               var10000 = 60;
               break;
            case 201:
               var10000 = 34;
               break;
            case 202:
               var10000 = 126;
               break;
            case 203:
               var10000 = 113;
               break;
            case 204:
               var10000 = 134;
               break;
            case 205:
               var10000 = 94;
               break;
            case 206:
               var10000 = 116;
               break;
            case 207:
               var10000 = 73;
               break;
            case 208:
               var10000 = 243;
               break;
            case 209:
               var10000 = 159;
               break;
            case 210:
               var10000 = 105;
               break;
            case 211:
               var10000 = 79;
               break;
            case 212:
               var10000 = 230;
               break;
            case 213:
               var10000 = 19;
               break;
            case 214:
               var10000 = 18;
               break;
            case 215:
               var10000 = 217;
               break;
            case 216:
               var10000 = 13;
               break;
            case 217:
               var10000 = 251;
               break;
            case 218:
               var10000 = 249;
               break;
            case 219:
               var10000 = 64;
               break;
            case 220:
               var10000 = 5;
               break;
            case 221:
               var10000 = 25;
               break;
            case 222:
               var10000 = 39;
               break;
            case 223:
               var10000 = 138;
               break;
            case 224:
               var10000 = 137;
               break;
            case 225:
               var10000 = 74;
               break;
            case 226:
               var10000 = 194;
               break;
            case 227:
               var10000 = 54;
               break;
            case 228:
               var10000 = 167;
               break;
            case 229:
               var10000 = 63;
               break;
            case 230:
               var10000 = 104;
               break;
            case 231:
               var10000 = 142;
               break;
            case 232:
               var10000 = 228;
               break;
            case 233:
               var10000 = 204;
               break;
            case 234:
               var10000 = 181;
               break;
            case 235:
               var10000 = 50;
               break;
            case 236:
               var10000 = 133;
               break;
            case 237:
               var10000 = 241;
               break;
            case 238:
               var10000 = 109;
               break;
            case 239:
               var10000 = 114;
               break;
            case 240:
               var10000 = 165;
               break;
            case 241:
               var10000 = 68;
               break;
            case 242:
               var10000 = 6;
               break;
            case 243:
               var10000 = 96;
               break;
            case 244:
               var10000 = 192;
               break;
            case 245:
               var10000 = 245;
               break;
            case 246:
               var10000 = 16;
               break;
            case 247:
               var10000 = 225;
               break;
            case 248:
               var10000 = 66;
               break;
            case 249:
               var10000 = 120;
               break;
            case 250:
               var10000 = 129;
               break;
            case 251:
               var10000 = 214;
               break;
            case 252:
               var10000 = 11;
               break;
            case 253:
               var10000 = 45;
               break;
            case 254:
               var10000 = 40;
               break;
            default:
               var10000 = 140;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24534;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16272) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }
}





