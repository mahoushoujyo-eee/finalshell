import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class YQ extends JPanel {
   String w;
   String u;
   int z;
   JTextArea g;
   String E;
   private static int[] c;
   private static final String[] a;
   private static final String[] b;
   private static final long[] d;
   private static final Integer[] e;

   YQ(String var1, String var2, int var3) {
      com.c.c(430112502366759747L).set(this, "");
      com.c.c(137614734688504536L).set(this, var1);
      com.c.c(190026196806652918L).set(this, var2);
      com.c.c(327392772001481161L).setInt(this, var3);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-3376, 4095), a(-3374, -10809), a(-3375, -23281)));
      int[] var10000 = m();
      this.setPreferredSize(new Dimension(a(27286, 8880871827334942601L), a(28005, 1942329851639220344L)));
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(309510407495814293L);
      Object[] var10003 = var10002;
      YQ var35 = this;
      Method var10001 = var10004;

      try {
         var10001.invoke(var35, var10003);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      com.c.c(193453305949284809L).set(this, new yj_4(this));
      Object[] var23 = com.c.a(com.c.c(193453305949284809L).get(this));
      var10001 = com.c.d(322267315291882359L);
      var10003 = var23;
      var10002 = null;

      try {
         var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      ((JTextArea)com.c.c(193453305949284809L).get(this))
         .setForeground(new Color(a(14287, 2830261329524069073L), a(31176, 675600308766203092L), a(31176, 675600308766203092L)));
      ((JTextArea)com.c.c(193453305949284809L).get(this)).setOpaque(false);
      ((JTextArea)com.c.c(193453305949284809L).get(this)).setFont((Font)com.c.c(395970988011231853L).get(null));
      ((JTextArea)com.c.c(193453305949284809L).get(this)).setEditable(false);
      JScrollPane var5 = new JScrollPane((JTextArea)com.c.c(193453305949284809L).get(this));
      var5.setOpaque(false);
      var5.getViewport().setOpaque(false);
      this.add(var5, a(-3367, 25866));
      int[] var4 = var10000;
      var10000 = (int[])com.c.c(388376917454860932L).get(null);
      Object[] var25 = com.c.a(new CD(this));
      Method var45 = com.c.d(434592463220957006L);
      var10002 = var25;
      Object var26 = var10000;
      Method var14 = var45;

      try {
         var14.invoke(var26, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10000 = (int[])com.c.c(388376917454860932L).get(null);
      var26 = com.c.a(new T(this));
      Method var46 = com.c.d(434592463220957006L);
      var10002 = (Object[])var26;
      var26 = var10000;
      Method var16 = var46;

      try {
         var16.invoke(var26, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10000 = (int[])com.c.c(388376917454860932L).get(null);
      var26 = com.c.a(new Oq_2(this));
      Method var47 = com.c.d(434592463220957006L);
      var10002 = (Object[])var26;
      var26 = var10000;
      Method var18 = var47;

      try {
         var18.invoke(var26, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10000 = (int[])com.c.c(388376917454860932L).get(null);
      var26 = com.c.a(new yC_3(this));
      Method var48 = com.c.d(434592463220957006L);
      var10002 = (Object[])var26;
      var26 = var10000;
      Method var20 = var48;

      try {
         var20.invoke(var26, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10000 = (int[])com.c.c(388376917454860932L).get(null);
      var26 = com.c.a(new ul_4(this));
      Method var49 = com.c.d(434592463220957006L);
      var10002 = (Object[])var26;
      var26 = var10000;
      Method var22 = var49;

      try {
         var22.invoke(var26, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var4 == null) {
         com.ky_4.K(new String[3]);
      }
   }

   void Q(String var1) {
      int[] var10000 = m();
      Object[] var10001 = com.c.a(var1, com.c.c(190026196806652918L).get(this));
      Method var10 = com.c.d(405719060143778520L);
      Object[] var13 = var10001;
      Object var12 = null;

      try {
         var10001 = (String)var10.invoke(var12, var13);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String var3 = var10001;
      int[] var2 = var10000;
      String var7 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var7 = var3.toLowerCase();
      }

      String var4 = var7;
      int var8 = var4.contains(a(-3369, -20832));
      if (var2 != null) {
         if (var8 != 0) {
            return;
         }

         var8 = var4.contains(a(-3372, 6205));
      }

      if (var2 != null) {
         if (var8 != 0) {
            return;
         }

         var8 = var4.contains(a(-3371, -17807));
      }

      if (var2 != null) {
         if (var8 != 0) {
            return;
         }

         var8 = var4.contains(a(-3373, 22447));
      }

      if (var2 != null) {
         if (var8 != 0) {
            return;
         }

         var8 = var4.contains(a(-3370, -4110));
      }

      if (var2 != null) {
         if (var8 != 0) {
            return;
         }

         var8 = var3.equals((String)com.c.c(430112502366759747L).get(this));
      }

      label83: {
         if (var2 != null) {
            if (var8 != 0) {
               return;
            }

            var9 = var3;
            if (var2 == null) {
               break label83;
            }

            var8 = var3.length();
         }

         if (var8 <= ((String)com.c.c(430112502366759747L).get(this)).length()) {
            return;
         }

         com.c.c(430112502366759747L).set(this, var3);
         var9 = a(-3368, 31875) + (String)com.c.c(190026196806652918L).get(this) + "\n" + var3;
      }

      String var5 = var9;
      ((JTextArea)com.c.c(193453305949284809L).get(this)).setText(var5);
   }

   public void s() {
      Object[] var10000 = com.c.f();
      Method var7 = com.c.d(270389152141252877L);
      Object[] var18 = var10000;
      Object var13 = null;

      try {
         var10000 = (Object[])var7.invoke(var13, var18);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var13 = com.c.f();
      Method var10003 = com.c.d(399585344452154517L);
      var18 = (Object[])var13;
      var13 = var10000;
      Method var9 = var10003;

      try {
         var10000 = (Object[])var9.invoke(var13, var18);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var13 = com.c.f();
      var10003 = com.c.d(149968465491171480L);
      var18 = (Object[])var13;
      var13 = var10000;
      Method var11 = var10003;

      try {
         var10000 = (nY)var11.invoke(var13, var18);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      nY var1 = var10000;
      Object[] var10005 = com.c.f();
      Method var10007 = com.c.d(345089686683358688L);
      Object[] var10006 = var10005;
      nY var23 = var1;
      Method var10004 = var10007;

      try {
         var22 = (Color)var10004.invoke(var23, var10006);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(2, 0, 0, 0, var22);
      this.setBorder(null);
   }

   @Override
   public String getName() {
      return (String)com.c.c(137614734688504536L).get(this);
   }

   @Override
   public void setName(String var1) {
      com.c.c(137614734688504536L).set(this, var1);
   }

   public String C() {
      return (String)com.c.c(190026196806652918L).get(this);
   }

   public void T(String var1) {
      com.c.c(190026196806652918L).set(this, var1);
   }

   public int a() {
      return com.c.c(327392772001481161L).getInt(this);
   }

   public void Y(int var1) {
      com.c.c(327392772001481161L).setInt(this, var1);
   }

   public static void Y(int[] var0) {
      c = var0;
   }

   public static int[] m() {
      return c;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[10];
      int[] var10000 = new int[5];
      int var11 = 0;
      Y(var10000);
      String var10 = "\u0015%n,\u001f\\ÐIûÔ5'Á\u000bÓ\u0005úQ¤ÉD\u0005ôûe\u009c|\rr\u009cb\u007f\u007fÍ]ö¶\u0015à\u0091Ó\u000b2\u000bj\u008da\u0097k1Lõ(\u0010³zZ£kW¤\u0084ßFeC·\tµ\u009c\u0012A^\u0019¡ËfaØ¦¡Á/£<ôñ<G\r\"6h*-nm¬Ê\u008dl\"p";
      int var12 = "\u0015%n,\u001f\\ÐIûÔ5'Á\u000bÓ\u0005úQ¤ÉD\u0005ôûe\u009c|\rr\u009cb\u007f\u007fÍ]ö¶\u0015à\u0091Ó\u000b2\u000bj\u008da\u0097k1Lõ(\u0010³zZ£kW¤\u0084ßFeC·\tµ\u009c\u0012A^\u0019¡ËfaØ¦¡Á/£<ôñ<G\r\"6h*-nm¬Ê\u008dl\"p"
         .length();
      char var9 = 15;
      int var17 = -1;

      label70:
      while (true) {
         byte var18 = 94;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var18;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               } else {
                  var43 = var18;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 112;
                        break;
                     case 1:
                        var66 = 119;
                        break;
                     case 2:
                        var66 = 96;
                        break;
                     case 3:
                        var66 = 53;
                        break;
                     case 4:
                        var66 = 34;
                        break;
                     case 5:
                        var66 = 80;
                        break;
                     default:
                        var66 = 56;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[10];
                     long var0 = 6902805804539184255L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "È\u0010\u0083©rÞ\u0096°Õ0]\u008f¹\u0002ìæ";
                     int var5 = "È\u0010\u0083©rÞ\u0096°Õ0]\u008f¹\u0002ìæ".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var20[var28] = var55;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Î\u0083Õ\bÃ7XµÎk\u009a\u0091ö\u0087ë\u0017";
                                 var5 = "Î\u0083Õ\bÃ7XµÎk\u009a\u0091ö\u0087ë\u0017".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u008b\u009eK\u001cw\u0003i\u009f\u0097ËÅ\u0002\u0091\u001dû\u009f\u0091\u0081I\u0098_rýS\u0092Ä#¯\u008cÉu]";
                  var12 = "\u008b\u009eK\u001cw\u0003i\u009f\u0097ËÅ\u0002\u0091\u001dû\u009f\u0091\u0081I\u0098_rýS\u0092Ä#¯\u008cÉu]".length();
                  var9 = 3;
                  var17 = -1;
            }

            var18 = 123;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -3376) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 163;
               break;
            case 1:
               var10000 = 32;
               break;
            case 2:
               var10000 = 248;
               break;
            case 3:
               var10000 = 10;
               break;
            case 4:
               var10000 = 161;
               break;
            case 5:
               var10000 = 187;
               break;
            case 6:
               var10000 = 226;
               break;
            case 7:
               var10000 = 216;
               break;
            case 8:
               var10000 = 74;
               break;
            case 9:
               var10000 = 164;
               break;
            case 10:
               var10000 = 185;
               break;
            case 11:
               var10000 = 20;
               break;
            case 12:
               var10000 = 62;
               break;
            case 13:
               var10000 = 121;
               break;
            case 14:
               var10000 = 142;
               break;
            case 15:
               var10000 = 222;
               break;
            case 16:
               var10000 = 123;
               break;
            case 17:
               var10000 = 147;
               break;
            case 18:
               var10000 = 86;
               break;
            case 19:
               var10000 = 5;
               break;
            case 20:
               var10000 = 13;
               break;
            case 21:
               var10000 = 209;
               break;
            case 22:
               var10000 = 174;
               break;
            case 23:
               var10000 = 145;
               break;
            case 24:
               var10000 = 122;
               break;
            case 25:
               var10000 = 221;
               break;
            case 26:
               var10000 = 21;
               break;
            case 27:
               var10000 = 69;
               break;
            case 28:
               var10000 = 203;
               break;
            case 29:
               var10000 = 230;
               break;
            case 30:
               var10000 = 52;
               break;
            case 31:
               var10000 = 181;
               break;
            case 32:
               var10000 = 84;
               break;
            case 33:
               var10000 = 124;
               break;
            case 34:
               var10000 = 55;
               break;
            case 35:
               var10000 = 175;
               break;
            case 36:
               var10000 = 237;
               break;
            case 37:
               var10000 = 233;
               break;
            case 38:
               var10000 = 105;
               break;
            case 39:
               var10000 = 219;
               break;
            case 40:
               var10000 = 0;
               break;
            case 41:
               var10000 = 40;
               break;
            case 42:
               var10000 = 47;
               break;
            case 43:
               var10000 = 160;
               break;
            case 44:
               var10000 = 162;
               break;
            case 45:
               var10000 = 236;
               break;
            case 46:
               var10000 = 96;
               break;
            case 47:
               var10000 = 37;
               break;
            case 48:
               var10000 = 50;
               break;
            case 49:
               var10000 = 99;
               break;
            case 50:
               var10000 = 36;
               break;
            case 51:
               var10000 = 240;
               break;
            case 52:
               var10000 = 54;
               break;
            case 53:
               var10000 = 81;
               break;
            case 54:
               var10000 = 114;
               break;
            case 55:
               var10000 = 97;
               break;
            case 56:
               var10000 = 101;
               break;
            case 57:
               var10000 = 88;
               break;
            case 58:
               var10000 = 3;
               break;
            case 59:
               var10000 = 173;
               break;
            case 60:
               var10000 = 149;
               break;
            case 61:
               var10000 = 151;
               break;
            case 62:
               var10000 = 44;
               break;
            case 63:
               var10000 = 232;
               break;
            case 64:
               var10000 = 35;
               break;
            case 65:
               var10000 = 212;
               break;
            case 66:
               var10000 = 167;
               break;
            case 67:
               var10000 = 199;
               break;
            case 68:
               var10000 = 211;
               break;
            case 69:
               var10000 = 119;
               break;
            case 70:
               var10000 = 134;
               break;
            case 71:
               var10000 = 82;
               break;
            case 72:
               var10000 = 18;
               break;
            case 73:
               var10000 = 137;
               break;
            case 74:
               var10000 = 29;
               break;
            case 75:
               var10000 = 155;
               break;
            case 76:
               var10000 = 49;
               break;
            case 77:
               var10000 = 150;
               break;
            case 78:
               var10000 = 204;
               break;
            case 79:
               var10000 = 238;
               break;
            case 80:
               var10000 = 39;
               break;
            case 81:
               var10000 = 61;
               break;
            case 82:
               var10000 = 148;
               break;
            case 83:
               var10000 = 171;
               break;
            case 84:
               var10000 = 190;
               break;
            case 85:
               var10000 = 169;
               break;
            case 86:
               var10000 = 7;
               break;
            case 87:
               var10000 = 26;
               break;
            case 88:
               var10000 = 72;
               break;
            case 89:
               var10000 = 58;
               break;
            case 90:
               var10000 = 14;
               break;
            case 91:
               var10000 = 48;
               break;
            case 92:
               var10000 = 125;
               break;
            case 93:
               var10000 = 27;
               break;
            case 94:
               var10000 = 157;
               break;
            case 95:
               var10000 = 188;
               break;
            case 96:
               var10000 = 16;
               break;
            case 97:
               var10000 = 194;
               break;
            case 98:
               var10000 = 158;
               break;
            case 99:
               var10000 = 64;
               break;
            case 100:
               var10000 = 12;
               break;
            case 101:
               var10000 = 144;
               break;
            case 102:
               var10000 = 159;
               break;
            case 103:
               var10000 = 98;
               break;
            case 104:
               var10000 = 76;
               break;
            case 105:
               var10000 = 179;
               break;
            case 106:
               var10000 = 24;
               break;
            case 107:
               var10000 = 120;
               break;
            case 108:
               var10000 = 103;
               break;
            case 109:
               var10000 = 220;
               break;
            case 110:
               var10000 = 94;
               break;
            case 111:
               var10000 = 217;
               break;
            case 112:
               var10000 = 234;
               break;
            case 113:
               var10000 = 193;
               break;
            case 114:
               var10000 = 66;
               break;
            case 115:
               var10000 = 191;
               break;
            case 116:
               var10000 = 45;
               break;
            case 117:
               var10000 = 92;
               break;
            case 118:
               var10000 = 183;
               break;
            case 119:
               var10000 = 178;
               break;
            case 120:
               var10000 = 189;
               break;
            case 121:
               var10000 = 136;
               break;
            case 122:
               var10000 = 106;
               break;
            case 123:
               var10000 = 17;
               break;
            case 124:
               var10000 = 255;
               break;
            case 125:
               var10000 = 170;
               break;
            case 126:
               var10000 = 31;
               break;
            case 127:
               var10000 = 140;
               break;
            case 128:
               var10000 = 186;
               break;
            case 129:
               var10000 = 73;
               break;
            case 130:
               var10000 = 206;
               break;
            case 131:
               var10000 = 15;
               break;
            case 132:
               var10000 = 215;
               break;
            case 133:
               var10000 = 250;
               break;
            case 134:
               var10000 = 168;
               break;
            case 135:
               var10000 = 156;
               break;
            case 136:
               var10000 = 25;
               break;
            case 137:
               var10000 = 1;
               break;
            case 138:
               var10000 = 146;
               break;
            case 139:
               var10000 = 59;
               break;
            case 140:
               var10000 = 139;
               break;
            case 141:
               var10000 = 53;
               break;
            case 142:
               var10000 = 90;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 247;
               break;
            case 145:
               var10000 = 153;
               break;
            case 146:
               var10000 = 152;
               break;
            case 147:
               var10000 = 184;
               break;
            case 148:
               var10000 = 192;
               break;
            case 149:
               var10000 = 214;
               break;
            case 150:
               var10000 = 231;
               break;
            case 151:
               var10000 = 30;
               break;
            case 152:
               var10000 = 28;
               break;
            case 153:
               var10000 = 67;
               break;
            case 154:
               var10000 = 235;
               break;
            case 155:
               var10000 = 138;
               break;
            case 156:
               var10000 = 2;
               break;
            case 157:
               var10000 = 126;
               break;
            case 158:
               var10000 = 223;
               break;
            case 159:
               var10000 = 243;
               break;
            case 160:
               var10000 = 56;
               break;
            case 161:
               var10000 = 176;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 83;
               break;
            case 164:
               var10000 = 218;
               break;
            case 165:
               var10000 = 46;
               break;
            case 166:
               var10000 = 195;
               break;
            case 167:
               var10000 = 207;
               break;
            case 168:
               var10000 = 110;
               break;
            case 169:
               var10000 = 71;
               break;
            case 170:
               var10000 = 23;
               break;
            case 171:
               var10000 = 228;
               break;
            case 172:
               var10000 = 201;
               break;
            case 173:
               var10000 = 51;
               break;
            case 174:
               var10000 = 224;
               break;
            case 175:
               var10000 = 229;
               break;
            case 176:
               var10000 = 252;
               break;
            case 177:
               var10000 = 109;
               break;
            case 178:
               var10000 = 8;
               break;
            case 179:
               var10000 = 244;
               break;
            case 180:
               var10000 = 4;
               break;
            case 181:
               var10000 = 93;
               break;
            case 182:
               var10000 = 249;
               break;
            case 183:
               var10000 = 182;
               break;
            case 184:
               var10000 = 41;
               break;
            case 185:
               var10000 = 143;
               break;
            case 186:
               var10000 = 131;
               break;
            case 187:
               var10000 = 251;
               break;
            case 188:
               var10000 = 130;
               break;
            case 189:
               var10000 = 19;
               break;
            case 190:
               var10000 = 9;
               break;
            case 191:
               var10000 = 63;
               break;
            case 192:
               var10000 = 89;
               break;
            case 193:
               var10000 = 177;
               break;
            case 194:
               var10000 = 57;
               break;
            case 195:
               var10000 = 197;
               break;
            case 196:
               var10000 = 115;
               break;
            case 197:
               var10000 = 68;
               break;
            case 198:
               var10000 = 6;
               break;
            case 199:
               var10000 = 102;
               break;
            case 200:
               var10000 = 227;
               break;
            case 201:
               var10000 = 113;
               break;
            case 202:
               var10000 = 129;
               break;
            case 203:
               var10000 = 42;
               break;
            case 204:
               var10000 = 75;
               break;
            case 205:
               var10000 = 200;
               break;
            case 206:
               var10000 = 165;
               break;
            case 207:
               var10000 = 202;
               break;
            case 208:
               var10000 = 87;
               break;
            case 209:
               var10000 = 180;
               break;
            case 210:
               var10000 = 253;
               break;
            case 211:
               var10000 = 242;
               break;
            case 212:
               var10000 = 128;
               break;
            case 213:
               var10000 = 239;
               break;
            case 214:
               var10000 = 111;
               break;
            case 215:
               var10000 = 34;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 77;
               break;
            case 218:
               var10000 = 70;
               break;
            case 219:
               var10000 = 11;
               break;
            case 220:
               var10000 = 172;
               break;
            case 221:
               var10000 = 78;
               break;
            case 222:
               var10000 = 208;
               break;
            case 223:
               var10000 = 80;
               break;
            case 224:
               var10000 = 22;
               break;
            case 225:
               var10000 = 95;
               break;
            case 226:
               var10000 = 210;
               break;
            case 227:
               var10000 = 108;
               break;
            case 228:
               var10000 = 117;
               break;
            case 229:
               var10000 = 154;
               break;
            case 230:
               var10000 = 196;
               break;
            case 231:
               var10000 = 116;
               break;
            case 232:
               var10000 = 33;
               break;
            case 233:
               var10000 = 65;
               break;
            case 234:
               var10000 = 135;
               break;
            case 235:
               var10000 = 213;
               break;
            case 236:
               var10000 = 127;
               break;
            case 237:
               var10000 = 91;
               break;
            case 238:
               var10000 = 141;
               break;
            case 239:
               var10000 = 245;
               break;
            case 240:
               var10000 = 254;
               break;
            case 241:
               var10000 = 133;
               break;
            case 242:
               var10000 = 241;
               break;
            case 243:
               var10000 = 118;
               break;
            case 244:
               var10000 = 79;
               break;
            case 245:
               var10000 = 43;
               break;
            case 246:
               var10000 = 38;
               break;
            case 247:
               var10000 = 246;
               break;
            case 248:
               var10000 = 112;
               break;
            case 249:
               var10000 = 166;
               break;
            case 250:
               var10000 = 104;
               break;
            case 251:
               var10000 = 85;
               break;
            case 252:
               var10000 = 205;
               break;
            case 253:
               var10000 = 107;
               break;
            case 254:
               var10000 = 225;
               break;
            default:
               var10000 = 132;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9502;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





