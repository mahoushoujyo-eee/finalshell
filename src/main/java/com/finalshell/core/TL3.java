package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.panel.Ky4;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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
import org.apache.hc.core5.http.config.RegistryBuilder;
import org.apache.hc.core5.http.io.SocketConfig;
import org.apache.hc.core5.pool.PoolConcurrencyPolicy;
import org.apache.hc.core5.pool.PoolReusePolicy;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.TimeValue;

public class TL3 {
   public String e;
   public HttpClient d;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] f;
   public static long[] g;
   public static Long[] h;

   public TL3() {
      Registry.packArgs(a(-7474, 9651));
      long var1 = 517287540690064504L;
      Object var10002 = Ref.h2(517287540690064504L, var1);
      long var4 = 457982698878206003L;
      Object var3 = var10002;
      Ref.s(457982698878206003L, var3, var4);
   }

   public HttpClient F() {
      HttpClientBuilder var2 = HttpClients.custom();
      var2.disableAutomaticRetries();
      var2.disableRedirectHandling();
      var2.setKeepAliveStrategy(new WV());
      YV3_2 var3 = new YV3_2(this);
      UpdateFrame.q();
      SSLContext var4 = SSLContexts.createSystemDefault();
      org.apache.hc.core5.http.config.Registry var5 = RegistryBuilder.<PlainConnectionSocketFactory>create()
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
         if (Ky4.F$arrString() != null) {
            UpdateFrame.r(new String[5]);
         }

         return var8;
      } catch (ArrayIndexOutOfBoundsException var9) {
         throw a(var9);
      }
   }

   public byte[] L(String var1) throws Exception {
      Object var2 = 262738112449243103L;
      Object[] var10002 = Registry.packArgs(Ref.g(262738112449243103L, var2), var1);
      long var5 = 180374036209255532L;
      Object[] var4 = var10002;
      var10002 = Ref.h(180374036209255532L, var4, var5);

      try {
         return (byte[])var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public byte[] Q(HttpClient var1, String var2) {
      ByteArrayOutputStream var26;
      String[] var10000 = UpdateFrame.q();
      byte[] var4 = null;
      String[] var3 = var10000;
      HttpGet var5 = new HttpGet(var2);

      try {
         long var23 = System.currentTimeMillis();
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
                  var26 = var13;
                  if (var3 != null) {
                     break label55;
                  }

                  var13.write(var14, 0, var15);
                  if (var3 != null) {
                     break;
                  }
               } catch (Exception var21) {
                  throw a(var21);
               }
            }

            var26 = var13;
         }

         var4 = var26.toByteArray();
         var13.close();
         var10.close();
      } catch (Exception var22) {
         Exception var6 = var22;

         label42: {
            try {
               var10000 = var6 instanceof IOException;
               if (var3 != null) {
                  break label42;
               }

               if (var10000 == null) {
                  return var4;
               }
            } catch (Exception var20) {
               throw a(var20);
            }

            try {
               var10000 = var5.getUri().getHost();
               Object var16 = 457982698878206003L;
               this.equals((String)Ref.g(457982698878206003L, var16));
            } catch (URISyntaxException var19) {
               boolean var10001 = false;
               return var4;
            }
         }

         try {
            if (var10000 == null) {
            }
         } catch (URISyntaxException var18) {
            boolean var27 = false;
         }
      }

      return var4;
   }

   public O0 K(O0 var1, String var2, HttpClient var3) throws IOException {
      byte[] var4 = var1.toString().getBytes(a(-7479, -2859));
      byte[] var10001 = (byte[])(Registry.packArgs(var4, var2, var3, 3));
      long var9 = 444236696396461940L;
      Object var8 = var10001;
      var10001 = Ref.h(444236696396461940L, var8, var9);

      try {
         var10001 = (byte[])var10001;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      byte[] var5 = (byte[])var10001;
      String var6 = new String(var5, a(-7480, -32744));
      return O0.y(var6);
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
      // 000: invokestatic com/finalshell/ui/frame/UpdateFrame.q ()[Ljava/lang/String;
      // 003: bipush 0
      // 004: istore 6
      // 006: bipush 0
      // 007: istore 7
      // 009: astore 5
      // 00b: aconst_null
      // 00c: astore 8
      // 00e: aload 1
      // 00f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 012: ldc2_w 129862144128276763
      // 015: astore 24
      // 017: ldc2_w 129862144128276763
      // 01a: aload 24
      // 01c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01f: checkcast [B
      // 022: goto 029
      // 025: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 028: athrow
      // 029: astore 1
      // 02a: goto 034
      // 02d: astore 9
      // 02f: aload 9
      // 031: invokevirtual java/lang/Exception.printStackTrace ()V
      // 034: aconst_null
      // 035: astore 9
      // 037: iload 6
      // 039: iload 4
      // 03b: if_icmpge 20b
      // 03e: iinc 6 1
      // 041: new org/apache/hc/client5/http/classic/methods/HttpPost
      // 044: dup
      // 045: aload 2
      // 046: invokespecial org/apache/hc/client5/http/classic/methods/HttpPost.<init> (Ljava/lang/String;)V
      // 049: astore 10
      // 04b: aconst_null
      // 04c: astore 11
      // 04e: new org/apache/hc/core5/http/io/entity/ByteArrayEntity
      // 051: dup
      // 052: aload 1
      // 053: getstatic org/apache/hc/core5/http/ContentType.DEFAULT_BINARY Lorg/apache/hc/core5/http/ContentType;
      // 056: invokespecial org/apache/hc/core5/http/io/entity/ByteArrayEntity.<init> ([BLorg/apache/hc/core5/http/ContentType;)V
      // 059: astore 12
      // 05b: sipush 8553
      // 05e: aload 10
      // 060: aload 12
      // 062: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.setEntity (Lorg/apache/hc/core5/http/HttpEntity;)V
      // 065: ldc2_w 2475277870912863934
      // 068: aload 3
      // 069: aload 10
      // 06b: invokeinterface org/apache/hc/client5/http/classic/HttpClient.execute (Lorg/apache/hc/core5/http/ClassicHttpRequest;)Lorg/apache/hc/core5/http/HttpResponse; 2
      // 070: checkcast org/apache/hc/client5/http/impl/classic/CloseableHttpResponse
      // 073: astore 13
      // 075: aload 13
      // 077: invokevirtual org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.getEntity ()Lorg/apache/hc/core5/http/HttpEntity;
      // 07a: astore 14
      // 07c: aload 14
      // 07e: invokeinterface org/apache/hc/core5/http/HttpEntity.getContent ()Ljava/io/InputStream; 1
      // 083: astore 15
      // 085: new java/io/DataInputStream
      // 088: dup
      // 089: aload 15
      // 08b: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 08e: astore 11
      // 090: new java/io/ByteArrayOutputStream
      // 093: dup
      // 094: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 097: astore 16
      // 099: bipush 0
      // 09a: istore 17
      // 09c: invokestatic com/finalshell/core/TL3.a (IJ)I
      // 09f: newarray 8
      // 0a1: astore 18
      // 0a3: aload 15
      // 0a5: aload 18
      // 0a7: invokevirtual java/io/InputStream.read ([B)I
      // 0aa: dup
      // 0ab: istore 17
      // 0ad: bipush -1
      // 0ae: if_icmple 0cc
      // 0b1: aload 16
      // 0b3: aload 18
      // 0b5: bipush 0
      // 0b6: iload 17
      // 0b8: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0bb: aload 5
      // 0bd: ifnonnull 0f6
      // 0c0: aload 5
      // 0c2: ifnull 0a3
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 16
      // 0ce: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0d1: astore 8
      // 0d3: aload 8
      // 0d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d8: ldc2_w 356223458641838477
      // 0db: astore 26
      // 0dd: ldc2_w 356223458641838477
      // 0e0: aload 26
      // 0e2: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e5: checkcast [B
      // 0e8: goto 0ef
      // 0eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: astore 8
      // 0f1: aload 16
      // 0f3: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 0f6: goto 12a
      // 0f9: astore 19
      // 0fb: aload 19
      // 0fd: aload 5
      // 0ff: ifnonnull 20d
      // 102: astore 9
      // 104: aload 16
      // 106: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 109: aload 11
      // 10b: ifnull 20b
      // 10e: aload 11
      // 110: invokevirtual java/io/DataInputStream.close ()V
      // 113: goto 20b
      // 116: astore 20
      // 118: aload 20
      // 11a: invokevirtual java/io/IOException.printStackTrace ()V
      // 11d: goto 20b
      // 120: astore 21
      // 122: aload 16
      // 124: invokevirtual java/io/ByteArrayOutputStream.close ()V
      // 127: aload 21
      // 129: athrow
      // 12a: bipush 1
      // 12b: istore 7
      // 12d: aload 11
      // 12f: aload 5
      // 131: ifnonnull 140
      // 134: ifnull 20b
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 11
      // 140: invokevirtual java/io/DataInputStream.close ()V
      // 143: goto 20b
      // 146: astore 19
      // 148: aload 19
      // 14a: invokevirtual java/io/IOException.printStackTrace ()V
      // 14d: goto 20b
      // 150: astore 12
      // 152: aload 5
      // 154: ifnonnull 1b4
      // 157: aload 12
      // 159: instanceof java/io/IOException
      // 15c: ifeq 1a8
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: iload 6
      // 168: aload 5
      // 16a: ifnonnull 19b
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: bipush 2
      // 175: if_icmpne 1a8
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: aload 10
      // 181: invokevirtual org/apache/hc/client5/http/classic/methods/HttpPost.getUri ()Ljava/net/URI;
      // 184: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 187: aload 0
      // 188: ldc2_w 457982698878206003
      // 18b: astore 28
      // 18d: ldc2_w 457982698878206003
      // 190: aload 28
      // 192: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 195: checkcast java/lang/String
      // 198: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19b: ifeq 19e
      // 19e: goto 1a8
      // 1a1: astore 13
      // 1a3: aload 13
      // 1a5: invokevirtual java/net/URISyntaxException.printStackTrace ()V
      // 1a8: sipush 29272
      // 1ab: ldc2_w 7358110075891994059
      // 1ae: invokestatic com/finalshell/core/TL3.b (IJ)J
      // 1b1: invokestatic java/lang/Thread.sleep (J)V
      // 1b4: goto 1be
      // 1b7: astore 13
      // 1b9: aload 13
      // 1bb: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1be: aload 11
      // 1c0: aload 5
      // 1c2: ifnonnull 1d1
      // 1c5: ifnull 206
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: aload 11
      // 1d1: invokevirtual java/io/DataInputStream.close ()V
      // 1d4: goto 206
      // 1d7: astore 12
      // 1d9: aload 12
      // 1db: invokevirtual java/io/IOException.printStackTrace ()V
      // 1de: goto 206
      // 1e1: astore 22
      // 1e3: aload 11
      // 1e5: aload 5
      // 1e7: ifnonnull 1f6
      // 1ea: ifnull 203
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: aload 11
      // 1f6: invokevirtual java/io/DataInputStream.close ()V
      // 1f9: goto 203
      // 1fc: astore 23
      // 1fe: aload 23
      // 200: invokevirtual java/io/IOException.printStackTrace ()V
      // 203: aload 22
      // 205: athrow
      // 206: aload 5
      // 208: ifnull 037
      // 20b: aload 9
      // 20d: aload 5
      // 20f: ifnonnull 21e
      // 212: ifnull 21f
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 9
      // 21e: athrow
      // 21f: iload 7
      // 221: ifne 239
      // 224: new java/io/IOException
      // 227: dup
      // 228: sipush -7475
      // 22b: sipush -10383
      // 22e: invokestatic com/finalshell/core/TL3.a (II)Ljava/lang/String;
      // 231: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 234: athrow
      // 235: invokestatic com/finalshell/core/TL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: aload 8
      // 23b: areturn
   }

   public HttpClient r() {
      Object var1 = 262738112449243103L;
      return (HttpClient)Ref.g(262738112449243103L, var1);
   }

   public void a(HttpClient var1) {
      long var3 = 262738112449243103L;
      Ref.s(262738112449243103L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24534;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16272) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var46;
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
}





