package com.finalshell.connection;

import com.finalshell.task.BX;
import com.finalshell.task.ReadDoneTask2;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Connection7 {
   public String x;
   public int y;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static void main(String[] var0) throws Exception {
   }

   public Connection7(String var1, int var2) throws Exception {
      this.x = var1;
      this.y = var2;
      this.n();
   }

   public void n() throws Exception {
      Socket var1 = new Socket(this.x, this.y);
      OutputStream var2 = var1.getOutputStream();
      InputStream var3 = var1.getInputStream();
      System.out.println(a(-22144, 30635));
      BX var4 = new BX(this, var2);
      var4.start();
      ReadDoneTask2 var5 = new ReadDoneTask2(this, var3);
      var5.start();
      var4.join();
      var5.join();
   }

   public static byte[] r(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: getstatic com/finalshell/connection/Connection7.c J
      // 06: l2i
      // 07: newarray 8
      // 09: astore 2
      // 0a: astore 1
      // 0b: new java/net/URL
      // 0e: dup
      // 0f: aload 0
      // 10: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 13: astore 3
      // 14: aload 3
      // 15: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 18: checkcast java/net/HttpURLConnection
      // 1b: astore 4
      // 1d: aload 4
      // 1f: bipush 0
      // 20: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // 23: aload 4
      // 25: invokevirtual java/net/HttpURLConnection.connect ()V
      // 28: aload 4
      // 2a: invokevirtual java/net/HttpURLConnection.getContentLength ()I
      // 2d: istore 5
      // 2f: aload 4
      // 31: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 34: astore 6
      // 36: new java/io/DataInputStream
      // 39: dup
      // 3a: aload 6
      // 3c: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 3f: astore 7
      // 41: aload 7
      // 43: aload 2
      // 44: invokevirtual java/io/DataInputStream.read ([B)I
      // 47: istore 8
      // 49: iload 8
      // 4b: ifgt 5d
      // 4e: aload 1
      // 4f: ifnull 82
      // 52: aload 1
      // 53: ifnonnull 86
      // 56: goto 5d
      // 59: invokestatic com/finalshell/connection/Connection7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 60: new java/lang/StringBuilder
      // 63: dup
      // 64: sipush -22143
      // 67: sipush 29965
      // 6a: invokestatic com/finalshell/connection/Connection7.a (II)Ljava/lang/String;
      // 6d: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 70: iload 8
      // 72: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 75: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 78: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/connection/Connection7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 1
      // 83: ifnonnull 41
      // 86: aload 2
      // 87: areturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -22144) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 8;
               break;
            case 1:
               var10000 = 213;
               break;
            case 2:
               var10000 = 78;
               break;
            case 3:
               var10000 = 92;
               break;
            case 4:
               var10000 = 49;
               break;
            case 5:
               var10000 = 199;
               break;
            case 6:
               var10000 = 219;
               break;
            case 7:
               var10000 = 94;
               break;
            case 8:
               var10000 = 196;
               break;
            case 9:
               var10000 = 220;
               break;
            case 10:
               var10000 = 50;
               break;
            case 11:
               var10000 = 231;
               break;
            case 12:
               var10000 = 110;
               break;
            case 13:
               var10000 = 28;
               break;
            case 14:
               var10000 = 95;
               break;
            case 15:
               var10000 = 247;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 19;
               break;
            case 18:
               var10000 = 211;
               break;
            case 19:
               var10000 = 171;
               break;
            case 20:
               var10000 = 44;
               break;
            case 21:
               var10000 = 161;
               break;
            case 22:
               var10000 = 216;
               break;
            case 23:
               var10000 = 66;
               break;
            case 24:
               var10000 = 194;
               break;
            case 25:
               var10000 = 7;
               break;
            case 26:
               var10000 = 254;
               break;
            case 27:
               var10000 = 135;
               break;
            case 28:
               var10000 = 143;
               break;
            case 29:
               var10000 = 138;
               break;
            case 30:
               var10000 = 193;
               break;
            case 31:
               var10000 = 115;
               break;
            case 32:
               var10000 = 108;
               break;
            case 33:
               var10000 = 105;
               break;
            case 34:
               var10000 = 103;
               break;
            case 35:
               var10000 = 212;
               break;
            case 36:
               var10000 = 182;
               break;
            case 37:
               var10000 = 204;
               break;
            case 38:
               var10000 = 176;
               break;
            case 39:
               var10000 = 160;
               break;
            case 40:
               var10000 = 90;
               break;
            case 41:
               var10000 = 39;
               break;
            case 42:
               var10000 = 130;
               break;
            case 43:
               var10000 = 97;
               break;
            case 44:
               var10000 = 167;
               break;
            case 45:
               var10000 = 4;
               break;
            case 46:
               var10000 = 117;
               break;
            case 47:
               var10000 = 232;
               break;
            case 48:
               var10000 = 31;
               break;
            case 49:
               var10000 = 46;
               break;
            case 50:
               var10000 = 189;
               break;
            case 51:
               var10000 = 67;
               break;
            case 52:
               var10000 = 239;
               break;
            case 53:
               var10000 = 210;
               break;
            case 54:
               var10000 = 218;
               break;
            case 55:
               var10000 = 65;
               break;
            case 56:
               var10000 = 80;
               break;
            case 57:
               var10000 = 120;
               break;
            case 58:
               var10000 = 24;
               break;
            case 59:
               var10000 = 214;
               break;
            case 60:
               var10000 = 134;
               break;
            case 61:
               var10000 = 146;
               break;
            case 62:
               var10000 = 190;
               break;
            case 63:
               var10000 = 85;
               break;
            case 64:
               var10000 = 121;
               break;
            case 65:
               var10000 = 203;
               break;
            case 66:
               var10000 = 79;
               break;
            case 67:
               var10000 = 9;
               break;
            case 68:
               var10000 = 55;
               break;
            case 69:
               var10000 = 11;
               break;
            case 70:
               var10000 = 111;
               break;
            case 71:
               var10000 = 25;
               break;
            case 72:
               var10000 = 102;
               break;
            case 73:
               var10000 = 63;
               break;
            case 74:
               var10000 = 30;
               break;
            case 75:
               var10000 = 183;
               break;
            case 76:
               var10000 = 165;
               break;
            case 77:
               var10000 = 107;
               break;
            case 78:
               var10000 = 174;
               break;
            case 79:
               var10000 = 238;
               break;
            case 80:
               var10000 = 131;
               break;
            case 81:
               var10000 = 229;
               break;
            case 82:
               var10000 = 242;
               break;
            case 83:
               var10000 = 168;
               break;
            case 84:
               var10000 = 0;
               break;
            case 85:
               var10000 = 225;
               break;
            case 86:
               var10000 = 187;
               break;
            case 87:
               var10000 = 119;
               break;
            case 88:
               var10000 = 200;
               break;
            case 89:
               var10000 = 113;
               break;
            case 90:
               var10000 = 207;
               break;
            case 91:
               var10000 = 83;
               break;
            case 92:
               var10000 = 73;
               break;
            case 93:
               var10000 = 158;
               break;
            case 94:
               var10000 = 88;
               break;
            case 95:
               var10000 = 240;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 71;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 5;
               break;
            case 101:
               var10000 = 109;
               break;
            case 102:
               var10000 = 226;
               break;
            case 103:
               var10000 = 17;
               break;
            case 104:
               var10000 = 151;
               break;
            case 105:
               var10000 = 125;
               break;
            case 106:
               var10000 = 54;
               break;
            case 107:
               var10000 = 155;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 142;
               break;
            case 110:
               var10000 = 129;
               break;
            case 111:
               var10000 = 245;
               break;
            case 112:
               var10000 = 82;
               break;
            case 113:
               var10000 = 169;
               break;
            case 114:
               var10000 = 224;
               break;
            case 115:
               var10000 = 145;
               break;
            case 116:
               var10000 = 253;
               break;
            case 117:
               var10000 = 14;
               break;
            case 118:
               var10000 = 51;
               break;
            case 119:
               var10000 = 202;
               break;
            case 120:
               var10000 = 241;
               break;
            case 121:
               var10000 = 41;
               break;
            case 122:
               var10000 = 154;
               break;
            case 123:
               var10000 = 209;
               break;
            case 124:
               var10000 = 75;
               break;
            case 125:
               var10000 = 70;
               break;
            case 126:
               var10000 = 52;
               break;
            case 127:
               var10000 = 37;
               break;
            case 128:
               var10000 = 156;
               break;
            case 129:
               var10000 = 123;
               break;
            case 130:
               var10000 = 43;
               break;
            case 131:
               var10000 = 38;
               break;
            case 132:
               var10000 = 255;
               break;
            case 133:
               var10000 = 177;
               break;
            case 134:
               var10000 = 61;
               break;
            case 135:
               var10000 = 198;
               break;
            case 136:
               var10000 = 56;
               break;
            case 137:
               var10000 = 26;
               break;
            case 138:
               var10000 = 153;
               break;
            case 139:
               var10000 = 170;
               break;
            case 140:
               var10000 = 140;
               break;
            case 141:
               var10000 = 208;
               break;
            case 142:
               var10000 = 29;
               break;
            case 143:
               var10000 = 101;
               break;
            case 144:
               var10000 = 98;
               break;
            case 145:
               var10000 = 228;
               break;
            case 146:
               var10000 = 93;
               break;
            case 147:
               var10000 = 53;
               break;
            case 148:
               var10000 = 116;
               break;
            case 149:
               var10000 = 249;
               break;
            case 150:
               var10000 = 35;
               break;
            case 151:
               var10000 = 172;
               break;
            case 152:
               var10000 = 236;
               break;
            case 153:
               var10000 = 230;
               break;
            case 154:
               var10000 = 243;
               break;
            case 155:
               var10000 = 221;
               break;
            case 156:
               var10000 = 60;
               break;
            case 157:
               var10000 = 96;
               break;
            case 158:
               var10000 = 40;
               break;
            case 159:
               var10000 = 197;
               break;
            case 160:
               var10000 = 233;
               break;
            case 161:
               var10000 = 99;
               break;
            case 162:
               var10000 = 57;
               break;
            case 163:
               var10000 = 58;
               break;
            case 164:
               var10000 = 206;
               break;
            case 165:
               var10000 = 1;
               break;
            case 166:
               var10000 = 21;
               break;
            case 167:
               var10000 = 191;
               break;
            case 168:
               var10000 = 112;
               break;
            case 169:
               var10000 = 217;
               break;
            case 170:
               var10000 = 195;
               break;
            case 171:
               var10000 = 144;
               break;
            case 172:
               var10000 = 12;
               break;
            case 173:
               var10000 = 149;
               break;
            case 174:
               var10000 = 104;
               break;
            case 175:
               var10000 = 59;
               break;
            case 176:
               var10000 = 178;
               break;
            case 177:
               var10000 = 32;
               break;
            case 178:
               var10000 = 244;
               break;
            case 179:
               var10000 = 227;
               break;
            case 180:
               var10000 = 87;
               break;
            case 181:
               var10000 = 166;
               break;
            case 182:
               var10000 = 192;
               break;
            case 183:
               var10000 = 74;
               break;
            case 184:
               var10000 = 152;
               break;
            case 185:
               var10000 = 147;
               break;
            case 186:
               var10000 = 139;
               break;
            case 187:
               var10000 = 185;
               break;
            case 188:
               var10000 = 48;
               break;
            case 189:
               var10000 = 186;
               break;
            case 190:
               var10000 = 27;
               break;
            case 191:
               var10000 = 150;
               break;
            case 192:
               var10000 = 36;
               break;
            case 193:
               var10000 = 20;
               break;
            case 194:
               var10000 = 126;
               break;
            case 195:
               var10000 = 81;
               break;
            case 196:
               var10000 = 23;
               break;
            case 197:
               var10000 = 69;
               break;
            case 198:
               var10000 = 201;
               break;
            case 199:
               var10000 = 6;
               break;
            case 200:
               var10000 = 175;
               break;
            case 201:
               var10000 = 15;
               break;
            case 202:
               var10000 = 86;
               break;
            case 203:
               var10000 = 13;
               break;
            case 204:
               var10000 = 180;
               break;
            case 205:
               var10000 = 184;
               break;
            case 206:
               var10000 = 64;
               break;
            case 207:
               var10000 = 89;
               break;
            case 208:
               var10000 = 72;
               break;
            case 209:
               var10000 = 77;
               break;
            case 210:
               var10000 = 133;
               break;
            case 211:
               var10000 = 106;
               break;
            case 212:
               var10000 = 18;
               break;
            case 213:
               var10000 = 45;
               break;
            case 214:
               var10000 = 163;
               break;
            case 215:
               var10000 = 33;
               break;
            case 216:
               var10000 = 159;
               break;
            case 217:
               var10000 = 234;
               break;
            case 218:
               var10000 = 76;
               break;
            case 219:
               var10000 = 118;
               break;
            case 220:
               var10000 = 222;
               break;
            case 221:
               var10000 = 100;
               break;
            case 222:
               var10000 = 235;
               break;
            case 223:
               var10000 = 251;
               break;
            case 224:
               var10000 = 16;
               break;
            case 225:
               var10000 = 164;
               break;
            case 226:
               var10000 = 179;
               break;
            case 227:
               var10000 = 148;
               break;
            case 228:
               var10000 = 223;
               break;
            case 229:
               var10000 = 215;
               break;
            case 230:
               var10000 = 205;
               break;
            case 231:
               var10000 = 181;
               break;
            case 232:
               var10000 = 137;
               break;
            case 233:
               var10000 = 42;
               break;
            case 234:
               var10000 = 10;
               break;
            case 235:
               var10000 = 252;
               break;
            case 236:
               var10000 = 173;
               break;
            case 237:
               var10000 = 250;
               break;
            case 238:
               var10000 = 127;
               break;
            case 239:
               var10000 = 34;
               break;
            case 240:
               var10000 = 2;
               break;
            case 241:
               var10000 = 62;
               break;
            case 242:
               var10000 = 248;
               break;
            case 243:
               var10000 = 114;
               break;
            case 244:
               var10000 = 122;
               break;
            case 245:
               var10000 = 136;
               break;
            case 246:
               var10000 = 188;
               break;
            case 247:
               var10000 = 157;
               break;
            case 248:
               var10000 = 141;
               break;
            case 249:
               var10000 = 22;
               break;
            case 250:
               var10000 = 246;
               break;
            case 251:
               var10000 = 3;
               break;
            case 252:
               var10000 = 68;
               break;
            case 253:
               var10000 = 162;
               break;
            case 254:
               var10000 = 132;
               break;
            default:
               var10000 = 128;
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
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "迊挬抔劍\u0003讪匾)";
      int var6 = "迊挬抔劍\u0003讪匾)".length();
      char var3 = 4;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 92;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 92;
               var10006 = var8;
            } else {
               var17 = 92;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 92;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 64;
                     break;
                  case 1:
                     var33 = 1;
                     break;
                  case 2:
                     var33 = 7;
                     break;
                  case 3:
                     var33 = 113;
                     break;
                  case 4:
                     var33 = 77;
                     break;
                  case 5:
                     var33 = 7;
                     break;
                  default:
                     var33 = 42;
               }

               var10005[var10006] = (char)(var32 ^ var20 ^ var33);
               var8++;
               if (var17 == 0) {
                  var10006 = var17;
                  var10005 = var10002;
                  var20 = var17;
               } else {
                  if (var10 <= var8) {
                     break;
                  }

                  var10005 = var10002;
                  var20 = var17;
                  var10006 = var8;
               }
            }
         }

         String var19 = new String(var10002).intern();
         byte var12 = -1;
         var7[var5++] = var19;
         if ((var2 += var3) >= var6) {
            a = var7;
            b = new String[2];
            long var0 = 4159624959995416530L;
            long var16 = -5723900983526711342L ^ var0;
            var12 = -1;
            c = var16;
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





