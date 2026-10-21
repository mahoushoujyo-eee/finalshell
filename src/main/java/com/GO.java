package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import javax.swing.ImageIcon;

public class GO {
   public static final ImageIcon FZ;
   public static final Color l;
   public static final Color FN;
   public static final Color Fv;
   public static final Color C;
   public static final Color g;
   public static pI_3 m;
   public static float p;
   public static float F8;
   public static int FD;
   public static Color i;
   public static Color v;
   public static boolean F1;
   public static boolean k;
   public static long FK;
   public static long q;
   public static long L;
   public static long F;
   public static boolean d;
   public static boolean F2;
   public static int Fn;
   public static Color N;
   public static Color t;
   public static Color Ff;
   public static Color J;
   public static Color FX;
   public static boolean X;
   public static Color x;
   public static Color c;
   public static Color n;
   public static Hq_2 F3;
   public static Stroke FE;
   public static Stroke B;
   public static boolean H;
   public static float U;
   public static boolean A;
   public static boolean Fg;
   public static boolean Fl;
   public static int Fx;
   public static int M;
   public static int FT;
   public static int Y;
   public static int FY;
   public static boolean Fb;
   public static boolean w;
   public static boolean Fe;
   public static int FG;
   public static int f;
   public static Color r;
   public static Color FB;
   public static float K;
   public static float FL;
   public static float b;
   public static float z;
   public static int o;
   public static int I;
   public static int FH;
   public static Insets P;
   public static int FV;
   public static int Fy;
   public static int FJ;
   public static int T;
   public static int F_;
   public static Color R;
   public static Color W;
   public static Color F4;
   public static Color V;
   public static Color O;
   public static Color y;
   public static Color Fw;
   public static Color D;
   public static Color Fi;
   public static Map FQ;
   public static Map e;
   public static Color FR;
   public static Color Fz;
   public static Color Q;
   public static Color E;
   public static Color Fc;
   public static Color Ft;
   public static Color Fm;
   public static Color Fo;
   public static Color h;
   public static Color s;
   public static Color G;
   public static Color Fj;
   public static Color u;
   public static Color a;
   public static Color Z;
   public static Color S;
   public static Stroke Fk;
   public static ImageIcon Fs;
   public static ImageIcon j;
   public static Font FF;
   public static NumberFormat FU;
   private static boolean Fq;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var16 = new String[7];
      int var20 = 0;
      String var19 = "gnQS^\\\u0019r7A\u0018KX\u0003iiM\u0014VG\u0004\u000fozJ\u0013K\u001c\u0012kiQ\u0004\u0016C\u0019a\u0005%)\u000bM\b\u001bozJ\u0013K\u001c\u001frtIRHV\u0019bpK\u001aq^\u0016a|\u000b\rVT\u001bozJ\u0013K\u001c\u001frtIRUZ\u0004upK\u001aq^\u0016a|\u000b\rVT";
      int var21 = "gnQS^\\\u0019r7A\u0018KX\u0003iiM\u0014VG\u0004\u000fozJ\u0013K\u001c\u0012kiQ\u0004\u0016C\u0019a\u0005%)\u000bM\b\u001bozJ\u0013K\u001c\u001frtIRHV\u0019bpK\u001aq^\u0016a|\u000b\rVT\u001bozJ\u0013K\u001c\u001frtIRUZ\u0004upK\u001aq^\u0016a|\u000b\rVT"
         .length();
      char var18 = 21;
      F(true);
      int var27 = -1;

      label89:
      while (true) {
         byte var10000 = 7;
         String var10001 = var19.substring(++var27, var27 + var18);
         byte var10002 = -1;

         while (true) {
            label84: {
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
                     break label84;
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
                        var85 = 1;
                        break;
                     case 1:
                        var85 = 30;
                        break;
                     case 2:
                        var85 = 34;
                        break;
                     case 3:
                        var85 = 122;
                        break;
                     case 4:
                        var85 = 63;
                        break;
                     case 5:
                        var85 = 52;
                        break;
                     default:
                        var85 = 112;
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
                  var16[var20++] = var60;
                  if ((var27 += var18) >= var21) {
                     long var9 = 2485507912932413267L;
                     long[] var8 = new long[47];
                     int var12 = 0;
                     String var13 = "\u008b/\u001dÁ,ÂO\u009fN\\gO,ÂO\u008f¿6»\u0013,ÂO¬\u0096k\rÒ,ÂO¾¶0Â`,ÂO¼\u001d\u008c¢\u0015,ÂO¡ê|s3,ÂO¬FåC\u000b,ÂOcAY\u0088\u009b,ÂO¡\u009c\u009bEÏ,ÂO\u009fÀQ\u0016ã,ÂOó\t\u0081ó%,ÂOQ\u008dñ\u0080L,ÂO\u001aý\u0093J½,ÂO~e\u0006+B,ÂOÝÏ\u0017ÏÍ,ÂOUëw¯\u008b,ÂO\u0086>O\u008fÜ,ÂOóÖTñr,ÂO[nskB,ÂO£\u007fÊê\u0001,ÂOïÈ\u0085í%,ÂOÓm\u009eh>,ÂO£¦Æ¸M,ÂOÍL°\u0092u,ÂOå0ÕZ[,ÂOåXvL\u0018,ÂOï;éÅ\u009f,ÂOQº½\u0015ð,ÂOWg\u0011Aé,ÂOG\u009d\u0097Å2,ÂO N\u00972\u008b,ÂOãæ=Hs,ÂO\u008c½=ÌÒ,ÂO¾_åºÁ,ÂO\u0086-û\u0015[,ÂO\u0092¤©?\u0094,ÂO\u0081X ÀÏ,ÂOÆÜ{ñæ,ÂOµ¼¦\u0002\u0004,ÂO\u0081\u0018\u0006Íb,ÂOc<µ~â,ÂO[à<\u001e@,ÂOãÔÀû=,ÂOYÛN\u0092¢,ÂOµ";
                     int var14 = "\u008b/\u001dÁ,ÂO\u009fN\\gO,ÂO\u008f¿6»\u0013,ÂO¬\u0096k\rÒ,ÂO¾¶0Â`,ÂO¼\u001d\u008c¢\u0015,ÂO¡ê|s3,ÂO¬FåC\u000b,ÂOcAY\u0088\u009b,ÂO¡\u009c\u009bEÏ,ÂO\u009fÀQ\u0016ã,ÂOó\t\u0081ó%,ÂOQ\u008dñ\u0080L,ÂO\u001aý\u0093J½,ÂO~e\u0006+B,ÂOÝÏ\u0017ÏÍ,ÂOUëw¯\u008b,ÂO\u0086>O\u008fÜ,ÂOóÖTñr,ÂO[nskB,ÂO£\u007fÊê\u0001,ÂOïÈ\u0085í%,ÂOÓm\u009eh>,ÂO£¦Æ¸M,ÂOÍL°\u0092u,ÂOå0ÕZ[,ÂOåXvL\u0018,ÂOï;éÅ\u009f,ÂOQº½\u0015ð,ÂOWg\u0011Aé,ÂOG\u009d\u0097Å2,ÂO N\u00972\u008b,ÂOãæ=Hs,ÂO\u008c½=ÌÒ,ÂO¾_åºÁ,ÂO\u0086-û\u0015[,ÂO\u0092¤©?\u0094,ÂO\u0081X ÀÏ,ÂOÆÜ{ñæ,ÂOµ¼¦\u0002\u0004,ÂO\u0081\u0018\u0006Íb,ÂOc<µ~â,ÂO[à<\u001e@,ÂOãÔÀû=,ÂOYÛN\u0092¢,ÂOµ"
                        .length();
                     byte var11 = 0;

                     label63:
                     while (true) {
                        byte var37 = var11;
                        var11 += 8;
                        byte[] var15 = var13.substring(var37, var11).getBytes("ISO-8859-1");
                        long[] var29 = var8;
                        int var38 = var12++;
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
                           long var72 = var51 ^ var9;
                           switch (var61) {
                              case 0:
                                 var29[var38] = var72;
                                 if (var11 >= var14) {
                                    long var1 = 1606718123583290362L;
                                    long[] var0 = new long[4];
                                    int var4 = 0;
                                    String var5 = "\u0016L5\u009eâ];æ\u0016L5\u009eâ];ï";
                                    int var6 = "\u0016L5\u009eâ];æ\u0016L5\u009eâ];ï".length();
                                    byte var3 = 0;

                                    label53:
                                    while (true) {
                                       byte var40 = var3;
                                       var3 += 8;
                                       byte[] var7 = var5.substring(var40, var3).getBytes("ISO-8859-1");
                                       long[] var30 = var0;
                                       int var41 = var4++;
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
                                          var72 = var53 ^ var1;
                                          switch (var63) {
                                             case 0:
                                                var30[var41] = var72;
                                                if (var3 >= var6) {
                                                   FZ = new ImageIcon(GO.class.getResource(var16[1]));
                                                   l = new Color((int)var8[6], (int)var8[2], (int)var8[2], 0);
                                                   FN = new Color((int)var8[2], 0, 0, (int)var8[40]);
                                                   Fv = new Color(0, (int)var8[2], 0, (int)var8[7]);
                                                   C = new Color(0, 0, (int)var8[2], (int)var8[7]);
                                                   g = new Color((int)var8[2], (int)var8[2], 0, (int)var8[7]);
                                                   m = pI_3.simple;
                                                   p = 0.7F;
                                                   F8 = 0.7F;
                                                   FD = (int)var8[43];
                                                   i = new Color((int)var8[0], (int)var8[9], (int)var8[9]);
                                                   v = new Color((int)var8[2], (int)var8[2], (int)var8[2]);
                                                   F1 = false;
                                                   k = true;
                                                   FK = var0[2];
                                                   q = var0[0];
                                                   L = var0[1];
                                                   F = var0[3];
                                                   d = true;
                                                   F2 = false;
                                                   Fn = 1;
                                                   N = (Color)com.c.c(122445478860349535L).get(null);
                                                   t = Color.WHITE;
                                                   Ff = (Color)com.c.c(293928658803982007L).get(null);
                                                   J = P9.N(N, Ff, 0.5F);
                                                   FX = Color.LIGHT_GRAY;
                                                   X = true;
                                                   x = new Color((int)var8[17], (int)var8[10], (int)var8[10]);
                                                   c = new Color(0, 0, 0, 0);
                                                   n = new Color((int)var8[45], (int)var8[14], (int)var8[4], (int)var8[21]);
                                                   F3 = Hq_2.fieldFocus;
                                                   FE = new BasicStroke(1.5F);
                                                   B = new BasicStroke(1.0F, 1, 1, 1.0F, new float[]{1.0F, 2.0F}, 0.0F);
                                                   H = false;
                                                   U = 0.5F;
                                                   A = false;
                                                   Fg = false;
                                                   Fl = false;
                                                   Fx = 0;
                                                   M = 0;
                                                   FT = (int)var8[15];
                                                   Y = (int)var8[41];
                                                   FY = (int)var8[18];
                                                   Fb = false;
                                                   w = false;
                                                   Fe = false;
                                                   FG = (int)var8[27];
                                                   f = 0;
                                                   r = new Color(0, 0, 0, 0);
                                                   FB = new Color(0, 0, 0, 0);
                                                   K = 0.0F;
                                                   FL = 0.85F;
                                                   b = 0.95F;
                                                   z = 1.0F;
                                                   o = (int)var8[11];
                                                   I = (int)var8[28];
                                                   FH = (int)var8[18];
                                                   P = new Insets(0, 0, 0, 0);
                                                   FV = (int)var8[11];
                                                   Fy = 1;
                                                   FJ = (int)var8[11];
                                                   T = (int)var8[46];
                                                   F_ = (int)var8[29];
                                                   R = new Color((int)var8[3], (int)var8[33], (int)var8[33]);
                                                   W = new Color((int)var8[38], (int)var8[44], (int)var8[44]);
                                                   F4 = new Color((int)var8[39], (int)var8[36], (int)var8[36]);
                                                   V = Color.BLACK;
                                                   O = Color.BLACK;
                                                   y = new Color((int)var8[10], (int)var8[10], (int)var8[10]);
                                                   Fw = Color.GRAY;
                                                   D = Color.LIGHT_GRAY;
                                                   Fi = Color.WHITE;
                                                   FQ = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                                                   e = FQ;
                                                   Toolkit var23 = Toolkit.getDefaultToolkit();
                                                   e = (Map)var23.getDesktopProperty(var16[5]);
                                                   var23.addPropertyChangeListener(var16[0], new G1());
                                                   FR = Color.WHITE;
                                                   Fz = new Color((int)var8[8], (int)var8[5], (int)var8[5]);
                                                   Q = new Color((int)var8[19], (int)var8[22], (int)var8[22]);
                                                   E = new Color((int)var8[12], (int)var8[37], (int)var8[35]);
                                                   Fc = new Color((int)var8[13], (int)var8[30], (int)var8[23]);
                                                   Ft = new Color((int)var8[32], (int)var8[1], (int)var8[16]);
                                                   Fm = new Color((int)var8[5], (int)var8[5], (int)var8[5]);
                                                   Fo = new Color((int)var8[34], (int)var8[34], (int)var8[34]);
                                                   h = Color.WHITE;
                                                   s = Color.WHITE;
                                                   G = Ft;
                                                   Fj = new Color((int)var8[10], (int)var8[10], (int)var8[10]);
                                                   u = new Color((int)var8[2], (int)var8[2], (int)var8[2], 5);
                                                   a = Color.WHITE;
                                                   Z = new Color((int)var8[42], (int)var8[24], (int)var8[26], 5);
                                                   S = new Color((int)var8[31], (int)var8[25], (int)var8[20]);
                                                   Fk = new BasicStroke(1.0F, 1, 1, 1.0F, new float[]{4.0F, 4.0F}, 0.0F);
                                                   Fs = new ImageIcon(GO.class.getResource(var16[3]));
                                                   j = new ImageIcon(GO.class.getResource(var16[4]));
                                                   FF = new Font(var16[6], 1, (int)var8[18]);
                                                   FU = new DecimalFormat(var16[2]);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var30[var41] = var72;
                                                if (var3 < var6) {
                                                   continue label53;
                                                }

                                                var5 = "\u0016L5\u009eâ];Ð\u0016L5\u009eâ];ð";
                                                var6 = "\u0016L5\u009eâ];Ð\u0016L5\u009eâ];ð".length();
                                                var3 = 0;
                                          }

                                          byte var42 = var3;
                                          var3 += 8;
                                          var7 = var5.substring(var42, var3).getBytes("ISO-8859-1");
                                          var30 = var0;
                                          var41 = var4++;
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
                                 var29[var38] = var72;
                                 if (var11 < var14) {
                                    continue label63;
                                 }

                                 var13 = "y\u001ab¿,ÂO\u0006ÆG\u0000\u0015,ÂOW";
                                 var14 = "y\u001ab¿,ÂO\u0006ÆG\u0000\u0015,ÂOW".length();
                                 var11 = 0;
                           }

                           byte var39 = var11;
                           var11 += 8;
                           var15 = var13.substring(var39, var11).getBytes("ISO-8859-1");
                           var29 = var8;
                           var38 = var12++;
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

                  var18 = var19.charAt(var27);
                  break;
               default:
                  var16[var20++] = var60;
                  if ((var27 += var18) < var21) {
                     var18 = var19.charAt(var27);
                     continue label89;
                  }

                  var19 = "foPR_]\u0018s6@\u0019JY\u0002hhL\u0015WF\u0005\u0006CqE\u0010VU";
                  var21 = "foPR_]\u0018s6@\u0019JY\u0002hhL\u0015WF\u0005\u0006CqE\u0010VU".length();
                  var18 = 21;
                  var27 = -1;
            }

            var10000 = 6;
            var10001 = var19.substring(++var27, var27 + var18);
            var10002 = 0;
         }
      }
   }

   public static void F(boolean var0) {
      Fq = var0;
   }

   public static boolean s() {
      return Fq;
   }

   public static boolean B() {
      boolean var0 = s();
      return !var0;
   }
}





