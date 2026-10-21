package com.finalshell.ui.panel;

import com.finalshell.core.D2;
import com.finalshell.core.KV;
import com.finalshell.core.Lt4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import org.icmp4j.j;

public class LB3 extends JLabel implements D2 {
   public Stroke p;
   public Stroke n;
   public int S;
   public KV F;
   public GradientPaint V;
   public String m;
   public BufferedImage j;
   public Lt4 v;
   public ArrayList L;
   public int O;
   public int G;
   public int E;
   public int N;
   public Color I;
   public Color T;
   public Stroke a;
   public Color B;
   public Color x;
   public static String b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   public LB3() {
      BasicStroke var10001 = new BasicStroke(1.0F, 0, 2, 0.0F, new float[]{1.0F, 3.0F}, 0.0F);
      long var4 = 381681083975472286L;
      BasicStroke var3 = var10001;
      Ref.s(381681083975472286L, var3, var4);
      BasicStroke var10002 = new BasicStroke();
      long var6 = 371611251275090749L;
      BasicStroke var5 = var10002;
      Ref.s(371611251275090749L, var5, var6);
      Registry.lookupField(521791035208510226L).setInt(this, a(25369, 4315237164798308267L));
      GradientPaint var10003 = new GradientPaint(
         0.0F,
         0.0F,
         new Color(a(11483, 4314312832447455354L), a(25410, 1745134311173255150L), a(2724, 3776529092198368817L), 0),
         0.0F,
         (float)this.getHeight(),
         new Color(a(22575, 6202721849032725660L), a(3527, 673058504890122607L), a(31438, 1393065375247693431L), a(18452, 8065488692274283684L))
      );
      long var8 = 350969701095426383L;
      GradientPaint var7 = var10003;
      Ref.s(350969701095426383L, var7, var8);
      long var10 = 591365421829656781L;
      Object var9 = null;
      Ref.s(591365421829656781L, var9, var10);
      Lt4 var10005 = new Lt4(this, this);
      long var12 = 120377590810688830L;
      Lt4 var11 = var10005;
      Ref.s(120377590810688830L, var11, var12);
      Registry.lookupField(160637199032303684L).setInt(this, a(21807, 8738511870531918212L));
      Registry.lookupField(564747111411440671L).setInt(this, a(12178, 5154324217557197623L));
      Registry.lookupField(374268935118612683L).setInt(this, a(14609, 8951047137774777773L));
      LocalMachinePanel.t();
      Color var10007 = new Color(a(21786, 5046359897160964531L), a(2418, 4220121464836851153L), a(2418, 4220121464836851153L), a(2418, 4220121464836851153L));
      long var14 = 265711619764156594L;
      Color var13 = var10007;
      Ref.s(265711619764156594L, var13, var14);
      var10007 = new Color(a(27259, 68306709545182915L), a(21761, 5245268497494497701L), a(21761, 5245268497494497701L));
      long var16 = 202919818338106008L;
      Color var15 = var10007;
      Ref.s(202919818338106008L, var15, var16);
      BasicStroke var10008 = new BasicStroke(2.001F, 0, 2, 0.0F, new float[]{1.0F, 0.0F}, 0.0F);
      long var18 = 202115277839837533L;
      BasicStroke var17 = var10008;
      Ref.s(202115277839837533L, var17, var18);
      Color var10009 = new Color(a(17792, 7811713222664833343L), a(25565, 7761385051285254002L), a(2965, 8238076367790704416L), a(13906, 5299682371043408626L));
      long var20 = 631275153185624453L;
      Color var19 = var10009;
      Ref.s(631275153185624453L, var19, var20);
      Color var10010 = new Color(a(2718, 5785183076659758628L), a(16852, 4296967922548723045L), a(12210, 8566842714953720582L), a(30813, 4540674776980157670L));
      long var22 = 420428134038831753L;
      Color var21 = var10010;
      Ref.s(420428134038831753L, var21, var22);
      this.setOpaque(false);
      new Cursor(a(14256, 1058038408501836567L));
      if (Ky4.F$arrString() != null) {
         int var1 = 0 + 1;
         LocalMachinePanel.O(var1);
      }
   }

   public void F(KV var1, String var2, ArrayList var3, int var4) {
      long var6 = 439327444990036933L;
      Ref.s(439327444990036933L, var2, var6);
      long var8 = 616762082352916494L;
      Ref.s(616762082352916494L, var1, var8);
      long var10 = 479785271260132470L;
      Ref.s(479785271260132470L, var3, var10);
      Registry.lookupField(552317612608543448L).setInt(this, var4);
      this.repaint();
   }

   @Override
   public void paintComponent(Graphics var1) {
      label29: {
         int var2 = LocalMachinePanel.i();
         if (var2 == 0) {
            if (!Registry.lookupField(413132319533195410L).getBoolean(null)) {
               break label29;
            }

            Object var3 = 120377590810688830L;
            Ref.g(120377590810688830L, var3);
            Object[] var10002 = Registry.packArgs(var1);
            long var6 = 478374544918577864L;
            Object[] var5 = var10002;
            Ref.h(478374544918577864L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         if (var2 == 0) {
            return;
         }
      }

      Object[] var10001 = Registry.packArgs(var1);
      long var8 = 418033652383360520L;
      Object[] var7 = var10001;
      Ref.h(418033652383360520L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   @Override
   public void h(Graphics var1) {
      Color var3 = new Color(a(13300, 4132117043855834947L), 0, 0, 0);
      int var10000 = LocalMachinePanel.i();
      Graphics2D var4 = (Graphics2D)var1;
      int var2 = var10000;
      Object var25 = 202919818338106008L;
      this.setColor((Color)Ref.g(202919818338106008L, var25));
      Object var27 = 350969701095426383L;
      this.setPaint((GradientPaint)Ref.g(350969701095426383L, var27));
      Object var29 = 616762082352916494L;
      if ((KV)Ref.g(616762082352916494L, var29) != null) {
         long var5 = 0L;
         long var7 = e;
         LB3 var10003 = this;
         if (var2 == 0) {
            if (Registry.lookupField(552317612608543448L).getInt(this) == 0) {
               var5 = 0L;
               var7 = 0L;
            }

            var10003 = this;
            Object var31 = 479785271260132470L;
            ((ArrayList)Ref.g(479785271260132470L, var31)).clone();
         }

         ArrayList var9 = (ArrayList)var10003;
         int var10 = 0;
         int var11 = 0;

         while (var11 < var9.size()) {
            if (var11 > (this.getWidth() - Registry.lookupField(564747111411440671L).getInt(this)) / Registry.lookupField(521791035208510226L).getInt(this)) {
            }

            j var12 = (j)var9.get(var9.size() - var11 - 1);
            long var62;
            int var61 = (var62 = (long)var12.r() - var5) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var2 == 0) {
               if (var61 > 0) {
                  var5 = (long)var12.r();
               }

               var61 = (var12.q$boolean()) ? 1 : 0;
            }

            label106: {
               label94:
               if (var2 == 0) {
                  if (var61 != 0) {
                     long var63;
                     var61 = (var63 = (long)var12.r() - var7) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                     if (var2 != 0) {
                        break label94;
                     }

                     if (var61 < 0) {
                        var7 = (long)var12.r();
                     }
                  }

                  var10++;
                  if (var2 != 0) {
                     break label106;
                  }

                  var61 = var10;
               }

               if (var61 > (this.getWidth() - Registry.lookupField(564747111411440671L).getInt(this)) / Registry.lookupField(521791035208510226L).getInt(this)
                  && var2 == 0) {
                  break;
               }

               var11++;
            }

            if (var2 != 0) {
               break;
            }
         }

         if (var7 == 0L) {
         }

         long var15 = var5 - var7;
         int var17 = 0;
         int var18 = var9.size() - 1;
         int var19 = this.getWidth();
         Object var33 = 202115277839837533L;
         this.setStroke((Stroke)Ref.g(202115277839837533L, var33));

         while (var18 > -1 && var18 <= var9.size() - 1) {
            j var20 = (j)var9.get(var18);
            byte var21 = 0;
            var19 = this.getWidth() - var17 * Registry.lookupField(521791035208510226L).getInt(this) - 2;
            int var22 = (int)((long)var20.r() - var7);
            int var10004 = var22;
            if (var2 == 0) {
               if (var22 < 0) {
                  var22 = 0;
               }

               var10004 = (int)((float)(this.getHeight() - Registry.lookupField(374268935118612683L).getInt(this)) * ((float)var22 / (float)var15));
            }

            label74: {
               int var23 = var10004;
               int var24 = this.getHeight() - var23 - Registry.lookupField(374268935118612683L).getInt(this);
               if (var2 == 0) {
                  if (var20.q$boolean()) {
                     Object var35 = 420428134038831753L;
                     this.setColor((Color)Ref.g(420428134038831753L, var35));
                     var4.drawLine(var19, this.getHeight() - var21, var19, var24);
                     if (var2 == 0) {
                        break label74;
                     }
                  }

                  var4.setColor(var3);
               }

               var4.drawLine(var19, this.getHeight() - var21, var19, 0);
            }

            if (var19 < Registry.lookupField(564747111411440671L).getInt(this) && var2 == 0) {
               break;
            }

            var17++;
            var18--;
            if (var2 != 0) {
               break;
            }
         }

         Object var37 = 371611251275090749L;
         this.setStroke((Stroke)Ref.g(371611251275090749L, var37));
         Color var54 = new Color(0, 0, 0, a(6030, 1144343285352536864L));
         var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
         int var55 = 1;
         Object var39 = 381681083975472286L;
         this.setStroke((Stroke)Ref.g(381681083975472286L, var39));
         Object var41 = 265711619764156594L;
         this.setColor((Color)Ref.g(265711619764156594L, var41));
         var4.drawLine(this.getWidth(), var55, Registry.lookupField(564747111411440671L).getInt(this) - 5, var55);
         var4.setColor(var54);
         var4.drawString(var5 + "", 3, a(24798, 2534123797686512744L));
         var55 = (this.getHeight() - Registry.lookupField(374268935118612683L).getInt(this)) / 2 + 1;
         Object var43 = 381681083975472286L;
         this.setStroke((Stroke)Ref.g(381681083975472286L, var43));
         Object var45 = 265711619764156594L;
         this.setColor((Color)Ref.g(265711619764156594L, var45));
         var4.drawLine(this.getWidth(), var55, Registry.lookupField(564747111411440671L).getInt(this) - 5, var55);
         var4.setColor(var54);
         String var58 = (float)(var7 + var5) / 2.0F + "";
         var58 = var58.replace(b, "");
         var4.drawString(var58 + "", 3, var55 + 4);
         var55 = this.getHeight() - Registry.lookupField(374268935118612683L).getInt(this) - 1;
         Object var47 = 381681083975472286L;
         this.setStroke((Stroke)Ref.g(381681083975472286L, var47));
         Object var49 = 265711619764156594L;
         this.setColor((Color)Ref.g(265711619764156594L, var49));
         var4.drawLine(this.getWidth(), var55, Registry.lookupField(564747111411440671L).getInt(this) - 5, var55);
         var4.setColor(var54);
         var4.drawString(var7 + "", 3, var55 + 4);
         Object var51 = 371611251275090749L;
         this.setStroke((Stroke)Ref.g(371611251275090749L, var51));
         Color var60 = new Color(a(12795, 335339531481234777L), a(30635, 4319911848219671318L), a(2418, 4220121464836851153L), a(13721, 8968643417549912371L));
         var4.setColor(var60);
         var4.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
         var4.setColor(new Color(a(26732, 6662887993114485970L), a(17210, 7978916044675600279L), a(25754, 3550378253059188796L)));
         var4.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3253;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001f\u0014".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var41 = 70;
      char[] var10002 = var10003;
      int var22 = var10004;
      char[] var49;
      byte var57;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var49 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 70;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var57 = 119;
               break;
            case 1:
               var57 = 98;
               break;
            case 2:
               var57 = 123;
               break;
            case 3:
               var57 = 19;
               break;
            case 4:
               var57 = 122;
               break;
            case 5:
               var57 = 121;
               break;
            default:
               var57 = 26;
         }
      } else {
         var41 = 70;
         var22 = var10004;
         if (var10004 <= var10) {
            String var46 = new String(var10003).intern();
            int var29 = -1;
            b = var46;
            long var12 = 6680821250060160686L;
            long[] var17 = new long[33];
            int var14 = 0;
            String var15 = "Ñy²\u0081ç\u0003\t\u009a\u0083]S\u0096®Â-z`\u0016\u0013b0ê±\u0012¼\u0093\u000bã @bÌ\t\"\u000e@ãtCI¦÷¦\u001fSGÊL\u0099£\u000b£M\u0091ÚÓ¾\u0099L\u0084Pêa\u0007\u009e\u0083\u008f\u0003ï\u0095õ:\u0007t\u0097\u001c¿`;\fg©ÆËe\u009fG\u0085(³{äÎzj®Å«iÔ1?x#¬\u009e\u0014§ï\u0080è\u009d6\u0087(\u001a;Íú\u0018ý\u0098Ä7\u00ad_\u0088¶¨¦1\u000få\u0007-\u0087h4Ô+¡\u0003WûëÆ[\u009f`Ï5µ(\u0001\f\u0002\u0016jæt\u00adâ;TzG.\u0019\u0083\u0086¤:UÆ´\u0006yÓOï=-\u008béö;ÞC<¢3±\u0091m¼Ð\u009e:AØZ\u0019\u00807'daµ =`¿ëUá¸\u0012mH¡y=\u0015h\u0092¨\u009d8>¹×\u008bÐ?´| ¿\u008f>Ønw~\u00ad!W;";
            int var16 = "Ñy²\u0081ç\u0003\t\u009a\u0083]S\u0096®Â-z`\u0016\u0013b0ê±\u0012¼\u0093\u000bã @bÌ\t\"\u000e@ãtCI¦÷¦\u001fSGÊL\u0099£\u000b£M\u0091ÚÓ¾\u0099L\u0084Pêa\u0007\u009e\u0083\u008f\u0003ï\u0095õ:\u0007t\u0097\u001c¿`;\fg©ÆËe\u009fG\u0085(³{äÎzj®Å«iÔ1?x#¬\u009e\u0014§ï\u0080è\u009d6\u0087(\u001a;Íú\u0018ý\u0098Ä7\u00ad_\u0088¶¨¦1\u000få\u0007-\u0087h4Ô+¡\u0003WûëÆ[\u009f`Ï5µ(\u0001\f\u0002\u0016jæt\u00adâ;TzG.\u0019\u0083\u0086¤:UÆ´\u0006yÓOï=-\u008béö;ÞC<¢3±\u0091m¼Ð\u009e:AØZ\u0019\u00807'daµ =`¿ëUá¸\u0012mH¡y=\u0015h\u0092¨\u009d8>¹×\u008bÐ?´| ¿\u008f>Ønw~\u00ad!W;"
               .length();
            byte var13 = 0;

            label71:
            while (true) {
               var29 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var29, var13).getBytes("ISO-8859-1");
               long[] var21 = var17;
               var29 = var14++;
               long var38 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var47 = -1;

               while (true) {
                  long var55 = var38 ^ var12;
                  switch (var47) {
                     case 0:
                        var21[var29] = var55;
                        if (var13 >= var16) {
                           c = var17;
                           d = new Integer[33];
                           long var11 = 8679639145912536567L;
                           long var40 = 8679639145912536067L ^ var11;
                           byte var33 = -1;
                           e = var40;
                           return;
                        }
                        break;
                     default:
                        var21[var29] = var55;
                        if (var13 < var16) {
                           continue label71;
                        }

                        var15 = "°ÁN\\U\u0082·ù6Gy©\u0099Þ\bj";
                        var16 = "°ÁN\\U\u0082·ù6Gy©\u0099Þ\bj".length();
                        var13 = 0;
                  }

                  byte var32 = var13;
                  var13 += 8;
                  var19 = var15.substring(var32, var13).getBytes("ISO-8859-1");
                  var21 = var17;
                  var29 = var14++;
                  var38 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var47 = 0;
               }
            }
         }

         var49 = var10003;
         var10005 = var10;
         char var58 = var10003[var10];
         var10007 = 70;
         var10006 = var58;
         switch (var10 % 7) {
            case 0:
               var57 = 119;
               break;
            case 1:
               var57 = 98;
               break;
            case 2:
               var57 = 123;
               break;
            case 3:
               var57 = 19;
               break;
            case 4:
               var57 = 122;
               break;
            case 5:
               var57 = 121;
               break;
            default:
               var57 = 26;
         }
      }

      while (true) {
         var49[var10005] = (char)(var10006 ^ var10007 ^ var57);
         var10++;
         if (var41 == 0) {
            var49 = var10002;
            var10005 = var41;
            char var60 = var10002[var41];
            var10007 = var41;
            var10006 = var60;
            switch (var10 % 7) {
               case 0:
                  var57 = 119;
                  break;
               case 1:
                  var57 = 98;
                  break;
               case 2:
                  var57 = 123;
                  break;
               case 3:
                  var57 = 19;
                  break;
               case 4:
                  var57 = 122;
                  break;
               case 5:
                  var57 = 121;
                  break;
               default:
                  var57 = 26;
            }
         } else {
            if (var22 <= var10) {
               String var43 = new String(var10002).intern();
               int var24 = -1;
               b = var43;
               long var2 = 6680821250060160686L;
               long[] var8 = new long[33];
               int var5 = 0;
               String var6 = "Ñy²\u0081ç\u0003\t\u009a\u0083]S\u0096®Â-z`\u0016\u0013b0ê±\u0012¼\u0093\u000bã @bÌ\t\"\u000e@ãtCI¦÷¦\u001fSGÊL\u0099£\u000b£M\u0091ÚÓ¾\u0099L\u0084Pêa\u0007\u009e\u0083\u008f\u0003ï\u0095õ:\u0007t\u0097\u001c¿`;\fg©ÆËe\u009fG\u0085(³{äÎzj®Å«iÔ1?x#¬\u009e\u0014§ï\u0080è\u009d6\u0087(\u001a;Íú\u0018ý\u0098Ä7\u00ad_\u0088¶¨¦1\u000få\u0007-\u0087h4Ô+¡\u0003WûëÆ[\u009f`Ï5µ(\u0001\f\u0002\u0016jæt\u00adâ;TzG.\u0019\u0083\u0086¤:UÆ´\u0006yÓOï=-\u008béö;ÞC<¢3±\u0091m¼Ð\u009e:AØZ\u0019\u00807'daµ =`¿ëUá¸\u0012mH¡y=\u0015h\u0092¨\u009d8>¹×\u008bÐ?´| ¿\u008f>Ønw~\u00ad!W;";
               int var7 = "Ñy²\u0081ç\u0003\t\u009a\u0083]S\u0096®Â-z`\u0016\u0013b0ê±\u0012¼\u0093\u000bã @bÌ\t\"\u000e@ãtCI¦÷¦\u001fSGÊL\u0099£\u000b£M\u0091ÚÓ¾\u0099L\u0084Pêa\u0007\u009e\u0083\u008f\u0003ï\u0095õ:\u0007t\u0097\u001c¿`;\fg©ÆËe\u009fG\u0085(³{äÎzj®Å«iÔ1?x#¬\u009e\u0014§ï\u0080è\u009d6\u0087(\u001a;Íú\u0018ý\u0098Ä7\u00ad_\u0088¶¨¦1\u000få\u0007-\u0087h4Ô+¡\u0003WûëÆ[\u009f`Ï5µ(\u0001\f\u0002\u0016jæt\u00adâ;TzG.\u0019\u0083\u0086¤:UÆ´\u0006yÓOï=-\u008béö;ÞC<¢3±\u0091m¼Ð\u009e:AØZ\u0019\u00807'daµ =`¿ëUá¸\u0012mH¡y=\u0015h\u0092¨\u009d8>¹×\u008bÐ?´| ¿\u008f>Ønw~\u00ad!W;"
                  .length();
               byte var4 = 0;

               label37:
               while (true) {
                  var24 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  long[] var10000 = var8;
                  var24 = var5++;
                  long var35 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  byte var44 = -1;

                  while (true) {
                     long var53 = var35 ^ var2;
                     switch (var44) {
                        case 0:
                           var10000[var24] = var53;
                           if (var4 >= var7) {
                              c = var8;
                              d = new Integer[33];
                              long var0 = 8679639145912536567L;
                              long var37 = 8679639145912536067L ^ var0;
                              byte var28 = -1;
                              e = var37;
                              return;
                           }
                           break;
                        default:
                           var10000[var24] = var53;
                           if (var4 < var7) {
                              continue label37;
                           }

                           var6 = "°ÁN\\U\u0082·ù6Gy©\u0099Þ\bj";
                           var7 = "°ÁN\\U\u0082·ù6Gy©\u0099Þ\bj".length();
                           var4 = 0;
                     }

                     byte var27 = var4;
                     var4 += 8;
                     var9 = var6.substring(var27, var4).getBytes("ISO-8859-1");
                     var10000 = var8;
                     var24 = var5++;
                     var35 = ((long)var9[0] & 255L) << 56
                        | ((long)var9[1] & 255L) << 48
                        | ((long)var9[2] & 255L) << 40
                        | ((long)var9[3] & 255L) << 32
                        | ((long)var9[4] & 255L) << 24
                        | ((long)var9[5] & 255L) << 16
                        | ((long)var9[6] & 255L) << 8
                        | (long)var9[7] & 255L;
                     var44 = 0;
                  }
               }
            }

            var49 = var10002;
            var10005 = var10;
            char var59 = var10002[var10];
            var10007 = var41;
            var10006 = var59;
            switch (var10 % 7) {
               case 0:
                  var57 = 119;
                  break;
               case 1:
                  var57 = 98;
                  break;
               case 2:
                  var57 = 123;
                  break;
               case 3:
                  var57 = 19;
                  break;
               case 4:
                  var57 = 122;
                  break;
               case 5:
                  var57 = 121;
                  break;
               default:
                  var57 = 26;
            }
         }
      }
   }
}





